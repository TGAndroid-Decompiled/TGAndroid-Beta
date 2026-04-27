package io.noties.markwon.html.jsoup.parser;

import io.noties.markwon.html.jsoup.helper.Normalizer;
import io.noties.markwon.html.jsoup.helper.Validate;
import io.noties.markwon.html.jsoup.nodes.Attributes;

public abstract class Token {
    public final TokenType type;

    public enum TokenType {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        EOF
    }

    public abstract Token reset();

    protected Token(TokenType tokenType) {
        this.type = tokenType;
    }

    static void reset(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    public static final class Doctype extends Token {
        boolean forceQuirks;
        final StringBuilder name;
        String pubSysKey;
        final StringBuilder publicIdentifier;
        final StringBuilder systemIdentifier;

        Doctype() {
            super(TokenType.Doctype);
            this.name = new StringBuilder();
            this.pubSysKey = null;
            this.publicIdentifier = new StringBuilder();
            this.systemIdentifier = new StringBuilder();
            this.forceQuirks = false;
        }

        @Override
        public Token reset() {
            Token.reset(this.name);
            this.pubSysKey = null;
            Token.reset(this.publicIdentifier);
            Token.reset(this.systemIdentifier);
            this.forceQuirks = false;
            return this;
        }
    }

    public static abstract class Tag extends Token {
        public Attributes attributes;
        private boolean hasEmptyAttributeValue;
        private boolean hasPendingAttributeValue;
        public String normalName;
        private String pendingAttributeName;
        private StringBuilder pendingAttributeValue;
        private String pendingAttributeValueS;
        public boolean selfClosing;
        public String tagName;

        protected Tag(TokenType tokenType) {
            super(tokenType);
            this.pendingAttributeValue = new StringBuilder();
            this.hasEmptyAttributeValue = false;
            this.hasPendingAttributeValue = false;
            this.selfClosing = false;
        }

        @Override
        public Tag reset() {
            this.tagName = null;
            this.normalName = null;
            this.pendingAttributeName = null;
            Token.reset(this.pendingAttributeValue);
            this.pendingAttributeValueS = null;
            this.hasEmptyAttributeValue = false;
            this.hasPendingAttributeValue = false;
            this.selfClosing = false;
            this.attributes = null;
            return this;
        }

        final void newAttribute() {
            String string;
            if (this.attributes == null) {
                this.attributes = new Attributes();
            }
            String str = this.pendingAttributeName;
            if (str != null) {
                String strTrim = str.trim();
                this.pendingAttributeName = strTrim;
                if (strTrim.length() > 0) {
                    if (this.hasPendingAttributeValue) {
                        string = this.pendingAttributeValue.length() > 0 ? this.pendingAttributeValue.toString() : this.pendingAttributeValueS;
                    } else {
                        string = this.hasEmptyAttributeValue ? "" : null;
                    }
                    this.attributes.put(this.pendingAttributeName, string);
                }
            }
            this.pendingAttributeName = null;
            this.hasEmptyAttributeValue = false;
            this.hasPendingAttributeValue = false;
            Token.reset(this.pendingAttributeValue);
            this.pendingAttributeValueS = null;
        }

        final void finaliseTag() {
            if (this.pendingAttributeName != null) {
                newAttribute();
            }
        }

        final String name() {
            String str = this.tagName;
            Validate.isFalse(str == null || str.length() == 0);
            return this.tagName;
        }

        final Tag name(String str) {
            this.tagName = str;
            this.normalName = Normalizer.lowerCase(str);
            return this;
        }

        final void appendTagName(String str) {
            String str2 = this.tagName;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.tagName = str;
            this.normalName = Normalizer.lowerCase(str);
        }

        final void appendTagName(char c) {
            appendTagName(String.valueOf(c));
        }

        final void appendAttributeName(String str) {
            String str2 = this.pendingAttributeName;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.pendingAttributeName = str;
        }

        final void appendAttributeName(char c) {
            appendAttributeName(String.valueOf(c));
        }

        final void appendAttributeValue(String str) {
            ensureAttributeValue();
            if (this.pendingAttributeValue.length() == 0) {
                this.pendingAttributeValueS = str;
            } else {
                this.pendingAttributeValue.append(str);
            }
        }

        final void appendAttributeValue(char c) {
            ensureAttributeValue();
            this.pendingAttributeValue.append(c);
        }

        final void appendAttributeValue(int[] iArr) {
            ensureAttributeValue();
            for (int i : iArr) {
                this.pendingAttributeValue.appendCodePoint(i);
            }
        }

        final void setEmptyAttributeValue() {
            this.hasEmptyAttributeValue = true;
        }

        private void ensureAttributeValue() {
            this.hasPendingAttributeValue = true;
            String str = this.pendingAttributeValueS;
            if (str != null) {
                this.pendingAttributeValue.append(str);
                this.pendingAttributeValueS = null;
            }
        }
    }

    public static final class StartTag extends Tag {
        public StartTag() {
            super(TokenType.StartTag);
            this.attributes = new Attributes();
        }

        @Override
        public Tag reset() {
            super.reset();
            this.attributes = new Attributes();
            return this;
        }

        public String toString() {
            Attributes attributes = this.attributes;
            if (attributes != null && attributes.size() > 0) {
                return "<" + name() + " " + this.attributes.toString() + ">";
            }
            return "<" + name() + ">";
        }
    }

    public static final class EndTag extends Tag {
        EndTag() {
            super(TokenType.EndTag);
        }

        public String toString() {
            return "</" + name() + ">";
        }
    }

    public static final class Comment extends Token {
        boolean bogus;
        final StringBuilder data;

        @Override
        public Token reset() {
            Token.reset(this.data);
            this.bogus = false;
            return this;
        }

        Comment() {
            super(TokenType.Comment);
            this.data = new StringBuilder();
            this.bogus = false;
        }

        String getData() {
            return this.data.toString();
        }

        public String toString() {
            return "<!--" + getData() + "-->";
        }
    }

    public static class Character extends Token {
        private String data;

        Character() {
            super(TokenType.Character);
        }

        @Override
        public Token reset() {
            this.data = null;
            return this;
        }

        Character data(String str) {
            this.data = str;
            return this;
        }

        public String getData() {
            return this.data;
        }

        public String toString() {
            return getData();
        }
    }

    public static final class CData extends Character {
        CData(String str) {
            data(str);
        }

        @Override
        public String toString() {
            return "<![CDATA[" + getData() + "]]>";
        }
    }

    public static final class EOF extends Token {
        @Override
        public Token reset() {
            return this;
        }

        EOF() {
            super(TokenType.EOF);
        }
    }
}

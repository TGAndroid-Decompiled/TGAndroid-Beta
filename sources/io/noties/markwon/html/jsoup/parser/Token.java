package io.noties.markwon.html.jsoup.parser;

import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import io.noties.markwon.html.jsoup.nodes.Attributes;
import java.util.Locale;

public abstract class Token {
    public final int $r8$classId;
    public final int type;

    public final class CData extends Character {
        @Override
        public final String toString() {
            return SurfaceContainer$$ExternalSyntheticOutline0.m(new StringBuilder("<![CDATA["), this.data, "]]>");
        }
    }

    public class Character extends Token {
        public String data;

        @Override
        public final Token reset() {
            this.data = null;
            return this;
        }

        @Override
        public String toString() {
            return this.data;
        }
    }

    public final class Comment extends Token {
        public final StringBuilder data;

        public Comment() {
            super(4, 0);
            this.data = new StringBuilder();
        }

        @Override
        public final Token reset() {
            Token.reset(this.data);
            return this;
        }

        @Override
        public final String toString() {
            return "<!--" + this.data.toString() + "-->";
        }
    }

    public final class Doctype extends Token {
        public final StringBuilder name;
        public final StringBuilder publicIdentifier;
        public final StringBuilder systemIdentifier;

        public Doctype() {
            super(1, 0);
            this.name = new StringBuilder();
            this.publicIdentifier = new StringBuilder();
            this.systemIdentifier = new StringBuilder();
        }

        @Override
        public final Token reset() {
            Token.reset(this.name);
            Token.reset(this.publicIdentifier);
            Token.reset(this.systemIdentifier);
            return this;
        }
    }

    public final class EOF extends Token {
        public EOF() {
            super(6, 0);
        }

        @Override
        public final Token reset() {
            return this;
        }
    }

    public final class EndTag extends Tag {
        @Override
        public final String toString() {
            return "</" + name() + ">";
        }
    }

    public final class StartTag extends Tag {
        @Override
        public final Token reset() {
            reset();
            return this;
        }

        @Override
        public final String toString() {
            Attributes attributes = this.attributes;
            if (attributes == null || attributes.size <= 0) {
                return "<" + name() + ">";
            }
            return "<" + name() + " " + this.attributes.toString() + ">";
        }

        @Override
        public final Tag reset() {
            super.reset();
            this.attributes = new Attributes();
            return this;
        }
    }

    public abstract class Tag extends Token {
        public Attributes attributes;
        public boolean hasEmptyAttributeValue;
        public boolean hasPendingAttributeValue;
        public String normalName;
        public String pendingAttributeName;
        public final StringBuilder pendingAttributeValue;
        public String pendingAttributeValueS;
        public boolean selfClosing;
        public String tagName;

        public Tag(int i) {
            super(i, 0);
            this.pendingAttributeValue = new StringBuilder();
            this.hasEmptyAttributeValue = false;
            this.hasPendingAttributeValue = false;
            this.selfClosing = false;
        }

        public final void appendAttributeName(char c) {
            String strValueOf = String.valueOf(c);
            String str = this.pendingAttributeName;
            if (str != null) {
                strValueOf = str.concat(strValueOf);
            }
            this.pendingAttributeName = strValueOf;
        }

        public final void appendAttributeValue(char c) {
            this.hasPendingAttributeValue = true;
            String str = this.pendingAttributeValueS;
            if (str != null) {
                this.pendingAttributeValue.append(str);
                this.pendingAttributeValueS = null;
            }
            this.pendingAttributeValue.append(c);
        }

        public final void appendTagName(String str) {
            String str2 = this.tagName;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.tagName = str;
            this.normalName = str != null ? str.toLowerCase(Locale.ENGLISH) : "";
        }

        public final String name() {
            String str = this.tagName;
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("Must be false");
            }
            return this.tagName;
        }

        public final void newAttribute() {
            String string;
            if (this.attributes == null) {
                this.attributes = new Attributes();
            }
            String str = this.pendingAttributeName;
            StringBuilder sb = this.pendingAttributeValue;
            if (str != null) {
                String strTrim = str.trim();
                this.pendingAttributeName = strTrim;
                if (strTrim.length() > 0) {
                    if (this.hasPendingAttributeValue) {
                        string = sb.length() > 0 ? sb.toString() : this.pendingAttributeValueS;
                    } else {
                        string = this.hasEmptyAttributeValue ? "" : null;
                    }
                    Attributes attributes = this.attributes;
                    String str2 = this.pendingAttributeName;
                    int iIndexOfKey = attributes.indexOfKey(str2);
                    if (iIndexOfKey != -1) {
                        attributes.vals[iIndexOfKey] = string;
                    } else {
                        int i = attributes.size;
                        int i2 = i + 1;
                        if (i2 < i) {
                            throw new IllegalArgumentException("Must be true");
                        }
                        String[] strArr = attributes.keys;
                        int length = strArr.length;
                        if (length < i2) {
                            int i3 = length >= 4 ? i * 2 : 4;
                            if (i2 <= i3) {
                                i2 = i3;
                            }
                            String[] strArr2 = new String[i2];
                            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i2));
                            attributes.keys = strArr2;
                            String[] strArr3 = attributes.vals;
                            String[] strArr4 = new String[i2];
                            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i2));
                            attributes.vals = strArr4;
                        }
                        String[] strArr5 = attributes.keys;
                        int i4 = attributes.size;
                        strArr5[i4] = str2;
                        attributes.vals[i4] = string;
                        attributes.size = i4 + 1;
                    }
                }
            }
            this.pendingAttributeName = null;
            this.hasEmptyAttributeValue = false;
            this.hasPendingAttributeValue = false;
            Token.reset(sb);
            this.pendingAttributeValueS = null;
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

        public final void appendAttributeValue(String str) {
            this.hasPendingAttributeValue = true;
            String str2 = this.pendingAttributeValueS;
            if (str2 != null) {
                this.pendingAttributeValue.append(str2);
                this.pendingAttributeValueS = null;
            }
            StringBuilder sb = this.pendingAttributeValue;
            if (sb.length() == 0) {
                this.pendingAttributeValueS = str;
            } else {
                sb.append(str);
            }
        }

        public final void appendAttributeValue(int[] iArr) {
            this.hasPendingAttributeValue = true;
            String str = this.pendingAttributeValueS;
            if (str != null) {
                this.pendingAttributeValue.append(str);
                this.pendingAttributeValueS = null;
            }
            for (int i : iArr) {
                this.pendingAttributeValue.appendCodePoint(i);
            }
        }
    }

    public Token(int i, int i2) {
        this.$r8$classId = i2;
        this.type = i;
    }

    public static String getAtomTypeString(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public static void reset(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    public abstract Token reset();

    public String toString() {
        switch (this.$r8$classId) {
            case 1:
                return getAtomTypeString(this.type);
            default:
                return super.toString();
        }
    }
}

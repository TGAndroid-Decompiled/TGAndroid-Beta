package org.commonmark.internal;

import java.util.ArrayList;
import java.util.List;
import org.commonmark.internal.util.Escaping;
import org.commonmark.internal.util.LinkScanner;
import org.commonmark.internal.util.Parsing;
import org.commonmark.node.LinkReferenceDefinition;

public class LinkReferenceDefinitionParser {
    private String destination;
    private StringBuilder label;
    private String normalizedLabel;
    private StringBuilder title;
    private char titleDelimiter;
    private State state = State.START_DEFINITION;
    private final StringBuilder paragraph = new StringBuilder();
    private final List definitions = new ArrayList();
    private boolean referenceValid = false;

    enum State {
        START_DEFINITION,
        LABEL,
        DESTINATION,
        START_TITLE,
        TITLE,
        PARAGRAPH
    }

    public void parse(java.lang.CharSequence r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.commonmark.internal.LinkReferenceDefinitionParser.parse(java.lang.CharSequence):void");
    }

    static class AnonymousClass1 {
        static final int[] $SwitchMap$org$commonmark$internal$LinkReferenceDefinitionParser$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$org$commonmark$internal$LinkReferenceDefinitionParser$State = iArr;
            try {
                iArr[State.PARAGRAPH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$commonmark$internal$LinkReferenceDefinitionParser$State[State.START_DEFINITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$commonmark$internal$LinkReferenceDefinitionParser$State[State.LABEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$commonmark$internal$LinkReferenceDefinitionParser$State[State.DESTINATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$commonmark$internal$LinkReferenceDefinitionParser$State[State.START_TITLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$commonmark$internal$LinkReferenceDefinitionParser$State[State.TITLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    CharSequence getParagraphContent() {
        return this.paragraph;
    }

    List getDefinitions() {
        finishReference();
        return this.definitions;
    }

    private int startDefinition(CharSequence charSequence, int i) {
        int iSkipSpaceTab = Parsing.skipSpaceTab(charSequence, i, charSequence.length());
        if (iSkipSpaceTab >= charSequence.length() || charSequence.charAt(iSkipSpaceTab) != '[') {
            return -1;
        }
        this.state = State.LABEL;
        this.label = new StringBuilder();
        int i2 = iSkipSpaceTab + 1;
        if (i2 >= charSequence.length()) {
            this.label.append('\n');
        }
        return i2;
    }

    private int label(CharSequence charSequence, int i) {
        int i2;
        int iScanLinkLabelContent = LinkScanner.scanLinkLabelContent(charSequence, i);
        if (iScanLinkLabelContent == -1) {
            return -1;
        }
        this.label.append(charSequence, i, iScanLinkLabelContent);
        if (iScanLinkLabelContent >= charSequence.length()) {
            this.label.append('\n');
            return iScanLinkLabelContent;
        }
        if (charSequence.charAt(iScanLinkLabelContent) != ']' || (i2 = iScanLinkLabelContent + 1) >= charSequence.length() || charSequence.charAt(i2) != ':' || this.label.length() > 999) {
            return -1;
        }
        String strNormalizeLabelContent = Escaping.normalizeLabelContent(this.label.toString());
        if (strNormalizeLabelContent.isEmpty()) {
            return -1;
        }
        this.normalizedLabel = strNormalizeLabelContent;
        this.state = State.DESTINATION;
        return Parsing.skipSpaceTab(charSequence, iScanLinkLabelContent + 2, charSequence.length());
    }

    private int destination(CharSequence charSequence, int i) {
        String string;
        int iSkipSpaceTab = Parsing.skipSpaceTab(charSequence, i, charSequence.length());
        int iScanLinkDestination = LinkScanner.scanLinkDestination(charSequence, iSkipSpaceTab);
        if (iScanLinkDestination == -1) {
            return -1;
        }
        if (charSequence.charAt(iSkipSpaceTab) == '<') {
            string = charSequence.subSequence(iSkipSpaceTab + 1, iScanLinkDestination - 1).toString();
        } else {
            string = charSequence.subSequence(iSkipSpaceTab, iScanLinkDestination).toString();
        }
        this.destination = string;
        int iSkipSpaceTab2 = Parsing.skipSpaceTab(charSequence, iScanLinkDestination, charSequence.length());
        if (iSkipSpaceTab2 >= charSequence.length()) {
            this.referenceValid = true;
            this.paragraph.setLength(0);
        } else if (iSkipSpaceTab2 == iScanLinkDestination) {
            return -1;
        }
        this.state = State.START_TITLE;
        return iSkipSpaceTab2;
    }

    private int startTitle(CharSequence charSequence, int i) {
        int iSkipSpaceTab = Parsing.skipSpaceTab(charSequence, i, charSequence.length());
        if (iSkipSpaceTab >= charSequence.length()) {
            this.state = State.START_DEFINITION;
            return iSkipSpaceTab;
        }
        this.titleDelimiter = (char) 0;
        char cCharAt = charSequence.charAt(iSkipSpaceTab);
        if (cCharAt == '\"' || cCharAt == '\'') {
            this.titleDelimiter = cCharAt;
        } else if (cCharAt == '(') {
            this.titleDelimiter = ')';
        }
        if (this.titleDelimiter != 0) {
            this.state = State.TITLE;
            this.title = new StringBuilder();
            iSkipSpaceTab++;
            if (iSkipSpaceTab == charSequence.length()) {
                this.title.append('\n');
            }
        } else {
            finishReference();
            this.state = State.START_DEFINITION;
        }
        return iSkipSpaceTab;
    }

    private int title(CharSequence charSequence, int i) {
        int iScanLinkTitleContent = LinkScanner.scanLinkTitleContent(charSequence, i, this.titleDelimiter);
        if (iScanLinkTitleContent == -1) {
            return -1;
        }
        this.title.append(charSequence.subSequence(i, iScanLinkTitleContent));
        if (iScanLinkTitleContent >= charSequence.length()) {
            this.title.append('\n');
            return iScanLinkTitleContent;
        }
        int iSkipSpaceTab = Parsing.skipSpaceTab(charSequence, iScanLinkTitleContent + 1, charSequence.length());
        if (iSkipSpaceTab != charSequence.length()) {
            return -1;
        }
        this.referenceValid = true;
        finishReference();
        this.paragraph.setLength(0);
        this.state = State.START_DEFINITION;
        return iSkipSpaceTab;
    }

    private void finishReference() {
        if (this.referenceValid) {
            String strUnescapeString = Escaping.unescapeString(this.destination);
            StringBuilder sb = this.title;
            this.definitions.add(new LinkReferenceDefinition(this.normalizedLabel, strUnescapeString, sb != null ? Escaping.unescapeString(sb.toString()) : null));
            this.label = null;
            this.referenceValid = false;
            this.normalizedLabel = null;
            this.destination = null;
            this.title = null;
        }
    }
}

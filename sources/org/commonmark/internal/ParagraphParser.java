package org.commonmark.internal;

import androidx.datastore.preferences.PreferencesProto$Value$ValueCase$EnumUnboxingSharedUtility;
import java.util.Locale;
import java.util.regex.Pattern;
import org.commonmark.internal.util.Escaping;
import org.commonmark.internal.util.LinkScanner;
import org.commonmark.internal.util.Parsing;
import org.commonmark.node.Block;
import org.commonmark.node.Paragraph;
import org.commonmark.parser.InlineParser;
import org.commonmark.parser.block.AbstractBlockParser;

public final class ParagraphParser extends AbstractBlockParser {
    public final Paragraph block = new Paragraph();
    public final LinkReferenceDefinitionParser linkReferenceDefinitionParser = new LinkReferenceDefinitionParser();

    @Override
    public final void addLine(CharSequence charSequence) {
        int iScanLinkLabelContent;
        int i;
        LinkReferenceDefinitionParser linkReferenceDefinitionParser = this.linkReferenceDefinitionParser;
        StringBuilder sb = linkReferenceDefinitionParser.paragraph;
        if (sb.length() != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        int iSkipSpaceTab = 0;
        while (iSkipSpaceTab < charSequence.length()) {
            int iOrdinal = PreferencesProto$Value$ValueCase$EnumUnboxingSharedUtility.ordinal(linkReferenceDefinitionParser.state);
            if (iOrdinal == 0) {
                int iSkipSpaceTab2 = Parsing.skipSpaceTab(iSkipSpaceTab, charSequence.length(), charSequence);
                if (iSkipSpaceTab2 >= charSequence.length() || charSequence.charAt(iSkipSpaceTab2) != '[') {
                    iSkipSpaceTab = -1;
                } else {
                    linkReferenceDefinitionParser.state = 2;
                    linkReferenceDefinitionParser.label = new StringBuilder();
                    iSkipSpaceTab = iSkipSpaceTab2 + 1;
                    if (iSkipSpaceTab >= charSequence.length()) {
                        linkReferenceDefinitionParser.label.append('\n');
                    }
                }
            } else if (iOrdinal == 1) {
                iScanLinkLabelContent = LinkScanner.scanLinkLabelContent(iSkipSpaceTab, charSequence);
                if (iScanLinkLabelContent == -1) {
                    iSkipSpaceTab = -1;
                } else {
                    linkReferenceDefinitionParser.label.append(charSequence, iSkipSpaceTab, iScanLinkLabelContent);
                    if (iScanLinkLabelContent >= charSequence.length()) {
                        linkReferenceDefinitionParser.label.append('\n');
                        iSkipSpaceTab = iScanLinkLabelContent;
                    } else if (charSequence.charAt(iScanLinkLabelContent) != ']' || (i = iScanLinkLabelContent + 1) >= charSequence.length() || charSequence.charAt(i) != ':' || linkReferenceDefinitionParser.label.length() > 999) {
                        iSkipSpaceTab = -1;
                    } else {
                        String string = linkReferenceDefinitionParser.label.toString();
                        Pattern pattern = Escaping.BACKSLASH_OR_AMP;
                        String strReplaceAll = Escaping.WHITESPACE.matcher(string.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        if (strReplaceAll.isEmpty()) {
                            iSkipSpaceTab = -1;
                        } else {
                            linkReferenceDefinitionParser.normalizedLabel = strReplaceAll;
                            linkReferenceDefinitionParser.state = 3;
                            iSkipSpaceTab = Parsing.skipSpaceTab(iScanLinkLabelContent + 2, charSequence.length(), charSequence);
                        }
                    }
                }
            } else if (iOrdinal == 2) {
                int iSkipSpaceTab3 = Parsing.skipSpaceTab(iSkipSpaceTab, charSequence.length(), charSequence);
                int iScanLinkDestination = LinkScanner.scanLinkDestination(iSkipSpaceTab3, charSequence);
                if (iScanLinkDestination != -1) {
                    linkReferenceDefinitionParser.destination = charSequence.charAt(iSkipSpaceTab3) == '<' ? charSequence.subSequence(iSkipSpaceTab3 + 1, iScanLinkDestination - 1).toString() : charSequence.subSequence(iSkipSpaceTab3, iScanLinkDestination).toString();
                    iSkipSpaceTab = Parsing.skipSpaceTab(iScanLinkDestination, charSequence.length(), charSequence);
                    if (iSkipSpaceTab >= charSequence.length()) {
                        linkReferenceDefinitionParser.referenceValid = true;
                        sb.setLength(0);
                    } else if (iSkipSpaceTab == iScanLinkDestination) {
                        iSkipSpaceTab = -1;
                    }
                    linkReferenceDefinitionParser.state = 4;
                } else {
                    iSkipSpaceTab = -1;
                }
            } else if (iOrdinal == 3) {
                iSkipSpaceTab = Parsing.skipSpaceTab(iSkipSpaceTab, charSequence.length(), charSequence);
                if (iSkipSpaceTab >= charSequence.length()) {
                    linkReferenceDefinitionParser.state = 1;
                } else {
                    linkReferenceDefinitionParser.titleDelimiter = (char) 0;
                    char cCharAt = charSequence.charAt(iSkipSpaceTab);
                    if (cCharAt == '\"' || cCharAt == '\'') {
                        linkReferenceDefinitionParser.titleDelimiter = cCharAt;
                    } else if (cCharAt == '(') {
                        linkReferenceDefinitionParser.titleDelimiter = ')';
                    }
                    if (linkReferenceDefinitionParser.titleDelimiter != 0) {
                        linkReferenceDefinitionParser.state = 5;
                        linkReferenceDefinitionParser.title = new StringBuilder();
                        iSkipSpaceTab++;
                        if (iSkipSpaceTab == charSequence.length()) {
                            linkReferenceDefinitionParser.title.append('\n');
                        }
                    } else {
                        linkReferenceDefinitionParser.finishReference();
                        linkReferenceDefinitionParser.state = 1;
                    }
                }
            } else if (iOrdinal == 4) {
                iScanLinkLabelContent = LinkScanner.scanLinkTitleContent(charSequence, iSkipSpaceTab, linkReferenceDefinitionParser.titleDelimiter);
                if (iScanLinkLabelContent == -1) {
                    iSkipSpaceTab = -1;
                } else {
                    linkReferenceDefinitionParser.title.append(charSequence.subSequence(iSkipSpaceTab, iScanLinkLabelContent));
                    if (iScanLinkLabelContent >= charSequence.length()) {
                        linkReferenceDefinitionParser.title.append('\n');
                        iSkipSpaceTab = iScanLinkLabelContent;
                    } else {
                        iSkipSpaceTab = Parsing.skipSpaceTab(iScanLinkLabelContent + 1, charSequence.length(), charSequence);
                        if (iSkipSpaceTab != charSequence.length()) {
                            iSkipSpaceTab = -1;
                        } else {
                            linkReferenceDefinitionParser.referenceValid = true;
                            linkReferenceDefinitionParser.finishReference();
                            sb.setLength(0);
                            linkReferenceDefinitionParser.state = 1;
                        }
                    }
                }
            } else if (iOrdinal == 5) {
                return;
            }
            if (iSkipSpaceTab == -1) {
                linkReferenceDefinitionParser.state = 6;
                return;
            }
        }
    }

    @Override
    public final boolean canHaveLazyContinuationLines() {
        return true;
    }

    @Override
    public final void closeBlock() {
        if (this.linkReferenceDefinitionParser.paragraph.length() == 0) {
            this.block.unlink();
        }
    }

    @Override
    public final Block getBlock() {
        return this.block;
    }

    @Override
    public final void parseInlines(InlineParser inlineParser) {
        StringBuilder sb = this.linkReferenceDefinitionParser.paragraph;
        if (sb.length() > 0) {
            inlineParser.parse(sb.toString(), this.block);
        }
    }

    @Override
    public final BlockContinueImpl tryContinue(DocumentParser documentParser) {
        if (documentParser.blank) {
            return null;
        }
        return BlockContinueImpl.atIndex(documentParser.index);
    }
}

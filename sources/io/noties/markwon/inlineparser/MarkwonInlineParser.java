package io.noties.markwon.inlineparser;

import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import com.stripe.android.Stripe;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.commonmark.internal.Bracket;
import org.commonmark.internal.Delimiter;
import org.commonmark.internal.InlineParserImpl;
import org.commonmark.node.Node;
import org.commonmark.node.Text;
import org.commonmark.parser.InlineParser;
import org.commonmark.parser.InlineParserFactory;
import org.commonmark.parser.delimiter.DelimiterProcessor;

public final class MarkwonInlineParser implements InlineParser, MarkwonInlineParserContext {
    public Node block;
    public final HashMap delimiterProcessors;
    public int index;
    public final Stripe inlineParserContext;
    public final HashMap inlineProcessors;
    public String input;
    public Bracket lastBracket;
    public Delimiter lastDelimiter;
    public final boolean referencesEnabled;
    public final BitSet specialCharacters;
    public static final Pattern PUNCTUATION = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern SPNL = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern UNICODE_WHITESPACE_CHAR = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern ESCAPABLE = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern WHITESPACE = Pattern.compile("\\s+");

    public MarkwonInlineParser(Stripe stripe, boolean z, ArrayList arrayList, List list) {
        StaggeredDelimiterProcessor staggeredDelimiterProcessor;
        this.inlineParserContext = stripe;
        this.referencesEnabled = z;
        HashMap map = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            InlineProcessor inlineProcessor = (InlineProcessor) obj;
            char cSpecialCharacter = inlineProcessor.specialCharacter();
            List arrayList2 = (List) map.get(Character.valueOf(cSpecialCharacter));
            if (arrayList2 == null) {
                arrayList2 = new ArrayList(1);
                map.put(Character.valueOf(cSpecialCharacter), arrayList2);
            }
            arrayList2.add(inlineProcessor);
        }
        this.inlineProcessors = map;
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DelimiterProcessor delimiterProcessor = (DelimiterProcessor) it.next();
            char openingCharacter = delimiterProcessor.getOpeningCharacter();
            char closingCharacter = delimiterProcessor.getClosingCharacter();
            if (openingCharacter == closingCharacter) {
                DelimiterProcessor delimiterProcessor2 = (DelimiterProcessor) map2.get(Character.valueOf(openingCharacter));
                if (delimiterProcessor2 == null || delimiterProcessor2.getOpeningCharacter() != delimiterProcessor2.getClosingCharacter()) {
                    addDelimiterProcessorForChar(openingCharacter, delimiterProcessor, map2);
                } else {
                    if (delimiterProcessor2 instanceof StaggeredDelimiterProcessor) {
                        staggeredDelimiterProcessor = (StaggeredDelimiterProcessor) delimiterProcessor2;
                    } else {
                        StaggeredDelimiterProcessor staggeredDelimiterProcessor2 = new StaggeredDelimiterProcessor(openingCharacter);
                        staggeredDelimiterProcessor2.add(delimiterProcessor2);
                        staggeredDelimiterProcessor = staggeredDelimiterProcessor2;
                    }
                    staggeredDelimiterProcessor.add(delimiterProcessor);
                    map2.put(Character.valueOf(openingCharacter), staggeredDelimiterProcessor);
                }
            } else {
                addDelimiterProcessorForChar(openingCharacter, delimiterProcessor, map2);
                addDelimiterProcessorForChar(closingCharacter, delimiterProcessor, map2);
            }
        }
        this.delimiterProcessors = map2;
        Set setKeySet = this.inlineProcessors.keySet();
        Set setKeySet2 = map2.keySet();
        BitSet bitSet = new BitSet();
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            bitSet.set(((Character) it2.next()).charValue());
        }
        Iterator it3 = setKeySet2.iterator();
        while (it3.hasNext()) {
            bitSet.set(((Character) it3.next()).charValue());
        }
        this.specialCharacters = bitSet;
    }

    public static void addDelimiterProcessorForChar(char c, DelimiterProcessor delimiterProcessor, HashMap map) {
        if (((DelimiterProcessor) map.put(Character.valueOf(c), delimiterProcessor)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    public final String match(Pattern pattern) {
        if (this.index >= this.input.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.input);
        matcher.region(this.index, this.input.length());
        if (!matcher.find()) {
            return null;
        }
        this.index = matcher.end();
        return matcher.group();
    }

    @Override
    public final void parse(String str, Node node) {
        Node text;
        boolean z;
        boolean z2;
        InlineParserImpl.DelimiterData delimiterData;
        this.input = str.trim();
        this.index = 0;
        this.lastDelimiter = null;
        this.lastBracket = null;
        this.block = node;
        while (true) {
            char cPeek = peek();
            if (cPeek == 0) {
                text = null;
            } else {
                List list = (List) this.inlineProcessors.get(Character.valueOf(cPeek));
                if (list != null) {
                    int i = this.index;
                    Iterator it = list.iterator();
                    text = null;
                    while (it.hasNext() && (text = ((InlineProcessor) it.next()).parse(this)) == null) {
                        this.index = i;
                    }
                } else {
                    DelimiterProcessor delimiterProcessor = (DelimiterProcessor) this.delimiterProcessors.get(Character.valueOf(cPeek));
                    if (delimiterProcessor != null) {
                        int i2 = this.index;
                        int i3 = 0;
                        while (peek() == cPeek) {
                            i3++;
                            this.index++;
                        }
                        if (i3 < delimiterProcessor.getMinLength()) {
                            this.index = i2;
                            delimiterData = null;
                        } else {
                            String strSubstring = i2 == 0 ? "\n" : this.input.substring(i2 - 1, i2);
                            char cPeek2 = peek();
                            String strValueOf = cPeek2 != 0 ? String.valueOf(cPeek2) : "\n";
                            Pattern pattern = PUNCTUATION;
                            boolean zMatches = pattern.matcher(strSubstring).matches();
                            Pattern pattern2 = UNICODE_WHITESPACE_CHAR;
                            boolean zMatches2 = pattern2.matcher(strSubstring).matches();
                            boolean zMatches3 = pattern.matcher(strValueOf).matches();
                            boolean zMatches4 = pattern2.matcher(strValueOf).matches();
                            boolean z3 = !zMatches4 && (!zMatches3 || zMatches2 || zMatches);
                            boolean z4 = !zMatches2 && (!zMatches || zMatches4 || zMatches3);
                            if (cPeek == '_') {
                                z2 = z3 && (!z4 || zMatches);
                                z = z4 && (!z3 || zMatches3);
                            } else {
                                boolean z5 = z3 && cPeek == delimiterProcessor.getOpeningCharacter();
                                z = z4 && cPeek == delimiterProcessor.getClosingCharacter();
                                z2 = z5;
                            }
                            this.index = i2;
                            delimiterData = new InlineParserImpl.DelimiterData(i3, z2, z);
                        }
                        if (delimiterData == null) {
                            text = null;
                        } else {
                            int i4 = this.index;
                            int i5 = delimiterData.count;
                            int i6 = i4 + i5;
                            this.index = i6;
                            InlineParserImpl.DelimiterData delimiterData2 = delimiterData;
                            Text text2 = new Text(this.input.substring(i4, i6));
                            Delimiter delimiter = this.lastDelimiter;
                            Delimiter delimiter2 = new Delimiter(text2, cPeek, delimiterData2.canOpen, delimiterData2.canClose, delimiter);
                            this.lastDelimiter = delimiter2;
                            delimiter2.length = i5;
                            delimiter2.originalLength = i5;
                            if (delimiter != null) {
                                delimiter.next = delimiter2;
                            }
                            text = text2;
                        }
                    } else {
                        int i7 = this.index;
                        int length = this.input.length();
                        while (true) {
                            int i8 = this.index;
                            if (i8 == length || this.specialCharacters.get(this.input.charAt(i8))) {
                                break;
                            } else {
                                this.index++;
                            }
                        }
                        int i9 = this.index;
                        if (i7 != i9) {
                            text = new Text(this.input.substring(i7, i9));
                        } else {
                            text = null;
                        }
                    }
                }
                if (text == null) {
                    this.index++;
                    text = new Text(String.valueOf(cPeek));
                }
            }
            if (text == null) {
                break;
            } else {
                node.appendChild(text);
            }
        }
        processDelimiters(null);
        Node node2 = node.firstChild;
        Node node3 = node.lastChild;
        if (node2 == node3) {
            return;
        }
        InlineParserUtils.mergeTextNodesInclusive(node2, node3);
    }

    public final char peek() {
        if (this.index < this.input.length()) {
            return this.input.charAt(this.index);
        }
        return (char) 0;
    }

    public final void processDelimiters(Delimiter delimiter) {
        boolean z;
        Node node;
        HashMap map = new HashMap();
        Delimiter delimiter2 = this.lastDelimiter;
        while (delimiter2 != null) {
            Delimiter delimiter3 = delimiter2.previous;
            if (delimiter3 == delimiter) {
                break;
            } else {
                delimiter2 = delimiter3;
            }
        }
        while (delimiter2 != null) {
            HashMap map2 = this.delimiterProcessors;
            char c = delimiter2.delimiterChar;
            DelimiterProcessor delimiterProcessor = (DelimiterProcessor) map2.get(Character.valueOf(c));
            if (!delimiter2.canClose || delimiterProcessor == null) {
                delimiter2 = delimiter2.next;
            } else {
                char openingCharacter = delimiterProcessor.getOpeningCharacter();
                Delimiter delimiter4 = delimiter2.previous;
                int delimiterUse = 0;
                boolean z2 = false;
                while (true) {
                    if (delimiter4 == null || delimiter4 == delimiter || delimiter4 == map.get(Character.valueOf(c))) {
                        z = z2;
                        z2 = false;
                        break;
                    }
                    if (delimiter4.canOpen && delimiter4.delimiterChar == openingCharacter) {
                        delimiterUse = delimiterProcessor.getDelimiterUse(delimiter4, delimiter2);
                        z2 = true;
                        if (delimiterUse > 0) {
                            z = true;
                            break;
                        }
                    }
                    delimiter4 = delimiter4.previous;
                }
                if (z2) {
                    Text text = delimiter4.node;
                    delimiter4.length -= delimiterUse;
                    delimiter2.length -= delimiterUse;
                    text.literal = Fragment$$ExternalSyntheticOutline0.m(delimiterUse, 0, text.literal);
                    Text text2 = delimiter2.node;
                    text2.literal = Fragment$$ExternalSyntheticOutline0.m(delimiterUse, 0, text2.literal);
                    Delimiter delimiter5 = delimiter2.previous;
                    while (delimiter5 != null && delimiter5 != delimiter4) {
                        Delimiter delimiter6 = delimiter5.previous;
                        removeDelimiter(delimiter5);
                        delimiter5 = delimiter6;
                    }
                    if (text != text2 && (node = text.next) != text2) {
                        InlineParserUtils.mergeTextNodesInclusive(node, text2.prev);
                    }
                    delimiterProcessor.process(text, text2, delimiterUse);
                    if (delimiter4.length == 0) {
                        delimiter4.node.unlink();
                        removeDelimiter(delimiter4);
                    }
                    if (delimiter2.length == 0) {
                        Delimiter delimiter7 = delimiter2.next;
                        text2.unlink();
                        removeDelimiter(delimiter2);
                        delimiter2 = delimiter7;
                    }
                } else {
                    if (!z) {
                        map.put(Character.valueOf(c), delimiter2.previous);
                        if (!delimiter2.canOpen) {
                            removeDelimiter(delimiter2);
                        }
                    }
                    delimiter2 = delimiter2.next;
                }
            }
        }
        while (true) {
            Delimiter delimiter8 = this.lastDelimiter;
            if (delimiter8 == null || delimiter8 == delimiter) {
                return;
            } else {
                removeDelimiter(delimiter8);
            }
        }
    }

    public final void removeDelimiter(Delimiter delimiter) {
        Delimiter delimiter2 = delimiter.previous;
        if (delimiter2 != null) {
            delimiter2.next = delimiter.next;
        }
        Delimiter delimiter3 = delimiter.next;
        if (delimiter3 == null) {
            this.lastDelimiter = delimiter2;
        } else {
            delimiter3.previous = delimiter2;
        }
    }

    public final class FactoryBuilderImpl implements InlineParserFactory {
        public final ArrayList delimiterProcessors;
        public final ArrayList inlineProcessors;
        public boolean referencesEnabled;

        public FactoryBuilderImpl() {
            this.inlineProcessors = new ArrayList(3);
            this.delimiterProcessors = new ArrayList(3);
        }

        @Override
        public InlineParser create(Stripe stripe) {
            ArrayList arrayList = (ArrayList) stripe.tokenCreator;
            int size = arrayList != null ? arrayList.size() : 0;
            ArrayList arrayList2 = this.delimiterProcessors;
            if (size > 0) {
                ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
                arrayList3.addAll(arrayList2);
                arrayList3.addAll(arrayList);
                arrayList2 = arrayList3;
            }
            return new MarkwonInlineParser(stripe, this.referencesEnabled, this.inlineProcessors, arrayList2);
        }

        public FactoryBuilderImpl(ArrayList arrayList, ArrayList arrayList2, boolean z) {
            this.referencesEnabled = z;
            this.inlineProcessors = arrayList;
            this.delimiterProcessors = arrayList2;
        }
    }
}

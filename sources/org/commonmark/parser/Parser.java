package org.commonmark.parser;

import com.android.billingclient.api.zzcm;
import com.stripe.android.Stripe;
import io.noties.markwon.inlineparser.MarkwonInlineParser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.commonmark.internal.DocumentParser;
import org.commonmark.node.Document;
import org.commonmark.parser.block.AbstractBlockParser;
import org.telegram.ui.web.MHTML;

public final class Parser {
    public final ArrayList blockParserFactories;
    public final ArrayList delimiterProcessors;
    public final InlineParserFactory inlineParserFactory;
    public final ArrayList postProcessors;

    public Parser(MHTML mhtml) {
        ArrayList arrayList = (ArrayList) mhtml.entries;
        LinkedHashSet linkedHashSet = (LinkedHashSet) mhtml.entriesByLocation;
        LinkedHashSet linkedHashSet2 = DocumentParser.CORE_FACTORY_TYPES;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add(DocumentParser.NODES_TO_CORE_FACTORIES.get((Class) it.next()));
        }
        this.blockParserFactories = arrayList2;
        InlineParserFactory zzcmVar = (MarkwonInlineParser.FactoryBuilderImpl) mhtml.filePos;
        zzcmVar = zzcmVar == null ? new zzcm() : zzcmVar;
        this.inlineParserFactory = zzcmVar;
        this.postProcessors = (ArrayList) mhtml.boundary;
        ArrayList arrayList3 = (ArrayList) mhtml.file;
        this.delimiterProcessors = arrayList3;
        zzcmVar.create(new Stripe(10, arrayList3, Collections.EMPTY_MAP));
    }

    public final Document parse(String str) {
        if (str == null) {
            throw new NullPointerException("input must not be null");
        }
        DocumentParser documentParser = new DocumentParser(this.blockParserFactories, this.inlineParserFactory, this.delimiterProcessors);
        int i = 0;
        while (true) {
            int length = str.length();
            int i2 = i;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                char cCharAt = str.charAt(i2);
                if (cCharAt == '\n' || cCharAt == '\r') {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                break;
            }
            documentParser.incorporateLine(str.substring(i, i2));
            i = i2 + 1;
            if (i < str.length() && str.charAt(i2) == '\r' && str.charAt(i) == '\n') {
                i = i2 + 2;
            }
        }
        if (str.length() > 0 && (i == 0 || i < str.length())) {
            documentParser.incorporateLine(str.substring(i));
        }
        documentParser.finalizeBlocks(documentParser.activeBlockParsers);
        InlineParser inlineParserCreate = documentParser.inlineParserFactory.create(new Stripe(10, documentParser.delimiterProcessors, documentParser.definitions));
        Iterator it = documentParser.allBlockParsers.iterator();
        while (it.hasNext()) {
            ((AbstractBlockParser) it.next()).parseInlines(inlineParserCreate);
        }
        Document document = (Document) documentParser.documentBlockParser.document;
        Iterator it2 = this.postProcessors.iterator();
        if (!it2.hasNext()) {
            return document;
        }
        it2.next().getClass();
        throw new ClassCastException();
    }
}

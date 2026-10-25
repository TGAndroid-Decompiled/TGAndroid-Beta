package ag;

import android.text.Editable;
import android.text.Html;
import java.util.ArrayDeque;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.XMLReader;
public final class p implements Html.TagHandler, ContentHandler {
    public final qb.a f1361a;
    public ContentHandler f1362b;
    public Editable f1363c;
    public final ArrayDeque d = new ArrayDeque();

    public p(qb.a aVar) {
        this.f1361a = aVar;
    }

    public static String a(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(attributes.getLocalName(i10))) {
                return attributes.getValue(i10);
            }
        }
        return null;
    }

    @Override
    public final void characters(char[] cArr, int i10, int i11) {
        this.f1362b.characters(cArr, i10, i11);
    }

    @Override
    public final void endDocument() {
        this.f1362b.endDocument();
    }

    @Override
    public final void endElement(String str, String str2, String str3) {
        if (!((Boolean) this.d.removeLast()).booleanValue()) {
            this.f1362b.endElement(str, str2, str3);
        }
        Editable editable = this.f1363c;
        this.f1361a.getClass();
        qb.a.k4(false, str2, editable, null);
    }

    @Override
    public final void endPrefixMapping(String str) {
        this.f1362b.endPrefixMapping(str);
    }

    @Override
    public final void handleTag(boolean z10, String str, Editable editable, XMLReader xMLReader) {
        if (this.f1362b == null) {
            this.f1363c = editable;
            this.f1362b = xMLReader.getContentHandler();
            xMLReader.setContentHandler(this);
            this.d.addLast(Boolean.FALSE);
        }
    }

    @Override
    public final void ignorableWhitespace(char[] cArr, int i10, int i11) {
        this.f1362b.ignorableWhitespace(cArr, i10, i11);
    }

    @Override
    public final void processingInstruction(String str, String str2) {
        this.f1362b.processingInstruction(str, str2);
    }

    @Override
    public final void setDocumentLocator(Locator locator) {
        this.f1362b.setDocumentLocator(locator);
    }

    @Override
    public final void skippedEntity(String str) {
        this.f1362b.skippedEntity(str);
    }

    @Override
    public final void startDocument() {
        this.f1362b.startDocument();
    }

    @Override
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        Editable editable = this.f1363c;
        this.f1361a.getClass();
        boolean k42 = qb.a.k4(true, str2, editable, attributes);
        this.d.addLast(Boolean.valueOf(k42));
        if (!k42) {
            this.f1362b.startElement(str, str2, str3, attributes);
        }
    }

    @Override
    public final void startPrefixMapping(String str, String str2) {
        this.f1362b.startPrefixMapping(str, str2);
    }
}

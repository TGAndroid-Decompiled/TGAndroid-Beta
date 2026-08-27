package gf;

import android.text.Editable;
import android.text.Html;
import java.util.ArrayDeque;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

public final class m implements Html.TagHandler, ContentHandler {

    public final ab.a f7036a;

    public ContentHandler f7037b;

    public Editable f7038c;
    public final ArrayDeque d = new ArrayDeque();

    public m(ab.a aVar) {
        this.f7036a = aVar;
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
    public final void characters(char[] cArr, int i10, int i11) throws SAXException {
        this.f7037b.characters(cArr, i10, i11);
    }

    @Override
    public final void endDocument() throws SAXException {
        this.f7037b.endDocument();
    }

    @Override
    public final void endElement(String str, String str2, String str3) throws SAXException {
        if (!((Boolean) this.d.removeLast()).booleanValue()) {
            this.f7037b.endElement(str, str2, str3);
        }
        Editable editable = this.f7038c;
        this.f7036a.getClass();
        ab.a.C3(false, str2, editable, null);
    }

    @Override
    public final void endPrefixMapping(String str) throws SAXException {
        this.f7037b.endPrefixMapping(str);
    }

    @Override
    public final void handleTag(boolean z10, String str, Editable editable, XMLReader xMLReader) {
        if (this.f7037b == null) {
            this.f7038c = editable;
            this.f7037b = xMLReader.getContentHandler();
            xMLReader.setContentHandler(this);
            this.d.addLast(Boolean.FALSE);
        }
    }

    @Override
    public final void ignorableWhitespace(char[] cArr, int i10, int i11) throws SAXException {
        this.f7037b.ignorableWhitespace(cArr, i10, i11);
    }

    @Override
    public final void processingInstruction(String str, String str2) throws SAXException {
        this.f7037b.processingInstruction(str, str2);
    }

    @Override
    public final void setDocumentLocator(Locator locator) {
        this.f7037b.setDocumentLocator(locator);
    }

    @Override
    public final void skippedEntity(String str) throws SAXException {
        this.f7037b.skippedEntity(str);
    }

    @Override
    public final void startDocument() throws SAXException {
        this.f7037b.startDocument();
    }

    @Override
    public final void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        Editable editable = this.f7038c;
        this.f7036a.getClass();
        boolean zC3 = ab.a.C3(true, str2, editable, attributes);
        this.d.addLast(Boolean.valueOf(zC3));
        if (zC3) {
            return;
        }
        this.f7037b.startElement(str, str2, str3, attributes);
    }

    @Override
    public final void startPrefixMapping(String str, String str2) throws SAXException {
        this.f7037b.startPrefixMapping(str, str2);
    }
}

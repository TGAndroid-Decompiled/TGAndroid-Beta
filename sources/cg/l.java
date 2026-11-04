package cg;

import android.text.Editable;
import android.text.Html;
import java.util.ArrayDeque;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.XMLReader;
public final class l implements Html.TagHandler, ContentHandler {
    public final kb.a f4716a;
    public ContentHandler f4717b;
    public Editable f4718c;
    public final ArrayDeque d = new ArrayDeque();

    public l(kb.a aVar) {
        this.f4716a = aVar;
    }

    public static String a(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(attributes.getLocalName(i3))) {
                return attributes.getValue(i3);
            }
        }
        return null;
    }

    @Override
    public final void characters(char[] cArr, int i3, int i10) {
        this.f4717b.characters(cArr, i3, i10);
    }

    @Override
    public final void endDocument() {
        this.f4717b.endDocument();
    }

    @Override
    public final void endElement(String str, String str2, String str3) {
        if (!((Boolean) this.d.removeLast()).booleanValue()) {
            this.f4717b.endElement(str, str2, str3);
        }
        Editable editable = this.f4718c;
        this.f4716a.getClass();
        kb.a.H4(false, str2, editable, null);
    }

    @Override
    public final void endPrefixMapping(String str) {
        this.f4717b.endPrefixMapping(str);
    }

    @Override
    public final void handleTag(boolean z10, String str, Editable editable, XMLReader xMLReader) {
        if (this.f4717b == null) {
            this.f4718c = editable;
            this.f4717b = xMLReader.getContentHandler();
            xMLReader.setContentHandler(this);
            this.d.addLast(Boolean.FALSE);
        }
    }

    @Override
    public final void ignorableWhitespace(char[] cArr, int i3, int i10) {
        this.f4717b.ignorableWhitespace(cArr, i3, i10);
    }

    @Override
    public final void processingInstruction(String str, String str2) {
        this.f4717b.processingInstruction(str, str2);
    }

    @Override
    public final void setDocumentLocator(Locator locator) {
        this.f4717b.setDocumentLocator(locator);
    }

    @Override
    public final void skippedEntity(String str) {
        this.f4717b.skippedEntity(str);
    }

    @Override
    public final void startDocument() {
        this.f4717b.startDocument();
    }

    @Override
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        Editable editable = this.f4718c;
        this.f4716a.getClass();
        boolean H4 = kb.a.H4(true, str2, editable, attributes);
        this.d.addLast(Boolean.valueOf(H4));
        if (!H4) {
            this.f4717b.startElement(str, str2, str3, attributes);
        }
    }

    @Override
    public final void startPrefixMapping(String str, String str2) {
        this.f4717b.startPrefixMapping(str, str2);
    }
}

package jf;

import android.text.Editable;
import android.text.Html;
import java.util.ArrayDeque;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.XMLReader;
public final class l implements Html.TagHandler, ContentHandler {
    public final bb.a f11650a;
    public ContentHandler f11651b;
    public Editable f11652c;
    public final ArrayDeque d = new ArrayDeque();

    public l(bb.a aVar) {
        this.f11650a = aVar;
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
        this.f11651b.characters(cArr, i10, i11);
    }

    @Override
    public final void endDocument() {
        this.f11651b.endDocument();
    }

    @Override
    public final void endElement(String str, String str2, String str3) {
        if (!((Boolean) this.d.removeLast()).booleanValue()) {
            this.f11651b.endElement(str, str2, str3);
        }
        Editable editable = this.f11652c;
        this.f11650a.getClass();
        bb.a.o3(false, str2, editable, null);
    }

    @Override
    public final void endPrefixMapping(String str) {
        this.f11651b.endPrefixMapping(str);
    }

    @Override
    public final void handleTag(boolean z10, String str, Editable editable, XMLReader xMLReader) {
        if (this.f11651b == null) {
            this.f11652c = editable;
            this.f11651b = xMLReader.getContentHandler();
            xMLReader.setContentHandler(this);
            this.d.addLast(Boolean.FALSE);
        }
    }

    @Override
    public final void ignorableWhitespace(char[] cArr, int i10, int i11) {
        this.f11651b.ignorableWhitespace(cArr, i10, i11);
    }

    @Override
    public final void processingInstruction(String str, String str2) {
        this.f11651b.processingInstruction(str, str2);
    }

    @Override
    public final void setDocumentLocator(Locator locator) {
        this.f11651b.setDocumentLocator(locator);
    }

    @Override
    public final void skippedEntity(String str) {
        this.f11651b.skippedEntity(str);
    }

    @Override
    public final void startDocument() {
        this.f11651b.startDocument();
    }

    @Override
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        Editable editable = this.f11652c;
        this.f11650a.getClass();
        boolean o32 = bb.a.o3(true, str2, editable, attributes);
        this.d.addLast(Boolean.valueOf(o32));
        if (!o32) {
            this.f11651b.startElement(str, str2, str3, attributes);
        }
    }

    @Override
    public final void startPrefixMapping(String str, String str2) {
        this.f11651b.startPrefixMapping(str, str2);
    }
}

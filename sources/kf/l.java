package kf;

import android.text.Editable;
import android.text.Html;
import java.util.ArrayDeque;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.XMLReader;
public final class l implements Html.TagHandler, ContentHandler {
    public final ab.a f10478a;
    public ContentHandler f10479b;
    public Editable f10480c;
    public final ArrayDeque d = new ArrayDeque();

    public l(ab.a aVar) {
        this.f10478a = aVar;
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
        this.f10479b.characters(cArr, i10, i11);
    }

    @Override
    public final void endDocument() {
        this.f10479b.endDocument();
    }

    @Override
    public final void endElement(String str, String str2, String str3) {
        if (!((Boolean) this.d.removeLast()).booleanValue()) {
            this.f10479b.endElement(str, str2, str3);
        }
        Editable editable = this.f10480c;
        this.f10478a.getClass();
        ab.a.u3(false, str2, editable, null);
    }

    @Override
    public final void endPrefixMapping(String str) {
        this.f10479b.endPrefixMapping(str);
    }

    @Override
    public final void handleTag(boolean z4, String str, Editable editable, XMLReader xMLReader) {
        if (this.f10479b == null) {
            this.f10480c = editable;
            this.f10479b = xMLReader.getContentHandler();
            xMLReader.setContentHandler(this);
            this.d.addLast(Boolean.FALSE);
        }
    }

    @Override
    public final void ignorableWhitespace(char[] cArr, int i10, int i11) {
        this.f10479b.ignorableWhitespace(cArr, i10, i11);
    }

    @Override
    public final void processingInstruction(String str, String str2) {
        this.f10479b.processingInstruction(str, str2);
    }

    @Override
    public final void setDocumentLocator(Locator locator) {
        this.f10479b.setDocumentLocator(locator);
    }

    @Override
    public final void skippedEntity(String str) {
        this.f10479b.skippedEntity(str);
    }

    @Override
    public final void startDocument() {
        this.f10479b.startDocument();
    }

    @Override
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        Editable editable = this.f10480c;
        this.f10478a.getClass();
        boolean u32 = ab.a.u3(true, str2, editable, attributes);
        this.d.addLast(Boolean.valueOf(u32));
        if (!u32) {
            this.f10479b.startElement(str, str2, str3, attributes);
        }
    }

    @Override
    public final void startPrefixMapping(String str, String str2) {
        this.f10479b.startPrefixMapping(str, str2);
    }
}

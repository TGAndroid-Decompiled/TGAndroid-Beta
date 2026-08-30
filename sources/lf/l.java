package lf;

import android.text.Editable;
import android.text.Html;
import java.util.ArrayDeque;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.XMLReader;
public final class l implements Html.TagHandler, ContentHandler {
    public final db.a f12036a;
    public ContentHandler f12037b;
    public Editable f12038c;
    public final ArrayDeque d = new ArrayDeque();

    public l(db.a aVar) {
        this.f12036a = aVar;
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
        this.f12037b.characters(cArr, i10, i11);
    }

    @Override
    public final void endDocument() {
        this.f12037b.endDocument();
    }

    @Override
    public final void endElement(String str, String str2, String str3) {
        if (!((Boolean) this.d.removeLast()).booleanValue()) {
            this.f12037b.endElement(str, str2, str3);
        }
        Editable editable = this.f12038c;
        this.f12036a.getClass();
        db.a.z3(false, str2, editable, null);
    }

    @Override
    public final void endPrefixMapping(String str) {
        this.f12037b.endPrefixMapping(str);
    }

    @Override
    public final void handleTag(boolean z4, String str, Editable editable, XMLReader xMLReader) {
        if (this.f12037b == null) {
            this.f12038c = editable;
            this.f12037b = xMLReader.getContentHandler();
            xMLReader.setContentHandler(this);
            this.d.addLast(Boolean.FALSE);
        }
    }

    @Override
    public final void ignorableWhitespace(char[] cArr, int i10, int i11) {
        this.f12037b.ignorableWhitespace(cArr, i10, i11);
    }

    @Override
    public final void processingInstruction(String str, String str2) {
        this.f12037b.processingInstruction(str, str2);
    }

    @Override
    public final void setDocumentLocator(Locator locator) {
        this.f12037b.setDocumentLocator(locator);
    }

    @Override
    public final void skippedEntity(String str) {
        this.f12037b.skippedEntity(str);
    }

    @Override
    public final void startDocument() {
        this.f12037b.startDocument();
    }

    @Override
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        Editable editable = this.f12038c;
        this.f12036a.getClass();
        boolean z32 = db.a.z3(true, str2, editable, attributes);
        this.d.addLast(Boolean.valueOf(z32));
        if (!z32) {
            this.f12037b.startElement(str, str2, str3, attributes);
        }
    }

    @Override
    public final void startPrefixMapping(String str, String str2) {
        this.f12037b.startPrefixMapping(str, str2);
    }
}

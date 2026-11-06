package bg;

import android.text.Editable;
import android.text.Html;
import java.util.ArrayDeque;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.XMLReader;
public final class m implements Html.TagHandler, ContentHandler {
    public final nb.a f3351a;
    public ContentHandler f3352b;
    public Editable f3353c;
    public final ArrayDeque d = new ArrayDeque();

    public m(nb.a aVar) {
        this.f3351a = aVar;
    }

    public static String a(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i7 = 0; i7 < length; i7++) {
            if (str.equals(attributes.getLocalName(i7))) {
                return attributes.getValue(i7);
            }
        }
        return null;
    }

    @Override
    public final void characters(char[] cArr, int i7, int i10) {
        this.f3352b.characters(cArr, i7, i10);
    }

    @Override
    public final void endDocument() {
        this.f3352b.endDocument();
    }

    @Override
    public final void endElement(String str, String str2, String str3) {
        if (!((Boolean) this.d.removeLast()).booleanValue()) {
            this.f3352b.endElement(str, str2, str3);
        }
        Editable editable = this.f3353c;
        this.f3351a.getClass();
        nb.a.f0(false, str2, editable, null);
    }

    @Override
    public final void endPrefixMapping(String str) {
        this.f3352b.endPrefixMapping(str);
    }

    @Override
    public final void handleTag(boolean z9, String str, Editable editable, XMLReader xMLReader) {
        if (this.f3352b == null) {
            this.f3353c = editable;
            this.f3352b = xMLReader.getContentHandler();
            xMLReader.setContentHandler(this);
            this.d.addLast(Boolean.FALSE);
        }
    }

    @Override
    public final void ignorableWhitespace(char[] cArr, int i7, int i10) {
        this.f3352b.ignorableWhitespace(cArr, i7, i10);
    }

    @Override
    public final void processingInstruction(String str, String str2) {
        this.f3352b.processingInstruction(str, str2);
    }

    @Override
    public final void setDocumentLocator(Locator locator) {
        this.f3352b.setDocumentLocator(locator);
    }

    @Override
    public final void skippedEntity(String str) {
        this.f3352b.skippedEntity(str);
    }

    @Override
    public final void startDocument() {
        this.f3352b.startDocument();
    }

    @Override
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        Editable editable = this.f3353c;
        this.f3351a.getClass();
        boolean f02 = nb.a.f0(true, str2, editable, attributes);
        this.d.addLast(Boolean.valueOf(f02));
        if (!f02) {
            this.f3352b.startElement(str, str2, str3, attributes);
        }
    }

    @Override
    public final void startPrefixMapping(String str, String str2) {
        this.f3352b.startPrefixMapping(str, str2);
    }
}

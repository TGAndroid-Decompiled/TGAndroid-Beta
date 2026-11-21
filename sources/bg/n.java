package bg;

import android.text.Editable;
import android.text.Html;
import java.util.ArrayDeque;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.XMLReader;
public final class n implements Html.TagHandler, ContentHandler {
    public final pb.b f3329a;
    public ContentHandler f3330b;
    public Editable f3331c;
    public final ArrayDeque d = new ArrayDeque();

    public n(pb.b bVar) {
        this.f3329a = bVar;
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
        this.f3330b.characters(cArr, i7, i10);
    }

    @Override
    public final void endDocument() {
        this.f3330b.endDocument();
    }

    @Override
    public final void endElement(String str, String str2, String str3) {
        if (!((Boolean) this.d.removeLast()).booleanValue()) {
            this.f3330b.endElement(str, str2, str3);
        }
        Editable editable = this.f3331c;
        this.f3329a.getClass();
        pb.b.G0(false, str2, editable, null);
    }

    @Override
    public final void endPrefixMapping(String str) {
        this.f3330b.endPrefixMapping(str);
    }

    @Override
    public final void handleTag(boolean z10, String str, Editable editable, XMLReader xMLReader) {
        if (this.f3330b == null) {
            this.f3331c = editable;
            this.f3330b = xMLReader.getContentHandler();
            xMLReader.setContentHandler(this);
            this.d.addLast(Boolean.FALSE);
        }
    }

    @Override
    public final void ignorableWhitespace(char[] cArr, int i7, int i10) {
        this.f3330b.ignorableWhitespace(cArr, i7, i10);
    }

    @Override
    public final void processingInstruction(String str, String str2) {
        this.f3330b.processingInstruction(str, str2);
    }

    @Override
    public final void setDocumentLocator(Locator locator) {
        this.f3330b.setDocumentLocator(locator);
    }

    @Override
    public final void skippedEntity(String str) {
        this.f3330b.skippedEntity(str);
    }

    @Override
    public final void startDocument() {
        this.f3330b.startDocument();
    }

    @Override
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        Editable editable = this.f3331c;
        this.f3329a.getClass();
        boolean G0 = pb.b.G0(true, str2, editable, attributes);
        this.d.addLast(Boolean.valueOf(G0));
        if (!G0) {
            this.f3330b.startElement(str, str2, str3, attributes);
        }
    }

    @Override
    public final void startPrefixMapping(String str, String str2) {
        this.f3330b.startPrefixMapping(str, str2);
    }
}

package bg;

import android.text.Editable;
import android.text.Html;
import java.util.ArrayDeque;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.XMLReader;
public final class n implements Html.TagHandler, ContentHandler {
    public final pb.b f3317a;
    public ContentHandler f3318b;
    public Editable f3319c;
    public final ArrayDeque d = new ArrayDeque();

    public n(pb.b bVar) {
        this.f3317a = bVar;
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
        this.f3318b.characters(cArr, i7, i10);
    }

    @Override
    public final void endDocument() {
        this.f3318b.endDocument();
    }

    @Override
    public final void endElement(String str, String str2, String str3) {
        if (!((Boolean) this.d.removeLast()).booleanValue()) {
            this.f3318b.endElement(str, str2, str3);
        }
        Editable editable = this.f3319c;
        this.f3317a.getClass();
        pb.b.G0(false, str2, editable, null);
    }

    @Override
    public final void endPrefixMapping(String str) {
        this.f3318b.endPrefixMapping(str);
    }

    @Override
    public final void handleTag(boolean z10, String str, Editable editable, XMLReader xMLReader) {
        if (this.f3318b == null) {
            this.f3319c = editable;
            this.f3318b = xMLReader.getContentHandler();
            xMLReader.setContentHandler(this);
            this.d.addLast(Boolean.FALSE);
        }
    }

    @Override
    public final void ignorableWhitespace(char[] cArr, int i7, int i10) {
        this.f3318b.ignorableWhitespace(cArr, i7, i10);
    }

    @Override
    public final void processingInstruction(String str, String str2) {
        this.f3318b.processingInstruction(str, str2);
    }

    @Override
    public final void setDocumentLocator(Locator locator) {
        this.f3318b.setDocumentLocator(locator);
    }

    @Override
    public final void skippedEntity(String str) {
        this.f3318b.skippedEntity(str);
    }

    @Override
    public final void startDocument() {
        this.f3318b.startDocument();
    }

    @Override
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        Editable editable = this.f3319c;
        this.f3317a.getClass();
        boolean G0 = pb.b.G0(true, str2, editable, attributes);
        this.d.addLast(Boolean.valueOf(G0));
        if (!G0) {
            this.f3318b.startElement(str, str2, str3, attributes);
        }
    }

    @Override
    public final void startPrefixMapping(String str, String str2) {
        this.f3318b.startPrefixMapping(str, str2);
    }
}

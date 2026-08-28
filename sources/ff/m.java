package ff;

import android.text.Editable;
import android.text.Html;
import java.util.ArrayDeque;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.XMLReader;
public final class m implements Html.TagHandler, ContentHandler {
    public final d7.u f6236a;
    public ContentHandler f6237b;
    public Editable f6238c;
    public final ArrayDeque d = new ArrayDeque();

    public m(d7.u uVar) {
        this.f6236a = uVar;
    }

    public static String a(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i9 = 0; i9 < length; i9++) {
            if (str.equals(attributes.getLocalName(i9))) {
                return attributes.getValue(i9);
            }
        }
        return null;
    }

    @Override
    public final void characters(char[] cArr, int i9, int i10) {
        this.f6237b.characters(cArr, i9, i10);
    }

    @Override
    public final void endDocument() {
        this.f6237b.endDocument();
    }

    @Override
    public final void endElement(String str, String str2, String str3) {
        if (!((Boolean) this.d.removeLast()).booleanValue()) {
            this.f6237b.endElement(str, str2, str3);
        }
        Editable editable = this.f6238c;
        this.f6236a.getClass();
        d7.u.j2(false, str2, editable, null);
    }

    @Override
    public final void endPrefixMapping(String str) {
        this.f6237b.endPrefixMapping(str);
    }

    @Override
    public final void handleTag(boolean z10, String str, Editable editable, XMLReader xMLReader) {
        if (this.f6237b == null) {
            this.f6238c = editable;
            this.f6237b = xMLReader.getContentHandler();
            xMLReader.setContentHandler(this);
            this.d.addLast(Boolean.FALSE);
        }
    }

    @Override
    public final void ignorableWhitespace(char[] cArr, int i9, int i10) {
        this.f6237b.ignorableWhitespace(cArr, i9, i10);
    }

    @Override
    public final void processingInstruction(String str, String str2) {
        this.f6237b.processingInstruction(str, str2);
    }

    @Override
    public final void setDocumentLocator(Locator locator) {
        this.f6237b.setDocumentLocator(locator);
    }

    @Override
    public final void skippedEntity(String str) {
        this.f6237b.skippedEntity(str);
    }

    @Override
    public final void startDocument() {
        this.f6237b.startDocument();
    }

    @Override
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        Editable editable = this.f6238c;
        this.f6236a.getClass();
        boolean j22 = d7.u.j2(true, str2, editable, attributes);
        this.d.addLast(Boolean.valueOf(j22));
        if (!j22) {
            this.f6237b.startElement(str, str2, str3, attributes);
        }
    }

    @Override
    public final void startPrefixMapping(String str, String str2) {
        this.f6237b.startPrefixMapping(str, str2);
    }
}

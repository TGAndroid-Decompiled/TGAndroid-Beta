package defpackage;

import android.text.Editable;
import android.text.Html;
import java.util.ArrayDeque;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.XMLReader;
public final class fx2 implements Html.TagHandler, ContentHandler {
    public ContentHandler a;
    public Editable b;
    public final ArrayDeque c = new ArrayDeque();

    public fx2(rj2 rj2Var) {
    }

    public static String a(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            if (str.equals(attributes.getLocalName(i))) {
                return attributes.getValue(i);
            }
        }
        return null;
    }

    @Override
    public final void characters(char[] cArr, int i, int i2) {
        this.a.characters(cArr, i, i2);
    }

    @Override
    public final void endDocument() {
        this.a.endDocument();
    }

    @Override
    public final void endElement(String str, String str2, String str3) {
        if (!((Boolean) this.c.removeLast()).booleanValue()) {
            this.a.endElement(str, str2, str3);
        }
        rj2.Y1(false, str2, this.b, null);
    }

    @Override
    public final void endPrefixMapping(String str) {
        this.a.endPrefixMapping(str);
    }

    @Override
    public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        if (this.a == null) {
            this.b = editable;
            this.a = xMLReader.getContentHandler();
            xMLReader.setContentHandler(this);
            this.c.addLast(Boolean.FALSE);
        }
    }

    @Override
    public final void ignorableWhitespace(char[] cArr, int i, int i2) {
        this.a.ignorableWhitespace(cArr, i, i2);
    }

    @Override
    public final void processingInstruction(String str, String str2) {
        this.a.processingInstruction(str, str2);
    }

    @Override
    public final void setDocumentLocator(Locator locator) {
        this.a.setDocumentLocator(locator);
    }

    @Override
    public final void skippedEntity(String str) {
        this.a.skippedEntity(str);
    }

    @Override
    public final void startDocument() {
        this.a.startDocument();
    }

    @Override
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        boolean Y1 = rj2.Y1(true, str2, this.b, attributes);
        this.c.addLast(Boolean.valueOf(Y1));
        if (!Y1) {
            this.a.startElement(str, str2, str3, attributes);
        }
    }

    @Override
    public final void startPrefixMapping(String str, String str2) {
        this.a.startPrefixMapping(str, str2);
    }
}

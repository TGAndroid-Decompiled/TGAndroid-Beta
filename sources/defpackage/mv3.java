package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mv3 extends w64 {
    public final via X;
    public final nv3 Y;

    public mv3(nv3 nv3Var) {
        super(100, true);
        this.Y = nv3Var;
        this.X = new Object();
        this.O = new nq1(this, (byte) 3);
    }

    @Override
    public final via B1(int i) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize w;
        int i2;
        int i3;
        via viaVar = this.X;
        viaVar.c = false;
        Object E = this.Y.c.E(i);
        if (E instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) E;
            document = botInlineResult.document;
            if (document != null) {
                arrayList = document.attributes;
            } else {
                TLRPC.WebDocument webDocument = botInlineResult.content;
                if (webDocument != null) {
                    arrayList = webDocument.attributes;
                } else {
                    TLRPC.WebDocument webDocument2 = botInlineResult.thumb;
                    if (webDocument2 != null) {
                        arrayList = webDocument2.attributes;
                    } else {
                        arrayList = null;
                    }
                }
            }
        } else if (E instanceof TLRPC.Document) {
            document = (TLRPC.Document) E;
            arrayList = document.attributes;
        } else {
            viaVar.c = true;
            return viaVar;
        }
        viaVar.b = 100.0f;
        viaVar.a = 100.0f;
        viaVar.c = false;
        if (document != null && (w = ba4.w(document.thumbs, 90, false, null, false)) != null && (i2 = w.w) != 0 && (i3 = w.h) != 0) {
            viaVar.a = i2;
            viaVar.b = i3;
        }
        if (arrayList != null) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i4);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    viaVar.a = documentAttribute.w;
                    viaVar.b = documentAttribute.h;
                    break;
                }
            }
        }
        return viaVar;
    }

    @Override
    public final int z() {
        return A();
    }
}

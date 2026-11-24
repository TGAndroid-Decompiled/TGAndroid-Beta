package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xw3 extends f84 {
    public final xka X;
    public final yw3 Y;

    public xw3(yw3 yw3Var) {
        super(100, true);
        this.Y = yw3Var;
        this.X = new Object();
        this.O = new zr1(this, (byte) 3);
    }

    @Override
    public final xka B1(int i) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize w;
        int i2;
        int i3;
        xka xkaVar = this.X;
        xkaVar.c = false;
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
            xkaVar.c = true;
            return xkaVar;
        }
        xkaVar.b = 100.0f;
        xkaVar.a = 100.0f;
        xkaVar.c = false;
        if (document != null && (w = bc4.w(document.thumbs, 90, false, null, false)) != null && (i2 = w.w) != 0 && (i3 = w.h) != 0) {
            xkaVar.a = i2;
            xkaVar.b = i3;
        }
        if (arrayList != null) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i4);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    xkaVar.a = documentAttribute.w;
                    xkaVar.b = documentAttribute.h;
                    break;
                }
            }
        }
        return xkaVar;
    }

    @Override
    public final int z() {
        return A();
    }
}

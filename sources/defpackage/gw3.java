package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gw3 extends q74 {
    public final qma X;
    public final hw3 Y;

    public gw3(hw3 hw3Var) {
        super(100, true);
        this.Y = hw3Var;
        this.X = new Object();
        this.O = new ar1(this, (byte) 3);
    }

    @Override
    public final qma B1(int i) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize w;
        int i2;
        int i3;
        qma qmaVar = this.X;
        qmaVar.c = false;
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
            qmaVar.c = true;
            return qmaVar;
        }
        qmaVar.b = 100.0f;
        qmaVar.a = 100.0f;
        qmaVar.c = false;
        if (document != null && (w = xb4.w(document.thumbs, 90, false, null, false)) != null && (i2 = w.w) != 0 && (i3 = w.h) != 0) {
            qmaVar.a = i2;
            qmaVar.b = i3;
        }
        if (arrayList != null) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i4);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    qmaVar.a = documentAttribute.w;
                    qmaVar.b = documentAttribute.h;
                    break;
                }
            }
        }
        return qmaVar;
    }

    @Override
    public final int z() {
        return A();
    }
}

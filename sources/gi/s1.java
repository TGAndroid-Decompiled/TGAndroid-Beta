package gi;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.lt0;
public final class s1 extends hy {
    public final lt0 X;
    public final t1 Y;

    public s1(t1 t1Var) {
        super(100, true);
        this.Y = t1Var;
        this.X = new Object();
        this.O = new ai.g2(this, 5);
    }

    @Override
    public final int A() {
        return B();
    }

    @Override
    public final lt0 D1(int i3) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize w10;
        int i10;
        int i11;
        lt0 lt0Var = this.X;
        lt0Var.f35879c = false;
        Object F = this.Y.f13602c.F(i3);
        if (F instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) F;
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
        } else if (F instanceof TLRPC.Document) {
            document = (TLRPC.Document) F;
            arrayList = document.attributes;
        } else {
            lt0Var.f35879c = true;
            return lt0Var;
        }
        lt0Var.f35878b = 100.0f;
        lt0Var.f35877a = 100.0f;
        lt0Var.f35879c = false;
        if (document != null && (w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false)) != null && (i10 = w10.f27026w) != 0 && (i11 = w10.h) != 0) {
            lt0Var.f35877a = i10;
            lt0Var.f35878b = i11;
        }
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    lt0Var.f35877a = documentAttribute.f27008w;
                    lt0Var.f35878b = documentAttribute.h;
                    break;
                }
            }
        }
        return lt0Var;
    }
}

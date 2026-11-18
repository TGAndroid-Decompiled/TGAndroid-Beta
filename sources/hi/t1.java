package hi;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.uy;
import org.telegram.ui.Components.vt0;
public final class t1 extends uy {
    public final vt0 X;
    public final u1 Y;

    public t1(u1 u1Var) {
        super(100, true);
        this.Y = u1Var;
        this.X = new Object();
        this.O = new bi.s2(this, 5);
    }

    @Override
    public final int A() {
        return B();
    }

    @Override
    public final vt0 D1(int i7) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize w10;
        int i10;
        int i11;
        vt0 vt0Var = this.X;
        vt0Var.f41435c = false;
        Object F = this.Y.f15522c.F(i7);
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
            vt0Var.f41435c = true;
            return vt0Var;
        }
        vt0Var.f41434b = 100.0f;
        vt0Var.f41433a = 100.0f;
        vt0Var.f41435c = false;
        if (document != null && (w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false)) != null && (i10 = w10.f28428w) != 0 && (i11 = w10.h) != 0) {
            vt0Var.f41433a = i10;
            vt0Var.f41434b = i11;
        }
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    vt0Var.f41433a = documentAttribute.f28410w;
                    vt0Var.f41434b = documentAttribute.h;
                    break;
                }
            }
        }
        return vt0Var;
    }
}

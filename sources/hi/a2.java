package hi;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.xt0;
public final class a2 extends ty {
    public final xt0 X;
    public final b2 Y;

    public a2(b2 b2Var) {
        super(100, true);
        this.Y = b2Var;
        this.X = new Object();
        this.O = new bi.y2(this, 5);
    }

    @Override
    public final int A() {
        return B();
    }

    @Override
    public final xt0 D1(int i7) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize w10;
        int i10;
        int i11;
        xt0 xt0Var = this.X;
        xt0Var.f42191c = false;
        Object F = this.Y.f14216c.F(i7);
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
            xt0Var.f42191c = true;
            return xt0Var;
        }
        xt0Var.f42190b = 100.0f;
        xt0Var.f42189a = 100.0f;
        xt0Var.f42191c = false;
        if (document != null && (w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false)) != null && (i10 = w10.f28517w) != 0 && (i11 = w10.h) != 0) {
            xt0Var.f42189a = i10;
            xt0Var.f42190b = i11;
        }
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    xt0Var.f42189a = documentAttribute.f28499w;
                    xt0Var.f42190b = documentAttribute.h;
                    break;
                }
            }
        }
        return xt0Var;
    }
}

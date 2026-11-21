package hi;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.yt0;
public final class s1 extends wy {
    public final yt0 X;
    public final t1 Y;

    public s1(t1 t1Var) {
        super(100, true);
        this.Y = t1Var;
        this.X = new Object();
        this.O = new bi.w2(this, 5);
    }

    @Override
    public final int A() {
        return B();
    }

    @Override
    public final yt0 D1(int i7) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize w10;
        int i10;
        int i11;
        yt0 yt0Var = this.X;
        yt0Var.f42555c = false;
        Object F = this.Y.f15493c.F(i7);
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
            yt0Var.f42555c = true;
            return yt0Var;
        }
        yt0Var.f42554b = 100.0f;
        yt0Var.f42553a = 100.0f;
        yt0Var.f42555c = false;
        if (document != null && (w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false)) != null && (i10 = w10.f28456w) != 0 && (i11 = w10.h) != 0) {
            yt0Var.f42553a = i10;
            yt0Var.f42554b = i11;
        }
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    yt0Var.f42553a = documentAttribute.f28438w;
                    yt0Var.f42554b = documentAttribute.h;
                    break;
                }
            }
        }
        return yt0Var;
    }
}

package fi;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.ot0;
public final class s1 extends ky {
    public final ot0 X;
    public final t1 Y;

    public s1(t1 t1Var) {
        super(100, true);
        this.Y = t1Var;
        this.X = new Object();
        this.O = new ai.l(this, 2);
    }

    @Override
    public final int A() {
        return B();
    }

    @Override
    public final ot0 D1(int i7) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize w10;
        int i10;
        int i11;
        ot0 ot0Var = this.X;
        ot0Var.f36803c = false;
        Object F = this.Y.f12840c.F(i7);
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
            ot0Var.f36803c = true;
            return ot0Var;
        }
        ot0Var.f36802b = 100.0f;
        ot0Var.f36801a = 100.0f;
        ot0Var.f36803c = false;
        if (document != null && (w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false)) != null && (i10 = w10.f26981w) != 0 && (i11 = w10.h) != 0) {
            ot0Var.f36801a = i10;
            ot0Var.f36802b = i11;
        }
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    ot0Var.f36801a = documentAttribute.f26963w;
                    ot0Var.f36802b = documentAttribute.h;
                    break;
                }
            }
        }
        return ot0Var;
    }
}

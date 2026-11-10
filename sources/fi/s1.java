package fi;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.nt0;
public final class s1 extends jy {
    public final nt0 X;
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
    public final nt0 D1(int i7) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize w10;
        int i10;
        int i11;
        nt0 nt0Var = this.X;
        nt0Var.f36394c = false;
        Object F = this.Y.f12841c.F(i7);
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
            nt0Var.f36394c = true;
            return nt0Var;
        }
        nt0Var.f36393b = 100.0f;
        nt0Var.f36392a = 100.0f;
        nt0Var.f36394c = false;
        if (document != null && (w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false)) != null && (i10 = w10.f26985w) != 0 && (i11 = w10.h) != 0) {
            nt0Var.f36392a = i10;
            nt0Var.f36393b = i11;
        }
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    nt0Var.f36392a = documentAttribute.f26967w;
                    nt0Var.f36393b = documentAttribute.h;
                    break;
                }
            }
        }
        return nt0Var;
    }
}

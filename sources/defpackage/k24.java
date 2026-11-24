package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class k24 extends f84 {
    public final xka X;
    public final e34 Y;

    public k24(e34 e34Var) {
        super(100, true);
        this.Y = e34Var;
        this.X = new Object();
        this.O = new zr1(this, (byte) 5);
    }

    @Override
    public final xka B1(int i) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        e34 e34Var = this.Y;
        j24 j24Var = e34Var.k0;
        y59 adapter = e34Var.i0.getAdapter();
        j24 j24Var2 = e34Var.o0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter == j24Var2) {
            int i2 = j24Var2.I;
            if (i > i2) {
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) j24Var2.y.get((i - i2) - 1);
                document = botInlineResult.document;
                if (document != null) {
                    arrayList2 = document.attributes;
                } else {
                    TLRPC.WebDocument webDocument = botInlineResult.content;
                    if (webDocument != null) {
                        arrayList2 = webDocument.attributes;
                    } else {
                        TLRPC.WebDocument webDocument2 = botInlineResult.thumb;
                        if (webDocument2 != null) {
                            arrayList2 = webDocument2.attributes;
                        }
                    }
                }
                arrayList = arrayList2;
                document2 = document;
                return D1(document2, arrayList);
            } else if (i == i2) {
                return null;
            } else {
                document2 = (TLRPC.Document) e34Var.j1.get(i);
                arrayList = document2.attributes;
                return D1(document2, arrayList);
            }
        } else if (!j24Var.y.isEmpty()) {
            TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) j24Var.y.get(i);
            document = botInlineResult2.document;
            if (document != null) {
                arrayList2 = document.attributes;
            } else {
                TLRPC.WebDocument webDocument3 = botInlineResult2.content;
                if (webDocument3 != null) {
                    arrayList2 = webDocument3.attributes;
                } else {
                    TLRPC.WebDocument webDocument4 = botInlineResult2.thumb;
                    if (webDocument4 != null) {
                        arrayList2 = webDocument4.attributes;
                    }
                }
            }
            arrayList = arrayList2;
            document2 = document;
            return D1(document2, arrayList);
        } else {
            arrayList = null;
            return D1(document2, arrayList);
        }
    }

    public final xka D1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize w;
        int i;
        int i2;
        xka xkaVar = this.X;
        xkaVar.b = 100.0f;
        xkaVar.a = 100.0f;
        if (document != null && (w = bc4.w(document.thumbs, 90, false, null, false)) != null && (i = w.w) != 0 && (i2 = w.h) != 0) {
            xkaVar.a = i;
            xkaVar.b = i2;
        }
        if (list != null) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i3);
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
        e34 e34Var = this.Y;
        y59 adapter = e34Var.i0.getAdapter();
        j24 j24Var = e34Var.k0;
        if (adapter == j24Var && j24Var.y.isEmpty()) {
            return 0;
        }
        return A() - 1;
    }
}

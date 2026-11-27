package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class u14 extends q74 {
    public final qma X;
    public final o24 Y;

    public u14(o24 o24Var) {
        super(100, true);
        this.Y = o24Var;
        this.X = new Object();
        this.O = new ar1(this, (byte) 5);
    }

    @Override
    public final qma B1(int i) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        o24 o24Var = this.Y;
        t14 t14Var = o24Var.k0;
        j79 adapter = o24Var.i0.getAdapter();
        t14 t14Var2 = o24Var.o0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter == t14Var2) {
            int i2 = t14Var2.I;
            if (i > i2) {
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) t14Var2.y.get((i - i2) - 1);
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
                document2 = (TLRPC.Document) o24Var.j1.get(i);
                arrayList = document2.attributes;
                return D1(document2, arrayList);
            }
        } else if (!t14Var.y.isEmpty()) {
            TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) t14Var.y.get(i);
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

    public final qma D1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize w;
        int i;
        int i2;
        qma qmaVar = this.X;
        qmaVar.b = 100.0f;
        qmaVar.a = 100.0f;
        if (document != null && (w = xb4.w(document.thumbs, 90, false, null, false)) != null && (i = w.w) != 0 && (i2 = w.h) != 0) {
            qmaVar.a = i;
            qmaVar.b = i2;
        }
        if (list != null) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i3);
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
        o24 o24Var = this.Y;
        j79 adapter = o24Var.i0.getAdapter();
        t14 t14Var = o24Var.k0;
        if (adapter == t14Var && t14Var.y.isEmpty()) {
            return 0;
        }
        return A() - 1;
    }
}

package defpackage;

import org.telegram.tgnet.TLRPC;
public final class u17 extends q74 {
    public final qma X;
    public final b27 Y;

    public u17(b27 b27Var) {
        super(100, false);
        this.Y = b27Var;
        this.X = new Object();
    }

    @Override
    public final qma B1(int i) {
        b27 b27Var;
        TLRPC.PhotoSize w;
        float f;
        r17 r17Var = this.Y.f;
        qma qmaVar = this.X;
        int i2 = 0;
        qmaVar.c = false;
        if (i == 0) {
            qmaVar.a = this.m;
            qmaVar.b = b27Var.e.h;
            qmaVar.c = true;
            return qmaVar;
        }
        int i3 = i - 1;
        if (r17Var.I() == null && r17Var.V == null) {
            i = i3;
        }
        qmaVar.a = 0.0f;
        qmaVar.b = 0.0f;
        Object J = r17Var.J(i);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize w2 = xb4.w(document.thumbs, 90, false, null, false);
                float f2 = 100.0f;
                if (w2 != null) {
                    f = w2.w;
                } else {
                    f = 100.0f;
                }
                qmaVar.a = f;
                if (w2 != null) {
                    f2 = w2.h;
                }
                qmaVar.b = f2;
                while (i2 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i2);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i2++;
                    } else {
                        qmaVar.a = documentAttribute.w;
                        qmaVar.b = documentAttribute.h;
                        return qmaVar;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i2 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i2);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i2++;
                    } else {
                        qmaVar.a = documentAttribute2.w;
                        qmaVar.b = documentAttribute2.h;
                        return qmaVar;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i2 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i2);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i2++;
                    } else {
                        qmaVar.a = documentAttribute3.w;
                        qmaVar.b = documentAttribute3.h;
                        return qmaVar;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (w = xb4.w(photo.sizes, hl.Y0(false), false, null, false)) != null) {
                    qmaVar.a = w.w;
                    qmaVar.b = w.h;
                }
            }
        }
        return qmaVar;
    }

    @Override
    public final int z() {
        r17 r17Var = this.Y.f;
        if (r17Var.I() == null && r17Var.V == null) {
            return A();
        }
        return A() - 1;
    }
}

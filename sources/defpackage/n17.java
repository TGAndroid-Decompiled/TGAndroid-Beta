package defpackage;

import org.telegram.tgnet.TLRPC;
public final class n17 extends f84 {
    public final xka X;
    public final u17 Y;

    public n17(u17 u17Var) {
        super(100, false);
        this.Y = u17Var;
        this.X = new Object();
    }

    @Override
    public final xka B1(int i) {
        u17 u17Var;
        TLRPC.PhotoSize w;
        float f;
        k17 k17Var = this.Y.f;
        xka xkaVar = this.X;
        int i2 = 0;
        xkaVar.c = false;
        if (i == 0) {
            xkaVar.a = this.m;
            xkaVar.b = u17Var.e.h;
            xkaVar.c = true;
            return xkaVar;
        }
        int i3 = i - 1;
        if (k17Var.I() == null && k17Var.V == null) {
            i = i3;
        }
        xkaVar.a = 0.0f;
        xkaVar.b = 0.0f;
        Object J = k17Var.J(i);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize w2 = bc4.w(document.thumbs, 90, false, null, false);
                float f2 = 100.0f;
                if (w2 != null) {
                    f = w2.w;
                } else {
                    f = 100.0f;
                }
                xkaVar.a = f;
                if (w2 != null) {
                    f2 = w2.h;
                }
                xkaVar.b = f2;
                while (i2 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i2);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i2++;
                    } else {
                        xkaVar.a = documentAttribute.w;
                        xkaVar.b = documentAttribute.h;
                        return xkaVar;
                    }
                }
            } else if (botInlineResult.content != null) {
                while (i2 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i2);
                    if (!(documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i2++;
                    } else {
                        xkaVar.a = documentAttribute2.w;
                        xkaVar.b = documentAttribute2.h;
                        return xkaVar;
                    }
                }
            } else if (botInlineResult.thumb != null) {
                while (i2 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i2);
                    if (!(documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) && !(documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        i2++;
                    } else {
                        xkaVar.a = documentAttribute3.w;
                        xkaVar.b = documentAttribute3.h;
                        return xkaVar;
                    }
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (w = bc4.w(photo.sizes, gm.Y0(false), false, null, false)) != null) {
                    xkaVar.a = w.w;
                    xkaVar.b = w.h;
                }
            }
        }
        return xkaVar;
    }

    @Override
    public final int z() {
        k17 k17Var = this.Y.f;
        if (k17Var.I() == null && k17Var.V == null) {
            return A();
        }
        return A() - 1;
    }
}

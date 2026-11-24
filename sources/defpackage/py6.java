package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class py6 implements RequestDelegate {
    public final byte a = 1;
    public final boolean b;
    public final boolean c;
    public final Object d;
    public final Object e;
    public final Object f;

    public py6(xy6 xy6Var, boolean z, oy6 oy6Var, String str, boolean z2) {
        this.d = xy6Var;
        this.b = z;
        this.e = oy6Var;
        this.f = str;
        this.c = z2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                xy6 xy6Var = (xy6) obj3;
                xy6Var.getClass();
                gl.d3(new zo6(xy6Var, this.b, (oy6) obj2, (String) obj, tL_error, tLObject, this.c));
                return;
            default:
                vqa vqaVar = (vqa) obj3;
                vqaVar.getClass();
                gl.d3(new zo6(vqaVar, tLObject, this.b, (TLRPC.Document) obj2, this.c, tL_error, (TL_stars.saveStarGift) obj));
                return;
        }
    }

    public py6(vqa vqaVar, boolean z, TLRPC.Document document, boolean z2, TL_stars.saveStarGift savestargift) {
        this.d = vqaVar;
        this.b = z;
        this.e = document;
        this.c = z2;
        this.f = savestargift;
    }
}

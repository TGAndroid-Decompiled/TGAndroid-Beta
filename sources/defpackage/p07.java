package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class p07 implements RequestDelegate {
    public final byte a = 1;
    public final boolean b;
    public final boolean c;
    public final Object d;
    public final Object e;
    public final Object f;

    public p07(x07 x07Var, boolean z, o07 o07Var, String str, boolean z2) {
        this.d = x07Var;
        this.b = z;
        this.e = o07Var;
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
                x07 x07Var = (x07) obj3;
                x07Var.getClass();
                gm.c3(new zq6(x07Var, this.b, (o07) obj2, (String) obj, tL_error, tLObject, this.c));
                return;
            default:
                wsa wsaVar = (wsa) obj3;
                wsaVar.getClass();
                gm.c3(new zq6(wsaVar, tLObject, this.b, (TLRPC.Document) obj2, this.c, tL_error, (TL_stars.saveStarGift) obj));
                return;
        }
    }

    public p07(wsa wsaVar, boolean z, TLRPC.Document document, boolean z2, TL_stars.saveStarGift savestargift) {
        this.d = wsaVar;
        this.b = z;
        this.e = document;
        this.c = z2;
        this.f = savestargift;
    }
}

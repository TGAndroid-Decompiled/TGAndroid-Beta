package defpackage;

import org.telegram.tgnet.tl.TL_stars;
public final class g38 implements icc {
    public final byte a;
    public final TL_stars.TL_starGiftUnique b;
    public final long c;
    public final fn7 d;
    public final Object e;
    public final Object f;

    public g38(fn7 fn7Var, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, Object obj2, byte b) {
        this.a = b;
        this.d = fn7Var;
        this.e = obj;
        this.b = tL_starGiftUnique;
        this.c = j;
        this.f = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z;
        byte b = this.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        fn7 fn7Var = this.d;
        switch (b) {
            case 0:
                ((h48) fn7Var).H0((boolean[]) obj4, this.b, this.c, (d38) obj3, (zta) obj, (l01) obj2);
                return;
            default:
                wua wuaVar = (wua) fn7Var;
                hw4 hw4Var = (hw4) obj3;
                String str = (String) obj2;
                ((l01) obj4).b();
                if (((Boolean) obj).booleanValue()) {
                    ita itaVar = wuaVar.M2;
                    if (itaVar != null) {
                        if (hw4Var != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        itaVar.b(this.b, this.c, z);
                    }
                    if (hw4Var != null) {
                        hl.c3(new aw4(hw4Var, (byte) 3));
                        wuaVar.O0 = true;
                    }
                    wuaVar.dismiss();
                    return;
                }
                return;
        }
    }
}

package defpackage;

import org.telegram.tgnet.tl.TL_stars;
public final class a08 implements i8c {
    public final byte a;
    public final TL_stars.TL_starGiftUnique b;
    public final long c;
    public final gk7 d;
    public final Object e;
    public final Object f;

    public a08(gk7 gk7Var, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, Object obj2, byte b) {
        this.a = b;
        this.d = gk7Var;
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
        gk7 gk7Var = this.d;
        switch (b) {
            case 0:
                ((a18) gk7Var).G0((boolean[]) obj4, this.b, this.c, (xz7) obj3, (ypa) obj, (c01) obj2);
                return;
            default:
                vqa vqaVar = (vqa) gk7Var;
                du4 du4Var = (du4) obj3;
                String str = (String) obj2;
                ((c01) obj4).b();
                if (((Boolean) obj).booleanValue()) {
                    ipa ipaVar = vqaVar.M2;
                    if (ipaVar != null) {
                        if (du4Var != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        ipaVar.a(this.b, this.c, z);
                    }
                    if (du4Var != null) {
                        gl.d3(new wt4(du4Var, (byte) 3));
                        vqaVar.O0 = true;
                    }
                    vqaVar.dismiss();
                    return;
                }
                return;
        }
    }
}

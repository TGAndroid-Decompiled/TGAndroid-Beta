package hi;
public final class d9 implements r1.c {
    public final int f14444a;
    public final float f14445b;
    public final Object f14446c;

    public d9(Object obj, float f10, int i7) {
        this.f14444a = i7;
        this.f14446c = obj;
        this.f14445b = f10;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f14444a) {
            case 0:
                ta taVar = (ta) this.f14446c;
                if (!z10) {
                    taVar.N0.setTranslationY(this.f14445b);
                    taVar.N0.L = false;
                    taVar.f15472p2 = null;
                    taVar.f15475q2 = null;
                    return;
                }
                return;
            default:
                ki.s3 s3Var = (ki.s3) this.f14446c;
                s3Var.f18902w = null;
                float f12 = this.f14445b;
                if (!z10) {
                    s3Var.f18898f = f12;
                    s3Var.c();
                    return;
                }
                s3Var.h = f12;
                return;
        }
    }
}

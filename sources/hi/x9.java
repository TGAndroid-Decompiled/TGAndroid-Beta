package hi;
public final class x9 implements r1.c {
    public final int f15789a;
    public final float f15790b;
    public final Object f15791c;

    public x9(Object obj, float f10, int i7) {
        this.f15789a = i7;
        this.f15791c = obj;
        this.f15790b = f10;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f15789a) {
            case 0:
                nb nbVar = (nb) this.f15791c;
                if (!z10) {
                    nbVar.N0.setTranslationY(this.f15790b);
                    nbVar.N0.L = false;
                    nbVar.f15103p2 = null;
                    nbVar.f15106q2 = null;
                    return;
                }
                return;
            default:
                ki.s3 s3Var = (ki.s3) this.f15791c;
                s3Var.f18998w = null;
                float f12 = this.f15790b;
                if (!z10) {
                    s3Var.f18994f = f12;
                    s3Var.c();
                    return;
                }
                s3Var.h = f12;
                return;
        }
    }
}

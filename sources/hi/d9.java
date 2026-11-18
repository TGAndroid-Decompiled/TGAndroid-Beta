package hi;
public final class d9 implements r1.c {
    public final int f14441a;
    public final float f14442b;
    public final Object f14443c;

    public d9(Object obj, float f10, int i7) {
        this.f14441a = i7;
        this.f14443c = obj;
        this.f14442b = f10;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f14441a) {
            case 0:
                ta taVar = (ta) this.f14443c;
                if (!z10) {
                    taVar.N0.setTranslationY(this.f14442b);
                    taVar.N0.L = false;
                    taVar.f15469p2 = null;
                    taVar.f15472q2 = null;
                    return;
                }
                return;
            default:
                ki.s3 s3Var = (ki.s3) this.f14443c;
                s3Var.f18899w = null;
                float f12 = this.f14442b;
                if (!z10) {
                    s3Var.f18895f = f12;
                    s3Var.c();
                    return;
                }
                s3Var.h = f12;
                return;
        }
    }
}

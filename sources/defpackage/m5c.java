package defpackage;
public final class m5c implements vma {
    public int a;
    public boolean b;
    public final n5c c;

    public m5c(n5c n5cVar) {
        this.c = n5cVar;
    }

    @Override
    public final void L(int i, boolean z) {
        if (this.a != i || this.b != z) {
            this.a = i;
            this.b = z;
            if (i > hl.L(20.0f)) {
                n5c n5cVar = this.c;
                if (!n5cVar.h0) {
                    n5cVar.o0.r0 = false;
                    n5cVar.h0 = true;
                }
            }
        }
    }
}

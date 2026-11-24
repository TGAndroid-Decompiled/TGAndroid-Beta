package defpackage;
public final class w46 {
    public final t46 a;
    public final a9c b = new a9c(0.0f);
    public final a9c c = new a9c(0.0f);
    public final a9c d = new a9c(0.0f);
    public final a9c e = new a9c(0.0f);
    public final a9c f = new a9c(0.0f);
    public final a9c g = new a9c(0.0f);

    public w46(x46 x46Var, t46 t46Var) {
        this.a = t46Var;
    }

    public final void a(int i, boolean z) {
        float f = 0.0f;
        a9c a9cVar = this.c;
        a9c a9cVar2 = this.b;
        if (z) {
            a9cVar2.c = i;
            if (i > 0) {
                f = 1.0f;
            }
            a9cVar.c = f;
            return;
        }
        a9cVar2.d(i);
        if (i > 0) {
            f = 1.0f;
        }
        a9cVar.d(f);
    }
}

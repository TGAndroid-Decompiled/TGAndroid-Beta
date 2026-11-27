package defpackage;
public final class tja extends yfb implements ks4 {
    public boolean a;
    public nm4 b;
    public Throwable c;
    public final yja d;

    public tja(yja yjaVar, zw2 zw2Var) {
        super(3, zw2Var);
        this.d = yjaVar;
    }

    @Override
    public final Object a(Object obj, Object obj2, Object obj3) {
        tja tjaVar = new tja(this.d, (zw2) obj3);
        tjaVar.b = (nm4) obj;
        tjaVar.c = (Throwable) obj2;
        return tjaVar.invokeSuspend(f9c.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (z) {
            if (z) {
                ixe.b(obj);
            } else {
                grb.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            ixe.b(obj);
            nm4 nm4Var = this.b;
            Throwable th = this.c;
            s9a a = this.d.b.a(null);
            o9a o9aVar = new o9a(a, null, null);
            StringBuilder sb = new StringBuilder("Init session datastore failed with exception message: ");
            sb.append(th.getMessage());
            sb.append(". Emit fallback session ");
            bs2.x(sb, a.a, "FirebaseSessions");
            this.b = null;
            this.a = true;
            Object c = nm4Var.c(o9aVar, this);
            vx2 vx2Var = vx2.a;
            if (c == vx2Var) {
                return vx2Var;
            }
        }
        return f9c.a;
    }
}

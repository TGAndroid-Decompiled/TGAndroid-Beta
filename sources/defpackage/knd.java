package defpackage;
public abstract class knd implements Cloneable {
    public final mnd a;
    public mnd b;
    public boolean c = false;

    public knd(mnd mndVar) {
        this.a = mndVar;
        this.b = (mnd) mndVar.a(4);
    }

    public final void a(mnd mndVar) {
        b();
        mnd mndVar2 = this.b;
        jyd jydVar = jyd.c;
        jydVar.getClass();
        jydVar.a(mndVar2.getClass()).d(mndVar2, mndVar);
    }

    public final void b() {
        if (this.c) {
            mnd mndVar = (mnd) this.b.a(4);
            mnd mndVar2 = this.b;
            jyd jydVar = jyd.c;
            jydVar.getClass();
            jydVar.a(mndVar.getClass()).d(mndVar, mndVar2);
            this.b = mndVar;
            this.c = false;
        }
    }

    public final mnd c() {
        boolean z = this.c;
        mnd mndVar = this.b;
        if (z) {
            return mndVar;
        }
        jyd jydVar = jyd.c;
        jydVar.getClass();
        jydVar.a(mndVar.getClass()).b(mndVar);
        this.c = true;
        return this.b;
    }

    public final Object clone() {
        knd kndVar = (knd) this.a.a(5);
        kndVar.a(c());
        return kndVar;
    }
}

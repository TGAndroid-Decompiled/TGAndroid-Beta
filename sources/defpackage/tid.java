package defpackage;
public abstract class tid implements Cloneable {
    public final vid a;
    public vid b;
    public boolean c = false;

    public tid(vid vidVar) {
        this.a = vidVar;
        this.b = (vid) vidVar.a(4);
    }

    public final void a(vid vidVar) {
        b();
        vid vidVar2 = this.b;
        ttd ttdVar = ttd.c;
        ttdVar.getClass();
        ttdVar.a(vidVar2.getClass()).d(vidVar2, vidVar);
    }

    public final void b() {
        if (this.c) {
            vid vidVar = (vid) this.b.a(4);
            vid vidVar2 = this.b;
            ttd ttdVar = ttd.c;
            ttdVar.getClass();
            ttdVar.a(vidVar.getClass()).d(vidVar, vidVar2);
            this.b = vidVar;
            this.c = false;
        }
    }

    public final vid c() {
        boolean z = this.c;
        vid vidVar = this.b;
        if (z) {
            return vidVar;
        }
        ttd ttdVar = ttd.c;
        ttdVar.getClass();
        ttdVar.a(vidVar.getClass()).b(vidVar);
        this.c = true;
        return this.b;
    }

    public final Object clone() {
        tid tidVar = (tid) this.a.a(5);
        tidVar.a(c());
        return tidVar;
    }
}

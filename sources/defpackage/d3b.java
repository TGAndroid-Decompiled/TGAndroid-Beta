package defpackage;
public final class d3b implements Runnable {
    public final e3b a;

    public d3b(e3b e3bVar) {
        this.a = e3bVar;
    }

    public final void a() {
        e3b e3bVar = this.a;
        if (e3bVar.R) {
            return;
        }
        e3bVar.R = true;
        e3bVar.J.clear();
        e3bVar.K.clear();
        e3bVar.G.clear();
        e3bVar.F.clear();
        e3bVar.H.clear();
        e3bVar.I.clear();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d3b.run():void");
    }
}

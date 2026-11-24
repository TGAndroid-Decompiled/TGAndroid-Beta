package defpackage;

import java.util.ArrayList;
public final class hw3 extends afe {
    public final sj a;

    public hw3(sj sjVar) {
        this.a = sjVar;
    }

    @Override
    public final void a(Throwable th) {
        ((lw3) this.a.b).d(th);
    }

    @Override
    public final void b(wtc wtcVar) {
        sj sjVar = this.a;
        sjVar.c = wtcVar;
        sjVar.a = new lv6((wtc) sjVar.c, new vi2((byte) 19), ((lw3) sjVar.b).h);
        lw3 lw3Var = (lw3) sjVar.b;
        ArrayList arrayList = new ArrayList();
        lw3Var.a.writeLock().lock();
        try {
            lw3Var.c = (byte) 1;
            arrayList.addAll(lw3Var.b);
            lw3Var.b.clear();
            lw3Var.a.writeLock().unlock();
            lw3Var.d.post(new jw3(arrayList, lw3Var.c, null));
        } catch (Throwable th) {
            lw3Var.a.writeLock().unlock();
            throw th;
        }
    }
}

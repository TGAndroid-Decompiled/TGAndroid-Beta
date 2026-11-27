package defpackage;

import java.lang.ref.WeakReference;
public final class y5d extends q5d {
    public final WeakReference c;

    public y5d(a6d a6dVar) {
        super((byte) 1);
        this.c = new WeakReference(a6dVar);
    }

    @Override
    public final void U(t7d t7dVar) {
        a6d a6dVar = (a6d) this.c.get();
        if (a6dVar == null) {
            return;
        }
        w5d w5dVar = new w5d(this, a6dVar, a6dVar, t7dVar);
        b6d b6dVar = a6dVar.a.e;
        b6dVar.sendMessage(b6dVar.obtainMessage(1, w5dVar));
    }
}

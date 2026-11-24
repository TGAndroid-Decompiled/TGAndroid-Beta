package defpackage;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class id0 implements v66, nf3 {
    public final ImageReceiver a;
    public final pc0 b;
    public long c;
    public boolean d;
    public final jd0 e;

    public id0(jd0 jd0Var, View view) {
        this.e = jd0Var;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.a = imageReceiver;
        imageReceiver.q0(jd0Var.e / 2);
        pc0 pc0Var = new pc0((ylb) null);
        this.b = pc0Var;
        pc0Var.s(gm.L(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.a.K();
        }
        this.c = 0L;
    }

    @Override
    public final int b(boolean z) {
        if (z) {
            return 0;
        }
        return -this.e.f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof id0) || this.c != ((id0) obj).c) {
            return false;
        }
        return true;
    }

    @Override
    public final int getHeight() {
        return this.e.e;
    }

    @Override
    public final int getWidth() {
        return this.e.e;
    }
}

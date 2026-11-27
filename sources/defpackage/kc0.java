package defpackage;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class kc0 implements z66, ve3 {
    public final ImageReceiver a;
    public final rb0 b;
    public long c;
    public boolean d;
    public final lc0 e;

    public kc0(lc0 lc0Var, View view) {
        this.e = lc0Var;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.a = imageReceiver;
        imageReceiver.q0(lc0Var.e / 2);
        rb0 rb0Var = new rb0((vnb) null);
        this.b = rb0Var;
        rb0Var.s(hl.L(22.0f));
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
        if (!(obj instanceof kc0) || this.c != ((kc0) obj).c) {
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

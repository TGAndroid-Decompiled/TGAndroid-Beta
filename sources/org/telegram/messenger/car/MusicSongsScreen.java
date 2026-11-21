package org.telegram.messenger.car;

import androidx.car.app.m;
import androidx.lifecycle.e;
import androidx.lifecycle.t;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
public class MusicSongsScreen extends m implements e, fs {
    @Override
    public final void a(t tVar) {
        ks.e().c(this, ks.f25152h2);
        ks.e().c(this, ks.f25146g2);
        ks.e().c(this, ks.f25142f4);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.f25142f4) {
            throw null;
        }
        throw null;
    }

    @Override
    public final void e(t tVar) {
        ks.e().n(this, ks.f25152h2);
        ks.e().n(this, ks.f25146g2);
        ks.e().n(this, ks.f25142f4);
    }

    @Override
    public final void b(t tVar) {
    }

    @Override
    public final void f(t tVar) {
    }

    @Override
    public final void g(t tVar) {
    }

    @Override
    public final void i(t tVar) {
    }
}

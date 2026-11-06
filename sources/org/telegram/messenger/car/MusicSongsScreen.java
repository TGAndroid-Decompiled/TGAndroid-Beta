package org.telegram.messenger.car;

import androidx.car.app.m;
import androidx.lifecycle.e;
import androidx.lifecycle.t;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
public class MusicSongsScreen extends m implements e, ls {
    @Override
    public final void a(t tVar) {
        qs.e().c(this, qs.f25001h2);
        qs.e().c(this, qs.f24995g2);
        qs.e().c(this, qs.f24974c4);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f24974c4) {
            throw null;
        }
        throw null;
    }

    @Override
    public final void e(t tVar) {
        qs.e().n(this, qs.f25001h2);
        qs.e().n(this, qs.f24995g2);
        qs.e().n(this, qs.f24974c4);
    }

    @Override
    public final void b(t tVar) {
    }

    @Override
    public final void f(t tVar) {
    }

    @Override
    public final void h(t tVar) {
    }

    @Override
    public final void i(t tVar) {
    }
}

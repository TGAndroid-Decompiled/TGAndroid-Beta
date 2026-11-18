package org.telegram.messenger.car;

import androidx.car.app.m;
import androidx.lifecycle.e;
import androidx.lifecycle.t;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
public class HomeScreen extends m implements e, fs {
    @Override
    public final void a(t tVar) {
        ks.e().c(this, ks.f25116f4);
        ks.e().c(this, ks.I4);
        ks.e().c(this, ks.f25110e4);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != ks.f25110e4) {
            if ((i7 != ks.f25116f4 && i7 != ks.I4) || !"tab_notifications".equals(null)) {
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override
    public final void e(t tVar) {
        ks.e().n(this, ks.f25116f4);
        ks.e().n(this, ks.I4);
        ks.e().n(this, ks.f25110e4);
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

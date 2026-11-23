package org.telegram.messenger.car;

import androidx.car.app.m;
import androidx.lifecycle.e;
import androidx.lifecycle.t;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
public class HomeScreen extends m implements e, gs {
    @Override
    public final void a(t tVar) {
        ls.e().c(this, ls.f25314g4);
        ls.e().c(this, ls.J4);
        ls.e().c(this, ls.f25308f4);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != ls.f25308f4) {
            if ((i7 != ls.f25314g4 && i7 != ls.J4) || !"tab_notifications".equals(null)) {
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override
    public final void e(t tVar) {
        ls.e().n(this, ls.f25314g4);
        ls.e().n(this, ls.J4);
        ls.e().n(this, ls.f25308f4);
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

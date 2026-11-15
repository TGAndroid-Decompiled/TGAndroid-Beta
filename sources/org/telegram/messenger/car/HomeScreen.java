package org.telegram.messenger.car;

import androidx.car.app.m;
import androidx.lifecycle.e;
import androidx.lifecycle.t;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
public class HomeScreen extends m implements e, is {
    @Override
    public final void a(t tVar) {
        ns.e().c(this, ns.f25484d4);
        ns.e().c(this, ns.G4);
        ns.e().c(this, ns.f25479c4);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != ns.f25479c4) {
            if ((i7 != ns.f25484d4 && i7 != ns.G4) || !"tab_notifications".equals(null)) {
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override
    public final void e(t tVar) {
        ns.e().n(this, ns.f25484d4);
        ns.e().n(this, ns.G4);
        ns.e().n(this, ns.f25479c4);
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

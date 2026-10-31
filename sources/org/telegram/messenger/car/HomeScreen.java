package org.telegram.messenger.car;

import androidx.car.app.l;
import androidx.lifecycle.e;
import androidx.lifecycle.t;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
public class HomeScreen extends l implements e, us {
    @Override
    public final void a(t tVar) {
        zs.e().c(this, zs.f19600d4);
        zs.e().c(this, zs.G4);
        zs.e().c(this, zs.f19594c4);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != zs.f19594c4) {
            if ((i10 != zs.f19600d4 && i10 != zs.G4) || !"tab_notifications".equals(null)) {
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override
    public final void e(t tVar) {
        zs.e().n(this, zs.f19600d4);
        zs.e().n(this, zs.G4);
        zs.e().n(this, zs.f19594c4);
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

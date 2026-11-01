package org.telegram.messenger.car;

import androidx.car.app.l;
import androidx.lifecycle.e;
import androidx.lifecycle.t;
import org.telegram.messenger.at;
import org.telegram.messenger.vs;
public class HomeScreen extends l implements e, vs {
    @Override
    public final void a(t tVar) {
        at.e().c(this, at.f14696d4);
        at.e().c(this, at.G4);
        at.e().c(this, at.f14690c4);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != at.f14690c4) {
            if ((i10 != at.f14696d4 && i10 != at.G4) || !"tab_notifications".equals(null)) {
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override
    public final void e(t tVar) {
        at.e().n(this, at.f14696d4);
        at.e().n(this, at.G4);
        at.e().n(this, at.f14690c4);
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

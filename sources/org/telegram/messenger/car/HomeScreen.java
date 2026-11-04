package org.telegram.messenger.car;

import androidx.car.app.m;
import androidx.lifecycle.e;
import androidx.lifecycle.t;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
public class HomeScreen extends m implements e, cs {
    @Override
    public final void a(t tVar) {
        hs.e().c(this, hs.f23217d4);
        hs.e().c(this, hs.G4);
        hs.e().c(this, hs.f23211c4);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 != hs.f23211c4) {
            if ((i3 != hs.f23217d4 && i3 != hs.G4) || !"tab_notifications".equals(null)) {
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override
    public final void e(t tVar) {
        hs.e().n(this, hs.f23217d4);
        hs.e().n(this, hs.G4);
        hs.e().n(this, hs.f23211c4);
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

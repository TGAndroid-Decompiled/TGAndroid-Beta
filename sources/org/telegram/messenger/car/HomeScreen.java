package org.telegram.messenger.car;

import androidx.car.app.m;
import androidx.lifecycle.e;
import androidx.lifecycle.t;
import org.telegram.messenger.NotificationCenter;
public class HomeScreen extends m implements e, NotificationCenter.NotificationCenterDelegate {
    @Override
    public final void a(t tVar) {
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.pushMessagesUpdated);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.notificationsCountUpdated);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.activeAccountChanged);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.activeAccountChanged) {
            if ((i10 != NotificationCenter.pushMessagesUpdated && i10 != NotificationCenter.notificationsCountUpdated) || !"tab_notifications".equals(null)) {
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override
    public final void e(t tVar) {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.pushMessagesUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.notificationsCountUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.activeAccountChanged);
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

package org.telegram.messenger.car;

import androidx.car.app.Screen;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import org.telegram.messenger.NotificationCenter;

public class HomeScreen extends Screen implements DefaultLifecycleObserver, NotificationCenter.NotificationCenterDelegate {
    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.activeAccountChanged) {
            throw null;
        }
        if ((i == NotificationCenter.pushMessagesUpdated || i == NotificationCenter.notificationsCountUpdated) && "tab_notifications".equals(null)) {
            throw null;
        }
    }

    @Override
    public final void onCreate(LifecycleOwner lifecycleOwner) {
    }

    @Override
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
    }

    @Override
    public final void onPause(LifecycleOwner lifecycleOwner) {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.pushMessagesUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.notificationsCountUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.activeAccountChanged);
    }

    @Override
    public final void onResume(LifecycleOwner lifecycleOwner) {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.pushMessagesUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.notificationsCountUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.activeAccountChanged);
    }

    @Override
    public final void onStart(LifecycleOwner lifecycleOwner) {
    }

    @Override
    public final void onStop(LifecycleOwner lifecycleOwner) {
    }
}

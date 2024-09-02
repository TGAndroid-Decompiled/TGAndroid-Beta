package org.telegram.messenger.support.customtabs;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import org.telegram.messenger.support.customtabs.ICustomTabsService;

public abstract class CustomTabsServiceConnection implements ServiceConnection {
    public abstract void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient);

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        onCustomTabsServiceConnected(componentName, new CustomTabsClient(ICustomTabsService.Stub.asInterface(iBinder), componentName) {
        });
    }
}

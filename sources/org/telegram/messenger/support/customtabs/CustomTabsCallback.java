package org.telegram.messenger.support.customtabs;

import android.os.Bundle;

public abstract class CustomTabsCallback {
    public void extraCallback(String str, Bundle bundle) {
    }

    public void onMessageChannelReady(Bundle bundle) {
    }

    public abstract void onNavigationEvent(int i, Bundle bundle);

    public void onPostMessage(String str, Bundle bundle) {
    }
}

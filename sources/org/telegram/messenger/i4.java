package org.telegram.messenger;

import java.util.List;

public final class i4 implements TelegramMediaSession.BrowseChildrenCallback {

    public final Runnable f20550a;

    public i4(Runnable runnable) {
        this.f20550a = runnable;
    }

    @Override
    public void onResult(List list) {
        TelegramMediaSession.lambda$ensureLoaded$2(this.f20550a, list);
    }
}

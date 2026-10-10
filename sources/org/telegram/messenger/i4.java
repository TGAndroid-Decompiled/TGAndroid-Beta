package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.TelegramMediaSession;
public final class i4 implements TelegramMediaSession.BrowseChildrenCallback {
    public final Runnable f18123a;

    public i4(Runnable runnable) {
        this.f18123a = runnable;
    }

    @Override
    public void onResult(List list) {
        TelegramMediaSession.d(this.f18123a, list);
    }
}

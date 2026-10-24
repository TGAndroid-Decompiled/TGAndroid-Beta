package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.TelegramMediaSession;
public final class n4 implements TelegramMediaSession.BrowseChildrenCallback {
    public final Runnable f19079a;

    public n4(Runnable runnable) {
        this.f19079a = runnable;
    }

    @Override
    public void onResult(List list) {
        TelegramMediaSession.d(this.f19079a, list);
    }
}

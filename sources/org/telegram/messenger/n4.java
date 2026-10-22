package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.TelegramMediaSession;
public final class n4 implements TelegramMediaSession.BrowseChildrenCallback {
    public final Runnable f19013a;

    public n4(Runnable runnable) {
        this.f19013a = runnable;
    }

    @Override
    public void onResult(List list) {
        TelegramMediaSession.d(this.f19013a, list);
    }
}

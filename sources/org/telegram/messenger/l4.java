package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.TelegramMediaSession;
public final class l4 implements TelegramMediaSession.BrowseChildrenCallback {
    public final Runnable f18141a;

    public l4(Runnable runnable) {
        this.f18141a = runnable;
    }

    @Override
    public void onResult(List list) {
        TelegramMediaSession.d(this.f18141a, list);
    }
}

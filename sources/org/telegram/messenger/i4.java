package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.TelegramMediaSession;
public final class i4 implements TelegramMediaSession.BrowseChildrenCallback {
    public final Runnable f18160a;

    public i4(Runnable runnable) {
        this.f18160a = runnable;
    }

    @Override
    public void onResult(List list) {
        TelegramMediaSession.d(this.f18160a, list);
    }
}

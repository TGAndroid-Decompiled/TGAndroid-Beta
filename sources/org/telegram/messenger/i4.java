package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.TelegramMediaSession;
public final class i4 implements TelegramMediaSession.BrowseChildrenCallback {
    public final Runnable f18124a;

    public i4(Runnable runnable) {
        this.f18124a = runnable;
    }

    @Override
    public void onResult(List list) {
        TelegramMediaSession.d(this.f18124a, list);
    }
}

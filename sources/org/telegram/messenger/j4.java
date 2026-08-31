package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.TelegramMediaSession;
public final class j4 implements TelegramMediaSession.BrowseChildrenCallback {
    public final Runnable f19025a;

    public j4(Runnable runnable) {
        this.f19025a = runnable;
    }

    @Override
    public void onResult(List list) {
        TelegramMediaSession.b(this.f19025a, list);
    }
}

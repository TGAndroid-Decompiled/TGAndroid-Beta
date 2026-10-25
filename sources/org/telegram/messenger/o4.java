package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.TelegramMediaSession;
public final class o4 implements TelegramMediaSession.BrowseChildrenCallback {
    public final Runnable f20830a;

    public o4(Runnable runnable) {
        this.f20830a = runnable;
    }

    @Override
    public void onResult(List list) {
        TelegramMediaSession.d(this.f20830a, list);
    }
}

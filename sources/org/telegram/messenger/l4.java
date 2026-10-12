package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.TelegramMediaSession;
public final class l4 implements TelegramMediaSession.BrowseChildrenCallback {
    public final Runnable f17746a;

    public l4(Runnable runnable) {
        this.f17746a = runnable;
    }

    @Override
    public void onResult(List list) {
        TelegramMediaSession.d(this.f17746a, list);
    }
}

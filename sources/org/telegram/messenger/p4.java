package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.TelegramMediaSession;
public final class p4 implements TelegramMediaSession.BrowseChildrenCallback {
    public final Runnable f20918a;

    public p4(Runnable runnable) {
        this.f20918a = runnable;
    }

    @Override
    public void onResult(List list) {
        TelegramMediaSession.d(this.f20918a, list);
    }
}

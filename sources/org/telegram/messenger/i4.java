package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.TelegramMediaSession;
public final class i4 implements TelegramMediaSession.BrowseChildrenCallback {
    public final Runnable f20519a;

    public i4(Runnable runnable) {
        this.f20519a = runnable;
    }

    @Override
    public void onResult(List list) {
        TelegramMediaSession.b(this.f20519a, list);
    }
}

package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.TelegramMediaSession;
public final class g4 implements TelegramMediaSession.BrowseChildrenCallback {
    public final Runnable f17779a;

    public g4(Runnable runnable) {
        this.f17779a = runnable;
    }

    @Override
    public void onResult(List list) {
        TelegramMediaSession.b(this.f17779a, list);
    }
}

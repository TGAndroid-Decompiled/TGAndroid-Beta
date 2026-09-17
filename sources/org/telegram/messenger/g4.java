package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.TelegramMediaSession;
public final class g4 implements TelegramMediaSession.BrowseChildrenCallback {
    public final Runnable f17752a;

    public g4(Runnable runnable) {
        this.f17752a = runnable;
    }

    @Override
    public void onResult(List list) {
        TelegramMediaSession.b(this.f17752a, list);
    }
}

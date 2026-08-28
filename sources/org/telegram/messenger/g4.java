package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.TelegramMediaSession;
public final class g4 implements TelegramMediaSession.BrowseChildrenCallback {
    public final Runnable f20355a;

    public g4(Runnable runnable) {
        this.f20355a = runnable;
    }

    @Override
    public void onResult(List list) {
        TelegramMediaSession.b(this.f20355a, list);
    }
}

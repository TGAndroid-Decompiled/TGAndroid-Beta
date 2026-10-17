package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.TelegramMediaSession;
public final class k4 implements TelegramMediaSession.BrowseChildrenCallback {
    public final Runnable f18754a;

    public k4(Runnable runnable) {
        this.f18754a = runnable;
    }

    @Override
    public void onResult(List list) {
        TelegramMediaSession.d(this.f18754a, list);
    }
}

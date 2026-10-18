package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.TelegramMediaSession;
public final class k4 implements TelegramMediaSession.BrowseChildrenCallback {
    public final Runnable f18761a;

    public k4(Runnable runnable) {
        this.f18761a = runnable;
    }

    @Override
    public void onResult(List list) {
        TelegramMediaSession.d(this.f18761a, list);
    }
}

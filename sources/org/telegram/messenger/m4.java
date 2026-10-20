package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.TelegramMediaSession;
public final class m4 implements TelegramMediaSession.BrowseChildrenCallback {
    public final Runnable f18932a;

    public m4(Runnable runnable) {
        this.f18932a = runnable;
    }

    @Override
    public void onResult(List list) {
        TelegramMediaSession.d(this.f18932a, list);
    }
}

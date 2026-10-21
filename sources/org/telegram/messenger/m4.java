package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.TelegramMediaSession;
public final class m4 implements TelegramMediaSession.BrowseChildrenCallback {
    public final Runnable f18928a;

    public m4(Runnable runnable) {
        this.f18928a = runnable;
    }

    @Override
    public void onResult(List list) {
        TelegramMediaSession.d(this.f18928a, list);
    }
}

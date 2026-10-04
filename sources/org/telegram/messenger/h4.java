package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.TelegramMediaSession;
public final class h4 implements TelegramMediaSession.BrowseChildrenCallback {
    public final Runnable f18026a;

    public h4(Runnable runnable) {
        this.f18026a = runnable;
    }

    @Override
    public void onResult(List list) {
        TelegramMediaSession.d(this.f18026a, list);
    }
}

package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.TelegramMediaSession;
public final class h4 implements TelegramMediaSession.BrowseChildrenCallback {
    public final Runnable f17863a;

    public h4(Runnable runnable) {
        this.f17863a = runnable;
    }

    @Override
    public void onResult(List list) {
        TelegramMediaSession.b(this.f17863a, list);
    }
}

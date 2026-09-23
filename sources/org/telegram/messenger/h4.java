package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.TelegramMediaSession;
public final class h4 implements TelegramMediaSession.BrowseChildrenCallback {
    public final Runnable f16261a;

    public h4(Runnable runnable) {
        this.f16261a = runnable;
    }

    @Override
    public void onResult(List list) {
        TelegramMediaSession.d(this.f16261a, list);
    }
}

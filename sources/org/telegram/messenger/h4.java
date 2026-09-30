package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.TelegramMediaSession;
public final class h4 implements TelegramMediaSession.BrowseChildrenCallback {
    public final Runnable f16531a;

    public h4(Runnable runnable) {
        this.f16531a = runnable;
    }

    @Override
    public void onResult(List list) {
        TelegramMediaSession.d(this.f16531a, list);
    }
}

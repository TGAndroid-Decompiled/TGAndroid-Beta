package org.telegram.messenger;

import java.util.List;
import org.telegram.messenger.TelegramMediaSession;
public final class m4 implements TelegramMediaSession.BrowseChildrenCallback {
    public final Runnable f15753a;

    public m4(Runnable runnable) {
        this.f15753a = runnable;
    }

    @Override
    public void onResult(List list) {
        TelegramMediaSession.b(this.f15753a, list);
    }
}

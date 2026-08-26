package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.Theme;

public final class MessagesController$$ExternalSyntheticLambda180 implements Runnable {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final TLObject f$1;
    public final Theme.ThemeInfo f$2;
    public final Theme.ThemeAccent f$3;

    public MessagesController$$ExternalSyntheticLambda180(MessagesController messagesController, TLObject tLObject, Theme.ThemeInfo themeInfo, Theme.ThemeAccent themeAccent, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
        this.f$1 = tLObject;
        this.f$2 = themeInfo;
        this.f$3 = themeAccent;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$didReceivedNotification$46(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$didReceivedNotification$48(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}

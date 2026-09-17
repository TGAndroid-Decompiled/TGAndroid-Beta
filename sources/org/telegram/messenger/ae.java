package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ae implements Runnable {
    public final int f17199a;
    public final NotificationCenter.NotificationCenterDelegate f17200b;
    public final long f17201c;
    public final int d;
    public final int f17202e;
    public final boolean f17203f;

    public ae(int i10, int i11, int i12, long j3, MessagesController messagesController, boolean z10) {
        this.f17199a = i12;
        this.f17200b = messagesController;
        this.f17201c = j3;
        this.d = i10;
        this.f17202e = i11;
        this.f17203f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f17199a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f17200b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$242(this.f17201c, this.d, this.f17202e, this.f17203f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f17201c, this.d, this.f17202e, this.f17203f);
                return;
            default:
                int i11 = ChatActivityEnterView.f23689m5;
                ((ChatActivityEnterView) notificationCenterDelegate).T0(this.d, this.f17203f, this.f17202e, false, this.f17201c);
                return;
        }
    }

    public ae(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j3) {
        this.f17199a = 2;
        this.f17200b = chatActivityEnterView;
        this.f17203f = z10;
        this.d = i10;
        this.f17202e = i11;
        this.f17201c = j3;
    }
}

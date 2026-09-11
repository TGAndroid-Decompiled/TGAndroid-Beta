package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ae implements Runnable {
    public final int f17172a;
    public final NotificationCenter.NotificationCenterDelegate f17173b;
    public final long f17174c;
    public final int d;
    public final int f17175e;
    public final boolean f17176f;

    public ae(int i10, int i11, int i12, long j3, MessagesController messagesController, boolean z10) {
        this.f17172a = i12;
        this.f17173b = messagesController;
        this.f17174c = j3;
        this.d = i10;
        this.f17175e = i11;
        this.f17176f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f17172a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f17173b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$242(this.f17174c, this.d, this.f17175e, this.f17176f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f17174c, this.d, this.f17175e, this.f17176f);
                return;
            default:
                int i11 = ChatActivityEnterView.f23661m5;
                ((ChatActivityEnterView) notificationCenterDelegate).T0(this.d, this.f17176f, this.f17175e, false, this.f17174c);
                return;
        }
    }

    public ae(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j3) {
        this.f17172a = 2;
        this.f17173b = chatActivityEnterView;
        this.f17176f = z10;
        this.d = i10;
        this.f17175e = i11;
        this.f17174c = j3;
    }
}

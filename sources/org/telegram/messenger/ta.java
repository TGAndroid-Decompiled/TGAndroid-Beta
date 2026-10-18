package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ta implements Runnable {
    public final int f19568a;
    public final NotificationCenter.NotificationCenterDelegate f19569b;
    public final long f19570c;
    public final int d;
    public final int e;
    public final boolean f19571f;

    public ta(int i10, int i11, int i12, long j10, MessagesController messagesController, boolean z10) {
        this.f19568a = i12;
        this.f19569b = messagesController;
        this.f19570c = j10;
        this.d = i10;
        this.e = i11;
        this.f19571f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f19568a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f19569b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$240(this.f19570c, this.d, this.e, this.f19571f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f19570c, this.d, this.e, this.f19571f);
                return;
            default:
                int i11 = ChatActivityEnterView.f23911n5;
                ((ChatActivityEnterView) notificationCenterDelegate).R0(this.d, this.f19571f, this.e, false, this.f19570c);
                return;
        }
    }

    public ta(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j10) {
        this.f19568a = 2;
        this.f19569b = chatActivityEnterView;
        this.f19571f = z10;
        this.d = i10;
        this.e = i11;
        this.f19570c = j10;
    }
}

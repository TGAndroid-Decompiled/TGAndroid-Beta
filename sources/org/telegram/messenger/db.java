package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class db implements Runnable {
    public final int f19898a;
    public final NotificationCenter.NotificationCenterDelegate f19899b;
    public final long f19900c;
    public final int d;
    public final int e;
    public final boolean f19901f;

    public db(int i10, int i11, int i12, long j10, MessagesController messagesController, boolean z10) {
        this.f19898a = i12;
        this.f19899b = messagesController;
        this.f19900c = j10;
        this.d = i10;
        this.e = i11;
        this.f19901f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f19898a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f19899b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$240(this.f19900c, this.d, this.e, this.f19901f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f19900c, this.d, this.e, this.f19901f);
                return;
            default:
                int i11 = ChatActivityEnterView.f25845r5;
                ((ChatActivityEnterView) notificationCenterDelegate).Q0(this.d, this.f19901f, this.e, false, this.f19900c);
                return;
        }
    }

    public db(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j10) {
        this.f19898a = 2;
        this.f19899b = chatActivityEnterView;
        this.f19901f = z10;
        this.d = i10;
        this.e = i11;
        this.f19900c = j10;
    }
}

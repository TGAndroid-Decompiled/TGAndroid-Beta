package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class va implements Runnable {
    public final int f19734a;
    public final NotificationCenter.NotificationCenterDelegate f19735b;
    public final long f19736c;
    public final int d;
    public final int e;
    public final boolean f19737f;

    public va(int i10, int i11, int i12, long j10, MessagesController messagesController, boolean z10) {
        this.f19734a = i12;
        this.f19735b = messagesController;
        this.f19736c = j10;
        this.d = i10;
        this.e = i11;
        this.f19737f = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f19734a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f19735b;
        switch (i10) {
            case 0:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$240(this.f19736c, this.d, this.e, this.f19737f);
                return;
            case 1:
                ((MessagesController) notificationCenterDelegate).lambda$markDialogAsRead$241(this.f19736c, this.d, this.e, this.f19737f);
                return;
            default:
                int i11 = ChatActivityEnterView.f23908n5;
                ((ChatActivityEnterView) notificationCenterDelegate).R0(this.d, this.f19737f, this.e, false, this.f19736c);
                return;
        }
    }

    public va(ChatActivityEnterView chatActivityEnterView, boolean z10, int i10, int i11, long j10) {
        this.f19734a = 2;
        this.f19735b = chatActivityEnterView;
        this.f19737f = z10;
        this.d = i10;
        this.e = i11;
        this.f19736c = j10;
    }
}

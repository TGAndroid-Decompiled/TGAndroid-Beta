package org.telegram.messenger;

import org.telegram.ui.Components.ChatActivityEnterView;

public final class MessagesController$$ExternalSyntheticLambda525 implements Runnable {
    public final int $r8$classId;
    public final NotificationCenter.NotificationCenterDelegate f$0;
    public final long f$1;
    public final int f$2;
    public final int f$3;
    public final boolean f$4;

    public MessagesController$$ExternalSyntheticLambda525(int i, int i2, int i3, long j, MessagesController messagesController, boolean z) {
        this.$r8$classId = i3;
        this.f$0 = messagesController;
        this.f$1 = j;
        this.f$2 = i;
        this.f$3 = i2;
        this.f$4 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((MessagesController) this.f$0).lambda$markDialogAsRead$242(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
            case 1:
                ((MessagesController) this.f$0).lambda$markDialogAsRead$241(this.f$1, this.f$2, this.f$3, this.f$4);
                break;
            default:
                ((ChatActivityEnterView) this.f$0).sendMessageInternal(this.f$2, this.f$4, this.f$3, false, this.f$1);
                break;
        }
    }

    public MessagesController$$ExternalSyntheticLambda525(ChatActivityEnterView chatActivityEnterView, boolean z, int i, int i2, long j) {
        this.$r8$classId = 2;
        this.f$0 = chatActivityEnterView;
        this.f$4 = z;
        this.f$2 = i;
        this.f$3 = i2;
        this.f$1 = j;
    }
}

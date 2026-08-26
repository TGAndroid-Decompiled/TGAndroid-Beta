package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

public final class MessagesStorage$$ExternalSyntheticLambda169 implements Runnable {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final long f$1;
    public final Object f$2;
    public final boolean f$3;
    public final int f$4;
    public final int f$5;

    public MessagesStorage$$ExternalSyntheticLambda169(MessagesStorage messagesStorage, long j, ArrayList arrayList, boolean z, int i, int i2) {
        this.f$0 = messagesStorage;
        this.f$1 = j;
        this.f$2 = arrayList;
        this.f$3 = z;
        this.f$4 = i;
        this.f$5 = i2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((MessagesStorage) this.f$0).lambda$markMessagesAsDeleted$229(this.f$1, (ArrayList) this.f$2, this.f$3, this.f$4, this.f$5);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f$0;
                chatActivityEnterView.moveToSendStateRunnable = null;
                chatActivityEnterView.hideTopView(true);
                ChatActivityEnterView.AnonymousClass50 anonymousClass50 = chatActivityEnterView.messageEditText;
                if (anonymousClass50 != null) {
                    anonymousClass50.setText("");
                }
                ChatActivityEnterView.ChatActivityEnterViewDelegate chatActivityEnterViewDelegate = chatActivityEnterView.delegate;
                if (chatActivityEnterViewDelegate != null) {
                    chatActivityEnterViewDelegate.onMessageSend((CharSequence) this.f$2, this.f$3, this.f$4, this.f$5, this.f$1);
                }
                break;
        }
    }

    public MessagesStorage$$ExternalSyntheticLambda169(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z, int i, int i2, long j) {
        this.f$0 = chatActivityEnterView;
        this.f$2 = charSequence;
        this.f$3 = z;
        this.f$4 = i;
        this.f$5 = i2;
        this.f$1 = j;
    }
}

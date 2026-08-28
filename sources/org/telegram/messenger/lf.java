package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class lf implements Runnable {
    public final int f20893a = 0;
    public final boolean f20894b;
    public final int f20895c;
    public final int d;
    public final long f20896e;
    public final Object f20897f;
    public final Object h;

    public lf(MessagesStorage messagesStorage, long j10, ArrayList arrayList, boolean z10, int i9, int i10) {
        this.f20897f = messagesStorage;
        this.f20896e = j10;
        this.h = arrayList;
        this.f20894b = z10;
        this.f20895c = i9;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f20893a) {
            case 0:
                int i9 = this.f20895c;
                int i10 = this.d;
                ((MessagesStorage) this.f20897f).lambda$markMessagesAsDeleted$229(this.f20896e, (ArrayList) this.h, this.f20894b, i9, i10);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f20897f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f26081b0 = null;
                chatActivityEnterView.p0(true);
                org.telegram.ui.Components.ff ffVar = chatActivityEnterView.A0;
                if (ffVar != null) {
                    ffVar.setText("");
                }
                org.telegram.ui.Components.eg egVar = chatActivityEnterView.U2;
                if (egVar != null) {
                    egVar.y(charSequence, this.f20894b, this.f20895c, this.d, this.f20896e);
                    return;
                }
                return;
        }
    }

    public lf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i9, int i10, long j10) {
        this.f20897f = chatActivityEnterView;
        this.h = charSequence;
        this.f20894b = z10;
        this.f20895c = i9;
        this.d = i10;
        this.f20896e = j10;
    }
}

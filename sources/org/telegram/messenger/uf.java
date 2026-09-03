package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class uf implements Runnable {
    public final int f20208a = 0;
    public final boolean f20209b;
    public final int f20210c;
    public final int d;
    public final long f20211e;
    public final Object f20212f;
    public final Object h;

    public uf(MessagesStorage messagesStorage, long j10, ArrayList arrayList, boolean z4, int i10, int i11) {
        this.f20212f = messagesStorage;
        this.f20211e = j10;
        this.h = arrayList;
        this.f20209b = z4;
        this.f20210c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f20208a) {
            case 0:
                int i10 = this.f20210c;
                int i11 = this.d;
                ((MessagesStorage) this.f20212f).lambda$markMessagesAsDeleted$229(this.f20211e, (ArrayList) this.h, this.f20209b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f20212f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f24585c0 = null;
                chatActivityEnterView.q0(true);
                org.telegram.ui.Components.ff ffVar = chatActivityEnterView.B0;
                if (ffVar != null) {
                    ffVar.setText("");
                }
                org.telegram.ui.Components.eg egVar = chatActivityEnterView.V2;
                if (egVar != null) {
                    egVar.C(charSequence, this.f20209b, this.f20210c, this.d, this.f20211e);
                    return;
                }
                return;
        }
    }

    public uf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
        this.f20212f = chatActivityEnterView;
        this.h = charSequence;
        this.f20209b = z4;
        this.f20210c = i10;
        this.d = i11;
        this.f20211e = j10;
    }
}

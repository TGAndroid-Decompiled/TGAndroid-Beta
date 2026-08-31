package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class uf implements Runnable {
    public final int f20206a = 0;
    public final boolean f20207b;
    public final int f20208c;
    public final int d;
    public final long f20209e;
    public final Object f20210f;
    public final Object h;

    public uf(MessagesStorage messagesStorage, long j10, ArrayList arrayList, boolean z4, int i10, int i11) {
        this.f20210f = messagesStorage;
        this.f20209e = j10;
        this.h = arrayList;
        this.f20207b = z4;
        this.f20208c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f20206a) {
            case 0:
                int i10 = this.f20208c;
                int i11 = this.d;
                ((MessagesStorage) this.f20210f).lambda$markMessagesAsDeleted$229(this.f20209e, (ArrayList) this.h, this.f20207b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f20210f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f24583c0 = null;
                chatActivityEnterView.q0(true);
                org.telegram.ui.Components.ff ffVar = chatActivityEnterView.B0;
                if (ffVar != null) {
                    ffVar.setText("");
                }
                org.telegram.ui.Components.eg egVar = chatActivityEnterView.V2;
                if (egVar != null) {
                    egVar.C(charSequence, this.f20207b, this.f20208c, this.d, this.f20209e);
                    return;
                }
                return;
        }
    }

    public uf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
        this.f20210f = chatActivityEnterView;
        this.h = charSequence;
        this.f20207b = z4;
        this.f20208c = i10;
        this.d = i11;
        this.f20209e = j10;
    }
}

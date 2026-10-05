package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qf implements Runnable {
    public final int f18995a = 0;
    public final boolean f18996b;
    public final int f18997c;
    public final int d;
    public final long f18998e;
    public final Object f18999f;
    public final Object h;

    public qf(MessagesStorage messagesStorage, long j3, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f18999f = messagesStorage;
        this.f18998e = j3;
        this.h = arrayList;
        this.f18996b = z10;
        this.f18997c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18995a) {
            case 0:
                int i10 = this.f18997c;
                int i11 = this.d;
                ((MessagesStorage) this.f18999f).lambda$markMessagesAsDeleted$229(this.f18998e, (ArrayList) this.h, this.f18996b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f18999f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f23889f0 = null;
                chatActivityEnterView.q0(true);
                org.telegram.ui.Components.rf rfVar = chatActivityEnterView.E0;
                if (rfVar != null) {
                    rfVar.setText("");
                }
                org.telegram.ui.Components.pg pgVar = chatActivityEnterView.Z2;
                if (pgVar != null) {
                    pgVar.H(charSequence, this.f18996b, this.f18997c, this.d, this.f18998e);
                    return;
                }
                return;
        }
    }

    public qf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        this.f18999f = chatActivityEnterView;
        this.h = charSequence;
        this.f18996b = z10;
        this.f18997c = i10;
        this.d = i11;
        this.f18998e = j3;
    }
}

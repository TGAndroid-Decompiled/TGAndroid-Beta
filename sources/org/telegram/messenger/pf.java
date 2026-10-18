package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class pf implements Runnable {
    public final int f19271a = 0;
    public final boolean f19272b;
    public final int f19273c;
    public final int d;
    public final long e;
    public final Object f19274f;
    public final Object h;

    public pf(MessagesStorage messagesStorage, long j10, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f19274f = messagesStorage;
        this.e = j10;
        this.h = arrayList;
        this.f19272b = z10;
        this.f19273c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19271a) {
            case 0:
                int i10 = this.f19273c;
                int i11 = this.d;
                ((MessagesStorage) this.f19274f).lambda$markMessagesAsDeleted$229(this.e, (ArrayList) this.h, this.f19272b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f19274f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f23938f0 = null;
                chatActivityEnterView.o0(true);
                org.telegram.ui.Components.pf pfVar = chatActivityEnterView.E0;
                if (pfVar != null) {
                    pfVar.setText("");
                }
                org.telegram.ui.Components.og ogVar = chatActivityEnterView.Z2;
                if (ogVar != null) {
                    ogVar.L(charSequence, this.f19272b, this.f19273c, this.d, this.e);
                    return;
                }
                return;
        }
    }

    public pf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        this.f19274f = chatActivityEnterView;
        this.h = charSequence;
        this.f19272b = z10;
        this.f19273c = i10;
        this.d = i11;
        this.e = j10;
    }
}

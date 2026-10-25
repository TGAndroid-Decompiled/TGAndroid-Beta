package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class sf implements Runnable {
    public final int f21248a = 0;
    public final boolean f21249b;
    public final int f21250c;
    public final int d;
    public final long e;
    public final Object f21251f;
    public final Object h;

    public sf(MessagesStorage messagesStorage, long j10, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f21251f = messagesStorage;
        this.e = j10;
        this.h = arrayList;
        this.f21249b = z10;
        this.f21250c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f21248a) {
            case 0:
                int i10 = this.f21250c;
                int i11 = this.d;
                ((MessagesStorage) this.f21251f).lambda$markMessagesAsDeleted$232(this.e, (ArrayList) this.h, this.f21249b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f21251f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f25875f0 = null;
                chatActivityEnterView.n0(true);
                org.telegram.ui.Components.pf pfVar = chatActivityEnterView.E0;
                if (pfVar != null) {
                    pfVar.setText("");
                }
                org.telegram.ui.Components.og ogVar = chatActivityEnterView.Z2;
                if (ogVar != null) {
                    ogVar.A(charSequence, this.f21249b, this.f21250c, this.d, this.e);
                    return;
                }
                return;
        }
    }

    public sf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        this.f21251f = chatActivityEnterView;
        this.h = charSequence;
        this.f21249b = z10;
        this.f21250c = i10;
        this.d = i11;
        this.e = j10;
    }
}

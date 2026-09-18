package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rf implements Runnable {
    public final int f17421a = 0;
    public final boolean f17422b;
    public final int f17423c;
    public final int d;
    public final long e;
    public final Object f17424f;
    public final Object h;

    public rf(MessagesStorage messagesStorage, long j3, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f17424f = messagesStorage;
        this.e = j3;
        this.h = arrayList;
        this.f17422b = z10;
        this.f17423c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f17421a) {
            case 0:
                int i10 = this.f17423c;
                int i11 = this.d;
                ((MessagesStorage) this.f17424f).lambda$markMessagesAsDeleted$229(this.e, (ArrayList) this.h, this.f17422b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f17424f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f21951f0 = null;
                chatActivityEnterView.q0(true);
                org.telegram.ui.Components.pf pfVar = chatActivityEnterView.E0;
                if (pfVar != null) {
                    pfVar.setText("");
                }
                org.telegram.ui.Components.ng ngVar = chatActivityEnterView.Y2;
                if (ngVar != null) {
                    ngVar.H(charSequence, this.f17422b, this.f17423c, this.d, this.e);
                    return;
                }
                return;
        }
    }

    public rf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        this.f17424f = chatActivityEnterView;
        this.h = charSequence;
        this.f17422b = z10;
        this.f17423c = i10;
        this.d = i11;
        this.e = j3;
    }
}

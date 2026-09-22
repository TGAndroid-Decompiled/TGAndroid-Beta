package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rf implements Runnable {
    public final int f17477a = 0;
    public final boolean f17478b;
    public final int f17479c;
    public final int d;
    public final long e;
    public final Object f17480f;
    public final Object h;

    public rf(MessagesStorage messagesStorage, long j3, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f17480f = messagesStorage;
        this.e = j3;
        this.h = arrayList;
        this.f17478b = z10;
        this.f17479c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f17477a) {
            case 0:
                int i10 = this.f17479c;
                int i11 = this.d;
                ((MessagesStorage) this.f17480f).lambda$markMessagesAsDeleted$229(this.e, (ArrayList) this.h, this.f17478b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f17480f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f22001f0 = null;
                chatActivityEnterView.q0(true);
                org.telegram.ui.Components.pf pfVar = chatActivityEnterView.E0;
                if (pfVar != null) {
                    pfVar.setText("");
                }
                org.telegram.ui.Components.ng ngVar = chatActivityEnterView.Z2;
                if (ngVar != null) {
                    ngVar.H(charSequence, this.f17478b, this.f17479c, this.d, this.e);
                    return;
                }
                return;
        }
    }

    public rf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        this.f17480f = chatActivityEnterView;
        this.h = charSequence;
        this.f17478b = z10;
        this.f17479c = i10;
        this.d = i11;
        this.e = j3;
    }
}

package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qf implements Runnable {
    public final int f17394a = 0;
    public final boolean f17395b;
    public final int f17396c;
    public final int d;
    public final long e;
    public final Object f17397f;
    public final Object h;

    public qf(MessagesStorage messagesStorage, long j3, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f17397f = messagesStorage;
        this.e = j3;
        this.h = arrayList;
        this.f17395b = z10;
        this.f17396c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f17394a) {
            case 0:
                int i10 = this.f17396c;
                int i11 = this.d;
                ((MessagesStorage) this.f17397f).lambda$markMessagesAsDeleted$229(this.e, (ArrayList) this.h, this.f17395b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f17397f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f21987f0 = null;
                chatActivityEnterView.q0(true);
                org.telegram.ui.Components.qf qfVar = chatActivityEnterView.E0;
                if (qfVar != null) {
                    qfVar.setText("");
                }
                org.telegram.ui.Components.og ogVar = chatActivityEnterView.Z2;
                if (ogVar != null) {
                    ogVar.H(charSequence, this.f17395b, this.f17396c, this.d, this.e);
                    return;
                }
                return;
        }
    }

    public qf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        this.f17397f = chatActivityEnterView;
        this.h = charSequence;
        this.f17395b = z10;
        this.f17396c = i10;
        this.d = i11;
        this.e = j3;
    }
}

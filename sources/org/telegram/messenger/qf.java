package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qf implements Runnable {
    public final int f17395a = 0;
    public final boolean f17396b;
    public final int f17397c;
    public final int d;
    public final long e;
    public final Object f17398f;
    public final Object h;

    public qf(MessagesStorage messagesStorage, long j3, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f17398f = messagesStorage;
        this.e = j3;
        this.h = arrayList;
        this.f17396b = z10;
        this.f17397c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f17395a) {
            case 0:
                int i10 = this.f17397c;
                int i11 = this.d;
                ((MessagesStorage) this.f17398f).lambda$markMessagesAsDeleted$229(this.e, (ArrayList) this.h, this.f17396b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f17398f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f21986f0 = null;
                chatActivityEnterView.q0(true);
                org.telegram.ui.Components.qf qfVar = chatActivityEnterView.E0;
                if (qfVar != null) {
                    qfVar.setText("");
                }
                org.telegram.ui.Components.og ogVar = chatActivityEnterView.Z2;
                if (ogVar != null) {
                    ogVar.H(charSequence, this.f17396b, this.f17397c, this.d, this.e);
                    return;
                }
                return;
        }
    }

    public qf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        this.f17398f = chatActivityEnterView;
        this.h = charSequence;
        this.f17396b = z10;
        this.f17397c = i10;
        this.d = i11;
        this.e = j3;
    }
}

package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qf implements Runnable {
    public final int f17391a = 0;
    public final boolean f17392b;
    public final int f17393c;
    public final int d;
    public final long e;
    public final Object f17394f;
    public final Object h;

    public qf(MessagesStorage messagesStorage, long j3, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f17394f = messagesStorage;
        this.e = j3;
        this.h = arrayList;
        this.f17392b = z10;
        this.f17393c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f17391a) {
            case 0:
                int i10 = this.f17393c;
                int i11 = this.d;
                ((MessagesStorage) this.f17394f).lambda$markMessagesAsDeleted$229(this.e, (ArrayList) this.h, this.f17392b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f17394f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f21989f0 = null;
                chatActivityEnterView.q0(true);
                org.telegram.ui.Components.qf qfVar = chatActivityEnterView.E0;
                if (qfVar != null) {
                    qfVar.setText("");
                }
                org.telegram.ui.Components.og ogVar = chatActivityEnterView.Z2;
                if (ogVar != null) {
                    ogVar.H(charSequence, this.f17392b, this.f17393c, this.d, this.e);
                    return;
                }
                return;
        }
    }

    public qf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        this.f17394f = chatActivityEnterView;
        this.h = charSequence;
        this.f17392b = z10;
        this.f17393c = i10;
        this.d = i11;
        this.e = j3;
    }
}

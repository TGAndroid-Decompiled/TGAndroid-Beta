package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qf implements Runnable {
    public final int f18991a = 0;
    public final boolean f18992b;
    public final int f18993c;
    public final int d;
    public final long f18994e;
    public final Object f18995f;
    public final Object h;

    public qf(MessagesStorage messagesStorage, long j3, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f18995f = messagesStorage;
        this.f18994e = j3;
        this.h = arrayList;
        this.f18992b = z10;
        this.f18993c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18991a) {
            case 0:
                int i10 = this.f18993c;
                int i11 = this.d;
                ((MessagesStorage) this.f18995f).lambda$markMessagesAsDeleted$229(this.f18994e, (ArrayList) this.h, this.f18992b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f18995f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f23882f0 = null;
                chatActivityEnterView.q0(true);
                org.telegram.ui.Components.rf rfVar = chatActivityEnterView.E0;
                if (rfVar != null) {
                    rfVar.setText("");
                }
                org.telegram.ui.Components.pg pgVar = chatActivityEnterView.Z2;
                if (pgVar != null) {
                    pgVar.H(charSequence, this.f18992b, this.f18993c, this.d, this.f18994e);
                    return;
                }
                return;
        }
    }

    public qf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        this.f18995f = chatActivityEnterView;
        this.h = charSequence;
        this.f18992b = z10;
        this.f18993c = i10;
        this.d = i11;
        this.f18994e = j3;
    }
}

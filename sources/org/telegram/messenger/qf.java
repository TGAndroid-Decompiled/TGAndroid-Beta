package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qf implements Runnable {
    public final int f18990a = 0;
    public final boolean f18991b;
    public final int f18992c;
    public final int d;
    public final long f18993e;
    public final Object f18994f;
    public final Object h;

    public qf(MessagesStorage messagesStorage, long j3, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f18994f = messagesStorage;
        this.f18993e = j3;
        this.h = arrayList;
        this.f18991b = z10;
        this.f18992c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18990a) {
            case 0:
                int i10 = this.f18992c;
                int i11 = this.d;
                ((MessagesStorage) this.f18994f).lambda$markMessagesAsDeleted$229(this.f18993e, (ArrayList) this.h, this.f18991b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f18994f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f23881f0 = null;
                chatActivityEnterView.q0(true);
                org.telegram.ui.Components.rf rfVar = chatActivityEnterView.E0;
                if (rfVar != null) {
                    rfVar.setText("");
                }
                org.telegram.ui.Components.pg pgVar = chatActivityEnterView.Z2;
                if (pgVar != null) {
                    pgVar.H(charSequence, this.f18991b, this.f18992c, this.d, this.f18993e);
                    return;
                }
                return;
        }
    }

    public qf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        this.f18994f = chatActivityEnterView;
        this.h = charSequence;
        this.f18991b = z10;
        this.f18992c = i10;
        this.d = i11;
        this.f18993e = j3;
    }
}

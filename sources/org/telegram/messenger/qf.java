package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qf implements Runnable {
    public final int f17410a = 0;
    public final boolean f17411b;
    public final int f17412c;
    public final int d;
    public final long e;
    public final Object f17413f;
    public final Object h;

    public qf(MessagesStorage messagesStorage, long j3, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f17413f = messagesStorage;
        this.e = j3;
        this.h = arrayList;
        this.f17411b = z10;
        this.f17412c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f17410a) {
            case 0:
                int i10 = this.f17412c;
                int i11 = this.d;
                ((MessagesStorage) this.f17413f).lambda$markMessagesAsDeleted$229(this.e, (ArrayList) this.h, this.f17411b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f17413f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f22008f0 = null;
                chatActivityEnterView.q0(true);
                org.telegram.ui.Components.rf rfVar = chatActivityEnterView.E0;
                if (rfVar != null) {
                    rfVar.setText("");
                }
                org.telegram.ui.Components.pg pgVar = chatActivityEnterView.Z2;
                if (pgVar != null) {
                    pgVar.H(charSequence, this.f17411b, this.f17412c, this.d, this.e);
                    return;
                }
                return;
        }
    }

    public qf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        this.f17413f = chatActivityEnterView;
        this.h = charSequence;
        this.f17411b = z10;
        this.f17412c = i10;
        this.d = i11;
        this.e = j3;
    }
}

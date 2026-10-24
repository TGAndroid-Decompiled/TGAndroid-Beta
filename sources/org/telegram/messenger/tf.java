package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class tf implements Runnable {
    public final int f19677a = 0;
    public final boolean f19678b;
    public final int f19679c;
    public final int d;
    public final long e;
    public final Object f19680f;
    public final Object h;

    public tf(MessagesStorage messagesStorage, long j10, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f19680f = messagesStorage;
        this.e = j10;
        this.h = arrayList;
        this.f19678b = z10;
        this.f19679c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19677a) {
            case 0:
                int i10 = this.f19679c;
                int i11 = this.d;
                ((MessagesStorage) this.f19680f).lambda$markMessagesAsDeleted$229(this.e, (ArrayList) this.h, this.f19678b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f19680f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f24085f0 = null;
                chatActivityEnterView.n0(true);
                org.telegram.ui.Components.nf nfVar = chatActivityEnterView.E0;
                if (nfVar != null) {
                    nfVar.setText("");
                }
                org.telegram.ui.Components.mg mgVar = chatActivityEnterView.Z2;
                if (mgVar != null) {
                    mgVar.L(charSequence, this.f19678b, this.f19679c, this.d, this.e);
                    return;
                }
                return;
        }
    }

    public tf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        this.f19680f = chatActivityEnterView;
        this.h = charSequence;
        this.f19678b = z10;
        this.f19679c = i10;
        this.d = i11;
        this.e = j10;
    }
}

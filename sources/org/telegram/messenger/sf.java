package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class sf implements Runnable {
    public final int f19602a = 0;
    public final boolean f19603b;
    public final int f19604c;
    public final int d;
    public final long e;
    public final Object f19605f;
    public final Object h;

    public sf(MessagesStorage messagesStorage, long j10, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f19605f = messagesStorage;
        this.e = j10;
        this.h = arrayList;
        this.f19603b = z10;
        this.f19604c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19602a) {
            case 0:
                int i10 = this.f19604c;
                int i11 = this.d;
                ((MessagesStorage) this.f19605f).lambda$markMessagesAsDeleted$229(this.e, (ArrayList) this.h, this.f19603b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f19605f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f24084f0 = null;
                chatActivityEnterView.n0(true);
                org.telegram.ui.Components.pf pfVar = chatActivityEnterView.E0;
                if (pfVar != null) {
                    pfVar.setText("");
                }
                org.telegram.ui.Components.og ogVar = chatActivityEnterView.Z2;
                if (ogVar != null) {
                    ogVar.L(charSequence, this.f19603b, this.f19604c, this.d, this.e);
                    return;
                }
                return;
        }
    }

    public sf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        this.f19605f = chatActivityEnterView;
        this.h = charSequence;
        this.f19603b = z10;
        this.f19604c = i10;
        this.d = i11;
        this.e = j10;
    }
}

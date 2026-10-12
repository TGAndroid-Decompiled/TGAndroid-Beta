package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class tf implements Runnable {
    public final int f19004a = 0;
    public final boolean f19005b;
    public final int f19006c;
    public final int d;
    public final long f19007e;
    public final Object f19008f;
    public final Object h;

    public tf(MessagesStorage messagesStorage, long j3, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f19008f = messagesStorage;
        this.f19007e = j3;
        this.h = arrayList;
        this.f19005b = z10;
        this.f19006c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19004a) {
            case 0:
                int i10 = this.f19006c;
                int i11 = this.d;
                ((MessagesStorage) this.f19008f).lambda$markMessagesAsDeleted$229(this.f19007e, (ArrayList) this.h, this.f19005b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f19008f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f23651f0 = null;
                chatActivityEnterView.r0(true);
                org.telegram.ui.Components.uf ufVar = chatActivityEnterView.E0;
                if (ufVar != null) {
                    ufVar.setText("");
                }
                org.telegram.ui.Components.sg sgVar = chatActivityEnterView.Z2;
                if (sgVar != null) {
                    sgVar.H(charSequence, this.f19005b, this.f19006c, this.d, this.f19007e);
                    return;
                }
                return;
        }
    }

    public tf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        this.f19008f = chatActivityEnterView;
        this.h = charSequence;
        this.f19005b = z10;
        this.f19006c = i10;
        this.d = i11;
        this.f19007e = j3;
    }
}

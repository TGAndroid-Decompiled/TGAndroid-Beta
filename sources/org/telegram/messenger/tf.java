package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class tf implements Runnable {
    public final int f19003a = 0;
    public final boolean f19004b;
    public final int f19005c;
    public final int d;
    public final long f19006e;
    public final Object f19007f;
    public final Object h;

    public tf(MessagesStorage messagesStorage, long j3, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f19007f = messagesStorage;
        this.f19006e = j3;
        this.h = arrayList;
        this.f19004b = z10;
        this.f19005c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19003a) {
            case 0:
                int i10 = this.f19005c;
                int i11 = this.d;
                ((MessagesStorage) this.f19007f).lambda$markMessagesAsDeleted$229(this.f19006e, (ArrayList) this.h, this.f19004b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f19007f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f23650f0 = null;
                chatActivityEnterView.r0(true);
                org.telegram.ui.Components.uf ufVar = chatActivityEnterView.E0;
                if (ufVar != null) {
                    ufVar.setText("");
                }
                org.telegram.ui.Components.sg sgVar = chatActivityEnterView.Z2;
                if (sgVar != null) {
                    sgVar.H(charSequence, this.f19004b, this.f19005c, this.d, this.f19006e);
                    return;
                }
                return;
        }
    }

    public tf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        this.f19007f = chatActivityEnterView;
        this.h = charSequence;
        this.f19004b = z10;
        this.f19005c = i10;
        this.d = i11;
        this.f19006e = j3;
    }
}

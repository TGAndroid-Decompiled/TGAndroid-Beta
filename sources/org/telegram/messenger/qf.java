package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qf implements Runnable {
    public final int f18852a = 0;
    public final boolean f18853b;
    public final int f18854c;
    public final int d;
    public final long f18855e;
    public final Object f18856f;
    public final Object h;

    public qf(MessagesStorage messagesStorage, long j3, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f18856f = messagesStorage;
        this.f18855e = j3;
        this.h = arrayList;
        this.f18853b = z10;
        this.f18854c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18852a) {
            case 0:
                int i10 = this.f18854c;
                int i11 = this.d;
                ((MessagesStorage) this.f18856f).lambda$markMessagesAsDeleted$229(this.f18855e, (ArrayList) this.h, this.f18853b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f18856f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f23724f0 = null;
                chatActivityEnterView.q0(true);
                org.telegram.ui.Components.qf qfVar = chatActivityEnterView.E0;
                if (qfVar != null) {
                    qfVar.setText("");
                }
                org.telegram.ui.Components.og ogVar = chatActivityEnterView.Y2;
                if (ogVar != null) {
                    ogVar.G(charSequence, this.f18853b, this.f18854c, this.d, this.f18855e);
                    return;
                }
                return;
        }
    }

    public qf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        this.f18856f = chatActivityEnterView;
        this.h = charSequence;
        this.f18853b = z10;
        this.f18854c = i10;
        this.d = i11;
        this.f18855e = j3;
    }
}

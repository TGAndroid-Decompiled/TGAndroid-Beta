package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rf implements Runnable {
    public final int f18900a = 0;
    public final boolean f18901b;
    public final int f18902c;
    public final int d;
    public final long f18903e;
    public final Object f18904f;
    public final Object h;

    public rf(MessagesStorage messagesStorage, long j3, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f18904f = messagesStorage;
        this.f18903e = j3;
        this.h = arrayList;
        this.f18901b = z10;
        this.f18902c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18900a) {
            case 0:
                int i10 = this.f18902c;
                int i11 = this.d;
                ((MessagesStorage) this.f18904f).lambda$markMessagesAsDeleted$229(this.f18903e, (ArrayList) this.h, this.f18901b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f18904f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f23696f0 = null;
                chatActivityEnterView.q0(true);
                org.telegram.ui.Components.qf qfVar = chatActivityEnterView.E0;
                if (qfVar != null) {
                    qfVar.setText("");
                }
                org.telegram.ui.Components.og ogVar = chatActivityEnterView.Y2;
                if (ogVar != null) {
                    ogVar.G(charSequence, this.f18901b, this.f18902c, this.d, this.f18903e);
                    return;
                }
                return;
        }
    }

    public rf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        this.f18904f = chatActivityEnterView;
        this.h = charSequence;
        this.f18901b = z10;
        this.f18902c = i10;
        this.d = i11;
        this.f18903e = j3;
    }
}

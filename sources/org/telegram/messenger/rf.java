package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rf implements Runnable {
    public final int f18927a = 0;
    public final boolean f18928b;
    public final int f18929c;
    public final int d;
    public final long f18930e;
    public final Object f18931f;
    public final Object h;

    public rf(MessagesStorage messagesStorage, long j3, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f18931f = messagesStorage;
        this.f18930e = j3;
        this.h = arrayList;
        this.f18928b = z10;
        this.f18929c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18927a) {
            case 0:
                int i10 = this.f18929c;
                int i11 = this.d;
                ((MessagesStorage) this.f18931f).lambda$markMessagesAsDeleted$229(this.f18930e, (ArrayList) this.h, this.f18928b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f18931f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f23723f0 = null;
                chatActivityEnterView.q0(true);
                org.telegram.ui.Components.qf qfVar = chatActivityEnterView.E0;
                if (qfVar != null) {
                    qfVar.setText("");
                }
                org.telegram.ui.Components.og ogVar = chatActivityEnterView.Y2;
                if (ogVar != null) {
                    ogVar.G(charSequence, this.f18928b, this.f18929c, this.d, this.f18930e);
                    return;
                }
                return;
        }
    }

    public rf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        this.f18931f = chatActivityEnterView;
        this.h = charSequence;
        this.f18928b = z10;
        this.f18929c = i10;
        this.d = i11;
        this.f18930e = j3;
    }
}

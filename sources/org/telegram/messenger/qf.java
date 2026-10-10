package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qf implements Runnable {
    public final int f18955a = 0;
    public final boolean f18956b;
    public final int f18957c;
    public final int d;
    public final long f18958e;
    public final Object f18959f;
    public final Object h;

    public qf(MessagesStorage messagesStorage, long j3, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f18959f = messagesStorage;
        this.f18958e = j3;
        this.h = arrayList;
        this.f18956b = z10;
        this.f18957c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18955a) {
            case 0:
                int i10 = this.f18957c;
                int i11 = this.d;
                ((MessagesStorage) this.f18959f).lambda$markMessagesAsDeleted$229(this.f18958e, (ArrayList) this.h, this.f18956b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f18959f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f23889f0 = null;
                chatActivityEnterView.o0(true);
                org.telegram.ui.Components.sf sfVar = chatActivityEnterView.E0;
                if (sfVar != null) {
                    sfVar.setText("");
                }
                org.telegram.ui.Components.qg qgVar = chatActivityEnterView.Z2;
                if (qgVar != null) {
                    qgVar.K(charSequence, this.f18956b, this.f18957c, this.d, this.f18958e);
                    return;
                }
                return;
        }
    }

    public qf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        this.f18959f = chatActivityEnterView;
        this.h = charSequence;
        this.f18956b = z10;
        this.f18957c = i10;
        this.d = i11;
        this.f18958e = j3;
    }
}

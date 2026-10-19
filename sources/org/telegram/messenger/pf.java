package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class pf implements Runnable {
    public final int f19274a = 0;
    public final boolean f19275b;
    public final int f19276c;
    public final int d;
    public final long e;
    public final Object f19277f;
    public final Object h;

    public pf(MessagesStorage messagesStorage, long j10, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f19277f = messagesStorage;
        this.e = j10;
        this.h = arrayList;
        this.f19275b = z10;
        this.f19276c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19274a) {
            case 0:
                int i10 = this.f19276c;
                int i11 = this.d;
                ((MessagesStorage) this.f19277f).lambda$markMessagesAsDeleted$229(this.e, (ArrayList) this.h, this.f19275b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f19277f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f23941f0 = null;
                chatActivityEnterView.o0(true);
                org.telegram.ui.Components.pf pfVar = chatActivityEnterView.E0;
                if (pfVar != null) {
                    pfVar.setText("");
                }
                org.telegram.ui.Components.og ogVar = chatActivityEnterView.Z2;
                if (ogVar != null) {
                    ogVar.L(charSequence, this.f19275b, this.f19276c, this.d, this.e);
                    return;
                }
                return;
        }
    }

    public pf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        this.f19277f = chatActivityEnterView;
        this.h = charSequence;
        this.f19275b = z10;
        this.f19276c = i10;
        this.d = i11;
        this.e = j10;
    }
}

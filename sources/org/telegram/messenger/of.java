package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class of implements Runnable {
    public final int f19195a = 0;
    public final boolean f19196b;
    public final int f19197c;
    public final int d;
    public final long e;
    public final Object f19198f;
    public final Object h;

    public of(MessagesStorage messagesStorage, long j10, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f19198f = messagesStorage;
        this.e = j10;
        this.h = arrayList;
        this.f19196b = z10;
        this.f19197c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19195a) {
            case 0:
                int i10 = this.f19197c;
                int i11 = this.d;
                ((MessagesStorage) this.f19198f).lambda$markMessagesAsDeleted$229(this.e, (ArrayList) this.h, this.f19196b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f19198f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f23938f0 = null;
                chatActivityEnterView.o0(true);
                org.telegram.ui.Components.pf pfVar = chatActivityEnterView.E0;
                if (pfVar != null) {
                    pfVar.setText("");
                }
                org.telegram.ui.Components.og ogVar = chatActivityEnterView.Z2;
                if (ogVar != null) {
                    ogVar.L(charSequence, this.f19196b, this.f19197c, this.d, this.e);
                    return;
                }
                return;
        }
    }

    public of(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        this.f19198f = chatActivityEnterView;
        this.h = charSequence;
        this.f19196b = z10;
        this.f19197c = i10;
        this.d = i11;
        this.e = j10;
    }
}

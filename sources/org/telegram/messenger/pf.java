package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

public final class pf implements Runnable {

    public final int f21272a = 0;

    public final boolean f21273b;

    public final int f21274c;
    public final int d;

    public final long f21275e;

    public final Object f21276f;
    public final Object h;

    public pf(MessagesStorage messagesStorage, long j10, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f21276f = messagesStorage;
        this.f21275e = j10;
        this.h = arrayList;
        this.f21273b = z10;
        this.f21274c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f21272a) {
            case 0:
                ((MessagesStorage) this.f21276f).lambda$markMessagesAsDeleted$229(this.f21275e, (ArrayList) this.h, this.f21273b, this.f21274c, this.d);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f21276f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f26077b0 = null;
                chatActivityEnterView.q0(true);
                org.telegram.ui.Components.bf bfVar = chatActivityEnterView.A0;
                if (bfVar != null) {
                    bfVar.setText("");
                }
                org.telegram.ui.Components.ag agVar = chatActivityEnterView.U2;
                if (agVar != null) {
                    agVar.w(charSequence, this.f21273b, this.f21274c, this.d, this.f21275e);
                }
                break;
        }
    }

    public pf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        this.f21276f = chatActivityEnterView;
        this.h = charSequence;
        this.f21273b = z10;
        this.f21274c = i10;
        this.d = i11;
        this.f21275e = j10;
    }
}

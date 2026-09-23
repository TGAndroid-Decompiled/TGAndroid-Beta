package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qf implements Runnable {
    public final int f17142a = 0;
    public final boolean f17143b;
    public final int f17144c;
    public final int d;
    public final long e;
    public final Object f17145f;
    public final Object h;

    public qf(MessagesStorage messagesStorage, long j3, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f17145f = messagesStorage;
        this.e = j3;
        this.h = arrayList;
        this.f17143b = z10;
        this.f17144c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f17142a) {
            case 0:
                int i10 = this.f17144c;
                int i11 = this.d;
                ((MessagesStorage) this.f17145f).lambda$markMessagesAsDeleted$229(this.e, (ArrayList) this.h, this.f17143b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f17145f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f21735f0 = null;
                chatActivityEnterView.r0(true);
                org.telegram.ui.Components.pf pfVar = chatActivityEnterView.E0;
                if (pfVar != null) {
                    pfVar.setText("");
                }
                org.telegram.ui.Components.ng ngVar = chatActivityEnterView.Y2;
                if (ngVar != null) {
                    ngVar.H(charSequence, this.f17143b, this.f17144c, this.d, this.e);
                    return;
                }
                return;
        }
    }

    public qf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        this.f17145f = chatActivityEnterView;
        this.h = charSequence;
        this.f17143b = z10;
        this.f17144c = i10;
        this.d = i11;
        this.e = j3;
    }
}

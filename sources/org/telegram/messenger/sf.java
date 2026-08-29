package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class sf implements Runnable {
    public final int f21560a = 0;
    public final boolean f21561b;
    public final int f21562c;
    public final int d;
    public final long f21563e;
    public final Object f21564f;
    public final Object h;

    public sf(MessagesStorage messagesStorage, long j10, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f21564f = messagesStorage;
        this.f21563e = j10;
        this.h = arrayList;
        this.f21561b = z10;
        this.f21562c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f21560a) {
            case 0:
                int i10 = this.f21562c;
                int i11 = this.d;
                ((MessagesStorage) this.f21564f).lambda$markMessagesAsDeleted$229(this.f21563e, (ArrayList) this.h, this.f21561b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f21564f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f26093b0 = null;
                chatActivityEnterView.q0(true);
                org.telegram.ui.Components.jf jfVar = chatActivityEnterView.A0;
                if (jfVar != null) {
                    jfVar.setText("");
                }
                org.telegram.ui.Components.hg hgVar = chatActivityEnterView.U2;
                if (hgVar != null) {
                    hgVar.D(charSequence, this.f21561b, this.f21562c, this.d, this.f21563e);
                    return;
                }
                return;
        }
    }

    public sf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        this.f21564f = chatActivityEnterView;
        this.h = charSequence;
        this.f21561b = z10;
        this.f21562c = i10;
        this.d = i11;
        this.f21563e = j10;
    }
}

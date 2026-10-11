package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qf implements Runnable {
    public final int f18996a = 0;
    public final boolean f18997b;
    public final int f18998c;
    public final int d;
    public final long f18999e;
    public final Object f19000f;
    public final Object h;

    public qf(MessagesStorage messagesStorage, long j3, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f19000f = messagesStorage;
        this.f18999e = j3;
        this.h = arrayList;
        this.f18997b = z10;
        this.f18998c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18996a) {
            case 0:
                int i10 = this.f18998c;
                int i11 = this.d;
                ((MessagesStorage) this.f19000f).lambda$markMessagesAsDeleted$229(this.f18999e, (ArrayList) this.h, this.f18997b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f19000f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f23913f0 = null;
                chatActivityEnterView.o0(true);
                org.telegram.ui.Components.sf sfVar = chatActivityEnterView.E0;
                if (sfVar != null) {
                    sfVar.setText("");
                }
                org.telegram.ui.Components.qg qgVar = chatActivityEnterView.Z2;
                if (qgVar != null) {
                    qgVar.K(charSequence, this.f18997b, this.f18998c, this.d, this.f18999e);
                    return;
                }
                return;
        }
    }

    public qf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        this.f19000f = chatActivityEnterView;
        this.h = charSequence;
        this.f18997b = z10;
        this.f18998c = i10;
        this.d = i11;
        this.f18999e = j3;
    }
}

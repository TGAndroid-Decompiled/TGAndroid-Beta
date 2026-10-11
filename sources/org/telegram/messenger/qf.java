package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qf implements Runnable {
    public final int f18960a = 0;
    public final boolean f18961b;
    public final int f18962c;
    public final int d;
    public final long f18963e;
    public final Object f18964f;
    public final Object h;

    public qf(MessagesStorage messagesStorage, long j3, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f18964f = messagesStorage;
        this.f18963e = j3;
        this.h = arrayList;
        this.f18961b = z10;
        this.f18962c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18960a) {
            case 0:
                int i10 = this.f18962c;
                int i11 = this.d;
                ((MessagesStorage) this.f18964f).lambda$markMessagesAsDeleted$229(this.f18963e, (ArrayList) this.h, this.f18961b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f18964f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f23877f0 = null;
                chatActivityEnterView.o0(true);
                org.telegram.ui.Components.sf sfVar = chatActivityEnterView.E0;
                if (sfVar != null) {
                    sfVar.setText("");
                }
                org.telegram.ui.Components.qg qgVar = chatActivityEnterView.Z2;
                if (qgVar != null) {
                    qgVar.K(charSequence, this.f18961b, this.f18962c, this.d, this.f18963e);
                    return;
                }
                return;
        }
    }

    public qf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        this.f18964f = chatActivityEnterView;
        this.h = charSequence;
        this.f18961b = z10;
        this.f18962c = i10;
        this.d = i11;
        this.f18963e = j3;
    }
}

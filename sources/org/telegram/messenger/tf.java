package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class tf implements Runnable {
    public final int f18504a = 0;
    public final boolean f18505b;
    public final int f18506c;
    public final int d;
    public final long e;
    public final Object f18507f;
    public final Object h;

    public tf(MessagesStorage messagesStorage, long j10, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f18507f = messagesStorage;
        this.e = j10;
        this.h = arrayList;
        this.f18505b = z10;
        this.f18506c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18504a) {
            case 0:
                int i10 = this.f18506c;
                int i11 = this.d;
                ((MessagesStorage) this.f18507f).lambda$markMessagesAsDeleted$229(this.e, (ArrayList) this.h, this.f18505b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f18507f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f22883f0 = null;
                chatActivityEnterView.o0(true);
                org.telegram.ui.Components.rf rfVar = chatActivityEnterView.E0;
                if (rfVar != null) {
                    rfVar.setText("");
                }
                org.telegram.ui.Components.pg pgVar = chatActivityEnterView.Z2;
                if (pgVar != null) {
                    pgVar.J(charSequence, this.f18505b, this.f18506c, this.d, this.e);
                    return;
                }
                return;
        }
    }

    public tf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        this.f18507f = chatActivityEnterView;
        this.h = charSequence;
        this.f18505b = z10;
        this.f18506c = i10;
        this.d = i11;
        this.e = j10;
    }
}

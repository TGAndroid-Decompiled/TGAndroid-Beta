package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class tf implements Runnable {
    public final int f18206a = 0;
    public final boolean f18207b;
    public final int f18208c;
    public final int d;
    public final long e;
    public final Object f18209f;
    public final Object h;

    public tf(MessagesStorage messagesStorage, long j10, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f18209f = messagesStorage;
        this.e = j10;
        this.h = arrayList;
        this.f18207b = z10;
        this.f18208c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18206a) {
            case 0:
                int i10 = this.f18208c;
                int i11 = this.d;
                ((MessagesStorage) this.f18209f).lambda$markMessagesAsDeleted$229(this.e, (ArrayList) this.h, this.f18207b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f18209f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f22583f0 = null;
                chatActivityEnterView.o0(true);
                org.telegram.ui.Components.rf rfVar = chatActivityEnterView.E0;
                if (rfVar != null) {
                    rfVar.setText("");
                }
                org.telegram.ui.Components.pg pgVar = chatActivityEnterView.Z2;
                if (pgVar != null) {
                    pgVar.J(charSequence, this.f18207b, this.f18208c, this.d, this.e);
                    return;
                }
                return;
        }
    }

    public tf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        this.f18209f = chatActivityEnterView;
        this.h = charSequence;
        this.f18207b = z10;
        this.f18208c = i10;
        this.d = i11;
        this.e = j10;
    }
}

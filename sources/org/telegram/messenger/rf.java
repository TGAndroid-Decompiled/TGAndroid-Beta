package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rf implements Runnable {
    public final int f17236a = 0;
    public final boolean f17237b;
    public final int f17238c;
    public final int d;
    public final long e;
    public final Object f17239f;
    public final Object h;

    public rf(MessagesStorage messagesStorage, long j3, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f17239f = messagesStorage;
        this.e = j3;
        this.h = arrayList;
        this.f17237b = z10;
        this.f17238c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f17236a) {
            case 0:
                int i10 = this.f17238c;
                int i11 = this.d;
                ((MessagesStorage) this.f17239f).lambda$markMessagesAsDeleted$229(this.e, (ArrayList) this.h, this.f17237b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f17239f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f21761f0 = null;
                chatActivityEnterView.r0(true);
                org.telegram.ui.Components.of ofVar = chatActivityEnterView.E0;
                if (ofVar != null) {
                    ofVar.setText("");
                }
                org.telegram.ui.Components.mg mgVar = chatActivityEnterView.Y2;
                if (mgVar != null) {
                    mgVar.H(charSequence, this.f17237b, this.f17238c, this.d, this.e);
                    return;
                }
                return;
        }
    }

    public rf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        this.f17239f = chatActivityEnterView;
        this.h = charSequence;
        this.f17237b = z10;
        this.f17238c = i10;
        this.d = i11;
        this.e = j3;
    }
}

package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class uf implements Runnable {
    public final int f18579a = 0;
    public final boolean f18580b;
    public final int f18581c;
    public final int d;
    public final long e;
    public final Object f18582f;
    public final Object h;

    public uf(MessagesStorage messagesStorage, long j10, ArrayList arrayList, boolean z4, int i10, int i11) {
        this.f18582f = messagesStorage;
        this.e = j10;
        this.h = arrayList;
        this.f18580b = z4;
        this.f18581c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18579a) {
            case 0:
                int i10 = this.f18581c;
                int i11 = this.d;
                ((MessagesStorage) this.f18582f).lambda$markMessagesAsDeleted$229(this.e, (ArrayList) this.h, this.f18580b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f18582f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f22717c0 = null;
                chatActivityEnterView.q0(true);
                org.telegram.ui.Components.ff ffVar = chatActivityEnterView.B0;
                if (ffVar != null) {
                    ffVar.setText("");
                }
                org.telegram.ui.Components.eg egVar = chatActivityEnterView.V2;
                if (egVar != null) {
                    egVar.G(charSequence, this.f18580b, this.f18581c, this.d, this.e);
                    return;
                }
                return;
        }
    }

    public uf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
        this.f18582f = chatActivityEnterView;
        this.h = charSequence;
        this.f18580b = z4;
        this.f18581c = i10;
        this.d = i11;
        this.e = j10;
    }
}

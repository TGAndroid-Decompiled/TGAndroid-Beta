package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class uf implements Runnable {
    public final int f18597a = 0;
    public final boolean f18598b;
    public final int f18599c;
    public final int d;
    public final long e;
    public final Object f18600f;
    public final Object h;

    public uf(MessagesStorage messagesStorage, long j10, ArrayList arrayList, boolean z4, int i10, int i11) {
        this.f18600f = messagesStorage;
        this.e = j10;
        this.h = arrayList;
        this.f18598b = z4;
        this.f18599c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18597a) {
            case 0:
                int i10 = this.f18599c;
                int i11 = this.d;
                ((MessagesStorage) this.f18600f).lambda$markMessagesAsDeleted$229(this.e, (ArrayList) this.h, this.f18598b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f18600f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f22744c0 = null;
                chatActivityEnterView.q0(true);
                org.telegram.ui.Components.ff ffVar = chatActivityEnterView.B0;
                if (ffVar != null) {
                    ffVar.setText("");
                }
                org.telegram.ui.Components.eg egVar = chatActivityEnterView.V2;
                if (egVar != null) {
                    egVar.D(charSequence, this.f18598b, this.f18599c, this.d, this.e);
                    return;
                }
                return;
        }
    }

    public uf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
        this.f18600f = chatActivityEnterView;
        this.h = charSequence;
        this.f18598b = z4;
        this.f18599c = i10;
        this.d = i11;
        this.e = j10;
    }
}

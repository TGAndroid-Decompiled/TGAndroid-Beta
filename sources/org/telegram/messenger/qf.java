package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class qf implements Runnable {
    public final int f18951a = 0;
    public final boolean f18952b;
    public final int f18953c;
    public final int d;
    public final long f18954e;
    public final Object f18955f;
    public final Object h;

    public qf(MessagesStorage messagesStorage, long j3, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f18955f = messagesStorage;
        this.f18954e = j3;
        this.h = arrayList;
        this.f18952b = z10;
        this.f18953c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f18951a) {
            case 0:
                int i10 = this.f18953c;
                int i11 = this.d;
                ((MessagesStorage) this.f18955f).lambda$markMessagesAsDeleted$229(this.f18954e, (ArrayList) this.h, this.f18952b, i10, i11);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f18955f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f23885f0 = null;
                chatActivityEnterView.o0(true);
                org.telegram.ui.Components.sf sfVar = chatActivityEnterView.E0;
                if (sfVar != null) {
                    sfVar.setText("");
                }
                org.telegram.ui.Components.qg qgVar = chatActivityEnterView.Z2;
                if (qgVar != null) {
                    qgVar.K(charSequence, this.f18952b, this.f18953c, this.d, this.f18954e);
                    return;
                }
                return;
        }
    }

    public qf(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
        this.f18955f = chatActivityEnterView;
        this.h = charSequence;
        this.f18952b = z10;
        this.f18953c = i10;
        this.d = i11;
        this.f18954e = j3;
    }
}

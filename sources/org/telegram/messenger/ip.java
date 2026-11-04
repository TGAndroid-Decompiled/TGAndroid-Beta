package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ip implements Runnable {
    public final int f23566a = 0;
    public final boolean f23567b;
    public final int f23568c;
    public final int d;
    public final long f23569e;
    public final Object f23570f;
    public final Object h;

    public ip(qr qrVar, long j10, ArrayList arrayList, boolean z10, int i3, int i10) {
        this.f23570f = qrVar;
        this.f23569e = j10;
        this.h = arrayList;
        this.f23567b = z10;
        this.f23568c = i3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f23566a) {
            case 0:
                ((qr) this.f23570f).Q0(this.f23568c, this.d, this.f23569e, (ArrayList) this.h, this.f23567b);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f23570f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f31123g0 = null;
                chatActivityEnterView.n0(true);
                org.telegram.ui.Components.ve veVar = chatActivityEnterView.F0;
                if (veVar != null) {
                    veVar.setText("");
                }
                org.telegram.ui.Components.uf ufVar = chatActivityEnterView.f31087a3;
                if (ufVar != null) {
                    ufVar.G(charSequence, this.f23567b, this.f23568c, this.d, this.f23569e);
                    return;
                }
                return;
        }
    }

    public ip(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i3, int i10, long j10) {
        this.f23570f = chatActivityEnterView;
        this.h = charSequence;
        this.f23567b = z10;
        this.f23568c = i3;
        this.d = i10;
        this.f23569e = j10;
    }
}

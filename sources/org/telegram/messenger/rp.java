package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rp implements Runnable {
    public final int f25316a = 0;
    public final boolean f25317b;
    public final int f25318c;
    public final int d;
    public final long f25319e;
    public final Object f25320f;
    public final Object h;

    public rp(yr yrVar, long j3, ArrayList arrayList, boolean z9, int i7, int i10) {
        this.f25320f = yrVar;
        this.f25319e = j3;
        this.h = arrayList;
        this.f25317b = z9;
        this.f25318c = i7;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f25316a) {
            case 0:
                ((yr) this.f25320f).Q0(this.f25318c, this.d, this.f25319e, (ArrayList) this.h, this.f25317b);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f25320f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f31043f0 = null;
                chatActivityEnterView.o0(true);
                org.telegram.ui.Components.xe xeVar = chatActivityEnterView.E0;
                if (xeVar != null) {
                    xeVar.setText("");
                }
                org.telegram.ui.Components.wf wfVar = chatActivityEnterView.Z2;
                if (wfVar != null) {
                    wfVar.F(charSequence, this.f25317b, this.f25318c, this.d, this.f25319e);
                    return;
                }
                return;
        }
    }

    public rp(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z9, int i7, int i10, long j3) {
        this.f25320f = chatActivityEnterView;
        this.h = charSequence;
        this.f25317b = z9;
        this.f25318c = i7;
        this.d = i10;
        this.f25319e = j3;
    }
}

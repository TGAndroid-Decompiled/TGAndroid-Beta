package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rp implements Runnable {
    public final int f25319a = 0;
    public final boolean f25320b;
    public final int f25321c;
    public final int d;
    public final long f25322e;
    public final Object f25323f;
    public final Object h;

    public rp(yr yrVar, long j3, ArrayList arrayList, boolean z9, int i7, int i10) {
        this.f25323f = yrVar;
        this.f25322e = j3;
        this.h = arrayList;
        this.f25320b = z9;
        this.f25321c = i7;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f25319a) {
            case 0:
                ((yr) this.f25323f).Q0(this.f25321c, this.d, this.f25322e, (ArrayList) this.h, this.f25320b);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f25323f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f31063f0 = null;
                chatActivityEnterView.o0(true);
                org.telegram.ui.Components.we weVar = chatActivityEnterView.E0;
                if (weVar != null) {
                    weVar.setText("");
                }
                org.telegram.ui.Components.vf vfVar = chatActivityEnterView.Z2;
                if (vfVar != null) {
                    vfVar.F(charSequence, this.f25320b, this.f25321c, this.d, this.f25322e);
                    return;
                }
                return;
        }
    }

    public rp(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z9, int i7, int i10, long j3) {
        this.f25323f = chatActivityEnterView;
        this.h = charSequence;
        this.f25320b = z9;
        this.f25321c = i7;
        this.d = i10;
        this.f25322e = j3;
    }
}

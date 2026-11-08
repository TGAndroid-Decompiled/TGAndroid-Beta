package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rp implements Runnable {
    public final int f25315a = 0;
    public final boolean f25316b;
    public final int f25317c;
    public final int d;
    public final long f25318e;
    public final Object f25319f;
    public final Object h;

    public rp(yr yrVar, long j3, ArrayList arrayList, boolean z9, int i7, int i10) {
        this.f25319f = yrVar;
        this.f25318e = j3;
        this.h = arrayList;
        this.f25316b = z9;
        this.f25317c = i7;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f25315a) {
            case 0:
                ((yr) this.f25319f).Q0(this.f25317c, this.d, this.f25318e, (ArrayList) this.h, this.f25316b);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f25319f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f31047f0 = null;
                chatActivityEnterView.o0(true);
                org.telegram.ui.Components.xe xeVar = chatActivityEnterView.E0;
                if (xeVar != null) {
                    xeVar.setText("");
                }
                org.telegram.ui.Components.wf wfVar = chatActivityEnterView.Z2;
                if (wfVar != null) {
                    wfVar.F(charSequence, this.f25316b, this.f25317c, this.d, this.f25318e);
                    return;
                }
                return;
        }
    }

    public rp(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z9, int i7, int i10, long j3) {
        this.f25319f = chatActivityEnterView;
        this.h = charSequence;
        this.f25316b = z9;
        this.f25317c = i7;
        this.d = i10;
        this.f25318e = j3;
    }
}

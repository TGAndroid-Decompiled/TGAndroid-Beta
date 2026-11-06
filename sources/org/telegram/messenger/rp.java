package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class rp implements Runnable {
    public final int f25308a = 0;
    public final boolean f25309b;
    public final int f25310c;
    public final int d;
    public final long f25311e;
    public final Object f25312f;
    public final Object h;

    public rp(yr yrVar, long j3, ArrayList arrayList, boolean z9, int i7, int i10) {
        this.f25312f = yrVar;
        this.f25311e = j3;
        this.h = arrayList;
        this.f25309b = z9;
        this.f25310c = i7;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f25308a) {
            case 0:
                ((yr) this.f25312f).Q0(this.f25310c, this.d, this.f25311e, (ArrayList) this.h, this.f25309b);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f25312f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f31042f0 = null;
                chatActivityEnterView.o0(true);
                org.telegram.ui.Components.xe xeVar = chatActivityEnterView.E0;
                if (xeVar != null) {
                    xeVar.setText("");
                }
                org.telegram.ui.Components.wf wfVar = chatActivityEnterView.Z2;
                if (wfVar != null) {
                    wfVar.F(charSequence, this.f25309b, this.f25310c, this.d, this.f25311e);
                    return;
                }
                return;
        }
    }

    public rp(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z9, int i7, int i10, long j3) {
        this.f25312f = chatActivityEnterView;
        this.h = charSequence;
        this.f25309b = z9;
        this.f25310c = i7;
        this.d = i10;
        this.f25311e = j3;
    }
}

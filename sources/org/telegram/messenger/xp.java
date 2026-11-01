package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class xp implements Runnable {
    public final int f19462a = 0;
    public final boolean f19463b;
    public final int f19464c;
    public final int d;
    public final long e;
    public final Object f19465f;
    public final Object h;

    public xp(is isVar, long j10, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f19465f = isVar;
        this.e = j10;
        this.h = arrayList;
        this.f19463b = z10;
        this.f19464c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19462a) {
            case 0:
                ((is) this.f19465f).Q0(this.f19464c, this.d, this.e, (ArrayList) this.h, this.f19463b);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f19465f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f23707f0 = null;
                chatActivityEnterView.m0(true);
                org.telegram.ui.Components.se seVar = chatActivityEnterView.E0;
                if (seVar != null) {
                    seVar.setText("");
                }
                org.telegram.ui.Components.sf sfVar = chatActivityEnterView.Z2;
                if (sfVar != null) {
                    sfVar.E(charSequence, this.f19463b, this.f19464c, this.d, this.e);
                    return;
                }
                return;
        }
    }

    public xp(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        this.f19465f = chatActivityEnterView;
        this.h = charSequence;
        this.f19463b = z10;
        this.f19464c = i10;
        this.d = i11;
        this.e = j10;
    }
}

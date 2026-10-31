package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class wp implements Runnable {
    public final int f19119a = 0;
    public final boolean f19120b;
    public final int f19121c;
    public final int d;
    public final long e;
    public final Object f19122f;
    public final Object h;

    public wp(hs hsVar, long j10, ArrayList arrayList, boolean z10, int i10, int i11) {
        this.f19122f = hsVar;
        this.e = j10;
        this.h = arrayList;
        this.f19120b = z10;
        this.f19121c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f19119a) {
            case 0:
                ((hs) this.f19122f).Q0(this.f19121c, this.d, this.e, (ArrayList) this.h, this.f19120b);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f19122f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f23706f0 = null;
                chatActivityEnterView.m0(true);
                org.telegram.ui.Components.se seVar = chatActivityEnterView.E0;
                if (seVar != null) {
                    seVar.setText("");
                }
                org.telegram.ui.Components.sf sfVar = chatActivityEnterView.Z2;
                if (sfVar != null) {
                    sfVar.E(charSequence, this.f19120b, this.f19121c, this.d, this.e);
                    return;
                }
                return;
        }
    }

    public wp(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
        this.f19122f = chatActivityEnterView;
        this.h = charSequence;
        this.f19120b = z10;
        this.f19121c = i10;
        this.d = i11;
        this.e = j10;
    }
}

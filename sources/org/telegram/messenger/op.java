package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class op implements Runnable {
    public final int f25788a = 0;
    public final boolean f25789b;
    public final int f25790c;
    public final int d;
    public final long f25791e;
    public final Object f25792f;
    public final Object h;

    public op(vr vrVar, long j3, ArrayList arrayList, boolean z10, int i7, int i10) {
        this.f25792f = vrVar;
        this.f25791e = j3;
        this.h = arrayList;
        this.f25789b = z10;
        this.f25790c = i7;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f25788a) {
            case 0:
                ((vr) this.f25792f).Q0(this.f25790c, this.d, this.f25791e, (ArrayList) this.h, this.f25789b);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f25792f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f32199g0 = null;
                chatActivityEnterView.C0(true);
                org.telegram.ui.Components.xe xeVar = chatActivityEnterView.F0;
                if (xeVar != null) {
                    xeVar.setText("");
                }
                org.telegram.ui.Components.cg cgVar = chatActivityEnterView.H3;
                if (cgVar != null) {
                    cgVar.M(charSequence, this.f25789b, this.f25790c, this.d, this.f25791e);
                    return;
                }
                return;
        }
    }

    public op(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
        this.f25792f = chatActivityEnterView;
        this.h = charSequence;
        this.f25789b = z10;
        this.f25790c = i7;
        this.d = i10;
        this.f25791e = j3;
    }
}

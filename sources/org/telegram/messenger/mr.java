package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class mr implements Runnable {
    public final int f25089a = 0;
    public final boolean f25090b;
    public final int f25091c;
    public final int d;
    public final long f25092e;
    public final Object f25093f;
    public final Object h;

    public mr(vr vrVar, long j3, ArrayList arrayList, boolean z10, int i7, int i10) {
        this.f25093f = vrVar;
        this.f25092e = j3;
        this.h = arrayList;
        this.f25090b = z10;
        this.f25091c = i7;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f25089a) {
            case 0:
                ((vr) this.f25093f).Q0(this.f25091c, this.d, this.f25092e, (ArrayList) this.h, this.f25090b);
                return;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f25093f;
                CharSequence charSequence = (CharSequence) this.h;
                chatActivityEnterView.f32199g0 = null;
                chatActivityEnterView.C0(true);
                org.telegram.ui.Components.xe xeVar = chatActivityEnterView.F0;
                if (xeVar != null) {
                    xeVar.setText("");
                }
                org.telegram.ui.Components.cg cgVar = chatActivityEnterView.H3;
                if (cgVar != null) {
                    cgVar.M(charSequence, this.f25090b, this.f25091c, this.d, this.f25092e);
                    return;
                }
                return;
        }
    }

    public mr(ChatActivityEnterView chatActivityEnterView, CharSequence charSequence, boolean z10, int i7, int i10, long j3) {
        this.f25093f = chatActivityEnterView;
        this.h = charSequence;
        this.f25090b = z10;
        this.f25091c = i7;
        this.d = i10;
        this.f25092e = j3;
    }
}

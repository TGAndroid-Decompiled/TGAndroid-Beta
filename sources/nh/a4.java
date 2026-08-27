package nh;

import java.util.LinkedList;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.sg;

public final class a4 implements o1.f {

    public final int f18551a;

    public final Object f18552b;

    public final Object f18553c;

    public a4(int i10, Object obj, Object obj2) {
        this.f18551a = i10;
        this.f18552b = obj;
        this.f18553c = obj2;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        switch (this.f18551a) {
            case 0:
                d4 d4Var = (d4) this.f18552b;
                Runnable runnable = (Runnable) this.f18553c;
                if (hVar == d4Var.C) {
                    d4Var.C = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = d4Var.A;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f12 = d4Var.h;
                    if (f12 != -1.0f) {
                        boolean z11 = d4Var.f18651s;
                        d4Var.f18651s = true;
                        d4Var.setOffsetY(f12);
                        d4Var.h = -1.0f;
                        d4Var.f18651s = z11;
                    }
                    d4Var.f18649n = -2.1474836E9f;
                }
                break;
            case 1:
                jb jbVar = (jb) this.f18552b;
                bg bgVar = (bg) this.f18553c;
                jbVar.setInOutOffset(0.0f);
                if (!z10) {
                    bgVar.run();
                }
                break;
            case 2:
                gi.s((gi) this.f18552b, (org.telegram.ui.ActionBar.i3) this.f18553c);
                break;
            case 3:
                hh.l3 l3Var = (hh.l3) this.f18552b;
                sg sgVar = (sg) this.f18553c;
                gi giVar = (gi) l3Var.d;
                giVar.f28699v0.setTranslationY(0.0f);
                giVar.f28699v0.k(giVar.f28658h2);
                ((org.telegram.ui.ActionBar.e3) giVar).containerView.invalidate();
                sgVar.run();
                giVar.a2(0);
                break;
            default:
                dd0 dd0Var = (dd0) this.f18552b;
                nb0 nb0Var = (nb0) this.f18553c;
                LinkedList linkedList = dd0Var.I;
                dd0Var.H = null;
                nb0Var.D = null;
                nb0Var.z();
                if (!z10) {
                    nb0Var.h = 1.0f;
                    nb0Var.z();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        dd0Var.J.poll();
                    }
                }
                break;
        }
    }
}

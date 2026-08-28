package mh;

import android.view.ViewGroup;
import java.util.LinkedList;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.yc0;
public final class c4 implements o1.f {
    public final int f17783a;
    public final Object f17784b;
    public final Object f17785c;

    public c4(int i9, Object obj, Object obj2) {
        this.f17783a = i9;
        this.f17784b = obj;
        this.f17785c = obj2;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        ViewGroup viewGroup;
        switch (this.f17783a) {
            case 0:
                f4 f4Var = (f4) this.f17784b;
                Runnable runnable = (Runnable) this.f17785c;
                if (hVar == f4Var.C) {
                    f4Var.C = null;
                    if (runnable != null) {
                        runnable.run();
                    }
                    Runnable runnable2 = f4Var.A;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    float f12 = f4Var.h;
                    if (f12 != -1.0f) {
                        boolean z11 = f4Var.f17844s;
                        f4Var.f17844s = true;
                        f4Var.setOffsetY(f12);
                        f4Var.h = -1.0f;
                        f4Var.f17844s = z11;
                    }
                    f4Var.f17842n = -2.1474836E9f;
                    return;
                }
                return;
            case 1:
                fg fgVar = (fg) this.f17785c;
                ((lb) this.f17784b).setInOutOffset(0.0f);
                if (!z10) {
                    fgVar.run();
                    return;
                }
                return;
            case 2:
                ki.r((ki) this.f17784b, (org.telegram.messenger.video.e) this.f17785c);
                return;
            case 3:
                ki kiVar = (ki) ((gh.m3) this.f17784b).d;
                kiVar.f30163v0.setTranslationY(0.0f);
                kiVar.f30163v0.k(kiVar.f30122h2);
                viewGroup = ((org.telegram.ui.ActionBar.f3) kiVar).containerView;
                viewGroup.invalidate();
                ((wg) this.f17785c).run();
                kiVar.a2(0);
                return;
            default:
                yc0 yc0Var = (yc0) this.f17784b;
                jb0 jb0Var = (jb0) this.f17785c;
                LinkedList linkedList = yc0Var.I;
                yc0Var.H = null;
                jb0Var.D = null;
                jb0Var.z();
                if (!z10) {
                    jb0Var.h = 1.0f;
                    jb0Var.z();
                    if (!linkedList.isEmpty()) {
                        ((Runnable) linkedList.poll()).run();
                        yc0Var.J.poll();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

package ef;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import androidx.recyclerview.widget.RecyclerView;
import c2.p;
import c5.j;
import eg.c1;
import eg.e2;
import eg.j2;
import eg.k1;
import eg.l2;
import eg.n0;
import eg.u2;
import eg.v0;
import f2.i0;
import gg.d1;
import gg.e1;
import gg.t0;
import gg.x0;
import h5.b0;
import j3.c0;
import j3.c2;
import j3.f0;
import j3.k0;
import j3.n;
import java.util.Collections;
import jh.u;
import kh.d2;
import kh.h2;
import kh.m0;
import kh.s;
import kh.u1;
import kh.x3;
import lh.wa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.vk;
import org.telegram.ui.Components.w51;
import org.telegram.ui.ga1;
public final class e implements Runnable {
    public final int f5194a;
    public final Object f5195b;

    public e(c0 c0Var, SurfaceTexture surfaceTexture) {
        this.f5194a = 17;
        this.f5195b = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f5194a) {
            case 0:
                ((j) this.f5195b).A();
                return;
            case 1:
                v0 v0Var = ((n0) this.f5195b).f5367c;
                v0Var.f28678n.presentFragment(ga1.d0(v0Var.s1(), true));
                return;
            case 2:
                jj0 jj0Var = ((c1) this.f5195b).f5236y;
                jj0Var.getAnimatedDrawable().L(0, true, false);
                jj0Var.d();
                return;
            case 3:
                ((k1) this.f5195b).f5335b.y();
                return;
            case 4:
                j2 j2Var = (j2) this.f5195b;
                int size = 1073741823 - (1073741823 % j2Var.U2.size());
                i0 i0Var = j2Var.V2;
                j2Var.f5326i3 = size;
                i0Var.h1(size, (j2Var.getMeasuredHeight() - j2Var.getChildAt(0).getMeasuredHeight()) >> 1);
                j2Var.w1(null, false);
                return;
            case 5:
                ((l2) this.f5195b).invalidate();
                return;
            case 6:
                ((u2) this.f5195b).a();
                return;
            case 7:
                RecyclerView recyclerView = (RecyclerView) this.f5195b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().l();
                    return;
                }
                return;
            case 8:
                ((b) ((p) this.f5195b).f1980c).a(false);
                return;
            case 9:
                CharSequence charSequence = (CharSequence) this.f5195b;
                qc X = qc.X();
                if (X != null) {
                    X.Q(R.raw.forward, 30, charSequence).j();
                    return;
                }
                return;
            case 10:
                ((x0) this.f5195b).run(null);
                return;
            case 11:
                ((vk) this.f5195b).run(Collections.EMPTY_LIST);
                return;
            case 12:
                ((t0) this.f5195b).run(null);
                return;
            case 13:
                e1 e1Var = ((d1) this.f5195b).f6606r;
                e2 e2Var = new e2(e1Var.f28678n, e1.Q(e1Var), null, null, null, e1.R(e1Var));
                e2Var.G0 = true;
                e2Var.Z = true;
                e1Var.f28678n.showDialog(e2Var);
                return;
            case 14:
                ((g3) this.f5195b).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedMultiGiftsSelector, new Object[0]);
                AndroidUtilities.runOnUIThread(new cg.n0(6), 220L);
                return;
            case 15:
                ((gh.f) this.f5195b).f6839a0.N(true);
                return;
            case 16:
                ((b0) this.f5195b).getClass();
                return;
            case 17:
                f0 f0Var = ((c0) this.f5195b).f8441a;
                f0Var.Z(null);
                f0Var.T(0, 0);
                return;
            case 18:
                try {
                    k0.b((c2) this.f5195b);
                    return;
                } catch (n e) {
                    h5.a.p("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            case 19:
                u uVar = (u) this.f5195b;
                uVar.f();
                uVar.e(true);
                return;
            case 20:
                k3.f fVar = (k3.f) this.f5195b;
                k3.a l10 = fVar.l();
                fVar.q(l10, 1028, new k3.c(l10, 28));
                fVar.f9709f.d();
                return;
            case 21:
                ((kg.c) this.f5195b).f();
                return;
            case 22:
                s sVar = (s) this.f5195b;
                sVar.f10794e0.setTranslationX(sVar.f10793d0.getAnimatedWidth() + AndroidUtilities.dp(28.0f));
                return;
            case 23:
                ((m0) this.f5195b).onBackPressed();
                return;
            case 24:
                w51 w51Var = ((h2) this.f5195b).V;
                if (w51Var != null) {
                    w51Var.N(false);
                    return;
                }
                return;
            case 25:
                ((u1) this.f5195b).c();
                return;
            case 26:
                d2 d2Var = (d2) this.f5195b;
                wa waVar = d2Var.e;
                if (waVar != null) {
                    waVar.d();
                    d2Var.invalidateSelf();
                    return;
                }
                return;
            case 27:
                ((x3) this.f5195b).o();
                return;
            case 28:
                try {
                    ((Bitmap) this.f5195b).recycle();
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                lf.p pVar = (lf.p) this.f5195b;
                long j10 = pVar.f12049b;
                if (j10 > 0) {
                    long j11 = j10 - 1;
                    pVar.f12049b = j11;
                    pVar.f12048a.d(j11);
                }
                if (pVar.f12049b <= 0) {
                    pVar.f12050c = false;
                }
                if (pVar.f12050c) {
                    AndroidUtilities.runOnUIThread(pVar.d, 1000L);
                    return;
                }
                return;
        }
    }

    public e(k0 k0Var, c2 c2Var) {
        this.f5194a = 18;
        this.f5195b = c2Var;
    }

    public e(Object obj, int i10) {
        this.f5194a = i10;
        this.f5195b = obj;
    }
}

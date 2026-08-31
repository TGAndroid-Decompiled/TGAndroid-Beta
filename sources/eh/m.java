package eh;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import androidx.recyclerview.widget.RecyclerView;
import f2.j0;
import fg.b1;
import fg.d2;
import fg.i2;
import fg.j1;
import fg.k2;
import fg.n0;
import fg.t2;
import fg.v0;
import h5.b0;
import hg.d1;
import hg.e1;
import hg.t0;
import hg.x0;
import j3.c0;
import j3.c2;
import j3.f0;
import j3.k0;
import java.util.Collections;
import lh.g2;
import lh.m0;
import lh.u1;
import mh.wa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.xk;
import org.telegram.ui.ha1;
public final class m implements Runnable {
    public final int f5659a;
    public final Object f5660b;

    public m(c0 c0Var, SurfaceTexture surfaceTexture) {
        this.f5659a = 18;
        this.f5660b = c0Var;
    }

    @Override
    public final void run() {
        switch (this.f5659a) {
            case 0:
                ((v) this.f5660b).f5681c.V2.N(true);
                return;
            case 1:
                ((u) this.f5660b).a();
                return;
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.f5660b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().l();
                    return;
                }
                return;
            case 3:
                ((ef.b) ((c2.p) this.f5660b).f2148c).a(false);
                return;
            case 4:
                v0 v0Var = ((n0) this.f5660b).f6410c;
                v0Var.f31017n.presentFragment(ha1.d0(v0Var.s1(), true));
                return;
            case 5:
                lj0 lj0Var = ((b1) this.f5660b).f6254y;
                lj0Var.getAnimatedDrawable().L(0, true, false);
                lj0Var.d();
                return;
            case 6:
                ((j1) this.f5660b).f6354b.y();
                return;
            case 7:
                i2 i2Var = (i2) this.f5660b;
                int size = 1073741823 - (1073741823 % i2Var.U2.size());
                j0 j0Var = i2Var.V2;
                i2Var.f6346i3 = size;
                j0Var.h1(size, (i2Var.getMeasuredHeight() - i2Var.getChildAt(0).getMeasuredHeight()) >> 1);
                i2Var.w1(null, false);
                return;
            case 8:
                ((k2) this.f5660b).invalidate();
                return;
            case 9:
                ((t2) this.f5660b).a();
                return;
            case 10:
                ((b0) this.f5660b).getClass();
                return;
            case 11:
                CharSequence charSequence = (CharSequence) this.f5660b;
                qc X = qc.X();
                if (X != null) {
                    X.Q(R.raw.forward, 30, charSequence).j();
                    return;
                }
                return;
            case 12:
                ((x0) this.f5660b).run(null);
                return;
            case 13:
                ((xk) this.f5660b).run(Collections.EMPTY_LIST);
                return;
            case 14:
                ((t0) this.f5660b).run(null);
                return;
            case 15:
                e1 e1Var = ((d1) this.f5660b).f7448r;
                d2 d2Var = new d2(e1Var.f31017n, e1.Q(e1Var), null, null, null, e1.R(e1Var));
                d2Var.G0 = true;
                d2Var.Z = true;
                e1Var.f31017n.showDialog(d2Var);
                return;
            case 16:
                ((h3) this.f5660b).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedMultiGiftsSelector, new Object[0]);
                AndroidUtilities.runOnUIThread(new ag.f(8), 220L);
                return;
            case 17:
                ((hh.f) this.f5660b).f7699a0.N(true);
                return;
            case 18:
                f0 f0Var = ((c0) this.f5660b).f9000a;
                f0Var.Z(null);
                f0Var.T(0, 0);
                return;
            case 19:
                try {
                    k0.c((c2) this.f5660b);
                    return;
                } catch (j3.n e6) {
                    h5.a.p("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e6);
                    throw new RuntimeException(e6);
                }
            case 20:
                k3.f fVar = (k3.f) this.f5660b;
                k3.a l10 = fVar.l();
                fVar.q(l10, 1028, new k3.c(l10, 28));
                fVar.f10426f.d();
                return;
            case 21:
                kh.u uVar = (kh.u) this.f5660b;
                uVar.f();
                uVar.e(true);
                return;
            case 22:
                try {
                    ((Bitmap) this.f5660b).recycle();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 23:
                lf.p pVar = (lf.p) this.f5660b;
                long j10 = pVar.f12500b;
                if (j10 > 0) {
                    long j11 = j10 - 1;
                    pVar.f12500b = j11;
                    pVar.f12499a.d(j11);
                }
                if (pVar.f12500b <= 0) {
                    pVar.f12501c = false;
                }
                if (pVar.f12501c) {
                    AndroidUtilities.runOnUIThread(pVar.d, 1000L);
                    return;
                }
                return;
            case 24:
                ((lg.c) this.f5660b).f();
                return;
            case 25:
                lh.s sVar = (lh.s) this.f5660b;
                sVar.f12941e0.setTranslationX(sVar.f12940d0.getAnimatedWidth() + AndroidUtilities.dp(28.0f));
                return;
            case 26:
                ((m0) this.f5660b).onBackPressed();
                return;
            case 27:
                x51 x51Var = ((g2) this.f5660b).V;
                if (x51Var != null) {
                    x51Var.N(false);
                    return;
                }
                return;
            case 28:
                ((u1) this.f5660b).c();
                return;
            default:
                lh.c2 c2Var = (lh.c2) this.f5660b;
                wa waVar = c2Var.f12646e;
                if (waVar != null) {
                    waVar.d();
                    c2Var.invalidateSelf();
                    return;
                }
                return;
        }
    }

    public m(k0 k0Var, c2 c2Var) {
        this.f5659a = 19;
        this.f5660b = c2Var;
    }

    public m(Object obj, int i10) {
        this.f5659a = i10;
        this.f5660b = obj;
    }
}

package di;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.nq;
public final class c implements Runnable {
    public final int f8569a;
    public final t f8570b;

    public c(t tVar, int i7) {
        this.f8569a = i7;
        this.f8570b = tVar;
    }

    @Override
    public final void run() {
        boolean z10;
        String H;
        int i7 = this.f8569a;
        t tVar = this.f8570b;
        switch (i7) {
            case 0:
                c cVar = tVar.f9758t0;
                int currentTime = tVar.getConnectionsManager().getCurrentTime();
                bi.s sVar = tVar.f9735b0;
                if (tVar.Z <= 0 && tVar.Q <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                sVar.setEnabled(z10);
                if (currentTime < tVar.Q) {
                    tVar.f9735b0.i(hd.N0(2131752956, null), true, true);
                    if (tVar.f9757s0 == null) {
                        tVar.f9757s0 = new SpannableStringBuilder("l");
                        nq nqVar = new nq(2131231977, 0);
                        nqVar.f37906n = 1;
                        tVar.f9757s0.setSpan(nqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) tVar.f9757s0).append((CharSequence) t.x0(tVar.Q - currentTime));
                    tVar.f9735b0.g(spannableStringBuilder, true);
                    org.telegram.ui.Components.gc gcVar = tVar.f9747k0;
                    if (gcVar != null) {
                        org.telegram.ui.Components.lb lbVar = gcVar.f35485e;
                        if ((lbVar instanceof org.telegram.ui.Components.ob) && lbVar.isAttachedToWindow()) {
                            org.telegram.messenger.f3.q(null, null, 2131752940, new Object[]{t.x0(tVar.Q - currentTime)}, ((org.telegram.ui.Components.ob) tVar.f9747k0.f35485e).f38124b);
                        }
                    }
                    org.telegram.messenger.g0.r(cVar);
                    org.telegram.messenger.g0.h3(cVar, 1000L);
                    return;
                }
                tVar.f9735b0.g(null, true);
                bi.s sVar2 = tVar.f9735b0;
                if (tVar.Y) {
                    H = hd.N0(2131752957, null);
                } else {
                    H = hd.H(' ', "BotStarsButtonWithdrawShort", (int) tVar.Z);
                }
                sVar2.i(pb.Z0(false, H, tVar.f9738d0), true, true);
                return;
            case 1:
                t.b0(tVar);
                return;
            case 2:
                vf.c.t(tVar.getParentActivity(), hd.N0(2131752944, null));
                return;
            case 3:
                t.Z(tVar);
                return;
            case 4:
                vf.c.t(tVar.getParentActivity(), hd.N0(2131753017, null));
                return;
            case 5:
                vf.c.t(tVar.getParentActivity(), hd.N0(2131753037, null));
                return;
            default:
                tVar.f9737c0.setLoading(false);
                return;
        }
    }
}

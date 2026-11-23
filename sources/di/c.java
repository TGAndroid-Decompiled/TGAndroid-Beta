package di;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.kq;
public final class c implements Runnable {
    public final int f8568a;
    public final t f8569b;

    public c(t tVar, int i7) {
        this.f8568a = i7;
        this.f8569b = tVar;
    }

    @Override
    public final void run() {
        boolean z10;
        String H;
        int i7 = this.f8568a;
        t tVar = this.f8569b;
        switch (i7) {
            case 0:
                c cVar = tVar.f9756t0;
                int currentTime = tVar.getConnectionsManager().getCurrentTime();
                bi.s sVar = tVar.f9733b0;
                if (tVar.Z <= 0 && tVar.Q <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                sVar.setEnabled(z10);
                if (currentTime < tVar.Q) {
                    tVar.f9733b0.i(gd.N0(2131752956, null), true, true);
                    if (tVar.f9755s0 == null) {
                        tVar.f9755s0 = new SpannableStringBuilder("l");
                        kq kqVar = new kq(2131231980, 0);
                        kqVar.f36852n = 1;
                        tVar.f9755s0.setSpan(kqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) tVar.f9755s0).append((CharSequence) t.x0(tVar.Q - currentTime));
                    tVar.f9733b0.g(spannableStringBuilder, true);
                    org.telegram.ui.Components.fc fcVar = tVar.f9745k0;
                    if (fcVar != null) {
                        org.telegram.ui.Components.kb kbVar = fcVar.f35087e;
                        if ((kbVar instanceof org.telegram.ui.Components.nb) && kbVar.isAttachedToWindow()) {
                            org.telegram.messenger.f3.q(null, null, 2131752940, new Object[]{t.x0(tVar.Q - currentTime)}, ((org.telegram.ui.Components.nb) tVar.f9745k0.f35087e).f37752b);
                        }
                    }
                    org.telegram.messenger.g0.r(cVar);
                    org.telegram.messenger.g0.h3(cVar, 1000L);
                    return;
                }
                tVar.f9733b0.g(null, true);
                bi.s sVar2 = tVar.f9733b0;
                if (tVar.Y) {
                    H = gd.N0(2131752957, null);
                } else {
                    H = gd.H(' ', "BotStarsButtonWithdrawShort", (int) tVar.Z);
                }
                sVar2.i(pb.Z0(false, H, tVar.f9736d0), true, true);
                return;
            case 1:
                t.b0(tVar);
                return;
            case 2:
                vf.c.t(tVar.getParentActivity(), gd.N0(2131752944, null));
                return;
            case 3:
                t.Z(tVar);
                return;
            case 4:
                vf.c.t(tVar.getParentActivity(), gd.N0(2131753017, null));
                return;
            case 5:
                vf.c.t(tVar.getParentActivity(), gd.N0(2131753037, null));
                return;
            default:
                tVar.f9735c0.setLoading(false);
                return;
        }
    }
}

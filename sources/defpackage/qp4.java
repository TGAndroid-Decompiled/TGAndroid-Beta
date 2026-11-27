package defpackage;

import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.FragmentContextView;
public final class qp4 implements Runnable {
    public final FragmentContextView a;

    public qp4(FragmentContextView fragmentContextView) {
        this.a = fragmentContextView;
    }

    @Override
    public final void run() {
        String j0;
        FragmentContextView fragmentContextView = this.a;
        e eVar = fragmentContextView.h;
        if (fragmentContextView.g0 != null && (eVar instanceof zu1)) {
            vc2 groupCall = fragmentContextView.n.getGroupCall();
            if (groupCall != null && groupCall.k()) {
                int currentTime = groupCall.b.schedule_date - eVar.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    j0 = ob6.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]);
                } else {
                    j0 = hl.j0(currentTime);
                }
                hn hnVar = fragmentContextView.j0;
                if (!fragmentContextView.i0) {
                    j0 = ob6.M0(2131743092, null);
                }
                hnVar.t(j0, true, true);
                hl.d3(fragmentContextView.m0, 1000L);
                fragmentContextView.r.invalidate();
                return;
            }
            fragmentContextView.h0 = false;
            fragmentContextView.l0 = false;
            return;
        }
        fragmentContextView.l0 = false;
    }
}

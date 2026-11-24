package defpackage;

import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.FragmentContextView;
public final class np4 implements Runnable {
    public final FragmentContextView a;

    public np4(FragmentContextView fragmentContextView) {
        this.a = fragmentContextView;
    }

    @Override
    public final void run() {
        String j0;
        FragmentContextView fragmentContextView = this.a;
        d dVar = fragmentContextView.h;
        if (fragmentContextView.g0 != null && (dVar instanceof yv1)) {
            qd2 groupCall = fragmentContextView.n.getGroupCall();
            if (groupCall != null && groupCall.k()) {
                int currentTime = groupCall.b.schedule_date - dVar.getConnectionsManager().getCurrentTime();
                if (currentTime >= 86400) {
                    j0 = jb6.G(Math.round(currentTime / 86400.0f), "Days", new Object[0]);
                } else {
                    j0 = gm.j0(currentTime);
                }
                ho hoVar = fragmentContextView.j0;
                if (!fragmentContextView.i0) {
                    j0 = jb6.M0(2131743124, null);
                }
                hoVar.t(j0, true, true);
                gm.d3(fragmentContextView.m0, 1000L);
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

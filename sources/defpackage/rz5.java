package defpackage;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProxyListActivity;
public final class rz5 implements Runnable {
    public final byte a;
    public final LaunchActivity b;

    public rz5(LaunchActivity launchActivity, byte b) {
        this.a = b;
        this.b = launchActivity;
    }

    @Override
    public final void run() {
        WeakReference weakReference;
        byte b = this.a;
        d dVar = null;
        LaunchActivity launchActivity = this.b;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                launchActivity.getClass();
                b31 b31Var = new b31(launchActivity, null);
                b31Var.d(2131624009, new String[0]);
                b31Var.b.setText(jb6.M0(2131742474, null));
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    u31.g(Q, b31Var, 1500).j();
                    try {
                        Q.fragmentView.performHapticFeedback(3, 2);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                String str2 = LaunchActivity.C1;
                if (launchActivity.W0) {
                    launchActivity.W0 = false;
                    launchActivity.H(false, false, true);
                    return;
                }
                return;
            case 2:
                String str3 = LaunchActivity.C1;
                if (!launchActivity.w1) {
                    try {
                        he z = ik.z(launchActivity);
                        z.setOnDismissListener(new k06(launchActivity, (byte) 0));
                        launchActivity.w1 = true;
                        z.show();
                        return;
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                return;
            case 3:
                String str4 = LaunchActivity.C1;
                launchActivity.H(false, true, false);
                if (LaunchActivity.Q() != null && LaunchActivity.Q().getLastStoryViewer() != null) {
                    LaunchActivity.Q().getLastStoryViewer().U();
                    return;
                }
                return;
            case 4:
                String str5 = LaunchActivity.C1;
                if (!launchActivity.p0.getFragmentStack().isEmpty()) {
                    launchActivity.p0.getFragmentStack().get(0).showDialog(new x2b(launchActivity, launchActivity.k0, launchActivity.i0, launchActivity.j0));
                    return;
                }
                return;
            case 5:
                String str6 = LaunchActivity.C1;
                oa5.g0 = false;
                oa5.k(launchActivity);
                return;
            case 6:
                String str7 = LaunchActivity.C1;
                if (gm.g != -10 && gm.f == -10 && launchActivity.getResources().getConfiguration().smallestScreenWidthDp < 600 && (weakReference = gm.i) != null && weakReference.get() == launchActivity) {
                    int i = gm.h;
                    int i2 = gm.g;
                    gm.g = -10;
                    gm.h = -10;
                    gm.i = null;
                    try {
                        launchActivity.setRequestedOrientation(i);
                        launchActivity.setRequestedOrientation(i2);
                        return;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        return;
                    }
                }
                return;
            case 7:
                String str8 = LaunchActivity.C1;
                launchActivity.u1 = null;
                return;
            case 8:
                String str9 = LaunchActivity.C1;
                if (launchActivity.T0 != null) {
                    File file = new File(a.h(), kt6.q(new StringBuilder("remote"), launchActivity.T0.id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity.T0;
                    bmb u = cmb.u(file, tL_theme.title, tL_theme, true);
                    if (u != null) {
                        launchActivity.t0(new rob(u, true, 0, false, false));
                    }
                    launchActivity.i0();
                    return;
                }
                return;
            case 9:
                String str10 = LaunchActivity.C1;
                ArrayList arrayList = launchActivity.e0;
                ArrayList arrayList2 = launchActivity.f0;
                if (gm.O1()) {
                    if (!arrayList2.isEmpty()) {
                        dVar = (d) b10.f(1, arrayList2);
                    }
                } else if (!arrayList.isEmpty()) {
                    dVar = (d) b10.f(1, arrayList);
                }
                if (!(dVar instanceof ProxyListActivity) && !(dVar instanceof gw8)) {
                    launchActivity.t0(new ProxyListActivity());
                    return;
                }
                return;
            case 10:
                String str11 = LaunchActivity.C1;
                launchActivity.v1 = null;
                return;
            default:
                String str12 = LaunchActivity.C1;
                launchActivity.t0(new m86());
                return;
        }
    }
}

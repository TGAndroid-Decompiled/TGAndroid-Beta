package defpackage;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProxyListActivity;
public final class sz5 implements Runnable {
    public final byte a;
    public final LaunchActivity b;

    public sz5(LaunchActivity launchActivity, byte b) {
        this.a = b;
        this.b = launchActivity;
    }

    @Override
    public final void run() {
        WeakReference weakReference;
        byte b = this.a;
        e eVar = null;
        LaunchActivity launchActivity = this.b;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                launchActivity.v1 = null;
                return;
            case 1:
                String str2 = LaunchActivity.C1;
                launchActivity.getClass();
                c21 c21Var = new c21(launchActivity, null);
                c21Var.h(2131624009, new String[0]);
                c21Var.b.setText(ob6.M0(2131742442, null));
                e Q = LaunchActivity.Q();
                if (Q != null) {
                    v21.g(Q, c21Var, 1500).j();
                    try {
                        Q.fragmentView.performHapticFeedback(3, 2);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 2:
                String str3 = LaunchActivity.C1;
                if (!launchActivity.w1) {
                    try {
                        id z = jj.z(launchActivity);
                        z.setOnDismissListener(new l06(launchActivity, (byte) 0));
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
                if (!launchActivity.p0.getFragmentStack().isEmpty()) {
                    launchActivity.p0.getFragmentStack().get(0).showDialog(new s4b(launchActivity, launchActivity.k0, launchActivity.i0, launchActivity.j0));
                    return;
                }
                return;
            case 4:
                String str5 = LaunchActivity.C1;
                ra5.g0 = false;
                ra5.k(launchActivity);
                return;
            case 5:
                String str6 = LaunchActivity.C1;
                if (hl.g != -10 && hl.f == -10 && launchActivity.getResources().getConfiguration().smallestScreenWidthDp < 600 && (weakReference = hl.i) != null && weakReference.get() == launchActivity) {
                    int i = hl.h;
                    int i2 = hl.g;
                    hl.g = -10;
                    hl.h = -10;
                    hl.i = null;
                    try {
                        launchActivity.setRequestedOrientation(i);
                        launchActivity.setRequestedOrientation(i2);
                        return;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return;
                    }
                }
                return;
            case 6:
                String str7 = LaunchActivity.C1;
                if (launchActivity.W0) {
                    launchActivity.W0 = false;
                    launchActivity.H(false, false, true);
                    return;
                }
                return;
            case 7:
                String str8 = LaunchActivity.C1;
                ArrayList arrayList = launchActivity.e0;
                ArrayList arrayList2 = launchActivity.f0;
                if (hl.O1()) {
                    if (!arrayList2.isEmpty()) {
                        eVar = (e) c00.g(1, arrayList2);
                    }
                } else if (!arrayList.isEmpty()) {
                    eVar = (e) c00.g(1, arrayList);
                }
                if (!(eVar instanceof ProxyListActivity) && !(eVar instanceof ox8)) {
                    launchActivity.t0(new ProxyListActivity());
                    return;
                }
                return;
            case 8:
                String str9 = LaunchActivity.C1;
                launchActivity.H(false, true, false);
                if (LaunchActivity.Q() != null && LaunchActivity.Q().getLastStoryViewer() != null) {
                    LaunchActivity.Q().getLastStoryViewer().U();
                    return;
                }
                return;
            case 9:
                String str10 = LaunchActivity.C1;
                launchActivity.t0(new q86());
                return;
            case 10:
                String str11 = LaunchActivity.C1;
                launchActivity.u1 = null;
                return;
            default:
                String str12 = LaunchActivity.C1;
                if (launchActivity.T0 != null) {
                    File file = new File(a.h(), qu6.p(new StringBuilder("remote"), launchActivity.T0.id, ".attheme"));
                    TLRPC.TL_theme tL_theme = launchActivity.T0;
                    znb u = aob.u(file, tL_theme.title, tL_theme, true);
                    if (u != null) {
                        launchActivity.t0(new pqb(u, true, 0, false, false));
                    }
                    launchActivity.i0();
                    return;
                }
                return;
        }
    }
}

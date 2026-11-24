package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
public final class ez5 implements vc7 {
    public final LaunchActivity a;
    public final int b;
    public final cj3 c;
    public final boolean d;
    public final ArrayList e;
    public final Uri f;
    public final hd h;

    public ez5(LaunchActivity launchActivity, int i, cj3 cj3Var, boolean z, ArrayList arrayList, Uri uri, hd hdVar) {
        this.a = launchActivity;
        this.b = i;
        this.c = cj3Var;
        this.d = z;
        this.e = arrayList;
        this.f = uri;
        this.h = hdVar;
    }

    @Override
    public final void run(long j) {
        boolean z;
        hd hdVar = this.h;
        String str = LaunchActivity.C1;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        LaunchActivity launchActivity = this.a;
        boolean z2 = false;
        if (i != 0) {
            Bundle l = ir2.l("scrollToTopOnResume", true);
            if (!gl.O1()) {
                kk7.f(this.b).k(kk7.s, new Object[0]);
            }
            if (cf3.D(j)) {
                l.putLong("user_id", j);
            } else {
                l.putLong("chat_id", -j);
            }
            mu1 mu1Var = new mu1(l);
            mu1Var.O9 = true;
            ui5 N = launchActivity.N();
            cj3 cj3Var = this.c;
            if (cj3Var == null && !this.d) {
                z = false;
            } else {
                z = true;
            }
            if (cj3Var == null) {
                z2 = true;
            }
            ((ActionBarLayout) N).U(mu1Var, z, z2);
        } else {
            ArrayList arrayList = this.e;
            launchActivity.X = arrayList;
            if (arrayList == null) {
                arrayList = new ArrayList();
                launchActivity.X = arrayList;
            }
            arrayList.add(0, this.f);
            launchActivity.j0(true);
        }
        try {
            hdVar.dismiss();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}

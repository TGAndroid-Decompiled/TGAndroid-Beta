package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
public final class e16 implements xe7 {
    public final LaunchActivity a;
    public final int b;
    public final nk3 c;
    public final boolean d;
    public final ArrayList e;
    public final Uri f;
    public final he h;

    public e16(LaunchActivity launchActivity, int i, nk3 nk3Var, boolean z, ArrayList arrayList, Uri uri, he heVar) {
        this.a = launchActivity;
        this.b = i;
        this.c = nk3Var;
        this.d = z;
        this.e = arrayList;
        this.f = uri;
        this.h = heVar;
    }

    @Override
    public final void run(long j) {
        boolean z;
        he heVar = this.h;
        String str = LaunchActivity.C1;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        LaunchActivity launchActivity = this.a;
        boolean z2 = false;
        if (i != 0) {
            Bundle l = ts2.l("scrollToTopOnResume", true);
            if (!gm.O1()) {
                nm7.f(this.b).k(nm7.s, new Object[0]);
            }
            if (pg3.D(j)) {
                l.putLong("user_id", j);
            } else {
                l.putLong("chat_id", -j);
            }
            yv1 yv1Var = new yv1(l);
            yv1Var.O9 = true;
            tk5 N = launchActivity.N();
            nk3 nk3Var = this.c;
            if (nk3Var == null && !this.d) {
                z = false;
            } else {
                z = true;
            }
            if (nk3Var == null) {
                z2 = true;
            }
            ((ActionBarLayout) N).U(yv1Var, z, z2);
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
            heVar.dismiss();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}

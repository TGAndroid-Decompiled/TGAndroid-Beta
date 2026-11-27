package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
public final class e16 implements ff7 {
    public final LaunchActivity a;
    public final int b;
    public final uj3 c;
    public final boolean d;
    public final ArrayList e;
    public final Uri f;
    public final id h;

    public e16(LaunchActivity launchActivity, int i, uj3 uj3Var, boolean z, ArrayList arrayList, Uri uri, id idVar) {
        this.a = launchActivity;
        this.b = i;
        this.c = uj3Var;
        this.d = z;
        this.e = arrayList;
        this.f = uri;
        this.h = idVar;
    }

    @Override
    public final void run(long j) {
        boolean z;
        id idVar = this.h;
        String str = LaunchActivity.C1;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        LaunchActivity launchActivity = this.a;
        boolean z2 = false;
        if (i != 0) {
            Bundle l = bs2.l("scrollToTopOnResume", true);
            if (!hl.O1()) {
                jn7.f(this.b).k(jn7.s, new Object[0]);
            }
            if (wf3.D(j)) {
                l.putLong("user_id", j);
            } else {
                l.putLong("chat_id", -j);
            }
            zu1 zu1Var = new zu1(l);
            zu1Var.O9 = true;
            wk5 N = launchActivity.N();
            uj3 uj3Var = this.c;
            if (uj3Var == null && !this.d) {
                z = false;
            } else {
                z = true;
            }
            if (uj3Var == null) {
                z2 = true;
            }
            ((ActionBarLayout) N).U(zu1Var, z, z2);
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
            idVar.dismiss();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}

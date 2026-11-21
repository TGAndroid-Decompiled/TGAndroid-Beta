package ai;

import android.app.Activity;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ma;
import di.f6;
import java.util.Arrays;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Dictation.DictationAsr;
public final class v2 implements Runnable {
    public final int f1574a;
    public final z2 f1575b;

    public v2(z2 z2Var, int i7) {
        this.f1574a = i7;
        this.f1575b = z2Var;
    }

    @Override
    public final void run() {
        int i7 = this.f1574a;
        z2 z2Var = this.f1575b;
        switch (i7) {
            case 0:
                if (!Arrays.equals(z2Var.h, DictationAsr.E()) && z2Var.getParentActivity() != null && z2Var.f34683a != null) {
                    z2Var.d0(z2Var.getParentActivity());
                    z2Var.f34683a.f35796g3.O(true);
                    return;
                }
                z2Var.e0();
                return;
            default:
                Activity parentActivity = z2Var.getParentActivity();
                h6 resourceProvider = z2Var.getResourceProvider();
                t2 t2Var = new t2(parentActivity, 0);
                t2Var.setOrientation(1);
                t2Var.addView(new u2(parentActivity, resourceProvider), ma.t(-1, 120, 1, 0, 16, 0, 10));
                TextView textView = new TextView(parentActivity);
                textView.setTextSize(1, 20.0f);
                textView.setTextColor(m6.w0(m6.f29486j5, resourceProvider));
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setGravity(1);
                textView.setText(gd.N0(2131745039, null));
                t2Var.addView(textView, ma.t(-1, -2, 1, 32, 0, 32, 9));
                TextView textView2 = new TextView(parentActivity);
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(m6.w0(m6.f29789z6, resourceProvider));
                textView2.setGravity(1);
                textView2.setText(gd.N0(2131745040, null));
                t2Var.addView(textView2, ma.t(-1, -2, 1, 32, 0, 32, 25));
                t2Var.addView(a8.i1.a(parentActivity, resourceProvider, 2131232025, gd.N0(2131745042, null), gd.N0(2131745041, null)), ma.t(-1, -2, 7, 32, 0, 32, 16));
                t2Var.addView(a8.i1.a(parentActivity, resourceProvider, 2131231861, gd.N0(2131745044, null), gd.N0(2131745043, null)), ma.t(-1, -2, 7, 32, 0, 32, 16));
                t2Var.addView(a8.i1.a(parentActivity, resourceProvider, 2131232024, gd.N0(2131745047, null), gd.N0(2131745046, null)), ma.t(-1, -2, 7, 32, 0, 32, 16));
                hi.e eVar = new hi.e(parentActivity, resourceProvider, true);
                eVar.setRoundRadius(24);
                eVar.i(f6.t2("👌 " + gd.N0(2131749355, null)), false, true);
                eVar.setOnClickListener(new s2(r4, 0));
                t2Var.addView(eVar, ma.k(14.0f, 18.0f, 14.0f, 0.0f, -1, 48));
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                frameLayout.addView(t2Var, ma.e(-1, -2, 1));
                org.telegram.ui.ActionBar.w2 j3 = n10.j(parentActivity, false, 1, resourceProvider);
                j3.O = frameLayout;
                j3.V0 = 49;
                j3.show();
                org.telegram.ui.ActionBar.w2[] w2VarArr = {j3};
                j3.Q(m6.f29451h5);
                return;
        }
    }
}

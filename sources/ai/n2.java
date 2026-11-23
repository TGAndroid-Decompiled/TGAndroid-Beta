package ai;

import android.app.Activity;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.na;
import di.f6;
import java.util.Arrays;
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Dictation.DictationAsr;
public final class n2 implements Runnable {
    public final int f1390a;
    public final r2 f1391b;

    public n2(r2 r2Var, int i7) {
        this.f1390a = i7;
        this.f1391b = r2Var;
    }

    @Override
    public final void run() {
        int i7 = this.f1390a;
        r2 r2Var = this.f1391b;
        switch (i7) {
            case 0:
                if (!Arrays.equals(r2Var.h, DictationAsr.H()) && r2Var.getParentActivity() != null && r2Var.f34213a != null) {
                    r2Var.d0(r2Var.getParentActivity());
                    r2Var.f34213a.f35323g3.O(true);
                    return;
                }
                r2Var.e0();
                return;
            default:
                Activity parentActivity = r2Var.getParentActivity();
                i6 resourceProvider = r2Var.getResourceProvider();
                l2 l2Var = new l2(parentActivity, 0);
                l2Var.setOrientation(1);
                l2Var.addView(new m2(parentActivity, resourceProvider), na.t(-1, 120, 1, 0, 16, 0, 10));
                TextView textView = new TextView(parentActivity);
                textView.setTextSize(1, 20.0f);
                textView.setTextColor(n6.w0(n6.f29559j5, resourceProvider));
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setGravity(1);
                textView.setText(gd.N0(2131745039, null));
                l2Var.addView(textView, na.t(-1, -2, 1, 32, 0, 32, 9));
                TextView textView2 = new TextView(parentActivity);
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(n6.w0(n6.f29862z6, resourceProvider));
                textView2.setGravity(1);
                textView2.setText(gd.N0(2131745040, null));
                l2Var.addView(textView2, na.t(-1, -2, 1, 32, 0, 32, 25));
                l2Var.addView(a8.j1.a(parentActivity, resourceProvider, 2131232028, gd.N0(2131745042, null), gd.N0(2131745041, null)), na.t(-1, -2, 7, 32, 0, 32, 16));
                l2Var.addView(a8.j1.a(parentActivity, resourceProvider, 2131231864, gd.N0(2131745044, null), gd.N0(2131745043, null)), na.t(-1, -2, 7, 32, 0, 32, 16));
                l2Var.addView(a8.j1.a(parentActivity, resourceProvider, 2131232027, gd.N0(2131745047, null), gd.N0(2131745046, null)), na.t(-1, -2, 7, 32, 0, 32, 16));
                hi.e eVar = new hi.e(parentActivity, resourceProvider, true);
                eVar.setRoundRadius(24);
                eVar.i(f6.t2("👌 " + gd.N0(2131749355, null)), false, true);
                eVar.setOnClickListener(new k2(r4, 0));
                l2Var.addView(eVar, na.k(14.0f, 18.0f, 14.0f, 0.0f, -1, 48));
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                frameLayout.addView(l2Var, na.e(-1, -2, 1));
                w2 j3 = m10.j(parentActivity, false, 1, resourceProvider);
                j3.O = frameLayout;
                j3.V0 = 49;
                j3.show();
                w2[] w2VarArr = {j3};
                j3.Q(n6.f29524h5);
                return;
        }
    }
}

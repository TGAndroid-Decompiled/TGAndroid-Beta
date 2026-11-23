package ai;

import android.app.Activity;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.na;
import di.f6;
import java.util.Arrays;
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Dictation.DictationAsr;
public final class m2 implements Runnable {
    public final int f1376a;
    public final q2 f1377b;

    public m2(q2 q2Var, int i7) {
        this.f1376a = i7;
        this.f1377b = q2Var;
    }

    @Override
    public final void run() {
        int i7 = this.f1376a;
        q2 q2Var = this.f1377b;
        switch (i7) {
            case 0:
                if (!Arrays.equals(q2Var.h, DictationAsr.D()) && q2Var.getParentActivity() != null && q2Var.f34671a != null) {
                    q2Var.d0(q2Var.getParentActivity());
                    q2Var.f34671a.f35742g3.O(true);
                    return;
                }
                q2Var.e0();
                return;
            default:
                Activity parentActivity = q2Var.getParentActivity();
                h6 resourceProvider = q2Var.getResourceProvider();
                k2 k2Var = new k2(parentActivity, 0);
                k2Var.setOrientation(1);
                k2Var.addView(new l2(parentActivity, resourceProvider), na.t(-1, 120, 1, 0, 16, 0, 10));
                TextView textView = new TextView(parentActivity);
                textView.setTextSize(1, 20.0f);
                textView.setTextColor(m6.w0(m6.f29455j5, resourceProvider));
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setGravity(1);
                textView.setText(hd.N0(2131745039, null));
                k2Var.addView(textView, na.t(-1, -2, 1, 32, 0, 32, 9));
                TextView textView2 = new TextView(parentActivity);
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(m6.w0(m6.f29758z6, resourceProvider));
                textView2.setGravity(1);
                textView2.setText(hd.N0(2131745040, null));
                k2Var.addView(textView2, na.t(-1, -2, 1, 32, 0, 32, 25));
                k2Var.addView(a8.j1.a(parentActivity, resourceProvider, 2131232025, hd.N0(2131745042, null), hd.N0(2131745041, null)), na.t(-1, -2, 7, 32, 0, 32, 16));
                k2Var.addView(a8.j1.a(parentActivity, resourceProvider, 2131231861, hd.N0(2131745044, null), hd.N0(2131745043, null)), na.t(-1, -2, 7, 32, 0, 32, 16));
                k2Var.addView(a8.j1.a(parentActivity, resourceProvider, 2131232024, hd.N0(2131745047, null), hd.N0(2131745046, null)), na.t(-1, -2, 7, 32, 0, 32, 16));
                hi.d dVar = new hi.d(parentActivity, resourceProvider, true);
                dVar.setRoundRadius(24);
                dVar.i(f6.t2("👌 " + hd.N0(2131749355, null)), false, true);
                dVar.setOnClickListener(new j2(r4, 0));
                k2Var.addView(dVar, na.k(14.0f, 18.0f, 14.0f, 0.0f, -1, 48));
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                frameLayout.addView(k2Var, na.e(-1, -2, 1));
                w2 j3 = o10.j(parentActivity, false, 1, resourceProvider);
                j3.O = frameLayout;
                j3.V0 = 49;
                j3.show();
                w2[] w2VarArr = {j3};
                j3.Q(m6.f29420h5);
                return;
        }
    }
}

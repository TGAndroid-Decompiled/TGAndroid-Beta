package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Dictation.DictationAsr;
public final class toa implements View.OnClickListener {
    public final byte a;
    public final woa b;

    public toa(woa woaVar, byte b) {
        this.a = b;
        this.b = woaVar;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        woa woaVar = this.b;
        switch (b) {
            case 0:
                DictationAsr.c0(!DictationAsr.y());
                woaVar.f0();
                return;
            default:
                Activity parentActivity = woaVar.getParentActivity();
                vnb resourceProvider = woaVar.getResourceProvider();
                int i = aob.N6;
                u1 u1Var = new u1((byte) 10, parentActivity, false);
                u1Var.setOrientation(1);
                u1Var.addView(new qoa(i, resourceProvider, parentActivity), tre.t(-1, 120, 1, 0, 16, 0, 10));
                TextView textView = new TextView(parentActivity);
                textView.setTextSize(1, 20.0f);
                int i2 = aob.j5;
                textView.setTextColor(aob.v0(i2, resourceProvider));
                textView.setTypeface(hl.o());
                textView.setGravity(1);
                textView.setText(ob6.M0(2131744942, null));
                u1Var.addView(textView, tre.t(-1, -2, 1, 32, 0, 32, 9));
                TextView textView2 = new TextView(parentActivity);
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(aob.v0(aob.z6, resourceProvider));
                textView2.setGravity(1);
                textView2.setText(ob6.M0(2131744943, null));
                u1Var.addView(textView2, tre.t(-1, -2, 1, 32, 0, 32, 25));
                int v0 = aob.v0(i2, resourceProvider);
                u1Var.addView(cze.a(parentActivity, resourceProvider, 2131232767, v0, ob6.M0(2131744953, null), ob6.M0(2131744952, null)), tre.t(-1, -2, 7, 32, 0, 32, 16));
                u1Var.addView(cze.a(parentActivity, resourceProvider, 2131232765, v0, ob6.M0(2131744949, null), ob6.M0(2131744948, null)), tre.t(-1, -2, 7, 32, 0, 32, 16));
                u1Var.addView(cze.a(parentActivity, resourceProvider, 2131232766, v0, ob6.M0(2131744951, null), ob6.M0(2131744950, null)), tre.t(-1, -2, 7, 32, 0, 32, 16));
                c51 c51Var = new c51(resourceProvider, parentActivity, true);
                c51Var.setRoundRadius(24);
                c51Var.i(wua.l2(ob6.M0(2131743543, null)), false, true);
                c51Var.setOnClickListener(new g5(r1, (byte) 3));
                u1Var.addView(c51Var, tre.k(14.0f, 18.0f, 14.0f, 0.0f, -1, 48));
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                frameLayout.addView(u1Var, tre.e(-1, -2, 1));
                nx0 i3 = ik8.i(parentActivity, false, 1, resourceProvider);
                i3.O = frameLayout;
                i3.U0 = (byte) 49;
                i3.show();
                nx0[] nx0VarArr = {i3};
                i3.L(aob.h5);
                return;
        }
    }
}

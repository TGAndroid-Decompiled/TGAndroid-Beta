package defpackage;

import android.app.Activity;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Arrays;
import org.telegram.ui.Dictation.DictationAsr;
public final class yma implements Runnable {
    public final byte a;
    public final ana b;

    public yma(ana anaVar, byte b) {
        this.a = b;
        this.b = anaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ana anaVar = this.b;
        switch (b) {
            case 0:
                if (!Arrays.equals(anaVar.h, DictationAsr.G()) && anaVar.getParentActivity() != null && anaVar.a != null) {
                    anaVar.d0(anaVar.getParentActivity());
                    anaVar.a.g3.O(true);
                    return;
                }
                anaVar.e0();
                return;
            default:
                Activity parentActivity = anaVar.getParentActivity();
                ylb resourceProvider = anaVar.getResourceProvider();
                t1 t1Var = new t1((byte) 10, parentActivity, false);
                t1Var.setOrientation(1);
                t1Var.addView(new xma(parentActivity, resourceProvider), qoe.t(-1, 120, 1, 0, 16, 0, 10));
                TextView textView = new TextView(parentActivity);
                textView.setTextSize(1, 20.0f);
                textView.setTextColor(cmb.v0(cmb.i5, resourceProvider));
                textView.setTypeface(gm.o());
                textView.setGravity(1);
                textView.setText(jb6.M0(2131744969, null));
                t1Var.addView(textView, qoe.t(-1, -2, 1, 32, 0, 32, 9));
                TextView textView2 = new TextView(parentActivity);
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(cmb.v0(cmb.y6, resourceProvider));
                textView2.setGravity(1);
                textView2.setText(jb6.M0(2131744970, null));
                t1Var.addView(textView2, qoe.t(-1, -2, 1, 32, 0, 32, 25));
                t1Var.addView(mwe.a(parentActivity, resourceProvider, 2131232029, jb6.M0(2131744972, null), jb6.M0(2131744971, null)), qoe.t(-1, -2, 7, 32, 0, 32, 16));
                t1Var.addView(mwe.a(parentActivity, resourceProvider, 2131231865, jb6.M0(2131744974, null), jb6.M0(2131744973, null)), qoe.t(-1, -2, 7, 32, 0, 32, 16));
                t1Var.addView(mwe.a(parentActivity, resourceProvider, 2131232028, jb6.M0(2131744977, null), jb6.M0(2131744976, null)), qoe.t(-1, -2, 7, 32, 0, 32, 16));
                b61 b61Var = new b61(resourceProvider, parentActivity, true);
                b61Var.setRoundRadius(24);
                b61Var.i(wsa.k2("👌 ".concat(jb6.M0(2131749305, null))), false, true);
                b61Var.setOnClickListener(new f5(r2, (byte) 3));
                t1Var.addView(b61Var, qoe.k(14.0f, 18.0f, 14.0f, 0.0f, -1, 48));
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                frameLayout.addView(t1Var, qoe.e(-1, -2, 1));
                my0 i = wi8.i(parentActivity, false, 1, resourceProvider);
                i.O = frameLayout;
                i.U0 = (byte) 49;
                i.show();
                my0[] my0VarArr = {i};
                i.L(cmb.g5);
                return;
        }
    }
}

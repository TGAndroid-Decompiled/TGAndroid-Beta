package defpackage;

import android.app.Activity;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Arrays;
import org.telegram.ui.Dictation.DictationAsr;
public final class xka implements Runnable {
    public final byte a;
    public final zka b;

    public xka(zka zkaVar, byte b) {
        this.a = b;
        this.b = zkaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        zka zkaVar = this.b;
        switch (b) {
            case 0:
                if (!Arrays.equals(zkaVar.h, DictationAsr.G()) && zkaVar.getParentActivity() != null && zkaVar.a != null) {
                    zkaVar.c0(zkaVar.getParentActivity());
                    zkaVar.a.g3.O(true);
                    return;
                }
                zkaVar.d0();
                return;
            default:
                Activity parentActivity = zkaVar.getParentActivity();
                wjb resourceProvider = zkaVar.getResourceProvider();
                t1 t1Var = new t1((byte) 10, parentActivity, false);
                t1Var.setOrientation(1);
                t1Var.addView(new wka(parentActivity, resourceProvider), nme.t(-1, 120, 1, 0, 16, 0, 10));
                TextView textView = new TextView(parentActivity);
                textView.setTextSize(1, 20.0f);
                textView.setTextColor(bkb.v0(bkb.i5, resourceProvider));
                textView.setTypeface(gl.o());
                textView.setGravity(1);
                textView.setText(k96.M0(2131745043, null));
                t1Var.addView(textView, nme.t(-1, -2, 1, 32, 0, 32, 9));
                TextView textView2 = new TextView(parentActivity);
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(bkb.v0(bkb.y6, resourceProvider));
                textView2.setGravity(1);
                textView2.setText(k96.M0(2131745044, null));
                t1Var.addView(textView2, nme.t(-1, -2, 1, 32, 0, 32, 25));
                t1Var.addView(jue.a(parentActivity, resourceProvider, 2131232028, k96.M0(2131745046, null), k96.M0(2131745045, null)), nme.t(-1, -2, 7, 32, 0, 32, 16));
                t1Var.addView(jue.a(parentActivity, resourceProvider, 2131231864, k96.M0(2131745048, null), k96.M0(2131745047, null)), nme.t(-1, -2, 7, 32, 0, 32, 16));
                t1Var.addView(jue.a(parentActivity, resourceProvider, 2131232027, k96.M0(2131745051, null), k96.M0(2131745050, null)), nme.t(-1, -2, 7, 32, 0, 32, 16));
                u41 u41Var = new u41(resourceProvider, parentActivity, true);
                u41Var.setRoundRadius(24);
                u41Var.i(vqa.k2("👌 ".concat(k96.M0(2131749356, null))), false, true);
                u41Var.setOnClickListener(new f5(r2, (byte) 3));
                t1Var.addView(u41Var, nme.k(14.0f, 18.0f, 14.0f, 0.0f, -1, 48));
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                frameLayout.addView(t1Var, nme.e(-1, -2, 1));
                fx0 i = ug8.i(parentActivity, false, 1, resourceProvider);
                i.O = frameLayout;
                i.U0 = (byte) 49;
                i.show();
                fx0[] fx0VarArr = {i};
                i.M(bkb.g5);
                return;
        }
    }
}

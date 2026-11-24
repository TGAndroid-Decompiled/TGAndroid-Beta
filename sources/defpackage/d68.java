package defpackage;

import android.animation.AnimatorSet;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class d68 extends my0 {
    public static final int I1 = 0;
    public final int A1;
    public final int B1;
    public final int C1;
    public final boolean D1;
    public n32 E1;
    public final ArrayList F1;
    public final ArrayList G1;
    public final TLRPC.TL_userContact_old2 H1;
    public final lj4 l1;
    public final w58 m1;
    public final LinearLayout n1;
    public final x58 o1;
    public final View p1;
    public final View q1;
    public final TextView r1;
    public final d s1;
    public boolean t1;
    public final Paint u1;
    public int v1;
    public AnimatorSet w1;
    public AnimatorSet x1;
    public final int y1;
    public final int z1;

    public d68(org.telegram.ui.ActionBar.d r19, defpackage.yv2 r20, org.telegram.tgnet.TLRPC.User r21, android.net.Uri r22, java.io.File r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, final defpackage.ylb r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d68.<init>(org.telegram.ui.ActionBar.d, yv2, org.telegram.tgnet.TLRPC$User, android.net.Uri, java.io.File, java.lang.String, java.lang.String, java.lang.String, ylb):void");
    }

    @Override
    public final boolean C() {
        return false;
    }

    public final void D0() {
        TextView textView = this.r1;
        if (textView != null) {
            int v0 = cmb.v0(cmb.Ii, this.J0);
            if (!textView.isEnabled()) {
                v0 &= Integer.MAX_VALUE;
            }
            if (textView.getCurrentTextColor() != v0) {
                textView.setTextColor(v0);
            }
        }
    }

    public final void E0(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d68.E0(boolean):void");
    }

    @Override
    public final void onStart() {
        super.onStart();
        u31.a((FrameLayout) this.b, new oz((byte) 10));
    }

    @Override
    public final void onStop() {
        super.onStop();
        u31.h((FrameLayout) this.b);
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            D0();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}

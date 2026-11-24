package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class ha1 extends FrameLayout implements vlb {
    public final ut8 a;
    public final mu8 b;
    public TLRPC.Chat c;

    public ha1(Context context) {
        super(context);
        int i;
        int L;
        String M0 = jb6.M0(2131743126, null);
        mu8 mu8Var = new mu8(context);
        this.b = mu8Var;
        int ceil = (int) Math.ceil(mu8Var.getPaint().measureText(M0));
        ut8 ut8Var = new ut8(context, null);
        this.a = ut8Var;
        ut8Var.N0 = true;
        ut8Var.F0 = true;
        if (jb6.a0) {
            i = gm.L(44.0f) + ceil;
        } else {
            i = 0;
        }
        if (jb6.a0) {
            L = 0;
        } else {
            L = gm.L(44.0f) + ceil;
        }
        ut8Var.setPadding(i, 0, L, 0);
        ut8Var.c0 = 0;
        ut8Var.d0 = -gm.L(4.0f);
        addView(ut8Var, qoe.c(-1.0f, -1));
        mu8Var.setText(M0);
        mu8Var.setTextSize(1, 14.0f);
        anb.X(mu8Var, cmb.Ii, null);
        mu8Var.setProgressColor(cmb.w0(null, cmb.Di, false));
        int i2 = cmb.Xl;
        int w0 = cmb.w0(null, i2, false);
        cmb.w0(null, cmb.Gi, false);
        mu8Var.setBackground(ulb.e(w0, 16.0f));
        Drawable background = mu8Var.getBackground();
        wmb M = anb.M(i2);
        mu8Var.setBackground(background);
        anb.j(mu8Var, background, M, null, null);
        mu8Var.setPadding(gm.L(14.0f), 0, gm.L(14.0f), 0);
        addView(mu8Var, qoe.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
    }

    @Override
    public final void updateColors() {
        try {
            this.b.setProgressColor(cmb.w0(null, cmb.Di, false));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z13 extends q59 {
    public final a23 c;

    public z13(a23 a23Var) {
        this.c = a23Var;
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (u69Var.f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        a23 a23Var = this.c;
        if (a23Var.U1) {
            return a23Var.T1.size() + 3;
        }
        if (a23Var.V1) {
            return 2;
        }
        return 1;
    }

    @Override
    public final int d(int i) {
        if (i != 0) {
            if (i == 1) {
                return 1;
            }
            if (i == 2) {
                return 2;
            }
            return 3;
        }
        return 0;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        TLObject L0;
        String str;
        boolean z;
        int i2 = u69Var.f;
        View view = u69Var.a;
        boolean z2 = true;
        if (i2 == 3) {
            a23 a23Var = this.c;
            TLRPC.Peer peer = (TLRPC.Peer) a23Var.T1.get(i - 3);
            long B1 = k47.B1(peer);
            int i3 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
            int i4 = a23Var.a;
            if (i3 > 0) {
                L0 = oc7.r1(i4).W1(Long.valueOf(B1));
                str = jb6.M0(2131743033, null);
            } else {
                L0 = oc7.r1(i4).L0(Long.valueOf(-B1));
                str = null;
            }
            xc5 xc5Var = (xc5) view;
            if (i != b() - 1) {
                z = true;
            } else {
                z = false;
            }
            xc5Var.e(L0, null, str, z);
            if (peer != a23Var.Y1) {
                z2 = false;
            }
            xc5Var.c(z2, false);
        } else if (i2 == 2) {
            jf5 jf5Var = (jf5) view;
            jf5Var.setTextSize(15.0f);
            jf5Var.setPadding(0, 0, 0, gm.L(2.0f));
            jf5Var.setText(jb6.M0(2131743127, null).replace(":", ""));
        } else if (i2 == 1) {
            ((njb) view).setText(gm.E2(gm.N2(jb6.M0(2131743114, null), cmb.K6, 0, new xf2(this, (byte) 18), null), true, gm.L(1.0f), gm.L(1.0f)));
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        String a0;
        String a02;
        Context context = viewGroup.getContext();
        a23 a23Var = this.c;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    boolean z = a23Var.W1;
                    ?? t1Var = new t1((byte) 5, context, false);
                    t1Var.setOrientation(1);
                    ?? imageView = new ImageView(context);
                    imageView.setAutoRepeat(true);
                    imageView.f(2131624323, 112, 112, null);
                    imageView.d();
                    t1Var.addView(imageView, qoe.t(112, 112, 49, 0, 24, 0, 0));
                    TextView textView = new TextView(context);
                    textView.setTypeface(gm.o());
                    if (z) {
                        a0 = jb6.a0(null, null, 2131744592, new Object[0]);
                    } else {
                        a0 = jb6.a0(null, null, 2131744589, new Object[0]);
                    }
                    textView.setText(a0);
                    textView.setTextSize(1, 20.0f);
                    anb.X(textView, cmb.F6, null);
                    t1Var.addView(textView, qoe.t(-2, -2, 1, 0, 14, 0, 7));
                    TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(1);
                    anb.X(textView2, cmb.i5, null);
                    if (z) {
                        a02 = jb6.a0(null, null, 2131743142, new Object[0]);
                    } else {
                        a02 = jb6.a0(null, null, 2131743017, new Object[0]);
                    }
                    textView2.setText(a02);
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    t1Var.addView(textView2, qoe.t(-2, -2, 1, 28, 0, 28, 17));
                    frameLayout = t1Var;
                } else {
                    frameLayout = new xc5(context, 1, 0, false);
                }
            } else {
                frameLayout = new jf5(context, 22);
            }
        } else {
            njb njbVar = new njb(context);
            anb.h(cmb.Z6, a23Var.J0, njbVar);
            njbVar.setTopPadding(17);
            njbVar.setBottomPadding(17);
            frameLayout = njbVar;
        }
        frameLayout.setLayoutParams(new g69(-1, -2));
        return new u69(frameLayout);
    }
}

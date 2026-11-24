package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n03 extends n39 {
    public final o03 c;

    public n03(o03 o03Var) {
        this.c = o03Var;
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (s49Var.f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        o03 o03Var = this.c;
        if (o03Var.U1) {
            return o03Var.T1.size() + 3;
        }
        if (o03Var.V1) {
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
    public final void t(s49 s49Var, int i) {
        TLObject K0;
        String str;
        boolean z;
        int i2 = s49Var.f;
        View view = s49Var.a;
        boolean z2 = true;
        if (i2 == 3) {
            o03 o03Var = this.c;
            TLRPC.Peer peer = (TLRPC.Peer) o03Var.T1.get(i - 3);
            long B1 = k27.B1(peer);
            int i3 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
            int i4 = o03Var.a;
            if (i3 > 0) {
                K0 = na7.q1(i4).V1(Long.valueOf(B1));
                str = k96.M0(2131743107, null);
            } else {
                K0 = na7.q1(i4).K0(Long.valueOf(-B1));
                str = null;
            }
            za5 za5Var = (za5) view;
            if (i != b() - 1) {
                z = true;
            } else {
                z = false;
            }
            za5Var.e(K0, null, str, z);
            if (peer != o03Var.Y1) {
                z2 = false;
            }
            za5Var.c(z2, false);
        } else if (i2 == 2) {
            ld5 ld5Var = (ld5) view;
            ld5Var.setTextSize(15.0f);
            ld5Var.setPadding(0, 0, 0, gl.L(2.0f));
            ld5Var.setText(k96.M0(2131743201, null).replace(":", ""));
        } else if (i2 == 1) {
            ((mhb) view).setText(gl.E2(gl.N2(k96.M0(2131743188, null), bkb.K6, 0, new mk2(this, (byte) 13), null), true, gl.L(1.0f), gl.L(1.0f)));
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        String a0;
        String a02;
        Context context = viewGroup.getContext();
        o03 o03Var = this.c;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    boolean z = o03Var.W1;
                    ?? t1Var = new t1((byte) 5, context, false);
                    t1Var.setOrientation(1);
                    ?? imageView = new ImageView(context);
                    imageView.setAutoRepeat(true);
                    imageView.f(2131624322, 112, 112, null);
                    imageView.d();
                    t1Var.addView(imageView, nme.t(112, 112, 49, 0, 24, 0, 0));
                    TextView textView = new TextView(context);
                    textView.setTypeface(gl.o());
                    if (z) {
                        a0 = k96.a0(null, null, 2131744666, new Object[0]);
                    } else {
                        a0 = k96.a0(null, null, 2131744663, new Object[0]);
                    }
                    textView.setText(a0);
                    textView.setTextSize(1, 20.0f);
                    zkb.X(textView, bkb.F6, null);
                    t1Var.addView(textView, nme.t(-2, -2, 1, 0, 14, 0, 7));
                    TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(1);
                    zkb.X(textView2, bkb.i5, null);
                    if (z) {
                        a02 = k96.a0(null, null, 2131743216, new Object[0]);
                    } else {
                        a02 = k96.a0(null, null, 2131743091, new Object[0]);
                    }
                    textView2.setText(a02);
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    t1Var.addView(textView2, nme.t(-2, -2, 1, 28, 0, 28, 17));
                    frameLayout = t1Var;
                } else {
                    frameLayout = new za5(context, 1, 0, false);
                }
            } else {
                frameLayout = new ld5(context, 22);
            }
        } else {
            mhb mhbVar = new mhb(context);
            zkb.h(bkb.Z6, o03Var.J0, mhbVar);
            mhbVar.setTopPadding(17);
            mhbVar.setBottomPadding(17);
            frameLayout = mhbVar;
        }
        frameLayout.setLayoutParams(new e49(-1, -2));
        return new s49(frameLayout);
    }
}

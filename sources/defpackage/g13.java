package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g13 extends c79 {
    public final h13 c;

    public g13(h13 h13Var) {
        this.c = h13Var;
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        h13 h13Var = this.c;
        if (h13Var.U1) {
            return h13Var.T1.size() + 3;
        }
        if (h13Var.V1) {
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
    public final void t(f89 f89Var, int i) {
        TLObject M0;
        String str;
        boolean z;
        int i2 = f89Var.f;
        View view = f89Var.a;
        boolean z2 = true;
        if (i2 == 3) {
            h13 h13Var = this.c;
            TLRPC.Peer peer = (TLRPC.Peer) h13Var.T1.get(i - 3);
            long B1 = r47.B1(peer);
            int i3 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
            int i4 = h13Var.a;
            if (i3 > 0) {
                M0 = uc7.s1(i4).X1(Long.valueOf(B1));
                str = ob6.M0(2131743001, null);
            } else {
                M0 = uc7.s1(i4).M0(Long.valueOf(-B1));
                str = null;
            }
            bd5 bd5Var = (bd5) view;
            if (i != b() - 1) {
                z = true;
            } else {
                z = false;
            }
            bd5Var.e(M0, null, str, z);
            if (peer != h13Var.Y1) {
                z2 = false;
            }
            bd5Var.c(z2, false);
        } else if (i2 == 2) {
            mf5 mf5Var = (mf5) view;
            mf5Var.setTextSize(15.0f);
            mf5Var.setPadding(0, 0, 0, hl.L(2.0f));
            mf5Var.setText(ob6.M0(2131743095, null).replace(":", ""));
        } else if (i2 == 1) {
            ((ilb) view).setText(hl.E2(hl.N2(ob6.M0(2131743082, null), aob.L6, 0, new vd2(this, (byte) 19), null), true, hl.L(1.0f), hl.L(1.0f)));
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        String a0;
        String a02;
        Context context = viewGroup.getContext();
        h13 h13Var = this.c;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    boolean z = h13Var.W1;
                    ?? u1Var = new u1((byte) 5, context, false);
                    u1Var.setOrientation(1);
                    ?? imageView = new ImageView(context);
                    imageView.setAutoRepeat(true);
                    imageView.f(2131624323, 112, 112, null);
                    imageView.d();
                    u1Var.addView(imageView, tre.t(112, 112, 49, 0, 24, 0, 0));
                    TextView textView = new TextView(context);
                    textView.setTypeface(hl.o());
                    if (z) {
                        a0 = ob6.a0(null, null, 2131744560, new Object[0]);
                    } else {
                        a0 = ob6.a0(null, null, 2131744557, new Object[0]);
                    }
                    textView.setText(a0);
                    textView.setTextSize(1, 20.0f);
                    yob.X(textView, aob.G6, null);
                    u1Var.addView(textView, tre.t(-2, -2, 1, 0, 14, 0, 7));
                    TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(1);
                    yob.X(textView2, aob.j5, null);
                    if (z) {
                        a02 = ob6.a0(null, null, 2131743110, new Object[0]);
                    } else {
                        a02 = ob6.a0(null, null, 2131742985, new Object[0]);
                    }
                    textView2.setText(a02);
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    u1Var.addView(textView2, tre.t(-2, -2, 1, 28, 0, 28, 17));
                    frameLayout = u1Var;
                } else {
                    frameLayout = new bd5(context, 1, 0, false);
                }
            } else {
                frameLayout = new mf5(context, 22);
            }
        } else {
            ilb ilbVar = new ilb(context);
            yob.h(aob.a7, h13Var.J0, ilbVar);
            ilbVar.setTopPadding(17);
            ilbVar.setBottomPadding(17);
            frameLayout = ilbVar;
        }
        frameLayout.setLayoutParams(new r79(-1, -2));
        return new f89(frameLayout);
    }
}

package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class dy5 implements Runnable {
    public final byte a;
    public final ry5 b;
    public final w44 c;

    public dy5(ry5 ry5Var, w44 w44Var, byte b) {
        this.a = b;
        this.b = ry5Var;
        this.c = w44Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        final w44 w44Var = this.c;
        final ry5 ry5Var = this.b;
        switch (b) {
            case 0:
                ry5Var.s0(w44Var);
                return;
            case 1:
                w44Var.m();
                ry5Var.t0(w44Var, true);
                return;
            default:
                LinearLayout linearLayout = new LinearLayout(ry5Var.getContext());
                linearLayout.setOrientation(0);
                TextView textView = new TextView(ry5Var.getContext());
                int i = cmb.D8;
                tx5 tx5Var = ry5Var.G1;
                anb.X(textView, i, tx5Var);
                textView.setBackground(cmb.L0(false));
                textView.setGravity(16);
                textView.setPadding(gm.L(16.0f), 0, gm.L(14.0f), 0);
                textView.setTextSize(1, 14.0f);
                textView.setTag(0);
                textView.setText(jb6.M0(2131747405, null));
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        byte b2 = r3;
                        w44 w44Var2 = w44Var;
                        ry5 ry5Var2 = ry5Var;
                        switch (b2) {
                            case 0:
                                ry5Var2.s0(w44Var2);
                                m8 m8Var = ry5Var2.H1;
                                if (m8Var != null && m8Var.isShowing()) {
                                    ry5Var2.H1.d(true);
                                    return;
                                }
                                return;
                            default:
                                ((z1b) w44Var2).r(true);
                                m8 m8Var2 = ry5Var2.H1;
                                if (m8Var2 != null && m8Var2.isShowing()) {
                                    ry5Var2.H1.d(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.addView(textView, qoe.o(-2, 48));
                if (w44Var instanceof xjb) {
                    TextView textView2 = new TextView(ry5Var.getContext());
                    anb.X(textView2, i, tx5Var);
                    textView2.setBackground(cmb.L0(false));
                    textView2.setGravity(16);
                    textView2.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setEllipsize(truncateAt);
                    textView2.setTag(1);
                    textView2.setText(jb6.M0(2131747403, null));
                    textView2.setOnClickListener(new sx5(ry5Var, (byte) 2));
                    linearLayout.addView(textView2, qoe.o(-2, 48));
                }
                if (w44Var instanceof z1b) {
                    TextView textView3 = new TextView(ry5Var.getContext());
                    anb.X(textView3, i, tx5Var);
                    textView3.setBackgroundDrawable(cmb.L0(false));
                    textView3.setGravity(16);
                    textView3.setEllipsize(truncateAt);
                    textView3.setPadding(gm.L(14.0f), 0, gm.L(16.0f), 0);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTag(2);
                    textView3.setText(jb6.M0(2131750622, null));
                    textView3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            byte b2 = r3;
                            w44 w44Var2 = w44Var;
                            ry5 ry5Var2 = ry5Var;
                            switch (b2) {
                                case 0:
                                    ry5Var2.s0(w44Var2);
                                    m8 m8Var = ry5Var2.H1;
                                    if (m8Var != null && m8Var.isShowing()) {
                                        ry5Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    ((z1b) w44Var2).r(true);
                                    m8 m8Var2 = ry5Var2.H1;
                                    if (m8Var2 != null && m8Var2.isShowing()) {
                                        ry5Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, qoe.o(-2, 48));
                }
                if (!(w44Var instanceof g88) && !(w44Var instanceof kd1)) {
                    TextView textView4 = new TextView(ry5Var.getContext());
                    anb.X(textView4, i, tx5Var);
                    textView4.setBackgroundDrawable(cmb.L0(false));
                    textView4.setGravity(16);
                    textView4.setEllipsize(truncateAt);
                    textView4.setPadding(gm.L(14.0f), 0, gm.L(16.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(jb6.M0(2131747404, null));
                    textView4.setOnClickListener(new sx5(ry5Var, (byte) 3));
                    linearLayout.addView(textView4, qoe.o(-2, 48));
                }
                ry5Var.I1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}

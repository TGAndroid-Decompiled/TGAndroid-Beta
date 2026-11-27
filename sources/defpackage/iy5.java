package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class iy5 implements Runnable {
    public final byte a;
    public final wy5 b;
    public final h44 c;

    public iy5(wy5 wy5Var, h44 h44Var, byte b) {
        this.a = b;
        this.b = wy5Var;
        this.c = h44Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        final h44 h44Var = this.c;
        final wy5 wy5Var = this.b;
        switch (b) {
            case 0:
                wy5Var.s0(h44Var);
                return;
            case 1:
                h44Var.m();
                wy5Var.t0(h44Var, true);
                return;
            default:
                LinearLayout linearLayout = new LinearLayout(wy5Var.getContext());
                linearLayout.setOrientation(0);
                TextView textView = new TextView(wy5Var.getContext());
                int i = aob.E8;
                yx5 yx5Var = wy5Var.A1;
                yob.X(textView, i, yx5Var);
                textView.setBackground(aob.L0(false));
                textView.setGravity(16);
                textView.setPadding(hl.L(16.0f), 0, hl.L(14.0f), 0);
                textView.setTextSize(1, 14.0f);
                textView.setTag(0);
                textView.setText(ob6.M0(2131747399, null));
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        byte b2 = r3;
                        h44 h44Var2 = h44Var;
                        wy5 wy5Var2 = wy5Var;
                        switch (b2) {
                            case 0:
                                wy5Var2.s0(h44Var2);
                                n8 n8Var = wy5Var2.B1;
                                if (n8Var != null && n8Var.isShowing()) {
                                    wy5Var2.B1.d(true);
                                    return;
                                }
                                return;
                            default:
                                ((w3b) h44Var2).r(true);
                                n8 n8Var2 = wy5Var2.B1;
                                if (n8Var2 != null && n8Var2.isShowing()) {
                                    wy5Var2.B1.d(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.addView(textView, tre.o(-2, 48));
                if (h44Var instanceof rlb) {
                    TextView textView2 = new TextView(wy5Var.getContext());
                    yob.X(textView2, i, yx5Var);
                    textView2.setBackground(aob.L0(false));
                    textView2.setGravity(16);
                    textView2.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setEllipsize(truncateAt);
                    textView2.setTag(1);
                    textView2.setText(ob6.M0(2131747397, null));
                    textView2.setOnClickListener(new xx5(wy5Var, (byte) 2));
                    linearLayout.addView(textView2, tre.o(-2, 48));
                }
                if (h44Var instanceof w3b) {
                    TextView textView3 = new TextView(wy5Var.getContext());
                    yob.X(textView3, i, yx5Var);
                    textView3.setBackgroundDrawable(aob.L0(false));
                    textView3.setGravity(16);
                    textView3.setEllipsize(truncateAt);
                    textView3.setPadding(hl.L(14.0f), 0, hl.L(16.0f), 0);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTag(2);
                    textView3.setText(ob6.M0(2131750650, null));
                    textView3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            byte b2 = r3;
                            h44 h44Var2 = h44Var;
                            wy5 wy5Var2 = wy5Var;
                            switch (b2) {
                                case 0:
                                    wy5Var2.s0(h44Var2);
                                    n8 n8Var = wy5Var2.B1;
                                    if (n8Var != null && n8Var.isShowing()) {
                                        wy5Var2.B1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    ((w3b) h44Var2).r(true);
                                    n8 n8Var2 = wy5Var2.B1;
                                    if (n8Var2 != null && n8Var2.isShowing()) {
                                        wy5Var2.B1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, tre.o(-2, 48));
                }
                if (!(h44Var instanceof v98) && !(h44Var instanceof kc1)) {
                    TextView textView4 = new TextView(wy5Var.getContext());
                    yob.X(textView4, i, yx5Var);
                    textView4.setBackgroundDrawable(aob.L0(false));
                    textView4.setGravity(16);
                    textView4.setEllipsize(truncateAt);
                    textView4.setPadding(hl.L(14.0f), 0, hl.L(16.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(ob6.M0(2131747398, null));
                    textView4.setOnClickListener(new xx5(wy5Var, (byte) 3));
                    linearLayout.addView(textView4, tre.o(-2, 48));
                }
                wy5Var.C1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}

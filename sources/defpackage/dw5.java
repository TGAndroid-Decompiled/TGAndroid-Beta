package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class dw5 implements Runnable {
    public final byte a;
    public final rw5 b;
    public final l34 c;

    public dw5(rw5 rw5Var, l34 l34Var, byte b) {
        this.a = b;
        this.b = rw5Var;
        this.c = l34Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        final l34 l34Var = this.c;
        final rw5 rw5Var = this.b;
        switch (b) {
            case 0:
                rw5Var.s0(l34Var);
                return;
            case 1:
                l34Var.m();
                rw5Var.t0(l34Var, true);
                return;
            default:
                LinearLayout linearLayout = new LinearLayout(rw5Var.getContext());
                linearLayout.setOrientation(0);
                TextView textView = new TextView(rw5Var.getContext());
                int i = bkb.D8;
                tv5 tv5Var = rw5Var.G1;
                zkb.X(textView, i, tv5Var);
                textView.setBackground(bkb.L0(false));
                textView.setGravity(16);
                textView.setPadding(gl.L(16.0f), 0, gl.L(14.0f), 0);
                textView.setTextSize(1, 14.0f);
                textView.setTag(0);
                textView.setText(k96.M0(2131747479, null));
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        byte b2 = r3;
                        l34 l34Var2 = l34Var;
                        rw5 rw5Var2 = rw5Var;
                        switch (b2) {
                            case 0:
                                rw5Var2.s0(l34Var2);
                                m8 m8Var = rw5Var2.H1;
                                if (m8Var != null && m8Var.isShowing()) {
                                    rw5Var2.H1.d(true);
                                    return;
                                }
                                return;
                            default:
                                ((yza) l34Var2).r(true);
                                m8 m8Var2 = rw5Var2.H1;
                                if (m8Var2 != null && m8Var2.isShowing()) {
                                    rw5Var2.H1.d(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.addView(textView, nme.o(-2, 48));
                if (l34Var instanceof vhb) {
                    TextView textView2 = new TextView(rw5Var.getContext());
                    zkb.X(textView2, i, tv5Var);
                    textView2.setBackground(bkb.L0(false));
                    textView2.setGravity(16);
                    textView2.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setEllipsize(truncateAt);
                    textView2.setTag(1);
                    textView2.setText(k96.M0(2131747477, null));
                    textView2.setOnClickListener(new sv5(rw5Var, (byte) 2));
                    linearLayout.addView(textView2, nme.o(-2, 48));
                }
                if (l34Var instanceof yza) {
                    TextView textView3 = new TextView(rw5Var.getContext());
                    zkb.X(textView3, i, tv5Var);
                    textView3.setBackgroundDrawable(bkb.L0(false));
                    textView3.setGravity(16);
                    textView3.setEllipsize(truncateAt);
                    textView3.setPadding(gl.L(14.0f), 0, gl.L(16.0f), 0);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTag(2);
                    textView3.setText(k96.M0(2131750673, null));
                    textView3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            byte b2 = r3;
                            l34 l34Var2 = l34Var;
                            rw5 rw5Var2 = rw5Var;
                            switch (b2) {
                                case 0:
                                    rw5Var2.s0(l34Var2);
                                    m8 m8Var = rw5Var2.H1;
                                    if (m8Var != null && m8Var.isShowing()) {
                                        rw5Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    ((yza) l34Var2).r(true);
                                    m8 m8Var2 = rw5Var2.H1;
                                    if (m8Var2 != null && m8Var2.isShowing()) {
                                        rw5Var2.H1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, nme.o(-2, 48));
                }
                if (!(l34Var instanceof e68) && !(l34Var instanceof cc1)) {
                    TextView textView4 = new TextView(rw5Var.getContext());
                    zkb.X(textView4, i, tv5Var);
                    textView4.setBackgroundDrawable(bkb.L0(false));
                    textView4.setGravity(16);
                    textView4.setEllipsize(truncateAt);
                    textView4.setPadding(gl.L(14.0f), 0, gl.L(16.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(k96.M0(2131747478, null));
                    textView4.setOnClickListener(new sv5(rw5Var, (byte) 3));
                    linearLayout.addView(textView4, nme.o(-2, 48));
                }
                rw5Var.I1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}

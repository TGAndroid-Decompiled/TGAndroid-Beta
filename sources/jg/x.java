package jg;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.dd;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import w7.b6;
public final class x implements Runnable {
    public final int f10352a;
    public final r0 f10353b;
    public final j f10354c;

    public x(r0 r0Var, j jVar, int i10) {
        this.f10352a = i10;
        this.f10353b = r0Var;
        this.f10354c = jVar;
    }

    @Override
    public final void run() {
        int i10 = this.f10352a;
        final j jVar = this.f10354c;
        final r0 r0Var = this.f10353b;
        switch (i10) {
            case 0:
                r0Var.p0(jVar);
                return;
            default:
                LinearLayout linearLayout = new LinearLayout(r0Var.getContext());
                linearLayout.setOrientation(0);
                TextView textView = new TextView(r0Var.getContext());
                int i11 = t6.E8;
                b0 b0Var = r0Var.f10204z1;
                a7.V(textView, i11, b0Var);
                textView.setBackground(t6.N0(false));
                textView.setGravity(16);
                textView.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(14.0f), 0);
                textView.setTextSize(1, 14.0f);
                textView.setTag(0);
                textView.setText(dd.L0(2131747688, null));
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                j jVar2 = jVar;
                                r0 r0Var2 = r0Var;
                                r0Var2.p0(jVar2);
                                org.telegram.ui.ActionBar.k1 k1Var = r0Var2.A1;
                                if (k1Var != null && k1Var.isShowing()) {
                                    r0Var2.A1.d(true);
                                    return;
                                }
                                return;
                            default:
                                r0 r0Var3 = r0Var;
                                r0Var3.getClass();
                                ((w2) jVar).r(true);
                                org.telegram.ui.ActionBar.k1 k1Var2 = r0Var3.A1;
                                if (k1Var2 != null && k1Var2.isShowing()) {
                                    r0Var3.A1.d(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.addView(textView, b6.o(-2, 48));
                if (jVar instanceof g3) {
                    TextView textView2 = new TextView(r0Var.getContext());
                    a7.V(textView2, i11, b0Var);
                    textView2.setBackground(t6.N0(false));
                    textView2.setGravity(16);
                    textView2.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setEllipsize(truncateAt);
                    textView2.setTag(1);
                    textView2.setText(dd.L0(2131747686, null));
                    textView2.setOnClickListener(new k(r0Var, 2));
                    linearLayout.addView(textView2, b6.o(-2, 48));
                }
                if (jVar instanceof w2) {
                    TextView textView3 = new TextView(r0Var.getContext());
                    a7.V(textView3, i11, b0Var);
                    textView3.setBackgroundDrawable(t6.N0(false));
                    textView3.setGravity(16);
                    textView3.setEllipsize(truncateAt);
                    textView3.setPadding(org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTag(2);
                    textView3.setText(dd.L0(2131750691, null));
                    textView3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    j jVar2 = jVar;
                                    r0 r0Var2 = r0Var;
                                    r0Var2.p0(jVar2);
                                    org.telegram.ui.ActionBar.k1 k1Var = r0Var2.A1;
                                    if (k1Var != null && k1Var.isShowing()) {
                                        r0Var2.A1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    r0 r0Var3 = r0Var;
                                    r0Var3.getClass();
                                    ((w2) jVar).r(true);
                                    org.telegram.ui.ActionBar.k1 k1Var2 = r0Var3.A1;
                                    if (k1Var2 != null && k1Var2.isShowing()) {
                                        r0Var3.A1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, b6.o(-2, 48));
                }
                if (!(jVar instanceof e2)) {
                    TextView textView4 = new TextView(r0Var.getContext());
                    a7.V(textView4, i11, b0Var);
                    textView4.setBackgroundDrawable(t6.N0(false));
                    textView4.setGravity(16);
                    textView4.setEllipsize(truncateAt);
                    textView4.setPadding(org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(dd.L0(2131747687, null));
                    textView4.setOnClickListener(new k(r0Var, 3));
                    linearLayout.addView(textView4, b6.o(-2, 48));
                }
                r0Var.B1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}

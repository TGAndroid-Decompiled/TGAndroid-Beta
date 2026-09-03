package dg;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
public final class c0 implements Runnable {
    public final int f4423a;
    public final e1 f4424b;
    public final j f4425c;

    public c0(e1 e1Var, j jVar, int i10) {
        this.f4423a = i10;
        this.f4424b = e1Var;
        this.f4425c = jVar;
    }

    @Override
    public final void run() {
        switch (this.f4423a) {
            case 0:
                this.f4424b.q0(this.f4425c);
                return;
            default:
                final e1 e1Var = this.f4424b;
                LinearLayout linearLayout = new LinearLayout(e1Var.getContext());
                linearLayout.setOrientation(0);
                TextView textView = new TextView(e1Var.getContext());
                int i10 = j6.E8;
                h0 h0Var = e1Var.N1;
                textView.setTextColor(j6.v0(i10, h0Var));
                textView.setBackground(j6.K0(false));
                textView.setGravity(16);
                textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(14.0f), 0);
                textView.setTextSize(1, 14.0f);
                textView.setTag(0);
                textView.setText(LocaleController.getString(R.string.PaintDelete));
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                final j jVar = this.f4425c;
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                j jVar2 = jVar;
                                e1 e1Var2 = e1Var;
                                e1Var2.q0(jVar2);
                                org.telegram.ui.ActionBar.p1 p1Var = e1Var2.O1;
                                if (p1Var != null && p1Var.isShowing()) {
                                    e1Var2.O1.d(true);
                                    return;
                                }
                                return;
                            default:
                                e1 e1Var3 = e1Var;
                                e1Var3.getClass();
                                ((r3) jVar).r(true);
                                org.telegram.ui.ActionBar.p1 p1Var2 = e1Var3.O1;
                                if (p1Var2 != null && p1Var2.isShowing()) {
                                    e1Var3.O1.d(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.addView(textView, b6.n(-2, 48));
                if (jVar instanceof b4) {
                    TextView textView2 = new TextView(e1Var.getContext());
                    textView2.setTextColor(j6.v0(i10, h0Var));
                    textView2.setBackground(j6.K0(false));
                    textView2.setGravity(16);
                    textView2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setEllipsize(truncateAt);
                    textView2.setTag(1);
                    textView2.setText(LocaleController.getString(R.string.PaintEdit));
                    textView2.setOnClickListener(new k(e1Var, 2));
                    linearLayout.addView(textView2, b6.n(-2, 48));
                }
                if (jVar instanceof r3) {
                    TextView textView3 = new TextView(e1Var.getContext());
                    textView3.setTextColor(j6.v0(i10, h0Var));
                    textView3.setBackgroundDrawable(j6.K0(false));
                    textView3.setGravity(16);
                    textView3.setEllipsize(truncateAt);
                    textView3.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTag(2);
                    textView3.setText(LocaleController.getString(R.string.Flip));
                    textView3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r3) {
                                case 0:
                                    j jVar2 = jVar;
                                    e1 e1Var2 = e1Var;
                                    e1Var2.q0(jVar2);
                                    org.telegram.ui.ActionBar.p1 p1Var = e1Var2.O1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        e1Var2.O1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    e1 e1Var3 = e1Var;
                                    e1Var3.getClass();
                                    ((r3) jVar).r(true);
                                    org.telegram.ui.ActionBar.p1 p1Var2 = e1Var3.O1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        e1Var3.O1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, b6.n(-2, 48));
                }
                if (!(jVar instanceof v2)) {
                    TextView textView4 = new TextView(e1Var.getContext());
                    textView4.setTextColor(j6.v0(i10, h0Var));
                    textView4.setBackgroundDrawable(j6.K0(false));
                    textView4.setGravity(16);
                    textView4.setEllipsize(truncateAt);
                    textView4.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(LocaleController.getString(R.string.PaintDuplicate));
                    textView4.setOnClickListener(new k(e1Var, 3));
                    linearLayout.addView(textView4, b6.n(-2, 48));
                }
                e1Var.P1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}

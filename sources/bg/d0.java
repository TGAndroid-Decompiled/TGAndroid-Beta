package bg;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
public final class d0 implements Runnable {
    public final int f2142a;
    public final g1 f2143b;
    public final k f2144c;

    public d0(g1 g1Var, k kVar, int i10) {
        this.f2142a = i10;
        this.f2143b = g1Var;
        this.f2144c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f2142a) {
            case 0:
                this.f2143b.q0(this.f2144c);
                return;
            default:
                final g1 g1Var = this.f2143b;
                LinearLayout linearLayout = new LinearLayout(g1Var.getContext());
                linearLayout.setOrientation(0);
                TextView textView = new TextView(g1Var.getContext());
                int i10 = g6.E8;
                i0 i0Var = g1Var.M1;
                textView.setTextColor(g6.v0(i10, i0Var));
                textView.setBackground(g6.K0(false));
                textView.setGravity(16);
                textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(14.0f), 0);
                textView.setTextSize(1, 14.0f);
                textView.setTag(0);
                textView.setText(LocaleController.getString(R.string.PaintDelete));
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                final k kVar = this.f2144c;
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        switch (r3) {
                            case 0:
                                k kVar2 = kVar;
                                g1 g1Var2 = g1Var;
                                g1Var2.q0(kVar2);
                                org.telegram.ui.ActionBar.o1 o1Var = g1Var2.N1;
                                if (o1Var != null && o1Var.isShowing()) {
                                    g1Var2.N1.d(true);
                                    return;
                                }
                                return;
                            default:
                                g1 g1Var3 = g1Var;
                                g1Var3.getClass();
                                ((v3) kVar).r(true);
                                org.telegram.ui.ActionBar.o1 o1Var2 = g1Var3.N1;
                                if (o1Var2 != null && o1Var2.isShowing()) {
                                    g1Var3.N1.d(true);
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout.addView(textView, f6.n(-2, 48));
                if (kVar instanceof f4) {
                    TextView textView2 = new TextView(g1Var.getContext());
                    textView2.setTextColor(g6.v0(i10, i0Var));
                    textView2.setBackground(g6.K0(false));
                    textView2.setGravity(16);
                    textView2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setEllipsize(truncateAt);
                    textView2.setTag(1);
                    textView2.setText(LocaleController.getString(R.string.PaintEdit));
                    textView2.setOnClickListener(new l(g1Var, 2));
                    linearLayout.addView(textView2, f6.n(-2, 48));
                }
                if (kVar instanceof v3) {
                    TextView textView3 = new TextView(g1Var.getContext());
                    textView3.setTextColor(g6.v0(i10, i0Var));
                    textView3.setBackgroundDrawable(g6.K0(false));
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
                                    k kVar2 = kVar;
                                    g1 g1Var2 = g1Var;
                                    g1Var2.q0(kVar2);
                                    org.telegram.ui.ActionBar.o1 o1Var = g1Var2.N1;
                                    if (o1Var != null && o1Var.isShowing()) {
                                        g1Var2.N1.d(true);
                                        return;
                                    }
                                    return;
                                default:
                                    g1 g1Var3 = g1Var;
                                    g1Var3.getClass();
                                    ((v3) kVar).r(true);
                                    org.telegram.ui.ActionBar.o1 o1Var2 = g1Var3.N1;
                                    if (o1Var2 != null && o1Var2.isShowing()) {
                                        g1Var3.N1.d(true);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    linearLayout.addView(textView3, f6.n(-2, 48));
                }
                if (!(kVar instanceof y2)) {
                    TextView textView4 = new TextView(g1Var.getContext());
                    textView4.setTextColor(g6.v0(i10, i0Var));
                    textView4.setBackgroundDrawable(g6.K0(false));
                    textView4.setGravity(16);
                    textView4.setEllipsize(truncateAt);
                    textView4.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(16.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(LocaleController.getString(R.string.PaintDuplicate));
                    textView4.setOnClickListener(new l(g1Var, 3));
                    linearLayout.addView(textView4, f6.n(-2, 48));
                }
                g1Var.O1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                return;
        }
    }
}

package jg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TableRow;
import android.widget.TextView;
import hg.j1;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.p9;
public final class e0 extends FrameLayout {
    public final TextView f10028a;
    public final TextView f10029b;
    public final TextView f10030c;
    public final TextView d;
    public final TextView f10031e;
    public final p9 f10032f;
    public final p9 h;
    public final g6 f10033n;
    public final Paint f10034r;
    public final Path f10035s;
    public final RectF v;
    public final FrameLayout f10036w;
    public final FrameLayout f10037x;
    public final TableRow f10038y;

    public e0(Context context, g6 g6Var) {
        super(context);
        int i10;
        float f10;
        float f11;
        int i11;
        float f12;
        float f13;
        float f14;
        int i12;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        boolean z4;
        Paint paint = new Paint();
        this.f10034r = paint;
        this.f10035s = new Path();
        this.v = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        this.f10033n = g6Var;
        TextView a2 = a(LocaleController.getString(R.string.BoostingFrom), false);
        TextView a10 = a(LocaleController.getString(R.string.BoostingTo), false);
        TextView a11 = a(LocaleController.getString(R.string.BoostingGift), false);
        TextView a12 = a(LocaleController.getString(R.string.BoostingReason), false);
        TextView a13 = a(LocaleController.getString(R.string.BoostingDate), false);
        TextView a14 = a(null, true);
        this.f10028a = a14;
        TextView a15 = a(null, true);
        this.f10029b = a15;
        TextView a16 = a(null, false);
        this.f10030c = a16;
        TextView a17 = a(null, true);
        this.d = a17;
        TextView a18 = a(null, false);
        this.f10031e = a18;
        p9 p9Var = new p9(context);
        this.f10032f = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
        p9 p9Var2 = new p9(context);
        this.h = p9Var2;
        p9Var2.setRoundRadius(AndroidUtilities.dp(12.0f));
        TableRow tableRow = new TableRow(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f10036w = frameLayout;
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 12.0f;
        }
        if (z10) {
            f11 = 12.0f;
        } else {
            f11 = 0.0f;
        }
        frameLayout.addView(p9Var, c6.d(24, 24.0f, i10, f10, 0.0f, f11, 0.0f));
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i13 = i11 | 16;
        if (z11) {
            f12 = 0.0f;
        } else {
            f12 = 29.0f;
        }
        if (z11) {
            f13 = 29.0f;
        } else {
            f13 = 0.0f;
        }
        frameLayout.addView(a14, c6.d(-2, -2.0f, i13, f12, 0.0f, f13, 0.0f));
        if (LocaleController.isRTL) {
            f14 = 1.0f;
        } else {
            f14 = 0.0f;
        }
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -2, f14);
        layoutParams.gravity = 16;
        if (LocaleController.isRTL) {
            tableRow.addView(frameLayout, layoutParams);
            tableRow.addView(a2, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow.addView(a2, new TableRow.LayoutParams(-2, -2));
            tableRow.addView(frameLayout, layoutParams);
        }
        frameLayout.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        TableRow tableRow2 = new TableRow(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f10037x = frameLayout2;
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        if (z12) {
            f15 = 0.0f;
        } else {
            f15 = 12.0f;
        }
        if (z12) {
            f16 = 12.0f;
        } else {
            f16 = 0.0f;
        }
        frameLayout2.addView(p9Var2, c6.d(24, 24.0f, i12, f15, 0.0f, f16, 0.0f));
        boolean z13 = LocaleController.isRTL;
        int i14 = (z13 ? 5 : 3) | 16;
        if (z13) {
            f17 = 0.0f;
        } else {
            f17 = 29.0f;
        }
        if (z13) {
            f18 = 29.0f;
        } else {
            f18 = 0.0f;
        }
        frameLayout2.addView(a15, c6.d(-2, -2.0f, i14, f17, 0.0f, f18, 0.0f));
        if (LocaleController.isRTL) {
            f19 = 1.0f;
        } else {
            f19 = 0.0f;
        }
        TableRow.LayoutParams layoutParams2 = new TableRow.LayoutParams(-2, -2, f19);
        layoutParams2.gravity = 16;
        if (LocaleController.isRTL) {
            tableRow2.addView(frameLayout2, layoutParams2);
            tableRow2.addView(a10, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow2.addView(a10, new TableRow.LayoutParams(-2, -2));
            tableRow2.addView(frameLayout2, layoutParams2);
        }
        frameLayout2.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        TableRow tableRow3 = new TableRow(context);
        if (LocaleController.isRTL) {
            tableRow3.addView(a16, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow3.addView(a11, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow3.addView(a11, new TableRow.LayoutParams(-2, -2));
            tableRow3.addView(a16, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow4 = new TableRow(context);
        this.f10038y = tableRow4;
        if (LocaleController.isRTL) {
            tableRow4.addView(a17, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow4.addView(a12, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow4.addView(a12, new TableRow.LayoutParams(-2, -2));
            tableRow4.addView(a17, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow5 = new TableRow(context);
        if (LocaleController.isRTL) {
            tableRow5.addView(a18, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow5.addView(a13, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow5.addView(a13, new TableRow.LayoutParams(-2, -2));
            tableRow5.addView(a18, new TableRow.LayoutParams(-2, -2));
        }
        d0 d0Var = new d0(this, context, g6Var);
        d0Var.addView(tableRow);
        d0Var.addView(tableRow2);
        d0Var.addView(tableRow3);
        d0Var.addView(tableRow4);
        d0Var.addView(tableRow5);
        if (LocaleController.isRTL) {
            z4 = true;
            d0Var.setColumnShrinkable(0, true);
        } else {
            z4 = true;
            d0Var.setColumnShrinkable(1, true);
        }
        addView(d0Var, c6.c(-2.0f, -1));
        d0Var.setOutlineProvider(new j1(1));
        d0Var.setClipToOutline(z4);
        setPaddingRelative(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), 0);
    }

    public final TextView a(String str, boolean z4) {
        TextView textView;
        int i10;
        float f10;
        int i11;
        g6 g6Var = this.f10033n;
        if (z4) {
            textView = new g90(getContext(), g6Var);
            textView.setLinkTextColor(k6.v0(k6.J6, g6Var));
        } else {
            textView = new TextView(getContext());
        }
        if (z4) {
            i10 = k6.f21820m5;
        } else {
            i10 = k6.f21766j5;
        }
        org.telegram.ui.b.l(i10, g6Var, textView, 1, 14.0f);
        if (!z4) {
            if (LocaleController.isRTL) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            textView.setGravity(i11);
        }
        if (str != null) {
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(str);
            textView.setBackgroundColor(k6.v0(k6.f21678e7, g6Var));
            float f11 = 12.0f;
            if (LocaleController.isRTL) {
                f10 = 32.0f;
            } else {
                f10 = 12.0f;
            }
            int dp = AndroidUtilities.dp(f10);
            int dp2 = AndroidUtilities.dp(11.0f);
            if (!LocaleController.isRTL) {
                f11 = 32.0f;
            }
            textView.setPadding(dp, dp2, AndroidUtilities.dp(f11), AndroidUtilities.dp(11.0f));
            return textView;
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        return textView;
    }
}

package gg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TableRow;
import android.widget.TextView;
import eg.k1;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.y80;
public final class e0 extends FrameLayout {
    public final TextView f7298a;
    public final TextView f7299b;
    public final TextView f7300c;
    public final TextView d;
    public final TextView f7301e;
    public final t9 f7302f;
    public final t9 h;
    public final c6 f7303n;
    public final Paint f7304r;
    public final Path f7305s;
    public final RectF v;
    public final FrameLayout f7306w;
    public final FrameLayout f7307x;
    public final TableRow f7308y;

    public e0(Context context, c6 c6Var) {
        super(context);
        int i10;
        float f9;
        float f10;
        int i11;
        float f11;
        float f12;
        float f13;
        int i12;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        boolean z10;
        Paint paint = new Paint();
        this.f7304r = paint;
        this.f7305s = new Path();
        this.v = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        this.f7303n = c6Var;
        TextView a2 = a(LocaleController.getString(R.string.BoostingFrom), false);
        TextView a10 = a(LocaleController.getString(R.string.BoostingTo), false);
        TextView a11 = a(LocaleController.getString(R.string.BoostingGift), false);
        TextView a12 = a(LocaleController.getString(R.string.BoostingReason), false);
        TextView a13 = a(LocaleController.getString(R.string.BoostingDate), false);
        TextView a14 = a(null, true);
        this.f7298a = a14;
        TextView a15 = a(null, true);
        this.f7299b = a15;
        TextView a16 = a(null, false);
        this.f7300c = a16;
        TextView a17 = a(null, true);
        this.d = a17;
        TextView a18 = a(null, false);
        this.f7301e = a18;
        t9 t9Var = new t9(context);
        this.f7302f = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
        t9 t9Var2 = new t9(context);
        this.h = t9Var2;
        t9Var2.setRoundRadius(AndroidUtilities.dp(12.0f));
        TableRow tableRow = new TableRow(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f7306w = frameLayout;
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        if (z11) {
            f9 = 0.0f;
        } else {
            f9 = 12.0f;
        }
        if (z11) {
            f10 = 12.0f;
        } else {
            f10 = 0.0f;
        }
        frameLayout.addView(t9Var, f6.d(24, 24.0f, i10, f9, 0.0f, f10, 0.0f));
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i13 = i11 | 16;
        if (z12) {
            f11 = 0.0f;
        } else {
            f11 = 29.0f;
        }
        if (z12) {
            f12 = 29.0f;
        } else {
            f12 = 0.0f;
        }
        frameLayout.addView(a14, f6.d(-2, -2.0f, i13, f11, 0.0f, f12, 0.0f));
        if (LocaleController.isRTL) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -2, f13);
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
        this.f7307x = frameLayout2;
        boolean z13 = LocaleController.isRTL;
        if (z13) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        if (z13) {
            f14 = 0.0f;
        } else {
            f14 = 12.0f;
        }
        if (z13) {
            f15 = 12.0f;
        } else {
            f15 = 0.0f;
        }
        frameLayout2.addView(t9Var2, f6.d(24, 24.0f, i12, f14, 0.0f, f15, 0.0f));
        boolean z14 = LocaleController.isRTL;
        int i14 = (z14 ? 5 : 3) | 16;
        if (z14) {
            f16 = 0.0f;
        } else {
            f16 = 29.0f;
        }
        if (z14) {
            f17 = 29.0f;
        } else {
            f17 = 0.0f;
        }
        frameLayout2.addView(a15, f6.d(-2, -2.0f, i14, f16, 0.0f, f17, 0.0f));
        if (LocaleController.isRTL) {
            f18 = 1.0f;
        } else {
            f18 = 0.0f;
        }
        TableRow.LayoutParams layoutParams2 = new TableRow.LayoutParams(-2, -2, f18);
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
        this.f7308y = tableRow4;
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
        d0 d0Var = new d0(this, context, c6Var);
        d0Var.addView(tableRow);
        d0Var.addView(tableRow2);
        d0Var.addView(tableRow3);
        d0Var.addView(tableRow4);
        d0Var.addView(tableRow5);
        if (LocaleController.isRTL) {
            z10 = true;
            d0Var.setColumnShrinkable(0, true);
        } else {
            z10 = true;
            d0Var.setColumnShrinkable(1, true);
        }
        addView(d0Var, f6.c(-2.0f, -1));
        d0Var.setOutlineProvider(new k1(1));
        d0Var.setClipToOutline(z10);
        setPaddingRelative(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), 0);
    }

    public final TextView a(String str, boolean z10) {
        TextView textView;
        int i10;
        float f9;
        int i11;
        c6 c6Var = this.f7303n;
        if (z10) {
            textView = new y80(getContext(), c6Var);
            textView.setLinkTextColor(g6.v0(g6.J6, c6Var));
        } else {
            textView = new TextView(getContext());
        }
        if (z10) {
            i10 = g6.f23222m5;
        } else {
            i10 = g6.f23169j5;
        }
        org.telegram.ui.b.m(i10, c6Var, textView, 1, 14.0f);
        if (!z10) {
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
            textView.setBackgroundColor(g6.v0(g6.f23081e7, c6Var));
            float f10 = 12.0f;
            if (LocaleController.isRTL) {
                f9 = 32.0f;
            } else {
                f9 = 12.0f;
            }
            int dp = AndroidUtilities.dp(f9);
            int dp2 = AndroidUtilities.dp(11.0f);
            if (!LocaleController.isRTL) {
                f10 = 32.0f;
            }
            textView.setPadding(dp, dp2, AndroidUtilities.dp(f10), AndroidUtilities.dp(11.0f));
            return textView;
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        return textView;
    }
}

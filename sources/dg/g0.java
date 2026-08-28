package dg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TableRow;
import android.widget.TextView;
import bg.q1;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.o9;
public final class g0 extends FrameLayout {
    public final TextView f4514a;
    public final TextView f4515b;
    public final TextView f4516c;
    public final TextView d;
    public final TextView f4517e;
    public final o9 f4518f;
    public final o9 h;
    public final b6 f4519n;
    public final Paint f4520r;
    public final Path f4521s;
    public final RectF v;
    public final FrameLayout f4522w;
    public final FrameLayout f4523x;
    public final TableRow f4524y;

    public g0(Context context, b6 b6Var) {
        super(context);
        int i9;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        float f14;
        int i11;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        boolean z10;
        Paint paint = new Paint();
        this.f4520r = paint;
        this.f4521s = new Path();
        this.v = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        this.f4519n = b6Var;
        TextView a2 = a(LocaleController.getString(R.string.BoostingFrom), false);
        TextView a3 = a(LocaleController.getString(R.string.BoostingTo), false);
        TextView a10 = a(LocaleController.getString(R.string.BoostingGift), false);
        TextView a11 = a(LocaleController.getString(R.string.BoostingReason), false);
        TextView a12 = a(LocaleController.getString(R.string.BoostingDate), false);
        TextView a13 = a(null, true);
        this.f4514a = a13;
        TextView a14 = a(null, true);
        this.f4515b = a14;
        TextView a15 = a(null, false);
        this.f4516c = a15;
        TextView a16 = a(null, true);
        this.d = a16;
        TextView a17 = a(null, false);
        this.f4517e = a17;
        o9 o9Var = new o9(context);
        this.f4518f = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
        o9 o9Var2 = new o9(context);
        this.h = o9Var2;
        o9Var2.setRoundRadius(AndroidUtilities.dp(12.0f));
        TableRow tableRow = new TableRow(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f4522w = frameLayout;
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        if (z11) {
            f10 = 0.0f;
        } else {
            f10 = 12.0f;
        }
        if (z11) {
            f11 = 12.0f;
        } else {
            f11 = 0.0f;
        }
        frameLayout.addView(o9Var, e6.d(24, 24.0f, i9, f10, 0.0f, f11, 0.0f));
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i12 = i10 | 16;
        if (z12) {
            f12 = 0.0f;
        } else {
            f12 = 29.0f;
        }
        if (z12) {
            f13 = 29.0f;
        } else {
            f13 = 0.0f;
        }
        frameLayout.addView(a13, e6.d(-2, -2.0f, i12, f12, 0.0f, f13, 0.0f));
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
        this.f4523x = frameLayout2;
        boolean z13 = LocaleController.isRTL;
        if (z13) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        if (z13) {
            f15 = 0.0f;
        } else {
            f15 = 12.0f;
        }
        if (z13) {
            f16 = 12.0f;
        } else {
            f16 = 0.0f;
        }
        frameLayout2.addView(o9Var2, e6.d(24, 24.0f, i11, f15, 0.0f, f16, 0.0f));
        boolean z14 = LocaleController.isRTL;
        int i13 = (z14 ? 5 : 3) | 16;
        if (z14) {
            f17 = 0.0f;
        } else {
            f17 = 29.0f;
        }
        if (z14) {
            f18 = 29.0f;
        } else {
            f18 = 0.0f;
        }
        frameLayout2.addView(a14, e6.d(-2, -2.0f, i13, f17, 0.0f, f18, 0.0f));
        if (LocaleController.isRTL) {
            f19 = 1.0f;
        } else {
            f19 = 0.0f;
        }
        TableRow.LayoutParams layoutParams2 = new TableRow.LayoutParams(-2, -2, f19);
        layoutParams2.gravity = 16;
        if (LocaleController.isRTL) {
            tableRow2.addView(frameLayout2, layoutParams2);
            tableRow2.addView(a3, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow2.addView(a3, new TableRow.LayoutParams(-2, -2));
            tableRow2.addView(frameLayout2, layoutParams2);
        }
        frameLayout2.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        TableRow tableRow3 = new TableRow(context);
        if (LocaleController.isRTL) {
            tableRow3.addView(a15, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow3.addView(a10, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow3.addView(a10, new TableRow.LayoutParams(-2, -2));
            tableRow3.addView(a15, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow4 = new TableRow(context);
        this.f4524y = tableRow4;
        if (LocaleController.isRTL) {
            tableRow4.addView(a16, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow4.addView(a11, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow4.addView(a11, new TableRow.LayoutParams(-2, -2));
            tableRow4.addView(a16, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow5 = new TableRow(context);
        if (LocaleController.isRTL) {
            tableRow5.addView(a17, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow5.addView(a12, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow5.addView(a12, new TableRow.LayoutParams(-2, -2));
            tableRow5.addView(a17, new TableRow.LayoutParams(-2, -2));
        }
        f0 f0Var = new f0(this, context, b6Var);
        f0Var.addView(tableRow);
        f0Var.addView(tableRow2);
        f0Var.addView(tableRow3);
        f0Var.addView(tableRow4);
        f0Var.addView(tableRow5);
        if (LocaleController.isRTL) {
            z10 = true;
            f0Var.setColumnShrinkable(0, true);
        } else {
            z10 = true;
            f0Var.setColumnShrinkable(1, true);
        }
        addView(f0Var, e6.c(-2.0f, -1));
        f0Var.setOutlineProvider(new q1(1));
        f0Var.setClipToOutline(z10);
        setPaddingRelative(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), 0);
    }

    public final TextView a(String str, boolean z10) {
        TextView textView;
        int i9;
        float f10;
        int i10;
        b6 b6Var = this.f4519n;
        if (z10) {
            textView = new l80(getContext(), b6Var);
            textView.setLinkTextColor(f6.v0(f6.J6, b6Var));
        } else {
            textView = new TextView(getContext());
        }
        if (z10) {
            i9 = f6.f23161m5;
        } else {
            i9 = f6.f23108j5;
        }
        ll.n(i9, b6Var, textView, 1, 14.0f);
        if (!z10) {
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView.setGravity(i10);
        }
        if (str != null) {
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(str);
            textView.setBackgroundColor(f6.v0(f6.f23020e7, b6Var));
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

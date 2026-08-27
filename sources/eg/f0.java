package eg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TableRow;
import android.widget.TextView;
import cg.l1;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.rl;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.p80;

public final class f0 extends FrameLayout {

    public final TextView f5405a;

    public final TextView f5406b;

    public final TextView f5407c;
    public final TextView d;

    public final TextView f5408e;

    public final n9 f5409f;
    public final n9 h;

    public final c6 f5410n;

    public final Paint f5411r;

    public final Path f5412s;
    public final RectF v;

    public final FrameLayout f5413w;

    public final FrameLayout f5414x;

    public final TableRow f5415y;

    public f0(Context context, c6 c6Var) {
        boolean z10;
        super(context);
        Paint paint = new Paint();
        this.f5411r = paint;
        this.f5412s = new Path();
        this.v = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        this.f5410n = c6Var;
        TextView textViewA = a(LocaleController.getString(R.string.BoostingFrom), false);
        TextView textViewA2 = a(LocaleController.getString(R.string.BoostingTo), false);
        TextView textViewA3 = a(LocaleController.getString(R.string.BoostingGift), false);
        TextView textViewA4 = a(LocaleController.getString(R.string.BoostingReason), false);
        TextView textViewA5 = a(LocaleController.getString(R.string.BoostingDate), false);
        TextView textViewA6 = a(null, true);
        this.f5405a = textViewA6;
        TextView textViewA7 = a(null, true);
        this.f5406b = textViewA7;
        TextView textViewA8 = a(null, false);
        this.f5407c = textViewA8;
        TextView textViewA9 = a(null, true);
        this.d = textViewA9;
        TextView textViewA10 = a(null, false);
        this.f5408e = textViewA10;
        n9 n9Var = new n9(context);
        this.f5409f = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
        n9 n9Var2 = new n9(context);
        this.h = n9Var2;
        n9Var2.setRoundRadius(AndroidUtilities.dp(12.0f));
        TableRow tableRow = new TableRow(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f5413w = frameLayout;
        boolean z11 = LocaleController.isRTL;
        frameLayout.addView(n9Var, z5.d(24, 24.0f, z11 ? 5 : 3, z11 ? 0.0f : 12.0f, 0.0f, z11 ? 12.0f : 0.0f, 0.0f));
        boolean z12 = LocaleController.isRTL;
        frameLayout.addView(textViewA6, z5.d(-2, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 0.0f : 29.0f, 0.0f, z12 ? 29.0f : 0.0f, 0.0f));
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -2, LocaleController.isRTL ? 1.0f : 0.0f);
        layoutParams.gravity = 16;
        if (LocaleController.isRTL) {
            tableRow.addView(frameLayout, layoutParams);
            tableRow.addView(textViewA, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow.addView(textViewA, new TableRow.LayoutParams(-2, -2));
            tableRow.addView(frameLayout, layoutParams);
        }
        frameLayout.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        TableRow tableRow2 = new TableRow(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f5414x = frameLayout2;
        boolean z13 = LocaleController.isRTL;
        frameLayout2.addView(n9Var2, z5.d(24, 24.0f, z13 ? 5 : 3, z13 ? 0.0f : 12.0f, 0.0f, z13 ? 12.0f : 0.0f, 0.0f));
        boolean z14 = LocaleController.isRTL;
        frameLayout2.addView(textViewA7, z5.d(-2, -2.0f, (z14 ? 5 : 3) | 16, z14 ? 0.0f : 29.0f, 0.0f, z14 ? 29.0f : 0.0f, 0.0f));
        TableRow.LayoutParams layoutParams2 = new TableRow.LayoutParams(-2, -2, LocaleController.isRTL ? 1.0f : 0.0f);
        layoutParams2.gravity = 16;
        if (LocaleController.isRTL) {
            tableRow2.addView(frameLayout2, layoutParams2);
            tableRow2.addView(textViewA2, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow2.addView(textViewA2, new TableRow.LayoutParams(-2, -2));
            tableRow2.addView(frameLayout2, layoutParams2);
        }
        frameLayout2.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        TableRow tableRow3 = new TableRow(context);
        if (LocaleController.isRTL) {
            tableRow3.addView(textViewA8, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow3.addView(textViewA3, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow3.addView(textViewA3, new TableRow.LayoutParams(-2, -2));
            tableRow3.addView(textViewA8, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow4 = new TableRow(context);
        this.f5415y = tableRow4;
        if (LocaleController.isRTL) {
            tableRow4.addView(textViewA9, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow4.addView(textViewA4, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow4.addView(textViewA4, new TableRow.LayoutParams(-2, -2));
            tableRow4.addView(textViewA9, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow5 = new TableRow(context);
        if (LocaleController.isRTL) {
            tableRow5.addView(textViewA10, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow5.addView(textViewA5, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow5.addView(textViewA5, new TableRow.LayoutParams(-2, -2));
            tableRow5.addView(textViewA10, new TableRow.LayoutParams(-2, -2));
        }
        e0 e0Var = new e0(this, context, c6Var);
        e0Var.addView(tableRow);
        e0Var.addView(tableRow2);
        e0Var.addView(tableRow3);
        e0Var.addView(tableRow4);
        e0Var.addView(tableRow5);
        if (LocaleController.isRTL) {
            z10 = true;
            e0Var.setColumnShrinkable(0, true);
        } else {
            z10 = true;
            e0Var.setColumnShrinkable(1, true);
        }
        addView(e0Var, z5.c(-2.0f, -1));
        e0Var.setOutlineProvider(new l1(1));
        e0Var.setClipToOutline(z10);
        setPaddingRelative(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(14.0f), 0);
    }

    public final TextView a(String str, boolean z10) {
        TextView textView;
        c6 c6Var = this.f5410n;
        if (z10) {
            textView = new p80(getContext(), c6Var);
            textView.setLinkTextColor(g6.v0(g6.J6, c6Var));
        } else {
            textView = new TextView(getContext());
        }
        rl.l(z10 ? g6.f23214m5 : g6.f23161j5, c6Var, textView, 1, 14.0f);
        if (!z10) {
            textView.setGravity(LocaleController.isRTL ? 5 : 3);
        }
        if (str == null) {
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
            return textView;
        }
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(str);
        textView.setBackgroundColor(g6.v0(g6.f23073e7, c6Var));
        textView.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 32.0f : 12.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(LocaleController.isRTL ? 12.0f : 32.0f), AndroidUtilities.dp(11.0f));
        return textView;
    }
}

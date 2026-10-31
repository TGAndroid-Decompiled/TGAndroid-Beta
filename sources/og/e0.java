package og;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TableRow;
import android.widget.TextView;
import bi.d2;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.p80;
import w7.b6;
public final class e0 extends FrameLayout {
    public final TableRow D;
    public final TextView f14186a;
    public final TextView f14187b;
    public final TextView f14188c;
    public final TextView d;
    public final TextView e;
    public final g9 f14189f;
    public final g9 h;
    public final p6 f14190n;
    public final Paint f14191r;
    public final Path f14192s;
    public final RectF f14193w;
    public final FrameLayout f14194x;
    public final FrameLayout f14195y;

    public e0(Context context, p6 p6Var) {
        super(context);
        int i10;
        float f7;
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
        this.f14191r = paint;
        this.f14192s = new Path();
        this.f14193w = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        this.f14190n = p6Var;
        TextView a2 = a(cd.L0(2131753523, null), false);
        TextView a10 = a(cd.L0(2131753179, null), false);
        TextView a11 = a(cd.L0(2131753501, null), false);
        TextView a12 = a(cd.L0(2131753322, null), false);
        TextView a13 = a(cd.L0(2131753540, null), false);
        TextView a14 = a(null, true);
        this.f14186a = a14;
        TextView a15 = a(null, true);
        this.f14187b = a15;
        TextView a16 = a(null, false);
        this.f14188c = a16;
        TextView a17 = a(null, true);
        this.d = a17;
        TextView a18 = a(null, false);
        this.e = a18;
        g9 g9Var = new g9(context);
        this.f14189f = g9Var;
        g9Var.setRoundRadius(i0.L(12.0f));
        g9 g9Var2 = new g9(context);
        this.h = g9Var2;
        g9Var2.setRoundRadius(i0.L(12.0f));
        TableRow tableRow = new TableRow(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f14194x = frameLayout;
        boolean z11 = cd.X;
        if (z11) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        if (z11) {
            f7 = 0.0f;
        } else {
            f7 = 12.0f;
        }
        if (z11) {
            f10 = 12.0f;
        } else {
            f10 = 0.0f;
        }
        frameLayout.addView(g9Var, b6.d(24, 24.0f, i10, f7, 0.0f, f10, 0.0f));
        boolean z12 = cd.X;
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
        frameLayout.addView(a14, b6.d(-2, -2.0f, i13, f11, 0.0f, f12, 0.0f));
        if (cd.X) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -2, f13);
        layoutParams.gravity = 16;
        if (cd.X) {
            tableRow.addView(frameLayout, layoutParams);
            tableRow.addView(a2, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow.addView(a2, new TableRow.LayoutParams(-2, -2));
            tableRow.addView(frameLayout, layoutParams);
        }
        frameLayout.setPadding(0, i0.L(6.0f), 0, i0.L(6.0f));
        TableRow tableRow2 = new TableRow(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f14195y = frameLayout2;
        boolean z13 = cd.X;
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
        frameLayout2.addView(g9Var2, b6.d(24, 24.0f, i12, f14, 0.0f, f15, 0.0f));
        boolean z14 = cd.X;
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
        frameLayout2.addView(a15, b6.d(-2, -2.0f, i14, f16, 0.0f, f17, 0.0f));
        if (cd.X) {
            f18 = 1.0f;
        } else {
            f18 = 0.0f;
        }
        TableRow.LayoutParams layoutParams2 = new TableRow.LayoutParams(-2, -2, f18);
        layoutParams2.gravity = 16;
        if (cd.X) {
            tableRow2.addView(frameLayout2, layoutParams2);
            tableRow2.addView(a10, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow2.addView(a10, new TableRow.LayoutParams(-2, -2));
            tableRow2.addView(frameLayout2, layoutParams2);
        }
        frameLayout2.setPadding(0, i0.L(6.0f), 0, i0.L(6.0f));
        TableRow tableRow3 = new TableRow(context);
        if (cd.X) {
            tableRow3.addView(a16, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow3.addView(a11, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow3.addView(a11, new TableRow.LayoutParams(-2, -2));
            tableRow3.addView(a16, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow4 = new TableRow(context);
        this.D = tableRow4;
        if (cd.X) {
            tableRow4.addView(a17, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow4.addView(a12, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow4.addView(a12, new TableRow.LayoutParams(-2, -2));
            tableRow4.addView(a17, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow5 = new TableRow(context);
        if (cd.X) {
            tableRow5.addView(a18, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow5.addView(a13, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow5.addView(a13, new TableRow.LayoutParams(-2, -2));
            tableRow5.addView(a18, new TableRow.LayoutParams(-2, -2));
        }
        d0 d0Var = new d0(this, context, p6Var);
        d0Var.addView(tableRow);
        d0Var.addView(tableRow2);
        d0Var.addView(tableRow3);
        d0Var.addView(tableRow4);
        d0Var.addView(tableRow5);
        if (cd.X) {
            z10 = true;
            d0Var.setColumnShrinkable(0, true);
        } else {
            z10 = true;
            d0Var.setColumnShrinkable(1, true);
        }
        addView(d0Var, b6.c(-2.0f, -1));
        d0Var.setOutlineProvider(new d2(5));
        d0Var.setClipToOutline(z10);
        setPaddingRelative(i0.L(14.0f), i0.L(18.0f), i0.L(14.0f), 0);
    }

    public final TextView a(String str, boolean z10) {
        TextView textView;
        int i10;
        float f7;
        int i11;
        p6 p6Var = this.f14190n;
        if (z10) {
            textView = new p80(getContext(), p6Var);
            a7.H(textView, t6.J6, p6Var);
        } else {
            textView = new TextView(getContext());
        }
        if (z10) {
            i10 = t6.f21094m5;
        } else {
            i10 = t6.f21037j5;
        }
        a7.V(textView, i10, p6Var);
        textView.setTextSize(1, 14.0f);
        if (!z10) {
            if (cd.X) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            textView.setGravity(i11);
        }
        if (str != null) {
            textView.setTypeface(i0.o());
            textView.setText(str);
            a7.i(t6.e7, textView, p6Var);
            float f10 = 12.0f;
            if (cd.X) {
                f7 = 32.0f;
            } else {
                f7 = 12.0f;
            }
            int L = i0.L(f7);
            int L2 = i0.L(11.0f);
            if (!cd.X) {
                f10 = 32.0f;
            }
            textView.setPadding(L, L2, i0.L(f10), i0.L(11.0f));
            return textView;
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(i0.L(14.0f), 0, i0.L(14.0f), 0);
        return textView;
    }
}

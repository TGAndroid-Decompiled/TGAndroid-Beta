package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TableRow;
import android.widget.TextView;
public final class mgb extends FrameLayout {
    public final TableRow E;
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final bf0 f;
    public final bf0 h;
    public final ylb n;
    public final Paint r;
    public final Path s;
    public final RectF w;
    public final FrameLayout x;
    public final FrameLayout y;

    public mgb(Context context, ylb ylbVar) {
        super(context);
        float f;
        int i;
        float f2;
        int i2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i3;
        float f7;
        float f8;
        float f9;
        float f10;
        boolean z;
        Paint paint = new Paint();
        this.r = paint;
        this.s = new Path();
        this.w = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        this.n = ylbVar;
        TextView a = a(jb6.M0(2131753488, null), false);
        TextView a2 = a(jb6.M0(2131753144, null), false);
        TextView a3 = a(jb6.M0(2131753466, null), false);
        TextView a4 = a(jb6.M0(2131753287, null), false);
        TextView a5 = a(jb6.M0(2131753505, null), false);
        TextView a6 = a(null, true);
        this.a = a6;
        TextView a7 = a(null, true);
        this.b = a7;
        TextView a8 = a(null, false);
        this.c = a8;
        TextView a9 = a(null, true);
        this.d = a9;
        TextView a10 = a(null, false);
        this.e = a10;
        bf0 bf0Var = new bf0(context);
        this.f = bf0Var;
        bf0Var.setRoundRadius(gm.L(12.0f));
        bf0 bf0Var2 = new bf0(context);
        this.h = bf0Var2;
        bf0Var2.setRoundRadius(gm.L(12.0f));
        TableRow tableRow = new TableRow(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.x = frameLayout;
        boolean z2 = jb6.a0;
        if (z2) {
            i = 5;
            f = 0.0f;
        } else {
            f = 12.0f;
            i = 3;
        }
        if (z2) {
            f2 = 12.0f;
        } else {
            f2 = 0.0f;
        }
        frameLayout.addView(bf0Var, qoe.d(24, 24.0f, i, f, 0.0f, f2, 0.0f));
        boolean z3 = jb6.a0;
        if (z3) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        int i4 = i2 | 16;
        if (z3) {
            f3 = 0.0f;
        } else {
            f3 = 29.0f;
        }
        if (z3) {
            f4 = 29.0f;
        } else {
            f4 = 0.0f;
        }
        frameLayout.addView(a6, qoe.d(-2, -2.0f, i4, f3, 0.0f, f4, 0.0f));
        if (jb6.a0) {
            f5 = 1.0f;
        } else {
            f5 = 0.0f;
        }
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -2, f5);
        layoutParams.gravity = 16;
        if (jb6.a0) {
            tableRow.addView(frameLayout, layoutParams);
            tableRow.addView(a, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow.addView(a, new TableRow.LayoutParams(-2, -2));
            tableRow.addView(frameLayout, layoutParams);
        }
        frameLayout.setPadding(0, gm.L(6.0f), 0, gm.L(6.0f));
        TableRow tableRow2 = new TableRow(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.y = frameLayout2;
        boolean z4 = jb6.a0;
        if (z4) {
            i3 = 5;
            f6 = 0.0f;
        } else {
            f6 = 12.0f;
            i3 = 3;
        }
        if (z4) {
            f7 = 12.0f;
        } else {
            f7 = 0.0f;
        }
        frameLayout2.addView(bf0Var2, qoe.d(24, 24.0f, i3, f6, 0.0f, f7, 0.0f));
        boolean z5 = jb6.a0;
        int i5 = (z5 ? 5 : 3) | 16;
        if (z5) {
            f8 = 0.0f;
        } else {
            f8 = 29.0f;
        }
        if (z5) {
            f9 = 29.0f;
        } else {
            f9 = 0.0f;
        }
        frameLayout2.addView(a7, qoe.d(-2, -2.0f, i5, f8, 0.0f, f9, 0.0f));
        if (jb6.a0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        TableRow.LayoutParams layoutParams2 = new TableRow.LayoutParams(-2, -2, f10);
        layoutParams2.gravity = 16;
        if (jb6.a0) {
            tableRow2.addView(frameLayout2, layoutParams2);
            tableRow2.addView(a2, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow2.addView(a2, new TableRow.LayoutParams(-2, -2));
            tableRow2.addView(frameLayout2, layoutParams2);
        }
        frameLayout2.setPadding(0, gm.L(6.0f), 0, gm.L(6.0f));
        TableRow tableRow3 = new TableRow(context);
        if (jb6.a0) {
            tableRow3.addView(a8, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow3.addView(a3, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow3.addView(a3, new TableRow.LayoutParams(-2, -2));
            tableRow3.addView(a8, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow4 = new TableRow(context);
        this.E = tableRow4;
        if (jb6.a0) {
            tableRow4.addView(a9, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow4.addView(a4, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow4.addView(a4, new TableRow.LayoutParams(-2, -2));
            tableRow4.addView(a9, new TableRow.LayoutParams(-2, -2));
        }
        TableRow tableRow5 = new TableRow(context);
        if (jb6.a0) {
            tableRow5.addView(a10, new TableRow.LayoutParams(-2, -2, 1.0f));
            tableRow5.addView(a5, new TableRow.LayoutParams(-2, -2));
        } else {
            tableRow5.addView(a5, new TableRow.LayoutParams(-2, -2));
            tableRow5.addView(a10, new TableRow.LayoutParams(-2, -2));
        }
        kgb kgbVar = new kgb(this, context, ylbVar);
        kgbVar.addView(tableRow);
        kgbVar.addView(tableRow2);
        kgbVar.addView(tableRow3);
        kgbVar.addView(tableRow4);
        kgbVar.addView(tableRow5);
        if (jb6.a0) {
            z = true;
            kgbVar.setColumnShrinkable(0, true);
        } else {
            z = true;
            kgbVar.setColumnShrinkable(1, true);
        }
        addView(kgbVar, qoe.c(-2.0f, -1));
        kgbVar.setOutlineProvider(new xj((byte) 19));
        kgbVar.setClipToOutline(z);
        setPaddingRelative(gm.L(14.0f), gm.L(18.0f), gm.L(14.0f), 0);
    }

    public final TextView a(String str, boolean z) {
        TextView textView;
        int i;
        float f;
        int i2;
        ylb ylbVar = this.n;
        if (z) {
            textView = new l66(getContext(), ylbVar);
            anb.G(textView, cmb.I6, ylbVar);
            i = cmb.l5;
        } else {
            textView = new TextView(getContext());
            i = cmb.i5;
        }
        anb.X(textView, i, ylbVar);
        textView.setTextSize(1, 14.0f);
        if (!z) {
            if (jb6.a0) {
                i2 = 5;
            } else {
                i2 = 3;
            }
            textView.setGravity(i2);
        }
        if (str != null) {
            textView.setTypeface(gm.o());
            textView.setText(str);
            anb.h(cmb.d7, ylbVar, textView);
            float f2 = 12.0f;
            if (jb6.a0) {
                f = 32.0f;
            } else {
                f = 12.0f;
            }
            int L = gm.L(f);
            int L2 = gm.L(11.0f);
            if (!jb6.a0) {
                f2 = 32.0f;
            }
            textView.setPadding(L, L2, gm.L(f2), gm.L(11.0f));
            return textView;
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(gm.L(14.0f), 0, gm.L(14.0f), 0);
        return textView;
    }
}

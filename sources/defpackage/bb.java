package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class bb extends FrameLayout implements vlb {
    public final ylb a;
    public final bf0 b;
    public final LinearLayout c;
    public final FrameLayout.LayoutParams d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public final ImageView n;
    public final ya r;
    public int s;
    public final Paint w;
    public boolean x;

    public bb(Context context, ylb ylbVar) {
        super(context);
        this.w = new Paint(1);
        this.a = ylbVar;
        rve.b(this, 0.03f, 1.25f);
        bf0 bf0Var = new bf0(context);
        this.b = bf0Var;
        bf0Var.setRoundRadius(gm.L(6.0f));
        addView(bf0Var, qoe.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, qoe.r(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, qoe.t(-1, -2, 51, 0, 3, 0, 0));
        FrameLayout.LayoutParams d = qoe.d(-1, -2.0f, 19, 64.0f, 0.0f, 70.0f, 0.0f);
        this.d = d;
        addView(linearLayout, d);
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(5);
        textView3.setTextAlignment(6);
        addView(textView3, qoe.d(-2, -2.0f, 21, 64.0f, -10.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131230876);
        addView(imageView, qoe.d(32, 32.0f, 21, 8.0f, 8.0f, 8.0f, 8.0f));
        ya yaVar = new ya(this, getContext(), ylbVar, (byte) 0);
        this.r = yaVar;
        yaVar.b(-1, cmb.c6, cmb.j7);
        yaVar.setDrawUnchecked(false);
        yaVar.setDrawBackgroundAsArc(3);
        addView(yaVar, qoe.d(24, 24.0f, 19, 26.0f, 12.0f, 0.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.c6));
        hashSet.add(Integer.valueOf(cmb.F6));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.x) {
            canvas.drawRect(gm.L(59.0f), getHeight() - Math.max(gm.L(0.66f), 1), getWidth(), getHeight(), this.w);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(56.0f), 1073741824));
    }

    public void setChecked(boolean z) {
        this.r.a(z, true);
    }

    @Override
    public final void updateColors() {
        int i = cmb.c6;
        ylb ylbVar = this.a;
        int v0 = cmb.v0(i, ylbVar);
        int v02 = cmb.v0(cmb.F6, ylbVar);
        this.s = v02;
        this.e.setTextColor(v02);
        this.f.setTextColor(cmb.v(v0, cmb.p1(0.55f, v02)));
        this.h.setTextColor(cmb.p1(0.55f, v02));
        this.n.setColorFilter(new PorterDuffColorFilter(cmb.p1(0.6f, v02), PorterDuff.Mode.SRC_IN));
        this.w.setColor(cmb.p1(0.1f, v02));
        this.b.invalidate();
    }
}

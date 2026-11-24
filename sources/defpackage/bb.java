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
public final class bb extends FrameLayout implements tjb {
    public final wjb a;
    public final be0 b;
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

    public bb(Context context, wjb wjbVar) {
        super(context);
        this.w = new Paint(1);
        this.a = wjbVar;
        ote.b(this, 0.03f, 1.25f);
        be0 be0Var = new be0(context);
        this.b = be0Var;
        be0Var.setRoundRadius(gl.L(6.0f));
        addView(be0Var, nme.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, nme.r(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, nme.t(-1, -2, 51, 0, 3, 0, 0));
        FrameLayout.LayoutParams d = nme.d(-1, -2.0f, 19, 64.0f, 0.0f, 70.0f, 0.0f);
        this.d = d;
        addView(linearLayout, d);
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(5);
        textView3.setTextAlignment(6);
        addView(textView3, nme.d(-2, -2.0f, 21, 64.0f, -10.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131230875);
        addView(imageView, nme.d(32, 32.0f, 21, 8.0f, 8.0f, 8.0f, 8.0f));
        ya yaVar = new ya(this, getContext(), wjbVar, (byte) 0);
        this.r = yaVar;
        yaVar.b(-1, bkb.c6, bkb.j7);
        yaVar.setDrawUnchecked(false);
        yaVar.setDrawBackgroundAsArc(3);
        addView(yaVar, nme.d(24, 24.0f, 19, 26.0f, 12.0f, 0.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.c6));
        hashSet.add(Integer.valueOf(bkb.F6));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.x) {
            canvas.drawRect(gl.L(59.0f), getHeight() - Math.max(gl.L(0.66f), 1), getWidth(), getHeight(), this.w);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(56.0f), 1073741824));
    }

    public void setChecked(boolean z) {
        this.r.a(z, true);
    }

    @Override
    public final void updateColors() {
        int i = bkb.c6;
        wjb wjbVar = this.a;
        int v0 = bkb.v0(i, wjbVar);
        int v02 = bkb.v0(bkb.F6, wjbVar);
        this.s = v02;
        this.e.setTextColor(v02);
        this.f.setTextColor(bkb.v(v0, bkb.p1(0.55f, v02)));
        this.h.setTextColor(bkb.p1(0.55f, v02));
        this.n.setColorFilter(new PorterDuffColorFilter(bkb.p1(0.6f, v02), PorterDuff.Mode.SRC_IN));
        this.w.setColor(bkb.p1(0.1f, v02));
        this.b.invalidate();
    }
}

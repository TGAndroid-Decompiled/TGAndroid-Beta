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
import android.widget.TextView;
import java.util.HashSet;
public final class gy7 extends FrameLayout implements vlb {
    public boolean a;
    public int b;
    public final int c;
    public final ylb d;
    public final FrameLayout e;
    public final bf0 f;
    public final TextView h;
    public final TextView n;
    public final ImageView r;
    public boolean s;
    public String w;

    public gy7(int i, ylb ylbVar, Context context) {
        super(context);
        this.c = i;
        this.d = ylbVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, qoe.d(36, 36.0f, 19, 18.5f, 0.0f, 0.0f, 0.0f));
        bf0 bf0Var = new bf0(context);
        this.f = bf0Var;
        bf0Var.setImageResource(2131232038);
        a();
        frameLayout.addView(bf0Var, qoe.e(36, 36, 17));
        TextView b = jxe.b(context, 15.0f, cmb.F6, true, null);
        this.h = b;
        b.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        b.setEllipsize(truncateAt);
        addView(b, qoe.d(-1, -2.0f, 55, 72.0f, 8.0f, 46.0f, 0.0f));
        int i2 = cmb.x6;
        TextView b2 = jxe.b(context, 13.0f, i2, false, null);
        this.n = b2;
        b2.setSingleLine();
        b2.setEllipsize(truncateAt);
        addView(b2, qoe.d(-1, -2.0f, 55, 72.0f, 31.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.r = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231248);
        anb.s(imageView, i2, null, PorterDuff.Mode.SRC_IN);
        int i3 = cmb.h6;
        fg0 f0 = cmb.f0(cmb.v0(i3, ylbVar), 1, -1);
        wmb M = anb.M(i3);
        imageView.setBackground(f0);
        anb.j(imageView, f0, null, M, ylbVar);
        addView(imageView, qoe.d(32, 32.0f, 21, 0.0f, 0.0f, 13.0f, 0.0f));
    }

    public final void a() {
        this.b = cmb.p1(0.3f, cmb.v0(cmb.F6, this.d));
        this.a = true;
        this.f.setColorFilter(new PorterDuffColorFilter(this.b, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.s) {
            Paint U0 = cmb.U0("paintDivider", this.d);
            if (U0 == null) {
                U0 = cmb.j0;
            }
            Paint paint = U0;
            float f2 = 72.0f;
            if (jb6.a0) {
                f = 0.0f;
            } else {
                f = 72.0f;
            }
            float L = gm.L(f);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!jb6.a0) {
                f2 = 0.0f;
            }
            canvas.drawRect(L, measuredHeight, width - gm.L(f2), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(56.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        bf0 bf0Var;
        int p1;
        try {
            if (this.a && (bf0Var = this.f) != null && (p1 = cmb.p1(0.3f, cmb.v0(cmb.F6, this.d))) != this.b) {
                this.b = p1;
                bf0Var.setColorFilter(new PorterDuffColorFilter(p1, PorterDuff.Mode.SRC_IN));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

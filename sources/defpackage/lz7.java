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
public final class lz7 extends FrameLayout implements snb {
    public boolean a;
    public int b;
    public final int c;
    public final vnb d;
    public final FrameLayout e;
    public final de0 f;
    public final TextView h;
    public final TextView n;
    public final ImageView r;
    public boolean s;
    public String w;

    public lz7(int i, vnb vnbVar, Context context) {
        super(context);
        this.c = i;
        this.d = vnbVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, tre.d(36, 36.0f, 19, 18.5f, 0.0f, 0.0f, 0.0f));
        de0 de0Var = new de0(context);
        this.f = de0Var;
        de0Var.setImageResource(2131232037);
        a();
        frameLayout.addView(de0Var, tre.e(36, 36, 17));
        TextView b = zze.b(context, 15.0f, aob.G6, true, null);
        this.h = b;
        b.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        b.setEllipsize(truncateAt);
        addView(b, tre.d(-1, -2.0f, 55, 72.0f, 8.0f, 46.0f, 0.0f));
        int i2 = aob.y6;
        TextView b2 = zze.b(context, 13.0f, i2, false, null);
        this.n = b2;
        b2.setSingleLine();
        b2.setEllipsize(truncateAt);
        addView(b2, tre.d(-1, -2.0f, 55, 72.0f, 31.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.r = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231247);
        yob.s(imageView, i2, null, PorterDuff.Mode.SRC_IN);
        int i3 = aob.i6;
        hf0 f0 = aob.f0(aob.v0(i3, vnbVar), 1, -1);
        uob M = yob.M(i3);
        imageView.setBackground(f0);
        yob.j(imageView, f0, null, M, vnbVar);
        addView(imageView, tre.d(32, 32.0f, 21, 0.0f, 0.0f, 13.0f, 0.0f));
    }

    public final void a() {
        this.b = aob.p1(0.3f, aob.v0(aob.G6, this.d));
        this.a = true;
        this.f.setColorFilter(new PorterDuffColorFilter(this.b, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.s) {
            Paint U0 = aob.U0("paintDivider", this.d);
            if (U0 == null) {
                U0 = aob.j0;
            }
            Paint paint = U0;
            float f2 = 72.0f;
            if (ob6.a0) {
                f = 0.0f;
            } else {
                f = 72.0f;
            }
            float L = hl.L(f);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!ob6.a0) {
                f2 = 0.0f;
            }
            canvas.drawRect(L, measuredHeight, width - hl.L(f2), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(56.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        de0 de0Var;
        int p1;
        try {
            if (this.a && (de0Var = this.f) != null && (p1 = aob.p1(0.3f, aob.v0(aob.G6, this.d))) != this.b) {
                this.b = p1;
                de0Var.setColorFilter(new PorterDuffColorFilter(p1, PorterDuff.Mode.SRC_IN));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

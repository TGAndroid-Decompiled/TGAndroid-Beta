package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public class lj8 extends FrameLayout {
    public final lka a;
    public final TextView b;
    public final ImageView c;
    public final ImageView d;
    public boolean e;
    public hk8 f;
    public tm h;
    public Drawable n;

    public lj8(Context context, ylb ylbVar) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setClipChildren(false);
        linearLayout.setClipChildren(false);
        lka lkaVar = new lka(context);
        this.a = lkaVar;
        lkaVar.setTypeface(gm.o());
        lkaVar.setTextSize(15);
        anb.W(lkaVar, cmb.F6, ylbVar);
        linearLayout.addView(lkaVar, qoe.o(-1, -2));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        anb.X(textView, cmb.x6, ylbVar);
        textView.setLineSpacing(gm.L(2.0f), 1.0f);
        linearLayout.addView(textView, qoe.q(-1, -2, 0.0f, 0, 0, 1, 0, 0));
        addView(linearLayout, qoe.d(-1, -2.0f, 0, 62.0f, 8.0f, 48.0f, 9.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        imageView.setScaleType(scaleType);
        addView(imageView, qoe.d(28, 28.0f, 0, 18.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131232065);
        anb.s(imageView2, cmb.L6, ylbVar, PorterDuff.Mode.SRC_ATOP);
        addView(imageView2, qoe.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    public final void a(hk8 hk8Var, boolean z) {
        long longValue;
        boolean p = z8c.h(z8c.t0).p();
        ImageView imageView = this.d;
        if (p && hk8Var.a == 12 && hk8Var.b == 2131231153) {
            imageView.setVisibility(8);
            if (this.h == null) {
                this.h = new tm(gm.L(24.0f), 13, this, false);
                if (isAttachedToWindow()) {
                    this.h.a();
                }
            }
            Long i = m9c.i(z8c.h(z8c.t0).f());
            if (i == null) {
                longValue = 0;
            } else {
                longValue = i.longValue();
            }
            b(longValue, false);
        } else {
            imageView.setVisibility(0);
            tm tmVar = this.h;
            if (tmVar != null) {
                tmVar.b();
                this.h = null;
            }
        }
        this.f = hk8Var;
        this.a.l(hk8Var.c, false);
        this.b.setText(hk8Var.d);
        this.c.setImageResource(hk8Var.b);
        this.e = z;
    }

    public final void b(long j, boolean z) {
        if (this.h == null) {
            this.h = new tm(gm.L(24.0f), 13, this, false);
            if (isAttachedToWindow()) {
                this.h.a();
            }
        }
        if (j == 0) {
            if (this.n == null) {
                Drawable mutate = getContext().getResources().getDrawable(2131232316).mutate();
                this.n = mutate;
                anb.x(this, mutate, cmb.u6, null, PorterDuff.Mode.SRC_IN);
            }
            this.h.g(this.n, z);
            return;
        }
        this.h.j(j, z);
    }

    public final void c() {
        this.h.setBounds((getWidth() - this.h.s) - gm.L(21.0f), (getHeight() - this.h.s) / 2, getWidth() - gm.L(21.0f), (getHeight() + this.h.s) / 2);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.h != null) {
            c();
            this.h.k(Integer.valueOf(cmb.w0(null, cmb.u6, false)));
            this.h.draw(canvas);
        }
        if (this.e) {
            canvas.drawRect(gm.L(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), cmb.j0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        tm tmVar = this.h;
        if (tmVar != null) {
            tmVar.a();
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        tm tmVar = this.h;
        if (tmVar != null) {
            tmVar.b();
        }
        super.onDetachedFromWindow();
    }
}

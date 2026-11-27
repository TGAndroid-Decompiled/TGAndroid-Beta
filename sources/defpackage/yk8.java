package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public class yk8 extends FrameLayout {
    public final ema a;
    public final TextView b;
    public final ImageView c;
    public final ImageView d;
    public boolean e;
    public sl8 f;
    public ul h;
    public Drawable n;

    public yk8(Context context, vnb vnbVar) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setClipChildren(false);
        linearLayout.setClipChildren(false);
        ema emaVar = new ema(context);
        this.a = emaVar;
        emaVar.setTypeface(hl.o());
        emaVar.setTextSize(15);
        yob.W(emaVar, aob.G6, vnbVar);
        linearLayout.addView(emaVar, tre.o(-1, -2));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        yob.X(textView, aob.y6, vnbVar);
        textView.setLineSpacing(hl.L(2.0f), 1.0f);
        linearLayout.addView(textView, tre.q(-1, -2, 0.0f, 0, 0, 1, 0, 0));
        addView(linearLayout, tre.d(-1, -2.0f, 0, 62.0f, 8.0f, 48.0f, 9.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        imageView.setScaleType(scaleType);
        addView(imageView, tre.d(28, 28.0f, 0, 18.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131232064);
        yob.s(imageView2, aob.M6, vnbVar, PorterDuff.Mode.SRC_ATOP);
        addView(imageView2, tre.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    public final void a(sl8 sl8Var, boolean z) {
        long longValue;
        boolean p = yac.h(yac.t0).p();
        ImageView imageView = this.d;
        if (p && sl8Var.a == 12 && sl8Var.b == 2131231152) {
            imageView.setVisibility(8);
            if (this.h == null) {
                this.h = new ul(hl.L(24.0f), 13, this, false);
                if (isAttachedToWindow()) {
                    this.h.a();
                }
            }
            Long i = lbc.i(yac.h(yac.t0).f());
            if (i == null) {
                longValue = 0;
            } else {
                longValue = i.longValue();
            }
            b(longValue, false);
        } else {
            imageView.setVisibility(0);
            ul ulVar = this.h;
            if (ulVar != null) {
                ulVar.b();
                this.h = null;
            }
        }
        this.f = sl8Var;
        this.a.l(sl8Var.c, false);
        this.b.setText(sl8Var.d);
        this.c.setImageResource(sl8Var.b);
        this.e = z;
    }

    public final void b(long j, boolean z) {
        if (this.h == null) {
            this.h = new ul(hl.L(24.0f), 13, this, false);
            if (isAttachedToWindow()) {
                this.h.a();
            }
        }
        if (j == 0) {
            if (this.n == null) {
                Drawable mutate = getContext().getResources().getDrawable(2131232315).mutate();
                this.n = mutate;
                yob.x(this, mutate, aob.v6, null, PorterDuff.Mode.SRC_IN);
            }
            this.h.g(this.n, z);
            return;
        }
        this.h.j(j, z);
    }

    public final void c() {
        this.h.setBounds((getWidth() - this.h.s) - hl.L(21.0f), (getHeight() - this.h.s) / 2, getWidth() - hl.L(21.0f), (getHeight() + this.h.s) / 2);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.h != null) {
            c();
            this.h.k(Integer.valueOf(aob.w0(null, aob.v6, false)));
            this.h.draw(canvas);
        }
        if (this.e) {
            canvas.drawRect(hl.L(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), aob.j0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        ul ulVar = this.h;
        if (ulVar != null) {
            ulVar.a();
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        ul ulVar = this.h;
        if (ulVar != null) {
            ulVar.b();
        }
        super.onDetachedFromWindow();
    }
}

package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.z70;
public final class wa extends LinearLayout {
    public final int f9707a;
    public Object f9708b;
    public Object f9709c;
    public View d;

    public wa(Context context, int i7) {
        super(context);
        this.f9707a = i7;
        switch (i7) {
            case 6:
                super(context);
                return;
            default:
                setOrientation(1);
                org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
                this.f9708b = i9Var;
                i9Var.setRoundRadius(org.telegram.messenger.g0.L(35.0f));
                addView(i9Var, c8.ja.r(70, 70, 1));
                TextView textView = new TextView(context);
                this.f9709c = textView;
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setTextSize(1, 20.0f);
                textView.setGravity(17);
                addView(textView, c8.ja.s(-1, -2, 0, 0.0f, 11.33f, 0.0f, 7.0f));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                textView2.setGravity(17);
                addView(textView2, c8.ja.o(-1, -2));
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f9707a) {
            case 1:
                Path path = (Path) this.f9709c;
                if (((fi.n0) this.d).f12050a) {
                    path.rewind();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (((bc) this.f9708b) == null) {
                        this.f9708b = new bc(1, 250);
                    }
                    ((bc) this.f9708b).f(0, 0, getWidth(), getHeight());
                    bc bcVar = (bc) this.f9708b;
                    bcVar.h = 30.0f;
                    bcVar.d();
                    ((bc) this.f9708b).b(canvas, -1, 0.85f);
                    invalidate();
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f10;
        switch (this.f9707a) {
            case 5:
                RectF rectF = (RectF) this.f9708b;
                Paint paint = (Paint) this.f9709c;
                dq dqVar = (dq) this.d;
                paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28940i5, dqVar.f34038e0));
                int left = dqVar.F[0].getLeft() - org.telegram.messenger.g0.L(13.0f);
                float L = org.telegram.messenger.g0.L(91.0f);
                org.telegram.ui.ActionBar.f0 f0Var = dqVar.G;
                if (f0Var.getVisibility() == 0) {
                    f10 = f0Var.getAlpha() * org.telegram.messenger.g0.L(25.0f);
                } else {
                    f10 = 0.0f;
                }
                rectF.set(left, org.telegram.messenger.g0.L(5.0f), left + ((int) (L + f10)), org.telegram.messenger.g0.L(37.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), paint);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f9707a) {
            case 4:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    public wa(dq dqVar, Context context) {
        super(context);
        this.f9707a = 5;
        this.d = dqVar;
        this.f9708b = new RectF();
        this.f9709c = new Paint(1);
    }

    public wa(org.telegram.ui.Cells.c2 c2Var, Context context, int i7) {
        super(context);
        this.f9707a = 4;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = c2Var.f30090b;
        org.telegram.ui.ActionBar.j6.w0(i10, e6Var);
        if (i7 != 0) {
            ImageView imageView = new ImageView(context);
            this.f9708b = imageView;
            org.telegram.ui.ActionBar.q6.s(imageView, i10, e6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setImageResource(i7);
        }
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, true, false);
        this.f9709c = h6Var;
        h6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        org.telegram.ui.ActionBar.q6.Y(h6Var, i10, e6Var);
        h6Var.setIncludeFontPadding(false);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        View view = new View(context);
        this.d = view;
        Drawable mutate = getContext().getResources().getDrawable(2131230871).mutate();
        org.telegram.ui.ActionBar.q6.x(this, mutate, i10, e6Var, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        if (hd.f24101a0) {
            addView(view, c8.ja.t(16, 16, 16, 11, 0, 3, 0));
            addView(h6Var, c8.ja.t(-2, 16, 16, 0, 0, ((ImageView) this.f9708b) != null ? 3 : 11, 0));
            View view2 = (ImageView) this.f9708b;
            if (view2 != null) {
                addView(view2, c8.ja.t(16, 16, 16, 0, 0, 11, 0));
            }
        } else {
            View view3 = (ImageView) this.f9708b;
            if (view3 != null) {
                addView(view3, c8.ja.t(16, 16, 16, 11, 0, 3, 0));
            }
            addView(h6Var, c8.ja.t(-2, 16, 16, ((ImageView) this.f9708b) == null ? 11 : 0, 0, 3, 0));
            addView(view, c8.ja.t(16, 16, 16, 0, 0, 11, 0));
        }
        int i11 = org.telegram.ui.ActionBar.j6.f28941i6;
        Drawable a02 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i11, e6Var), 16, 16);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
        setBackground(a02);
        org.telegram.ui.ActionBar.q6.j(this, a02, null, M, e6Var);
        setClickable(true);
    }

    public wa(fi.n0 n0Var, Context context) {
        super(context);
        this.f9707a = 1;
        this.d = n0Var;
        this.f9709c = new Path();
    }

    public wa(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f9707a = i7;
        switch (i7) {
            case 2:
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                ra raVar = new ra(context, 70, 0, 1);
                frameLayout.addView(raVar, c8.ja.c(-1.0f, -1));
                org.telegram.ui.Wallet.w6 w6Var = new org.telegram.ui.Wallet.w6(170, context, false);
                this.f9708b = w6Var;
                w6Var.setStarParticlesView(raVar);
                frameLayout.addView(w6Var, c8.ja.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                w6Var.setPaused(false);
                addView(frameLayout, c8.ja.c(180.0f, -1));
                TextView textView = new TextView(context);
                this.f9709c = textView;
                i5.c.v(textView, 1, 20.0f);
                int i10 = org.telegram.ui.ActionBar.j6.f28957j5;
                org.telegram.ui.ActionBar.q6.U(textView, i10, e6Var);
                textView.setGravity(17);
                addView(textView, c8.ja.t(-2, -2, 1, 0, 2, 0, 0));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.q6.U(textView2, i10, e6Var);
                textView2.setGravity(17);
                addView(textView2, c8.ja.t(-2, -2, 1, 0, 9, 0, 18));
                return;
            default:
                setOrientation(1);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                frameLayout2.addView(new ra(context, 70, 0, 0), c8.ja.c(-1.0f, -1));
                org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
                this.f9708b = i9Var;
                i9Var.setRoundRadius(org.telegram.messenger.g0.L(50.0f));
                frameLayout2.addView(i9Var, c8.ja.d(100, 100.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                addView(frameLayout2, c8.ja.c(150.0f, -1));
                TextView textView3 = new TextView(context);
                this.f9709c = textView3;
                i5.c.v(textView3, 1, 20.0f);
                int i11 = org.telegram.ui.ActionBar.j6.f28957j5;
                org.telegram.ui.ActionBar.q6.U(textView3, i11, e6Var);
                textView3.setGravity(17);
                addView(textView3, c8.ja.t(-2, -2, 1, 0, 2, 0, 0));
                z70 z70Var = new z70(context, e6Var);
                this.d = z70Var;
                org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.Xc, e6Var);
                z70Var.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.q6.U(z70Var, i11, e6Var);
                z70Var.setGravity(17);
                addView(z70Var, c8.ja.t(-2, -2, 1, 0, 9, 0, 18));
                return;
        }
    }
}

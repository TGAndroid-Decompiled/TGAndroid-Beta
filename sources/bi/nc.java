package bi;

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
import org.telegram.ui.Components.vp;
import org.telegram.ui.Components.x70;
public final class nc extends LinearLayout {
    public final int f4434a;
    public Object f4435b;
    public Object f4436c;
    public View d;

    public nc(Context context, int i7) {
        super(context);
        this.f4434a = i7;
        switch (i7) {
            case 6:
                super(context);
                return;
            default:
                setOrientation(1);
                org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
                this.f4435b = l9Var;
                l9Var.setRoundRadius(org.telegram.messenger.g0.L(35.0f));
                addView(l9Var, c8.ha.r(70, 70, 1));
                TextView textView = new TextView(context);
                this.f4436c = textView;
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setTextSize(1, 20.0f);
                textView.setGravity(17);
                addView(textView, c8.ha.s(-1, -2, 0, 0.0f, 11.33f, 0.0f, 7.0f));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                textView2.setGravity(17);
                addView(textView2, c8.ha.o(-1, -2));
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f4434a) {
            case 1:
                Path path = (Path) this.f4436c;
                if (((di.n0) this.d).f9367a) {
                    path.rewind();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (((ud) this.f4435b) == null) {
                        this.f4435b = new ud(1, 250);
                    }
                    ((ud) this.f4435b).f(0, 0, getWidth(), getHeight());
                    ud udVar = (ud) this.f4435b;
                    udVar.h = 30.0f;
                    udVar.d();
                    ((ud) this.f4435b).b(canvas, -1, 0.85f);
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
        switch (this.f4434a) {
            case 5:
                RectF rectF = (RectF) this.f4435b;
                Paint paint = (Paint) this.f4436c;
                vp vpVar = (vp) this.d;
                paint.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27956i5, vpVar.f39778d0));
                int left = vpVar.E[0].getLeft() - org.telegram.messenger.g0.L(13.0f);
                float L = org.telegram.messenger.g0.L(91.0f);
                org.telegram.ui.ActionBar.f0 f0Var = vpVar.F;
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
        switch (this.f4434a) {
            case 4:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    public nc(vp vpVar, Context context) {
        super(context);
        this.f4434a = 5;
        this.d = vpVar;
        this.f4435b = new RectF();
        this.f4436c = new Paint(1);
    }

    public nc(org.telegram.ui.Cells.c2 c2Var, Context context, int i7) {
        super(context);
        this.f4434a = 4;
        int i10 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = c2Var.f28979b;
        org.telegram.ui.ActionBar.l6.w0(i10, g6Var);
        if (i7 != 0) {
            ImageView imageView = new ImageView(context);
            this.f4435b = imageView;
            org.telegram.ui.ActionBar.s6.s(imageView, i10, g6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setImageResource(i7);
        }
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, false);
        this.f4436c = j6Var;
        j6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        org.telegram.ui.ActionBar.s6.Y(j6Var, i10, g6Var);
        j6Var.setIncludeFontPadding(false);
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        View view = new View(context);
        this.d = view;
        Drawable mutate = getContext().getResources().getDrawable(2131230871).mutate();
        org.telegram.ui.ActionBar.s6.x(this, mutate, i10, g6Var, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        if (org.telegram.messenger.id.f23157a0) {
            addView(view, c8.ha.t(16, 16, 16, 11, 0, 3, 0));
            addView(j6Var, c8.ha.t(-2, 16, 16, 0, 0, ((ImageView) this.f4435b) != null ? 3 : 11, 0));
            View view2 = (ImageView) this.f4435b;
            if (view2 != null) {
                addView(view2, c8.ha.t(16, 16, 16, 0, 0, 11, 0));
            }
        } else {
            View view3 = (ImageView) this.f4435b;
            if (view3 != null) {
                addView(view3, c8.ha.t(16, 16, 16, 11, 0, 3, 0));
            }
            addView(j6Var, c8.ha.t(-2, 16, 16, ((ImageView) this.f4435b) == null ? 11 : 0, 0, 3, 0));
            addView(view, c8.ha.t(16, 16, 16, 0, 0, 11, 0));
        }
        int i11 = org.telegram.ui.ActionBar.l6.f27957i6;
        Drawable a02 = org.telegram.ui.ActionBar.l6.a0(org.telegram.ui.ActionBar.l6.w0(i11, g6Var), 16, 16);
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i11);
        setBackground(a02);
        org.telegram.ui.ActionBar.s6.j(this, a02, null, M, g6Var);
        setClickable(true);
    }

    public nc(di.n0 n0Var, Context context) {
        super(context);
        this.f4434a = 1;
        this.d = n0Var;
        this.f4436c = new Path();
    }

    public nc(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f4434a = i7;
        switch (i7) {
            case 2:
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                gc gcVar = new gc(context, 70, 0, 1);
                frameLayout.addView(gcVar, c8.ha.c(-1.0f, -1));
                org.telegram.ui.Wallet.u6 u6Var = new org.telegram.ui.Wallet.u6(170, context, false);
                this.f4435b = u6Var;
                u6Var.setStarParticlesView(gcVar);
                frameLayout.addView(u6Var, c8.ha.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                u6Var.setPaused(false);
                addView(frameLayout, c8.ha.c(180.0f, -1));
                TextView textView = new TextView(context);
                this.f4436c = textView;
                com.google.android.recaptcha.internal.a.q(textView, 1, 20.0f);
                int i10 = org.telegram.ui.ActionBar.l6.f27973j5;
                org.telegram.ui.ActionBar.s6.U(textView, i10, g6Var);
                textView.setGravity(17);
                addView(textView, c8.ha.t(-2, -2, 1, 0, 2, 0, 0));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.s6.U(textView2, i10, g6Var);
                textView2.setGravity(17);
                addView(textView2, c8.ha.t(-2, -2, 1, 0, 9, 0, 18));
                return;
            default:
                setOrientation(1);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                frameLayout2.addView(new gc(context, 70, 0, 0), c8.ha.c(-1.0f, -1));
                org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
                this.f4435b = l9Var;
                l9Var.setRoundRadius(org.telegram.messenger.g0.L(50.0f));
                frameLayout2.addView(l9Var, c8.ha.d(100, 100.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                addView(frameLayout2, c8.ha.c(150.0f, -1));
                TextView textView3 = new TextView(context);
                this.f4436c = textView3;
                com.google.android.recaptcha.internal.a.q(textView3, 1, 20.0f);
                int i11 = org.telegram.ui.ActionBar.l6.f27973j5;
                org.telegram.ui.ActionBar.s6.U(textView3, i11, g6Var);
                textView3.setGravity(17);
                addView(textView3, c8.ha.t(-2, -2, 1, 0, 2, 0, 0));
                x70 x70Var = new x70(context, g6Var);
                this.d = x70Var;
                org.telegram.ui.ActionBar.s6.G(x70Var, org.telegram.ui.ActionBar.l6.Uc, g6Var);
                x70Var.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.s6.U(x70Var, i11, g6Var);
                x70Var.setGravity(17);
                addView(x70Var, c8.ha.t(-2, -2, 1, 0, 9, 0, 18));
                return;
        }
    }
}

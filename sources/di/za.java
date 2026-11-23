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
import org.telegram.messenger.gd;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.jq;
public final class za extends LinearLayout {
    public final int f10165a;
    public Object f10166b;
    public Object f10167c;
    public View d;

    public za(Context context, int i7) {
        super(context);
        this.f10165a = i7;
        switch (i7) {
            case 6:
                super(context);
                return;
            default:
                setOrientation(1);
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
                this.f10166b = p9Var;
                p9Var.setRoundRadius(org.telegram.messenger.g0.L(35.0f));
                addView(p9Var, c8.na.r(70, 70, 1));
                TextView textView = new TextView(context);
                this.f10167c = textView;
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setTextSize(1, 20.0f);
                textView.setGravity(17);
                addView(textView, c8.na.s(-1, -2, 0, 0.0f, 11.33f, 0.0f, 7.0f));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                textView2.setGravity(17);
                addView(textView2, c8.na.o(-1, -2));
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f10165a) {
            case 1:
                Path path = (Path) this.f10167c;
                if (((fi.m0) this.d).f12249a) {
                    path.rewind();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (((ec) this.f10166b) == null) {
                        this.f10166b = new ec(1, 250);
                    }
                    ((ec) this.f10166b).f(0, 0, getWidth(), getHeight());
                    ec ecVar = (ec) this.f10166b;
                    ecVar.h = 30.0f;
                    ecVar.d();
                    ((ec) this.f10166b).b(canvas, -1, 0.85f);
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
        switch (this.f10165a) {
            case 5:
                RectF rectF = (RectF) this.f10166b;
                Paint paint = (Paint) this.f10167c;
                jq jqVar = (jq) this.d;
                paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29542i5, jqVar.f36487e0));
                int left = jqVar.F[0].getLeft() - org.telegram.messenger.g0.L(13.0f);
                float L = org.telegram.messenger.g0.L(91.0f);
                org.telegram.ui.ActionBar.f0 f0Var = jqVar.G;
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
        switch (this.f10165a) {
            case 4:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    public za(jq jqVar, Context context) {
        super(context);
        this.f10165a = 5;
        this.d = jqVar;
        this.f10166b = new RectF();
        this.f10167c = new Paint(1);
    }

    public za(org.telegram.ui.Cells.d2 d2Var, Context context, int i7) {
        super(context);
        this.f10165a = 4;
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.i6 i6Var = d2Var.f30612b;
        org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
        if (i7 != 0) {
            ImageView imageView = new ImageView(context);
            this.f10166b = imageView;
            org.telegram.ui.ActionBar.u6.s(imageView, i10, i6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setImageResource(i7);
        }
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, true, false);
        this.f10167c = n6Var;
        n6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        org.telegram.ui.ActionBar.u6.Y(n6Var, i10, i6Var);
        n6Var.setIncludeFontPadding(false);
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        View view = new View(context);
        this.d = view;
        Drawable mutate = getContext().getResources().getDrawable(2131230871).mutate();
        org.telegram.ui.ActionBar.u6.x(this, mutate, i10, i6Var, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        if (gd.f24314a0) {
            addView(view, c8.na.t(16, 16, 16, 11, 0, 3, 0));
            addView(n6Var, c8.na.t(-2, 16, 16, 0, 0, ((ImageView) this.f10166b) != null ? 3 : 11, 0));
            View view2 = (ImageView) this.f10166b;
            if (view2 != null) {
                addView(view2, c8.na.t(16, 16, 16, 0, 0, 11, 0));
            }
        } else {
            View view3 = (ImageView) this.f10166b;
            if (view3 != null) {
                addView(view3, c8.na.t(16, 16, 16, 11, 0, 3, 0));
            }
            addView(n6Var, c8.na.t(-2, 16, 16, ((ImageView) this.f10166b) == null ? 11 : 0, 0, 3, 0));
            addView(view, c8.na.t(16, 16, 16, 0, 0, 11, 0));
        }
        int i11 = org.telegram.ui.ActionBar.n6.f29543i6;
        Drawable a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i11, i6Var), 16, 16);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
        setBackground(a02);
        org.telegram.ui.ActionBar.u6.j(this, a02, null, M, i6Var);
        setClickable(true);
    }

    public za(fi.m0 m0Var, Context context) {
        super(context);
        this.f10165a = 1;
        this.d = m0Var;
        this.f10167c = new Path();
    }

    public za(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f10165a = i7;
        switch (i7) {
            case 2:
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                ua uaVar = new ua(context, 70, 0, 1);
                frameLayout.addView(uaVar, c8.na.c(-1.0f, -1));
                org.telegram.ui.Wallet.n7 n7Var = new org.telegram.ui.Wallet.n7(170, context, false);
                this.f10166b = n7Var;
                n7Var.setStarParticlesView(uaVar);
                frameLayout.addView(n7Var, c8.na.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                n7Var.setPaused(false);
                addView(frameLayout, c8.na.c(180.0f, -1));
                TextView textView = new TextView(context);
                this.f10167c = textView;
                i5.c.x(textView, 1, 20.0f);
                int i10 = org.telegram.ui.ActionBar.n6.f29559j5;
                org.telegram.ui.ActionBar.u6.U(textView, i10, i6Var);
                textView.setGravity(17);
                addView(textView, c8.na.t(-2, -2, 1, 0, 2, 0, 0));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.u6.U(textView2, i10, i6Var);
                textView2.setGravity(17);
                addView(textView2, c8.na.t(-2, -2, 1, 0, 9, 0, 18));
                return;
            default:
                setOrientation(1);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                frameLayout2.addView(new ua(context, 70, 0, 0), c8.na.c(-1.0f, -1));
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
                this.f10166b = p9Var;
                p9Var.setRoundRadius(org.telegram.messenger.g0.L(50.0f));
                frameLayout2.addView(p9Var, c8.na.d(100, 100.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                addView(frameLayout2, c8.na.c(150.0f, -1));
                TextView textView3 = new TextView(context);
                this.f10167c = textView3;
                i5.c.x(textView3, 1, 20.0f);
                int i11 = org.telegram.ui.ActionBar.n6.f29559j5;
                org.telegram.ui.ActionBar.u6.U(textView3, i11, i6Var);
                textView3.setGravity(17);
                addView(textView3, c8.na.t(-2, -2, 1, 0, 2, 0, 0));
                j80 j80Var = new j80(context, i6Var);
                this.d = j80Var;
                org.telegram.ui.ActionBar.u6.G(j80Var, org.telegram.ui.ActionBar.n6.Xc, i6Var);
                j80Var.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.u6.U(j80Var, i11, i6Var);
                j80Var.setGravity(17);
                addView(j80Var, c8.na.t(-2, -2, 1, 0, 9, 0, 18));
                return;
        }
    }
}

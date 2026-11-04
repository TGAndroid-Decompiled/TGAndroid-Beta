package ci;

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
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.vp;
public final class gb extends LinearLayout {
    public final int f5197a;
    public Object f5198b;
    public Object f5199c;
    public View d;

    public gb(Context context, int i3) {
        super(context);
        this.f5197a = i3;
        switch (i3) {
            case 6:
                super(context);
                return;
            default:
                setOrientation(1);
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
                this.f5198b = k9Var;
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(35.0f));
                addView(k9Var, mf.r(70, 70, 1));
                TextView textView = new TextView(context);
                this.f5199c = textView;
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setTextSize(1, 20.0f);
                textView.setGravity(17);
                addView(textView, mf.s(-1, -2, 0, 0.0f, 11.33f, 0.0f, 7.0f));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                textView2.setGravity(17);
                addView(textView2, mf.o(-1, -2));
                return;
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f5197a) {
            case 1:
                Path path = (Path) this.f5199c;
                if (((ei.p0) this.d).f10741a) {
                    path.rewind();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (((lc) this.f5198b) == null) {
                        this.f5198b = new lc(1, 250);
                    }
                    ((lc) this.f5198b).f(0, 0, getWidth(), getHeight());
                    lc lcVar = (lc) this.f5198b;
                    lcVar.h = 30.0f;
                    lcVar.d();
                    ((lc) this.f5198b).b(canvas, -1, 0.85f);
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
        switch (this.f5197a) {
            case 5:
                RectF rectF = (RectF) this.f5198b;
                Paint paint = (Paint) this.f5199c;
                vp vpVar = (vp) this.d;
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27971i5, vpVar.f39757e0));
                int left = vpVar.F[0].getLeft() - org.telegram.messenger.g0.L(13.0f);
                float L = org.telegram.messenger.g0.L(91.0f);
                org.telegram.ui.ActionBar.e0 e0Var = vpVar.G;
                if (e0Var.getVisibility() == 0) {
                    f10 = e0Var.getAlpha() * org.telegram.messenger.g0.L(25.0f);
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
    public void onMeasure(int i3, int i10) {
        switch (this.f5197a) {
            case 4:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), 1073741824));
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    public gb(vp vpVar, Context context) {
        super(context);
        this.f5197a = 5;
        this.d = vpVar;
        this.f5198b = new RectF();
        this.f5199c = new Paint(1);
    }

    public gb(org.telegram.ui.Cells.c2 c2Var, Context context, int i3) {
        super(context);
        this.f5197a = 4;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = c2Var.f29033b;
        org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
        if (i3 != 0) {
            ImageView imageView = new ImageView(context);
            this.f5198b = imageView;
            org.telegram.ui.ActionBar.r6.t(imageView, i10, e6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setImageResource(i3);
        }
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, true, false);
        this.f5199c = h6Var;
        h6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        org.telegram.ui.ActionBar.r6.Z(h6Var, i10, e6Var);
        h6Var.setIncludeFontPadding(false);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        View view = new View(context);
        this.d = view;
        Drawable mutate = getContext().getResources().getDrawable(2131230871).mutate();
        org.telegram.ui.ActionBar.r6.y(this, mutate, i10, e6Var, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        if (bd.f21784a0) {
            addView(view, mf.t(16, 16, 16, 11, 0, 3, 0));
            addView(h6Var, mf.t(-2, 16, 16, 0, 0, ((ImageView) this.f5198b) != null ? 3 : 11, 0));
            View view2 = (ImageView) this.f5198b;
            if (view2 != null) {
                addView(view2, mf.t(16, 16, 16, 0, 0, 11, 0));
            }
        } else {
            View view3 = (ImageView) this.f5198b;
            if (view3 != null) {
                addView(view3, mf.t(16, 16, 16, 11, 0, 3, 0));
            }
            addView(h6Var, mf.t(-2, 16, 16, ((ImageView) this.f5198b) == null ? 11 : 0, 0, 3, 0));
            addView(view, mf.t(16, 16, 16, 0, 0, 11, 0));
        }
        int i11 = org.telegram.ui.ActionBar.k6.f27972i6;
        Drawable a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i11, e6Var), 16, 16);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(this, a02, null, N, e6Var);
        setClickable(true);
    }

    public gb(ei.p0 p0Var, Context context) {
        super(context);
        this.f5197a = 1;
        this.d = p0Var;
        this.f5199c = new Path();
    }

    public gb(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f5197a = i3;
        switch (i3) {
            case 2:
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                bb bbVar = new bb(context, 70, 0, 1);
                frameLayout.addView(bbVar, mf.c(-1.0f, -1));
                org.telegram.ui.Wallet.u6 u6Var = new org.telegram.ui.Wallet.u6(170, context, false);
                this.f5198b = u6Var;
                u6Var.setStarParticlesView(bbVar);
                frameLayout.addView(u6Var, mf.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                u6Var.setPaused(false);
                addView(frameLayout, mf.c(180.0f, -1));
                TextView textView = new TextView(context);
                this.f5199c = textView;
                k2.p1.t(textView, 1, 20.0f);
                int i10 = org.telegram.ui.ActionBar.k6.f27988j5;
                org.telegram.ui.ActionBar.r6.V(textView, i10, e6Var);
                textView.setGravity(17);
                addView(textView, mf.t(-2, -2, 1, 0, 2, 0, 0));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.V(textView2, i10, e6Var);
                textView2.setGravity(17);
                addView(textView2, mf.t(-2, -2, 1, 0, 9, 0, 18));
                return;
            default:
                setOrientation(1);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                frameLayout2.addView(new bb(context, 70, 0, 0), mf.c(-1.0f, -1));
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
                this.f5198b = k9Var;
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(50.0f));
                frameLayout2.addView(k9Var, mf.d(100, 100.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                addView(frameLayout2, mf.c(150.0f, -1));
                TextView textView3 = new TextView(context);
                this.f5199c = textView3;
                k2.p1.t(textView3, 1, 20.0f);
                int i11 = org.telegram.ui.ActionBar.k6.f27988j5;
                org.telegram.ui.ActionBar.r6.V(textView3, i11, e6Var);
                textView3.setGravity(17);
                addView(textView3, mf.t(-2, -2, 1, 0, 2, 0, 0));
                s70 s70Var = new s70(context, e6Var);
                this.d = s70Var;
                org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.Uc, e6Var);
                s70Var.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.V(s70Var, i11, e6Var);
                s70Var.setGravity(17);
                addView(s70Var, mf.t(-2, -2, 1, 0, 9, 0, 18));
                return;
        }
    }
}

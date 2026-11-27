package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.p;
import org.telegram.ui.LaunchActivity;
public final class rg2 extends LinearLayout {
    public final byte a;
    public Object b;
    public Object c;
    public View d;

    public rg2(Context context, vnb vnbVar, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 8:
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                rhb rhbVar = new rhb(context, 70, 0);
                frameLayout.addView(rhbVar, tre.c(-1.0f, -1));
                yrc yrcVar = new yrc(170, context, false);
                this.b = yrcVar;
                yrcVar.setStarParticlesView(rhbVar);
                frameLayout.addView(yrcVar, tre.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                yrcVar.setPaused(false);
                addView(frameLayout, tre.c(180.0f, -1));
                TextView textView = new TextView(context);
                this.c = textView;
                bs2.t(textView, 1, 20.0f);
                int i = aob.j5;
                yob.X(textView, i, vnbVar);
                textView.setGravity(17);
                addView(textView, tre.t(-2, -2, 1, 0, 2, 0, 0));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                yob.X(textView2, i, vnbVar);
                textView2.setGravity(17);
                addView(textView2, tre.t(-2, -2, 1, 0, 9, 0, 18));
                return;
            default:
                setOrientation(1);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                frameLayout2.addView(new uya(context, 70, 0), tre.c(-1.0f, -1));
                de0 de0Var = new de0(context);
                this.b = de0Var;
                de0Var.setRoundRadius(hl.L(50.0f));
                frameLayout2.addView(de0Var, tre.d(100, 100.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                addView(frameLayout2, tre.c(150.0f, -1));
                TextView textView3 = new TextView(context);
                this.c = textView3;
                bs2.t(textView3, 1, 20.0f);
                int i2 = aob.j5;
                yob.X(textView3, i2, vnbVar);
                textView3.setGravity(17);
                addView(textView3, tre.t(-2, -2, 1, 0, 2, 0, 0));
                p66 p66Var = new p66(context, vnbVar);
                this.d = p66Var;
                yob.G(p66Var, aob.Xc, vnbVar);
                p66Var.setTextSize(1, 14.0f);
                yob.X(p66Var, i2, vnbVar);
                p66Var.setGravity(17);
                addView(p66Var, tre.t(-2, -2, 1, 0, 9, 0, 18));
                return;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 4:
                Path path = (Path) this.c;
                if (((h96) this.d).a) {
                    path.rewind();
                    RectF rectF = hl.P;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, hl.L(13.0f), hl.L(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    yza yzaVar = (yza) this.b;
                    if (yzaVar == null) {
                        yzaVar = new yza(1, 250);
                        this.b = yzaVar;
                    }
                    yzaVar.f(0, 0, getWidth(), getHeight());
                    yza yzaVar2 = (yza) this.b;
                    yzaVar2.h = 30.0f;
                    yzaVar2.d();
                    ((yza) this.b).b(canvas, -1, 0.85f);
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
    public final void onDraw(Canvas canvas) {
        float f;
        switch (this.a) {
            case 1:
                RectF rectF = (RectF) this.b;
                Paint paint = (Paint) this.c;
                p pVar = (p) this.d;
                paint.setColor(aob.v0(aob.i5, pVar.e0));
                int left = pVar.F[0].getLeft() - hl.L(13.0f);
                float L = hl.L(91.0f);
                d7 d7Var = pVar.G;
                if (d7Var.getVisibility() == 0) {
                    f = d7Var.getAlpha() * hl.L(25.0f);
                } else {
                    f = 0.0f;
                }
                rectF.set(left, hl.L(5.0f), left + ((int) (L + f)), hl.L(37.0f));
                canvas.drawRoundRect(rectF, hl.L(16.0f), hl.L(16.0f), paint);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        switch (this.a) {
            case 0:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(32.0f), 1073741824));
                return;
            case 5:
                TextView textView = (TextView) this.c;
                TextView textView2 = (TextView) this.b;
                e29 e29Var = (e29) this.d;
                int size = View.MeasureSpec.getSize(i2);
                if (View.MeasureSpec.getMode(i2) != 0) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), Integer.MIN_VALUE);
                    textView2.measure(makeMeasureSpec, 0);
                    textView.measure(makeMeasureSpec, 0);
                    int y = c00.y(24.0f, (((size - getPaddingTop()) - getPaddingBottom()) - textView2.getMeasuredHeight()) - textView.getMeasuredHeight(), hl.L(130.0f));
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) e29Var.getLayoutParams();
                    if (y < hl.L(56.0f)) {
                        i3 = 8;
                    } else {
                        i3 = 0;
                    }
                    if (e29Var.getVisibility() != i3) {
                        e29Var.setVisibility(i3);
                    }
                    int max = Math.max(0, y);
                    layoutParams.height = max;
                    layoutParams.width = max;
                }
                super.onMeasure(i, i2);
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        switch (this.a) {
            case 6:
                ((ImageView) this.b).setOnClickListener(onClickListener);
                return;
            default:
                super.setOnClickListener(onClickListener);
                return;
        }
    }

    public rg2(p pVar, Context context) {
        super(context);
        this.a = (byte) 1;
        this.d = pVar;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    public rg2(Context context, TextView textView, TextView textView2, e29 e29Var) {
        super(context);
        this.a = (byte) 5;
        this.b = textView;
        this.c = textView2;
        this.d = e29Var;
    }

    public rg2(sg2 sg2Var, Context context, int i) {
        super(context);
        this.a = (byte) 0;
        int i2 = aob.G6;
        vnb vnbVar = sg2Var.b;
        aob.v0(i2, vnbVar);
        if (i != 0) {
            ImageView imageView = new ImageView(context);
            this.b = imageView;
            yob.s(imageView, i2, vnbVar, PorterDuff.Mode.MULTIPLY);
            imageView.setImageResource(i);
        }
        in inVar = new in(context, false, true, false);
        this.c = inVar;
        inVar.setTextSize(hl.L(13.0f));
        yob.U(inVar, i2, vnbVar);
        inVar.setIncludeFontPadding(false);
        inVar.setTypeface(hl.o());
        View view = new View(context);
        this.d = view;
        Drawable mutate = getContext().getResources().getDrawable(2131230871).mutate();
        yob.x(this, mutate, i2, vnbVar, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        if (ob6.a0) {
            addView(view, tre.t(16, 16, 16, 11, 0, 3, 0));
            addView(inVar, tre.t(-2, 16, 16, 0, 0, ((ImageView) this.b) != null ? 3 : 11, 0));
            View view2 = (ImageView) this.b;
            if (view2 != null) {
                addView(view2, tre.t(16, 16, 16, 0, 0, 11, 0));
            }
        } else {
            View view3 = (ImageView) this.b;
            if (view3 != null) {
                addView(view3, tre.t(16, 16, 16, 11, 0, 3, 0));
            }
            addView(inVar, tre.t(-2, 16, 16, ((ImageView) this.b) == null ? 11 : 0, 0, 3, 0));
            addView(view, tre.t(16, 16, 16, 0, 0, 11, 0));
        }
        int i3 = aob.i6;
        Drawable Y = aob.Y(aob.v0(i3, vnbVar), 16, 16);
        uob M = yob.M(i3);
        setBackground(Y);
        yob.j(this, Y, null, M, vnbVar);
        setClickable(true);
    }

    public rg2(h96 h96Var, Context context) {
        super(context);
        this.a = (byte) 4;
        this.d = h96Var;
        this.c = new Path();
    }

    public rg2(LaunchActivity launchActivity, int i, wq9 wq9Var, ol0 ol0Var, String str) {
        super(launchActivity);
        this.a = (byte) 6;
        setOrientation(1);
        setGravity(1);
        ImageView imageView = new ImageView(launchActivity);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setPadding(hl.L(17.0f), hl.L(17.0f), hl.L(17.0f), hl.L(17.0f));
        jl0 c = wq9Var.c(imageView, ol0Var, false);
        ik8.r(c, hl.L(26.0f), 3.0f);
        this.c = c;
        imageView.setBackground(c);
        imageView.setForeground(new InsetDrawable((Drawable) aob.h0(hl.L(52.0f), 0, vm2.o(-1, 51)), hl.L(3.0f)));
        imageView.setColorFilter(-1);
        addView(imageView, tre.t(58, 58, 1, 0, 3, 0, 0));
        TextView textView = new TextView(launchActivity);
        this.d = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine(true);
        textView.setGravity(1);
        addView(textView, tre.t(-2, -2, 1, 0, 6, 0, 0));
        imageView.setImageResource(i);
        textView.setText(str);
        setContentDescription(str);
    }

    public rg2(Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 3:
                super(context);
                setOrientation(1);
                de0 de0Var = new de0(context);
                this.b = de0Var;
                de0Var.setRoundRadius(hl.L(35.0f));
                addView(de0Var, tre.r(70, 70, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTypeface(hl.o());
                textView.setTextSize(1, 20.0f);
                textView.setGravity(17);
                addView(textView, tre.s(-1, -2, 0, 0.0f, 11.33f, 0.0f, 7.0f));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(hl.L(2.0f), 1.0f);
                textView2.setGravity(17);
                addView(textView2, tre.o(-1, -2));
                return;
            default:
                return;
        }
    }
}

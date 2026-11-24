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
public final class zf2 extends LinearLayout {
    public final byte a;
    public Object b;
    public Object c;
    public View d;

    public zf2(Context context, wjb wjbVar, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 7:
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                wdb wdbVar = new wdb(context, 70, 0);
                frameLayout.addView(wdbVar, nme.c(-1.0f, -1));
                lnc lncVar = new lnc(170, context, false);
                this.b = lncVar;
                lncVar.setStarParticlesView(wdbVar);
                frameLayout.addView(lncVar, nme.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                lncVar.setPaused(false);
                addView(frameLayout, nme.c(180.0f, -1));
                TextView textView = new TextView(context);
                this.c = textView;
                ir2.t(textView, 1, 20.0f);
                int i = bkb.i5;
                zkb.X(textView, i, wjbVar);
                textView.setGravity(17);
                addView(textView, nme.t(-2, -2, 1, 0, 2, 0, 0));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                zkb.X(textView2, i, wjbVar);
                textView2.setGravity(17);
                addView(textView2, nme.t(-2, -2, 1, 0, 9, 0, 18));
                return;
            default:
                setOrientation(1);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                frameLayout2.addView(new qua(context, 70, 0), nme.c(-1.0f, -1));
                be0 be0Var = new be0(context);
                this.b = be0Var;
                be0Var.setRoundRadius(gl.L(50.0f));
                frameLayout2.addView(be0Var, nme.d(100, 100.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                addView(frameLayout2, nme.c(150.0f, -1));
                TextView textView3 = new TextView(context);
                this.c = textView3;
                ir2.t(textView3, 1, 20.0f);
                int i2 = bkb.i5;
                zkb.X(textView3, i2, wjbVar);
                textView3.setGravity(17);
                addView(textView3, nme.t(-2, -2, 1, 0, 2, 0, 0));
                l46 l46Var = new l46(context, wjbVar);
                this.d = l46Var;
                zkb.G(l46Var, bkb.Wc, wjbVar);
                l46Var.setTextSize(1, 14.0f);
                zkb.X(l46Var, i2, wjbVar);
                l46Var.setGravity(17);
                addView(l46Var, nme.t(-2, -2, 1, 0, 9, 0, 18));
                return;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 4:
                Path path = (Path) this.c;
                if (((d76) this.d).a) {
                    path.rewind();
                    RectF rectF = gl.P;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, gl.L(13.0f), gl.L(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    vva vvaVar = (vva) this.b;
                    if (vvaVar == null) {
                        vvaVar = new vva(1, 250);
                        this.b = vvaVar;
                    }
                    vvaVar.f(0, 0, getWidth(), getHeight());
                    vva vvaVar2 = (vva) this.b;
                    vvaVar2.h = 30.0f;
                    vvaVar2.d();
                    ((vva) this.b).b(canvas, -1, 0.85f);
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
                paint.setColor(bkb.v0(bkb.h5, pVar.e0));
                int left = pVar.F[0].getLeft() - gl.L(13.0f);
                float L = gl.L(91.0f);
                c7 c7Var = pVar.G;
                if (c7Var.getVisibility() == 0) {
                    f = c7Var.getAlpha() * gl.L(25.0f);
                } else {
                    f = 0.0f;
                }
                rectF.set(left, gl.L(5.0f), left + ((int) (L + f)), gl.L(37.0f));
                canvas.drawRoundRect(rectF, gl.L(16.0f), gl.L(16.0f), paint);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(32.0f), 1073741824));
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        switch (this.a) {
            case 5:
                ((ImageView) this.b).setOnClickListener(onClickListener);
                return;
            default:
                super.setOnClickListener(onClickListener);
                return;
        }
    }

    public zf2(p pVar, Context context) {
        super(context);
        this.a = (byte) 1;
        this.d = pVar;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    public zf2(ag2 ag2Var, Context context, int i) {
        super(context);
        this.a = (byte) 0;
        int i2 = bkb.F6;
        wjb wjbVar = ag2Var.b;
        bkb.v0(i2, wjbVar);
        if (i != 0) {
            ImageView imageView = new ImageView(context);
            this.b = imageView;
            zkb.s(imageView, i2, wjbVar, PorterDuff.Mode.MULTIPLY);
            imageView.setImageResource(i);
        }
        hn hnVar = new hn(context, false, true, false);
        this.c = hnVar;
        hnVar.setTextSize(gl.L(13.0f));
        zkb.U(hnVar, i2, wjbVar);
        hnVar.setIncludeFontPadding(false);
        hnVar.setTypeface(gl.o());
        View view = new View(context);
        this.d = view;
        Drawable mutate = getContext().getResources().getDrawable(2131230871).mutate();
        zkb.x(this, mutate, i2, wjbVar, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        if (k96.a0) {
            addView(view, nme.t(16, 16, 16, 11, 0, 3, 0));
            addView(hnVar, nme.t(-2, 16, 16, 0, 0, ((ImageView) this.b) != null ? 3 : 11, 0));
            View view2 = (ImageView) this.b;
            if (view2 != null) {
                addView(view2, nme.t(16, 16, 16, 0, 0, 11, 0));
            }
        } else {
            View view3 = (ImageView) this.b;
            if (view3 != null) {
                addView(view3, nme.t(16, 16, 16, 11, 0, 3, 0));
            }
            addView(hnVar, nme.t(-2, 16, 16, ((ImageView) this.b) == null ? 11 : 0, 0, 3, 0));
            addView(view, nme.t(16, 16, 16, 0, 0, 11, 0));
        }
        int i3 = bkb.h6;
        Drawable Y = bkb.Y(bkb.v0(i3, wjbVar), 16, 16);
        vkb M = zkb.M(i3);
        setBackground(Y);
        zkb.j(this, Y, null, M, wjbVar);
        setClickable(true);
    }

    public zf2(d76 d76Var, Context context) {
        super(context);
        this.a = (byte) 4;
        this.d = d76Var;
        this.c = new Path();
    }

    public zf2(LaunchActivity launchActivity, int i, gn9 gn9Var, nl0 nl0Var, String str) {
        super(launchActivity);
        this.a = (byte) 5;
        setOrientation(1);
        setGravity(1);
        ImageView imageView = new ImageView(launchActivity);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setPadding(gl.L(17.0f), gl.L(17.0f), gl.L(17.0f), gl.L(17.0f));
        il0 c = gn9Var.c(imageView, nl0Var, false);
        ug8.r(c, gl.L(26.0f), 3.0f);
        this.c = c;
        imageView.setBackground(c);
        imageView.setForeground(new InsetDrawable((Drawable) bkb.h0(gl.L(52.0f), 0, bm2.o(-1, 51)), gl.L(3.0f)));
        imageView.setColorFilter(-1);
        addView(imageView, nme.t(58, 58, 1, 0, 3, 0, 0));
        TextView textView = new TextView(launchActivity);
        this.d = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine(true);
        textView.setGravity(1);
        addView(textView, nme.t(-2, -2, 1, 0, 6, 0, 0));
        imageView.setImageResource(i);
        textView.setText(str);
        setContentDescription(str);
    }

    public zf2(Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 3:
                super(context);
                setOrientation(1);
                be0 be0Var = new be0(context);
                this.b = be0Var;
                be0Var.setRoundRadius(gl.L(35.0f));
                addView(be0Var, nme.r(70, 70, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTypeface(gl.o());
                textView.setTextSize(1, 20.0f);
                textView.setGravity(17);
                addView(textView, nme.s(-1, -2, 0, 0.0f, 11.33f, 0.0f, 7.0f));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(gl.L(2.0f), 1.0f);
                textView2.setGravity(17);
                addView(textView2, nme.o(-1, -2));
                return;
            default:
                return;
        }
    }
}

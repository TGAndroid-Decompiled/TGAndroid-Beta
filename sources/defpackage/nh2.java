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
public final class nh2 extends LinearLayout {
    public final byte a;
    public Object b;
    public Object c;
    public View d;

    public nh2(Context context, ylb ylbVar, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 7:
                super(context);
                setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                wfb wfbVar = new wfb(context, 70, 0);
                frameLayout.addView(wfbVar, qoe.c(-1.0f, -1));
                npc npcVar = new npc(170, context, false);
                this.b = npcVar;
                npcVar.setStarParticlesView(wfbVar);
                frameLayout.addView(npcVar, qoe.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                npcVar.setPaused(false);
                addView(frameLayout, qoe.c(180.0f, -1));
                TextView textView = new TextView(context);
                this.c = textView;
                ts2.s(textView, 1, 20.0f);
                int i = cmb.i5;
                anb.X(textView, i, ylbVar);
                textView.setGravity(17);
                addView(textView, qoe.t(-2, -2, 1, 0, 2, 0, 0));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                anb.X(textView2, i, ylbVar);
                textView2.setGravity(17);
                addView(textView2, qoe.t(-2, -2, 1, 0, 9, 0, 18));
                return;
            default:
                setOrientation(1);
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                frameLayout2.addView(new uwa(context, 70, 0), qoe.c(-1.0f, -1));
                bf0 bf0Var = new bf0(context);
                this.b = bf0Var;
                bf0Var.setRoundRadius(gm.L(50.0f));
                frameLayout2.addView(bf0Var, qoe.d(100, 100.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
                addView(frameLayout2, qoe.c(150.0f, -1));
                TextView textView3 = new TextView(context);
                this.c = textView3;
                ts2.s(textView3, 1, 20.0f);
                int i2 = cmb.i5;
                anb.X(textView3, i2, ylbVar);
                textView3.setGravity(17);
                addView(textView3, qoe.t(-2, -2, 1, 0, 2, 0, 0));
                l66 l66Var = new l66(context, ylbVar);
                this.d = l66Var;
                anb.G(l66Var, cmb.Wc, ylbVar);
                l66Var.setTextSize(1, 14.0f);
                anb.X(l66Var, i2, ylbVar);
                l66Var.setGravity(17);
                addView(l66Var, qoe.t(-2, -2, 1, 0, 9, 0, 18));
                return;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 4:
                Path path = (Path) this.c;
                if (((d96) this.d).a) {
                    path.rewind();
                    RectF rectF = gm.P;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    path.addRoundRect(rectF, gm.L(13.0f), gm.L(13.0f), Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    yxa yxaVar = (yxa) this.b;
                    if (yxaVar == null) {
                        yxaVar = new yxa(1, 250);
                        this.b = yxaVar;
                    }
                    yxaVar.f(0, 0, getWidth(), getHeight());
                    yxa yxaVar2 = (yxa) this.b;
                    yxaVar2.h = 30.0f;
                    yxaVar2.d();
                    ((yxa) this.b).b(canvas, -1, 0.85f);
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
                paint.setColor(cmb.v0(cmb.h5, pVar.e0));
                int left = pVar.F[0].getLeft() - gm.L(13.0f);
                float L = gm.L(91.0f);
                c7 c7Var = pVar.G;
                if (c7Var.getVisibility() == 0) {
                    f = c7Var.getAlpha() * gm.L(25.0f);
                } else {
                    f = 0.0f;
                }
                rectF.set(left, gm.L(5.0f), left + ((int) (L + f)), gm.L(37.0f));
                canvas.drawRoundRect(rectF, gm.L(16.0f), gm.L(16.0f), paint);
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
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(32.0f), 1073741824));
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

    public nh2(p pVar, Context context) {
        super(context);
        this.a = (byte) 1;
        this.d = pVar;
        this.b = new RectF();
        this.c = new Paint(1);
    }

    public nh2(oh2 oh2Var, Context context, int i) {
        super(context);
        this.a = (byte) 0;
        int i2 = cmb.F6;
        ylb ylbVar = oh2Var.b;
        cmb.v0(i2, ylbVar);
        if (i != 0) {
            ImageView imageView = new ImageView(context);
            this.b = imageView;
            anb.s(imageView, i2, ylbVar, PorterDuff.Mode.MULTIPLY);
            imageView.setImageResource(i);
        }
        io ioVar = new io(context, false, true, false);
        this.c = ioVar;
        ioVar.setTextSize(gm.L(13.0f));
        anb.U(ioVar, i2, ylbVar);
        ioVar.setIncludeFontPadding(false);
        ioVar.setTypeface(gm.o());
        View view = new View(context);
        this.d = view;
        Drawable mutate = getContext().getResources().getDrawable(2131230872).mutate();
        anb.x(this, mutate, i2, ylbVar, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        if (jb6.a0) {
            addView(view, qoe.t(16, 16, 16, 11, 0, 3, 0));
            addView(ioVar, qoe.t(-2, 16, 16, 0, 0, ((ImageView) this.b) != null ? 3 : 11, 0));
            View view2 = (ImageView) this.b;
            if (view2 != null) {
                addView(view2, qoe.t(16, 16, 16, 0, 0, 11, 0));
            }
        } else {
            View view3 = (ImageView) this.b;
            if (view3 != null) {
                addView(view3, qoe.t(16, 16, 16, 11, 0, 3, 0));
            }
            addView(ioVar, qoe.t(-2, 16, 16, ((ImageView) this.b) == null ? 11 : 0, 0, 3, 0));
            addView(view, qoe.t(16, 16, 16, 0, 0, 11, 0));
        }
        int i3 = cmb.h6;
        Drawable Y = cmb.Y(cmb.v0(i3, ylbVar), 16, 16);
        wmb M = anb.M(i3);
        setBackground(Y);
        anb.j(this, Y, null, M, ylbVar);
        setClickable(true);
    }

    public nh2(d96 d96Var, Context context) {
        super(context);
        this.a = (byte) 4;
        this.d = d96Var;
        this.c = new Path();
    }

    public nh2(LaunchActivity launchActivity, int i, hp9 hp9Var, nm0 nm0Var, String str) {
        super(launchActivity);
        this.a = (byte) 5;
        setOrientation(1);
        setGravity(1);
        ImageView imageView = new ImageView(launchActivity);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setPadding(gm.L(17.0f), gm.L(17.0f), gm.L(17.0f), gm.L(17.0f));
        im0 c = hp9Var.c(imageView, nm0Var, false);
        wi8.r(c, gm.L(26.0f), 3.0f);
        this.c = c;
        imageView.setBackground(c);
        imageView.setForeground(new InsetDrawable((Drawable) cmb.h0(gm.L(52.0f), 0, on2.p(-1, 51)), gm.L(3.0f)));
        imageView.setColorFilter(-1);
        addView(imageView, qoe.t(58, 58, 1, 0, 3, 0, 0));
        TextView textView = new TextView(launchActivity);
        this.d = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine(true);
        textView.setGravity(1);
        addView(textView, qoe.t(-2, -2, 1, 0, 6, 0, 0));
        imageView.setImageResource(i);
        textView.setText(str);
        setContentDescription(str);
    }

    public nh2(Context context, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 3:
                super(context);
                setOrientation(1);
                bf0 bf0Var = new bf0(context);
                this.b = bf0Var;
                bf0Var.setRoundRadius(gm.L(35.0f));
                addView(bf0Var, qoe.r(70, 70, 1));
                TextView textView = new TextView(context);
                this.c = textView;
                textView.setTypeface(gm.o());
                textView.setTextSize(1, 20.0f);
                textView.setGravity(17);
                addView(textView, qoe.s(-1, -2, 0, 0.0f, 11.33f, 0.0f, 7.0f));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(gm.L(2.0f), 1.0f);
                textView2.setGravity(17);
                addView(textView2, qoe.o(-1, -2));
                return;
            default:
                return;
        }
    }
}

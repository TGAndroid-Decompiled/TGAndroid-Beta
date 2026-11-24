package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public final class ny9 extends FrameLayout implements vlb {
    public ShapeDrawable E;
    public int F;
    public final vz9 G;
    public final vz9 H;
    public final FrameLayout a;
    public final ImageView b;
    public final ImageView c;
    public final yj3 d;
    public final View e;
    public final mu9 f;
    public final pz h;
    public kz9 n;
    public float r;
    public ValueAnimator s;
    public kf9 w;
    public boolean x;
    public boolean y;

    public ny9(vz9 vz9Var, Context context, boolean z) {
        super(context);
        ylb ylbVar = vz9Var.a1;
        this.H = vz9Var;
        this.G = vz9Var;
        this.x = false;
        setClickable(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        if (z) {
            anb.h(cmb.F8, ylbVar, this);
        }
        int L = gm.L(18.0f);
        int i = cmb.yf;
        Drawable b0 = cmb.b0(L, cmb.v0(i, ylbVar));
        wmb M = anb.M(i);
        frameLayout.setBackground(b0);
        anb.j(frameLayout, b0, M, null, ylbVar);
        frameLayout.setClipToOutline(true);
        xj xjVar = agc.a;
        frameLayout.setOutlineProvider(new yfc(0, gm.L(18.0f)));
        addView(frameLayout, qoe.d(-1, 36.0f, 55, 8.0f, 12.0f, 8.0f, 8.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        mu9 mu9Var = new mu9();
        this.f = mu9Var;
        mu9Var.c(0, false, false);
        int i2 = cmb.Af;
        mu9Var.a(cmb.v0(i2, ylbVar));
        imageView.setImageDrawable(mu9Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ny9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                ny9 ny9Var = this.b;
                switch (b) {
                    case 0:
                        pz pzVar = ny9Var.h;
                        if (ny9Var.f.k == 1) {
                            pzVar.setText("");
                            ny9Var.G.v(null, true, false);
                            kz9 kz9Var = ny9Var.n;
                            if (kz9Var != null) {
                                kz9Var.I1(null);
                                ny9Var.n.J1(true, true);
                                ny9Var.n.G1();
                            }
                            pzVar.clearAnimation();
                            pzVar.animate().translationX(0.0f).setInterpolator(d53.h).start();
                            ny9Var.b(false);
                            return;
                        }
                        return;
                    case 1:
                        vz9 vz9Var2 = ny9Var.G;
                        if (!vz9Var2.t()) {
                            vz9Var2.p();
                            ny9Var.h.requestFocus();
                            vz9Var2.u(0, 0);
                            return;
                        }
                        return;
                    default:
                        pz pzVar2 = ny9Var.h;
                        pzVar2.setText("");
                        ny9Var.G.v(null, true, false);
                        kz9 kz9Var2 = ny9Var.n;
                        if (kz9Var2 != null) {
                            kz9Var2.I1(null);
                            ny9Var.n.J1(true, true);
                        }
                        pzVar2.clearAnimation();
                        pzVar2.animate().translationX(0.0f).setInterpolator(d53.h).start();
                        ny9Var.b(false);
                        return;
                }
            }
        });
        imageView.setClickable(false);
        imageView.setImportantForAccessibility(2);
        frameLayout.addView(imageView, qoe.e(36, 36, 51));
        yj3 yj3Var = new yj3(this, context, z);
        this.d = yj3Var;
        frameLayout.addView(yj3Var, qoe.d(-1, -1.0f, 119, 36.0f, 0.0f, 0.0f, 0.0f));
        pz pzVar = new pz(this, context, ylbVar, (byte) 3);
        this.h = pzVar;
        pzVar.addTextChangedListener(new og6(this, (byte) 10));
        pzVar.setBackground(null);
        pzVar.setPadding(0, 0, gm.L(4.0f), 0);
        pzVar.setTextSize(1, 16.0f);
        pzVar.setHint(jb6.M0(2131745570, null));
        anb.D(pzVar, i2, ylbVar);
        anb.X(pzVar, cmb.F6, ylbVar);
        pzVar.setImeOptions(268435459);
        anb.l(pzVar, 30, cmb.Ci, ylbVar);
        pzVar.setCursorSize(gm.L(20.0f));
        pzVar.setGravity(19);
        pzVar.setCursorWidth(1.5f);
        pzVar.setMaxLines(1);
        pzVar.setSingleLine(true);
        pzVar.setLines(1);
        pzVar.setTranslationY(gm.L(-1.0f));
        yj3Var.addView(pzVar, qoe.d(-1, -1.0f, 119, 0.0f, 0.0f, 32.0f, 0.0f));
        if (z) {
            View view = new View(context);
            this.e = view;
            Drawable d = b10.d(context, 2131231231);
            anb.x(this, d, i, ylbVar, PorterDuff.Mode.MULTIPLY);
            view.setBackground(d);
            view.setAlpha(0.0f);
            yj3Var.addView(view, qoe.e(18, -1, 3));
        }
        setOnClickListener(new View.OnClickListener(this) {
            public final ny9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                ny9 ny9Var = this.b;
                switch (b) {
                    case 0:
                        pz pzVar2 = ny9Var.h;
                        if (ny9Var.f.k == 1) {
                            pzVar2.setText("");
                            ny9Var.G.v(null, true, false);
                            kz9 kz9Var = ny9Var.n;
                            if (kz9Var != null) {
                                kz9Var.I1(null);
                                ny9Var.n.J1(true, true);
                                ny9Var.n.G1();
                            }
                            pzVar2.clearAnimation();
                            pzVar2.animate().translationX(0.0f).setInterpolator(d53.h).start();
                            ny9Var.b(false);
                            return;
                        }
                        return;
                    case 1:
                        vz9 vz9Var2 = ny9Var.G;
                        if (!vz9Var2.t()) {
                            vz9Var2.p();
                            ny9Var.h.requestFocus();
                            vz9Var2.u(0, 0);
                            return;
                        }
                        return;
                    default:
                        pz pzVar22 = ny9Var.h;
                        pzVar22.setText("");
                        ny9Var.G.v(null, true, false);
                        kz9 kz9Var2 = ny9Var.n;
                        if (kz9Var2 != null) {
                            kz9Var2.I1(null);
                            ny9Var.n.J1(true, true);
                        }
                        pzVar22.clearAnimation();
                        pzVar22.animate().translationX(0.0f).setInterpolator(d53.h).start();
                        ny9Var.b(false);
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new d7(this));
        int i3 = cmb.h6;
        fg0 f0 = cmb.f0(cmb.v0(i3, ylbVar), 1, gm.L(15.0f));
        wmb M2 = anb.M(i3);
        imageView2.setBackground(f0);
        anb.j(imageView2, f0, null, M2, ylbVar);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final ny9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                ny9 ny9Var = this.b;
                switch (b) {
                    case 0:
                        pz pzVar2 = ny9Var.h;
                        if (ny9Var.f.k == 1) {
                            pzVar2.setText("");
                            ny9Var.G.v(null, true, false);
                            kz9 kz9Var = ny9Var.n;
                            if (kz9Var != null) {
                                kz9Var.I1(null);
                                ny9Var.n.J1(true, true);
                                ny9Var.n.G1();
                            }
                            pzVar2.clearAnimation();
                            pzVar2.animate().translationX(0.0f).setInterpolator(d53.h).start();
                            ny9Var.b(false);
                            return;
                        }
                        return;
                    case 1:
                        vz9 vz9Var2 = ny9Var.G;
                        if (!vz9Var2.t()) {
                            vz9Var2.p();
                            ny9Var.h.requestFocus();
                            vz9Var2.u(0, 0);
                            return;
                        }
                        return;
                    default:
                        pz pzVar22 = ny9Var.h;
                        pzVar22.setText("");
                        ny9Var.G.v(null, true, false);
                        kz9 kz9Var2 = ny9Var.n;
                        if (kz9Var2 != null) {
                            kz9Var2.I1(null);
                            ny9Var.n.J1(true, true);
                        }
                        pzVar22.clearAnimation();
                        pzVar22.animate().translationX(0.0f).setInterpolator(d53.h).start();
                        ny9Var.b(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, qoe.e(36, 36, 53));
        if (!oi5.d) {
            a();
        }
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ny9.a():void");
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.D8));
    }

    public final void b(boolean z) {
        float f;
        if (z == this.x) {
            return;
        }
        this.x = z;
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = this.r;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new p29(this, (byte) 19));
        this.s.setDuration(120L);
        this.s.setInterpolator(d53.h);
        this.s.start();
    }

    public final void c(boolean z) {
        kf9 kf9Var = this.w;
        if (z) {
            if (kf9Var == null) {
                kf9 kf9Var2 = new kf9(this, (byte) 28);
                this.w = kf9Var2;
                gm.d3(kf9Var2, 340L);
                return;
            }
            return;
        }
        if (kf9Var != null) {
            gm.r(kf9Var);
            this.w = null;
        }
        gm.P3(this.c, false, true);
    }

    public final void d(boolean z) {
        ?? r6;
        kz9 kz9Var;
        kz9 kz9Var2;
        mu9 mu9Var = this.f;
        byte b = mu9Var.k;
        pz pzVar = this.h;
        int i = 2;
        if (b == 2 && ((pzVar.length() != 0 || ((kz9Var2 = this.n) != null && kz9Var2.getSelectedCategory() != null)) && !z)) {
            return;
        }
        if (pzVar.length() <= 0 && ((kz9Var = this.n) == null || kz9Var.w3 <= 0.5f || (!kz9Var.r3 && kz9Var.getSelectedCategory() == null))) {
            r6 = 0;
        } else {
            r6 = 1;
        }
        mu9Var.b(r6);
        ImageView imageView = this.b;
        imageView.setClickable(r6);
        String str = null;
        if (r6 != 0) {
            str = jb6.M0(2131754878, null);
        }
        imageView.setContentDescription(str);
        if (r6 != 0) {
            i = 1;
        }
        imageView.setImportantForAccessibility(i);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float y;
        vz9 vz9Var = this.H;
        ct8 ct8Var = vz9Var.h0;
        ny9 ny9Var = vz9Var.g0;
        wy9 wy9Var = vz9Var.V;
        if (wy9Var != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float x = ct8Var.getX() + ny9Var.getX();
            float y2 = ct8Var.getY() + ny9Var.getY();
            x92 x92Var = (x92) wy9Var;
            x53 x53Var = (x53) x92Var.b;
            w53 w53Var = x53Var.a;
            RectF rectF = gm.P;
            rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
            u29 delegate = ((v29) x92Var.c).getDelegate();
            float x2 = w53Var.getX() + x;
            if (x53Var.y == 1) {
                y = w53Var.getY() - gm.m;
            } else {
                y = w53Var.getY() + x53Var.c.getY();
            }
            delegate.m(canvas, rectF, 0.0f, x2, y + y2, 255, true);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void invalidate() {
        if (oi5.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(52.0f), 1073741824));
    }

    @Override
    public final void setTranslationY(float f) {
        if (f != getTranslationY()) {
            super.setTranslationY(f);
            if (this.H.V != null) {
                invalidate();
            }
        }
    }

    @Override
    public final void updateColors() {
        FrameLayout frameLayout;
        ylb ylbVar = this.G.a1;
        try {
            mu9 mu9Var = this.f;
            if (mu9Var != null) {
                mu9Var.a(cmb.v0(cmb.Af, ylbVar));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        if (this.y && (frameLayout = this.a) != null) {
            int p1 = cmb.p1(0.06f, cmb.v0(cmb.D8, ylbVar));
            if (this.E != null) {
                Drawable background = frameLayout.getBackground();
                ShapeDrawable shapeDrawable = this.E;
                if (background == shapeDrawable) {
                    if (p1 != this.F) {
                        cmb.A1(p1, shapeDrawable);
                        frameLayout.invalidate();
                    }
                    this.F = p1;
                }
            }
            ShapeDrawable b0 = cmb.b0(gm.L(18.0f), p1);
            this.E = b0;
            frameLayout.setBackground(b0);
            this.F = p1;
        }
    }
}

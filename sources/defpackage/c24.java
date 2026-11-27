package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
public abstract class c24 extends FrameLayout implements snb, s84 {
    public ValueAnimator E;
    public lw3 F;
    public boolean G;
    public final o24 H;
    public final fm0 a;
    public final byte b;
    public final dw9 c;
    public final a24 d;
    public final View e;
    public final View f;
    public final ImageView h;
    public final FrameLayout n;
    public final b24 r;
    public final tt s;
    public final View w;
    public float x;
    public boolean y;

    public c24(o24 o24Var, Context context, int i) {
        super(context);
        int y;
        int y2;
        int y3;
        int y4;
        a24 a24Var;
        ImageView.ScaleType scaleType;
        int i2;
        float f;
        int i3;
        this.H = o24Var;
        this.a = new fm0(0, this, k43.g, 200L, false);
        this.y = false;
        xob xobVar = yob.a;
        this.b = i;
        View view = new View(context);
        this.e = view;
        view.setVisibility(4);
        int i4 = aob.Cf;
        vnb vnbVar = o24Var.a2;
        boolean z = o24Var.j2;
        yob.h(i4, vnbVar, view);
        addView(view, new FrameLayout.LayoutParams(-1, hl.e1(), 83));
        View view2 = new View(context);
        this.f = view2;
        if (o24Var.v0) {
            yob.h(aob.zf, vnbVar, view2);
        }
        addView(view2, new FrameLayout.LayoutParams(-1, o24Var.c1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n = frameLayout;
        int L = hl.L(18.0f);
        if (z) {
            y = o24Var.u(0.06f);
        } else {
            y = o24Var.y(aob.Af);
        }
        frameLayout.setBackground(aob.b0(L, y));
        frameLayout.setClipToOutline(true);
        yi yiVar = yhc.a;
        frameLayout.setOutlineProvider(new whc(0, hl.L(18.0f)));
        if (i == 2) {
            addView(frameLayout, tre.d(-1, 36.0f, 119, 10.0f, 8.0f, 10.0f, 8.0f));
        } else {
            addView(frameLayout, tre.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        }
        tt ttVar = new tt((byte) 14, context, this);
        this.s = ttVar;
        frameLayout.addView(ttVar, tre.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        dw9 dw9Var = new dw9();
        this.c = dw9Var;
        dw9Var.c(0, false, false);
        if (z) {
            y2 = o24Var.u(0.4f);
        } else {
            y2 = o24Var.y(aob.Bf);
        }
        dw9Var.a(y2);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType2);
        imageView.setImageDrawable(dw9Var);
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final c24 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view3) {
                byte b = r2;
                c24 c24Var = this.b;
                switch (b) {
                    case 0:
                        b24 b24Var = c24Var.r;
                        a24 a24Var2 = c24Var.d;
                        if (c24Var.c.k == 1) {
                            a24Var2.setText("");
                            c24Var.b(null, false);
                            if (b24Var != null) {
                                b24Var.H1();
                                b24Var.J1(null);
                                b24Var.K1(true, true);
                            }
                            c24Var.f(false);
                            a24Var2.clearAnimation();
                            a24Var2.animate().translationX(0.0f).setInterpolator(k43.h).start();
                            c24Var.c(false);
                            return;
                        }
                        return;
                    default:
                        a24 a24Var3 = c24Var.d;
                        a24Var3.setText("");
                        c24Var.b(null, false);
                        b24 b24Var2 = c24Var.r;
                        if (b24Var2 != null) {
                            b24Var2.H1();
                            b24Var2.J1(null);
                            b24Var2.K1(true, true);
                        }
                        c24Var.f(false);
                        a24Var3.clearAnimation();
                        a24Var3.animate().translationX(0.0f).setInterpolator(k43.h).start();
                        c24Var.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView, tre.e(36, 36, 51));
        a24 a24Var2 = new a24(this, context, i);
        this.d = a24Var2;
        a24Var2.setTextSize(1, 16.0f);
        if (z) {
            y3 = o24Var.u(0.45f);
        } else {
            y3 = o24Var.y(aob.Bf);
        }
        a24Var2.setHintTextColor(y3);
        if (z) {
            y4 = o24Var.u(0.8f);
        } else {
            y4 = o24Var.y(aob.G6);
        }
        a24Var2.setTextColor(y4);
        a24Var2.setBackgroundDrawable(null);
        a24Var2.setPadding(0, 0, 0, 0);
        a24Var2.setMaxLines(1);
        a24Var2.setLines(1);
        a24Var2.setSingleLine(true);
        a24Var2.setImeOptions(268435459);
        a24Var2.setHint(ob6.M0(2131745564, null));
        yob.l(a24Var2, 30, aob.Di, vnbVar);
        a24Var2.setCursorSize(hl.L(20.0f));
        a24Var2.setCursorWidth(1.5f);
        a24Var2.setTranslationY(hl.L(-2.0f));
        ttVar.addView(a24Var2, tre.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        a24Var2.addTextChangedListener(new c7(this, (byte) 21));
        if (o24Var.v0) {
            View view3 = new View(context);
            this.w = view3;
            Drawable e = c00.e(context, 2131231230);
            uob p = yob.p(aob.zf, aob.Af);
            a24Var = a24Var2;
            scaleType = scaleType2;
            i2 = 3;
            f = 16.0f;
            yob.k(this, e, p.a, p.b, 4, 0.0f, vnbVar, PorterDuff.Mode.MULTIPLY);
            view3.setBackground(e);
            view3.setAlpha(0.0f);
            ttVar.addView(view3, tre.e(18, -1, 3));
        } else {
            a24Var = a24Var2;
            scaleType = scaleType2;
            i2 = 3;
            f = 16.0f;
        }
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new e7(this));
        int i5 = aob.i6;
        hf0 f0 = aob.f0(aob.v0(i5, vnbVar), 1, hl.L(15.0f));
        uob M = yob.M(i5);
        imageView2.setBackground(f0);
        yob.j(imageView2, f0, null, M, vnbVar);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final c24 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view32) {
                byte b = r2;
                c24 c24Var = this.b;
                switch (b) {
                    case 0:
                        b24 b24Var = c24Var.r;
                        a24 a24Var22 = c24Var.d;
                        if (c24Var.c.k == 1) {
                            a24Var22.setText("");
                            c24Var.b(null, false);
                            if (b24Var != null) {
                                b24Var.H1();
                                b24Var.J1(null);
                                b24Var.K1(true, true);
                            }
                            c24Var.f(false);
                            a24Var22.clearAnimation();
                            a24Var22.animate().translationX(0.0f).setInterpolator(k43.h).start();
                            c24Var.c(false);
                            return;
                        }
                        return;
                    default:
                        a24 a24Var3 = c24Var.d;
                        a24Var3.setText("");
                        c24Var.b(null, false);
                        b24 b24Var2 = c24Var.r;
                        if (b24Var2 != null) {
                            b24Var2.H1();
                            b24Var2.J1(null);
                            b24Var2.K1(true, true);
                        }
                        c24Var.f(false);
                        a24Var3.clearAnimation();
                        a24Var3.animate().translationX(0.0f).setInterpolator(k43.h).start();
                        c24Var.c(false);
                        return;
                }
            }
        });
        frameLayout.addView(imageView2, tre.e(36, 36, 53));
        if (i == 1 && (!o24Var.d2 || !yac.h(yac.t0).p())) {
            return;
        }
        if (i == 0) {
            i3 = i2;
        } else {
            i3 = 0;
        }
        b24 b24Var = new b24(this, context, i3, o24Var.a2, i);
        this.r = b24Var;
        b24Var.E3 = z;
        TextPaint paint = a24Var.getPaint();
        b24Var.setDontOccupyWidth(hl.L(f) + ((int) paint.measureText(((Object) a24Var.getHint()) + "")));
        if (o24Var.v0) {
            yob.i(b24Var, yob.p(aob.zf, aob.Af), vnbVar);
        }
        b24Var.setOnScrollIntoOccupiedWidth(new pcc(this) {
            public final c24 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z2;
                byte b = r2;
                c24 c24Var = this.b;
                switch (b) {
                    case 0:
                        Integer num = (Integer) obj;
                        c24Var.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        c24Var.c(z2);
                        c24Var.g(false);
                        return;
                    default:
                        q2b q2bVar = (q2b) obj;
                        o24 o24Var2 = c24Var.H;
                        b24 b24Var2 = c24Var.r;
                        if (q2bVar == null) {
                            c24Var.c(false);
                            b24Var2.J1(null);
                            o24Var2.p0.d.setText("");
                            o24Var2.j0.g1(0, 0);
                            return;
                        } else if (b24Var2.getSelectedCategory() == q2bVar) {
                            c24Var.b(null, false);
                            b24Var2.J1(null);
                            return;
                        } else {
                            c24Var.b(q2bVar.a, false);
                            b24Var2.J1(q2bVar);
                            return;
                        }
                }
            }
        });
        b24Var.setOnTouchListener(new k14(this, (byte) 1));
        b24Var.setOnCategoryClick(new pcc(this) {
            public final c24 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj) {
                boolean z2;
                byte b = r2;
                c24 c24Var = this.b;
                switch (b) {
                    case 0:
                        Integer num = (Integer) obj;
                        c24Var.d.setTranslationX(-Math.max(0, num.intValue()));
                        if (num.intValue() > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        c24Var.c(z2);
                        c24Var.g(false);
                        return;
                    default:
                        q2b q2bVar = (q2b) obj;
                        o24 o24Var2 = c24Var.H;
                        b24 b24Var2 = c24Var.r;
                        if (q2bVar == null) {
                            c24Var.c(false);
                            b24Var2.J1(null);
                            o24Var2.p0.d.setText("");
                            o24Var2.j0.g1(0, 0);
                            return;
                        } else if (b24Var2.getSelectedCategory() == q2bVar) {
                            c24Var.b(null, false);
                            b24Var2.J1(null);
                            return;
                        } else {
                            c24Var.b(q2bVar.a, false);
                            b24Var2.J1(q2bVar);
                            return;
                        }
                }
            }
        });
        frameLayout.addView(b24Var, tre.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a() {
        hl.t1(this.d);
    }

    public final void b(String str, boolean z) {
        o24 o24Var = this.H;
        byte b = this.b;
        if (b == 0) {
            j24 j24Var = o24Var.A0;
            i24 i24Var = j24Var.P;
            o24 o24Var2 = j24Var.R;
            a04 a04Var = o24Var2.H0;
            wz3 wz3Var = o24Var2.E0;
            if (j24Var.M != 0) {
                ConnectionsManager.getInstance(o24Var2.d1).cancelRequest(j24Var.M, true);
                j24Var.M = 0;
            }
            if (TextUtils.isEmpty(str)) {
                j24Var.O = null;
                j24Var.F.clear();
                j24Var.I.clear();
                j24Var.L = new ArrayList();
                j79 adapter = wz3Var.getAdapter();
                g24 g24Var = o24Var2.z0;
                if (adapter != g24Var) {
                    wz3Var.setAdapter(g24Var);
                }
                j24Var.d = 0L;
                o24Var2.a.a(false, true);
                j24Var.f();
                a04Var.d(false);
            } else {
                j24Var.O = str.toLowerCase();
                a04Var.d(true);
            }
            hl.r(i24Var);
            hl.d3(i24Var, 300L);
        } else if (b == 1) {
            o24Var.T.E(str, z);
        } else if (b == 2) {
            o24Var.k0.G(str, z);
        }
    }

    public final void c(boolean z) {
        float f;
        if (z == this.y) {
            return;
        }
        this.y = z;
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = this.x;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new az1(this, (byte) 25));
        this.E.setDuration(120L);
        this.E.setInterpolator(k43.h);
        this.E.start();
    }

    public final void d(boolean z) {
        this.G = z;
        if (z) {
            this.c.b(2);
        } else {
            g(true);
        }
    }

    public final void e(boolean z, boolean z2) {
        this.a.a(z, z2);
    }

    public final void f(boolean z) {
        lw3 lw3Var = this.F;
        if (z) {
            if (lw3Var == null) {
                lw3 lw3Var2 = new lw3(this, (byte) 7);
                this.F = lw3Var2;
                hl.d3(lw3Var2, 340L);
                return;
            }
            return;
        }
        if (lw3Var != null) {
            hl.r(lw3Var);
            this.F = null;
        }
        hl.P3(this.h, false, true);
    }

    public final void g(boolean z) {
        int i;
        boolean z2 = this.G;
        a24 a24Var = this.d;
        b24 b24Var = this.r;
        if (z2 && ((a24Var.length() != 0 || (b24Var != null && b24Var.getSelectedCategory() != null)) && !z)) {
            return;
        }
        if (a24Var.length() <= 0 && (b24Var == null || b24Var.w3 <= 0.5f || (!b24Var.r3 && b24Var.getSelectedCategory() == null))) {
            i = 0;
        } else {
            i = 1;
        }
        this.c.b(i);
        this.G = false;
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        int i2;
        if (i == 0) {
            View view = this.e;
            view.setAlpha(f);
            if (f > 0.0f) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            view.setVisibility(i2);
        }
    }

    @Override
    public final void updateColors() {
        try {
            this.d.setCursorColor(this.H.y(aob.Di));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void v0(float f, int i) {
    }
}

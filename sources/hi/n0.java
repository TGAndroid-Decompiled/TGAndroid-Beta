package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.we;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.lr;
public abstract class n0 extends FrameLayout {
    public final og.g E;
    public boolean F;
    public final w5 f15078a;
    public tg.n1 f15079b;
    public final org.telegram.ui.Components.c6 f15080c;
    public final org.telegram.ui.Components.c6 d;
    public final m0 f15081e;
    public final FrameLayout f15082f;
    public final h0 h;
    public final og.f f15083n;
    public final FrameLayout f15084r;
    public float f15085s;
    public final int[] f15086w;
    public final int[] f15087x;
    public final int[] f15088y;

    public n0(Context context, w5 w5Var) {
        super(context);
        this.f15085s = 0.0f;
        this.f15086w = new int[2];
        this.f15087x = new int[2];
        this.f15088y = new int[2];
        this.E = new Object();
        this.f15078a = w5Var;
        m0 m0Var = new m0(this, context);
        this.f15081e = m0Var;
        lr lrVar = lr.h;
        this.f15080c = new org.telegram.ui.Components.c6(m0Var, 0L, 320L, lrVar);
        this.d = new org.telegram.ui.Components.c6(m0Var, 0L, 320L, lrVar);
        h0 h0Var = new h0(this, context, 1);
        this.h = h0Var;
        h0Var.setListener(new h9.g1(this, 1));
        addView(h0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f15082f = frameLayout;
        addView(frameLayout, c8.ma.e(-1, -1, 119));
        og.f fVar = new og.f(context);
        this.f15083n = fVar;
        fVar.setListener(new i0(1, this));
        frameLayout.addView(fVar, c8.ma.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f15084r = frameLayout2;
        frameLayout.addView(frameLayout2, c8.ma.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        i5.c.x(textView, 1, 14.0f);
        textView.setBackground(org.telegram.ui.ActionBar.n6.h0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(gd.M0(2131752578, null));
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView, c8.ma.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final n0 f14887b;

            {
                this.f14887b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ea) this.f14887b).G.k0(-1, false, true);
                        return;
                    case 1:
                        n0 n0Var = this.f14887b;
                        n0Var.h.l(true);
                        og.f fVar2 = n0Var.f15083n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        n0 n0Var2 = this.f14887b;
                        tg.n1 n1Var = n0Var2.f15079b;
                        if (n1Var != null) {
                            n1Var.H0 = new we();
                            n0Var2.h.b(n0Var2.f15079b.H0);
                            tg.n1 n1Var2 = n0Var2.f15079b;
                            n1Var2.H0.f27691z = n1Var2.getOrientation();
                            n0Var2.f15079b.k();
                            n0Var2.f15079b.requestLayout();
                            n0Var2.f15079b.A0.requestLayout();
                            n0Var2.f15079b.A0.invalidate();
                            n0Var2.f15079b.A0.post(new k(n0Var2, 2));
                        }
                        ((ea) n0Var2).G.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setBackground(org.telegram.ui.ActionBar.n6.h0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(gd.M0(2131751685, null));
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView2, c8.ma.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final n0 f14887b;

            {
                this.f14887b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ea) this.f14887b).G.k0(-1, false, true);
                        return;
                    case 1:
                        n0 n0Var = this.f14887b;
                        n0Var.h.l(true);
                        og.f fVar2 = n0Var.f15083n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        n0 n0Var2 = this.f14887b;
                        tg.n1 n1Var = n0Var2.f15079b;
                        if (n1Var != null) {
                            n1Var.H0 = new we();
                            n0Var2.h.b(n0Var2.f15079b.H0);
                            tg.n1 n1Var2 = n0Var2.f15079b;
                            n1Var2.H0.f27691z = n1Var2.getOrientation();
                            n0Var2.f15079b.k();
                            n0Var2.f15079b.requestLayout();
                            n0Var2.f15079b.A0.requestLayout();
                            n0Var2.f15079b.A0.invalidate();
                            n0Var2.f15079b.A0.post(new k(n0Var2, 2));
                        }
                        ((ea) n0Var2).G.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setBackground(org.telegram.ui.ActionBar.n6.h0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(gd.M0(2131744453, null));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView3, c8.ma.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final n0 f14887b;

            {
                this.f14887b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ea) this.f14887b).G.k0(-1, false, true);
                        return;
                    case 1:
                        n0 n0Var = this.f14887b;
                        n0Var.h.l(true);
                        og.f fVar2 = n0Var.f15083n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        n0 n0Var2 = this.f14887b;
                        tg.n1 n1Var = n0Var2.f15079b;
                        if (n1Var != null) {
                            n1Var.H0 = new we();
                            n0Var2.h.b(n0Var2.f15079b.H0);
                            tg.n1 n1Var2 = n0Var2.f15079b;
                            n1Var2.H0.f27691z = n1Var2.getOrientation();
                            n0Var2.f15079b.k();
                            n0Var2.f15079b.requestLayout();
                            n0Var2.f15079b.A0.requestLayout();
                            n0Var2.f15079b.A0.invalidate();
                            n0Var2.f15079b.A0.post(new k(n0Var2, 2));
                        }
                        ((ea) n0Var2).G.k0(-1, false, true);
                        return;
                }
            }
        });
        new LinearLayout(context);
    }

    public int getCurrentHeight() {
        tg.n1 n1Var = this.f15079b;
        if (n1Var == null) {
            return 1;
        }
        if (n1Var.getOrientation() != 90 && this.f15079b.getOrientation() != 270) {
            return this.f15079b.getContentHeight();
        }
        return this.f15079b.getContentWidth();
    }

    public int getCurrentWidth() {
        tg.n1 n1Var = this.f15079b;
        if (n1Var == null) {
            return 1;
        }
        if (n1Var.getOrientation() != 90 && this.f15079b.getOrientation() != 270) {
            return this.f15079b.getContentWidth();
        }
        return this.f15079b.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f15085s;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        h0 h0Var = this.h;
        h0Var.setTopPadding(org.telegram.messenger.g0.L(52.0f));
        h0Var.setBottomPadding(org.telegram.messenger.g0.L(116.0f) + this.f15082f.getPaddingBottom());
        super.onLayout(z10, i7, i10, i11, i12);
    }

    public void set(tg.n1 n1Var) {
        if (n1Var == null) {
            return;
        }
        this.f15079b = n1Var;
        setVisibility(0);
        this.F = false;
        h0 h0Var = this.h;
        boolean z10 = true;
        h0Var.K = true;
        getLocationOnScreen(this.f15086w);
        this.f15078a.getLocationOnScreen(this.f15087x);
        n1Var.getLocationOnScreen(this.f15088y);
        we weVar = n1Var.H0;
        if (weVar == null) {
            weVar = null;
        }
        h0Var.p(n1Var.getOrientation(), this.E, weVar);
        float rotation = h0Var.getRotation();
        og.f fVar = this.f15083n;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.c6 c6Var = this.f15080c;
        if (weVar != null) {
            fVar.b(weVar.d);
            if (weVar.f27683k == 0) {
                z10 = false;
            }
            fVar.setRotated(z10);
            fVar.setMirrored(weVar.f27684l);
            c6Var.f(weVar.f27684l, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            c6Var.getClass();
            c6Var.e(false, 0.0f);
        }
        h0Var.r(false);
        m0 m0Var = this.f15081e;
        m0Var.setVisibility(0);
        m0Var.invalidate();
    }

    public void setAppearProgress(float f10) {
        if (Math.abs(this.f15085s - f10) < 0.001f) {
            return;
        }
        this.f15085s = f10;
        this.f15081e.invalidate();
        h0 h0Var = this.h;
        CropAreaView cropAreaView = h0Var.f21896a;
        CropAreaView cropAreaView2 = h0Var.f21896a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
    }
}

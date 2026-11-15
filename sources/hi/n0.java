package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.xe;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.er;
public abstract class n0 extends FrameLayout {
    public final og.g E;
    public boolean F;
    public final x5 f14719a;
    public tg.n1 f14720b;
    public final org.telegram.ui.Components.u5 f14721c;
    public final org.telegram.ui.Components.u5 d;
    public final m0 f14722e;
    public final FrameLayout f14723f;
    public final g0 h;
    public final og.f f14724n;
    public final FrameLayout f14725r;
    public float f14726s;
    public final int[] f14727w;
    public final int[] f14728x;
    public final int[] f14729y;

    public n0(Context context, x5 x5Var) {
        super(context);
        this.f14726s = 0.0f;
        this.f14727w = new int[2];
        this.f14728x = new int[2];
        this.f14729y = new int[2];
        this.E = new Object();
        this.f14719a = x5Var;
        m0 m0Var = new m0(this, context);
        this.f14722e = m0Var;
        er erVar = er.h;
        this.f14721c = new org.telegram.ui.Components.u5(m0Var, 0L, 320L, erVar);
        this.d = new org.telegram.ui.Components.u5(m0Var, 0L, 320L, erVar);
        g0 g0Var = new g0(this, context, 1);
        this.h = g0Var;
        g0Var.setListener(new l0(this, 0));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f14723f = frameLayout;
        addView(frameLayout, c8.ja.e(-1, -1, 119));
        og.f fVar = new og.f(context);
        this.f14724n = fVar;
        fVar.setListener(new h0(1, this));
        frameLayout.addView(fVar, c8.ja.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f14725r = frameLayout2;
        frameLayout.addView(frameLayout2, c8.ja.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        i5.c.v(textView, 1, 14.0f);
        textView.setBackground(org.telegram.ui.ActionBar.j6.h0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(hd.M0(2131752589, null));
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView, c8.ja.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final n0 f14487b;

            {
                this.f14487b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((da) this.f14487b).G.k0(-1, false, true);
                        return;
                    case 1:
                        n0 n0Var = this.f14487b;
                        n0Var.h.l(true);
                        og.f fVar2 = n0Var.f14724n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        n0 n0Var2 = this.f14487b;
                        tg.n1 n1Var = n0Var2.f14720b;
                        if (n1Var != null) {
                            n1Var.H0 = new xe();
                            n0Var2.h.b(n0Var2.f14720b.H0);
                            tg.n1 n1Var2 = n0Var2.f14720b;
                            n1Var2.H0.f27503z = n1Var2.getOrientation();
                            n0Var2.f14720b.k();
                            n0Var2.f14720b.requestLayout();
                            n0Var2.f14720b.A0.requestLayout();
                            n0Var2.f14720b.A0.invalidate();
                            n0Var2.f14720b.A0.post(new fi.c1(n0Var2, 28));
                        }
                        ((da) n0Var2).G.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setBackground(org.telegram.ui.ActionBar.j6.h0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(hd.M0(2131751696, null));
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView2, c8.ja.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final n0 f14487b;

            {
                this.f14487b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((da) this.f14487b).G.k0(-1, false, true);
                        return;
                    case 1:
                        n0 n0Var = this.f14487b;
                        n0Var.h.l(true);
                        og.f fVar2 = n0Var.f14724n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        n0 n0Var2 = this.f14487b;
                        tg.n1 n1Var = n0Var2.f14720b;
                        if (n1Var != null) {
                            n1Var.H0 = new xe();
                            n0Var2.h.b(n0Var2.f14720b.H0);
                            tg.n1 n1Var2 = n0Var2.f14720b;
                            n1Var2.H0.f27503z = n1Var2.getOrientation();
                            n0Var2.f14720b.k();
                            n0Var2.f14720b.requestLayout();
                            n0Var2.f14720b.A0.requestLayout();
                            n0Var2.f14720b.A0.invalidate();
                            n0Var2.f14720b.A0.post(new fi.c1(n0Var2, 28));
                        }
                        ((da) n0Var2).G.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setBackground(org.telegram.ui.ActionBar.j6.h0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(hd.M0(2131744688, null));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView3, c8.ja.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final n0 f14487b;

            {
                this.f14487b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((da) this.f14487b).G.k0(-1, false, true);
                        return;
                    case 1:
                        n0 n0Var = this.f14487b;
                        n0Var.h.l(true);
                        og.f fVar2 = n0Var.f14724n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        n0 n0Var2 = this.f14487b;
                        tg.n1 n1Var = n0Var2.f14720b;
                        if (n1Var != null) {
                            n1Var.H0 = new xe();
                            n0Var2.h.b(n0Var2.f14720b.H0);
                            tg.n1 n1Var2 = n0Var2.f14720b;
                            n1Var2.H0.f27503z = n1Var2.getOrientation();
                            n0Var2.f14720b.k();
                            n0Var2.f14720b.requestLayout();
                            n0Var2.f14720b.A0.requestLayout();
                            n0Var2.f14720b.A0.invalidate();
                            n0Var2.f14720b.A0.post(new fi.c1(n0Var2, 28));
                        }
                        ((da) n0Var2).G.k0(-1, false, true);
                        return;
                }
            }
        });
        new LinearLayout(context);
    }

    public int getCurrentHeight() {
        tg.n1 n1Var = this.f14720b;
        if (n1Var == null) {
            return 1;
        }
        if (n1Var.getOrientation() != 90 && this.f14720b.getOrientation() != 270) {
            return this.f14720b.getContentHeight();
        }
        return this.f14720b.getContentWidth();
    }

    public int getCurrentWidth() {
        tg.n1 n1Var = this.f14720b;
        if (n1Var == null) {
            return 1;
        }
        if (n1Var.getOrientation() != 90 && this.f14720b.getOrientation() != 270) {
            return this.f14720b.getContentWidth();
        }
        return this.f14720b.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f14726s;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        g0 g0Var = this.h;
        g0Var.setTopPadding(org.telegram.messenger.g0.L(52.0f));
        g0Var.setBottomPadding(org.telegram.messenger.g0.L(116.0f) + this.f14723f.getPaddingBottom());
        super.onLayout(z10, i7, i10, i11, i12);
    }

    public void set(tg.n1 n1Var) {
        if (n1Var == null) {
            return;
        }
        this.f14720b = n1Var;
        setVisibility(0);
        this.F = false;
        g0 g0Var = this.h;
        boolean z10 = true;
        g0Var.K = true;
        getLocationOnScreen(this.f14727w);
        this.f14719a.getLocationOnScreen(this.f14728x);
        n1Var.getLocationOnScreen(this.f14729y);
        xe xeVar = n1Var.H0;
        if (xeVar == null) {
            xeVar = null;
        }
        g0Var.p(n1Var.getOrientation(), this.E, xeVar);
        float rotation = g0Var.getRotation();
        og.f fVar = this.f14724n;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.u5 u5Var = this.f14721c;
        if (xeVar != null) {
            fVar.b(xeVar.d);
            if (xeVar.f27495k == 0) {
                z10 = false;
            }
            fVar.setRotated(z10);
            fVar.setMirrored(xeVar.f27496l);
            u5Var.f(xeVar.f27496l, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            u5Var.getClass();
            u5Var.e(false, 0.0f);
        }
        g0Var.r(false);
        m0 m0Var = this.f14722e;
        m0Var.setVisibility(0);
        m0Var.invalidate();
    }

    public void setAppearProgress(float f10) {
        if (Math.abs(this.f14726s - f10) < 0.001f) {
            return;
        }
        this.f14726s = f10;
        this.f14722e.invalidate();
        g0 g0Var = this.h;
        CropAreaView cropAreaView = g0Var.f21530a;
        CropAreaView cropAreaView2 = g0Var.f21530a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
    }
}

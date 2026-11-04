package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.re;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.xq;
public abstract class m0 extends FrameLayout {
    public final pg.f E;
    public boolean F;
    public final y5 f13171a;
    public ug.n1 f13172b;
    public final org.telegram.ui.Components.u5 f13173c;
    public final org.telegram.ui.Components.u5 d;
    public final l0 f13174e;
    public final FrameLayout f13175f;
    public final g0 h;
    public final pg.e f13176n;
    public final FrameLayout f13177r;
    public float f13178s;
    public final int[] f13179w;
    public final int[] f13180x;
    public final int[] f13181y;

    public m0(Context context, y5 y5Var) {
        super(context);
        this.f13178s = 0.0f;
        this.f13179w = new int[2];
        this.f13180x = new int[2];
        this.f13181y = new int[2];
        this.E = new Object();
        this.f13171a = y5Var;
        l0 l0Var = new l0(this, context);
        this.f13174e = l0Var;
        xq xqVar = xq.h;
        this.f13173c = new org.telegram.ui.Components.u5(l0Var, 0L, 320L, xqVar);
        this.d = new org.telegram.ui.Components.u5(l0Var, 0L, 320L, xqVar);
        g0 g0Var = new g0(this, context, 1);
        this.h = g0Var;
        g0Var.setListener(new bb.c(this, 28));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f13175f = frameLayout;
        addView(frameLayout, mf.e(-1, -1, 119));
        pg.e eVar = new pg.e(context);
        this.f13176n = eVar;
        eVar.setListener(new h0(1, this));
        frameLayout.addView(eVar, mf.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f13177r = frameLayout2;
        frameLayout.addView(frameLayout2, mf.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        k2.p1.t(textView, 1, 14.0f);
        textView.setBackground(org.telegram.ui.ActionBar.k6.h0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(bd.M0(2131752589, null));
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView, mf.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final m0 f13027b;

            {
                this.f13027b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ga) this.f13027b).G.k0(-1, false, true);
                        return;
                    case 1:
                        m0 m0Var = this.f13027b;
                        m0Var.h.l(true);
                        pg.e eVar2 = m0Var.f13176n;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        return;
                    default:
                        m0 m0Var2 = this.f13027b;
                        ug.n1 n1Var = m0Var2.f13172b;
                        if (n1Var != null) {
                            n1Var.H0 = new re();
                            m0Var2.h.b(m0Var2.f13172b.H0);
                            ug.n1 n1Var2 = m0Var2.f13172b;
                            n1Var2.H0.f25125z = n1Var2.getOrientation();
                            m0Var2.f13172b.k();
                            m0Var2.f13172b.requestLayout();
                            m0Var2.f13172b.A0.requestLayout();
                            m0Var2.f13172b.A0.invalidate();
                            m0Var2.f13172b.A0.post(new ei.z5(m0Var2, 19));
                        }
                        ((ga) m0Var2).G.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setBackground(org.telegram.ui.ActionBar.k6.h0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(bd.M0(2131751697, null));
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView2, mf.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final m0 f13027b;

            {
                this.f13027b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ga) this.f13027b).G.k0(-1, false, true);
                        return;
                    case 1:
                        m0 m0Var = this.f13027b;
                        m0Var.h.l(true);
                        pg.e eVar2 = m0Var.f13176n;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        return;
                    default:
                        m0 m0Var2 = this.f13027b;
                        ug.n1 n1Var = m0Var2.f13172b;
                        if (n1Var != null) {
                            n1Var.H0 = new re();
                            m0Var2.h.b(m0Var2.f13172b.H0);
                            ug.n1 n1Var2 = m0Var2.f13172b;
                            n1Var2.H0.f25125z = n1Var2.getOrientation();
                            m0Var2.f13172b.k();
                            m0Var2.f13172b.requestLayout();
                            m0Var2.f13172b.A0.requestLayout();
                            m0Var2.f13172b.A0.invalidate();
                            m0Var2.f13172b.A0.post(new ei.z5(m0Var2, 19));
                        }
                        ((ga) m0Var2).G.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setBackground(org.telegram.ui.ActionBar.k6.h0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(bd.M0(2131744698, null));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView3, mf.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final m0 f13027b;

            {
                this.f13027b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ga) this.f13027b).G.k0(-1, false, true);
                        return;
                    case 1:
                        m0 m0Var = this.f13027b;
                        m0Var.h.l(true);
                        pg.e eVar2 = m0Var.f13176n;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        return;
                    default:
                        m0 m0Var2 = this.f13027b;
                        ug.n1 n1Var = m0Var2.f13172b;
                        if (n1Var != null) {
                            n1Var.H0 = new re();
                            m0Var2.h.b(m0Var2.f13172b.H0);
                            ug.n1 n1Var2 = m0Var2.f13172b;
                            n1Var2.H0.f25125z = n1Var2.getOrientation();
                            m0Var2.f13172b.k();
                            m0Var2.f13172b.requestLayout();
                            m0Var2.f13172b.A0.requestLayout();
                            m0Var2.f13172b.A0.invalidate();
                            m0Var2.f13172b.A0.post(new ei.z5(m0Var2, 19));
                        }
                        ((ga) m0Var2).G.k0(-1, false, true);
                        return;
                }
            }
        });
        new LinearLayout(context);
    }

    public int getCurrentHeight() {
        ug.n1 n1Var = this.f13172b;
        if (n1Var == null) {
            return 1;
        }
        if (n1Var.getOrientation() != 90 && this.f13172b.getOrientation() != 270) {
            return this.f13172b.getContentHeight();
        }
        return this.f13172b.getContentWidth();
    }

    public int getCurrentWidth() {
        ug.n1 n1Var = this.f13172b;
        if (n1Var == null) {
            return 1;
        }
        if (n1Var.getOrientation() != 90 && this.f13172b.getOrientation() != 270) {
            return this.f13172b.getContentWidth();
        }
        return this.f13172b.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f13178s;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        g0 g0Var = this.h;
        g0Var.setTopPadding(org.telegram.messenger.g0.L(52.0f));
        g0Var.setBottomPadding(org.telegram.messenger.g0.L(116.0f) + this.f13175f.getPaddingBottom());
        super.onLayout(z10, i3, i10, i11, i12);
    }

    public void set(ug.n1 n1Var) {
        if (n1Var == null) {
            return;
        }
        this.f13172b = n1Var;
        setVisibility(0);
        this.F = false;
        g0 g0Var = this.h;
        boolean z10 = true;
        g0Var.K = true;
        getLocationOnScreen(this.f13179w);
        this.f13171a.getLocationOnScreen(this.f13180x);
        n1Var.getLocationOnScreen(this.f13181y);
        re reVar = n1Var.H0;
        if (reVar == null) {
            reVar = null;
        }
        g0Var.p(n1Var.getOrientation(), this.E, reVar);
        float rotation = g0Var.getRotation();
        pg.e eVar = this.f13176n;
        eVar.setRotation(rotation);
        org.telegram.ui.Components.u5 u5Var = this.f13173c;
        if (reVar != null) {
            eVar.b(reVar.d);
            if (reVar.f25117k == 0) {
                z10 = false;
            }
            eVar.setRotated(z10);
            eVar.setMirrored(reVar.f25118l);
            u5Var.f(reVar.f25118l, false);
        } else {
            eVar.b(0.0f);
            eVar.setRotated(false);
            eVar.setMirrored(false);
            u5Var.getClass();
            u5Var.e(false, 0.0f);
        }
        g0Var.r(false);
        l0 l0Var = this.f13174e;
        l0Var.setVisibility(0);
        l0Var.invalidate();
    }

    public void setAppearProgress(float f10) {
        if (Math.abs(this.f13178s - f10) < 0.001f) {
            return;
        }
        this.f13178s = f10;
        this.f13174e.invalidate();
        g0 g0Var = this.h;
        CropAreaView cropAreaView = g0Var.f53511a;
        CropAreaView cropAreaView2 = g0Var.f53511a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
    }
}

package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.messenger.ye;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.wq;
public abstract class m0 extends FrameLayout {
    public final og.g D;
    public boolean E;
    public final y5 f12394a;
    public tg.n1 f12395b;
    public final org.telegram.ui.Components.v5 f12396c;
    public final org.telegram.ui.Components.v5 d;
    public final l0 f12397e;
    public final FrameLayout f12398f;
    public final g0 h;
    public final og.f f12399n;
    public final FrameLayout f12400r;
    public float f12401s;
    public final int[] f12402w;
    public final int[] f12403x;
    public final int[] f12404y;

    public m0(Context context, y5 y5Var) {
        super(context);
        this.f12401s = 0.0f;
        this.f12402w = new int[2];
        this.f12403x = new int[2];
        this.f12404y = new int[2];
        this.D = new Object();
        this.f12394a = y5Var;
        l0 l0Var = new l0(this, context);
        this.f12397e = l0Var;
        wq wqVar = wq.h;
        this.f12396c = new org.telegram.ui.Components.v5(l0Var, 0L, 320L, wqVar);
        this.d = new org.telegram.ui.Components.v5(l0Var, 0L, 320L, wqVar);
        g0 g0Var = new g0(this, context, 1);
        this.h = g0Var;
        g0Var.setListener(new aa.n(this, 21));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f12398f = frameLayout;
        addView(frameLayout, c8.ha.e(-1, -1, 119));
        og.f fVar = new og.f(context);
        this.f12399n = fVar;
        fVar.setListener(new h0(1, this));
        frameLayout.addView(fVar, c8.ha.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f12400r = frameLayout2;
        frameLayout.addView(frameLayout2, c8.ha.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        com.google.android.recaptcha.internal.a.q(textView, 1, 14.0f);
        textView.setBackground(org.telegram.ui.ActionBar.m6.h0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(id.M0(2131752589, null));
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView, c8.ha.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final m0 f12253b;

            {
                this.f12253b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ga) this.f12253b).F.k0(-1, false, true);
                        return;
                    case 1:
                        m0 m0Var = this.f12253b;
                        m0Var.h.l(true);
                        og.f fVar2 = m0Var.f12399n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        m0 m0Var2 = this.f12253b;
                        tg.n1 n1Var = m0Var2.f12395b;
                        if (n1Var != null) {
                            n1Var.G0 = new ye();
                            m0Var2.h.b(m0Var2.f12395b.G0);
                            tg.n1 n1Var2 = m0Var2.f12395b;
                            n1Var2.G0.f26654z = n1Var2.getOrientation();
                            m0Var2.f12395b.k();
                            m0Var2.f12395b.requestLayout();
                            m0Var2.f12395b.f55880z0.requestLayout();
                            m0Var2.f12395b.f55880z0.invalidate();
                            m0Var2.f12395b.f55880z0.post(new di.f8(m0Var2, 14));
                        }
                        ((ga) m0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setBackground(org.telegram.ui.ActionBar.m6.h0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(id.M0(2131751696, null));
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView2, c8.ha.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final m0 f12253b;

            {
                this.f12253b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ga) this.f12253b).F.k0(-1, false, true);
                        return;
                    case 1:
                        m0 m0Var = this.f12253b;
                        m0Var.h.l(true);
                        og.f fVar2 = m0Var.f12399n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        m0 m0Var2 = this.f12253b;
                        tg.n1 n1Var = m0Var2.f12395b;
                        if (n1Var != null) {
                            n1Var.G0 = new ye();
                            m0Var2.h.b(m0Var2.f12395b.G0);
                            tg.n1 n1Var2 = m0Var2.f12395b;
                            n1Var2.G0.f26654z = n1Var2.getOrientation();
                            m0Var2.f12395b.k();
                            m0Var2.f12395b.requestLayout();
                            m0Var2.f12395b.f55880z0.requestLayout();
                            m0Var2.f12395b.f55880z0.invalidate();
                            m0Var2.f12395b.f55880z0.post(new di.f8(m0Var2, 14));
                        }
                        ((ga) m0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setBackground(org.telegram.ui.ActionBar.m6.h0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(id.M0(2131744688, null));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView3, c8.ha.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final m0 f12253b;

            {
                this.f12253b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ga) this.f12253b).F.k0(-1, false, true);
                        return;
                    case 1:
                        m0 m0Var = this.f12253b;
                        m0Var.h.l(true);
                        og.f fVar2 = m0Var.f12399n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        m0 m0Var2 = this.f12253b;
                        tg.n1 n1Var = m0Var2.f12395b;
                        if (n1Var != null) {
                            n1Var.G0 = new ye();
                            m0Var2.h.b(m0Var2.f12395b.G0);
                            tg.n1 n1Var2 = m0Var2.f12395b;
                            n1Var2.G0.f26654z = n1Var2.getOrientation();
                            m0Var2.f12395b.k();
                            m0Var2.f12395b.requestLayout();
                            m0Var2.f12395b.f55880z0.requestLayout();
                            m0Var2.f12395b.f55880z0.invalidate();
                            m0Var2.f12395b.f55880z0.post(new di.f8(m0Var2, 14));
                        }
                        ((ga) m0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
        new LinearLayout(context);
    }

    public int getCurrentHeight() {
        tg.n1 n1Var = this.f12395b;
        if (n1Var == null) {
            return 1;
        }
        if (n1Var.getOrientation() != 90 && this.f12395b.getOrientation() != 270) {
            return this.f12395b.getContentHeight();
        }
        return this.f12395b.getContentWidth();
    }

    public int getCurrentWidth() {
        tg.n1 n1Var = this.f12395b;
        if (n1Var == null) {
            return 1;
        }
        if (n1Var.getOrientation() != 90 && this.f12395b.getOrientation() != 270) {
            return this.f12395b.getContentWidth();
        }
        return this.f12395b.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f12401s;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        g0 g0Var = this.h;
        g0Var.setTopPadding(org.telegram.messenger.g0.L(52.0f));
        g0Var.setBottomPadding(org.telegram.messenger.g0.L(116.0f) + this.f12398f.getPaddingBottom());
        super.onLayout(z9, i7, i10, i11, i12);
    }

    public void set(tg.n1 n1Var) {
        if (n1Var == null) {
            return;
        }
        this.f12395b = n1Var;
        setVisibility(0);
        this.E = false;
        g0 g0Var = this.h;
        boolean z9 = true;
        g0Var.J = true;
        getLocationOnScreen(this.f12402w);
        this.f12394a.getLocationOnScreen(this.f12403x);
        n1Var.getLocationOnScreen(this.f12404y);
        ye yeVar = n1Var.G0;
        if (yeVar == null) {
            yeVar = null;
        }
        g0Var.p(n1Var.getOrientation(), this.D, yeVar);
        float rotation = g0Var.getRotation();
        og.f fVar = this.f12399n;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.v5 v5Var = this.f12396c;
        if (yeVar != null) {
            fVar.b(yeVar.d);
            if (yeVar.f26646k == 0) {
                z9 = false;
            }
            fVar.setRotated(z9);
            fVar.setMirrored(yeVar.f26647l);
            v5Var.f(yeVar.f26647l, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            v5Var.getClass();
            v5Var.e(false, 0.0f);
        }
        g0Var.r(false);
        l0 l0Var = this.f12397e;
        l0Var.setVisibility(0);
        l0Var.invalidate();
    }

    public void setAppearProgress(float f10) {
        if (Math.abs(this.f12401s - f10) < 0.001f) {
            return;
        }
        this.f12401s = f10;
        this.f12397e.invalidate();
        g0 g0Var = this.h;
        CropAreaView cropAreaView = g0Var.f21012a;
        CropAreaView cropAreaView2 = g0Var.f21012a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
    }
}

package di;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.pr;
public abstract class m0 extends FrameLayout {
    public boolean E;
    public final d7 f7620a;
    public rg.z1 f7621b;
    public final org.telegram.ui.Components.e6 f7622c;
    public final org.telegram.ui.Components.e6 d;
    public final l0 f7623e;
    public final FrameLayout f7624f;
    public final g0 h;
    public final mg.f f7625n;
    public final FrameLayout f7626r;
    public float f7627s;
    public final int[] v;
    public final int[] f7628w;
    public final int[] f7629x;
    public final mg.g f7630y;

    public m0(Context context, d7 d7Var) {
        super(context);
        this.f7627s = 0.0f;
        this.v = new int[2];
        this.f7628w = new int[2];
        this.f7629x = new int[2];
        this.f7630y = new Object();
        this.f7620a = d7Var;
        l0 l0Var = new l0(this, context);
        this.f7623e = l0Var;
        pr prVar = pr.h;
        this.f7622c = new org.telegram.ui.Components.e6(l0Var, 0L, 320L, prVar);
        this.d = new org.telegram.ui.Components.e6(l0Var, 0L, 320L, prVar);
        g0 g0Var = new g0(this, context, 1);
        this.h = g0Var;
        g0Var.setListener(new a6.m(this, 15));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f7624f = frameLayout;
        addView(frameLayout, w7.x5.e(-1, -1, 119));
        mg.f fVar = new mg.f(context);
        this.f7625n = fVar;
        fVar.setListener(new h0(1, this));
        frameLayout.addView(fVar, w7.x5.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f7626r = frameLayout2;
        frameLayout.addView(frameLayout2, w7.x5.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        com.google.android.gms.internal.vision.e2.m(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.j6.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.Cells.p6.b(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, w7.x5.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final m0 f7452b;

            {
                this.f7452b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ac) this.f7452b).F.l0(-1, false, true);
                        return;
                    case 1:
                        m0 m0Var = this.f7452b;
                        m0Var.h.l(true);
                        mg.f fVar2 = m0Var.f7625n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        m0 m0Var2 = this.f7452b;
                        rg.z1 z1Var = m0Var2.f7621b;
                        if (z1Var != null) {
                            z1Var.G0 = new MediaController.CropState();
                            m0Var2.h.b(m0Var2.f7621b.G0);
                            rg.z1 z1Var2 = m0Var2.f7621b;
                            z1Var2.G0.orientation = z1Var2.getOrientation();
                            m0Var2.f7621b.k();
                            m0Var2.f7621b.requestLayout();
                            m0Var2.f7621b.f45593z0.requestLayout();
                            m0Var2.f7621b.f45593z0.invalidate();
                            m0Var2.f7621b.f45593z0.post(new bi.oa(m0Var2, 14));
                        }
                        ((ac) m0Var2).F.l0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setBackground(org.telegram.ui.ActionBar.j6.f0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.ui.Cells.p6.b(12.0f, R.string.CropReset, textView2), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView2, w7.x5.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final m0 f7452b;

            {
                this.f7452b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ac) this.f7452b).F.l0(-1, false, true);
                        return;
                    case 1:
                        m0 m0Var = this.f7452b;
                        m0Var.h.l(true);
                        mg.f fVar2 = m0Var.f7625n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        m0 m0Var2 = this.f7452b;
                        rg.z1 z1Var = m0Var2.f7621b;
                        if (z1Var != null) {
                            z1Var.G0 = new MediaController.CropState();
                            m0Var2.h.b(m0Var2.f7621b.G0);
                            rg.z1 z1Var2 = m0Var2.f7621b;
                            z1Var2.G0.orientation = z1Var2.getOrientation();
                            m0Var2.f7621b.k();
                            m0Var2.f7621b.requestLayout();
                            m0Var2.f7621b.f45593z0.requestLayout();
                            m0Var2.f7621b.f45593z0.invalidate();
                            m0Var2.f7621b.f45593z0.post(new bi.oa(m0Var2, 14));
                        }
                        ((ac) m0Var2).F.l0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(org.telegram.ui.ActionBar.j6.f0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setPadding(org.telegram.ui.Cells.p6.b(12.0f, R.string.StoryCrop, textView3), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView3, w7.x5.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final m0 f7452b;

            {
                this.f7452b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ac) this.f7452b).F.l0(-1, false, true);
                        return;
                    case 1:
                        m0 m0Var = this.f7452b;
                        m0Var.h.l(true);
                        mg.f fVar2 = m0Var.f7625n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        m0 m0Var2 = this.f7452b;
                        rg.z1 z1Var = m0Var2.f7621b;
                        if (z1Var != null) {
                            z1Var.G0 = new MediaController.CropState();
                            m0Var2.h.b(m0Var2.f7621b.G0);
                            rg.z1 z1Var2 = m0Var2.f7621b;
                            z1Var2.G0.orientation = z1Var2.getOrientation();
                            m0Var2.f7621b.k();
                            m0Var2.f7621b.requestLayout();
                            m0Var2.f7621b.f45593z0.requestLayout();
                            m0Var2.f7621b.f45593z0.invalidate();
                            m0Var2.f7621b.f45593z0.post(new bi.oa(m0Var2, 14));
                        }
                        ((ac) m0Var2).F.l0(-1, false, true);
                        return;
                }
            }
        });
        new LinearLayout(context);
    }

    public int getCurrentHeight() {
        rg.z1 z1Var = this.f7621b;
        if (z1Var == null) {
            return 1;
        }
        if (z1Var.getOrientation() != 90 && this.f7621b.getOrientation() != 270) {
            return this.f7621b.getContentHeight();
        }
        return this.f7621b.getContentWidth();
    }

    public int getCurrentWidth() {
        rg.z1 z1Var = this.f7621b;
        if (z1Var == null) {
            return 1;
        }
        if (z1Var.getOrientation() != 90 && this.f7621b.getOrientation() != 270) {
            return this.f7621b.getContentWidth();
        }
        return this.f7621b.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f7627s;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        g0 g0Var = this.h;
        g0Var.setTopPadding(AndroidUtilities.dp(52.0f));
        g0Var.setBottomPadding(AndroidUtilities.dp(116.0f) + this.f7624f.getPaddingBottom());
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void set(rg.z1 z1Var) {
        if (z1Var == null) {
            return;
        }
        this.f7621b = z1Var;
        setVisibility(0);
        this.E = false;
        g0 g0Var = this.h;
        boolean z10 = true;
        g0Var.J = true;
        getLocationOnScreen(this.v);
        this.f7620a.getLocationOnScreen(this.f7628w);
        z1Var.getLocationOnScreen(this.f7629x);
        MediaController.CropState cropState = z1Var.G0;
        if (cropState == null) {
            cropState = null;
        }
        g0Var.p(z1Var.getOrientation(), this.f7630y, cropState);
        float rotation = g0Var.getRotation();
        mg.f fVar = this.f7625n;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.e6 e6Var = this.f7622c;
        if (cropState != null) {
            fVar.b(cropState.cropRotate);
            if (cropState.transformRotation == 0) {
                z10 = false;
            }
            fVar.setRotated(z10);
            fVar.setMirrored(cropState.mirrored);
            e6Var.f(cropState.mirrored, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            e6Var.getClass();
            e6Var.d(0.0f, false);
        }
        g0Var.r(false);
        l0 l0Var = this.f7623e;
        l0Var.setVisibility(0);
        l0Var.invalidate();
    }

    public void setAppearProgress(float f7) {
        if (Math.abs(this.f7627s - f7) < 0.001f) {
            return;
        }
        this.f7627s = f7;
        this.f7623e.invalidate();
        g0 g0Var = this.h;
        CropAreaView cropAreaView = g0Var.f16303a;
        CropAreaView cropAreaView2 = g0Var.f16303a;
        cropAreaView.setDimAlpha(0.5f * f7);
        cropAreaView2.setFrameAlpha(f7);
        cropAreaView2.invalidate();
    }
}

package ei;

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
import org.telegram.ui.Components.bs;
public abstract class m0 extends FrameLayout {
    public boolean E;
    public final r6 f9426a;
    public rg.y1 f9427b;
    public final org.telegram.ui.Components.f6 f9428c;
    public final org.telegram.ui.Components.f6 d;
    public final l0 e;
    public final FrameLayout f9429f;
    public final g0 h;
    public final mg.f f9430n;
    public final FrameLayout f9431r;
    public float f9432s;
    public final int[] v;
    public final int[] f9433w;
    public final int[] f9434x;
    public final mg.g f9435y;

    public m0(Context context, r6 r6Var) {
        super(context);
        this.f9432s = 0.0f;
        this.v = new int[2];
        this.f9433w = new int[2];
        this.f9434x = new int[2];
        this.f9435y = new Object();
        this.f9426a = r6Var;
        l0 l0Var = new l0(this, context);
        this.e = l0Var;
        bs bsVar = bs.h;
        this.f9428c = new org.telegram.ui.Components.f6(l0Var, 0L, 320L, bsVar);
        this.d = new org.telegram.ui.Components.f6(l0Var, 0L, 320L, bsVar);
        g0 g0Var = new g0(this, context, 1);
        this.h = g0Var;
        g0Var.setListener(new a4.l(this, 16));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9429f = frameLayout;
        addView(frameLayout, w7.z5.e(-1, -1, 119));
        mg.f fVar = new mg.f(context);
        this.f9430n = fVar;
        fVar.setListener(new h0(1, this));
        frameLayout.addView(fVar, w7.z5.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f9431r = frameLayout2;
        frameLayout.addView(frameLayout2, w7.z5.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        com.google.android.gms.internal.play_billing.k3.m(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.h6.g0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.Cells.c1.e(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, w7.z5.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final m0 f9291b;

            {
                this.f9291b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((gb) this.f9291b).F.k0(-1, false, true);
                        return;
                    case 1:
                        m0 m0Var = this.f9291b;
                        m0Var.h.l(true);
                        mg.f fVar2 = m0Var.f9430n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        m0 m0Var2 = this.f9291b;
                        rg.y1 y1Var = m0Var2.f9427b;
                        if (y1Var != null) {
                            y1Var.G0 = new MediaController.CropState();
                            m0Var2.h.b(m0Var2.f9427b.G0);
                            rg.y1 y1Var2 = m0Var2.f9427b;
                            y1Var2.G0.orientation = y1Var2.getOrientation();
                            m0Var2.f9427b.k();
                            m0Var2.f9427b.requestLayout();
                            m0Var2.f9427b.f45714z0.requestLayout();
                            m0Var2.f9427b.f45714z0.invalidate();
                            m0Var2.f9427b.f45714z0.post(new com.google.firebase.messaging.s(m0Var2, 8));
                        }
                        ((gb) m0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setBackground(org.telegram.ui.ActionBar.h6.g0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.ui.Cells.c1.e(12.0f, R.string.CropReset, textView2), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView2, w7.z5.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final m0 f9291b;

            {
                this.f9291b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((gb) this.f9291b).F.k0(-1, false, true);
                        return;
                    case 1:
                        m0 m0Var = this.f9291b;
                        m0Var.h.l(true);
                        mg.f fVar2 = m0Var.f9430n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        m0 m0Var2 = this.f9291b;
                        rg.y1 y1Var = m0Var2.f9427b;
                        if (y1Var != null) {
                            y1Var.G0 = new MediaController.CropState();
                            m0Var2.h.b(m0Var2.f9427b.G0);
                            rg.y1 y1Var2 = m0Var2.f9427b;
                            y1Var2.G0.orientation = y1Var2.getOrientation();
                            m0Var2.f9427b.k();
                            m0Var2.f9427b.requestLayout();
                            m0Var2.f9427b.f45714z0.requestLayout();
                            m0Var2.f9427b.f45714z0.invalidate();
                            m0Var2.f9427b.f45714z0.post(new com.google.firebase.messaging.s(m0Var2, 8));
                        }
                        ((gb) m0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(org.telegram.ui.ActionBar.h6.g0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setPadding(org.telegram.ui.Cells.c1.e(12.0f, R.string.StoryCrop, textView3), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView3, w7.z5.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final m0 f9291b;

            {
                this.f9291b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((gb) this.f9291b).F.k0(-1, false, true);
                        return;
                    case 1:
                        m0 m0Var = this.f9291b;
                        m0Var.h.l(true);
                        mg.f fVar2 = m0Var.f9430n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        m0 m0Var2 = this.f9291b;
                        rg.y1 y1Var = m0Var2.f9427b;
                        if (y1Var != null) {
                            y1Var.G0 = new MediaController.CropState();
                            m0Var2.h.b(m0Var2.f9427b.G0);
                            rg.y1 y1Var2 = m0Var2.f9427b;
                            y1Var2.G0.orientation = y1Var2.getOrientation();
                            m0Var2.f9427b.k();
                            m0Var2.f9427b.requestLayout();
                            m0Var2.f9427b.f45714z0.requestLayout();
                            m0Var2.f9427b.f45714z0.invalidate();
                            m0Var2.f9427b.f45714z0.post(new com.google.firebase.messaging.s(m0Var2, 8));
                        }
                        ((gb) m0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
        new LinearLayout(context);
    }

    public int getCurrentHeight() {
        rg.y1 y1Var = this.f9427b;
        if (y1Var == null) {
            return 1;
        }
        if (y1Var.getOrientation() != 90 && this.f9427b.getOrientation() != 270) {
            return this.f9427b.getContentHeight();
        }
        return this.f9427b.getContentWidth();
    }

    public int getCurrentWidth() {
        rg.y1 y1Var = this.f9427b;
        if (y1Var == null) {
            return 1;
        }
        if (y1Var.getOrientation() != 90 && this.f9427b.getOrientation() != 270) {
            return this.f9427b.getContentWidth();
        }
        return this.f9427b.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f9432s;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        g0 g0Var = this.h;
        g0Var.setTopPadding(AndroidUtilities.dp(52.0f));
        g0Var.setBottomPadding(AndroidUtilities.dp(116.0f) + this.f9429f.getPaddingBottom());
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void set(rg.y1 y1Var) {
        if (y1Var == null) {
            return;
        }
        this.f9427b = y1Var;
        setVisibility(0);
        this.E = false;
        g0 g0Var = this.h;
        boolean z10 = true;
        g0Var.J = true;
        getLocationOnScreen(this.v);
        this.f9426a.getLocationOnScreen(this.f9433w);
        y1Var.getLocationOnScreen(this.f9434x);
        MediaController.CropState cropState = y1Var.G0;
        if (cropState == null) {
            cropState = null;
        }
        g0Var.p(y1Var.getOrientation(), this.f9435y, cropState);
        float rotation = g0Var.getRotation();
        mg.f fVar = this.f9430n;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.f6 f6Var = this.f9428c;
        if (cropState != null) {
            fVar.b(cropState.cropRotate);
            if (cropState.transformRotation == 0) {
                z10 = false;
            }
            fVar.setRotated(z10);
            fVar.setMirrored(cropState.mirrored);
            f6Var.f(cropState.mirrored, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            f6Var.getClass();
            f6Var.d(0.0f, false);
        }
        g0Var.r(false);
        l0 l0Var = this.e;
        l0Var.setVisibility(0);
        l0Var.invalidate();
    }

    public void setAppearProgress(float f7) {
        if (Math.abs(this.f9432s - f7) < 0.001f) {
            return;
        }
        this.f9432s = f7;
        this.e.invalidate();
        g0 g0Var = this.h;
        CropAreaView cropAreaView = g0Var.f16917a;
        CropAreaView cropAreaView2 = g0Var.f16917a;
        cropAreaView.setDimAlpha(0.5f * f7);
        cropAreaView2.setFrameAlpha(f7);
        cropAreaView2.invalidate();
    }
}

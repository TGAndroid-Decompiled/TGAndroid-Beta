package nh;

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
import org.telegram.ui.Components.jr;
import org.telegram.ui.th;
public abstract class m0 extends FrameLayout {
    public boolean A;
    public final f6 f18103a;
    public bg.y2 f18104b;
    public final org.telegram.ui.Components.d6 f18105c;
    public final org.telegram.ui.Components.d6 d;
    public final l0 f18106e;
    public final FrameLayout f18107f;
    public final g0 h;
    public final wf.e f18108n;
    public final FrameLayout f18109r;
    public float f18110s;
    public final int[] v;
    public final int[] f18111w;
    public final int[] f18112x;
    public final wf.f f18113y;

    public m0(Context context, f6 f6Var) {
        super(context);
        this.f18110s = 0.0f;
        this.v = new int[2];
        this.f18111w = new int[2];
        this.f18112x = new int[2];
        this.f18113y = new Object();
        this.f18103a = f6Var;
        l0 l0Var = new l0(this, context);
        this.f18106e = l0Var;
        jr jrVar = jr.h;
        this.f18105c = new org.telegram.ui.Components.d6(l0Var, 0L, 320L, jrVar);
        this.d = new org.telegram.ui.Components.d6(l0Var, 0L, 320L, jrVar);
        g0 g0Var = new g0(this, context, 1);
        this.h = g0Var;
        g0Var.setListener(new m5.i(this, 27));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f18107f = frameLayout;
        addView(frameLayout, i7.f6.e(-1, -1, 119));
        wf.e eVar = new wf.e(context);
        this.f18108n = eVar;
        eVar.setListener(new h0(1, this));
        frameLayout.addView(eVar, i7.f6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f18109r = frameLayout2;
        frameLayout.addView(frameLayout2, i7.f6.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        th.n(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.g6.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.b.e(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, i7.f6.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final m0 f17987b;

            {
                this.f17987b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((sa) this.f17987b).B.l0(-1, false, true);
                        return;
                    case 1:
                        m0 m0Var = this.f17987b;
                        m0Var.h.l(true);
                        wf.e eVar2 = m0Var.f18108n;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        return;
                    default:
                        m0 m0Var2 = this.f17987b;
                        bg.y2 y2Var = m0Var2.f18104b;
                        if (y2Var != null) {
                            y2Var.C0 = new MediaController.CropState();
                            m0Var2.h.b(m0Var2.f18104b.C0);
                            bg.y2 y2Var2 = m0Var2.f18104b;
                            y2Var2.C0.orientation = y2Var2.getOrientation();
                            m0Var2.f18104b.k();
                            m0Var2.f18104b.requestLayout();
                            m0Var2.f18104b.f2625v0.requestLayout();
                            m0Var2.f18104b.f2625v0.invalidate();
                            m0Var2.f18104b.f2625v0.post(new lh.m5(m0Var2, 19));
                        }
                        ((sa) m0Var2).B.l0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setBackground(org.telegram.ui.ActionBar.g6.f0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.ui.b.e(12.0f, R.string.CropReset, textView2), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView2, i7.f6.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final m0 f17987b;

            {
                this.f17987b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((sa) this.f17987b).B.l0(-1, false, true);
                        return;
                    case 1:
                        m0 m0Var = this.f17987b;
                        m0Var.h.l(true);
                        wf.e eVar2 = m0Var.f18108n;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        return;
                    default:
                        m0 m0Var2 = this.f17987b;
                        bg.y2 y2Var = m0Var2.f18104b;
                        if (y2Var != null) {
                            y2Var.C0 = new MediaController.CropState();
                            m0Var2.h.b(m0Var2.f18104b.C0);
                            bg.y2 y2Var2 = m0Var2.f18104b;
                            y2Var2.C0.orientation = y2Var2.getOrientation();
                            m0Var2.f18104b.k();
                            m0Var2.f18104b.requestLayout();
                            m0Var2.f18104b.f2625v0.requestLayout();
                            m0Var2.f18104b.f2625v0.invalidate();
                            m0Var2.f18104b.f2625v0.post(new lh.m5(m0Var2, 19));
                        }
                        ((sa) m0Var2).B.l0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(org.telegram.ui.ActionBar.g6.f0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setPadding(org.telegram.ui.b.e(12.0f, R.string.StoryCrop, textView3), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView3, i7.f6.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final m0 f17987b;

            {
                this.f17987b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((sa) this.f17987b).B.l0(-1, false, true);
                        return;
                    case 1:
                        m0 m0Var = this.f17987b;
                        m0Var.h.l(true);
                        wf.e eVar2 = m0Var.f18108n;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        return;
                    default:
                        m0 m0Var2 = this.f17987b;
                        bg.y2 y2Var = m0Var2.f18104b;
                        if (y2Var != null) {
                            y2Var.C0 = new MediaController.CropState();
                            m0Var2.h.b(m0Var2.f18104b.C0);
                            bg.y2 y2Var2 = m0Var2.f18104b;
                            y2Var2.C0.orientation = y2Var2.getOrientation();
                            m0Var2.f18104b.k();
                            m0Var2.f18104b.requestLayout();
                            m0Var2.f18104b.f2625v0.requestLayout();
                            m0Var2.f18104b.f2625v0.invalidate();
                            m0Var2.f18104b.f2625v0.post(new lh.m5(m0Var2, 19));
                        }
                        ((sa) m0Var2).B.l0(-1, false, true);
                        return;
                }
            }
        });
        new LinearLayout(context);
    }

    public int getCurrentHeight() {
        bg.y2 y2Var = this.f18104b;
        if (y2Var == null) {
            return 1;
        }
        if (y2Var.getOrientation() != 90 && this.f18104b.getOrientation() != 270) {
            return this.f18104b.getContentHeight();
        }
        return this.f18104b.getContentWidth();
    }

    public int getCurrentWidth() {
        bg.y2 y2Var = this.f18104b;
        if (y2Var == null) {
            return 1;
        }
        if (y2Var.getOrientation() != 90 && this.f18104b.getOrientation() != 270) {
            return this.f18104b.getContentWidth();
        }
        return this.f18104b.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f18110s;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        g0 g0Var = this.h;
        g0Var.setTopPadding(AndroidUtilities.dp(52.0f));
        g0Var.setBottomPadding(AndroidUtilities.dp(116.0f) + this.f18107f.getPaddingBottom());
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void set(bg.y2 y2Var) {
        if (y2Var == null) {
            return;
        }
        this.f18104b = y2Var;
        setVisibility(0);
        this.A = false;
        g0 g0Var = this.h;
        boolean z10 = true;
        g0Var.F = true;
        getLocationOnScreen(this.v);
        this.f18103a.getLocationOnScreen(this.f18111w);
        y2Var.getLocationOnScreen(this.f18112x);
        MediaController.CropState cropState = y2Var.C0;
        if (cropState == null) {
            cropState = null;
        }
        g0Var.p(y2Var.getOrientation(), this.f18113y, cropState);
        float rotation = g0Var.getRotation();
        wf.e eVar = this.f18108n;
        eVar.setRotation(rotation);
        org.telegram.ui.Components.d6 d6Var = this.f18105c;
        if (cropState != null) {
            eVar.b(cropState.cropRotate);
            if (cropState.transformRotation == 0) {
                z10 = false;
            }
            eVar.setRotated(z10);
            eVar.setMirrored(cropState.mirrored);
            d6Var.f(cropState.mirrored, false);
        } else {
            eVar.b(0.0f);
            eVar.setRotated(false);
            eVar.setMirrored(false);
            d6Var.getClass();
            d6Var.d(0.0f, false);
        }
        g0Var.r(false);
        l0 l0Var = this.f18106e;
        l0Var.setVisibility(0);
        l0Var.invalidate();
    }

    public void setAppearProgress(float f9) {
        if (Math.abs(this.f18110s - f9) < 0.001f) {
            return;
        }
        this.f18110s = f9;
        this.f18106e.invalidate();
        g0 g0Var = this.h;
        CropAreaView cropAreaView = g0Var.f49953a;
        CropAreaView cropAreaView2 = g0Var.f49953a;
        cropAreaView.setDimAlpha(0.5f * f9);
        cropAreaView2.setFrameAlpha(f9);
        cropAreaView2.invalidate();
    }
}

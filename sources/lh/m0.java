package lh;

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
import org.telegram.ui.Components.er;

public abstract class m0 extends FrameLayout {
    public boolean A;

    public final q6 f16365a;

    public zf.x1 f16366b;

    public final org.telegram.ui.Components.y5 f16367c;
    public final org.telegram.ui.Components.y5 d;

    public final l0 f16368e;

    public final FrameLayout f16369f;
    public final g0 h;

    public final uf.e f16370n;

    public final FrameLayout f16371r;

    public float f16372s;
    public final int[] v;

    public final int[] f16373w;

    public final int[] f16374x;

    public final uf.f f16375y;

    public m0(Context context, q6 q6Var) {
        super(context);
        this.f16372s = 0.0f;
        this.v = new int[2];
        this.f16373w = new int[2];
        this.f16374x = new int[2];
        this.f16375y = new uf.f();
        this.f16365a = q6Var;
        l0 l0Var = new l0(this, context);
        this.f16368e = l0Var;
        er erVar = er.h;
        this.f16367c = new org.telegram.ui.Components.y5(l0Var, 0L, 320L, erVar);
        this.d = new org.telegram.ui.Components.y5(l0Var, 0L, 320L, erVar);
        g0 g0Var = new g0(this, context, 1);
        this.h = g0Var;
        g0Var.setListener(new ga.c(this, 22));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f16369f = frameLayout;
        addView(frameLayout, h7.z5.e(-1, -1, 119));
        uf.e eVar = new uf.e(context);
        this.f16370n = eVar;
        eVar.setListener(new h0(1, this));
        frameLayout.addView(eVar, h7.z5.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f16371r = frameLayout2;
        frameLayout.addView(frameLayout2, h7.z5.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.Cells.pa.m(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.g6.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.Cells.pa.c(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, h7.z5.e(-2, -1, 115));
        final int i10 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) {

            public final m0 f16213b;

            {
                this.f16213b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ((eb) this.f16213b).B.l0(-1, false, true);
                        break;
                    case 1:
                        m0 m0Var = this.f16213b;
                        m0Var.h.l(true);
                        uf.e eVar2 = m0Var.f16370n;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        break;
                    default:
                        m0 m0Var2 = this.f16213b;
                        zf.x1 x1Var = m0Var2.f16366b;
                        if (x1Var != null) {
                            x1Var.C0 = new MediaController.CropState();
                            m0Var2.h.b(m0Var2.f16366b.C0);
                            zf.x1 x1Var2 = m0Var2.f16366b;
                            x1Var2.C0.orientation = x1Var2.getOrientation();
                            m0Var2.f16366b.k();
                            m0Var2.f16366b.requestLayout();
                            m0Var2.f16366b.f50771v0.requestLayout();
                            m0Var2.f16366b.f50771v0.invalidate();
                            m0Var2.f16366b.f50771v0.post(new kh.c(m0Var2, 5));
                        }
                        ((eb) m0Var2).B.l0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setBackground(org.telegram.ui.ActionBar.g6.f0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.ui.Cells.pa.c(12.0f, R.string.CropReset, textView2), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView2, h7.z5.e(-2, -1, 113));
        final int i11 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) {

            public final m0 f16213b;

            {
                this.f16213b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ((eb) this.f16213b).B.l0(-1, false, true);
                        break;
                    case 1:
                        m0 m0Var = this.f16213b;
                        m0Var.h.l(true);
                        uf.e eVar2 = m0Var.f16370n;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        break;
                    default:
                        m0 m0Var2 = this.f16213b;
                        zf.x1 x1Var = m0Var2.f16366b;
                        if (x1Var != null) {
                            x1Var.C0 = new MediaController.CropState();
                            m0Var2.h.b(m0Var2.f16366b.C0);
                            zf.x1 x1Var2 = m0Var2.f16366b;
                            x1Var2.C0.orientation = x1Var2.getOrientation();
                            m0Var2.f16366b.k();
                            m0Var2.f16366b.requestLayout();
                            m0Var2.f16366b.f50771v0.requestLayout();
                            m0Var2.f16366b.f50771v0.invalidate();
                            m0Var2.f16366b.f50771v0.post(new kh.c(m0Var2, 5));
                        }
                        ((eb) m0Var2).B.l0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(org.telegram.ui.ActionBar.g6.f0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setPadding(org.telegram.ui.Cells.pa.c(12.0f, R.string.StoryCrop, textView3), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView3, h7.z5.e(-2, -1, 117));
        final int i12 = 2;
        textView3.setOnClickListener(new View.OnClickListener(this) {

            public final m0 f16213b;

            {
                this.f16213b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        ((eb) this.f16213b).B.l0(-1, false, true);
                        break;
                    case 1:
                        m0 m0Var = this.f16213b;
                        m0Var.h.l(true);
                        uf.e eVar2 = m0Var.f16370n;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        break;
                    default:
                        m0 m0Var2 = this.f16213b;
                        zf.x1 x1Var = m0Var2.f16366b;
                        if (x1Var != null) {
                            x1Var.C0 = new MediaController.CropState();
                            m0Var2.h.b(m0Var2.f16366b.C0);
                            zf.x1 x1Var2 = m0Var2.f16366b;
                            x1Var2.C0.orientation = x1Var2.getOrientation();
                            m0Var2.f16366b.k();
                            m0Var2.f16366b.requestLayout();
                            m0Var2.f16366b.f50771v0.requestLayout();
                            m0Var2.f16366b.f50771v0.invalidate();
                            m0Var2.f16366b.f50771v0.post(new kh.c(m0Var2, 5));
                        }
                        ((eb) m0Var2).B.l0(-1, false, true);
                        break;
                }
            }
        });
        new LinearLayout(context);
    }

    public int getCurrentHeight() {
        zf.x1 x1Var = this.f16366b;
        if (x1Var == null) {
            return 1;
        }
        return (x1Var.getOrientation() == 90 || this.f16366b.getOrientation() == 270) ? this.f16366b.getContentWidth() : this.f16366b.getContentHeight();
    }

    public int getCurrentWidth() {
        zf.x1 x1Var = this.f16366b;
        if (x1Var == null) {
            return 1;
        }
        return (x1Var.getOrientation() == 90 || this.f16366b.getOrientation() == 270) ? this.f16366b.getContentHeight() : this.f16366b.getContentWidth();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f16372s;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float fDp = AndroidUtilities.dp(52.0f);
        g0 g0Var = this.h;
        g0Var.setTopPadding(fDp);
        g0Var.setBottomPadding(AndroidUtilities.dp(116.0f) + this.f16369f.getPaddingBottom());
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void set(zf.x1 x1Var) {
        if (x1Var == null) {
            return;
        }
        this.f16366b = x1Var;
        setVisibility(0);
        this.A = false;
        g0 g0Var = this.h;
        g0Var.F = true;
        getLocationOnScreen(this.v);
        this.f16365a.getLocationOnScreen(this.f16373w);
        x1Var.getLocationOnScreen(this.f16374x);
        MediaController.CropState cropState = x1Var.C0;
        if (cropState == null) {
            cropState = null;
        }
        g0Var.p(x1Var.getOrientation(), this.f16375y, cropState);
        float rotation = g0Var.getRotation();
        uf.e eVar = this.f16370n;
        eVar.setRotation(rotation);
        org.telegram.ui.Components.y5 y5Var = this.f16367c;
        if (cropState != null) {
            eVar.b(cropState.cropRotate);
            eVar.setRotated(cropState.transformRotation != 0);
            eVar.setMirrored(cropState.mirrored);
            y5Var.f(cropState.mirrored, false);
        } else {
            eVar.b(0.0f);
            eVar.setRotated(false);
            eVar.setMirrored(false);
            y5Var.getClass();
            y5Var.d(0.0f, false);
        }
        g0Var.r(false);
        l0 l0Var = this.f16368e;
        l0Var.setVisibility(0);
        l0Var.invalidate();
    }

    public void setAppearProgress(float f10) {
        if (Math.abs(this.f16372s - f10) < 0.001f) {
            return;
        }
        this.f16372s = f10;
        this.f16368e.invalidate();
        g0 g0Var = this.h;
        CropAreaView cropAreaView = g0Var.f48626a;
        CropAreaView cropAreaView2 = g0Var.f48626a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
    }
}

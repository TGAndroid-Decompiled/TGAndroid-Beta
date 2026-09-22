package ci;

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
import org.telegram.ui.Components.qr;
public abstract class m0 extends FrameLayout {
    public boolean E;
    public final d7 f5021a;
    public qg.y1 f5022b;
    public final org.telegram.ui.Components.d6 f5023c;
    public final org.telegram.ui.Components.d6 d;
    public final l0 e;
    public final FrameLayout f5024f;
    public final g0 h;
    public final lg.f f5025n;
    public final FrameLayout f5026r;
    public float f5027s;
    public final int[] v;
    public final int[] f5028w;
    public final int[] f5029x;
    public final lg.g f5030y;

    public m0(Context context, d7 d7Var) {
        super(context);
        this.f5027s = 0.0f;
        this.v = new int[2];
        this.f5028w = new int[2];
        this.f5029x = new int[2];
        this.f5030y = new Object();
        this.f5021a = d7Var;
        l0 l0Var = new l0(this, context);
        this.e = l0Var;
        qr qrVar = qr.h;
        this.f5023c = new org.telegram.ui.Components.d6(l0Var, 0L, 320L, qrVar);
        this.d = new org.telegram.ui.Components.d6(l0Var, 0L, 320L, qrVar);
        g0 g0Var = new g0(this, context, 1);
        this.h = g0Var;
        g0Var.setListener(new pb.c(this, 12));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f5024f = frameLayout;
        addView(frameLayout, w7.y5.e(-1, -1, 119));
        lg.f fVar = new lg.f(context);
        this.f5025n = fVar;
        fVar.setListener(new h0(1, this));
        frameLayout.addView(fVar, w7.y5.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f5026r = frameLayout2;
        frameLayout.addView(frameLayout2, w7.y5.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.j6.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.Cells.c1.c(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, w7.y5.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final m0 f4869b;

            {
                this.f4869b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((zb) this.f4869b).F.l0(-1, false, true);
                        return;
                    case 1:
                        m0 m0Var = this.f4869b;
                        m0Var.h.l(true);
                        lg.f fVar2 = m0Var.f5025n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        m0 m0Var2 = this.f4869b;
                        qg.y1 y1Var = m0Var2.f5022b;
                        if (y1Var != null) {
                            y1Var.G0 = new MediaController.CropState();
                            m0Var2.h.b(m0Var2.f5022b.G0);
                            qg.y1 y1Var2 = m0Var2.f5022b;
                            y1Var2.G0.orientation = y1Var2.getOrientation();
                            m0Var2.f5022b.k();
                            m0Var2.f5022b.requestLayout();
                            m0Var2.f5022b.f42049z0.requestLayout();
                            m0Var2.f5022b.f42049z0.invalidate();
                            m0Var2.f5022b.f42049z0.post(new androidx.fragment.app.a0(m0Var2, 8));
                        }
                        ((zb) m0Var2).F.l0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setBackground(org.telegram.ui.ActionBar.j6.f0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.ui.Cells.c1.c(12.0f, R.string.CropReset, textView2), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView2, w7.y5.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final m0 f4869b;

            {
                this.f4869b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((zb) this.f4869b).F.l0(-1, false, true);
                        return;
                    case 1:
                        m0 m0Var = this.f4869b;
                        m0Var.h.l(true);
                        lg.f fVar2 = m0Var.f5025n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        m0 m0Var2 = this.f4869b;
                        qg.y1 y1Var = m0Var2.f5022b;
                        if (y1Var != null) {
                            y1Var.G0 = new MediaController.CropState();
                            m0Var2.h.b(m0Var2.f5022b.G0);
                            qg.y1 y1Var2 = m0Var2.f5022b;
                            y1Var2.G0.orientation = y1Var2.getOrientation();
                            m0Var2.f5022b.k();
                            m0Var2.f5022b.requestLayout();
                            m0Var2.f5022b.f42049z0.requestLayout();
                            m0Var2.f5022b.f42049z0.invalidate();
                            m0Var2.f5022b.f42049z0.post(new androidx.fragment.app.a0(m0Var2, 8));
                        }
                        ((zb) m0Var2).F.l0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(org.telegram.ui.ActionBar.j6.f0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setPadding(org.telegram.ui.Cells.c1.c(12.0f, R.string.StoryCrop, textView3), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView3, w7.y5.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final m0 f4869b;

            {
                this.f4869b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((zb) this.f4869b).F.l0(-1, false, true);
                        return;
                    case 1:
                        m0 m0Var = this.f4869b;
                        m0Var.h.l(true);
                        lg.f fVar2 = m0Var.f5025n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        m0 m0Var2 = this.f4869b;
                        qg.y1 y1Var = m0Var2.f5022b;
                        if (y1Var != null) {
                            y1Var.G0 = new MediaController.CropState();
                            m0Var2.h.b(m0Var2.f5022b.G0);
                            qg.y1 y1Var2 = m0Var2.f5022b;
                            y1Var2.G0.orientation = y1Var2.getOrientation();
                            m0Var2.f5022b.k();
                            m0Var2.f5022b.requestLayout();
                            m0Var2.f5022b.f42049z0.requestLayout();
                            m0Var2.f5022b.f42049z0.invalidate();
                            m0Var2.f5022b.f42049z0.post(new androidx.fragment.app.a0(m0Var2, 8));
                        }
                        ((zb) m0Var2).F.l0(-1, false, true);
                        return;
                }
            }
        });
        new LinearLayout(context);
    }

    public int getCurrentHeight() {
        qg.y1 y1Var = this.f5022b;
        if (y1Var == null) {
            return 1;
        }
        if (y1Var.getOrientation() != 90 && this.f5022b.getOrientation() != 270) {
            return this.f5022b.getContentHeight();
        }
        return this.f5022b.getContentWidth();
    }

    public int getCurrentWidth() {
        qg.y1 y1Var = this.f5022b;
        if (y1Var == null) {
            return 1;
        }
        if (y1Var.getOrientation() != 90 && this.f5022b.getOrientation() != 270) {
            return this.f5022b.getContentWidth();
        }
        return this.f5022b.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f5027s;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        g0 g0Var = this.h;
        g0Var.setTopPadding(AndroidUtilities.dp(52.0f));
        g0Var.setBottomPadding(AndroidUtilities.dp(116.0f) + this.f5024f.getPaddingBottom());
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void set(qg.y1 y1Var) {
        if (y1Var == null) {
            return;
        }
        this.f5022b = y1Var;
        setVisibility(0);
        this.E = false;
        g0 g0Var = this.h;
        boolean z10 = true;
        g0Var.J = true;
        getLocationOnScreen(this.v);
        this.f5021a.getLocationOnScreen(this.f5028w);
        y1Var.getLocationOnScreen(this.f5029x);
        MediaController.CropState cropState = y1Var.G0;
        if (cropState == null) {
            cropState = null;
        }
        g0Var.p(y1Var.getOrientation(), this.f5030y, cropState);
        float rotation = g0Var.getRotation();
        lg.f fVar = this.f5025n;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.d6 d6Var = this.f5023c;
        if (cropState != null) {
            fVar.b(cropState.cropRotate);
            if (cropState.transformRotation == 0) {
                z10 = false;
            }
            fVar.setRotated(z10);
            fVar.setMirrored(cropState.mirrored);
            d6Var.f(cropState.mirrored, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            d6Var.getClass();
            d6Var.d(0.0f, false);
        }
        g0Var.r(false);
        l0 l0Var = this.e;
        l0Var.setVisibility(0);
        l0Var.invalidate();
    }

    public void setAppearProgress(float f7) {
        if (Math.abs(this.f5027s - f7) < 0.001f) {
            return;
        }
        this.f5027s = f7;
        this.e.invalidate();
        g0 g0Var = this.h;
        CropAreaView cropAreaView = g0Var.f14307a;
        CropAreaView cropAreaView2 = g0Var.f14307a;
        cropAreaView.setDimAlpha(0.5f * f7);
        cropAreaView2.setFrameAlpha(f7);
        cropAreaView2.invalidate();
    }
}

package kh;

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
import org.telegram.ui.Components.gr;
public abstract class n0 extends FrameLayout {
    public boolean A;
    public final r6 f15720a;
    public yf.x1 f15721b;
    public final org.telegram.ui.Components.y5 f15722c;
    public final org.telegram.ui.Components.y5 d;
    public final m0 f15723e;
    public final FrameLayout f15724f;
    public final h0 h;
    public final tf.e f15725n;
    public final FrameLayout f15726r;
    public float f15727s;
    public final int[] v;
    public final int[] f15728w;
    public final int[] f15729x;
    public final tf.f f15730y;

    public n0(Context context, r6 r6Var) {
        super(context);
        this.f15727s = 0.0f;
        this.v = new int[2];
        this.f15728w = new int[2];
        this.f15729x = new int[2];
        this.f15730y = new Object();
        this.f15720a = r6Var;
        m0 m0Var = new m0(this, context);
        this.f15723e = m0Var;
        gr grVar = gr.h;
        this.f15722c = new org.telegram.ui.Components.y5(m0Var, 0L, 320L, grVar);
        this.d = new org.telegram.ui.Components.y5(m0Var, 0L, 320L, grVar);
        h0 h0Var = new h0(this, context, 1);
        this.h = h0Var;
        h0Var.setListener(new fa.c(this, 24));
        addView(h0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f15724f = frameLayout;
        addView(frameLayout, g7.e6.e(-1, -1, 119));
        tf.e eVar = new tf.e(context);
        this.f15725n = eVar;
        eVar.setListener(new i0(1, this));
        frameLayout.addView(eVar, g7.e6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f15726r = frameLayout2;
        frameLayout.addView(frameLayout2, g7.e6.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        j3.r0.u(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.f6.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.Cells.j2.c(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, g7.e6.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final n0 f15573b;

            {
                this.f15573b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((hb) this.f15573b).B.l0(-1, false, true);
                        return;
                    case 1:
                        n0 n0Var = this.f15573b;
                        n0Var.h.l(true);
                        tf.e eVar2 = n0Var.f15725n;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        return;
                    default:
                        n0 n0Var2 = this.f15573b;
                        yf.x1 x1Var = n0Var2.f15721b;
                        if (x1Var != null) {
                            x1Var.C0 = new MediaController.CropState();
                            n0Var2.h.b(n0Var2.f15721b.C0);
                            yf.x1 x1Var2 = n0Var2.f15721b;
                            x1Var2.C0.orientation = x1Var2.getOrientation();
                            n0Var2.f15721b.k();
                            n0Var2.f15721b.requestLayout();
                            n0Var2.f15721b.f50176v0.requestLayout();
                            n0Var2.f15721b.f50176v0.invalidate();
                            n0Var2.f15721b.f50176v0.post(new ih.g(n0Var2, 28));
                        }
                        ((hb) n0Var2).B.l0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setBackground(org.telegram.ui.ActionBar.f6.f0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.ui.Cells.j2.c(12.0f, R.string.CropReset, textView2), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView2, g7.e6.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final n0 f15573b;

            {
                this.f15573b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((hb) this.f15573b).B.l0(-1, false, true);
                        return;
                    case 1:
                        n0 n0Var = this.f15573b;
                        n0Var.h.l(true);
                        tf.e eVar2 = n0Var.f15725n;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        return;
                    default:
                        n0 n0Var2 = this.f15573b;
                        yf.x1 x1Var = n0Var2.f15721b;
                        if (x1Var != null) {
                            x1Var.C0 = new MediaController.CropState();
                            n0Var2.h.b(n0Var2.f15721b.C0);
                            yf.x1 x1Var2 = n0Var2.f15721b;
                            x1Var2.C0.orientation = x1Var2.getOrientation();
                            n0Var2.f15721b.k();
                            n0Var2.f15721b.requestLayout();
                            n0Var2.f15721b.f50176v0.requestLayout();
                            n0Var2.f15721b.f50176v0.invalidate();
                            n0Var2.f15721b.f50176v0.post(new ih.g(n0Var2, 28));
                        }
                        ((hb) n0Var2).B.l0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(org.telegram.ui.ActionBar.f6.f0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setPadding(org.telegram.ui.Cells.j2.c(12.0f, R.string.StoryCrop, textView3), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView3, g7.e6.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final n0 f15573b;

            {
                this.f15573b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((hb) this.f15573b).B.l0(-1, false, true);
                        return;
                    case 1:
                        n0 n0Var = this.f15573b;
                        n0Var.h.l(true);
                        tf.e eVar2 = n0Var.f15725n;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        return;
                    default:
                        n0 n0Var2 = this.f15573b;
                        yf.x1 x1Var = n0Var2.f15721b;
                        if (x1Var != null) {
                            x1Var.C0 = new MediaController.CropState();
                            n0Var2.h.b(n0Var2.f15721b.C0);
                            yf.x1 x1Var2 = n0Var2.f15721b;
                            x1Var2.C0.orientation = x1Var2.getOrientation();
                            n0Var2.f15721b.k();
                            n0Var2.f15721b.requestLayout();
                            n0Var2.f15721b.f50176v0.requestLayout();
                            n0Var2.f15721b.f50176v0.invalidate();
                            n0Var2.f15721b.f50176v0.post(new ih.g(n0Var2, 28));
                        }
                        ((hb) n0Var2).B.l0(-1, false, true);
                        return;
                }
            }
        });
        new LinearLayout(context);
    }

    public int getCurrentHeight() {
        yf.x1 x1Var = this.f15721b;
        if (x1Var == null) {
            return 1;
        }
        if (x1Var.getOrientation() != 90 && this.f15721b.getOrientation() != 270) {
            return this.f15721b.getContentHeight();
        }
        return this.f15721b.getContentWidth();
    }

    public int getCurrentWidth() {
        yf.x1 x1Var = this.f15721b;
        if (x1Var == null) {
            return 1;
        }
        if (x1Var.getOrientation() != 90 && this.f15721b.getOrientation() != 270) {
            return this.f15721b.getContentWidth();
        }
        return this.f15721b.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f15727s;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        h0 h0Var = this.h;
        h0Var.setTopPadding(AndroidUtilities.dp(52.0f));
        h0Var.setBottomPadding(AndroidUtilities.dp(116.0f) + this.f15724f.getPaddingBottom());
        super.onLayout(z10, i9, i10, i11, i12);
    }

    public void set(yf.x1 x1Var) {
        if (x1Var == null) {
            return;
        }
        this.f15721b = x1Var;
        setVisibility(0);
        this.A = false;
        h0 h0Var = this.h;
        boolean z10 = true;
        h0Var.F = true;
        getLocationOnScreen(this.v);
        this.f15720a.getLocationOnScreen(this.f15728w);
        x1Var.getLocationOnScreen(this.f15729x);
        MediaController.CropState cropState = x1Var.C0;
        if (cropState == null) {
            cropState = null;
        }
        h0Var.p(x1Var.getOrientation(), this.f15730y, cropState);
        float rotation = h0Var.getRotation();
        tf.e eVar = this.f15725n;
        eVar.setRotation(rotation);
        org.telegram.ui.Components.y5 y5Var = this.f15722c;
        if (cropState != null) {
            eVar.b(cropState.cropRotate);
            if (cropState.transformRotation == 0) {
                z10 = false;
            }
            eVar.setRotated(z10);
            eVar.setMirrored(cropState.mirrored);
            y5Var.f(cropState.mirrored, false);
        } else {
            eVar.b(0.0f);
            eVar.setRotated(false);
            eVar.setMirrored(false);
            y5Var.getClass();
            y5Var.d(0.0f, false);
        }
        h0Var.r(false);
        m0 m0Var = this.f15723e;
        m0Var.setVisibility(0);
        m0Var.invalidate();
    }

    public void setAppearProgress(float f10) {
        if (Math.abs(this.f15727s - f10) < 0.001f) {
            return;
        }
        this.f15727s = f10;
        this.f15723e.invalidate();
        h0 h0Var = this.h;
        CropAreaView cropAreaView = h0Var.f47904a;
        CropAreaView cropAreaView2 = h0Var.f47904a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
    }
}

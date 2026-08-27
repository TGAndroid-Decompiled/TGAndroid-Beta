package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.er;

public abstract class j0 extends FrameLayout {

    public final q6 f16149a;

    public final org.telegram.ui.Components.y5 f16150b;

    public final org.telegram.ui.Components.y5 f16151c;
    public final i0 d;

    public final FrameLayout f16152e;

    public final g0 f16153f;
    public final uf.e h;

    public final FrameLayout f16154n;

    public float f16155r;

    public final int[] f16156s;
    public final int[] v;

    public final uf.f f16157w;

    public z7 f16158x;

    public boolean f16159y;

    public j0(Context context, q6 q6Var) {
        super(context);
        this.f16155r = 0.0f;
        this.f16156s = new int[2];
        this.v = new int[2];
        this.f16157w = new uf.f();
        this.f16149a = q6Var;
        i0 i0Var = new i0(this, context);
        this.d = i0Var;
        er erVar = er.h;
        this.f16150b = new org.telegram.ui.Components.y5(i0Var, 0L, 320L, erVar);
        this.f16151c = new org.telegram.ui.Components.y5(this, 0L, 360L, erVar);
        g0 g0Var = new g0(this, context, 0);
        this.f16153f = g0Var;
        g0Var.setListener(new ae.b(this, 24));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f16152e = frameLayout;
        addView(frameLayout, h7.z5.e(-1, -1, 119));
        uf.e eVar = new uf.e(context);
        this.h = eVar;
        eVar.setListener(new h0(0, this));
        frameLayout.addView(eVar, h7.z5.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f16154n = frameLayout2;
        frameLayout.addView(frameLayout2, h7.z5.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.Cells.pa.m(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.g6.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.Cells.pa.c(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, h7.z5.e(-2, -1, 115));
        final int i10 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) {

            public final j0 f15948b;

            {
                this.f15948b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ((db) this.f15948b).A.l0(-1, false, true);
                        break;
                    case 1:
                        j0 j0Var = this.f15948b;
                        j0Var.f16153f.l(true);
                        uf.e eVar2 = j0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        j0Var.d.invalidate();
                        break;
                    default:
                        j0 j0Var2 = this.f15948b;
                        z7 z7Var = j0Var2.f16158x;
                        if (z7Var != null) {
                            z7Var.m0 = new MediaController.CropState();
                            j0Var2.f16153f.b(j0Var2.f16158x.m0);
                            z7 z7Var2 = j0Var2.f16158x;
                            z7Var2.m0.orientation = z7Var2.Q;
                        }
                        ((db) j0Var2).A.l0(-1, false, true);
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

            public final j0 f15948b;

            {
                this.f15948b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ((db) this.f15948b).A.l0(-1, false, true);
                        break;
                    case 1:
                        j0 j0Var = this.f15948b;
                        j0Var.f16153f.l(true);
                        uf.e eVar2 = j0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        j0Var.d.invalidate();
                        break;
                    default:
                        j0 j0Var2 = this.f15948b;
                        z7 z7Var = j0Var2.f16158x;
                        if (z7Var != null) {
                            z7Var.m0 = new MediaController.CropState();
                            j0Var2.f16153f.b(j0Var2.f16158x.m0);
                            z7 z7Var2 = j0Var2.f16158x;
                            z7Var2.m0.orientation = z7Var2.Q;
                        }
                        ((db) j0Var2).A.l0(-1, false, true);
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

            public final j0 f15948b;

            {
                this.f15948b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        ((db) this.f15948b).A.l0(-1, false, true);
                        break;
                    case 1:
                        j0 j0Var = this.f15948b;
                        j0Var.f16153f.l(true);
                        uf.e eVar2 = j0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        j0Var.d.invalidate();
                        break;
                    default:
                        j0 j0Var2 = this.f15948b;
                        z7 z7Var = j0Var2.f16158x;
                        if (z7Var != null) {
                            z7Var.m0 = new MediaController.CropState();
                            j0Var2.f16153f.b(j0Var2.f16158x.m0);
                            z7 z7Var2 = j0Var2.f16158x;
                            z7Var2.m0.orientation = z7Var2.Q;
                        }
                        ((db) j0Var2).A.l0(-1, false, true);
                        break;
                }
            }
        });
    }

    public int getCurrentHeight() {
        z7 z7Var = this.f16158x;
        if (z7Var == null) {
            return 1;
        }
        int i10 = z7Var.Q;
        q6 q6Var = this.f16149a;
        return (i10 == 90 || i10 == 270) ? q6Var.getContentWidth() : q6Var.getContentHeight();
    }

    public int getCurrentWidth() {
        z7 z7Var = this.f16158x;
        if (z7Var == null) {
            return 1;
        }
        int i10 = z7Var.Q;
        q6 q6Var = this.f16149a;
        return (i10 == 90 || i10 == 270) ? q6Var.getContentHeight() : q6Var.getContentWidth();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f16155r;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f16153f.setBottomPadding(AndroidUtilities.dp(116.0f) + this.f16152e.getPaddingBottom());
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void setAppearProgress(float f10) {
        if (Math.abs(this.f16155r - f10) < 0.001f) {
            return;
        }
        this.f16155r = f10;
        i0 i0Var = this.d;
        i0Var.setAlpha(f10);
        i0Var.invalidate();
        g0 g0Var = this.f16153f;
        CropAreaView cropAreaView = g0Var.f48626a;
        CropAreaView cropAreaView2 = g0Var.f48626a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
        this.f16149a.invalidate();
    }

    public void setEntry(z7 z7Var) {
        if (z7Var == null) {
            return;
        }
        this.f16158x = z7Var;
        this.f16159y = false;
        g0 g0Var = this.f16153f;
        g0Var.F = true;
        getLocationOnScreen(this.f16156s);
        int[] iArr = this.v;
        q6 q6Var = this.f16149a;
        q6Var.getLocationOnScreen(iArr);
        MediaController.CropState cropState = z7Var.m0;
        if (cropState == null) {
            cropState = null;
        }
        int i10 = z7Var.Q;
        uf.f fVar = this.f16157w;
        g0Var.p(i10, fVar, cropState);
        float rotation = g0Var.getRotation();
        uf.e eVar = this.h;
        eVar.setRotation(rotation);
        org.telegram.ui.Components.y5 y5Var = this.f16150b;
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
        this.f16151c.d(fVar.f48590i, true);
        i0 i0Var = this.d;
        i0Var.setVisibility(0);
        i0Var.invalidate();
        q6Var.setCropEditorDrawing(this);
    }
}

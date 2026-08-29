package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.jr;
import org.telegram.ui.th;
public abstract class j0 extends FrameLayout {
    public final f6 f17916a;
    public final org.telegram.ui.Components.d6 f17917b;
    public final org.telegram.ui.Components.d6 f17918c;
    public final i0 d;
    public final FrameLayout f17919e;
    public final g0 f17920f;
    public final wf.e h;
    public final FrameLayout f17921n;
    public float f17922r;
    public final int[] f17923s;
    public final int[] v;
    public final wf.f f17924w;
    public o7 f17925x;
    public boolean f17926y;

    public j0(Context context, f6 f6Var) {
        super(context);
        this.f17922r = 0.0f;
        this.f17923s = new int[2];
        this.v = new int[2];
        this.f17924w = new Object();
        this.f17916a = f6Var;
        i0 i0Var = new i0(this, context);
        this.d = i0Var;
        jr jrVar = jr.h;
        this.f17917b = new org.telegram.ui.Components.d6(i0Var, 0L, 320L, jrVar);
        this.f17918c = new org.telegram.ui.Components.d6(this, 0L, 360L, jrVar);
        g0 g0Var = new g0(this, context, 0);
        this.f17920f = g0Var;
        g0Var.setListener(new ha.c(this, 28));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f17919e = frameLayout;
        addView(frameLayout, i7.f6.e(-1, -1, 119));
        wf.e eVar = new wf.e(context);
        this.h = eVar;
        eVar.setListener(new h0(0, this));
        frameLayout.addView(eVar, i7.f6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f17921n = frameLayout2;
        frameLayout.addView(frameLayout2, i7.f6.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        th.n(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.g6.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.b.e(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, i7.f6.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f17621b;

            {
                this.f17621b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ra) this.f17621b).A.l0(-1, false, true);
                        return;
                    case 1:
                        j0 j0Var = this.f17621b;
                        j0Var.f17920f.l(true);
                        wf.e eVar2 = j0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        j0Var.d.invalidate();
                        return;
                    default:
                        j0 j0Var2 = this.f17621b;
                        o7 o7Var = j0Var2.f17925x;
                        if (o7Var != null) {
                            o7Var.m0 = new MediaController.CropState();
                            j0Var2.f17920f.b(j0Var2.f17925x.m0);
                            o7 o7Var2 = j0Var2.f17925x;
                            o7Var2.m0.orientation = o7Var2.Q;
                        }
                        ((ra) j0Var2).A.l0(-1, false, true);
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
            public final j0 f17621b;

            {
                this.f17621b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ra) this.f17621b).A.l0(-1, false, true);
                        return;
                    case 1:
                        j0 j0Var = this.f17621b;
                        j0Var.f17920f.l(true);
                        wf.e eVar2 = j0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        j0Var.d.invalidate();
                        return;
                    default:
                        j0 j0Var2 = this.f17621b;
                        o7 o7Var = j0Var2.f17925x;
                        if (o7Var != null) {
                            o7Var.m0 = new MediaController.CropState();
                            j0Var2.f17920f.b(j0Var2.f17925x.m0);
                            o7 o7Var2 = j0Var2.f17925x;
                            o7Var2.m0.orientation = o7Var2.Q;
                        }
                        ((ra) j0Var2).A.l0(-1, false, true);
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
            public final j0 f17621b;

            {
                this.f17621b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ra) this.f17621b).A.l0(-1, false, true);
                        return;
                    case 1:
                        j0 j0Var = this.f17621b;
                        j0Var.f17920f.l(true);
                        wf.e eVar2 = j0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        j0Var.d.invalidate();
                        return;
                    default:
                        j0 j0Var2 = this.f17621b;
                        o7 o7Var = j0Var2.f17925x;
                        if (o7Var != null) {
                            o7Var.m0 = new MediaController.CropState();
                            j0Var2.f17920f.b(j0Var2.f17925x.m0);
                            o7 o7Var2 = j0Var2.f17925x;
                            o7Var2.m0.orientation = o7Var2.Q;
                        }
                        ((ra) j0Var2).A.l0(-1, false, true);
                        return;
                }
            }
        });
    }

    public int getCurrentHeight() {
        o7 o7Var = this.f17925x;
        if (o7Var == null) {
            return 1;
        }
        int i10 = o7Var.Q;
        f6 f6Var = this.f17916a;
        if (i10 != 90 && i10 != 270) {
            return f6Var.getContentHeight();
        }
        return f6Var.getContentWidth();
    }

    public int getCurrentWidth() {
        o7 o7Var = this.f17925x;
        if (o7Var == null) {
            return 1;
        }
        int i10 = o7Var.Q;
        f6 f6Var = this.f17916a;
        if (i10 != 90 && i10 != 270) {
            return f6Var.getContentWidth();
        }
        return f6Var.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f17922r;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f17920f.setBottomPadding(AndroidUtilities.dp(116.0f) + this.f17919e.getPaddingBottom());
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void setAppearProgress(float f9) {
        if (Math.abs(this.f17922r - f9) < 0.001f) {
            return;
        }
        this.f17922r = f9;
        i0 i0Var = this.d;
        i0Var.setAlpha(f9);
        i0Var.invalidate();
        g0 g0Var = this.f17920f;
        CropAreaView cropAreaView = g0Var.f49953a;
        CropAreaView cropAreaView2 = g0Var.f49953a;
        cropAreaView.setDimAlpha(0.5f * f9);
        cropAreaView2.setFrameAlpha(f9);
        cropAreaView2.invalidate();
        this.f17916a.invalidate();
    }

    public void setEntry(o7 o7Var) {
        boolean z10;
        if (o7Var == null) {
            return;
        }
        this.f17925x = o7Var;
        this.f17926y = false;
        g0 g0Var = this.f17920f;
        g0Var.F = true;
        getLocationOnScreen(this.f17923s);
        int[] iArr = this.v;
        f6 f6Var = this.f17916a;
        f6Var.getLocationOnScreen(iArr);
        MediaController.CropState cropState = o7Var.m0;
        if (cropState == null) {
            cropState = null;
        }
        int i10 = o7Var.Q;
        wf.f fVar = this.f17924w;
        g0Var.p(i10, fVar, cropState);
        float rotation = g0Var.getRotation();
        wf.e eVar = this.h;
        eVar.setRotation(rotation);
        org.telegram.ui.Components.d6 d6Var = this.f17917b;
        if (cropState != null) {
            eVar.b(cropState.cropRotate);
            if (cropState.transformRotation != 0) {
                z10 = true;
            } else {
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
        this.f17918c.d(fVar.f49917i, true);
        i0 i0Var = this.d;
        i0Var.setVisibility(0);
        i0Var.invalidate();
        f6Var.setCropEditorDrawing(this);
    }
}

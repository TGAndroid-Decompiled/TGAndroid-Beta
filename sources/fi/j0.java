package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
public abstract class j0 extends FrameLayout {
    public final o6 f11024a;
    public final org.telegram.ui.Components.h6 f11025b;
    public final org.telegram.ui.Components.h6 f11026c;
    public final i0 d;
    public final FrameLayout e;
    public final g0 f11027f;
    public final ng.f h;
    public final FrameLayout f11028n;
    public float f11029r;
    public final int[] f11030s;
    public final int[] v;
    public final ng.g f11031w;
    public w7 f11032x;
    public boolean f11033y;

    public j0(Context context, o6 o6Var) {
        super(context);
        this.f11029r = 0.0f;
        this.f11030s = new int[2];
        this.v = new int[2];
        this.f11031w = new Object();
        this.f11024a = o6Var;
        i0 i0Var = new i0(this, context);
        this.d = i0Var;
        ds dsVar = ds.h;
        this.f11025b = new org.telegram.ui.Components.h6(i0Var, 0L, 320L, dsVar);
        this.f11026c = new org.telegram.ui.Components.h6(this, 0L, 360L, dsVar);
        g0 g0Var = new g0(this, context, 0);
        this.f11027f = g0Var;
        g0Var.setListener(new za.c(this, 21));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, gb1.i(-1, -1, 119));
        ng.f fVar = new ng.f(context);
        this.h = fVar;
        fVar.setListener(new h0(0, this));
        frameLayout.addView(fVar, gb1.h(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f11028n = frameLayout2;
        frameLayout.addView(frameLayout2, gb1.h(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        ic.a.o(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.y6.g0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.d3.h(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, gb1.i(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f10850b;

            {
                this.f10850b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((cb) this.f10850b).E.k0(-1, false, true);
                        return;
                    case 1:
                        j0 j0Var = this.f10850b;
                        j0Var.f11027f.l(true);
                        ng.f fVar2 = j0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        j0Var.d.invalidate();
                        return;
                    default:
                        j0 j0Var2 = this.f10850b;
                        w7 w7Var = j0Var2.f11032x;
                        if (w7Var != null) {
                            w7Var.m0 = new MediaController.CropState();
                            j0Var2.f11027f.b(j0Var2.f11032x.m0);
                            w7 w7Var2 = j0Var2.f11032x;
                            w7Var2.m0.orientation = w7Var2.Q;
                        }
                        ((cb) j0Var2).E.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setBackground(org.telegram.ui.ActionBar.y6.g0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.ui.d3.h(12.0f, R.string.CropReset, textView2), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView2, gb1.i(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f10850b;

            {
                this.f10850b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((cb) this.f10850b).E.k0(-1, false, true);
                        return;
                    case 1:
                        j0 j0Var = this.f10850b;
                        j0Var.f11027f.l(true);
                        ng.f fVar2 = j0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        j0Var.d.invalidate();
                        return;
                    default:
                        j0 j0Var2 = this.f10850b;
                        w7 w7Var = j0Var2.f11032x;
                        if (w7Var != null) {
                            w7Var.m0 = new MediaController.CropState();
                            j0Var2.f11027f.b(j0Var2.f11032x.m0);
                            w7 w7Var2 = j0Var2.f11032x;
                            w7Var2.m0.orientation = w7Var2.Q;
                        }
                        ((cb) j0Var2).E.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(org.telegram.ui.ActionBar.y6.g0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setPadding(org.telegram.ui.d3.h(12.0f, R.string.StoryCrop, textView3), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView3, gb1.i(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f10850b;

            {
                this.f10850b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((cb) this.f10850b).E.k0(-1, false, true);
                        return;
                    case 1:
                        j0 j0Var = this.f10850b;
                        j0Var.f11027f.l(true);
                        ng.f fVar2 = j0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        j0Var.d.invalidate();
                        return;
                    default:
                        j0 j0Var2 = this.f10850b;
                        w7 w7Var = j0Var2.f11032x;
                        if (w7Var != null) {
                            w7Var.m0 = new MediaController.CropState();
                            j0Var2.f11027f.b(j0Var2.f11032x.m0);
                            w7 w7Var2 = j0Var2.f11032x;
                            w7Var2.m0.orientation = w7Var2.Q;
                        }
                        ((cb) j0Var2).E.k0(-1, false, true);
                        return;
                }
            }
        });
    }

    public int getCurrentHeight() {
        w7 w7Var = this.f11032x;
        if (w7Var == null) {
            return 1;
        }
        int i10 = w7Var.Q;
        o6 o6Var = this.f11024a;
        if (i10 != 90 && i10 != 270) {
            return o6Var.getContentHeight();
        }
        return o6Var.getContentWidth();
    }

    public int getCurrentWidth() {
        w7 w7Var = this.f11032x;
        if (w7Var == null) {
            return 1;
        }
        int i10 = w7Var.Q;
        o6 o6Var = this.f11024a;
        if (i10 != 90 && i10 != 270) {
            return o6Var.getContentWidth();
        }
        return o6Var.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f11029r;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f11027f.setBottomPadding(AndroidUtilities.dp(116.0f) + this.e.getPaddingBottom());
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void setAppearProgress(float f7) {
        if (Math.abs(this.f11029r - f7) < 0.001f) {
            return;
        }
        this.f11029r = f7;
        i0 i0Var = this.d;
        i0Var.setAlpha(f7);
        i0Var.invalidate();
        g0 g0Var = this.f11027f;
        CropAreaView cropAreaView = g0Var.f18843a;
        CropAreaView cropAreaView2 = g0Var.f18843a;
        cropAreaView.setDimAlpha(0.5f * f7);
        cropAreaView2.setFrameAlpha(f7);
        cropAreaView2.invalidate();
        this.f11024a.invalidate();
    }

    public void setEntry(w7 w7Var) {
        ng.g gVar;
        boolean z10;
        if (w7Var == null) {
            return;
        }
        this.f11032x = w7Var;
        this.f11033y = false;
        g0 g0Var = this.f11027f;
        g0Var.J = true;
        getLocationOnScreen(this.f11030s);
        int[] iArr = this.v;
        o6 o6Var = this.f11024a;
        o6Var.getLocationOnScreen(iArr);
        MediaController.CropState cropState = w7Var.m0;
        if (cropState == null) {
            cropState = null;
        }
        g0Var.p(w7Var.Q, this.f11031w, cropState);
        float rotation = g0Var.getRotation();
        ng.f fVar = this.h;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.h6 h6Var = this.f11025b;
        if (cropState != null) {
            fVar.b(cropState.cropRotate);
            if (cropState.transformRotation != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            fVar.setRotated(z10);
            fVar.setMirrored(cropState.mirrored);
            h6Var.f(cropState.mirrored, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            h6Var.getClass();
            h6Var.d(0.0f, false);
        }
        g0Var.r(false);
        this.f11026c.d(gVar.f18808i, true);
        i0 i0Var = this.d;
        i0Var.setVisibility(0);
        i0Var.invalidate();
        o6Var.setCropEditorDrawing(this);
    }
}

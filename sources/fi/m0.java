package fi;

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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
public abstract class m0 extends FrameLayout {
    public boolean E;
    public final o6 f11225a;
    public sg.y1 f11226b;
    public final org.telegram.ui.Components.h6 f11227c;
    public final org.telegram.ui.Components.h6 d;
    public final l0 e;
    public final FrameLayout f11228f;
    public final g0 h;
    public final ng.f f11229n;
    public final FrameLayout f11230r;
    public float f11231s;
    public final int[] v;
    public final int[] f11232w;
    public final int[] f11233x;
    public final ng.g f11234y;

    public m0(Context context, o6 o6Var) {
        super(context);
        this.f11231s = 0.0f;
        this.v = new int[2];
        this.f11232w = new int[2];
        this.f11233x = new int[2];
        this.f11234y = new Object();
        this.f11225a = o6Var;
        l0 l0Var = new l0(this, context);
        this.e = l0Var;
        ds dsVar = ds.h;
        this.f11227c = new org.telegram.ui.Components.h6(l0Var, 0L, 320L, dsVar);
        this.d = new org.telegram.ui.Components.h6(l0Var, 0L, 320L, dsVar);
        g0 g0Var = new g0(this, context, 1);
        this.h = g0Var;
        g0Var.setListener(new b6.i(this, 20));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f11228f = frameLayout;
        addView(frameLayout, kb1.i(-1, -1, 119));
        ng.f fVar = new ng.f(context);
        this.f11229n = fVar;
        fVar.setListener(new h0(1, this));
        frameLayout.addView(fVar, kb1.h(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f11230r = frameLayout2;
        frameLayout.addView(frameLayout2, kb1.h(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        ic.a.o(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.y6.g0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.d3.h(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, kb1.i(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final m0 f11076b;

            {
                this.f11076b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((db) this.f11076b).F.k0(-1, false, true);
                        return;
                    case 1:
                        m0 m0Var = this.f11076b;
                        m0Var.h.l(true);
                        ng.f fVar2 = m0Var.f11229n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        m0 m0Var2 = this.f11076b;
                        sg.y1 y1Var = m0Var2.f11226b;
                        if (y1Var != null) {
                            y1Var.G0 = new MediaController.CropState();
                            m0Var2.h.b(m0Var2.f11226b.G0);
                            sg.y1 y1Var2 = m0Var2.f11226b;
                            y1Var2.G0.orientation = y1Var2.getOrientation();
                            m0Var2.f11226b.k();
                            m0Var2.f11226b.requestLayout();
                            m0Var2.f11226b.f48634z0.requestLayout();
                            m0Var2.f11226b.f48634z0.invalidate();
                            m0Var2.f11226b.f48634z0.post(new di.s8(m0Var2, 12));
                        }
                        ((db) m0Var2).F.k0(-1, false, true);
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
        frameLayout2.addView(textView2, kb1.i(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final m0 f11076b;

            {
                this.f11076b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((db) this.f11076b).F.k0(-1, false, true);
                        return;
                    case 1:
                        m0 m0Var = this.f11076b;
                        m0Var.h.l(true);
                        ng.f fVar2 = m0Var.f11229n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        m0 m0Var2 = this.f11076b;
                        sg.y1 y1Var = m0Var2.f11226b;
                        if (y1Var != null) {
                            y1Var.G0 = new MediaController.CropState();
                            m0Var2.h.b(m0Var2.f11226b.G0);
                            sg.y1 y1Var2 = m0Var2.f11226b;
                            y1Var2.G0.orientation = y1Var2.getOrientation();
                            m0Var2.f11226b.k();
                            m0Var2.f11226b.requestLayout();
                            m0Var2.f11226b.f48634z0.requestLayout();
                            m0Var2.f11226b.f48634z0.invalidate();
                            m0Var2.f11226b.f48634z0.post(new di.s8(m0Var2, 12));
                        }
                        ((db) m0Var2).F.k0(-1, false, true);
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
        frameLayout2.addView(textView3, kb1.i(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final m0 f11076b;

            {
                this.f11076b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((db) this.f11076b).F.k0(-1, false, true);
                        return;
                    case 1:
                        m0 m0Var = this.f11076b;
                        m0Var.h.l(true);
                        ng.f fVar2 = m0Var.f11229n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        m0 m0Var2 = this.f11076b;
                        sg.y1 y1Var = m0Var2.f11226b;
                        if (y1Var != null) {
                            y1Var.G0 = new MediaController.CropState();
                            m0Var2.h.b(m0Var2.f11226b.G0);
                            sg.y1 y1Var2 = m0Var2.f11226b;
                            y1Var2.G0.orientation = y1Var2.getOrientation();
                            m0Var2.f11226b.k();
                            m0Var2.f11226b.requestLayout();
                            m0Var2.f11226b.f48634z0.requestLayout();
                            m0Var2.f11226b.f48634z0.invalidate();
                            m0Var2.f11226b.f48634z0.post(new di.s8(m0Var2, 12));
                        }
                        ((db) m0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
        new LinearLayout(context);
    }

    public int getCurrentHeight() {
        sg.y1 y1Var = this.f11226b;
        if (y1Var == null) {
            return 1;
        }
        if (y1Var.getOrientation() != 90 && this.f11226b.getOrientation() != 270) {
            return this.f11226b.getContentHeight();
        }
        return this.f11226b.getContentWidth();
    }

    public int getCurrentWidth() {
        sg.y1 y1Var = this.f11226b;
        if (y1Var == null) {
            return 1;
        }
        if (y1Var.getOrientation() != 90 && this.f11226b.getOrientation() != 270) {
            return this.f11226b.getContentWidth();
        }
        return this.f11226b.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f11231s;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        g0 g0Var = this.h;
        g0Var.setTopPadding(AndroidUtilities.dp(52.0f));
        g0Var.setBottomPadding(AndroidUtilities.dp(116.0f) + this.f11228f.getPaddingBottom());
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void set(sg.y1 y1Var) {
        if (y1Var == null) {
            return;
        }
        this.f11226b = y1Var;
        setVisibility(0);
        this.E = false;
        g0 g0Var = this.h;
        boolean z10 = true;
        g0Var.J = true;
        getLocationOnScreen(this.v);
        this.f11225a.getLocationOnScreen(this.f11232w);
        y1Var.getLocationOnScreen(this.f11233x);
        MediaController.CropState cropState = y1Var.G0;
        if (cropState == null) {
            cropState = null;
        }
        g0Var.p(y1Var.getOrientation(), this.f11234y, cropState);
        float rotation = g0Var.getRotation();
        ng.f fVar = this.f11229n;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.h6 h6Var = this.f11227c;
        if (cropState != null) {
            fVar.b(cropState.cropRotate);
            if (cropState.transformRotation == 0) {
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
        l0 l0Var = this.e;
        l0Var.setVisibility(0);
        l0Var.invalidate();
    }

    public void setAppearProgress(float f7) {
        if (Math.abs(this.f11231s - f7) < 0.001f) {
            return;
        }
        this.f11231s = f7;
        this.e.invalidate();
        g0 g0Var = this.h;
        CropAreaView cropAreaView = g0Var.f18842a;
        CropAreaView cropAreaView2 = g0Var.f18842a;
        cropAreaView.setDimAlpha(0.5f * f7);
        cropAreaView2.setFrameAlpha(f7);
        cropAreaView2.invalidate();
    }
}

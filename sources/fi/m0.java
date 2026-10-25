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
import org.telegram.ui.Components.gb1;
public abstract class m0 extends FrameLayout {
    public boolean E;
    public final o6 f11226a;
    public sg.z1 f11227b;
    public final org.telegram.ui.Components.h6 f11228c;
    public final org.telegram.ui.Components.h6 d;
    public final l0 e;
    public final FrameLayout f11229f;
    public final g0 h;
    public final ng.f f11230n;
    public final FrameLayout f11231r;
    public float f11232s;
    public final int[] v;
    public final int[] f11233w;
    public final int[] f11234x;
    public final ng.g f11235y;

    public m0(Context context, o6 o6Var) {
        super(context);
        this.f11232s = 0.0f;
        this.v = new int[2];
        this.f11233w = new int[2];
        this.f11234x = new int[2];
        this.f11235y = new Object();
        this.f11226a = o6Var;
        l0 l0Var = new l0(this, context);
        this.e = l0Var;
        ds dsVar = ds.h;
        this.f11228c = new org.telegram.ui.Components.h6(l0Var, 0L, 320L, dsVar);
        this.d = new org.telegram.ui.Components.h6(l0Var, 0L, 320L, dsVar);
        g0 g0Var = new g0(this, context, 1);
        this.h = g0Var;
        g0Var.setListener(new b6.i(this, 20));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f11229f = frameLayout;
        addView(frameLayout, gb1.i(-1, -1, 119));
        ng.f fVar = new ng.f(context);
        this.f11230n = fVar;
        fVar.setListener(new h0(1, this));
        frameLayout.addView(fVar, gb1.h(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f11231r = frameLayout2;
        frameLayout.addView(frameLayout2, gb1.h(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        ic.a.o(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.y6.g0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.d3.h(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, gb1.i(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final m0 f11077b;

            {
                this.f11077b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((db) this.f11077b).F.k0(-1, false, true);
                        return;
                    case 1:
                        m0 m0Var = this.f11077b;
                        m0Var.h.l(true);
                        ng.f fVar2 = m0Var.f11230n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        m0 m0Var2 = this.f11077b;
                        sg.z1 z1Var = m0Var2.f11227b;
                        if (z1Var != null) {
                            z1Var.G0 = new MediaController.CropState();
                            m0Var2.h.b(m0Var2.f11227b.G0);
                            sg.z1 z1Var2 = m0Var2.f11227b;
                            z1Var2.G0.orientation = z1Var2.getOrientation();
                            m0Var2.f11227b.k();
                            m0Var2.f11227b.requestLayout();
                            m0Var2.f11227b.f48606z0.requestLayout();
                            m0Var2.f11227b.f48606z0.invalidate();
                            m0Var2.f11227b.f48606z0.post(new di.s8(m0Var2, 12));
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
        frameLayout2.addView(textView2, gb1.i(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final m0 f11077b;

            {
                this.f11077b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((db) this.f11077b).F.k0(-1, false, true);
                        return;
                    case 1:
                        m0 m0Var = this.f11077b;
                        m0Var.h.l(true);
                        ng.f fVar2 = m0Var.f11230n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        m0 m0Var2 = this.f11077b;
                        sg.z1 z1Var = m0Var2.f11227b;
                        if (z1Var != null) {
                            z1Var.G0 = new MediaController.CropState();
                            m0Var2.h.b(m0Var2.f11227b.G0);
                            sg.z1 z1Var2 = m0Var2.f11227b;
                            z1Var2.G0.orientation = z1Var2.getOrientation();
                            m0Var2.f11227b.k();
                            m0Var2.f11227b.requestLayout();
                            m0Var2.f11227b.f48606z0.requestLayout();
                            m0Var2.f11227b.f48606z0.invalidate();
                            m0Var2.f11227b.f48606z0.post(new di.s8(m0Var2, 12));
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
        frameLayout2.addView(textView3, gb1.i(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final m0 f11077b;

            {
                this.f11077b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((db) this.f11077b).F.k0(-1, false, true);
                        return;
                    case 1:
                        m0 m0Var = this.f11077b;
                        m0Var.h.l(true);
                        ng.f fVar2 = m0Var.f11230n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        return;
                    default:
                        m0 m0Var2 = this.f11077b;
                        sg.z1 z1Var = m0Var2.f11227b;
                        if (z1Var != null) {
                            z1Var.G0 = new MediaController.CropState();
                            m0Var2.h.b(m0Var2.f11227b.G0);
                            sg.z1 z1Var2 = m0Var2.f11227b;
                            z1Var2.G0.orientation = z1Var2.getOrientation();
                            m0Var2.f11227b.k();
                            m0Var2.f11227b.requestLayout();
                            m0Var2.f11227b.f48606z0.requestLayout();
                            m0Var2.f11227b.f48606z0.invalidate();
                            m0Var2.f11227b.f48606z0.post(new di.s8(m0Var2, 12));
                        }
                        ((db) m0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
        new LinearLayout(context);
    }

    public int getCurrentHeight() {
        sg.z1 z1Var = this.f11227b;
        if (z1Var == null) {
            return 1;
        }
        if (z1Var.getOrientation() != 90 && this.f11227b.getOrientation() != 270) {
            return this.f11227b.getContentHeight();
        }
        return this.f11227b.getContentWidth();
    }

    public int getCurrentWidth() {
        sg.z1 z1Var = this.f11227b;
        if (z1Var == null) {
            return 1;
        }
        if (z1Var.getOrientation() != 90 && this.f11227b.getOrientation() != 270) {
            return this.f11227b.getContentWidth();
        }
        return this.f11227b.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f11232s;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        g0 g0Var = this.h;
        g0Var.setTopPadding(AndroidUtilities.dp(52.0f));
        g0Var.setBottomPadding(AndroidUtilities.dp(116.0f) + this.f11229f.getPaddingBottom());
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void set(sg.z1 z1Var) {
        if (z1Var == null) {
            return;
        }
        this.f11227b = z1Var;
        setVisibility(0);
        this.E = false;
        g0 g0Var = this.h;
        boolean z10 = true;
        g0Var.J = true;
        getLocationOnScreen(this.v);
        this.f11226a.getLocationOnScreen(this.f11233w);
        z1Var.getLocationOnScreen(this.f11234x);
        MediaController.CropState cropState = z1Var.G0;
        if (cropState == null) {
            cropState = null;
        }
        g0Var.p(z1Var.getOrientation(), this.f11235y, cropState);
        float rotation = g0Var.getRotation();
        ng.f fVar = this.f11230n;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.h6 h6Var = this.f11228c;
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
        if (Math.abs(this.f11232s - f7) < 0.001f) {
            return;
        }
        this.f11232s = f7;
        this.e.invalidate();
        g0 g0Var = this.h;
        CropAreaView cropAreaView = g0Var.f18843a;
        CropAreaView cropAreaView2 = g0Var.f18843a;
        cropAreaView.setDimAlpha(0.5f * f7);
        cropAreaView2.setFrameAlpha(f7);
        cropAreaView2.invalidate();
    }
}

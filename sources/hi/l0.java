package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.xe;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.nr;
public abstract class l0 extends FrameLayout {
    public boolean E;
    public final v5 f14952a;
    public final org.telegram.ui.Components.d6 f14953b;
    public final org.telegram.ui.Components.d6 f14954c;
    public final k0 d;
    public final FrameLayout f14955e;
    public final i0 f14956f;
    public final og.f h;
    public final FrameLayout f14957n;
    public float f14958r;
    public final int[] f14959s;
    public final int[] f14960w;
    public final og.g f14961x;
    public c7 f14962y;

    public l0(Context context, v5 v5Var) {
        super(context);
        this.f14958r = 0.0f;
        this.f14959s = new int[2];
        this.f14960w = new int[2];
        this.f14961x = new Object();
        this.f14952a = v5Var;
        k0 k0Var = new k0(this, context);
        this.d = k0Var;
        nr nrVar = nr.h;
        this.f14953b = new org.telegram.ui.Components.d6(k0Var, 0L, 320L, nrVar);
        this.f14954c = new org.telegram.ui.Components.d6(this, 0L, 360L, nrVar);
        i0 i0Var = new i0(this, context, 0);
        this.f14956f = i0Var;
        i0Var.setListener(new ob.c(this, 28));
        addView(i0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f14955e = frameLayout;
        addView(frameLayout, c8.ma.e(-1, -1, 119));
        og.f fVar = new og.f(context);
        this.h = fVar;
        fVar.setListener(new j0(0, this));
        frameLayout.addView(fVar, c8.ma.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f14957n = frameLayout2;
        frameLayout.addView(frameLayout2, c8.ma.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        i5.c.x(textView, 1, 14.0f);
        textView.setBackground(org.telegram.ui.ActionBar.m6.h0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(hd.N0(2131752577, null));
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView, c8.ma.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final l0 f14732b;

            {
                this.f14732b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ca) this.f14732b).F.k0(-1, false, true);
                        return;
                    case 1:
                        l0 l0Var = this.f14732b;
                        l0Var.f14956f.l(true);
                        og.f fVar2 = l0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        l0Var.d.invalidate();
                        return;
                    default:
                        l0 l0Var2 = this.f14732b;
                        c7 c7Var = l0Var2.f14962y;
                        if (c7Var != null) {
                            c7Var.m0 = new xe();
                            l0Var2.f14956f.b(l0Var2.f14962y.m0);
                            c7 c7Var2 = l0Var2.f14962y;
                            c7Var2.m0.f27889z = c7Var2.Q;
                        }
                        ((ca) l0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setBackground(org.telegram.ui.ActionBar.m6.h0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(hd.N0(2131751684, null));
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView2, c8.ma.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final l0 f14732b;

            {
                this.f14732b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ca) this.f14732b).F.k0(-1, false, true);
                        return;
                    case 1:
                        l0 l0Var = this.f14732b;
                        l0Var.f14956f.l(true);
                        og.f fVar2 = l0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        l0Var.d.invalidate();
                        return;
                    default:
                        l0 l0Var2 = this.f14732b;
                        c7 c7Var = l0Var2.f14962y;
                        if (c7Var != null) {
                            c7Var.m0 = new xe();
                            l0Var2.f14956f.b(l0Var2.f14962y.m0);
                            c7 c7Var2 = l0Var2.f14962y;
                            c7Var2.m0.f27889z = c7Var2.Q;
                        }
                        ((ca) l0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setBackground(org.telegram.ui.ActionBar.m6.h0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(hd.N0(2131744445, null));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView3, c8.ma.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final l0 f14732b;

            {
                this.f14732b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((ca) this.f14732b).F.k0(-1, false, true);
                        return;
                    case 1:
                        l0 l0Var = this.f14732b;
                        l0Var.f14956f.l(true);
                        og.f fVar2 = l0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        l0Var.d.invalidate();
                        return;
                    default:
                        l0 l0Var2 = this.f14732b;
                        c7 c7Var = l0Var2.f14962y;
                        if (c7Var != null) {
                            c7Var.m0 = new xe();
                            l0Var2.f14956f.b(l0Var2.f14962y.m0);
                            c7 c7Var2 = l0Var2.f14962y;
                            c7Var2.m0.f27889z = c7Var2.Q;
                        }
                        ((ca) l0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
    }

    public int getCurrentHeight() {
        c7 c7Var = this.f14962y;
        if (c7Var == null) {
            return 1;
        }
        int i7 = c7Var.Q;
        v5 v5Var = this.f14952a;
        if (i7 != 90 && i7 != 270) {
            return v5Var.getContentHeight();
        }
        return v5Var.getContentWidth();
    }

    public int getCurrentWidth() {
        c7 c7Var = this.f14962y;
        if (c7Var == null) {
            return 1;
        }
        int i7 = c7Var.Q;
        v5 v5Var = this.f14952a;
        if (i7 != 90 && i7 != 270) {
            return v5Var.getContentWidth();
        }
        return v5Var.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f14958r;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        this.f14956f.setBottomPadding(org.telegram.messenger.g0.L(116.0f) + this.f14955e.getPaddingBottom());
        super.onLayout(z10, i7, i10, i11, i12);
    }

    public void setAppearProgress(float f10) {
        if (Math.abs(this.f14958r - f10) < 0.001f) {
            return;
        }
        this.f14958r = f10;
        k0 k0Var = this.d;
        k0Var.setAlpha(f10);
        k0Var.invalidate();
        i0 i0Var = this.f14956f;
        CropAreaView cropAreaView = i0Var.f21921a;
        CropAreaView cropAreaView2 = i0Var.f21921a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
        this.f14952a.invalidate();
    }

    public void setEntry(c7 c7Var) {
        og.g gVar;
        boolean z10;
        if (c7Var == null) {
            return;
        }
        this.f14962y = c7Var;
        this.E = false;
        i0 i0Var = this.f14956f;
        i0Var.K = true;
        getLocationOnScreen(this.f14959s);
        int[] iArr = this.f14960w;
        v5 v5Var = this.f14952a;
        v5Var.getLocationOnScreen(iArr);
        xe xeVar = c7Var.m0;
        if (xeVar == null) {
            xeVar = null;
        }
        i0Var.p(c7Var.Q, this.f14961x, xeVar);
        float rotation = i0Var.getRotation();
        og.f fVar = this.h;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.d6 d6Var = this.f14953b;
        if (xeVar != null) {
            fVar.b(xeVar.d);
            if (xeVar.f27881k != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            fVar.setRotated(z10);
            fVar.setMirrored(xeVar.f27882l);
            d6Var.f(xeVar.f27882l, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            d6Var.getClass();
            d6Var.e(false, 0.0f);
        }
        i0Var.r(false);
        this.f14954c.e(true, gVar.f21884i);
        k0 k0Var = this.d;
        k0Var.setVisibility(0);
        k0Var.invalidate();
        v5Var.setCropEditorDrawing(this);
    }
}

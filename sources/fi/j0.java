package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.ye;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.xq;
public abstract class j0 extends FrameLayout {
    public boolean D;
    public final y5 f12197a;
    public final org.telegram.ui.Components.w5 f12198b;
    public final org.telegram.ui.Components.w5 f12199c;
    public final i0 d;
    public final FrameLayout f12200e;
    public final g0 f12201f;
    public final og.f h;
    public final FrameLayout f12202n;
    public float f12203r;
    public final int[] f12204s;
    public final int[] f12205w;
    public final og.g f12206x;
    public e7 f12207y;

    public j0(Context context, y5 y5Var) {
        super(context);
        this.f12203r = 0.0f;
        this.f12204s = new int[2];
        this.f12205w = new int[2];
        this.f12206x = new Object();
        this.f12197a = y5Var;
        i0 i0Var = new i0(this, context);
        this.d = i0Var;
        xq xqVar = xq.h;
        this.f12198b = new org.telegram.ui.Components.w5(i0Var, 0L, 320L, xqVar);
        this.f12199c = new org.telegram.ui.Components.w5(this, 0L, 360L, xqVar);
        g0 g0Var = new g0(this, context, 0);
        this.f12201f = g0Var;
        g0Var.setListener(new d6.i(this, 24));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f12200e = frameLayout;
        addView(frameLayout, c8.ha.e(-1, -1, 119));
        og.f fVar = new og.f(context);
        this.h = fVar;
        fVar.setListener(new h0(0, this));
        frameLayout.addView(fVar, c8.ha.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f12202n = frameLayout2;
        frameLayout.addView(frameLayout2, c8.ha.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        com.google.android.recaptcha.internal.a.q(textView, 1, 14.0f);
        textView.setBackground(org.telegram.ui.ActionBar.k6.h0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(hd.M0(2131752589, null));
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView, c8.ha.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f11948b;

            {
                this.f11948b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((fa) this.f11948b).E.k0(-1, false, true);
                        return;
                    case 1:
                        j0 j0Var = this.f11948b;
                        j0Var.f12201f.l(true);
                        og.f fVar2 = j0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        j0Var.d.invalidate();
                        return;
                    default:
                        j0 j0Var2 = this.f11948b;
                        e7 e7Var = j0Var2.f12207y;
                        if (e7Var != null) {
                            e7Var.m0 = new ye();
                            j0Var2.f12201f.b(j0Var2.f12207y.m0);
                            e7 e7Var2 = j0Var2.f12207y;
                            e7Var2.m0.f26641z = e7Var2.Q;
                        }
                        ((fa) j0Var2).E.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setBackground(org.telegram.ui.ActionBar.k6.h0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(hd.M0(2131751697, null));
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView2, c8.ha.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f11948b;

            {
                this.f11948b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((fa) this.f11948b).E.k0(-1, false, true);
                        return;
                    case 1:
                        j0 j0Var = this.f11948b;
                        j0Var.f12201f.l(true);
                        og.f fVar2 = j0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        j0Var.d.invalidate();
                        return;
                    default:
                        j0 j0Var2 = this.f11948b;
                        e7 e7Var = j0Var2.f12207y;
                        if (e7Var != null) {
                            e7Var.m0 = new ye();
                            j0Var2.f12201f.b(j0Var2.f12207y.m0);
                            e7 e7Var2 = j0Var2.f12207y;
                            e7Var2.m0.f26641z = e7Var2.Q;
                        }
                        ((fa) j0Var2).E.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setBackground(org.telegram.ui.ActionBar.k6.h0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(hd.M0(2131744689, null));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView3, c8.ha.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f11948b;

            {
                this.f11948b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((fa) this.f11948b).E.k0(-1, false, true);
                        return;
                    case 1:
                        j0 j0Var = this.f11948b;
                        j0Var.f12201f.l(true);
                        og.f fVar2 = j0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        j0Var.d.invalidate();
                        return;
                    default:
                        j0 j0Var2 = this.f11948b;
                        e7 e7Var = j0Var2.f12207y;
                        if (e7Var != null) {
                            e7Var.m0 = new ye();
                            j0Var2.f12201f.b(j0Var2.f12207y.m0);
                            e7 e7Var2 = j0Var2.f12207y;
                            e7Var2.m0.f26641z = e7Var2.Q;
                        }
                        ((fa) j0Var2).E.k0(-1, false, true);
                        return;
                }
            }
        });
    }

    public int getCurrentHeight() {
        e7 e7Var = this.f12207y;
        if (e7Var == null) {
            return 1;
        }
        int i7 = e7Var.Q;
        y5 y5Var = this.f12197a;
        if (i7 != 90 && i7 != 270) {
            return y5Var.getContentHeight();
        }
        return y5Var.getContentWidth();
    }

    public int getCurrentWidth() {
        e7 e7Var = this.f12207y;
        if (e7Var == null) {
            return 1;
        }
        int i7 = e7Var.Q;
        y5 y5Var = this.f12197a;
        if (i7 != 90 && i7 != 270) {
            return y5Var.getContentWidth();
        }
        return y5Var.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f12203r;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        this.f12201f.setBottomPadding(org.telegram.messenger.g0.L(116.0f) + this.f12200e.getPaddingBottom());
        super.onLayout(z9, i7, i10, i11, i12);
    }

    public void setAppearProgress(float f10) {
        if (Math.abs(this.f12203r - f10) < 0.001f) {
            return;
        }
        this.f12203r = f10;
        i0 i0Var = this.d;
        i0Var.setAlpha(f10);
        i0Var.invalidate();
        g0 g0Var = this.f12201f;
        CropAreaView cropAreaView = g0Var.f21004a;
        CropAreaView cropAreaView2 = g0Var.f21004a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
        this.f12197a.invalidate();
    }

    public void setEntry(e7 e7Var) {
        og.g gVar;
        boolean z9;
        if (e7Var == null) {
            return;
        }
        this.f12207y = e7Var;
        this.D = false;
        g0 g0Var = this.f12201f;
        g0Var.J = true;
        getLocationOnScreen(this.f12204s);
        int[] iArr = this.f12205w;
        y5 y5Var = this.f12197a;
        y5Var.getLocationOnScreen(iArr);
        ye yeVar = e7Var.m0;
        if (yeVar == null) {
            yeVar = null;
        }
        g0Var.p(e7Var.Q, this.f12206x, yeVar);
        float rotation = g0Var.getRotation();
        og.f fVar = this.h;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.w5 w5Var = this.f12198b;
        if (yeVar != null) {
            fVar.b(yeVar.d);
            if (yeVar.f26633k != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            fVar.setRotated(z9);
            fVar.setMirrored(yeVar.f26634l);
            w5Var.f(yeVar.f26634l, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            w5Var.getClass();
            w5Var.e(false, 0.0f);
        }
        g0Var.r(false);
        this.f12199c.e(true, gVar.f20967i);
        i0 i0Var = this.d;
        i0Var.setVisibility(0);
        i0Var.invalidate();
        y5Var.setCropEditorDrawing(this);
    }
}

package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.re;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.xq;
public abstract class j0 extends FrameLayout {
    public boolean E;
    public final y5 f12988a;
    public final org.telegram.ui.Components.u5 f12989b;
    public final org.telegram.ui.Components.u5 f12990c;
    public final i0 d;
    public final FrameLayout f12991e;
    public final g0 f12992f;
    public final pg.e h;
    public final FrameLayout f12993n;
    public float f12994r;
    public final int[] f12995s;
    public final int[] f12996w;
    public final pg.f f12997x;
    public f7 f12998y;

    public j0(Context context, y5 y5Var) {
        super(context);
        this.f12994r = 0.0f;
        this.f12995s = new int[2];
        this.f12996w = new int[2];
        this.f12997x = new Object();
        this.f12988a = y5Var;
        i0 i0Var = new i0(this, context);
        this.d = i0Var;
        xq xqVar = xq.h;
        this.f12989b = new org.telegram.ui.Components.u5(i0Var, 0L, 320L, xqVar);
        this.f12990c = new org.telegram.ui.Components.u5(this, 0L, 360L, xqVar);
        g0 g0Var = new g0(this, context, 0);
        this.f12992f = g0Var;
        g0Var.setListener(new android.support.v4.media.c(this, 26));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f12991e = frameLayout;
        addView(frameLayout, mf.e(-1, -1, 119));
        pg.e eVar = new pg.e(context);
        this.h = eVar;
        eVar.setListener(new h0(0, this));
        frameLayout.addView(eVar, mf.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f12993n = frameLayout2;
        frameLayout.addView(frameLayout2, mf.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        k2.p1.t(textView, 1, 14.0f);
        textView.setBackground(org.telegram.ui.ActionBar.k6.h0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(bd.M0(2131752589, null));
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView, mf.e(-2, -1, 115));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f12685b;

            {
                this.f12685b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((fa) this.f12685b).F.k0(-1, false, true);
                        return;
                    case 1:
                        j0 j0Var = this.f12685b;
                        j0Var.f12992f.l(true);
                        pg.e eVar2 = j0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        j0Var.d.invalidate();
                        return;
                    default:
                        j0 j0Var2 = this.f12685b;
                        f7 f7Var = j0Var2.f12998y;
                        if (f7Var != null) {
                            f7Var.m0 = new re();
                            j0Var2.f12992f.b(j0Var2.f12998y.m0);
                            f7 f7Var2 = j0Var2.f12998y;
                            f7Var2.m0.f25125z = f7Var2.Q;
                        }
                        ((fa) j0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setBackground(org.telegram.ui.ActionBar.k6.h0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(bd.M0(2131751697, null));
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView2, mf.e(-2, -1, 113));
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f12685b;

            {
                this.f12685b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((fa) this.f12685b).F.k0(-1, false, true);
                        return;
                    case 1:
                        j0 j0Var = this.f12685b;
                        j0Var.f12992f.l(true);
                        pg.e eVar2 = j0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        j0Var.d.invalidate();
                        return;
                    default:
                        j0 j0Var2 = this.f12685b;
                        f7 f7Var = j0Var2.f12998y;
                        if (f7Var != null) {
                            f7Var.m0 = new re();
                            j0Var2.f12992f.b(j0Var2.f12998y.m0);
                            f7 f7Var2 = j0Var2.f12998y;
                            f7Var2.m0.f25125z = f7Var2.Q;
                        }
                        ((fa) j0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setBackground(org.telegram.ui.ActionBar.k6.h0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(bd.M0(2131744698, null));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView3, mf.e(-2, -1, 117));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final j0 f12685b;

            {
                this.f12685b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ((fa) this.f12685b).F.k0(-1, false, true);
                        return;
                    case 1:
                        j0 j0Var = this.f12685b;
                        j0Var.f12992f.l(true);
                        pg.e eVar2 = j0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        j0Var.d.invalidate();
                        return;
                    default:
                        j0 j0Var2 = this.f12685b;
                        f7 f7Var = j0Var2.f12998y;
                        if (f7Var != null) {
                            f7Var.m0 = new re();
                            j0Var2.f12992f.b(j0Var2.f12998y.m0);
                            f7 f7Var2 = j0Var2.f12998y;
                            f7Var2.m0.f25125z = f7Var2.Q;
                        }
                        ((fa) j0Var2).F.k0(-1, false, true);
                        return;
                }
            }
        });
    }

    public int getCurrentHeight() {
        f7 f7Var = this.f12998y;
        if (f7Var == null) {
            return 1;
        }
        int i3 = f7Var.Q;
        y5 y5Var = this.f12988a;
        if (i3 != 90 && i3 != 270) {
            return y5Var.getContentHeight();
        }
        return y5Var.getContentWidth();
    }

    public int getCurrentWidth() {
        f7 f7Var = this.f12998y;
        if (f7Var == null) {
            return 1;
        }
        int i3 = f7Var.Q;
        y5 y5Var = this.f12988a;
        if (i3 != 90 && i3 != 270) {
            return y5Var.getContentWidth();
        }
        return y5Var.getContentHeight();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.f12994r;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        this.f12992f.setBottomPadding(org.telegram.messenger.g0.L(116.0f) + this.f12991e.getPaddingBottom());
        super.onLayout(z10, i3, i10, i11, i12);
    }

    public void setAppearProgress(float f10) {
        if (Math.abs(this.f12994r - f10) < 0.001f) {
            return;
        }
        this.f12994r = f10;
        i0 i0Var = this.d;
        i0Var.setAlpha(f10);
        i0Var.invalidate();
        g0 g0Var = this.f12992f;
        CropAreaView cropAreaView = g0Var.f53511a;
        CropAreaView cropAreaView2 = g0Var.f53511a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
        this.f12988a.invalidate();
    }

    public void setEntry(f7 f7Var) {
        pg.f fVar;
        boolean z10;
        if (f7Var == null) {
            return;
        }
        this.f12998y = f7Var;
        this.E = false;
        g0 g0Var = this.f12992f;
        g0Var.K = true;
        getLocationOnScreen(this.f12995s);
        int[] iArr = this.f12996w;
        y5 y5Var = this.f12988a;
        y5Var.getLocationOnScreen(iArr);
        re reVar = f7Var.m0;
        if (reVar == null) {
            reVar = null;
        }
        g0Var.p(f7Var.Q, this.f12997x, reVar);
        float rotation = g0Var.getRotation();
        pg.e eVar = this.h;
        eVar.setRotation(rotation);
        org.telegram.ui.Components.u5 u5Var = this.f12989b;
        if (reVar != null) {
            eVar.b(reVar.d);
            if (reVar.f25117k != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            eVar.setRotated(z10);
            eVar.setMirrored(reVar.f25118l);
            u5Var.f(reVar.f25118l, false);
        } else {
            eVar.b(0.0f);
            eVar.setRotated(false);
            eVar.setMirrored(false);
            u5Var.getClass();
            u5Var.e(false, 0.0f);
        }
        g0Var.r(false);
        this.f12990c.e(true, fVar.f53477i);
        i0 i0Var = this.d;
        i0Var.setVisibility(0);
        i0Var.invalidate();
        y5Var.setCropEditorDrawing(this);
    }
}

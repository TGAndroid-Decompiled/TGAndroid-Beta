package fg;

import ag.f3;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.tz;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.LaunchActivity;
import w7.u;
public final class l extends FrameLayout implements us {
    public tk0 D;
    public ArrayList E;
    public int F;
    public i f7085a;
    public eq f7086b;
    public o1.j f7087c;
    public o1.j d;
    public SharedPreferences e;
    public boolean f7088f;
    public boolean h;
    public boolean f7089n;
    public e f7090r;
    public boolean f7091s;
    public int f7092w;
    public LinearLayout f7093x;
    public TextView f7094y;

    public static float a(DisplayMetrics displayMetrics, float f7) {
        return u.a(f7, i0.L(16.0f), displayMetrics.widthPixels - i0.L(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f7) {
        return u.a(f7, i0.L(16.0f), displayMetrics.heightPixels - i0.L(72.0f));
    }

    private List<a> getBuiltInDebugItems() {
        int i10;
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("Theme"));
        arrayList.add(new a("Draw action bar shadow", new f3(1)));
        arrayList.add(new a("Show blur settings", new e(this, 0)));
        arrayList.add(new a(cd.L0(2131751648, null)));
        if (tz.J0) {
            i10 = 2131751639;
        } else {
            i10 = 2131751631;
        }
        arrayList.add(new a(cd.L0(i10, null), new e(this, 1)));
        if (t6.I.q()) {
            str = "Switch to day theme";
        } else {
            str = "Switch to dark theme";
        }
        arrayList.add(new a(str, new f3(2)));
        arrayList.add(new a(cd.L0(2131751614, null), new e(this, 2)));
        return arrayList;
    }

    public final void c(final boolean z10) {
        float f7;
        i iVar = this.f7085a;
        ArrayList arrayList = this.E;
        if (this.f7091s == z10) {
            return;
        }
        this.f7091s = z10;
        if (z10) {
            this.f7093x.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                z4 M = ((LaunchActivity) getContext()).M();
                if (M instanceof b) {
                    arrayList.addAll(((b) M).F());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).f33381s0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.F());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).f33379r0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.F());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.D.getAdapter().f();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z10) {
            this.f7092w = window.getStatusBarColor();
        }
        final float translationX = iVar.getTranslationX();
        final float translationY = iVar.getTranslationY();
        float f10 = 0.0f;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1000.0f;
        }
        o1.j jVar = new o1.j(new o1.i(f7));
        o1.k p5 = f1.p(1000.0f, 900.0f, 1.0f);
        if (z10) {
            f10 = 1000.0f;
        }
        p5.f13964i = f10;
        jVar.f13957m = p5;
        jVar.b(new o1.g() {
            @Override
            public final void a(o1.j jVar2, float f11, float f12) {
                float f13 = f11 / 1000.0f;
                l lVar = l.this;
                LinearLayout linearLayout = lVar.f7093x;
                linearLayout.setAlpha(f13);
                float f14 = translationX;
                linearLayout.setTranslationX(i0.T1(f14 - i0.L(8.0f), 0.0f, f13));
                float f15 = translationY;
                linearLayout.setTranslationY(i0.T1(f15 - i0.L(8.0f), 0.0f, f13));
                i iVar2 = lVar.f7085a;
                linearLayout.setPivotX(iVar2.getTranslationX() + i0.L(28.0f));
                linearLayout.setPivotY(iVar2.getTranslationY() + i0.L(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(i0.T1(iVar2.getWidth() / linearLayout.getWidth(), 1.0f, f13));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(i0.T1(iVar2.getHeight() / linearLayout.getHeight(), 1.0f, f13));
                }
                iVar2.setTranslationX(i0.T1(f14, (lVar.getWidth() / 2.0f) - i0.L(28.0f), f13));
                iVar2.setTranslationY(i0.T1(f15, (lVar.getHeight() / 2.0f) - i0.L(28.0f), f13));
                iVar2.setAlpha(1.0f - f13);
                window.setStatusBarColor(i0.b.f(f13, lVar.f7092w, 2046820352));
                lVar.invalidate();
            }
        });
        jVar.a(new o1.f() {
            @Override
            public final void a(o1.j jVar2, boolean z11, float f11, float f12) {
                l lVar = l.this;
                i iVar2 = lVar.f7085a;
                iVar2.setTranslationX(translationX);
                iVar2.setTranslationY(translationY);
                if (!z10) {
                    lVar.f7093x.setVisibility(8);
                }
            }
        });
        jVar.h();
    }

    public final void d() {
        y j02 = t6.j0(i0.L(56.0f), t6.x0(null, t6.P9, false), t6.x0(null, t6.Q9, false));
        Drawable mutate = getResources().getDrawable(2131231197).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        eq eqVar = new eq(mutate, j02, 0, 0);
        int L = i0.L(56.0f);
        int L2 = i0.L(56.0f);
        eqVar.e = L;
        eqVar.f25842f = L2;
        this.f7086b = eqVar;
        Drawable drawable = getResources().getDrawable(2131232563);
        a7.y(this, drawable, t6.f21001h5, null, mode);
        this.f7093x.setBackground(drawable);
        a7.V(this.f7094y, t6.f21037j5, null);
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.f19657n4) {
            d();
            this.D.getAdapter().f();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        LinearLayout linearLayout = this.f7093x;
        if (view == linearLayout) {
            canvas.drawColor(Color.argb((int) (linearLayout.getAlpha() * 122.0f), 0, 0, 0));
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        float a2;
        float b10;
        super.onAttachedToWindow();
        SharedPreferences sharedPreferences = this.e;
        float f7 = sharedPreferences.getFloat("x", -1.0f);
        float f10 = sharedPreferences.getFloat("y", -1.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        i iVar = this.f7085a;
        if (f7 != -1.0f && f7 < displayMetrics.widthPixels / 2.0f) {
            a2 = a(displayMetrics, -2.1474836E9f);
        } else {
            a2 = a(displayMetrics, 2.1474836E9f);
        }
        iVar.setTranslationX(a2);
        if (f10 == -1.0f) {
            b10 = b(displayMetrics, 2.1474836E9f);
        } else {
            b10 = b(displayMetrics, f10);
        }
        iVar.setTranslationY(b10);
        o1.j jVar = new o1.j(iVar, o1.j.f13941o, iVar.getTranslationX());
        o1.k kVar = new o1.k(iVar.getTranslationX());
        kVar.b(650.0f);
        kVar.a(0.75f);
        jVar.f13957m = kVar;
        this.f7087c = jVar;
        o1.j jVar2 = new o1.j(iVar, o1.j.f13942p, iVar.getTranslationY());
        o1.k kVar2 = new o1.k(iVar.getTranslationY());
        kVar2.b(650.0f);
        kVar2.a(0.75f);
        jVar2.f13957m = kVar2;
        this.d = jVar2;
        zs.e().c(this, zs.f19657n4);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f7;
        super.onConfigurationChanged(configuration);
        this.f7087c.d();
        this.d.d();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        i iVar = this.f7085a;
        if (iVar.getTranslationX() >= displayMetrics.widthPixels / 2.0f) {
            f7 = 2.1474836E9f;
        } else {
            f7 = -2.1474836E9f;
        }
        iVar.setTranslationX(a(displayMetrics, f7));
        iVar.setTranslationY(b(displayMetrics, iVar.getTranslationY()));
        this.f7087c.f13957m.f13964i = iVar.getTranslationX();
        this.d.f13957m.f13964i = iVar.getTranslationY();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7087c.d();
        this.d.d();
        zs.e().n(this, zs.f19657n4);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        i iVar = this.f7085a;
        canvas.translate(iVar.getTranslationX(), iVar.getTranslationY());
        canvas.scale(iVar.getScaleX(), iVar.getScaleY(), iVar.getPivotX(), iVar.getPivotY());
        this.f7086b.setAlpha((int) (iVar.getAlpha() * 255.0f));
        this.f7086b.setBounds(iVar.getLeft(), iVar.getTop(), iVar.getRight(), iVar.getBottom());
        this.f7086b.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f7091s;
    }
}

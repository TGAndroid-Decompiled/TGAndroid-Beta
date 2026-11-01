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
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.messenger.uz;
import org.telegram.messenger.vs;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.LaunchActivity;
import w7.u;
public final class l extends FrameLayout implements vs {
    public uk0 D;
    public ArrayList E;
    public int F;
    public i f7086a;
    public eq f7087b;
    public o1.j f7088c;
    public o1.j d;
    public SharedPreferences e;
    public boolean f7089f;
    public boolean h;
    public boolean f7090n;
    public e f7091r;
    public boolean f7092s;
    public int f7093w;
    public LinearLayout f7094x;
    public TextView f7095y;

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
        arrayList.add(new a(dd.L0(2131751648, null)));
        if (uz.J0) {
            i10 = 2131751639;
        } else {
            i10 = 2131751631;
        }
        arrayList.add(new a(dd.L0(i10, null), new e(this, 1)));
        if (t6.I.q()) {
            str = "Switch to day theme";
        } else {
            str = "Switch to dark theme";
        }
        arrayList.add(new a(str, new f3(2)));
        arrayList.add(new a(dd.L0(2131751614, null), new e(this, 2)));
        return arrayList;
    }

    public final void c(final boolean z10) {
        float f7;
        i iVar = this.f7086a;
        ArrayList arrayList = this.E;
        if (this.f7092s == z10) {
            return;
        }
        this.f7092s = z10;
        if (z10) {
            this.f7094x.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                z4 M = ((LaunchActivity) getContext()).M();
                if (M instanceof b) {
                    arrayList.addAll(((b) M).G());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).f33388s0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.G());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).f33386r0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.G());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.D.getAdapter().f();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z10) {
            this.f7093w = window.getStatusBarColor();
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
        p5.f13965i = f10;
        jVar.f13958m = p5;
        jVar.b(new o1.g() {
            @Override
            public final void a(o1.j jVar2, float f11, float f12) {
                float f13 = f11 / 1000.0f;
                l lVar = l.this;
                LinearLayout linearLayout = lVar.f7094x;
                linearLayout.setAlpha(f13);
                float f14 = translationX;
                linearLayout.setTranslationX(i0.T1(f14 - i0.L(8.0f), 0.0f, f13));
                float f15 = translationY;
                linearLayout.setTranslationY(i0.T1(f15 - i0.L(8.0f), 0.0f, f13));
                i iVar2 = lVar.f7086a;
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
                window.setStatusBarColor(i0.b.f(f13, lVar.f7093w, 2046820352));
                lVar.invalidate();
            }
        });
        jVar.a(new o1.f() {
            @Override
            public final void a(o1.j jVar2, boolean z11, float f11, float f12) {
                l lVar = l.this;
                i iVar2 = lVar.f7086a;
                iVar2.setTranslationX(translationX);
                iVar2.setTranslationY(translationY);
                if (!z10) {
                    lVar.f7094x.setVisibility(8);
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
        eqVar.f25904f = L2;
        this.f7087b = eqVar;
        Drawable drawable = getResources().getDrawable(2131232563);
        a7.y(this, drawable, t6.f21002h5, null, mode);
        this.f7094x.setBackground(drawable);
        a7.V(this.f7095y, t6.f21038j5, null);
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.f14753n4) {
            d();
            this.D.getAdapter().f();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        LinearLayout linearLayout = this.f7094x;
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
        i iVar = this.f7086a;
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
        o1.j jVar = new o1.j(iVar, o1.j.f13942o, iVar.getTranslationX());
        o1.k kVar = new o1.k(iVar.getTranslationX());
        kVar.b(650.0f);
        kVar.a(0.75f);
        jVar.f13958m = kVar;
        this.f7088c = jVar;
        o1.j jVar2 = new o1.j(iVar, o1.j.f13943p, iVar.getTranslationY());
        o1.k kVar2 = new o1.k(iVar.getTranslationY());
        kVar2.b(650.0f);
        kVar2.a(0.75f);
        jVar2.f13958m = kVar2;
        this.d = jVar2;
        at.e().c(this, at.f14753n4);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f7;
        super.onConfigurationChanged(configuration);
        this.f7088c.d();
        this.d.d();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        i iVar = this.f7086a;
        if (iVar.getTranslationX() >= displayMetrics.widthPixels / 2.0f) {
            f7 = 2.1474836E9f;
        } else {
            f7 = -2.1474836E9f;
        }
        iVar.setTranslationX(a(displayMetrics, f7));
        iVar.setTranslationY(b(displayMetrics, iVar.getTranslationY()));
        this.f7088c.f13958m.f13965i = iVar.getTranslationX();
        this.d.f13958m.f13965i = iVar.getTranslationY();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7088c.d();
        this.d.d();
        at.e().n(this, at.f14753n4);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        i iVar = this.f7086a;
        canvas.translate(iVar.getTranslationX(), iVar.getTranslationY());
        canvas.scale(iVar.getScaleX(), iVar.getScaleY(), iVar.getPivotX(), iVar.getPivotY());
        this.f7087b.setAlpha((int) (iVar.getAlpha() * 255.0f));
        this.f7087b.setBounds(iVar.getLeft(), iVar.getTop(), iVar.getRight(), iVar.getBottom());
        this.f7087b.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f7092s;
    }
}

package defpackage;

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
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
public final class ll4 extends FrameLayout implements fn7 {
    public d79 E;
    public ArrayList F;
    public int G;
    public tt a;
    public zm2 b;
    public vpa c;
    public vpa d;
    public SharedPreferences e;
    public boolean f;
    public boolean h;
    public boolean n;
    public gl4 r;
    public boolean s;
    public int w;
    public LinearLayout x;
    public TextView y;

    public static float a(DisplayMetrics displayMetrics, float f) {
        return ete.a(f, hl.L(16.0f), displayMetrics.widthPixels - hl.L(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f) {
        return ete.a(f, hl.L(16.0f), displayMetrics.heightPixels - hl.L(72.0f));
    }

    private List<dl4> getBuiltInDebugItems() {
        int i;
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new dl4("Theme"));
        arrayList.add(new dl4("Draw action bar shadow", new jm3((byte) 7)));
        arrayList.add(new dl4("Show blur settings", new gl4(this, (byte) 0)));
        arrayList.add(new dl4(ob6.M0(2131751612, null)));
        if (xea.F0) {
            i = 2131751603;
        } else {
            i = 2131751595;
        }
        arrayList.add(new dl4(ob6.M0(i, null), new gl4(this, (byte) 1)));
        if (aob.I.o()) {
            str = "Switch to day theme";
        } else {
            str = "Switch to dark theme";
        }
        arrayList.add(new dl4(str, new jm3((byte) 8)));
        arrayList.add(new dl4(ob6.M0(2131751578, null), new gl4(this, (byte) 2)));
        return arrayList;
    }

    public final void c(final boolean z) {
        float f;
        tt ttVar = this.a;
        ArrayList arrayList = this.F;
        if (this.s == z) {
            return;
        }
        this.s = z;
        if (z) {
            this.x.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                wk5 N = ((LaunchActivity) getContext()).N();
                if (N instanceof el4) {
                    arrayList.addAll(((el4) N).D());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).r0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.D());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).q0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.D());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.E.getAdapter().f();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z) {
            this.w = window.getStatusBarColor();
        }
        final float translationX = ttVar.getTranslationX();
        final float translationY = ttVar.getTranslationY();
        float f2 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1000.0f;
        }
        vpa vpaVar = new vpa(new xk4(f));
        wpa j = bp1.j(1000.0f, 900.0f, 1.0f);
        if (z) {
            f2 = 1000.0f;
        }
        j.i = f2;
        vpaVar.m = j;
        vpaVar.b(new qs3() {
            @Override
            public final void a(vpa vpaVar2, float f3, float f4) {
                float f5 = f3 / 1000.0f;
                ll4 ll4Var = ll4.this;
                LinearLayout linearLayout = ll4Var.x;
                linearLayout.setAlpha(f5);
                float f6 = translationX;
                linearLayout.setTranslationX(hl.R1(f6 - hl.L(8.0f), 0.0f, f5));
                float f7 = translationY;
                linearLayout.setTranslationY(hl.R1(f7 - hl.L(8.0f), 0.0f, f5));
                tt ttVar2 = ll4Var.a;
                linearLayout.setPivotX(ttVar2.getTranslationX() + hl.L(28.0f));
                linearLayout.setPivotY(ttVar2.getTranslationY() + hl.L(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(hl.R1(ttVar2.getWidth() / linearLayout.getWidth(), 1.0f, f5));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(hl.R1(ttVar2.getHeight() / linearLayout.getHeight(), 1.0f, f5));
                }
                ttVar2.setTranslationX(hl.R1(f6, (ll4Var.getWidth() / 2.0f) - hl.L(28.0f), f5));
                ttVar2.setTranslationY(hl.R1(f7, (ll4Var.getHeight() / 2.0f) - hl.L(28.0f), f5));
                ttVar2.setAlpha(1.0f - f5);
                window.setStatusBarColor(vm2.f(f5, ll4Var.w, 2046820352));
                ll4Var.invalidate();
            }
        });
        vpaVar.a(new ps3() {
            @Override
            public final void a(vpa vpaVar2, boolean z2, float f3, float f4) {
                ll4 ll4Var = ll4.this;
                tt ttVar2 = ll4Var.a;
                ttVar2.setTranslationX(translationX);
                ttVar2.setTranslationY(translationY);
                if (!z) {
                    ll4Var.x.setVisibility(8);
                }
            }
        });
        vpaVar.h();
    }

    public final void d() {
        hf0 h0 = aob.h0(hl.L(56.0f), aob.w0(null, aob.P9, false), aob.w0(null, aob.Q9, false));
        Drawable mutate = getResources().getDrawable(2131231200).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        zm2 zm2Var = new zm2(mutate, h0, 0, 0);
        int L = hl.L(56.0f);
        int L2 = hl.L(56.0f);
        zm2Var.e = L;
        zm2Var.f = L2;
        this.b = zm2Var;
        Drawable drawable = getResources().getDrawable(2131232582);
        yob.x(this, drawable, aob.h5, null, mode);
        this.x.setBackground(drawable);
        yob.X(this.y, aob.j5, null);
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.q4) {
            d();
            this.E.getAdapter().f();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        LinearLayout linearLayout = this.x;
        if (view == linearLayout) {
            canvas.drawColor(Color.argb((int) (linearLayout.getAlpha() * 122.0f), 0, 0, 0));
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void onAttachedToWindow() {
        float a;
        float b;
        super.onAttachedToWindow();
        SharedPreferences sharedPreferences = this.e;
        float f = sharedPreferences.getFloat("x", -1.0f);
        float f2 = sharedPreferences.getFloat("y", -1.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        tt ttVar = this.a;
        if (f != -1.0f && f < displayMetrics.widthPixels / 2.0f) {
            a = a(displayMetrics, -2.1474836E9f);
        } else {
            a = a(displayMetrics, 2.1474836E9f);
        }
        ttVar.setTranslationX(a);
        if (f2 == -1.0f) {
            b = b(displayMetrics, 2.1474836E9f);
        } else {
            b = b(displayMetrics, f2);
        }
        ttVar.setTranslationY(b);
        vpa vpaVar = new vpa(ttVar, vpa.o, ttVar.getTranslationX());
        wpa wpaVar = new wpa(ttVar.getTranslationX());
        wpaVar.b(650.0f);
        wpaVar.a(0.75f);
        vpaVar.m = wpaVar;
        this.c = vpaVar;
        vpa vpaVar2 = new vpa(ttVar, vpa.p, ttVar.getTranslationY());
        wpa wpaVar2 = new wpa(ttVar.getTranslationY());
        wpaVar2.b(650.0f);
        wpaVar2.a(0.75f);
        vpaVar2.m = wpaVar2;
        this.d = vpaVar2;
        jn7.e().b(this, jn7.q4);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f;
        super.onConfigurationChanged(configuration);
        this.c.d();
        this.d.d();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        tt ttVar = this.a;
        if (ttVar.getTranslationX() >= displayMetrics.widthPixels / 2.0f) {
            f = 2.1474836E9f;
        } else {
            f = -2.1474836E9f;
        }
        ttVar.setTranslationX(a(displayMetrics, f));
        ttVar.setTranslationY(b(displayMetrics, ttVar.getTranslationY()));
        this.c.m.i = ttVar.getTranslationX();
        this.d.m.i = ttVar.getTranslationY();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.d();
        this.d.d();
        jn7.e().n(this, jn7.q4);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        tt ttVar = this.a;
        canvas.translate(ttVar.getTranslationX(), ttVar.getTranslationY());
        canvas.scale(ttVar.getScaleX(), ttVar.getScaleY(), ttVar.getPivotX(), ttVar.getPivotY());
        this.b.setAlpha((int) (ttVar.getAlpha() * 255.0f));
        this.b.setBounds(ttVar.getLeft(), ttVar.getTop(), ttVar.getRight(), ttVar.getBottom());
        this.b.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.s;
    }
}

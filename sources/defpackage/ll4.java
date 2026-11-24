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
public final class ll4 extends FrameLayout implements jm7 {
    public r59 E;
    public ArrayList F;
    public int G;
    public su a;
    public sn2 b;
    public zna c;
    public zna d;
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
        return pqe.a(f, gm.L(16.0f), displayMetrics.widthPixels - gm.L(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f) {
        return pqe.a(f, gm.L(16.0f), displayMetrics.heightPixels - gm.L(72.0f));
    }

    private List<dl4> getBuiltInDebugItems() {
        int i;
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new dl4("Theme"));
        arrayList.add(new dl4("Draw action bar shadow", new bn3((byte) 5)));
        arrayList.add(new dl4("Show blur settings", new gl4(this, (byte) 0)));
        arrayList.add(new dl4(jb6.M0(2131751584, null)));
        if (gda.F0) {
            i = 2131751575;
        } else {
            i = 2131751567;
        }
        arrayList.add(new dl4(jb6.M0(i, null), new gl4(this, (byte) 1)));
        if (cmb.I.o()) {
            str = "Switch to day theme";
        } else {
            str = "Switch to dark theme";
        }
        arrayList.add(new dl4(str, new bn3((byte) 6)));
        arrayList.add(new dl4(jb6.M0(2131751550, null), new gl4(this, (byte) 2)));
        return arrayList;
    }

    public final void c(final boolean z) {
        float f;
        su suVar = this.a;
        ArrayList arrayList = this.F;
        if (this.s == z) {
            return;
        }
        this.s = z;
        if (z) {
            this.x.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                tk5 N = ((LaunchActivity) getContext()).N();
                if (N instanceof el4) {
                    arrayList.addAll(((el4) N).C());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).r0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.C());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).q0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.C());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.E.getAdapter().f();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z) {
            this.w = window.getStatusBarColor();
        }
        final float translationX = suVar.getTranslationX();
        final float translationY = suVar.getTranslationY();
        float f2 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1000.0f;
        }
        zna znaVar = new zna(new xk4(f));
        aoa j = aq1.j(1000.0f, 900.0f, 1.0f);
        if (z) {
            f2 = 1000.0f;
        }
        j.i = f2;
        znaVar.m = j;
        znaVar.b(new it3() {
            @Override
            public final void a(zna znaVar2, float f3, float f4) {
                float f5 = f3 / 1000.0f;
                ll4 ll4Var = ll4.this;
                LinearLayout linearLayout = ll4Var.x;
                linearLayout.setAlpha(f5);
                float f6 = translationX;
                linearLayout.setTranslationX(gm.R1(f6 - gm.L(8.0f), 0.0f, f5));
                float f7 = translationY;
                linearLayout.setTranslationY(gm.R1(f7 - gm.L(8.0f), 0.0f, f5));
                su suVar2 = ll4Var.a;
                linearLayout.setPivotX(suVar2.getTranslationX() + gm.L(28.0f));
                linearLayout.setPivotY(suVar2.getTranslationY() + gm.L(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(gm.R1(suVar2.getWidth() / linearLayout.getWidth(), 1.0f, f5));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(gm.R1(suVar2.getHeight() / linearLayout.getHeight(), 1.0f, f5));
                }
                suVar2.setTranslationX(gm.R1(f6, (ll4Var.getWidth() / 2.0f) - gm.L(28.0f), f5));
                suVar2.setTranslationY(gm.R1(f7, (ll4Var.getHeight() / 2.0f) - gm.L(28.0f), f5));
                suVar2.setAlpha(1.0f - f5);
                window.setStatusBarColor(on2.f(f5, ll4Var.w, 2046820352));
                ll4Var.invalidate();
            }
        });
        znaVar.a(new ht3() {
            @Override
            public final void a(zna znaVar2, boolean z2, float f3, float f4) {
                ll4 ll4Var = ll4.this;
                su suVar2 = ll4Var.a;
                suVar2.setTranslationX(translationX);
                suVar2.setTranslationY(translationY);
                if (!z) {
                    ll4Var.x.setVisibility(8);
                }
            }
        });
        znaVar.h();
    }

    public final void d() {
        fg0 h0 = cmb.h0(gm.L(56.0f), cmb.w0(null, cmb.O9, false), cmb.w0(null, cmb.P9, false));
        Drawable mutate = getResources().getDrawable(2131231201).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        sn2 sn2Var = new sn2(mutate, h0, 0, 0);
        int L = gm.L(56.0f);
        int L2 = gm.L(56.0f);
        sn2Var.e = L;
        sn2Var.f = L2;
        this.b = sn2Var;
        Drawable drawable = getResources().getDrawable(2131232583);
        anb.x(this, drawable, cmb.g5, null, mode);
        this.x.setBackground(drawable);
        anb.X(this.y, cmb.i5, null);
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.r4) {
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
        su suVar = this.a;
        if (f != -1.0f && f < displayMetrics.widthPixels / 2.0f) {
            a = a(displayMetrics, -2.1474836E9f);
        } else {
            a = a(displayMetrics, 2.1474836E9f);
        }
        suVar.setTranslationX(a);
        if (f2 == -1.0f) {
            b = b(displayMetrics, 2.1474836E9f);
        } else {
            b = b(displayMetrics, f2);
        }
        suVar.setTranslationY(b);
        zna znaVar = new zna(suVar, zna.o, suVar.getTranslationX());
        aoa aoaVar = new aoa(suVar.getTranslationX());
        aoaVar.b(650.0f);
        aoaVar.a(0.75f);
        znaVar.m = aoaVar;
        this.c = znaVar;
        zna znaVar2 = new zna(suVar, zna.p, suVar.getTranslationY());
        aoa aoaVar2 = new aoa(suVar.getTranslationY());
        aoaVar2.b(650.0f);
        aoaVar2.a(0.75f);
        znaVar2.m = aoaVar2;
        this.d = znaVar2;
        nm7.e().b(this, nm7.r4);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f;
        super.onConfigurationChanged(configuration);
        this.c.d();
        this.d.d();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        su suVar = this.a;
        if (suVar.getTranslationX() >= displayMetrics.widthPixels / 2.0f) {
            f = 2.1474836E9f;
        } else {
            f = -2.1474836E9f;
        }
        suVar.setTranslationX(a(displayMetrics, f));
        suVar.setTranslationY(b(displayMetrics, suVar.getTranslationY()));
        this.c.m.i = suVar.getTranslationX();
        this.d.m.i = suVar.getTranslationY();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.d();
        this.d.d();
        nm7.e().n(this, nm7.r4);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        su suVar = this.a;
        canvas.translate(suVar.getTranslationX(), suVar.getTranslationY());
        canvas.scale(suVar.getScaleX(), suVar.getScaleY(), suVar.getPivotX(), suVar.getPivotY());
        this.b.setAlpha((int) (suVar.getAlpha() * 255.0f));
        this.b.setBounds(suVar.getLeft(), suVar.getTop(), suVar.getRight(), suVar.getBottom());
        this.b.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.s;
    }
}

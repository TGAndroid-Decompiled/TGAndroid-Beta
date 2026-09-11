package ng;

import ah.j;
import ah.w;
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
import o1.k;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.LaunchActivity;
import w7.p;
public final class i extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public ArrayList E;
    public int F;
    public w f16743a;
    public oq f16744b;
    public k f16745c;
    public k d;
    public SharedPreferences f16746e;
    public boolean f16747f;
    public boolean h;
    public boolean f16748n;
    public c f16749r;
    public boolean f16750s;
    public int v;
    public LinearLayout f16751w;
    public TextView f16752x;
    public ll0 f16753y;

    public static float a(DisplayMetrics displayMetrics, float f7) {
        return p.a(f7, AndroidUtilities.dp(16.0f), displayMetrics.widthPixels - AndroidUtilities.dp(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f7) {
        return p.a(f7, AndroidUtilities.dp(16.0f), displayMetrics.heightPixels - AndroidUtilities.dp(72.0f));
    }

    private List<a> getBuiltInDebugItems() {
        int i10;
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("Theme"));
        arrayList.add(new a("Draw action bar shadow", new j(15)));
        arrayList.add(new a("Show blur settings", new c(this, 0)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugGeneral)));
        if (SharedConfig.debugWebView) {
            i10 = R.string.DebugMenuDisableWebViewDebug;
        } else {
            i10 = R.string.DebugMenuEnableWebViewDebug;
        }
        arrayList.add(new a(LocaleController.getString(i10), new c(this, 1)));
        if (j6.I.q()) {
            str = "Switch to day theme";
        } else {
            str = "Switch to dark theme";
        }
        arrayList.add(new a(str, new j(16)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugSendLogs), new c(this, 2)));
        return arrayList;
    }

    public final void c(final boolean z10) {
        float f7;
        w wVar = this.f16743a;
        ArrayList arrayList = this.E;
        if (this.f16750s == z10) {
            return;
        }
        this.f16750s = z10;
        if (z10) {
            this.f16751w.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                d5 O = ((LaunchActivity) getContext()).O();
                if (O instanceof b) {
                    arrayList.addAll(((b) O).A());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).f33457s0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.A());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).f33455r0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.A());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.f16753y.getAdapter().l();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z10) {
            this.v = window.getStatusBarColor();
        }
        final float translationX = wVar.getTranslationX();
        final float translationY = wVar.getTranslationY();
        float f10 = 0.0f;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1000.0f;
        }
        k kVar = new k(new o1.j(f7));
        l l4 = p6.l(1000.0f, 900.0f, 1.0f);
        if (z10) {
            f10 = 1000.0f;
        }
        l4.f16832i = f10;
        kVar.f16825u = l4;
        kVar.b(new o1.g() {
            @Override
            public final void a(o1.h hVar, float f11, float f12) {
                float f13 = f11 / 1000.0f;
                i iVar = i.this;
                LinearLayout linearLayout = iVar.f16751w;
                linearLayout.setAlpha(f13);
                float f14 = translationX;
                linearLayout.setTranslationX(AndroidUtilities.lerp(f14 - AndroidUtilities.dp(8.0f), 0.0f, f13));
                float f15 = translationY;
                linearLayout.setTranslationY(AndroidUtilities.lerp(f15 - AndroidUtilities.dp(8.0f), 0.0f, f13));
                w wVar2 = iVar.f16743a;
                linearLayout.setPivotX(wVar2.getTranslationX() + AndroidUtilities.dp(28.0f));
                linearLayout.setPivotY(wVar2.getTranslationY() + AndroidUtilities.dp(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(AndroidUtilities.lerp(wVar2.getWidth() / linearLayout.getWidth(), 1.0f, f13));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(AndroidUtilities.lerp(wVar2.getHeight() / linearLayout.getHeight(), 1.0f, f13));
                }
                wVar2.setTranslationX(AndroidUtilities.lerp(f14, (iVar.getWidth() / 2.0f) - AndroidUtilities.dp(28.0f), f13));
                wVar2.setTranslationY(AndroidUtilities.lerp(f15, (iVar.getHeight() / 2.0f) - AndroidUtilities.dp(28.0f), f13));
                wVar2.setAlpha(1.0f - f13);
                window.setStatusBarColor(i0.a.d(f13, iVar.v, 2046820352));
                iVar.invalidate();
            }
        });
        kVar.a(new o1.f() {
            @Override
            public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                i iVar = i.this;
                w wVar2 = iVar.f16743a;
                wVar2.setTranslationX(translationX);
                wVar2.setTranslationY(translationY);
                if (!z10) {
                    iVar.f16751w.setVisibility(8);
                }
            }
        });
        kVar.f();
    }

    public final void d() {
        z h02 = j6.h0(AndroidUtilities.dp(56.0f), j6.w0(null, j6.P9, false), j6.w0(null, j6.Q9, false));
        Drawable mutate = getResources().getDrawable(R.drawable.floating_shadow).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        oq oqVar = new oq(mutate, h02, 0, 0);
        int dp = AndroidUtilities.dp(56.0f);
        int dp2 = AndroidUtilities.dp(56.0f);
        oqVar.f29162e = dp;
        oqVar.f29163f = dp2;
        this.f16744b = oqVar;
        Drawable drawable = getResources().getDrawable(R.drawable.popup_fixed_alert3);
        drawable.setColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.f20734h5, false), mode));
        this.f16751w.setBackground(drawable);
        this.f16752x.setTextColor(j6.w0(null, j6.f20770j5, false));
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didSetNewTheme) {
            d();
            this.f16753y.getAdapter().l();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        LinearLayout linearLayout = this.f16751w;
        if (view == linearLayout) {
            canvas.drawColor(Color.argb((int) (linearLayout.getAlpha() * 122.0f), 0, 0, 0));
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        float a2;
        float b10;
        super.onAttachedToWindow();
        SharedPreferences sharedPreferences = this.f16746e;
        float f7 = sharedPreferences.getFloat("x", -1.0f);
        float f10 = sharedPreferences.getFloat("y", -1.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        w wVar = this.f16743a;
        if (f7 != -1.0f && f7 < displayMetrics.widthPixels / 2.0f) {
            a2 = a(displayMetrics, -2.1474836E9f);
        } else {
            a2 = a(displayMetrics, 2.1474836E9f);
        }
        wVar.setTranslationX(a2);
        if (f10 == -1.0f) {
            b10 = b(displayMetrics, 2.1474836E9f);
        } else {
            b10 = b(displayMetrics, f10);
        }
        wVar.setTranslationY(b10);
        k kVar = new k(wVar, o1.h.f16806m, wVar.getTranslationX());
        l lVar = new l(wVar.getTranslationX());
        lVar.b(650.0f);
        lVar.a(0.75f);
        kVar.f16825u = lVar;
        this.f16745c = kVar;
        k kVar2 = new k(wVar, o1.h.f16807n, wVar.getTranslationY());
        l lVar2 = new l(wVar.getTranslationY());
        lVar2.b(650.0f);
        lVar2.a(0.75f);
        kVar2.f16825u = lVar2;
        this.d = kVar2;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f7;
        super.onConfigurationChanged(configuration);
        this.f16745c.c();
        this.d.c();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        w wVar = this.f16743a;
        if (wVar.getTranslationX() >= displayMetrics.widthPixels / 2.0f) {
            f7 = 2.1474836E9f;
        } else {
            f7 = -2.1474836E9f;
        }
        wVar.setTranslationX(a(displayMetrics, f7));
        wVar.setTranslationY(b(displayMetrics, wVar.getTranslationY()));
        this.f16745c.f16825u.f16832i = wVar.getTranslationX();
        this.d.f16825u.f16832i = wVar.getTranslationY();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f16745c.c();
        this.d.c();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        w wVar = this.f16743a;
        canvas.translate(wVar.getTranslationX(), wVar.getTranslationY());
        canvas.scale(wVar.getScaleX(), wVar.getScaleY(), wVar.getPivotX(), wVar.getPivotY());
        this.f16744b.setAlpha((int) (wVar.getAlpha() * 255.0f));
        this.f16744b.setBounds(wVar.getLeft(), wVar.getTop(), wVar.getRight(), wVar.getBottom());
        this.f16744b.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f16750s;
    }
}

package ag;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yh;
public final class o extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public ArrayList B;
    public int C;
    public l f222a;
    public pq f223b;
    public o1.j f224c;
    public o1.j d;
    public SharedPreferences f225e;
    public boolean f226f;
    public boolean h;
    public boolean f227n;
    public g f228r;
    public boolean f229s;
    public int v;
    public LinearLayout f230w;
    public TextView f231x;
    public sl0 f232y;

    public static float a(DisplayMetrics displayMetrics, float f10) {
        return k7.o.a(f10, AndroidUtilities.dp(16.0f), displayMetrics.widthPixels - AndroidUtilities.dp(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f10) {
        return k7.o.a(f10, AndroidUtilities.dp(16.0f), displayMetrics.heightPixels - AndroidUtilities.dp(72.0f));
    }

    private List<a> getBuiltInDebugItems() {
        int i10;
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("Theme"));
        arrayList.add(new a("Draw action bar shadow", new f(0)));
        arrayList.add(new a("Show blur settings", new g(this, 0)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugGeneral)));
        if (SharedConfig.debugWebView) {
            i10 = R.string.DebugMenuDisableWebViewDebug;
        } else {
            i10 = R.string.DebugMenuEnableWebViewDebug;
        }
        arrayList.add(new a(LocaleController.getString(i10), new g(this, 1)));
        if (k6.I.q()) {
            str = "Switch to day theme";
        } else {
            str = "Switch to dark theme";
        }
        arrayList.add(new a(str, new f(1)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugSendLogs), new g(this, 2)));
        return arrayList;
    }

    public final void c(final boolean z4) {
        float f10;
        l lVar = this.f222a;
        ArrayList arrayList = this.B;
        if (this.f229s == z4) {
            return;
        }
        this.f229s = z4;
        if (z4) {
            this.f230w.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                f5 O = ((LaunchActivity) getContext()).O();
                if (O instanceof b) {
                    arrayList.addAll(((b) O).B());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).f34164p0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.B());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).f34162o0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.B());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.f232y.getAdapter().l();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z4) {
            this.v = window.getStatusBarColor();
        }
        final float translationX = lVar.getTranslationX();
        final float translationY = lVar.getTranslationY();
        float f11 = 0.0f;
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = 1000.0f;
        }
        o1.j jVar = new o1.j(new kb.a(f10));
        o1.k n10 = yh.n(1000.0f, 900.0f, 1.0f);
        if (z4) {
            f11 = 1000.0f;
        }
        n10.f16345i = f11;
        jVar.f16338u = n10;
        jVar.b(new o1.g() {
            @Override
            public final void a(o1.h hVar, float f12, float f13) {
                float f14 = f12 / 1000.0f;
                o oVar = o.this;
                LinearLayout linearLayout = oVar.f230w;
                linearLayout.setAlpha(f14);
                float f15 = translationX;
                linearLayout.setTranslationX(AndroidUtilities.lerp(f15 - AndroidUtilities.dp(8.0f), 0.0f, f14));
                float f16 = translationY;
                linearLayout.setTranslationY(AndroidUtilities.lerp(f16 - AndroidUtilities.dp(8.0f), 0.0f, f14));
                l lVar2 = oVar.f222a;
                linearLayout.setPivotX(lVar2.getTranslationX() + AndroidUtilities.dp(28.0f));
                linearLayout.setPivotY(lVar2.getTranslationY() + AndroidUtilities.dp(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(AndroidUtilities.lerp(lVar2.getWidth() / linearLayout.getWidth(), 1.0f, f14));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(AndroidUtilities.lerp(lVar2.getHeight() / linearLayout.getHeight(), 1.0f, f14));
                }
                lVar2.setTranslationX(AndroidUtilities.lerp(f15, (oVar.getWidth() / 2.0f) - AndroidUtilities.dp(28.0f), f14));
                lVar2.setTranslationY(AndroidUtilities.lerp(f16, (oVar.getHeight() / 2.0f) - AndroidUtilities.dp(28.0f), f14));
                lVar2.setAlpha(1.0f - f14);
                window.setStatusBarColor(i0.a.d(f14, oVar.v, 2046820352));
                oVar.invalidate();
            }
        });
        jVar.a(new o1.f() {
            @Override
            public final void a(o1.h hVar, boolean z10, float f12, float f13) {
                o oVar = o.this;
                l lVar2 = oVar.f222a;
                lVar2.setTranslationX(translationX);
                lVar2.setTranslationY(translationY);
                if (!z4) {
                    oVar.f230w.setVisibility(8);
                }
            }
        });
        jVar.f();
    }

    public final void d() {
        z h02 = k6.h0(AndroidUtilities.dp(56.0f), k6.w0(null, k6.P9, false), k6.w0(null, k6.Q9, false));
        Drawable mutate = getResources().getDrawable(R.drawable.floating_shadow).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        pq pqVar = new pq(mutate, h02, 0, 0);
        int dp = AndroidUtilities.dp(56.0f);
        int dp2 = AndroidUtilities.dp(56.0f);
        pqVar.f30161e = dp;
        pqVar.f30162f = dp2;
        this.f223b = pqVar;
        Drawable drawable = getResources().getDrawable(R.drawable.popup_fixed_alert3);
        drawable.setColorFilter(new PorterDuffColorFilter(k6.w0(null, k6.f21733h5, false), mode));
        this.f230w.setBackground(drawable);
        this.f231x.setTextColor(k6.w0(null, k6.f21768j5, false));
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didSetNewTheme) {
            d();
            this.f232y.getAdapter().l();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        LinearLayout linearLayout = this.f230w;
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
        SharedPreferences sharedPreferences = this.f225e;
        float f10 = sharedPreferences.getFloat("x", -1.0f);
        float f11 = sharedPreferences.getFloat("y", -1.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        l lVar = this.f222a;
        if (f10 != -1.0f && f10 < displayMetrics.widthPixels / 2.0f) {
            a2 = a(displayMetrics, -2.1474836E9f);
        } else {
            a2 = a(displayMetrics, 2.1474836E9f);
        }
        lVar.setTranslationX(a2);
        if (f11 == -1.0f) {
            b10 = b(displayMetrics, 2.1474836E9f);
        } else {
            b10 = b(displayMetrics, f11);
        }
        lVar.setTranslationY(b10);
        o1.j jVar = new o1.j(lVar, o1.h.f16320m, lVar.getTranslationX());
        o1.k kVar = new o1.k(lVar.getTranslationX());
        kVar.b(650.0f);
        kVar.a(0.75f);
        jVar.f16338u = kVar;
        this.f224c = jVar;
        o1.j jVar2 = new o1.j(lVar, o1.h.f16321n, lVar.getTranslationY());
        o1.k kVar2 = new o1.k(lVar.getTranslationY());
        kVar2.b(650.0f);
        kVar2.a(0.75f);
        jVar2.f16338u = kVar2;
        this.d = jVar2;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f10;
        super.onConfigurationChanged(configuration);
        this.f224c.c();
        this.d.c();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        l lVar = this.f222a;
        if (lVar.getTranslationX() >= displayMetrics.widthPixels / 2.0f) {
            f10 = 2.1474836E9f;
        } else {
            f10 = -2.1474836E9f;
        }
        lVar.setTranslationX(a(displayMetrics, f10));
        lVar.setTranslationY(b(displayMetrics, lVar.getTranslationY()));
        this.f224c.f16338u.f16345i = lVar.getTranslationX();
        this.d.f16338u.f16345i = lVar.getTranslationY();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f224c.c();
        this.d.c();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        l lVar = this.f222a;
        canvas.translate(lVar.getTranslationX(), lVar.getTranslationY());
        canvas.scale(lVar.getScaleX(), lVar.getScaleY(), lVar.getPivotX(), lVar.getPivotY());
        this.f223b.setAlpha((int) (lVar.getAlpha() * 255.0f));
        this.f223b.setBounds(lVar.getLeft(), lVar.getTop(), lVar.getRight(), lVar.getBottom());
        this.f223b.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f229s;
    }
}

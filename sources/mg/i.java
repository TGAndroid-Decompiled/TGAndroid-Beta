package mg;

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
import ci.m6;
import java.util.ArrayList;
import java.util.List;
import o1.j;
import o1.k;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.q3;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.qq;
import org.telegram.ui.LaunchActivity;
import w7.p;
public final class i extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public ArrayList E;
    public int F;
    public m6 f14799a;
    public qq f14800b;
    public k f14801c;
    public k d;
    public SharedPreferences e;
    public boolean f14802f;
    public boolean h;
    public boolean f14803n;
    public c f14804r;
    public boolean f14805s;
    public int v;
    public LinearLayout f14806w;
    public TextView f14807x;
    public ml0 f14808y;

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
        arrayList.add(new a("Draw action bar shadow", new ai.f(14)));
        arrayList.add(new a("Show blur settings", new c(this, 0)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugGeneral)));
        if (SharedConfig.debugWebView) {
            i10 = R.string.DebugMenuDisableWebViewDebug;
        } else {
            i10 = R.string.DebugMenuEnableWebViewDebug;
        }
        arrayList.add(new a(LocaleController.getString(i10), new c(this, 1)));
        if (h6.I.q()) {
            str = "Switch to day theme";
        } else {
            str = "Switch to dark theme";
        }
        arrayList.add(new a(str, new ai.f(15)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugSendLogs), new c(this, 2)));
        return arrayList;
    }

    public final void c(final boolean z10) {
        float f7;
        m6 m6Var = this.f14799a;
        ArrayList arrayList = this.E;
        if (this.f14805s == z10) {
            return;
        }
        this.f14805s = z10;
        if (z10) {
            this.f14806w.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                c5 O = ((LaunchActivity) getContext()).O();
                if (O instanceof b) {
                    arrayList.addAll(((b) O).z());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).f30819s0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.z());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).f30817r0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.z());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.f14808y.getAdapter().l();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z10) {
            this.v = window.getStatusBarColor();
        }
        final float translationX = m6Var.getTranslationX();
        final float translationY = m6Var.getTranslationY();
        float f10 = 0.0f;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1000.0f;
        }
        k kVar = new k(new j(f7));
        l l4 = q3.l(1000.0f, 900.0f, 1.0f);
        if (z10) {
            f10 = 1000.0f;
        }
        l4.f15332i = f10;
        kVar.f15326u = l4;
        kVar.b(new o1.g() {
            @Override
            public final void a(o1.h hVar, float f11, float f12) {
                float f13 = f11 / 1000.0f;
                i iVar = i.this;
                LinearLayout linearLayout = iVar.f14806w;
                linearLayout.setAlpha(f13);
                float f14 = translationX;
                linearLayout.setTranslationX(AndroidUtilities.lerp(f14 - AndroidUtilities.dp(8.0f), 0.0f, f13));
                float f15 = translationY;
                linearLayout.setTranslationY(AndroidUtilities.lerp(f15 - AndroidUtilities.dp(8.0f), 0.0f, f13));
                m6 m6Var2 = iVar.f14799a;
                linearLayout.setPivotX(m6Var2.getTranslationX() + AndroidUtilities.dp(28.0f));
                linearLayout.setPivotY(m6Var2.getTranslationY() + AndroidUtilities.dp(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(AndroidUtilities.lerp(m6Var2.getWidth() / linearLayout.getWidth(), 1.0f, f13));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(AndroidUtilities.lerp(m6Var2.getHeight() / linearLayout.getHeight(), 1.0f, f13));
                }
                m6Var2.setTranslationX(AndroidUtilities.lerp(f14, (iVar.getWidth() / 2.0f) - AndroidUtilities.dp(28.0f), f13));
                m6Var2.setTranslationY(AndroidUtilities.lerp(f15, (iVar.getHeight() / 2.0f) - AndroidUtilities.dp(28.0f), f13));
                m6Var2.setAlpha(1.0f - f13);
                window.setStatusBarColor(i0.a.d(f13, iVar.v, 2046820352));
                iVar.invalidate();
            }
        });
        kVar.a(new o1.f() {
            @Override
            public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                i iVar = i.this;
                m6 m6Var2 = iVar.f14799a;
                m6Var2.setTranslationX(translationX);
                m6Var2.setTranslationY(translationY);
                if (!z10) {
                    iVar.f14806w.setVisibility(8);
                }
            }
        });
        kVar.f();
    }

    public final void d() {
        z h02 = h6.h0(AndroidUtilities.dp(56.0f), h6.w0(null, h6.P9, false), h6.w0(null, h6.Q9, false));
        Drawable mutate = getResources().getDrawable(R.drawable.floating_shadow).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        qq qqVar = new qq(mutate, h02, 0, 0);
        int dp = AndroidUtilities.dp(56.0f);
        int dp2 = AndroidUtilities.dp(56.0f);
        qqVar.e = dp;
        qqVar.f27427f = dp2;
        this.f14800b = qqVar;
        Drawable drawable = getResources().getDrawable(R.drawable.popup_fixed_alert3);
        drawable.setColorFilter(new PorterDuffColorFilter(h6.w0(null, h6.f18859h5, false), mode));
        this.f14806w.setBackground(drawable);
        this.f14807x.setTextColor(h6.w0(null, h6.f18895j5, false));
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didSetNewTheme) {
            d();
            this.f14808y.getAdapter().l();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        LinearLayout linearLayout = this.f14806w;
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
        SharedPreferences sharedPreferences = this.e;
        float f7 = sharedPreferences.getFloat("x", -1.0f);
        float f10 = sharedPreferences.getFloat("y", -1.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        m6 m6Var = this.f14799a;
        if (f7 != -1.0f && f7 < displayMetrics.widthPixels / 2.0f) {
            a2 = a(displayMetrics, -2.1474836E9f);
        } else {
            a2 = a(displayMetrics, 2.1474836E9f);
        }
        m6Var.setTranslationX(a2);
        if (f10 == -1.0f) {
            b10 = b(displayMetrics, 2.1474836E9f);
        } else {
            b10 = b(displayMetrics, f10);
        }
        m6Var.setTranslationY(b10);
        k kVar = new k(m6Var, o1.h.f15308m, m6Var.getTranslationX());
        l lVar = new l(m6Var.getTranslationX());
        lVar.b(650.0f);
        lVar.a(0.75f);
        kVar.f15326u = lVar;
        this.f14801c = kVar;
        k kVar2 = new k(m6Var, o1.h.f15309n, m6Var.getTranslationY());
        l lVar2 = new l(m6Var.getTranslationY());
        lVar2.b(650.0f);
        lVar2.a(0.75f);
        kVar2.f15326u = lVar2;
        this.d = kVar2;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f7;
        super.onConfigurationChanged(configuration);
        this.f14801c.c();
        this.d.c();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        m6 m6Var = this.f14799a;
        if (m6Var.getTranslationX() >= displayMetrics.widthPixels / 2.0f) {
            f7 = 2.1474836E9f;
        } else {
            f7 = -2.1474836E9f;
        }
        m6Var.setTranslationX(a(displayMetrics, f7));
        m6Var.setTranslationY(b(displayMetrics, m6Var.getTranslationY()));
        this.f14801c.f15326u.f15332i = m6Var.getTranslationX();
        this.d.f15326u.f15332i = m6Var.getTranslationY();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f14801c.c();
        this.d.c();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        m6 m6Var = this.f14799a;
        canvas.translate(m6Var.getTranslationX(), m6Var.getTranslationY());
        canvas.scale(m6Var.getScaleX(), m6Var.getScaleY(), m6Var.getPivotX(), m6Var.getPivotY());
        this.f14800b.setAlpha((int) (m6Var.getAlpha() * 255.0f));
        this.f14800b.setBounds(m6Var.getLeft(), m6Var.getTop(), m6Var.getRight(), m6Var.getBottom());
        this.f14800b.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f14805s;
    }
}

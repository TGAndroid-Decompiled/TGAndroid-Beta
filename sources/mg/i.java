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
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.LaunchActivity;
import w7.o;
public final class i extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public ArrayList E;
    public int F;
    public m6 f16433a;
    public fr f16434b;
    public k f16435c;
    public k d;
    public SharedPreferences f16436e;
    public boolean f16437f;
    public boolean h;
    public boolean f16438n;
    public c f16439r;
    public boolean f16440s;
    public int v;
    public LinearLayout f16441w;
    public TextView f16442x;
    public qm0 f16443y;

    public static float a(DisplayMetrics displayMetrics, float f7) {
        return o.a(f7, AndroidUtilities.dp(16.0f), displayMetrics.widthPixels - AndroidUtilities.dp(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f7) {
        return o.a(f7, AndroidUtilities.dp(16.0f), displayMetrics.heightPixels - AndroidUtilities.dp(72.0f));
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
        if (i6.I.q()) {
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
        m6 m6Var = this.f16433a;
        ArrayList arrayList = this.E;
        if (this.f16440s == z10) {
            return;
        }
        this.f16440s = z10;
        if (z10) {
            this.f16441w.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                d5 O = ((LaunchActivity) getContext()).O();
                if (O instanceof b) {
                    arrayList.addAll(((b) O).B());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).f33811s0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.B());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).f33809r0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.B());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.f16443y.getAdapter().l();
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
        l j3 = c1.j(1000.0f, 900.0f, 1.0f);
        if (z10) {
            f10 = 1000.0f;
        }
        j3.f16945i = f10;
        kVar.f16938u = j3;
        kVar.b(new o1.g() {
            @Override
            public final void a(o1.h hVar, float f11, float f12) {
                float f13 = f11 / 1000.0f;
                i iVar = i.this;
                LinearLayout linearLayout = iVar.f16441w;
                linearLayout.setAlpha(f13);
                float f14 = translationX;
                linearLayout.setTranslationX(AndroidUtilities.lerp(f14 - AndroidUtilities.dp(8.0f), 0.0f, f13));
                float f15 = translationY;
                linearLayout.setTranslationY(AndroidUtilities.lerp(f15 - AndroidUtilities.dp(8.0f), 0.0f, f13));
                m6 m6Var2 = iVar.f16433a;
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
                m6 m6Var2 = iVar.f16433a;
                m6Var2.setTranslationX(translationX);
                m6Var2.setTranslationY(translationY);
                if (!z10) {
                    iVar.f16441w.setVisibility(8);
                }
            }
        });
        kVar.h();
    }

    public final void d() {
        z i02 = i6.i0(AndroidUtilities.dp(56.0f), i6.x0(null, i6.P9, false), i6.x0(null, i6.Q9, false));
        Drawable mutate = getResources().getDrawable(R.drawable.floating_shadow).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        fr frVar = new fr(mutate, i02, 0, 0);
        int dp = AndroidUtilities.dp(56.0f);
        int dp2 = AndroidUtilities.dp(56.0f);
        frVar.f26466e = dp;
        frVar.f26467f = dp2;
        this.f16434b = frVar;
        Drawable drawable = getResources().getDrawable(R.drawable.popup_fixed_alert3);
        drawable.setColorFilter(new PorterDuffColorFilter(i6.x0(null, i6.f20868h5, false), mode));
        this.f16441w.setBackground(drawable);
        this.f16442x.setTextColor(i6.x0(null, i6.f20905j5, false));
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didSetNewTheme) {
            d();
            this.f16443y.getAdapter().l();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        LinearLayout linearLayout = this.f16441w;
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
        SharedPreferences sharedPreferences = this.f16436e;
        float f7 = sharedPreferences.getFloat("x", -1.0f);
        float f10 = sharedPreferences.getFloat("y", -1.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        m6 m6Var = this.f16433a;
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
        k kVar = new k(m6Var, o1.h.f16919m, m6Var.getTranslationX());
        l lVar = new l(m6Var.getTranslationX());
        lVar.b(650.0f);
        lVar.a(0.75f);
        kVar.f16938u = lVar;
        this.f16435c = kVar;
        k kVar2 = new k(m6Var, o1.h.f16920n, m6Var.getTranslationY());
        l lVar2 = new l(m6Var.getTranslationY());
        lVar2.b(650.0f);
        lVar2.a(0.75f);
        kVar2.f16938u = lVar2;
        this.d = kVar2;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f7;
        super.onConfigurationChanged(configuration);
        this.f16435c.c();
        this.d.c();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        m6 m6Var = this.f16433a;
        if (m6Var.getTranslationX() >= displayMetrics.widthPixels / 2.0f) {
            f7 = 2.1474836E9f;
        } else {
            f7 = -2.1474836E9f;
        }
        m6Var.setTranslationX(a(displayMetrics, f7));
        m6Var.setTranslationY(b(displayMetrics, m6Var.getTranslationY()));
        this.f16435c.f16938u.f16945i = m6Var.getTranslationX();
        this.d.f16938u.f16945i = m6Var.getTranslationY();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f16435c.c();
        this.d.c();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        m6 m6Var = this.f16433a;
        canvas.translate(m6Var.getTranslationX(), m6Var.getTranslationY());
        canvas.scale(m6Var.getScaleX(), m6Var.getScaleY(), m6Var.getPivotX(), m6Var.getPivotY());
        this.f16434b.setAlpha((int) (m6Var.getAlpha() * 255.0f));
        this.f16434b.setBounds(m6Var.getLeft(), m6Var.getTop(), m6Var.getRight(), m6Var.getBottom());
        this.f16434b.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f16440s;
    }
}

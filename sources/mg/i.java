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
import ci.n6;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.LaunchActivity;
import w7.q;
public final class i extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public ArrayList E;
    public int F;
    public n6 f15045a;
    public pq f15046b;
    public k f15047c;
    public k d;
    public SharedPreferences e;
    public boolean f15048f;
    public boolean h;
    public boolean f15049n;
    public c f15050r;
    public boolean f15051s;
    public int v;
    public LinearLayout f15052w;
    public TextView f15053x;
    public vl0 f15054y;

    public static float a(DisplayMetrics displayMetrics, float f7) {
        return q.a(f7, AndroidUtilities.dp(16.0f), displayMetrics.widthPixels - AndroidUtilities.dp(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f7) {
        return q.a(f7, AndroidUtilities.dp(16.0f), displayMetrics.heightPixels - AndroidUtilities.dp(72.0f));
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
        if (j6.I.q()) {
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
        n6 n6Var = this.f15045a;
        ArrayList arrayList = this.E;
        if (this.f15051s == z10) {
            return;
        }
        this.f15051s = z10;
        if (z10) {
            this.f15052w.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                d5 O = ((LaunchActivity) getContext()).O();
                if (O instanceof b) {
                    arrayList.addAll(((b) O).z());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).f31132s0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.z());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).f31130r0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.z());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.f15054y.getAdapter().l();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z10) {
            this.v = window.getStatusBarColor();
        }
        final float translationX = n6Var.getTranslationX();
        final float translationY = n6Var.getTranslationY();
        float f10 = 0.0f;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1000.0f;
        }
        k kVar = new k(new j(f7));
        l m10 = c1.m(1000.0f, 900.0f, 1.0f);
        if (z10) {
            f10 = 1000.0f;
        }
        m10.f15528i = f10;
        kVar.f15522u = m10;
        kVar.b(new o1.g() {
            @Override
            public final void a(o1.h hVar, float f11, float f12) {
                float f13 = f11 / 1000.0f;
                i iVar = i.this;
                LinearLayout linearLayout = iVar.f15052w;
                linearLayout.setAlpha(f13);
                float f14 = translationX;
                linearLayout.setTranslationX(AndroidUtilities.lerp(f14 - AndroidUtilities.dp(8.0f), 0.0f, f13));
                float f15 = translationY;
                linearLayout.setTranslationY(AndroidUtilities.lerp(f15 - AndroidUtilities.dp(8.0f), 0.0f, f13));
                n6 n6Var2 = iVar.f15045a;
                linearLayout.setPivotX(n6Var2.getTranslationX() + AndroidUtilities.dp(28.0f));
                linearLayout.setPivotY(n6Var2.getTranslationY() + AndroidUtilities.dp(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(AndroidUtilities.lerp(n6Var2.getWidth() / linearLayout.getWidth(), 1.0f, f13));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(AndroidUtilities.lerp(n6Var2.getHeight() / linearLayout.getHeight(), 1.0f, f13));
                }
                n6Var2.setTranslationX(AndroidUtilities.lerp(f14, (iVar.getWidth() / 2.0f) - AndroidUtilities.dp(28.0f), f13));
                n6Var2.setTranslationY(AndroidUtilities.lerp(f15, (iVar.getHeight() / 2.0f) - AndroidUtilities.dp(28.0f), f13));
                n6Var2.setAlpha(1.0f - f13);
                window.setStatusBarColor(i0.a.d(f13, iVar.v, 2046820352));
                iVar.invalidate();
            }
        });
        kVar.a(new o1.f() {
            @Override
            public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                i iVar = i.this;
                n6 n6Var2 = iVar.f15045a;
                n6Var2.setTranslationX(translationX);
                n6Var2.setTranslationY(translationY);
                if (!z10) {
                    iVar.f15052w.setVisibility(8);
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
        pq pqVar = new pq(mutate, h02, 0, 0);
        int dp = AndroidUtilities.dp(56.0f);
        int dp2 = AndroidUtilities.dp(56.0f);
        pqVar.e = dp;
        pqVar.f27422f = dp2;
        this.f15046b = pqVar;
        Drawable drawable = getResources().getDrawable(R.drawable.popup_fixed_alert3);
        drawable.setColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.f19165h5, false), mode));
        this.f15052w.setBackground(drawable);
        this.f15053x.setTextColor(j6.w0(null, j6.f19201j5, false));
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didSetNewTheme) {
            d();
            this.f15054y.getAdapter().l();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        LinearLayout linearLayout = this.f15052w;
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
        n6 n6Var = this.f15045a;
        if (f7 != -1.0f && f7 < displayMetrics.widthPixels / 2.0f) {
            a2 = a(displayMetrics, -2.1474836E9f);
        } else {
            a2 = a(displayMetrics, 2.1474836E9f);
        }
        n6Var.setTranslationX(a2);
        if (f10 == -1.0f) {
            b10 = b(displayMetrics, 2.1474836E9f);
        } else {
            b10 = b(displayMetrics, f10);
        }
        n6Var.setTranslationY(b10);
        k kVar = new k(n6Var, o1.h.f15504m, n6Var.getTranslationX());
        l lVar = new l(n6Var.getTranslationX());
        lVar.b(650.0f);
        lVar.a(0.75f);
        kVar.f15522u = lVar;
        this.f15047c = kVar;
        k kVar2 = new k(n6Var, o1.h.f15505n, n6Var.getTranslationY());
        l lVar2 = new l(n6Var.getTranslationY());
        lVar2.b(650.0f);
        lVar2.a(0.75f);
        kVar2.f15522u = lVar2;
        this.d = kVar2;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f7;
        super.onConfigurationChanged(configuration);
        this.f15047c.c();
        this.d.c();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        n6 n6Var = this.f15045a;
        if (n6Var.getTranslationX() >= displayMetrics.widthPixels / 2.0f) {
            f7 = 2.1474836E9f;
        } else {
            f7 = -2.1474836E9f;
        }
        n6Var.setTranslationX(a(displayMetrics, f7));
        n6Var.setTranslationY(b(displayMetrics, n6Var.getTranslationY()));
        this.f15047c.f15522u.f15528i = n6Var.getTranslationX();
        this.d.f15522u.f15528i = n6Var.getTranslationY();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15047c.c();
        this.d.c();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        n6 n6Var = this.f15045a;
        canvas.translate(n6Var.getTranslationX(), n6Var.getTranslationY());
        canvas.scale(n6Var.getScaleX(), n6Var.getScaleY(), n6Var.getPivotX(), n6Var.getPivotY());
        this.f15046b.setAlpha((int) (n6Var.getAlpha() * 255.0f));
        this.f15046b.setBounds(n6Var.getLeft(), n6Var.getTop(), n6Var.getRight(), n6Var.getBottom());
        this.f15046b.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f15051s;
    }
}

package ng;

import ah.j;
import ah.v;
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
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.b1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.yq;
import org.telegram.ui.LaunchActivity;
import w7.r;
public final class i extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public ArrayList E;
    public int F;
    public v f17527a;
    public yq f17528b;
    public k f17529c;
    public k d;
    public SharedPreferences e;
    public boolean f17530f;
    public boolean h;
    public boolean f17531n;
    public c f17532r;
    public boolean f17533s;
    public int v;
    public LinearLayout f17534w;
    public TextView f17535x;
    public mm0 f17536y;

    public static float a(DisplayMetrics displayMetrics, float f7) {
        return r.a(f7, AndroidUtilities.dp(16.0f), displayMetrics.widthPixels - AndroidUtilities.dp(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f7) {
        return r.a(f7, AndroidUtilities.dp(16.0f), displayMetrics.heightPixels - AndroidUtilities.dp(72.0f));
    }

    private List<a> getBuiltInDebugItems() {
        int i10;
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("Theme"));
        arrayList.add(new a("Draw action bar shadow", new j(19)));
        arrayList.add(new a("Show blur settings", new c(this, 0)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugGeneral)));
        if (SharedConfig.debugWebView) {
            i10 = R.string.DebugMenuDisableWebViewDebug;
        } else {
            i10 = R.string.DebugMenuEnableWebViewDebug;
        }
        arrayList.add(new a(LocaleController.getString(i10), new c(this, 1)));
        if (k6.I.q()) {
            str = "Switch to day theme";
        } else {
            str = "Switch to dark theme";
        }
        arrayList.add(new a(str, new j(20)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugSendLogs), new c(this, 2)));
        return arrayList;
    }

    public final void c(final boolean z10) {
        float f7;
        v vVar = this.f17527a;
        ArrayList arrayList = this.E;
        if (this.f17533s == z10) {
            return;
        }
        this.f17533s = z10;
        if (z10) {
            this.f17534w.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                h5 O = ((LaunchActivity) getContext()).O();
                if (O instanceof b) {
                    arrayList.addAll(((b) O).B());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).f33491s0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.B());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).f33489r0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.B());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.f17536y.getAdapter().l();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z10) {
            this.v = window.getStatusBarColor();
        }
        final float translationX = vVar.getTranslationX();
        final float translationY = vVar.getTranslationY();
        float f10 = 0.0f;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1000.0f;
        }
        k kVar = new k(new o1.j(f7));
        l m10 = b1.m(1000.0f, 900.0f, 1.0f);
        if (z10) {
            f10 = 1000.0f;
        }
        m10.f17628i = f10;
        kVar.f17622u = m10;
        kVar.b(new o1.g() {
            @Override
            public final void a(o1.h hVar, float f11, float f12) {
                float f13 = f11 / 1000.0f;
                i iVar = i.this;
                LinearLayout linearLayout = iVar.f17534w;
                linearLayout.setAlpha(f13);
                float f14 = translationX;
                linearLayout.setTranslationX(AndroidUtilities.lerp(f14 - AndroidUtilities.dp(8.0f), 0.0f, f13));
                float f15 = translationY;
                linearLayout.setTranslationY(AndroidUtilities.lerp(f15 - AndroidUtilities.dp(8.0f), 0.0f, f13));
                v vVar2 = iVar.f17527a;
                linearLayout.setPivotX(vVar2.getTranslationX() + AndroidUtilities.dp(28.0f));
                linearLayout.setPivotY(vVar2.getTranslationY() + AndroidUtilities.dp(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(AndroidUtilities.lerp(vVar2.getWidth() / linearLayout.getWidth(), 1.0f, f13));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(AndroidUtilities.lerp(vVar2.getHeight() / linearLayout.getHeight(), 1.0f, f13));
                }
                vVar2.setTranslationX(AndroidUtilities.lerp(f14, (iVar.getWidth() / 2.0f) - AndroidUtilities.dp(28.0f), f13));
                vVar2.setTranslationY(AndroidUtilities.lerp(f15, (iVar.getHeight() / 2.0f) - AndroidUtilities.dp(28.0f), f13));
                vVar2.setAlpha(1.0f - f13);
                window.setStatusBarColor(i0.a.f(f13, iVar.v, 2046820352));
                iVar.invalidate();
            }
        });
        kVar.a(new o1.f() {
            @Override
            public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                i iVar = i.this;
                v vVar2 = iVar.f17527a;
                vVar2.setTranslationX(translationX);
                vVar2.setTranslationY(translationY);
                if (!z10) {
                    iVar.f17534w.setVisibility(8);
                }
            }
        });
        kVar.h();
    }

    public final void d() {
        y i02 = k6.i0(AndroidUtilities.dp(56.0f), k6.x0(null, k6.P9, false), k6.x0(null, k6.Q9, false));
        Drawable mutate = getResources().getDrawable(R.drawable.floating_shadow).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        yq yqVar = new yq(mutate, i02, 0, 0);
        int dp = AndroidUtilities.dp(56.0f);
        int dp2 = AndroidUtilities.dp(56.0f);
        yqVar.e = dp;
        yqVar.f33015f = dp2;
        this.f17528b = yqVar;
        Drawable drawable = getResources().getDrawable(R.drawable.popup_fixed_alert3);
        r6.z(this, drawable, k6.f21254h5, null, mode);
        this.f17534w.setBackground(drawable);
        r6.W(this.f17535x, k6.f21289j5, null);
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didSetNewTheme) {
            d();
            this.f17536y.getAdapter().l();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        LinearLayout linearLayout = this.f17534w;
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
        v vVar = this.f17527a;
        if (f7 != -1.0f && f7 < displayMetrics.widthPixels / 2.0f) {
            a2 = a(displayMetrics, -2.1474836E9f);
        } else {
            a2 = a(displayMetrics, 2.1474836E9f);
        }
        vVar.setTranslationX(a2);
        if (f10 == -1.0f) {
            b10 = b(displayMetrics, 2.1474836E9f);
        } else {
            b10 = b(displayMetrics, f10);
        }
        vVar.setTranslationY(b10);
        k kVar = new k(vVar, o1.h.f17604m, vVar.getTranslationX());
        l lVar = new l(vVar.getTranslationX());
        lVar.b(650.0f);
        lVar.a(0.75f);
        kVar.f17622u = lVar;
        this.f17529c = kVar;
        k kVar2 = new k(vVar, o1.h.f17605n, vVar.getTranslationY());
        l lVar2 = new l(vVar.getTranslationY());
        lVar2.b(650.0f);
        lVar2.a(0.75f);
        kVar2.f17622u = lVar2;
        this.d = kVar2;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f7;
        super.onConfigurationChanged(configuration);
        this.f17529c.c();
        this.d.c();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        v vVar = this.f17527a;
        if (vVar.getTranslationX() >= displayMetrics.widthPixels / 2.0f) {
            f7 = 2.1474836E9f;
        } else {
            f7 = -2.1474836E9f;
        }
        vVar.setTranslationX(a(displayMetrics, f7));
        vVar.setTranslationY(b(displayMetrics, vVar.getTranslationY()));
        this.f17529c.f17622u.f17628i = vVar.getTranslationX();
        this.d.f17622u.f17628i = vVar.getTranslationY();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f17529c.c();
        this.d.c();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        v vVar = this.f17527a;
        canvas.translate(vVar.getTranslationX(), vVar.getTranslationY());
        canvas.scale(vVar.getScaleX(), vVar.getScaleY(), vVar.getPivotX(), vVar.getPivotY());
        this.f17528b.setAlpha((int) (vVar.getAlpha() * 255.0f));
        this.f17528b.setBounds(vVar.getLeft(), vVar.getTop(), vVar.getRight(), vVar.getBottom());
        this.f17528b.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f17533s;
    }
}

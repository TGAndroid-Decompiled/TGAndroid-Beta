package og;

import a8.ee;
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
import bh.p;
import java.util.ArrayList;
import java.util.List;
import o1.j;
import o1.k;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.d3;
public final class i extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public ArrayList E;
    public int F;
    public p f19408a;
    public ar f19409b;
    public j f19410c;
    public j d;
    public SharedPreferences e;
    public boolean f19411f;
    public boolean h;
    public boolean f19412n;
    public c f19413r;
    public boolean f19414s;
    public int v;
    public LinearLayout f19415w;
    public TextView f19416x;
    public mm0 f19417y;

    public static float a(DisplayMetrics displayMetrics, float f7) {
        return ee.a(f7, AndroidUtilities.dp(16.0f), displayMetrics.widthPixels - AndroidUtilities.dp(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f7) {
        return ee.a(f7, AndroidUtilities.dp(16.0f), displayMetrics.heightPixels - AndroidUtilities.dp(72.0f));
    }

    private List<a> getBuiltInDebugItems() {
        int i10;
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("Theme"));
        arrayList.add(new a("Draw action bar shadow", new ag.c(21)));
        arrayList.add(new a("Show blur settings", new c(this, 0)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugGeneral)));
        if (SharedConfig.debugWebView) {
            i10 = R.string.DebugMenuDisableWebViewDebug;
        } else {
            i10 = R.string.DebugMenuEnableWebViewDebug;
        }
        arrayList.add(new a(LocaleController.getString(i10), new c(this, 1)));
        if (y6.I.q()) {
            str = "Switch to day theme";
        } else {
            str = "Switch to dark theme";
        }
        arrayList.add(new a(str, new ag.c(22)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugSendLogs), new c(this, 2)));
        return arrayList;
    }

    public final void c(final boolean z10) {
        float f7;
        p pVar = this.f19408a;
        ArrayList arrayList = this.E;
        if (this.f19414s == z10) {
            return;
        }
        this.f19414s = z10;
        if (z10) {
            this.f19415w.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                j5 O = ((LaunchActivity) getContext()).O();
                if (O instanceof b) {
                    arrayList.addAll(((b) O).B());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).f35554s0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.B());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).f35552r0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.B());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.f19417y.getAdapter().l();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z10) {
            this.v = window.getStatusBarColor();
        }
        final float translationX = pVar.getTranslationX();
        final float translationY = pVar.getTranslationY();
        float f10 = 0.0f;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1000.0f;
        }
        j jVar = new j(new ac.a(f7));
        k l4 = d3.l(1000.0f, 900.0f, 1.0f);
        if (z10) {
            f10 = 1000.0f;
        }
        l4.f18975i = f10;
        jVar.f18969u = l4;
        jVar.b(new o1.g() {
            @Override
            public final void a(o1.h hVar, float f11, float f12) {
                float f13 = f11 / 1000.0f;
                i iVar = i.this;
                LinearLayout linearLayout = iVar.f19415w;
                linearLayout.setAlpha(f13);
                float f14 = translationX;
                linearLayout.setTranslationX(AndroidUtilities.lerp(f14 - AndroidUtilities.dp(8.0f), 0.0f, f13));
                float f15 = translationY;
                linearLayout.setTranslationY(AndroidUtilities.lerp(f15 - AndroidUtilities.dp(8.0f), 0.0f, f13));
                p pVar2 = iVar.f19408a;
                linearLayout.setPivotX(pVar2.getTranslationX() + AndroidUtilities.dp(28.0f));
                linearLayout.setPivotY(pVar2.getTranslationY() + AndroidUtilities.dp(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(AndroidUtilities.lerp(pVar2.getWidth() / linearLayout.getWidth(), 1.0f, f13));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(AndroidUtilities.lerp(pVar2.getHeight() / linearLayout.getHeight(), 1.0f, f13));
                }
                pVar2.setTranslationX(AndroidUtilities.lerp(f14, (iVar.getWidth() / 2.0f) - AndroidUtilities.dp(28.0f), f13));
                pVar2.setTranslationY(AndroidUtilities.lerp(f15, (iVar.getHeight() / 2.0f) - AndroidUtilities.dp(28.0f), f13));
                pVar2.setAlpha(1.0f - f13);
                window.setStatusBarColor(i0.a.f(f13, iVar.v, 2046820352));
                iVar.invalidate();
            }
        });
        jVar.a(new o1.f() {
            @Override
            public final void a(o1.h hVar, boolean z11, float f11, float f12) {
                i iVar = i.this;
                p pVar2 = iVar.f19408a;
                pVar2.setTranslationX(translationX);
                pVar2.setTranslationY(translationY);
                if (!z10) {
                    iVar.f19415w.setVisibility(8);
                }
            }
        });
        jVar.h();
    }

    public final void d() {
        y i02 = y6.i0(AndroidUtilities.dp(56.0f), y6.x0(null, y6.P9, false), y6.x0(null, y6.Q9, false));
        Drawable mutate = getResources().getDrawable(R.drawable.floating_shadow).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        ar arVar = new ar(mutate, i02, 0, 0);
        int dp = AndroidUtilities.dp(56.0f);
        int dp2 = AndroidUtilities.dp(56.0f);
        arVar.e = dp;
        arVar.f26593f = dp2;
        this.f19409b = arVar;
        Drawable drawable = getResources().getDrawable(R.drawable.popup_fixed_alert3);
        f7.y(this, drawable, y6.f23425h5, null, mode);
        this.f19415w.setBackground(drawable);
        f7.V(this.f19416x, y6.f23462j5, null);
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didSetNewTheme) {
            d();
            this.f19417y.getAdapter().l();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        LinearLayout linearLayout = this.f19415w;
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
        p pVar = this.f19408a;
        if (f7 != -1.0f && f7 < displayMetrics.widthPixels / 2.0f) {
            a2 = a(displayMetrics, -2.1474836E9f);
        } else {
            a2 = a(displayMetrics, 2.1474836E9f);
        }
        pVar.setTranslationX(a2);
        if (f10 == -1.0f) {
            b10 = b(displayMetrics, 2.1474836E9f);
        } else {
            b10 = b(displayMetrics, f10);
        }
        pVar.setTranslationY(b10);
        j jVar = new j(pVar, o1.h.f18952m, pVar.getTranslationX());
        k kVar = new k(pVar.getTranslationX());
        kVar.b(650.0f);
        kVar.a(0.75f);
        jVar.f18969u = kVar;
        this.f19410c = jVar;
        j jVar2 = new j(pVar, o1.h.f18953n, pVar.getTranslationY());
        k kVar2 = new k(pVar.getTranslationY());
        kVar2.b(650.0f);
        kVar2.a(0.75f);
        jVar2.f18969u = kVar2;
        this.d = jVar2;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f7;
        super.onConfigurationChanged(configuration);
        this.f19410c.c();
        this.d.c();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        p pVar = this.f19408a;
        if (pVar.getTranslationX() >= displayMetrics.widthPixels / 2.0f) {
            f7 = 2.1474836E9f;
        } else {
            f7 = -2.1474836E9f;
        }
        pVar.setTranslationX(a(displayMetrics, f7));
        pVar.setTranslationY(b(displayMetrics, pVar.getTranslationY()));
        this.f19410c.f18969u.f18975i = pVar.getTranslationX();
        this.d.f18969u.f18975i = pVar.getTranslationY();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f19410c.c();
        this.d.c();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        p pVar = this.f19408a;
        canvas.translate(pVar.getTranslationX(), pVar.getTranslationY());
        canvas.scale(pVar.getScaleX(), pVar.getScaleY(), pVar.getPivotX(), pVar.getPivotY());
        this.f19409b.setAlpha((int) (pVar.getAlpha() * 255.0f));
        this.f19409b.setBounds(pVar.getLeft(), pVar.getTop(), pVar.getRight(), pVar.getBottom());
        this.f19409b.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f19414s;
    }
}

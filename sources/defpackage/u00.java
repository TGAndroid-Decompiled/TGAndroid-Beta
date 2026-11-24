package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.RectF;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import java.util.List;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class u00 implements h27 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public Object n;
    public Object r;
    public Object s;
    public Object w;

    public u00(Context context, l0 l0Var, o00 o00Var, AudioDeviceInfo audioDeviceInfo) {
        Uri uriFor;
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = l0Var;
        this.w = o00Var;
        this.s = audioDeviceInfo;
        Handler handler = new Handler(hac.z(), null);
        this.d = handler;
        this.e = new s00(this);
        this.f = new zk(this, (byte) 2);
        y79 y79Var = r00.e;
        String str = Build.MANUFACTURER;
        if (!str.equals("Amazon") && !str.equals("Xiaomi")) {
            uriFor = null;
        } else {
            uriFor = Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        this.h = uriFor != null ? new t00(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    @Override
    public final boolean a() {
        return false;
    }

    @Override
    public final void b(bka bkaVar, r7 r7Var) {
        boolean z;
        if (bkaVar != null) {
            z = true;
        } else {
            z = false;
        }
        this.a = z;
        ((qs1) this.b).setCenterMenuVisible(z);
        ((ws1) this.c).d0(this.a);
    }

    @Override
    public final boolean c(r7 r7Var, RectF rectF) {
        ((ws1) this.c).l0(rectF);
        return true;
    }

    @Override
    public final boolean d() {
        return false;
    }

    public final void e(int i, String str, boolean z, Runnable runnable) {
        int i2;
        int i3;
        int i4;
        a8 a8Var = new a8(0, (ylb) this.r, ((qs1) this.b).getContext(), false, false);
        a8Var.setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
        a8Var.setMinimumWidth(gm.L(232.0f));
        a8Var.j(str, i, null);
        if (z) {
            i3 = cmb.o7;
            i2 = i3;
        } else {
            i2 = cmb.D8;
            i3 = cmb.E8;
        }
        a8Var.c(i2, i3);
        if (z) {
            i4 = cmb.o7;
        } else {
            i4 = cmb.D8;
        }
        a8Var.h(0.12f, i4);
        a8Var.setOnClickListener(new rc1(this, runnable, (byte) 2));
        ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.s).a(a8Var, qoe.o(-1, 48));
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final int getButtonsGlassBackgroundColor() {
        return ((jr1) this.n).K1();
    }

    @Override
    public final am0 getButtonsGlassColorProvider() {
        return (jr1) this.n;
    }

    @Override
    public final int getMenuAnchorTint() {
        return 0;
    }

    @Override
    public final int getMenuDimAlpha() {
        return -1;
    }

    @Override
    public final int getMenuExtraBelow() {
        return 0;
    }

    @Override
    public final am0 getMenuGlassColorProvider() {
        return (am0) this.h;
    }

    @Override
    public final View getMenuHostView() {
        return ((ws1) this.c).a.U;
    }

    @Override
    public final int getMenuMaxHeight() {
        return 0;
    }

    @Override
    public final ylb getMenuResourcesProvider() {
        return (ylb) this.r;
    }

    @Override
    public final int getMenuRise() {
        return 0;
    }

    @Override
    public final View getMenuView() {
        return ((qs1) this.b).getContainer();
    }

    @Override
    public final bka getOpenMenuOverlay() {
        if (this.a) {
            return (bka) this.d;
        }
        return null;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final im0 i(bka bkaVar) {
        im0 c = ((km0) this.e).c(bkaVar, null, false);
        c.p((am0) this.h);
        wi8.r(c, gm.L(22.0f), 6.0f);
        return c;
    }

    public final List j() {
        tma tmaVar;
        if (Build.VERSION.SDK_INT >= 32 && (tmaVar = (tma) this.n) != null) {
            return tmaVar.b();
        }
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    public final void k(r00 r00Var) {
        if (this.a && !r00Var.equals((r00) this.r)) {
            this.r = r00Var;
            l50 l50Var = (l50) ((l0) this.c).b;
            l50Var.f();
            r00 r00Var2 = l50Var.g;
            if (r00Var2 != null && !r00Var.equals(r00Var2)) {
                l50Var.g = r00Var;
                a86 a86Var = l50Var.e;
                if (a86Var != null) {
                    a86Var.e(-1, new w00((byte) 6));
                }
            }
        }
    }

    public final void l() {
        List j = j();
        Context context = (Context) this.b;
        y79 y79Var = r00.e;
        k(r00.b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), (o00) this.w, (AudioDeviceInfo) this.s, j));
    }

    @Override
    public final void setMenuGlassFrostedProgress(float f) {
        lz4 lz4Var = (lz4) this.f;
        if (lz4Var != null) {
            lz4Var.k(f);
        }
    }

    public u00(qs1 qs1Var, ws1 ws1Var, bka bkaVar, km0 km0Var, lz4 lz4Var, am0 am0Var, jr1 jr1Var, ylb ylbVar) {
        this.b = qs1Var;
        this.c = ws1Var;
        this.d = bkaVar;
        this.e = km0Var;
        this.f = lz4Var;
        this.h = am0Var;
        this.n = jr1Var;
        this.r = ylbVar;
        this.s = new ActionBarPopupWindow$ActionBarPopupWindowLayout(qs1Var.getContext(), ylbVar);
    }
}

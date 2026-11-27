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
public final class vz implements o27 {
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

    public vz(Context context, m0 m0Var, oz ozVar, AudioDeviceInfo audioDeviceInfo) {
        Uri uriFor;
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = m0Var;
        this.w = ozVar;
        this.s = audioDeviceInfo;
        Handler handler = new Handler(gcc.z(), null);
        this.d = handler;
        this.e = new tz(this);
        this.f = new ak(this, (byte) 2);
        j99 j99Var = sz.e;
        String str = Build.MANUFACTURER;
        if (!str.equals("Amazon") && !str.equals("Xiaomi")) {
            uriFor = null;
        } else {
            uriFor = Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        this.h = uriFor != null ? new uz(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    @Override
    public final boolean a() {
        return false;
    }

    @Override
    public final void b(ula ulaVar, s7 s7Var) {
        boolean z;
        if (ulaVar != null) {
            z = true;
        } else {
            z = false;
        }
        this.a = z;
        ((rr1) this.b).setCenterMenuVisible(z);
        ((xr1) this.c).f0(this.a);
    }

    @Override
    public final boolean c(s7 s7Var, RectF rectF) {
        ((xr1) this.c).m0(rectF);
        return true;
    }

    @Override
    public final boolean d() {
        return true;
    }

    public final void e(int i, String str, boolean z, Runnable runnable) {
        int i2;
        int i3;
        int i4;
        b8 b8Var = new b8(0, (vnb) this.r, ((rr1) this.b).getContext(), false, false);
        b8Var.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
        b8Var.setMinimumWidth(hl.L(232.0f));
        b8Var.j(str, i, null);
        if (z) {
            i3 = aob.p7;
            i2 = i3;
        } else {
            i2 = aob.E8;
            i3 = aob.F8;
        }
        b8Var.c(i2, i3);
        if (z) {
            i4 = aob.p7;
        } else {
            i4 = aob.E8;
        }
        b8Var.h(0.12f, i4);
        b8Var.setOnClickListener(new sb1(this, runnable, (byte) 2));
        ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.s).a(b8Var, tre.o(-1, 48));
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final int getButtonsGlassBackgroundColor() {
        return ((kq1) this.n).Q1();
    }

    @Override
    public final bl0 getButtonsGlassColorProvider() {
        return (kq1) this.n;
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
    public final bl0 getMenuGlassColorProvider() {
        return (bl0) this.h;
    }

    @Override
    public final View getMenuHostView() {
        return ((xr1) this.c).a.U;
    }

    @Override
    public final int getMenuMaxHeight() {
        return 0;
    }

    @Override
    public final vnb getMenuResourcesProvider() {
        return (vnb) this.r;
    }

    @Override
    public final int getMenuRise() {
        return 0;
    }

    @Override
    public final View getMenuView() {
        return ((rr1) this.b).getContainer();
    }

    @Override
    public final ula getOpenMenuOverlay() {
        if (this.a) {
            return (ula) this.d;
        }
        return null;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final jl0 i(ula ulaVar) {
        jl0 c = ((ll0) this.e).c(ulaVar, null, false);
        c.p((bl0) this.h);
        ik8.r(c, hl.L(22.0f), 6.0f);
        return c;
    }

    public final List j() {
        moa moaVar;
        if (Build.VERSION.SDK_INT >= 32 && (moaVar = (moa) this.n) != null) {
            return moaVar.b();
        }
        no5 no5Var = po5.b;
        return j99.e;
    }

    public final void k(sz szVar) {
        if (this.a && !szVar.equals((sz) this.r)) {
            this.r = szVar;
            n40 n40Var = (n40) ((m0) this.c).b;
            n40Var.f();
            sz szVar2 = n40Var.g;
            if (szVar2 != null && !szVar.equals(szVar2)) {
                n40Var.g = szVar;
                e86 e86Var = n40Var.e;
                if (e86Var != null) {
                    e86Var.e(-1, new xz((byte) 6));
                }
            }
        }
    }

    public final void l() {
        List j = j();
        Context context = (Context) this.b;
        j99 j99Var = sz.e;
        k(sz.b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), (oz) this.w, (AudioDeviceInfo) this.s, j));
    }

    @Override
    public final void setMenuGlassFrostedProgress(float f) {
        pz4 pz4Var = (pz4) this.f;
        if (pz4Var != null) {
            pz4Var.k(f);
        }
    }

    public vz(rr1 rr1Var, xr1 xr1Var, ula ulaVar, ll0 ll0Var, pz4 pz4Var, bl0 bl0Var, kq1 kq1Var, vnb vnbVar) {
        this.b = rr1Var;
        this.c = xr1Var;
        this.d = ulaVar;
        this.e = ll0Var;
        this.f = pz4Var;
        this.h = bl0Var;
        this.n = kq1Var;
        this.r = vnbVar;
        this.s = new ActionBarPopupWindow$ActionBarPopupWindowLayout(rr1Var.getContext(), vnbVar);
    }
}

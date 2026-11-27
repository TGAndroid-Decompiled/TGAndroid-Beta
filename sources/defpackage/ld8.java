package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a;
public final class ld8 extends FrameLayout {
    public final ksb a;
    public final c51 b;
    public final kt3 c;
    public kfc d;
    public long e;
    public float f;
    public au4 h;
    public pcc n;
    public Runnable r;

    public ld8(Context context, vnb vnbVar, tl0 tl0Var) {
        super(context);
        this.e = -1L;
        this.f = 1.39f;
        a aVar = new a(context, vnbVar);
        aVar.setBackButtonImage(2131231243);
        aVar.setTitle(ob6.M0(2131751170, null));
        aVar.H(-1, false);
        aVar.G(587202559, false);
        aVar.setActionBarMenuOnItemClick(new zl5(this, (byte) 23));
        addView(aVar, tre.e(-1, -2, 55));
        ksb ksbVar = new ksb(context, null, null, vnbVar, tl0Var);
        this.a = ksbVar;
        ksbVar.Y0 = true;
        addView(ksbVar, tre.d(-1, 388.0f, 87, 0.0f, 0.0f, 0.0f, 74.0f));
        c51 c51Var = new c51(vnbVar, context, true);
        this.b = c51Var;
        c51Var.i(ob6.M0(2131751171, null), false, true);
        c51Var.f();
        addView(c51Var, tre.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 16.0f));
        kt3 kt3Var = new kt3(context, ob6.M0(2131751172, null));
        this.c = kt3Var;
        kt3Var.setOnClickListener(new lw4(this, context, vnbVar, (byte) 16));
        addView(kt3Var, tre.d(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 134.0f));
        ksbVar.setDelegate(new um4(this));
    }

    public final void a(no6 no6Var, kfc kfcVar, vnb vnbVar) {
        int i;
        c51 c51Var = this.b;
        c51Var.a = vnbVar;
        c51Var.F = false;
        c51Var.updateColors();
        int i2 = no6Var.F;
        if (i2 > 0 && (i = no6Var.G) > 0) {
            this.f = Utilities.i(i / i2, 1.39f, 0.85f);
        } else {
            this.f = 1.39f;
        }
        this.d = kfcVar;
        long j = no6Var.d;
        if (j >= 0) {
            this.e = j;
            kfcVar.p0(j, false);
        } else {
            this.e = kfcVar.S();
        }
        String path = kfcVar.G.getPath();
        long U = kfcVar.U();
        s64 s64Var = kfcVar.d;
        s64Var.y1();
        this.a.o(false, path, U, s64Var.b0);
        long U2 = kfcVar.U();
        float max = 2.8f / ((float) Math.max(60L, U2));
        float max2 = (1.0f - max) * (((float) this.e) / ((float) Math.max(1L, kfcVar.U())));
        ksb ksbVar = this.a;
        ksbVar.setVideoLeft(max2);
        ksbVar.setVideoRight(max2 + max);
        ksbVar.a1 = 0L;
        ksbVar.b1 = U2;
        fsb fsbVar = ksbVar.h;
        if (fsbVar != null) {
            fsbVar.a(true);
        }
        ksbVar.k();
    }

    public long getTime() {
        return this.e;
    }

    public void setOnClose(Runnable runnable) {
        this.r = runnable;
    }

    public void setOnGalleryImage(pcc pccVar) {
        this.n = pccVar;
    }
}

package hi;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import di.ub;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
public final class g2 extends e2 {
    public ch.g0 f14331i;
    public ch.g0 f14332j;
    public int f14333k;
    public final org.telegram.ui.Components.u5 f14334l;
    public Timer f14335m;
    public final fi.o8 f14336n;
    public final ArrayList f14337o;
    public final ub f14338p;

    public g2(ub ubVar) {
        super(ubVar);
        this.f14338p = ubVar;
        this.f14331i = new ch.g0(ubVar);
        this.f14332j = new ch.g0(ubVar);
        this.f14334l = new org.telegram.ui.Components.u5(ubVar);
        this.f14336n = new fi.o8(ubVar);
        this.f14337o = new ArrayList();
        this.f14228a = 3;
        this.f14229b = org.telegram.messenger.g0.L(44.0f);
        this.f14230c = org.telegram.messenger.g0.L(36.0f);
        int i7 = i2.C1;
        ArrayList arrayList = si.b0(((i2) ubVar.h).f29679a).h;
        for (int i10 = 0; i10 < Math.min(arrayList.size(), 8); i10++) {
            this.f14337o.add(ch.p0.c((TLRPC.TL_availableReaction) arrayList.get(i10)));
        }
        Collections.sort(this.f14337o, new a3.c(28));
        if (!this.f14337o.isEmpty()) {
            this.f14331i.e((ch.p0) this.f14337o.get(this.f14333k));
        }
        this.f14334l.e(true, 1.0f);
    }

    @Override
    public final void a(Canvas canvas, float f10, float f11) {
        float L = f11 - org.telegram.messenger.g0.L(4.0f);
        float f12 = this.f14229b;
        RectF rectF = this.f14232f;
        rectF.set((int) f10, (int) L, (int) (f10 + f12), (int) (L + f12));
        float a10 = this.f14233g.a(0.05f);
        canvas.save();
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        fi.o8 o8Var = this.f14336n;
        o8Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        o8Var.draw(canvas);
        Rect rect = org.telegram.messenger.g0.Q;
        float L2 = org.telegram.messenger.g0.L(30.0f) / 2.0f;
        rect.set((int) (rectF.centerX() - L2), (int) (rectF.centerY() - L2), (int) (rectF.centerX() + L2), (int) (rectF.centerY() + L2));
        float e10 = this.f14334l.e(false, 1.0f);
        this.f14332j.c(rect);
        this.f14331i.c(rect);
        if (e10 == 1.0f) {
            this.f14331i.a(canvas);
        } else {
            canvas.save();
            float f13 = 1.0f - e10;
            canvas.scale(f13, f13, rectF.centerX(), rectF.top);
            ch.g0 g0Var = this.f14332j;
            g0Var.h = f13;
            g0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e10, e10, rectF.centerX(), rectF.bottom);
            ch.g0 g0Var2 = this.f14331i;
            g0Var2.h = e10;
            g0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        this.f14331i.b(z10);
        this.f14332j.b(z10);
        Timer timer = this.f14335m;
        if (timer != null) {
            timer.cancel();
            this.f14335m = null;
        }
        if (z10) {
            Timer timer2 = new Timer();
            this.f14335m = timer2;
            timer2.schedule(new h6.r(this, 1), 2000L, 2000L);
        }
    }
}

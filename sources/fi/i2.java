package fi;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import bi.nd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
public final class i2 extends f2 {
    public ch.f0 f12170i;
    public ch.f0 f12171j;
    public int f12172k;
    public final org.telegram.ui.Components.w5 f12173l;
    public Timer f12174m;
    public final di.v8 f12175n;
    public final ArrayList f12176o;
    public final nd f12177p;

    public i2(nd ndVar) {
        super(ndVar);
        this.f12177p = ndVar;
        this.f12170i = new ch.f0(ndVar);
        this.f12171j = new ch.f0(ndVar);
        this.f12173l = new org.telegram.ui.Components.w5(ndVar);
        this.f12175n = new di.v8(ndVar);
        this.f12176o = new ArrayList();
        this.f11949a = 3;
        this.f11950b = org.telegram.messenger.g0.L(44.0f);
        this.f11951c = org.telegram.messenger.g0.L(36.0f);
        int i7 = k2.f12251y1;
        ArrayList arrayList = ui.b0(((k2) ndVar.h).f28612a).h;
        for (int i10 = 0; i10 < Math.min(arrayList.size(), 8); i10++) {
            this.f12176o.add(ch.o0.c((TLRPC.TL_availableReaction) arrayList.get(i10)));
        }
        Collections.sort(this.f12176o, new a3.c(26));
        if (!this.f12176o.isEmpty()) {
            this.f12170i.e((ch.o0) this.f12176o.get(this.f12172k));
        }
        this.f12173l.e(true, 1.0f);
    }

    @Override
    public final void a(Canvas canvas, float f10, float f11) {
        float L = f11 - org.telegram.messenger.g0.L(4.0f);
        float f12 = this.f11950b;
        RectF rectF = this.f11953f;
        rectF.set((int) f10, (int) L, (int) (f10 + f12), (int) (L + f12));
        float a10 = this.f11954g.a(0.05f);
        canvas.save();
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        di.v8 v8Var = this.f12175n;
        v8Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        v8Var.draw(canvas);
        Rect rect = org.telegram.messenger.g0.Q;
        float L2 = org.telegram.messenger.g0.L(30.0f) / 2.0f;
        rect.set((int) (rectF.centerX() - L2), (int) (rectF.centerY() - L2), (int) (rectF.centerX() + L2), (int) (rectF.centerY() + L2));
        float e10 = this.f12173l.e(false, 1.0f);
        this.f12171j.c(rect);
        this.f12170i.c(rect);
        if (e10 == 1.0f) {
            this.f12170i.a(canvas);
        } else {
            canvas.save();
            float f13 = 1.0f - e10;
            canvas.scale(f13, f13, rectF.centerX(), rectF.top);
            ch.f0 f0Var = this.f12171j;
            f0Var.h = f13;
            f0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e10, e10, rectF.centerX(), rectF.bottom);
            ch.f0 f0Var2 = this.f12170i;
            f0Var2.h = e10;
            f0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z9) {
        this.f12170i.b(z9);
        this.f12171j.b(z9);
        Timer timer = this.f12174m;
        if (timer != null) {
            timer.cancel();
            this.f12174m = null;
        }
        if (z9) {
            Timer timer2 = new Timer();
            this.f12174m = timer2;
            timer2.schedule(new h2(this, 0), 2000L, 2000L);
        }
    }
}

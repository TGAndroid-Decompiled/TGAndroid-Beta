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
    public ch.f0 f12177i;
    public ch.f0 f12178j;
    public int f12179k;
    public final org.telegram.ui.Components.v5 f12180l;
    public Timer f12181m;
    public final di.w8 f12182n;
    public final ArrayList f12183o;
    public final nd f12184p;

    public i2(nd ndVar) {
        super(ndVar);
        this.f12184p = ndVar;
        this.f12177i = new ch.f0(ndVar);
        this.f12178j = new ch.f0(ndVar);
        this.f12180l = new org.telegram.ui.Components.v5(ndVar);
        this.f12182n = new di.w8(ndVar);
        this.f12183o = new ArrayList();
        this.f11953a = 3;
        this.f11954b = org.telegram.messenger.g0.L(44.0f);
        this.f11955c = org.telegram.messenger.g0.L(36.0f);
        int i7 = k2.B1;
        ArrayList arrayList = ui.b0(((k2) ndVar.h).f28669a).h;
        for (int i10 = 0; i10 < Math.min(arrayList.size(), 8); i10++) {
            this.f12183o.add(ch.o0.c((TLRPC.TL_availableReaction) arrayList.get(i10)));
        }
        Collections.sort(this.f12183o, new a3.c(26));
        if (!this.f12183o.isEmpty()) {
            this.f12177i.e((ch.o0) this.f12183o.get(this.f12179k));
        }
        this.f12180l.e(true, 1.0f);
    }

    @Override
    public final void a(Canvas canvas, float f10, float f11) {
        float L = f11 - org.telegram.messenger.g0.L(4.0f);
        float f12 = this.f11954b;
        RectF rectF = this.f11957f;
        rectF.set((int) f10, (int) L, (int) (f10 + f12), (int) (L + f12));
        float a10 = this.f11958g.a(0.05f);
        canvas.save();
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        di.w8 w8Var = this.f12182n;
        w8Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        w8Var.draw(canvas);
        Rect rect = org.telegram.messenger.g0.Q;
        float L2 = org.telegram.messenger.g0.L(30.0f) / 2.0f;
        rect.set((int) (rectF.centerX() - L2), (int) (rectF.centerY() - L2), (int) (rectF.centerX() + L2), (int) (rectF.centerY() + L2));
        float e10 = this.f12180l.e(false, 1.0f);
        this.f12178j.c(rect);
        this.f12177i.c(rect);
        if (e10 == 1.0f) {
            this.f12177i.a(canvas);
        } else {
            canvas.save();
            float f13 = 1.0f - e10;
            canvas.scale(f13, f13, rectF.centerX(), rectF.top);
            ch.f0 f0Var = this.f12178j;
            f0Var.h = f13;
            f0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e10, e10, rectF.centerX(), rectF.bottom);
            ch.f0 f0Var2 = this.f12177i;
            f0Var2.h = e10;
            f0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z9) {
        this.f12177i.b(z9);
        this.f12178j.b(z9);
        Timer timer = this.f12181m;
        if (timer != null) {
            timer.cancel();
            this.f12181m = null;
        }
        if (z9) {
            Timer timer2 = new Timer();
            this.f12181m = timer2;
            timer2.schedule(new h2(this, 0), 2000L, 2000L);
        }
    }
}

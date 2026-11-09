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
    public ch.f0 f12173i;
    public ch.f0 f12174j;
    public int f12175k;
    public final org.telegram.ui.Components.w5 f12176l;
    public Timer f12177m;
    public final di.w8 f12178n;
    public final ArrayList f12179o;
    public final nd f12180p;

    public i2(nd ndVar) {
        super(ndVar);
        this.f12180p = ndVar;
        this.f12173i = new ch.f0(ndVar);
        this.f12174j = new ch.f0(ndVar);
        this.f12176l = new org.telegram.ui.Components.w5(ndVar);
        this.f12178n = new di.w8(ndVar);
        this.f12179o = new ArrayList();
        this.f11949a = 3;
        this.f11950b = org.telegram.messenger.g0.L(44.0f);
        this.f11951c = org.telegram.messenger.g0.L(36.0f);
        int i7 = k2.f12251y1;
        ArrayList arrayList = ui.b0(((k2) ndVar.h).f28621a).h;
        for (int i10 = 0; i10 < Math.min(arrayList.size(), 8); i10++) {
            this.f12179o.add(ch.o0.c((TLRPC.TL_availableReaction) arrayList.get(i10)));
        }
        Collections.sort(this.f12179o, new a3.c(26));
        if (!this.f12179o.isEmpty()) {
            this.f12173i.e((ch.o0) this.f12179o.get(this.f12175k));
        }
        this.f12176l.e(true, 1.0f);
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
        di.w8 w8Var = this.f12178n;
        w8Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        w8Var.draw(canvas);
        Rect rect = org.telegram.messenger.g0.Q;
        float L2 = org.telegram.messenger.g0.L(30.0f) / 2.0f;
        rect.set((int) (rectF.centerX() - L2), (int) (rectF.centerY() - L2), (int) (rectF.centerX() + L2), (int) (rectF.centerY() + L2));
        float e10 = this.f12176l.e(false, 1.0f);
        this.f12174j.c(rect);
        this.f12173i.c(rect);
        if (e10 == 1.0f) {
            this.f12173i.a(canvas);
        } else {
            canvas.save();
            float f13 = 1.0f - e10;
            canvas.scale(f13, f13, rectF.centerX(), rectF.top);
            ch.f0 f0Var = this.f12174j;
            f0Var.h = f13;
            f0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e10, e10, rectF.centerX(), rectF.bottom);
            ch.f0 f0Var2 = this.f12173i;
            f0Var2.h = e10;
            f0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z9) {
        this.f12173i.b(z9);
        this.f12174j.b(z9);
        Timer timer = this.f12177m;
        if (timer != null) {
            timer.cancel();
            this.f12177m = null;
        }
        if (z9) {
            Timer timer2 = new Timer();
            this.f12177m = timer2;
            timer2.schedule(new h2(this, 0), 2000L, 2000L);
        }
    }
}

package gi;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import ci.fc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import org.telegram.messenger.li;
import org.telegram.tgnet.TLRPC;
public final class g2 extends e2 {
    public dh.e0 f12823i;
    public dh.e0 f12824j;
    public int f12825k;
    public final org.telegram.ui.Components.u5 f12826l;
    public Timer f12827m;
    public final ei.v8 f12828n;
    public final ArrayList f12829o;
    public final fc f12830p;

    public g2(fc fcVar) {
        super(fcVar);
        this.f12830p = fcVar;
        this.f12823i = new dh.e0(fcVar);
        this.f12824j = new dh.e0(fcVar);
        this.f12826l = new org.telegram.ui.Components.u5(fcVar);
        this.f12828n = new ei.v8(fcVar);
        this.f12829o = new ArrayList();
        this.f12651a = 3;
        this.f12652b = org.telegram.messenger.g0.L(44.0f);
        this.f12653c = org.telegram.messenger.g0.L(36.0f);
        int i3 = i2.f12950z1;
        ArrayList arrayList = li.b0(((i2) fcVar.h).f28583a).h;
        for (int i10 = 0; i10 < Math.min(arrayList.size(), 8); i10++) {
            this.f12829o.add(dh.n0.c((TLRPC.TL_availableReaction) arrayList.get(i10)));
        }
        Collections.sort(this.f12829o, new a3.u(18));
        if (!this.f12829o.isEmpty()) {
            this.f12823i.e((dh.n0) this.f12829o.get(this.f12825k));
        }
        this.f12826l.e(true, 1.0f);
    }

    @Override
    public final void a(Canvas canvas, float f10, float f11) {
        float L = f11 - org.telegram.messenger.g0.L(4.0f);
        float f12 = this.f12652b;
        RectF rectF = this.f12655f;
        rectF.set((int) f10, (int) L, (int) (f10 + f12), (int) (L + f12));
        float a10 = this.f12656g.a(0.05f);
        canvas.save();
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        ei.v8 v8Var = this.f12828n;
        v8Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        v8Var.draw(canvas);
        Rect rect = org.telegram.messenger.g0.Q;
        float L2 = org.telegram.messenger.g0.L(30.0f) / 2.0f;
        rect.set((int) (rectF.centerX() - L2), (int) (rectF.centerY() - L2), (int) (rectF.centerX() + L2), (int) (rectF.centerY() + L2));
        float e10 = this.f12826l.e(false, 1.0f);
        this.f12824j.c(rect);
        this.f12823i.c(rect);
        if (e10 == 1.0f) {
            this.f12823i.a(canvas);
        } else {
            canvas.save();
            float f13 = 1.0f - e10;
            canvas.scale(f13, f13, rectF.centerX(), rectF.top);
            dh.e0 e0Var = this.f12824j;
            e0Var.h = f13;
            e0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e10, e10, rectF.centerX(), rectF.bottom);
            dh.e0 e0Var2 = this.f12823i;
            e0Var2.h = e10;
            e0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        this.f12823i.b(z10);
        this.f12824j.b(z10);
        Timer timer = this.f12827m;
        if (timer != null) {
            timer.cancel();
            this.f12827m = null;
        }
        if (z10) {
            Timer timer2 = new Timer();
            this.f12827m = timer2;
            timer2.schedule(new g6.q(this, 1), 2000L, 2000L);
        }
    }
}

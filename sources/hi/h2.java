package hi;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import di.yb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
public final class h2 extends f2 {
    public ch.g0 f14714i;
    public ch.g0 f14715j;
    public int f14716k;
    public final org.telegram.ui.Components.c6 f14717l;
    public Timer f14718m;
    public final fi.l8 f14719n;
    public final ArrayList f14720o;
    public final yb f14721p;

    public h2(yb ybVar) {
        super(ybVar);
        this.f14721p = ybVar;
        this.f14714i = new ch.g0(ybVar);
        this.f14715j = new ch.g0(ybVar);
        this.f14717l = new org.telegram.ui.Components.c6(ybVar);
        this.f14719n = new fi.l8(ybVar);
        this.f14720o = new ArrayList();
        this.f14645a = 3;
        this.f14646b = org.telegram.messenger.g0.L(44.0f);
        this.f14647c = org.telegram.messenger.g0.L(36.0f);
        int i7 = j2.C1;
        ArrayList arrayList = ri.d0(((j2) ybVar.h).f30189a).h;
        for (int i10 = 0; i10 < Math.min(arrayList.size(), 8); i10++) {
            this.f14720o.add(ch.p0.c((TLRPC.TL_availableReaction) arrayList.get(i10)));
        }
        Collections.sort(this.f14720o, new a3.c(28));
        if (!this.f14720o.isEmpty()) {
            this.f14714i.e((ch.p0) this.f14720o.get(this.f14716k));
        }
        this.f14717l.e(true, 1.0f);
    }

    @Override
    public final void a(Canvas canvas, float f10, float f11) {
        float L = f11 - org.telegram.messenger.g0.L(4.0f);
        float f12 = this.f14646b;
        RectF rectF = this.f14649f;
        rectF.set((int) f10, (int) L, (int) (f10 + f12), (int) (L + f12));
        float a10 = this.f14650g.a(0.05f);
        canvas.save();
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        fi.l8 l8Var = this.f14719n;
        l8Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        l8Var.draw(canvas);
        Rect rect = org.telegram.messenger.g0.Q;
        float L2 = org.telegram.messenger.g0.L(30.0f) / 2.0f;
        rect.set((int) (rectF.centerX() - L2), (int) (rectF.centerY() - L2), (int) (rectF.centerX() + L2), (int) (rectF.centerY() + L2));
        float e10 = this.f14717l.e(false, 1.0f);
        this.f14715j.c(rect);
        this.f14714i.c(rect);
        if (e10 == 1.0f) {
            this.f14714i.a(canvas);
        } else {
            canvas.save();
            float f13 = 1.0f - e10;
            canvas.scale(f13, f13, rectF.centerX(), rectF.top);
            ch.g0 g0Var = this.f14715j;
            g0Var.h = f13;
            g0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e10, e10, rectF.centerX(), rectF.bottom);
            ch.g0 g0Var2 = this.f14714i;
            g0Var2.h = e10;
            g0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        this.f14714i.b(z10);
        this.f14715j.b(z10);
        Timer timer = this.f14718m;
        if (timer != null) {
            timer.cancel();
            this.f14718m = null;
        }
        if (z10) {
            Timer timer2 = new Timer();
            this.f14718m = timer2;
            timer2.schedule(new h6.r(this, 1), 2000L, 2000L);
        }
    }
}

package hi;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
public final class o2 extends m2 {
    public ch.g0 f15143i;
    public ch.g0 f15144j;
    public int f15145k;
    public final org.telegram.ui.Components.c6 f15146l;
    public Timer f15147m;
    public final fi.l8 f15148n;
    public final ArrayList f15149o;
    public final p2 f15150p;

    public o2(p2 p2Var) {
        super(p2Var);
        this.f15150p = p2Var;
        this.f15143i = new ch.g0(p2Var);
        this.f15144j = new ch.g0(p2Var);
        this.f15146l = new org.telegram.ui.Components.c6(p2Var);
        this.f15148n = new fi.l8(p2Var);
        this.f15149o = new ArrayList();
        this.f14880a = 3;
        this.f14881b = org.telegram.messenger.g0.L(44.0f);
        this.f14882c = org.telegram.messenger.g0.L(36.0f);
        r2 r2Var = p2Var.f15180f;
        int i7 = r2.D1;
        ArrayList arrayList = ri.d0(r2Var.f30223a).h;
        for (int i10 = 0; i10 < Math.min(arrayList.size(), 8); i10++) {
            this.f15149o.add(ch.p0.c((TLRPC.TL_availableReaction) arrayList.get(i10)));
        }
        Collections.sort(this.f15149o, new a3.c(28));
        if (!this.f15149o.isEmpty()) {
            this.f15143i.e((ch.p0) this.f15149o.get(this.f15145k));
        }
        this.f15146l.e(true, 1.0f);
    }

    @Override
    public final void a(Canvas canvas, float f10, float f11) {
        float L = f11 - org.telegram.messenger.g0.L(4.0f);
        float f12 = this.f14881b;
        RectF rectF = this.f14884f;
        rectF.set((int) f10, (int) L, (int) (f10 + f12), (int) (L + f12));
        float a10 = this.f14885g.a(0.05f);
        canvas.save();
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        fi.l8 l8Var = this.f15148n;
        l8Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        l8Var.draw(canvas);
        Rect rect = org.telegram.messenger.g0.Q;
        float L2 = org.telegram.messenger.g0.L(30.0f) / 2.0f;
        rect.set((int) (rectF.centerX() - L2), (int) (rectF.centerY() - L2), (int) (rectF.centerX() + L2), (int) (rectF.centerY() + L2));
        float e10 = this.f15146l.e(false, 1.0f);
        this.f15144j.c(rect);
        this.f15143i.c(rect);
        if (e10 == 1.0f) {
            this.f15143i.a(canvas);
        } else {
            canvas.save();
            float f13 = 1.0f - e10;
            canvas.scale(f13, f13, rectF.centerX(), rectF.top);
            ch.g0 g0Var = this.f15144j;
            g0Var.h = f13;
            g0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e10, e10, rectF.centerX(), rectF.bottom);
            ch.g0 g0Var2 = this.f15143i;
            g0Var2.h = e10;
            g0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        this.f15143i.b(z10);
        this.f15144j.b(z10);
        Timer timer = this.f15147m;
        if (timer != null) {
            timer.cancel();
            this.f15147m = null;
        }
        if (z10) {
            Timer timer2 = new Timer();
            this.f15147m = timer2;
            timer2.schedule(new h6.s(this, 1), 2000L, 2000L);
        }
    }
}

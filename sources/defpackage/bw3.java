package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import org.telegram.tgnet.TLRPC;
public final class bw3 extends yv3 {
    public b09 i;
    public b09 j;
    public int k;
    public final lm l;
    public Timer m;
    public final b6b n;
    public final ArrayList o;
    public final cw3 p;

    public bw3(cw3 cw3Var) {
        super(cw3Var);
        ArrayList arrayList;
        this.p = cw3Var;
        this.i = new b09(cw3Var);
        this.j = new b09(cw3Var);
        this.l = new lm(cw3Var);
        this.n = new b6b(cw3Var);
        this.o = new ArrayList();
        this.a = (byte) 3;
        this.b = gl.L(44.0f);
        this.c = gl.L(36.0f);
        ew3 ew3Var = cw3Var.f;
        int i = ew3.C1;
        ArrayList arrayList2 = hq6.d0(ew3Var.a).h;
        int i2 = 0;
        while (true) {
            int min = Math.min(arrayList2.size(), 8);
            arrayList = this.o;
            if (i2 >= min) {
                break;
            }
            arrayList.add(h19.c((TLRPC.TL_availableReaction) arrayList2.get(i2)));
            i2++;
        }
        Collections.sort(arrayList, new mz2((byte) 15));
        if (!this.o.isEmpty()) {
            this.i.e((h19) this.o.get(this.k));
        }
        this.l.e(true, 1.0f);
    }

    @Override
    public final void a(Canvas canvas, float f, float f2) {
        float L = f2 - gl.L(4.0f);
        float f3 = this.b;
        RectF rectF = this.f;
        rectF.set((int) f, (int) L, (int) (f + f3), (int) (L + f3));
        float a = this.g.a(0.05f);
        canvas.save();
        canvas.scale(a, a, rectF.centerX(), rectF.centerY());
        b6b b6bVar = this.n;
        b6bVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        b6bVar.draw(canvas);
        Rect rect = gl.Q;
        float L2 = gl.L(30.0f) / 2.0f;
        rect.set((int) (rectF.centerX() - L2), (int) (rectF.centerY() - L2), (int) (rectF.centerX() + L2), (int) (rectF.centerY() + L2));
        float e = this.l.e(false, 1.0f);
        this.j.c(rect);
        this.i.c(rect);
        if (e == 1.0f) {
            this.i.a(canvas);
        } else {
            canvas.save();
            float f4 = 1.0f - e;
            canvas.scale(f4, f4, rectF.centerX(), rectF.top);
            b09 b09Var = this.j;
            b09Var.h = f4;
            b09Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e, e, rectF.centerX(), rectF.bottom);
            b09 b09Var2 = this.i;
            b09Var2.h = e;
            b09Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z) {
        this.i.b(z);
        this.j.b(z);
        Timer timer = this.m;
        if (timer != null) {
            timer.cancel();
            this.m = null;
        }
        if (z) {
            Timer timer2 = new Timer();
            this.m = timer2;
            timer2.schedule(new aw3(this, (byte) 0), 2000L, 2000L);
        }
    }
}

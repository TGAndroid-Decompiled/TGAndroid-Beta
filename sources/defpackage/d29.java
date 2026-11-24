package defpackage;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import j$.util.Objects;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class d29 {
    public final ImageReceiver a;
    public vm b;
    public k39 e;
    public View f;
    public boolean g;
    public boolean i;
    public int j;
    public PorterDuffColorFilter k;
    public final Rect c = new Rect();
    public final int d = z8c.t0;
    public float h = 1.0f;

    public d29(View view) {
        this.f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.a = imageReceiver;
        imageReceiver.A1 = true;
    }

    public final void a(Canvas canvas) {
        vm vmVar = this.b;
        Rect rect = this.c;
        if (vmVar != null) {
            mm mmVar = vmVar.k;
            if (mmVar != null) {
                mmVar.q0((int) (rect.width() * 0.1f));
            }
            this.b.setColorFilter(this.k);
            this.b.setBounds(rect);
            this.b.setAlpha((int) (this.h * 255.0f));
            this.b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.a;
        imageReceiver.i0(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.h(canvas, null);
    }

    public final void b(boolean z) {
        this.g = z;
        ImageReceiver imageReceiver = this.a;
        if (z) {
            imageReceiver.I();
            vm vmVar = this.b;
            if (vmVar != null) {
                vmVar.b(this.f);
                return;
            }
            return;
        }
        imageReceiver.K();
        vm vmVar2 = this.b;
        if (vmVar2 != null) {
            vmVar2.o(this.f);
        }
    }

    public final void c(Rect rect) {
        this.c.set(rect);
    }

    public final void d(int i) {
        if (this.j != i) {
            this.j = i;
            this.k = new PorterDuffColorFilter(this.j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(k39 k39Var) {
        String str;
        int i;
        if (!Objects.equals(this.e, k39Var)) {
            ImageReceiver imageReceiver = this.a;
            imageReceiver.f();
            vm vmVar = this.b;
            if (vmVar != null) {
                vmVar.o(this.f);
                this.b = null;
            }
            this.e = k39Var;
            boolean z = this.i;
            if (z) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            if (k39Var.f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hs6.d0(this.d).r.get(k39Var.f);
                if (tL_availableReaction != null) {
                    imageReceiver.Z(gn5.b(tL_availableReaction.select_animation), str, null, null, eq3.f(tL_availableReaction.select_animation, cmb.l6, 0.2f, null), 0L, "tgs", k39Var, 0);
                    return;
                }
                return;
            }
            if (z) {
                i = 13;
            } else {
                i = 1;
            }
            vm vmVar2 = new vm(i, z8c.t0, k39Var.g);
            this.b = vmVar2;
            if (this.g) {
                vmVar2.b(this.f);
            }
            vm vmVar3 = this.b;
            this.j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.k = porterDuffColorFilter;
            vmVar3.setColorFilter(porterDuffColorFilter);
        }
    }
}

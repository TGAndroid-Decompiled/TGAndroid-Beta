package mi;

import org.telegram.ui.Components.am;
import org.telegram.ui.Components.zl;
public final class b0 implements Runnable {
    public final int f19469a;
    public Object f19470b;

    public b0() {
        this.f19469a = 6;
    }

    private final void a() {
        boolean z10;
        float f10;
        zl zlVar = (zl) this.f19470b;
        am amVar = zlVar.Q;
        if (amVar.K != null && !amVar.L) {
            int computeVerticalScrollOffset = amVar.f31896r.computeVerticalScrollOffset();
            if (amVar.f31896r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (zlVar.e() - zlVar.f41068r) + zlVar.f41067n) {
                z10 = true;
            } else {
                z10 = false;
            }
            float max = Math.max(0.0f, (amVar.F - Math.max(0, computeVerticalScrollOffset - amVar.getListTopPadding())) - org.telegram.messenger.g0.L(52.0f));
            float max2 = Math.max(0.0f, ((amVar.f31896r.getMeasuredHeight() - (amVar.F - computeVerticalScrollOffset)) - amVar.getListTopPadding()) - org.telegram.messenger.g0.L(84.0f));
            float L = org.telegram.messenger.g0.L(32.0f);
            if (max < L && computeVerticalScrollOffset > amVar.getListTopPadding()) {
                f10 = (-(1.0f - (max / L))) * org.telegram.messenger.g0.L(6.0f);
            } else if (max2 < L) {
                f10 = org.telegram.messenger.g0.L(6.0f) * (1.0f - (max2 / L));
            } else {
                f10 = 0.0f;
            }
            int i3 = (int) f10;
            if (Math.abs(i3) > 0 && amVar.f31896r.canScrollVertically(i3) && (f10 <= 0.0f || !z10)) {
                amVar.F += f10;
                amVar.f31896r.scrollBy(0, i3);
                zlVar.invalidate();
            }
            zlVar.M = true;
            zlVar.postDelayed(this, 15L);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: mi.b0.run():void");
    }

    public b0(Object obj, int i3) {
        this.f19469a = i3;
        this.f19470b = obj;
    }

    public b0(gi.w5 w5Var, int i3) {
        this.f19469a = 1;
        this.f19470b = w5Var;
    }
}

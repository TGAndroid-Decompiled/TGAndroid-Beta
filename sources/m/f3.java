package m;

import org.telegram.ui.Components.am;
import org.telegram.ui.Components.zl;
public final class f3 implements Runnable {
    public final int f19109a;
    public Object f19110b;

    public f3() {
        this.f19109a = 7;
    }

    private final void a() {
        boolean z9;
        float f10;
        zl zlVar = (zl) this.f19110b;
        am amVar = zlVar.P;
        if (amVar.J != null && !amVar.K) {
            int computeVerticalScrollOffset = amVar.f31880r.computeVerticalScrollOffset();
            if (amVar.f31880r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (zlVar.e() - zlVar.f41059r) + zlVar.f41058n) {
                z9 = true;
            } else {
                z9 = false;
            }
            float max = Math.max(0.0f, (amVar.E - Math.max(0, computeVerticalScrollOffset - amVar.getListTopPadding())) - org.telegram.messenger.g0.L(52.0f));
            float max2 = Math.max(0.0f, ((amVar.f31880r.getMeasuredHeight() - (amVar.E - computeVerticalScrollOffset)) - amVar.getListTopPadding()) - org.telegram.messenger.g0.L(84.0f));
            float L = org.telegram.messenger.g0.L(32.0f);
            if (max < L && computeVerticalScrollOffset > amVar.getListTopPadding()) {
                f10 = (-(1.0f - (max / L))) * org.telegram.messenger.g0.L(6.0f);
            } else if (max2 < L) {
                f10 = org.telegram.messenger.g0.L(6.0f) * (1.0f - (max2 / L));
            } else {
                f10 = 0.0f;
            }
            int i7 = (int) f10;
            if (Math.abs(i7) > 0 && amVar.f31880r.canScrollVertically(i7) && (f10 <= 0.0f || !z9)) {
                amVar.E += f10;
                amVar.f31880r.scrollBy(0, i7);
                zlVar.invalidate();
            }
            zlVar.L = true;
            zlVar.postDelayed(this, 15L);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: m.f3.run():void");
    }

    public f3(Object obj, int i7) {
        this.f19109a = i7;
        this.f19110b = obj;
    }

    public f3(gf.g gVar, int i7) {
        this.f19109a = 3;
        this.f19110b = gVar;
    }
}

package m;

import org.telegram.ui.Components.am;
import org.telegram.ui.Components.bm;
public final class f3 implements Runnable {
    public final int f19104a;
    public Object f19105b;

    public f3() {
        this.f19104a = 7;
    }

    private final void a() {
        boolean z9;
        float f10;
        am amVar = (am) this.f19105b;
        bm bmVar = amVar.P;
        if (bmVar.J != null && !bmVar.K) {
            int computeVerticalScrollOffset = bmVar.f32277r.computeVerticalScrollOffset();
            if (bmVar.f32277r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (amVar.e() - amVar.f31917r) + amVar.f31916n) {
                z9 = true;
            } else {
                z9 = false;
            }
            float max = Math.max(0.0f, (bmVar.E - Math.max(0, computeVerticalScrollOffset - bmVar.getListTopPadding())) - org.telegram.messenger.g0.L(52.0f));
            float max2 = Math.max(0.0f, ((bmVar.f32277r.getMeasuredHeight() - (bmVar.E - computeVerticalScrollOffset)) - bmVar.getListTopPadding()) - org.telegram.messenger.g0.L(84.0f));
            float L = org.telegram.messenger.g0.L(32.0f);
            if (max < L && computeVerticalScrollOffset > bmVar.getListTopPadding()) {
                f10 = (-(1.0f - (max / L))) * org.telegram.messenger.g0.L(6.0f);
            } else if (max2 < L) {
                f10 = org.telegram.messenger.g0.L(6.0f) * (1.0f - (max2 / L));
            } else {
                f10 = 0.0f;
            }
            int i7 = (int) f10;
            if (Math.abs(i7) > 0 && bmVar.f32277r.canScrollVertically(i7) && (f10 <= 0.0f || !z9)) {
                bmVar.E += f10;
                bmVar.f32277r.scrollBy(0, i7);
                amVar.invalidate();
            }
            amVar.L = true;
            amVar.postDelayed(this, 15L);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: m.f3.run():void");
    }

    public f3(Object obj, int i7) {
        this.f19104a = i7;
        this.f19105b = obj;
    }

    public f3(gf.g gVar, int i7) {
        this.f19104a = 3;
        this.f19105b = gVar;
    }
}

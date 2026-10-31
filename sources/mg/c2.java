package mg;

import org.telegram.ui.Components.im;
import org.telegram.ui.Components.jm;
public final class c2 implements Runnable {
    public final int f13085a;
    public Object f13086b;

    public c2() {
        this.f13085a = 5;
    }

    private final void a() {
        boolean z10;
        float f7;
        im imVar = (im) this.f13086b;
        jm jmVar = imVar.P;
        if (jmVar.J != null && !jmVar.K) {
            int computeVerticalScrollOffset = jmVar.f27402r.computeVerticalScrollOffset();
            if (jmVar.f27402r.computeVerticalScrollExtent() + computeVerticalScrollOffset >= (imVar.e() - imVar.f27013r) + imVar.f27012n) {
                z10 = true;
            } else {
                z10 = false;
            }
            float max = Math.max(0.0f, (jmVar.E - Math.max(0, computeVerticalScrollOffset - jmVar.getListTopPadding())) - org.telegram.messenger.i0.L(52.0f));
            float max2 = Math.max(0.0f, ((jmVar.f27402r.getMeasuredHeight() - (jmVar.E - computeVerticalScrollOffset)) - jmVar.getListTopPadding()) - org.telegram.messenger.i0.L(84.0f));
            float L = org.telegram.messenger.i0.L(32.0f);
            if (max < L && computeVerticalScrollOffset > jmVar.getListTopPadding()) {
                f7 = (-(1.0f - (max / L))) * org.telegram.messenger.i0.L(6.0f);
            } else if (max2 < L) {
                f7 = org.telegram.messenger.i0.L(6.0f) * (1.0f - (max2 / L));
            } else {
                f7 = 0.0f;
            }
            int i10 = (int) f7;
            if (Math.abs(i10) > 0 && jmVar.f27402r.canScrollVertically(i10) && (f7 <= 0.0f || !z10)) {
                jmVar.E += f7;
                jmVar.f27402r.scrollBy(0, i10);
                imVar.invalidate();
            }
            imVar.L = true;
            imVar.postDelayed(this, 15L);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: mg.c2.run():void");
    }

    public c2(Object obj, int i10) {
        this.f13085a = i10;
        this.f13086b = obj;
    }

    public c2(za.c cVar, int i10) {
        this.f13085a = 1;
        this.f13086b = cVar;
    }
}

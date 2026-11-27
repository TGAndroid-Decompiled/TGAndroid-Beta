package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class d0a implements u69 {
    public final int a;
    public final Context b;
    public final vnb c;
    public final Integer d;
    public final n1a e;

    public d0a(n1a n1aVar, int i, Context context, vnb vnbVar, Integer num) {
        this.e = n1aVar;
        this.a = i;
        this.b = context;
        this.c = vnbVar;
        this.d = num;
    }

    @Override
    public final boolean mo8d(float f, float f2, int i, View view) {
        n1a n1aVar = this.e;
        int i2 = n1aVar.W;
        int i3 = this.a;
        if (i3 != 11 && i3 != 13 && n1aVar.i1 && (view instanceof w0a)) {
            if (i3 != 1 && i3 != 8) {
                w0a w0aVar = (w0a) view;
                if (w0aVar.e != null && (i3 == 0 || i3 == 12 || i3 == 9 || i3 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = w0aVar.w;
                    c0a c0aVar = new c0a(this, this.b, n1aVar.V1, n1aVar, w0aVar, this.c, view, tL_starGiftUnique);
                    n1aVar.Y0 = c0aVar;
                    c0aVar.show();
                    try {
                        view.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    return true;
                }
            } else {
                n1aVar.k();
                try {
                    n1aVar.performHapticFeedback(0);
                } catch (Exception unused2) {
                }
                w0a w0aVar2 = (w0a) view;
                if (!w0aVar2.s && !yac.h(i2).p()) {
                    hm hmVar = w0aVar2.e;
                    TLRPC.Document document = hmVar.document;
                    if (document == null) {
                        document = wl.e(i2, hmVar.documentId);
                    }
                    n1aVar.o(w0aVar2, Long.valueOf(w0aVar2.e.documentId), document, w0aVar2.w, null);
                    return true;
                }
                n1aVar.T0 = w0aVar2;
                n1aVar.V0 = 0.0f;
                n1aVar.U0 = false;
                if (w0aVar2.s) {
                    n1a.c(n1aVar, null);
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ls6.d0(i2).r.get(n1aVar.T0.y.f);
                    if (tL_availableReaction != null) {
                        n1aVar.W0.Z(jn5.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", n1aVar.T0.y, 0);
                    }
                } else {
                    n1a.c(n1aVar, new wl(4, i2, n1aVar.T0.e.documentId));
                }
                n1aVar.i0.invalidate();
                n1aVar.l();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void f() {
        n1a n1aVar = this.e;
        if (n1aVar.T0 != null) {
            n1aVar.U0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(n1aVar.V0, 0.0f);
            ofFloat.addUpdateListener(new b49(this, (byte) 18));
            ofFloat.addListener(new po9(this, (byte) 6));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(k43.f);
            ofFloat.start();
        }
    }

    @Override
    public final void h(float f) {
    }
}

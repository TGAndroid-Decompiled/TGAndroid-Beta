package eh;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.w;
import cg.n0;
import org.telegram.messenger.g0;
public final class f {
    public final e f10009b;
    public final e f10010c;
    public long f10011e;
    public final RenderNode f10008a = w.c();
    public final Rect d = new Rect();

    public f(g gVar) {
        int i3;
        boolean z10 = gVar.f10012a;
        boolean z11 = gVar.f10014c;
        if (z10) {
            if (z11) {
                e eVar = new e(gVar, "glass", 0, true);
                this.f10010c = eVar;
                eVar.f10003e = 4;
                eVar.f10004f = 4;
                eVar.d(g0.N(6.0f), n0.d());
            } else {
                e eVar2 = new e(gVar, "glass", 1, true);
                this.f10010c = eVar2;
                eVar2.f10003e = 4;
                eVar2.f10004f = 4;
                eVar2.c(g0.N(6.0f));
                eVar2.e(n0.d());
            }
            e eVar3 = new e(gVar, "blur", 0, false);
            this.f10009b = eVar3;
            eVar3.f10003e = 8;
            eVar3.f10004f = 8;
            eVar3.c(g0.N(38.34f));
        } else if (z11) {
            e eVar4 = new e(gVar, "blur", 0, false);
            this.f10009b = eVar4;
            boolean z12 = gVar.f10013b;
            if (z12) {
                i3 = 16;
            } else {
                i3 = 8;
            }
            int i10 = z12 ? 16 : 8;
            eVar4.f10003e = i3;
            eVar4.f10004f = i10;
            eVar4.d(g0.N(40.0f), n0.d());
            this.f10010c = null;
        } else {
            e eVar5 = new e(gVar, "blur", 1, false);
            this.f10009b = eVar5;
            eVar5.f10003e = 8;
            eVar5.f10004f = 8;
            eVar5.c(g0.N(40.0f));
            eVar5.e(n0.d());
            this.f10010c = null;
        }
    }

    public static void a(f fVar, RectF rectF) {
        Rect rect = fVar.d;
        float f10 = rectF.left;
        float f11 = 16;
        rect.left = Math.round(f10 - (f10 % f11));
        float f12 = rectF.top;
        rect.top = Math.round(f12 - (f12 % f11));
        float f13 = rectF.right;
        rect.right = Math.round((f11 - (f13 % f11)) + f13);
        float f14 = rectF.bottom;
        rect.bottom = Math.round((f11 - (f14 % f11)) + f14);
    }
}

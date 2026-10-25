package ch;

import ag.t0;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.x;
import org.telegram.messenger.AndroidUtilities;
public final class e {
    public final d f6322b;
    public final d f6323c;
    public long e;
    public final RenderNode f6321a = x.c();
    public final Rect d = new Rect();

    public e(f fVar) {
        int i10;
        boolean z10 = fVar.f6324a;
        boolean z11 = fVar.f6326c;
        if (z10) {
            if (z11) {
                d dVar = new d(fVar, "glass", 0, true);
                this.f6323c = dVar;
                dVar.e = 4;
                dVar.f6317f = 4;
                dVar.d(AndroidUtilities.dpf2(6.0f), t0.d());
            } else {
                d dVar2 = new d(fVar, "glass", 1, true);
                this.f6323c = dVar2;
                dVar2.e = 4;
                dVar2.f6317f = 4;
                dVar2.c(AndroidUtilities.dpf2(6.0f));
                dVar2.e(t0.d());
            }
            d dVar3 = new d(fVar, "blur", 0, false);
            this.f6322b = dVar3;
            dVar3.e = 8;
            dVar3.f6317f = 8;
            dVar3.c(AndroidUtilities.dpf2(38.34f));
        } else if (z11) {
            d dVar4 = new d(fVar, "blur", 0, false);
            this.f6322b = dVar4;
            boolean z12 = fVar.f6325b;
            if (z12) {
                i10 = 16;
            } else {
                i10 = 8;
            }
            int i11 = z12 ? 16 : 8;
            dVar4.e = i10;
            dVar4.f6317f = i11;
            dVar4.d(AndroidUtilities.dpf2(40.0f), t0.d());
            this.f6323c = null;
        } else {
            d dVar5 = new d(fVar, "blur", 1, false);
            this.f6322b = dVar5;
            dVar5.e = 8;
            dVar5.f6317f = 8;
            dVar5.c(AndroidUtilities.dpf2(40.0f));
            dVar5.e(t0.d());
            this.f6323c = null;
        }
    }

    public static void a(e eVar, RectF rectF) {
        Rect rect = eVar.d;
        float f7 = rectF.left;
        float f10 = 16;
        rect.left = Math.round(f7 - (f7 % f10));
        float f11 = rectF.top;
        rect.top = Math.round(f11 - (f11 % f10));
        float f12 = rectF.right;
        rect.right = Math.round((f10 - (f12 % f10)) + f12);
        float f13 = rectF.bottom;
        rect.bottom = Math.round((f10 - (f13 % f10)) + f13);
    }
}

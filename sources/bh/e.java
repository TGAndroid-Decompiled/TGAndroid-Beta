package bh;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.x;
import org.telegram.messenger.AndroidUtilities;
import zf.g0;
public final class e {
    public final d f4385b;
    public final d f4386c;
    public long e;
    public final RenderNode f4384a = x.c();
    public final Rect d = new Rect();

    public e(f fVar) {
        int i10;
        if (fVar.f4387a) {
            d dVar = new d(fVar, "glass", 0, true);
            this.f4386c = dVar;
            dVar.e = 4;
            dVar.f4380f = 4;
            dVar.d(AndroidUtilities.dpf2(6.0f), g0.b());
            d dVar2 = new d(fVar, "blur", 0, false);
            this.f4385b = dVar2;
            dVar2.e = 8;
            dVar2.f4380f = 8;
            dVar2.c(AndroidUtilities.dpf2(38.34f));
        } else if (fVar.f4389c) {
            d dVar3 = new d(fVar, "blur", 0, false);
            this.f4385b = dVar3;
            boolean z10 = fVar.f4388b;
            if (z10) {
                i10 = 16;
            } else {
                i10 = 8;
            }
            int i11 = z10 ? 16 : 8;
            dVar3.e = i10;
            dVar3.f4380f = i11;
            dVar3.d(AndroidUtilities.dpf2(40.0f), g0.b());
            this.f4386c = null;
        } else {
            d dVar4 = new d(fVar, "blur", 1, false);
            this.f4385b = dVar4;
            dVar4.e = 8;
            dVar4.f4380f = 8;
            dVar4.c(AndroidUtilities.dpf2(40.0f));
            dVar4.e(g0.b());
            this.f4386c = null;
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

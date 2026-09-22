package ah;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import org.telegram.messenger.AndroidUtilities;
import yf.f0;
public final class g {
    public final f f450b;
    public final f f451c;
    public long e;
    public final RenderNode f449a = e.c();
    public final Rect d = new Rect();

    public g(h hVar) {
        int i10;
        if (hVar.f452a) {
            f fVar = new f(hVar, "glass", 0, true);
            this.f451c = fVar;
            fVar.e = 4;
            fVar.f445f = 4;
            fVar.d(AndroidUtilities.dpf2(6.0f), f0.b());
            f fVar2 = new f(hVar, "blur", 0, false);
            this.f450b = fVar2;
            fVar2.e = 8;
            fVar2.f445f = 8;
            fVar2.c(AndroidUtilities.dpf2(38.34f));
        } else if (hVar.f454c) {
            f fVar3 = new f(hVar, "blur", 0, false);
            this.f450b = fVar3;
            boolean z10 = hVar.f453b;
            if (z10) {
                i10 = 16;
            } else {
                i10 = 8;
            }
            int i11 = z10 ? 16 : 8;
            fVar3.e = i10;
            fVar3.f445f = i11;
            fVar3.d(AndroidUtilities.dpf2(40.0f), f0.b());
            this.f451c = null;
        } else {
            f fVar4 = new f(hVar, "blur", 1, false);
            this.f450b = fVar4;
            fVar4.e = 8;
            fVar4.f445f = 8;
            fVar4.c(AndroidUtilities.dpf2(40.0f));
            fVar4.e(f0.b());
            this.f451c = null;
        }
    }

    public static void a(g gVar, RectF rectF) {
        Rect rect = gVar.d;
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

package ah;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import org.telegram.messenger.AndroidUtilities;
import yf.f0;
public final class g {
    public final f f574b;
    public final f f575c;
    public long f576e;
    public final RenderNode f573a = e.c();
    public final Rect d = new Rect();

    public g(h hVar) {
        int i10;
        if (hVar.f577a) {
            f fVar = new f(hVar, "glass", 0, true);
            this.f575c = fVar;
            fVar.f568e = 4;
            fVar.f569f = 4;
            fVar.d(AndroidUtilities.dpf2(6.0f), f0.b());
            f fVar2 = new f(hVar, "blur", 0, false);
            this.f574b = fVar2;
            fVar2.f568e = 8;
            fVar2.f569f = 8;
            fVar2.c(AndroidUtilities.dpf2(38.34f));
        } else if (hVar.f579c) {
            f fVar3 = new f(hVar, "blur", 0, false);
            this.f574b = fVar3;
            boolean z10 = hVar.f578b;
            if (z10) {
                i10 = 16;
            } else {
                i10 = 8;
            }
            int i11 = z10 ? 16 : 8;
            fVar3.f568e = i10;
            fVar3.f569f = i11;
            fVar3.d(AndroidUtilities.dpf2(40.0f), f0.b());
            this.f575c = null;
        } else {
            f fVar4 = new f(hVar, "blur", 1, false);
            this.f574b = fVar4;
            fVar4.f568e = 8;
            fVar4.f569f = 8;
            fVar4.c(AndroidUtilities.dpf2(40.0f));
            fVar4.e(f0.b());
            this.f575c = null;
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

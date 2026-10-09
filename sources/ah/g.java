package ah;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import org.telegram.messenger.AndroidUtilities;
import yf.f0;
public final class g {
    public final f f572b;
    public final f f573c;
    public long f574e;
    public final RenderNode f571a = e.c();
    public final Rect d = new Rect();

    public g(h hVar) {
        int i10;
        if (hVar.f575a) {
            f fVar = new f(hVar, "glass", 0, true);
            this.f573c = fVar;
            fVar.f566e = 4;
            fVar.f567f = 4;
            fVar.d(AndroidUtilities.dpf2(6.0f), f0.b());
            f fVar2 = new f(hVar, "blur", 0, false);
            this.f572b = fVar2;
            fVar2.f566e = 8;
            fVar2.f567f = 8;
            fVar2.c(AndroidUtilities.dpf2(38.34f));
        } else if (hVar.f577c) {
            f fVar3 = new f(hVar, "blur", 0, false);
            this.f572b = fVar3;
            boolean z10 = hVar.f576b;
            if (z10) {
                i10 = 16;
            } else {
                i10 = 8;
            }
            int i11 = z10 ? 16 : 8;
            fVar3.f566e = i10;
            fVar3.f567f = i11;
            fVar3.d(AndroidUtilities.dpf2(40.0f), f0.b());
            this.f573c = null;
        } else {
            f fVar4 = new f(hVar, "blur", 1, false);
            this.f572b = fVar4;
            fVar4.f566e = 8;
            fVar4.f567f = 8;
            fVar4.c(AndroidUtilities.dpf2(40.0f));
            fVar4.e(f0.b());
            this.f573c = null;
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

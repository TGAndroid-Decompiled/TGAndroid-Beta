package ah;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import org.telegram.messenger.AndroidUtilities;
import yf.f0;
public final class h {
    public final g f449b;
    public final g f450c;
    public long e;
    public final RenderNode f448a = f.c();
    public final Rect d = new Rect();

    public h(i iVar) {
        int i10;
        if (iVar.f451a) {
            g gVar = new g(iVar, "glass", 0, true);
            this.f450c = gVar;
            gVar.e = 4;
            gVar.f444f = 4;
            gVar.d(AndroidUtilities.dpf2(6.0f), f0.b());
            g gVar2 = new g(iVar, "blur", 0, false);
            this.f449b = gVar2;
            gVar2.e = 8;
            gVar2.f444f = 8;
            gVar2.c(AndroidUtilities.dpf2(38.34f));
        } else if (iVar.f453c) {
            g gVar3 = new g(iVar, "blur", 0, false);
            this.f449b = gVar3;
            boolean z10 = iVar.f452b;
            if (z10) {
                i10 = 16;
            } else {
                i10 = 8;
            }
            int i11 = z10 ? 16 : 8;
            gVar3.e = i10;
            gVar3.f444f = i11;
            gVar3.d(AndroidUtilities.dpf2(40.0f), f0.b());
            this.f450c = null;
        } else {
            g gVar4 = new g(iVar, "blur", 1, false);
            this.f449b = gVar4;
            gVar4.e = 8;
            gVar4.f444f = 8;
            gVar4.c(AndroidUtilities.dpf2(40.0f));
            gVar4.e(f0.b());
            this.f450c = null;
        }
    }

    public static void a(h hVar, RectF rectF) {
        Rect rect = hVar.d;
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

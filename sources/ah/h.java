package ah;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import org.telegram.messenger.AndroidUtilities;
import yf.g0;
public final class h {
    public final g f452b;
    public final g f453c;
    public long e;
    public final RenderNode f451a = f.c();
    public final Rect d = new Rect();

    public h(i iVar) {
        int i10;
        if (iVar.f454a) {
            g gVar = new g(iVar, "glass", 0, true);
            this.f453c = gVar;
            gVar.e = 4;
            gVar.f447f = 4;
            gVar.d(AndroidUtilities.dpf2(6.0f), g0.b());
            g gVar2 = new g(iVar, "blur", 0, false);
            this.f452b = gVar2;
            gVar2.e = 8;
            gVar2.f447f = 8;
            gVar2.c(AndroidUtilities.dpf2(38.34f));
        } else if (iVar.f456c) {
            g gVar3 = new g(iVar, "blur", 0, false);
            this.f452b = gVar3;
            boolean z10 = iVar.f455b;
            if (z10) {
                i10 = 16;
            } else {
                i10 = 8;
            }
            int i11 = z10 ? 16 : 8;
            gVar3.e = i10;
            gVar3.f447f = i11;
            gVar3.d(AndroidUtilities.dpf2(40.0f), g0.b());
            this.f453c = null;
        } else {
            g gVar4 = new g(iVar, "blur", 1, false);
            this.f452b = gVar4;
            gVar4.e = 8;
            gVar4.f447f = 8;
            gVar4.c(AndroidUtilities.dpf2(40.0f));
            gVar4.e(g0.b());
            this.f453c = null;
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

package ah;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import e0.h0;
import org.telegram.messenger.AndroidUtilities;
public final class h {
    public final g f488b;
    public final g f489c;
    public long f490e;
    public final RenderNode f487a = f.c();
    public final Rect d = new Rect();

    public h(i iVar) {
        int i10;
        boolean z10 = iVar.f491a;
        boolean z11 = iVar.f493c;
        if (z10) {
            if (z11) {
                g gVar = new g(iVar, "glass", 0, true);
                this.f489c = gVar;
                gVar.f482e = 4;
                gVar.f483f = 4;
                gVar.d(AndroidUtilities.dpf2(6.0f), h0.c());
            } else {
                g gVar2 = new g(iVar, "glass", 1, true);
                this.f489c = gVar2;
                gVar2.f482e = 4;
                gVar2.f483f = 4;
                gVar2.c(AndroidUtilities.dpf2(6.0f));
                gVar2.e(h0.c());
            }
            g gVar3 = new g(iVar, "blur", 0, false);
            this.f488b = gVar3;
            gVar3.f482e = 8;
            gVar3.f483f = 8;
            gVar3.c(AndroidUtilities.dpf2(38.34f));
        } else if (z11) {
            g gVar4 = new g(iVar, "blur", 0, false);
            this.f488b = gVar4;
            boolean z12 = iVar.f492b;
            if (z12) {
                i10 = 16;
            } else {
                i10 = 8;
            }
            int i11 = z12 ? 16 : 8;
            gVar4.f482e = i10;
            gVar4.f483f = i11;
            gVar4.d(AndroidUtilities.dpf2(40.0f), h0.c());
            this.f489c = null;
        } else {
            g gVar5 = new g(iVar, "blur", 1, false);
            this.f488b = gVar5;
            gVar5.f482e = 8;
            gVar5.f483f = 8;
            gVar5.c(AndroidUtilities.dpf2(40.0f));
            gVar5.e(h0.c());
            this.f489c = null;
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

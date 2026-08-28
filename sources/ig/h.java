package ig;

import android.graphics.RenderNode;
import g.x;
public final class h {
    public final RenderNode f11184a;
    public final g f11185b;
    public final x f11186c = new Object();
    public long d = 0;
    public int f11187e;
    public int f11188f;

    public h(RenderNode renderNode, g gVar) {
        this.f11184a = renderNode;
        this.f11185b = gVar;
    }

    public final void a() {
        long j10;
        int width = this.f11184a.getWidth();
        int height = this.f11184a.getHeight();
        x xVar = this.f11186c;
        xVar.f7045a = 0L;
        boolean z10 = false;
        xVar.f7046b = false;
        g gVar = this.f11185b;
        gVar.x0(xVar);
        if (xVar.f7046b) {
            j10 = -1;
        } else {
            j10 = xVar.f7045a;
        }
        z10 = (this.f11184a.hasDisplayList() && width == this.f11187e && height == this.f11188f && j10 == this.d && j10 != -1) ? true : true;
        this.f11187e = width;
        this.f11188f = height;
        this.d = j10;
        if (z10) {
            gVar.k(this.f11184a.beginRecording());
            this.f11184a.endRecording();
        }
    }
}

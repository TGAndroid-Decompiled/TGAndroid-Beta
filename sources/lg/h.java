package lg;

import android.graphics.RenderNode;
import g.x;
public final class h {
    public final RenderNode f15277a;
    public final g f15278b;
    public final x f15279c = new Object();
    public long d = 0;
    public int f15280e;
    public int f15281f;

    public h(RenderNode renderNode, g gVar) {
        this.f15277a = renderNode;
        this.f15278b = gVar;
    }

    public final void a() {
        long j10;
        int width = this.f15277a.getWidth();
        int height = this.f15277a.getHeight();
        x xVar = this.f15279c;
        xVar.f6955a = 0L;
        boolean z10 = false;
        xVar.f6956b = false;
        g gVar = this.f15278b;
        gVar.q(xVar);
        if (xVar.f6956b) {
            j10 = -1;
        } else {
            j10 = xVar.f6955a;
        }
        z10 = (this.f15277a.hasDisplayList() && width == this.f15280e && height == this.f15281f && j10 == this.d && j10 != -1) ? true : true;
        this.f15280e = width;
        this.f15281f = height;
        this.d = j10;
        if (z10) {
            gVar.d(this.f15277a.beginRecording());
            this.f15277a.endRecording();
        }
    }
}

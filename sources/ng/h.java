package ng;

import android.graphics.RenderNode;
import g.x;
public final class h {
    public final RenderNode f14999a;
    public final g f15000b;
    public final x f15001c = new Object();
    public long d = 0;
    public int e;
    public int f15002f;

    public h(RenderNode renderNode, g gVar) {
        this.f14999a = renderNode;
        this.f15000b = gVar;
    }

    public final void a() {
        long j10;
        int width = this.f14999a.getWidth();
        int height = this.f14999a.getHeight();
        x xVar = this.f15001c;
        xVar.f6326a = 0L;
        boolean z4 = false;
        xVar.f6327b = false;
        g gVar = this.f15000b;
        gVar.D1(xVar);
        if (xVar.f6327b) {
            j10 = -1;
        } else {
            j10 = xVar.f6326a;
        }
        z4 = (this.f14999a.hasDisplayList() && width == this.e && height == this.f15002f && j10 == this.d && j10 != -1) ? true : true;
        this.e = width;
        this.f15002f = height;
        this.d = j10;
        if (z4) {
            gVar.D(this.f14999a.beginRecording());
            this.f14999a.endRecording();
        }
    }
}

package ng;

import android.graphics.RenderNode;
import g.x;
public final class h {
    public final RenderNode f15019a;
    public final g f15020b;
    public final x f15021c = new Object();
    public long d = 0;
    public int e;
    public int f15022f;

    public h(RenderNode renderNode, g gVar) {
        this.f15019a = renderNode;
        this.f15020b = gVar;
    }

    public final void a() {
        long j10;
        int width = this.f15019a.getWidth();
        int height = this.f15019a.getHeight();
        x xVar = this.f15021c;
        xVar.f6326a = 0L;
        boolean z4 = false;
        xVar.f6327b = false;
        g gVar = this.f15020b;
        gVar.Y(xVar);
        if (xVar.f6327b) {
            j10 = -1;
        } else {
            j10 = xVar.f6326a;
        }
        z4 = (this.f15019a.hasDisplayList() && width == this.e && height == this.f15022f && j10 == this.d && j10 != -1) ? true : true;
        this.e = width;
        this.f15022f = height;
        this.d = j10;
        if (z4) {
            gVar.k(this.f15019a.beginRecording());
            this.f15019a.endRecording();
        }
    }
}

package og;

import android.graphics.RenderNode;
import g.x;
public final class h {
    public final RenderNode f16807a;
    public final g f16808b;
    public final x f16809c = new Object();
    public long d = 0;
    public int f16810e;
    public int f16811f;

    public h(RenderNode renderNode, g gVar) {
        this.f16807a = renderNode;
        this.f16808b = gVar;
    }

    public final void a() {
        long j10;
        int width = this.f16807a.getWidth();
        int height = this.f16807a.getHeight();
        x xVar = this.f16809c;
        xVar.f6799a = 0L;
        boolean z4 = false;
        xVar.f6800b = false;
        g gVar = this.f16808b;
        gVar.P(xVar);
        if (xVar.f6800b) {
            j10 = -1;
        } else {
            j10 = xVar.f6799a;
        }
        z4 = (this.f16807a.hasDisplayList() && width == this.f16810e && height == this.f16811f && j10 == this.d && j10 != -1) ? true : true;
        this.f16810e = width;
        this.f16811f = height;
        this.d = j10;
        if (z4) {
            gVar.i(this.f16807a.beginRecording());
            this.f16807a.endRecording();
        }
    }
}

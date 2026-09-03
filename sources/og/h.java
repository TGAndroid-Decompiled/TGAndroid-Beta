package og;

import android.graphics.RenderNode;
import g.x;
public final class h {
    public final RenderNode f16809a;
    public final g f16810b;
    public final x f16811c = new Object();
    public long d = 0;
    public int f16812e;
    public int f16813f;

    public h(RenderNode renderNode, g gVar) {
        this.f16809a = renderNode;
        this.f16810b = gVar;
    }

    public final void a() {
        long j10;
        int width = this.f16809a.getWidth();
        int height = this.f16809a.getHeight();
        x xVar = this.f16811c;
        xVar.f6799a = 0L;
        boolean z4 = false;
        xVar.f6800b = false;
        g gVar = this.f16810b;
        gVar.P(xVar);
        if (xVar.f6800b) {
            j10 = -1;
        } else {
            j10 = xVar.f6799a;
        }
        z4 = (this.f16809a.hasDisplayList() && width == this.f16812e && height == this.f16813f && j10 == this.d && j10 != -1) ? true : true;
        this.f16812e = width;
        this.f16813f = height;
        this.d = j10;
        if (z4) {
            gVar.i(this.f16809a.beginRecording());
            this.f16809a.endRecording();
        }
    }
}

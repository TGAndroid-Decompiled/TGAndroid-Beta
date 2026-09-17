package bh;

import android.graphics.RenderNode;
public final class i {
    public final RenderNode f2706a;
    public final h f2707b;
    public final a f2708c = new Object();
    public long d = 0;
    public int f2709e;
    public int f2710f;

    public i(RenderNode renderNode, h hVar) {
        this.f2706a = renderNode;
        this.f2707b = hVar;
    }

    public final void a() {
        long j3;
        int width = this.f2706a.getWidth();
        int height = this.f2706a.getHeight();
        a aVar = this.f2708c;
        aVar.f2649b = 0L;
        boolean z10 = false;
        aVar.f2648a = false;
        h hVar = this.f2707b;
        hVar.v(aVar);
        if (aVar.f2648a) {
            j3 = -1;
        } else {
            j3 = aVar.f2649b;
        }
        z10 = (this.f2706a.hasDisplayList() && width == this.f2709e && height == this.f2710f && j3 == this.d && j3 != -1) ? true : true;
        this.f2709e = width;
        this.f2710f = height;
        this.d = j3;
        if (z10) {
            hVar.k(this.f2706a.beginRecording());
            this.f2706a.endRecording();
        }
    }
}

package bh;

import android.graphics.RenderNode;
public final class i {
    public final RenderNode f2794a;
    public final h f2795b;
    public final a f2796c = new Object();
    public long d = 0;
    public int e;
    public int f2797f;

    public i(RenderNode renderNode, h hVar) {
        this.f2794a = renderNode;
        this.f2795b = hVar;
    }

    public final void a() {
        long j10;
        int width = this.f2794a.getWidth();
        int height = this.f2794a.getHeight();
        a aVar = this.f2796c;
        aVar.f2741b = 0L;
        boolean z10 = false;
        aVar.f2740a = false;
        h hVar = this.f2795b;
        hVar.m0(aVar);
        if (aVar.f2740a) {
            j10 = -1;
        } else {
            j10 = aVar.f2741b;
        }
        z10 = (this.f2794a.hasDisplayList() && width == this.e && height == this.f2797f && j10 == this.d && j10 != -1) ? true : true;
        this.e = width;
        this.f2797f = height;
        this.d = j10;
        if (z10) {
            hVar.v(this.f2794a.beginRecording());
            this.f2794a.endRecording();
        }
    }
}

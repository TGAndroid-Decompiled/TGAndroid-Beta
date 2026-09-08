package bh;

import android.graphics.RenderNode;
public final class i {
    public final RenderNode f2733a;
    public final h f2734b;
    public final a f2735c = new Object();
    public long d = 0;
    public int f2736e;
    public int f2737f;

    public i(RenderNode renderNode, h hVar) {
        this.f2733a = renderNode;
        this.f2734b = hVar;
    }

    public final void a() {
        long j3;
        int width = this.f2733a.getWidth();
        int height = this.f2733a.getHeight();
        a aVar = this.f2735c;
        aVar.f2676b = 0L;
        boolean z10 = false;
        aVar.f2675a = false;
        h hVar = this.f2734b;
        hVar.v(aVar);
        if (aVar.f2675a) {
            j3 = -1;
        } else {
            j3 = aVar.f2676b;
        }
        z10 = (this.f2733a.hasDisplayList() && width == this.f2736e && height == this.f2737f && j3 == this.d && j3 != -1) ? true : true;
        this.f2736e = width;
        this.f2737f = height;
        this.d = j3;
        if (z10) {
            hVar.k(this.f2733a.beginRecording());
            this.f2733a.endRecording();
        }
    }
}

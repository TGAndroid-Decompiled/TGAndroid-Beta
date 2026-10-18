package bh;

import android.graphics.RenderNode;
public final class i {
    public final RenderNode f4411a;
    public final h f4412b;
    public final a f4413c = new Object();
    public long d = 0;
    public int e;
    public int f4414f;

    public i(RenderNode renderNode, h hVar) {
        this.f4411a = renderNode;
        this.f4412b = hVar;
    }

    public final void a() {
        long j10;
        int width = this.f4411a.getWidth();
        int height = this.f4411a.getHeight();
        a aVar = this.f4413c;
        aVar.f4358b = 0L;
        boolean z10 = false;
        aVar.f4357a = false;
        h hVar = this.f4412b;
        hVar.H(aVar);
        if (aVar.f4357a) {
            j10 = -1;
        } else {
            j10 = aVar.f4358b;
        }
        z10 = (this.f4411a.hasDisplayList() && width == this.e && height == this.f4414f && j10 == this.d && j10 != -1) ? true : true;
        this.e = width;
        this.f4414f = height;
        this.d = j10;
        if (z10) {
            hVar.r(this.f4411a.beginRecording());
            this.f4411a.endRecording();
        }
    }
}

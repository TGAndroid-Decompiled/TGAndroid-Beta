package bh;

import android.graphics.RenderNode;
public final class i {
    public final RenderNode f2798a;
    public final h f2799b;
    public final a f2800c = new Object();
    public long d = 0;
    public int e;
    public int f2801f;

    public i(RenderNode renderNode, h hVar) {
        this.f2798a = renderNode;
        this.f2799b = hVar;
    }

    public final void a() {
        long j10;
        int width = this.f2798a.getWidth();
        int height = this.f2798a.getHeight();
        a aVar = this.f2800c;
        aVar.f2745b = 0L;
        boolean z10 = false;
        aVar.f2744a = false;
        h hVar = this.f2799b;
        hVar.m0(aVar);
        if (aVar.f2744a) {
            j10 = -1;
        } else {
            j10 = aVar.f2745b;
        }
        z10 = (this.f2798a.hasDisplayList() && width == this.e && height == this.f2801f && j10 == this.d && j10 != -1) ? true : true;
        this.e = width;
        this.f2801f = height;
        this.d = j10;
        if (z10) {
            hVar.k(this.f2798a.beginRecording());
            this.f2798a.endRecording();
        }
    }
}

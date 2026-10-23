package bh;

import android.graphics.RenderNode;
public final class i {
    public final RenderNode f4410a;
    public final h f4411b;
    public final a f4412c = new Object();
    public long d = 0;
    public int e;
    public int f4413f;

    public i(RenderNode renderNode, h hVar) {
        this.f4410a = renderNode;
        this.f4411b = hVar;
    }

    public final void a() {
        long j10;
        int width = this.f4410a.getWidth();
        int height = this.f4410a.getHeight();
        a aVar = this.f4412c;
        aVar.f4361b = 0L;
        boolean z10 = false;
        aVar.f4360a = false;
        h hVar = this.f4411b;
        hVar.J(aVar);
        if (aVar.f4360a) {
            j10 = -1;
        } else {
            j10 = aVar.f4361b;
        }
        z10 = (this.f4410a.hasDisplayList() && width == this.e && height == this.f4413f && j10 == this.d && j10 != -1) ? true : true;
        this.e = width;
        this.f4413f = height;
        this.d = j10;
        if (z10) {
            hVar.z(this.f4410a.beginRecording());
            this.f4410a.endRecording();
        }
    }
}

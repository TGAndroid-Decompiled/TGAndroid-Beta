package bh;

import android.graphics.RenderNode;
public final class i {
    public final RenderNode f4407a;
    public final h f4408b;
    public final a f4409c = new Object();
    public long d = 0;
    public int e;
    public int f4410f;

    public i(RenderNode renderNode, h hVar) {
        this.f4407a = renderNode;
        this.f4408b = hVar;
    }

    public final void a() {
        long j10;
        int width = this.f4407a.getWidth();
        int height = this.f4407a.getHeight();
        a aVar = this.f4409c;
        aVar.f4354b = 0L;
        boolean z10 = false;
        aVar.f4353a = false;
        h hVar = this.f4408b;
        hVar.J(aVar);
        if (aVar.f4353a) {
            j10 = -1;
        } else {
            j10 = aVar.f4354b;
        }
        z10 = (this.f4407a.hasDisplayList() && width == this.e && height == this.f4410f && j10 == this.d && j10 != -1) ? true : true;
        this.e = width;
        this.f4410f = height;
        this.d = j10;
        if (z10) {
            hVar.b(this.f4407a.beginRecording());
            this.f4407a.endRecording();
        }
    }
}

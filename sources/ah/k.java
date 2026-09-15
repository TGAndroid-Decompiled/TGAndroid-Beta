package ah;

import android.graphics.RenderNode;
public final class k {
    public final RenderNode f472a;
    public final j f473b;
    public final a f474c = new Object();
    public long d = 0;
    public int e;
    public int f475f;

    public k(RenderNode renderNode, j jVar) {
        this.f472a = renderNode;
        this.f473b = jVar;
    }

    public final void a() {
        long j3;
        int width = this.f472a.getWidth();
        int height = this.f472a.getHeight();
        a aVar = this.f474c;
        aVar.f416b = 0L;
        boolean z10 = false;
        aVar.f415a = false;
        j jVar = this.f473b;
        jVar.m(aVar);
        if (aVar.f415a) {
            j3 = -1;
        } else {
            j3 = aVar.f416b;
        }
        z10 = (this.f472a.hasDisplayList() && width == this.e && height == this.f475f && j3 == this.d && j3 != -1) ? true : true;
        this.e = width;
        this.f475f = height;
        this.d = j3;
        if (z10) {
            jVar.b(this.f472a.beginRecording());
            this.f472a.endRecording();
        }
    }
}

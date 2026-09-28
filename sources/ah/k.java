package ah;

import android.graphics.RenderNode;
public final class k {
    public final RenderNode f474a;
    public final j f475b;
    public final a f476c = new Object();
    public long d = 0;
    public int e;
    public int f477f;

    public k(RenderNode renderNode, j jVar) {
        this.f474a = renderNode;
        this.f475b = jVar;
    }

    public final void a() {
        long j3;
        int width = this.f474a.getWidth();
        int height = this.f474a.getHeight();
        a aVar = this.f476c;
        aVar.f418b = 0L;
        boolean z10 = false;
        aVar.f417a = false;
        j jVar = this.f475b;
        jVar.U(aVar);
        if (aVar.f417a) {
            j3 = -1;
        } else {
            j3 = aVar.f418b;
        }
        z10 = (this.f474a.hasDisplayList() && width == this.e && height == this.f477f && j3 == this.d && j3 != -1) ? true : true;
        this.e = width;
        this.f477f = height;
        this.d = j3;
        if (z10) {
            jVar.d(this.f474a.beginRecording());
            this.f474a.endRecording();
        }
    }
}

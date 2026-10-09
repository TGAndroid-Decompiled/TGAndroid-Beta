package ah;

import android.graphics.RenderNode;
public final class k {
    public final RenderNode f599a;
    public final j f600b;
    public final a f601c = new Object();
    public long d = 0;
    public int f602e;
    public int f603f;

    public k(RenderNode renderNode, j jVar) {
        this.f599a = renderNode;
        this.f600b = jVar;
    }

    public final void a() {
        long j3;
        int width = this.f599a.getWidth();
        int height = this.f599a.getHeight();
        a aVar = this.f601c;
        aVar.f537b = 0L;
        boolean z10 = false;
        aVar.f536a = false;
        j jVar = this.f600b;
        jVar.B0(aVar);
        if (aVar.f536a) {
            j3 = -1;
        } else {
            j3 = aVar.f537b;
        }
        z10 = (this.f599a.hasDisplayList() && width == this.f602e && height == this.f603f && j3 == this.d && j3 != -1) ? true : true;
        this.f602e = width;
        this.f603f = height;
        this.d = j3;
        if (z10) {
            jVar.l(this.f599a.beginRecording());
            this.f599a.endRecording();
        }
    }
}

package ah;

import android.graphics.RenderNode;
public final class k {
    public final RenderNode f601a;
    public final j f602b;
    public final a f603c = new Object();
    public long d = 0;
    public int f604e;
    public int f605f;

    public k(RenderNode renderNode, j jVar) {
        this.f601a = renderNode;
        this.f602b = jVar;
    }

    public final void a() {
        long j3;
        int width = this.f601a.getWidth();
        int height = this.f601a.getHeight();
        a aVar = this.f603c;
        aVar.f539b = 0L;
        boolean z10 = false;
        aVar.f538a = false;
        j jVar = this.f602b;
        jVar.g0(aVar);
        if (aVar.f538a) {
            j3 = -1;
        } else {
            j3 = aVar.f539b;
        }
        z10 = (this.f601a.hasDisplayList() && width == this.f604e && height == this.f605f && j3 == this.d && j3 != -1) ? true : true;
        this.f604e = width;
        this.f605f = height;
        this.d = j3;
        if (z10) {
            jVar.l(this.f601a.beginRecording());
            this.f601a.endRecording();
        }
    }
}

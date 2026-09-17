package ah;

import android.graphics.RenderNode;
public final class l {
    public final RenderNode f477a;
    public final k f478b;
    public final a f479c = new Object();
    public long d = 0;
    public int e;
    public int f480f;

    public l(RenderNode renderNode, k kVar) {
        this.f477a = renderNode;
        this.f478b = kVar;
    }

    public final void a() {
        long j3;
        int width = this.f477a.getWidth();
        int height = this.f477a.getHeight();
        a aVar = this.f479c;
        aVar.f418b = 0L;
        boolean z10 = false;
        aVar.f417a = false;
        k kVar = this.f478b;
        kVar.m(aVar);
        if (aVar.f417a) {
            j3 = -1;
        } else {
            j3 = aVar.f418b;
        }
        z10 = (this.f477a.hasDisplayList() && width == this.e && height == this.f480f && j3 == this.d && j3 != -1) ? true : true;
        this.e = width;
        this.f480f = height;
        this.d = j3;
        if (z10) {
            kVar.b(this.f477a.beginRecording());
            this.f477a.endRecording();
        }
    }
}

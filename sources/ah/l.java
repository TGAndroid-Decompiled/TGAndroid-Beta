package ah;

import android.graphics.RenderNode;
public final class l {
    public final RenderNode f474a;
    public final k f475b;
    public final a f476c = new Object();
    public long d = 0;
    public int e;
    public int f477f;

    public l(RenderNode renderNode, k kVar) {
        this.f474a = renderNode;
        this.f475b = kVar;
    }

    public final void a() {
        long j3;
        int width = this.f474a.getWidth();
        int height = this.f474a.getHeight();
        a aVar = this.f476c;
        aVar.f415b = 0L;
        boolean z10 = false;
        aVar.f414a = false;
        k kVar = this.f475b;
        kVar.y(aVar);
        if (aVar.f414a) {
            j3 = -1;
        } else {
            j3 = aVar.f415b;
        }
        z10 = (this.f474a.hasDisplayList() && width == this.e && height == this.f477f && j3 == this.d && j3 != -1) ? true : true;
        this.e = width;
        this.f477f = height;
        this.d = j3;
        if (z10) {
            kVar.b(this.f474a.beginRecording());
            this.f474a.endRecording();
        }
    }
}

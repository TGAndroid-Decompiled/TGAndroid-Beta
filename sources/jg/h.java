package jg;

import android.graphics.RenderNode;
import g.y;

public final class h {

    public final RenderNode f12996a;

    public final g f12997b;

    public final y f12998c = new y();
    public long d = 0;

    public int f12999e;

    public int f13000f;

    public h(RenderNode renderNode, g gVar) {
        this.f12996a = renderNode;
        this.f12997b = gVar;
    }

    public final void a() {
        int width = this.f12996a.getWidth();
        int height = this.f12996a.getHeight();
        y yVar = this.f12998c;
        yVar.f6326a = 0L;
        yVar.f6327b = false;
        g gVar = this.f12997b;
        gVar.A(yVar);
        long j10 = yVar.f6327b ? -1L : yVar.f6326a;
        boolean z10 = (this.f12996a.hasDisplayList() && width == this.f12999e && height == this.f13000f && j10 == this.d && j10 != -1) ? false : true;
        this.f12999e = width;
        this.f13000f = height;
        this.d = j10;
        if (z10) {
            gVar.n(this.f12996a.beginRecording());
            this.f12996a.endRecording();
        }
    }
}

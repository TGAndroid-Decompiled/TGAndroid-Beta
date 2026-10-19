package bh;

import android.graphics.RenderNode;
public final class i {
    public final RenderNode f4409a;
    public final h f4410b;
    public final a f4411c = new Object();
    public long d = 0;
    public int e;
    public int f4412f;

    public i(RenderNode renderNode, h hVar) {
        this.f4409a = renderNode;
        this.f4410b = hVar;
    }

    public final void a() {
        long j10;
        int width = this.f4409a.getWidth();
        int height = this.f4409a.getHeight();
        a aVar = this.f4411c;
        aVar.f4356b = 0L;
        boolean z10 = false;
        aVar.f4355a = false;
        h hVar = this.f4410b;
        hVar.J(aVar);
        if (aVar.f4355a) {
            j10 = -1;
        } else {
            j10 = aVar.f4356b;
        }
        z10 = (this.f4409a.hasDisplayList() && width == this.e && height == this.f4412f && j10 == this.d && j10 != -1) ? true : true;
        this.e = width;
        this.f4412f = height;
        this.d = j10;
        if (z10) {
            hVar.b(this.f4409a.beginRecording());
            this.f4409a.endRecording();
        }
    }
}

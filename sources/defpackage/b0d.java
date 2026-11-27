package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RenderNode;
public final class b0d extends d0d {
    public final RenderNode e;
    public Bitmap f;
    public Paint g;
    public Rect h;

    public b0d(int i, int i2, int i3, int i4, String str) {
        super(i, i2, i3, i4);
        RenderNode renderNode = new RenderNode(str);
        this.e = renderNode;
        renderNode.setPosition(i, i2, i3, i4);
    }

    @Override
    public final Canvas a() {
        return this.e.beginRecording(this.c - this.a, this.d - this.b);
    }

    @Override
    public final void b() {
        this.e.discardDisplayList();
    }

    @Override
    public final void c(android.graphics.Canvas r28, float r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b0d.c(android.graphics.Canvas, float):void");
    }

    @Override
    public final void d() {
        this.e.endRecording();
    }

    @Override
    public final boolean e() {
        return this.e.hasDisplayList();
    }

    @Override
    public final void f() {
        boolean z;
        long j = this.c - this.a;
        long j2 = this.d - this.b;
        if (j > 0 && j2 > 0 && j <= 4096 && j2 <= 4096 && j * j2 <= 8388608) {
            z = true;
        } else {
            z = false;
        }
        this.e.setUseCompositingLayer(z, null);
    }
}

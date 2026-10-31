package org.telegram.messenger;

import android.graphics.BitmapShader;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.bi0;
public final class jc {
    public Paint A;
    public Path B;
    public boolean f16242a;
    public float f16243b;
    public long f16244c;
    public int d;
    public BitmapShader e;
    public org.telegram.ui.Components.s5 f16245f;
    public bi0 f16246g;
    public int[] h;
    public BitmapShader f16247i;
    public Drawable f16248j;
    public BitmapShader f16249k;
    public Drawable f16250l;
    public Drawable f16251m;
    public BitmapShader f16252n;
    public Drawable f16253o;
    public float f16254p;
    public float f16255q;
    public BitmapShader f16256r;
    public float f16257s;
    public float f16258t;
    public float f16259u;
    public float v;
    public boolean f16260w;
    public Drawable f16261x;
    public RectF f16262y;
    public ColorFilter f16263z;

    public final void a() {
        this.f16245f = null;
        this.f16246g = null;
        for (int i10 = 0; i10 < 4; i10++) {
            int[] iArr = this.h;
            iArr[i10] = iArr[i10];
        }
        this.f16248j = null;
        this.f16247i = null;
        this.f16250l = null;
        this.f16249k = null;
        this.f16251m = null;
        this.f16252n = null;
        this.e = null;
        this.f16253o = null;
        this.f16261x = null;
        this.f16263z = null;
    }

    public final void b(Rect rect) {
        if (rect != null) {
            this.f16259u = rect.left;
            this.v = rect.top;
            this.f16258t = rect.width();
            this.f16257s = rect.height();
        }
    }
}

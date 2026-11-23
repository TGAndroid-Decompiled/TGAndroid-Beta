package org.telegram.messenger;

import android.graphics.BitmapShader;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.oh0;
public final class hc {
    public Paint A;
    public Path B;
    public boolean f24421a;
    public float f24422b;
    public long f24423c;
    public int d;
    public BitmapShader f24424e;
    public org.telegram.ui.Components.c6 f24425f;
    public oh0 f24426g;
    public int[] h;
    public BitmapShader f24427i;
    public Drawable f24428j;
    public BitmapShader f24429k;
    public Drawable f24430l;
    public Drawable f24431m;
    public BitmapShader f24432n;
    public Drawable f24433o;
    public float f24434p;
    public float f24435q;
    public BitmapShader f24436r;
    public float f24437s;
    public float f24438t;
    public float f24439u;
    public float v;
    public boolean f24440w;
    public Drawable f24441x;
    public RectF f24442y;
    public ColorFilter f24443z;

    public final void a() {
        this.f24425f = null;
        this.f24426g = null;
        for (int i7 = 0; i7 < 4; i7++) {
            int[] iArr = this.h;
            iArr[i7] = iArr[i7];
        }
        this.f24428j = null;
        this.f24427i = null;
        this.f24430l = null;
        this.f24429k = null;
        this.f24431m = null;
        this.f24432n = null;
        this.f24424e = null;
        this.f24433o = null;
        this.f24441x = null;
        this.f24443z = null;
    }

    public final void b(Rect rect) {
        if (rect != null) {
            this.f24439u = rect.left;
            this.v = rect.top;
            this.f24438t = rect.width();
            this.f24437s = rect.height();
        }
    }
}

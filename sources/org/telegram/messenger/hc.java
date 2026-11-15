package org.telegram.messenger;

import android.graphics.BitmapShader;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.ch0;
public final class hc {
    public Paint A;
    public Path B;
    public boolean f24078a;
    public float f24079b;
    public long f24080c;
    public int d;
    public BitmapShader f24081e;
    public org.telegram.ui.Components.t5 f24082f;
    public ch0 f24083g;
    public int[] h;
    public BitmapShader f24084i;
    public Drawable f24085j;
    public BitmapShader f24086k;
    public Drawable f24087l;
    public Drawable f24088m;
    public BitmapShader f24089n;
    public Drawable f24090o;
    public float f24091p;
    public float f24092q;
    public BitmapShader f24093r;
    public float f24094s;
    public float f24095t;
    public float f24096u;
    public float v;
    public boolean f24097w;
    public Drawable f24098x;
    public RectF f24099y;
    public ColorFilter f24100z;

    public final void a() {
        this.f24082f = null;
        this.f24083g = null;
        for (int i7 = 0; i7 < 4; i7++) {
            int[] iArr = this.h;
            iArr[i7] = iArr[i7];
        }
        this.f24085j = null;
        this.f24084i = null;
        this.f24087l = null;
        this.f24086k = null;
        this.f24088m = null;
        this.f24089n = null;
        this.f24081e = null;
        this.f24090o = null;
        this.f24098x = null;
        this.f24100z = null;
    }

    public final void b(Rect rect) {
        if (rect != null) {
            this.f24096u = rect.left;
            this.v = rect.top;
            this.f24095t = rect.width();
            this.f24094s = rect.height();
        }
    }
}

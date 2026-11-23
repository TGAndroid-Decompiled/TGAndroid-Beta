package org.telegram.messenger;

import android.graphics.BitmapShader;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.nh0;
public final class gc {
    public Paint A;
    public Path B;
    public boolean f24291a;
    public float f24292b;
    public long f24293c;
    public int d;
    public BitmapShader f24294e;
    public org.telegram.ui.Components.b6 f24295f;
    public nh0 f24296g;
    public int[] h;
    public BitmapShader f24297i;
    public Drawable f24298j;
    public BitmapShader f24299k;
    public Drawable f24300l;
    public Drawable f24301m;
    public BitmapShader f24302n;
    public Drawable f24303o;
    public float f24304p;
    public float f24305q;
    public BitmapShader f24306r;
    public float f24307s;
    public float f24308t;
    public float f24309u;
    public float v;
    public boolean f24310w;
    public Drawable f24311x;
    public RectF f24312y;
    public ColorFilter f24313z;

    public final void a() {
        this.f24295f = null;
        this.f24296g = null;
        for (int i7 = 0; i7 < 4; i7++) {
            int[] iArr = this.h;
            iArr[i7] = iArr[i7];
        }
        this.f24298j = null;
        this.f24297i = null;
        this.f24300l = null;
        this.f24299k = null;
        this.f24301m = null;
        this.f24302n = null;
        this.f24294e = null;
        this.f24303o = null;
        this.f24311x = null;
        this.f24313z = null;
    }

    public final void b(Rect rect) {
        if (rect != null) {
            this.f24309u = rect.left;
            this.v = rect.top;
            this.f24308t = rect.width();
            this.f24307s = rect.height();
        }
    }
}

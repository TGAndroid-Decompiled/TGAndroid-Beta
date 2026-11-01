package org.telegram.messenger;

import android.graphics.BitmapShader;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.ci0;
public final class kc {
    public Paint A;
    public Path B;
    public boolean f16595a;
    public float f16596b;
    public long f16597c;
    public int d;
    public BitmapShader e;
    public org.telegram.ui.Components.s5 f16598f;
    public ci0 f16599g;
    public int[] h;
    public BitmapShader f16600i;
    public Drawable f16601j;
    public BitmapShader f16602k;
    public Drawable f16603l;
    public Drawable f16604m;
    public BitmapShader f16605n;
    public Drawable f16606o;
    public float f16607p;
    public float f16608q;
    public BitmapShader f16609r;
    public float f16610s;
    public float f16611t;
    public float f16612u;
    public float v;
    public boolean f16613w;
    public Drawable f16614x;
    public RectF f16615y;
    public ColorFilter f16616z;

    public final void a() {
        this.f16598f = null;
        this.f16599g = null;
        for (int i10 = 0; i10 < 4; i10++) {
            int[] iArr = this.h;
            iArr[i10] = iArr[i10];
        }
        this.f16601j = null;
        this.f16600i = null;
        this.f16603l = null;
        this.f16602k = null;
        this.f16604m = null;
        this.f16605n = null;
        this.e = null;
        this.f16606o = null;
        this.f16614x = null;
        this.f16616z = null;
    }

    public final void b(Rect rect) {
        if (rect != null) {
            this.f16612u = rect.left;
            this.v = rect.top;
            this.f16611t = rect.width();
            this.f16610s = rect.height();
        }
    }
}

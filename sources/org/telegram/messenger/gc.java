package org.telegram.messenger;

import android.graphics.BitmapShader;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.mh0;
public final class gc {
    public Paint A;
    public Path B;
    public boolean f24193a;
    public float f24194b;
    public long f24195c;
    public int d;
    public BitmapShader f24196e;
    public org.telegram.ui.Components.b6 f24197f;
    public mh0 f24198g;
    public int[] h;
    public BitmapShader f24199i;
    public Drawable f24200j;
    public BitmapShader f24201k;
    public Drawable f24202l;
    public Drawable f24203m;
    public BitmapShader f24204n;
    public Drawable f24205o;
    public float f24206p;
    public float f24207q;
    public BitmapShader f24208r;
    public float f24209s;
    public float f24210t;
    public float f24211u;
    public float v;
    public boolean f24212w;
    public Drawable f24213x;
    public RectF f24214y;
    public ColorFilter f24215z;

    public final void a() {
        this.f24197f = null;
        this.f24198g = null;
        for (int i7 = 0; i7 < 4; i7++) {
            int[] iArr = this.h;
            iArr[i7] = iArr[i7];
        }
        this.f24200j = null;
        this.f24199i = null;
        this.f24202l = null;
        this.f24201k = null;
        this.f24203m = null;
        this.f24204n = null;
        this.f24196e = null;
        this.f24205o = null;
        this.f24213x = null;
        this.f24215z = null;
    }

    public final void b(Rect rect) {
        if (rect != null) {
            this.f24211u = rect.left;
            this.v = rect.top;
            this.f24210t = rect.width();
            this.f24209s = rect.height();
        }
    }
}

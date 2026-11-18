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
    public boolean f24190a;
    public float f24191b;
    public long f24192c;
    public int d;
    public BitmapShader f24193e;
    public org.telegram.ui.Components.b6 f24194f;
    public mh0 f24195g;
    public int[] h;
    public BitmapShader f24196i;
    public Drawable f24197j;
    public BitmapShader f24198k;
    public Drawable f24199l;
    public Drawable f24200m;
    public BitmapShader f24201n;
    public Drawable f24202o;
    public float f24203p;
    public float f24204q;
    public BitmapShader f24205r;
    public float f24206s;
    public float f24207t;
    public float f24208u;
    public float v;
    public boolean f24209w;
    public Drawable f24210x;
    public RectF f24211y;
    public ColorFilter f24212z;

    public final void a() {
        this.f24194f = null;
        this.f24195g = null;
        for (int i7 = 0; i7 < 4; i7++) {
            int[] iArr = this.h;
            iArr[i7] = iArr[i7];
        }
        this.f24197j = null;
        this.f24196i = null;
        this.f24199l = null;
        this.f24198k = null;
        this.f24200m = null;
        this.f24201n = null;
        this.f24193e = null;
        this.f24202o = null;
        this.f24210x = null;
        this.f24212z = null;
    }

    public final void b(Rect rect) {
        if (rect != null) {
            this.f24208u = rect.left;
            this.v = rect.top;
            this.f24207t = rect.width();
            this.f24206s = rect.height();
        }
    }
}

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
    public boolean f24385a;
    public float f24386b;
    public long f24387c;
    public int d;
    public BitmapShader f24388e;
    public org.telegram.ui.Components.c6 f24389f;
    public oh0 f24390g;
    public int[] h;
    public BitmapShader f24391i;
    public Drawable f24392j;
    public BitmapShader f24393k;
    public Drawable f24394l;
    public Drawable f24395m;
    public BitmapShader f24396n;
    public Drawable f24397o;
    public float f24398p;
    public float f24399q;
    public BitmapShader f24400r;
    public float f24401s;
    public float f24402t;
    public float f24403u;
    public float v;
    public boolean f24404w;
    public Drawable f24405x;
    public RectF f24406y;
    public ColorFilter f24407z;

    public final void a() {
        this.f24389f = null;
        this.f24390g = null;
        for (int i7 = 0; i7 < 4; i7++) {
            int[] iArr = this.h;
            iArr[i7] = iArr[i7];
        }
        this.f24392j = null;
        this.f24391i = null;
        this.f24394l = null;
        this.f24393k = null;
        this.f24395m = null;
        this.f24396n = null;
        this.f24388e = null;
        this.f24397o = null;
        this.f24405x = null;
        this.f24407z = null;
    }

    public final void b(Rect rect) {
        if (rect != null) {
            this.f24403u = rect.left;
            this.v = rect.top;
            this.f24402t = rect.width();
            this.f24401s = rect.height();
        }
    }
}

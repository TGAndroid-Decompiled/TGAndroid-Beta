package org.telegram.messenger;

import android.graphics.BitmapShader;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.oh0;
public final class gc {
    public Paint A;
    public Path B;
    public boolean f24218a;
    public float f24219b;
    public long f24220c;
    public int d;
    public BitmapShader f24221e;
    public org.telegram.ui.Components.c6 f24222f;
    public oh0 f24223g;
    public int[] h;
    public BitmapShader f24224i;
    public Drawable f24225j;
    public BitmapShader f24226k;
    public Drawable f24227l;
    public Drawable f24228m;
    public BitmapShader f24229n;
    public Drawable f24230o;
    public float f24231p;
    public float f24232q;
    public BitmapShader f24233r;
    public float f24234s;
    public float f24235t;
    public float f24236u;
    public float v;
    public boolean f24237w;
    public Drawable f24238x;
    public RectF f24239y;
    public ColorFilter f24240z;

    public final void a() {
        this.f24222f = null;
        this.f24223g = null;
        for (int i7 = 0; i7 < 4; i7++) {
            int[] iArr = this.h;
            iArr[i7] = iArr[i7];
        }
        this.f24225j = null;
        this.f24224i = null;
        this.f24227l = null;
        this.f24226k = null;
        this.f24228m = null;
        this.f24229n = null;
        this.f24221e = null;
        this.f24230o = null;
        this.f24238x = null;
        this.f24240z = null;
    }

    public final void b(Rect rect) {
        if (rect != null) {
            this.f24236u = rect.left;
            this.v = rect.top;
            this.f24235t = rect.width();
            this.f24234s = rect.height();
        }
    }
}

package org.telegram.messenger;

import android.graphics.BitmapShader;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.ch0;
public final class bc {
    public Paint A;
    public Path B;
    public boolean f21761a;
    public float f21762b;
    public long f21763c;
    public int d;
    public BitmapShader f21764e;
    public org.telegram.ui.Components.t5 f21765f;
    public ch0 f21766g;
    public int[] h;
    public BitmapShader f21767i;
    public Drawable f21768j;
    public BitmapShader f21769k;
    public Drawable f21770l;
    public Drawable f21771m;
    public BitmapShader f21772n;
    public Drawable f21773o;
    public float f21774p;
    public float f21775q;
    public BitmapShader f21776r;
    public float f21777s;
    public float f21778t;
    public float f21779u;
    public float v;
    public boolean f21780w;
    public Drawable f21781x;
    public RectF f21782y;
    public ColorFilter f21783z;

    public final void a() {
        this.f21765f = null;
        this.f21766g = null;
        for (int i3 = 0; i3 < 4; i3++) {
            int[] iArr = this.h;
            iArr[i3] = iArr[i3];
        }
        this.f21768j = null;
        this.f21767i = null;
        this.f21770l = null;
        this.f21769k = null;
        this.f21771m = null;
        this.f21772n = null;
        this.f21764e = null;
        this.f21773o = null;
        this.f21781x = null;
        this.f21783z = null;
    }

    public final void b(Rect rect) {
        if (rect != null) {
            this.f21779u = rect.left;
            this.v = rect.top;
            this.f21778t = rect.width();
            this.f21777s = rect.height();
        }
    }
}

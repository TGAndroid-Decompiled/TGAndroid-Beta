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
    public boolean f24081a;
    public float f24082b;
    public long f24083c;
    public int d;
    public BitmapShader f24084e;
    public org.telegram.ui.Components.t5 f24085f;
    public ch0 f24086g;
    public int[] h;
    public BitmapShader f24087i;
    public Drawable f24088j;
    public BitmapShader f24089k;
    public Drawable f24090l;
    public Drawable f24091m;
    public BitmapShader f24092n;
    public Drawable f24093o;
    public float f24094p;
    public float f24095q;
    public BitmapShader f24096r;
    public float f24097s;
    public float f24098t;
    public float f24099u;
    public float v;
    public boolean f24100w;
    public Drawable f24101x;
    public RectF f24102y;
    public ColorFilter f24103z;

    public final void a() {
        this.f24085f = null;
        this.f24086g = null;
        for (int i7 = 0; i7 < 4; i7++) {
            int[] iArr = this.h;
            iArr[i7] = iArr[i7];
        }
        this.f24088j = null;
        this.f24087i = null;
        this.f24090l = null;
        this.f24089k = null;
        this.f24091m = null;
        this.f24092n = null;
        this.f24084e = null;
        this.f24093o = null;
        this.f24101x = null;
        this.f24103z = null;
    }

    public final void b(Rect rect) {
        if (rect != null) {
            this.f24099u = rect.left;
            this.v = rect.top;
            this.f24098t = rect.width();
            this.f24097s = rect.height();
        }
    }
}

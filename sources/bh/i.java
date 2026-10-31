package bh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
public final class i extends View implements k6 {
    public LinearGradient D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public tg.c f2796a;
    public tg.c f2797b;
    public int f2798c;
    public int d;
    public hi.c e;
    public int f2799f;
    public int h;
    public final Paint f2800n;
    public LinearGradient f2801r;
    public LinearGradient f2802s;
    public p6 f2803w;
    public final Paint f2804x;
    public LinearGradient f2805y;

    public i(Context context) {
        super(context);
        this.f2800n = new Paint();
        this.f2804x = new Paint();
    }

    public final void a() {
        this.f2796a.setBounds(0, 0, getMeasuredWidth(), this.f2798c);
        this.f2797b.setBounds(0, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight());
        this.f2802s = null;
        this.f2801r = null;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.f2799f));
    }

    public final LinearGradient b(boolean z10) {
        int i10 = this.h;
        int o10 = i0.b.o(i10, (Color.alpha(i10) * 2) / 3);
        int o11 = i0.b.o(this.h, 0);
        if (z10) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, this.f2798c, new int[]{i10, o10, o11}, new float[]{0.0f, 0.82f, 1.0f}, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, getMeasuredHeight() - this.d, 0.0f, getMeasuredHeight(), new int[]{o11, o10, i10}, new float[]{0.0f, 0.18f, 1.0f}, Shader.TileMode.CLAMP);
    }

    public final void c(tg.b bVar, wg.d dVar) {
        vg.f c10 = bVar.c(this, null, false);
        c10.o(dVar);
        tg.c cVar = new tg.c(c10);
        this.f2796a = cVar;
        cVar.b(-i0.L(30.0f), true);
        vg.f c11 = bVar.c(this, null, false);
        c11.o(dVar);
        tg.c cVar2 = new tg.c(c11);
        this.f2797b = cVar2;
        cVar2.b(i0.L(30.0f), true);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (t6.i1(this.f2803w)) {
            int x02 = t6.x0(null, t6.Ca, false);
            int x03 = t6.x0(null, t6.Da, false);
            int measuredHeight = getMeasuredHeight();
            if (this.f2805y == null || this.F != x02 || this.E != x03 || this.G != this.f2798c || this.H != this.d || this.I != measuredHeight) {
                this.F = x02;
                this.E = x03;
                this.G = this.f2798c;
                this.H = this.d;
                this.I = measuredHeight;
                int[] iArr = {x02, x03, i0.b.o(x03, 0)};
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.f2805y = new LinearGradient(0.0f, 0.0f, 0.0f, Math.max(1, this.f2798c), iArr, new float[]{0.0f, 0.557f, 1.0f}, tileMode);
                this.D = new LinearGradient(0.0f, measuredHeight, 0.0f, measuredHeight - Math.max(1, this.d), iArr, new float[]{0.0f, 0.557f, 1.0f}, tileMode);
            }
            int i10 = this.f2798c;
            Paint paint = this.f2804x;
            if (i10 > 0 && this.f2796a.G > 0) {
                paint.setShader(this.f2805y);
                paint.setAlpha(this.f2796a.G);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f2798c, paint);
            }
            if (this.d > 0) {
                paint.setShader(this.D);
                paint.setAlpha(255);
                canvas2 = canvas;
                canvas2.drawRect(0.0f, measuredHeight - this.d, getMeasuredWidth(), measuredHeight, paint);
            } else {
                canvas2 = canvas;
            }
        } else {
            canvas2 = canvas;
            this.f2796a.draw(canvas2);
            this.f2797b.draw(canvas2);
        }
        if (Color.alpha(this.h) != 0) {
            int i11 = this.f2798c;
            Paint paint2 = this.f2800n;
            if (i11 > 0 && this.f2796a.G > 0) {
                if (this.f2801r == null) {
                    this.f2801r = b(true);
                }
                paint2.setShader(this.f2801r);
                paint2.setAlpha(this.f2796a.G);
                canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f2798c, paint2);
            }
            if (this.d > 0) {
                if (this.f2802s == null) {
                    this.f2802s = b(false);
                }
                paint2.setShader(this.f2802s);
                paint2.setAlpha(255);
                canvas.drawRect(0.0f, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight(), paint2);
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }

    public void setFadeHeightBottom(int i10) {
        this.f2797b.b(i10, true);
    }

    public void setFadeHeightTop(int i10) {
        this.f2796a.b(-i10, true);
    }

    public void setFadeTopAlpha(int i10) {
        tg.c cVar = this.f2796a;
        if (cVar.G != i10) {
            cVar.G = i10;
            invalidate();
        }
    }

    public void setFadeZoneBottom(int i10) {
        if (this.d != i10) {
            this.d = i10;
            a();
            invalidate();
        }
    }

    public void setFadeZoneTop(int i10) {
        if (this.f2798c != i10) {
            this.f2798c = i10;
            a();
            invalidate();
        }
    }

    public void setIgnoreFastWay(boolean z10) {
        this.f2796a.F = z10;
        this.f2797b.F = z10;
    }

    public void setOverlayColor(int i10) {
        if (this.h != i10) {
            this.h = i10;
            this.f2802s = null;
            this.f2801r = null;
            invalidate();
        }
    }

    public void setResourcesProvider(p6 p6Var) {
        this.f2803w = p6Var;
    }

    public void setup(tg.b bVar) {
        c(bVar, null);
    }

    public void setupColorKey(int i10) {
        this.f2799f = i10;
        if (this.e == null) {
            hi.c cVar = new hi.c();
            this.e = cVar;
            cVar.a(t6.x0(null, i10, false));
            setup(new tg.b(this.e));
        }
    }

    @Override
    public final void updateColors() {
        int i10;
        hi.c cVar = this.e;
        if (cVar != null && (i10 = this.f2799f) != -1) {
            cVar.a(t6.x0(null, i10, false));
            invalidate();
        }
    }
}

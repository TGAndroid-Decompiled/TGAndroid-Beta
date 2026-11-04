package mh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.z5;
public final class f extends View implements z5 {
    public LinearGradient E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public eh.d f19407a;
    public eh.d f19408b;
    public int f19409c;
    public int d;
    public si.c f19410e;
    public int f19411f;
    public int h;
    public final Paint f19412n;
    public LinearGradient f19413r;
    public LinearGradient f19414s;
    public e6 f19415w;
    public final Paint f19416x;
    public LinearGradient f19417y;

    public f(Context context) {
        super(context);
        this.f19412n = new Paint();
        this.f19416x = new Paint();
    }

    public final void a() {
        this.f19407a.setBounds(0, 0, getMeasuredWidth(), this.f19409c);
        this.f19408b.setBounds(0, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight());
        this.f19414s = null;
        this.f19413r = null;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.f19411f));
    }

    public final LinearGradient b(boolean z10) {
        int i3 = this.h;
        int o10 = i0.a.o(i3, (Color.alpha(i3) * 2) / 3);
        int o11 = i0.a.o(this.h, 0);
        if (z10) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, this.f19409c, new int[]{i3, o10, o11}, new float[]{0.0f, 0.82f, 1.0f}, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, getMeasuredHeight() - this.d, 0.0f, getMeasuredHeight(), new int[]{o11, o10, i3}, new float[]{0.0f, 0.18f, 1.0f}, Shader.TileMode.CLAMP);
    }

    public final void c(eh.c cVar, hh.e eVar) {
        gh.g c2 = cVar.c(this, null, false);
        c2.p(eVar);
        eh.d dVar = new eh.d(c2);
        this.f19407a = dVar;
        dVar.b(-g0.L(30.0f), true);
        gh.g c10 = cVar.c(this, null, false);
        c10.p(eVar);
        eh.d dVar2 = new eh.d(c10);
        this.f19408b = dVar2;
        dVar2.b(g0.L(30.0f), true);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (k6.i1(this.f19415w)) {
            int x02 = k6.x0(null, k6.Ca, false);
            int x03 = k6.x0(null, k6.Da, false);
            int measuredHeight = getMeasuredHeight();
            if (this.f19417y == null || this.G != x02 || this.F != x03 || this.H != this.f19409c || this.I != this.d || this.J != measuredHeight) {
                this.G = x02;
                this.F = x03;
                this.H = this.f19409c;
                this.I = this.d;
                this.J = measuredHeight;
                int[] iArr = {x02, x03, i0.a.o(x03, 0)};
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.f19417y = new LinearGradient(0.0f, 0.0f, 0.0f, Math.max(1, this.f19409c), iArr, new float[]{0.0f, 0.557f, 1.0f}, tileMode);
                this.E = new LinearGradient(0.0f, measuredHeight, 0.0f, measuredHeight - Math.max(1, this.d), iArr, new float[]{0.0f, 0.557f, 1.0f}, tileMode);
            }
            int i3 = this.f19409c;
            Paint paint = this.f19416x;
            if (i3 > 0 && this.f19407a.H > 0) {
                paint.setShader(this.f19417y);
                paint.setAlpha(this.f19407a.H);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f19409c, paint);
            }
            if (this.d > 0) {
                paint.setShader(this.E);
                paint.setAlpha(255);
                canvas2 = canvas;
                canvas2.drawRect(0.0f, measuredHeight - this.d, getMeasuredWidth(), measuredHeight, paint);
            } else {
                canvas2 = canvas;
            }
        } else {
            canvas2 = canvas;
            this.f19407a.draw(canvas2);
            this.f19408b.draw(canvas2);
        }
        if (Color.alpha(this.h) != 0) {
            int i10 = this.f19409c;
            Paint paint2 = this.f19412n;
            if (i10 > 0 && this.f19407a.H > 0) {
                if (this.f19413r == null) {
                    this.f19413r = b(true);
                }
                paint2.setShader(this.f19413r);
                paint2.setAlpha(this.f19407a.H);
                canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f19409c, paint2);
            }
            if (this.d > 0) {
                if (this.f19414s == null) {
                    this.f19414s = b(false);
                }
                paint2.setShader(this.f19414s);
                paint2.setAlpha(255);
                canvas.drawRect(0.0f, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight(), paint2);
            }
        }
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        a();
    }

    public void setFadeHeightBottom(int i3) {
        this.f19408b.b(i3, true);
    }

    public void setFadeHeightTop(int i3) {
        this.f19407a.b(-i3, true);
    }

    public void setFadeTopAlpha(int i3) {
        eh.d dVar = this.f19407a;
        if (dVar.H != i3) {
            dVar.H = i3;
            invalidate();
        }
    }

    public void setFadeZoneBottom(int i3) {
        if (this.d != i3) {
            this.d = i3;
            a();
            invalidate();
        }
    }

    public void setFadeZoneTop(int i3) {
        if (this.f19409c != i3) {
            this.f19409c = i3;
            a();
            invalidate();
        }
    }

    public void setIgnoreFastWay(boolean z10) {
        this.f19407a.G = z10;
        this.f19408b.G = z10;
    }

    public void setOverlayColor(int i3) {
        if (this.h != i3) {
            this.h = i3;
            this.f19414s = null;
            this.f19413r = null;
            invalidate();
        }
    }

    public void setResourcesProvider(e6 e6Var) {
        this.f19415w = e6Var;
    }

    public void setup(eh.c cVar) {
        c(cVar, null);
    }

    public void setupColorKey(int i3) {
        this.f19411f = i3;
        if (this.f19410e == null) {
            si.c cVar = new si.c();
            this.f19410e = cVar;
            cVar.a(k6.x0(null, i3, false));
            si.c cVar2 = this.f19410e;
            setup(new eh.c(cVar2, cVar2, cVar2));
        }
    }

    @Override
    public final void updateColors() {
        int i3;
        si.c cVar = this.f19410e;
        if (cVar != null && (i3 = this.f19411f) != -1) {
            cVar.a(k6.x0(null, i3, false));
            invalidate();
        }
    }
}

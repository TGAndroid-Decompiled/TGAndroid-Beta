package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
public final class f extends View implements a6 {
    public LinearGradient D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public dh.d f18365a;
    public dh.d f18366b;
    public int f18367c;
    public int d;
    public ri.c f18368e;
    public int f18369f;
    public int h;
    public final Paint f18370n;
    public LinearGradient f18371r;
    public LinearGradient f18372s;
    public f6 f18373w;
    public final Paint f18374x;
    public LinearGradient f18375y;

    public f(Context context) {
        super(context);
        this.f18370n = new Paint();
        this.f18374x = new Paint();
    }

    public final void a() {
        this.f18365a.setBounds(0, 0, getMeasuredWidth(), this.f18367c);
        this.f18366b.setBounds(0, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight());
        this.f18372s = null;
        this.f18371r = null;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.f18369f));
    }

    public final LinearGradient b(boolean z9) {
        int i7 = this.h;
        int o4 = i0.a.o(i7, (Color.alpha(i7) * 2) / 3);
        int o10 = i0.a.o(this.h, 0);
        if (z9) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, this.f18367c, new int[]{i7, o4, o10}, new float[]{0.0f, 0.82f, 1.0f}, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, getMeasuredHeight() - this.d, 0.0f, getMeasuredHeight(), new int[]{o10, o4, i7}, new float[]{0.0f, 0.18f, 1.0f}, Shader.TileMode.CLAMP);
    }

    public final void c(dh.c cVar, gh.e eVar) {
        fh.g c10 = cVar.c(this, null, false);
        c10.p(eVar);
        dh.d dVar = new dh.d(c10);
        this.f18365a = dVar;
        dVar.b(-g0.L(30.0f), true);
        fh.g c11 = cVar.c(this, null, false);
        c11.p(eVar);
        dh.d dVar2 = new dh.d(c11);
        this.f18366b = dVar2;
        dVar2.b(g0.L(30.0f), true);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (k6.i1(this.f18373w)) {
            int x02 = k6.x0(null, k6.Ca, false);
            int x03 = k6.x0(null, k6.Da, false);
            int measuredHeight = getMeasuredHeight();
            if (this.f18375y == null || this.F != x02 || this.E != x03 || this.G != this.f18367c || this.H != this.d || this.I != measuredHeight) {
                this.F = x02;
                this.E = x03;
                this.G = this.f18367c;
                this.H = this.d;
                this.I = measuredHeight;
                int[] iArr = {x02, x03, i0.a.o(x03, 0)};
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.f18375y = new LinearGradient(0.0f, 0.0f, 0.0f, Math.max(1, this.f18367c), iArr, new float[]{0.0f, 0.557f, 1.0f}, tileMode);
                this.D = new LinearGradient(0.0f, measuredHeight, 0.0f, measuredHeight - Math.max(1, this.d), iArr, new float[]{0.0f, 0.557f, 1.0f}, tileMode);
            }
            int i7 = this.f18367c;
            Paint paint = this.f18374x;
            if (i7 > 0 && this.f18365a.G > 0) {
                paint.setShader(this.f18375y);
                paint.setAlpha(this.f18365a.G);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f18367c, paint);
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
            this.f18365a.draw(canvas2);
            this.f18366b.draw(canvas2);
        }
        if (Color.alpha(this.h) != 0) {
            int i10 = this.f18367c;
            Paint paint2 = this.f18370n;
            if (i10 > 0 && this.f18365a.G > 0) {
                if (this.f18371r == null) {
                    this.f18371r = b(true);
                }
                paint2.setShader(this.f18371r);
                paint2.setAlpha(this.f18365a.G);
                canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f18367c, paint2);
            }
            if (this.d > 0) {
                if (this.f18372s == null) {
                    this.f18372s = b(false);
                }
                paint2.setShader(this.f18372s);
                paint2.setAlpha(255);
                canvas.drawRect(0.0f, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight(), paint2);
            }
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        a();
    }

    public void setFadeHeightBottom(int i7) {
        this.f18366b.b(i7, true);
    }

    public void setFadeHeightTop(int i7) {
        this.f18365a.b(-i7, true);
    }

    public void setFadeTopAlpha(int i7) {
        dh.d dVar = this.f18365a;
        if (dVar.G != i7) {
            dVar.G = i7;
            invalidate();
        }
    }

    public void setFadeZoneBottom(int i7) {
        if (this.d != i7) {
            this.d = i7;
            a();
            invalidate();
        }
    }

    public void setFadeZoneTop(int i7) {
        if (this.f18367c != i7) {
            this.f18367c = i7;
            a();
            invalidate();
        }
    }

    public void setIgnoreFastWay(boolean z9) {
        this.f18365a.F = z9;
        this.f18366b.F = z9;
    }

    public void setOverlayColor(int i7) {
        if (this.h != i7) {
            this.h = i7;
            this.f18372s = null;
            this.f18371r = null;
            invalidate();
        }
    }

    public void setResourcesProvider(f6 f6Var) {
        this.f18373w = f6Var;
    }

    public void setup(dh.c cVar) {
        c(cVar, null);
    }

    public void setupColorKey(int i7) {
        this.f18369f = i7;
        if (this.f18368e == null) {
            ri.c cVar = new ri.c();
            this.f18368e = cVar;
            cVar.a(k6.x0(null, i7, false));
            ri.c cVar2 = this.f18368e;
            setup(new dh.c(cVar2, cVar2, cVar2));
        }
    }

    @Override
    public final void updateColors() {
        int i7;
        ri.c cVar = this.f18368e;
        if (cVar != null && (i7 = this.f18369f) != -1) {
            cVar.a(k6.x0(null, i7, false));
            invalidate();
        }
    }
}

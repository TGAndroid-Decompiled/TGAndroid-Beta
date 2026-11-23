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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public final class f extends View implements b6 {
    public LinearGradient E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public dh.d f19862a;
    public dh.d f19863b;
    public int f19864c;
    public int d;
    public ui.c f19865e;
    public int f19866f;
    public int h;
    public final Paint f19867n;
    public LinearGradient f19868r;
    public LinearGradient f19869s;
    public h6 f19870w;
    public final Paint f19871x;
    public LinearGradient f19872y;

    public f(Context context) {
        super(context);
        this.f19867n = new Paint();
        this.f19871x = new Paint();
    }

    public final void a() {
        this.f19862a.setBounds(0, 0, getMeasuredWidth(), this.f19864c);
        this.f19863b.setBounds(0, getMeasuredHeight() - this.d, getMeasuredWidth(), getMeasuredHeight());
        this.f19869s = null;
        this.f19868r = null;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.f19866f));
    }

    public final LinearGradient b(boolean z10) {
        int i7 = this.h;
        int o4 = i0.a.o(i7, (Color.alpha(i7) * 2) / 3);
        int o10 = i0.a.o(this.h, 0);
        if (z10) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, this.f19864c, new int[]{i7, o4, o10}, new float[]{0.0f, 0.82f, 1.0f}, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, getMeasuredHeight() - this.d, 0.0f, getMeasuredHeight(), new int[]{o10, o4, i7}, new float[]{0.0f, 0.18f, 1.0f}, Shader.TileMode.CLAMP);
    }

    public final void c(dh.c cVar, gh.e eVar) {
        fh.g c10 = cVar.c(this, null, false);
        c10.p(eVar);
        dh.d dVar = new dh.d(c10);
        this.f19862a = dVar;
        dVar.b(-g0.L(30.0f), true);
        fh.g c11 = cVar.c(this, null, false);
        c11.p(eVar);
        dh.d dVar2 = new dh.d(c11);
        this.f19863b = dVar2;
        dVar2.b(g0.L(30.0f), true);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (m6.i1(this.f19870w)) {
            int x02 = m6.x0(null, m6.Ca, false);
            int x03 = m6.x0(null, m6.Da, false);
            int measuredHeight = getMeasuredHeight();
            if (this.f19872y == null || this.G != x02 || this.F != x03 || this.H != this.f19864c || this.I != this.d || this.J != measuredHeight) {
                this.G = x02;
                this.F = x03;
                this.H = this.f19864c;
                this.I = this.d;
                this.J = measuredHeight;
                int[] iArr = {x02, x03, i0.a.o(x03, 0)};
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.f19872y = new LinearGradient(0.0f, 0.0f, 0.0f, Math.max(1, this.f19864c), iArr, new float[]{0.0f, 0.557f, 1.0f}, tileMode);
                this.E = new LinearGradient(0.0f, measuredHeight, 0.0f, measuredHeight - Math.max(1, this.d), iArr, new float[]{0.0f, 0.557f, 1.0f}, tileMode);
            }
            int i7 = this.f19864c;
            Paint paint = this.f19871x;
            if (i7 > 0 && this.f19862a.H > 0) {
                paint.setShader(this.f19872y);
                paint.setAlpha(this.f19862a.H);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f19864c, paint);
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
            this.f19862a.draw(canvas2);
            this.f19863b.draw(canvas2);
        }
        if (Color.alpha(this.h) != 0) {
            int i10 = this.f19864c;
            Paint paint2 = this.f19867n;
            if (i10 > 0 && this.f19862a.H > 0) {
                if (this.f19868r == null) {
                    this.f19868r = b(true);
                }
                paint2.setShader(this.f19868r);
                paint2.setAlpha(this.f19862a.H);
                canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.f19864c, paint2);
            }
            if (this.d > 0) {
                if (this.f19869s == null) {
                    this.f19869s = b(false);
                }
                paint2.setShader(this.f19869s);
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
        this.f19863b.b(i7, true);
    }

    public void setFadeHeightTop(int i7) {
        this.f19862a.b(-i7, true);
    }

    public void setFadeTopAlpha(int i7) {
        dh.d dVar = this.f19862a;
        if (dVar.H != i7) {
            dVar.H = i7;
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
        if (this.f19864c != i7) {
            this.f19864c = i7;
            a();
            invalidate();
        }
    }

    public void setIgnoreFastWay(boolean z10) {
        this.f19862a.G = z10;
        this.f19863b.G = z10;
    }

    public void setOverlayColor(int i7) {
        if (this.h != i7) {
            this.h = i7;
            this.f19869s = null;
            this.f19868r = null;
            invalidate();
        }
    }

    public void setResourcesProvider(h6 h6Var) {
        this.f19870w = h6Var;
    }

    public void setup(dh.c cVar) {
        c(cVar, null);
    }

    public void setupColorKey(int i7) {
        this.f19866f = i7;
        if (this.f19865e == null) {
            ui.c cVar = new ui.c();
            this.f19865e = cVar;
            cVar.a(m6.x0(null, i7, false));
            ui.c cVar2 = this.f19865e;
            setup(new dh.c(cVar2, cVar2, cVar2));
        }
    }

    @Override
    public final void updateColors() {
        int i7;
        ui.c cVar = this.f19865e;
        if (cVar != null && (i7 = this.f19866f) != -1) {
            cVar.a(m6.x0(null, i7, false));
            invalidate();
        }
    }
}

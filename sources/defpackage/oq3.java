package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
public abstract class oq3 implements gk7 {
    public static dd M;
    public final do3 E;
    public boolean F;
    public boolean H;
    public boolean J;
    public int K;
    public final int L;
    public boolean a;
    public Bitmap b;
    public Canvas c;
    public Bitmap d;
    public Canvas e;
    public boolean f;
    public int n;
    public boolean r;
    public int w;
    public int x;
    public int y;
    public byte h = 1;
    public final Paint s = new Paint(1);
    public final nq3 G = new nq3(this, (byte) 0);
    public final nq3 I = new nq3(this, (byte) 1);

    public oq3() {
        int i = 0;
        dd ddVar = M;
        if (ddVar == null) {
            ddVar = new dd((byte) 7);
            M = ddVar;
        }
        int i2 = ddVar.b + 1;
        ddVar.b = i2;
        if (i2 > 1) {
            ddVar.b = 0;
        } else {
            i = i2;
        }
        do3[] do3VarArr = (do3[]) ddVar.c;
        do3 do3Var = do3VarArr[i];
        if (do3Var == null) {
            do3Var = new do3("draw_background_queue_" + ddVar.b, true);
            do3VarArr[i] = do3Var;
        }
        this.E = do3Var;
        this.L = M.b;
    }

    public void a(Canvas canvas, long j, int i, int i2, float f) {
        if (this.F) {
            boolean z = w01.a;
            return;
        }
        this.x = i2;
        this.y = i;
        if (this.H) {
            this.H = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.e;
            this.d = this.b;
            this.e = this.c;
            this.b = bitmap;
            this.c = canvas2;
        }
        Bitmap bitmap2 = this.d;
        if (bitmap2 == null || this.J) {
            this.J = false;
            if (bitmap2 != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.d);
                gl.x2(arrayList);
                this.d = null;
            }
            int i3 = this.x + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i3 && this.d.getWidth() == this.y) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.y, i3, Bitmap.Config.ARGB_8888);
                this.e = new Canvas(this.d);
            }
            this.e.save();
            this.e.translate(0.0f, 0);
            d(this.e, f);
            this.e.restore();
        }
        if (!this.f && !this.r) {
            this.f = true;
            i(j);
            this.K = this.w;
            this.E.postRunnable(this.G);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.s;
            paint.setAlpha((int) (f * 255.0f));
            canvas.save();
            canvas.translate(0.0f, -0);
            b(canvas, bitmap4, paint);
            canvas.restore();
        }
    }

    public void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    public abstract void c(Canvas canvas);

    public abstract void d(Canvas canvas, float f);

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        if (i == kk7.i1) {
            Integer num = (Integer) objArr[0];
            if (this.h < num.intValue()) {
                if (num.intValue() != 512 || gba.o() < 2) {
                    int intValue = this.n | num.intValue();
                    this.n = intValue;
                    if (intValue != 0 && !this.r) {
                        this.r = true;
                    }
                }
            }
        } else if (i == kk7.j1) {
            Integer num2 = (Integer) objArr[0];
            if (this.h < num2.intValue() && (i3 = this.n) != 0) {
                int i4 = i3 & (~num2.intValue());
                this.n = i4;
                if (i4 == 0 && this.r) {
                    this.r = false;
                }
            }
        }
    }

    public final void e() {
        if (this.a) {
            return;
        }
        this.a = true;
        this.F = false;
        int i = kk7.e().p & (~this.h);
        this.n = i;
        if (i == 0 && this.r) {
            this.r = false;
        }
        kk7.e().b(this, kk7.i1);
        kk7.e().b(this, kk7.j1);
    }

    public final void f() {
        if (!this.a) {
            return;
        }
        if (!this.f) {
            j();
        }
        this.a = false;
        kk7.e().n(this, kk7.i1);
        kk7.e().n(this, kk7.j1);
    }

    public abstract void g();

    public abstract void i(long j);

    public final void j() {
        ArrayList arrayList = new ArrayList();
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            arrayList.add(bitmap);
        }
        Bitmap bitmap2 = this.b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.b = null;
        this.c = null;
        this.e = null;
        gl.x2(arrayList);
    }

    public final void k() {
        this.J = true;
        this.w++;
        if (this.d != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.d);
            this.d = null;
            gl.x2(arrayList);
        }
    }

    public final void l(int i) {
        this.h = (byte) 7;
        if (this.a) {
            this.n = kk7.e().p & (~this.h);
        }
    }

    public final void h() {
    }
}

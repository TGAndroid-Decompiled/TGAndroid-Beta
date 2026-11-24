package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.Utilities;
public final class vk0 {
    public do3 a;
    public final boolean b;
    public final View c;
    public final s71 d;
    public Bitmap[] e;
    public Bitmap[] f;
    public Bitmap[] g;
    public Canvas[] h;
    public Canvas[] i;
    public Canvas[] j;
    public boolean k;
    public float m;
    public boolean n;
    public boolean o;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public float u;
    public final Paint x;
    public final wjb y;
    public boolean l = true;
    public boolean p = true;
    public uk0 v = new uk0(this);
    public final Paint w = new Paint(2);

    public vk0(View view, s71 s71Var, wjb wjbVar) {
        Paint paint = new Paint();
        this.x = paint;
        this.b = true;
        this.c = view;
        this.d = s71Var;
        this.y = wjbVar;
        paint.setColor(-16777216);
    }

    public final void a() {
        Bitmap[] bitmapArr = this.g;
        if (bitmapArr == null) {
            bitmapArr = new Bitmap[2];
            this.g = bitmapArr;
            this.h = new Canvas[2];
        }
        if (this.e == null) {
            this.e = new Bitmap[2];
            this.j = new Canvas[2];
        }
        this.v.a = true;
        this.v = new uk0(this);
        for (int i = 0; i < 2; i++) {
            s71 s71Var = this.d;
            int measuredHeight = s71Var.getMeasuredHeight();
            int measuredWidth = s71Var.getMeasuredWidth();
            int L = gl.L(200.0f) + gl.m;
            this.s = L;
            if (i != 0) {
                L = measuredHeight;
            }
            Bitmap bitmap = bitmapArr[i];
            if (bitmap == null || bitmap.getHeight() != L || bitmapArr[i].getWidth() != s71Var.getMeasuredWidth()) {
                do3 do3Var = this.a;
                if (do3Var != null) {
                    do3Var.cleanupQueue();
                }
                Bitmap[] bitmapArr2 = this.e;
                int i2 = (int) (measuredWidth / 15.0f);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                bitmapArr2[i] = Bitmap.createBitmap(i2, (int) (L / 15.0f), config);
                wjb wjbVar = this.y;
                if (i == 1) {
                    this.e[i].eraseColor(bkb.v0(bkb.c6, wjbVar));
                }
                this.j[i] = new Canvas(this.e[i]);
                if (i == 0) {
                    measuredHeight = this.s;
                }
                this.g[i] = Bitmap.createBitmap(i2, (int) (measuredHeight / 15.0f), config);
                this.h[i] = new Canvas(this.g[i]);
                this.h[i].scale(this.g[i].getWidth() / this.e[i].getWidth(), this.g[i].getHeight() / this.e[i].getHeight());
                this.j[i].save();
                this.j[i].scale(0.06666667f, 0.06666667f, 0.0f, 0.0f);
                View view = this.c;
                Drawable background = view.getBackground();
                if (background == null) {
                    if (wjbVar instanceof ku1) {
                        background = ((ku1) wjbVar).l();
                    } else {
                        background = bkb.s0();
                    }
                }
                view.setTag(67108867, Integer.valueOf(i));
                if (i == 0) {
                    this.j[i].translate(0.0f, -this.u);
                    view.draw(this.j[i]);
                }
                if (i == 1) {
                    Rect bounds = background.getBounds();
                    background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    background.draw(this.j[i]);
                    background.setBounds(bounds);
                    view.draw(this.j[i]);
                }
                view.setTag(67108867, null);
                this.j[i].restore();
                Utilities.stackBlurBitmap(this.e[i], 15);
                Paint paint = this.w;
                paint.setAlpha(255);
                if (i == 1) {
                    this.g[i].eraseColor(bkb.v0(bkb.c6, wjbVar));
                }
                this.h[i].drawBitmap(this.e[i], 0.0f, 0.0f, paint);
            }
        }
    }
}

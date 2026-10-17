package bh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
public final class c extends Drawable {
    public final Paint f4364a;
    public final dh.d f4365b;
    public final Matrix f4366c;
    public LinearGradient d;
    public final Matrix e;
    public LinearGradient f4367f;
    public BitmapShader f4368g;
    public ComposeShader h;
    public final Matrix f4369i;
    public final Paint f4370j;
    public Bitmap f4371k;
    public int f4372l;
    public boolean f4373m;
    public final Paint f4374n;
    public int f4375o;
    public boolean f4376p;
    public int f4377q;

    public c(dh.d dVar) {
        Paint paint = new Paint(1);
        this.f4364a = paint;
        this.f4366c = new Matrix();
        this.e = new Matrix();
        this.f4369i = new Matrix();
        Paint paint2 = new Paint(1);
        this.f4370j = paint2;
        this.f4374n = new Paint(1);
        this.f4377q = 255;
        this.f4365b = dVar;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setFilterBitmap(true);
        b(AndroidUtilities.dp(40.0f), false);
    }

    public static LinearGradient a(int i10, boolean z10) {
        int alpha = Color.alpha(i10);
        if (z10) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.b.o(i10, 0), i0.b.o(i10, (alpha * 96) / 285), i0.b.o(i10, (alpha * 176) / 285), i0.b.o(i10, (alpha * 232) / 285)}, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.b.o(i10, 0), i0.b.o(i10, (alpha * 96) / 255), i0.b.o(i10, (alpha * 176) / 255), i0.b.o(i10, (alpha * 232) / 255), i0.b.o(i10, (alpha * 255) / 255)}, (float[]) null, Shader.TileMode.CLAMP);
    }

    public final void b(int i10, boolean z10) {
        if (this.f4372l == i10 && this.f4373m == z10) {
            return;
        }
        this.f4372l = i10;
        this.f4373m = z10;
        LinearGradient a2 = a(-16777216, z10);
        this.d = a2;
        this.f4364a.setShader(a2);
        this.f4374n.setShader(null);
        Matrix matrix = this.f4366c;
        matrix.reset();
        matrix.setScale(1.0f, i10);
        if (i10 < 0) {
            matrix.postTranslate(0.0f, -i10);
        }
        this.d.setLocalMatrix(matrix);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        boolean z10;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.f4377q != 0) {
            dh.d dVar = this.f4365b;
            gh.a i11 = dVar.i();
            while (i11 instanceof gh.e) {
                i11 = ((gh.e) i11).f11064a;
            }
            boolean z11 = this.f4376p;
            Matrix matrix = this.f4366c;
            int i12 = 0;
            Matrix matrix2 = this.e;
            if (!z11 && (i11 instanceof gh.c)) {
                int color = ((gh.c) i11).f11056a.getColor();
                int i13 = this.f4375o;
                Paint paint = this.f4374n;
                if (i13 != color || this.f4367f == null) {
                    LinearGradient a2 = a(color, this.f4373m);
                    this.f4367f = a2;
                    this.f4375o = color;
                    paint.setShader(a2);
                }
                if (this.f4372l < 0) {
                    i12 = bounds.height() + this.f4372l;
                }
                matrix2.set(matrix);
                matrix2.postTranslate(bounds.left, bounds.top + i12);
                this.f4367f.setLocalMatrix(matrix2);
                paint.setAlpha(this.f4377q);
                canvas.drawRect(bounds, paint);
            } else if (!z11 && (i11 instanceof gh.b) && (i10 = Build.VERSION.SDK_INT) >= 28) {
                gh.b bVar = (gh.b) i11;
                Bitmap bitmap = bVar.d;
                if (bitmap != null) {
                    boolean z12 = true;
                    if (this.f4375o == -16777216 && this.f4367f != null) {
                        z10 = false;
                    } else {
                        this.f4367f = a(-16777216, this.f4373m);
                        this.f4375o = -16777216;
                        z10 = true;
                    }
                    if (this.f4368g != null && this.f4371k == bitmap) {
                        z12 = z10;
                    } else {
                        this.f4371k = bitmap;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.f4368g = bitmapShader;
                        if (i10 >= 33) {
                            bitmapShader.setFilterMode(2);
                        }
                    }
                    Paint paint2 = this.f4370j;
                    if (z12 || this.h == null) {
                        ComposeShader composeShader = new ComposeShader(this.f4368g, this.f4367f, PorterDuff.Mode.DST_IN);
                        this.h = composeShader;
                        paint2.setShader(composeShader);
                    }
                    if (this.f4372l < 0) {
                        i12 = bounds.height() + this.f4372l;
                    }
                    matrix2.set(matrix);
                    matrix2.postTranslate(bounds.left, bounds.top + i12);
                    this.f4367f.setLocalMatrix(matrix2);
                    Matrix matrix3 = bVar.f11052b;
                    Matrix matrix4 = this.f4369i;
                    matrix4.set(matrix3);
                    matrix4.postTranslate(-dVar.f8010a, -dVar.f8011b);
                    this.f4368g.setLocalMatrix(matrix4);
                    paint2.setAlpha(this.f4377q);
                    canvas.drawRect(bounds, paint2);
                }
            } else {
                int saveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f4377q);
                if (this.f4372l < 0) {
                    i12 = bounds.height() + this.f4372l;
                }
                dVar.draw(canvas);
                canvas.translate(bounds.left, bounds.top + i12);
                canvas.drawRect(0.0f, -i12, bounds.width(), bounds.height() - i12, this.f4364a);
                canvas.restoreToCount(saveLayerAlpha);
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.f4377q;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f4365b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f4377q = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

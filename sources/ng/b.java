package ng;

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
public final class b extends Drawable {
    public final Paint f14953a;
    public final pg.b f14954b;
    public final Matrix f14955c;
    public LinearGradient d;
    public final Matrix e;
    public LinearGradient f14956f;
    public BitmapShader f14957g;
    public ComposeShader h;
    public final Matrix f14958i;
    public final Paint f14959j;
    public Bitmap f14960k;
    public int f14961l;
    public boolean f14962m;
    public final Paint f14963n;
    public int f14964o;
    public boolean f14965p;
    public int f14966q;

    public b(pg.b bVar) {
        Paint paint = new Paint(1);
        this.f14953a = paint;
        this.f14955c = new Matrix();
        this.e = new Matrix();
        this.f14958i = new Matrix();
        Paint paint2 = new Paint(1);
        this.f14959j = paint2;
        this.f14963n = new Paint(1);
        this.f14966q = 255;
        this.f14954b = bVar;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setFilterBitmap(true);
        b(AndroidUtilities.dp(40.0f), false);
    }

    public static LinearGradient a(int i10, boolean z4) {
        int alpha = Color.alpha(i10);
        if (z4) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.k(i10, 0), i0.a.k(i10, (alpha * 96) / 285), i0.a.k(i10, (alpha * 176) / 285), i0.a.k(i10, (alpha * 232) / 285)}, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.k(i10, 0), i0.a.k(i10, (alpha * 96) / 255), i0.a.k(i10, (alpha * 176) / 255), i0.a.k(i10, (alpha * 232) / 255), i0.a.k(i10, (alpha * 255) / 255)}, (float[]) null, Shader.TileMode.CLAMP);
    }

    public final void b(int i10, boolean z4) {
        if (this.f14961l == i10 && this.f14962m == z4) {
            return;
        }
        this.f14961l = i10;
        this.f14962m = z4;
        LinearGradient a2 = a(-16777216, z4);
        this.d = a2;
        this.f14953a.setShader(a2);
        this.f14963n.setShader(null);
        Matrix matrix = this.f14955c;
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
        boolean z4;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && this.f14966q != 0) {
            pg.b bVar = this.f14954b;
            sg.a i11 = bVar.i();
            while (i11 instanceof sg.e) {
                i11 = ((sg.e) i11).f44382a;
            }
            boolean z10 = this.f14965p;
            Matrix matrix = this.f14955c;
            int i12 = 0;
            Matrix matrix2 = this.e;
            if (!z10 && (i11 instanceof sg.c)) {
                int color = ((sg.c) i11).f44374a.getColor();
                int i13 = this.f14964o;
                Paint paint = this.f14963n;
                if (i13 != color || this.f14956f == null) {
                    LinearGradient a2 = a(color, this.f14962m);
                    this.f14956f = a2;
                    this.f14964o = color;
                    paint.setShader(a2);
                }
                if (this.f14961l < 0) {
                    i12 = bounds.height() + this.f14961l;
                }
                matrix2.set(matrix);
                matrix2.postTranslate(bounds.left, bounds.top + i12);
                this.f14956f.setLocalMatrix(matrix2);
                paint.setAlpha(this.f14966q);
                canvas.drawRect(bounds, paint);
            } else if (!z10 && (i11 instanceof sg.b) && (i10 = Build.VERSION.SDK_INT) >= 28) {
                sg.b bVar2 = (sg.b) i11;
                Bitmap bitmap = bVar2.d;
                if (bitmap != null) {
                    boolean z11 = true;
                    if (this.f14964o == -16777216 && this.f14956f != null) {
                        z4 = false;
                    } else {
                        this.f14956f = a(-16777216, this.f14962m);
                        this.f14964o = -16777216;
                        z4 = true;
                    }
                    if (this.f14957g != null && this.f14960k == bitmap) {
                        z11 = z4;
                    } else {
                        this.f14960k = bitmap;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.f14957g = bitmapShader;
                        if (i10 >= 33) {
                            bitmapShader.setFilterMode(2);
                        }
                    }
                    Paint paint2 = this.f14959j;
                    if (z11 || this.h == null) {
                        ComposeShader composeShader = new ComposeShader(this.f14957g, this.f14956f, PorterDuff.Mode.DST_IN);
                        this.h = composeShader;
                        paint2.setShader(composeShader);
                    }
                    if (this.f14961l < 0) {
                        i12 = bounds.height() + this.f14961l;
                    }
                    matrix2.set(matrix);
                    matrix2.postTranslate(bounds.left, bounds.top + i12);
                    this.f14956f.setLocalMatrix(matrix2);
                    Matrix matrix3 = bVar2.f44370b;
                    Matrix matrix4 = this.f14958i;
                    matrix4.set(matrix3);
                    matrix4.postTranslate(-bVar.f41242a, -bVar.f41243b);
                    this.f14957g.setLocalMatrix(matrix4);
                    paint2.setAlpha(this.f14966q);
                    canvas.drawRect(bounds, paint2);
                }
            } else {
                int saveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f14966q);
                if (this.f14961l < 0) {
                    i12 = bounds.height() + this.f14961l;
                }
                bVar.draw(canvas);
                canvas.translate(bounds.left, bounds.top + i12);
                canvas.drawRect(0.0f, -i12, bounds.width(), bounds.height() - i12, this.f14953a);
                canvas.restoreToCount(saveLayerAlpha);
            }
        }
    }

    @Override
    public final int getAlpha() {
        return this.f14966q;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f14954b.setBounds(rect);
    }

    @Override
    public final void setAlpha(int i10) {
        this.f14966q = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import java.lang.reflect.Array;
import java.util.Arrays;
public class m17 extends Drawable {
    public static final ye7[] T = new ye7[3];
    public NinePatchDrawable F;
    public int G;
    public boolean I;
    public m17 J;
    public float K;
    public boolean L;
    public boolean M;
    public Bitmap N;
    public BitmapShader O;
    public h24 P;
    public int Q;
    public float R;
    public boolean S;
    public Shader a;
    public int b;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public final byte l;
    public final boolean m;
    public wjb p;
    public final boolean q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final Paint c = new Paint(1);
    public final RectF j = new RectF();
    public final Matrix k = new Matrix();
    public final Rect o = new Rect();
    public Integer w = null;
    public boolean x = true;
    public final int[] y = {-1, -1, -1, -1};
    public final Bitmap[] z = new Bitmap[4];
    public final Drawable[] A = new Drawable[4];
    public final int[] B = {-1, -1, -1, -1};
    public final int[][] C = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    public final Drawable[][] D = (Drawable[][]) Array.newInstance(Drawable.class, 4, 4);
    public final int[][] E = {new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
    public final Path n = new Path();
    public final Paint d = new Paint(1);
    public int H = 255;

    public m17(int i, boolean z, boolean z2, wjb wjbVar) {
        this.p = wjbVar;
        this.q = z;
        this.l = i;
        this.m = z2;
    }

    public final void a() {
        Bitmap bitmap;
        if (this.a instanceof BitmapShader) {
            boolean z = this.L;
            Matrix matrix = this.k;
            ye7[] ye7VarArr = T;
            char c = 0;
            byte b = this.l;
            char c2 = 2;
            if (z && (bitmap = this.N) != null) {
                if (b == 2) {
                    c = 1;
                }
                float min = 1.0f / Math.min(bitmap.getWidth() / ye7VarArr[c].getBounds().width(), this.N.getHeight() / ye7VarArr[c].getBounds().height());
                matrix.postScale(min, min);
                return;
            }
            if (!this.v) {
                if (b == 2) {
                    c = 1;
                }
                c2 = c;
            }
            Bitmap bitmap2 = ye7VarArr[c2].k;
            float min2 = 1.0f / Math.min(bitmap2.getWidth() / ye7VarArr[c2].getBounds().width(), bitmap2.getHeight() / ye7VarArr[c2].getBounds().height());
            matrix.postScale(min2, min2);
        }
    }

    public final int b(float f) {
        if (this.l == 2) {
            return (int) Math.ceil(f * 3.0f);
        }
        return gl.L(f);
    }

    public final void c(Canvas canvas, Paint paint) {
        int b;
        int i;
        Path path;
        boolean z;
        m17 m17Var;
        Path path2;
        int g;
        Drawable f;
        if (this.q || !m() || this.S) {
            Rect bounds = getBounds();
            Paint paint2 = this.c;
            if (paint == null && paint2.getStyle() == Paint.Style.FILL && this.a == null && this.Q == 0 && this.R <= 0.0f && (f = f()) != null) {
                f.setBounds(bounds);
                f.draw(canvas);
                return;
            }
            int b2 = b(2.0f);
            int i2 = this.Q;
            if (i2 != 0) {
                i = i2;
            } else {
                if (this.R > 0.0f) {
                    i2 = gl.U1(this.R, b(gba.V0), Math.min(bounds.width(), bounds.height()) / 2);
                    b = gl.U1(this.R, b(Math.min(6, gba.V0)), Math.min(bounds.width(), bounds.height()) / 2);
                } else if (this.l == 2) {
                    i2 = b(6.0f);
                    b = b(6.0f);
                } else {
                    i2 = b(gba.V0);
                    b = b(Math.min(6, gba.V0));
                }
                i = b;
            }
            int b3 = b(6.0f);
            if (paint != null) {
                paint2 = paint;
            }
            if (paint == null && this.a != null) {
                Matrix matrix = this.k;
                matrix.reset();
                a();
                matrix.postTranslate(0.0f, -this.r);
                this.a.setLocalMatrix(matrix);
            }
            int max = Math.max(bounds.top, 0);
            if (this.P != null) {
                bounds.height();
                int i3 = this.b;
            }
            h24 h24Var = this.P;
            boolean z2 = true;
            if (h24Var != null) {
                path = (Path) h24Var.c;
                z = h24Var.j(bounds, true, true);
            } else {
                path = this.n;
                z = true;
            }
            if (!z && this.Q == 0) {
                m17Var = this;
                path2 = path;
            } else {
                if (paint == null) {
                    z2 = false;
                }
                m17Var = this;
                int i4 = i2;
                path2 = path;
                m17Var.e(path2, bounds, b2, i4, b3, i, max, true, true, z2);
            }
            canvas.drawPath(path2, paint2);
            if (m17Var.a != null && m17Var.m && paint == null) {
                int o = bm2.o(m17Var.g(bkb.Rc), (int) ((Color.alpha(g) * m17Var.H) / 255.0f));
                Paint paint3 = m17Var.d;
                paint3.setColor(o);
                canvas.drawPath(path2, paint3);
            }
        }
    }

    public final void d(Canvas canvas, h24 h24Var, Paint paint) {
        this.P = h24Var;
        m17 m17Var = this.J;
        if (m17Var != null) {
            m17Var.P = h24Var;
        }
        c(canvas, paint);
        this.P = null;
        m17 m17Var2 = this.J;
        if (m17Var2 != null) {
            m17Var2.P = null;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        m17 m17Var = this.J;
        if (m17Var != null) {
            m17Var.draw(canvas);
            setAlpha((int) (this.K * 255.0f));
            c(canvas, null);
            setAlpha(255);
            return;
        }
        c(canvas, null);
    }

    public final void e(Path path, Rect rect, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3) {
        int i6;
        int i7;
        int i8;
        int i9;
        path.rewind();
        int height = (rect.height() - i) >> 1;
        int i10 = i2;
        if (i10 > height) {
            i10 = height;
        }
        boolean z4 = this.I;
        byte b = this.l;
        RectF rectF = this.j;
        if (this.q) {
            if (!z4 && b != 2 && !z3 && !z) {
                path.moveTo(rect.right - b(8.0f), (i5 - this.r) + this.b);
                path.lineTo(rect.left + i, (i5 - this.r) + this.b);
            } else {
                if (this.u) {
                    i8 = i4;
                } else {
                    i8 = i10;
                }
                int i11 = rect.right;
                if (b == 1) {
                    path.moveTo((i11 - b(8.0f)) - i8, rect.bottom - i);
                } else {
                    path.moveTo(i11 - b(2.6f), rect.bottom - i);
                }
                path.lineTo(rect.left + i + i8, rect.bottom - i);
                int i12 = rect.left + i;
                int i13 = rect.bottom - i;
                int i14 = i8 << 1;
                rectF.set(i12, i13 - i14, i12 + i14, i13);
                path.arcTo(rectF, 90.0f, 90.0f, false);
            }
            if (!this.I && b != 2 && !z3 && !z2) {
                path.lineTo(rect.left + i, (i5 - this.r) - b(2.0f));
                int i15 = rect.right;
                if (b == 1) {
                    path.lineTo(i15 - i, (i5 - this.r) - b(2.0f));
                } else {
                    path.lineTo(i15 - b(8.0f), (i5 - this.r) - b(2.0f));
                }
            } else {
                path.lineTo(rect.left + i, rect.top + i + i10);
                int i16 = rect.left + i;
                int i17 = rect.top + i;
                int i18 = i10 << 1;
                rectF.set(i16, i17, i16 + i18, i17 + i18);
                path.arcTo(rectF, 180.0f, 90.0f, false);
                if (this.s) {
                    i9 = i4;
                } else {
                    i9 = i10;
                }
                int i19 = rect.right;
                if (b == 1) {
                    path.lineTo((i19 - i) - i9, rect.top + i);
                    int i20 = rect.right - i;
                    int i21 = i9 << 1;
                    int i22 = rect.top + i;
                    rectF.set(i20 - i21, i22, i20, i22 + i21);
                } else {
                    path.lineTo((i19 - b(8.0f)) - i9, rect.top + i);
                    int i23 = i9 << 1;
                    rectF.set((rect.right - b(8.0f)) - i23, rect.top + i, rect.right - b(8.0f), rect.top + i + i23);
                }
                path.arcTo(rectF, 270.0f, 90.0f, false);
            }
            if (b == 1) {
                if (!z3 && !z) {
                    path.lineTo(rect.right - i, (i5 - this.r) + this.b);
                } else {
                    if (this.t) {
                        i10 = i4;
                    }
                    path.lineTo(rect.right - i, (rect.bottom - i) - i10);
                    int i24 = rect.right - i;
                    int i25 = i10 << 1;
                    int i26 = rect.bottom - i;
                    rectF.set(i24 - i25, i26 - i25, i24, i26);
                    path.arcTo(rectF, 0.0f, 90.0f, false);
                }
            } else if (!this.I && b != 2 && !z3 && !z) {
                path.lineTo(rect.right - b(8.0f), (i5 - this.r) + this.b);
            } else {
                path.lineTo(rect.right - b(8.0f), ((rect.bottom - i) - i3) - b(3.0f));
                int i27 = i3 << 1;
                rectF.set(rect.right - b(8.0f), ((rect.bottom - i) - i27) - b(9.0f), (rect.right - b(7.0f)) + i27, (rect.bottom - i) - b(1.0f));
                path.arcTo(rectF, 180.0f, -83.0f, false);
            }
        } else {
            if (!z4 && b != 2 && !z3 && !z) {
                path.moveTo(b(8.0f) + rect.left, (i5 - this.r) + this.b);
                path.lineTo(rect.right - i, (i5 - this.r) + this.b);
            } else {
                if (this.u) {
                    i6 = i4;
                } else {
                    i6 = i10;
                }
                int i28 = rect.left;
                if (b == 1) {
                    path.moveTo(b(8.0f) + i28 + i6, rect.bottom - i);
                } else {
                    path.moveTo(b(2.6f) + i28, rect.bottom - i);
                }
                path.lineTo((rect.right - i) - i6, rect.bottom - i);
                int i29 = rect.right - i;
                int i30 = i6 << 1;
                int i31 = rect.bottom - i;
                rectF.set(i29 - i30, i31 - i30, i29, i31);
                path.arcTo(rectF, 90.0f, -90.0f, false);
            }
            if (!this.I && b != 2 && !z3 && !z2) {
                path.lineTo(rect.right - i, (i5 - this.r) - b(2.0f));
                int i32 = rect.left;
                if (b == 1) {
                    path.lineTo(i32 + i, (i5 - this.r) - b(2.0f));
                } else {
                    path.lineTo(b(8.0f) + i32, (i5 - this.r) - b(2.0f));
                }
            } else {
                path.lineTo(rect.right - i, rect.top + i + i10);
                int i33 = rect.right - i;
                int i34 = i10 << 1;
                int i35 = rect.top + i;
                rectF.set(i33 - i34, i35, i33, i35 + i34);
                path.arcTo(rectF, 0.0f, -90.0f, false);
                if (this.s) {
                    i7 = i4;
                } else {
                    i7 = i10;
                }
                int i36 = rect.left;
                if (b == 1) {
                    path.lineTo(i36 + i + i7, rect.top + i);
                    int i37 = rect.left + i;
                    int i38 = rect.top + i;
                    int i39 = i7 << 1;
                    rectF.set(i37, i38, i37 + i39, i38 + i39);
                } else {
                    path.lineTo(b(8.0f) + i36 + i7, rect.top + i);
                    int i40 = i7 << 1;
                    rectF.set(b(8.0f) + rect.left, rect.top + i, b(8.0f) + rect.left + i40, rect.top + i + i40);
                }
                path.arcTo(rectF, 270.0f, -90.0f, false);
            }
            if (b == 1) {
                if (!z3 && !z) {
                    path.lineTo(rect.left + i, (i5 - this.r) + this.b);
                } else {
                    if (this.t || this.u) {
                        i10 = i4;
                    }
                    path.lineTo(rect.left + i, (rect.bottom - i) - i10);
                    int i41 = rect.left + i;
                    int i42 = rect.bottom - i;
                    int i43 = i10 << 1;
                    rectF.set(i41, i42 - i43, i41 + i43, i42);
                    path.arcTo(rectF, 180.0f, -90.0f, false);
                }
            } else if (!this.I && b != 2 && !z3 && !z) {
                path.lineTo(b(8.0f) + rect.left, (i5 - this.r) + this.b);
            } else {
                path.lineTo(b(8.0f) + rect.left, ((rect.bottom - i) - i3) - b(3.0f));
                int b2 = b(7.0f) + rect.left;
                int i44 = i3 << 1;
                rectF.set(b2 - i44, ((rect.bottom - i) - i44) - b(9.0f), b(8.0f) + rect.left, (rect.bottom - i) - b(1.0f));
                path.arcTo(rectF, 0.0f, 83.0f, false);
            }
        }
        path.close();
    }

    public final Drawable f() {
        char c;
        int i;
        int g;
        int i2;
        boolean z;
        int i3;
        int i4;
        Drawable[][] drawableArr;
        int[][] iArr;
        int i5;
        int i6;
        Rect rect = this.o;
        int i7 = this.Q;
        if (i7 == 0) {
            if (this.R > 0.0f) {
                i7 = 0;
            } else {
                i7 = b(gba.V0);
            }
        }
        boolean z2 = this.s;
        boolean z3 = this.t;
        char c2 = 3;
        if (z2) {
            if (z3) {
                c = 3;
            } else {
                c = 2;
            }
        } else if (z3) {
            c = 1;
        } else {
            c = 0;
        }
        boolean z4 = this.u;
        boolean z5 = this.m;
        if (z5) {
            if (!z4) {
                c2 = 1;
            }
        } else if (z4) {
            c2 = 2;
        } else {
            c2 = 0;
        }
        Integer num = this.w;
        boolean z6 = this.q;
        if (num != null) {
            g = num.intValue();
        } else if (z6 && m()) {
            g = h();
        } else if (z5) {
            if (z6) {
                i2 = bkb.rb;
            } else {
                i2 = bkb.Tc;
            }
            g = g(i2);
        } else {
            if (z6) {
                i = bkb.qb;
            } else {
                i = bkb.qa;
            }
            g = g(i);
        }
        if (this.x && this.a == null && !z5 && !this.L && !m()) {
            z = true;
        } else {
            z = false;
        }
        if (z6) {
            i3 = bkb.sb;
        } else {
            i3 = bkb.sa;
        }
        int g2 = g(i3);
        boolean z7 = this.M;
        Drawable[][] drawableArr2 = this.D;
        int[][] iArr2 = this.E;
        int[] iArr3 = this.B;
        int[][] iArr4 = this.C;
        if (z7 == z && iArr4[c2][c] == i7 && ((!z || iArr3[c] == g2) && iArr2[c2][c] == g)) {
            i4 = g;
            drawableArr = drawableArr2;
            iArr = iArr2;
        } else {
            iArr4[c2][c] = i7;
            this.S = true;
            try {
                Bitmap createBitmap = Bitmap.createBitmap(b(50.0f), b(40.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                rect.set(getBounds());
                if (z) {
                    iArr3[c] = g2;
                    Paint paint = new Paint(1);
                    i5 = 1;
                    paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, b(40.0f), new int[]{358573417, 694117737}, (float[]) null, Shader.TileMode.CLAMP));
                    paint.setColorFilter(new PorterDuffColorFilter(g2, PorterDuff.Mode.MULTIPLY));
                    paint.setShadowLayer(2.0f, 0.0f, 1.0f, -1);
                    if (gl.p > 1.0f) {
                        setBounds(-1, -1, createBitmap.getWidth() + 1, createBitmap.getHeight() + 1);
                        i6 = 0;
                    } else {
                        i6 = 0;
                        setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    }
                    c(canvas, paint);
                    if (gl.p > 1.0f) {
                        paint.setColor(i6);
                        paint.setShadowLayer(0.0f, 0.0f, 0.0f, i6);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        c(canvas, paint);
                    }
                } else {
                    i5 = 1;
                }
                Paint paint2 = new Paint(i5);
                paint2.setColor(g);
                setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                c(canvas, paint2);
                i4 = g;
                drawableArr = drawableArr2;
                iArr = iArr2;
                try {
                    drawableArr2[c2][c] = new NinePatchDrawable(createBitmap, rpe.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i4).array(), new Rect(), null);
                    setBounds(rect);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                i4 = g;
                drawableArr = drawableArr2;
                iArr = iArr2;
            }
            this.S = false;
        }
        this.M = z;
        iArr[c2][c] = i4;
        return drawableArr[c2][c];
    }

    public final void finalize() {
        super.finalize();
        Bitmap[] bitmapArr = this.z;
        for (Bitmap bitmap : bitmapArr) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        Arrays.fill(bitmapArr, (Object) null);
        Arrays.fill(this.A, (Object) null);
        Arrays.fill(this.y, -1);
    }

    public int g(int i) {
        if (this.l == 2) {
            return bkb.w0(null, i, false);
        }
        wjb wjbVar = this.p;
        if (wjbVar != null) {
            return wjbVar.h(i);
        }
        return bkb.w0(null, i, false);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final int h() {
        int g = g(bkb.Ka);
        if (this.m) {
            g = bm2.o(g, Math.min(255, Color.alpha(g) << 1));
        }
        return bm2.k(g, g(bkb.ta));
    }

    public int i(int i) {
        if (this.l == 2) {
            return bkb.w0(null, i, false);
        }
        wjb wjbVar = this.p;
        if (wjbVar != null) {
            return wjbVar.j(i);
        }
        return bkb.km.get(i);
    }

    public final ye7 j() {
        char c;
        boolean z = this.v;
        ye7[] ye7VarArr = T;
        if (z) {
            return ye7VarArr[2];
        }
        if (this.l == 2) {
            c = 1;
        } else {
            c = 0;
        }
        return ye7VarArr[c];
    }

    public final Drawable k() {
        char c;
        int i;
        int i2;
        if (this.L || m() || (this.a == null && !this.m && this.J == null)) {
            return null;
        }
        int b = b(gba.V0);
        boolean z = this.s;
        boolean z2 = this.t;
        boolean z3 = false;
        if (z) {
            if (z2) {
                c = 3;
            } else {
                c = 2;
            }
        } else if (z2) {
            c = 1;
        } else {
            c = 0;
        }
        int[] iArr = this.y;
        int i3 = iArr[c];
        Drawable[] drawableArr = this.A;
        if (i3 != b) {
            iArr[c] = b;
            Bitmap[] bitmapArr = this.z;
            Bitmap bitmap = bitmapArr[c];
            if (bitmap != null) {
                bitmap.recycle();
            }
            try {
                Bitmap createBitmap = Bitmap.createBitmap(b(50.0f), b(40.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(1);
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, b(40.0f), new int[]{358573417, 694117737}, (float[]) null, Shader.TileMode.CLAMP));
                paint.setShadowLayer(2.0f, 0.0f, 1.0f, -1);
                if (gl.p > 1.0f) {
                    setBounds(-1, -1, createBitmap.getWidth() + 1, createBitmap.getHeight() + 1);
                } else {
                    setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                }
                c(canvas, paint);
                if (gl.p > 1.0f) {
                    paint.setColor(0);
                    paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    c(canvas, paint);
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                bitmapArr[c] = createBitmap;
                drawableArr[c] = new NinePatchDrawable(createBitmap, rpe.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, i2).array(), new Rect(), null);
                z3 = true;
            } catch (Throwable unused) {
            }
        }
        if (this.q) {
            i = bkb.sb;
        } else {
            i = bkb.sa;
        }
        int g = g(i);
        Drawable drawable = drawableArr[c];
        if (drawable != null) {
            int[] iArr2 = this.B;
            if (iArr2[c] != g || z3) {
                drawable.setColorFilter(new PorterDuffColorFilter(g, PorterDuff.Mode.MULTIPLY));
                iArr2[c] = g;
            }
        }
        return drawableArr[c];
    }

    public final boolean l() {
        if (this.a != null && bkb.mm) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if (bkb.g1(this.p) && this.l != 2 && this.w == null) {
            return true;
        }
        return false;
    }

    public final Path n() {
        int b;
        int i;
        boolean z;
        boolean z2;
        Path path;
        h24 h24Var = this.P;
        Rect bounds = getBounds();
        int b2 = b(2.0f);
        int i2 = this.Q;
        byte b3 = this.l;
        if (i2 != 0) {
            i = i2;
        } else {
            if (this.R > 0.0f) {
                i2 = gl.U1(this.R, b(gba.V0), Math.min(bounds.width(), bounds.height()) / 2);
                b = gl.U1(this.R, b(Math.min(6, gba.V0)), Math.min(bounds.width(), bounds.height()) / 2);
            } else if (b3 == 2) {
                i2 = b(6.0f);
                b = b(6.0f);
            } else {
                i2 = b(gba.V0);
                b = b(Math.min(6, gba.V0));
            }
            i = b;
        }
        int b4 = b(6.0f);
        boolean z3 = false;
        int max = Math.max(bounds.top, 0);
        boolean z4 = true;
        if (h24Var != null && bounds.height() < this.b) {
            z = true;
            z2 = true;
        } else {
            int i3 = this.r;
            int i4 = bounds.bottom;
            int i5 = this.b;
            int i6 = i4 + i3;
            if (b3 != 1 ? i6 - i2 < i5 : i6 - (b4 << 1) < i5) {
                z = true;
            } else {
                z = false;
            }
            if (i3 + (i2 << 1) >= 0) {
                z3 = true;
            }
            z2 = z3;
        }
        if (h24Var != null) {
            path = (Path) h24Var.c;
            z4 = h24Var.j(bounds, z, z2);
        } else {
            path = this.n;
        }
        if (!z4 && this.Q == 0) {
            return path;
        }
        boolean z5 = z;
        Path path2 = path;
        e(path2, bounds, b2, i2, b4, i, max, z5, z2, true);
        return path2;
    }

    public void o(int i, int i2, int i3) {
        p(i, i2, i3, i3, 0, 0, false, false);
    }

    public void p(int r26, int r27, int r28, int r29, int r30, int r31, boolean r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m17.p(int, int, int, int, int, int, boolean, boolean):void");
    }

    @Override
    public final void setAlpha(int i) {
        int i2 = this.H;
        Paint paint = this.c;
        if (i2 != i || paint.getAlpha() != i) {
            this.H = i;
            paint.setAlpha(i);
            if (this.q) {
                this.d.setAlpha((int) ((i / 255.0f) * Color.alpha(g(bkb.Rc))));
            }
        }
        if (this.a == null) {
            Drawable f = f();
            if (f.getAlpha() != i) {
                f.setAlpha(i);
            }
        }
    }

    @Override
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        m17 m17Var = this.J;
        if (m17Var != null) {
            m17Var.setBounds(i, i2, i3, i4);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override
    public final void setColorFilter(int i, PorterDuff.Mode mode) {
    }
}

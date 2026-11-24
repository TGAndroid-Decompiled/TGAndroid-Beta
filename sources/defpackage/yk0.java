package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class yk0 extends e69 implements vi5 {
    public final Rect E;
    public final RectF F;
    public Bitmap G;
    public float[] H;
    public int I;
    public int J;
    public float K;
    public boolean L;
    public p59 M;
    public float[] N;
    public int[] O;
    public short[] P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public float[] W;
    public float[] X;
    public short[] Y;
    public int Z;
    public final r59 a;
    public int a0;
    public final rac b;
    public boolean b0;
    public final rac c;
    public float[] c0;
    public final h68 d;
    public int d0;
    public final int e;
    public float[] e0;
    public final float f;
    public int f0;
    public final boolean h;
    public final Paint n = new Paint(3);
    public final Paint r = new Paint(3);
    public final Paint s = new Paint();
    public final Paint w = new Paint();
    public final Paint x;
    public final RectF y;

    public yk0(r59 r59Var, rac racVar, rac racVar2, int i, float f, h68 h68Var, boolean z, boolean z2, p59 p59Var) {
        Paint paint = new Paint();
        this.x = paint;
        this.y = new RectF();
        this.E = new Rect();
        this.F = new RectF();
        this.H = new float[32];
        this.K = -1.0f;
        this.N = new float[128];
        this.O = new int[64];
        this.P = new short[96];
        this.W = new float[128];
        this.X = new float[128];
        this.Y = new short[96];
        this.c0 = new float[48];
        this.e0 = new float[32];
        this.a = r59Var;
        this.b = racVar;
        this.c = racVar2;
        this.e = i;
        this.f = f;
        this.d = h68Var;
        this.h = z;
        this.L = z2;
        this.M = p59Var;
        paint.setColor(-1);
    }

    @Override
    public final void a(ucb ucbVar, RectF rectF) {
        ucbVar.b = true;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, r69 r69Var) {
        int b;
        int L;
        if (u(view)) {
            int i = this.e;
            rect.right = i;
            rect.left = i;
            u69 T = recyclerView.T(view);
            y59 adapter = recyclerView.getAdapter();
            if (T != null && adapter != null && (b = T.b()) != -1) {
                if (b == 0) {
                    if (this.h) {
                        L = i;
                    } else {
                        L = gm.L(4.0f);
                    }
                    rect.top = L;
                }
                if (b == adapter.b() - 1) {
                    rect.bottom = i;
                }
            }
        }
    }

    @Override
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        r59 r59Var = this.a;
        if (recyclerView == r59Var) {
            int sectionsBackgroundColorForDecoration = r59Var.getSectionsBackgroundColorForDecoration();
            Paint paint = this.s;
            if (paint.getColor() != sectionsBackgroundColorForDecoration) {
                paint.setColor(sectionsBackgroundColorForDecoration);
                this.G = null;
                this.K = -1.0f;
            }
            if (!this.L) {
                p(canvas);
                return;
            }
            int ordinal = this.M.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 3) {
                        m(canvas, 1.0f);
                        p(canvas);
                        return;
                    }
                    this.Q = 0;
                    this.R = 0;
                    this.S = 0;
                    this.T = true;
                    m(canvas, 0.0f);
                    p(canvas);
                    this.T = false;
                    int i = this.Q;
                    if (i == 0) {
                        return;
                    }
                    canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i, this.N, 0, null, 0, this.O, 0, this.P, 0, this.S, this.x);
                    return;
                }
                int r = r(1.0f);
                Paint paint2 = this.w;
                paint2.setColor(r);
                canvas.drawRect(0.0f, 0.0f, r59Var.getWidth(), r59Var.getHeight(), paint2);
                m(canvas, 0.0f);
                this.U = true;
                p(canvas);
                this.U = false;
                return;
            }
            canvas.drawRect(0.0f, 0.0f, r59Var.getWidth(), r59Var.getHeight(), paint);
            p(canvas);
        }
    }

    @Override
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int i;
        yk0 yk0Var = this;
        r59 r59Var = yk0Var.a;
        if (recyclerView == r59Var) {
            float f = yk0Var.f;
            if (f > 0.0f) {
                int sectionsBackgroundColorForDecoration = r59Var.getSectionsBackgroundColorForDecoration();
                Paint paint = yk0Var.s;
                if (paint.getColor() != sectionsBackgroundColorForDecoration) {
                    paint.setColor(sectionsBackgroundColorForDecoration);
                    yk0Var.G = null;
                    yk0Var.K = -1.0f;
                }
                boolean z = true;
                int max = Math.max(1, (int) Math.ceil(f));
                Bitmap bitmap = yk0Var.G;
                Paint paint2 = yk0Var.r;
                if (bitmap == null || yk0Var.J != max || yk0Var.K != f) {
                    yk0Var.J = max;
                    yk0Var.K = f;
                    int i2 = max << 1;
                    yk0Var.G = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
                    Canvas canvas3 = new Canvas(yk0Var.G);
                    canvas3.drawColor(paint.getColor());
                    Paint paint3 = new Paint(1);
                    paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    float f2 = max;
                    canvas3.drawCircle(f2, f2, f, paint3);
                    Bitmap bitmap2 = yk0Var.G;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
                }
                z = (yk0Var.L && yk0Var.M == p59.b) ? false : false;
                yk0Var.b0 = z;
                if (z) {
                    yk0Var.Z = 0;
                    yk0Var.a0 = 0;
                }
                if (r59Var.c0()) {
                    int paddingLeft = r59Var.getPaddingLeft();
                    int i3 = yk0Var.e;
                    float f3 = paddingLeft + i3;
                    float width = (r59Var.getWidth() - r59Var.getPaddingRight()) - i3;
                    float f4 = f * 0.2f;
                    int i4 = 0;
                    while (i4 < yk0Var.f0) {
                        float[] fArr = yk0Var.e0;
                        float f5 = f3;
                        float f6 = width;
                        float f7 = fArr[i4];
                        float f8 = fArr[i4 + 1];
                        float f9 = fArr[i4 + 2];
                        float f10 = fArr[i4 + 3];
                        int i5 = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
                        if (i5 > 0 && i4 > 0) {
                            f9 = Math.min(f9, Math.max(0.0f, Math.min(1.0f, (f7 - fArr[i4 - 3]) / f4)));
                        }
                        float f11 = f9;
                        if (i5 > 0 && (i = i4 + 4) < yk0Var.f0) {
                            f10 = Math.min(f10, Math.max(0.0f, Math.min(1.0f, (yk0Var.e0[i] - f8) / f4)));
                        }
                        int i6 = 0;
                        while (true) {
                            if (i6 < r59Var.getChildCount()) {
                                View childAt = r59Var.getChildAt(i6);
                                if (r59.b1(childAt) && Math.abs(r59.v1(childAt) - f7) < 1.0f) {
                                    canvas2 = canvas;
                                    break;
                                }
                                i6++;
                            } else {
                                canvas2 = canvas;
                                yk0Var.q(f5, f6, f7, f11, canvas2);
                                yk0Var = this;
                                break;
                            }
                        }
                        yk0Var.k(f5, f6, f8, f10, canvas2);
                        i4 += 4;
                        width = f6;
                        f3 = f5;
                    }
                } else {
                    int i7 = 0;
                    while (i7 < r59Var.getChildCount()) {
                        View childAt2 = r59Var.getChildAt(i7);
                        u69 T = r59Var.T(childAt2);
                        int R = RecyclerView.R(childAt2);
                        if (childAt2 != r59Var.getEmptyView() && childAt2.getVisibility() == 0 && childAt2.getAlpha() > 0.0f && R != -1 && ((T == null || !T.j()) && yk0Var.u(childAt2) && !r59Var.i1(R))) {
                            float x = childAt2.getX();
                            float width2 = childAt2.getWidth() + x;
                            if (!yk0Var.v(R - 1) && !r59.b1(childAt2)) {
                                yk0Var.q(x, width2, r59.v1(childAt2), 1.0f, canvas);
                            }
                            if (!yk0Var.v(R + 1)) {
                                yk0Var.k(x, width2, r59.H0(childAt2), 1.0f, canvas);
                            }
                        }
                        i7++;
                        yk0Var = this;
                    }
                }
                if (r59Var.L2 != null) {
                    for (int i8 = 0; i8 < r59Var.L2.size(); i8++) {
                        long longValue = ((Long) r59Var.L2.get(i8)).longValue();
                        Typeface typeface = gm.a;
                        View U0 = r59Var.U0((int) (longValue >> 32));
                        View U02 = r59Var.U0((int) longValue);
                        if (U0 != null && !r59.b1(U0)) {
                            q(U0.getX(), U0.getX() + U0.getWidth(), r59.v1(U0), 1.0f, canvas);
                        }
                        if (U02 != null) {
                            k(U02.getX(), U02.getWidth() + U02.getX(), r59.H0(U02), 1.0f, canvas);
                        }
                    }
                }
                if (this.b0) {
                    this.b0 = false;
                    int i9 = this.Z;
                    if (i9 != 0) {
                        canvas.drawVertices(Canvas.VertexMode.TRIANGLES, i9, this.W, 0, this.X, 0, null, 0, this.Y, 0, this.a0, paint2);
                    }
                }
            }
        }
    }

    @Override
    public final void g(Canvas canvas, RectF rectF) {
        canvas.save();
        try {
            canvas.clipRect(rectF);
            this.V = true;
            p(canvas);
        } finally {
            this.V = false;
            canvas.restore();
        }
    }

    public final void h(float f, float f2) {
        if (f2 <= f) {
            return;
        }
        int i = this.I;
        int i2 = i + 2;
        float[] fArr = this.H;
        if (i2 > fArr.length) {
            float[] fArr2 = new float[fArr.length << 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.H = fArr2;
            fArr = fArr2;
        }
        int i3 = this.I;
        int i4 = i3 + 1;
        this.I = i4;
        fArr[i3] = f;
        this.I = i3 + 2;
        fArr[i4] = f2;
    }

    public final void i(float f, float f2, float f3, float f4, int i) {
        if (f3 > f && f4 > f2) {
            int i2 = this.Q;
            int i3 = i2 + 8;
            float[] fArr = this.N;
            if (i3 > fArr.length) {
                float[] fArr2 = new float[fArr.length << 1];
                System.arraycopy(fArr, 0, fArr2, 0, i2);
                this.N = fArr2;
            }
            int i4 = this.R;
            int i5 = i4 + 4;
            int[] iArr = this.O;
            if (i5 > iArr.length) {
                int[] iArr2 = new int[iArr.length << 1];
                System.arraycopy(iArr, 0, iArr2, 0, i4);
                this.O = iArr2;
            }
            int i6 = this.S;
            int i7 = i6 + 6;
            short[] sArr = this.P;
            if (i7 > sArr.length) {
                short[] sArr2 = new short[sArr.length << 1];
                System.arraycopy(sArr, 0, sArr2, 0, i6);
                this.P = sArr2;
                sArr = sArr2;
            }
            int i8 = this.R;
            float[] fArr3 = this.N;
            int i9 = this.Q;
            int i10 = i9 + 1;
            this.Q = i10;
            fArr3[i9] = f;
            int i11 = i9 + 2;
            this.Q = i11;
            fArr3[i10] = f2;
            int i12 = i9 + 3;
            this.Q = i12;
            fArr3[i11] = f3;
            int i13 = i9 + 4;
            this.Q = i13;
            fArr3[i12] = f2;
            int i14 = i9 + 5;
            this.Q = i14;
            fArr3[i13] = f;
            int i15 = i9 + 6;
            this.Q = i15;
            fArr3[i14] = f4;
            int i16 = i9 + 7;
            this.Q = i16;
            fArr3[i15] = f3;
            this.Q = i9 + 8;
            fArr3[i16] = f4;
            int[] iArr3 = this.O;
            int i17 = i8 + 1;
            this.R = i17;
            iArr3[i8] = i;
            int i18 = i8 + 2;
            this.R = i18;
            iArr3[i17] = i;
            int i19 = i8 + 3;
            this.R = i19;
            iArr3[i18] = i;
            this.R = i8 + 4;
            iArr3[i19] = i;
            int i20 = this.S;
            int i21 = i20 + 1;
            this.S = i21;
            sArr[i20] = (short) i8;
            int i22 = i20 + 2;
            this.S = i22;
            short s = (short) i17;
            sArr[i21] = s;
            int i23 = i20 + 3;
            this.S = i23;
            short s2 = (short) i18;
            sArr[i22] = s2;
            int i24 = i20 + 4;
            this.S = i24;
            sArr[i23] = s2;
            int i25 = i20 + 5;
            this.S = i25;
            sArr[i24] = s;
            this.S = i20 + 6;
            sArr[i25] = (short) i19;
        }
    }

    public final void j(float f, float f2, float f3, float f4, Canvas canvas) {
        if (f3 > f && f4 > f2) {
            boolean z = this.T;
            Paint paint = this.s;
            if (z) {
                i(f, f2, f3, f4, paint.getColor());
            } else {
                canvas.drawRect(f, f2, f3, f4, paint);
            }
        }
    }

    public final void k(float f, float f2, float f3, float f4, Canvas canvas) {
        if (f4 <= 0.0f) {
            return;
        }
        float min = Math.min(1.0f, f4) * this.J;
        float f5 = f3 - min;
        l(canvas, 2, f, f5, f + min, f3);
        l(canvas, 3, f2 - min, f5, f2, f3);
    }

    public final void l(Canvas canvas, int i, float f, float f2, float f3, float f4) {
        int i2;
        int i3;
        if ((i & 1) == 0) {
            i2 = 0;
        } else {
            i2 = this.J;
        }
        if (i < 2) {
            i3 = 0;
        } else {
            i3 = this.J;
        }
        boolean z = this.b0;
        int i4 = this.J;
        if (z) {
            float f5 = i2;
            float f6 = i3;
            float f7 = i2 + i4;
            float f8 = i3 + i4;
            int i5 = this.Z;
            int i6 = i5 + 8;
            float[] fArr = this.W;
            if (i6 > fArr.length) {
                int length = fArr.length << 1;
                float[] fArr2 = new float[length];
                float[] fArr3 = new float[length];
                System.arraycopy(fArr, 0, fArr2, 0, i5);
                System.arraycopy(this.X, 0, fArr3, 0, this.Z);
                this.W = fArr2;
                this.X = fArr3;
            }
            int i7 = this.a0;
            int i8 = i7 + 6;
            short[] sArr = this.Y;
            if (i8 > sArr.length) {
                short[] sArr2 = new short[sArr.length << 1];
                System.arraycopy(sArr, 0, sArr2, 0, i7);
                this.Y = sArr2;
                sArr = sArr2;
            }
            int i9 = this.Z;
            int i10 = i9 >> 1;
            float[] fArr4 = this.W;
            fArr4[i9] = f;
            float[] fArr5 = this.X;
            int i11 = i9 + 1;
            this.Z = i11;
            fArr5[i9] = f5;
            fArr4[i11] = f2;
            int i12 = i9 + 2;
            this.Z = i12;
            fArr5[i11] = f6;
            fArr4[i12] = f3;
            int i13 = i9 + 3;
            this.Z = i13;
            fArr5[i12] = f7;
            fArr4[i13] = f2;
            int i14 = i9 + 4;
            this.Z = i14;
            fArr5[i13] = f6;
            fArr4[i14] = f;
            int i15 = i9 + 5;
            this.Z = i15;
            fArr5[i14] = f5;
            fArr4[i15] = f4;
            int i16 = i9 + 6;
            this.Z = i16;
            fArr5[i15] = f8;
            fArr4[i16] = f3;
            int i17 = i9 + 7;
            this.Z = i17;
            fArr5[i16] = f7;
            fArr4[i17] = f4;
            this.Z = i9 + 8;
            fArr5[i17] = f8;
            int i18 = this.a0;
            int i19 = i18 + 1;
            this.a0 = i19;
            sArr[i18] = (short) i10;
            int i20 = i18 + 2;
            this.a0 = i20;
            short s = (short) (i10 + 1);
            sArr[i19] = s;
            int i21 = i18 + 3;
            this.a0 = i21;
            short s2 = (short) (i10 + 2);
            sArr[i20] = s2;
            int i22 = i18 + 4;
            this.a0 = i22;
            sArr[i21] = s2;
            int i23 = i18 + 5;
            this.a0 = i23;
            sArr[i22] = s;
            this.a0 = i18 + 6;
            sArr[i23] = (short) (i10 + 3);
            return;
        }
        Rect rect = this.E;
        rect.set(i2, i3, i2 + i4, i4 + i3);
        RectF rectF = this.F;
        rectF.set(f, f2, f3, f4);
        canvas.drawBitmap(this.G, rect, rectF, this.n);
    }

    public final void m(Canvas canvas, float f) {
        float f2;
        float f3;
        yk0 yk0Var;
        float f4;
        float f5;
        r59 r59Var = this.a;
        float width = r59Var.getWidth();
        float height = r59Var.getHeight();
        int paddingLeft = r59Var.getPaddingLeft();
        int i = this.e;
        float max = Math.max(0.0f, Math.min(width, paddingLeft + i));
        float max2 = Math.max(max, Math.min(width, (width - r59Var.getPaddingRight()) - i));
        if (max >= max2) {
            j(0.0f, 0.0f, width, height, canvas);
            return;
        }
        this.I = 0;
        for (int i2 = 0; i2 < r59Var.getChildCount(); i2++) {
            View childAt = r59Var.getChildAt(i2);
            int R = RecyclerView.R(childAt);
            u69 T = r59Var.T(childAt);
            if (childAt != r59Var.getEmptyView() && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f && ((!r59Var.c0() || T == null || !T.j() || childAt.getAlpha() >= 1.0f) && u(childAt) && !r59Var.i1(R))) {
                float v1 = r59.v1(childAt);
                float H0 = r59.H0(childAt);
                if (childAt instanceof iw5) {
                    H0 -= ((iw5) childAt).getBottomInfoMargin();
                }
                h(v1, H0);
            }
        }
        if (r59Var.L2 != null) {
            for (int i3 = 0; i3 < r59Var.L2.size(); i3++) {
                long longValue = ((Long) r59Var.L2.get(i3)).longValue();
                Typeface typeface = gm.a;
                int i4 = (int) (longValue >> 32);
                int i5 = (int) longValue;
                float f6 = height;
                float f7 = 0.0f;
                for (int i6 = 0; i6 < r59Var.getChildCount(); i6++) {
                    View childAt2 = r59Var.getChildAt(i6);
                    int R2 = RecyclerView.R(childAt2);
                    if (R2 >= i4 && R2 <= i5) {
                        f6 = Math.min(f6, r59.v1(childAt2));
                        f7 = Math.max(f7, r59.H0(childAt2));
                    }
                }
                h(f6, f7);
            }
        }
        int i7 = 2;
        for (int i8 = 2; i8 < this.I; i8 += 2) {
            float[] fArr = this.H;
            float f8 = fArr[i8];
            float f9 = fArr[i8 + 1];
            int i9 = i8 - 2;
            while (i9 >= 0) {
                float[] fArr2 = this.H;
                float f10 = fArr2[i9];
                if (f10 > f8) {
                    fArr2[i9 + 2] = f10;
                    fArr2[i9 + 3] = fArr2[i9 + 1];
                    i9 -= 2;
                }
            }
            float[] fArr3 = this.H;
            fArr3[i9 + 2] = f8;
            fArr3[i9 + 3] = f9;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.I; i11 += 2) {
            float max3 = Math.max(0.0f, this.H[i11]);
            float min = Math.min(height, this.H[i11 + 1]);
            if (min > max3) {
                if (i10 > 0) {
                    float[] fArr4 = this.H;
                    int i12 = i10 - 1;
                    float f11 = fArr4[i12];
                    if (max3 <= f11 + f) {
                        fArr4[i12] = Math.max(f11, min);
                    }
                }
                float[] fArr5 = this.H;
                int i13 = i10 + 1;
                fArr5[i10] = max3;
                i10 += 2;
                fArr5[i13] = min;
            }
        }
        this.I = i10;
        if (i10 == 0) {
            j(0.0f, 0.0f, width, height, canvas);
            return;
        }
        float[] fArr6 = this.H;
        float f12 = fArr6[0];
        float f13 = fArr6[i10 - 1];
        int i14 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
        if (i14 > 0) {
            j(0.0f, 0.0f, width, Math.min(height, f12 + f), canvas);
        }
        int i15 = (f13 > height ? 1 : (f13 == height ? 0 : -1));
        if (i15 < 0) {
            j(0.0f, Math.max(0.0f, f13 - f), width, height, canvas);
        }
        if (i14 > 0) {
            f2 = f12;
        } else {
            f2 = 0.0f;
        }
        if (i15 < 0) {
            f3 = f13;
        } else {
            f3 = height;
        }
        if (f3 > f2) {
            j(0.0f, f2, Math.min(width, max + f), f3, canvas);
            yk0Var = this;
            yk0Var.j(Math.max(0.0f, max2 - f), f2, width, f3, canvas);
        } else {
            yk0Var = this;
        }
        while (i7 < yk0Var.I) {
            float[] fArr7 = yk0Var.H;
            float f14 = fArr7[i7 - 1];
            float f15 = fArr7[i7];
            if (f15 > f14) {
                float max4 = Math.max(0.0f, f14 - f);
                float min2 = Math.min(height, f15 + f);
                f4 = max;
                f5 = max2;
                yk0Var.j(f4, max4, f5, min2, canvas);
            } else {
                f4 = max;
                f5 = max2;
            }
            i7 += 2;
            yk0Var = this;
            max = f4;
            max2 = f5;
        }
    }

    public final void n(Canvas canvas, View view, View view2, boolean z, boolean z2) {
        float f;
        float f2;
        if (view != null && view2 != null) {
            float f3 = 0.0f;
            if (view2 instanceof iw5) {
                f = ((iw5) view2).getBottomInfoMargin();
            } else {
                f = 0.0f;
            }
            float left = view.getLeft();
            float f4 = this.f;
            r59 r59Var = this.a;
            float sectionsOverscanTop = (-f4) - r59Var.getSectionsOverscanTop();
            float v1 = r59.v1(view);
            if (z) {
                f2 = f4;
            } else {
                f2 = 0.0f;
            }
            float max = Math.max(sectionsOverscanTop, v1 - f2);
            float right = view.getRight();
            float height = r59Var.getHeight() - (-f4);
            float H0 = r59.H0(view2);
            if (z2) {
                f3 = f4;
            }
            float min = Math.min(height, (H0 + f3) - f);
            RectF rectF = this.y;
            rectF.set(left, max, right, min);
            if (rectF.bottom >= rectF.top) {
                o(canvas, rectF, view.getAlpha());
            }
        }
    }

    public final void o(Canvas canvas, RectF rectF, float f) {
        Float valueOf = Float.valueOf(0.0f);
        boolean z = this.V;
        Paint paint = this.w;
        if (z) {
            int sectionColorForDecoration = this.a.getSectionColorForDecoration();
            paint.setColor(on2.p(sectionColorForDecoration, Math.round(Math.max(0.0f, Math.min(1.0f, f)) * Color.alpha(sectionColorForDecoration))));
            float f2 = this.f;
            canvas.drawRoundRect(rectF, f2, f2, paint);
        } else if (this.L) {
            paint.setColor(r(f));
            if (this.U && f >= 1.0f) {
                return;
            }
            if (this.T) {
                i(rectF.left, rectF.top, rectF.right, rectF.bottom, paint.getColor());
            } else {
                canvas.drawRect(rectF, paint);
            }
        } else {
            this.d.k(canvas, rectF, valueOf, valueOf, Float.valueOf(f));
        }
    }

    public final void p(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yk0.p(android.graphics.Canvas):void");
    }

    public final void q(float f, float f2, float f3, float f4, Canvas canvas) {
        if (f4 <= 0.0f) {
            return;
        }
        float min = Math.min(1.0f, f4) * this.J;
        float f5 = f3 + min;
        l(canvas, 0, f, f3, f + min, f5);
        l(canvas, 1, f2 - min, f3, f2, f5);
    }

    public final int r(float f) {
        int sectionColorForDecoration = this.a.getSectionColorForDecoration();
        return on2.l(on2.p(sectionColorForDecoration, Math.round(Math.max(0.0f, Math.min(1.0f, f)) * Color.alpha(sectionColorForDecoration))), this.s.getColor());
    }

    public final boolean s(int i, View view) {
        if (view != null && i <= 0) {
            y59 adapter = this.a.getAdapter();
            int R = RecyclerView.R(view);
            if (adapter != null && R > 0) {
                if (((Boolean) this.c.a(Integer.valueOf(adapter.d(R - 1)))).booleanValue()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean t(int i, View view) {
        if (view != null) {
            r59 r59Var = this.a;
            if (i >= r59Var.getChildCount() - 1) {
                y59 adapter = r59Var.getAdapter();
                int R = RecyclerView.R(view);
                if (adapter != null && R >= 0 && R < adapter.b() - 1) {
                    if (((Boolean) this.c.a(Integer.valueOf(adapter.d(R + 1)))).booleanValue()) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean u(View view) {
        return ((Boolean) this.b.a(view)).booleanValue();
    }

    public final boolean v(int i) {
        r59 r59Var = this.a;
        y59 adapter = r59Var.getAdapter();
        if (i >= 0 && adapter != null && i < adapter.b()) {
            View U0 = r59Var.U0(i);
            if (U0 != null) {
                if (u(U0) && !r59Var.i1(i)) {
                    return true;
                }
                return false;
            }
            if (((Boolean) this.c.a(Integer.valueOf(adapter.d(i)))).booleanValue() && !r59Var.i1(i)) {
                return true;
            }
            return false;
        }
        return false;
    }
}

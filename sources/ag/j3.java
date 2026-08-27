package ag;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

public class j3 {
    public boolean B;
    public Matrix[] C;
    public float[][] D;
    public int[] E;
    public float[] F;
    public boolean G;
    public c6 O;
    public long Q;
    public long R;

    public boolean f504g;
    public boolean h;

    public Utilities.CallbackReturn f508l;

    public boolean f509m;

    public final int f512p;

    public boolean f513q;

    public int f521z;

    public final RectF f499a = new RectF();

    public final RectF f500b = new RectF();

    public final RectF f501c = new RectF();
    public Bitmap[] d = new Bitmap[3];

    public boolean[] f502e = new boolean[3];

    public boolean[] f503f = new boolean[3];

    public final Paint f505i = new Paint();

    public float f506j = 0.0f;

    public float f507k = 0.0f;

    public final ArrayList f510n = new ArrayList();

    public float f511o = 1.0f;

    public int f514r = 14;

    public int f515s = 12;

    public int f516t = 10;

    public float f517u = 0.85f;
    public float v = 0.85f;

    public float f518w = 0.9f;

    public long f519x = 2000;

    public int f520y = 1000;
    public final float A = 1000.0f / AndroidUtilities.screenRefreshRate;
    public boolean H = false;
    public boolean I = true;
    public boolean J = true;
    public boolean K = false;
    public boolean L = false;
    public boolean M = true;
    public int N = -1;
    public int P = g6.Uj;
    public int S = 0;

    public j3(int i10) {
        this.f512p = i10;
        this.B = i10 < 50;
    }

    public final void a() {
        int i10;
        int iDp;
        int i11;
        Bitmap bitmapCreateBitmap;
        Canvas canvas;
        Path path;
        Paint paint;
        Paint paintE;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = 6;
        int i20 = 3;
        if (this.N == 43) {
            if (this.d.length != 6) {
                this.d = new Bitmap[6];
            }
            if (this.f502e.length != 6) {
                this.f502e = new boolean[6];
            }
            if (this.f503f.length != 6) {
                this.f503f = new boolean[6];
            }
            i10 = 6;
        } else {
            i10 = 3;
        }
        int i21 = 0;
        while (i21 < i10) {
            float f10 = this.f517u;
            if (i21 == 0) {
                iDp = AndroidUtilities.dp(this.f514r);
            } else if (i21 == 1) {
                f10 = this.v;
                iDp = AndroidUtilities.dp(this.f515s);
            } else {
                f10 = this.f518w;
                iDp = AndroidUtilities.dp(this.f516t);
            }
            int i22 = this.N;
            if (i22 == 9) {
                if (i21 == 0) {
                    i18 = R.raw.premium_object_folder;
                } else {
                    i18 = i21 == 1 ? R.raw.premium_object_bubble : R.raw.premium_object_settings;
                }
                this.d[i21] = SvgHelper.getBitmap(i18, iDp, iDp, i0.b.k(g6.v0(this.P, this.O), 30));
                this.f502e[i21] = true;
            } else if (i22 == 27) {
                if (i21 == 0) {
                    i17 = R.raw.filled_messages_paid;
                } else {
                    i17 = i21 == 1 ? R.raw.filled_crown_on : R.raw.premium_object_star2;
                }
                this.d[i21] = SvgHelper.getBitmap(i17, iDp, iDp, i0.b.k(g6.v0(this.P, this.O), 30));
                this.f502e[i21] = true;
            } else if (i22 == 11 || i22 == 4) {
                if (i21 == 0) {
                    i11 = R.raw.premium_object_smile1;
                } else {
                    i11 = i21 == 1 ? R.raw.premium_object_smile2 : R.raw.premium_object_like;
                }
                this.d[i21] = SvgHelper.getBitmap(i11, iDp, iDp, i0.b.k(g6.v0(this.P, this.O), 30));
                this.f502e[i21] = true;
            } else if (i22 == 22) {
                if (i21 == 0) {
                    i16 = R.raw.premium_object_user;
                } else {
                    i16 = i21 == 1 ? R.raw.cache_photos : R.raw.cache_profile_photos;
                }
                this.d[i21] = SvgHelper.getBitmap(i16, iDp, iDp, i0.b.k(g6.v0(this.P, this.O), 30));
                this.f502e[i21] = true;
            } else if (i22 == i20) {
                if (i21 == 0) {
                    i15 = R.raw.premium_object_adsbubble;
                } else {
                    i15 = i21 == 1 ? R.raw.premium_object_like : R.raw.premium_object_noads;
                }
                this.d[i21] = SvgHelper.getBitmap(i15, iDp, iDp, i0.b.k(g6.v0(this.P, this.O), 30));
                this.f502e[i21] = true;
            } else if (i22 == 7) {
                if (i21 == 0) {
                    i14 = R.raw.premium_object_video2;
                } else {
                    i14 = i21 == 1 ? R.raw.premium_object_video : R.raw.premium_object_user;
                }
                this.d[i21] = SvgHelper.getBitmap(i14, iDp, iDp, i0.b.k(g6.v0(this.P, this.O), 30));
                this.f502e[i21] = true;
            } else if (i22 == 43) {
                if (i21 == 0) {
                    i13 = R.raw.premium_object_list;
                } else if (i21 == 1) {
                    i13 = R.raw.premium_object_math;
                } else if (i21 == 2) {
                    i13 = R.raw.premium_object_table;
                } else if (i21 == i20) {
                    i13 = R.raw.premium_object_superscript;
                } else {
                    i13 = i21 == 4 ? R.raw.premium_object_bold : R.raw.premium_object_code;
                }
                this.d[i21] = SvgHelper.getBitmap(i13, iDp, iDp, i0.b.k(g6.v0(this.P, this.O), 30));
                this.f502e[i21] = true;
            } else if (i22 == 1001) {
                this.d[i21] = SvgHelper.getBitmap(R.raw.premium_object_fire, iDp, iDp, i0.b.k(g6.v0(this.P, this.O), 30));
                this.f502e[i21] = true;
            } else if (i22 == 1002) {
                this.d[i21] = SvgHelper.getBitmap(R.raw.premium_object_star2, iDp, iDp, i0.b.k(g6.v0(this.P, this.O), 30));
                this.f502e[i21] = true;
            } else if (i22 == 24) {
                if (i21 == 0) {
                    i12 = R.raw.premium_object_tag;
                } else {
                    i12 = i21 == 1 ? R.raw.premium_object_check : R.raw.premium_object_star;
                }
                this.d[i21] = SvgHelper.getBitmap(i12, iDp, iDp, i0.b.k(g6.v0(this.P, this.O), 30));
                this.f502e[i21] = true;
            } else if (i22 == 28) {
                if (i21 == 0) {
                    this.d[i21] = SvgHelper.getBitmap(R.raw.filled_premium_dollar, iDp, iDp, i0.b.k(g6.v0(this.P, this.O), 255));
                    this.f503f[i21] = true;
                } else {
                    bitmapCreateBitmap = Bitmap.createBitmap(iDp, iDp, Bitmap.Config.ARGB_8888);
                    this.d[i21] = bitmapCreateBitmap;
                    canvas = new Canvas(bitmapCreateBitmap);
                    if (this.N == i19 || !(i21 == 1 || i21 == 2)) {
                        path = new Path();
                        float f11 = iDp >> 1;
                        int i23 = (int) (f10 * f11);
                        path.moveTo(0.0f, f11);
                        float f12 = i23;
                        path.lineTo(f12, f12);
                        path.lineTo(f11, 0.0f);
                        float f13 = iDp - i23;
                        path.lineTo(f13, f12);
                        float f14 = iDp;
                        path.lineTo(f14, f11);
                        path.lineTo(f13, f13);
                        path.lineTo(f11, f14);
                        path.lineTo(f12, f13);
                        path.lineTo(0.0f, f11);
                        path.close();
                        paint = new Paint();
                        if (this.f513q) {
                            if (iDp >= AndroidUtilities.dp(10.0f)) {
                                j2.d().f(iDp * (-2), 0.0f, iDp, iDp);
                            } else {
                                j2.d().f(iDp * (-4), 0.0f, iDp, iDp);
                            }
                            paintE = j2.d().e();
                            if (this.M) {
                                paintE.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(this.f514r / 5.0f)));
                            }
                            if (this.L) {
                                paintE.setAlpha(255);
                            } else if (this.K) {
                                paintE.setAlpha(60);
                            } else {
                                paintE.setAlpha(120);
                            }
                            canvas.drawPath(path, paintE);
                            paintE.setPathEffect(null);
                            paintE.setAlpha(255);
                        } else {
                            paint.setColor(b());
                            if (this.M) {
                                paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(this.f514r / 5.0f)));
                            }
                            canvas.drawPath(path, paint);
                        }
                        if (this.K) {
                            Utilities.stackBlurBitmap(bitmapCreateBitmap, 2);
                        }
                    } else {
                        Drawable drawable = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar);
                        drawable.setColorFilter(new PorterDuffColorFilter(g6.v0(this.P, this.O), PorterDuff.Mode.MULTIPLY));
                        drawable.setBounds(0, 0, iDp, iDp);
                        drawable.draw(canvas);
                    }
                }
            } else if (i22 == 105 && i21 == 0) {
                this.d[i21] = SvgHelper.getBitmap(R.raw.premium_object_star2, iDp, iDp, b());
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(iDp, iDp, Bitmap.Config.ARGB_8888);
                this.d[i21] = bitmapCreateBitmap;
                canvas = new Canvas(bitmapCreateBitmap);
                if (this.N == i19) {
                    path = new Path();
                    float f15 = iDp >> 1;
                    int i24 = (int) (f10 * f15);
                    path.moveTo(0.0f, f15);
                    float f16 = i24;
                    path.lineTo(f16, f16);
                    path.lineTo(f15, 0.0f);
                    float f17 = iDp - i24;
                    path.lineTo(f17, f16);
                    float f18 = iDp;
                    path.lineTo(f18, f15);
                    path.lineTo(f17, f17);
                    path.lineTo(f15, f18);
                    path.lineTo(f16, f17);
                    path.lineTo(0.0f, f15);
                    path.close();
                    paint = new Paint();
                    if (this.f513q) {
                        if (iDp >= AndroidUtilities.dp(10.0f)) {
                            j2.d().f(iDp * (-2), 0.0f, iDp, iDp);
                        } else {
                            j2.d().f(iDp * (-4), 0.0f, iDp, iDp);
                        }
                        paintE = j2.d().e();
                        if (this.M) {
                            paintE.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(this.f514r / 5.0f)));
                        }
                        if (this.L) {
                            paintE.setAlpha(255);
                        } else if (this.K) {
                            paintE.setAlpha(60);
                        } else {
                            paintE.setAlpha(120);
                        }
                        canvas.drawPath(path, paintE);
                        paintE.setPathEffect(null);
                        paintE.setAlpha(255);
                    } else {
                        paint.setColor(b());
                        if (this.M) {
                            paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(this.f514r / 5.0f)));
                        }
                        canvas.drawPath(path, paint);
                    }
                    if (this.K) {
                        Utilities.stackBlurBitmap(bitmapCreateBitmap, 2);
                    }
                } else {
                    path = new Path();
                    float f19 = iDp >> 1;
                    int i25 = (int) (f10 * f19);
                    path.moveTo(0.0f, f19);
                    float f110 = i25;
                    path.lineTo(f110, f110);
                    path.lineTo(f19, 0.0f);
                    float f111 = iDp - i25;
                    path.lineTo(f111, f110);
                    float f112 = iDp;
                    path.lineTo(f112, f19);
                    path.lineTo(f111, f111);
                    path.lineTo(f19, f112);
                    path.lineTo(f110, f111);
                    path.lineTo(0.0f, f19);
                    path.close();
                    paint = new Paint();
                    if (this.f513q) {
                        if (iDp >= AndroidUtilities.dp(10.0f)) {
                            j2.d().f(iDp * (-2), 0.0f, iDp, iDp);
                        } else {
                            j2.d().f(iDp * (-4), 0.0f, iDp, iDp);
                        }
                        paintE = j2.d().e();
                        if (this.M) {
                            paintE.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(this.f514r / 5.0f)));
                        }
                        if (this.L) {
                            paintE.setAlpha(255);
                        } else if (this.K) {
                            paintE.setAlpha(60);
                        } else {
                            paintE.setAlpha(120);
                        }
                        canvas.drawPath(path, paintE);
                        paintE.setPathEffect(null);
                        paintE.setAlpha(255);
                    } else {
                        paint.setColor(b());
                        if (this.M) {
                            paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dpf2(this.f514r / 5.0f)));
                        }
                        canvas.drawPath(path, paint);
                    }
                    if (this.K) {
                        Utilities.stackBlurBitmap(bitmapCreateBitmap, 2);
                    }
                }
            }
            i21++;
            i19 = 6;
            i20 = 3;
        }
    }

    public int b() {
        return this.N == 100 ? i0.b.k(g6.v0(this.P, this.O), 200) : g6.v0(this.P, this.O);
    }

    public final void c() {
        a();
        boolean z10 = this.G;
        int i10 = this.f512p;
        if (z10) {
            int length = this.d.length;
            this.C = new Matrix[length];
            this.D = new float[length][];
            this.E = new int[length];
            this.F = new float[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.C[i11] = new Matrix();
                this.D[i11] = new float[i10 * 2];
            }
        }
        ArrayList arrayList = this.f510n;
        if (arrayList.isEmpty()) {
            for (int i12 = 0; i12 < i10; i12++) {
                arrayList.add(new i3(this));
            }
        }
    }

    public final void d(Canvas canvas) {
        e(canvas, 1.0f);
    }

    public final void e(Canvas canvas, float f10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = jCurrentTimeMillis - this.R;
        long j11 = 4;
        if (j10 < 4) {
            j10 = j11;
        } else {
            j11 = 50;
            if (j10 > 50) {
                j10 = j11;
            }
        }
        boolean z10 = this.G;
        ArrayList arrayList = this.f510n;
        if (z10) {
            RectF rectF = this.f499a;
            float fCenterX = rectF.centerX() + 0.0f;
            float fCenterY = rectF.centerY() + this.f507k;
            int i10 = 0;
            while (true) {
                Matrix[] matrixArr = this.C;
                if (i10 >= matrixArr.length) {
                    break;
                }
                float[] fArr = this.F;
                float f11 = ((j10 / ((i10 * 10000.0f) + 40000.0f)) * 360.0f) + fArr[i10];
                fArr[i10] = f11;
                matrixArr[i10].setRotate(f11, fCenterX, fCenterY);
                this.E[i10] = 0;
                i10++;
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                i3 i3Var = (i3) arrayList.get(i11);
                j3 j3Var = i3Var.f484r;
                int[] iArr = j3Var.E;
                int i12 = i3Var.f478l;
                int i13 = iArr[i12];
                float[] fArr2 = j3Var.D[i12];
                int i14 = i13 * 2;
                fArr2[i14] = i3Var.d;
                fArr2[i14 + 1] = i3Var.f472e;
                iArr[i12] = i13 + 1;
            }
            int i15 = 0;
            while (true) {
                Matrix[] matrixArr2 = this.C;
                if (i15 >= matrixArr2.length) {
                    break;
                }
                Matrix matrix = matrixArr2[i15];
                float[] fArr3 = this.D[i15];
                matrix.mapPoints(fArr3, 0, fArr3, 0, this.E[i15]);
                this.E[i15] = 0;
                i15++;
            }
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            i3 i3Var2 = (i3) arrayList.get(i16);
            if (this.f504g) {
                i3Var2.a(canvas, this.Q, f10);
            } else {
                i3Var2.a(canvas, jCurrentTimeMillis, f10);
            }
            if (this.I && jCurrentTimeMillis > i3Var2.f469a) {
                i3Var2.b(jCurrentTimeMillis);
            }
            if (this.H) {
                if (!this.f500b.contains(i3Var2.h, i3Var2.f475i)) {
                    i3Var2.b(jCurrentTimeMillis);
                }
            }
        }
        this.R = jCurrentTimeMillis;
    }

    public final void f() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f510n;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((i3) arrayList.get(i10)).b(jCurrentTimeMillis);
            i10++;
        }
    }

    public final void g() {
        int iV0 = g6.v0(this.P, this.O);
        if (this.f521z != iV0) {
            this.f521z = iV0;
            a();
        }
    }
}

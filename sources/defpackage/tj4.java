package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import java.security.SecureRandom;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public class tj4 extends View {
    public static final byte E;
    public static final int[] F;
    public static final int[] G;
    public static final int[] H;
    public static final Paint[] s;
    public static Drawable[] w;
    public static Drawable[] x;
    public static final byte y;
    public final RectF a;
    public long b;
    public boolean c;
    public boolean d;
    public float e;
    public int f;
    public boolean h;
    public boolean n;
    public final ArrayList r;

    static {
        byte b;
        byte b2;
        if (xea.o() == 0) {
            b = 50;
        } else {
            b = 60;
        }
        y = b;
        if (xea.o() == 0) {
            b2 = 20;
        } else {
            b2 = 30;
        }
        E = b2;
        F = new int[]{-13845272, -6421296, -79102, -187561, -14185218, -10897300};
        G = new int[]{-1944197, -10498574, -9623, -2399389, -1870160};
        H = new int[]{-14778113, -15677815, -42601, -26844, -13639175};
        s = new Paint[6];
        int i = 0;
        while (true) {
            Paint[] paintArr = s;
            if (i < paintArr.length) {
                Paint paint = new Paint(1);
                paintArr[i] = paint;
                paint.setColor(F[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public tj4(Context context) {
        super(context);
        this.a = new RectF();
        this.e = 1.0f;
        this.r = new ArrayList(y + E);
    }

    private int getHeightForAnimation() {
        if (getMeasuredHeight() == 0) {
            return ((View) getParent()).getHeight();
        }
        return getMeasuredHeight();
    }

    private int getWidthForAnimation() {
        if (getMeasuredWidth() == 0) {
            return ((View) getParent()).getWidth();
        }
        return getMeasuredWidth();
    }

    public final sj4 a(boolean z) {
        int i;
        sj4 sj4Var = new sj4(this);
        try {
            SecureRandom secureRandom = Utilities.b;
            byte nextInt = (byte) secureRandom.nextInt(2);
            sj4Var.a = nextInt;
            if (this.h && nextInt == 0) {
                sj4Var.a = (byte) 2;
                sj4Var.b = (byte) secureRandom.nextInt(G.length);
            } else if (this.n && secureRandom.nextBoolean()) {
                sj4Var.a = (byte) 2;
                sj4Var.b = (byte) secureRandom.nextInt(H.length);
            } else {
                sj4Var.b = (byte) secureRandom.nextInt(F.length);
            }
            sj4Var.c = (byte) secureRandom.nextInt(2);
            sj4Var.f = (byte) (secureRandom.nextInt(2) + 1);
            byte b = sj4Var.a;
            if (b != 0 && b != 2) {
                sj4Var.d = (byte) ((secureRandom.nextFloat() * 4.0f) + 4.0f);
            } else {
                sj4Var.d = (byte) ((secureRandom.nextFloat() * 2.0f) + 4.0f);
            }
            if (z) {
                sj4Var.h = (-secureRandom.nextFloat()) * getHeightForAnimation() * 1.2f;
                sj4Var.g = hl.L(5.0f) + secureRandom.nextInt(Math.max(1, getWidthForAnimation() - hl.L(10.0f)));
                sj4Var.e = sj4Var.f;
                return sj4Var;
            }
            int L = hl.L(secureRandom.nextInt(10) + 4);
            int heightForAnimation = getHeightForAnimation() / 4;
            if (sj4Var.c == 0) {
                sj4Var.g = -L;
            } else {
                sj4Var.g = getWidthForAnimation() + L;
            }
            if (sj4Var.c == 0) {
                i = 1;
            } else {
                i = -1;
            }
            sj4Var.j = ((secureRandom.nextFloat() * hl.L(4.0f)) + hl.L(1.2f)) * i;
            sj4Var.k = -((secureRandom.nextFloat() * hl.L(4.0f)) + hl.L(4.0f));
            sj4Var.h = (heightForAnimation / 2) + secureRandom.nextInt(Math.max(1, heightForAnimation << 1));
            return sj4Var;
        } catch (Exception e) {
            cc4.g(e, true);
            return sj4Var;
        }
    }

    public void c(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj4.c(boolean):void");
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        Drawable drawable;
        boolean z;
        float B;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = (int) (elapsedRealtime - this.b);
        this.b = elapsedRealtime;
        if (i > 18) {
            i = 16;
        }
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            sj4 sj4Var = (sj4) arrayList.get(i2);
            tj4 tj4Var = sj4Var.l;
            byte b = sj4Var.a;
            Paint[] paintArr = s;
            if (b == 0) {
                f = 2.0f;
                canvas.drawCircle(sj4Var.g, sj4Var.h, hl.L(sj4Var.d), paintArr[sj4Var.b]);
                f2 = 16.0f;
            } else {
                f = 2.0f;
                if (b == 1) {
                    RectF rectF = tj4Var.a;
                    f2 = 16.0f;
                    rectF.set(sj4Var.g - hl.L(sj4Var.d), sj4Var.h - hl.L(2.0f), sj4Var.g + hl.L(sj4Var.d), sj4Var.h + hl.L(2.0f));
                    canvas.save();
                    canvas.rotate(sj4Var.i, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, hl.L(2.0f), hl.L(2.0f), paintArr[sj4Var.b]);
                    canvas.restore();
                } else {
                    f2 = 16.0f;
                    if (b == 2) {
                        Drawable[] drawableArr = x;
                        if (drawableArr != null) {
                            drawable = drawableArr[sj4Var.b];
                        } else {
                            drawable = null;
                        }
                        Drawable[] drawableArr2 = w;
                        if (drawableArr2 != null) {
                            drawable = drawableArr2[sj4Var.b];
                        }
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                            int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                            int i3 = (int) sj4Var.g;
                            int i4 = (int) sj4Var.h;
                            drawable.setBounds(i3 - intrinsicWidth, i4 - intrinsicHeight, i3 + intrinsicWidth, i4 + intrinsicHeight);
                            canvas.save();
                            canvas.rotate(sj4Var.i, sj4Var.g, sj4Var.h);
                            float f3 = sj4Var.d / 6.0f;
                            canvas.scale(f3, f3, sj4Var.g, sj4Var.h);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
            tj4 tj4Var2 = sj4Var.l;
            float f4 = i / f2;
            float f5 = sj4Var.g;
            float f6 = sj4Var.j;
            sj4Var.g = (f6 * f4) + f5;
            sj4Var.h = (sj4Var.k * f4) + sj4Var.h;
            if (sj4Var.e != 0) {
                float L = hl.L(1.0f) * 0.5f;
                byte b2 = sj4Var.e;
                float f7 = sj4Var.j;
                if (b2 == 1) {
                    float x2 = c00.x(L, f4, 0.05f, f7);
                    sj4Var.j = x2;
                    if (x2 >= L) {
                        sj4Var.e = (byte) 2;
                    }
                } else {
                    float v = bp1.v(L, f4, 0.05f, f7);
                    sj4Var.j = v;
                    if (v <= (-L)) {
                        sj4Var.e = (byte) 1;
                    }
                }
            } else if (sj4Var.c == 0) {
                if (f6 > 0.0f) {
                    float f8 = f6 - (0.05f * f4);
                    sj4Var.j = f8;
                    if (f8 <= 0.0f) {
                        sj4Var.j = 0.0f;
                        sj4Var.e = sj4Var.f;
                    }
                }
            } else if (f6 < 0.0f) {
                float f9 = (0.05f * f4) + f6;
                sj4Var.j = f9;
                if (f9 >= 0.0f) {
                    sj4Var.j = 0.0f;
                    sj4Var.e = sj4Var.f;
                }
            }
            float f10 = (-hl.L(1.0f)) / f;
            float f11 = sj4Var.k;
            if (f11 < f10) {
                z = true;
            } else {
                z = false;
            }
            if (f11 > f10) {
                B = ((hl.L(1.0f) / 3.0f) * f4 * tj4Var2.e) + f11;
                sj4Var.k = B;
            } else {
                B = c00.B(hl.L(1.0f), 3.0f, f4, f11);
                sj4Var.k = B;
            }
            if (z && B > f10) {
                tj4Var2.f++;
            }
            byte b3 = sj4Var.a;
            if (b3 == 1 || b3 == 2) {
                short s2 = (short) ((f4 * 10.0f) + sj4Var.i);
                sj4Var.i = s2;
                if (s2 > 360) {
                    sj4Var.i = (short) (s2 - 360);
                }
            }
            if (sj4Var.h >= tj4Var2.getHeightForAnimation()) {
                arrayList.remove(i2);
                i2--;
                size--;
            }
            i2++;
        }
        if (this.f >= y / 2 && this.e > 0.2f) {
            if (!this.d) {
                this.d = true;
                for (int i5 = 0; i5 < E; i5++) {
                    arrayList.add(a(true));
                }
            }
            float x3 = uh9.x(i, 16.0f, 0.15f, this.e);
            this.e = x3;
            if (x3 < 0.2f) {
                this.e = 0.2f;
            }
        }
        if (!arrayList.isEmpty()) {
            invalidate();
            return;
        }
        this.c = false;
        hl.c3(new rj4(this, (byte) 0));
        b();
    }

    public void b() {
    }
}

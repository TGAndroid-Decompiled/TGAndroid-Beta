package ai;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class ce {
    public final int f1112a;
    public final ArrayList f1113b;
    public final Bitmap d;
    public int e;
    public int f1118j;
    public e0.f0 f1120l;
    public final Paint f1121m;
    public long f1122n;
    public long f1123o;
    public final RectF f1114c = new RectF();
    public final Paint f1115f = new Paint(3);
    public final Rect f1116g = new Rect();
    public float h = 1.0f;
    public final float f1117i = 1.0f;
    public boolean f1119k = true;

    public ce(int i10, int i11) {
        this.f1112a = i10;
        this.f1118j = i11;
        this.f1113b = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.f1113b.add(new be(this));
        }
        int dp = AndroidUtilities.dp(10.0f);
        Bitmap createBitmap = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
        this.d = createBitmap;
        Path path = new Path();
        float f7 = dp >> 1;
        int i13 = (int) (0.85f * f7);
        path.moveTo(0.0f, f7);
        float f10 = i13;
        path.lineTo(f10, f10);
        path.lineTo(f7, 0.0f);
        float f11 = dp - i13;
        path.lineTo(f11, f10);
        float f12 = dp;
        path.lineTo(f12, f7);
        path.lineTo(f11, f11);
        path.lineTo(f7, f12);
        path.lineTo(f10, f11);
        path.lineTo(0.0f, f7);
        path.close();
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(org.telegram.ui.ActionBar.h6.m1(0.75f, -1));
        canvas.drawPath(path, paint);
        if (g0.a.g()) {
            e0.f0 f0Var = new e0.f0(i11);
            this.f1120l = f0Var;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i14 = 0; i14 < f0Var.f8097b; i14++) {
                e0.f0.c((float[]) f0Var.d, i14, 0.0f, 0.0f, width, height);
            }
            this.f1121m = g0.a.a(createBitmap);
            return;
        }
        this.f1120l = null;
        this.f1121m = null;
    }

    public final void a(Canvas canvas, int i10) {
        b(canvas, i10, 1.0f);
    }

    public final void b(Canvas canvas, int i10, float f7) {
        if (!LiteMode.isEnabled(131072)) {
            return;
        }
        int i11 = this.f1118j;
        ArrayList arrayList = this.f1113b;
        int min = Math.min(i11, arrayList.size());
        float f10 = 2.0f;
        if (this.f1120l != null) {
            Bitmap bitmap = this.d;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            for (int i12 = 0; i12 < min; i12++) {
                be beVar = (be) arrayList.get(i12);
                float f11 = beVar.f1063i * beVar.e * f7;
                float f12 = (width / 2.0f) * f11;
                float f13 = (height / 2.0f) * f11;
                e0.f0 f0Var = this.f1120l;
                float f14 = beVar.f1058a;
                float f15 = beVar.f1059b;
                e0.f0.c((float[]) f0Var.f8098c, i12, f14 - f12, f15 - f13, f14 + f12, f15 + f13);
                this.f1120l.e(i12, i0.b.o(i10, (int) (Utilities.clamp01(beVar.h * f7) * 255.0f)));
            }
            g0.a.b(canvas, this.f1120l, min, this.f1121m);
        } else {
            if (this.e != i10) {
                this.e = i10;
                this.f1115f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            int i13 = 0;
            while (i13 < min) {
                be beVar2 = (be) arrayList.get(i13);
                float f16 = beVar2.h * f7;
                ce ceVar = beVar2.f1064j;
                Paint paint = ceVar.f1115f;
                Rect rect = ceVar.f1116g;
                Bitmap bitmap2 = ceVar.d;
                paint.setAlpha((int) (f16 * 255.0f));
                float f17 = f10;
                rect.set((int) org.telegram.ui.Cells.t0.z((bitmap2.getWidth() / f10) * beVar2.f1063i, beVar2.e, f16, beVar2.f1058a), (int) org.telegram.ui.Cells.t0.z((bitmap2.getHeight() / f10) * beVar2.f1063i, beVar2.e, f16, beVar2.f1059b), (int) com.google.android.gms.internal.cast.a6.t((bitmap2.getWidth() / f10) * beVar2.f1063i, beVar2.e, f16, beVar2.f1058a), (int) com.google.android.gms.internal.cast.a6.t((bitmap2.getHeight() / f17) * beVar2.f1063i, beVar2.e, f16, beVar2.f1059b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i13++;
                f10 = f17;
            }
        }
        this.f1119k = false;
    }

    public final void c(be beVar, long j10, boolean z10) {
        long j11;
        beVar.f1061f = j10;
        beVar.f1062g = AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat()) * this.f1117i;
        if (z10) {
            beVar.f1061f -= Utilities.clamp01(Utilities.fastRandom.nextFloat()) * ((float) j11);
        }
        RectF rectF = this.f1114c;
        beVar.f1058a = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
        beVar.f1059b = AndroidUtilities.lerp(rectF.top, rectF.bottom, Utilities.fastRandom.nextFloat());
        if (this.f1112a == 0) {
            beVar.f1060c = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
            beVar.d = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
        } else {
            beVar.f1060c = rectF.centerX() - beVar.f1058a;
            beVar.d = rectF.centerY() - beVar.f1059b;
            float f7 = beVar.f1060c;
            float f10 = beVar.d;
            float dp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat())) / ((float) Math.sqrt((f10 * f10) + (f7 * f7)));
            beVar.f1060c *= dp;
            beVar.d *= dp;
        }
        beVar.f1063i = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
        beVar.e = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f7;
        if (LiteMode.isEnabled(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.f1123o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i10 = 0;
            while (true) {
                int i11 = this.f1118j;
                ArrayList arrayList = this.f1113b;
                if (i10 >= Math.min(i11, arrayList.size())) {
                    break;
                }
                be beVar = (be) arrayList.get(i10);
                long j10 = beVar.f1062g;
                if (j10 <= 0) {
                    f7 = 2.0f;
                } else {
                    f7 = ((float) (currentTimeMillis - beVar.f1061f)) / ((float) j10);
                }
                if (f7 > 1.0f) {
                    c(beVar, currentTimeMillis, this.f1119k);
                    f7 = 0.0f;
                }
                beVar.f1058a = (beVar.f1060c * min) + beVar.f1058a;
                beVar.f1059b = (beVar.d * min) + beVar.f1059b;
                float f10 = 4.0f * f7;
                beVar.h = f10 - (f7 * f10);
                i10++;
            }
            this.f1123o = currentTimeMillis;
            long j11 = this.f1122n;
            if (j11 == 0 || j11 - currentTimeMillis >= 66) {
                this.f1122n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f1112a == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f1113b;
                if (i10 < arrayList.size()) {
                    be beVar = (be) arrayList.get(i10);
                    if (!this.f1114c.contains((int) beVar.f1058a, (int) beVar.f1059b)) {
                        c(beVar, currentTimeMillis, this.f1119k);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f1114c.set(i10, i11, i12, i13);
        e();
    }

    public final void g(RectF rectF) {
        this.f1114c.set(rectF);
        e();
    }
}

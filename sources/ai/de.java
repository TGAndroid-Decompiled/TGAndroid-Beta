package ai;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class de {
    public final int f1178a;
    public final ArrayList f1179b;
    public final Bitmap d;
    public int e;
    public int f1184j;
    public e0.f0 f1186l;
    public final Paint f1187m;
    public long f1188n;
    public long f1189o;
    public final RectF f1180c = new RectF();
    public final Paint f1181f = new Paint(3);
    public final Rect f1182g = new Rect();
    public float h = 1.0f;
    public final float f1183i = 1.0f;
    public boolean f1185k = true;

    public de(int i10, int i11) {
        this.f1178a = i10;
        this.f1184j = i11;
        this.f1179b = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.f1179b.add(new ce(this));
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
        if (Build.VERSION.SDK_INT >= 29) {
            e0.f0 f0Var = new e0.f0(i11);
            this.f1186l = f0Var;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i14 = 0; i14 < f0Var.f8096b; i14++) {
                e0.f0.c((float[]) f0Var.d, i14, 0.0f, 0.0f, width, height);
            }
            this.f1187m = g0.a.a(createBitmap);
            return;
        }
        this.f1186l = null;
        this.f1187m = null;
    }

    public final void a(Canvas canvas, int i10) {
        b(canvas, i10, 1.0f);
    }

    public final void b(Canvas canvas, int i10, float f7) {
        if (!LiteMode.isEnabled(131072)) {
            return;
        }
        int i11 = this.f1184j;
        ArrayList arrayList = this.f1179b;
        int min = Math.min(i11, arrayList.size());
        float f10 = 2.0f;
        if (this.f1186l != null) {
            Bitmap bitmap = this.d;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            for (int i12 = 0; i12 < min; i12++) {
                ce ceVar = (ce) arrayList.get(i12);
                float f11 = ceVar.f1117i * ceVar.e * f7;
                float f12 = (width / 2.0f) * f11;
                float f13 = (height / 2.0f) * f11;
                e0.f0 f0Var = this.f1186l;
                float f14 = ceVar.f1112a;
                float f15 = ceVar.f1113b;
                e0.f0.c((float[]) f0Var.f8097c, i12, f14 - f12, f15 - f13, f14 + f12, f15 + f13);
                this.f1186l.e(i12, i0.a.o(i10, (int) (Utilities.clamp01(ceVar.h * f7) * 255.0f)));
            }
            g0.a.b(canvas, this.f1186l, min, this.f1187m);
        } else {
            if (this.e != i10) {
                this.e = i10;
                this.f1181f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            int i13 = 0;
            while (i13 < min) {
                ce ceVar2 = (ce) arrayList.get(i13);
                float f16 = ceVar2.h * f7;
                de deVar = ceVar2.f1118j;
                Paint paint = deVar.f1181f;
                Rect rect = deVar.f1182g;
                Bitmap bitmap2 = deVar.d;
                paint.setAlpha((int) (f16 * 255.0f));
                float f17 = f10;
                rect.set((int) org.telegram.ui.Cells.c1.z((bitmap2.getWidth() / f10) * ceVar2.f1117i, ceVar2.e, f16, ceVar2.f1112a), (int) org.telegram.ui.Cells.c1.z((bitmap2.getHeight() / f10) * ceVar2.f1117i, ceVar2.e, f16, ceVar2.f1113b), (int) com.google.android.gms.internal.play_billing.k3.t((bitmap2.getWidth() / f10) * ceVar2.f1117i, ceVar2.e, f16, ceVar2.f1112a), (int) com.google.android.gms.internal.play_billing.k3.t((bitmap2.getHeight() / f17) * ceVar2.f1117i, ceVar2.e, f16, ceVar2.f1113b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i13++;
                f10 = f17;
            }
        }
        this.f1185k = false;
    }

    public final void c(ce ceVar, long j10, boolean z10) {
        long j11;
        ceVar.f1115f = j10;
        ceVar.f1116g = AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat()) * this.f1183i;
        if (z10) {
            ceVar.f1115f -= Utilities.clamp01(Utilities.fastRandom.nextFloat()) * ((float) j11);
        }
        RectF rectF = this.f1180c;
        ceVar.f1112a = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
        ceVar.f1113b = AndroidUtilities.lerp(rectF.top, rectF.bottom, Utilities.fastRandom.nextFloat());
        if (this.f1178a == 0) {
            ceVar.f1114c = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
            ceVar.d = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
        } else {
            ceVar.f1114c = rectF.centerX() - ceVar.f1112a;
            ceVar.d = rectF.centerY() - ceVar.f1113b;
            float f7 = ceVar.f1114c;
            float f10 = ceVar.d;
            float dp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat())) / ((float) Math.sqrt((f10 * f10) + (f7 * f7)));
            ceVar.f1114c *= dp;
            ceVar.d *= dp;
        }
        ceVar.f1117i = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
        ceVar.e = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f7;
        if (LiteMode.isEnabled(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.f1189o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i10 = 0;
            while (true) {
                int i11 = this.f1184j;
                ArrayList arrayList = this.f1179b;
                if (i10 >= Math.min(i11, arrayList.size())) {
                    break;
                }
                ce ceVar = (ce) arrayList.get(i10);
                long j10 = ceVar.f1116g;
                if (j10 <= 0) {
                    f7 = 2.0f;
                } else {
                    f7 = ((float) (currentTimeMillis - ceVar.f1115f)) / ((float) j10);
                }
                if (f7 > 1.0f) {
                    c(ceVar, currentTimeMillis, this.f1185k);
                    f7 = 0.0f;
                }
                ceVar.f1112a = (ceVar.f1114c * min) + ceVar.f1112a;
                ceVar.f1113b = (ceVar.d * min) + ceVar.f1113b;
                float f10 = 4.0f * f7;
                ceVar.h = f10 - (f7 * f10);
                i10++;
            }
            this.f1189o = currentTimeMillis;
            long j11 = this.f1188n;
            if (j11 == 0 || j11 - currentTimeMillis >= 66) {
                this.f1188n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f1178a == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f1179b;
                if (i10 < arrayList.size()) {
                    ce ceVar = (ce) arrayList.get(i10);
                    if (!this.f1180c.contains((int) ceVar.f1112a, (int) ceVar.f1113b)) {
                        c(ceVar, currentTimeMillis, this.f1185k);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f1180c.set(i10, i11, i12, i13);
        e();
    }

    public final void g(RectF rectF) {
        this.f1180c.set(rectF);
        e();
    }
}

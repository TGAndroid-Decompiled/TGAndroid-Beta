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
    public final int f1166a;
    public final ArrayList f1167b;
    public final Bitmap d;
    public int e;
    public int f1172j;
    public e0.f0 f1174l;
    public final Paint f1175m;
    public long f1176n;
    public long f1177o;
    public final RectF f1168c = new RectF();
    public final Paint f1169f = new Paint(3);
    public final Rect f1170g = new Rect();
    public float h = 1.0f;
    public final float f1171i = 1.0f;
    public boolean f1173k = true;

    public de(int i10, int i11) {
        this.f1166a = i10;
        this.f1172j = i11;
        this.f1167b = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.f1167b.add(new ce(this));
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
            this.f1174l = f0Var;
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            for (int i14 = 0; i14 < f0Var.f8095b; i14++) {
                e0.f0.c((float[]) f0Var.d, i14, 0.0f, 0.0f, width, height);
            }
            this.f1175m = g0.a.a(createBitmap);
            return;
        }
        this.f1174l = null;
        this.f1175m = null;
    }

    public final void a(Canvas canvas, int i10) {
        b(canvas, i10, 1.0f);
    }

    public final void b(Canvas canvas, int i10, float f7) {
        if (!LiteMode.isEnabled(131072)) {
            return;
        }
        int i11 = this.f1172j;
        ArrayList arrayList = this.f1167b;
        int min = Math.min(i11, arrayList.size());
        float f10 = 2.0f;
        if (this.f1174l != null) {
            Bitmap bitmap = this.d;
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            for (int i12 = 0; i12 < min; i12++) {
                ce ceVar = (ce) arrayList.get(i12);
                float f11 = ceVar.f1119i * ceVar.e * f7;
                float f12 = (width / 2.0f) * f11;
                float f13 = (height / 2.0f) * f11;
                e0.f0 f0Var = this.f1174l;
                float f14 = ceVar.f1114a;
                float f15 = ceVar.f1115b;
                e0.f0.c((float[]) f0Var.f8096c, i12, f14 - f12, f15 - f13, f14 + f12, f15 + f13);
                this.f1174l.e(i12, i0.a.o(i10, (int) (Utilities.clamp01(ceVar.h * f7) * 255.0f)));
            }
            g0.a.b(canvas, this.f1174l, min, this.f1175m);
        } else {
            if (this.e != i10) {
                this.e = i10;
                this.f1169f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            int i13 = 0;
            while (i13 < min) {
                ce ceVar2 = (ce) arrayList.get(i13);
                float f16 = ceVar2.h * f7;
                de deVar = ceVar2.f1120j;
                Paint paint = deVar.f1169f;
                Rect rect = deVar.f1170g;
                Bitmap bitmap2 = deVar.d;
                paint.setAlpha((int) (f16 * 255.0f));
                float f17 = f10;
                rect.set((int) org.telegram.ui.Cells.c1.z((bitmap2.getWidth() / f10) * ceVar2.f1119i, ceVar2.e, f16, ceVar2.f1114a), (int) org.telegram.ui.Cells.c1.z((bitmap2.getHeight() / f10) * ceVar2.f1119i, ceVar2.e, f16, ceVar2.f1115b), (int) com.google.android.gms.internal.play_billing.k3.t((bitmap2.getWidth() / f10) * ceVar2.f1119i, ceVar2.e, f16, ceVar2.f1114a), (int) com.google.android.gms.internal.play_billing.k3.t((bitmap2.getHeight() / f17) * ceVar2.f1119i, ceVar2.e, f16, ceVar2.f1115b));
                canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                i13++;
                f10 = f17;
            }
        }
        this.f1173k = false;
    }

    public final void c(ce ceVar, long j10, boolean z10) {
        long j11;
        ceVar.f1117f = j10;
        ceVar.f1118g = AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat()) * this.f1171i;
        if (z10) {
            ceVar.f1117f -= Utilities.clamp01(Utilities.fastRandom.nextFloat()) * ((float) j11);
        }
        RectF rectF = this.f1168c;
        ceVar.f1114a = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
        ceVar.f1115b = AndroidUtilities.lerp(rectF.top, rectF.bottom, Utilities.fastRandom.nextFloat());
        if (this.f1166a == 0) {
            ceVar.f1116c = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
            ceVar.d = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
        } else {
            ceVar.f1116c = rectF.centerX() - ceVar.f1114a;
            ceVar.d = rectF.centerY() - ceVar.f1115b;
            float f7 = ceVar.f1116c;
            float f10 = ceVar.d;
            float dp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat())) / ((float) Math.sqrt((f10 * f10) + (f7 * f7)));
            ceVar.f1116c *= dp;
            ceVar.d *= dp;
        }
        ceVar.f1119i = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
        ceVar.e = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
    }

    public final boolean d() {
        float f7;
        if (LiteMode.isEnabled(131072)) {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.f1177o - currentTimeMillis, 16L)) / 1000.0f) * this.h;
            int i10 = 0;
            while (true) {
                int i11 = this.f1172j;
                ArrayList arrayList = this.f1167b;
                if (i10 >= Math.min(i11, arrayList.size())) {
                    break;
                }
                ce ceVar = (ce) arrayList.get(i10);
                long j10 = ceVar.f1118g;
                if (j10 <= 0) {
                    f7 = 2.0f;
                } else {
                    f7 = ((float) (currentTimeMillis - ceVar.f1117f)) / ((float) j10);
                }
                if (f7 > 1.0f) {
                    c(ceVar, currentTimeMillis, this.f1173k);
                    f7 = 0.0f;
                }
                ceVar.f1114a = (ceVar.f1116c * min) + ceVar.f1114a;
                ceVar.f1115b = (ceVar.d * min) + ceVar.f1115b;
                float f10 = 4.0f * f7;
                ceVar.h = f10 - (f7 * f10);
                i10++;
            }
            this.f1177o = currentTimeMillis;
            long j11 = this.f1176n;
            if (j11 == 0 || j11 - currentTimeMillis >= 66) {
                this.f1176n = currentTimeMillis;
                return true;
            }
        }
        return false;
    }

    public final void e() {
        if (this.f1166a == 2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f1167b;
                if (i10 < arrayList.size()) {
                    ce ceVar = (ce) arrayList.get(i10);
                    if (!this.f1168c.contains((int) ceVar.f1114a, (int) ceVar.f1115b)) {
                        c(ceVar, currentTimeMillis, this.f1173k);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.f1168c.set(i10, i11, i12, i13);
        e();
    }

    public final void g(RectF rectF) {
        this.f1168c.set(rectF);
        e();
    }
}

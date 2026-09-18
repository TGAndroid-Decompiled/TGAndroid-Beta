package ai;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.v01;
import org.telegram.ui.Components.yc;
public final class sa {
    public static CharSequence[] f1512y;
    public int f1513a;
    public Long f1514b;
    public Integer f1515c;
    public Integer d;
    public boolean e;
    public TLRPC.Document f1517g;
    public SpannableStringBuilder f1520k;
    public String f1521l;
    public boolean f1522m;
    public v01 f1523n;
    public v01 f1524o;
    public boolean f1525p;
    public boolean f1526q;
    public View f1527r;
    public Runnable f1528s;
    public int f1532x;
    public boolean f1516f = true;
    public final org.telegram.ui.Components.e6 h = new org.telegram.ui.Components.e6(0, 350, qr.h);
    public final yc f1518i = new yc((View) null);
    public final org.telegram.ui.Cells.z f1519j = org.telegram.ui.ActionBar.j6.Y(553648127, 0, 0);
    public final Paint f1529t = new Paint(1);
    public final Paint f1530u = new Paint(1);
    public final Path v = new Path();
    public final RectF f1531w = new RectF();

    public static CharSequence d() {
        if (f1512y == null) {
            f1512y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f1512y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            oq oqVar = new oq(R.drawable.filled_widget_music, 0);
            oqVar.setSize(AndroidUtilities.dp(16.0f));
            oqVar.spaceScaleX = 1.0f;
            oqVar.translate(-AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            ((SpannableStringBuilder) f1512y[0]).setSpan(oqVar, 0, 1, 33);
        }
        return f1512y[0];
    }

    public final void a(Canvas canvas, float f7) {
        float f10;
        Typeface bold;
        String str = "";
        if (this.f1523n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f1520k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f1517g;
            if (document != null) {
                f10 = 12.0f;
            } else {
                f10 = 14.0f;
            }
            if (document != null) {
                bold = null;
            } else {
                bold = AndroidUtilities.bold();
            }
            this.f1523n = new v01(spannableStringBuilder, f10, bold);
        }
        if (this.f1524o == null || this.f1522m) {
            String str2 = this.f1521l;
            if (str2 != null) {
                str = str2;
            }
            this.f1524o = new v01(str, 14.0f, null);
        }
        float e = this.h.e(this.f1516f);
        Paint paint = this.f1529t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f7, Math.max(this.f1523n.f28868c, this.f1524o.f28868c) + AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(18.0f), e));
        this.f1532x = min;
        int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(22.0f), e);
        float f11 = min;
        RectF rectF = this.f1531w;
        rectF.set(0.0f, 0.0f, f11, lerp);
        canvas.save();
        float a2 = this.f1518i.a(0.02f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), e);
        canvas.drawRoundRect(rectF, lerp2, lerp2, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, lerp2, lerp2, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = this.f1519j;
        zVar.setBounds(0, 0, min, lerp);
        zVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(42.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(42.0f));
        Paint paint2 = this.f1530u;
        paint2.setColor(-1);
        float f12 = 1.0f - e;
        paint2.setAlpha((int) (255.0f * f12));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
        canvas.restore();
        int dp = min - AndroidUtilities.dp(20.0f);
        if (f11 < f7) {
            dp = (int) Math.min(AndroidUtilities.dp(12.0f) + dp, f7 - AndroidUtilities.dp(20.0f));
        }
        v01 v01Var = this.f1523n;
        float f13 = dp;
        v01Var.f28878p = f13;
        v01Var.c(AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f), e), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(11.0f), e), 1.0f, -1, canvas);
        v01 v01Var2 = this.f1524o;
        v01Var2.f28878p = f13;
        v01Var2.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), f12, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f7;
        if (this.f1516f) {
            f7 = 22.0f;
        } else {
            f7 = 42.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final void c() {
        if (!this.f1525p && !this.f1526q && this.f1514b != null && this.f1515c != null && this.f1527r != null) {
            this.f1526q = true;
            MessagesController.getInstance(this.f1513a).getStoriesController().d0(this.f1514b.longValue(), this.f1515c.intValue(), new f3(this, 2));
        }
    }

    public final void e(float f7, float f10, boolean z10) {
        this.f1518i.c(z10);
        int[] iArr = z10 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.z zVar = this.f1519j;
        zVar.setState(iArr);
        if (z10) {
            zVar.setHotspot(f7, f10);
        }
    }
}

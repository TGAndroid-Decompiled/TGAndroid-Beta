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
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.wc;
public final class sa {
    public static CharSequence[] f1507y;
    public int f1508a;
    public Long f1509b;
    public Integer f1510c;
    public Integer d;
    public boolean e;
    public TLRPC.Document f1512g;
    public SpannableStringBuilder f1515k;
    public String f1516l;
    public boolean f1517m;
    public g01 f1518n;
    public g01 f1519o;
    public boolean f1520p;
    public boolean f1521q;
    public View f1522r;
    public Runnable f1523s;
    public int f1527x;
    public boolean f1511f = true;
    public final org.telegram.ui.Components.c6 h = new org.telegram.ui.Components.c6(0, 350, qr.h);
    public final wc f1513i = new wc((View) null);
    public final org.telegram.ui.Cells.z f1514j = org.telegram.ui.ActionBar.i6.Y(553648127, 0, 0);
    public final Paint f1524t = new Paint(1);
    public final Paint f1525u = new Paint(1);
    public final Path v = new Path();
    public final RectF f1526w = new RectF();

    public static CharSequence d() {
        if (f1507y == null) {
            f1507y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f1507y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            oq oqVar = new oq(R.drawable.filled_widget_music, 0);
            oqVar.setSize(AndroidUtilities.dp(16.0f));
            oqVar.spaceScaleX = 1.0f;
            oqVar.translate(-AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            ((SpannableStringBuilder) f1507y[0]).setSpan(oqVar, 0, 1, 33);
        }
        return f1507y[0];
    }

    public final void a(Canvas canvas, float f7) {
        float f10;
        Typeface bold;
        String str = "";
        if (this.f1518n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f1515k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f1512g;
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
            this.f1518n = new g01(spannableStringBuilder, f10, bold);
        }
        if (this.f1519o == null || this.f1517m) {
            String str2 = this.f1516l;
            if (str2 != null) {
                str = str2;
            }
            this.f1519o = new g01(str, 14.0f, null);
        }
        float e = this.h.e(this.f1511f);
        Paint paint = this.f1524t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f7, Math.max(this.f1518n.f24149c, this.f1519o.f24149c) + AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(18.0f), e));
        this.f1527x = min;
        int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(22.0f), e);
        float f11 = min;
        RectF rectF = this.f1526w;
        rectF.set(0.0f, 0.0f, f11, lerp);
        canvas.save();
        float a2 = this.f1513i.a(0.02f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), e);
        canvas.drawRoundRect(rectF, lerp2, lerp2, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, lerp2, lerp2, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = this.f1514j;
        zVar.setBounds(0, 0, min, lerp);
        zVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(42.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(42.0f));
        Paint paint2 = this.f1525u;
        paint2.setColor(-1);
        float f12 = 1.0f - e;
        paint2.setAlpha((int) (255.0f * f12));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
        canvas.restore();
        int dp = min - AndroidUtilities.dp(20.0f);
        if (f11 < f7) {
            dp = (int) Math.min(AndroidUtilities.dp(12.0f) + dp, f7 - AndroidUtilities.dp(20.0f));
        }
        g01 g01Var = this.f1518n;
        float f13 = dp;
        g01Var.f24159p = f13;
        g01Var.c(AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f), e), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(11.0f), e), 1.0f, -1, canvas);
        g01 g01Var2 = this.f1519o;
        g01Var2.f24159p = f13;
        g01Var2.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), f12, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f7;
        if (this.f1511f) {
            f7 = 22.0f;
        } else {
            f7 = 42.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final void c() {
        if (!this.f1520p && !this.f1521q && this.f1509b != null && this.f1510c != null && this.f1522r != null) {
            this.f1521q = true;
            MessagesController.getInstance(this.f1508a).getStoriesController().d0(this.f1509b.longValue(), this.f1510c.intValue(), new f3(this, 2));
        }
    }

    public final void e(float f7, float f10, boolean z10) {
        this.f1513i.c(z10);
        int[] iArr = z10 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.z zVar = this.f1514j;
        zVar.setState(iArr);
        if (z10) {
            zVar.setHotspot(f7, f10);
        }
    }
}

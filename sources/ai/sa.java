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
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.v01;
import org.telegram.ui.Components.yc;
public final class sa {
    public static CharSequence[] f1513y;
    public int f1514a;
    public Long f1515b;
    public Integer f1516c;
    public Integer d;
    public boolean e;
    public TLRPC.Document f1518g;
    public SpannableStringBuilder f1521k;
    public String f1522l;
    public boolean f1523m;
    public v01 f1524n;
    public v01 f1525o;
    public boolean f1526p;
    public boolean f1527q;
    public View f1528r;
    public Runnable f1529s;
    public int f1533x;
    public boolean f1517f = true;
    public final org.telegram.ui.Components.e6 h = new org.telegram.ui.Components.e6(0, 350, sr.h);
    public final yc f1519i = new yc((View) null);
    public final org.telegram.ui.Cells.z f1520j = org.telegram.ui.ActionBar.i6.Y(553648127, 0, 0);
    public final Paint f1530t = new Paint(1);
    public final Paint f1531u = new Paint(1);
    public final Path v = new Path();
    public final RectF f1532w = new RectF();

    public static CharSequence d() {
        if (f1513y == null) {
            f1513y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f1513y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            qq qqVar = new qq(R.drawable.filled_widget_music, 0);
            qqVar.setSize(AndroidUtilities.dp(16.0f));
            qqVar.spaceScaleX = 1.0f;
            qqVar.translate(-AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            ((SpannableStringBuilder) f1513y[0]).setSpan(qqVar, 0, 1, 33);
        }
        return f1513y[0];
    }

    public final void a(Canvas canvas, float f7) {
        float f10;
        Typeface bold;
        String str = "";
        if (this.f1524n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f1521k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f1518g;
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
            this.f1524n = new v01(spannableStringBuilder, f10, bold);
        }
        if (this.f1525o == null || this.f1523m) {
            String str2 = this.f1522l;
            if (str2 != null) {
                str = str2;
            }
            this.f1525o = new v01(str, 14.0f, null);
        }
        float e = this.h.e(this.f1517f);
        Paint paint = this.f1530t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f7, Math.max(this.f1524n.f28987c, this.f1525o.f28987c) + AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(18.0f), e));
        this.f1533x = min;
        int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(22.0f), e);
        float f11 = min;
        RectF rectF = this.f1532w;
        rectF.set(0.0f, 0.0f, f11, lerp);
        canvas.save();
        float a2 = this.f1519i.a(0.02f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), e);
        canvas.drawRoundRect(rectF, lerp2, lerp2, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, lerp2, lerp2, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = this.f1520j;
        zVar.setBounds(0, 0, min, lerp);
        zVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(42.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(42.0f));
        Paint paint2 = this.f1531u;
        paint2.setColor(-1);
        float f12 = 1.0f - e;
        paint2.setAlpha((int) (255.0f * f12));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
        canvas.restore();
        int dp = min - AndroidUtilities.dp(20.0f);
        if (f11 < f7) {
            dp = (int) Math.min(AndroidUtilities.dp(12.0f) + dp, f7 - AndroidUtilities.dp(20.0f));
        }
        v01 v01Var = this.f1524n;
        float f13 = dp;
        v01Var.f28997p = f13;
        v01Var.c(AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f), e), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(11.0f), e), 1.0f, -1, canvas);
        v01 v01Var2 = this.f1525o;
        v01Var2.f28997p = f13;
        v01Var2.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), f12, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f7;
        if (this.f1517f) {
            f7 = 22.0f;
        } else {
            f7 = 42.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final void c() {
        if (!this.f1526p && !this.f1527q && this.f1515b != null && this.f1516c != null && this.f1528r != null) {
            this.f1527q = true;
            MessagesController.getInstance(this.f1514a).getStoriesController().d0(this.f1515b.longValue(), this.f1516c.intValue(), new y1(this, 3));
        }
    }

    public final void e(float f7, float f10, boolean z10) {
        this.f1519i.c(z10);
        int[] iArr = z10 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.z zVar = this.f1520j;
        zVar.setState(iArr);
        if (z10) {
            zVar.setHotspot(f7, f10);
        }
    }
}

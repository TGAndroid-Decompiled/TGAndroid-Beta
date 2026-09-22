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
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.yc;
public final class sa {
    public static CharSequence[] f1509y;
    public int f1510a;
    public Long f1511b;
    public Integer f1512c;
    public Integer d;
    public boolean e;
    public TLRPC.Document f1514g;
    public SpannableStringBuilder f1517k;
    public String f1518l;
    public boolean f1519m;
    public w01 f1520n;
    public w01 f1521o;
    public boolean f1522p;
    public boolean f1523q;
    public View f1524r;
    public Runnable f1525s;
    public int f1529x;
    public boolean f1513f = true;
    public final org.telegram.ui.Components.d6 h = new org.telegram.ui.Components.d6(0, 350, qr.h);
    public final yc f1515i = new yc((View) null);
    public final org.telegram.ui.Cells.z f1516j = org.telegram.ui.ActionBar.j6.Y(553648127, 0, 0);
    public final Paint f1526t = new Paint(1);
    public final Paint f1527u = new Paint(1);
    public final Path v = new Path();
    public final RectF f1528w = new RectF();

    public static CharSequence d() {
        if (f1509y == null) {
            f1509y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f1509y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            oq oqVar = new oq(R.drawable.filled_widget_music, 0);
            oqVar.setSize(AndroidUtilities.dp(16.0f));
            oqVar.spaceScaleX = 1.0f;
            oqVar.translate(-AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            ((SpannableStringBuilder) f1509y[0]).setSpan(oqVar, 0, 1, 33);
        }
        return f1509y[0];
    }

    public final void a(Canvas canvas, float f7) {
        float f10;
        Typeface bold;
        String str = "";
        if (this.f1520n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f1517k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f1514g;
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
            this.f1520n = new w01(spannableStringBuilder, f10, bold);
        }
        if (this.f1521o == null || this.f1519m) {
            String str2 = this.f1518l;
            if (str2 != null) {
                str = str2;
            }
            this.f1521o = new w01(str, 14.0f, null);
        }
        float e = this.h.e(this.f1513f);
        Paint paint = this.f1526t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f7, Math.max(this.f1520n.f29862c, this.f1521o.f29862c) + AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(18.0f), e));
        this.f1529x = min;
        int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(22.0f), e);
        float f11 = min;
        RectF rectF = this.f1528w;
        rectF.set(0.0f, 0.0f, f11, lerp);
        canvas.save();
        float a2 = this.f1515i.a(0.02f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), e);
        canvas.drawRoundRect(rectF, lerp2, lerp2, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, lerp2, lerp2, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = this.f1516j;
        zVar.setBounds(0, 0, min, lerp);
        zVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(42.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(42.0f));
        Paint paint2 = this.f1527u;
        paint2.setColor(-1);
        float f12 = 1.0f - e;
        paint2.setAlpha((int) (255.0f * f12));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
        canvas.restore();
        int dp = min - AndroidUtilities.dp(20.0f);
        if (f11 < f7) {
            dp = (int) Math.min(AndroidUtilities.dp(12.0f) + dp, f7 - AndroidUtilities.dp(20.0f));
        }
        w01 w01Var = this.f1520n;
        float f13 = dp;
        w01Var.f29872p = f13;
        w01Var.c(AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f), e), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(11.0f), e), 1.0f, -1, canvas);
        w01 w01Var2 = this.f1521o;
        w01Var2.f29872p = f13;
        w01Var2.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), f12, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f7;
        if (this.f1513f) {
            f7 = 22.0f;
        } else {
            f7 = 42.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final void c() {
        if (!this.f1522p && !this.f1523q && this.f1511b != null && this.f1512c != null && this.f1524r != null) {
            this.f1523q = true;
            MessagesController.getInstance(this.f1510a).getStoriesController().d0(this.f1511b.longValue(), this.f1512c.intValue(), new f3(this, 2));
        }
    }

    public final void e(float f7, float f10, boolean z10) {
        this.f1515i.c(z10);
        int[] iArr = z10 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.z zVar = this.f1516j;
        zVar.setState(iArr);
        if (z10) {
            zVar.setHotspot(f7, f10);
        }
    }
}

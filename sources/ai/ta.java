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
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.l11;
public final class ta {
    public static CharSequence[] f1752y;
    public int f1753a;
    public Long f1754b;
    public Integer f1755c;
    public Integer d;
    public boolean f1756e;
    public TLRPC.Document f1758g;
    public SpannableStringBuilder f1761k;
    public String f1762l;
    public boolean f1763m;
    public l11 f1764n;
    public l11 f1765o;
    public boolean f1766p;
    public boolean f1767q;
    public View f1768r;
    public Runnable f1769s;
    public int f1773x;
    public boolean f1757f = true;
    public final org.telegram.ui.Components.g6 h = new org.telegram.ui.Components.g6(0, 350, hs.h);
    public final bd f1759i = new bd((View) null);
    public final org.telegram.ui.Cells.z f1760j = org.telegram.ui.ActionBar.i6.Z(553648127, 0, 0);
    public final Paint f1770t = new Paint(1);
    public final Paint f1771u = new Paint(1);
    public final Path v = new Path();
    public final RectF f1772w = new RectF();

    public static CharSequence d() {
        if (f1752y == null) {
            f1752y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f1752y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            er erVar = new er(R.drawable.filled_widget_music, 0);
            erVar.setSize(AndroidUtilities.dp(16.0f));
            erVar.spaceScaleX = 1.0f;
            erVar.translate(-AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            ((SpannableStringBuilder) f1752y[0]).setSpan(erVar, 0, 1, 33);
        }
        return f1752y[0];
    }

    public final void a(Canvas canvas, float f7) {
        float f10;
        Typeface bold;
        String str = "";
        if (this.f1764n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f1761k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f1758g;
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
            this.f1764n = new l11(spannableStringBuilder, f10, bold);
        }
        if (this.f1765o == null || this.f1763m) {
            String str2 = this.f1762l;
            if (str2 != null) {
                str = str2;
            }
            this.f1765o = new l11(str, 14.0f, null);
        }
        float e7 = this.h.e(this.f1757f);
        Paint paint = this.f1770t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f7, Math.max(this.f1764n.f28222c, this.f1765o.f28222c) + AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(18.0f), e7));
        this.f1773x = min;
        int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(22.0f), e7);
        float f11 = min;
        RectF rectF = this.f1772w;
        rectF.set(0.0f, 0.0f, f11, lerp);
        canvas.save();
        float a2 = this.f1759i.a(0.02f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), e7);
        canvas.drawRoundRect(rectF, lerp2, lerp2, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, lerp2, lerp2, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = this.f1760j;
        zVar.setBounds(0, 0, min, lerp);
        zVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(42.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(42.0f));
        Paint paint2 = this.f1771u;
        paint2.setColor(-1);
        float f12 = 1.0f - e7;
        paint2.setAlpha((int) (255.0f * f12));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
        canvas.restore();
        int dp = min - AndroidUtilities.dp(20.0f);
        if (f11 < f7) {
            dp = (int) Math.min(AndroidUtilities.dp(12.0f) + dp, f7 - AndroidUtilities.dp(20.0f));
        }
        l11 l11Var = this.f1764n;
        float f13 = dp;
        l11Var.f28233p = f13;
        l11Var.c(AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f), e7), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(11.0f), e7), 1.0f, -1, canvas);
        l11 l11Var2 = this.f1765o;
        l11Var2.f28233p = f13;
        l11Var2.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), f12, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f7;
        if (this.f1757f) {
            f7 = 22.0f;
        } else {
            f7 = 42.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final void c() {
        if (!this.f1766p && !this.f1767q && this.f1754b != null && this.f1755c != null && this.f1768r != null) {
            this.f1767q = true;
            MessagesController.getInstance(this.f1753a).getStoriesController().d0(this.f1754b.longValue(), this.f1755c.intValue(), new y1(this, 3));
        }
    }

    public final void e(float f7, float f10, boolean z10) {
        this.f1759i.c(z10);
        int[] iArr = z10 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.z zVar = this.f1760j;
        zVar.setState(iArr);
        if (z10) {
            zVar.setHotspot(f7, f10);
        }
    }
}

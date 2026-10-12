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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.r11;
public final class ta {
    public static CharSequence[] f1750y;
    public int f1751a;
    public Long f1752b;
    public Integer f1753c;
    public Integer d;
    public boolean f1754e;
    public TLRPC.Document f1756g;
    public SpannableStringBuilder f1759k;
    public String f1760l;
    public boolean f1761m;
    public r11 f1762n;
    public r11 f1763o;
    public boolean f1764p;
    public boolean f1765q;
    public View f1766r;
    public Runnable f1767s;
    public int f1771x;
    public boolean f1755f = true;
    public final org.telegram.ui.Components.g6 h = new org.telegram.ui.Components.g6(0, 350, js.h);
    public final ad f1757i = new ad((View) null);
    public final org.telegram.ui.Cells.z f1758j = org.telegram.ui.ActionBar.h6.Z(553648127, 0, 0);
    public final Paint f1768t = new Paint(1);
    public final Paint f1769u = new Paint(1);
    public final Path v = new Path();
    public final RectF f1770w = new RectF();

    public static CharSequence d() {
        if (f1750y == null) {
            f1750y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f1750y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            gr grVar = new gr(R.drawable.filled_widget_music, 0);
            grVar.setSize(AndroidUtilities.dp(16.0f));
            grVar.spaceScaleX = 1.0f;
            grVar.translate(-AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            ((SpannableStringBuilder) f1750y[0]).setSpan(grVar, 0, 1, 33);
        }
        return f1750y[0];
    }

    public final void a(Canvas canvas, float f7) {
        float f10;
        Typeface bold;
        String str = "";
        if (this.f1762n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f1759k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f1756g;
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
            this.f1762n = new r11(spannableStringBuilder, f10, bold);
        }
        if (this.f1763o == null || this.f1761m) {
            String str2 = this.f1760l;
            if (str2 != null) {
                str = str2;
            }
            this.f1763o = new r11(str, 14.0f, null);
        }
        float e7 = this.h.e(this.f1755f);
        Paint paint = this.f1768t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f7, Math.max(this.f1762n.f29988c, this.f1763o.f29988c) + AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(18.0f), e7));
        this.f1771x = min;
        int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(22.0f), e7);
        float f11 = min;
        RectF rectF = this.f1770w;
        rectF.set(0.0f, 0.0f, f11, lerp);
        canvas.save();
        float a2 = this.f1757i.a(0.02f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), e7);
        canvas.drawRoundRect(rectF, lerp2, lerp2, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, lerp2, lerp2, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = this.f1758j;
        zVar.setBounds(0, 0, min, lerp);
        zVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(42.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(42.0f));
        Paint paint2 = this.f1769u;
        paint2.setColor(-1);
        float f12 = 1.0f - e7;
        paint2.setAlpha((int) (255.0f * f12));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
        canvas.restore();
        int dp = min - AndroidUtilities.dp(20.0f);
        if (f11 < f7) {
            dp = (int) Math.min(AndroidUtilities.dp(12.0f) + dp, f7 - AndroidUtilities.dp(20.0f));
        }
        r11 r11Var = this.f1762n;
        float f13 = dp;
        r11Var.f29999p = f13;
        r11Var.c(AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f), e7), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(11.0f), e7), 1.0f, -1, canvas);
        r11 r11Var2 = this.f1763o;
        r11Var2.f29999p = f13;
        r11Var2.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), f12, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f7;
        if (this.f1755f) {
            f7 = 22.0f;
        } else {
            f7 = 42.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final void c() {
        if (!this.f1764p && !this.f1765q && this.f1752b != null && this.f1753c != null && this.f1766r != null) {
            this.f1765q = true;
            MessagesController.getInstance(this.f1751a).getStoriesController().d0(this.f1752b.longValue(), this.f1753c.intValue(), new y1(this, 3));
        }
    }

    public final void e(float f7, float f10, boolean z10) {
        this.f1757i.c(z10);
        int[] iArr = z10 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.z zVar = this.f1758j;
        zVar.setState(iArr);
        if (z10) {
            zVar.setHotspot(f7, f10);
        }
    }
}

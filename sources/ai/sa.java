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
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.yc;
public final class sa {
    public static CharSequence[] f1511y;
    public int f1512a;
    public Long f1513b;
    public Integer f1514c;
    public Integer d;
    public boolean e;
    public TLRPC.Document f1516g;
    public SpannableStringBuilder f1519k;
    public String f1520l;
    public boolean f1521m;
    public t01 f1522n;
    public t01 f1523o;
    public boolean f1524p;
    public boolean f1525q;
    public View f1526r;
    public Runnable f1527s;
    public int f1531x;
    public boolean f1515f = true;
    public final org.telegram.ui.Components.e6 h = new org.telegram.ui.Components.e6(0, 350, rr.h);
    public final yc f1517i = new yc((View) null);
    public final org.telegram.ui.Cells.z f1518j = org.telegram.ui.ActionBar.h6.Y(553648127, 0, 0);
    public final Paint f1528t = new Paint(1);
    public final Paint f1529u = new Paint(1);
    public final Path v = new Path();
    public final RectF f1530w = new RectF();

    public static CharSequence d() {
        if (f1511y == null) {
            f1511y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f1511y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            pq pqVar = new pq(R.drawable.filled_widget_music, 0);
            pqVar.setSize(AndroidUtilities.dp(16.0f));
            pqVar.spaceScaleX = 1.0f;
            pqVar.translate(-AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            ((SpannableStringBuilder) f1511y[0]).setSpan(pqVar, 0, 1, 33);
        }
        return f1511y[0];
    }

    public final void a(Canvas canvas, float f7) {
        float f10;
        Typeface bold;
        String str = "";
        if (this.f1522n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f1519k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f1516g;
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
            this.f1522n = new t01(spannableStringBuilder, f10, bold);
        }
        if (this.f1523o == null || this.f1521m) {
            String str2 = this.f1520l;
            if (str2 != null) {
                str = str2;
            }
            this.f1523o = new t01(str, 14.0f, null);
        }
        float e = this.h.e(this.f1515f);
        Paint paint = this.f1528t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f7, Math.max(this.f1522n.f28363c, this.f1523o.f28363c) + AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(18.0f), e));
        this.f1531x = min;
        int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(22.0f), e);
        float f11 = min;
        RectF rectF = this.f1530w;
        rectF.set(0.0f, 0.0f, f11, lerp);
        canvas.save();
        float a2 = this.f1517i.a(0.02f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), e);
        canvas.drawRoundRect(rectF, lerp2, lerp2, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, lerp2, lerp2, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = this.f1518j;
        zVar.setBounds(0, 0, min, lerp);
        zVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(42.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(42.0f));
        Paint paint2 = this.f1529u;
        paint2.setColor(-1);
        float f12 = 1.0f - e;
        paint2.setAlpha((int) (255.0f * f12));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
        canvas.restore();
        int dp = min - AndroidUtilities.dp(20.0f);
        if (f11 < f7) {
            dp = (int) Math.min(AndroidUtilities.dp(12.0f) + dp, f7 - AndroidUtilities.dp(20.0f));
        }
        t01 t01Var = this.f1522n;
        float f13 = dp;
        t01Var.f28373p = f13;
        t01Var.c(AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f), e), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(11.0f), e), 1.0f, -1, canvas);
        t01 t01Var2 = this.f1523o;
        t01Var2.f28373p = f13;
        t01Var2.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), f12, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f7;
        if (this.f1515f) {
            f7 = 22.0f;
        } else {
            f7 = 42.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final void c() {
        if (!this.f1524p && !this.f1525q && this.f1513b != null && this.f1514c != null && this.f1526r != null) {
            this.f1525q = true;
            MessagesController.getInstance(this.f1512a).getStoriesController().d0(this.f1513b.longValue(), this.f1514c.intValue(), new y1(this, 3));
        }
    }

    public final void e(float f7, float f10, boolean z10) {
        this.f1517i.c(z10);
        int[] iArr = z10 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.z zVar = this.f1518j;
        zVar.setState(iArr);
        if (z10) {
            zVar.setHotspot(f7, f10);
        }
    }
}

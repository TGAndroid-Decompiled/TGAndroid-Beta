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
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.zc;
public final class sa {
    public static CharSequence[] f1516y;
    public int f1517a;
    public Long f1518b;
    public Integer f1519c;
    public Integer d;
    public boolean e;
    public TLRPC.Document f1521g;
    public SpannableStringBuilder f1524k;
    public String f1525l;
    public boolean f1526m;
    public w01 f1527n;
    public w01 f1528o;
    public boolean f1529p;
    public boolean f1530q;
    public View f1531r;
    public Runnable f1532s;
    public int f1536x;
    public boolean f1520f = true;
    public final org.telegram.ui.Components.e6 h = new org.telegram.ui.Components.e6(0, 350, tr.h);
    public final zc f1522i = new zc((View) null);
    public final org.telegram.ui.Cells.z f1523j = org.telegram.ui.ActionBar.h6.Y(553648127, 0, 0);
    public final Paint f1533t = new Paint(1);
    public final Paint f1534u = new Paint(1);
    public final Path v = new Path();
    public final RectF f1535w = new RectF();

    public static CharSequence d() {
        if (f1516y == null) {
            f1516y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f1516y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            rq rqVar = new rq(R.drawable.filled_widget_music, 0);
            rqVar.setSize(AndroidUtilities.dp(16.0f));
            rqVar.spaceScaleX = 1.0f;
            rqVar.translate(-AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            ((SpannableStringBuilder) f1516y[0]).setSpan(rqVar, 0, 1, 33);
        }
        return f1516y[0];
    }

    public final void a(Canvas canvas, float f7) {
        float f10;
        Typeface bold;
        String str = "";
        if (this.f1527n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f1524k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f1521g;
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
            this.f1527n = new w01(spannableStringBuilder, f10, bold);
        }
        if (this.f1528o == null || this.f1526m) {
            String str2 = this.f1525l;
            if (str2 != null) {
                str = str2;
            }
            this.f1528o = new w01(str, 14.0f, null);
        }
        float e = this.h.e(this.f1520f);
        Paint paint = this.f1533t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f7, Math.max(this.f1527n.f29768c, this.f1528o.f29768c) + AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(18.0f), e));
        this.f1536x = min;
        int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(22.0f), e);
        float f11 = min;
        RectF rectF = this.f1535w;
        rectF.set(0.0f, 0.0f, f11, lerp);
        canvas.save();
        float a2 = this.f1522i.a(0.02f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), e);
        canvas.drawRoundRect(rectF, lerp2, lerp2, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, lerp2, lerp2, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = this.f1523j;
        zVar.setBounds(0, 0, min, lerp);
        zVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(42.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(42.0f));
        Paint paint2 = this.f1534u;
        paint2.setColor(-1);
        float f12 = 1.0f - e;
        paint2.setAlpha((int) (255.0f * f12));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
        canvas.restore();
        int dp = min - AndroidUtilities.dp(20.0f);
        if (f11 < f7) {
            dp = (int) Math.min(AndroidUtilities.dp(12.0f) + dp, f7 - AndroidUtilities.dp(20.0f));
        }
        w01 w01Var = this.f1527n;
        float f13 = dp;
        w01Var.f29778p = f13;
        w01Var.c(AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f), e), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(11.0f), e), 1.0f, -1, canvas);
        w01 w01Var2 = this.f1528o;
        w01Var2.f29778p = f13;
        w01Var2.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), f12, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f7;
        if (this.f1520f) {
            f7 = 22.0f;
        } else {
            f7 = 42.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final void c() {
        if (!this.f1529p && !this.f1530q && this.f1518b != null && this.f1519c != null && this.f1531r != null) {
            this.f1530q = true;
            MessagesController.getInstance(this.f1517a).getStoriesController().d0(this.f1518b.longValue(), this.f1519c.intValue(), new y1(this, 3));
        }
    }

    public final void e(float f7, float f10, boolean z10) {
        this.f1522i.c(z10);
        int[] iArr = z10 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.z zVar = this.f1523j;
        zVar.setState(iArr);
        if (z10) {
            zVar.setHotspot(f7, f10);
        }
    }
}

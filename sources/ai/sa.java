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
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.zc;
public final class sa {
    public static CharSequence[] f1645y;
    public int f1646a;
    public Long f1647b;
    public Integer f1648c;
    public Integer d;
    public boolean f1649e;
    public TLRPC.Document f1651g;
    public SpannableStringBuilder f1654k;
    public String f1655l;
    public boolean f1656m;
    public e11 f1657n;
    public e11 f1658o;
    public boolean f1659p;
    public boolean f1660q;
    public View f1661r;
    public Runnable f1662s;
    public int f1666x;
    public boolean f1650f = true;
    public final org.telegram.ui.Components.e6 h = new org.telegram.ui.Components.e6(0, 350, tr.h);
    public final zc f1652i = new zc((View) null);
    public final org.telegram.ui.Cells.z f1653j = org.telegram.ui.ActionBar.i6.Y(553648127, 0, 0);
    public final Paint f1663t = new Paint(1);
    public final Paint f1664u = new Paint(1);
    public final Path v = new Path();
    public final RectF f1665w = new RectF();

    public static CharSequence d() {
        if (f1645y == null) {
            f1645y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f1645y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            rq rqVar = new rq(R.drawable.filled_widget_music, 0);
            rqVar.setSize(AndroidUtilities.dp(16.0f));
            rqVar.spaceScaleX = 1.0f;
            rqVar.translate(-AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            ((SpannableStringBuilder) f1645y[0]).setSpan(rqVar, 0, 1, 33);
        }
        return f1645y[0];
    }

    public final void a(Canvas canvas, float f7) {
        float f10;
        Typeface bold;
        String str = "";
        if (this.f1657n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f1654k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f1651g;
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
            this.f1657n = new e11(spannableStringBuilder, f10, bold);
        }
        if (this.f1658o == null || this.f1656m) {
            String str2 = this.f1655l;
            if (str2 != null) {
                str = str2;
            }
            this.f1658o = new e11(str, 14.0f, null);
        }
        float e7 = this.h.e(this.f1650f);
        Paint paint = this.f1663t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f7, Math.max(this.f1657n.f25878c, this.f1658o.f25878c) + AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(18.0f), e7));
        this.f1666x = min;
        int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(22.0f), e7);
        float f11 = min;
        RectF rectF = this.f1665w;
        rectF.set(0.0f, 0.0f, f11, lerp);
        canvas.save();
        float a2 = this.f1652i.a(0.02f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), e7);
        canvas.drawRoundRect(rectF, lerp2, lerp2, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, lerp2, lerp2, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = this.f1653j;
        zVar.setBounds(0, 0, min, lerp);
        zVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(42.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(42.0f));
        Paint paint2 = this.f1664u;
        paint2.setColor(-1);
        float f12 = 1.0f - e7;
        paint2.setAlpha((int) (255.0f * f12));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
        canvas.restore();
        int dp = min - AndroidUtilities.dp(20.0f);
        if (f11 < f7) {
            dp = (int) Math.min(AndroidUtilities.dp(12.0f) + dp, f7 - AndroidUtilities.dp(20.0f));
        }
        e11 e11Var = this.f1657n;
        float f13 = dp;
        e11Var.f25889p = f13;
        e11Var.c(AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f), e7), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(11.0f), e7), 1.0f, -1, canvas);
        e11 e11Var2 = this.f1658o;
        e11Var2.f25889p = f13;
        e11Var2.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), f12, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f7;
        if (this.f1650f) {
            f7 = 22.0f;
        } else {
            f7 = 42.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final void c() {
        if (!this.f1659p && !this.f1660q && this.f1647b != null && this.f1648c != null && this.f1661r != null) {
            this.f1660q = true;
            MessagesController.getInstance(this.f1646a).getStoriesController().d0(this.f1647b.longValue(), this.f1648c.intValue(), new y1(this, 3));
        }
    }

    public final void e(float f7, float f10, boolean z10) {
        this.f1652i.c(z10);
        int[] iArr = z10 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.z zVar = this.f1653j;
        zVar.setState(iArr);
        if (z10) {
            zVar.setHotspot(f7, f10);
        }
    }
}

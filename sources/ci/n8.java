package ci;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yq;
public final class n8 {
    public static CharSequence[] f5657y;
    public int f5658a;
    public Long f5659b;
    public Integer f5660c;
    public Integer d;
    public boolean e;
    public TLRPC.Document f5662g;
    public SpannableStringBuilder f5665k;
    public String f5666l;
    public boolean f5667m;
    public f11 f5668n;
    public f11 f5669o;
    public boolean f5670p;
    public boolean f5671q;
    public View f5672r;
    public Runnable f5673s;
    public int f5677x;
    public boolean f5661f = true;
    public final org.telegram.ui.Components.f6 h = new org.telegram.ui.Components.f6(0, 350, bs.h);
    public final yc f5663i = new yc((View) null);
    public final org.telegram.ui.Cells.z f5664j = org.telegram.ui.ActionBar.h6.Z(553648127, 0, 0);
    public final Paint f5674t = new Paint(1);
    public final Paint f5675u = new Paint(1);
    public final Path v = new Path();
    public final RectF f5676w = new RectF();

    public static CharSequence d() {
        if (f5657y == null) {
            f5657y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f5657y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            yq yqVar = new yq(R.drawable.filled_widget_music, 0);
            yqVar.setSize(AndroidUtilities.dp(16.0f));
            yqVar.spaceScaleX = 1.0f;
            yqVar.translate(-AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            ((SpannableStringBuilder) f5657y[0]).setSpan(yqVar, 0, 1, 33);
        }
        return f5657y[0];
    }

    public final void a(Canvas canvas, float f7) {
        float f10;
        Typeface bold;
        String str = "";
        if (this.f5668n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f5665k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f5662g;
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
            this.f5668n = new f11(spannableStringBuilder, f10, bold);
        }
        if (this.f5669o == null || this.f5667m) {
            String str2 = this.f5666l;
            if (str2 != null) {
                str = str2;
            }
            this.f5669o = new f11(str, 14.0f, null);
        }
        float e = this.h.e(this.f5661f);
        Paint paint = this.f5674t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f7, Math.max(this.f5668n.f26021c, this.f5669o.f26021c) + AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(18.0f), e));
        this.f5677x = min;
        int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(22.0f), e);
        float f11 = min;
        RectF rectF = this.f5676w;
        rectF.set(0.0f, 0.0f, f11, lerp);
        canvas.save();
        float a2 = this.f5663i.a(0.02f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), e);
        canvas.drawRoundRect(rectF, lerp2, lerp2, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, lerp2, lerp2, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = this.f5664j;
        zVar.setBounds(0, 0, min, lerp);
        zVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(42.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(42.0f));
        Paint paint2 = this.f5675u;
        paint2.setColor(-1);
        float f12 = 1.0f - e;
        paint2.setAlpha((int) (255.0f * f12));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
        canvas.restore();
        int dp = min - AndroidUtilities.dp(20.0f);
        if (f11 < f7) {
            dp = (int) Math.min(AndroidUtilities.dp(12.0f) + dp, f7 - AndroidUtilities.dp(20.0f));
        }
        f11 f11Var = this.f5668n;
        float f13 = dp;
        f11Var.f26031p = f13;
        f11Var.c(AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f), e), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(11.0f), e), 1.0f, -1, canvas);
        f11 f11Var2 = this.f5669o;
        f11Var2.f26031p = f13;
        f11Var2.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), f12, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f7;
        if (this.f5661f) {
            f7 = 22.0f;
        } else {
            f7 = 42.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final void c() {
        if (!this.f5670p && !this.f5671q && this.f5659b != null && this.f5660c != null && this.f5672r != null) {
            this.f5671q = true;
            MessagesController.getInstance(this.f5658a).getStoriesController().d0(this.f5659b.longValue(), this.f5660c.intValue(), new ai.r0(this, 9));
        }
    }

    public final void e(float f7, float f10, boolean z10) {
        this.f5663i.c(z10);
        int[] iArr = z10 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.z zVar = this.f5664j;
        zVar.setState(iArr);
        if (z10) {
            zVar.setHotspot(f7, f10);
        }
    }
}

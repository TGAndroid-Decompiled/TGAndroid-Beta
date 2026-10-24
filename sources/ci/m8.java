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
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.zr;
public final class m8 {
    public static CharSequence[] f5563y;
    public int f5564a;
    public Long f5565b;
    public Integer f5566c;
    public Integer d;
    public boolean e;
    public TLRPC.Document f5568g;
    public SpannableStringBuilder f5571k;
    public String f5572l;
    public boolean f5573m;
    public h11 f5574n;
    public h11 f5575o;
    public boolean f5576p;
    public boolean f5577q;
    public View f5578r;
    public Runnable f5579s;
    public int f5583x;
    public boolean f5567f = true;
    public final org.telegram.ui.Components.d6 h = new org.telegram.ui.Components.d6(0, 350, zr.h);
    public final wc f5569i = new wc((View) null);
    public final org.telegram.ui.Cells.y f5570j = org.telegram.ui.ActionBar.k6.Z(553648127, 0, 0);
    public final Paint f5580t = new Paint(1);
    public final Paint f5581u = new Paint(1);
    public final Path v = new Path();
    public final RectF f5582w = new RectF();

    public static CharSequence d() {
        if (f5563y == null) {
            f5563y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f5563y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            vq vqVar = new vq(R.drawable.filled_widget_music, 0);
            vqVar.setSize(AndroidUtilities.dp(16.0f));
            vqVar.spaceScaleX = 1.0f;
            vqVar.translate(-AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            ((SpannableStringBuilder) f5563y[0]).setSpan(vqVar, 0, 1, 33);
        }
        return f5563y[0];
    }

    public final void a(Canvas canvas, float f7) {
        float f10;
        Typeface bold;
        String str = "";
        if (this.f5574n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f5571k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f5568g;
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
            this.f5574n = new h11(spannableStringBuilder, f10, bold);
        }
        if (this.f5575o == null || this.f5573m) {
            String str2 = this.f5572l;
            if (str2 != null) {
                str = str2;
            }
            this.f5575o = new h11(str, 14.0f, null);
        }
        float e = this.h.e(this.f5567f);
        Paint paint = this.f5580t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f7, Math.max(this.f5574n.f26843c, this.f5575o.f26843c) + AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(18.0f), e));
        this.f5583x = min;
        int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(22.0f), e);
        float f11 = min;
        RectF rectF = this.f5582w;
        rectF.set(0.0f, 0.0f, f11, lerp);
        canvas.save();
        float a2 = this.f5569i.a(0.02f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), e);
        canvas.drawRoundRect(rectF, lerp2, lerp2, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, lerp2, lerp2, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.y yVar = this.f5570j;
        yVar.setBounds(0, 0, min, lerp);
        yVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(42.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(42.0f));
        Paint paint2 = this.f5581u;
        paint2.setColor(-1);
        float f12 = 1.0f - e;
        paint2.setAlpha((int) (255.0f * f12));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
        canvas.restore();
        int dp = min - AndroidUtilities.dp(20.0f);
        if (f11 < f7) {
            dp = (int) Math.min(AndroidUtilities.dp(12.0f) + dp, f7 - AndroidUtilities.dp(20.0f));
        }
        h11 h11Var = this.f5574n;
        float f13 = dp;
        h11Var.f26853p = f13;
        h11Var.c(AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f), e), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(11.0f), e), 1.0f, -1, canvas);
        h11 h11Var2 = this.f5575o;
        h11Var2.f26853p = f13;
        h11Var2.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), f12, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f7;
        if (this.f5567f) {
            f7 = 22.0f;
        } else {
            f7 = 42.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final void c() {
        if (!this.f5576p && !this.f5577q && this.f5565b != null && this.f5566c != null && this.f5578r != null) {
            this.f5577q = true;
            MessagesController.getInstance(this.f5564a).getStoriesController().d0(this.f5565b.longValue(), this.f5566c.intValue(), new ai.r0(this, 9));
        }
    }

    public final void e(float f7, float f10, boolean z10) {
        this.f5569i.c(z10);
        int[] iArr = z10 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.y yVar = this.f5570j;
        yVar.setState(iArr);
        if (z10) {
            yVar.setHotspot(f7, f10);
        }
    }
}

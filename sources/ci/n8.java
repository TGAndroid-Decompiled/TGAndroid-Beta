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
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yq;
public final class n8 {
    public static CharSequence[] f5660y;
    public int f5661a;
    public Long f5662b;
    public Integer f5663c;
    public Integer d;
    public boolean e;
    public TLRPC.Document f5665g;
    public SpannableStringBuilder f5668k;
    public String f5669l;
    public boolean f5670m;
    public d11 f5671n;
    public d11 f5672o;
    public boolean f5673p;
    public boolean f5674q;
    public View f5675r;
    public Runnable f5676s;
    public int f5680x;
    public boolean f5664f = true;
    public final org.telegram.ui.Components.f6 h = new org.telegram.ui.Components.f6(0, 350, bs.h);
    public final yc f5666i = new yc((View) null);
    public final org.telegram.ui.Cells.z f5667j = org.telegram.ui.ActionBar.h6.Z(553648127, 0, 0);
    public final Paint f5677t = new Paint(1);
    public final Paint f5678u = new Paint(1);
    public final Path v = new Path();
    public final RectF f5679w = new RectF();

    public static CharSequence d() {
        if (f5660y == null) {
            f5660y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f5660y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            yq yqVar = new yq(R.drawable.filled_widget_music, 0);
            yqVar.setSize(AndroidUtilities.dp(16.0f));
            yqVar.spaceScaleX = 1.0f;
            yqVar.translate(-AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            ((SpannableStringBuilder) f5660y[0]).setSpan(yqVar, 0, 1, 33);
        }
        return f5660y[0];
    }

    public final void a(Canvas canvas, float f7) {
        float f10;
        Typeface bold;
        String str = "";
        if (this.f5671n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f5668k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f5665g;
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
            this.f5671n = new d11(spannableStringBuilder, f10, bold);
        }
        if (this.f5672o == null || this.f5670m) {
            String str2 = this.f5669l;
            if (str2 != null) {
                str = str2;
            }
            this.f5672o = new d11(str, 14.0f, null);
        }
        float e = this.h.e(this.f5664f);
        Paint paint = this.f5677t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f7, Math.max(this.f5671n.f25444c, this.f5672o.f25444c) + AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(18.0f), e));
        this.f5680x = min;
        int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(22.0f), e);
        float f11 = min;
        RectF rectF = this.f5679w;
        rectF.set(0.0f, 0.0f, f11, lerp);
        canvas.save();
        float a2 = this.f5666i.a(0.02f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), e);
        canvas.drawRoundRect(rectF, lerp2, lerp2, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, lerp2, lerp2, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = this.f5667j;
        zVar.setBounds(0, 0, min, lerp);
        zVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(42.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(42.0f));
        Paint paint2 = this.f5678u;
        paint2.setColor(-1);
        float f12 = 1.0f - e;
        paint2.setAlpha((int) (255.0f * f12));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
        canvas.restore();
        int dp = min - AndroidUtilities.dp(20.0f);
        if (f11 < f7) {
            dp = (int) Math.min(AndroidUtilities.dp(12.0f) + dp, f7 - AndroidUtilities.dp(20.0f));
        }
        d11 d11Var = this.f5671n;
        float f13 = dp;
        d11Var.f25454p = f13;
        d11Var.c(AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f), e), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(11.0f), e), 1.0f, -1, canvas);
        d11 d11Var2 = this.f5672o;
        d11Var2.f25454p = f13;
        d11Var2.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), f12, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f7;
        if (this.f5664f) {
            f7 = 22.0f;
        } else {
            f7 = 42.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final void c() {
        if (!this.f5673p && !this.f5674q && this.f5662b != null && this.f5663c != null && this.f5675r != null) {
            this.f5674q = true;
            MessagesController.getInstance(this.f5661a).getStoriesController().d0(this.f5662b.longValue(), this.f5663c.intValue(), new ai.r0(this, 9));
        }
    }

    public final void e(float f7, float f10, boolean z10) {
        this.f5666i.c(z10);
        int[] iArr = z10 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.z zVar = this.f5667j;
        zVar.setState(iArr);
        if (z10) {
            zVar.setHotspot(f7, f10);
        }
    }
}

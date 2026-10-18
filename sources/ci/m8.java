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
public final class m8 {
    public static CharSequence[] f5559y;
    public int f5560a;
    public Long f5561b;
    public Integer f5562c;
    public Integer d;
    public boolean e;
    public TLRPC.Document f5564g;
    public SpannableStringBuilder f5567k;
    public String f5568l;
    public boolean f5569m;
    public d11 f5570n;
    public d11 f5571o;
    public boolean f5572p;
    public boolean f5573q;
    public View f5574r;
    public Runnable f5575s;
    public int f5579x;
    public boolean f5563f = true;
    public final org.telegram.ui.Components.f6 h = new org.telegram.ui.Components.f6(0, 350, bs.h);
    public final yc f5565i = new yc((View) null);
    public final org.telegram.ui.Cells.z f5566j = org.telegram.ui.ActionBar.h6.Z(553648127, 0, 0);
    public final Paint f5576t = new Paint(1);
    public final Paint f5577u = new Paint(1);
    public final Path v = new Path();
    public final RectF f5578w = new RectF();

    public static CharSequence d() {
        if (f5559y == null) {
            f5559y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f5559y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            yq yqVar = new yq(R.drawable.filled_widget_music, 0);
            yqVar.setSize(AndroidUtilities.dp(16.0f));
            yqVar.spaceScaleX = 1.0f;
            yqVar.translate(-AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            ((SpannableStringBuilder) f5559y[0]).setSpan(yqVar, 0, 1, 33);
        }
        return f5559y[0];
    }

    public final void a(Canvas canvas, float f7) {
        float f10;
        Typeface bold;
        String str = "";
        if (this.f5570n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f5567k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f5564g;
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
            this.f5570n = new d11(spannableStringBuilder, f10, bold);
        }
        if (this.f5571o == null || this.f5569m) {
            String str2 = this.f5568l;
            if (str2 != null) {
                str = str2;
            }
            this.f5571o = new d11(str, 14.0f, null);
        }
        float e = this.h.e(this.f5563f);
        Paint paint = this.f5576t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f7, Math.max(this.f5570n.f25437c, this.f5571o.f25437c) + AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(18.0f), e));
        this.f5579x = min;
        int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(22.0f), e);
        float f11 = min;
        RectF rectF = this.f5578w;
        rectF.set(0.0f, 0.0f, f11, lerp);
        canvas.save();
        float a2 = this.f5565i.a(0.02f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), e);
        canvas.drawRoundRect(rectF, lerp2, lerp2, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, lerp2, lerp2, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = this.f5566j;
        zVar.setBounds(0, 0, min, lerp);
        zVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(42.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(42.0f));
        Paint paint2 = this.f5577u;
        paint2.setColor(-1);
        float f12 = 1.0f - e;
        paint2.setAlpha((int) (255.0f * f12));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
        canvas.restore();
        int dp = min - AndroidUtilities.dp(20.0f);
        if (f11 < f7) {
            dp = (int) Math.min(AndroidUtilities.dp(12.0f) + dp, f7 - AndroidUtilities.dp(20.0f));
        }
        d11 d11Var = this.f5570n;
        float f13 = dp;
        d11Var.f25447p = f13;
        d11Var.c(AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f), e), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(11.0f), e), 1.0f, -1, canvas);
        d11 d11Var2 = this.f5571o;
        d11Var2.f25447p = f13;
        d11Var2.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), f12, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f7;
        if (this.f5563f) {
            f7 = 22.0f;
        } else {
            f7 = 42.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final void c() {
        if (!this.f5572p && !this.f5573q && this.f5561b != null && this.f5562c != null && this.f5574r != null) {
            this.f5573q = true;
            MessagesController.getInstance(this.f5560a).getStoriesController().d0(this.f5561b.longValue(), this.f5562c.intValue(), new ai.r0(this, 9));
        }
    }

    public final void e(float f7, float f10, boolean z10) {
        this.f5565i.c(z10);
        int[] iArr = z10 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.z zVar = this.f5566j;
        zVar.setState(iArr);
        if (z10) {
            zVar.setHotspot(f7, f10);
        }
    }
}

package di;

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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.zq;
public final class k8 {
    public static CharSequence[] f8726y;
    public int f8727a;
    public Long f8728b;
    public Integer f8729c;
    public Integer d;
    public boolean e;
    public TLRPC.Document f8731g;
    public SpannableStringBuilder f8734k;
    public String f8735l;
    public boolean f8736m;
    public r11 f8737n;
    public r11 f8738o;
    public boolean f8739p;
    public boolean f8740q;
    public View f8741r;
    public Runnable f8742s;
    public int f8746x;
    public boolean f8730f = true;
    public final org.telegram.ui.Components.h6 h = new org.telegram.ui.Components.h6(0, 350, ds.h);
    public final xc f8732i = new xc((View) null);
    public final org.telegram.ui.Cells.y f8733j = org.telegram.ui.ActionBar.y6.Z(553648127, 0, 0);
    public final Paint f8743t = new Paint(1);
    public final Paint f8744u = new Paint(1);
    public final Path v = new Path();
    public final RectF f8745w = new RectF();

    public static CharSequence d() {
        if (f8726y == null) {
            f8726y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f8726y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            zq zqVar = new zq(R.drawable.filled_widget_music, 0);
            zqVar.setSize(AndroidUtilities.dp(16.0f));
            zqVar.spaceScaleX = 1.0f;
            zqVar.translate(-AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            ((SpannableStringBuilder) f8726y[0]).setSpan(zqVar, 0, 1, 33);
        }
        return f8726y[0];
    }

    public final void a(Canvas canvas, float f7) {
        float f10;
        Typeface bold;
        String str = "";
        if (this.f8737n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f8734k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f8731g;
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
            this.f8737n = new r11(spannableStringBuilder, f10, bold);
        }
        if (this.f8738o == null || this.f8736m) {
            String str2 = this.f8735l;
            if (str2 != null) {
                str = str2;
            }
            this.f8738o = new r11(str, 14.0f, null);
        }
        float e = this.h.e(this.f8730f);
        Paint paint = this.f8743t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f7, Math.max(this.f8737n.f32090c, this.f8738o.f32090c) + AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(18.0f), e));
        this.f8746x = min;
        int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(22.0f), e);
        float f11 = min;
        RectF rectF = this.f8745w;
        rectF.set(0.0f, 0.0f, f11, lerp);
        canvas.save();
        float a2 = this.f8732i.a(0.02f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), e);
        canvas.drawRoundRect(rectF, lerp2, lerp2, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, lerp2, lerp2, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.y yVar = this.f8733j;
        yVar.setBounds(0, 0, min, lerp);
        yVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(42.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(42.0f));
        Paint paint2 = this.f8744u;
        paint2.setColor(-1);
        float f12 = 1.0f - e;
        paint2.setAlpha((int) (255.0f * f12));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
        canvas.restore();
        int dp = min - AndroidUtilities.dp(20.0f);
        if (f11 < f7) {
            dp = (int) Math.min(AndroidUtilities.dp(12.0f) + dp, f7 - AndroidUtilities.dp(20.0f));
        }
        r11 r11Var = this.f8737n;
        float f13 = dp;
        r11Var.f32100p = f13;
        r11Var.c(AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f), e), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(11.0f), e), 1.0f, -1, canvas);
        r11 r11Var2 = this.f8738o;
        r11Var2.f32100p = f13;
        r11Var2.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), f12, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f7;
        if (this.f8730f) {
            f7 = 22.0f;
        } else {
            f7 = 42.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final void c() {
        if (!this.f8739p && !this.f8740q && this.f8728b != null && this.f8729c != null && this.f8741r != null) {
            this.f8740q = true;
            MessagesController.getInstance(this.f8727a).getStoriesController().g0(this.f8728b.longValue(), this.f8729c.intValue(), new ai.i(this, 13));
        }
    }

    public final void e(float f7, float f10, boolean z10) {
        this.f8732i.c(z10);
        int[] iArr = z10 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.y yVar = this.f8733j;
        yVar.setState(iArr);
        if (z10) {
            yVar.setHotspot(f7, f10);
        }
    }
}

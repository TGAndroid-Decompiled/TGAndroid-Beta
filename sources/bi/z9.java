package bi;

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
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.zc;
public final class z9 {
    public static CharSequence[] f4100y;
    public int f4101a;
    public Long f4102b;
    public Integer f4103c;
    public Integer d;
    public boolean f4104e;
    public TLRPC.Document f4106g;
    public SpannableStringBuilder f4109k;
    public String f4110l;
    public boolean f4111m;
    public f01 f4112n;
    public f01 f4113o;
    public boolean f4114p;
    public boolean f4115q;
    public View f4116r;
    public Runnable f4117s;
    public int f4121x;
    public boolean f4105f = true;
    public final org.telegram.ui.Components.e6 h = new org.telegram.ui.Components.e6(0, 350, pr.h);
    public final zc f4107i = new zc((View) null);
    public final org.telegram.ui.Cells.z f4108j = org.telegram.ui.ActionBar.j6.Y(553648127, 0, 0);
    public final Paint f4118t = new Paint(1);
    public final Paint f4119u = new Paint(1);
    public final Path v = new Path();
    public final RectF f4120w = new RectF();

    public static CharSequence d() {
        if (f4100y == null) {
            f4100y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f4100y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            nq nqVar = new nq(R.drawable.filled_widget_music, 0);
            nqVar.setSize(AndroidUtilities.dp(16.0f));
            nqVar.spaceScaleX = 1.0f;
            nqVar.translate(-AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            ((SpannableStringBuilder) f4100y[0]).setSpan(nqVar, 0, 1, 33);
        }
        return f4100y[0];
    }

    public final void a(Canvas canvas, float f7) {
        float f10;
        Typeface bold;
        String str = "";
        if (this.f4112n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f4109k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f4106g;
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
            this.f4112n = new f01(spannableStringBuilder, f10, bold);
        }
        if (this.f4113o == null || this.f4111m) {
            String str2 = this.f4110l;
            if (str2 != null) {
                str = str2;
            }
            this.f4113o = new f01(str, 14.0f, null);
        }
        float e7 = this.h.e(this.f4105f);
        Paint paint = this.f4118t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f7, Math.max(this.f4112n.f25874c, this.f4113o.f25874c) + AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(18.0f), e7));
        this.f4121x = min;
        int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(22.0f), e7);
        float f11 = min;
        RectF rectF = this.f4120w;
        rectF.set(0.0f, 0.0f, f11, lerp);
        canvas.save();
        float a2 = this.f4107i.a(0.02f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), e7);
        canvas.drawRoundRect(rectF, lerp2, lerp2, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, lerp2, lerp2, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = this.f4108j;
        zVar.setBounds(0, 0, min, lerp);
        zVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(42.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(42.0f));
        Paint paint2 = this.f4119u;
        paint2.setColor(-1);
        float f12 = 1.0f - e7;
        paint2.setAlpha((int) (255.0f * f12));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
        canvas.restore();
        int dp = min - AndroidUtilities.dp(20.0f);
        if (f11 < f7) {
            dp = (int) Math.min(AndroidUtilities.dp(12.0f) + dp, f7 - AndroidUtilities.dp(20.0f));
        }
        f01 f01Var = this.f4112n;
        float f13 = dp;
        f01Var.f25885p = f13;
        f01Var.c(AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f), e7), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(11.0f), e7), 1.0f, -1, canvas);
        f01 f01Var2 = this.f4113o;
        f01Var2.f25885p = f13;
        f01Var2.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), f12, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f7;
        if (this.f4105f) {
            f7 = 22.0f;
        } else {
            f7 = 42.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final void c() {
        if (!this.f4114p && !this.f4115q && this.f4102b != null && this.f4103c != null && this.f4116r != null) {
            this.f4115q = true;
            MessagesController.getInstance(this.f4101a).getStoriesController().d0(this.f4102b.longValue(), this.f4103c.intValue(), new ah.m(this, 3));
        }
    }

    public final void e(float f7, float f10, boolean z10) {
        this.f4107i.c(z10);
        int[] iArr = z10 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.z zVar = this.f4108j;
        zVar.setState(iArr);
        if (z10) {
            zVar.setHotspot(f7, f10);
        }
    }
}

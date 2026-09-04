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
    public static CharSequence[] f4073y;
    public int f4074a;
    public Long f4075b;
    public Integer f4076c;
    public Integer d;
    public boolean f4077e;
    public TLRPC.Document f4079g;
    public SpannableStringBuilder f4082k;
    public String f4083l;
    public boolean f4084m;
    public f01 f4085n;
    public f01 f4086o;
    public boolean f4087p;
    public boolean f4088q;
    public View f4089r;
    public Runnable f4090s;
    public int f4094x;
    public boolean f4078f = true;
    public final org.telegram.ui.Components.e6 h = new org.telegram.ui.Components.e6(0, 350, pr.h);
    public final zc f4080i = new zc((View) null);
    public final org.telegram.ui.Cells.z f4081j = org.telegram.ui.ActionBar.j6.Y(553648127, 0, 0);
    public final Paint f4091t = new Paint(1);
    public final Paint f4092u = new Paint(1);
    public final Path v = new Path();
    public final RectF f4093w = new RectF();

    public static CharSequence d() {
        if (f4073y == null) {
            f4073y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f4073y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            nq nqVar = new nq(R.drawable.filled_widget_music, 0);
            nqVar.setSize(AndroidUtilities.dp(16.0f));
            nqVar.spaceScaleX = 1.0f;
            nqVar.translate(-AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            ((SpannableStringBuilder) f4073y[0]).setSpan(nqVar, 0, 1, 33);
        }
        return f4073y[0];
    }

    public final void a(Canvas canvas, float f7) {
        float f10;
        Typeface bold;
        String str = "";
        if (this.f4085n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f4082k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f4079g;
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
            this.f4085n = new f01(spannableStringBuilder, f10, bold);
        }
        if (this.f4086o == null || this.f4084m) {
            String str2 = this.f4083l;
            if (str2 != null) {
                str = str2;
            }
            this.f4086o = new f01(str, 14.0f, null);
        }
        float e7 = this.h.e(this.f4078f);
        Paint paint = this.f4091t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f7, Math.max(this.f4085n.f25847c, this.f4086o.f25847c) + AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(18.0f), e7));
        this.f4094x = min;
        int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(22.0f), e7);
        float f11 = min;
        RectF rectF = this.f4093w;
        rectF.set(0.0f, 0.0f, f11, lerp);
        canvas.save();
        float a2 = this.f4080i.a(0.02f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), e7);
        canvas.drawRoundRect(rectF, lerp2, lerp2, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, lerp2, lerp2, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = this.f4081j;
        zVar.setBounds(0, 0, min, lerp);
        zVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(42.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(42.0f));
        Paint paint2 = this.f4092u;
        paint2.setColor(-1);
        float f12 = 1.0f - e7;
        paint2.setAlpha((int) (255.0f * f12));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
        canvas.restore();
        int dp = min - AndroidUtilities.dp(20.0f);
        if (f11 < f7) {
            dp = (int) Math.min(AndroidUtilities.dp(12.0f) + dp, f7 - AndroidUtilities.dp(20.0f));
        }
        f01 f01Var = this.f4085n;
        float f13 = dp;
        f01Var.f25858p = f13;
        f01Var.c(AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f), e7), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(11.0f), e7), 1.0f, -1, canvas);
        f01 f01Var2 = this.f4086o;
        f01Var2.f25858p = f13;
        f01Var2.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), f12, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f7;
        if (this.f4078f) {
            f7 = 22.0f;
        } else {
            f7 = 42.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final void c() {
        if (!this.f4087p && !this.f4088q && this.f4075b != null && this.f4076c != null && this.f4089r != null) {
            this.f4088q = true;
            MessagesController.getInstance(this.f4074a).getStoriesController().d0(this.f4075b.longValue(), this.f4076c.intValue(), new ah.m(this, 3));
        }
    }

    public final void e(float f7, float f10, boolean z10) {
        this.f4080i.c(z10);
        int[] iArr = z10 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.z zVar = this.f4081j;
        zVar.setState(iArr);
        if (z10) {
            zVar.setHotspot(f7, f10);
        }
    }
}

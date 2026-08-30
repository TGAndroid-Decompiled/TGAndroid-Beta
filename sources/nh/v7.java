package nh;

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
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rc;
public final class v7 {
    public static CharSequence[] f15994y;
    public int f15995a;
    public Long f15996b;
    public Integer f15997c;
    public Integer d;
    public boolean e;
    public TLRPC.Document f15999g;
    public SpannableStringBuilder f16002k;
    public String f16003l;
    public boolean f16004m;
    public k01 f16005n;
    public k01 f16006o;
    public boolean f16007p;
    public boolean f16008q;
    public View f16009r;
    public Runnable f16010s;
    public int f16014x;
    public boolean f15998f = true;
    public final org.telegram.ui.Components.z5 h = new org.telegram.ui.Components.z5(0, 350, nr.h);
    public final rc f16000i = new rc((View) null);
    public final org.telegram.ui.Cells.z f16001j = org.telegram.ui.ActionBar.j6.Y(553648127, 0, 0);
    public final Paint f16011t = new Paint(1);
    public final Paint f16012u = new Paint(1);
    public final Path v = new Path();
    public final RectF f16013w = new RectF();

    public static CharSequence d() {
        if (f15994y == null) {
            f15994y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f15994y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            mq mqVar = new mq(R.drawable.filled_widget_music, 0);
            mqVar.setSize(AndroidUtilities.dp(16.0f));
            mqVar.spaceScaleX = 1.0f;
            mqVar.translate(-AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            ((SpannableStringBuilder) f15994y[0]).setSpan(mqVar, 0, 1, 33);
        }
        return f15994y[0];
    }

    public final void a(Canvas canvas, float f10) {
        float f11;
        Typeface bold;
        String str = "";
        if (this.f16005n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f16002k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f15999g;
            if (document != null) {
                f11 = 12.0f;
            } else {
                f11 = 14.0f;
            }
            if (document != null) {
                bold = null;
            } else {
                bold = AndroidUtilities.bold();
            }
            this.f16005n = new k01(spannableStringBuilder, f11, bold);
        }
        if (this.f16006o == null || this.f16004m) {
            String str2 = this.f16003l;
            if (str2 != null) {
                str = str2;
            }
            this.f16006o = new k01(str, 14.0f, null);
        }
        float e = this.h.e(this.f15998f);
        Paint paint = this.f16011t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f10, Math.max(this.f16005n.f26084c, this.f16006o.f26084c) + AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(18.0f), e));
        this.f16014x = min;
        int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(22.0f), e);
        float f12 = min;
        RectF rectF = this.f16013w;
        rectF.set(0.0f, 0.0f, f12, lerp);
        canvas.save();
        float a2 = this.f16000i.a(0.02f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), e);
        canvas.drawRoundRect(rectF, lerp2, lerp2, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, lerp2, lerp2, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = this.f16001j;
        zVar.setBounds(0, 0, min, lerp);
        zVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(42.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(42.0f));
        Paint paint2 = this.f16012u;
        paint2.setColor(-1);
        float f13 = 1.0f - e;
        paint2.setAlpha((int) (255.0f * f13));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
        canvas.restore();
        int dp = min - AndroidUtilities.dp(20.0f);
        if (f12 < f10) {
            dp = (int) Math.min(AndroidUtilities.dp(12.0f) + dp, f10 - AndroidUtilities.dp(20.0f));
        }
        k01 k01Var = this.f16005n;
        float f14 = dp;
        k01Var.f26094p = f14;
        k01Var.c(AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f), e), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(11.0f), e), 1.0f, -1, canvas);
        k01 k01Var2 = this.f16006o;
        k01Var2.f26094p = f14;
        k01Var2.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), f13, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f10;
        if (this.f15998f) {
            f10 = 22.0f;
        } else {
            f10 = 42.0f;
        }
        return AndroidUtilities.dp(f10);
    }

    public final void c() {
        if (!this.f16007p && !this.f16008q && this.f15996b != null && this.f15997c != null && this.f16009r != null) {
            this.f16008q = true;
            MessagesController.getInstance(this.f15995a).getStoriesController().d0(this.f15996b.longValue(), this.f15997c.intValue(), new mg.i(this, 3));
        }
    }

    public final void e(float f10, float f11, boolean z4) {
        this.f16000i.c(z4);
        int[] iArr = z4 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.z zVar = this.f16001j;
        zVar.setState(iArr);
        if (z4) {
            zVar.setHotspot(f10, f11);
        }
    }
}

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
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.rc;
public final class v7 {
    public static CharSequence[] f15974y;
    public int f15975a;
    public Long f15976b;
    public Integer f15977c;
    public Integer d;
    public boolean e;
    public TLRPC.Document f15979g;
    public SpannableStringBuilder f15982k;
    public String f15983l;
    public boolean f15984m;
    public k01 f15985n;
    public k01 f15986o;
    public boolean f15987p;
    public boolean f15988q;
    public View f15989r;
    public Runnable f15990s;
    public int f15994x;
    public boolean f15978f = true;
    public final org.telegram.ui.Components.z5 h = new org.telegram.ui.Components.z5(0, 350, mr.h);
    public final rc f15980i = new rc((View) null);
    public final org.telegram.ui.Cells.z f15981j = org.telegram.ui.ActionBar.j6.Y(553648127, 0, 0);
    public final Paint f15991t = new Paint(1);
    public final Paint f15992u = new Paint(1);
    public final Path v = new Path();
    public final RectF f15993w = new RectF();

    public static CharSequence d() {
        if (f15974y == null) {
            f15974y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f15974y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            lq lqVar = new lq(R.drawable.filled_widget_music, 0);
            lqVar.setSize(AndroidUtilities.dp(16.0f));
            lqVar.spaceScaleX = 1.0f;
            lqVar.translate(-AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            ((SpannableStringBuilder) f15974y[0]).setSpan(lqVar, 0, 1, 33);
        }
        return f15974y[0];
    }

    public final void a(Canvas canvas, float f10) {
        float f11;
        Typeface bold;
        String str = "";
        if (this.f15985n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f15982k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f15979g;
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
            this.f15985n = new k01(spannableStringBuilder, f11, bold);
        }
        if (this.f15986o == null || this.f15984m) {
            String str2 = this.f15983l;
            if (str2 != null) {
                str = str2;
            }
            this.f15986o = new k01(str, 14.0f, null);
        }
        float e = this.h.e(this.f15978f);
        Paint paint = this.f15991t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f10, Math.max(this.f15985n.f26124c, this.f15986o.f26124c) + AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(18.0f), e));
        this.f15994x = min;
        int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(22.0f), e);
        float f12 = min;
        RectF rectF = this.f15993w;
        rectF.set(0.0f, 0.0f, f12, lerp);
        canvas.save();
        float a2 = this.f15980i.a(0.02f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), e);
        canvas.drawRoundRect(rectF, lerp2, lerp2, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, lerp2, lerp2, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = this.f15981j;
        zVar.setBounds(0, 0, min, lerp);
        zVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(42.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(42.0f));
        Paint paint2 = this.f15992u;
        paint2.setColor(-1);
        float f13 = 1.0f - e;
        paint2.setAlpha((int) (255.0f * f13));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
        canvas.restore();
        int dp = min - AndroidUtilities.dp(20.0f);
        if (f12 < f10) {
            dp = (int) Math.min(AndroidUtilities.dp(12.0f) + dp, f10 - AndroidUtilities.dp(20.0f));
        }
        k01 k01Var = this.f15985n;
        float f14 = dp;
        k01Var.f26134p = f14;
        k01Var.c(AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f), e), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(11.0f), e), 1.0f, -1, canvas);
        k01 k01Var2 = this.f15986o;
        k01Var2.f26134p = f14;
        k01Var2.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), f13, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f10;
        if (this.f15978f) {
            f10 = 22.0f;
        } else {
            f10 = 42.0f;
        }
        return AndroidUtilities.dp(f10);
    }

    public final void c() {
        if (!this.f15987p && !this.f15988q && this.f15976b != null && this.f15977c != null && this.f15989r != null) {
            this.f15988q = true;
            MessagesController.getInstance(this.f15975a).getStoriesController().d0(this.f15976b.longValue(), this.f15977c.intValue(), new mg.i(this, 3));
        }
    }

    public final void e(float f10, float f11, boolean z4) {
        this.f15980i.c(z4);
        int[] iArr = z4 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.z zVar = this.f15981j;
        zVar.setState(iArr);
        if (z4) {
            zVar.setHotspot(f10, f11);
        }
    }
}

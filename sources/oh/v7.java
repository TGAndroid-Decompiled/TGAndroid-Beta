package oh;

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
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;
public final class v7 {
    public static CharSequence[] f17858y;
    public int f17859a;
    public Long f17860b;
    public Integer f17861c;
    public Integer d;
    public boolean f17862e;
    public TLRPC.Document f17864g;
    public SpannableStringBuilder f17867k;
    public String f17868l;
    public boolean f17869m;
    public k01 f17870n;
    public k01 f17871o;
    public boolean f17872p;
    public boolean f17873q;
    public View f17874r;
    public Runnable f17875s;
    public int f17879x;
    public boolean f17863f = true;
    public final org.telegram.ui.Components.z5 h = new org.telegram.ui.Components.z5(0, 350, pr.h);
    public final rc f17865i = new rc((View) null);
    public final org.telegram.ui.Cells.z f17866j = org.telegram.ui.ActionBar.k6.Y(553648127, 0, 0);
    public final Paint f17876t = new Paint(1);
    public final Paint f17877u = new Paint(1);
    public final Path v = new Path();
    public final RectF f17878w = new RectF();

    public static CharSequence d() {
        if (f17858y == null) {
            f17858y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f17858y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            oq oqVar = new oq(R.drawable.filled_widget_music, 0);
            oqVar.setSize(AndroidUtilities.dp(16.0f));
            oqVar.spaceScaleX = 1.0f;
            oqVar.translate(-AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            ((SpannableStringBuilder) f17858y[0]).setSpan(oqVar, 0, 1, 33);
        }
        return f17858y[0];
    }

    public final void a(Canvas canvas, float f10) {
        float f11;
        Typeface bold;
        String str = "";
        if (this.f17870n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f17867k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f17864g;
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
            this.f17870n = new k01(spannableStringBuilder, f11, bold);
        }
        if (this.f17871o == null || this.f17869m) {
            String str2 = this.f17868l;
            if (str2 != null) {
                str = str2;
            }
            this.f17871o = new k01(str, 14.0f, null);
        }
        float e6 = this.h.e(this.f17863f);
        Paint paint = this.f17876t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f10, Math.max(this.f17870n.f28227c, this.f17871o.f28227c) + AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(18.0f), e6));
        this.f17879x = min;
        int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(22.0f), e6);
        float f12 = min;
        RectF rectF = this.f17878w;
        rectF.set(0.0f, 0.0f, f12, lerp);
        canvas.save();
        float a2 = this.f17865i.a(0.02f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), e6);
        canvas.drawRoundRect(rectF, lerp2, lerp2, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, lerp2, lerp2, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = this.f17866j;
        zVar.setBounds(0, 0, min, lerp);
        zVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(42.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(42.0f));
        Paint paint2 = this.f17877u;
        paint2.setColor(-1);
        float f13 = 1.0f - e6;
        paint2.setAlpha((int) (255.0f * f13));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
        canvas.restore();
        int dp = min - AndroidUtilities.dp(20.0f);
        if (f12 < f10) {
            dp = (int) Math.min(AndroidUtilities.dp(12.0f) + dp, f10 - AndroidUtilities.dp(20.0f));
        }
        k01 k01Var = this.f17870n;
        float f14 = dp;
        k01Var.f28238p = f14;
        k01Var.c(AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f), e6), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(11.0f), e6), 1.0f, -1, canvas);
        k01 k01Var2 = this.f17871o;
        k01Var2.f28238p = f14;
        k01Var2.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), f13, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f10;
        if (this.f17863f) {
            f10 = 22.0f;
        } else {
            f10 = 42.0f;
        }
        return AndroidUtilities.dp(f10);
    }

    public final void c() {
        if (!this.f17872p && !this.f17873q && this.f17860b != null && this.f17861c != null && this.f17874r != null) {
            this.f17873q = true;
            MessagesController.getInstance(this.f17859a).getStoriesController().d0(this.f17860b.longValue(), this.f17861c.intValue(), new ng.i(this, 3));
        }
    }

    public final void e(float f10, float f11, boolean z4) {
        this.f17865i.c(z4);
        int[] iArr = z4 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.z zVar = this.f17866j;
        zVar.setState(iArr);
        if (z4) {
            zVar.setHotspot(f10, f11);
        }
    }
}

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
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;
public final class v7 {
    public static CharSequence[] f17856y;
    public int f17857a;
    public Long f17858b;
    public Integer f17859c;
    public Integer d;
    public boolean f17860e;
    public TLRPC.Document f17862g;
    public SpannableStringBuilder f17865k;
    public String f17866l;
    public boolean f17867m;
    public l01 f17868n;
    public l01 f17869o;
    public boolean f17870p;
    public boolean f17871q;
    public View f17872r;
    public Runnable f17873s;
    public int f17877x;
    public boolean f17861f = true;
    public final org.telegram.ui.Components.z5 h = new org.telegram.ui.Components.z5(0, 350, pr.h);
    public final rc f17863i = new rc((View) null);
    public final org.telegram.ui.Cells.z f17864j = org.telegram.ui.ActionBar.k6.Y(553648127, 0, 0);
    public final Paint f17874t = new Paint(1);
    public final Paint f17875u = new Paint(1);
    public final Path v = new Path();
    public final RectF f17876w = new RectF();

    public static CharSequence d() {
        if (f17856y == null) {
            f17856y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f17856y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            oq oqVar = new oq(R.drawable.filled_widget_music, 0);
            oqVar.setSize(AndroidUtilities.dp(16.0f));
            oqVar.spaceScaleX = 1.0f;
            oqVar.translate(-AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            ((SpannableStringBuilder) f17856y[0]).setSpan(oqVar, 0, 1, 33);
        }
        return f17856y[0];
    }

    public final void a(Canvas canvas, float f10) {
        float f11;
        Typeface bold;
        String str = "";
        if (this.f17868n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f17865k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f17862g;
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
            this.f17868n = new l01(spannableStringBuilder, f11, bold);
        }
        if (this.f17869o == null || this.f17867m) {
            String str2 = this.f17866l;
            if (str2 != null) {
                str = str2;
            }
            this.f17869o = new l01(str, 14.0f, null);
        }
        float e6 = this.h.e(this.f17861f);
        Paint paint = this.f17874t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f10, Math.max(this.f17868n.f28521c, this.f17869o.f28521c) + AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(18.0f), e6));
        this.f17877x = min;
        int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(22.0f), e6);
        float f12 = min;
        RectF rectF = this.f17876w;
        rectF.set(0.0f, 0.0f, f12, lerp);
        canvas.save();
        float a2 = this.f17863i.a(0.02f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), e6);
        canvas.drawRoundRect(rectF, lerp2, lerp2, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, lerp2, lerp2, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = this.f17864j;
        zVar.setBounds(0, 0, min, lerp);
        zVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(42.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(42.0f));
        Paint paint2 = this.f17875u;
        paint2.setColor(-1);
        float f13 = 1.0f - e6;
        paint2.setAlpha((int) (255.0f * f13));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
        canvas.restore();
        int dp = min - AndroidUtilities.dp(20.0f);
        if (f12 < f10) {
            dp = (int) Math.min(AndroidUtilities.dp(12.0f) + dp, f10 - AndroidUtilities.dp(20.0f));
        }
        l01 l01Var = this.f17868n;
        float f14 = dp;
        l01Var.f28532p = f14;
        l01Var.c(AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f), e6), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(11.0f), e6), 1.0f, -1, canvas);
        l01 l01Var2 = this.f17869o;
        l01Var2.f28532p = f14;
        l01Var2.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), f13, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f10;
        if (this.f17861f) {
            f10 = 22.0f;
        } else {
            f10 = 42.0f;
        }
        return AndroidUtilities.dp(f10);
    }

    public final void c() {
        if (!this.f17870p && !this.f17871q && this.f17858b != null && this.f17859c != null && this.f17872r != null) {
            this.f17871q = true;
            MessagesController.getInstance(this.f17857a).getStoriesController().d0(this.f17858b.longValue(), this.f17859c.intValue(), new ng.i(this, 3));
        }
    }

    public final void e(float f10, float f11, boolean z4) {
        this.f17863i.c(z4);
        int[] iArr = z4 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.z zVar = this.f17864j;
        zVar.setState(iArr);
        if (z4) {
            zVar.setHotspot(f10, f11);
        }
    }
}

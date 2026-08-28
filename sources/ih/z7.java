package ih;

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
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.pc;
public final class z7 {
    public static CharSequence[] f12380y;
    public int f12381a;
    public Long f12382b;
    public Integer f12383c;
    public Integer d;
    public boolean f12384e;
    public TLRPC.Document f12386g;
    public SpannableStringBuilder f12389k;
    public String f12390l;
    public boolean f12391m;
    public nz0 f12392n;
    public nz0 f12393o;
    public boolean f12394p;
    public boolean f12395q;
    public View f12396r;
    public Runnable f12397s;
    public int f12401x;
    public boolean f12385f = true;
    public final org.telegram.ui.Components.y5 h = new org.telegram.ui.Components.y5(0, 350, gr.h);
    public final pc f12387i = new pc((View) null);
    public final org.telegram.ui.Cells.z f12388j = org.telegram.ui.ActionBar.f6.Y(553648127, 0, 0);
    public final Paint f12398t = new Paint(1);
    public final Paint f12399u = new Paint(1);
    public final Path v = new Path();
    public final RectF f12400w = new RectF();

    public static CharSequence d() {
        if (f12380y == null) {
            f12380y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f12380y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            eq eqVar = new eq(R.drawable.filled_widget_music, 0);
            eqVar.setSize(AndroidUtilities.dp(16.0f));
            eqVar.spaceScaleX = 1.0f;
            eqVar.translate(-AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            ((SpannableStringBuilder) f12380y[0]).setSpan(eqVar, 0, 1, 33);
        }
        return f12380y[0];
    }

    public final void a(Canvas canvas, float f10) {
        float f11;
        Typeface bold;
        String str = "";
        if (this.f12392n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f12389k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f12386g;
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
            this.f12392n = new nz0(spannableStringBuilder, f11, bold);
        }
        if (this.f12393o == null || this.f12391m) {
            String str2 = this.f12390l;
            if (str2 != null) {
                str = str2;
            }
            this.f12393o = new nz0(str, 14.0f, null);
        }
        float e10 = this.h.e(this.f12385f);
        Paint paint = this.f12398t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f10, Math.max(this.f12392n.f31223c, this.f12393o.f31223c) + AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(18.0f), e10));
        this.f12401x = min;
        int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(22.0f), e10);
        float f12 = min;
        RectF rectF = this.f12400w;
        rectF.set(0.0f, 0.0f, f12, lerp);
        canvas.save();
        float a2 = this.f12387i.a(0.02f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), e10);
        canvas.drawRoundRect(rectF, lerp2, lerp2, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, lerp2, lerp2, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = this.f12388j;
        zVar.setBounds(0, 0, min, lerp);
        zVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(42.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(42.0f));
        Paint paint2 = this.f12399u;
        paint2.setColor(-1);
        float f13 = 1.0f - e10;
        paint2.setAlpha((int) (255.0f * f13));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
        canvas.restore();
        int dp = min - AndroidUtilities.dp(20.0f);
        if (f12 < f10) {
            dp = (int) Math.min(AndroidUtilities.dp(12.0f) + dp, f10 - AndroidUtilities.dp(20.0f));
        }
        nz0 nz0Var = this.f12392n;
        float f14 = dp;
        nz0Var.f31234p = f14;
        nz0Var.c(AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f), e10), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(11.0f), e10), 1.0f, -1, canvas);
        nz0 nz0Var2 = this.f12393o;
        nz0Var2.f31234p = f14;
        nz0Var2.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), f13, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f10;
        if (this.f12385f) {
            f10 = 22.0f;
        } else {
            f10 = 42.0f;
        }
        return AndroidUtilities.dp(f10);
    }

    public final void c() {
        if (!this.f12394p && !this.f12395q && this.f12382b != null && this.f12383c != null && this.f12396r != null) {
            this.f12395q = true;
            MessagesController.getInstance(this.f12381a).getStoriesController().d0(this.f12382b.longValue(), this.f12383c.intValue(), new hg.i(this, 3));
        }
    }

    public final void e(float f10, float f11, boolean z10) {
        this.f12387i.c(z10);
        int[] iArr = z10 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.z zVar = this.f12388j;
        zVar.setState(iArr);
        if (z10) {
            zVar.setHotspot(f10, f11);
        }
    }
}

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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.h11;
public final class ca {
    public static CharSequence[] f2914y;
    public int f2915a;
    public Long f2916b;
    public Integer f2917c;
    public Integer d;
    public boolean e;
    public TLRPC.Document f2919g;
    public SpannableStringBuilder f2922k;
    public String f2923l;
    public boolean f2924m;
    public h11 f2925n;
    public h11 f2926o;
    public boolean f2927p;
    public boolean f2928q;
    public View f2929r;
    public Runnable f2930s;
    public int f2934x;
    public boolean f2918f = true;
    public final org.telegram.ui.Components.g6 h = new org.telegram.ui.Components.g6(0, 350, es.h);
    public final ad f2920i = new ad((View) null);
    public final org.telegram.ui.Cells.z f2921j = org.telegram.ui.ActionBar.g6.Z(553648127, 0, 0);
    public final Paint f2931t = new Paint(1);
    public final Paint f2932u = new Paint(1);
    public final Path v = new Path();
    public final RectF f2933w = new RectF();

    public static CharSequence d() {
        if (f2914y == null) {
            f2914y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f2914y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            br brVar = new br(R.drawable.filled_widget_music, 0);
            brVar.setSize(AndroidUtilities.dp(16.0f));
            brVar.spaceScaleX = 1.0f;
            brVar.translate(-AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            ((SpannableStringBuilder) f2914y[0]).setSpan(brVar, 0, 1, 33);
        }
        return f2914y[0];
    }

    public final void a(Canvas canvas, float f7) {
        float f10;
        Typeface bold;
        String str = "";
        if (this.f2925n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f2922k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f2919g;
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
            this.f2925n = new h11(spannableStringBuilder, f10, bold);
        }
        if (this.f2926o == null || this.f2924m) {
            String str2 = this.f2923l;
            if (str2 != null) {
                str = str2;
            }
            this.f2926o = new h11(str, 14.0f, null);
        }
        float e = this.h.e(this.f2918f);
        Paint paint = this.f2931t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f7, Math.max(this.f2925n.f25473c, this.f2926o.f25473c) + AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(18.0f), e));
        this.f2934x = min;
        int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(22.0f), e);
        float f11 = min;
        RectF rectF = this.f2933w;
        rectF.set(0.0f, 0.0f, f11, lerp);
        canvas.save();
        float a2 = this.f2920i.a(0.02f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), e);
        canvas.drawRoundRect(rectF, lerp2, lerp2, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, lerp2, lerp2, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = this.f2921j;
        zVar.setBounds(0, 0, min, lerp);
        zVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(42.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(42.0f));
        Paint paint2 = this.f2932u;
        paint2.setColor(-1);
        float f12 = 1.0f - e;
        paint2.setAlpha((int) (255.0f * f12));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
        canvas.restore();
        int dp = min - AndroidUtilities.dp(20.0f);
        if (f11 < f7) {
            dp = (int) Math.min(AndroidUtilities.dp(12.0f) + dp, f7 - AndroidUtilities.dp(20.0f));
        }
        h11 h11Var = this.f2925n;
        float f13 = dp;
        h11Var.f25483p = f13;
        h11Var.c(AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f), e), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(11.0f), e), 1.0f, -1, canvas);
        h11 h11Var2 = this.f2926o;
        h11Var2.f25483p = f13;
        h11Var2.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), f12, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f7;
        if (this.f2918f) {
            f7 = 22.0f;
        } else {
            f7 = 42.0f;
        }
        return AndroidUtilities.dp(f7);
    }

    public final void c() {
        if (!this.f2927p && !this.f2928q && this.f2916b != null && this.f2917c != null && this.f2929r != null) {
            this.f2928q = true;
            MessagesController.getInstance(this.f2915a).getStoriesController().d0(this.f2916b.longValue(), this.f2917c.intValue(), new o1(this, 3));
        }
    }

    public final void e(float f7, float f10, boolean z10) {
        this.f2920i.c(z10);
        int[] iArr = z10 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.z zVar = this.f2921j;
        zVar.setState(iArr);
        if (z10) {
            zVar.setHotspot(f7, f10);
        }
    }
}

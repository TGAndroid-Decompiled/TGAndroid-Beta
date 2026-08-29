package lh;

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
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.zz0;
public final class v7 {
    public static CharSequence[] f16322y;
    public int f16323a;
    public Long f16324b;
    public Integer f16325c;
    public Integer d;
    public boolean f16326e;
    public TLRPC.Document f16328g;
    public SpannableStringBuilder f16331k;
    public String f16332l;
    public boolean f16333m;
    public zz0 f16334n;
    public zz0 f16335o;
    public boolean f16336p;
    public boolean f16337q;
    public View f16338r;
    public Runnable f16339s;
    public int f16343x;
    public boolean f16327f = true;
    public final org.telegram.ui.Components.d6 h = new org.telegram.ui.Components.d6(0, 350, jr.h);
    public final uc f16329i = new uc((View) null);
    public final org.telegram.ui.Cells.z f16330j = org.telegram.ui.ActionBar.g6.Y(553648127, 0, 0);
    public final Paint f16340t = new Paint(1);
    public final Paint f16341u = new Paint(1);
    public final Path v = new Path();
    public final RectF f16342w = new RectF();

    public static CharSequence d() {
        if (f16322y == null) {
            f16322y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f16322y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            iq iqVar = new iq(R.drawable.filled_widget_music, 0);
            iqVar.setSize(AndroidUtilities.dp(16.0f));
            iqVar.spaceScaleX = 1.0f;
            iqVar.translate(-AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            ((SpannableStringBuilder) f16322y[0]).setSpan(iqVar, 0, 1, 33);
        }
        return f16322y[0];
    }

    public final void a(Canvas canvas, float f9) {
        float f10;
        Typeface bold;
        String str = "";
        if (this.f16334n == null) {
            SpannableStringBuilder spannableStringBuilder = this.f16331k;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = "";
            }
            TLRPC.Document document = this.f16328g;
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
            this.f16334n = new zz0(spannableStringBuilder, f10, bold);
        }
        if (this.f16335o == null || this.f16333m) {
            String str2 = this.f16332l;
            if (str2 != null) {
                str = str2;
            }
            this.f16335o = new zz0(str, 14.0f, null);
        }
        float e10 = this.h.e(this.f16327f);
        Paint paint = this.f16340t;
        paint.setColor(1073741824);
        int min = (int) Math.min(f9, Math.max(this.f16334n.f35462c, this.f16335o.f35462c) + AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(18.0f), e10));
        this.f16343x = min;
        int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(22.0f), e10);
        float f11 = min;
        RectF rectF = this.f16342w;
        rectF.set(0.0f, 0.0f, f11, lerp);
        canvas.save();
        float a2 = this.f16329i.a(0.02f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), e10);
        canvas.drawRoundRect(rectF, lerp2, lerp2, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, lerp2, lerp2, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = this.f16330j;
        zVar.setBounds(0, 0, min, lerp);
        zVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(42.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(42.0f));
        Paint paint2 = this.f16341u;
        paint2.setColor(-1);
        float f12 = 1.0f - e10;
        paint2.setAlpha((int) (255.0f * f12));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
        canvas.restore();
        int dp = min - AndroidUtilities.dp(20.0f);
        if (f11 < f9) {
            dp = (int) Math.min(AndroidUtilities.dp(12.0f) + dp, f9 - AndroidUtilities.dp(20.0f));
        }
        zz0 zz0Var = this.f16334n;
        float f13 = dp;
        zz0Var.f35473p = f13;
        zz0Var.c(AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f), e10), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(11.0f), e10), 1.0f, -1, canvas);
        zz0 zz0Var2 = this.f16335o;
        zz0Var2.f35473p = f13;
        zz0Var2.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), f12, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        float f9;
        if (this.f16327f) {
            f9 = 22.0f;
        } else {
            f9 = 42.0f;
        }
        return AndroidUtilities.dp(f9);
    }

    public final void c() {
        if (!this.f16336p && !this.f16337q && this.f16324b != null && this.f16325c != null && this.f16338r != null) {
            this.f16337q = true;
            MessagesController.getInstance(this.f16323a).getStoriesController().d0(this.f16324b.longValue(), this.f16325c.intValue(), new kg.i(this, 3));
        }
    }

    public final void e(float f9, float f10, boolean z10) {
        this.f16329i.c(z10);
        int[] iArr = z10 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.z zVar = this.f16330j;
        zVar.setState(iArr);
        if (z10) {
            zVar.setHotspot(f9, f10);
        }
    }
}

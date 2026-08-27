package jh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.pz0;

public final class v7 {

    public static CharSequence[] f14057y;

    public int f14058a;

    public Long f14059b;

    public Integer f14060c;
    public Integer d;

    public boolean f14061e;

    public TLRPC.Document f14063g;

    public SpannableStringBuilder f14066k;

    public String f14067l;

    public boolean f14068m;

    public pz0 f14069n;

    public pz0 f14070o;

    public boolean f14071p;

    public boolean f14072q;

    public View f14073r;

    public Runnable f14074s;

    public int f14078x;

    public boolean f14062f = true;
    public final org.telegram.ui.Components.y5 h = new org.telegram.ui.Components.y5(0, 350, er.h);

    public final nc f14064i = new nc((View) null);

    public final org.telegram.ui.Cells.z f14065j = org.telegram.ui.ActionBar.g6.Y(553648127, 0, 0);

    public final Paint f14075t = new Paint(1);

    public final Paint f14076u = new Paint(1);
    public final Path v = new Path();

    public final RectF f14077w = new RectF();

    public static CharSequence d() {
        if (f14057y == null) {
            f14057y = new CharSequence[2];
        }
        CharSequence[] charSequenceArr = f14057y;
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            cq cqVar = new cq(R.drawable.filled_widget_music, 0);
            cqVar.setSize(AndroidUtilities.dp(16.0f));
            cqVar.spaceScaleX = 1.0f;
            cqVar.translate(-AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            ((SpannableStringBuilder) f14057y[0]).setSpan(cqVar, 0, 1, 33);
        }
        return f14057y[0];
    }

    public final void a(Canvas canvas, float f10) {
        if (this.f14069n == null) {
            CharSequence charSequence = this.f14066k;
            if (charSequence == null) {
                charSequence = "";
            }
            TLRPC.Document document = this.f14063g;
            this.f14069n = new pz0(charSequence, document != null ? 12.0f : 14.0f, document != null ? null : AndroidUtilities.bold());
        }
        if (this.f14070o == null || this.f14068m) {
            String str = this.f14067l;
            this.f14070o = new pz0(str != null ? str : "", 14.0f, null);
        }
        float fE = this.h.e(this.f14062f);
        Paint paint = this.f14075t;
        paint.setColor(1073741824);
        int iMin = (int) Math.min(f10, Math.max(this.f14069n.f31697c, this.f14070o.f31697c) + AndroidUtilities.lerp(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(18.0f), fE));
        this.f14078x = iMin;
        int iLerp = AndroidUtilities.lerp(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(22.0f), fE);
        float f11 = iMin;
        RectF rectF = this.f14077w;
        rectF.set(0.0f, 0.0f, f11, iLerp);
        canvas.save();
        float fA = this.f14064i.a(0.02f);
        canvas.scale(fA, fA, rectF.centerX(), rectF.centerY());
        float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), fE);
        canvas.drawRoundRect(rectF, fLerp, fLerp, paint);
        canvas.save();
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, fLerp, fLerp, Path.Direction.CW);
        canvas.clipPath(path);
        org.telegram.ui.Cells.z zVar = this.f14065j;
        zVar.setBounds(0, 0, iMin, iLerp);
        zVar.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(0, 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(42.0f));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(42.0f));
        Paint paint2 = this.f14076u;
        paint2.setColor(-1);
        float f12 = 1.0f - fE;
        paint2.setAlpha((int) (255.0f * f12));
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), paint2);
        canvas.restore();
        int iDp = iMin - AndroidUtilities.dp(20.0f);
        if (f11 < f10) {
            iDp = (int) Math.min(AndroidUtilities.dp(12.0f) + iDp, f10 - AndroidUtilities.dp(20.0f));
        }
        pz0 pz0Var = this.f14069n;
        float f13 = iDp;
        pz0Var.f31708p = f13;
        pz0Var.c(AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f), fE), AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(11.0f), fE), 1.0f, -1, canvas);
        pz0 pz0Var2 = this.f14070o;
        pz0Var2.f31708p = f13;
        pz0Var2.c(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(30.0f), f12, -1, canvas);
        canvas.restore();
    }

    public final int b() {
        return AndroidUtilities.dp(this.f14062f ? 22.0f : 42.0f);
    }

    public final void c() {
        if (this.f14071p || this.f14072q || this.f14059b == null || this.f14060c == null || this.f14073r == null) {
            return;
        }
        this.f14072q = true;
        MessagesController.getInstance(this.f14058a).getStoriesController().d0(this.f14059b.longValue(), this.f14060c.intValue(), new ig.i(this, 3));
    }

    public final void e(float f10, float f11, boolean z10) {
        this.f14064i.c(z10);
        int[] iArr = z10 ? new int[]{16842919, 16842910} : new int[0];
        org.telegram.ui.Cells.z zVar = this.f14065j;
        zVar.setState(iArr);
        if (z10) {
            zVar.setHotspot(f10, f11);
        }
    }
}

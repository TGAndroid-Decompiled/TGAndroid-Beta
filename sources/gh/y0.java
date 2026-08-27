package gh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.y8;

public final class y0 extends Drawable {

    public NinePatchDrawable f7634a;

    public NinePatchDrawable f7635b;

    public final TextPaint f7636c;
    public final ImageReceiver d;

    public final y8 f7637e;

    public final int f7638f;

    public final int f7639g;
    public final float h;

    public final float f7640i;

    public final int f7641j;

    public final int f7642k;

    public boolean f7643l;

    public CharSequence f7644m;

    public StaticLayout f7645n;

    public float f7646o;

    public float f7647p;

    public org.telegram.ui.Components.p5 f7648q;

    public View f7649r;

    public int f7650s;

    public int f7651t;

    public int f7652u;

    public y0() {
        TextPaint textPaint = new TextPaint(1);
        this.f7636c = textPaint;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.d = imageReceiver;
        this.f7637e = new y8((org.telegram.ui.ActionBar.c6) null);
        int iDp = AndroidUtilities.dp(10.66f);
        this.f7638f = iDp * 2;
        this.f7639g = AndroidUtilities.dp(4.0f);
        this.h = AndroidUtilities.dpf2(15.33f);
        this.f7640i = AndroidUtilities.dpf2(7.33f);
        this.f7641j = AndroidUtilities.dp(8.0f);
        this.f7642k = (int) AndroidUtilities.dpf2(22.66f);
        er erVar = er.f28122f;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setColor(-1);
        imageReceiver.setRoundRadius(iDp);
    }

    public final void a() {
        if (this.f7634a == null) {
            Drawable drawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.gift_message_bubble_24);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            int i10 = (intrinsicHeight * 4) / 144;
            this.f7634a = h7.l6.a(bitmapCreateBitmap, new Rect((intrinsicWidth * 27) / 168, i10, (intrinsicWidth * 5) / 168, i10), (intrinsicWidth * 94) / 168, (intrinsicHeight * 71) / 144);
        }
        if (this.f7635b == null) {
            Drawable drawable2 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.gift_message_bubble_border_24);
            int intrinsicWidth2 = drawable2.getIntrinsicWidth();
            int intrinsicHeight2 = drawable2.getIntrinsicHeight();
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(intrinsicWidth2, intrinsicHeight2, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawable2.setBounds(0, 0, intrinsicWidth2, intrinsicHeight2);
            drawable2.draw(canvas2);
            Paint paint = new Paint(1);
            float f10 = intrinsicWidth2;
            float f11 = intrinsicHeight2;
            paint.setShader(new LinearGradient(f10, 0.0f, 0.0f, f11, new int[]{1090519039, -805306369, 1090519039}, (float[]) null, Shader.TileMode.CLAMP));
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
            canvas2.drawRect(0.0f, 0.0f, f10, f11, paint);
            int i11 = (intrinsicHeight2 * 4) / 144;
            this.f7635b = h7.l6.a(bitmapCreateBitmap2, new Rect((intrinsicWidth2 * 27) / 168, i11, (intrinsicWidth2 * 5) / 168, i11), (intrinsicWidth2 * 94) / 168, (intrinsicHeight2 * 71) / 144);
        }
    }

    public final void b(int i10) {
        int iCeil;
        a();
        if (i10 != this.f7650s || this.f7645n == null) {
            this.f7650s = i10;
            int i11 = !this.f7643l ? 0 : this.f7639g + this.f7638f;
            int i12 = this.f7641j;
            int i13 = i11 + i12;
            int i14 = (i10 - i13) - i12;
            int i15 = this.f7642k;
            if (i14 <= 0 || TextUtils.isEmpty(this.f7644m)) {
                this.f7645n = null;
                this.f7651t = i15;
                this.f7652u = i15;
                return;
            }
            CharSequence charSequence = this.f7644m;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.f7636c;
            StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i14, alignment, 1.0f, 0.0f, false);
            int lineCount = staticLayout.getLineCount();
            float fMax = 0.0f;
            float fMax2 = 0.0f;
            for (int i16 = 0; i16 < lineCount; i16++) {
                fMax2 = Math.max(fMax2, staticLayout.getLineWidth(i16));
            }
            if (lineCount > 1 && (iCeil = (int) Math.ceil(fMax2)) < i14) {
                StaticLayout staticLayout2 = new StaticLayout(this.f7644m, textPaint, iCeil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                if (staticLayout2.getLineCount() == lineCount) {
                    for (int i17 = 0; i17 < staticLayout2.getLineCount(); i17++) {
                        fMax = Math.max(fMax, staticLayout2.getLineWidth(i17));
                    }
                    fMax2 = fMax;
                    staticLayout = staticLayout2;
                }
            }
            this.f7645n = staticLayout;
            this.f7646o = i13;
            this.f7651t = ((int) Math.ceil(fMax2)) + i13 + i12;
            int lineCount2 = this.f7645n.getLineCount() - 1;
            float lineBaseline = this.f7645n.getLineBaseline(0);
            float lineBaseline2 = this.f7645n.getLineBaseline(lineCount2) - lineBaseline;
            float f10 = this.h;
            this.f7652u = Math.max(i15, (int) Math.ceil(lineBaseline2 + f10 + this.f7640i));
            this.f7647p = f10 - lineBaseline;
        }
    }

    public final void c(TLObject tLObject) {
        boolean z10 = tLObject != null;
        this.f7643l = z10;
        if (z10) {
            y8 y8Var = this.f7637e;
            y8Var.p(tLObject);
            boolean z11 = tLObject instanceof TLRPC.User;
            ImageReceiver imageReceiver = this.d;
            if (z11) {
                imageReceiver.setImage(ImageLocation.getForUser((TLRPC.User) tLObject, 1), "48_48", y8Var, null, null, 0);
            } else if (tLObject instanceof TLRPC.Chat) {
                imageReceiver.setImage(ImageLocation.getForChat((TLRPC.Chat) tLObject, 1), "48_48", y8Var, null, null, 0);
            } else {
                imageReceiver.setImageBitmap(y8Var);
            }
        }
        this.f7650s = -1;
    }

    @Override
    public final void draw(Canvas canvas) {
        a();
        Rect bounds = getBounds();
        canvas.save();
        boolean z10 = this.f7643l;
        float f10 = z10 ? 1.0f : 0.0f;
        NinePatchDrawable ninePatchDrawable = this.f7634a;
        int i10 = bounds.left;
        int i11 = this.f7639g;
        int i12 = this.f7638f;
        gf.s.g(ninePatchDrawable, i10 + (z10 ? i11 + i12 : 0), bounds.top, bounds.right, bounds.bottom);
        this.f7634a.draw(canvas);
        gf.s.g(this.f7635b, bounds.left + (this.f7643l ? i11 + i12 : 0), bounds.top, bounds.right, bounds.bottom);
        this.f7635b.draw(canvas);
        if (this.f7645n != null) {
            canvas.save();
            canvas.translate(bounds.left + this.f7646o, bounds.top + this.f7647p);
            this.f7645n.draw(canvas);
            View view = this.f7649r;
            if (view != null && (this.f7644m instanceof Spanned)) {
                org.telegram.ui.Components.p5 p5VarUpdate = org.telegram.ui.Components.t5.update(0, view, false, this.f7648q, this.f7645n);
                this.f7648q = p5VarUpdate;
                org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.f7645n, p5VarUpdate, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, null);
            }
            canvas.restore();
        }
        if (f10 > 0.0f) {
            int i13 = bounds.left;
            float f11 = bounds.bottom - i12;
            float f12 = i12;
            ImageReceiver imageReceiver = this.d;
            imageReceiver.setImageCoords(i13, f11, f12, f12);
            canvas.save();
            canvas.scale(f10, f10, imageReceiver.getCenterX(), imageReceiver.getCenterY());
            imageReceiver.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final int getMinimumHeight() {
        return this.f7652u;
    }

    @Override
    public final int getMinimumWidth() {
        return this.f7651t;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

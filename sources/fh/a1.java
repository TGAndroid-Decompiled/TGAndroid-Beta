package fh;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.z8;
public final class a1 extends Drawable {
    public NinePatchDrawable f6331a;
    public NinePatchDrawable f6332b;
    public final TextPaint f6333c;
    public final ImageReceiver d;
    public final z8 f6334e;
    public final int f6335f;
    public final int f6336g;
    public final float h;
    public final float f6337i;
    public final int f6338j;
    public final int f6339k;
    public boolean f6340l;
    public CharSequence f6341m;
    public StaticLayout f6342n;
    public float f6343o;
    public float f6344p;
    public org.telegram.ui.Components.p5 f6345q;
    public View f6346r;
    public int f6347s;
    public int f6348t;
    public int f6349u;

    public a1() {
        TextPaint textPaint = new TextPaint(1);
        this.f6333c = textPaint;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.d = imageReceiver;
        this.f6334e = new z8((org.telegram.ui.ActionBar.b6) null);
        int dp = AndroidUtilities.dp(10.66f);
        this.f6335f = dp * 2;
        this.f6336g = AndroidUtilities.dp(4.0f);
        this.h = AndroidUtilities.dpf2(15.33f);
        this.f6337i = AndroidUtilities.dpf2(7.33f);
        this.f6338j = AndroidUtilities.dp(8.0f);
        this.f6339k = (int) AndroidUtilities.dpf2(22.66f);
        gr grVar = gr.f28844f;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setColor(-1);
        imageReceiver.setRoundRadius(dp);
    }

    public final void a() {
        if (this.f6331a == null) {
            Drawable drawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.gift_message_bubble_24);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            int i9 = (intrinsicHeight * 4) / 144;
            this.f6331a = g7.z5.a(createBitmap, new Rect((intrinsicWidth * 27) / 168, i9, (intrinsicWidth * 5) / 168, i9), (intrinsicWidth * 94) / 168, (intrinsicHeight * 71) / 144);
        }
        if (this.f6332b == null) {
            Drawable drawable2 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.gift_message_bubble_border_24);
            int intrinsicWidth2 = drawable2.getIntrinsicWidth();
            int intrinsicHeight2 = drawable2.getIntrinsicHeight();
            Bitmap createBitmap2 = Bitmap.createBitmap(intrinsicWidth2, intrinsicHeight2, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            drawable2.setBounds(0, 0, intrinsicWidth2, intrinsicHeight2);
            drawable2.draw(canvas2);
            Paint paint = new Paint(1);
            float f10 = intrinsicWidth2;
            float f11 = intrinsicHeight2;
            paint.setShader(new LinearGradient(f10, 0.0f, 0.0f, f11, new int[]{1090519039, -805306369, 1090519039}, (float[]) null, Shader.TileMode.CLAMP));
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
            canvas2.drawRect(0.0f, 0.0f, f10, f11, paint);
            int i10 = (intrinsicHeight2 * 4) / 144;
            this.f6332b = g7.z5.a(createBitmap2, new Rect((intrinsicWidth2 * 27) / 168, i10, (intrinsicWidth2 * 5) / 168, i10), (intrinsicWidth2 * 94) / 168, (intrinsicHeight2 * 71) / 144);
        }
    }

    public final void b(int i9) {
        int i10;
        int ceil;
        a();
        if (i9 == this.f6347s && this.f6342n != null) {
            return;
        }
        this.f6347s = i9;
        if (!this.f6340l) {
            i10 = 0;
        } else {
            i10 = this.f6336g + this.f6335f;
        }
        int i11 = this.f6338j;
        int i12 = i10 + i11;
        int i13 = (i9 - i12) - i11;
        int i14 = this.f6339k;
        if (i13 > 0 && !TextUtils.isEmpty(this.f6341m)) {
            CharSequence charSequence = this.f6341m;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.f6333c;
            StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i13, alignment, 1.0f, 0.0f, false);
            int lineCount = staticLayout.getLineCount();
            float f10 = 0.0f;
            float f11 = 0.0f;
            for (int i15 = 0; i15 < lineCount; i15++) {
                f11 = Math.max(f11, staticLayout.getLineWidth(i15));
            }
            if (lineCount > 1 && (ceil = (int) Math.ceil(f11)) < i13) {
                StaticLayout staticLayout2 = new StaticLayout(this.f6341m, textPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                if (staticLayout2.getLineCount() == lineCount) {
                    for (int i16 = 0; i16 < staticLayout2.getLineCount(); i16++) {
                        f10 = Math.max(f10, staticLayout2.getLineWidth(i16));
                    }
                    f11 = f10;
                    staticLayout = staticLayout2;
                }
            }
            this.f6342n = staticLayout;
            this.f6343o = i12;
            this.f6348t = ((int) Math.ceil(f11)) + i12 + i11;
            float lineBaseline = this.f6342n.getLineBaseline(0);
            StaticLayout staticLayout3 = this.f6342n;
            float f12 = this.h;
            this.f6349u = Math.max(i14, (int) Math.ceil((staticLayout3.getLineBaseline(this.f6342n.getLineCount() - 1) - lineBaseline) + f12 + this.f6337i));
            this.f6344p = f12 - lineBaseline;
            return;
        }
        this.f6342n = null;
        this.f6348t = i14;
        this.f6349u = i14;
    }

    public final void c(TLObject tLObject) {
        boolean z10;
        if (tLObject != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f6340l = z10;
        if (z10) {
            z8 z8Var = this.f6334e;
            z8Var.p(tLObject);
            boolean z11 = tLObject instanceof TLRPC.User;
            ImageReceiver imageReceiver = this.d;
            if (z11) {
                imageReceiver.setImage(ImageLocation.getForUser((TLRPC.User) tLObject, 1), "48_48", z8Var, null, null, 0);
            } else if (tLObject instanceof TLRPC.Chat) {
                imageReceiver.setImage(ImageLocation.getForChat((TLRPC.Chat) tLObject, 1), "48_48", z8Var, null, null, 0);
            } else {
                imageReceiver.setImageBitmap(z8Var);
            }
        }
        this.f6347s = -1;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        int i9;
        int i10;
        a();
        Rect bounds = getBounds();
        canvas.save();
        boolean z10 = this.f6340l;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        NinePatchDrawable ninePatchDrawable = this.f6331a;
        int i11 = bounds.left;
        int i12 = this.f6336g;
        int i13 = this.f6335f;
        if (z10) {
            i9 = i12 + i13;
        } else {
            i9 = 0;
        }
        ff.s.g(ninePatchDrawable, i11 + i9, bounds.top, bounds.right, bounds.bottom);
        this.f6331a.draw(canvas);
        NinePatchDrawable ninePatchDrawable2 = this.f6332b;
        int i14 = bounds.left;
        if (this.f6340l) {
            i10 = i12 + i13;
        } else {
            i10 = 0;
        }
        ff.s.g(ninePatchDrawable2, i14 + i10, bounds.top, bounds.right, bounds.bottom);
        this.f6332b.draw(canvas);
        if (this.f6342n != null) {
            canvas.save();
            canvas.translate(bounds.left + this.f6343o, bounds.top + this.f6344p);
            this.f6342n.draw(canvas);
            View view = this.f6346r;
            if (view != null && (this.f6341m instanceof Spanned)) {
                org.telegram.ui.Components.p5 update = org.telegram.ui.Components.t5.update(0, view, false, this.f6345q, this.f6342n);
                this.f6345q = update;
                org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.f6342n, update, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, null);
            }
            canvas.restore();
        }
        if (f10 > 0.0f) {
            int i15 = bounds.left;
            float f11 = i13;
            ImageReceiver imageReceiver = this.d;
            imageReceiver.setImageCoords(i15, bounds.bottom - i13, f11, f11);
            canvas.save();
            canvas.scale(f10, f10, imageReceiver.getCenterX(), imageReceiver.getCenterY());
            imageReceiver.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final int getMinimumHeight() {
        return this.f6349u;
    }

    @Override
    public final int getMinimumWidth() {
        return this.f6348t;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i9) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

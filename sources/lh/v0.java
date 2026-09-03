package lh;

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
import k7.c8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.z8;
public final class v0 extends Drawable {
    public NinePatchDrawable f13028a;
    public NinePatchDrawable f13029b;
    public final TextPaint f13030c;
    public final ImageReceiver d;
    public final z8 f13031e;
    public final int f13032f;
    public final int f13033g;
    public final float h;
    public final float f13034i;
    public final int f13035j;
    public final int f13036k;
    public boolean f13037l;
    public CharSequence f13038m;
    public StaticLayout f13039n;
    public float f13040o;
    public float f13041p;
    public org.telegram.ui.Components.q5 f13042q;
    public View f13043r;
    public int f13044s;
    public int f13045t;
    public int f13046u;

    public v0() {
        TextPaint textPaint = new TextPaint(1);
        this.f13030c = textPaint;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.d = imageReceiver;
        this.f13031e = new z8((g6) null);
        int dp = AndroidUtilities.dp(10.66f);
        this.f13032f = dp * 2;
        this.f13033g = AndroidUtilities.dp(4.0f);
        this.h = AndroidUtilities.dpf2(15.33f);
        this.f13034i = AndroidUtilities.dpf2(7.33f);
        this.f13035j = AndroidUtilities.dp(8.0f);
        this.f13036k = (int) AndroidUtilities.dpf2(22.66f);
        pr prVar = pr.f30168f;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setColor(-1);
        imageReceiver.setRoundRadius(dp);
    }

    public final void a() {
        if (this.f13028a == null) {
            Drawable drawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.gift_message_bubble_24);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            int i10 = (intrinsicHeight * 4) / 144;
            this.f13028a = c8.a(createBitmap, new Rect((intrinsicWidth * 27) / 168, i10, (intrinsicWidth * 5) / 168, i10), (intrinsicWidth * 94) / 168, (intrinsicHeight * 71) / 144);
        }
        if (this.f13029b == null) {
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
            int i11 = (intrinsicHeight2 * 4) / 144;
            this.f13029b = c8.a(createBitmap2, new Rect((intrinsicWidth2 * 27) / 168, i11, (intrinsicWidth2 * 5) / 168, i11), (intrinsicWidth2 * 94) / 168, (intrinsicHeight2 * 71) / 144);
        }
    }

    public final void b(int i10) {
        int i11;
        int ceil;
        a();
        if (i10 == this.f13044s && this.f13039n != null) {
            return;
        }
        this.f13044s = i10;
        if (!this.f13037l) {
            i11 = 0;
        } else {
            i11 = this.f13033g + this.f13032f;
        }
        int i12 = this.f13035j;
        int i13 = i11 + i12;
        int i14 = (i10 - i13) - i12;
        int i15 = this.f13036k;
        if (i14 > 0 && !TextUtils.isEmpty(this.f13038m)) {
            CharSequence charSequence = this.f13038m;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.f13030c;
            StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i14, alignment, 1.0f, 0.0f, false);
            int lineCount = staticLayout.getLineCount();
            float f10 = 0.0f;
            float f11 = 0.0f;
            for (int i16 = 0; i16 < lineCount; i16++) {
                f11 = Math.max(f11, staticLayout.getLineWidth(i16));
            }
            if (lineCount > 1 && (ceil = (int) Math.ceil(f11)) < i14) {
                StaticLayout staticLayout2 = new StaticLayout(this.f13038m, textPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                if (staticLayout2.getLineCount() == lineCount) {
                    for (int i17 = 0; i17 < staticLayout2.getLineCount(); i17++) {
                        f10 = Math.max(f10, staticLayout2.getLineWidth(i17));
                    }
                    f11 = f10;
                    staticLayout = staticLayout2;
                }
            }
            this.f13039n = staticLayout;
            this.f13040o = i13;
            this.f13045t = ((int) Math.ceil(f11)) + i13 + i12;
            float lineBaseline = this.f13039n.getLineBaseline(0);
            StaticLayout staticLayout3 = this.f13039n;
            float f12 = this.h;
            this.f13046u = Math.max(i15, (int) Math.ceil((staticLayout3.getLineBaseline(this.f13039n.getLineCount() - 1) - lineBaseline) + f12 + this.f13034i));
            this.f13041p = f12 - lineBaseline;
            return;
        }
        this.f13039n = null;
        this.f13045t = i15;
        this.f13046u = i15;
    }

    public final void c(TLObject tLObject) {
        boolean z4;
        if (tLObject != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f13037l = z4;
        if (z4) {
            z8 z8Var = this.f13031e;
            z8Var.p(tLObject);
            boolean z10 = tLObject instanceof TLRPC.User;
            ImageReceiver imageReceiver = this.d;
            if (z10) {
                imageReceiver.setImage(ImageLocation.getForUser((TLRPC.User) tLObject, 1), "48_48", z8Var, null, null, 0);
            } else if (tLObject instanceof TLRPC.Chat) {
                imageReceiver.setImage(ImageLocation.getForChat((TLRPC.Chat) tLObject, 1), "48_48", z8Var, null, null, 0);
            } else {
                imageReceiver.setImageBitmap(z8Var);
            }
        }
        this.f13044s = -1;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        int i10;
        int i11;
        a();
        Rect bounds = getBounds();
        canvas.save();
        boolean z4 = this.f13037l;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        NinePatchDrawable ninePatchDrawable = this.f13028a;
        int i12 = bounds.left;
        int i13 = this.f13033g;
        int i14 = this.f13032f;
        if (z4) {
            i10 = i13 + i14;
        } else {
            i10 = 0;
        }
        lf.r.g(ninePatchDrawable, i12 + i10, bounds.top, bounds.right, bounds.bottom);
        this.f13028a.draw(canvas);
        NinePatchDrawable ninePatchDrawable2 = this.f13029b;
        int i15 = bounds.left;
        if (this.f13037l) {
            i11 = i13 + i14;
        } else {
            i11 = 0;
        }
        lf.r.g(ninePatchDrawable2, i15 + i11, bounds.top, bounds.right, bounds.bottom);
        this.f13029b.draw(canvas);
        if (this.f13039n != null) {
            canvas.save();
            canvas.translate(bounds.left + this.f13040o, bounds.top + this.f13041p);
            this.f13039n.draw(canvas);
            View view = this.f13043r;
            if (view != null && (this.f13038m instanceof Spanned)) {
                org.telegram.ui.Components.q5 update = org.telegram.ui.Components.u5.update(0, view, false, this.f13042q, this.f13039n);
                this.f13042q = update;
                org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, this.f13039n, update, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, null);
            }
            canvas.restore();
        }
        if (f10 > 0.0f) {
            int i16 = bounds.left;
            ImageReceiver imageReceiver = this.d;
            imageReceiver.setImageCoords(i16, bounds.bottom - i14, i14, i14);
            canvas.save();
            canvas.scale(f10, f10, imageReceiver.getCenterX(), imageReceiver.getCenterY());
            imageReceiver.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final int getMinimumHeight() {
        return this.f13046u;
    }

    @Override
    public final int getMinimumWidth() {
        return this.f13045t;
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

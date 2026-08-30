package kh;

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
import k7.t7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.z8;
public final class v0 extends Drawable {
    public NinePatchDrawable f10874a;
    public NinePatchDrawable f10875b;
    public final TextPaint f10876c;
    public final ImageReceiver d;
    public final z8 e;
    public final int f10877f;
    public final int f10878g;
    public final float h;
    public final float f10879i;
    public final int f10880j;
    public final int f10881k;
    public boolean f10882l;
    public CharSequence f10883m;
    public StaticLayout f10884n;
    public float f10885o;
    public float f10886p;
    public org.telegram.ui.Components.q5 f10887q;
    public View f10888r;
    public int f10889s;
    public int f10890t;
    public int f10891u;

    public v0() {
        TextPaint textPaint = new TextPaint(1);
        this.f10876c = textPaint;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.d = imageReceiver;
        this.e = new z8((org.telegram.ui.ActionBar.f6) null);
        int dp = AndroidUtilities.dp(10.66f);
        this.f10877f = dp * 2;
        this.f10878g = AndroidUtilities.dp(4.0f);
        this.h = AndroidUtilities.dpf2(15.33f);
        this.f10879i = AndroidUtilities.dpf2(7.33f);
        this.f10880j = AndroidUtilities.dp(8.0f);
        this.f10881k = (int) AndroidUtilities.dpf2(22.66f);
        nr nrVar = nr.f27346f;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setColor(-1);
        imageReceiver.setRoundRadius(dp);
    }

    public final void a() {
        if (this.f10874a == null) {
            Drawable drawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.gift_message_bubble_24);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            int i10 = (intrinsicHeight * 4) / 144;
            this.f10874a = t7.a(createBitmap, new Rect((intrinsicWidth * 27) / 168, i10, (intrinsicWidth * 5) / 168, i10), (intrinsicWidth * 94) / 168, (intrinsicHeight * 71) / 144);
        }
        if (this.f10875b == null) {
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
            this.f10875b = t7.a(createBitmap2, new Rect((intrinsicWidth2 * 27) / 168, i11, (intrinsicWidth2 * 5) / 168, i11), (intrinsicWidth2 * 94) / 168, (intrinsicHeight2 * 71) / 144);
        }
    }

    public final void b(int i10) {
        int i11;
        int ceil;
        a();
        if (i10 == this.f10889s && this.f10884n != null) {
            return;
        }
        this.f10889s = i10;
        if (!this.f10882l) {
            i11 = 0;
        } else {
            i11 = this.f10878g + this.f10877f;
        }
        int i12 = this.f10880j;
        int i13 = i11 + i12;
        int i14 = (i10 - i13) - i12;
        int i15 = this.f10881k;
        if (i14 > 0 && !TextUtils.isEmpty(this.f10883m)) {
            CharSequence charSequence = this.f10883m;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.f10876c;
            StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i14, alignment, 1.0f, 0.0f, false);
            int lineCount = staticLayout.getLineCount();
            float f10 = 0.0f;
            float f11 = 0.0f;
            for (int i16 = 0; i16 < lineCount; i16++) {
                f11 = Math.max(f11, staticLayout.getLineWidth(i16));
            }
            if (lineCount > 1 && (ceil = (int) Math.ceil(f11)) < i14) {
                StaticLayout staticLayout2 = new StaticLayout(this.f10883m, textPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                if (staticLayout2.getLineCount() == lineCount) {
                    for (int i17 = 0; i17 < staticLayout2.getLineCount(); i17++) {
                        f10 = Math.max(f10, staticLayout2.getLineWidth(i17));
                    }
                    f11 = f10;
                    staticLayout = staticLayout2;
                }
            }
            this.f10884n = staticLayout;
            this.f10885o = i13;
            this.f10890t = ((int) Math.ceil(f11)) + i13 + i12;
            float lineBaseline = this.f10884n.getLineBaseline(0);
            StaticLayout staticLayout3 = this.f10884n;
            float f12 = this.h;
            this.f10891u = Math.max(i15, (int) Math.ceil((staticLayout3.getLineBaseline(this.f10884n.getLineCount() - 1) - lineBaseline) + f12 + this.f10879i));
            this.f10886p = f12 - lineBaseline;
            return;
        }
        this.f10884n = null;
        this.f10890t = i15;
        this.f10891u = i15;
    }

    public final void c(TLObject tLObject) {
        boolean z4;
        if (tLObject != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f10882l = z4;
        if (z4) {
            z8 z8Var = this.e;
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
        this.f10889s = -1;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        int i10;
        int i11;
        a();
        Rect bounds = getBounds();
        canvas.save();
        boolean z4 = this.f10882l;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        NinePatchDrawable ninePatchDrawable = this.f10874a;
        int i12 = bounds.left;
        int i13 = this.f10878g;
        int i14 = this.f10877f;
        if (z4) {
            i10 = i13 + i14;
        } else {
            i10 = 0;
        }
        lf.r.g(ninePatchDrawable, i12 + i10, bounds.top, bounds.right, bounds.bottom);
        this.f10874a.draw(canvas);
        NinePatchDrawable ninePatchDrawable2 = this.f10875b;
        int i15 = bounds.left;
        if (this.f10882l) {
            i11 = i13 + i14;
        } else {
            i11 = 0;
        }
        lf.r.g(ninePatchDrawable2, i15 + i11, bounds.top, bounds.right, bounds.bottom);
        this.f10875b.draw(canvas);
        if (this.f10884n != null) {
            canvas.save();
            canvas.translate(bounds.left + this.f10885o, bounds.top + this.f10886p);
            this.f10884n.draw(canvas);
            View view = this.f10888r;
            if (view != null && (this.f10883m instanceof Spanned)) {
                org.telegram.ui.Components.q5 update = org.telegram.ui.Components.u5.update(0, view, false, this.f10887q, this.f10884n);
                this.f10887q = update;
                org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, this.f10884n, update, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, null);
            }
            canvas.restore();
        }
        if (f10 > 0.0f) {
            int i16 = bounds.left;
            float f11 = i14;
            ImageReceiver imageReceiver = this.d;
            imageReceiver.setImageCoords(i16, bounds.bottom - i14, f11, f11);
            canvas.save();
            canvas.scale(f10, f10, imageReceiver.getCenterX(), imageReceiver.getCenterY());
            imageReceiver.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final int getMinimumHeight() {
        return this.f10891u;
    }

    @Override
    public final int getMinimumWidth() {
        return this.f10890t;
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

package ih;

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
import i7.n7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.jr;
public final class w0 extends Drawable {
    public NinePatchDrawable f9465a;
    public NinePatchDrawable f9466b;
    public final TextPaint f9467c;
    public final ImageReceiver d;
    public final e9 f9468e;
    public final int f9469f;
    public final int f9470g;
    public final float h;
    public final float f9471i;
    public final int f9472j;
    public final int f9473k;
    public boolean f9474l;
    public CharSequence f9475m;
    public StaticLayout f9476n;
    public float f9477o;
    public float f9478p;
    public org.telegram.ui.Components.u5 f9479q;
    public View f9480r;
    public int f9481s;
    public int f9482t;
    public int f9483u;

    public w0() {
        TextPaint textPaint = new TextPaint(1);
        this.f9467c = textPaint;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.d = imageReceiver;
        this.f9468e = new e9((org.telegram.ui.ActionBar.c6) null);
        int dp = AndroidUtilities.dp(10.66f);
        this.f9469f = dp * 2;
        this.f9470g = AndroidUtilities.dp(4.0f);
        this.h = AndroidUtilities.dpf2(15.33f);
        this.f9471i = AndroidUtilities.dpf2(7.33f);
        this.f9472j = AndroidUtilities.dp(8.0f);
        this.f9473k = (int) AndroidUtilities.dpf2(22.66f);
        jr jrVar = jr.f29800f;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setColor(-1);
        imageReceiver.setRoundRadius(dp);
    }

    public final void a() {
        if (this.f9465a == null) {
            Drawable drawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.gift_message_bubble_24);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            int i10 = (intrinsicHeight * 4) / 144;
            this.f9465a = n7.a(createBitmap, new Rect((intrinsicWidth * 27) / 168, i10, (intrinsicWidth * 5) / 168, i10), (intrinsicWidth * 94) / 168, (intrinsicHeight * 71) / 144);
        }
        if (this.f9466b == null) {
            Drawable drawable2 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.gift_message_bubble_border_24);
            int intrinsicWidth2 = drawable2.getIntrinsicWidth();
            int intrinsicHeight2 = drawable2.getIntrinsicHeight();
            Bitmap createBitmap2 = Bitmap.createBitmap(intrinsicWidth2, intrinsicHeight2, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            drawable2.setBounds(0, 0, intrinsicWidth2, intrinsicHeight2);
            drawable2.draw(canvas2);
            Paint paint = new Paint(1);
            float f9 = intrinsicWidth2;
            float f10 = intrinsicHeight2;
            paint.setShader(new LinearGradient(f9, 0.0f, 0.0f, f10, new int[]{1090519039, -805306369, 1090519039}, (float[]) null, Shader.TileMode.CLAMP));
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
            canvas2.drawRect(0.0f, 0.0f, f9, f10, paint);
            int i11 = (intrinsicHeight2 * 4) / 144;
            this.f9466b = n7.a(createBitmap2, new Rect((intrinsicWidth2 * 27) / 168, i11, (intrinsicWidth2 * 5) / 168, i11), (intrinsicWidth2 * 94) / 168, (intrinsicHeight2 * 71) / 144);
        }
    }

    public final void b(int i10) {
        int i11;
        int ceil;
        a();
        if (i10 == this.f9481s && this.f9476n != null) {
            return;
        }
        this.f9481s = i10;
        if (!this.f9474l) {
            i11 = 0;
        } else {
            i11 = this.f9470g + this.f9469f;
        }
        int i12 = this.f9472j;
        int i13 = i11 + i12;
        int i14 = (i10 - i13) - i12;
        int i15 = this.f9473k;
        if (i14 > 0 && !TextUtils.isEmpty(this.f9475m)) {
            CharSequence charSequence = this.f9475m;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.f9467c;
            StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i14, alignment, 1.0f, 0.0f, false);
            int lineCount = staticLayout.getLineCount();
            float f9 = 0.0f;
            float f10 = 0.0f;
            for (int i16 = 0; i16 < lineCount; i16++) {
                f10 = Math.max(f10, staticLayout.getLineWidth(i16));
            }
            if (lineCount > 1 && (ceil = (int) Math.ceil(f10)) < i14) {
                StaticLayout staticLayout2 = new StaticLayout(this.f9475m, textPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                if (staticLayout2.getLineCount() == lineCount) {
                    for (int i17 = 0; i17 < staticLayout2.getLineCount(); i17++) {
                        f9 = Math.max(f9, staticLayout2.getLineWidth(i17));
                    }
                    f10 = f9;
                    staticLayout = staticLayout2;
                }
            }
            this.f9476n = staticLayout;
            this.f9477o = i13;
            this.f9482t = ((int) Math.ceil(f10)) + i13 + i12;
            float lineBaseline = this.f9476n.getLineBaseline(0);
            StaticLayout staticLayout3 = this.f9476n;
            float f11 = this.h;
            this.f9483u = Math.max(i15, (int) Math.ceil((staticLayout3.getLineBaseline(this.f9476n.getLineCount() - 1) - lineBaseline) + f11 + this.f9471i));
            this.f9478p = f11 - lineBaseline;
            return;
        }
        this.f9476n = null;
        this.f9482t = i15;
        this.f9483u = i15;
    }

    public final void c(TLObject tLObject) {
        boolean z10;
        if (tLObject != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9474l = z10;
        if (z10) {
            e9 e9Var = this.f9468e;
            e9Var.p(tLObject);
            boolean z11 = tLObject instanceof TLRPC.User;
            ImageReceiver imageReceiver = this.d;
            if (z11) {
                imageReceiver.setImage(ImageLocation.getForUser((TLRPC.User) tLObject, 1), "48_48", e9Var, null, null, 0);
            } else if (tLObject instanceof TLRPC.Chat) {
                imageReceiver.setImage(ImageLocation.getForChat((TLRPC.Chat) tLObject, 1), "48_48", e9Var, null, null, 0);
            } else {
                imageReceiver.setImageBitmap(e9Var);
            }
        }
        this.f9481s = -1;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f9;
        int i10;
        int i11;
        a();
        Rect bounds = getBounds();
        canvas.save();
        boolean z10 = this.f9474l;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        NinePatchDrawable ninePatchDrawable = this.f9465a;
        int i12 = bounds.left;
        int i13 = this.f9470g;
        int i14 = this.f9469f;
        if (z10) {
            i10 = i13 + i14;
        } else {
            i10 = 0;
        }
        jf.r.g(ninePatchDrawable, i12 + i10, bounds.top, bounds.right, bounds.bottom);
        this.f9465a.draw(canvas);
        NinePatchDrawable ninePatchDrawable2 = this.f9466b;
        int i15 = bounds.left;
        if (this.f9474l) {
            i11 = i13 + i14;
        } else {
            i11 = 0;
        }
        jf.r.g(ninePatchDrawable2, i15 + i11, bounds.top, bounds.right, bounds.bottom);
        this.f9466b.draw(canvas);
        if (this.f9476n != null) {
            canvas.save();
            canvas.translate(bounds.left + this.f9477o, bounds.top + this.f9478p);
            this.f9476n.draw(canvas);
            View view = this.f9480r;
            if (view != null && (this.f9475m instanceof Spanned)) {
                org.telegram.ui.Components.u5 update = org.telegram.ui.Components.y5.update(0, view, false, this.f9479q, this.f9476n);
                this.f9479q = update;
                org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, this.f9476n, update, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, null);
            }
            canvas.restore();
        }
        if (f9 > 0.0f) {
            int i16 = bounds.left;
            float f10 = i14;
            ImageReceiver imageReceiver = this.d;
            imageReceiver.setImageCoords(i16, bounds.bottom - i14, f10, f10);
            canvas.save();
            canvas.scale(f9, f9, imageReceiver.getCenterX(), imageReceiver.getCenterY());
            imageReceiver.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final int getMinimumHeight() {
        return this.f9483u;
    }

    @Override
    public final int getMinimumWidth() {
        return this.f9482t;
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

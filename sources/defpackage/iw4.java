package defpackage;

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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class iw4 extends Drawable {
    public NinePatchDrawable a;
    public NinePatchDrawable b;
    public final TextPaint c;
    public final ImageReceiver d;
    public final rb0 e;
    public final int f;
    public final int g;
    public final float h;
    public final float i;
    public final int j;
    public final int k;
    public boolean l;
    public CharSequence m;
    public StaticLayout n;
    public float o;
    public float p;
    public dm q;
    public View r;
    public int s;
    public int t;
    public int u;

    public iw4() {
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.d = imageReceiver;
        this.e = new rb0((vnb) null);
        int L = hl.L(10.66f);
        this.f = L << 1;
        this.g = hl.L(4.0f);
        this.h = hl.N(15.33f);
        this.i = hl.N(7.33f);
        this.j = hl.L(8.0f);
        this.k = (int) hl.N(22.66f);
        k43 k43Var = k43.f;
        textPaint.setTextSize(hl.L(12.0f));
        textPaint.setColor(-1);
        imageReceiver.q0(L);
    }

    public final void a() {
        if (this.a == null) {
            Drawable drawable = a.b.getResources().getDrawable(2131231220);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            int i = (intrinsicHeight << 2) / 144;
            this.a = jue.a(createBitmap, new Rect((intrinsicWidth * 27) / 168, i, (intrinsicWidth * 5) / 168, i), (intrinsicWidth * 94) / 168, (intrinsicHeight * 71) / 144);
        }
        if (this.b == null) {
            Drawable drawable2 = a.b.getResources().getDrawable(2131231221);
            int intrinsicWidth2 = drawable2.getIntrinsicWidth();
            int intrinsicHeight2 = drawable2.getIntrinsicHeight();
            Bitmap createBitmap2 = Bitmap.createBitmap(intrinsicWidth2, intrinsicHeight2, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            drawable2.setBounds(0, 0, intrinsicWidth2, intrinsicHeight2);
            drawable2.draw(canvas2);
            Paint paint = new Paint(1);
            float f = intrinsicWidth2;
            float f2 = intrinsicHeight2;
            paint.setShader(new LinearGradient(f, 0.0f, 0.0f, f2, new int[]{1090519039, -805306369, 1090519039}, (float[]) null, Shader.TileMode.CLAMP));
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
            canvas2.drawRect(0.0f, 0.0f, f, f2, paint);
            int i2 = (intrinsicHeight2 << 2) / 144;
            this.b = jue.a(createBitmap2, new Rect((intrinsicWidth2 * 27) / 168, i2, (intrinsicWidth2 * 5) / 168, i2), (intrinsicWidth2 * 94) / 168, (intrinsicHeight2 * 71) / 144);
        }
    }

    public final void b(int i) {
        int i2;
        int ceil;
        a();
        if (i == this.s && this.n != null) {
            return;
        }
        this.s = i;
        if (!this.l) {
            i2 = 0;
        } else {
            i2 = this.g + this.f;
        }
        int i3 = this.j;
        int i4 = i2 + i3;
        int i5 = (i - i4) - i3;
        int i6 = this.k;
        if (i5 > 0 && !TextUtils.isEmpty(this.m)) {
            CharSequence charSequence = this.m;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.c;
            StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i5, alignment, 1.0f, 0.0f, false);
            int lineCount = staticLayout.getLineCount();
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i7 = 0; i7 < lineCount; i7++) {
                f2 = Math.max(f2, staticLayout.getLineWidth(i7));
            }
            if (lineCount > 1 && (ceil = (int) Math.ceil(f2)) < i5) {
                StaticLayout staticLayout2 = new StaticLayout(this.m, textPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                if (staticLayout2.getLineCount() == lineCount) {
                    for (int i8 = 0; i8 < staticLayout2.getLineCount(); i8++) {
                        f = Math.max(f, staticLayout2.getLineWidth(i8));
                    }
                    f2 = f;
                    staticLayout = staticLayout2;
                }
            }
            this.n = staticLayout;
            this.o = i4;
            this.t = ((int) Math.ceil(f2)) + i4 + i3;
            float lineBaseline = this.n.getLineBaseline(0);
            StaticLayout staticLayout3 = this.n;
            float f3 = this.h;
            this.u = Math.max(i6, (int) Math.ceil((staticLayout3.getLineBaseline(this.n.getLineCount() - 1) - lineBaseline) + f3 + this.i));
            this.p = f3 - lineBaseline;
            return;
        }
        this.n = null;
        this.t = i6;
        this.u = i6;
    }

    public final void c(TLObject tLObject) {
        boolean z;
        if (tLObject != null) {
            z = true;
        } else {
            z = false;
        }
        this.l = z;
        if (z) {
            rb0 rb0Var = this.e;
            rb0Var.k(tLObject);
            boolean z2 = tLObject instanceof TLRPC.User;
            ImageReceiver imageReceiver = this.d;
            if (z2) {
                imageReceiver.d0(jn5.l(yac.t0, 1, (TLRPC.User) tLObject), "48_48", rb0Var, null, null, 0);
            } else if (tLObject instanceof TLRPC.Chat) {
                imageReceiver.d0(jn5.a(1, (TLRPC.Chat) tLObject), "48_48", rb0Var, null, null, 0);
            } else {
                imageReceiver.g0(rb0Var);
            }
        }
        this.s = -1;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f;
        int i;
        int i2;
        a();
        Rect bounds = getBounds();
        canvas.save();
        boolean z = this.l;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        NinePatchDrawable ninePatchDrawable = this.a;
        int i3 = bounds.left;
        int i4 = this.g;
        int i5 = this.f;
        if (z) {
            i = i4 + i5;
        } else {
            i = 0;
        }
        br3.g(ninePatchDrawable, i3 + i, bounds.top, bounds.right, bounds.bottom);
        this.a.draw(canvas);
        NinePatchDrawable ninePatchDrawable2 = this.b;
        int i6 = bounds.left;
        if (this.l) {
            i2 = i4 + i5;
        } else {
            i2 = 0;
        }
        br3.g(ninePatchDrawable2, i6 + i2, bounds.top, bounds.right, bounds.bottom);
        this.b.draw(canvas);
        if (this.n != null) {
            canvas.save();
            canvas.translate(bounds.left + this.o, bounds.top + this.p);
            this.n.draw(canvas);
            View view = this.r;
            if (view != null && (this.m instanceof Spanned)) {
                dm update = hm.update(0, view, false, this.q, this.n);
                this.q = update;
                hm.drawAnimatedEmojis(canvas, this.n, update, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, null);
            }
            canvas.restore();
        }
        if (f > 0.0f) {
            int i7 = bounds.left;
            float f2 = i5;
            ImageReceiver imageReceiver = this.d;
            imageReceiver.i0(i7, bounds.bottom - i5, f2, f2);
            canvas.save();
            canvas.scale(f, f, imageReceiver.r(), imageReceiver.s());
            imageReceiver.h(canvas, null);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final int getMinimumHeight() {
        return this.u;
    }

    @Override
    public final int getMinimumWidth() {
        return this.t;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

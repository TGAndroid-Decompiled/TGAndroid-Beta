package bi;

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
import org.telegram.messenger.gc;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.t8;
public final class g1 extends Drawable {
    public NinePatchDrawable f3525a;
    public NinePatchDrawable f3526b;
    public final TextPaint f3527c;
    public final ImageReceiver d;
    public final t8 f3528e;
    public final int f3529f;
    public final int f3530g;
    public final float h;
    public final float f3531i;
    public final int f3532j;
    public final int f3533k;
    public boolean f3534l;
    public CharSequence f3535m;
    public StaticLayout f3536n;
    public float f3537o;
    public float f3538p;
    public org.telegram.ui.Components.l5 f3539q;
    public View f3540r;
    public int f3541s;
    public int f3542t;
    public int f3543u;

    public g1() {
        TextPaint textPaint = new TextPaint(1);
        this.f3527c = textPaint;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.d = imageReceiver;
        this.f3528e = new t8((org.telegram.ui.ActionBar.e6) null);
        int L = org.telegram.messenger.g0.L(10.66f);
        this.f3529f = L * 2;
        this.f3530g = org.telegram.messenger.g0.L(4.0f);
        this.h = org.telegram.messenger.g0.N(15.33f);
        this.f3531i = org.telegram.messenger.g0.N(7.33f);
        this.f3532j = org.telegram.messenger.g0.L(8.0f);
        this.f3533k = (int) org.telegram.messenger.g0.N(22.66f);
        er erVar = er.f34420f;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setColor(-1);
        imageReceiver.J0(L);
    }

    public final void a() {
        if (this.f3525a == null) {
            Drawable drawable = org.telegram.messenger.t0.f26600b.getResources().getDrawable(2131231217);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            int i7 = (intrinsicHeight * 4) / 144;
            this.f3525a = c8.o0.a(createBitmap, new Rect((intrinsicWidth * 27) / 168, i7, (intrinsicWidth * 5) / 168, i7), (intrinsicWidth * 94) / 168, (intrinsicHeight * 71) / 144);
        }
        if (this.f3526b == null) {
            Drawable drawable2 = org.telegram.messenger.t0.f26600b.getResources().getDrawable(2131231218);
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
            this.f3526b = c8.o0.a(createBitmap2, new Rect((intrinsicWidth2 * 27) / 168, i10, (intrinsicWidth2 * 5) / 168, i10), (intrinsicWidth2 * 94) / 168, (intrinsicHeight2 * 71) / 144);
        }
    }

    public final void b(int i7) {
        int i10;
        int ceil;
        a();
        if (i7 == this.f3541s && this.f3536n != null) {
            return;
        }
        this.f3541s = i7;
        if (!this.f3534l) {
            i10 = 0;
        } else {
            i10 = this.f3530g + this.f3529f;
        }
        int i11 = this.f3532j;
        int i12 = i10 + i11;
        int i13 = (i7 - i12) - i11;
        int i14 = this.f3533k;
        if (i13 > 0 && !TextUtils.isEmpty(this.f3535m)) {
            CharSequence charSequence = this.f3535m;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.f3527c;
            StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i13, alignment, 1.0f, 0.0f, false);
            int lineCount = staticLayout.getLineCount();
            float f10 = 0.0f;
            float f11 = 0.0f;
            for (int i15 = 0; i15 < lineCount; i15++) {
                f11 = Math.max(f11, staticLayout.getLineWidth(i15));
            }
            if (lineCount > 1 && (ceil = (int) Math.ceil(f11)) < i13) {
                StaticLayout staticLayout2 = new StaticLayout(this.f3535m, textPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                if (staticLayout2.getLineCount() == lineCount) {
                    for (int i16 = 0; i16 < staticLayout2.getLineCount(); i16++) {
                        f10 = Math.max(f10, staticLayout2.getLineWidth(i16));
                    }
                    f11 = f10;
                    staticLayout = staticLayout2;
                }
            }
            this.f3536n = staticLayout;
            this.f3537o = i12;
            this.f3542t = ((int) Math.ceil(f11)) + i12 + i11;
            float lineBaseline = this.f3536n.getLineBaseline(0);
            StaticLayout staticLayout3 = this.f3536n;
            float f12 = this.h;
            this.f3543u = Math.max(i14, (int) Math.ceil((staticLayout3.getLineBaseline(this.f3536n.getLineCount() - 1) - lineBaseline) + f12 + this.f3531i));
            this.f3538p = f12 - lineBaseline;
            return;
        }
        this.f3536n = null;
        this.f3542t = i14;
        this.f3543u = i14;
    }

    public final void c(TLObject tLObject) {
        boolean z10;
        if (tLObject != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f3534l = z10;
        if (z10) {
            t8 t8Var = this.f3528e;
            t8Var.l(tLObject);
            boolean z11 = tLObject instanceof TLRPC.User;
            ImageReceiver imageReceiver = this.d;
            if (z11) {
                imageReceiver.q0(gc.l(m10.f24934t0, 1, (TLRPC.User) tLObject), "48_48", t8Var, null, null, 0);
            } else if (tLObject instanceof TLRPC.Chat) {
                imageReceiver.q0(gc.a(1, (TLRPC.Chat) tLObject), "48_48", t8Var, null, null, 0);
            } else {
                imageReceiver.w0(t8Var);
            }
        }
        this.f3541s = -1;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        int i7;
        int i10;
        a();
        Rect bounds = getBounds();
        canvas.save();
        boolean z10 = this.f3534l;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        NinePatchDrawable ninePatchDrawable = this.f3525a;
        int i11 = bounds.left;
        int i12 = this.f3530g;
        int i13 = this.f3529f;
        if (z10) {
            i7 = i12 + i13;
        } else {
            i7 = 0;
        }
        bg.s.g(ninePatchDrawable, i11 + i7, bounds.top, bounds.right, bounds.bottom);
        this.f3525a.draw(canvas);
        NinePatchDrawable ninePatchDrawable2 = this.f3526b;
        int i14 = bounds.left;
        if (this.f3534l) {
            i10 = i12 + i13;
        } else {
            i10 = 0;
        }
        bg.s.g(ninePatchDrawable2, i14 + i10, bounds.top, bounds.right, bounds.bottom);
        this.f3526b.draw(canvas);
        if (this.f3536n != null) {
            canvas.save();
            canvas.translate(bounds.left + this.f3537o, bounds.top + this.f3538p);
            this.f3536n.draw(canvas);
            View view = this.f3540r;
            if (view != null && (this.f3535m instanceof Spanned)) {
                org.telegram.ui.Components.l5 update = org.telegram.ui.Components.p5.update(0, view, false, this.f3539q, this.f3536n);
                this.f3539q = update;
                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.f3536n, update, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, null);
            }
            canvas.restore();
        }
        if (f10 > 0.0f) {
            int i15 = bounds.left;
            ImageReceiver imageReceiver = this.d;
            imageReceiver.y0(i15, bounds.bottom - i13, i13, i13);
            canvas.save();
            canvas.scale(f10, f10, imageReceiver.r(), imageReceiver.s());
            imageReceiver.h(canvas, null);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final int getMinimumHeight() {
        return this.f3543u;
    }

    @Override
    public final int getMinimumWidth() {
        return this.f3542t;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

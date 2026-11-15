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
    public NinePatchDrawable f3528a;
    public NinePatchDrawable f3529b;
    public final TextPaint f3530c;
    public final ImageReceiver d;
    public final t8 f3531e;
    public final int f3532f;
    public final int f3533g;
    public final float h;
    public final float f3534i;
    public final int f3535j;
    public final int f3536k;
    public boolean f3537l;
    public CharSequence f3538m;
    public StaticLayout f3539n;
    public float f3540o;
    public float f3541p;
    public org.telegram.ui.Components.l5 f3542q;
    public View f3543r;
    public int f3544s;
    public int f3545t;
    public int f3546u;

    public g1() {
        TextPaint textPaint = new TextPaint(1);
        this.f3530c = textPaint;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.d = imageReceiver;
        this.f3531e = new t8((org.telegram.ui.ActionBar.e6) null);
        int L = org.telegram.messenger.g0.L(10.66f);
        this.f3532f = L * 2;
        this.f3533g = org.telegram.messenger.g0.L(4.0f);
        this.h = org.telegram.messenger.g0.N(15.33f);
        this.f3534i = org.telegram.messenger.g0.N(7.33f);
        this.f3535j = org.telegram.messenger.g0.L(8.0f);
        this.f3536k = (int) org.telegram.messenger.g0.N(22.66f);
        er erVar = er.f34419f;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setColor(-1);
        imageReceiver.J0(L);
    }

    public final void a() {
        if (this.f3528a == null) {
            Drawable drawable = org.telegram.messenger.t0.f26609b.getResources().getDrawable(2131231217);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            int i7 = (intrinsicHeight * 4) / 144;
            this.f3528a = c8.o0.a(createBitmap, new Rect((intrinsicWidth * 27) / 168, i7, (intrinsicWidth * 5) / 168, i7), (intrinsicWidth * 94) / 168, (intrinsicHeight * 71) / 144);
        }
        if (this.f3529b == null) {
            Drawable drawable2 = org.telegram.messenger.t0.f26609b.getResources().getDrawable(2131231218);
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
            this.f3529b = c8.o0.a(createBitmap2, new Rect((intrinsicWidth2 * 27) / 168, i10, (intrinsicWidth2 * 5) / 168, i10), (intrinsicWidth2 * 94) / 168, (intrinsicHeight2 * 71) / 144);
        }
    }

    public final void b(int i7) {
        int i10;
        int ceil;
        a();
        if (i7 == this.f3544s && this.f3539n != null) {
            return;
        }
        this.f3544s = i7;
        if (!this.f3537l) {
            i10 = 0;
        } else {
            i10 = this.f3533g + this.f3532f;
        }
        int i11 = this.f3535j;
        int i12 = i10 + i11;
        int i13 = (i7 - i12) - i11;
        int i14 = this.f3536k;
        if (i13 > 0 && !TextUtils.isEmpty(this.f3538m)) {
            CharSequence charSequence = this.f3538m;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.f3530c;
            StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i13, alignment, 1.0f, 0.0f, false);
            int lineCount = staticLayout.getLineCount();
            float f10 = 0.0f;
            float f11 = 0.0f;
            for (int i15 = 0; i15 < lineCount; i15++) {
                f11 = Math.max(f11, staticLayout.getLineWidth(i15));
            }
            if (lineCount > 1 && (ceil = (int) Math.ceil(f11)) < i13) {
                StaticLayout staticLayout2 = new StaticLayout(this.f3538m, textPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                if (staticLayout2.getLineCount() == lineCount) {
                    for (int i16 = 0; i16 < staticLayout2.getLineCount(); i16++) {
                        f10 = Math.max(f10, staticLayout2.getLineWidth(i16));
                    }
                    f11 = f10;
                    staticLayout = staticLayout2;
                }
            }
            this.f3539n = staticLayout;
            this.f3540o = i12;
            this.f3545t = ((int) Math.ceil(f11)) + i12 + i11;
            float lineBaseline = this.f3539n.getLineBaseline(0);
            StaticLayout staticLayout3 = this.f3539n;
            float f12 = this.h;
            this.f3546u = Math.max(i14, (int) Math.ceil((staticLayout3.getLineBaseline(this.f3539n.getLineCount() - 1) - lineBaseline) + f12 + this.f3534i));
            this.f3541p = f12 - lineBaseline;
            return;
        }
        this.f3539n = null;
        this.f3545t = i14;
        this.f3546u = i14;
    }

    public final void c(TLObject tLObject) {
        boolean z10;
        if (tLObject != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f3537l = z10;
        if (z10) {
            t8 t8Var = this.f3531e;
            t8Var.l(tLObject);
            boolean z11 = tLObject instanceof TLRPC.User;
            ImageReceiver imageReceiver = this.d;
            if (z11) {
                imageReceiver.q0(gc.l(m10.f24940t0, 1, (TLRPC.User) tLObject), "48_48", t8Var, null, null, 0);
            } else if (tLObject instanceof TLRPC.Chat) {
                imageReceiver.q0(gc.a(1, (TLRPC.Chat) tLObject), "48_48", t8Var, null, null, 0);
            } else {
                imageReceiver.w0(t8Var);
            }
        }
        this.f3544s = -1;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        int i7;
        int i10;
        a();
        Rect bounds = getBounds();
        canvas.save();
        boolean z10 = this.f3537l;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        NinePatchDrawable ninePatchDrawable = this.f3528a;
        int i11 = bounds.left;
        int i12 = this.f3533g;
        int i13 = this.f3532f;
        if (z10) {
            i7 = i12 + i13;
        } else {
            i7 = 0;
        }
        bg.s.g(ninePatchDrawable, i11 + i7, bounds.top, bounds.right, bounds.bottom);
        this.f3528a.draw(canvas);
        NinePatchDrawable ninePatchDrawable2 = this.f3529b;
        int i14 = bounds.left;
        if (this.f3537l) {
            i10 = i12 + i13;
        } else {
            i10 = 0;
        }
        bg.s.g(ninePatchDrawable2, i14 + i10, bounds.top, bounds.right, bounds.bottom);
        this.f3529b.draw(canvas);
        if (this.f3539n != null) {
            canvas.save();
            canvas.translate(bounds.left + this.f3540o, bounds.top + this.f3541p);
            this.f3539n.draw(canvas);
            View view = this.f3543r;
            if (view != null && (this.f3538m instanceof Spanned)) {
                org.telegram.ui.Components.l5 update = org.telegram.ui.Components.p5.update(0, view, false, this.f3542q, this.f3539n);
                this.f3542q = update;
                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.f3539n, update, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, null);
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
        return this.f3546u;
    }

    @Override
    public final int getMinimumWidth() {
        return this.f3545t;
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

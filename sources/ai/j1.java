package ai;

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
import b8.ld;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.h10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.xq;
public final class j1 extends Drawable {
    public NinePatchDrawable f729a;
    public NinePatchDrawable f730b;
    public final TextPaint f731c;
    public final ImageReceiver d;
    public final u8 f732e;
    public final int f733f;
    public final int f734g;
    public final float h;
    public final float f735i;
    public final int f736j;
    public final int f737k;
    public boolean f738l;
    public CharSequence f739m;
    public StaticLayout f740n;
    public float f741o;
    public float f742p;
    public org.telegram.ui.Components.l5 f743q;
    public View f744r;
    public int f745s;
    public int f746t;
    public int f747u;

    public j1() {
        TextPaint textPaint = new TextPaint(1);
        this.f731c = textPaint;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.d = imageReceiver;
        this.f732e = new u8((org.telegram.ui.ActionBar.e6) null);
        int L = org.telegram.messenger.g0.L(10.66f);
        this.f733f = L * 2;
        this.f734g = org.telegram.messenger.g0.L(4.0f);
        this.h = org.telegram.messenger.g0.N(15.33f);
        this.f735i = org.telegram.messenger.g0.N(7.33f);
        this.f736j = org.telegram.messenger.g0.L(8.0f);
        this.f737k = (int) org.telegram.messenger.g0.N(22.66f);
        xq xqVar = xq.f40452f;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setColor(-1);
        imageReceiver.J0(L);
    }

    public final void a() {
        if (this.f729a == null) {
            Drawable drawable = org.telegram.messenger.t0.f25457b.getResources().getDrawable(2131231217);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            int i3 = (intrinsicHeight * 4) / 144;
            this.f729a = ld.a(createBitmap, new Rect((intrinsicWidth * 27) / 168, i3, (intrinsicWidth * 5) / 168, i3), (intrinsicWidth * 94) / 168, (intrinsicHeight * 71) / 144);
        }
        if (this.f730b == null) {
            Drawable drawable2 = org.telegram.messenger.t0.f25457b.getResources().getDrawable(2131231218);
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
            this.f730b = ld.a(createBitmap2, new Rect((intrinsicWidth2 * 27) / 168, i10, (intrinsicWidth2 * 5) / 168, i10), (intrinsicWidth2 * 94) / 168, (intrinsicHeight2 * 71) / 144);
        }
    }

    public final void b(int i3) {
        int i10;
        int ceil;
        a();
        if (i3 == this.f745s && this.f740n != null) {
            return;
        }
        this.f745s = i3;
        if (!this.f738l) {
            i10 = 0;
        } else {
            i10 = this.f734g + this.f733f;
        }
        int i11 = this.f736j;
        int i12 = i10 + i11;
        int i13 = (i3 - i12) - i11;
        int i14 = this.f737k;
        if (i13 > 0 && !TextUtils.isEmpty(this.f739m)) {
            CharSequence charSequence = this.f739m;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.f731c;
            StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i13, alignment, 1.0f, 0.0f, false);
            int lineCount = staticLayout.getLineCount();
            float f10 = 0.0f;
            float f11 = 0.0f;
            for (int i15 = 0; i15 < lineCount; i15++) {
                f11 = Math.max(f11, staticLayout.getLineWidth(i15));
            }
            if (lineCount > 1 && (ceil = (int) Math.ceil(f11)) < i13) {
                StaticLayout staticLayout2 = new StaticLayout(this.f739m, textPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                if (staticLayout2.getLineCount() == lineCount) {
                    for (int i16 = 0; i16 < staticLayout2.getLineCount(); i16++) {
                        f10 = Math.max(f10, staticLayout2.getLineWidth(i16));
                    }
                    f11 = f10;
                    staticLayout = staticLayout2;
                }
            }
            this.f740n = staticLayout;
            this.f741o = i12;
            this.f746t = ((int) Math.ceil(f11)) + i12 + i11;
            float lineBaseline = this.f740n.getLineBaseline(0);
            StaticLayout staticLayout3 = this.f740n;
            float f12 = this.h;
            this.f747u = Math.max(i14, (int) Math.ceil((staticLayout3.getLineBaseline(this.f740n.getLineCount() - 1) - lineBaseline) + f12 + this.f735i));
            this.f742p = f12 - lineBaseline;
            return;
        }
        this.f740n = null;
        this.f746t = i14;
        this.f747u = i14;
    }

    public final void c(TLObject tLObject) {
        boolean z10;
        if (tLObject != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f738l = z10;
        if (z10) {
            u8 u8Var = this.f732e;
            u8Var.l(tLObject);
            boolean z11 = tLObject instanceof TLRPC.User;
            ImageReceiver imageReceiver = this.d;
            if (z11) {
                imageReceiver.q0(ac.l(h10.f22829t0, 1, (TLRPC.User) tLObject), "48_48", u8Var, null, null, 0);
            } else if (tLObject instanceof TLRPC.Chat) {
                imageReceiver.q0(ac.a(1, (TLRPC.Chat) tLObject), "48_48", u8Var, null, null, 0);
            } else {
                imageReceiver.w0(u8Var);
            }
        }
        this.f745s = -1;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10;
        int i3;
        int i10;
        a();
        Rect bounds = getBounds();
        canvas.save();
        boolean z10 = this.f738l;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        NinePatchDrawable ninePatchDrawable = this.f729a;
        int i11 = bounds.left;
        int i12 = this.f734g;
        int i13 = this.f733f;
        if (z10) {
            i3 = i12 + i13;
        } else {
            i3 = 0;
        }
        cg.r.g(ninePatchDrawable, i11 + i3, bounds.top, bounds.right, bounds.bottom);
        this.f729a.draw(canvas);
        NinePatchDrawable ninePatchDrawable2 = this.f730b;
        int i14 = bounds.left;
        if (this.f738l) {
            i10 = i12 + i13;
        } else {
            i10 = 0;
        }
        cg.r.g(ninePatchDrawable2, i14 + i10, bounds.top, bounds.right, bounds.bottom);
        this.f730b.draw(canvas);
        if (this.f740n != null) {
            canvas.save();
            canvas.translate(bounds.left + this.f741o, bounds.top + this.f742p);
            this.f740n.draw(canvas);
            View view = this.f744r;
            if (view != null && (this.f739m instanceof Spanned)) {
                org.telegram.ui.Components.l5 update = org.telegram.ui.Components.p5.update(0, view, false, this.f743q, this.f740n);
                this.f743q = update;
                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.f740n, update, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, null);
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
        return this.f747u;
    }

    @Override
    public final int getMinimumWidth() {
        return this.f746t;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i3) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

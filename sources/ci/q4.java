package ci;

import android.content.Context;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.n70;
public final class q4 extends View {
    public final TextPaint f5810a;
    public final n70 f5811b;
    public final Paint f5812c;
    public final Paint d;
    public StaticLayout f5813e;
    public boolean f5814f;
    public int h;
    public int f5815n;
    public BitmapShader f5816r;
    public Matrix f5817s;
    public Matrix f5818w;
    public CharSequence f5819x;

    public q4(Context context) {
        super(context);
        this.h = org.telegram.messenger.g0.L(6.0f);
        this.f5815n = org.telegram.messenger.g0.L(2.0f);
        TextPaint textPaint = new TextPaint(1);
        this.f5810a = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        Paint paint = new Paint(1);
        this.f5812c = paint;
        paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(9.66f)));
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(9.66f)));
        this.f5811b = new n70(0);
    }

    public final void a(int i3, CharSequence charSequence) {
        if (i3 <= 0) {
            this.f5819x = charSequence;
            return;
        }
        this.f5813e = new StaticLayout(charSequence, this.f5810a, i3 - org.telegram.messenger.g0.L(18.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        n70 n70Var = this.f5811b;
        n70Var.rewind();
        int i10 = this.h;
        int i11 = this.f5815n;
        n70Var.f32363e = i10;
        n70Var.f32364f = i11;
        if (this.f5814f) {
            n70Var.e(null, 0, 0.0f, 0.0f);
            float f10 = Float.MAX_VALUE;
            float width = this.f5813e.getWidth();
            float f11 = Float.MIN_VALUE;
            float f12 = 0.0f;
            for (int i12 = 0; i12 < this.f5813e.getLineCount(); i12++) {
                width = Math.min(width, this.f5813e.getLineLeft(i12));
                f11 = Math.min(f11, this.f5813e.getLineTop(i12));
                f12 = Math.max(f12, this.f5813e.getLineRight(i12));
                f10 = Math.max(f10, this.f5813e.getLineBottom(i12));
            }
            this.f5811b.addRect(width, f11, f12, this.f5813e.getHeight(), Path.Direction.CW);
        } else {
            n70Var.e(this.f5813e, 0, 0.0f, 0.0f);
            StaticLayout staticLayout = this.f5813e;
            staticLayout.getSelectionPath(0, staticLayout.getText().length(), n70Var);
            n70Var.a();
        }
        invalidate();
    }

    public final void b(int i3, TL_stars.SavedStarGift savedStarGift) {
        int i10;
        if (savedStarGift != null && savedStarGift.from_id != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            setVisibility(0);
            long e10 = h10.i(i3).e();
            long o10 = org.telegram.messenger.m5.o(savedStarGift.from_id);
            long o11 = org.telegram.messenger.m5.o(savedStarGift.gift.owner_id);
            if (e10 == o10) {
                if (savedStarGift.gift.crafted) {
                    i10 = 2131749619;
                } else {
                    i10 = 2131749620;
                }
                set(org.telegram.messenger.g0.X2(bd.a0(null, null, i10, bd.r(savedStarGift.date, false))));
                return;
            } else if (e10 == o11) {
                set(org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749601, org.telegram.messenger.m5.s(i3, o10), bd.r(savedStarGift.date, false))));
                return;
            } else {
                set(org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749600, org.telegram.messenger.m5.s(i3, o10), org.telegram.messenger.m5.s(i3, o11), bd.r(savedStarGift.date, false))));
                return;
            }
        }
        setVisibility(8);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f5813e != null) {
            canvas.save();
            canvas.translate((getWidth() - this.f5813e.getWidth()) / 2.0f, org.telegram.messenger.g0.L(16.0f));
            Matrix matrix = this.f5817s;
            if (matrix != null) {
                matrix.reset();
                this.f5818w.reset();
                q4 q4Var = this;
                while (q4Var != 0) {
                    this.f5818w.postConcat(q4Var.getMatrix());
                    if (q4Var.getParent() instanceof View) {
                        q4Var = (View) q4Var.getParent();
                    } else {
                        q4Var = 0;
                    }
                }
                this.f5818w.invert(this.f5817s);
                this.f5817s.preTranslate((-this.h) / 2, -org.telegram.messenger.g0.L(16.0f));
                this.f5817s.preScale(12.0f, 12.0f);
                this.f5816r.setLocalMatrix(this.f5817s);
            }
            Paint paint = this.f5812c;
            n70 n70Var = this.f5811b;
            canvas.drawPath(n70Var, paint);
            int r12 = org.telegram.ui.ActionBar.k6.r1(0.35f, -16777216);
            Paint paint2 = this.d;
            paint2.setColor(r12);
            canvas.drawPath(n70Var, paint2);
            this.f5813e.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int height;
        int size = View.MeasureSpec.getSize(i3);
        CharSequence charSequence = this.f5819x;
        if (charSequence != null) {
            a(size, charSequence);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        StaticLayout staticLayout = this.f5813e;
        if (staticLayout == null) {
            height = 0;
        } else {
            height = staticLayout.getHeight() + org.telegram.messenger.g0.L(32.0f);
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(height, 1073741824));
        setPivotX(getMeasuredWidth() / 2.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(zi ziVar) {
        TLRPC.Message message;
        if (ziVar != null && (message = ziVar.f26868k) != null && message.action != null) {
            int i3 = ziVar.I1;
            long e10 = h10.i(i3).e();
            TLRPC.MessageAction messageAction = ziVar.f26868k.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                setVisibility(8);
                return;
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
                if (peer == null) {
                    setVisibility(8);
                    return;
                }
                long o10 = org.telegram.messenger.m5.o(peer);
                long o11 = org.telegram.messenger.m5.o(tL_messageActionStarGiftUnique.peer);
                if (e10 == o10) {
                    set(org.telegram.messenger.g0.X2(bd.a0(null, null, (tL_messageActionStarGiftUnique.craft || tL_messageActionStarGiftUnique.gift.crafted) ? 2131749619 : 2131749620, bd.r(ziVar.f26868k.date, false))));
                } else if (e10 == o11) {
                    set(org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749601, org.telegram.messenger.m5.s(i3, o10), bd.r(ziVar.f26868k.date, false))));
                } else {
                    set(org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749600, org.telegram.messenger.m5.s(i3, o10), org.telegram.messenger.m5.s(i3, o11), bd.r(ziVar.f26868k.date, false))));
                }
                setVisibility(0);
                return;
            } else {
                setVisibility(8);
                return;
            }
        }
        setVisibility(8);
    }

    public void setFullRect(boolean z10) {
        this.f5814f = z10;
    }

    public void setRoundRadius(float f10) {
        this.f5812c.setPathEffect(new CornerPathEffect(f10));
        this.d.setPathEffect(new CornerPathEffect(f10));
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        invalidate();
    }

    public void set(CharSequence charSequence) {
        a(getMeasuredWidth(), charSequence);
    }
}

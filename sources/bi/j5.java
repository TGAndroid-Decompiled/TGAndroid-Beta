package bi;

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
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.r70;
public final class j5 extends View {
    public final TextPaint f4084a;
    public final r70 f4085b;
    public final Paint f4086c;
    public final Paint d;
    public StaticLayout f4087e;
    public boolean f4088f;
    public int h;
    public int f4089n;
    public BitmapShader f4090r;
    public Matrix f4091s;
    public Matrix f4092w;
    public CharSequence f4093x;

    public j5(Context context) {
        super(context);
        this.h = org.telegram.messenger.g0.L(6.0f);
        this.f4089n = org.telegram.messenger.g0.L(2.0f);
        TextPaint textPaint = new TextPaint(1);
        this.f4084a = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        Paint paint = new Paint(1);
        this.f4086c = paint;
        paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(9.66f)));
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(9.66f)));
        this.f4085b = new r70(0);
    }

    public final void a(int i7, CharSequence charSequence) {
        if (i7 <= 0) {
            this.f4093x = charSequence;
            return;
        }
        this.f4087e = new StaticLayout(charSequence, this.f4084a, i7 - org.telegram.messenger.g0.L(18.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        r70 r70Var = this.f4085b;
        r70Var.rewind();
        int i10 = this.h;
        int i11 = this.f4089n;
        r70Var.f31874e = i10;
        r70Var.f31875f = i11;
        if (this.f4088f) {
            r70Var.e(null, 0, 0.0f, 0.0f);
            float f10 = Float.MAX_VALUE;
            float width = this.f4087e.getWidth();
            float f11 = Float.MIN_VALUE;
            float f12 = 0.0f;
            for (int i12 = 0; i12 < this.f4087e.getLineCount(); i12++) {
                width = Math.min(width, this.f4087e.getLineLeft(i12));
                f11 = Math.min(f11, this.f4087e.getLineTop(i12));
                f12 = Math.max(f12, this.f4087e.getLineRight(i12));
                f10 = Math.max(f10, this.f4087e.getLineBottom(i12));
            }
            this.f4085b.addRect(width, f11, f12, this.f4087e.getHeight(), Path.Direction.CW);
        } else {
            r70Var.e(this.f4087e, 0, 0.0f, 0.0f);
            StaticLayout staticLayout = this.f4087e;
            staticLayout.getSelectionPath(0, staticLayout.getText().length(), r70Var);
            r70Var.a();
        }
        invalidate();
    }

    public final void b(int i7, TL_stars.SavedStarGift savedStarGift) {
        int i10;
        if (savedStarGift != null && savedStarGift.from_id != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            setVisibility(0);
            long e10 = p10.i(i7).e();
            long o4 = org.telegram.messenger.m5.o(savedStarGift.from_id);
            long o10 = org.telegram.messenger.m5.o(savedStarGift.gift.owner_id);
            if (e10 == o4) {
                if (savedStarGift.gift.crafted) {
                    i10 = 2131749610;
                } else {
                    i10 = 2131749611;
                }
                set(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, i10, org.telegram.messenger.hd.r(savedStarGift.date, false))));
                return;
            } else if (e10 == o10) {
                set(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131749592, org.telegram.messenger.m5.s(i7, o4), org.telegram.messenger.hd.r(savedStarGift.date, false))));
                return;
            } else {
                set(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131749591, org.telegram.messenger.m5.s(i7, o4), org.telegram.messenger.m5.s(i7, o10), org.telegram.messenger.hd.r(savedStarGift.date, false))));
                return;
            }
        }
        setVisibility(8);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f4087e != null) {
            canvas.save();
            canvas.translate((getWidth() - this.f4087e.getWidth()) / 2.0f, org.telegram.messenger.g0.L(16.0f));
            Matrix matrix = this.f4091s;
            if (matrix != null) {
                matrix.reset();
                this.f4092w.reset();
                j5 j5Var = this;
                while (j5Var != 0) {
                    this.f4092w.postConcat(j5Var.getMatrix());
                    if (j5Var.getParent() instanceof View) {
                        j5Var = (View) j5Var.getParent();
                    } else {
                        j5Var = 0;
                    }
                }
                this.f4092w.invert(this.f4091s);
                this.f4091s.preTranslate((-this.h) / 2, -org.telegram.messenger.g0.L(16.0f));
                this.f4091s.preScale(12.0f, 12.0f);
                this.f4090r.setLocalMatrix(this.f4091s);
            }
            Paint paint = this.f4086c;
            r70 r70Var = this.f4085b;
            canvas.drawPath(r70Var, paint);
            int r12 = org.telegram.ui.ActionBar.k6.r1(0.35f, -16777216);
            Paint paint2 = this.d;
            paint2.setColor(r12);
            canvas.drawPath(r70Var, paint2);
            this.f4087e.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int height;
        int size = View.MeasureSpec.getSize(i7);
        CharSequence charSequence = this.f4093x;
        if (charSequence != null) {
            a(size, charSequence);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        StaticLayout staticLayout = this.f4087e;
        if (staticLayout == null) {
            height = 0;
        } else {
            height = staticLayout.getHeight() + org.telegram.messenger.g0.L(32.0f);
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(height, 1073741824));
        setPivotX(getMeasuredWidth() / 2.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(ij ijVar) {
        TLRPC.Message message;
        if (ijVar != null && (message = ijVar.f23237k) != null && message.action != null) {
            int i7 = ijVar.I1;
            long e10 = p10.i(i7).e();
            TLRPC.MessageAction messageAction = ijVar.f23237k.action;
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
                long o4 = org.telegram.messenger.m5.o(peer);
                long o10 = org.telegram.messenger.m5.o(tL_messageActionStarGiftUnique.peer);
                if (e10 == o4) {
                    set(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, (tL_messageActionStarGiftUnique.craft || tL_messageActionStarGiftUnique.gift.crafted) ? 2131749610 : 2131749611, org.telegram.messenger.hd.r(ijVar.f23237k.date, false))));
                } else if (e10 == o10) {
                    set(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131749592, org.telegram.messenger.m5.s(i7, o4), org.telegram.messenger.hd.r(ijVar.f23237k.date, false))));
                } else {
                    set(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131749591, org.telegram.messenger.m5.s(i7, o4), org.telegram.messenger.m5.s(i7, o10), org.telegram.messenger.hd.r(ijVar.f23237k.date, false))));
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

    public void setFullRect(boolean z9) {
        this.f4088f = z9;
    }

    public void setRoundRadius(float f10) {
        this.f4086c.setPathEffect(new CornerPathEffect(f10));
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

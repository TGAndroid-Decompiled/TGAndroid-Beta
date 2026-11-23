package di;

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
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h80;
public final class k4 extends View {
    public final TextPaint f9175a;
    public final h80 f9176b;
    public final Paint f9177c;
    public final Paint d;
    public StaticLayout f9178e;
    public boolean f9179f;
    public int h;
    public int f9180n;
    public BitmapShader f9181r;
    public Matrix f9182s;
    public Matrix f9183w;
    public CharSequence f9184x;

    public k4(Context context) {
        super(context);
        this.h = org.telegram.messenger.g0.L(6.0f);
        this.f9180n = org.telegram.messenger.g0.L(2.0f);
        TextPaint textPaint = new TextPaint(1);
        this.f9175a = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        Paint paint = new Paint(1);
        this.f9177c = paint;
        paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(9.66f)));
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(9.66f)));
        this.f9176b = new h80(0);
    }

    public final void a(int i7, CharSequence charSequence) {
        if (i7 <= 0) {
            this.f9184x = charSequence;
            return;
        }
        this.f9178e = new StaticLayout(charSequence, this.f9175a, i7 - org.telegram.messenger.g0.L(18.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        h80 h80Var = this.f9176b;
        h80Var.rewind();
        int i10 = this.h;
        int i11 = this.f9180n;
        h80Var.f39316e = i10;
        h80Var.f39317f = i11;
        if (this.f9179f) {
            h80Var.e(null, 0, 0.0f, 0.0f);
            float f10 = Float.MAX_VALUE;
            float width = this.f9178e.getWidth();
            float f11 = Float.MIN_VALUE;
            float f12 = 0.0f;
            for (int i12 = 0; i12 < this.f9178e.getLineCount(); i12++) {
                width = Math.min(width, this.f9178e.getLineLeft(i12));
                f11 = Math.min(f11, this.f9178e.getLineTop(i12));
                f12 = Math.max(f12, this.f9178e.getLineRight(i12));
                f10 = Math.max(f10, this.f9178e.getLineBottom(i12));
            }
            this.f9176b.addRect(width, f11, f12, this.f9178e.getHeight(), Path.Direction.CW);
        } else {
            h80Var.e(this.f9178e, 0, 0.0f, 0.0f);
            StaticLayout staticLayout = this.f9178e;
            staticLayout.getSelectionPath(0, staticLayout.getText().length(), h80Var);
            h80Var.a();
        }
        invalidate();
    }

    public final void b(int i7, TL_stars.SavedStarGift savedStarGift) {
        int i10;
        if (savedStarGift != null && savedStarGift.from_id != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            setVisibility(0);
            long e10 = k10.i(i7).e();
            long o4 = org.telegram.messenger.n5.o(savedStarGift.from_id);
            long o10 = org.telegram.messenger.n5.o(savedStarGift.gift.owner_id);
            if (e10 == o4) {
                if (savedStarGift.gift.crafted) {
                    i10 = 2131749435;
                } else {
                    i10 = 2131749436;
                }
                set(org.telegram.messenger.g0.W2(hd.a0(null, null, i10, hd.r(savedStarGift.date, false))));
                return;
            } else if (e10 == o10) {
                set(org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749417, org.telegram.messenger.n5.s(i7, o4), hd.r(savedStarGift.date, false))));
                return;
            } else {
                set(org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749416, org.telegram.messenger.n5.s(i7, o4), org.telegram.messenger.n5.s(i7, o10), hd.r(savedStarGift.date, false))));
                return;
            }
        }
        setVisibility(8);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f9178e != null) {
            canvas.save();
            canvas.translate((getWidth() - this.f9178e.getWidth()) / 2.0f, org.telegram.messenger.g0.L(16.0f));
            Matrix matrix = this.f9182s;
            if (matrix != null) {
                matrix.reset();
                this.f9183w.reset();
                k4 k4Var = this;
                while (k4Var != 0) {
                    this.f9183w.postConcat(k4Var.getMatrix());
                    if (k4Var.getParent() instanceof View) {
                        k4Var = (View) k4Var.getParent();
                    } else {
                        k4Var = 0;
                    }
                }
                this.f9183w.invert(this.f9182s);
                this.f9182s.preTranslate((-this.h) / 2, -org.telegram.messenger.g0.L(16.0f));
                this.f9182s.preScale(12.0f, 12.0f);
                this.f9181r.setLocalMatrix(this.f9182s);
            }
            Paint paint = this.f9177c;
            h80 h80Var = this.f9176b;
            canvas.drawPath(h80Var, paint);
            int r12 = org.telegram.ui.ActionBar.m6.r1(0.35f, -16777216);
            Paint paint2 = this.d;
            paint2.setColor(r12);
            canvas.drawPath(h80Var, paint2);
            this.f9178e.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int height;
        int size = View.MeasureSpec.getSize(i7);
        CharSequence charSequence = this.f9184x;
        if (charSequence != null) {
            a(size, charSequence);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        StaticLayout staticLayout = this.f9178e;
        if (staticLayout == null) {
            height = 0;
        } else {
            height = staticLayout.getHeight() + org.telegram.messenger.g0.L(32.0f);
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(height, 1073741824));
        setPivotX(getMeasuredWidth() / 2.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(gj gjVar) {
        TLRPC.Message message;
        if (gjVar != null && (message = gjVar.f24213k) != null && message.action != null) {
            int i7 = gjVar.K1;
            long e10 = k10.i(i7).e();
            TLRPC.MessageAction messageAction = gjVar.f24213k.action;
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
                long o4 = org.telegram.messenger.n5.o(peer);
                long o10 = org.telegram.messenger.n5.o(tL_messageActionStarGiftUnique.peer);
                if (e10 == o4) {
                    set(org.telegram.messenger.g0.W2(hd.a0(null, null, (tL_messageActionStarGiftUnique.craft || tL_messageActionStarGiftUnique.gift.crafted) ? 2131749435 : 2131749436, hd.r(gjVar.f24213k.date, false))));
                } else if (e10 == o10) {
                    set(org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749417, org.telegram.messenger.n5.s(i7, o4), hd.r(gjVar.f24213k.date, false))));
                } else {
                    set(org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749416, org.telegram.messenger.n5.s(i7, o4), org.telegram.messenger.n5.s(i7, o10), hd.r(gjVar.f24213k.date, false))));
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
        this.f9179f = z10;
    }

    public void setRoundRadius(float f10) {
        this.f9177c.setPathEffect(new CornerPathEffect(f10));
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

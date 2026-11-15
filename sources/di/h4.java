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
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.u70;
public final class h4 extends View {
    public final TextPaint f8693a;
    public final u70 f8694b;
    public final Paint f8695c;
    public final Paint d;
    public StaticLayout f8696e;
    public boolean f8697f;
    public int h;
    public int f8698n;
    public BitmapShader f8699r;
    public Matrix f8700s;
    public Matrix f8701w;
    public CharSequence f8702x;

    public h4(Context context) {
        super(context);
        this.h = org.telegram.messenger.g0.L(6.0f);
        this.f8698n = org.telegram.messenger.g0.L(2.0f);
        TextPaint textPaint = new TextPaint(1);
        this.f8693a = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        Paint paint = new Paint(1);
        this.f8695c = paint;
        paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(9.66f)));
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(9.66f)));
        this.f8694b = new u70(0);
    }

    public final void a(int i7, CharSequence charSequence) {
        if (i7 <= 0) {
            this.f8702x = charSequence;
            return;
        }
        this.f8696e = new StaticLayout(charSequence, this.f8693a, i7 - org.telegram.messenger.g0.L(18.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        u70 u70Var = this.f8694b;
        u70Var.rewind();
        int i10 = this.h;
        int i11 = this.f8698n;
        u70Var.f35684e = i10;
        u70Var.f35685f = i11;
        if (this.f8697f) {
            u70Var.e(null, 0, 0.0f, 0.0f);
            float f10 = Float.MAX_VALUE;
            float width = this.f8696e.getWidth();
            float f11 = Float.MIN_VALUE;
            float f12 = 0.0f;
            for (int i12 = 0; i12 < this.f8696e.getLineCount(); i12++) {
                width = Math.min(width, this.f8696e.getLineLeft(i12));
                f11 = Math.min(f11, this.f8696e.getLineTop(i12));
                f12 = Math.max(f12, this.f8696e.getLineRight(i12));
                f10 = Math.max(f10, this.f8696e.getLineBottom(i12));
            }
            this.f8694b.addRect(width, f11, f12, this.f8696e.getHeight(), Path.Direction.CW);
        } else {
            u70Var.e(this.f8696e, 0, 0.0f, 0.0f);
            StaticLayout staticLayout = this.f8696e;
            staticLayout.getSelectionPath(0, staticLayout.getText().length(), u70Var);
            u70Var.a();
        }
        invalidate();
    }

    public final void b(int i7, TL_stars.SavedStarGift savedStarGift) {
        int i10;
        if (savedStarGift != null && savedStarGift.from_id != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            setVisibility(0);
            long e10 = m10.i(i7).e();
            long o4 = org.telegram.messenger.m5.o(savedStarGift.from_id);
            long o10 = org.telegram.messenger.m5.o(savedStarGift.gift.owner_id);
            if (e10 == o4) {
                if (savedStarGift.gift.crafted) {
                    i10 = 2131749611;
                } else {
                    i10 = 2131749612;
                }
                set(org.telegram.messenger.g0.X2(hd.a0(null, null, i10, hd.r(savedStarGift.date, false))));
                return;
            } else if (e10 == o10) {
                set(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749593, org.telegram.messenger.m5.s(i7, o4), hd.r(savedStarGift.date, false))));
                return;
            } else {
                set(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749592, org.telegram.messenger.m5.s(i7, o4), org.telegram.messenger.m5.s(i7, o10), hd.r(savedStarGift.date, false))));
                return;
            }
        }
        setVisibility(8);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f8696e != null) {
            canvas.save();
            canvas.translate((getWidth() - this.f8696e.getWidth()) / 2.0f, org.telegram.messenger.g0.L(16.0f));
            Matrix matrix = this.f8700s;
            if (matrix != null) {
                matrix.reset();
                this.f8701w.reset();
                h4 h4Var = this;
                while (h4Var != 0) {
                    this.f8701w.postConcat(h4Var.getMatrix());
                    if (h4Var.getParent() instanceof View) {
                        h4Var = (View) h4Var.getParent();
                    } else {
                        h4Var = 0;
                    }
                }
                this.f8701w.invert(this.f8700s);
                this.f8700s.preTranslate((-this.h) / 2, -org.telegram.messenger.g0.L(16.0f));
                this.f8700s.preScale(12.0f, 12.0f);
                this.f8699r.setLocalMatrix(this.f8700s);
            }
            Paint paint = this.f8695c;
            u70 u70Var = this.f8694b;
            canvas.drawPath(u70Var, paint);
            int r12 = org.telegram.ui.ActionBar.j6.r1(0.35f, -16777216);
            Paint paint2 = this.d;
            paint2.setColor(r12);
            canvas.drawPath(u70Var, paint2);
            this.f8696e.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int height;
        int size = View.MeasureSpec.getSize(i7);
        CharSequence charSequence = this.f8702x;
        if (charSequence != null) {
            a(size, charSequence);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        StaticLayout staticLayout = this.f8696e;
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
        if (gjVar != null && (message = gjVar.f23819k) != null && message.action != null) {
            int i7 = gjVar.K1;
            long e10 = m10.i(i7).e();
            TLRPC.MessageAction messageAction = gjVar.f23819k.action;
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
                    set(org.telegram.messenger.g0.X2(hd.a0(null, null, (tL_messageActionStarGiftUnique.craft || tL_messageActionStarGiftUnique.gift.crafted) ? 2131749611 : 2131749612, hd.r(gjVar.f23819k.date, false))));
                } else if (e10 == o10) {
                    set(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749593, org.telegram.messenger.m5.s(i7, o4), hd.r(gjVar.f23819k.date, false))));
                } else {
                    set(org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749592, org.telegram.messenger.m5.s(i7, o4), org.telegram.messenger.m5.s(i7, o10), hd.r(gjVar.f23819k.date, false))));
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
        this.f8697f = z10;
    }

    public void setRoundRadius(float f10) {
        this.f8695c.setPathEffect(new CornerPathEffect(f10));
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

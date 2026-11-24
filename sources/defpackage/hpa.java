package defpackage;

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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class hpa extends View {
    public final TextPaint a;
    public final b46 b;
    public final Paint c;
    public final Paint d;
    public StaticLayout e;
    public boolean f;
    public int h;
    public int n;
    public BitmapShader r;
    public Matrix s;
    public Matrix w;
    public CharSequence x;

    public hpa(Context context) {
        super(context);
        this.h = gl.L(6.0f);
        this.n = gl.L(2.0f);
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(gl.L(13.0f));
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setPathEffect(new CornerPathEffect(gl.L(9.66f)));
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setPathEffect(new CornerPathEffect(gl.L(9.66f)));
        this.b = new b46(0);
    }

    public final void a(int i, CharSequence charSequence) {
        if (i <= 0) {
            this.x = charSequence;
            return;
        }
        this.e = new StaticLayout(charSequence, this.a, i - gl.L(18.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        b46 b46Var = this.b;
        b46Var.rewind();
        int i2 = this.h;
        int i3 = this.n;
        b46Var.e = i2;
        b46Var.f = i3;
        if (this.f) {
            b46Var.e(null, 0, 0.0f, 0.0f);
            float width = this.e.getWidth();
            float f = Float.MIN_VALUE;
            float f2 = 0.0f;
            for (int i4 = 0; i4 < this.e.getLineCount(); i4++) {
                width = Math.min(width, this.e.getLineLeft(i4));
                f = Math.min(f, this.e.getLineTop(i4));
                f2 = Math.max(f2, this.e.getLineRight(i4));
                this.e.getLineBottom(i4);
            }
            this.b.addRect(width, f, f2, this.e.getHeight(), Path.Direction.CW);
        } else {
            b46Var.e(this.e, 0, 0.0f, 0.0f);
            StaticLayout staticLayout = this.e;
            staticLayout.getSelectionPath(0, staticLayout.getText().length(), b46Var);
            b46Var.a();
        }
        invalidate();
    }

    public final void b(int i, TL_stars.SavedStarGift savedStarGift) {
        int i2;
        if (savedStarGift != null && savedStarGift.from_id != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            setVisibility(0);
            long e = y6c.h(i).e();
            long n = cf3.n(savedStarGift.from_id);
            long n2 = cf3.n(savedStarGift.gift.owner_id);
            if (e == n) {
                if (savedStarGift.gift.crafted) {
                    i2 = 2131749436;
                } else {
                    i2 = 2131749437;
                }
                set(gl.S2(k96.a0(null, null, i2, k96.r(savedStarGift.date, false))));
                return;
            } else if (e == n2) {
                set(gl.S2(k96.a0(null, null, 2131749418, cf3.r(i, n), k96.r(savedStarGift.date, false))));
                return;
            } else {
                set(gl.S2(k96.a0(null, null, 2131749417, cf3.r(i, n), cf3.r(i, n2), k96.r(savedStarGift.date, false))));
                return;
            }
        }
        setVisibility(8);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Matrix matrix;
        super.onDraw(canvas);
        if (this.e != null) {
            canvas.save();
            canvas.translate((getWidth() - this.e.getWidth()) / 2.0f, gl.L(16.0f));
            Matrix matrix2 = this.s;
            if (matrix2 != null) {
                matrix2.reset();
                this.w.reset();
                hpa hpaVar = this;
                while (true) {
                    matrix = this.w;
                    if (hpaVar == 0) {
                        break;
                    }
                    matrix.postConcat(hpaVar.getMatrix());
                    if (hpaVar.getParent() instanceof View) {
                        hpaVar = (View) hpaVar.getParent();
                    } else {
                        hpaVar = 0;
                    }
                }
                matrix.invert(this.s);
                this.s.preTranslate((-this.h) / 2, -gl.L(16.0f));
                this.s.preScale(12.0f, 12.0f);
                this.r.setLocalMatrix(this.s);
            }
            Paint paint = this.c;
            b46 b46Var = this.b;
            canvas.drawPath(b46Var, paint);
            int p1 = bkb.p1(0.35f, -16777216);
            Paint paint2 = this.d;
            paint2.setColor(p1);
            canvas.drawPath(b46Var, paint2);
            this.e.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int height;
        int size = View.MeasureSpec.getSize(i);
        CharSequence charSequence = this.x;
        if (charSequence != null) {
            a(size, charSequence);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        StaticLayout staticLayout = this.e;
        if (staticLayout == null) {
            height = 0;
        } else {
            height = staticLayout.getHeight() + gl.L(32.0f);
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(height, 1073741824));
        setPivotX(getMeasuredWidth() / 2.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(k27 k27Var) {
        TLRPC.Message message;
        int i;
        if (k27Var != null && (message = k27Var.k) != null && message.action != null) {
            int i2 = k27Var.K1;
            long e = y6c.h(i2).e();
            TLRPC.MessageAction messageAction = k27Var.k.action;
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
                long n = cf3.n(peer);
                long n2 = cf3.n(tL_messageActionStarGiftUnique.peer);
                if (e == n) {
                    if (!tL_messageActionStarGiftUnique.craft && !tL_messageActionStarGiftUnique.gift.crafted) {
                        i = 2131749437;
                    } else {
                        i = 2131749436;
                    }
                    set(gl.S2(k96.a0(null, null, i, k96.r(k27Var.k.date, false))));
                } else if (e == n2) {
                    set(gl.S2(k96.a0(null, null, 2131749418, cf3.r(i2, n), k96.r(k27Var.k.date, false))));
                } else {
                    set(gl.S2(k96.a0(null, null, 2131749417, cf3.r(i2, n), cf3.r(i2, n2), k96.r(k27Var.k.date, false))));
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

    public void setFullRect(boolean z) {
        this.f = z;
    }

    public void setRoundRadius(float f) {
        this.c.setPathEffect(new CornerPathEffect(f));
        this.d.setPathEffect(new CornerPathEffect(f));
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        invalidate();
    }

    public void set(CharSequence charSequence) {
        a(getMeasuredWidth(), charSequence);
    }
}

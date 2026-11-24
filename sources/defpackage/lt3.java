package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Stack;
public abstract class lt3 extends EditText {
    public static Boolean a0;
    public int E;
    public cm F;
    public PorterDuffColorFilter G;
    public boolean H;
    public Layout I;
    public int J;
    public l K;
    public Rect L;
    public boolean M;
    public int N;
    public Integer O;
    public float P;
    public boolean Q;
    public oj7 R;
    public int S;
    public int T;
    public boolean[] U;
    public boolean V;
    public boolean W;
    public ArrayList a;
    public Stack b;
    public ArrayList c;
    public boolean d;
    public boolean e;
    public mk0 f;
    public boolean h;
    public Path n;
    public int r;
    public int s;
    public float w;
    public float x;
    public boolean y;

    public final void d() {
        CharSequence charSequence;
        wib[] wibVarArr;
        int i;
        int i2;
        l lVar = this.K;
        if (getLayout() != null) {
            charSequence = getLayout().getText();
        } else {
            charSequence = null;
        }
        boolean z = false;
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            for (wib wibVar : (wib[]) spannable.getSpans(0, spannable.length(), wib.class)) {
                int spanStart = spannable.getSpanStart(wibVar);
                int spanEnd = spannable.getSpanEnd(wibVar);
                if (wibVar.b() && ((spanStart > (i = this.r) && spanEnd < this.s) || ((i > spanStart && i < spanEnd) || ((i2 = this.s) > spanStart && i2 < spanEnd)))) {
                    removeCallbacks(lVar);
                    this.y = false;
                    z = true;
                    break;
                }
            }
        }
        if (this.d && !z && !this.y) {
            this.y = true;
            postDelayed(lVar, 10000L);
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        ey8 ey8Var;
        boolean z3;
        mk0 mk0Var;
        int paddingTop = getPaddingTop() - getScrollY();
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            z = false;
        } else {
            int size = arrayList.size();
            z = false;
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ay8 ay8Var = (ay8) obj;
                u20 u20Var = ay8Var.e.K;
                if (ay8Var.b() && ay8Var.g.contains(motionEvent.getX(), motionEvent.getY() - paddingTop)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (motionEvent.getAction() == 0) {
                    if (u20Var != null) {
                        u20Var.f(z2);
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (u20Var != null && u20Var.c && z2) {
                        ay8Var.e.e = !ey8Var.e;
                        g(true);
                        z = true;
                    }
                    if (u20Var != null) {
                        u20Var.f(false);
                    }
                } else if (motionEvent.getAction() == 3 && u20Var != null) {
                    u20Var.f(false);
                }
                if ((u20Var != null && u20Var.c) || z) {
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (!z) {
            if (this.e && (mk0Var = this.f) != null && ((GestureDetector) ((gi3) mk0Var.d).a).onTouchEvent(motionEvent)) {
                if (motionEvent.getActionMasked() == 1) {
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    super.dispatchTouchEvent(obtain);
                    obtain.recycle();
                }
                z3 = true;
            } else {
                z3 = false;
            }
            if (!super.dispatchTouchEvent(motionEvent) && !z3) {
                return false;
            }
        }
        return true;
    }

    public int e() {
        return vl.f();
    }

    public final void f() {
        wib[] wibVarArr;
        Editable text = getText();
        if (text != null) {
            for (wib wibVar : (wib[]) text.getSpans(0, text.length(), wib.class)) {
                if (wibVar.b()) {
                    boolean z = this.d;
                    vib vibVar = wibVar.b;
                    if (z) {
                        vibVar.a |= 512;
                    } else {
                        vibVar.a &= -513;
                    }
                }
            }
        }
        h();
    }

    public final void g(boolean z) {
        int i;
        if (this.V) {
            this.W = true;
            return;
        }
        int i2 = 0;
        if (getLayout() != null && getLayout().getText() != null) {
            i = getLayout().getText().length();
        } else {
            i = 0;
        }
        if (z || this.S != i) {
            this.T = 2;
            this.S = i;
        }
        if (this.T > 0) {
            boolean[] zArr = this.U;
            if (zArr == null) {
                zArr = new boolean[1];
                this.U = zArr;
            }
            zArr[0] = false;
            this.W = false;
            this.V = true;
            this.c = ey8.d(this, getLayout(), this.c, this.U);
            if (this.W) {
                this.c = ey8.d(this, getLayout(), this.c, this.U);
            }
            this.V = false;
            this.W = false;
            if (this.U[0]) {
                float textSize = getTextSize();
                setTextSize(0, 1.0f + textSize);
                setTextSize(0, textSize);
            }
            this.T--;
            if (getLayout() != null && getLayout().getText() != null) {
                i2 = getLayout().getText().length();
            }
            this.S = i2;
        }
    }

    public float getOffsetY() {
        return this.P;
    }

    public CharSequence getTextToUse() {
        Editable text = getText();
        if (text == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
        cy8[] cy8VarArr = (cy8[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), cy8.class);
        for (int length = cy8VarArr.length - 1; length >= 0; length--) {
            cy8 cy8Var = cy8VarArr[length];
            int spanStart = spannableStringBuilder.getSpanStart(cy8Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(cy8Var);
            spannableStringBuilder.removeSpan(cy8Var);
            spannableStringBuilder.delete(spanStart, spanEnd);
        }
        return spannableStringBuilder;
    }

    public final void h() {
        lt3 lt3Var;
        cm cmVar;
        cm cmVar2;
        Stack stack = this.b;
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            return;
        }
        stack.addAll(arrayList);
        arrayList.clear();
        if (this.d) {
            invalidate();
            return;
        }
        Layout layout = getLayout();
        if (layout != null && (layout.getText() instanceof Spannable)) {
            if (this.H && (cmVar2 = this.F) != null) {
                ArrayList arrayList2 = cmVar2.a;
                for (int i = 0; i < arrayList2.size(); i++) {
                    ((bm) arrayList2.get(i)).d.recordPositions = false;
                }
            }
            ArrayList arrayList3 = this.c;
            short s = qla.A;
            int measuredWidth = getMeasuredWidth();
            Layout layout2 = getLayout();
            if (measuredWidth <= 0) {
                measuredWidth = -2;
            }
            int i2 = measuredWidth;
            lt3Var = this;
            qla.a(lt3Var, layout2, 0, i2, (Spanned) getText(), stack, arrayList, arrayList3);
            if (lt3Var.H && (cmVar = lt3Var.F) != null) {
                ArrayList arrayList4 = cmVar.a;
                for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                    ((bm) arrayList4.get(i3)).d.recordPositions = true;
                }
            }
        } else {
            lt3Var = this;
        }
        lt3Var.invalidate();
    }

    public final void i(qla qlaVar, float f, float f2) {
        if (!this.d) {
            this.w = f;
            this.x = f2;
            this.y = false;
            removeCallbacks(this.K);
            j(true, false);
            qlaVar.q = new jt3(this, (byte) 0);
            float sqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((qla) obj).j(f, f2, sqrt, false);
            }
        }
    }

    public final void j(boolean z, boolean z2) {
        wib[] wibVarArr;
        this.d = z;
        Editable text = getText();
        if (text != null) {
            for (wib wibVar : (wib[]) text.getSpans(0, text.length(), wib.class)) {
                if (wibVar.b()) {
                    vib vibVar = wibVar.b;
                    if (z) {
                        vibVar.a |= 512;
                    } else {
                        vibVar.a &= -513;
                    }
                }
            }
        }
        this.h = true;
        setText(text, TextView.BufferType.EDITABLE);
        setSelection(this.r, this.s);
        this.h = false;
        if (z2) {
            h();
        }
    }

    public final void k(boolean z) {
        int i;
        if (this.H) {
            if (getLayout() != null && getLayout().getText() != null) {
                i = getLayout().getText().length();
            } else {
                i = 0;
            }
            if (!z && this.I == getLayout() && this.J == i) {
                return;
            }
            this.F = gm.update(e(), this, this.F, getLayout());
            this.I = getLayout();
            this.J = i;
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        k(true);
        g(false);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.K);
        gm.release(this, this.F);
    }

    @Override
    public void onDraw(Canvas canvas) {
        Path path;
        ArrayList arrayList;
        int color;
        boolean z = this.Q;
        Rect rect = this.L;
        Path path2 = this.n;
        ArrayList arrayList2 = this.a;
        canvas.save();
        if (this.M && getScrollY() != 0) {
            canvas.clipRect(-gl.L(3.0f), (getScrollY() - super.getExtendedPaddingTop()) - this.P, getMeasuredWidth(), ((getScrollY() + getMeasuredHeight()) + super.getExtendedPaddingBottom()) - this.P);
        }
        int paddingLeft = getPaddingLeft();
        int i = 0;
        if (!arrayList2.isEmpty()) {
            path2.rewind();
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                Rect bounds = ((qla) arrayList2.get(i2)).getBounds();
                path2.addRect(bounds.left + paddingLeft, bounds.top, bounds.right + paddingLeft, bounds.bottom, Path.Direction.CW);
                i2 = i3;
            }
            path = path2;
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        } else {
            path = path2;
        }
        g(false);
        for (int i4 = 0; i4 < this.c.size(); i4++) {
            int width = getWidth();
            int i5 = this.E;
            getPaint();
            ((ay8) this.c.get(i4)).a(canvas, width, i5);
        }
        k(false);
        if (z) {
            oj7 oj7Var = this.R;
            oj7 oj7Var2 = oj7Var;
            if (oj7Var == null) {
                ?? canvas2 = new Canvas();
                this.R = canvas2;
                oj7Var2 = canvas2;
            }
            oj7Var2.a = canvas;
            super.onDraw(oj7Var2);
        } else {
            super.onDraw(canvas);
        }
        if (this.H && this.F != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), 0.0f);
            arrayList = arrayList2;
            gm.drawAnimatedEmojis(canvas, getLayout(), this.F, 0.0f, arrayList, computeVerticalScrollOffset() - gl.L(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, this.G);
            canvas.restore();
        } else {
            arrayList = arrayList2;
        }
        canvas.restore();
        if (!arrayList.isEmpty()) {
            qla qlaVar = (qla) arrayList.get(0);
            if (qlaVar.m > 0.0f && qlaVar.n > 0.0f) {
                canvas.save();
                canvas.clipPath(path);
                path.rewind();
                ((qla) arrayList.get(0)).e(path);
                canvas.clipPath(path);
                canvas.translate(0.0f, -getPaddingTop());
                if (z) {
                    oj7 oj7Var3 = this.R;
                    oj7 oj7Var4 = oj7Var3;
                    if (oj7Var3 == null) {
                        ?? canvas3 = new Canvas();
                        this.R = canvas3;
                        oj7Var4 = canvas3;
                    }
                    oj7Var4.a = canvas;
                    super.onDraw(oj7Var4);
                } else {
                    super.onDraw(canvas);
                }
                canvas.restore();
            }
            rect.set(0, (int) ((getScrollY() - super.getExtendedPaddingTop()) - this.P), getWidth(), (int) (((getScrollY() + getMeasuredHeight()) + super.getExtendedPaddingBottom()) - this.P));
            canvas.save();
            canvas.clipRect(rect);
            canvas.translate(paddingLeft, 0.0f);
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj = arrayList.get(i);
                i++;
                qla qlaVar2 = (qla) obj;
                Rect bounds2 = qlaVar2.getBounds();
                int i6 = rect.top;
                int i7 = bounds2.bottom;
                if ((i6 <= i7 && rect.bottom >= bounds2.top) || (bounds2.top <= rect.bottom && i7 >= i6)) {
                    if (qlaVar2.y) {
                        color = this.E;
                    } else {
                        color = getPaint().getColor();
                    }
                    qlaVar2.h(color);
                    qlaVar2.draw(canvas);
                }
            }
            canvas.restore();
        }
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        g(false);
    }

    @Override
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (this.h) {
            return;
        }
        this.r = i;
        this.s = i2;
        d();
    }

    @Override
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        f();
    }

    @Override
    public void onTextChanged(java.lang.CharSequence r7, int r8, int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lt3.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public void setClipToPadding(boolean z) {
        this.M = z;
    }

    public void setEmojiColor(Integer num) {
        int intValue;
        this.O = num;
        if (num == null) {
            intValue = this.N;
        } else {
            intValue = num.intValue();
        }
        this.G = new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setOffsetY(float f) {
        this.P = f;
        invalidate();
    }

    public void setShouldRevealSpoilersByTouch(boolean z) {
        this.e = z;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!this.h) {
            this.d = false;
            Stack stack = this.b;
            if (stack != null) {
                stack.clear();
            }
        }
        super.setText(charSequence, bufferType);
    }

    @Override
    public void setTextColor(int i) {
        this.N = i;
        super.setTextColor(i);
        Integer num = this.O;
        if (num != null) {
            i = num.intValue();
        }
        this.G = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
    }
}

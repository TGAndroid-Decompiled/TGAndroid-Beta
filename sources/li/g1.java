package li;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.inputmethod.InputMethodManager;
import java.util.HashSet;
import org.telegram.messenger.iu;
import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.d41;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.xs;
import org.telegram.ui.Components.zs;
public final class g1 extends zs implements org.telegram.ui.ActionBar.a6 {
    public final d1 A2;
    public float B2;
    public float C2;
    public long D2;
    public int E2;
    public i4 F2;
    public boolean G2;
    public final z0 H2;
    public f1 Y1;
    public e1 Z1;
    public final f6 f18584a2;
    public int f18585b2;
    public boolean f18586c2;
    public boolean d2;
    public boolean f18587e2;
    public boolean f18588f2;
    public boolean f18589g2;
    public boolean f18590h2;
    public boolean f18591i2;
    public boolean f18592j2;
    public boolean f18593k2;
    public r70 f18594l2;
    public Paint f18595m2;
    public Layout f18596n2;
    public int f18597o2;
    public boolean f18598p2;
    public final y0 f18599q2;
    public TL_iv.PageBlock f18600r2;
    public long f18601s2;
    public int f18602t2;
    public final d1 f18603u2;
    public int f18604v2;
    public boolean f18605w2;
    public boolean f18606x2;
    public boolean f18607y2;
    public int f18608z2;

    public g1(Context context, f6 f6Var) {
        super(context, f6Var);
        boolean z9;
        this.f18585b2 = p10.f24470s0;
        this.f18597o2 = -1;
        this.f18598p2 = true;
        this.f18599q2 = new InputFilter() {
            @Override
            public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
                g1 g1Var = g1.this;
                if (!g1Var.f18589g2 || g1Var.f18586c2) {
                    return null;
                }
                f1 f1Var = g1Var.Y1;
                if (f1Var != null && charSequence != null && i10 > i7 && i11 == i12) {
                    f1Var.T0(charSequence.subSequence(i7, i10));
                }
                return spanned.subSequence(i11, i12);
            }
        };
        this.f18602t2 = -1;
        this.f18603u2 = new d1(this, 0);
        this.f18604v2 = k6.G6;
        this.A2 = new d1(this, 1);
        this.H2 = new z0(this, 0);
        this.f18584a2 = f6Var;
        this.W1 = true;
        setBackground(null);
        setCursorWidth(1.5f);
        setGravity(8388659);
        setInputType(getInputType() | 147456);
        setImeOptions(5);
        a1 a1Var = new a1(0);
        b1 b1Var = new b1(this);
        setCustomSelectionActionModeCallback(a1Var);
        setCustomInsertionActionModeCallback(b1Var);
        setOnLongClickListener(new fi.s4(this, 2));
        if (length() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        setLongClickable(z9);
        setOnEditorActionListener(new bi.p(this, 2));
        addTextChangedListener(new c1(this));
        this.f18605w2 = false;
        this.f18606x2 = true;
        updateColors();
    }

    @Override
    public final d41 A(String str) {
        return c6.k(str);
    }

    public final void I() {
        Editable text = getText();
        if (text != null) {
            i4[] i4VarArr = (i4[]) text.getSpans(0, text.length(), i4.class);
            for (i4 i4Var : i4VarArr) {
                i4Var.d(text);
            }
            for (i4 i4Var2 : i4VarArr) {
                i4Var2.a(this.f18585b2, this, this.f18584a2);
            }
        }
    }

    public final void J() {
        org.telegram.ui.ActionBar.w3 w3Var = this.Y0;
        if (w3Var != null) {
            try {
                w3Var.finish();
            } catch (Exception unused) {
            }
        }
    }

    public final i4 K(float f10, float f11) {
        int totalPaddingTop;
        i4[] i4VarArr;
        Layout layout = getLayout();
        Editable text = getText();
        if (layout != null && text != null && text.length() != 0 && (totalPaddingTop = (int) ((f11 - getTotalPaddingTop()) + getScrollY())) >= 0 && totalPaddingTop <= layout.getHeight()) {
            int lineForVertical = layout.getLineForVertical(totalPaddingTop);
            float totalPaddingLeft = (f10 - getTotalPaddingLeft()) + getScrollX();
            for (i4 i4Var : (i4[]) text.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), i4.class)) {
                int spanStart = text.getSpanStart(i4Var);
                int spanEnd = text.getSpanEnd(i4Var);
                if (spanStart >= 0 && spanEnd > spanStart) {
                    float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                    float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
                    if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - org.telegram.messenger.g0.L(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + org.telegram.messenger.g0.L(2.0f)) {
                        return i4Var;
                    }
                }
            }
        }
        return null;
    }

    public final void L() {
        int max = Math.max(0, getSelectionStart());
        int max2 = Math.max(0, getSelectionEnd());
        if (max > max2) {
            max2 = max;
            max = max2;
        }
        this.d2 = true;
        getText().replace(max, max2, "\n");
        this.d2 = false;
        setSelection(max + 1);
    }

    public final void M() {
        if (!this.f18591i2) {
            return;
        }
        this.f18592j2 = true;
        int L = org.telegram.messenger.g0.L(2.0f);
        CharSequence hint = getHint();
        if (length() == 0 && getWidth() > 0 && !TextUtils.isEmpty(hint)) {
            int max = Math.max(0, Math.round(((getWidth() - (L * 2)) - getPaint().measureText(hint.toString())) / 2.0f));
            super.setGravity(51);
            setPadding(max + L, getPaddingTop(), L, getPaddingBottom());
        } else {
            super.setGravity(17);
            setPadding(L, getPaddingTop(), L, getPaddingBottom());
        }
        this.f18592j2 = false;
    }

    public final void N() {
        f1 f1Var = this.Y1;
        if (f1Var != null) {
            f1Var.b(this);
        }
        requestFocus();
        org.telegram.messenger.g0.K3(this);
    }

    public final void O() {
        J();
        if (isFocused()) {
            clearFocus();
        }
        N();
        J();
        post(new z0(this, 1));
    }

    @Override
    public final void a(int i7, int i10, int i11) {
        int min;
        Editable text = getText();
        if (text != null && i10 >= 0 && i11 >= 0 && i10 < i11 && i10 < (min = Math.min(i11, text.length()))) {
            c6.o(text, i10, min, i7, true, this.f18600r2);
            if ((i7 & 256) != 0) {
                h();
            }
            xs xsVar = this.N1;
            if (xsVar != null) {
                xsVar.m();
            }
            this.f18598p2 = true;
            invalidate();
        }
    }

    @Override
    public final void b(int i7, int i10, int i11) {
        int min;
        Editable text = getText();
        if (text != null && i10 >= 0 && i11 >= 0 && i10 < i11 && i10 < (min = Math.min(i11, text.length()))) {
            if ((i7 & 1) != 0) {
                this.f18593k2 = false;
            }
            c6.o(text, i10, min, i7, false, this.f18600r2);
            if ((i7 & 256) != 0) {
                h();
            }
            xs xsVar = this.N1;
            if (xsVar != null) {
                xsVar.m();
            }
            this.f18598p2 = true;
            invalidate();
        }
    }

    @Override
    public final int c(int i7, int i10) {
        int max;
        int min;
        Editable text = getText();
        if (text == null || (max = Math.max(0, i7)) >= (min = Math.min(i10, text.length()))) {
            return 0;
        }
        return c6.q(max, min, text);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z9;
        f1 f1Var;
        if (keyEvent.getKeyCode() == 61) {
            if (keyEvent.getAction() == 0 && (f1Var = this.Y1) != null) {
                f1Var.l1(keyEvent.isShiftPressed());
                return true;
            }
        } else {
            int keyCode = keyEvent.getKeyCode();
            if ((keyCode == 66 || keyCode == 160) && this.Y1 != null && !this.f18590h2) {
                if (keyEvent.getAction() == 0) {
                    if ((keyEvent.getFlags() & 2) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (this.f18587e2 && (z9 || keyEvent.isShiftPressed())) {
                        L();
                        return true;
                    }
                    this.Y1.F(this);
                }
            } else {
                return super.dispatchKeyEvent(keyEvent);
            }
        }
        return true;
    }

    @Override
    public f6 getResourcesProvider() {
        return this.f18584a2;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        I();
    }

    @Override
    public final void onDetachedFromWindow() {
        i4[] i4VarArr;
        org.telegram.messenger.g0.r(this.H2);
        this.F2 = null;
        this.G2 = false;
        Editable text = getText();
        if (text != null) {
            for (i4 i4Var : (i4[]) text.getSpans(0, text.length(), i4.class)) {
                iu iuVar = i4Var.f18642b;
                if (iuVar != null && i4Var.f18643c == this) {
                    iuVar.h = null;
                    iuVar.f23365a.f22722a.f(this);
                    i4Var.f18643c = null;
                }
            }
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        vy0[] vy0VarArr;
        int i7;
        int i10;
        float f10;
        Layout layout = getLayout();
        r70 r70Var = null;
        if (layout == null) {
            this.f18594l2 = null;
            this.f18596n2 = null;
            this.f18597o2 = -1;
        } else {
            CharSequence text = layout.getText();
            if (this.f18598p2 || layout != this.f18596n2 || text.length() != this.f18597o2) {
                this.f18598p2 = false;
                this.f18596n2 = layout;
                this.f18597o2 = text.length();
                this.f18594l2 = null;
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    for (vy0 vy0Var : (vy0[]) spanned.getSpans(0, spanned.length(), vy0.class)) {
                        int i11 = vy0Var.f39749b.f38779a;
                        if ((65536 & i11) != 0) {
                            int spanStart = spanned.getSpanStart(vy0Var);
                            int spanEnd = spanned.getSpanEnd(vy0Var);
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                if (r70Var == null) {
                                    r70Var = new r70(0);
                                    r70Var.f37542n = false;
                                }
                                r70Var.d(layout, spanStart, 0.0f);
                                if ((32768 & i11) != 0) {
                                    i7 = -org.telegram.messenger.g0.L(6.0f);
                                } else if ((i11 & 16384) != 0) {
                                    i7 = org.telegram.messenger.g0.L(2.0f);
                                } else {
                                    i7 = 0;
                                }
                                if (i7 != 0) {
                                    if (i7 > 0) {
                                        f10 = 5.0f;
                                    } else {
                                        f10 = -2.0f;
                                    }
                                    i10 = org.telegram.messenger.g0.L(f10) + i7;
                                } else {
                                    i10 = 0;
                                }
                                r70Var.f37543o = i10;
                                layout.getSelectionPath(spanStart, spanEnd, r70Var);
                            }
                        }
                    }
                    if (r70Var != null) {
                        r70Var.f37542n = true;
                    }
                    this.f18594l2 = r70Var;
                }
            }
        }
        if (this.f18594l2 != null) {
            if (this.f18595m2 == null) {
                Paint paint = new Paint(1);
                this.f18595m2 = paint;
                paint.setPathEffect(r70.c());
            }
            this.f18595m2.setColor(k6.w0(k6.K6, this.f18584a2) & 872415231);
            canvas.save();
            canvas.translate(getPaddingLeft(), this.O);
            canvas.drawPath(this.f18594l2, this.f18595m2);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (i7 == 67 && this.Y1 != null) {
            this.f18601s2 = SystemClock.uptimeMillis();
            if (length() == 0) {
                this.Y1.r0();
                return true;
            } else if (getSelectionStart() == 0 && getSelectionEnd() == 0 && this.Y1.E(this)) {
                return true;
            }
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override
    public final void onSelectionChanged(int i7, int i10) {
        super.onSelectionChanged(i7, i10);
        f1 f1Var = this.Y1;
        if (f1Var != null) {
            f1Var.l0(this, i7, i10);
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        M();
    }

    @Override
    public final boolean onTextContextMenuItem(int i7) {
        f1 f1Var;
        f1 f1Var2;
        if (i7 != 16908319 || (f1Var2 = this.Y1) == null || !f1Var2.m()) {
            if (i7 == 16908322 && (f1Var = this.Y1) != null && f1Var.s(this)) {
                return true;
            }
            return super.onTextContextMenuItem(i7);
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f10;
        boolean z9;
        boolean z10;
        if (motionEvent.getAction() == 0 && this.Y1 != null && isEnabled() && isFocusable()) {
            this.Y1.b(this);
        }
        if (!this.f18589g2) {
            int action = motionEvent.getAction();
            r rVar = null;
            z0 z0Var = this.H2;
            int i7 = 0;
            if (action == 0) {
                this.B2 = motionEvent.getX();
                this.C2 = motionEvent.getY();
                this.D2 = motionEvent.getEventTime();
                i4 K = K(motionEvent.getX(), motionEvent.getY());
                this.F2 = K;
                if (K != null && this.Z1 != null) {
                    this.G2 = false;
                    K.b().f23365a.m(true);
                    org.telegram.messenger.g0.r(z0Var);
                    org.telegram.messenger.g0.i3(z0Var, ViewConfiguration.getLongPressTimeout());
                    return true;
                }
                this.F2 = null;
            } else {
                i4 i4Var = this.F2;
                if (i4Var != null) {
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (motionEvent.getAction() != 3 && K(motionEvent.getX(), motionEvent.getY()) == i4Var) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10 || z9) {
                        i4Var.b().f23365a.m(false);
                        org.telegram.messenger.g0.r(z0Var);
                    }
                    if (z9) {
                        this.F2 = null;
                        if (!this.G2 && z10 && motionEvent.getAction() == 1) {
                            ((r2) this.Z1).a(this, i4Var, false);
                        }
                        this.G2 = false;
                    }
                    return true;
                } else if (motionEvent.getAction() == 1) {
                    if (this.E2 == 0) {
                        this.E2 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                    }
                    float x10 = motionEvent.getX() - this.B2;
                    float y10 = motionEvent.getY() - this.C2;
                    float f11 = (y10 * y10) + (x10 * x10);
                    int i10 = this.E2;
                    if (f11 <= i10 * i10 && motionEvent.getEventTime() - this.D2 < ViewConfiguration.getLongPressTimeout()) {
                        float x11 = motionEvent.getX();
                        float y11 = motionEvent.getY();
                        Layout layout = getLayout();
                        Editable text = getText();
                        if (layout != null && text != null && text.length() != 0) {
                            int lineForVertical = layout.getLineForVertical((int) ((y11 - getTotalPaddingTop()) + getScrollY()));
                            float totalPaddingLeft = (x11 - getTotalPaddingLeft()) + getScrollX();
                            if (totalPaddingLeft >= layout.getLineLeft(lineForVertical) - org.telegram.messenger.g0.L(2.0f) && totalPaddingLeft <= layout.getLineRight(lineForVertical) + org.telegram.messenger.g0.L(2.0f)) {
                                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, totalPaddingLeft);
                                r[] rVarArr = (r[]) text.getSpans(Math.max(0, offsetForHorizontal - 1), Math.min(text.length(), offsetForHorizontal + 1), r.class);
                                int length = rVarArr.length;
                                while (true) {
                                    if (i7 >= length) {
                                        break;
                                    }
                                    r rVar2 = rVarArr[i7];
                                    int spanStart = text.getSpanStart(rVar2);
                                    int spanEnd = text.getSpanEnd(rVar2);
                                    if (spanStart >= 0 && spanEnd >= 0) {
                                        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                                        if (spanEnd <= text.length()) {
                                            f10 = layout.getPrimaryHorizontal(spanEnd);
                                        } else {
                                            f10 = primaryHorizontal;
                                        }
                                        if (totalPaddingLeft >= Math.min(primaryHorizontal, f10) - org.telegram.messenger.g0.L(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, f10) + org.telegram.messenger.g0.L(2.0f)) {
                                            rVar = rVar2;
                                            break;
                                        }
                                    }
                                    i7++;
                                }
                            }
                        }
                        if (rVar != null) {
                            p.Z(getContext(), rVar.f18797a, new ai.f1(27, this, rVar), this.f18584a2);
                            return true;
                        }
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAccentHint(boolean z9) {
        if (this.f18588f2 == z9) {
            return;
        }
        this.f18588f2 = z9;
        this.f18606x2 = true;
        updateColors();
    }

    public void setAllowNewlines(boolean z9) {
        this.f18590h2 = z9;
    }

    public void setAutoBold(boolean z9) {
        this.f18593k2 = z9;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.f18600r2 = pageBlock;
    }

    public void setCenterEmptyHint(boolean z9) {
        if (this.f18591i2 == z9) {
            return;
        }
        this.f18591i2 = z9;
        if (z9) {
            M();
            return;
        }
        int L = org.telegram.messenger.g0.L(2.0f);
        setPadding(L, getPaddingTop(), L, getPaddingBottom());
    }

    @Override
    public void setGravity(int i7) {
        if (!this.f18592j2) {
            this.f18591i2 = false;
        }
        super.setGravity(i7);
    }

    public void setInlineButtonClickListener(e1 e1Var) {
        this.Z1 = e1Var;
    }

    public void setInlineButtonContext(int i7) {
        this.f18585b2 = i7;
        I();
    }

    @Override
    public void setInputType(int i7) {
        InputMethodManager inputMethodManager;
        if (getInputType() == i7) {
            this.f18602t2 = -1;
        } else if (isFocused() && SystemClock.uptimeMillis() - this.f18601s2 < 500) {
            if (this.f18602t2 < 0) {
                postDelayed(this.f18603u2, 500L);
            }
            this.f18602t2 = i7;
        } else {
            this.f18602t2 = -1;
            super.setInputType(i7);
            if (isFocused() && (inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method")) != null) {
                inputMethodManager.restartInput(this);
            }
        }
    }

    public void setListener(f1 f1Var) {
        this.Y1 = f1Var;
    }

    public void setLocked(boolean z9) {
        y0 y0Var;
        boolean z10;
        if (this.f18589g2 == z9) {
            return;
        }
        this.f18589g2 = z9;
        InputFilter[] filters = getFilters();
        int length = filters.length;
        int i7 = 0;
        while (true) {
            y0Var = this.f18599q2;
            if (i7 < length) {
                if (filters[i7] == y0Var) {
                    z10 = true;
                    break;
                }
                i7++;
            } else {
                z10 = false;
                break;
            }
        }
        if (z9 && !z10) {
            InputFilter[] inputFilterArr = new InputFilter[filters.length + 1];
            System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
            inputFilterArr[filters.length] = y0Var;
            setFilters(inputFilterArr);
        }
        boolean z11 = !z9;
        setAllowDrawCursor(z11);
        setCursorVisible(z11);
    }

    public void setSoftEnterNewline(boolean z9) {
        this.f18587e2 = z9;
    }

    @Override
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        if (!this.f18607y2) {
            this.f18605w2 = true;
        }
    }

    public void setTextColorKey(int i7) {
        this.f18604v2 = i7;
        this.f18605w2 = false;
        updateColors();
    }

    public void setTextSilently(CharSequence charSequence) {
        this.f18586c2 = true;
        setText(charSequence);
        I();
        setSelection(length());
        this.f18586c2 = false;
    }

    @Override
    public final void updateColors() {
        int w02;
        int w03;
        this.f18607y2 = true;
        try {
            boolean z9 = this.f18605w2;
            f6 f6Var = this.f18584a2;
            if (!z9 && getCurrentTextColor() != (w03 = k6.w0(this.f18604v2, f6Var))) {
                setTextColor(w03);
            }
            if (this.f18606x2 || getCurrentHintTextColor() == this.f18608z2) {
                this.f18606x2 = false;
                if (this.f18588f2) {
                    w02 = k6.r1(0.5f, k6.w0(k6.Ci, f6Var));
                } else {
                    w02 = k6.w0(k6.H6, f6Var);
                }
                this.f18608z2 = w02;
                int currentHintTextColor = getCurrentHintTextColor();
                int i7 = this.f18608z2;
                if (currentHintTextColor != i7) {
                    setHintTextColor(i7);
                }
            }
            this.f18607y2 = false;
            int w04 = k6.w0(k6.Uc, f6Var);
            if (getLinkTextColors() == null || getLinkTextColors().getDefaultColor() != w04) {
                setLinkTextColor(w04);
            }
            setCursorColor(k6.w0(k6.G6, f6Var));
            setHandlesColor(k6.w0(k6.f27999l6, f6Var));
            boolean h12 = k6.h1();
            d1 d1Var = this.A2;
            if (!h12) {
                removeCallbacks(d1Var);
                I();
                return;
            }
            removeCallbacks(d1Var);
            postDelayed(d1Var, 100L);
        } catch (Throwable th2) {
            this.f18607y2 = false;
            throw th2;
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
    }
}

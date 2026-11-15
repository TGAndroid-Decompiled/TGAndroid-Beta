package oi;

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
import org.telegram.messenger.fu;
import org.telegram.messenger.m10;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.xy0;
public final class e1 extends ft implements org.telegram.ui.ActionBar.z5 {
    public final b1 A2;
    public int B2;
    public boolean C2;
    public boolean D2;
    public boolean E2;
    public int F2;
    public final b1 G2;
    public float H2;
    public float I2;
    public long J2;
    public int K2;
    public f4 L2;
    public boolean M2;
    public final x0 N2;
    public d1 f21653e2;
    public c1 f21654f2;
    public final e6 f21655g2;
    public int f21656h2;
    public boolean f21657i2;
    public boolean f21658j2;
    public boolean f21659k2;
    public boolean f21660l2;
    public boolean f21661m2;
    public boolean f21662n2;
    public boolean f21663o2;
    public boolean f21664p2;
    public boolean f21665q2;
    public u70 f21666r2;
    public Paint f21667s2;
    public Layout f21668t2;
    public int f21669u2;
    public boolean f21670v2;
    public final w0 f21671w2;
    public TL_iv.PageBlock f21672x2;
    public long f21673y2;
    public int f21674z2;

    public e1(Context context, e6 e6Var) {
        super(context, e6Var);
        boolean z10;
        this.f21656h2 = m10.f24940t0;
        this.f21669u2 = -1;
        this.f21670v2 = true;
        this.f21671w2 = new InputFilter() {
            @Override
            public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
                e1 e1Var = e1.this;
                if (!e1Var.f21661m2 || e1Var.f21657i2) {
                    return null;
                }
                d1 d1Var = e1Var.f21653e2;
                if (d1Var != null && charSequence != null && i10 > i7 && i11 == i12) {
                    d1Var.I(charSequence.subSequence(i7, i10));
                }
                return spanned.subSequence(i11, i12);
            }
        };
        this.f21674z2 = -1;
        this.A2 = new b1(this, 0);
        this.B2 = j6.G6;
        this.G2 = new b1(this, 1);
        this.N2 = new x0(this, 0);
        this.f21655g2 = e6Var;
        this.f34695c2 = true;
        setBackground(null);
        setCursorWidth(1.5f);
        setGravity(8388659);
        setInputType(getInputType() | 147456);
        setImeOptions(5);
        y0 y0Var = new y0(0);
        z0 z0Var = new z0(this);
        setCustomSelectionActionModeCallback(y0Var);
        setCustomInsertionActionModeCallback(z0Var);
        setOnLongClickListener(new hi.p4(this, 3));
        if (length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setLongClickable(z10);
        setOnEditorActionListener(new di.m(this, 2));
        addTextChangedListener(new a1(this));
        this.C2 = false;
        this.D2 = true;
        updateColors();
    }

    @Override
    public final h41 B(String str) {
        return a6.k(str);
    }

    public final void J() {
        Editable text = getText();
        if (text != null) {
            f4[] f4VarArr = (f4[]) text.getSpans(0, text.length(), f4.class);
            for (f4 f4Var : f4VarArr) {
                f4Var.d(text);
            }
            for (f4 f4Var2 : f4VarArr) {
                f4Var2.a(this.f21656h2, this, this.f21655g2);
            }
        }
    }

    public final void K() {
        org.telegram.ui.ActionBar.u3 u3Var = this.Z0;
        if (u3Var != null) {
            try {
                u3Var.finish();
            } catch (Exception unused) {
            }
        }
    }

    public final f4 L(float f10, float f11) {
        int totalPaddingTop;
        f4[] f4VarArr;
        Layout layout = getLayout();
        Editable text = getText();
        if (layout != null && text != null && text.length() != 0 && (totalPaddingTop = (int) ((f11 - getTotalPaddingTop()) + getScrollY())) >= 0 && totalPaddingTop <= layout.getHeight()) {
            int lineForVertical = layout.getLineForVertical(totalPaddingTop);
            float totalPaddingLeft = (f10 - getTotalPaddingLeft()) + getScrollX();
            for (f4 f4Var : (f4[]) text.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), f4.class)) {
                int spanStart = text.getSpanStart(f4Var);
                int spanEnd = text.getSpanEnd(f4Var);
                if (spanStart >= 0 && spanEnd > spanStart) {
                    float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                    float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
                    if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - org.telegram.messenger.g0.L(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + org.telegram.messenger.g0.L(2.0f)) {
                        return f4Var;
                    }
                }
            }
        }
        return null;
    }

    public final void M() {
        int max = Math.max(0, getSelectionStart());
        int max2 = Math.max(0, getSelectionEnd());
        if (max > max2) {
            max2 = max;
            max = max2;
        }
        this.f21658j2 = true;
        getText().replace(max, max2, "\n");
        this.f21658j2 = false;
        setSelection(max + 1);
    }

    public final void N() {
        if (!this.f21663o2) {
            return;
        }
        this.f21664p2 = true;
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
        this.f21664p2 = false;
    }

    public final void O() {
        d1 d1Var = this.f21653e2;
        if (d1Var != null) {
            d1Var.d(this);
        }
        requestFocus();
        org.telegram.messenger.g0.J3(this);
    }

    public final void P() {
        K();
        if (isFocused()) {
            clearFocus();
        }
        O();
        K();
        post(new x0(this, 1));
    }

    @Override
    public final void a(int i7, int i10, int i11) {
        int min;
        Editable text = getText();
        if (text != null && i10 >= 0 && i11 >= 0 && i10 < i11 && i10 < (min = Math.min(i11, text.length()))) {
            a6.o(text, i10, min, i7, true, this.f21672x2);
            if ((i7 & 256) != 0) {
                h();
            }
            dt dtVar = this.T1;
            if (dtVar != null) {
                dtVar.E();
            }
            this.f21670v2 = true;
            invalidate();
        }
    }

    @Override
    public final void b(int i7, int i10, int i11) {
        int min;
        Editable text = getText();
        if (text != null && i10 >= 0 && i11 >= 0 && i10 < i11 && i10 < (min = Math.min(i11, text.length()))) {
            if ((i7 & 1) != 0) {
                this.f21665q2 = false;
            }
            a6.o(text, i10, min, i7, false, this.f21672x2);
            if ((i7 & 256) != 0) {
                h();
            }
            dt dtVar = this.T1;
            if (dtVar != null) {
                dtVar.E();
            }
            this.f21670v2 = true;
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
        return a6.q(max, min, text);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10;
        d1 d1Var;
        if (keyEvent.getKeyCode() == 61) {
            if (keyEvent.getAction() == 0 && (d1Var = this.f21653e2) != null) {
                d1Var.h0(keyEvent.isShiftPressed());
                return true;
            }
        } else {
            int keyCode = keyEvent.getKeyCode();
            if ((keyCode == 66 || keyCode == 160) && this.f21653e2 != null && !this.f21662n2) {
                if (keyEvent.getAction() == 0) {
                    if ((keyEvent.getFlags() & 2) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f21659k2 && (z10 || keyEvent.isShiftPressed())) {
                        M();
                        return true;
                    }
                    this.f21653e2.z(this);
                }
            } else {
                return super.dispatchKeyEvent(keyEvent);
            }
        }
        return true;
    }

    @Override
    public e6 getResourcesProvider() {
        return this.f21655g2;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        J();
    }

    @Override
    public final void onDetachedFromWindow() {
        f4[] f4VarArr;
        org.telegram.messenger.g0.r(this.N2);
        this.L2 = null;
        this.M2 = false;
        Editable text = getText();
        if (text != null) {
            for (f4 f4Var : (f4[]) text.getSpans(0, text.length(), f4.class)) {
                fu fuVar = f4Var.f21698b;
                if (fuVar != null && f4Var.f21699c == this) {
                    fuVar.b(this);
                    f4Var.f21699c = null;
                }
            }
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        xy0[] xy0VarArr;
        int i7;
        int i10;
        float f10;
        Layout layout = getLayout();
        u70 u70Var = null;
        if (layout == null) {
            this.f21666r2 = null;
            this.f21668t2 = null;
            this.f21669u2 = -1;
        } else {
            CharSequence text = layout.getText();
            if (this.f21670v2 || layout != this.f21668t2 || text.length() != this.f21669u2) {
                this.f21670v2 = false;
                this.f21668t2 = layout;
                this.f21669u2 = text.length();
                this.f21666r2 = null;
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    for (xy0 xy0Var : (xy0[]) spanned.getSpans(0, spanned.length(), xy0.class)) {
                        int i11 = xy0Var.f41795b.f41487a;
                        if ((65536 & i11) != 0) {
                            int spanStart = spanned.getSpanStart(xy0Var);
                            int spanEnd = spanned.getSpanEnd(xy0Var);
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                if (u70Var == null) {
                                    u70Var = new u70(0);
                                    u70Var.f39946n = false;
                                }
                                u70Var.d(layout, spanStart, 0.0f);
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
                                u70Var.f39947o = i10;
                                layout.getSelectionPath(spanStart, spanEnd, u70Var);
                            }
                        }
                    }
                    if (u70Var != null) {
                        u70Var.f39946n = true;
                    }
                    this.f21666r2 = u70Var;
                }
            }
        }
        if (this.f21666r2 != null) {
            if (this.f21667s2 == null) {
                Paint paint = new Paint(1);
                this.f21667s2 = paint;
                paint.setPathEffect(u70.c());
            }
            this.f21667s2.setColor(j6.w0(j6.K6, this.f21655g2) & 872415231);
            canvas.save();
            canvas.translate(getPaddingLeft(), this.P);
            canvas.drawPath(this.f21666r2, this.f21667s2);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (i7 == 67 && this.f21653e2 != null) {
            this.f21673y2 = SystemClock.uptimeMillis();
            if (length() == 0) {
                this.f21653e2.B();
                return true;
            } else if (getSelectionStart() == 0 && getSelectionEnd() == 0 && this.f21653e2.o(this)) {
                return true;
            }
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override
    public final void onSelectionChanged(int i7, int i10) {
        super.onSelectionChanged(i7, i10);
        d1 d1Var = this.f21653e2;
        if (d1Var != null) {
            d1Var.Z(this, i7, i10);
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        N();
    }

    @Override
    public final boolean onTextContextMenuItem(int i7) {
        d1 d1Var;
        d1 d1Var2;
        if (i7 != 16908319 || (d1Var2 = this.f21653e2) == null || !d1Var2.g()) {
            if (i7 == 16908322 && (d1Var = this.f21653e2) != null && d1Var.q0(this)) {
                return true;
            }
            return super.onTextContextMenuItem(i7);
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f10;
        boolean z10;
        boolean z11;
        if (motionEvent.getAction() == 0 && this.f21653e2 != null && isEnabled() && isFocusable()) {
            this.f21653e2.d(this);
        }
        if (!this.f21661m2) {
            int action = motionEvent.getAction();
            q qVar = null;
            x0 x0Var = this.N2;
            int i7 = 0;
            if (action == 0) {
                this.H2 = motionEvent.getX();
                this.I2 = motionEvent.getY();
                this.J2 = motionEvent.getEventTime();
                f4 L = L(motionEvent.getX(), motionEvent.getY());
                this.L2 = L;
                if (L != null && this.f21654f2 != null) {
                    this.M2 = false;
                    L.b().f23550a.m(true);
                    org.telegram.messenger.g0.r(x0Var);
                    org.telegram.messenger.g0.i3(x0Var, ViewConfiguration.getLongPressTimeout());
                    return true;
                }
                this.L2 = null;
            } else {
                f4 f4Var = this.L2;
                if (f4Var != null) {
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (motionEvent.getAction() != 3 && L(motionEvent.getX(), motionEvent.getY()) == f4Var) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11 || z10) {
                        f4Var.b().f23550a.m(false);
                        org.telegram.messenger.g0.r(x0Var);
                    }
                    if (z10) {
                        this.L2 = null;
                        if (!this.M2 && z11 && motionEvent.getAction() == 1) {
                            ((p2) this.f21654f2).a(this, f4Var, false);
                        }
                        this.M2 = false;
                    }
                    return true;
                } else if (motionEvent.getAction() == 1) {
                    if (this.K2 == 0) {
                        this.K2 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                    }
                    float x10 = motionEvent.getX() - this.H2;
                    float y10 = motionEvent.getY() - this.I2;
                    float f11 = (y10 * y10) + (x10 * x10);
                    int i10 = this.K2;
                    if (f11 <= i10 * i10 && motionEvent.getEventTime() - this.J2 < ViewConfiguration.getLongPressTimeout()) {
                        float x11 = motionEvent.getX();
                        float y11 = motionEvent.getY();
                        Layout layout = getLayout();
                        Editable text = getText();
                        if (layout != null && text != null && text.length() != 0) {
                            int lineForVertical = layout.getLineForVertical((int) ((y11 - getTotalPaddingTop()) + getScrollY()));
                            float totalPaddingLeft = (x11 - getTotalPaddingLeft()) + getScrollX();
                            if (totalPaddingLeft >= layout.getLineLeft(lineForVertical) - org.telegram.messenger.g0.L(2.0f) && totalPaddingLeft <= layout.getLineRight(lineForVertical) + org.telegram.messenger.g0.L(2.0f)) {
                                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, totalPaddingLeft);
                                q[] qVarArr = (q[]) text.getSpans(Math.max(0, offsetForHorizontal - 1), Math.min(text.length(), offsetForHorizontal + 1), q.class);
                                int length = qVarArr.length;
                                while (true) {
                                    if (i7 >= length) {
                                        break;
                                    }
                                    q qVar2 = qVarArr[i7];
                                    int spanStart = text.getSpanStart(qVar2);
                                    int spanEnd = text.getSpanEnd(qVar2);
                                    if (spanStart >= 0 && spanEnd >= 0) {
                                        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                                        if (spanEnd <= text.length()) {
                                            f10 = layout.getPrimaryHorizontal(spanEnd);
                                        } else {
                                            f10 = primaryHorizontal;
                                        }
                                        if (totalPaddingLeft >= Math.min(primaryHorizontal, f10) - org.telegram.messenger.g0.L(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, f10) + org.telegram.messenger.g0.L(2.0f)) {
                                            qVar = qVar2;
                                            break;
                                        }
                                    }
                                    i7++;
                                }
                            }
                        }
                        if (qVar != null) {
                            o.Z(getContext(), qVar.f21900a, new li.v(2, this, qVar), this.f21655g2);
                            return true;
                        }
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAccentHint(boolean z10) {
        if (this.f21660l2 == z10) {
            return;
        }
        this.f21660l2 = z10;
        this.D2 = true;
        updateColors();
    }

    public void setAllowNewlines(boolean z10) {
        this.f21662n2 = z10;
    }

    public void setAutoBold(boolean z10) {
        this.f21665q2 = z10;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.f21672x2 = pageBlock;
    }

    public void setCenterEmptyHint(boolean z10) {
        if (this.f21663o2 == z10) {
            return;
        }
        this.f21663o2 = z10;
        if (z10) {
            N();
            return;
        }
        int L = org.telegram.messenger.g0.L(2.0f);
        setPadding(L, getPaddingTop(), L, getPaddingBottom());
    }

    @Override
    public void setGravity(int i7) {
        if (!this.f21664p2) {
            this.f21663o2 = false;
        }
        super.setGravity(i7);
    }

    public void setInlineButtonClickListener(c1 c1Var) {
        this.f21654f2 = c1Var;
    }

    public void setInlineButtonContext(int i7) {
        this.f21656h2 = i7;
        J();
    }

    @Override
    public void setInputType(int i7) {
        InputMethodManager inputMethodManager;
        if (getInputType() == i7) {
            this.f21674z2 = -1;
        } else if (isFocused() && SystemClock.uptimeMillis() - this.f21673y2 < 500) {
            if (this.f21674z2 < 0) {
                postDelayed(this.A2, 500L);
            }
            this.f21674z2 = i7;
        } else {
            this.f21674z2 = -1;
            super.setInputType(i7);
            if (isFocused() && (inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method")) != null) {
                inputMethodManager.restartInput(this);
            }
        }
    }

    public void setListener(d1 d1Var) {
        this.f21653e2 = d1Var;
    }

    public void setLocked(boolean z10) {
        w0 w0Var;
        boolean z11;
        if (this.f21661m2 == z10) {
            return;
        }
        this.f21661m2 = z10;
        InputFilter[] filters = getFilters();
        int length = filters.length;
        int i7 = 0;
        while (true) {
            w0Var = this.f21671w2;
            if (i7 < length) {
                if (filters[i7] == w0Var) {
                    z11 = true;
                    break;
                }
                i7++;
            } else {
                z11 = false;
                break;
            }
        }
        if (z10 && !z11) {
            InputFilter[] inputFilterArr = new InputFilter[filters.length + 1];
            System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
            inputFilterArr[filters.length] = w0Var;
            setFilters(inputFilterArr);
        }
        boolean z12 = !z10;
        setAllowDrawCursor(z12);
        setCursorVisible(z12);
    }

    public void setSoftEnterNewline(boolean z10) {
        this.f21659k2 = z10;
    }

    @Override
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        if (!this.E2) {
            this.C2 = true;
        }
    }

    public void setTextColorKey(int i7) {
        this.B2 = i7;
        this.C2 = false;
        updateColors();
    }

    public void setTextSilently(CharSequence charSequence) {
        this.f21657i2 = true;
        setText(charSequence);
        J();
        setSelection(length());
        this.f21657i2 = false;
    }

    @Override
    public final void updateColors() {
        int w02;
        int w03;
        this.E2 = true;
        try {
            boolean z10 = this.C2;
            e6 e6Var = this.f21655g2;
            if (!z10 && getCurrentTextColor() != (w03 = j6.w0(this.B2, e6Var))) {
                setTextColor(w03);
            }
            if (this.D2 || getCurrentHintTextColor() == this.F2) {
                this.D2 = false;
                if (this.f21660l2) {
                    w02 = j6.r1(0.5f, j6.w0(j6.Fi, e6Var));
                } else {
                    w02 = j6.w0(j6.H6, e6Var);
                }
                this.F2 = w02;
                int currentHintTextColor = getCurrentHintTextColor();
                int i7 = this.F2;
                if (currentHintTextColor != i7) {
                    setHintTextColor(i7);
                }
            }
            this.E2 = false;
            int w04 = j6.w0(j6.Xc, e6Var);
            if (getLinkTextColors() == null || getLinkTextColors().getDefaultColor() != w04) {
                setLinkTextColor(w04);
            }
            setCursorColor(j6.w0(j6.G6, e6Var));
            setHandlesColor(j6.w0(j6.f28996l6, e6Var));
            boolean h12 = j6.h1();
            b1 b1Var = this.G2;
            if (!h12) {
                removeCallbacks(b1Var);
                J();
                return;
            }
            removeCallbacks(b1Var);
            postDelayed(b1Var, 100L);
        } catch (Throwable th2) {
            this.E2 = false;
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

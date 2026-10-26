package li;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.s90;
import org.telegram.ui.Components.z11;
import org.telegram.ui.Components.z61;
public final class g1 extends ju implements p6 {
    public boolean E;
    public s90 F;
    public Paint G;
    public Layout H;
    public int I;
    public boolean J;
    public final z0 K;
    public TL_iv.PageBlock L;
    public int M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public final a5.d R;
    public float S;
    public float T;
    public long U;
    public int V;
    public k4 W;
    public boolean f17246a0;
    public final a1 f17247b0;
    public f1 f17248c;
    public e1 d;
    public final u6 e;
    public int f17249f;
    public boolean h;
    public boolean f17250n;
    public boolean f17251r;
    public boolean f17252s;
    public boolean v;
    public boolean f17253w;
    public boolean f17254x;
    public boolean f17255y;

    public g1(Context context, u6 u6Var) {
        super(context, u6Var);
        boolean z10;
        this.f17249f = UserConfig.selectedAccount;
        this.I = -1;
        this.J = true;
        this.K = new InputFilter() {
            @Override
            public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
                g1 g1Var = g1.this;
                if (!g1Var.v || g1Var.h) {
                    return null;
                }
                f1 f1Var = g1Var.f17248c;
                if (f1Var != null && charSequence != null && i11 > i10 && i12 == i13) {
                    f1Var.T(charSequence.subSequence(i10, i11));
                }
                return spanned.subSequence(i12, i13);
            }
        };
        this.M = y6.G6;
        this.R = new a5.d(this, 28);
        this.f17247b0 = new a1(this, 0);
        this.e = u6Var;
        this.adaptiveCreateLinkDialog = true;
        setBackground(null);
        setCursorWidth(1.5f);
        setGravity(8388659);
        setInputType(getInputType() | 147456);
        setImeOptions(5);
        b1 b1Var = new b1(0);
        c1 c1Var = new c1(this);
        setCustomSelectionActionModeCallback(b1Var);
        setCustomInsertionActionModeCallback(c1Var);
        setOnLongClickListener(new fi.b5(this, 2));
        if (length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setLongClickable(z10);
        setOnEditorActionListener(new bi.o(this, 2));
        addTextChangedListener(new d1(this));
        this.N = false;
        this.O = true;
        updateColors();
    }

    @Override
    public final void addStyle(int i10, int i11, int i12) {
        int min;
        Editable text = getText();
        if (text != null && i11 >= 0 && i12 >= 0 && i11 < i12 && i11 < (min = Math.min(i12, text.length()))) {
            f6.o(text, i11, min, i10, true, this.L);
            if ((i10 & 256) != 0) {
                invalidateSpoilers();
            }
            notifySpansChanged();
        }
    }

    @Override
    public final z61 createUrlSpan(String str) {
        return f6.k(str);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10;
        f1 f1Var;
        if (keyEvent.getKeyCode() == 61) {
            if (keyEvent.getAction() == 0 && (f1Var = this.f17248c) != null) {
                f1Var.f0(keyEvent.isShiftPressed());
                return true;
            }
        } else {
            int keyCode = keyEvent.getKeyCode();
            if ((keyCode == 66 || keyCode == 160) && this.f17248c != null && !this.f17253w) {
                if (keyEvent.getAction() == 0) {
                    if ((keyEvent.getFlags() & 2) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f17251r && (z10 || keyEvent.isShiftPressed())) {
                        p();
                        return true;
                    }
                    this.f17248c.t(this);
                }
            } else {
                return super.dispatchKeyEvent(keyEvent);
            }
        }
        return true;
    }

    @Override
    public final int getCurrentStyle(int i10, int i11) {
        int max;
        int min;
        Editable text = getText();
        if (text == null || (max = Math.max(0, i10)) >= (min = Math.min(i11, text.length()))) {
            return 0;
        }
        return f6.q(max, min, text);
    }

    @Override
    public u6 getResourcesProvider() {
        return this.e;
    }

    public final void m() {
        Editable text = getText();
        if (text != null) {
            k4[] k4VarArr = (k4[]) text.getSpans(0, text.length(), k4.class);
            for (k4 k4Var : k4VarArr) {
                k4Var.d(text);
            }
            for (k4 k4Var2 : k4VarArr) {
                k4Var2.a(this.f17249f, this, this.e);
            }
        }
    }

    public final void n() {
        org.telegram.ui.ActionBar.m4 m4Var = this.floatingActionMode;
        if (m4Var != null) {
            try {
                m4Var.finish();
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void notifySpansChanged() {
        super.notifySpansChanged();
        this.J = true;
        invalidate();
    }

    public final k4 o(float f7, float f10) {
        int totalPaddingTop;
        k4[] k4VarArr;
        Layout layout = getLayout();
        Editable text = getText();
        if (layout != null && text != null && text.length() != 0 && (totalPaddingTop = (int) ((f10 - getTotalPaddingTop()) + getScrollY())) >= 0 && totalPaddingTop <= layout.getHeight()) {
            int lineForVertical = layout.getLineForVertical(totalPaddingTop);
            float totalPaddingLeft = (f7 - getTotalPaddingLeft()) + getScrollX();
            for (k4 k4Var : (k4[]) text.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), k4.class)) {
                int spanStart = text.getSpanStart(k4Var);
                int spanEnd = text.getSpanEnd(k4Var);
                if (spanStart >= 0 && spanEnd > spanStart) {
                    float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                    float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
                    if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + AndroidUtilities.dp(2.0f)) {
                        return k4Var;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m();
    }

    @Override
    public final void onDetachedFromWindow() {
        k4[] k4VarArr;
        AndroidUtilities.cancelRunOnUIThread(this.f17247b0);
        this.W = null;
        this.f17246a0 = false;
        Editable text = getText();
        if (text != null) {
            for (k4 k4Var : (k4[]) text.getSpans(0, text.length(), k4.class)) {
                RichMessageLayout.RichButtonSpan richButtonSpan = k4Var.f17331b;
                if (richButtonSpan != null && k4Var.f17332c == this) {
                    richButtonSpan.detach(this);
                    k4Var.f17332c = null;
                }
            }
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        z11[] z11VarArr;
        int i10;
        int i11;
        float f7;
        Layout layout = getLayout();
        s90 s90Var = null;
        if (layout == null) {
            this.F = null;
            this.H = null;
            this.I = -1;
        } else {
            CharSequence text = layout.getText();
            if (this.J || layout != this.H || text.length() != this.I) {
                this.J = false;
                this.H = layout;
                this.I = text.length();
                this.F = null;
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    for (z11 z11Var : (z11[]) spanned.getSpans(0, spanned.length(), z11.class)) {
                        int i12 = z11Var.f35181b.f34907a;
                        if ((65536 & i12) != 0) {
                            int spanStart = spanned.getSpanStart(z11Var);
                            int spanEnd = spanned.getSpanEnd(z11Var);
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                if (s90Var == null) {
                                    s90Var = new s90(0);
                                    s90Var.f32486n = false;
                                }
                                s90Var.d(layout, spanStart, 0.0f);
                                if ((32768 & i12) != 0) {
                                    i10 = -AndroidUtilities.dp(6.0f);
                                } else if ((i12 & 16384) != 0) {
                                    i10 = AndroidUtilities.dp(2.0f);
                                } else {
                                    i10 = 0;
                                }
                                if (i10 != 0) {
                                    if (i10 > 0) {
                                        f7 = 5.0f;
                                    } else {
                                        f7 = -2.0f;
                                    }
                                    i11 = AndroidUtilities.dp(f7) + i10;
                                } else {
                                    i11 = 0;
                                }
                                s90Var.f32487o = i11;
                                layout.getSelectionPath(spanStart, spanEnd, s90Var);
                            }
                        }
                    }
                    if (s90Var != null) {
                        s90Var.f32486n = true;
                    }
                    this.F = s90Var;
                }
            }
        }
        if (this.F != null) {
            if (this.G == null) {
                Paint paint = new Paint(1);
                this.G = paint;
                paint.setPathEffect(s90.c());
            }
            this.G.setColor(y6.w0(y6.K6, this.e) & 872415231);
            canvas.save();
            canvas.translate(getPaddingLeft(), this.offsetY);
            canvas.drawPath(this.F, this.G);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 67 && this.f17248c != null) {
            if (length() == 0) {
                this.f17248c.R();
                return true;
            } else if (getSelectionStart() == 0 && getSelectionEnd() == 0 && this.f17248c.o(this)) {
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        f1 f1Var = this.f17248c;
        if (f1Var != null) {
            f1Var.E(this, i10, i11);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        q();
    }

    @Override
    public final boolean onTextContextMenuItem(int i10) {
        f1 f1Var;
        f1 f1Var2;
        if (i10 != 16908319 || (f1Var2 = this.f17248c) == null || !f1Var2.e()) {
            if (i10 == 16908322 && (f1Var = this.f17248c) != null && f1Var.g(this)) {
                return true;
            }
            return super.onTextContextMenuItem(i10);
        }
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f7;
        boolean z10;
        boolean z11;
        if (motionEvent.getAction() == 0 && this.f17248c != null && isEnabled() && isFocusable()) {
            this.f17248c.b(this);
        }
        if (!this.v) {
            int action = motionEvent.getAction();
            s sVar = null;
            a1 a1Var = this.f17247b0;
            int i10 = 0;
            if (action == 0) {
                this.S = motionEvent.getX();
                this.T = motionEvent.getY();
                this.U = motionEvent.getEventTime();
                k4 o10 = o(motionEvent.getX(), motionEvent.getY());
                this.W = o10;
                if (o10 != null && this.d != null) {
                    this.f17246a0 = false;
                    o10.b().setPressed(true);
                    AndroidUtilities.cancelRunOnUIThread(a1Var);
                    AndroidUtilities.runOnUIThread(a1Var, ViewConfiguration.getLongPressTimeout());
                    return true;
                }
                this.W = null;
            } else {
                k4 k4Var = this.W;
                if (k4Var != null) {
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (motionEvent.getAction() != 3 && o(motionEvent.getX(), motionEvent.getY()) == k4Var) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11 || z10) {
                        k4Var.b().setPressed(false);
                        AndroidUtilities.cancelRunOnUIThread(a1Var);
                    }
                    if (z10) {
                        this.W = null;
                        if (!this.f17246a0 && z11 && motionEvent.getAction() == 1) {
                            ((r2) this.d).a(this, k4Var, false);
                        }
                        this.f17246a0 = false;
                    }
                    return true;
                } else if (motionEvent.getAction() == 1) {
                    if (this.V == 0) {
                        this.V = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                    }
                    float x9 = motionEvent.getX() - this.S;
                    float y3 = motionEvent.getY() - this.T;
                    float f10 = (y3 * y3) + (x9 * x9);
                    int i11 = this.V;
                    if (f10 <= i11 * i11 && motionEvent.getEventTime() - this.U < ViewConfiguration.getLongPressTimeout()) {
                        float x10 = motionEvent.getX();
                        float y10 = motionEvent.getY();
                        Layout layout = getLayout();
                        Editable text = getText();
                        if (layout != null && text != null && text.length() != 0) {
                            int lineForVertical = layout.getLineForVertical((int) ((y10 - getTotalPaddingTop()) + getScrollY()));
                            float totalPaddingLeft = (x10 - getTotalPaddingLeft()) + getScrollX();
                            if (totalPaddingLeft >= layout.getLineLeft(lineForVertical) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= layout.getLineRight(lineForVertical) + AndroidUtilities.dp(2.0f)) {
                                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, totalPaddingLeft);
                                s[] sVarArr = (s[]) text.getSpans(Math.max(0, offsetForHorizontal - 1), Math.min(text.length(), offsetForHorizontal + 1), s.class);
                                int length = sVarArr.length;
                                while (true) {
                                    if (i10 >= length) {
                                        break;
                                    }
                                    s sVar2 = sVarArr[i10];
                                    int spanStart = text.getSpanStart(sVar2);
                                    int spanEnd = text.getSpanEnd(sVar2);
                                    if (spanStart >= 0 && spanEnd >= 0) {
                                        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                                        if (spanEnd <= text.length()) {
                                            f7 = layout.getPrimaryHorizontal(spanEnd);
                                        } else {
                                            f7 = primaryHorizontal;
                                        }
                                        if (totalPaddingLeft >= Math.min(primaryHorizontal, f7) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, f7) + AndroidUtilities.dp(2.0f)) {
                                            sVar = sVar2;
                                            break;
                                        }
                                    }
                                    i10++;
                                }
                            }
                        }
                        if (sVar != null) {
                            q.X(getContext(), sVar.f17456a, new ai.n1(28, this, sVar), this.e);
                            return true;
                        }
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        int max = Math.max(0, getSelectionStart());
        int max2 = Math.max(0, getSelectionEnd());
        if (max > max2) {
            max2 = max;
            max = max2;
        }
        this.f17250n = true;
        getText().replace(max, max2, "\n");
        this.f17250n = false;
        setSelection(max + 1);
    }

    public final void q() {
        if (!this.f17254x) {
            return;
        }
        this.f17255y = true;
        int dp = AndroidUtilities.dp(2.0f);
        CharSequence hint = getHint();
        if (length() == 0 && getWidth() > 0 && !TextUtils.isEmpty(hint)) {
            int max = Math.max(0, Math.round(((getWidth() - (dp * 2)) - getPaint().measureText(hint.toString())) / 2.0f));
            super.setGravity(51);
            setPadding(max + dp, getPaddingTop(), dp, getPaddingBottom());
        } else {
            super.setGravity(17);
            setPadding(dp, getPaddingTop(), dp, getPaddingBottom());
        }
        this.f17255y = false;
    }

    public final void r() {
        f1 f1Var = this.f17248c;
        if (f1Var != null) {
            f1Var.b(this);
        }
        requestFocus();
        AndroidUtilities.showKeyboard(this);
    }

    @Override
    public final void removeStyle(int i10, int i11, int i12) {
        int min;
        Editable text = getText();
        if (text != null && i11 >= 0 && i12 >= 0 && i11 < i12 && i11 < (min = Math.min(i12, text.length()))) {
            if ((i10 & 1) != 0) {
                this.E = false;
            }
            f6.o(text, i11, min, i10, false, this.L);
            if ((i10 & 256) != 0) {
                invalidateSpoilers();
            }
            notifySpansChanged();
        }
    }

    public final void s() {
        n();
        if (isFocused()) {
            clearFocus();
        }
        r();
        n();
        post(new a1(this, 1));
    }

    public void setAccentHint(boolean z10) {
        if (this.f17252s == z10) {
            return;
        }
        this.f17252s = z10;
        this.O = true;
        updateColors();
    }

    public void setAllowNewlines(boolean z10) {
        this.f17253w = z10;
    }

    public void setAutoBold(boolean z10) {
        this.E = z10;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.L = pageBlock;
    }

    public void setCenterEmptyHint(boolean z10) {
        if (this.f17254x == z10) {
            return;
        }
        this.f17254x = z10;
        if (z10) {
            q();
            return;
        }
        int dp = AndroidUtilities.dp(2.0f);
        setPadding(dp, getPaddingTop(), dp, getPaddingBottom());
    }

    @Override
    public void setGravity(int i10) {
        if (!this.f17255y) {
            this.f17254x = false;
        }
        super.setGravity(i10);
    }

    public void setInlineButtonClickListener(e1 e1Var) {
        this.d = e1Var;
    }

    public void setInlineButtonContext(int i10) {
        this.f17249f = i10;
        m();
    }

    @Override
    public void setInputType(int i10) {
        boolean z10;
        InputMethodManager inputMethodManager;
        if (getInputType() != i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        super.setInputType(i10);
        if (z10 && isFocused() && (inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method")) != null) {
            inputMethodManager.restartInput(this);
        }
    }

    public void setListener(f1 f1Var) {
        this.f17248c = f1Var;
    }

    public void setLocked(boolean z10) {
        z0 z0Var;
        boolean z11;
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        InputFilter[] filters = getFilters();
        int length = filters.length;
        int i10 = 0;
        while (true) {
            z0Var = this.K;
            if (i10 < length) {
                if (filters[i10] == z0Var) {
                    z11 = true;
                    break;
                }
                i10++;
            } else {
                z11 = false;
                break;
            }
        }
        if (z10 && !z11) {
            InputFilter[] inputFilterArr = new InputFilter[filters.length + 1];
            System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
            inputFilterArr[filters.length] = z0Var;
            setFilters(inputFilterArr);
        }
        boolean z12 = !z10;
        setAllowDrawCursor(z12);
        setCursorVisible(z12);
    }

    public void setSoftEnterNewline(boolean z10) {
        this.f17251r = z10;
    }

    @Override
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        if (!this.P) {
            this.N = true;
        }
    }

    public void setTextColorKey(int i10) {
        this.M = i10;
        this.N = false;
        updateColors();
    }

    public void setTextSilently(CharSequence charSequence) {
        this.h = true;
        setText(charSequence);
        m();
        setSelection(length());
        this.h = false;
    }

    @Override
    public final void updateColors() {
        int w02;
        int w03;
        this.P = true;
        try {
            boolean z10 = this.N;
            u6 u6Var = this.e;
            if (!z10 && getCurrentTextColor() != (w03 = y6.w0(this.M, u6Var))) {
                setTextColor(w03);
            }
            if (this.O || getCurrentHintTextColor() == this.Q) {
                this.O = false;
                if (this.f17252s) {
                    w02 = y6.o1(0.5f, y6.w0(y6.Oh, u6Var));
                } else {
                    w02 = y6.w0(y6.H6, u6Var);
                }
                this.Q = w02;
                int currentHintTextColor = getCurrentHintTextColor();
                int i10 = this.Q;
                if (currentHintTextColor != i10) {
                    setHintTextColor(i10);
                }
            }
            this.P = false;
            int w04 = y6.w0(y6.gc, u6Var);
            if (getLinkTextColors() == null || getLinkTextColors().getDefaultColor() != w04) {
                setLinkTextColor(w04);
            }
            setCursorColor(y6.w0(y6.G6, u6Var));
            setHandlesColor(y6.w0(y6.f23502l6, u6Var));
            boolean g12 = y6.g1();
            a5.d dVar = this.R;
            if (!g12) {
                removeCallbacks(dVar);
                m();
                return;
            }
            removeCallbacks(dVar);
            postDelayed(dVar, 100L);
        } catch (Throwable th2) {
            this.P = false;
            throw th2;
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
    }
}

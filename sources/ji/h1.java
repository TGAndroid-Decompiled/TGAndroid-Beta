package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.zt;
public final class h1 extends zt {
    public boolean E;
    public x80 F;
    public Paint G;
    public Layout H;
    public int I;
    public boolean J;
    public final a1 K;
    public TL_iv.PageBlock L;
    public int M;
    public float N;
    public float O;
    public long P;
    public int Q;
    public k4 R;
    public boolean S;
    public final b1 T;
    public g1 f13947c;
    public f1 d;
    public final org.telegram.ui.ActionBar.f6 f13948e;
    public int f13949f;
    public boolean h;
    public boolean f13950n;
    public boolean f13951r;
    public boolean f13952s;
    public boolean v;
    public boolean f13953w;
    public boolean f13954x;
    public boolean f13955y;

    public h1(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f13949f = UserConfig.selectedAccount;
        this.I = -1;
        this.J = true;
        this.K = new InputFilter() {
            @Override
            public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
                h1 h1Var = h1.this;
                if (!h1Var.v || h1Var.h) {
                    return null;
                }
                g1 g1Var = h1Var.f13947c;
                if (g1Var != null && charSequence != null && i11 > i10 && i12 == i13) {
                    g1Var.y(charSequence.subSequence(i10, i11));
                }
                return spanned.subSequence(i12, i13);
            }
        };
        this.M = org.telegram.ui.ActionBar.j6.G6;
        this.T = new b1(this, 0);
        this.f13948e = f6Var;
        this.adaptiveCreateLinkDialog = true;
        setBackground(null);
        setCursorWidth(1.5f);
        setGravity(8388659);
        setInputType(getInputType() | 147456);
        setImeOptions(5);
        c1 c1Var = new c1(0);
        d1 d1Var = new d1(this);
        setCustomSelectionActionModeCallback(c1Var);
        if (Build.VERSION.SDK_INT >= 23) {
            setCustomInsertionActionModeCallback(d1Var);
        }
        setOnLongClickListener(new di.n5(this, 2));
        setLongClickable(length() == 0);
        setOnEditorActionListener(new ig.s0(this, 1));
        addTextChangedListener(new e1(this));
        t();
    }

    @Override
    public final void addStyle(int i10, int i11, int i12) {
        int min;
        Editable text = getText();
        if (text != null && i11 >= 0 && i12 >= 0 && i11 < i12 && i11 < (min = Math.min(i12, text.length()))) {
            i6.o(text, i11, min, i10, true, this.L);
            if ((i10 & 256) != 0) {
                invalidateSpoilers();
            }
            notifySpansChanged();
        }
    }

    @Override
    public final n51 createUrlSpan(String str) {
        return i6.k(str);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10;
        g1 g1Var;
        if (keyEvent.getKeyCode() == 61) {
            if (keyEvent.getAction() == 0 && (g1Var = this.f13947c) != null) {
                g1Var.R(keyEvent.isShiftPressed());
                return true;
            }
        } else {
            int keyCode = keyEvent.getKeyCode();
            if ((keyCode == 66 || keyCode == 160) && this.f13947c != null && !this.f13953w) {
                if (keyEvent.getAction() == 0) {
                    if ((keyEvent.getFlags() & 2) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f13951r && (z10 || keyEvent.isShiftPressed())) {
                        p();
                        return true;
                    }
                    this.f13947c.C(this);
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
        return i6.q(max, min, text);
    }

    @Override
    public org.telegram.ui.ActionBar.f6 getResourcesProvider() {
        return this.f13948e;
    }

    public final void m() {
        Editable text = getText();
        if (text != null) {
            k4[] k4VarArr = (k4[]) text.getSpans(0, text.length(), k4.class);
            for (k4 k4Var : k4VarArr) {
                k4Var.d(text);
            }
            for (k4 k4Var2 : k4VarArr) {
                k4Var2.a(this.f13949f, this, this.f13948e);
            }
        }
    }

    public final void n() {
        org.telegram.ui.ActionBar.i4 i4Var = this.floatingActionMode;
        if (i4Var != null) {
            try {
                i4Var.finish();
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
        AndroidUtilities.cancelRunOnUIThread(this.T);
        this.R = null;
        this.S = false;
        Editable text = getText();
        if (text != null) {
            for (k4 k4Var : (k4[]) text.getSpans(0, text.length(), k4.class)) {
                RichMessageLayout.RichButtonSpan richButtonSpan = k4Var.f14018b;
                if (richButtonSpan != null && k4Var.f14019c == this) {
                    richButtonSpan.detach(this);
                    k4Var.f14019c = null;
                }
            }
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        o01[] o01VarArr;
        int i10;
        int i11;
        float f7;
        Layout layout = getLayout();
        x80 x80Var = null;
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
                    for (o01 o01Var : (o01[]) spanned.getSpans(0, spanned.length(), o01.class)) {
                        int i12 = o01Var.f28912b.f28591a;
                        if ((65536 & i12) != 0) {
                            int spanStart = spanned.getSpanStart(o01Var);
                            int spanEnd = spanned.getSpanEnd(o01Var);
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                if (x80Var == null) {
                                    x80Var = new x80(0);
                                    x80Var.f32457n = false;
                                }
                                x80Var.d(layout, spanStart, 0.0f);
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
                                x80Var.f32458o = i11;
                                layout.getSelectionPath(spanStart, spanEnd, x80Var);
                            }
                        }
                    }
                    if (x80Var != null) {
                        x80Var.f32457n = true;
                    }
                    this.F = x80Var;
                }
            }
        }
        if (this.F != null) {
            if (this.G == null) {
                Paint paint = new Paint(1);
                this.G = paint;
                paint.setPathEffect(x80.c());
            }
            this.G.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.K6, this.f13948e) & 872415231);
            canvas.save();
            canvas.translate(getPaddingLeft(), this.offsetY);
            canvas.drawPath(this.F, this.G);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 67 && this.f13947c != null) {
            if (length() == 0) {
                this.f13947c.r();
                return true;
            } else if (getSelectionStart() == 0 && getSelectionEnd() == 0 && this.f13947c.h(this)) {
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        g1 g1Var = this.f13947c;
        if (g1Var != null) {
            g1Var.o(this, i10, i11);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        q();
    }

    @Override
    public final boolean onTextContextMenuItem(int i10) {
        g1 g1Var;
        g1 g1Var2;
        if (i10 != 16908319 || (g1Var2 = this.f13947c) == null || !g1Var2.e()) {
            if (i10 == 16908322 && (g1Var = this.f13947c) != null && g1Var.k(this)) {
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
        if (motionEvent.getAction() == 0 && this.f13947c != null && isEnabled() && isFocusable()) {
            this.f13947c.a(this);
        }
        if (!this.v) {
            int action = motionEvent.getAction();
            t tVar = null;
            b1 b1Var = this.T;
            int i10 = 0;
            if (action == 0) {
                this.N = motionEvent.getX();
                this.O = motionEvent.getY();
                this.P = motionEvent.getEventTime();
                k4 o9 = o(motionEvent.getX(), motionEvent.getY());
                this.R = o9;
                if (o9 != null && this.d != null) {
                    this.S = false;
                    o9.b().setPressed(true);
                    AndroidUtilities.cancelRunOnUIThread(b1Var);
                    AndroidUtilities.runOnUIThread(b1Var, ViewConfiguration.getLongPressTimeout());
                    return true;
                }
                this.R = null;
            } else {
                k4 k4Var = this.R;
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
                        AndroidUtilities.cancelRunOnUIThread(b1Var);
                    }
                    if (z10) {
                        this.R = null;
                        if (!this.S && z11 && motionEvent.getAction() == 1) {
                            ((s2) this.d).a(this, k4Var, false);
                        }
                        this.S = false;
                    }
                    return true;
                } else if (motionEvent.getAction() == 1) {
                    if (this.Q == 0) {
                        this.Q = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                    }
                    float x10 = motionEvent.getX() - this.N;
                    float y3 = motionEvent.getY() - this.O;
                    float f10 = (y3 * y3) + (x10 * x10);
                    int i11 = this.Q;
                    if (f10 <= i11 * i11 && motionEvent.getEventTime() - this.P < ViewConfiguration.getLongPressTimeout()) {
                        float x11 = motionEvent.getX();
                        float y10 = motionEvent.getY();
                        Layout layout = getLayout();
                        Editable text = getText();
                        if (layout != null && text != null && text.length() != 0) {
                            int lineForVertical = layout.getLineForVertical((int) ((y10 - getTotalPaddingTop()) + getScrollY()));
                            float totalPaddingLeft = (x11 - getTotalPaddingLeft()) + getScrollX();
                            if (totalPaddingLeft >= layout.getLineLeft(lineForVertical) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= layout.getLineRight(lineForVertical) + AndroidUtilities.dp(2.0f)) {
                                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, totalPaddingLeft);
                                t[] tVarArr = (t[]) text.getSpans(Math.max(0, offsetForHorizontal - 1), Math.min(text.length(), offsetForHorizontal + 1), t.class);
                                int length = tVarArr.length;
                                while (true) {
                                    if (i10 >= length) {
                                        break;
                                    }
                                    t tVar2 = tVarArr[i10];
                                    int spanStart = text.getSpanStart(tVar2);
                                    int spanEnd = text.getSpanEnd(tVar2);
                                    if (spanStart >= 0 && spanEnd >= 0) {
                                        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                                        if (spanEnd <= text.length()) {
                                            f7 = layout.getPrimaryHorizontal(spanEnd);
                                        } else {
                                            f7 = primaryHorizontal;
                                        }
                                        if (totalPaddingLeft >= Math.min(primaryHorizontal, f7) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, f7) + AndroidUtilities.dp(2.0f)) {
                                            tVar = tVar2;
                                            break;
                                        }
                                    }
                                    i10++;
                                }
                            }
                        }
                        if (tVar != null) {
                            r.U(getContext(), tVar.f14172a, new di.m2(19, this, tVar), this.f13948e);
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
        this.f13950n = true;
        getText().replace(max, max2, "\n");
        this.f13950n = false;
        setSelection(max + 1);
    }

    public final void q() {
        if (!this.f13954x) {
            return;
        }
        this.f13955y = true;
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
        this.f13955y = false;
    }

    public final void r() {
        g1 g1Var = this.f13947c;
        if (g1Var != null) {
            g1Var.a(this);
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
            i6.o(text, i11, min, i10, false, this.L);
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
        post(new b1(this, 1));
    }

    public void setAccentHint(boolean z10) {
        if (this.f13952s == z10) {
            return;
        }
        this.f13952s = z10;
        t();
    }

    public void setAllowNewlines(boolean z10) {
        this.f13953w = z10;
    }

    public void setAutoBold(boolean z10) {
        this.E = z10;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.L = pageBlock;
    }

    public void setCenterEmptyHint(boolean z10) {
        if (this.f13954x == z10) {
            return;
        }
        this.f13954x = z10;
        if (z10) {
            q();
            return;
        }
        int dp = AndroidUtilities.dp(2.0f);
        setPadding(dp, getPaddingTop(), dp, getPaddingBottom());
    }

    @Override
    public void setGravity(int i10) {
        if (!this.f13955y) {
            this.f13954x = false;
        }
        super.setGravity(i10);
    }

    public void setInlineButtonClickListener(f1 f1Var) {
        this.d = f1Var;
    }

    public void setInlineButtonContext(int i10) {
        this.f13949f = i10;
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

    public void setListener(g1 g1Var) {
        this.f13947c = g1Var;
    }

    public void setLocked(boolean z10) {
        a1 a1Var;
        boolean z11;
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        InputFilter[] filters = getFilters();
        int length = filters.length;
        int i10 = 0;
        while (true) {
            a1Var = this.K;
            if (i10 < length) {
                if (filters[i10] == a1Var) {
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
            inputFilterArr[filters.length] = a1Var;
            setFilters(inputFilterArr);
        }
        boolean z12 = !z10;
        setAllowDrawCursor(z12);
        setCursorVisible(z12);
    }

    public void setSoftEnterNewline(boolean z10) {
        this.f13951r = z10;
    }

    public void setTextColorKey(int i10) {
        this.M = i10;
        t();
    }

    public void setTextSilently(CharSequence charSequence) {
        this.h = true;
        setText(charSequence);
        m();
        setSelection(length());
        this.h = false;
    }

    public final void t() {
        int v02;
        int i10 = this.M;
        org.telegram.ui.ActionBar.f6 f6Var = this.f13948e;
        setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        if (this.f13952s) {
            v02 = org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var));
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, f6Var);
        }
        setHintTextColor(v02);
        setCursorColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        setHandlesColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20809l6, f6Var));
        m();
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
    }
}

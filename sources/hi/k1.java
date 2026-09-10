package hi;

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
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.g90;
public final class k1 extends fu {
    public boolean E;
    public g90 F;
    public Paint G;
    public Layout H;
    public int I;
    public boolean J;
    public final d1 K;
    public TL_iv.PageBlock L;
    public int M;
    public float N;
    public float O;
    public long P;
    public int Q;
    public n4 R;
    public boolean S;
    public final e1 T;
    public j1 f9689c;
    public i1 d;
    public final org.telegram.ui.ActionBar.f6 e;
    public int f9690f;
    public boolean h;
    public boolean f9691n;
    public boolean f9692r;
    public boolean f9693s;
    public boolean v;
    public boolean f9694w;
    public boolean f9695x;
    public boolean f9696y;

    public k1(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f9690f = UserConfig.selectedAccount;
        this.I = -1;
        this.J = true;
        this.K = new InputFilter() {
            @Override
            public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
                k1 k1Var = k1.this;
                if (!k1Var.v || k1Var.h) {
                    return null;
                }
                j1 j1Var = k1Var.f9689c;
                if (j1Var != null && charSequence != null && i11 > i10 && i12 == i13) {
                    j1Var.D(charSequence.subSequence(i10, i11));
                }
                return spanned.subSequence(i12, i13);
            }
        };
        this.M = org.telegram.ui.ActionBar.j6.G6;
        this.T = new e1(this, 0);
        this.e = f6Var;
        this.adaptiveCreateLinkDialog = true;
        setBackground(null);
        setCursorWidth(1.5f);
        setGravity(8388659);
        setInputType(getInputType() | 147456);
        setImeOptions(5);
        f1 f1Var = new f1(0);
        g1 g1Var = new g1(this);
        setCustomSelectionActionModeCallback(f1Var);
        if (Build.VERSION.SDK_INT >= 23) {
            setCustomInsertionActionModeCallback(g1Var);
        }
        setOnLongClickListener(new bi.l6(this, 2));
        setLongClickable(length() == 0);
        setOnEditorActionListener(new gg.x0(this, 1));
        addTextChangedListener(new h1(this));
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
    public final b61 createUrlSpan(String str) {
        return i6.k(str);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10;
        j1 j1Var;
        if (keyEvent.getKeyCode() == 61) {
            if (keyEvent.getAction() == 0 && (j1Var = this.f9689c) != null) {
                j1Var.H(keyEvent.isShiftPressed());
                return true;
            }
        } else {
            int keyCode = keyEvent.getKeyCode();
            if ((keyCode == 66 || keyCode == 160) && this.f9689c != null && !this.f9694w) {
                if (keyEvent.getAction() == 0) {
                    if ((keyEvent.getFlags() & 2) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f9692r && (z10 || keyEvent.isShiftPressed())) {
                        p();
                        return true;
                    }
                    this.f9689c.x(this);
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
        return this.e;
    }

    public final void m() {
        Editable text = getText();
        if (text != null) {
            n4[] n4VarArr = (n4[]) text.getSpans(0, text.length(), n4.class);
            for (n4 n4Var : n4VarArr) {
                n4Var.d(text);
            }
            for (n4 n4Var2 : n4VarArr) {
                n4Var2.a(this.f9690f, this, this.e);
            }
        }
    }

    public final void n() {
        org.telegram.ui.ActionBar.k4 k4Var = this.floatingActionMode;
        if (k4Var != null) {
            try {
                k4Var.finish();
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

    public final n4 o(float f7, float f10) {
        int totalPaddingTop;
        n4[] n4VarArr;
        Layout layout = getLayout();
        Editable text = getText();
        if (layout != null && text != null && text.length() != 0 && (totalPaddingTop = (int) ((f10 - getTotalPaddingTop()) + getScrollY())) >= 0 && totalPaddingTop <= layout.getHeight()) {
            int lineForVertical = layout.getLineForVertical(totalPaddingTop);
            float totalPaddingLeft = (f7 - getTotalPaddingLeft()) + getScrollX();
            for (n4 n4Var : (n4[]) text.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), n4.class)) {
                int spanStart = text.getSpanStart(n4Var);
                int spanEnd = text.getSpanEnd(n4Var);
                if (spanStart >= 0 && spanEnd > spanStart) {
                    float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                    float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
                    if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + AndroidUtilities.dp(2.0f)) {
                        return n4Var;
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
        n4[] n4VarArr;
        AndroidUtilities.cancelRunOnUIThread(this.T);
        this.R = null;
        this.S = false;
        Editable text = getText();
        if (text != null) {
            for (n4 n4Var : (n4[]) text.getSpans(0, text.length(), n4.class)) {
                RichMessageLayout.RichButtonSpan richButtonSpan = n4Var.f9759b;
                if (richButtonSpan != null && n4Var.f9760c == this) {
                    richButtonSpan.detach(this);
                    n4Var.f9760c = null;
                }
            }
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        c11[] c11VarArr;
        int i10;
        int i11;
        float f7;
        Layout layout = getLayout();
        g90 g90Var = null;
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
                    for (c11 c11Var : (c11[]) spanned.getSpans(0, spanned.length(), c11.class)) {
                        int i12 = c11Var.f21969b.f21677a;
                        if ((65536 & i12) != 0) {
                            int spanStart = spanned.getSpanStart(c11Var);
                            int spanEnd = spanned.getSpanEnd(c11Var);
                            if (spanStart >= 0 && spanEnd > spanStart) {
                                if (g90Var == null) {
                                    g90Var = new g90(0);
                                    g90Var.f23303n = false;
                                }
                                g90Var.d(layout, spanStart, 0.0f);
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
                                g90Var.f23304o = i11;
                                layout.getSelectionPath(spanStart, spanEnd, g90Var);
                            }
                        }
                    }
                    if (g90Var != null) {
                        g90Var.f23303n = true;
                    }
                    this.F = g90Var;
                }
            }
        }
        if (this.F != null) {
            if (this.G == null) {
                Paint paint = new Paint(1);
                this.G = paint;
                paint.setPathEffect(g90.c());
            }
            this.G.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.K6, this.e) & 872415231);
            canvas.save();
            canvas.translate(getPaddingLeft(), this.offsetY);
            canvas.drawPath(this.F, this.G);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 67 && this.f9689c != null) {
            if (length() == 0) {
                this.f9689c.t();
                return true;
            } else if (getSelectionStart() == 0 && getSelectionEnd() == 0 && this.f9689c.P(this)) {
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        j1 j1Var = this.f9689c;
        if (j1Var != null) {
            j1Var.r(this, i10, i11);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        q();
    }

    @Override
    public final boolean onTextContextMenuItem(int i10) {
        j1 j1Var;
        j1 j1Var2;
        if (i10 != 16908319 || (j1Var2 = this.f9689c) == null || !j1Var2.f()) {
            if (i10 == 16908322 && (j1Var = this.f9689c) != null && j1Var.F(this)) {
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
        if (motionEvent.getAction() == 0 && this.f9689c != null && isEnabled() && isFocusable()) {
            this.f9689c.b(this);
        }
        if (!this.v) {
            int action = motionEvent.getAction();
            u uVar = null;
            e1 e1Var = this.T;
            int i10 = 0;
            if (action == 0) {
                this.N = motionEvent.getX();
                this.O = motionEvent.getY();
                this.P = motionEvent.getEventTime();
                n4 o9 = o(motionEvent.getX(), motionEvent.getY());
                this.R = o9;
                if (o9 != null && this.d != null) {
                    this.S = false;
                    o9.b().setPressed(true);
                    AndroidUtilities.cancelRunOnUIThread(e1Var);
                    AndroidUtilities.runOnUIThread(e1Var, ViewConfiguration.getLongPressTimeout());
                    return true;
                }
                this.R = null;
            } else {
                n4 n4Var = this.R;
                if (n4Var != null) {
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (motionEvent.getAction() != 3 && o(motionEvent.getX(), motionEvent.getY()) == n4Var) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11 || z10) {
                        n4Var.b().setPressed(false);
                        AndroidUtilities.cancelRunOnUIThread(e1Var);
                    }
                    if (z10) {
                        this.R = null;
                        if (!this.S && z11 && motionEvent.getAction() == 1) {
                            ((w2) this.d).a(this, n4Var, false);
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
                                u[] uVarArr = (u[]) text.getSpans(Math.max(0, offsetForHorizontal - 1), Math.min(text.length(), offsetForHorizontal + 1), u.class);
                                int length = uVarArr.length;
                                while (true) {
                                    if (i10 >= length) {
                                        break;
                                    }
                                    u uVar2 = uVarArr[i10];
                                    int spanStart = text.getSpanStart(uVar2);
                                    int spanEnd = text.getSpanEnd(uVar2);
                                    if (spanStart >= 0 && spanEnd >= 0) {
                                        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                                        if (spanEnd <= text.length()) {
                                            f7 = layout.getPrimaryHorizontal(spanEnd);
                                        } else {
                                            f7 = primaryHorizontal;
                                        }
                                        if (totalPaddingLeft >= Math.min(primaryHorizontal, f7) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, f7) + AndroidUtilities.dp(2.0f)) {
                                            uVar = uVar2;
                                            break;
                                        }
                                    }
                                    i10++;
                                }
                            }
                        }
                        if (uVar != null) {
                            s.U(getContext(), uVar.f9876a, new bi.y2(19, this, uVar), this.e);
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
        this.f9691n = true;
        getText().replace(max, max2, "\n");
        this.f9691n = false;
        setSelection(max + 1);
    }

    public final void q() {
        if (!this.f9695x) {
            return;
        }
        this.f9696y = true;
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
        this.f9696y = false;
    }

    public final void r() {
        j1 j1Var = this.f9689c;
        if (j1Var != null) {
            j1Var.b(this);
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
        post(new e1(this, 1));
    }

    public void setAccentHint(boolean z10) {
        if (this.f9693s == z10) {
            return;
        }
        this.f9693s = z10;
        t();
    }

    public void setAllowNewlines(boolean z10) {
        this.f9694w = z10;
    }

    public void setAutoBold(boolean z10) {
        this.E = z10;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.L = pageBlock;
    }

    public void setCenterEmptyHint(boolean z10) {
        if (this.f9695x == z10) {
            return;
        }
        this.f9695x = z10;
        if (z10) {
            q();
            return;
        }
        int dp = AndroidUtilities.dp(2.0f);
        setPadding(dp, getPaddingTop(), dp, getPaddingBottom());
    }

    @Override
    public void setGravity(int i10) {
        if (!this.f9696y) {
            this.f9695x = false;
        }
        super.setGravity(i10);
    }

    public void setInlineButtonClickListener(i1 i1Var) {
        this.d = i1Var;
    }

    public void setInlineButtonContext(int i10) {
        this.f9690f = i10;
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

    public void setListener(j1 j1Var) {
        this.f9689c = j1Var;
    }

    public void setLocked(boolean z10) {
        d1 d1Var;
        boolean z11;
        if (this.v == z10) {
            return;
        }
        this.v = z10;
        InputFilter[] filters = getFilters();
        int length = filters.length;
        int i10 = 0;
        while (true) {
            d1Var = this.K;
            if (i10 < length) {
                if (filters[i10] == d1Var) {
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
            inputFilterArr[filters.length] = d1Var;
            setFilters(inputFilterArr);
        }
        boolean z12 = !z10;
        setAllowDrawCursor(z12);
        setCursorVisible(z12);
    }

    public void setSoftEnterNewline(boolean z10) {
        this.f9692r = z10;
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
        org.telegram.ui.ActionBar.f6 f6Var = this.e;
        setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        if (this.f9693s) {
            v02 = org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var));
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, f6Var);
        }
        setHintTextColor(v02);
        setCursorColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        setHandlesColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18073l6, f6Var));
        m();
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
    }
}

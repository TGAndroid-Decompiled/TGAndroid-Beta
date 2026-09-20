package ci;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a20;
import org.telegram.ui.Components.b20;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.m30;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.cp;
import org.telegram.ui.g10;
import org.telegram.ui.ip;
import org.telegram.ui.j80;
import org.telegram.ui.l80;
import org.telegram.ui.ze0;
import org.telegram.ui.zx;
public final class h2 extends EditTextBoldCursor {
    public final int f4742b;
    public final Object f4743c;

    public h2(Object obj, Context context, int i10) {
        super(context);
        this.f4742b = i10;
        this.f4743c = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f4742b) {
            case 6:
                ((jn0) this.f4743c).getClass();
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f7;
        switch (this.f4742b) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                if (!z10) {
                    AndroidUtilities.hideKeyboard(((l2) this.f4743c).d);
                    return;
                }
                return;
            case 5:
                super.onFocusChanged(z10, i10, rect);
                gd0 gd0Var = (gd0) this.f4743c;
                if (!z10 && !isFocused()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                gd0Var.b(f7, f7, true);
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f4742b) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) getText());
                ip ipVar = (ip) this.f4743c;
                cp cpVar = ipVar.f34637f;
                if (cpVar != null && cpVar.getTextView() != null && !TextUtils.isEmpty(ipVar.f34637f.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(ipVar.f34637f.getTextView().getText());
                }
                accessibilityNodeInfo.setText(sb2);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.f4742b) {
            case 2:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.f4743c;
                if (i10 == 67 && v0Var.e.length() == 0 && ((v0Var.h.getVisibility() == 0 && v0Var.h.length() > 0) || v0Var.p())) {
                    if (v0Var.p()) {
                        gg.q0 q0Var = (gg.q0) hg.k0.g(1, v0Var.f19805g0);
                        org.telegram.ui.ActionBar.g5 g5Var = v0Var.H;
                        if (g5Var != null) {
                            g5Var.o(q0Var);
                        }
                        v0Var.C(q0Var);
                        return true;
                    }
                    v0Var.f19818s.callOnClick();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 4:
                b20 b20Var = (b20) this.f4743c;
                if (i10 == 67 && b20Var.f22856r.length() == 0 && b20Var.d()) {
                    if (!b20Var.d()) {
                        return true;
                    }
                    gg.q0 q0Var2 = (gg.q0) hg.k0.g(1, b20Var.F);
                    a20 a20Var = b20Var.H;
                    if (a20Var != null) {
                        ((zx) a20Var).h(q0Var2);
                    }
                    b20Var.g(q0Var2);
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 7:
                j80 j80Var = (j80) this.f4743c;
                l80 l80Var = j80Var.f34840f;
                if (i10 == 67 && j80Var.d.length() == 0 && !l80Var.G.isEmpty()) {
                    l80Var.f35348f.a((m30) hg.k0.g(1, l80Var.G));
                    l80Var.f35347c.e(!l80Var.G.isEmpty(), true);
                    l80Var.c0();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f4742b) {
            case 2:
                super.onMeasure(i10, i11);
                setMeasuredDimension(AndroidUtilities.dp(3.0f) + Math.max(View.MeasureSpec.getSize(i10), getMeasuredWidth()), getMeasuredHeight());
                return;
            case 3:
            default:
                super.onMeasure(i10, i11);
                return;
            case 4:
                super.onMeasure(i10, i11);
                setPivotX(getPaddingLeft());
                setPivotY(getMeasuredHeight() / 2.0f);
                return;
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i10) {
        switch (this.f4742b) {
            case 8:
                if (i10 == 16908322 || i10 == 16908337) {
                    ((ze0) this.f4743c).f40202y = true;
                    postDelayed(new g10(this, 21), 1000L);
                }
                return super.onTextContextMenuItem(i10);
            default:
                return super.onTextContextMenuItem(i10);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f4742b) {
            case 0:
                h2 h2Var = ((l2) this.f4743c).d;
                if (!h2Var.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    h2Var.requestFocus();
                    AndroidUtilities.showKeyboard(h2Var);
                }
                return super.onTouchEvent(motionEvent);
            case 1:
                fa faVar = (fa) this.f4743c;
                m30 m30Var = faVar.e;
                if (m30Var != null) {
                    m30Var.a();
                    faVar.e = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    faVar.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 2:
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 1 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return onTouchEvent;
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            default:
                return super.onTouchEvent(motionEvent);
            case 6:
                if (!isEnabled()) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ((jn0) this.f4743c).getClass();
                }
                return super.onTouchEvent(motionEvent);
            case 9:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f4743c;
                m30 m30Var2 = usersSelectActivity.P;
                if (m30Var2 != null) {
                    m30Var2.a();
                    usersSelectActivity.P = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 10:
                xg.i iVar = (xg.i) this.f4743c;
                m30 m30Var3 = iVar.f46073f;
                if (m30Var3 != null) {
                    m30Var3.a();
                    iVar.f46073f = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    iVar.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}

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
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.xc0;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.cy;
import org.telegram.ui.ep;
import org.telegram.ui.i10;
import org.telegram.ui.kp;
import org.telegram.ui.l80;
import org.telegram.ui.n80;
import org.telegram.ui.ze0;
public final class h2 extends EditTextBoldCursor {
    public final int f4741b;
    public final Object f4742c;

    public h2(Object obj, Context context, int i10) {
        super(context);
        this.f4741b = i10;
        this.f4742c = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f4741b) {
            case 6:
                ((xm0) this.f4742c).getClass();
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f7;
        switch (this.f4741b) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                if (!z10) {
                    AndroidUtilities.hideKeyboard(((l2) this.f4742c).d);
                    return;
                }
                return;
            case 5:
                super.onFocusChanged(z10, i10, rect);
                xc0 xc0Var = (xc0) this.f4742c;
                if (!z10 && !isFocused()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                xc0Var.b(f7, f7, true);
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f4741b) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) getText());
                kp kpVar = (kp) this.f4742c;
                ep epVar = kpVar.f35330f;
                if (epVar != null && epVar.getTextView() != null && !TextUtils.isEmpty(kpVar.f35330f.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(kpVar.f35330f.getTextView().getText());
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
        switch (this.f4741b) {
            case 2:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.f4742c;
                if (i10 == 67 && w0Var.e.length() == 0 && ((w0Var.h.getVisibility() == 0 && w0Var.h.length() > 0) || w0Var.p())) {
                    if (w0Var.p()) {
                        gg.q0 q0Var = (gg.q0) hg.k0.h(1, w0Var.f19614g0);
                        org.telegram.ui.ActionBar.h5 h5Var = w0Var.H;
                        if (h5Var != null) {
                            h5Var.o(q0Var);
                        }
                        w0Var.C(q0Var);
                        return true;
                    }
                    w0Var.f19627s.callOnClick();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 4:
                b20 b20Var = (b20) this.f4742c;
                if (i10 == 67 && b20Var.f22546r.length() == 0 && b20Var.d()) {
                    if (!b20Var.d()) {
                        return true;
                    }
                    gg.q0 q0Var2 = (gg.q0) hg.k0.h(1, b20Var.F);
                    a20 a20Var = b20Var.H;
                    if (a20Var != null) {
                        ((cy) a20Var).h(q0Var2);
                    }
                    b20Var.g(q0Var2);
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 7:
                l80 l80Var = (l80) this.f4742c;
                n80 n80Var = l80Var.f35483f;
                if (i10 == 67 && l80Var.d.length() == 0 && !n80Var.G.isEmpty()) {
                    n80Var.f35975f.a((m30) hg.k0.h(1, n80Var.G));
                    n80Var.f35974c.e(!n80Var.G.isEmpty(), true);
                    n80Var.c0();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f4741b) {
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
        switch (this.f4741b) {
            case 8:
                if (i10 == 16908322 || i10 == 16908337) {
                    ((ze0) this.f4742c).f40242y = true;
                    postDelayed(new i10(this, 21), 1000L);
                }
                return super.onTextContextMenuItem(i10);
            default:
                return super.onTextContextMenuItem(i10);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f4741b) {
            case 0:
                h2 h2Var = ((l2) this.f4742c).d;
                if (!h2Var.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    h2Var.requestFocus();
                    AndroidUtilities.showKeyboard(h2Var);
                }
                return super.onTouchEvent(motionEvent);
            case 1:
                fa faVar = (fa) this.f4742c;
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
                    ((xm0) this.f4742c).getClass();
                }
                return super.onTouchEvent(motionEvent);
            case 9:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f4742c;
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
                xg.i iVar = (xg.i) this.f4742c;
                m30 m30Var3 = iVar.f45803f;
                if (m30Var3 != null) {
                    m30Var3.a();
                    iVar.f45803f = null;
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

package lg;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.w0;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.p30;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.b80;
import org.telegram.ui.c10;
import org.telegram.ui.d80;
import org.telegram.ui.ep;
import org.telegram.ui.qe0;
import org.telegram.ui.ux;
import org.telegram.ui.xo;
import qh.a8;
import qh.s1;
import uf.e0;
public final class f extends EditTextBoldCursor {
    public final int f12543b;
    public final Object f12544c;

    public f(Object obj, Context context, int i10) {
        super(context);
        this.f12543b = i10;
        this.f12544c = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f12543b) {
            case 5:
                ((fn0) this.f12544c).getClass();
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onFocusChanged(boolean z4, int i10, Rect rect) {
        float f10;
        switch (this.f12543b) {
            case 4:
                super.onFocusChanged(z4, i10, rect);
                bd0 bd0Var = (bd0) this.f12544c;
                if (!z4 && !isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                bd0Var.b(f10, f10, true);
                return;
            case 9:
                super.onFocusChanged(z4, i10, rect);
                if (!z4) {
                    AndroidUtilities.hideKeyboard(((s1) this.f12544c).d);
                    return;
                }
                return;
            default:
                super.onFocusChanged(z4, i10, rect);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f12543b) {
            case 2:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) getText());
                ep epVar = (ep) this.f12544c;
                xo xoVar = epVar.f36638f;
                if (xoVar != null && xoVar.getTextView() != null && !TextUtils.isEmpty(epVar.f36638f.getTextView().getText())) {
                    sb.append("\n");
                    sb.append(epVar.f36638f.getTextView().getText());
                }
                accessibilityNodeInfo.setText(sb);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.f12543b) {
            case 1:
                w0 w0Var = (w0) this.f12544c;
                if (i10 == 67 && w0Var.f22349e.length() == 0 && ((w0Var.h.getVisibility() == 0 && w0Var.h.length() > 0) || w0Var.p())) {
                    if (w0Var.p()) {
                        e0 e0Var = (e0) l.d.i(1, w0Var.f22348d0);
                        i5 i5Var = w0Var.E;
                        if (i5Var != null) {
                            i5Var.o(e0Var);
                        }
                        w0Var.C(e0Var);
                        return true;
                    }
                    w0Var.f22366s.callOnClick();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 3:
                d20 d20Var = (d20) this.f12544c;
                if (i10 == 67 && d20Var.f26172r.length() == 0 && d20Var.d()) {
                    if (!d20Var.d()) {
                        return true;
                    }
                    e0 e0Var2 = (e0) l.d.i(1, d20Var.C);
                    c20 c20Var = d20Var.E;
                    if (c20Var != null) {
                        ((ux) c20Var).d(e0Var2);
                    }
                    d20Var.g(e0Var2);
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 6:
                b80 b80Var = (b80) this.f12544c;
                d80 d80Var = b80Var.f35386f;
                if (i10 == 67 && b80Var.d.length() == 0 && !d80Var.D.isEmpty()) {
                    d80Var.f36136f.a((p30) l.d.i(1, d80Var.D));
                    d80Var.f36134c.e(!d80Var.D.isEmpty(), true);
                    d80Var.c0();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f12543b) {
            case 1:
                super.onMeasure(i10, i11);
                setMeasuredDimension(AndroidUtilities.dp(3.0f) + Math.max(View.MeasureSpec.getSize(i10), getMeasuredWidth()), getMeasuredHeight());
                return;
            case 2:
            default:
                super.onMeasure(i10, i11);
                return;
            case 3:
                super.onMeasure(i10, i11);
                setPivotX(getPaddingLeft());
                setPivotY(getMeasuredHeight() / 2.0f);
                return;
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i10) {
        switch (this.f12543b) {
            case 7:
                if (i10 == 16908322 || i10 == 16908337) {
                    ((qe0) this.f12544c).f40457y = true;
                    postDelayed(new c10(this, 21), 1000L);
                }
                return super.onTextContextMenuItem(i10);
            default:
                return super.onTextContextMenuItem(i10);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f12543b) {
            case 0:
                k kVar = (k) this.f12544c;
                p30 p30Var = kVar.f12562f;
                if (p30Var != null) {
                    p30Var.a();
                    kVar.f12562f = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    kVar.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 1:
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 1 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return onTouchEvent;
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            default:
                return super.onTouchEvent(motionEvent);
            case 5:
                if (!isEnabled()) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ((fn0) this.f12544c).getClass();
                }
                return super.onTouchEvent(motionEvent);
            case 8:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f12544c;
                p30 p30Var2 = usersSelectActivity.M;
                if (p30Var2 != null) {
                    p30Var2.a();
                    usersSelectActivity.M = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 9:
                f fVar = ((s1) this.f12544c).d;
                if (!fVar.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    fVar.requestFocus();
                    AndroidUtilities.showKeyboard(fVar);
                }
                return super.onTouchEvent(motionEvent);
            case 10:
                a8 a8Var = (a8) this.f12544c;
                p30 p30Var3 = a8Var.f44920e;
                if (p30Var3 != null) {
                    p30Var3.a();
                    a8Var.f44920e = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    a8Var.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}

package bi;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.gn0;
import org.telegram.ui.Components.j20;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.w30;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.cy;
import org.telegram.ui.gp;
import org.telegram.ui.i10;
import org.telegram.ui.i80;
import org.telegram.ui.k80;
import org.telegram.ui.mp;
import org.telegram.ui.xe0;
public final class t2 extends EditTextBoldCursor {
    public final int f3670b;
    public final Object f3671c;

    public t2(Object obj, Context context, int i10) {
        super(context);
        this.f3670b = i10;
        this.f3671c = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f3670b) {
            case 6:
                ((gn0) this.f3671c).getClass();
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f7;
        switch (this.f3670b) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                if (!z10) {
                    AndroidUtilities.hideKeyboard(((x2) this.f3671c).d);
                    return;
                }
                return;
            case 5:
                super.onFocusChanged(z10, i10, rect);
                gd0 gd0Var = (gd0) this.f3671c;
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
        switch (this.f3670b) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) getText());
                mp mpVar = (mp) this.f3671c;
                gp gpVar = mpVar.f35023f;
                if (gpVar != null && gpVar.getTextView() != null && !TextUtils.isEmpty(mpVar.f35023f.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(mpVar.f35023f.getTextView().getText());
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
        switch (this.f3670b) {
            case 2:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.f3671c;
                if (i10 == 67 && w0Var.e.length() == 0 && ((w0Var.h.getVisibility() == 0 && w0Var.h.length() > 0) || w0Var.p())) {
                    if (w0Var.p()) {
                        fg.q0 q0Var = (fg.q0) hc.b.i(1, w0Var.f18694g0);
                        org.telegram.ui.ActionBar.i5 i5Var = w0Var.H;
                        if (i5Var != null) {
                            i5Var.o(q0Var);
                        }
                        w0Var.C(q0Var);
                        return true;
                    }
                    w0Var.f18707s.callOnClick();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 4:
                k20 k20Var = (k20) this.f3671c;
                if (i10 == 67 && k20Var.f24572r.length() == 0 && k20Var.d()) {
                    if (!k20Var.d()) {
                        return true;
                    }
                    fg.q0 q0Var2 = (fg.q0) hc.b.i(1, k20Var.F);
                    j20 j20Var = k20Var.H;
                    if (j20Var != null) {
                        ((cy) j20Var).g(q0Var2);
                    }
                    k20Var.g(q0Var2);
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 7:
                i80 i80Var = (i80) this.f3671c;
                k80 k80Var = i80Var.f33558f;
                if (i10 == 67 && i80Var.d.length() == 0 && !k80Var.G.isEmpty()) {
                    k80Var.f34261f.a((w30) hc.b.i(1, k80Var.G));
                    k80Var.f34260c.e(!k80Var.G.isEmpty(), true);
                    k80Var.c0();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f3670b) {
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
        switch (this.f3670b) {
            case 8:
                if (i10 == 16908322 || i10 == 16908337) {
                    ((xe0) this.f3671c).f38693y = true;
                    postDelayed(new i10(this, 21), 1000L);
                }
                return super.onTextContextMenuItem(i10);
            default:
                return super.onTextContextMenuItem(i10);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f3670b) {
            case 0:
                t2 t2Var = ((x2) this.f3671c).d;
                if (!t2Var.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    t2Var.requestFocus();
                    AndroidUtilities.showKeyboard(t2Var);
                }
                return super.onTouchEvent(motionEvent);
            case 1:
                ob obVar = (ob) this.f3671c;
                w30 w30Var = obVar.e;
                if (w30Var != null) {
                    w30Var.a();
                    obVar.e = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    obVar.fullScroll(130);
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
                    ((gn0) this.f3671c).getClass();
                }
                return super.onTouchEvent(motionEvent);
            case 9:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f3671c;
                w30 w30Var2 = usersSelectActivity.P;
                if (w30Var2 != null) {
                    w30Var2.a();
                    usersSelectActivity.P = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 10:
                wg.h hVar = (wg.h) this.f3671c;
                w30 w30Var3 = hVar.f44001f;
                if (w30Var3 != null) {
                    w30Var3.a();
                    hVar.f44001f = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    hVar.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}

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
import org.telegram.ui.Components.b20;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.n30;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.ap;
import org.telegram.ui.d10;
import org.telegram.ui.g80;
import org.telegram.ui.gp;
import org.telegram.ui.i80;
import org.telegram.ui.se0;
import org.telegram.ui.wx;
public final class h2 extends EditTextBoldCursor {
    public final int f4749b;
    public final Object f4750c;

    public h2(Object obj, Context context, int i10) {
        super(context);
        this.f4749b = i10;
        this.f4750c = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f4749b) {
            case 6:
                ((xm0) this.f4750c).getClass();
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f7;
        switch (this.f4749b) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                if (!z10) {
                    AndroidUtilities.hideKeyboard(((l2) this.f4750c).d);
                    return;
                }
                return;
            case 5:
                super.onFocusChanged(z10, i10, rect);
                wc0 wc0Var = (wc0) this.f4750c;
                if (!z10 && !isFocused()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                wc0Var.b(f7, f7, true);
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f4749b) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) getText());
                gp gpVar = (gp) this.f4750c;
                ap apVar = gpVar.f33611f;
                if (apVar != null && apVar.getTextView() != null && !TextUtils.isEmpty(gpVar.f33611f.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(gpVar.f33611f.getTextView().getText());
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
        switch (this.f4749b) {
            case 2:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.f4750c;
                if (i10 == 67 && v0Var.e.length() == 0 && ((v0Var.h.getVisibility() == 0 && v0Var.h.length() > 0) || v0Var.p())) {
                    if (v0Var.p()) {
                        gg.q0 q0Var = (gg.q0) hg.c.h(1, v0Var.f19569g0);
                        org.telegram.ui.ActionBar.f5 f5Var = v0Var.H;
                        if (f5Var != null) {
                            f5Var.o(q0Var);
                        }
                        v0Var.C(q0Var);
                        return true;
                    }
                    v0Var.f19582s.callOnClick();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 4:
                c20 c20Var = (c20) this.f4750c;
                if (i10 == 67 && c20Var.f22890r.length() == 0 && c20Var.d()) {
                    if (!c20Var.d()) {
                        return true;
                    }
                    gg.q0 q0Var2 = (gg.q0) hg.c.h(1, c20Var.F);
                    b20 b20Var = c20Var.H;
                    if (b20Var != null) {
                        ((wx) b20Var).h(q0Var2);
                    }
                    c20Var.g(q0Var2);
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 7:
                g80 g80Var = (g80) this.f4750c;
                i80 i80Var = g80Var.f33485f;
                if (i10 == 67 && g80Var.d.length() == 0 && !i80Var.G.isEmpty()) {
                    i80Var.f34066f.a((n30) hg.c.h(1, i80Var.G));
                    i80Var.f34065c.e(!i80Var.G.isEmpty(), true);
                    i80Var.c0();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f4749b) {
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
        switch (this.f4749b) {
            case 8:
                if (i10 == 16908322 || i10 == 16908337) {
                    ((se0) this.f4750c).f37262y = true;
                    postDelayed(new d10(this, 21), 1000L);
                }
                return super.onTextContextMenuItem(i10);
            default:
                return super.onTextContextMenuItem(i10);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f4749b) {
            case 0:
                h2 h2Var = ((l2) this.f4750c).d;
                if (!h2Var.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    h2Var.requestFocus();
                    AndroidUtilities.showKeyboard(h2Var);
                }
                return super.onTouchEvent(motionEvent);
            case 1:
                ca caVar = (ca) this.f4750c;
                n30 n30Var = caVar.e;
                if (n30Var != null) {
                    n30Var.a();
                    caVar.e = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    caVar.fullScroll(130);
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
                    ((xm0) this.f4750c).getClass();
                }
                return super.onTouchEvent(motionEvent);
            case 9:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f4750c;
                n30 n30Var2 = usersSelectActivity.P;
                if (n30Var2 != null) {
                    n30Var2.a();
                    usersSelectActivity.P = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 10:
                xg.i iVar = (xg.i) this.f4750c;
                n30 n30Var3 = iVar.f45725f;
                if (n30Var3 != null) {
                    n30Var3.a();
                    iVar.f45725f = null;
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

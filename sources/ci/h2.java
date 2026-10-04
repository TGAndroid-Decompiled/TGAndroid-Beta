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
import org.telegram.ui.Components.e20;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.Components.q30;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.bp;
import org.telegram.ui.cy;
import org.telegram.ui.g10;
import org.telegram.ui.hp;
import org.telegram.ui.i80;
import org.telegram.ui.k80;
import org.telegram.ui.ve0;
public final class h2 extends EditTextBoldCursor {
    public final int f5128b;
    public final Object f5129c;

    public h2(Object obj, Context context, int i10) {
        super(context);
        this.f5128b = i10;
        this.f5129c = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f5128b) {
            case 6:
                ((pn0) this.f5129c).getClass();
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f7;
        switch (this.f5128b) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                if (!z10) {
                    AndroidUtilities.hideKeyboard(((l2) this.f5129c).d);
                    return;
                }
                return;
            case 5:
                super.onFocusChanged(z10, i10, rect);
                kd0 kd0Var = (kd0) this.f5129c;
                if (!z10 && !isFocused()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                kd0Var.b(f7, f7, true);
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f5128b) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) getText());
                hp hpVar = (hp) this.f5129c;
                bp bpVar = hpVar.f37134f;
                if (bpVar != null && bpVar.getTextView() != null && !TextUtils.isEmpty(hpVar.f37134f.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(hpVar.f37134f.getTextView().getText());
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
        switch (this.f5128b) {
            case 2:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.f5129c;
                if (i10 == 67 && v0Var.f21576e.length() == 0 && ((v0Var.h.getVisibility() == 0 && v0Var.h.length() > 0) || v0Var.p())) {
                    if (v0Var.p()) {
                        gg.q0 q0Var = (gg.q0) hg.k0.g(1, v0Var.f21580g0);
                        org.telegram.ui.ActionBar.f5 f5Var = v0Var.H;
                        if (f5Var != null) {
                            f5Var.o(q0Var);
                        }
                        v0Var.C(q0Var);
                        return true;
                    }
                    v0Var.f21593s.callOnClick();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 4:
                f20 f20Var = (f20) this.f5129c;
                if (i10 == 67 && f20Var.f26247r.length() == 0 && f20Var.d()) {
                    if (!f20Var.d()) {
                        return true;
                    }
                    gg.q0 q0Var2 = (gg.q0) hg.k0.g(1, f20Var.F);
                    e20 e20Var = f20Var.H;
                    if (e20Var != null) {
                        ((cy) e20Var).d(q0Var2);
                    }
                    f20Var.g(q0Var2);
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 7:
                i80 i80Var = (i80) this.f5129c;
                k80 k80Var = i80Var.f37313f;
                if (i10 == 67 && i80Var.d.length() == 0 && !k80Var.G.isEmpty()) {
                    k80Var.f37882f.a((q30) hg.k0.g(1, k80Var.G));
                    k80Var.f37880c.e(!k80Var.G.isEmpty(), true);
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
        switch (this.f5128b) {
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
        switch (this.f5128b) {
            case 8:
                if (i10 == 16908322 || i10 == 16908337) {
                    ((ve0) this.f5129c).f41722y = true;
                    postDelayed(new g10(this, 21), 1000L);
                }
                return super.onTextContextMenuItem(i10);
            default:
                return super.onTextContextMenuItem(i10);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f5128b) {
            case 0:
                h2 h2Var = ((l2) this.f5129c).d;
                if (!h2Var.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    h2Var.requestFocus();
                    AndroidUtilities.showKeyboard(h2Var);
                }
                return super.onTouchEvent(motionEvent);
            case 1:
                ba baVar = (ba) this.f5129c;
                q30 q30Var = baVar.f4780e;
                if (q30Var != null) {
                    q30Var.a();
                    baVar.f4780e = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    baVar.fullScroll(130);
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
                    ((pn0) this.f5129c).getClass();
                }
                return super.onTouchEvent(motionEvent);
            case 9:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f5129c;
                q30 q30Var2 = usersSelectActivity.P;
                if (q30Var2 != null) {
                    q30Var2.a();
                    usersSelectActivity.P = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 10:
                xg.i iVar = (xg.i) this.f5129c;
                q30 q30Var3 = iVar.f49855f;
                if (q30Var3 != null) {
                    q30Var3.a();
                    iVar.f49855f = null;
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

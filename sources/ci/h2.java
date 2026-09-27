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
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.e20;
import org.telegram.ui.Components.id0;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.p30;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.ap;
import org.telegram.ui.f10;
import org.telegram.ui.gp;
import org.telegram.ui.h80;
import org.telegram.ui.j80;
import org.telegram.ui.ue0;
import org.telegram.ui.zx;
public final class h2 extends EditTextBoldCursor {
    public final int f4747b;
    public final Object f4748c;

    public h2(Object obj, Context context, int i10) {
        super(context);
        this.f4747b = i10;
        this.f4748c = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f4747b) {
            case 6:
                ((ln0) this.f4748c).getClass();
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f7;
        switch (this.f4747b) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                if (!z10) {
                    AndroidUtilities.hideKeyboard(((l2) this.f4748c).d);
                    return;
                }
                return;
            case 5:
                super.onFocusChanged(z10, i10, rect);
                id0 id0Var = (id0) this.f4748c;
                if (!z10 && !isFocused()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                id0Var.b(f7, f7, true);
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f4747b) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) getText());
                gp gpVar = (gp) this.f4748c;
                ap apVar = gpVar.f33993f;
                if (apVar != null && apVar.getTextView() != null && !TextUtils.isEmpty(gpVar.f33993f.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(gpVar.f33993f.getTextView().getText());
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
        switch (this.f4747b) {
            case 2:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.f4748c;
                if (i10 == 67 && w0Var.e.length() == 0 && ((w0Var.h.getVisibility() == 0 && w0Var.h.length() > 0) || w0Var.p())) {
                    if (w0Var.p()) {
                        gg.q0 q0Var = (gg.q0) hg.k0.g(1, w0Var.f19846g0);
                        org.telegram.ui.ActionBar.g5 g5Var = w0Var.H;
                        if (g5Var != null) {
                            g5Var.o(q0Var);
                        }
                        w0Var.C(q0Var);
                        return true;
                    }
                    w0Var.f19859s.callOnClick();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 4:
                e20 e20Var = (e20) this.f4748c;
                if (i10 == 67 && e20Var.f23850r.length() == 0 && e20Var.d()) {
                    if (!e20Var.d()) {
                        return true;
                    }
                    gg.q0 q0Var2 = (gg.q0) hg.k0.g(1, e20Var.F);
                    d20 d20Var = e20Var.H;
                    if (d20Var != null) {
                        ((zx) d20Var).d(q0Var2);
                    }
                    e20Var.g(q0Var2);
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 7:
                h80 h80Var = (h80) this.f4748c;
                j80 j80Var = h80Var.f34163f;
                if (i10 == 67 && h80Var.d.length() == 0 && !j80Var.G.isEmpty()) {
                    j80Var.f34661f.a((p30) hg.k0.g(1, j80Var.G));
                    j80Var.f34660c.e(!j80Var.G.isEmpty(), true);
                    j80Var.c0();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f4747b) {
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
        switch (this.f4747b) {
            case 8:
                if (i10 == 16908322 || i10 == 16908337) {
                    ((ue0) this.f4748c).f38238y = true;
                    postDelayed(new f10(this, 21), 1000L);
                }
                return super.onTextContextMenuItem(i10);
            default:
                return super.onTextContextMenuItem(i10);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f4747b) {
            case 0:
                h2 h2Var = ((l2) this.f4748c).d;
                if (!h2Var.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    h2Var.requestFocus();
                    AndroidUtilities.showKeyboard(h2Var);
                }
                return super.onTouchEvent(motionEvent);
            case 1:
                ba baVar = (ba) this.f4748c;
                p30 p30Var = baVar.e;
                if (p30Var != null) {
                    p30Var.a();
                    baVar.e = null;
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
                    ((ln0) this.f4748c).getClass();
                }
                return super.onTouchEvent(motionEvent);
            case 9:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f4748c;
                p30 p30Var2 = usersSelectActivity.P;
                if (p30Var2 != null) {
                    p30Var2.a();
                    usersSelectActivity.P = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 10:
                xg.i iVar = (xg.i) this.f4748c;
                p30 p30Var3 = iVar.f46099f;
                if (p30Var3 != null) {
                    p30Var3.a();
                    iVar.f46099f = null;
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

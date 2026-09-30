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
import org.telegram.ui.Components.ld0;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.q30;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.c10;
import org.telegram.ui.e80;
import org.telegram.ui.fp;
import org.telegram.ui.g80;
import org.telegram.ui.re0;
import org.telegram.ui.vx;
import org.telegram.ui.zo;
public final class h2 extends EditTextBoldCursor {
    public final int f4757b;
    public final Object f4758c;

    public h2(Object obj, Context context, int i10) {
        super(context);
        this.f4757b = i10;
        this.f4758c = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f4757b) {
            case 6:
                ((mn0) this.f4758c).getClass();
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f7;
        switch (this.f4757b) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                if (!z10) {
                    AndroidUtilities.hideKeyboard(((l2) this.f4758c).d);
                    return;
                }
                return;
            case 5:
                super.onFocusChanged(z10, i10, rect);
                ld0 ld0Var = (ld0) this.f4758c;
                if (!z10 && !isFocused()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                ld0Var.b(f7, f7, true);
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f4757b) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) getText());
                fp fpVar = (fp) this.f4758c;
                zo zoVar = fpVar.f33859f;
                if (zoVar != null && zoVar.getTextView() != null && !TextUtils.isEmpty(fpVar.f33859f.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(fpVar.f33859f.getTextView().getText());
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
        switch (this.f4757b) {
            case 2:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.f4758c;
                if (i10 == 67 && u0Var.e.length() == 0 && ((u0Var.h.getVisibility() == 0 && u0Var.h.length() > 0) || u0Var.p())) {
                    if (u0Var.p()) {
                        gg.q0 q0Var = (gg.q0) hg.c.g(1, u0Var.f19813g0);
                        org.telegram.ui.ActionBar.e5 e5Var = u0Var.H;
                        if (e5Var != null) {
                            e5Var.o(q0Var);
                        }
                        u0Var.C(q0Var);
                        return true;
                    }
                    u0Var.f19826s.callOnClick();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 4:
                f20 f20Var = (f20) this.f4758c;
                if (i10 == 67 && f20Var.f24137r.length() == 0 && f20Var.d()) {
                    if (!f20Var.d()) {
                        return true;
                    }
                    gg.q0 q0Var2 = (gg.q0) hg.c.g(1, f20Var.F);
                    e20 e20Var = f20Var.H;
                    if (e20Var != null) {
                        ((vx) e20Var).h(q0Var2);
                    }
                    f20Var.g(q0Var2);
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 7:
                e80 e80Var = (e80) this.f4758c;
                g80 g80Var = e80Var.f33382f;
                if (i10 == 67 && e80Var.d.length() == 0 && !g80Var.G.isEmpty()) {
                    g80Var.f33993f.a((q30) hg.c.g(1, g80Var.G));
                    g80Var.f33992c.e(!g80Var.G.isEmpty(), true);
                    g80Var.c0();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f4757b) {
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
        switch (this.f4757b) {
            case 8:
                if (i10 == 16908322 || i10 == 16908337) {
                    ((re0) this.f4758c).f37422y = true;
                    postDelayed(new c10(this, 21), 1000L);
                }
                return super.onTextContextMenuItem(i10);
            default:
                return super.onTextContextMenuItem(i10);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f4757b) {
            case 0:
                h2 h2Var = ((l2) this.f4758c).d;
                if (!h2Var.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    h2Var.requestFocus();
                    AndroidUtilities.showKeyboard(h2Var);
                }
                return super.onTouchEvent(motionEvent);
            case 1:
                ca caVar = (ca) this.f4758c;
                q30 q30Var = caVar.e;
                if (q30Var != null) {
                    q30Var.a();
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
                    ((mn0) this.f4758c).getClass();
                }
                return super.onTouchEvent(motionEvent);
            case 9:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f4758c;
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
                xg.i iVar = (xg.i) this.f4758c;
                q30 q30Var3 = iVar.f46161f;
                if (q30Var3 != null) {
                    q30Var3.a();
                    iVar.f46161f = null;
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

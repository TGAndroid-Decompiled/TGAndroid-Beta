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
import org.telegram.ui.Components.id0;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.n30;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.c10;
import org.telegram.ui.e80;
import org.telegram.ui.fp;
import org.telegram.ui.g80;
import org.telegram.ui.re0;
import org.telegram.ui.vx;
import org.telegram.ui.zo;
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
                ((jn0) this.f4750c).getClass();
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
                id0 id0Var = (id0) this.f4750c;
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
        switch (this.f4749b) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) getText());
                fp fpVar = (fp) this.f4750c;
                zo zoVar = fpVar.f33717f;
                if (zoVar != null && zoVar.getTextView() != null && !TextUtils.isEmpty(fpVar.f33717f.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(fpVar.f33717f.getTextView().getText());
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
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.f4750c;
                if (i10 == 67 && u0Var.e.length() == 0 && ((u0Var.h.getVisibility() == 0 && u0Var.h.length() > 0) || u0Var.p())) {
                    if (u0Var.p()) {
                        gg.q0 q0Var = (gg.q0) hg.c.g(1, u0Var.f19796g0);
                        org.telegram.ui.ActionBar.e5 e5Var = u0Var.H;
                        if (e5Var != null) {
                            e5Var.o(q0Var);
                        }
                        u0Var.C(q0Var);
                        return true;
                    }
                    u0Var.f19809s.callOnClick();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 4:
                c20 c20Var = (c20) this.f4750c;
                if (i10 == 67 && c20Var.f23160r.length() == 0 && c20Var.d()) {
                    if (!c20Var.d()) {
                        return true;
                    }
                    gg.q0 q0Var2 = (gg.q0) hg.c.g(1, c20Var.F);
                    b20 b20Var = c20Var.H;
                    if (b20Var != null) {
                        ((vx) b20Var).h(q0Var2);
                    }
                    c20Var.g(q0Var2);
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 7:
                e80 e80Var = (e80) this.f4750c;
                g80 g80Var = e80Var.f33299f;
                if (i10 == 67 && e80Var.d.length() == 0 && !g80Var.G.isEmpty()) {
                    g80Var.f33852f.a((n30) hg.c.g(1, g80Var.G));
                    g80Var.f33851c.e(!g80Var.G.isEmpty(), true);
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
                    ((re0) this.f4750c).f37320y = true;
                    postDelayed(new c10(this, 21), 1000L);
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
                    ((jn0) this.f4750c).getClass();
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
                n30 n30Var3 = iVar.f46053f;
                if (n30Var3 != null) {
                    n30Var3.a();
                    iVar.f46053f = null;
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

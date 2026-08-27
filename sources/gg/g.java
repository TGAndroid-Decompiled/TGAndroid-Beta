package gg;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import lh.e2;
import lh.n9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.v0;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.o10;
import org.telegram.ui.Components.p10;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.je0;
import org.telegram.ui.lx;
import org.telegram.ui.r00;
import org.telegram.ui.r70;
import org.telegram.ui.ro;
import org.telegram.ui.t70;
import org.telegram.ui.xo;
import pf.e0;

public final class g extends EditTextBoldCursor {

    public final int f7091b;

    public final Object f7092c;

    public g(Object obj, Context context, int i10) {
        super(context);
        this.f7091b = i10;
        this.f7092c = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f7091b) {
            case 7:
                ((km0) this.f7092c).getClass();
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        switch (this.f7091b) {
            case 1:
                super.onFocusChanged(z10, i10, rect);
                if (!z10) {
                    AndroidUtilities.hideKeyboard(((e2) this.f7092c).d);
                }
                break;
            case 6:
                super.onFocusChanged(z10, i10, rect);
                ic0 ic0Var = (ic0) this.f7092c;
                float f10 = (z10 || isFocused()) ? 1.0f : 0.0f;
                ic0Var.b(f10, f10, true);
                break;
            default:
                super.onFocusChanged(z10, i10, rect);
                break;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f7091b) {
            case 4:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) getText());
                xo xoVar = (xo) this.f7092c;
                ro roVar = xoVar.f44557f;
                if (roVar != null && roVar.getTextView() != null && !TextUtils.isEmpty(xoVar.f44557f.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(xoVar.f44557f.getTextView().getText());
                }
                accessibilityNodeInfo.setText(sb2);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.f7091b) {
            case 3:
                v0 v0Var = (v0) this.f7092c;
                if (i10 != 67 || v0Var.f23859e.length() != 0 || ((v0Var.h.getVisibility() != 0 || v0Var.h.length() <= 0) && !v0Var.p())) {
                    return super.onKeyDown(i10, keyEvent);
                }
                if (!v0Var.p()) {
                    v0Var.f23875s.callOnClick();
                    return true;
                }
                e0 e0Var = (e0) i0.a.i(1, v0Var.f23857c0);
                e5 e5Var = v0Var.D;
                if (e5Var != null) {
                    e5Var.o(e0Var);
                }
                v0Var.C(e0Var);
                return true;
            case 5:
                p10 p10Var = (p10) this.f7092c;
                if (i10 != 67 || p10Var.f31468r.length() != 0 || !p10Var.e()) {
                    return super.onKeyDown(i10, keyEvent);
                }
                if (!p10Var.e()) {
                    return true;
                }
                e0 e0Var2 = (e0) i0.a.i(1, p10Var.B);
                o10 o10Var = p10Var.D;
                if (o10Var != null) {
                    ((lx) o10Var).e(e0Var2);
                }
                p10Var.g(e0Var2);
                return true;
            case 8:
                r70 r70Var = (r70) this.f7092c;
                t70 t70Var = r70Var.f41831f;
                if (i10 != 67 || r70Var.d.length() != 0 || t70Var.C.isEmpty()) {
                    return super.onKeyDown(i10, keyEvent);
                }
                t70Var.f42798f.a((a30) i0.a.i(1, t70Var.C));
                t70Var.f42796c.e(!t70Var.C.isEmpty(), true);
                t70Var.c0();
                return true;
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f7091b) {
            case 3:
                super.onMeasure(i10, i11);
                setMeasuredDimension(AndroidUtilities.dp(3.0f) + Math.max(View.MeasureSpec.getSize(i10), getMeasuredWidth()), getMeasuredHeight());
                break;
            case 4:
            default:
                super.onMeasure(i10, i11);
                break;
            case 5:
                super.onMeasure(i10, i11);
                setPivotX(getPaddingLeft());
                setPivotY(getMeasuredHeight() / 2.0f);
                break;
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i10) {
        switch (this.f7091b) {
            case 9:
                if (i10 == 16908322 || i10 == 16908337) {
                    ((je0) this.f7092c).f39360y = true;
                    postDelayed(new r00(this, 21), 1000L);
                }
                break;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f7091b) {
            case 0:
                l lVar = (l) this.f7092c;
                a30 a30Var = lVar.f7110f;
                if (a30Var != null) {
                    a30Var.a();
                    lVar.f7110f = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    lVar.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 1:
                g gVar = ((e2) this.f7092c).d;
                if (!gVar.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    gVar.requestFocus();
                    AndroidUtilities.showKeyboard(gVar);
                }
                return super.onTouchEvent(motionEvent);
            case 2:
                n9 n9Var = (n9) this.f7092c;
                a30 a30Var2 = n9Var.f16443e;
                if (a30Var2 != null) {
                    a30Var2.a();
                    n9Var.f16443e = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    n9Var.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 3:
                boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 1 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return zOnTouchEvent;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            default:
                return super.onTouchEvent(motionEvent);
            case 7:
                if (!isEnabled()) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ((km0) this.f7092c).getClass();
                }
                return super.onTouchEvent(motionEvent);
            case 10:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f7092c;
                a30 a30Var3 = usersSelectActivity.L;
                if (a30Var3 != null) {
                    a30Var3.a();
                    usersSelectActivity.L = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}

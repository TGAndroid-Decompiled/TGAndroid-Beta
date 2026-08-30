package kg;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import kh.a2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.w0;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b20;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.n30;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.a80;
import org.telegram.ui.c10;
import org.telegram.ui.c80;
import org.telegram.ui.dp;
import org.telegram.ui.pe0;
import org.telegram.ui.tx;
import org.telegram.ui.xo;
import ph.c8;
import ph.s1;
import tf.e0;
public final class f extends EditTextBoldCursor {
    public final int f10421b;
    public final Object f10422c;

    public f(Object obj, Context context, int i10) {
        super(context);
        this.f10421b = i10;
        this.f10422c = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f10421b) {
            case 5:
                ((en0) this.f10422c).getClass();
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onFocusChanged(boolean z4, int i10, Rect rect) {
        float f10;
        switch (this.f10421b) {
            case 4:
                super.onFocusChanged(z4, i10, rect);
                zc0 zc0Var = (zc0) this.f10422c;
                if (!z4 && !isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                zc0Var.b(f10, f10, true);
                return;
            case 9:
                super.onFocusChanged(z4, i10, rect);
                if (!z4) {
                    AndroidUtilities.hideKeyboard(((s1) this.f10422c).d);
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
        switch (this.f10421b) {
            case 2:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) getText());
                dp dpVar = (dp) this.f10422c;
                xo xoVar = dpVar.f33754f;
                if (xoVar != null && xoVar.getTextView() != null && !TextUtils.isEmpty(dpVar.f33754f.getTextView().getText())) {
                    sb.append("\n");
                    sb.append(dpVar.f33754f.getTextView().getText());
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
        switch (this.f10421b) {
            case 1:
                w0 w0Var = (w0) this.f10422c;
                if (i10 == 67 && w0Var.e.length() == 0 && ((w0Var.h.getVisibility() == 0 && w0Var.h.length() > 0) || w0Var.p())) {
                    if (w0Var.p()) {
                        e0 e0Var = (e0) a2.i(1, w0Var.f20653d0);
                        h5 h5Var = w0Var.E;
                        if (h5Var != null) {
                            h5Var.o(e0Var);
                        }
                        w0Var.C(e0Var);
                        return true;
                    }
                    w0Var.f20670s.callOnClick();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 3:
                c20 c20Var = (c20) this.f10422c;
                if (i10 == 67 && c20Var.f23815r.length() == 0 && c20Var.d()) {
                    if (!c20Var.d()) {
                        return true;
                    }
                    e0 e0Var2 = (e0) a2.i(1, c20Var.C);
                    b20 b20Var = c20Var.E;
                    if (b20Var != null) {
                        ((tx) b20Var).d(e0Var2);
                    }
                    c20Var.g(e0Var2);
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 6:
                a80 a80Var = (a80) this.f10422c;
                c80 c80Var = a80Var.f32488f;
                if (i10 == 67 && a80Var.d.length() == 0 && !c80Var.D.isEmpty()) {
                    c80Var.f33219f.a((n30) a2.i(1, c80Var.D));
                    c80Var.f33218c.e(!c80Var.D.isEmpty(), true);
                    c80Var.c0();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f10421b) {
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
        switch (this.f10421b) {
            case 7:
                if (i10 == 16908322 || i10 == 16908337) {
                    ((pe0) this.f10422c).f37295y = true;
                    postDelayed(new c10(this, 21), 1000L);
                }
                return super.onTextContextMenuItem(i10);
            default:
                return super.onTextContextMenuItem(i10);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f10421b) {
            case 0:
                k kVar = (k) this.f10422c;
                n30 n30Var = kVar.f10438f;
                if (n30Var != null) {
                    n30Var.a();
                    kVar.f10438f = null;
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
                    ((en0) this.f10422c).getClass();
                }
                return super.onTouchEvent(motionEvent);
            case 8:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f10422c;
                n30 n30Var2 = usersSelectActivity.M;
                if (n30Var2 != null) {
                    n30Var2.a();
                    usersSelectActivity.M = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 9:
                f fVar = ((s1) this.f10422c).d;
                if (!fVar.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    fVar.requestFocus();
                    AndroidUtilities.showKeyboard(fVar);
                }
                return super.onTouchEvent(motionEvent);
            case 10:
                c8 c8Var = (c8) this.f10422c;
                n30 n30Var3 = c8Var.e;
                if (n30Var3 != null) {
                    n30Var3.a();
                    c8Var.e = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    c8Var.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}

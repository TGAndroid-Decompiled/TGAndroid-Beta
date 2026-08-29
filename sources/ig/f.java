package ig;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import j7.l1;
import nh.b9;
import nh.d2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.w0;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.tc0;
import org.telegram.ui.Components.um0;
import org.telegram.ui.Components.w10;
import org.telegram.ui.Components.x10;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.fe0;
import org.telegram.ui.kx;
import org.telegram.ui.q00;
import org.telegram.ui.q70;
import org.telegram.ui.s70;
import org.telegram.ui.so;
import org.telegram.ui.yo;
import rf.f0;
public final class f extends EditTextBoldCursor {
    public final int f8978b;
    public final Object f8979c;

    public f(Object obj, Context context, int i10) {
        super(context);
        this.f8978b = i10;
        this.f8979c = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f8978b) {
            case 7:
                ((um0) this.f8979c).getClass();
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f9;
        switch (this.f8978b) {
            case 1:
                super.onFocusChanged(z10, i10, rect);
                if (!z10) {
                    AndroidUtilities.hideKeyboard(((d2) this.f8979c).d);
                    return;
                }
                return;
            case 6:
                super.onFocusChanged(z10, i10, rect);
                tc0 tc0Var = (tc0) this.f8979c;
                if (!z10 && !isFocused()) {
                    f9 = 0.0f;
                } else {
                    f9 = 1.0f;
                }
                tc0Var.b(f9, f9, true);
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f8978b) {
            case 4:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) getText());
                yo yoVar = (yo) this.f8979c;
                so soVar = yoVar.f44924f;
                if (soVar != null && soVar.getTextView() != null && !TextUtils.isEmpty(yoVar.f44924f.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(yoVar.f44924f.getTextView().getText());
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
        switch (this.f8978b) {
            case 3:
                w0 w0Var = (w0) this.f8979c;
                if (i10 == 67 && w0Var.f23920e.length() == 0 && ((w0Var.h.getVisibility() == 0 && w0Var.h.length() > 0) || w0Var.p())) {
                    if (w0Var.p()) {
                        f0 f0Var = (f0) l1.i(1, w0Var.f23918c0);
                        e5 e5Var = w0Var.D;
                        if (e5Var != null) {
                            e5Var.o(f0Var);
                        }
                        w0Var.C(f0Var);
                        return true;
                    }
                    w0Var.f23936s.callOnClick();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 5:
                x10 x10Var = (x10) this.f8979c;
                if (i10 == 67 && x10Var.f34546r.length() == 0 && x10Var.d()) {
                    if (!x10Var.d()) {
                        return true;
                    }
                    f0 f0Var2 = (f0) l1.i(1, x10Var.B);
                    w10 w10Var = x10Var.D;
                    if (w10Var != null) {
                        ((kx) w10Var).g(f0Var2);
                    }
                    x10Var.g(f0Var2);
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 8:
                q70 q70Var = (q70) this.f8979c;
                s70 s70Var = q70Var.f41559f;
                if (i10 == 67 && q70Var.d.length() == 0 && !s70Var.C.isEmpty()) {
                    s70Var.f42297f.a((j30) l1.i(1, s70Var.C));
                    s70Var.f42295c.e(!s70Var.C.isEmpty(), true);
                    s70Var.c0();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f8978b) {
            case 3:
                super.onMeasure(i10, i11);
                setMeasuredDimension(AndroidUtilities.dp(3.0f) + Math.max(View.MeasureSpec.getSize(i10), getMeasuredWidth()), getMeasuredHeight());
                return;
            case 4:
            default:
                super.onMeasure(i10, i11);
                return;
            case 5:
                super.onMeasure(i10, i11);
                setPivotX(getPaddingLeft());
                setPivotY(getMeasuredHeight() / 2.0f);
                return;
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i10) {
        switch (this.f8978b) {
            case 9:
                if (i10 == 16908322 || i10 == 16908337) {
                    ((fe0) this.f8979c).f38133y = true;
                    postDelayed(new q00(this, 21), 1000L);
                }
                return super.onTextContextMenuItem(i10);
            default:
                return super.onTextContextMenuItem(i10);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f8978b) {
            case 0:
                k kVar = (k) this.f8979c;
                j30 j30Var = kVar.f8997f;
                if (j30Var != null) {
                    j30Var.a();
                    kVar.f8997f = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    kVar.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 1:
                f fVar = ((d2) this.f8979c).d;
                if (!fVar.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    fVar.requestFocus();
                    AndroidUtilities.showKeyboard(fVar);
                }
                return super.onTouchEvent(motionEvent);
            case 2:
                b9 b9Var = (b9) this.f8979c;
                j30 j30Var2 = b9Var.f17433e;
                if (j30Var2 != null) {
                    j30Var2.a();
                    b9Var.f17433e = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    b9Var.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 3:
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 1 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return onTouchEvent;
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
                    ((um0) this.f8979c).getClass();
                }
                return super.onTouchEvent(motionEvent);
            case 10:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f8979c;
                j30 j30Var3 = usersSelectActivity.L;
                if (j30Var3 != null) {
                    j30Var3.a();
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

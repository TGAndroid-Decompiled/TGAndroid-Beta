package fg;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import j3.r0;
import kh.g2;
import kh.q9;
import of.m0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.w0;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.l10;
import org.telegram.ui.Components.m10;
import org.telegram.ui.Components.w20;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.ge0;
import org.telegram.ui.ix;
import org.telegram.ui.o00;
import org.telegram.ui.o70;
import org.telegram.ui.po;
import org.telegram.ui.q70;
import org.telegram.ui.vo;
public final class g extends EditTextBoldCursor {
    public final int f6291b;
    public final Object f6292c;

    public g(Object obj, Context context, int i9) {
        super(context);
        this.f6291b = i9;
        this.f6292c = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f6291b) {
            case 7:
                ((hm0) this.f6292c).getClass();
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onFocusChanged(boolean z10, int i9, Rect rect) {
        float f10;
        switch (this.f6291b) {
            case 1:
                super.onFocusChanged(z10, i9, rect);
                if (!z10) {
                    AndroidUtilities.hideKeyboard(((g2) this.f6292c).d);
                    return;
                }
                return;
            case 6:
                super.onFocusChanged(z10, i9, rect);
                ec0 ec0Var = (ec0) this.f6292c;
                if (!z10 && !isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                ec0Var.b(f10, f10, true);
                return;
            default:
                super.onFocusChanged(z10, i9, rect);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f6291b) {
            case 4:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) getText());
                vo voVar = (vo) this.f6292c;
                po poVar = voVar.f43533f;
                if (poVar != null && poVar.getTextView() != null && !TextUtils.isEmpty(voVar.f43533f.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(voVar.f43533f.getTextView().getText());
                }
                accessibilityNodeInfo.setText(sb2);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        switch (this.f6291b) {
            case 3:
                w0 w0Var = (w0) this.f6292c;
                if (i9 == 67 && w0Var.f23906e.length() == 0 && ((w0Var.h.getVisibility() == 0 && w0Var.h.length() > 0) || w0Var.p())) {
                    if (w0Var.p()) {
                        m0 m0Var = (m0) r0.j(1, w0Var.f23904c0);
                        e5 e5Var = w0Var.D;
                        if (e5Var != null) {
                            e5Var.o(m0Var);
                        }
                        w0Var.C(m0Var);
                        return true;
                    }
                    w0Var.f23922s.callOnClick();
                    return true;
                }
                return super.onKeyDown(i9, keyEvent);
            case 5:
                m10 m10Var = (m10) this.f6292c;
                if (i9 == 67 && m10Var.f30664r.length() == 0 && m10Var.e()) {
                    if (!m10Var.e()) {
                        return true;
                    }
                    m0 m0Var2 = (m0) r0.j(1, m10Var.B);
                    l10 l10Var = m10Var.D;
                    if (l10Var != null) {
                        ((ix) l10Var).e(m0Var2);
                    }
                    m10Var.g(m0Var2);
                    return true;
                }
                return super.onKeyDown(i9, keyEvent);
            case 8:
                o70 o70Var = (o70) this.f6292c;
                q70 q70Var = o70Var.f40999f;
                if (i9 == 67 && o70Var.d.length() == 0 && !q70Var.C.isEmpty()) {
                    q70Var.f41704f.a((w20) r0.j(1, q70Var.C));
                    q70Var.f41702c.e(!q70Var.C.isEmpty(), true);
                    q70Var.b0();
                    return true;
                }
                return super.onKeyDown(i9, keyEvent);
            default:
                return super.onKeyDown(i9, keyEvent);
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        switch (this.f6291b) {
            case 3:
                super.onMeasure(i9, i10);
                setMeasuredDimension(AndroidUtilities.dp(3.0f) + Math.max(View.MeasureSpec.getSize(i9), getMeasuredWidth()), getMeasuredHeight());
                return;
            case 4:
            default:
                super.onMeasure(i9, i10);
                return;
            case 5:
                super.onMeasure(i9, i10);
                setPivotX(getPaddingLeft());
                setPivotY(getMeasuredHeight() / 2.0f);
                return;
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i9) {
        switch (this.f6291b) {
            case 9:
                if (i9 == 16908322 || i9 == 16908337) {
                    ((ge0) this.f6292c).f38528y = true;
                    postDelayed(new o00(this, 21), 1000L);
                }
                return super.onTextContextMenuItem(i9);
            default:
                return super.onTextContextMenuItem(i9);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f6291b) {
            case 0:
                m mVar = (m) this.f6292c;
                w20 w20Var = mVar.f6313f;
                if (w20Var != null) {
                    w20Var.a();
                    mVar.f6313f = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    mVar.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 1:
                g gVar = ((g2) this.f6292c).d;
                if (!gVar.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    gVar.requestFocus();
                    AndroidUtilities.showKeyboard(gVar);
                }
                return super.onTouchEvent(motionEvent);
            case 2:
                q9 q9Var = (q9) this.f6292c;
                w20 w20Var2 = q9Var.f15892e;
                if (w20Var2 != null) {
                    w20Var2.a();
                    q9Var.f15892e = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    q9Var.fullScroll(130);
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
                    ((hm0) this.f6292c).getClass();
                }
                return super.onTouchEvent(motionEvent);
            case 10:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f6292c;
                w20 w20Var3 = usersSelectActivity.L;
                if (w20Var3 != null) {
                    w20Var3.a();
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

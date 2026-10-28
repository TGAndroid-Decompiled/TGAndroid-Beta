package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.l20;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.Components.x30;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.cp;
import org.telegram.ui.ie0;
import org.telegram.ui.lx;
import org.telegram.ui.r00;
import org.telegram.ui.wo;
import org.telegram.ui.y10;
public final class c2 extends EditTextBoldCursor {
    public final int f10603b;
    public final Object f10604c;

    public c2(Object obj, Context context, int i10) {
        super(context);
        this.f10603b = i10;
        this.f10604c = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f10603b) {
            case 7:
                ((eo0) this.f10604c).getClass();
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f10603b) {
            case 10:
                y10 y10Var = (y10) this.f10604c;
                if (length() == 0) {
                    super.onDraw(canvas);
                    return;
                }
                canvas.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), 255, 31);
                super.onDraw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getScrollX(), 0.0f, AndroidUtilities.dp(12.0f) + getScrollX(), getHeight());
                y10Var.b(canvas, rectF, 0, 1.0f);
                rectF.set((getWidth() + getScrollX()) - AndroidUtilities.dp(12.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                y10Var.b(canvas, rectF, 2, 1.0f);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f7;
        switch (this.f10603b) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                if (!z10) {
                    AndroidUtilities.hideKeyboard(((f2) this.f10604c).e);
                    return;
                }
                return;
            case 6:
                super.onFocusChanged(z10, i10, rect);
                qd0 qd0Var = (qd0) this.f10604c;
                if (!z10 && !isFocused()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                qd0Var.b(f7, f7, true);
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f10603b) {
            case 4:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) getText());
                cp cpVar = (cp) this.f10604c;
                wo woVar = cpVar.h;
                if (woVar != null && woVar.getTextView() != null && !TextUtils.isEmpty(cpVar.h.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(cpVar.h.getTextView().getText());
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
        TextView textView;
        switch (this.f10603b) {
            case 2:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.f10604c;
                if (i10 == 67 && w0Var.e.length() == 0 && ((w0Var.h.getVisibility() == 0 && w0Var.h.length() > 0) || w0Var.r())) {
                    if (w0Var.r()) {
                        ig.p0 p0Var = (ig.p0) ic.a.g(1, w0Var.f23185g0);
                        org.telegram.ui.ActionBar.s0 s0Var = w0Var.H;
                        if (s0Var != null) {
                            s0Var.j(p0Var);
                        }
                        w0Var.I(p0Var);
                        return true;
                    }
                    w0Var.f23198s.callOnClick();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 3:
                org.telegram.ui.ActionBar.r5 r5Var = (org.telegram.ui.ActionBar.r5) this.f10604c;
                if (i10 == 67 && length() == 0 && (textView = r5Var.f23048w) != null && textView.getVisibility() == 0) {
                    r5Var.e();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 4:
            default:
                return super.onKeyDown(i10, keyEvent);
            case 5:
                m20 m20Var = (m20) this.f10604c;
                if (i10 == 67 && m20Var.f30347r.length() == 0 && m20Var.d()) {
                    if (!m20Var.d()) {
                        return true;
                    }
                    ig.p0 p0Var2 = (ig.p0) ic.a.g(1, m20Var.F);
                    l20 l20Var = m20Var.H;
                    if (l20Var != null) {
                        ((lx) l20Var).f(p0Var2);
                    }
                    m20Var.f(p0Var2);
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f10603b) {
            case 2:
                super.onMeasure(i10, i11);
                setMeasuredDimension(AndroidUtilities.dp(3.0f) + Math.max(View.MeasureSpec.getSize(i10), getMeasuredWidth()), getMeasuredHeight());
                return;
            case 5:
                super.onMeasure(i10, i11);
                setPivotX(getPaddingLeft());
                setPivotY(getMeasuredHeight() / 2.0f);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i10) {
        switch (this.f10603b) {
            case 8:
                if (i10 == 16908322 || i10 == 16908337) {
                    ((ie0) this.f10604c).f40130y = true;
                    postDelayed(new r00(this, 23), 1000L);
                }
                return super.onTextContextMenuItem(i10);
            default:
                return super.onTextContextMenuItem(i10);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f10603b) {
            case 0:
                c2 c2Var = ((f2) this.f10604c).e;
                if (!c2Var.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    c2Var.requestFocus();
                    AndroidUtilities.showKeyboard(c2Var);
                }
                return super.onTouchEvent(motionEvent);
            case 1:
                k9 k9Var = (k9) this.f10604c;
                x30 x30Var = k9Var.f11125f;
                if (x30Var != null) {
                    x30Var.a();
                    k9Var.f11125f = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    k9Var.fullScroll(130);
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
            case 7:
                if (!isEnabled()) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ((eo0) this.f10604c).getClass();
                }
                return super.onTouchEvent(motionEvent);
            case 9:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f10604c;
                x30 x30Var2 = usersSelectActivity.P;
                if (x30Var2 != null) {
                    x30Var2.a();
                    usersSelectActivity.P = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 11:
                zg.i iVar = (zg.i) this.f10604c;
                x30 x30Var3 = iVar.f52937f;
                if (x30Var3 != null) {
                    x30Var3.a();
                    iVar.f52937f = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    iVar.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public c2(Context context) {
        super(context);
        this.f10603b = 10;
        this.f10604c = new y10();
    }
}

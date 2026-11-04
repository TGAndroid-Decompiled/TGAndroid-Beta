package bh;

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
import gi.d2;
import gi.q8;
import k2.p1;
import kg.l0;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.m0;
import org.telegram.ui.ActionBar.q0;
import org.telegram.ui.ActionBar.y4;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.fb0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.m00;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.y10;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.av;
import org.telegram.ui.bo;
import org.telegram.ui.cc0;
import org.telegram.ui.fz;
import org.telegram.ui.vn;
public final class g extends EditTextBoldCursor {
    public final int H1;
    public final Object I1;

    public g(int i3, Context context, Object obj) {
        super(context);
        this.H1 = i3;
        this.I1 = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.H1) {
            case 8:
                ((il0) this.I1).getClass();
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.H1) {
            case 11:
                k4.j jVar = (k4.j) this.I1;
                if (length() == 0) {
                    super.onDraw(canvas);
                    return;
                }
                canvas.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), 255, 31);
                super.onDraw(canvas);
                RectF rectF = g0.P;
                rectF.set(getScrollX(), 0.0f, g0.L(12.0f) + getScrollX(), getHeight());
                jVar.w(canvas, rectF, 0, 1.0f);
                rectF.set((getWidth() + getScrollX()) - g0.L(12.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                jVar.w(canvas, rectF, 2, 1.0f);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onFocusChanged(boolean z10, int i3, Rect rect) {
        float f10;
        switch (this.H1) {
            case 1:
                super.onFocusChanged(z10, i3, rect);
                if (!z10) {
                    g0.v1(((d2) this.I1).f12551e);
                    return;
                }
                return;
            case 7:
                super.onFocusChanged(z10, i3, rect);
                fb0 fb0Var = (fb0) this.I1;
                if (!z10 && !isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                fb0Var.b(f10, f10, true);
                return;
            default:
                super.onFocusChanged(z10, i3, rect);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.H1) {
            case 5:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) getText());
                bo boVar = (bo) this.I1;
                vn vnVar = boVar.h;
                if (vnVar != null && vnVar.getTextView() != null && !TextUtils.isEmpty(boVar.h.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(boVar.h.getTextView().getText());
                }
                accessibilityNodeInfo.setText(sb2);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i3, KeyEvent keyEvent) {
        TextView textView;
        switch (this.H1) {
            case 3:
                q0 q0Var = (q0) this.I1;
                if (i3 == 67 && q0Var.f28445e.length() == 0 && ((q0Var.h.getVisibility() == 0 && q0Var.h.length() > 0) || q0Var.r())) {
                    if (q0Var.r()) {
                        l0 l0Var = (l0) p1.h(1, q0Var.f28450h0);
                        m0 m0Var = q0Var.I;
                        if (m0Var != null) {
                            m0Var.j(l0Var);
                        }
                        q0Var.I(l0Var);
                        return true;
                    }
                    q0Var.f28462s.callOnClick();
                    return true;
                }
                return super.onKeyDown(i3, keyEvent);
            case 4:
                y4 y4Var = (y4) this.I1;
                if (i3 == 67 && length() == 0 && (textView = y4Var.f28877x) != null && textView.getVisibility() == 0) {
                    y4Var.i();
                    return true;
                }
                return super.onKeyDown(i3, keyEvent);
            case 5:
            default:
                return super.onKeyDown(i3, keyEvent);
            case 6:
                n00 n00Var = (n00) this.I1;
                if (i3 == 67 && n00Var.f36302r.length() == 0 && n00Var.d()) {
                    if (!n00Var.d()) {
                        return true;
                    }
                    l0 l0Var2 = (l0) p1.h(1, n00Var.G);
                    m00 m00Var = n00Var.I;
                    if (m00Var != null) {
                        ((av) m00Var).g(l0Var2);
                    }
                    n00Var.f(l0Var2);
                    return true;
                }
                return super.onKeyDown(i3, keyEvent);
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.H1) {
            case 3:
                super.onMeasure(i3, i10);
                setMeasuredDimension(g0.L(3.0f) + Math.max(View.MeasureSpec.getSize(i3), getMeasuredWidth()), getMeasuredHeight());
                return;
            case 6:
                super.onMeasure(i3, i10);
                setPivotX(getPaddingLeft());
                setPivotY(getMeasuredHeight() / 2.0f);
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i3) {
        switch (this.H1) {
            case 9:
                if (i3 == 16908322 || i3 == 16908337) {
                    ((cc0) this.I1).E = true;
                    postDelayed(new fz(this, 23), 1000L);
                }
                return super.onTextContextMenuItem(i3);
            default:
                return super.onTextContextMenuItem(i3);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.H1) {
            case 0:
                m mVar = (m) this.I1;
                y10 y10Var = mVar.f3337f;
                if (y10Var != null) {
                    y10Var.a();
                    mVar.f3337f = null;
                }
                if (motionEvent.getAction() == 0 && !g0.K3(this)) {
                    mVar.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 1:
                g gVar = ((d2) this.I1).f12551e;
                if (!gVar.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    gVar.requestFocus();
                    g0.K3(gVar);
                }
                return super.onTouchEvent(motionEvent);
            case 2:
                q8 q8Var = (q8) this.I1;
                y10 y10Var2 = q8Var.f13443f;
                if (y10Var2 != null) {
                    y10Var2.a();
                    q8Var.f13443f = null;
                }
                if (motionEvent.getAction() == 0 && !g0.K3(this)) {
                    q8Var.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 3:
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 1 && !g0.K3(this)) {
                    clearFocus();
                    requestFocus();
                }
                return onTouchEvent;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            default:
                return super.onTouchEvent(motionEvent);
            case 8:
                if (!isEnabled()) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ((il0) this.I1).getClass();
                }
                return super.onTouchEvent(motionEvent);
            case 10:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.I1;
                y10 y10Var3 = usersSelectActivity.R;
                if (y10Var3 != null) {
                    y10Var3.a();
                    usersSelectActivity.R = null;
                }
                if (motionEvent.getAction() == 0 && !g0.K3(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
        }
    }

    public g(Context context) {
        super(context);
        this.H1 = 11;
        this.I1 = new k4.j(24);
    }
}

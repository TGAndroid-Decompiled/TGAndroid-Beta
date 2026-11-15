package ah;

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
import hi.d2;
import hi.n8;
import jg.o0;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.m0;
import org.telegram.ui.ActionBar.q0;
import org.telegram.ui.ActionBar.w4;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.be;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.he;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.v00;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.ao;
import org.telegram.ui.dc0;
import org.telegram.ui.ev;
import org.telegram.ui.ho;
import org.telegram.ui.iz;
public final class i extends EditTextBoldCursor {
    public final int M1;
    public final Object N1;

    public i(int i7, Context context, Object obj) {
        super(context);
        this.M1 = i7;
        this.N1 = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.M1) {
            case 8:
                ((jl0) this.N1).getClass();
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.M1) {
            case 11:
                h6.m mVar = (h6.m) this.N1;
                if (length() == 0) {
                    super.onDraw(canvas);
                    return;
                }
                canvas.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), 255, 31);
                super.onDraw(canvas);
                RectF rectF = g0.P;
                rectF.set(getScrollX(), 0.0f, g0.L(12.0f) + getScrollX(), getHeight());
                mVar.m(canvas, rectF, 0, 1.0f);
                rectF.set((getWidth() + getScrollX()) - g0.L(12.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                mVar.m(canvas, rectF, 2, 1.0f);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onFocusChanged(boolean z10, int i7, Rect rect) {
        float f10;
        switch (this.M1) {
            case 1:
                super.onFocusChanged(z10, i7, rect);
                if (!z10) {
                    g0.v1(((d2) this.N1).f14091e);
                    return;
                }
                return;
            case 7:
                super.onFocusChanged(z10, i7, rect);
                lb0 lb0Var = (lb0) this.N1;
                if (!z10 && !isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                lb0Var.b(f10, f10, true);
                return;
            default:
                super.onFocusChanged(z10, i7, rect);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.M1) {
            case 5:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) getText());
                ho hoVar = (ho) this.N1;
                ao aoVar = hoVar.h;
                if (aoVar != null && aoVar.getTextView() != null && !TextUtils.isEmpty(hoVar.h.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(hoVar.h.getTextView().getText());
                }
                accessibilityNodeInfo.setText(sb2);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        TextView textView;
        switch (this.M1) {
            case 3:
                q0 q0Var = (q0) this.N1;
                if (i7 == 67 && q0Var.f29502e.length() == 0 && ((q0Var.h.getVisibility() == 0 && q0Var.h.length() > 0) || q0Var.s())) {
                    if (q0Var.s()) {
                        o0 o0Var = (o0) i5.c.h(1, q0Var.f29507h0);
                        m0 m0Var = q0Var.I;
                        if (m0Var != null) {
                            m0Var.j(o0Var);
                        }
                        q0Var.J(o0Var);
                        return true;
                    }
                    q0Var.f29519s.callOnClick();
                    return true;
                }
                return super.onKeyDown(i7, keyEvent);
            case 4:
                w4 w4Var = (w4) this.N1;
                if (i7 == 67 && length() == 0 && (textView = w4Var.f29834x) != null && textView.getVisibility() == 0) {
                    w4Var.l();
                    return true;
                }
                return super.onKeyDown(i7, keyEvent);
            case 5:
            default:
                return super.onKeyDown(i7, keyEvent);
            case 6:
                v00 v00Var = (v00) this.N1;
                if (i7 == 67 && v00Var.f40202r.length() == 0 && v00Var.d()) {
                    if (!v00Var.d()) {
                        return true;
                    }
                    o0 o0Var2 = (o0) i5.c.h(1, v00Var.G);
                    u00 u00Var = v00Var.I;
                    if (u00Var != null) {
                        ((ev) u00Var).g(o0Var2);
                    }
                    v00Var.f(o0Var2);
                    return true;
                }
                return super.onKeyDown(i7, keyEvent);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.M1) {
            case 3:
                super.onMeasure(i7, i10);
                setMeasuredDimension(g0.L(3.0f) + Math.max(View.MeasureSpec.getSize(i7), getMeasuredWidth()), getMeasuredHeight());
                return;
            case 6:
                super.onMeasure(i7, i10);
                setPivotX(getPaddingLeft());
                setPivotY(getMeasuredHeight() / 2.0f);
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        boolean z10;
        switch (this.M1) {
            case 12:
                super.onTextChanged(charSequence, i7, i10, i11);
                be beVar = ((yh.a) this.N1).f60719b;
                if (beVar != null) {
                    ChatActivityEnterView chatActivityEnterView = beVar.f33264b;
                    int i12 = ChatActivityEnterView.N6;
                    he heVar = chatActivityEnterView.K0;
                    if (heVar != null) {
                        if (chatActivityEnterView.C1 && chatActivityEnterView.M1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        heVar.setIconDimmed(z10);
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onTextChanged(charSequence, i7, i10, i11);
                return;
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i7) {
        switch (this.M1) {
            case 9:
                if (i7 == 16908322 || i7 == 16908337) {
                    ((dc0) this.N1).E = true;
                    postDelayed(new iz(this, 24), 1000L);
                }
                return super.onTextContextMenuItem(i7);
            default:
                return super.onTextContextMenuItem(i7);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.M1) {
            case 0:
                o oVar = (o) this.N1;
                f20 f20Var = oVar.f1098f;
                if (f20Var != null) {
                    f20Var.a();
                    oVar.f1098f = null;
                }
                if (motionEvent.getAction() == 0 && !g0.J3(this)) {
                    oVar.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 1:
                i iVar = ((d2) this.N1).f14091e;
                if (!iVar.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    iVar.requestFocus();
                    g0.J3(iVar);
                }
                return super.onTouchEvent(motionEvent);
            case 2:
                n8 n8Var = (n8) this.N1;
                f20 f20Var2 = n8Var.f14772f;
                if (f20Var2 != null) {
                    f20Var2.a();
                    n8Var.f14772f = null;
                }
                if (motionEvent.getAction() == 0 && !g0.J3(this)) {
                    n8Var.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 3:
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 1 && !g0.J3(this)) {
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
                    ((jl0) this.N1).getClass();
                }
                return super.onTouchEvent(motionEvent);
            case 10:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.N1;
                f20 f20Var3 = usersSelectActivity.R;
                if (f20Var3 != null) {
                    f20Var3.a();
                    usersSelectActivity.R = null;
                }
                if (motionEvent.getAction() == 0 && !g0.J3(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
        }
    }

    public i(Context context) {
        super(context);
        this.M1 = 11;
        this.N1 = new h6.m(29);
    }
}

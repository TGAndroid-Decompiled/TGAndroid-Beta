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
import hi.m8;
import jg.o0;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.m0;
import org.telegram.ui.ActionBar.q0;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.ke;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.re;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.co;
import org.telegram.ui.ec0;
import org.telegram.ui.hv;
import org.telegram.ui.jo;
import org.telegram.ui.lz;
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
                ((tl0) this.N1).getClass();
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
                mVar.n(canvas, rectF, 0, 1.0f);
                rectF.set((getWidth() + getScrollX()) - g0.L(12.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                mVar.n(canvas, rectF, 2, 1.0f);
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
                    g0.v1(((d2) this.N1).f14479e);
                    return;
                }
                return;
            case 7:
                super.onFocusChanged(z10, i7, rect);
                wb0 wb0Var = (wb0) this.N1;
                if (!z10 && !isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                wb0Var.b(f10, f10, true);
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
                jo joVar = (jo) this.N1;
                co coVar = joVar.h;
                if (coVar != null && coVar.getTextView() != null && !TextUtils.isEmpty(joVar.h.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(joVar.h.getTextView().getText());
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
                if (i7 == 67 && q0Var.f29907e.length() == 0 && ((q0Var.h.getVisibility() == 0 && q0Var.h.length() > 0) || q0Var.s())) {
                    if (q0Var.s()) {
                        o0 o0Var = (o0) i5.c.h(1, q0Var.f29912h0);
                        m0 m0Var = q0Var.I;
                        if (m0Var != null) {
                            m0Var.j(o0Var);
                        }
                        q0Var.J(o0Var);
                        return true;
                    }
                    q0Var.f29924s.callOnClick();
                    return true;
                }
                return super.onKeyDown(i7, keyEvent);
            case 4:
                z4 z4Var = (z4) this.N1;
                if (i7 == 67 && length() == 0 && (textView = z4Var.f30352x) != null && textView.getVisibility() == 0) {
                    z4Var.n();
                    return true;
                }
                return super.onKeyDown(i7, keyEvent);
            case 5:
            default:
                return super.onKeyDown(i7, keyEvent);
            case 6:
                e10 e10Var = (e10) this.N1;
                if (i7 == 67 && e10Var.f34642r.length() == 0 && e10Var.d()) {
                    if (!e10Var.d()) {
                        return true;
                    }
                    o0 o0Var2 = (o0) i5.c.h(1, e10Var.G);
                    d10 d10Var = e10Var.I;
                    if (d10Var != null) {
                        ((hv) d10Var).e(o0Var2);
                    }
                    e10Var.f(o0Var2);
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
                ke keVar = ((yh.a) this.N1).f61332b;
                if (keVar != null) {
                    ChatActivityEnterView chatActivityEnterView = keVar.f36895b;
                    int i12 = ChatActivityEnterView.f32569s7;
                    re reVar = chatActivityEnterView.K0;
                    if (reVar != null) {
                        if (chatActivityEnterView.K1 && chatActivityEnterView.U1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        reVar.setIconDimmed(z10);
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
                    ((ec0) this.N1).E = true;
                    postDelayed(new lz(this, 24), 1000L);
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
                p20 p20Var = oVar.f1097f;
                if (p20Var != null) {
                    p20Var.a();
                    oVar.f1097f = null;
                }
                if (motionEvent.getAction() == 0 && !g0.I3(this)) {
                    oVar.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 1:
                i iVar = ((d2) this.N1).f14479e;
                if (!iVar.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    iVar.requestFocus();
                    g0.I3(iVar);
                }
                return super.onTouchEvent(motionEvent);
            case 2:
                m8 m8Var = (m8) this.N1;
                p20 p20Var2 = m8Var.f15034f;
                if (p20Var2 != null) {
                    p20Var2.a();
                    m8Var.f15034f = null;
                }
                if (motionEvent.getAction() == 0 && !g0.I3(this)) {
                    m8Var.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 3:
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 1 && !g0.I3(this)) {
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
                    ((tl0) this.N1).getClass();
                }
                return super.onTouchEvent(motionEvent);
            case 10:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.N1;
                p20 p20Var3 = usersSelectActivity.R;
                if (p20Var3 != null) {
                    p20Var3.a();
                    usersSelectActivity.R = null;
                }
                if (motionEvent.getAction() == 0 && !g0.I3(this)) {
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

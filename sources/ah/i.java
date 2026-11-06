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
import fi.e2;
import fi.p8;
import jg.o0;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.n0;
import org.telegram.ui.ActionBar.r0;
import org.telegram.ui.ActionBar.y4;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.kb0;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.r00;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.dv;
import org.telegram.ui.ec0;
import org.telegram.ui.go;
import org.telegram.ui.hz;
import org.telegram.ui.zn;
public final class i extends EditTextBoldCursor {
    public final int G1;
    public final Object H1;

    public i(int i7, Context context, Object obj) {
        super(context);
        this.G1 = i7;
        this.H1 = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.G1) {
            case 8:
                ((el0) this.H1).getClass();
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.G1) {
            case 11:
                h6.m mVar = (h6.m) this.H1;
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
    public void onFocusChanged(boolean z9, int i7, Rect rect) {
        float f10;
        switch (this.G1) {
            case 1:
                super.onFocusChanged(z9, i7, rect);
                if (!z9) {
                    g0.v1(((e2) this.H1).f11858e);
                    return;
                }
                return;
            case 7:
                super.onFocusChanged(z9, i7, rect);
                kb0 kb0Var = (kb0) this.H1;
                if (!z9 && !isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                kb0Var.b(f10, f10, true);
                return;
            default:
                super.onFocusChanged(z9, i7, rect);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.G1) {
            case 5:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) getText());
                go goVar = (go) this.H1;
                zn znVar = goVar.h;
                if (znVar != null && znVar.getTextView() != null && !TextUtils.isEmpty(goVar.h.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(goVar.h.getTextView().getText());
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
        switch (this.G1) {
            case 3:
                r0 r0Var = (r0) this.H1;
                if (i7 == 67 && r0Var.f28426e.length() == 0 && ((r0Var.h.getVisibility() == 0 && r0Var.h.length() > 0) || r0Var.r())) {
                    if (r0Var.r()) {
                        o0 o0Var = (o0) jg.g.i(1, r0Var.f28430g0);
                        n0 n0Var = r0Var.H;
                        if (n0Var != null) {
                            n0Var.j(o0Var);
                        }
                        r0Var.I(o0Var);
                        return true;
                    }
                    r0Var.f28443s.callOnClick();
                    return true;
                }
                return super.onKeyDown(i7, keyEvent);
            case 4:
                y4 y4Var = (y4) this.H1;
                if (i7 == 67 && length() == 0 && (textView = y4Var.f28804x) != null && textView.getVisibility() == 0) {
                    y4Var.i();
                    return true;
                }
                return super.onKeyDown(i7, keyEvent);
            case 5:
            default:
                return super.onKeyDown(i7, keyEvent);
            case 6:
                r00 r00Var = (r00) this.H1;
                if (i7 == 67 && r00Var.f37441r.length() == 0 && r00Var.d()) {
                    if (!r00Var.d()) {
                        return true;
                    }
                    o0 o0Var2 = (o0) jg.g.i(1, r00Var.F);
                    q00 q00Var = r00Var.H;
                    if (q00Var != null) {
                        ((dv) q00Var).h(o0Var2);
                    }
                    r00Var.f(o0Var2);
                    return true;
                }
                return super.onKeyDown(i7, keyEvent);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.G1) {
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
    public boolean onTextContextMenuItem(int i7) {
        switch (this.G1) {
            case 9:
                if (i7 == 16908322 || i7 == 16908337) {
                    ((ec0) this.H1).D = true;
                    postDelayed(new hz(this, 24), 1000L);
                }
                return super.onTextContextMenuItem(i7);
            default:
                return super.onTextContextMenuItem(i7);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.G1) {
            case 0:
                o oVar = (o) this.H1;
                c20 c20Var = oVar.f1100f;
                if (c20Var != null) {
                    c20Var.a();
                    oVar.f1100f = null;
                }
                if (motionEvent.getAction() == 0 && !g0.K3(this)) {
                    oVar.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 1:
                i iVar = ((e2) this.H1).f11858e;
                if (!iVar.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    iVar.requestFocus();
                    g0.K3(iVar);
                }
                return super.onTouchEvent(motionEvent);
            case 2:
                p8 p8Var = (p8) this.H1;
                c20 c20Var2 = p8Var.f12615f;
                if (c20Var2 != null) {
                    c20Var2.a();
                    p8Var.f12615f = null;
                }
                if (motionEvent.getAction() == 0 && !g0.K3(this)) {
                    p8Var.fullScroll(130);
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
                    ((el0) this.H1).getClass();
                }
                return super.onTouchEvent(motionEvent);
            case 10:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.H1;
                c20 c20Var3 = usersSelectActivity.Q;
                if (c20Var3 != null) {
                    c20Var3.a();
                    usersSelectActivity.Q = null;
                }
                if (motionEvent.getAction() == 0 && !g0.K3(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
        }
    }

    public i(Context context) {
        super(context);
        this.G1 = 11;
        this.H1 = new h6.m(28);
    }
}

package defpackage;

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
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.UsersSelectActivity;
public final class l7 extends EditTextBoldCursor {
    public final byte M1;
    public final Object N1;

    public l7(Context context) {
        super(context);
        this.M1 = (byte) 11;
        this.N1 = new in3((byte) 7);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.M1) {
            case 11:
                in3 in3Var = (in3) this.N1;
                if (length() == 0) {
                    super.onDraw(canvas);
                    return;
                }
                canvas.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), 255, 31);
                super.onDraw(canvas);
                RectF rectF = gm.P;
                rectF.set(getScrollX(), 0.0f, gm.L(12.0f) + getScrollX(), getHeight());
                in3Var.r(canvas, rectF, 0, 1.0f);
                rectF.set((getWidth() + getScrollX()) - gm.L(12.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                in3Var.r(canvas, rectF, 2, 1.0f);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        float f;
        byte b = this.M1;
        Object obj = this.N1;
        switch (b) {
            case 2:
                super.onFocusChanged(z, i, rect);
                if (!z) {
                    gm.t1(((ix3) obj).e);
                    return;
                }
                return;
            case 5:
                super.onFocusChanged(z, i, rect);
                ft7 ft7Var = (ft7) obj;
                if (!z && !isFocused()) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                ft7Var.b(f, f, true);
                return;
            default:
                super.onFocusChanged(z, i, rect);
                return;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.M1) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) getText());
                qa2 qa2Var = (qa2) this.N1;
                ka2 ka2Var = qa2Var.h;
                if (ka2Var != null && ka2Var.getTextView() != null && !TextUtils.isEmpty(qa2Var.h.getTextView().getText())) {
                    sb.append("\n");
                    sb.append(qa2Var.h.getTextView().getText());
                }
                accessibilityNodeInfo.setText(sb);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        TextView textView;
        byte b = this.M1;
        Object obj = this.N1;
        switch (b) {
            case 0:
                r7 r7Var = (r7) obj;
                if (i == 67 && r7Var.e.length() == 0 && ((r7Var.h.getVisibility() == 0 && r7Var.h.length() > 0) || r7Var.s())) {
                    if (r7Var.s()) {
                        sh4 sh4Var = (sh4) b10.f(1, r7Var.h0);
                        n7 n7Var = r7Var.I;
                        if (n7Var != null) {
                            n7Var.j(sh4Var);
                        }
                        r7Var.J(sh4Var);
                        return true;
                    }
                    r7Var.s.callOnClick();
                    return true;
                }
                return super.onKeyDown(i, keyEvent);
            case 3:
                oq4 oq4Var = (oq4) obj;
                if (i == 67 && oq4Var.r.length() == 0 && oq4Var.d()) {
                    if (!oq4Var.d()) {
                        return true;
                    }
                    sh4 sh4Var2 = (sh4) b10.f(1, oq4Var.G);
                    nq4 nq4Var = oq4Var.I;
                    if (nq4Var != null) {
                        ((pj3) nq4Var).a(sh4Var2);
                    }
                    oq4Var.f(sh4Var2);
                    return true;
                }
                return super.onKeyDown(i, keyEvent);
            case 7:
                rja rjaVar = (rja) obj;
                if (i == 67 && length() == 0 && (textView = rjaVar.x) != null && textView.getVisibility() == 0) {
                    rjaVar.n();
                    return true;
                }
                return super.onKeyDown(i, keyEvent);
            default:
                return super.onKeyDown(i, keyEvent);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.M1) {
            case 0:
                super.onMeasure(i, i2);
                setMeasuredDimension(gm.L(3.0f) + Math.max(View.MeasureSpec.getSize(i), getMeasuredWidth()), getMeasuredHeight());
                return;
            case 3:
                super.onMeasure(i, i2);
                setPivotX(getPaddingLeft());
                setPivotY(getMeasuredHeight() / 2.0f);
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        switch (this.M1) {
            case 10:
                super.onTextChanged(charSequence, i, i2, i3);
                vx1 vx1Var = ((olc) this.N1).b;
                if (vx1Var != null) {
                    ChatActivityEnterView chatActivityEnterView = vx1Var.b;
                    int i4 = ChatActivityEnterView.z7;
                    by1 by1Var = chatActivityEnterView.K0;
                    if (by1Var != null) {
                        if (chatActivityEnterView.K1 && chatActivityEnterView.U1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        by1Var.setIconDimmed(z);
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onTextChanged(charSequence, i, i2, i3);
                return;
        }
    }

    @Override
    public final boolean onTextContextMenuItem(int i) {
        switch (this.M1) {
            case 4:
                if (i == 16908322 || i == 16908337) {
                    ((pf6) this.N1).E = true;
                    postDelayed(new bn3(this, (byte) 26), 1000L);
                }
                return super.onTextContextMenuItem(i);
            default:
                return super.onTextContextMenuItem(i);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        byte b = this.M1;
        Object obj = this.N1;
        switch (b) {
            case 0:
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 1 && !gm.E3(this)) {
                    clearFocus();
                    requestFocus();
                }
                return onTouchEvent;
            case 2:
                l7 l7Var = ((ix3) obj).e;
                if (!l7Var.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    l7Var.requestFocus();
                    gm.E3(l7Var);
                }
                return super.onTouchEvent(motionEvent);
            case 6:
                j1a j1aVar = (j1a) obj;
                wc5 wc5Var = j1aVar.f;
                if (wc5Var != null) {
                    wc5Var.a();
                    j1aVar.f = null;
                }
                if (motionEvent.getAction() == 0 && !gm.E3(this)) {
                    j1aVar.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 8:
                x7b x7bVar = (x7b) obj;
                wc5 wc5Var2 = x7bVar.f;
                if (wc5Var2 != null) {
                    wc5Var2.a();
                    x7bVar.f = null;
                }
                if (motionEvent.getAction() == 0 && !gm.E3(this)) {
                    x7bVar.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 9:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj;
                wc5 wc5Var3 = usersSelectActivity.R;
                if (wc5Var3 != null) {
                    wc5Var3.a();
                    usersSelectActivity.R = null;
                }
                if (motionEvent.getAction() == 0 && !gm.E3(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public l7(byte b, Context context, Object obj) {
        super(context);
        this.M1 = b;
        this.N1 = obj;
    }
}

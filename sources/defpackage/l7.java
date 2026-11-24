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
        this.N1 = new xl3((byte) 7);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.M1) {
            case 11:
                xl3 xl3Var = (xl3) this.N1;
                if (length() == 0) {
                    super.onDraw(canvas);
                    return;
                }
                canvas.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), 255, 31);
                super.onDraw(canvas);
                RectF rectF = gl.P;
                rectF.set(getScrollX(), 0.0f, gl.L(12.0f) + getScrollX(), getHeight());
                xl3Var.s(canvas, rectF, 0, 1.0f);
                rectF.set((getWidth() + getScrollX()) - gl.L(12.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                xl3Var.s(canvas, rectF, 2, 1.0f);
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
                    gl.t1(((xv3) obj).e);
                    return;
                }
                return;
            case 5:
                super.onFocusChanged(z, i, rect);
                dr7 dr7Var = (dr7) obj;
                if (!z && !isFocused()) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                dr7Var.b(f, f, true);
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
                f92 f92Var = (f92) this.N1;
                z82 z82Var = f92Var.h;
                if (z82Var != null && z82Var.getTextView() != null && !TextUtils.isEmpty(f92Var.h.getTextView().getText())) {
                    sb.append("\n");
                    sb.append(f92Var.h.getTextView().getText());
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
                        rf4 rf4Var = (rf4) b00.f(1, r7Var.h0);
                        n7 n7Var = r7Var.I;
                        if (n7Var != null) {
                            n7Var.j(rf4Var);
                        }
                        r7Var.J(rf4Var);
                        return true;
                    }
                    r7Var.s.callOnClick();
                    return true;
                }
                return super.onKeyDown(i, keyEvent);
            case 3:
                no4 no4Var = (no4) obj;
                if (i == 67 && no4Var.r.length() == 0 && no4Var.d()) {
                    if (!no4Var.d()) {
                        return true;
                    }
                    rf4 rf4Var2 = (rf4) b00.f(1, no4Var.G);
                    mo4 mo4Var = no4Var.I;
                    if (mo4Var != null) {
                        ((di3) mo4Var).a(rf4Var2);
                    }
                    no4Var.f(rf4Var2);
                    return true;
                }
                return super.onKeyDown(i, keyEvent);
            case 7:
                pha phaVar = (pha) obj;
                if (i == 67 && length() == 0 && (textView = phaVar.x) != null && textView.getVisibility() == 0) {
                    phaVar.m();
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
                setMeasuredDimension(gl.L(3.0f) + Math.max(View.MeasureSpec.getSize(i), getMeasuredWidth()), getMeasuredHeight());
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
                iw1 iw1Var = ((ojc) this.N1).b;
                if (iw1Var != null) {
                    ChatActivityEnterView chatActivityEnterView = iw1Var.b;
                    int i4 = ChatActivityEnterView.r7;
                    ow1 ow1Var = chatActivityEnterView.K0;
                    if (ow1Var != null) {
                        if (chatActivityEnterView.K1 && chatActivityEnterView.U1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        ow1Var.setIconDimmed(z);
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
                    ((qd6) this.N1).E = true;
                    postDelayed(new ql3(this, (byte) 26), 1000L);
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
                if (motionEvent.getAction() == 1 && !gl.F3(this)) {
                    clearFocus();
                    requestFocus();
                }
                return onTouchEvent;
            case 2:
                l7 l7Var = ((xv3) obj).e;
                if (!l7Var.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    l7Var.requestFocus();
                    gl.F3(l7Var);
                }
                return super.onTouchEvent(motionEvent);
            case 6:
                hz9 hz9Var = (hz9) obj;
                ya5 ya5Var = hz9Var.f;
                if (ya5Var != null) {
                    ya5Var.a();
                    hz9Var.f = null;
                }
                if (motionEvent.getAction() == 0 && !gl.F3(this)) {
                    hz9Var.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 8:
                v5b v5bVar = (v5b) obj;
                ya5 ya5Var2 = v5bVar.f;
                if (ya5Var2 != null) {
                    ya5Var2.a();
                    v5bVar.f = null;
                }
                if (motionEvent.getAction() == 0 && !gl.F3(this)) {
                    v5bVar.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 9:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj;
                ya5 ya5Var3 = usersSelectActivity.R;
                if (ya5Var3 != null) {
                    ya5Var3.a();
                    usersSelectActivity.R = null;
                }
                if (motionEvent.getAction() == 0 && !gl.F3(this)) {
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

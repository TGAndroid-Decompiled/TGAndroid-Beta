package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class f42 extends EditTextBoldCursor {
    public final byte N1 = 2;
    public final ll O1;
    public int P1;
    public final hn Q1;
    public final Object R1;

    public f42(euc eucVar, Activity activity) {
        super(activity);
        this.R1 = eucVar;
        this.P1 = 960;
        this.O1 = new ll(this);
        hn hnVar = new hn(false, true, true);
        this.Q1 = hnVar;
        hnVar.n(0.2f, 160L, k43.h);
        hnVar.w(hl.L(15.33f));
        hnVar.b = 5;
        hnVar.setCallback(this);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        byte b = this.N1;
        Object obj = this.R1;
        ll llVar = this.O1;
        hn hnVar = this.Q1;
        switch (b) {
            case 0:
                super.dispatchDraw(canvas);
                if (this.P1 <= 0) {
                    i = aob.p7;
                } else {
                    i = aob.P5;
                }
                hnVar.u(llVar.a(aob.v0(i, ((h42) obj).a), false));
                int L = hl.L(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
                int height = getHeight() + getScrollY();
                hnVar.setBounds(L - hl.L(48.0f), height - Math.min(hl.L(44.0f), getHeight()), L, height);
                hnVar.draw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                if (this.P1 < 0) {
                    i2 = aob.p7;
                } else {
                    i2 = aob.P5;
                }
                hnVar.u(llVar.a(aob.v0(i2, ((tc6) obj).getResourceProvider()), false));
                hnVar.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                hnVar.draw(canvas);
                return;
            case 2:
                super.dispatchDraw(canvas);
                if (this.P1 < 0) {
                    i3 = aob.p7;
                } else {
                    i3 = aob.P5;
                }
                hnVar.u(llVar.a(aob.v0(i3, (vnb) obj), false));
                hnVar.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                hnVar.draw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                if (this.P1 <= 0) {
                    i4 = aob.p7;
                } else {
                    i4 = aob.P5;
                }
                hnVar.u(llVar.a(aob.v0(i4, ((euc) obj).getResourceProvider()), false));
                int L2 = hl.L(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
                int height2 = getHeight() + getScrollY();
                hnVar.setBounds(L2 - hl.L(48.0f), height2 - Math.min(hl.L(44.0f), getHeight()), L2, height2);
                hnVar.draw(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.N1) {
            case 2:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(36.0f), 1073741824));
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.N1;
        String str = "";
        hn hnVar = this.Q1;
        switch (b) {
            case 0:
                super.onTextChanged(charSequence, i, i2, i3);
                if (hnVar != null) {
                    this.P1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    hnVar.a();
                    int i4 = this.P1;
                    if (i4 <= 100) {
                        str = Integer.toString(i4);
                    }
                    hnVar.t(str, isAttachedToWindow(), true);
                    invalidate();
                    return;
                }
                return;
            case 1:
                super.onTextChanged(charSequence, i, i2, i3);
                if (hnVar != null) {
                    this.P1 = 96 - charSequence.length();
                    hnVar.a();
                    if (this.P1 <= 12) {
                        str = String.valueOf(this.P1);
                    }
                    hnVar.t(str, true, true);
                    return;
                }
                return;
            case 2:
                super.onTextChanged(charSequence, i, i2, i3);
                if (hnVar != null) {
                    this.P1 = 32 - charSequence.length();
                    hnVar.a();
                    if (this.P1 <= 4) {
                        str = String.valueOf(this.P1);
                    }
                    hnVar.t(str, true, true);
                    return;
                }
                return;
            default:
                super.onTextChanged(charSequence, i, i2, i3);
                if (hnVar != null) {
                    this.P1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    hnVar.a();
                    int i5 = this.P1;
                    if (i5 <= 100) {
                        str = Integer.toString(i5);
                    }
                    hnVar.t(str, isAttachedToWindow(), true);
                    invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.N1) {
            case 0:
                if (drawable != this.Q1 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 1:
                if (drawable != this.Q1 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 2:
                if (drawable != this.Q1 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                if (drawable != this.Q1 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
        }
    }

    public f42(Activity activity, vnb vnbVar) {
        super(activity);
        this.R1 = vnbVar;
        this.O1 = new ll(this);
        hn hnVar = new hn(false, true, true);
        this.Q1 = hnVar;
        hnVar.n(0.2f, 160L, k43.h);
        hnVar.w(hl.L(15.33f));
        hnVar.setCallback(this);
        hnVar.b = 5;
    }

    public f42(h42 h42Var, Context context) {
        super(context);
        this.R1 = h42Var;
        this.P1 = 960;
        this.O1 = new ll(this);
        hn hnVar = new hn(false, true, true);
        this.Q1 = hnVar;
        hnVar.n(0.2f, 160L, k43.h);
        hnVar.w(hl.L(15.33f));
        hnVar.b = 5;
        hnVar.setCallback(this);
    }

    public f42(tc6 tc6Var, Activity activity) {
        super(activity);
        this.R1 = tc6Var;
        this.O1 = new ll(this);
        hn hnVar = new hn(false, true, true);
        this.Q1 = hnVar;
        hnVar.n(0.2f, 160L, k43.h);
        hnVar.w(hl.L(15.33f));
        hnVar.setCallback(this);
        hnVar.b = 5;
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class a52 extends EditTextBoldCursor {
    public final byte M1 = 2;
    public final km N1;
    public int O1;
    public final ho P1;
    public final Object Q1;

    public a52(rrc rrcVar, Activity activity) {
        super(activity);
        this.Q1 = rrcVar;
        this.O1 = 960;
        this.N1 = new km(this);
        ho hoVar = new ho(false, true, true);
        this.P1 = hoVar;
        hoVar.n(0.2f, 160L, d53.h);
        hoVar.w(gm.L(15.33f));
        hoVar.b = 5;
        hoVar.setCallback(this);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        byte b = this.M1;
        Object obj = this.Q1;
        km kmVar = this.N1;
        ho hoVar = this.P1;
        switch (b) {
            case 0:
                super.dispatchDraw(canvas);
                if (this.O1 <= 0) {
                    i = cmb.o7;
                } else {
                    i = cmb.O5;
                }
                hoVar.u(kmVar.a(cmb.v0(i, ((c52) obj).a), false));
                int L = gm.L(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
                int height = getHeight() + getScrollY();
                hoVar.setBounds(L - gm.L(48.0f), height - Math.min(gm.L(44.0f), getHeight()), L, height);
                hoVar.draw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                if (this.O1 < 0) {
                    i2 = cmb.o7;
                } else {
                    i2 = cmb.O5;
                }
                hoVar.u(kmVar.a(cmb.v0(i2, ((oc6) obj).getResourceProvider()), false));
                hoVar.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                hoVar.draw(canvas);
                return;
            case 2:
                super.dispatchDraw(canvas);
                if (this.O1 < 0) {
                    i3 = cmb.o7;
                } else {
                    i3 = cmb.O5;
                }
                hoVar.u(kmVar.a(cmb.v0(i3, (ylb) obj), false));
                hoVar.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                hoVar.draw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                if (this.O1 <= 0) {
                    i4 = cmb.o7;
                } else {
                    i4 = cmb.O5;
                }
                hoVar.u(kmVar.a(cmb.v0(i4, ((rrc) obj).getResourceProvider()), false));
                int L2 = gm.L(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
                int height2 = getHeight() + getScrollY();
                hoVar.setBounds(L2 - gm.L(48.0f), height2 - Math.min(gm.L(44.0f), getHeight()), L2, height2);
                hoVar.draw(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.M1) {
            case 2:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(36.0f), 1073741824));
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.M1;
        String str = "";
        ho hoVar = this.P1;
        switch (b) {
            case 0:
                super.onTextChanged(charSequence, i, i2, i3);
                if (hoVar != null) {
                    this.O1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    hoVar.a();
                    int i4 = this.O1;
                    if (i4 <= 100) {
                        str = Integer.toString(i4);
                    }
                    hoVar.t(str, isAttachedToWindow(), true);
                    invalidate();
                    return;
                }
                return;
            case 1:
                super.onTextChanged(charSequence, i, i2, i3);
                if (hoVar != null) {
                    this.O1 = 96 - charSequence.length();
                    hoVar.a();
                    if (this.O1 <= 12) {
                        str = String.valueOf(this.O1);
                    }
                    hoVar.t(str, true, true);
                    return;
                }
                return;
            case 2:
                super.onTextChanged(charSequence, i, i2, i3);
                if (hoVar != null) {
                    this.O1 = 32 - charSequence.length();
                    hoVar.a();
                    if (this.O1 <= 4) {
                        str = String.valueOf(this.O1);
                    }
                    hoVar.t(str, true, true);
                    return;
                }
                return;
            default:
                super.onTextChanged(charSequence, i, i2, i3);
                if (hoVar != null) {
                    this.O1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    hoVar.a();
                    int i5 = this.O1;
                    if (i5 <= 100) {
                        str = Integer.toString(i5);
                    }
                    hoVar.t(str, isAttachedToWindow(), true);
                    invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.M1) {
            case 0:
                if (drawable != this.P1 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 1:
                if (drawable != this.P1 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 2:
                if (drawable != this.P1 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                if (drawable != this.P1 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
        }
    }

    public a52(Activity activity, ylb ylbVar) {
        super(activity);
        this.Q1 = ylbVar;
        this.N1 = new km(this);
        ho hoVar = new ho(false, true, true);
        this.P1 = hoVar;
        hoVar.n(0.2f, 160L, d53.h);
        hoVar.w(gm.L(15.33f));
        hoVar.setCallback(this);
        hoVar.b = 5;
    }

    public a52(c52 c52Var, Context context) {
        super(context);
        this.Q1 = c52Var;
        this.O1 = 960;
        this.N1 = new km(this);
        ho hoVar = new ho(false, true, true);
        this.P1 = hoVar;
        hoVar.n(0.2f, 160L, d53.h);
        hoVar.w(gm.L(15.33f));
        hoVar.b = 5;
        hoVar.setCallback(this);
    }

    public a52(oc6 oc6Var, Activity activity) {
        super(activity);
        this.Q1 = oc6Var;
        this.N1 = new km(this);
        ho hoVar = new ho(false, true, true);
        this.P1 = hoVar;
        hoVar.n(0.2f, 160L, d53.h);
        hoVar.w(gm.L(15.33f));
        hoVar.setCallback(this);
        hoVar.b = 5;
    }
}

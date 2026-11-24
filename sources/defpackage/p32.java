package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.nio.charset.StandardCharsets;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class p32 extends EditTextBoldCursor {
    public final byte M1 = 2;
    public final kl N1;
    public int O1;
    public final gn P1;
    public final Object Q1;

    public p32(qpc qpcVar, Activity activity) {
        super(activity);
        this.Q1 = qpcVar;
        this.O1 = 960;
        this.N1 = new kl(this);
        gn gnVar = new gn(false, true, true);
        this.P1 = gnVar;
        gnVar.n(0.2f, 160L, s33.h);
        gnVar.w(gl.L(15.33f));
        gnVar.b = 5;
        gnVar.setCallback(this);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        byte b = this.M1;
        Object obj = this.Q1;
        kl klVar = this.N1;
        gn gnVar = this.P1;
        switch (b) {
            case 0:
                super.dispatchDraw(canvas);
                if (this.O1 <= 0) {
                    i = bkb.o7;
                } else {
                    i = bkb.O5;
                }
                gnVar.u(klVar.a(bkb.v0(i, ((r32) obj).a), false));
                int L = gl.L(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
                int height = getHeight() + getScrollY();
                gnVar.setBounds(L - gl.L(48.0f), height - Math.min(gl.L(44.0f), getHeight()), L, height);
                gnVar.draw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                if (this.O1 < 0) {
                    i2 = bkb.o7;
                } else {
                    i2 = bkb.O5;
                }
                gnVar.u(klVar.a(bkb.v0(i2, ((pa6) obj).getResourceProvider()), false));
                gnVar.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                gnVar.draw(canvas);
                return;
            case 2:
                super.dispatchDraw(canvas);
                if (this.O1 < 0) {
                    i3 = bkb.o7;
                } else {
                    i3 = bkb.O5;
                }
                gnVar.u(klVar.a(bkb.v0(i3, (wjb) obj), false));
                gnVar.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                gnVar.draw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                if (this.O1 <= 0) {
                    i4 = bkb.o7;
                } else {
                    i4 = bkb.O5;
                }
                gnVar.u(klVar.a(bkb.v0(i4, ((qpc) obj).getResourceProvider()), false));
                int L2 = gl.L(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
                int height2 = getHeight() + getScrollY();
                gnVar.setBounds(L2 - gl.L(48.0f), height2 - Math.min(gl.L(44.0f), getHeight()), L2, height2);
                gnVar.draw(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.M1) {
            case 2:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(36.0f), 1073741824));
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
        gn gnVar = this.P1;
        switch (b) {
            case 0:
                super.onTextChanged(charSequence, i, i2, i3);
                if (gnVar != null) {
                    this.O1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    gnVar.a();
                    int i4 = this.O1;
                    if (i4 <= 100) {
                        str = Integer.toString(i4);
                    }
                    gnVar.t(str, isAttachedToWindow(), true);
                    invalidate();
                    return;
                }
                return;
            case 1:
                super.onTextChanged(charSequence, i, i2, i3);
                if (gnVar != null) {
                    this.O1 = 96 - charSequence.length();
                    gnVar.a();
                    if (this.O1 <= 12) {
                        str = String.valueOf(this.O1);
                    }
                    gnVar.t(str, true, true);
                    return;
                }
                return;
            case 2:
                super.onTextChanged(charSequence, i, i2, i3);
                if (gnVar != null) {
                    this.O1 = 32 - charSequence.length();
                    gnVar.a();
                    if (this.O1 <= 4) {
                        str = String.valueOf(this.O1);
                    }
                    gnVar.t(str, true, true);
                    return;
                }
                return;
            default:
                super.onTextChanged(charSequence, i, i2, i3);
                if (gnVar != null) {
                    this.O1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    gnVar.a();
                    int i5 = this.O1;
                    if (i5 <= 100) {
                        str = Integer.toString(i5);
                    }
                    gnVar.t(str, isAttachedToWindow(), true);
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

    public p32(Activity activity, wjb wjbVar) {
        super(activity);
        this.Q1 = wjbVar;
        this.N1 = new kl(this);
        gn gnVar = new gn(false, true, true);
        this.P1 = gnVar;
        gnVar.n(0.2f, 160L, s33.h);
        gnVar.w(gl.L(15.33f));
        gnVar.setCallback(this);
        gnVar.b = 5;
    }

    public p32(r32 r32Var, Context context) {
        super(context);
        this.Q1 = r32Var;
        this.O1 = 960;
        this.N1 = new kl(this);
        gn gnVar = new gn(false, true, true);
        this.P1 = gnVar;
        gnVar.n(0.2f, 160L, s33.h);
        gnVar.w(gl.L(15.33f));
        gnVar.b = 5;
        gnVar.setCallback(this);
    }

    public p32(pa6 pa6Var, Activity activity) {
        super(activity);
        this.Q1 = pa6Var;
        this.N1 = new kl(this);
        gn gnVar = new gn(false, true, true);
        this.P1 = gnVar;
        gnVar.n(0.2f, 160L, s33.h);
        gnVar.w(gl.L(15.33f));
        gnVar.setCallback(this);
        gnVar.b = 5;
    }
}

package jg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.h6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.pj0;
import w7.b6;
public final class g3 extends j {
    public String A0;
    public final e3 f9984q0;
    public ig.q1 f9985r0;
    public int f9986s0;
    public int f9987t0;
    public int f9988u0;
    public ig.h0 f9989v0;
    public int f9990w0;
    public int f9991x0;
    public Runnable f9992y0;
    public boolean f9993z0;

    public g3(Context context, PointF pointF, int i10, CharSequence charSequence, ig.q1 q1Var, int i11) {
        super(context, pointF);
        this.f9989v0 = ig.h0.e;
        this.f9987t0 = i10;
        e3 e3Var = new e3(this, context);
        this.f9984q0 = e3Var;
        at.i(e3Var);
        e3Var.setGravity(19);
        e3Var.setBackgroundColor(0);
        e3Var.setPadding(org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f));
        e3Var.setClickable(false);
        e3Var.setEnabled(false);
        e3Var.setCursorColor(-1);
        e3Var.setTextSize(0, this.f9987t0);
        e3Var.setCursorSize(org.telegram.messenger.i0.L(this.f9987t0 * 0.4f));
        e3Var.setText(charSequence);
        s();
        e3Var.setTextColor(q1Var.f8433a);
        e3Var.setTypeface(null, 1);
        e3Var.setHorizontallyScrolling(false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            e3Var.setImeOptions(285212672);
        } else {
            e3Var.setImeOptions(268435456);
        }
        e3Var.setFocusableInTouchMode(true);
        e3Var.setInputType(16384);
        e3Var.setSingleLine(false);
        addView(e3Var, b6.e(-2, -2, 51));
        if (i12 >= 29) {
            e3Var.setBreakStrategy(0);
        } else {
            e3Var.setBreakStrategy(0);
        }
        setSwatch(q1Var);
        setType(i11);
        k();
        e3Var.addTextChangedListener(new f3(0, this));
    }

    @Override
    public final i a() {
        return new u0(this, getContext());
    }

    public int getAlign() {
        return this.f9988u0;
    }

    public int getBaseFontSize() {
        return this.f9987t0;
    }

    public b getEditText() {
        return this.f9984q0;
    }

    public View getFocusedView() {
        return this.f9984q0;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return this.f9984q0.getPaint().getFontMetricsInt();
    }

    public float getFontSize() {
        return this.f9984q0.getTextSize();
    }

    @Override
    public pj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (org.telegram.messenger.i0.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float L2 = (org.telegram.messenger.i0.L(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float x10 = a30.x(L, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        e3 e3Var = this.f9984q0;
        return new pj0(x10, (positionY - (((L2 - e3Var.getExtendedPaddingTop()) - org.telegram.messenger.i0.N(4.0f)) / 2.0f)) * scaleX, ((L * scaleX) + x10) - x10, (L2 - e3Var.getExtendedPaddingBottom()) * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        RectF rectF = this.f9984q0.Q1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override
    public float getStickyPaddingLeft() {
        RectF rectF = this.f9984q0.Q1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override
    public float getStickyPaddingRight() {
        RectF rectF = this.f9984q0.Q1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override
    public float getStickyPaddingTop() {
        RectF rectF = this.f9984q0.Q1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public ig.q1 getSwatch() {
        return this.f9985r0;
    }

    public CharSequence getText() {
        return this.f9984q0.getText();
    }

    public int getTextSize() {
        return (int) this.f9984q0.getTextSize();
    }

    public int getType() {
        return this.f9986s0;
    }

    public ig.h0 getTypeface() {
        return this.f9989v0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        k();
    }

    public final void q() {
        e3 e3Var = this.f9984q0;
        e3Var.setEnabled(true);
        e3Var.setClickable(true);
        e3Var.requestFocus();
        e3Var.setSelection(e3Var.getText().length());
        org.telegram.messenger.i0.h3(new gg.c(this, 17), 300L);
    }

    public final void r() {
        int i10;
        e3 e3Var = this.f9984q0;
        e3Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i11 = this.f9985r0.f8433a;
        int i12 = this.f9986s0;
        int i13 = -1;
        if (i12 == 0) {
            e3Var.setFrameColor(i11);
            i11 = org.telegram.messenger.i0.B(this.f9985r0.f8433a) >= 0.721f ? -16777216 : -1;
        } else if (i12 == 1) {
            if (org.telegram.messenger.i0.B(i11) >= 0.25f) {
                i10 = -1728053248;
            } else {
                i10 = -1711276033;
            }
            e3Var.setFrameColor(i10);
        } else if (i12 == 2) {
            if (org.telegram.messenger.i0.B(i11) >= 0.25f) {
                i13 = -16777216;
            }
            e3Var.setFrameColor(i13);
        } else {
            e3Var.setFrameColor(0);
        }
        e3Var.setTextColor(i11);
        e3Var.setCursorColor(i11);
        e3Var.setHandlesColor(i11);
        e3Var.setHighlightColor(t6.r1(0.4f, i11));
    }

    public final void s() {
        e3 e3Var = this.f9984q0;
        if (e3Var.getText().length() <= 0) {
            e3Var.setHint(dd.L0(2131744218, null));
            e3Var.setHintTextColor(1627389951);
            return;
        }
        e3Var.setHint((CharSequence) null);
    }

    public void setAlign(int i10) {
        this.f9988u0 = i10;
    }

    public void setBaseFontSize(int i10) {
        this.f9987t0 = i10;
        float f7 = i10;
        e3 e3Var = this.f9984q0;
        e3Var.setTextSize(0, f7);
        e3Var.setCursorSize(org.telegram.messenger.i0.L(f7 * 0.4f));
        if (e3Var.getText() != null) {
            Editable text = e3Var.getText();
            h6[] h6VarArr = (h6[]) text.getSpans(0, text.length(), h6.class);
            for (int i11 = 0; i11 < h6VarArr.length; i11++) {
                h6 h6Var = h6VarArr[i11];
                Paint.FontMetricsInt fontMetricsInt = getFontMetricsInt();
                h6Var.f16024a = fontMetricsInt;
                if (fontMetricsInt != null) {
                    int abs = Math.abs(h6Var.f16024a.ascent) + Math.abs(fontMetricsInt.descent);
                    h6Var.f16026c = abs;
                    if (abs == 0) {
                        h6Var.f16026c = org.telegram.messenger.i0.L(20.0f);
                    }
                }
                h6VarArr[i11].f16025b = 0.85f;
            }
            for (o5 o5Var : (o5[]) text.getSpans(0, text.length(), o5.class)) {
                o5Var.replaceFontMetrics(getFontMetricsInt());
            }
            e3Var.q();
        }
    }

    public void setMaxWidth(int i10) {
        this.f9984q0.setMaxWidth(i10);
    }

    public void setSwatch(ig.q1 q1Var) {
        this.f9985r0 = new ig.q1(q1Var.f8434b, q1Var.f8435c, q1Var.f8433a);
        r();
    }

    public void setText(CharSequence charSequence) {
        this.f9984q0.setText(charSequence);
        s();
    }

    public void setType(int i10) {
        this.f9986s0 = i10;
        r();
    }

    public void setTypeface(ig.h0 h0Var) {
        this.f9989v0 = h0Var;
        if (h0Var != null) {
            this.f9984q0.setTypeface(h0Var.d());
        }
        m();
    }

    public void setTypeface(String str) {
        Iterator it = ig.h0.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ig.h0 h0Var = (ig.h0) it.next();
            if (h0Var.f8320a.equals(str)) {
                setTypeface(h0Var);
                str = null;
                break;
            }
        }
        this.A0 = str;
        m();
    }

    public g3(Context context, g3 g3Var, PointF pointF) {
        this(context, pointF, g3Var.f9987t0, g3Var.getText(), g3Var.getSwatch(), g3Var.f9986s0);
        setRotation(g3Var.getRotation());
        setScale(g3Var.getScale());
        setTypeface(g3Var.getTypeface());
        setAlign(g3Var.getAlign());
        int align = getAlign();
        int i10 = 2;
        this.f9984q0.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 == 1) {
            i10 = 4;
        } else if (align2 == 2 ? !dd.X : dd.X) {
            i10 = 3;
        }
        this.f9984q0.setTextAlignment(i10);
    }
}

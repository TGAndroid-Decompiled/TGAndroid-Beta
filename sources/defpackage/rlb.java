package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
public class rlb extends h44 {
    public Runnable A0;
    public boolean B0;
    public String C0;
    public final qlb s0;
    public igb t0;
    public int u0;
    public int v0;
    public int w0;
    public xv7 x0;
    public int y0;
    public int z0;

    public rlb(Context context, PointF pointF, int i, CharSequence charSequence, igb igbVar, int i2) {
        super(context, pointF);
        this.x0 = xv7.e;
        this.v0 = i;
        qlb qlbVar = new qlb(this, context);
        this.s0 = qlbVar;
        jn7.i(qlbVar);
        qlbVar.setGravity(19);
        qlbVar.setBackgroundColor(0);
        qlbVar.setPadding(hl.L(7.0f), hl.L(7.0f), hl.L(7.0f), hl.L(7.0f));
        qlbVar.setClickable(false);
        qlbVar.setEnabled(false);
        qlbVar.setCursorColor(-1);
        qlbVar.setTextSize(0, this.v0);
        qlbVar.setCursorSize(hl.L(this.v0 * 0.4f));
        qlbVar.setText(charSequence);
        t();
        qlbVar.setTextColor(igbVar.a);
        qlbVar.setTypeface(null, 1);
        qlbVar.setHorizontallyScrolling(false);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            qlbVar.setImeOptions(285212672);
        } else {
            qlbVar.setImeOptions(268435456);
        }
        qlbVar.setFocusableInTouchMode(true);
        qlbVar.setInputType(16384);
        qlbVar.setSingleLine(false);
        addView(qlbVar, tre.e(-2, -2, 51));
        if (i3 >= 29) {
            qlbVar.setBreakStrategy(0);
        } else {
            qlbVar.setBreakStrategy(0);
        }
        setSwatch(igbVar);
        setType(i2);
        k();
        qlbVar.addTextChangedListener(new wx1(this, (byte) 3));
    }

    @Override
    public final g44 a() {
        return new r66(this, getContext());
    }

    public int getAlign() {
        return this.w0;
    }

    public int getBaseFontSize() {
        return this.v0;
    }

    public ju3 getEditText() {
        return this.s0;
    }

    public View getFocusedView() {
        return this.s0;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return this.s0.getPaint().getFontMetricsInt();
    }

    public float getFontSize() {
        return this.s0.getTextSize();
    }

    @Override
    public a69 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (hl.L(64.0f) / scaleX) + (getScale() * getSelectionWidth());
        float L2 = (hl.L(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float e = uh9.e(L, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        qlb qlbVar = this.s0;
        return new a69(e, (positionY - (((L2 - qlbVar.getExtendedPaddingTop()) - hl.N(4.0f)) / 2.0f)) * scaleX, ((L * scaleX) + e) - e, (L2 - qlbVar.getExtendedPaddingBottom()) * scaleX);
    }

    public float getSelectionWidth() {
        return getMeasuredWidth();
    }

    @Override
    public float getStickyPaddingBottom() {
        RectF rectF = this.s0.X1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override
    public float getStickyPaddingLeft() {
        RectF rectF = this.s0.X1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override
    public float getStickyPaddingRight() {
        RectF rectF = this.s0.X1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override
    public float getStickyPaddingTop() {
        RectF rectF = this.s0.X1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public igb getSwatch() {
        return this.t0;
    }

    public CharSequence getText() {
        return this.s0.getText();
    }

    public int getTextSize() {
        return (int) this.s0.getTextSize();
    }

    public int getType() {
        return this.u0;
    }

    public xv7 getTypeface() {
        return this.x0;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        k();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        k();
    }

    public void q() {
        qlb qlbVar = this.s0;
        qlbVar.setEnabled(true);
        qlbVar.setClickable(true);
        qlbVar.requestFocus();
        qlbVar.setSelection(qlbVar.getText().length());
        hl.d3(new s8b(this, (byte) 15), 300L);
    }

    public void r() {
        qlb qlbVar = this.s0;
        qlbVar.clearFocus();
        qlbVar.setEnabled(false);
        qlbVar.setClickable(false);
        m();
    }

    public void s() {
        int i;
        qlb qlbVar = this.s0;
        qlbVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i2 = this.t0.a;
        int i3 = this.u0;
        int i4 = -1;
        if (i3 == 0) {
            qlbVar.setFrameColor(i2);
            i2 = hl.B(this.t0.a) >= 0.721f ? -16777216 : -1;
        } else if (i3 == 1) {
            if (hl.B(i2) >= 0.25f) {
                i = -1728053248;
            } else {
                i = -1711276033;
            }
            qlbVar.setFrameColor(i);
        } else if (i3 == 2) {
            if (hl.B(i2) >= 0.25f) {
                i4 = -16777216;
            }
            qlbVar.setFrameColor(i4);
        } else {
            qlbVar.setFrameColor(0);
        }
        qlbVar.setTextColor(i2);
        qlbVar.setCursorColor(i2);
        qlbVar.setHandlesColor(i2);
        qlbVar.setHighlightColor(aob.p1(0.4f, i2));
    }

    public void setAlign(int i) {
        this.w0 = i;
    }

    public void setBaseFontSize(int i) {
        this.v0 = i;
        float f = i;
        qlb qlbVar = this.s0;
        qlbVar.setTextSize(0, f);
        qlbVar.setCursorSize(hl.L(f * 0.4f));
        if (qlbVar.getText() != null) {
            Editable text = qlbVar.getText();
            mv3[] mv3VarArr = (mv3[]) text.getSpans(0, text.length(), mv3.class);
            for (int i2 = 0; i2 < mv3VarArr.length; i2++) {
                mv3 mv3Var = mv3VarArr[i2];
                Paint.FontMetricsInt fontMetricsInt = getFontMetricsInt();
                mv3Var.a = fontMetricsInt;
                if (fontMetricsInt != null) {
                    int abs = Math.abs(mv3Var.a.ascent) + Math.abs(fontMetricsInt.descent);
                    mv3Var.c = abs;
                    if (abs == 0) {
                        mv3Var.c = hl.L(20.0f);
                    }
                }
                mv3VarArr[i2].b = 0.85f;
            }
            for (hm hmVar : (hm[]) text.getSpans(0, text.length(), hm.class)) {
                hmVar.replaceFontMetrics(getFontMetricsInt());
            }
            qlbVar.q();
        }
    }

    public void setMaxWidth(int i) {
        this.s0.setMaxWidth(i);
    }

    public void setSwatch(igb igbVar) {
        this.t0 = new igb(igbVar.b, igbVar.c, igbVar.a);
        s();
    }

    public void setText(CharSequence charSequence) {
        this.s0.setText(charSequence);
        t();
    }

    public void setType(int i) {
        this.u0 = i;
        s();
    }

    public void setTypeface(String str) {
        Iterator it = xv7.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            xv7 xv7Var = (xv7) it.next();
            if (xv7Var.a.equals(str)) {
                setTypeface(xv7Var);
                str = null;
                break;
            }
        }
        this.C0 = str;
        m();
    }

    public void t() {
        qlb qlbVar = this.s0;
        if (qlbVar.getText().length() <= 0) {
            qlbVar.setHint(ob6.M0(2131743846, null));
            qlbVar.setHintTextColor(1627389951);
            return;
        }
        qlbVar.setHint((CharSequence) null);
    }

    public void setTypeface(xv7 xv7Var) {
        this.x0 = xv7Var;
        if (xv7Var != null) {
            this.s0.setTypeface(xv7Var.b());
        }
        m();
    }

    public rlb(Context context, rlb rlbVar, PointF pointF) {
        this(context, pointF, rlbVar.v0, rlbVar.getText(), rlbVar.getSwatch(), rlbVar.u0);
        setRotation(rlbVar.getRotation());
        setScale(rlbVar.getScale());
        setTypeface(rlbVar.getTypeface());
        setAlign(rlbVar.getAlign());
        int align = getAlign();
        int i = 2;
        this.s0.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 != 1) {
            boolean z = ob6.a0;
            if (align2 == 2 ? !z : z) {
                i = 3;
            }
        } else {
            i = 4;
        }
        this.s0.setTextAlignment(i);
    }
}

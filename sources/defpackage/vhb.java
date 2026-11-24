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
public class vhb extends l34 {
    public Runnable A0;
    public boolean B0;
    public String C0;
    public final uhb s0;
    public mcb t0;
    public int u0;
    public int v0;
    public int w0;
    public qs7 x0;
    public int y0;
    public int z0;

    public vhb(Context context, PointF pointF, int i, CharSequence charSequence, mcb mcbVar, int i2) {
        super(context, pointF);
        this.x0 = qs7.e;
        this.v0 = i;
        uhb uhbVar = new uhb(this, context);
        this.s0 = uhbVar;
        kk7.i(uhbVar);
        uhbVar.setGravity(19);
        uhbVar.setBackgroundColor(0);
        uhbVar.setPadding(gl.L(7.0f), gl.L(7.0f), gl.L(7.0f), gl.L(7.0f));
        uhbVar.setClickable(false);
        uhbVar.setEnabled(false);
        uhbVar.setCursorColor(-1);
        uhbVar.setTextSize(0, this.v0);
        uhbVar.setCursorSize(gl.L(this.v0 * 0.4f));
        uhbVar.setText(charSequence);
        t();
        uhbVar.setTextColor(mcbVar.a);
        uhbVar.setTypeface(null, 1);
        uhbVar.setHorizontallyScrolling(false);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            uhbVar.setImeOptions(285212672);
        } else {
            uhbVar.setImeOptions(268435456);
        }
        uhbVar.setFocusableInTouchMode(true);
        uhbVar.setInputType(16384);
        uhbVar.setSingleLine(false);
        addView(uhbVar, nme.e(-2, -2, 51));
        if (i3 >= 29) {
            uhbVar.setBreakStrategy(0);
        } else {
            uhbVar.setBreakStrategy(0);
        }
        setSwatch(mcbVar);
        setType(i2);
        k();
        uhbVar.addTextChangedListener(new fd6(this, (byte) 2));
    }

    @Override
    public final k34 a() {
        return new n46(this, getContext());
    }

    public int getAlign() {
        return this.w0;
    }

    public int getBaseFontSize() {
        return this.v0;
    }

    public st3 getEditText() {
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
    public l29 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (gl.L(64.0f) / scaleX) + (getScale() * getSelectionWidth());
        float L2 = (gl.L(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float e = de9.e(L, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        uhb uhbVar = this.s0;
        return new l29(e, (positionY - (((L2 - uhbVar.getExtendedPaddingTop()) - gl.N(4.0f)) / 2.0f)) * scaleX, ((L * scaleX) + e) - e, (L2 - uhbVar.getExtendedPaddingBottom()) * scaleX);
    }

    public float getSelectionWidth() {
        return getMeasuredWidth();
    }

    @Override
    public float getStickyPaddingBottom() {
        RectF rectF = this.s0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override
    public float getStickyPaddingLeft() {
        RectF rectF = this.s0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override
    public float getStickyPaddingRight() {
        RectF rectF = this.s0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override
    public float getStickyPaddingTop() {
        RectF rectF = this.s0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public mcb getSwatch() {
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

    public qs7 getTypeface() {
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
        uhb uhbVar = this.s0;
        uhbVar.setEnabled(true);
        uhbVar.setClickable(true);
        uhbVar.requestFocus();
        uhbVar.setSelection(uhbVar.getText().length());
        gl.e3(new kya(this, (byte) 28), 300L);
    }

    public void r() {
        uhb uhbVar = this.s0;
        uhbVar.clearFocus();
        uhbVar.setEnabled(false);
        uhbVar.setClickable(false);
        m();
    }

    public void s() {
        int i;
        uhb uhbVar = this.s0;
        uhbVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i2 = this.t0.a;
        int i3 = this.u0;
        int i4 = -1;
        if (i3 == 0) {
            uhbVar.setFrameColor(i2);
            i2 = gl.B(this.t0.a) >= 0.721f ? -16777216 : -1;
        } else if (i3 == 1) {
            if (gl.B(i2) >= 0.25f) {
                i = -1728053248;
            } else {
                i = -1711276033;
            }
            uhbVar.setFrameColor(i);
        } else if (i3 == 2) {
            if (gl.B(i2) >= 0.25f) {
                i4 = -16777216;
            }
            uhbVar.setFrameColor(i4);
        } else {
            uhbVar.setFrameColor(0);
        }
        uhbVar.setTextColor(i2);
        uhbVar.setCursorColor(i2);
        uhbVar.setHandlesColor(i2);
        uhbVar.setHighlightColor(bkb.p1(0.4f, i2));
    }

    public void setAlign(int i) {
        this.w0 = i;
    }

    public void setBaseFontSize(int i) {
        this.v0 = i;
        float f = i;
        uhb uhbVar = this.s0;
        uhbVar.setTextSize(0, f);
        uhbVar.setCursorSize(gl.L(f * 0.4f));
        if (uhbVar.getText() != null) {
            Editable text = uhbVar.getText();
            su3[] su3VarArr = (su3[]) text.getSpans(0, text.length(), su3.class);
            for (int i2 = 0; i2 < su3VarArr.length; i2++) {
                su3 su3Var = su3VarArr[i2];
                Paint.FontMetricsInt fontMetricsInt = getFontMetricsInt();
                su3Var.a = fontMetricsInt;
                if (fontMetricsInt != null) {
                    int abs = Math.abs(su3Var.a.ascent) + Math.abs(fontMetricsInt.descent);
                    su3Var.c = abs;
                    if (abs == 0) {
                        su3Var.c = gl.L(20.0f);
                    }
                }
                su3VarArr[i2].b = 0.85f;
            }
            for (gm gmVar : (gm[]) text.getSpans(0, text.length(), gm.class)) {
                gmVar.replaceFontMetrics(getFontMetricsInt());
            }
            uhbVar.q();
        }
    }

    public void setMaxWidth(int i) {
        this.s0.setMaxWidth(i);
    }

    public void setSwatch(mcb mcbVar) {
        this.t0 = new mcb(mcbVar.b, mcbVar.c, mcbVar.a);
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
        Iterator it = qs7.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            qs7 qs7Var = (qs7) it.next();
            if (qs7Var.a.equals(str)) {
                setTypeface(qs7Var);
                str = null;
                break;
            }
        }
        this.C0 = str;
        m();
    }

    public void t() {
        uhb uhbVar = this.s0;
        if (uhbVar.getText().length() <= 0) {
            uhbVar.setHint(k96.M0(2131743952, null));
            uhbVar.setHintTextColor(1627389951);
            return;
        }
        uhbVar.setHint((CharSequence) null);
    }

    public void setTypeface(qs7 qs7Var) {
        this.x0 = qs7Var;
        if (qs7Var != null) {
            this.s0.setTypeface(qs7Var.b());
        }
        m();
    }

    public vhb(Context context, vhb vhbVar, PointF pointF) {
        this(context, pointF, vhbVar.v0, vhbVar.getText(), vhbVar.getSwatch(), vhbVar.u0);
        setRotation(vhbVar.getRotation());
        setScale(vhbVar.getScale());
        setTypeface(vhbVar.getTypeface());
        setAlign(vhbVar.getAlign());
        int align = getAlign();
        int i = 2;
        this.s0.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 != 1) {
            boolean z = k96.a0;
            if (align2 == 2 ? !z : z) {
                i = 3;
            }
        } else {
            i = 4;
        }
        this.s0.setTextAlignment(i);
    }
}

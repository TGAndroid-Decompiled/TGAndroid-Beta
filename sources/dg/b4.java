package dg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.u5;
public final class b4 extends j {
    public final z3 f4412n0;
    public cg.f2 f4413o0;
    public int f4414p0;
    public int f4415q0;
    public int f4416r0;
    public cg.t0 f4417s0;
    public int f4418t0;
    public int f4419u0;
    public Runnable f4420v0;
    public boolean f4421w0;
    public String f4422x0;

    public b4(Context context, PointF pointF, int i10, CharSequence charSequence, cg.f2 f2Var, int i11) {
        super(context, pointF);
        this.f4417s0 = cg.t0.e;
        this.f4415q0 = i10;
        z3 z3Var = new z3(this, context);
        this.f4412n0 = z3Var;
        NotificationCenter.listenEmojiLoading(z3Var);
        z3Var.setGravity(19);
        z3Var.setBackgroundColor(0);
        z3Var.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        z3Var.setClickable(false);
        z3Var.setEnabled(false);
        z3Var.setCursorColor(-1);
        z3Var.setTextSize(0, this.f4415q0);
        z3Var.setCursorSize(AndroidUtilities.dp(this.f4415q0 * 0.4f));
        z3Var.setText(charSequence);
        s();
        z3Var.setTextColor(f2Var.f2384a);
        z3Var.setTypeface(null, 1);
        z3Var.setHorizontallyScrolling(false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            z3Var.setImeOptions(285212672);
        } else {
            z3Var.setImeOptions(268435456);
        }
        z3Var.setFocusableInTouchMode(true);
        z3Var.setInputType(16384);
        z3Var.setSingleLine(false);
        addView(z3Var, b6.e(-2, -2, 51));
        if (i12 >= 29) {
            z3Var.setBreakStrategy(0);
        } else if (i12 >= 23) {
            z3Var.setBreakStrategy(0);
        }
        setSwatch(f2Var);
        setType(i11);
        k();
        z3Var.addTextChangedListener(new a4(this));
    }

    @Override
    public final i a() {
        return new h1(this, getContext());
    }

    public int getAlign() {
        return this.f4416r0;
    }

    public int getBaseFontSize() {
        return this.f4415q0;
    }

    public b getEditText() {
        return this.f4412n0;
    }

    public View getFocusedView() {
        return this.f4412n0;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return this.f4412n0.getPaint().getFontMetricsInt();
    }

    public float getFontSize() {
        return this.f4412n0.getTextSize();
    }

    @Override
    public rk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float c3 = org.telegram.ui.b.c(dp, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        z3 z3Var = this.f4412n0;
        return new rk0(c3, (positionY - (((dp2 - z3Var.getExtendedPaddingTop()) - AndroidUtilities.dpf2(4.0f)) / 2.0f)) * scaleX, ((dp * scaleX) + c3) - c3, (dp2 - z3Var.getExtendedPaddingBottom()) * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        RectF rectF = this.f4412n0.f4388w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override
    public float getStickyPaddingLeft() {
        RectF rectF = this.f4412n0.f4388w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override
    public float getStickyPaddingRight() {
        RectF rectF = this.f4412n0.f4388w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override
    public float getStickyPaddingTop() {
        RectF rectF = this.f4412n0.f4388w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public cg.f2 getSwatch() {
        return this.f4413o0;
    }

    public CharSequence getText() {
        return this.f4412n0.getText();
    }

    public int getTextSize() {
        return (int) this.f4412n0.getTextSize();
    }

    public int getType() {
        return this.f4414p0;
    }

    public cg.t0 getTypeface() {
        return this.f4417s0;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        k();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        k();
    }

    public final void q() {
        z3 z3Var = this.f4412n0;
        z3Var.setEnabled(true);
        z3Var.setClickable(true);
        z3Var.requestFocus();
        z3Var.setSelection(z3Var.getText().length());
        AndroidUtilities.runOnUIThread(new ag.d(this, 25), 300L);
    }

    public final void r() {
        int i10;
        z3 z3Var = this.f4412n0;
        z3Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i11 = this.f4413o0.f2384a;
        int i12 = this.f4414p0;
        int i13 = -1;
        if (i12 == 0) {
            z3Var.setFrameColor(i11);
            i11 = AndroidUtilities.computePerceivedBrightness(this.f4413o0.f2384a) >= 0.721f ? -16777216 : -1;
        } else if (i12 == 1) {
            if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.25f) {
                i10 = -1728053248;
            } else {
                i10 = -1711276033;
            }
            z3Var.setFrameColor(i10);
        } else if (i12 == 2) {
            if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.25f) {
                i13 = -16777216;
            }
            z3Var.setFrameColor(i13);
        } else {
            z3Var.setFrameColor(0);
        }
        z3Var.setTextColor(i11);
        z3Var.setCursorColor(i11);
        z3Var.setHandlesColor(i11);
        z3Var.setHighlightColor(j6.l1(0.4f, i11));
    }

    public final void s() {
        z3 z3Var = this.f4412n0;
        if (z3Var.getText().length() <= 0) {
            z3Var.setHint(LocaleController.getString(R.string.TextPlaceholder));
            z3Var.setHintTextColor(1627389951);
            return;
        }
        z3Var.setHint((CharSequence) null);
    }

    public void setAlign(int i10) {
        this.f4416r0 = i10;
    }

    public void setBaseFontSize(int i10) {
        this.f4415q0 = i10;
        float f10 = i10;
        z3 z3Var = this.f4412n0;
        z3Var.setTextSize(0, f10);
        z3Var.setCursorSize(AndroidUtilities.dp(f10 * 0.4f));
        if (z3Var.getText() != null) {
            Editable text = z3Var.getText();
            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) text.getSpans(0, text.length(), Emoji.EmojiSpan.class);
            for (int i11 = 0; i11 < emojiSpanArr.length; i11++) {
                emojiSpanArr[i11].replaceFontMetrics(getFontMetricsInt());
                emojiSpanArr[i11].scale = 0.85f;
            }
            for (u5 u5Var : (u5[]) text.getSpans(0, text.length(), u5.class)) {
                u5Var.replaceFontMetrics(getFontMetricsInt());
            }
            z3Var.invalidateForce();
        }
    }

    public void setMaxWidth(int i10) {
        this.f4412n0.setMaxWidth(i10);
    }

    public void setSwatch(cg.f2 f2Var) {
        this.f4413o0 = new cg.f2(f2Var.f2385b, f2Var.f2386c, f2Var.f2384a);
        r();
    }

    public void setText(CharSequence charSequence) {
        this.f4412n0.setText(charSequence);
        s();
    }

    public void setType(int i10) {
        this.f4414p0 = i10;
        r();
    }

    public void setTypeface(cg.t0 t0Var) {
        this.f4417s0 = t0Var;
        if (t0Var != null) {
            this.f4412n0.setTypeface(t0Var.d());
        }
        m();
    }

    public void setTypeface(String str) {
        Iterator it = cg.t0.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            cg.t0 t0Var = (cg.t0) it.next();
            if (t0Var.f2512a.equals(str)) {
                setTypeface(t0Var);
                str = null;
                break;
            }
        }
        this.f4422x0 = str;
        m();
    }

    public b4(Context context, b4 b4Var, PointF pointF) {
        this(context, pointF, b4Var.f4415q0, b4Var.getText(), b4Var.getSwatch(), b4Var.f4414p0);
        setRotation(b4Var.getRotation());
        setScale(b4Var.getScale());
        setTypeface(b4Var.getTypeface());
        setAlign(b4Var.getAlign());
        int align = getAlign();
        int i10 = 2;
        this.f4412n0.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 == 1) {
            i10 = 4;
        } else if (align2 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i10 = 3;
        }
        this.f4412n0.setTextAlignment(i10);
    }
}

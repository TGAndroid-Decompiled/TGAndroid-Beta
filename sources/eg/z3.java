package eg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u5;
public final class z3 extends j {
    public final x3 f5599n0;
    public dg.e2 f5600o0;
    public int f5601p0;
    public int f5602q0;
    public int f5603r0;
    public dg.s0 f5604s0;
    public int f5605t0;
    public int f5606u0;
    public Runnable f5607v0;
    public boolean f5608w0;
    public String f5609x0;

    public z3(Context context, PointF pointF, int i10, CharSequence charSequence, dg.e2 e2Var, int i11) {
        super(context, pointF);
        this.f5604s0 = dg.s0.f4661e;
        this.f5602q0 = i10;
        x3 x3Var = new x3(this, context);
        this.f5599n0 = x3Var;
        NotificationCenter.listenEmojiLoading(x3Var);
        x3Var.setGravity(19);
        x3Var.setBackgroundColor(0);
        x3Var.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        x3Var.setClickable(false);
        x3Var.setEnabled(false);
        x3Var.setCursorColor(-1);
        x3Var.setTextSize(0, this.f5602q0);
        x3Var.setCursorSize(AndroidUtilities.dp(this.f5602q0 * 0.4f));
        x3Var.setText(charSequence);
        s();
        x3Var.setTextColor(e2Var.f4524a);
        x3Var.setTypeface(null, 1);
        x3Var.setHorizontallyScrolling(false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            x3Var.setImeOptions(285212672);
        } else {
            x3Var.setImeOptions(268435456);
        }
        x3Var.setFocusableInTouchMode(true);
        x3Var.setInputType(16384);
        x3Var.setSingleLine(false);
        addView(x3Var, c6.e(-2, -2, 51));
        if (i12 >= 29) {
            x3Var.setBreakStrategy(0);
        } else if (i12 >= 23) {
            x3Var.setBreakStrategy(0);
        }
        setSwatch(e2Var);
        setType(i11);
        k();
        x3Var.addTextChangedListener(new y3(this));
    }

    @Override
    public final i a() {
        return new f1(this, getContext());
    }

    public int getAlign() {
        return this.f5603r0;
    }

    public int getBaseFontSize() {
        return this.f5602q0;
    }

    public b getEditText() {
        return this.f5599n0;
    }

    public View getFocusedView() {
        return this.f5599n0;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return this.f5599n0.getPaint().getFontMetricsInt();
    }

    public float getFontSize() {
        return this.f5599n0.getTextSize();
    }

    @Override
    public tk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float c3 = org.telegram.ui.b.c(dp, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        x3 x3Var = this.f5599n0;
        return new tk0(c3, (positionY - (((dp2 - x3Var.getExtendedPaddingTop()) - AndroidUtilities.dpf2(4.0f)) / 2.0f)) * scaleX, ((dp * scaleX) + c3) - c3, (dp2 - x3Var.getExtendedPaddingBottom()) * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        RectF rectF = this.f5599n0.f5084w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override
    public float getStickyPaddingLeft() {
        RectF rectF = this.f5599n0.f5084w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override
    public float getStickyPaddingRight() {
        RectF rectF = this.f5599n0.f5084w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override
    public float getStickyPaddingTop() {
        RectF rectF = this.f5599n0.f5084w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public dg.e2 getSwatch() {
        return this.f5600o0;
    }

    public CharSequence getText() {
        return this.f5599n0.getText();
    }

    public int getTextSize() {
        return (int) this.f5599n0.getTextSize();
    }

    public int getType() {
        return this.f5601p0;
    }

    public dg.s0 getTypeface() {
        return this.f5604s0;
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
        x3 x3Var = this.f5599n0;
        x3Var.setEnabled(true);
        x3Var.setClickable(true);
        x3Var.requestFocus();
        x3Var.setSelection(x3Var.getText().length());
        AndroidUtilities.runOnUIThread(new ag.e(this, 27), 300L);
    }

    public final void r() {
        int i10;
        x3 x3Var = this.f5599n0;
        x3Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i11 = this.f5600o0.f4524a;
        int i12 = this.f5601p0;
        int i13 = -1;
        if (i12 == 0) {
            x3Var.setFrameColor(i11);
            i11 = AndroidUtilities.computePerceivedBrightness(this.f5600o0.f4524a) >= 0.721f ? -16777216 : -1;
        } else if (i12 == 1) {
            if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.25f) {
                i10 = -1728053248;
            } else {
                i10 = -1711276033;
            }
            x3Var.setFrameColor(i10);
        } else if (i12 == 2) {
            if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.25f) {
                i13 = -16777216;
            }
            x3Var.setFrameColor(i13);
        } else {
            x3Var.setFrameColor(0);
        }
        x3Var.setTextColor(i11);
        x3Var.setCursorColor(i11);
        x3Var.setHandlesColor(i11);
        x3Var.setHighlightColor(k6.l1(0.4f, i11));
    }

    public final void s() {
        x3 x3Var = this.f5599n0;
        if (x3Var.getText().length() <= 0) {
            x3Var.setHint(LocaleController.getString(R.string.TextPlaceholder));
            x3Var.setHintTextColor(1627389951);
            return;
        }
        x3Var.setHint((CharSequence) null);
    }

    public void setAlign(int i10) {
        this.f5603r0 = i10;
    }

    public void setBaseFontSize(int i10) {
        this.f5602q0 = i10;
        float f10 = i10;
        x3 x3Var = this.f5599n0;
        x3Var.setTextSize(0, f10);
        x3Var.setCursorSize(AndroidUtilities.dp(f10 * 0.4f));
        if (x3Var.getText() != null) {
            Editable text = x3Var.getText();
            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) text.getSpans(0, text.length(), Emoji.EmojiSpan.class);
            for (int i11 = 0; i11 < emojiSpanArr.length; i11++) {
                emojiSpanArr[i11].replaceFontMetrics(getFontMetricsInt());
                emojiSpanArr[i11].scale = 0.85f;
            }
            for (u5 u5Var : (u5[]) text.getSpans(0, text.length(), u5.class)) {
                u5Var.replaceFontMetrics(getFontMetricsInt());
            }
            x3Var.invalidateForce();
        }
    }

    public void setMaxWidth(int i10) {
        this.f5599n0.setMaxWidth(i10);
    }

    public void setSwatch(dg.e2 e2Var) {
        this.f5600o0 = new dg.e2(e2Var.f4525b, e2Var.f4526c, e2Var.f4524a);
        r();
    }

    public void setText(CharSequence charSequence) {
        this.f5599n0.setText(charSequence);
        s();
    }

    public void setType(int i10) {
        this.f5601p0 = i10;
        r();
    }

    public void setTypeface(dg.s0 s0Var) {
        this.f5604s0 = s0Var;
        if (s0Var != null) {
            this.f5599n0.setTypeface(s0Var.d());
        }
        m();
    }

    public void setTypeface(String str) {
        Iterator it = dg.s0.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            dg.s0 s0Var = (dg.s0) it.next();
            if (s0Var.f4665a.equals(str)) {
                setTypeface(s0Var);
                str = null;
                break;
            }
        }
        this.f5609x0 = str;
        m();
    }

    public z3(Context context, z3 z3Var, PointF pointF) {
        this(context, pointF, z3Var.f5602q0, z3Var.getText(), z3Var.getSwatch(), z3Var.f5601p0);
        setRotation(z3Var.getRotation());
        setScale(z3Var.getScale());
        setTypeface(z3Var.getTypeface());
        setAlign(z3Var.getAlign());
        int align = getAlign();
        int i10 = 2;
        this.f5599n0.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 == 1) {
            i10 = 4;
        } else if (align2 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i10 = 3;
        }
        this.f5599n0.setTextAlignment(i10);
    }
}

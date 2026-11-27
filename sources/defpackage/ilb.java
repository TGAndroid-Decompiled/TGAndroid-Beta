package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
public class ilb extends FrameLayout implements snb {
    public final te1 a;
    public final m66 b;
    public int c;
    public Integer d;
    public int e;
    public int f;
    public int h;
    public boolean n;
    public CharSequence r;
    public final vnb s;
    public int w;

    public ilb(int i, vnb vnbVar, Context context) {
        super(context);
        int i2;
        this.c = aob.J6;
        this.e = 10;
        this.f = 17;
        this.s = vnbVar;
        m66 m66Var = new m66(this);
        this.b = m66Var;
        te1 te1Var = new te1(this, context, m66Var, vnbVar);
        this.a = te1Var;
        te1Var.setTextSize(1, 14.0f);
        if (ob6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        te1Var.setGravity(i2);
        te1Var.setPadding(0, hl.L(10.0f), 0, hl.L(17.0f));
        te1Var.setMovementMethod(LinkMovementMethod.getInstance());
        int i3 = aob.B6;
        yob.X(te1Var, i3, vnbVar);
        int v0 = aob.v0(i3, vnbVar);
        this.w = v0;
        te1Var.setEmojiColor(v0);
        yob.G(te1Var, this.c, vnbVar);
        te1Var.setImportantForAccessibility(2);
        float f = i;
        addView(te1Var, tre.d(-1, -2.0f, (ob6.a0 ? 5 : 3) | 48, f, 0.0f, f, 0.0f));
        this.n = ob6.a0;
        setWillNotDraw(false);
    }

    public final void c(ArrayList arrayList, boolean z) {
        float f = 0.5f;
        te1 te1Var = this.a;
        if (arrayList != null) {
            if (z) {
                f = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(te1Var, View.ALPHA, f));
            return;
        }
        if (z) {
            f = 1.0f;
        }
        te1Var.setAlpha(f);
    }

    public int getFixedSize() {
        return this.h;
    }

    public CharSequence getText() {
        return this.a.getText();
    }

    public p66 getTextView() {
        return this.a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        m66 m66Var = this.b;
        if (m66Var != null) {
            canvas.save();
            te1 te1Var = this.a;
            canvas.translate(te1Var.getLeft(), te1Var.getTop());
            if (m66Var.g(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(TextView.class.getName());
        accessibilityNodeInfo.setText(this.r);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3 = this.h;
        if (i3 == -1) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), 1073741824);
        } else if (i3 != 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(this.h), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), 0);
        }
    }

    public void setBottomPadding(int i) {
        this.f = i;
    }

    public void setFixedSize(int i) {
        this.h = i;
    }

    public void setLinkTextColorKey(int i) {
        this.c = i;
    }

    public void setLinkTextRippleColor(Integer num) {
        this.d = num;
    }

    public void setText(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.r)) {
            this.r = charSequence;
            te1 te1Var = this.a;
            if (charSequence == null) {
                te1Var.setPadding(0, hl.L(2.0f), 0, 0);
            } else {
                te1Var.setPadding(0, hl.L(this.e), 0, hl.L(this.f));
            }
            SpannableString spannableString = null;
            if (charSequence != null) {
                int length = charSequence.length();
                for (int i = 0; i < length - 1; i++) {
                    if (charSequence.charAt(i) == '\n') {
                        int i2 = i + 1;
                        if (charSequence.charAt(i2) == '\n') {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence);
                            }
                            spannableString.setSpan(new AbsoluteSizeSpan(10, true), i2, i + 2, 33);
                        }
                    }
                }
            }
            if (spannableString != null) {
                charSequence = spannableString;
            }
            te1Var.setText(charSequence);
        }
    }

    public void setTextColor(int i) {
        te1 te1Var = this.a;
        ColorStateList linkTextColors = te1Var.getLinkTextColors();
        xob xobVar = yob.a;
        te1Var.setTag(2131296711, null);
        yob.G(te1Var, this.c, this.s);
        if (linkTextColors != null) {
            te1Var.setLinkTextColor(linkTextColors);
        }
        te1Var.setTextColor(i);
    }

    public void setTextColorByKey(int i) {
        vnb vnbVar = this.s;
        te1 te1Var = this.a;
        yob.X(te1Var, i, vnbVar);
        te1Var.setTag(Integer.valueOf(i));
    }

    public void setTextGravity(int i) {
        this.a.setGravity(i);
    }

    public void setTopPadding(int i) {
        this.e = i;
    }

    public void updateColors() {
        try {
            int v0 = aob.v0(aob.B6, this.s);
            te1 te1Var = this.a;
            if (te1Var != null && v0 != this.w) {
                this.w = v0;
                te1Var.setEmojiColor(v0);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public void a() {
    }

    public void b() {
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public ilb(Context context, vnb vnbVar) {
        this(24, vnbVar, context);
    }

    public ilb(Context context) {
        this(24, null, context);
    }
}

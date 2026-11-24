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
public class njb extends FrameLayout implements vlb {
    public final sf1 a;
    public final i66 b;
    public int c;
    public Integer d;
    public int e;
    public int f;
    public int h;
    public boolean n;
    public CharSequence r;
    public final ylb s;
    public int w;

    public njb(int i, ylb ylbVar, Context context) {
        super(context);
        int i2;
        this.c = cmb.I6;
        this.e = 10;
        this.f = 17;
        this.s = ylbVar;
        i66 i66Var = new i66(this);
        this.b = i66Var;
        sf1 sf1Var = new sf1(this, context, i66Var, ylbVar);
        this.a = sf1Var;
        sf1Var.setTextSize(1, 14.0f);
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        sf1Var.setGravity(i2);
        sf1Var.setPadding(0, gm.L(10.0f), 0, gm.L(17.0f));
        sf1Var.setMovementMethod(LinkMovementMethod.getInstance());
        int i3 = cmb.A6;
        anb.X(sf1Var, i3, ylbVar);
        int v0 = cmb.v0(i3, ylbVar);
        this.w = v0;
        sf1Var.setEmojiColor(v0);
        anb.G(sf1Var, this.c, ylbVar);
        sf1Var.setImportantForAccessibility(2);
        float f = i;
        addView(sf1Var, qoe.d(-1, -2.0f, (jb6.a0 ? 5 : 3) | 48, f, 0.0f, f, 0.0f));
        this.n = jb6.a0;
        setWillNotDraw(false);
    }

    public final void c(ArrayList arrayList, boolean z) {
        float f = 0.5f;
        sf1 sf1Var = this.a;
        if (arrayList != null) {
            if (z) {
                f = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(sf1Var, View.ALPHA, f));
            return;
        }
        if (z) {
            f = 1.0f;
        }
        sf1Var.setAlpha(f);
    }

    public int getFixedSize() {
        return this.h;
    }

    public CharSequence getText() {
        return this.a.getText();
    }

    public l66 getTextView() {
        return this.a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        i66 i66Var = this.b;
        if (i66Var != null) {
            canvas.save();
            sf1 sf1Var = this.a;
            canvas.translate(sf1Var.getLeft(), sf1Var.getTop());
            if (i66Var.g(canvas)) {
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
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(this.h), 1073741824));
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
            sf1 sf1Var = this.a;
            if (charSequence == null) {
                sf1Var.setPadding(0, gm.L(2.0f), 0, 0);
            } else {
                sf1Var.setPadding(0, gm.L(this.e), 0, gm.L(this.f));
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
            sf1Var.setText(charSequence);
        }
    }

    public void setTextColor(int i) {
        sf1 sf1Var = this.a;
        ColorStateList linkTextColors = sf1Var.getLinkTextColors();
        zmb zmbVar = anb.a;
        sf1Var.setTag(2131296711, null);
        anb.G(sf1Var, this.c, this.s);
        if (linkTextColors != null) {
            sf1Var.setLinkTextColor(linkTextColors);
        }
        sf1Var.setTextColor(i);
    }

    public void setTextColorByKey(int i) {
        ylb ylbVar = this.s;
        sf1 sf1Var = this.a;
        anb.X(sf1Var, i, ylbVar);
        sf1Var.setTag(Integer.valueOf(i));
    }

    public void setTextGravity(int i) {
        this.a.setGravity(i);
    }

    public void setTopPadding(int i) {
        this.e = i;
    }

    public void updateColors() {
        try {
            int v0 = cmb.v0(cmb.A6, this.s);
            sf1 sf1Var = this.a;
            if (sf1Var != null && v0 != this.w) {
                this.w = v0;
                sf1Var.setEmojiColor(v0);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public void a() {
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b() {
    }

    public njb(Context context, ylb ylbVar) {
        this(24, ylbVar, context);
    }

    public njb(Context context) {
        this(24, null, context);
    }
}

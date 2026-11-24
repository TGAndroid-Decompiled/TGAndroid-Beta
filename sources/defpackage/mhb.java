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
public class mhb extends FrameLayout implements tjb {
    public final ke1 a;
    public final i46 b;
    public int c;
    public Integer d;
    public int e;
    public int f;
    public int h;
    public boolean n;
    public CharSequence r;
    public final wjb s;
    public int w;

    public mhb(int i, wjb wjbVar, Context context) {
        super(context);
        int i2;
        this.c = bkb.I6;
        this.e = 10;
        this.f = 17;
        this.s = wjbVar;
        i46 i46Var = new i46(this);
        this.b = i46Var;
        ke1 ke1Var = new ke1(this, context, i46Var, wjbVar);
        this.a = ke1Var;
        ke1Var.setTextSize(1, 14.0f);
        if (k96.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        ke1Var.setGravity(i2);
        ke1Var.setPadding(0, gl.L(10.0f), 0, gl.L(17.0f));
        ke1Var.setMovementMethod(LinkMovementMethod.getInstance());
        int i3 = bkb.A6;
        zkb.X(ke1Var, i3, wjbVar);
        int v0 = bkb.v0(i3, wjbVar);
        this.w = v0;
        ke1Var.setEmojiColor(v0);
        zkb.G(ke1Var, this.c, wjbVar);
        ke1Var.setImportantForAccessibility(2);
        float f = i;
        addView(ke1Var, nme.d(-1, -2.0f, (k96.a0 ? 5 : 3) | 48, f, 0.0f, f, 0.0f));
        this.n = k96.a0;
        setWillNotDraw(false);
    }

    public final void c(ArrayList arrayList, boolean z) {
        float f = 0.5f;
        ke1 ke1Var = this.a;
        if (arrayList != null) {
            if (z) {
                f = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(ke1Var, View.ALPHA, f));
            return;
        }
        if (z) {
            f = 1.0f;
        }
        ke1Var.setAlpha(f);
    }

    public int getFixedSize() {
        return this.h;
    }

    public CharSequence getText() {
        return this.a.getText();
    }

    public l46 getTextView() {
        return this.a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        i46 i46Var = this.b;
        if (i46Var != null) {
            canvas.save();
            ke1 ke1Var = this.a;
            canvas.translate(ke1Var.getLeft(), ke1Var.getTop());
            if (i46Var.g(canvas)) {
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
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(this.h), 1073741824));
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
            ke1 ke1Var = this.a;
            if (charSequence == null) {
                ke1Var.setPadding(0, gl.L(2.0f), 0, 0);
            } else {
                ke1Var.setPadding(0, gl.L(this.e), 0, gl.L(this.f));
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
            ke1Var.setText(charSequence);
        }
    }

    public void setTextColor(int i) {
        ke1 ke1Var = this.a;
        ColorStateList linkTextColors = ke1Var.getLinkTextColors();
        ykb ykbVar = zkb.a;
        ke1Var.setTag(2131296711, null);
        zkb.G(ke1Var, this.c, this.s);
        if (linkTextColors != null) {
            ke1Var.setLinkTextColor(linkTextColors);
        }
        ke1Var.setTextColor(i);
    }

    public void setTextColorByKey(int i) {
        wjb wjbVar = this.s;
        ke1 ke1Var = this.a;
        zkb.X(ke1Var, i, wjbVar);
        ke1Var.setTag(Integer.valueOf(i));
    }

    public void setTextGravity(int i) {
        this.a.setGravity(i);
    }

    public void setTopPadding(int i) {
        this.e = i;
    }

    public void updateColors() {
        try {
            int v0 = bkb.v0(bkb.A6, this.s);
            ke1 ke1Var = this.a;
            if (ke1Var != null && v0 != this.w) {
                this.w = v0;
                ke1Var.setEmojiColor(v0);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public void a() {
    }

    public void b() {
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public mhb(Context context, wjb wjbVar) {
        this(24, wjbVar, context);
    }

    public mhb(Context context) {
        this(24, null, context);
    }
}

package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
public final class uk3 extends FrameLayout implements snb {
    public final LinearLayout a;
    public final LinearLayout b;
    public final gm c;
    public final p66 d;
    public final ImageView e;
    public final ImageView f;
    public final de0 h;
    public final jc0 n;
    public boolean r;

    public uk3(Context context) {
        super(context);
        int i;
        int L;
        int i2;
        int i3;
        setWillNotDraw(false);
        setPadding(hl.L(9.0f), hl.L(5.0f), hl.L(9.0f), hl.L(7.0f));
        jc0 jc0Var = new jc0(context, false);
        this.n = jc0Var;
        jc0Var.setStepFactor(0.56790125f);
        jc0Var.setVisibility(8);
        jc0Var.setCount(0);
        de0 de0Var = new de0(context);
        this.h = de0Var;
        de0Var.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        if (ob6.a0) {
            i = hl.L(24.0f);
        } else {
            i = 0;
        }
        if (ob6.a0) {
            L = 0;
        } else {
            L = hl.L(24.0f);
        }
        linearLayout.setPadding(i, 0, L, 0);
        gm gmVar = new gm(context);
        this.c = gmVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        gmVar.setEllipsize(truncateAt);
        gmVar.setTextSize(1, 14.0f);
        gmVar.setTypeface(hl.o());
        gmVar.setMaxLines(5);
        if (ob6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        linearLayout.addView(gmVar, tre.p(-2, -2, 0.0f, i2 | 48));
        p66 p66Var = new p66(context, null);
        this.d = p66Var;
        p66Var.setTextSize(1, 13.0f);
        p66Var.setEllipsize(truncateAt);
        p66Var.setMaxLines(5);
        linearLayout.addView(p66Var, tre.p(-1, -2, 0.0f, 48));
        jn7.i(gmVar);
        jn7.i(p66Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.a = linearLayout2;
        linearLayout2.setOrientation(0);
        if (ob6.a0) {
            linearLayout2.addView(linearLayout, tre.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
            linearLayout2.addView(jc0Var, tre.d(0, -1.0f, 16, 0.0f, 0.0f, -2.0f, 0.0f));
            linearLayout2.addView(de0Var, tre.d(36, 36.0f, 21, 0.0f, 0.0f, -2.0f, 0.0f));
        } else {
            linearLayout2.addView(de0Var, tre.d(36, 36.0f, 19, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(jc0Var, tre.d(0, -1.0f, 16, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(linearLayout, tre.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
        }
        addView(linearLayout2, tre.c(-1.0f, -1));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(2131230872);
        if (ob6.a0) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        addView(imageView, tre.d(16, 16.0f, i3 | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setImageResource(2131232101);
        imageView2.setPadding(hl.L(6.0f), hl.L(6.0f), hl.L(6.0f), hl.L(6.0f));
        addView(imageView2, tre.d(36, 36.0f, (ob6.a0 ? 3 : 5) | 16, -4.0f, 0.0f, -4.0f, 0.0f));
        imageView2.setVisibility(8);
        setClipToPadding(false);
        setClipChildren(false);
        updateColors();
    }

    public final void a(int i, ArrayList arrayList) {
        int size;
        boolean z;
        int i2;
        int L;
        TLObject tLObject;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        int min = Math.min(3, size);
        jc0 jc0Var = this.n;
        if (min != jc0Var.a.n) {
            z = true;
        } else {
            z = false;
        }
        if (min <= 1) {
            jc0Var.setAvatarsTextSize(hl.L(22.0f));
            jc0Var.setSize(hl.L(36.0f));
        } else {
            jc0Var.setAvatarsTextSize(hl.L(20.0f));
            jc0Var.setSize(hl.L(30.0f));
        }
        jc0Var.setCount(min);
        if (min <= 0) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        jc0Var.setVisibility(i2);
        ViewGroup.LayoutParams layoutParams = jc0Var.getLayoutParams();
        if (min <= 1) {
            L = hl.L(36.0f);
        } else {
            L = hl.L(bp1.h(min, 1, 18, 30));
        }
        layoutParams.width = L;
        if (z) {
            this.a.requestLayout();
        }
        if (arrayList != null) {
            for (int i3 = 0; i3 < 3; i3++) {
                if (i3 >= arrayList.size()) {
                    tLObject = null;
                } else {
                    tLObject = (TLObject) arrayList.get(i3);
                }
                jc0Var.b(i3, i, tLObject);
            }
        }
        jc0Var.a(false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2) {
        c(charSequence, charSequence2, true, false);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        this.r = z2;
        if (TextUtils.isEmpty(charSequence)) {
            i = 8;
        } else {
            i = 0;
        }
        gm gmVar = this.c;
        gmVar.setVisibility(i);
        gmVar.setText(charSequence);
        gmVar.setCompoundDrawables(null, null, null, null);
        this.d.setText(charSequence2);
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        this.e.setVisibility(i2);
        this.f.setVisibility(8);
        if (z) {
            i3 = hl.L(24.0f);
        } else {
            i3 = 0;
        }
        if (ob6.a0) {
            i4 = i3;
            i3 = 0;
        } else {
            i4 = 0;
        }
        this.b.setPadding(i4, 0, i3, 0);
        updateColors();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        Point point = hl.q;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        LinearLayout linearLayout = this.b;
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(linearLayout.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight(), 1073741824));
        this.f.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.n.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.h.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
        this.e.setTranslationY((getPaddingBottom() - getPaddingTop()) / 2.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.5f) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(new je3(this, onClickListener, (byte) 7));
    }

    public void setOnCloseListener(View.OnClickListener onClickListener) {
        this.e.setVisibility(4);
        ImageView imageView = this.f;
        imageView.setVisibility(0);
        imageView.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        int i;
        if (this.r) {
            i = aob.q7;
        } else {
            i = aob.G6;
        }
        this.c.setTextColor(aob.w0(null, i, false));
        int i2 = aob.y6;
        int w0 = aob.w0(null, i2, false);
        p66 p66Var = this.d;
        p66Var.setTextColor(w0);
        p66Var.setLinkTextColor(aob.w0(null, aob.Xc, false));
        int w02 = aob.w0(null, i2, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.e.setColorFilter(w02, mode);
        int w03 = aob.w0(null, i2, false);
        ImageView imageView = this.f;
        imageView.setColorFilter(w03, mode);
        imageView.setBackground(rnb.c(null, rnb.b(aob.w0(null, rnb.a, false))));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCompact(boolean z) {
    }
}

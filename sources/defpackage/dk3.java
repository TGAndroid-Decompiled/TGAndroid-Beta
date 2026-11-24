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
public final class dk3 extends FrameLayout implements tjb {
    public final LinearLayout a;
    public final LinearLayout b;
    public final fm c;
    public final l46 d;
    public final ImageView e;
    public final ImageView f;
    public final be0 h;
    public final hc0 n;
    public boolean r;

    public dk3(Context context) {
        super(context);
        int i;
        int L;
        int i2;
        int i3;
        setWillNotDraw(false);
        setPadding(gl.L(9.0f), gl.L(5.0f), gl.L(9.0f), gl.L(7.0f));
        hc0 hc0Var = new hc0(context, false);
        this.n = hc0Var;
        hc0Var.setStepFactor(0.56790125f);
        hc0Var.setVisibility(8);
        hc0Var.setCount(0);
        be0 be0Var = new be0(context);
        this.h = be0Var;
        be0Var.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        if (k96.a0) {
            i = gl.L(24.0f);
        } else {
            i = 0;
        }
        if (k96.a0) {
            L = 0;
        } else {
            L = gl.L(24.0f);
        }
        linearLayout.setPadding(i, 0, L, 0);
        fm fmVar = new fm(context);
        this.c = fmVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        fmVar.setEllipsize(truncateAt);
        fmVar.setTextSize(1, 14.0f);
        fmVar.setTypeface(gl.o());
        fmVar.setMaxLines(5);
        if (k96.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        linearLayout.addView(fmVar, nme.p(-2, -2, 0.0f, i2 | 48));
        l46 l46Var = new l46(context, null);
        this.d = l46Var;
        l46Var.setTextSize(1, 13.0f);
        l46Var.setEllipsize(truncateAt);
        l46Var.setMaxLines(5);
        linearLayout.addView(l46Var, nme.p(-1, -2, 0.0f, 48));
        kk7.i(fmVar);
        kk7.i(l46Var);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.a = linearLayout2;
        linearLayout2.setOrientation(0);
        if (k96.a0) {
            linearLayout2.addView(linearLayout, nme.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
            linearLayout2.addView(hc0Var, nme.d(0, -1.0f, 16, 0.0f, 0.0f, -2.0f, 0.0f));
            linearLayout2.addView(be0Var, nme.d(36, 36.0f, 21, 0.0f, 0.0f, -2.0f, 0.0f));
        } else {
            linearLayout2.addView(be0Var, nme.d(36, 36.0f, 19, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(hc0Var, nme.d(0, -1.0f, 16, -2.0f, 0.0f, 0.0f, 0.0f));
            linearLayout2.addView(linearLayout, nme.d(-1, -1.0f, 16, 7.0f, 0.0f, 7.0f, 0.0f));
        }
        addView(linearLayout2, nme.c(-1.0f, -1));
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(2131230872);
        if (k96.a0) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        addView(imageView, nme.d(16, 16.0f, i3 | 16, 4.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f = imageView2;
        imageView2.setImageResource(2131232101);
        imageView2.setPadding(gl.L(6.0f), gl.L(6.0f), gl.L(6.0f), gl.L(6.0f));
        addView(imageView2, nme.d(36, 36.0f, (k96.a0 ? 3 : 5) | 16, -4.0f, 0.0f, -4.0f, 0.0f));
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
        hc0 hc0Var = this.n;
        if (min != hc0Var.a.n) {
            z = true;
        } else {
            z = false;
        }
        if (min <= 1) {
            hc0Var.setAvatarsTextSize(gl.L(22.0f));
            hc0Var.setSize(gl.L(36.0f));
        } else {
            hc0Var.setAvatarsTextSize(gl.L(20.0f));
            hc0Var.setSize(gl.L(30.0f));
        }
        hc0Var.setCount(min);
        if (min <= 0) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        hc0Var.setVisibility(i2);
        ViewGroup.LayoutParams layoutParams = hc0Var.getLayoutParams();
        if (min <= 1) {
            L = gl.L(36.0f);
        } else {
            L = gl.L(oo1.h(min, 1, 18, 30));
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
                hc0Var.b(i3, i, tLObject);
            }
        }
        hc0Var.a(false);
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
        fm fmVar = this.c;
        fmVar.setVisibility(i);
        fmVar.setText(charSequence);
        fmVar.setCompoundDrawables(null, null, null, null);
        this.d.setText(charSequence2);
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        this.e.setVisibility(i2);
        this.f.setVisibility(8);
        if (z) {
            i3 = gl.L(24.0f);
        } else {
            i3 = 0;
        }
        if (k96.a0) {
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
        Point point = gl.q;
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
        super.setOnClickListener(new xf3(this, onClickListener, (byte) 5));
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
            i = bkb.p7;
        } else {
            i = bkb.F6;
        }
        this.c.setTextColor(bkb.w0(null, i, false));
        int i2 = bkb.x6;
        int w0 = bkb.w0(null, i2, false);
        l46 l46Var = this.d;
        l46Var.setTextColor(w0);
        l46Var.setLinkTextColor(bkb.w0(null, bkb.Wc, false));
        int w02 = bkb.w0(null, i2, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.e.setColorFilter(w02, mode);
        int w03 = bkb.w0(null, i2, false);
        ImageView imageView = this.f;
        imageView.setColorFilter(w03, mode);
        imageView.setBackground(sjb.c(null, sjb.b(bkb.w0(null, sjb.a, false))));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCompact(boolean z) {
    }
}

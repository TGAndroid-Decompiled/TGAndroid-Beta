package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.WeakHashMap;
public class ld5 extends FrameLayout {
    public int a;
    public final byte b;
    public final byte c;
    public final TextView d;
    public final hn e;
    public final jia f;
    public int h;
    public final boolean n;

    public ld5(Context context, int i, int i2, int i3, int i4, boolean z, boolean z2, wjb wjbVar) {
        super(context);
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        this.h = 40;
        this.b = i2;
        this.c = i4;
        this.n = z2;
        if (z2) {
            hn hnVar = new hn(getContext(), false, false, false);
            this.e = hnVar;
            hnVar.setTextSize(gl.L(14.0f));
            hnVar.setTypeface(gl.o());
            if (k96.a0) {
                i8 = 5;
            } else {
                i8 = 3;
            }
            hnVar.setGravity(i8 | 16);
            zkb.U(hnVar, i, wjbVar);
            hnVar.setTag(Integer.valueOf(i));
            hnVar.getDrawable().r(true, false);
            float f = this.h - i3;
            if (k96.a0) {
                i9 = 5;
            } else {
                i9 = 3;
            }
            int i10 = i9 | 48;
            float f2 = i2;
            addView(hnVar, nme.d(-1, f, i10, f2, i3, f2, z ? 0.0f : i4));
        } else {
            TextView textView = new TextView(getContext());
            this.d = textView;
            ir2.t(textView, 1, 14.0f);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            if (k96.a0) {
                i5 = 5;
            } else {
                i5 = 3;
            }
            textView.setGravity(i5 | 16);
            textView.setMinHeight(gl.L(this.h - i3));
            zkb.X(textView, i, wjbVar);
            textView.setTag(Integer.valueOf(i));
            if (k96.a0) {
                i6 = 5;
            } else {
                i6 = 3;
            }
            int i11 = i6 | 48;
            float f3 = i2;
            addView(textView, nme.d(-1, -1.0f, i11, f3, i3, f3, z ? 0.0f : i4));
        }
        if (z) {
            jia jiaVar = new jia(getContext());
            this.f = jiaVar;
            jiaVar.setTextSize(13);
            if (k96.a0) {
                i7 = 3;
            } else {
                i7 = 5;
            }
            jiaVar.setGravity(i7 | 48);
            float f4 = i2;
            addView(jiaVar, nme.d(-1, -1.0f, (k96.a0 ? 3 : 5) | 48, f4, 21.0f, f4, i4));
        }
        WeakHashMap weakHashMap = jdc.a;
        new xcc(2131296686, Boolean.class, 0, 28, (byte) 2).a(this, Boolean.TRUE);
    }

    public final void a(ArrayList arrayList, boolean z) {
        float f = 0.5f;
        TextView textView = this.d;
        if (arrayList != null) {
            if (z) {
                f = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView, View.ALPHA, f));
            return;
        }
        if (z) {
            f = 1.0f;
        }
        textView.setAlpha(f);
    }

    public final void b(boolean z) {
        float f;
        super.setEnabled(z);
        ViewPropertyAnimator animate = this.d.animate();
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        animate.alpha(f).start();
    }

    public final void c(CharSequence charSequence, boolean z) {
        boolean z2 = k96.a0;
        int i = 3;
        if (this.n) {
            if (z2) {
                i = 5;
            }
            hn hnVar = this.e;
            hnVar.setGravity(i | 16);
            hnVar.c(charSequence, z, true);
            return;
        }
        if (z2) {
            i = 5;
        }
        TextView textView = this.d;
        textView.setGravity(i | 16);
        textView.setText(charSequence);
    }

    public float getAnimatedWidth() {
        return this.e.getDrawable().c();
    }

    public TextView getTextView() {
        return this.d;
    }

    public jia getTextView2() {
        return this.f;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (Build.VERSION.SDK_INT >= 28) {
            accessibilityNodeInfo.setHeading(true);
        } else {
            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
            if (collectionItemInfo != null) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo.getRowIndex(), collectionItemInfo.getRowSpan(), collectionItemInfo.getColumnIndex(), collectionItemInfo.getColumnSpan(), true));
            }
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), 0);
    }

    public void setBottomMargin(int i) {
        float f = i;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = gl.L(f);
        jia jiaVar = this.f;
        if (jiaVar != null) {
            ((FrameLayout.LayoutParams) jiaVar.getLayoutParams()).bottomMargin = gl.L(f);
        }
    }

    public void setHeight(int i) {
        this.h = i;
        int L = gl.L(i);
        TextView textView = this.d;
        int i2 = L - ((FrameLayout.LayoutParams) textView.getLayoutParams()).topMargin;
        if (textView.getMinHeight() != i2) {
            textView.setMinHeight(i2);
            requestLayout();
        }
    }

    public void setOnWidthUpdateListener(Runnable runnable) {
        this.e.setOnWidthUpdatedListener(runnable);
    }

    public void setText(CharSequence charSequence) {
        c(charSequence, false);
    }

    public void setText2(CharSequence charSequence) {
        jia jiaVar = this.f;
        if (jiaVar == null) {
            return;
        }
        jiaVar.l(charSequence, false);
    }

    public void setTextColor(int i) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextColor(i);
        }
        hn hnVar = this.e;
        if (hnVar != null) {
            hnVar.setTextColor(i);
        }
    }

    public void setTextSize(float f) {
        if (this.n) {
            this.e.setTextSize(gl.L(f));
            return;
        }
        this.d.setTextSize(1, f);
    }

    public void setTopMargin(int i) {
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = gl.L(i);
        setHeight(this.h);
    }

    public ld5(Context context, wjb wjbVar) {
        this(context, bkb.K6, 20, 7, false, wjbVar);
    }

    public ld5(Context context, int i) {
        this(context, bkb.K6, i, 7, false, null);
    }

    public ld5(Context context, int i, int i2, int i3, boolean z, wjb wjbVar) {
        this(context, i, i2, i3, 0, z, false, wjbVar);
    }

    public ld5(Context context) {
        this(context, bkb.K6, 20, 7, false, null);
    }
}

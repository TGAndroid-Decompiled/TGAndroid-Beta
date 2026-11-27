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
public class mf5 extends FrameLayout {
    public int a;
    public final byte b;
    public final byte c;
    public final TextView d;
    public final in e;
    public final ema f;
    public int h;
    public final boolean n;

    public mf5(Context context, int i, int i2, int i3, int i4, boolean z, boolean z2, vnb vnbVar) {
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
            in inVar = new in(getContext(), false, false, false);
            this.e = inVar;
            inVar.setTextSize(hl.L(14.0f));
            inVar.setTypeface(hl.o());
            if (ob6.a0) {
                i8 = 5;
            } else {
                i8 = 3;
            }
            inVar.setGravity(i8 | 16);
            yob.U(inVar, i, vnbVar);
            inVar.setTag(Integer.valueOf(i));
            inVar.getDrawable().r(true, false);
            float f = this.h - i3;
            if (ob6.a0) {
                i9 = 5;
            } else {
                i9 = 3;
            }
            int i10 = i9 | 48;
            float f2 = i2;
            addView(inVar, tre.d(-1, f, i10, f2, i3, f2, z ? 0.0f : i4));
        } else {
            TextView textView = new TextView(getContext());
            this.d = textView;
            bs2.t(textView, 1, 14.0f);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            if (ob6.a0) {
                i5 = 5;
            } else {
                i5 = 3;
            }
            textView.setGravity(i5 | 16);
            textView.setMinHeight(hl.L(this.h - i3));
            yob.X(textView, i, vnbVar);
            textView.setTag(Integer.valueOf(i));
            if (ob6.a0) {
                i6 = 5;
            } else {
                i6 = 3;
            }
            int i11 = i6 | 48;
            float f3 = i2;
            addView(textView, tre.d(-1, -1.0f, i11, f3, i3, f3, z ? 0.0f : i4));
        }
        if (z) {
            ema emaVar = new ema(getContext());
            this.f = emaVar;
            emaVar.setTextSize(13);
            if (ob6.a0) {
                i7 = 3;
            } else {
                i7 = 5;
            }
            emaVar.setGravity(i7 | 48);
            float f4 = i2;
            addView(emaVar, tre.d(-1, -1.0f, (ob6.a0 ? 3 : 5) | 48, f4, 21.0f, f4, i4));
        }
        WeakHashMap weakHashMap = ihc.a;
        new wgc(2131296686, Boolean.class, 0, 28, (byte) 2).a(this, Boolean.TRUE);
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
        boolean z2 = ob6.a0;
        int i = 3;
        if (this.n) {
            if (z2) {
                i = 5;
            }
            in inVar = this.e;
            inVar.setGravity(i | 16);
            inVar.c(charSequence, z, true);
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

    public ema getTextView2() {
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
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = hl.L(f);
        ema emaVar = this.f;
        if (emaVar != null) {
            ((FrameLayout.LayoutParams) emaVar.getLayoutParams()).bottomMargin = hl.L(f);
        }
    }

    public void setHeight(int i) {
        this.h = i;
        int L = hl.L(i);
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
        ema emaVar = this.f;
        if (emaVar == null) {
            return;
        }
        emaVar.l(charSequence, false);
    }

    public void setTextColor(int i) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextColor(i);
        }
        in inVar = this.e;
        if (inVar != null) {
            inVar.setTextColor(i);
        }
    }

    public void setTextSize(float f) {
        if (this.n) {
            this.e.setTextSize(hl.L(f));
            return;
        }
        this.d.setTextSize(1, f);
    }

    public void setTopMargin(int i) {
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).topMargin = hl.L(i);
        setHeight(this.h);
    }

    public mf5(Context context, vnb vnbVar) {
        this(context, aob.L6, 20, 7, false, vnbVar);
    }

    public mf5(Context context, int i) {
        this(context, aob.L6, i, 7, false, null);
    }

    public mf5(Context context, int i, int i2, int i3, boolean z, vnb vnbVar) {
        this(context, i, i2, i3, 0, z, false, vnbVar);
    }

    public mf5(Context context) {
        this(context, aob.L6, 20, 7, false, null);
    }
}

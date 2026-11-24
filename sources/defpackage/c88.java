package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
public final class c88 extends FrameLayout {
    public final byte a = 0;
    public int b;
    public Object c;
    public View d;
    public View e;
    public Object f;
    public final Object h;

    public c88(rja rjaVar, Context context) {
        super(context);
        this.h = rjaVar;
        this.c = new lka[2];
        setClipChildren(false);
    }

    public final lka a() {
        lka lkaVar = new lka(getContext());
        lkaVar.setGravity(17);
        lkaVar.setTextSize(14);
        lkaVar.setTextColor(((rja) this.h).f0);
        addView(lkaVar, qoe.e(-2, -2, 51));
        return lkaVar;
    }

    public final void b(int i) {
        rja rjaVar = (rja) this.h;
        lka[] lkaVarArr = (lka[]) this.c;
        if (lkaVarArr[i] != null) {
            return;
        }
        lka lkaVar = new lka(getContext());
        lkaVar.setGravity(17);
        lkaVar.setTypeface(gm.o());
        lkaVar.setTextSize(17);
        lkaVar.setTextColor(rjaVar.e0);
        lkaVar.setEmojiColor(rjaVar.e0);
        lkaVar.setDrawablePadding(gm.L(4.0f));
        lkaVar.setPadding(0, gm.L(8.0f), 0, gm.L(8.0f));
        lkaVar.setRightDrawableTopPadding(-gm.L(1.0f));
        lkaVarArr[i] = lkaVar;
        addView(lkaVar, 0, qoe.e(-2, -2, 51));
    }

    public final void c(CharSequence charSequence) {
        this.f = charSequence;
        lka lkaVar = (lka) this.e;
        int i = 8;
        if (lkaVar != null) {
            lkaVar.animate().cancel();
            ((lka) this.e).setVisibility(8);
        }
        lka lkaVar2 = (lka) this.d;
        if (lkaVar2 == null) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            lkaVar2 = a();
            this.d = lkaVar2;
        }
        lkaVar2.animate().cancel();
        ((lka) this.d).setAlpha(1.0f);
        ((lka) this.d).setTranslationY(0.0f);
        ((lka) this.d).k(charSequence);
        lka lkaVar3 = (lka) this.d;
        if (!TextUtils.isEmpty(charSequence)) {
            i = 0;
        }
        lkaVar3.setVisibility(i);
        requestLayout();
    }

    public final void d() {
        lka[] lkaVarArr;
        rja rjaVar = (rja) this.h;
        for (lka lkaVar : (lka[]) this.c) {
            if (lkaVar != null) {
                lkaVar.setTextColor(rjaVar.e0);
                lkaVar.setEmojiColor(rjaVar.e0);
            }
        }
        lka lkaVar2 = (lka) this.d;
        if (lkaVar2 != null) {
            lkaVar2.setTextColor(rjaVar.f0);
        }
        lka lkaVar3 = (lka) this.e;
        if (lkaVar3 != null) {
            lkaVar3.setTextColor(rjaVar.f0);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int textHeight;
        switch (this.a) {
            case 1:
                int i5 = i3 - i;
                int i6 = i4 - i2;
                lka lkaVar = (lka) this.d;
                if (lkaVar != null && lkaVar.getVisibility() != 8) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                lka[] lkaVarArr = (lka[]) this.c;
                for (lka lkaVar2 : lkaVarArr) {
                    if (lkaVar2 != null && lkaVar2.getVisibility() != 8) {
                        if (z2) {
                            textHeight = gm.L(5.0f) + (((i6 / 2) - lkaVar2.getTextHeight()) / 2);
                        } else {
                            textHeight = (i6 - lkaVar2.getTextHeight()) / 2;
                        }
                        int measuredWidth = (i5 - lkaVar2.getMeasuredWidth()) / 2;
                        int paddingTop = textHeight - lkaVar2.getPaddingTop();
                        lkaVar2.layout(measuredWidth, paddingTop, lkaVar2.getMeasuredWidth() + measuredWidth, lkaVar2.getMeasuredHeight() + paddingTop);
                    }
                }
                if (z2) {
                    lka[] lkaVarArr2 = {(lka) this.d, (lka) this.e};
                    for (int i7 = 0; i7 < 2; i7++) {
                        lka lkaVar3 = lkaVarArr2[i7];
                        if (lkaVar3 != null && lkaVar3.getVisibility() != 8) {
                            int i8 = i6 / 2;
                            int textHeight2 = (((i8 - lkaVar3.getTextHeight()) / 2) + i8) - gm.L(2.0f);
                            int measuredWidth2 = (i5 - lkaVar3.getMeasuredWidth()) / 2;
                            lkaVar3.layout(measuredWidth2, textHeight2, lkaVar3.getMeasuredWidth() + measuredWidth2, lkaVar3.getTextHeight() + textHeight2);
                        }
                    }
                }
                int childCount = getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = getChildAt(i9);
                    if (childAt != lkaVarArr[0] && childAt != lkaVarArr[1] && childAt != ((lka) this.d) && childAt != ((lka) this.e) && childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int i10 = layoutParams.leftMargin;
                        int measuredHeight = (((i6 - childAt.getMeasuredHeight()) / 2) + layoutParams.topMargin) - layoutParams.bottomMargin;
                        childAt.layout(i10, measuredHeight, childAt.getMeasuredWidth() + i10, childAt.getMeasuredHeight() + measuredHeight);
                    }
                }
                return;
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 1:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                int max = Math.max(0, size - (this.b << 1));
                lka[] lkaVarArr = (lka[]) this.c;
                for (lka lkaVar : lkaVarArr) {
                    if (lkaVar != null && lkaVar.getVisibility() != 8) {
                        lkaVar.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(lkaVar.getPaddingBottom() + lkaVar.getPaddingTop() + gm.L(24.0f), Integer.MIN_VALUE));
                    }
                }
                lka lkaVar2 = (lka) this.d;
                if (lkaVar2 != null && lkaVar2.getVisibility() != 8) {
                    ((lka) this.d).measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), Integer.MIN_VALUE));
                }
                lka lkaVar3 = (lka) this.e;
                if (lkaVar3 != null && lkaVar3.getVisibility() != 8) {
                    ((lka) this.e).measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), Integer.MIN_VALUE));
                }
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if (childAt != lkaVarArr[0] && childAt != lkaVarArr[1] && childAt != ((lka) this.d) && childAt != ((lka) this.e) && childAt.getVisibility() != 8) {
                        measureChildWithMargins(childAt, i, 0, i2, 0);
                    }
                }
                setMeasuredDimension(size, size2);
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void setTranslationX(float f) {
        c88 c88Var;
        switch (this.a) {
            case 0:
                super.setTranslationX(f);
                d88 d88Var = (d88) this.h;
                c88[] c88VarArr = d88Var.n;
                if (d88Var.s && (c88Var = c88VarArr[0]) == this) {
                    d88Var.h.i(Math.abs(c88Var.getTranslationX()) / c88VarArr[0].getMeasuredWidth(), c88VarArr[1].b);
                    return;
                }
                return;
            default:
                super.setTranslationX(f);
                return;
        }
    }

    public c88(d88 d88Var, Context context) {
        super(context);
        this.h = d88Var;
    }
}

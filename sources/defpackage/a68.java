package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
public final class a68 extends FrameLayout {
    public final byte a = 0;
    public int b;
    public Object c;
    public View d;
    public View e;
    public Object f;
    public final Object h;

    public a68(pha phaVar, Context context) {
        super(context);
        this.h = phaVar;
        this.c = new jia[2];
        setClipChildren(false);
    }

    public final jia a() {
        jia jiaVar = new jia(getContext());
        jiaVar.setGravity(17);
        jiaVar.setTextSize(14);
        jiaVar.setTextColor(((pha) this.h).f0);
        addView(jiaVar, nme.e(-2, -2, 51));
        return jiaVar;
    }

    public final void b(int i) {
        pha phaVar = (pha) this.h;
        jia[] jiaVarArr = (jia[]) this.c;
        if (jiaVarArr[i] != null) {
            return;
        }
        jia jiaVar = new jia(getContext());
        jiaVar.setGravity(17);
        jiaVar.setTypeface(gl.o());
        jiaVar.setTextSize(17);
        jiaVar.setTextColor(phaVar.e0);
        jiaVar.setEmojiColor(phaVar.e0);
        jiaVar.setDrawablePadding(gl.L(4.0f));
        jiaVar.setPadding(0, gl.L(8.0f), 0, gl.L(8.0f));
        jiaVar.setRightDrawableTopPadding(-gl.L(1.0f));
        jiaVarArr[i] = jiaVar;
        addView(jiaVar, 0, nme.e(-2, -2, 51));
    }

    public final void c(CharSequence charSequence) {
        this.f = charSequence;
        jia jiaVar = (jia) this.e;
        int i = 8;
        if (jiaVar != null) {
            jiaVar.animate().cancel();
            ((jia) this.e).setVisibility(8);
        }
        jia jiaVar2 = (jia) this.d;
        if (jiaVar2 == null) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            jiaVar2 = a();
            this.d = jiaVar2;
        }
        jiaVar2.animate().cancel();
        ((jia) this.d).setAlpha(1.0f);
        ((jia) this.d).setTranslationY(0.0f);
        ((jia) this.d).k(charSequence);
        jia jiaVar3 = (jia) this.d;
        if (!TextUtils.isEmpty(charSequence)) {
            i = 0;
        }
        jiaVar3.setVisibility(i);
        requestLayout();
    }

    public final void d() {
        jia[] jiaVarArr;
        pha phaVar = (pha) this.h;
        for (jia jiaVar : (jia[]) this.c) {
            if (jiaVar != null) {
                jiaVar.setTextColor(phaVar.e0);
                jiaVar.setEmojiColor(phaVar.e0);
            }
        }
        jia jiaVar2 = (jia) this.d;
        if (jiaVar2 != null) {
            jiaVar2.setTextColor(phaVar.f0);
        }
        jia jiaVar3 = (jia) this.e;
        if (jiaVar3 != null) {
            jiaVar3.setTextColor(phaVar.f0);
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
                jia jiaVar = (jia) this.d;
                if (jiaVar != null && jiaVar.getVisibility() != 8) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jia[] jiaVarArr = (jia[]) this.c;
                for (jia jiaVar2 : jiaVarArr) {
                    if (jiaVar2 != null && jiaVar2.getVisibility() != 8) {
                        if (z2) {
                            textHeight = gl.L(5.0f) + (((i6 / 2) - jiaVar2.getTextHeight()) / 2);
                        } else {
                            textHeight = (i6 - jiaVar2.getTextHeight()) / 2;
                        }
                        int measuredWidth = (i5 - jiaVar2.getMeasuredWidth()) / 2;
                        int paddingTop = textHeight - jiaVar2.getPaddingTop();
                        jiaVar2.layout(measuredWidth, paddingTop, jiaVar2.getMeasuredWidth() + measuredWidth, jiaVar2.getMeasuredHeight() + paddingTop);
                    }
                }
                if (z2) {
                    jia[] jiaVarArr2 = {(jia) this.d, (jia) this.e};
                    for (int i7 = 0; i7 < 2; i7++) {
                        jia jiaVar3 = jiaVarArr2[i7];
                        if (jiaVar3 != null && jiaVar3.getVisibility() != 8) {
                            int i8 = i6 / 2;
                            int textHeight2 = (((i8 - jiaVar3.getTextHeight()) / 2) + i8) - gl.L(2.0f);
                            int measuredWidth2 = (i5 - jiaVar3.getMeasuredWidth()) / 2;
                            jiaVar3.layout(measuredWidth2, textHeight2, jiaVar3.getMeasuredWidth() + measuredWidth2, jiaVar3.getTextHeight() + textHeight2);
                        }
                    }
                }
                int childCount = getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = getChildAt(i9);
                    if (childAt != jiaVarArr[0] && childAt != jiaVarArr[1] && childAt != ((jia) this.d) && childAt != ((jia) this.e) && childAt.getVisibility() != 8) {
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
                jia[] jiaVarArr = (jia[]) this.c;
                for (jia jiaVar : jiaVarArr) {
                    if (jiaVar != null && jiaVar.getVisibility() != 8) {
                        jiaVar.measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(jiaVar.getPaddingBottom() + jiaVar.getPaddingTop() + gl.L(24.0f), Integer.MIN_VALUE));
                    }
                }
                jia jiaVar2 = (jia) this.d;
                if (jiaVar2 != null && jiaVar2.getVisibility() != 8) {
                    ((jia) this.d).measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), Integer.MIN_VALUE));
                }
                jia jiaVar3 = (jia) this.e;
                if (jiaVar3 != null && jiaVar3.getVisibility() != 8) {
                    ((jia) this.e).measure(View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), Integer.MIN_VALUE));
                }
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if (childAt != jiaVarArr[0] && childAt != jiaVarArr[1] && childAt != ((jia) this.d) && childAt != ((jia) this.e) && childAt.getVisibility() != 8) {
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
        a68 a68Var;
        switch (this.a) {
            case 0:
                super.setTranslationX(f);
                b68 b68Var = (b68) this.h;
                a68[] a68VarArr = b68Var.n;
                if (b68Var.s && (a68Var = a68VarArr[0]) == this) {
                    b68Var.h.i(Math.abs(a68Var.getTranslationX()) / a68VarArr[0].getMeasuredWidth(), a68VarArr[1].b);
                    return;
                }
                return;
            default:
                super.setTranslationX(f);
                return;
        }
    }

    public a68(b68 b68Var, Context context) {
        super(context);
        this.h = b68Var;
    }
}

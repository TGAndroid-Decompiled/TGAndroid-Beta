package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
public final class ff9 extends ze9 implements snb {
    public final ArrayList E;
    public df9 F;
    public int G;
    public int H;
    public final li7 I;
    public final int n;
    public final vnb r;
    public final HorizontalScrollView s;
    public final LinearLayout w;
    public final ug9 x;
    public final TextView y;

    public ff9(int i, vnb vnbVar, Context context) {
        super(context);
        this.E = new ArrayList();
        this.I = new li7(this, (byte) 17);
        this.n = i;
        this.r = vnbVar;
        f(hl.L(16.0f), hl.L(4.0f), hl.L(16.0f), hl.L(4.0f));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.w = linearLayout;
        linearLayout.setOrientation(0);
        horizontalScrollView.addView(linearLayout, new FrameLayout.LayoutParams(-2, -1));
        addView(horizontalScrollView, tre.e(-1, -1, 23));
        ug9 ug9Var = new ug9(2131232047, vnbVar, context);
        ug9Var.e = (byte) 19;
        ug9Var.updateColors();
        this.x = ug9Var;
        ug9Var.setSelected(true);
        ug9Var.setContentDescription(ob6.M0(2131754479, null));
        ug9Var.setOnClickListener(new View.OnClickListener(this) {
            public final ff9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                mk0 mk0Var;
                mk0 mk0Var2;
                byte b = r2;
                ff9 ff9Var = this.b;
                switch (b) {
                    case 0:
                        df9 df9Var = ff9Var.F;
                        if (df9Var != null && (mk0Var = ff9Var.a) != null) {
                            pi9 pi9Var = ((hi9) df9Var).a;
                            pi9Var.l3(false);
                            pi9Var.p3.S(new mi9(pi9Var, mk0Var, -1), view);
                            return;
                        }
                        return;
                    default:
                        df9 df9Var2 = ff9Var.F;
                        if (df9Var2 != null && (mk0Var2 = ff9Var.a) != null) {
                            pi9 pi9Var2 = ((hi9) df9Var2).a;
                            pi9Var2.l3(false);
                            pi9Var2.p3.S(new mi9(pi9Var2, mk0Var2, -1), view);
                            return;
                        }
                        return;
                }
            }
        });
        addView(ug9Var, tre.e(38, 38, 21));
        TextView textView = new TextView(context);
        this.y = textView;
        textView.setText(ob6.M0(2131745739, null));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(hl.o());
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(hl.L(7.0f));
        textView.setPadding(hl.L(15.0f), 0, hl.L(15.0f), 0);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final ff9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                mk0 mk0Var;
                mk0 mk0Var2;
                byte b = r2;
                ff9 ff9Var = this.b;
                switch (b) {
                    case 0:
                        df9 df9Var = ff9Var.F;
                        if (df9Var != null && (mk0Var = ff9Var.a) != null) {
                            pi9 pi9Var = ((hi9) df9Var).a;
                            pi9Var.l3(false);
                            pi9Var.p3.S(new mi9(pi9Var, mk0Var, -1), view);
                            return;
                        }
                        return;
                    default:
                        df9 df9Var2 = ff9Var.F;
                        if (df9Var2 != null && (mk0Var2 = ff9Var.a) != null) {
                            pi9 pi9Var2 = ((hi9) df9Var2).a;
                            pi9Var2.l3(false);
                            pi9Var2.p3.S(new mi9(pi9Var2, mk0Var2, -1), view);
                            return;
                        }
                        return;
                }
            }
        });
        addView(textView, tre.e(-2, 38, 17));
        int i2 = aob.Fi;
        int v0 = aob.v0(i2, vnbVar);
        int v = aob.v(aob.v0(aob.d6, vnbVar), aob.p1(0.1f, v0));
        yob.X(textView, i2, vnbVar);
        textView.setBackground(aob.Z(v, aob.p1(0.16f, v0), hl.L(19.0f), hl.L(19.0f)));
        Drawable mutate = getContext().getResources().getDrawable(2131232047).mutate();
        yob.x(this, mutate, i2, vnbVar, PorterDuff.Mode.SRC_IN);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public static boolean g(View view, float f, float f2) {
        if (view.getVisibility() != 0) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        if (f >= i && f <= view.getWidth() + i) {
            int i2 = iArr[1];
            if (f2 >= i2 && f2 <= view.getHeight() + i2) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.d6));
    }

    public final void h() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff9.h():void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int L;
        int L2;
        int i4;
        int i5;
        int i6;
        int i7;
        int size = View.MeasureSpec.getSize(i);
        ArrayList arrayList = this.E;
        int size2 = arrayList.size();
        if (size2 > 0 && size2 < 8) {
            i3 = hl.L(45.0f);
        } else {
            i3 = 0;
        }
        HorizontalScrollView horizontalScrollView = this.s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) horizontalScrollView.getLayoutParams();
        if (layoutParams.rightMargin != i3) {
            layoutParams.rightMargin = i3;
            horizontalScrollView.setLayoutParams(layoutParams);
        }
        if (size2 > 0) {
            int max = Math.max(0, ((size - getPaddingLeft()) - getPaddingRight()) - i3);
            int size3 = arrayList.size();
            if (size3 != 0) {
                int i8 = size3 - 1;
                int max2 = Math.max(0, max - (hl.L(7.0f) * i8));
                int[] iArr = new int[size3];
                int i9 = 0;
                for (int i10 = 0; i10 < size3; i10++) {
                    cf9 cf9Var = (cf9) arrayList.get(i10);
                    cf9Var.getClass();
                    int max3 = Math.max(hl.L(34.0f), cf9Var.a.h());
                    iArr[i10] = max3;
                    i9 += max3;
                }
                if (i9 <= max2) {
                    boolean[] zArr = new boolean[size3];
                    int i11 = size3;
                    boolean z = true;
                    while (z && i11 > 0) {
                        int i12 = max2 / i11;
                        int i13 = i11;
                        boolean z2 = false;
                        for (int i14 = 0; i14 < size3; i14++) {
                            if (!zArr[i14] && (i7 = iArr[i14]) > i12) {
                                zArr[i14] = true;
                                max2 -= i7;
                                i13--;
                                z2 = true;
                            }
                        }
                        z = z2;
                        i11 = i13;
                    }
                    if (i11 > 0) {
                        int i15 = max2 / i11;
                        int i16 = max2 - (i11 * i15);
                        for (int i17 = 0; i17 < size3; i17++) {
                            if (!zArr[i17]) {
                                int i18 = i16 - 1;
                                if (i16 > 0) {
                                    i6 = 1;
                                } else {
                                    i6 = 0;
                                }
                                iArr[i17] = i6 + i15;
                                i16 = i18;
                            }
                        }
                    }
                } else {
                    int i19 = 0;
                    for (int i20 = 0; i20 < size3; i20++) {
                        int i21 = iArr[i20];
                        cf9 cf9Var2 = (cf9) arrayList.get(i20);
                        cf9Var2.getClass();
                        i19 += i21 - Math.max(hl.L(34.0f), cf9Var2.a.e());
                    }
                    if (i19 <= 0) {
                        for (int i22 = 0; i22 < size3; i22++) {
                            cf9 cf9Var3 = (cf9) arrayList.get(i22);
                            cf9Var3.getClass();
                            iArr[i22] = Math.max(hl.L(34.0f), cf9Var3.a.e());
                        }
                    } else {
                        int min = Math.min(i9 - max2, i19);
                        int i23 = 0;
                        int i24 = 0;
                        while (i23 < size3) {
                            int i25 = iArr[i23];
                            cf9 cf9Var4 = (cf9) arrayList.get(i23);
                            cf9Var4.getClass();
                            int max4 = i25 - Math.max(hl.L(34.0f), cf9Var4.a.e());
                            if (i23 == i8) {
                                i5 = min - i24;
                                i4 = min;
                            } else {
                                i4 = min;
                                i5 = (int) ((min * max4) / i19);
                            }
                            int min2 = Math.min(i5, max4);
                            iArr[i23] = iArr[i23] - min2;
                            i24 += min2;
                            i23++;
                            min = i4;
                        }
                    }
                }
                for (int i26 = 0; i26 < size3; i26++) {
                    cf9 cf9Var5 = (cf9) arrayList.get(i26);
                    int i27 = iArr[i26];
                    ek9 ek9Var = cf9Var5.a;
                    ek9Var.e = Math.max(hl.L(34.0f), i27);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) cf9Var5.getLayoutParams();
                    if (layoutParams2 != null) {
                        int i28 = layoutParams2.width;
                        int i29 = ek9Var.e;
                        if (i28 != i29) {
                            layoutParams2.width = i29;
                            cf9Var5.setLayoutParams(layoutParams2);
                        }
                    }
                }
            }
        }
        if (size2 > 0) {
            L = ((cf9) arrayList.get(0)).a.c();
            L2 = hl.L(8.0f);
        } else {
            L = hl.L(xea.S0 + 18);
            L2 = hl.L(8.0f);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + L2 + L;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
        setMeasuredDimension(size, paddingBottom);
    }

    @Override
    public final void updateColors() {
        this.x.updateColors();
        int i = aob.Fi;
        vnb vnbVar = this.r;
        int v0 = aob.v0(i, vnbVar);
        int i2 = aob.d6;
        int v02 = aob.v0(i2, vnbVar);
        if (v0 != this.G || v02 != this.H) {
            this.G = v0;
            this.H = v02;
            TextView textView = this.y;
            Drawable background = textView.getBackground();
            aob.F1(background, aob.v(v02, aob.p1(0.1f, v0)), false);
            aob.F1(background, aob.p1(0.16f, v0), true);
            textView.invalidate();
            li7 li7Var = this.I;
            removeCallbacks(li7Var);
            postDelayed(li7Var, 100L);
            try {
                if (getBackground() instanceof vg9) {
                    ((vg9) getBackground()).a(aob.v0(i2, vnbVar));
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }
}

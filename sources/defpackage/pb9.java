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
public final class pb9 extends jb9 implements tjb {
    public final ArrayList E;
    public nb9 F;
    public int G;
    public int H;
    public final bg7 I;
    public final int n;
    public final wjb r;
    public final HorizontalScrollView s;
    public final LinearLayout w;
    public final dd9 x;
    public final TextView y;

    public pb9(int i, wjb wjbVar, Context context) {
        super(context);
        this.E = new ArrayList();
        this.I = new bg7(this, (byte) 17);
        this.n = i;
        this.r = wjbVar;
        f(gl.L(16.0f), gl.L(4.0f), gl.L(16.0f), gl.L(4.0f));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.w = linearLayout;
        linearLayout.setOrientation(0);
        horizontalScrollView.addView(linearLayout, new FrameLayout.LayoutParams(-2, -1));
        addView(horizontalScrollView, nme.e(-1, -1, 23));
        dd9 dd9Var = new dd9(2131232047, wjbVar, context);
        dd9Var.e = (byte) 19;
        dd9Var.updateColors();
        this.x = dd9Var;
        dd9Var.setSelected(true);
        dd9Var.setContentDescription(k96.M0(2131754483, null));
        dd9Var.setOnClickListener(new View.OnClickListener(this) {
            public final pb9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                lk0 lk0Var;
                lk0 lk0Var2;
                byte b = r2;
                pb9 pb9Var = this.b;
                switch (b) {
                    case 0:
                        nb9 nb9Var = pb9Var.F;
                        if (nb9Var != null && (lk0Var = pb9Var.a) != null) {
                            ye9 ye9Var = ((qe9) nb9Var).a;
                            ye9Var.k3(false);
                            ye9Var.p3.P(new ve9(ye9Var, lk0Var, -1), view);
                            return;
                        }
                        return;
                    default:
                        nb9 nb9Var2 = pb9Var.F;
                        if (nb9Var2 != null && (lk0Var2 = pb9Var.a) != null) {
                            ye9 ye9Var2 = ((qe9) nb9Var2).a;
                            ye9Var2.k3(false);
                            ye9Var2.p3.P(new ve9(ye9Var2, lk0Var2, -1), view);
                            return;
                        }
                        return;
                }
            }
        });
        addView(dd9Var, nme.e(38, 38, 21));
        TextView textView = new TextView(context);
        this.y = textView;
        textView.setText(k96.M0(2131745819, null));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gl.o());
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(gl.L(7.0f));
        textView.setPadding(gl.L(15.0f), 0, gl.L(15.0f), 0);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final pb9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                lk0 lk0Var;
                lk0 lk0Var2;
                byte b = r2;
                pb9 pb9Var = this.b;
                switch (b) {
                    case 0:
                        nb9 nb9Var = pb9Var.F;
                        if (nb9Var != null && (lk0Var = pb9Var.a) != null) {
                            ye9 ye9Var = ((qe9) nb9Var).a;
                            ye9Var.k3(false);
                            ye9Var.p3.P(new ve9(ye9Var, lk0Var, -1), view);
                            return;
                        }
                        return;
                    default:
                        nb9 nb9Var2 = pb9Var.F;
                        if (nb9Var2 != null && (lk0Var2 = pb9Var.a) != null) {
                            ye9 ye9Var2 = ((qe9) nb9Var2).a;
                            ye9Var2.k3(false);
                            ye9Var2.p3.P(new ve9(ye9Var2, lk0Var2, -1), view);
                            return;
                        }
                        return;
                }
            }
        });
        addView(textView, nme.e(-2, 38, 17));
        int i2 = bkb.Ei;
        int v0 = bkb.v0(i2, wjbVar);
        int v = bkb.v(bkb.v0(bkb.c6, wjbVar), bkb.p1(0.1f, v0));
        zkb.X(textView, i2, wjbVar);
        textView.setBackground(bkb.Z(v, bkb.p1(0.16f, v0), gl.L(19.0f), gl.L(19.0f)));
        Drawable mutate = getContext().getResources().getDrawable(2131232047).mutate();
        zkb.x(this, mutate, i2, wjbVar, PorterDuff.Mode.SRC_IN);
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
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    public final void h() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pb9.h():void");
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
            i3 = gl.L(45.0f);
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
                int max2 = Math.max(0, max - (gl.L(7.0f) * i8));
                int[] iArr = new int[size3];
                int i9 = 0;
                for (int i10 = 0; i10 < size3; i10++) {
                    mb9 mb9Var = (mb9) arrayList.get(i10);
                    mb9Var.getClass();
                    int max3 = Math.max(gl.L(34.0f), mb9Var.a.h());
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
                        mb9 mb9Var2 = (mb9) arrayList.get(i20);
                        mb9Var2.getClass();
                        i19 += i21 - Math.max(gl.L(34.0f), mb9Var2.a.e());
                    }
                    if (i19 <= 0) {
                        for (int i22 = 0; i22 < size3; i22++) {
                            mb9 mb9Var3 = (mb9) arrayList.get(i22);
                            mb9Var3.getClass();
                            iArr[i22] = Math.max(gl.L(34.0f), mb9Var3.a.e());
                        }
                    } else {
                        int min = Math.min(i9 - max2, i19);
                        int i23 = 0;
                        int i24 = 0;
                        while (i23 < size3) {
                            int i25 = iArr[i23];
                            mb9 mb9Var4 = (mb9) arrayList.get(i23);
                            mb9Var4.getClass();
                            int max4 = i25 - Math.max(gl.L(34.0f), mb9Var4.a.e());
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
                    mb9 mb9Var5 = (mb9) arrayList.get(i26);
                    int i27 = iArr[i26];
                    og9 og9Var = mb9Var5.a;
                    og9Var.e = Math.max(gl.L(34.0f), i27);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) mb9Var5.getLayoutParams();
                    if (layoutParams2 != null) {
                        int i28 = layoutParams2.width;
                        int i29 = og9Var.e;
                        if (i28 != i29) {
                            layoutParams2.width = i29;
                            mb9Var5.setLayoutParams(layoutParams2);
                        }
                    }
                }
            }
        }
        if (size2 > 0) {
            L = ((mb9) arrayList.get(0)).a.c();
            L2 = gl.L(8.0f);
        } else {
            L = gl.L(gba.S0 + 18);
            L2 = gl.L(8.0f);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + L2 + L;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
        setMeasuredDimension(size, paddingBottom);
    }

    @Override
    public final void updateColors() {
        this.x.updateColors();
        int i = bkb.Ei;
        wjb wjbVar = this.r;
        int v0 = bkb.v0(i, wjbVar);
        int i2 = bkb.c6;
        int v02 = bkb.v0(i2, wjbVar);
        if (v0 != this.G || v02 != this.H) {
            this.G = v0;
            this.H = v02;
            TextView textView = this.y;
            Drawable background = textView.getBackground();
            bkb.F1(background, bkb.v(v02, bkb.p1(0.1f, v0)), false);
            bkb.F1(background, bkb.p1(0.16f, v0), true);
            textView.invalidate();
            bg7 bg7Var = this.I;
            removeCallbacks(bg7Var);
            postDelayed(bg7Var, 100L);
            try {
                if (getBackground() instanceof ed9) {
                    ((ed9) getBackground()).a(bkb.v0(i2, wjbVar));
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }
}

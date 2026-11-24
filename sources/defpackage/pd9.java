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
public final class pd9 extends jd9 implements vlb {
    public final ArrayList E;
    public nd9 F;
    public int G;
    public int H;
    public final ei7 I;
    public final int n;
    public final ylb r;
    public final HorizontalScrollView s;
    public final LinearLayout w;
    public final ff9 x;
    public final TextView y;

    public pd9(int i, ylb ylbVar, Context context) {
        super(context);
        this.E = new ArrayList();
        this.I = new ei7(this, (byte) 17);
        this.n = i;
        this.r = ylbVar;
        f(gm.L(16.0f), gm.L(4.0f), gm.L(16.0f), gm.L(4.0f));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.w = linearLayout;
        linearLayout.setOrientation(0);
        horizontalScrollView.addView(linearLayout, new FrameLayout.LayoutParams(-2, -1));
        addView(horizontalScrollView, qoe.e(-1, -1, 23));
        ff9 ff9Var = new ff9(2131232048, ylbVar, context);
        ff9Var.e = (byte) 19;
        ff9Var.updateColors();
        this.x = ff9Var;
        ff9Var.setSelected(true);
        ff9Var.setContentDescription(jb6.M0(2131754483, null));
        ff9Var.setOnClickListener(new View.OnClickListener(this) {
            public final pd9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                ll0 ll0Var;
                ll0 ll0Var2;
                byte b = r2;
                pd9 pd9Var = this.b;
                switch (b) {
                    case 0:
                        nd9 nd9Var = pd9Var.F;
                        if (nd9Var != null && (ll0Var = pd9Var.a) != null) {
                            ch9 ch9Var = ((ug9) nd9Var).a;
                            ch9Var.k3(false);
                            ch9Var.p3.I(new zg9(ch9Var, ll0Var, -1), view);
                            return;
                        }
                        return;
                    default:
                        nd9 nd9Var2 = pd9Var.F;
                        if (nd9Var2 != null && (ll0Var2 = pd9Var.a) != null) {
                            ch9 ch9Var2 = ((ug9) nd9Var2).a;
                            ch9Var2.k3(false);
                            ch9Var2.p3.I(new zg9(ch9Var2, ll0Var2, -1), view);
                            return;
                        }
                        return;
                }
            }
        });
        addView(ff9Var, qoe.e(38, 38, 21));
        TextView textView = new TextView(context);
        this.y = textView;
        textView.setText(jb6.M0(2131745745, null));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gm.o());
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(gm.L(7.0f));
        textView.setPadding(gm.L(15.0f), 0, gm.L(15.0f), 0);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final pd9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                ll0 ll0Var;
                ll0 ll0Var2;
                byte b = r2;
                pd9 pd9Var = this.b;
                switch (b) {
                    case 0:
                        nd9 nd9Var = pd9Var.F;
                        if (nd9Var != null && (ll0Var = pd9Var.a) != null) {
                            ch9 ch9Var = ((ug9) nd9Var).a;
                            ch9Var.k3(false);
                            ch9Var.p3.I(new zg9(ch9Var, ll0Var, -1), view);
                            return;
                        }
                        return;
                    default:
                        nd9 nd9Var2 = pd9Var.F;
                        if (nd9Var2 != null && (ll0Var2 = pd9Var.a) != null) {
                            ch9 ch9Var2 = ((ug9) nd9Var2).a;
                            ch9Var2.k3(false);
                            ch9Var2.p3.I(new zg9(ch9Var2, ll0Var2, -1), view);
                            return;
                        }
                        return;
                }
            }
        });
        addView(textView, qoe.e(-2, 38, 17));
        int i2 = cmb.Ei;
        int v0 = cmb.v0(i2, ylbVar);
        int v = cmb.v(cmb.v0(cmb.c6, ylbVar), cmb.p1(0.1f, v0));
        anb.X(textView, i2, ylbVar);
        textView.setBackground(cmb.Z(v, cmb.p1(0.16f, v0), gm.L(19.0f), gm.L(19.0f)));
        Drawable mutate = getContext().getResources().getDrawable(2131232048).mutate();
        anb.x(this, mutate, i2, ylbVar, PorterDuff.Mode.SRC_IN);
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
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    public final void h() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pd9.h():void");
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
            i3 = gm.L(45.0f);
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
                int max2 = Math.max(0, max - (gm.L(7.0f) * i8));
                int[] iArr = new int[size3];
                int i9 = 0;
                for (int i10 = 0; i10 < size3; i10++) {
                    md9 md9Var = (md9) arrayList.get(i10);
                    md9Var.getClass();
                    int max3 = Math.max(gm.L(34.0f), md9Var.a.i());
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
                        md9 md9Var2 = (md9) arrayList.get(i20);
                        md9Var2.getClass();
                        i19 += i21 - Math.max(gm.L(34.0f), md9Var2.a.f());
                    }
                    if (i19 <= 0) {
                        for (int i22 = 0; i22 < size3; i22++) {
                            md9 md9Var3 = (md9) arrayList.get(i22);
                            md9Var3.getClass();
                            iArr[i22] = Math.max(gm.L(34.0f), md9Var3.a.f());
                        }
                    } else {
                        int min = Math.min(i9 - max2, i19);
                        int i23 = 0;
                        int i24 = 0;
                        while (i23 < size3) {
                            int i25 = iArr[i23];
                            md9 md9Var4 = (md9) arrayList.get(i23);
                            md9Var4.getClass();
                            int max4 = i25 - Math.max(gm.L(34.0f), md9Var4.a.f());
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
                    md9 md9Var5 = (md9) arrayList.get(i26);
                    int i27 = iArr[i26];
                    ri9 ri9Var = md9Var5.a;
                    ri9Var.e = Math.max(gm.L(34.0f), i27);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) md9Var5.getLayoutParams();
                    if (layoutParams2 != null) {
                        int i28 = layoutParams2.width;
                        int i29 = ri9Var.e;
                        if (i28 != i29) {
                            layoutParams2.width = i29;
                            md9Var5.setLayoutParams(layoutParams2);
                        }
                    }
                }
            }
        }
        if (size2 > 0) {
            L = ((md9) arrayList.get(0)).a.d();
            L2 = gm.L(8.0f);
        } else {
            L = gm.L(gda.S0 + 18);
            L2 = gm.L(8.0f);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + L2 + L;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
        setMeasuredDimension(size, paddingBottom);
    }

    @Override
    public final void updateColors() {
        this.x.updateColors();
        int i = cmb.Ei;
        ylb ylbVar = this.r;
        int v0 = cmb.v0(i, ylbVar);
        int i2 = cmb.c6;
        int v02 = cmb.v0(i2, ylbVar);
        if (v0 != this.G || v02 != this.H) {
            this.G = v0;
            this.H = v02;
            TextView textView = this.y;
            Drawable background = textView.getBackground();
            cmb.F1(background, cmb.v(v02, cmb.p1(0.1f, v0)), false);
            cmb.F1(background, cmb.p1(0.16f, v0), true);
            textView.invalidate();
            ei7 ei7Var = this.I;
            removeCallbacks(ei7Var);
            postDelayed(ei7Var, 100L);
            try {
                if (getBackground() instanceof gf9) {
                    ((gf9) getBackground()).a(cmb.v0(i2, ylbVar));
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }
}

package li;

import a8.ra;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.gu;
import org.telegram.messenger.hd;
import org.telegram.messenger.iz;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
public final class f0 extends y implements org.telegram.ui.ActionBar.a6 {
    public final ArrayList D;
    public d0 E;
    public int F;
    public int G;
    public final ra H;
    public final int f18549n;
    public final f6 f18550r;
    public final HorizontalScrollView f18551s;
    public final LinearLayout f18552w;
    public final x1 f18553x;
    public final TextView f18554y;

    public f0(int i7, Context context, f6 f6Var) {
        super(context);
        this.D = new ArrayList();
        this.H = new ra(this, 28);
        this.f18549n = i7;
        this.f18550r = f6Var;
        f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f18551s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f18552w = linearLayout;
        linearLayout.setOrientation(0);
        horizontalScrollView.addView(linearLayout, new FrameLayout.LayoutParams(-2, -1));
        addView(horizontalScrollView, ha.e(-1, -1, 23));
        x1 x1Var = new x1(2131232042, context, f6Var);
        x1Var.f18976e = 19;
        x1Var.updateColors();
        this.f18553x = x1Var;
        x1Var.setSelected(true);
        x1Var.setContentDescription(hd.M0(2131754486, null));
        x1Var.setOnClickListener(new View.OnClickListener(this) {
            public final f0 f18436b;

            {
                this.f18436b = this;
            }

            @Override
            public final void onClick(View view) {
                a aVar;
                a aVar2;
                switch (r2) {
                    case 0:
                        f0 f0Var = this.f18436b;
                        d0 d0Var = f0Var.E;
                        if (d0Var != null && (aVar = f0Var.f18986a) != null) {
                            t3 t3Var = ((l3) d0Var).f18686a;
                            t3Var.r3(false);
                            t3Var.f18887o3.z(new q3(t3Var, aVar, -1), view);
                            return;
                        }
                        return;
                    default:
                        f0 f0Var2 = this.f18436b;
                        d0 d0Var2 = f0Var2.E;
                        if (d0Var2 != null && (aVar2 = f0Var2.f18986a) != null) {
                            t3 t3Var2 = ((l3) d0Var2).f18686a;
                            t3Var2.r3(false);
                            t3Var2.f18887o3.z(new q3(t3Var2, aVar2, -1), view);
                            return;
                        }
                        return;
                }
            }
        });
        addView(x1Var, ha.e(38, 38, 21));
        TextView textView = new TextView(context);
        this.f18554y = textView;
        textView.setText(hd.M0(2131746013, null));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(7.0f));
        textView.setPadding(org.telegram.messenger.g0.L(15.0f), 0, org.telegram.messenger.g0.L(15.0f), 0);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final f0 f18436b;

            {
                this.f18436b = this;
            }

            @Override
            public final void onClick(View view) {
                a aVar;
                a aVar2;
                switch (r2) {
                    case 0:
                        f0 f0Var = this.f18436b;
                        d0 d0Var = f0Var.E;
                        if (d0Var != null && (aVar = f0Var.f18986a) != null) {
                            t3 t3Var = ((l3) d0Var).f18686a;
                            t3Var.r3(false);
                            t3Var.f18887o3.z(new q3(t3Var, aVar, -1), view);
                            return;
                        }
                        return;
                    default:
                        f0 f0Var2 = this.f18436b;
                        d0 d0Var2 = f0Var2.E;
                        if (d0Var2 != null && (aVar2 = f0Var2.f18986a) != null) {
                            t3 t3Var2 = ((l3) d0Var2).f18686a;
                            t3Var2.r3(false);
                            t3Var2.f18887o3.z(new q3(t3Var2, aVar2, -1), view);
                            return;
                        }
                        return;
                }
            }
        });
        addView(textView, ha.e(-2, 38, 17));
        int i10 = k6.Ci;
        int w02 = k6.w0(i10, f6Var);
        int w10 = k6.w(k6.w0(k6.f27848d6, f6Var), k6.r1(0.1f, w02));
        r6.V(textView, i10, f6Var);
        textView.setBackground(k6.b0(w10, k6.r1(0.16f, w02), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(19.0f)));
        Drawable mutate = getContext().getResources().getDrawable(2131232042).mutate();
        r6.y(this, mutate, i10, f6Var, PorterDuff.Mode.SRC_IN);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public static boolean g(View view, float f10, float f11) {
        if (view.getVisibility() != 0) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i7 = iArr[0];
        if (f10 >= i7 && f10 <= view.getWidth() + i7) {
            int i10 = iArr[1];
            if (f11 >= i10 && f11 <= view.getHeight() + i10) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.f27848d6));
    }

    public final void h() {
        throw new UnsupportedOperationException("Method not decompiled: li.f0.h():void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int L;
        int L2;
        int i12;
        int i13;
        int i14;
        int i15;
        int size = View.MeasureSpec.getSize(i7);
        ArrayList arrayList = this.D;
        int size2 = arrayList.size();
        if (size2 > 0 && size2 < 8) {
            i11 = org.telegram.messenger.g0.L(45.0f);
        } else {
            i11 = 0;
        }
        HorizontalScrollView horizontalScrollView = this.f18551s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) horizontalScrollView.getLayoutParams();
        if (layoutParams.rightMargin != i11) {
            layoutParams.rightMargin = i11;
            horizontalScrollView.setLayoutParams(layoutParams);
        }
        if (size2 > 0) {
            int max = Math.max(0, ((size - getPaddingLeft()) - getPaddingRight()) - i11);
            int size3 = arrayList.size();
            if (size3 != 0) {
                int i16 = size3 - 1;
                int max2 = Math.max(0, max - (org.telegram.messenger.g0.L(7.0f) * i16));
                int[] iArr = new int[size3];
                int i17 = 0;
                for (int i18 = 0; i18 < size3; i18++) {
                    c0 c0Var = (c0) arrayList.get(i18);
                    c0Var.getClass();
                    int max3 = Math.max(org.telegram.messenger.g0.L(34.0f), c0Var.f18491a.h());
                    iArr[i18] = max3;
                    i17 += max3;
                }
                if (i17 <= max2) {
                    boolean[] zArr = new boolean[size3];
                    int i19 = size3;
                    boolean z9 = true;
                    while (z9 && i19 > 0) {
                        int i20 = max2 / i19;
                        int i21 = i19;
                        boolean z10 = false;
                        for (int i22 = 0; i22 < size3; i22++) {
                            if (!zArr[i22] && (i15 = iArr[i22]) > i20) {
                                zArr[i22] = true;
                                max2 -= i15;
                                i21--;
                                z10 = true;
                            }
                        }
                        z9 = z10;
                        i19 = i21;
                    }
                    if (i19 > 0) {
                        int i23 = max2 / i19;
                        int i24 = max2 - (i19 * i23);
                        for (int i25 = 0; i25 < size3; i25++) {
                            if (!zArr[i25]) {
                                int i26 = i24 - 1;
                                if (i24 > 0) {
                                    i14 = 1;
                                } else {
                                    i14 = 0;
                                }
                                iArr[i25] = i14 + i23;
                                i24 = i26;
                            }
                        }
                    }
                } else {
                    int i27 = 0;
                    for (int i28 = 0; i28 < size3; i28++) {
                        int i29 = iArr[i28];
                        c0 c0Var2 = (c0) arrayList.get(i28);
                        c0Var2.getClass();
                        i27 += i29 - Math.max(org.telegram.messenger.g0.L(34.0f), c0Var2.f18491a.e());
                    }
                    if (i27 <= 0) {
                        for (int i30 = 0; i30 < size3; i30++) {
                            c0 c0Var3 = (c0) arrayList.get(i30);
                            c0Var3.getClass();
                            iArr[i30] = Math.max(org.telegram.messenger.g0.L(34.0f), c0Var3.f18491a.e());
                        }
                    } else {
                        int min = Math.min(i17 - max2, i27);
                        int i31 = 0;
                        int i32 = 0;
                        while (i31 < size3) {
                            int i33 = iArr[i31];
                            c0 c0Var4 = (c0) arrayList.get(i31);
                            c0Var4.getClass();
                            int max4 = i33 - Math.max(org.telegram.messenger.g0.L(34.0f), c0Var4.f18491a.e());
                            if (i31 == i16) {
                                i13 = min - i32;
                                i12 = min;
                            } else {
                                i12 = min;
                                i13 = (int) ((min * max4) / i27);
                            }
                            int min2 = Math.min(i13, max4);
                            iArr[i31] = iArr[i31] - min2;
                            i32 += min2;
                            i31++;
                            min = i12;
                        }
                    }
                }
                for (int i34 = 0; i34 < size3; i34++) {
                    c0 c0Var5 = (c0) arrayList.get(i34);
                    int i35 = iArr[i34];
                    gu guVar = c0Var5.f18491a;
                    guVar.f22701e = Math.max(org.telegram.messenger.g0.L(34.0f), i35);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) c0Var5.getLayoutParams();
                    if (layoutParams2 != null) {
                        int i36 = layoutParams2.width;
                        int i37 = guVar.f22701e;
                        if (i36 != i37) {
                            layoutParams2.width = i37;
                            c0Var5.setLayoutParams(layoutParams2);
                        }
                    }
                }
            }
        }
        if (size2 > 0) {
            L = ((c0) arrayList.get(0)).f18491a.c();
            L2 = org.telegram.messenger.g0.L(8.0f);
        } else {
            L = org.telegram.messenger.g0.L(iz.W0 + 18);
            L2 = org.telegram.messenger.g0.L(8.0f);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + L2 + L;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
        setMeasuredDimension(size, paddingBottom);
    }

    @Override
    public final void updateColors() {
        this.f18553x.updateColors();
        int i7 = k6.Ci;
        f6 f6Var = this.f18550r;
        int w02 = k6.w0(i7, f6Var);
        int i10 = k6.f27848d6;
        int w03 = k6.w0(i10, f6Var);
        if (w02 != this.F || w03 != this.G) {
            this.F = w02;
            this.G = w03;
            TextView textView = this.f18554y;
            Drawable background = textView.getBackground();
            k6.H1(background, k6.w(w03, k6.r1(0.1f, w02)), false);
            k6.H1(background, k6.r1(0.16f, w02), true);
            textView.invalidate();
            ra raVar = this.H;
            removeCallbacks(raVar);
            postDelayed(raVar, 100L);
            try {
                if (getBackground() instanceof y1) {
                    ((y1) getBackground()).a(k6.w0(i10, f6Var));
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }
}

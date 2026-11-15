package oi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.du;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
public final class d0 extends x implements org.telegram.ui.ActionBar.z5 {
    public final ArrayList E;
    public b0 F;
    public int G;
    public int H;
    public final j6.o I;
    public final int f21626n;
    public final e6 f21627r;
    public final HorizontalScrollView f21628s;
    public final LinearLayout f21629w;
    public final v1 f21630x;
    public final TextView f21631y;

    public d0(int i7, Context context, e6 e6Var) {
        super(context);
        this.E = new ArrayList();
        this.I = new j6.o(this, 6);
        this.f21626n = i7;
        this.f21627r = e6Var;
        f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f21628s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f21629w = linearLayout;
        linearLayout.setOrientation(0);
        horizontalScrollView.addView(linearLayout, new FrameLayout.LayoutParams(-2, -1));
        addView(horizontalScrollView, ja.e(-1, -1, 23));
        v1 v1Var = new v1(2131232043, context, e6Var);
        v1Var.f22049e = 19;
        v1Var.updateColors();
        this.f21630x = v1Var;
        v1Var.setSelected(true);
        v1Var.setContentDescription(hd.M0(2131754486, null));
        v1Var.setOnClickListener(new View.OnClickListener(this) {
            public final d0 f22153b;

            {
                this.f22153b = this;
            }

            @Override
            public final void onClick(View view) {
                a aVar;
                a aVar2;
                switch (r2) {
                    case 0:
                        d0 d0Var = this.f22153b;
                        b0 b0Var = d0Var.F;
                        if (b0Var != null && (aVar = d0Var.f22106a) != null) {
                            q3 q3Var = ((i3) b0Var).f21739a;
                            q3Var.r3(false);
                            q3Var.f21931p3.n(new n3(q3Var, aVar, -1), view);
                            return;
                        }
                        return;
                    default:
                        d0 d0Var2 = this.f22153b;
                        b0 b0Var2 = d0Var2.F;
                        if (b0Var2 != null && (aVar2 = d0Var2.f22106a) != null) {
                            q3 q3Var2 = ((i3) b0Var2).f21739a;
                            q3Var2.r3(false);
                            q3Var2.f21931p3.n(new n3(q3Var2, aVar2, -1), view);
                            return;
                        }
                        return;
                }
            }
        });
        addView(v1Var, ja.e(38, 38, 21));
        TextView textView = new TextView(context);
        this.f21631y = textView;
        textView.setText(hd.M0(2131746012, null));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(7.0f));
        textView.setPadding(org.telegram.messenger.g0.L(15.0f), 0, org.telegram.messenger.g0.L(15.0f), 0);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final d0 f22153b;

            {
                this.f22153b = this;
            }

            @Override
            public final void onClick(View view) {
                a aVar;
                a aVar2;
                switch (r2) {
                    case 0:
                        d0 d0Var = this.f22153b;
                        b0 b0Var = d0Var.F;
                        if (b0Var != null && (aVar = d0Var.f22106a) != null) {
                            q3 q3Var = ((i3) b0Var).f21739a;
                            q3Var.r3(false);
                            q3Var.f21931p3.n(new n3(q3Var, aVar, -1), view);
                            return;
                        }
                        return;
                    default:
                        d0 d0Var2 = this.f22153b;
                        b0 b0Var2 = d0Var2.F;
                        if (b0Var2 != null && (aVar2 = d0Var2.f22106a) != null) {
                            q3 q3Var2 = ((i3) b0Var2).f21739a;
                            q3Var2.r3(false);
                            q3Var2.f21931p3.n(new n3(q3Var2, aVar2, -1), view);
                            return;
                        }
                        return;
                }
            }
        });
        addView(textView, ja.e(-2, 38, 17));
        int i10 = j6.Fi;
        int w02 = j6.w0(i10, e6Var);
        int w10 = j6.w(j6.w0(j6.f28849d6, e6Var), j6.r1(0.1f, w02));
        q6.U(textView, i10, e6Var);
        textView.setBackground(j6.b0(w10, j6.r1(0.16f, w02), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(19.0f)));
        Drawable mutate = getContext().getResources().getDrawable(2131232043).mutate();
        q6.x(this, mutate, i10, e6Var, PorterDuff.Mode.SRC_IN);
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
        hashSet.add(Integer.valueOf(j6.f28849d6));
    }

    public final void h() {
        throw new UnsupportedOperationException("Method not decompiled: oi.d0.h():void");
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
        ArrayList arrayList = this.E;
        int size2 = arrayList.size();
        if (size2 > 0 && size2 < 8) {
            i11 = org.telegram.messenger.g0.L(45.0f);
        } else {
            i11 = 0;
        }
        HorizontalScrollView horizontalScrollView = this.f21628s;
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
                    a0 a0Var = (a0) arrayList.get(i18);
                    a0Var.getClass();
                    int max3 = Math.max(org.telegram.messenger.g0.L(34.0f), a0Var.f21561a.h());
                    iArr[i18] = max3;
                    i17 += max3;
                }
                if (i17 <= max2) {
                    boolean[] zArr = new boolean[size3];
                    int i19 = size3;
                    boolean z10 = true;
                    while (z10 && i19 > 0) {
                        int i20 = max2 / i19;
                        int i21 = i19;
                        boolean z11 = false;
                        for (int i22 = 0; i22 < size3; i22++) {
                            if (!zArr[i22] && (i15 = iArr[i22]) > i20) {
                                zArr[i22] = true;
                                max2 -= i15;
                                i21--;
                                z11 = true;
                            }
                        }
                        z10 = z11;
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
                        a0 a0Var2 = (a0) arrayList.get(i28);
                        a0Var2.getClass();
                        i27 += i29 - Math.max(org.telegram.messenger.g0.L(34.0f), a0Var2.f21561a.e());
                    }
                    if (i27 <= 0) {
                        for (int i30 = 0; i30 < size3; i30++) {
                            a0 a0Var3 = (a0) arrayList.get(i30);
                            a0Var3.getClass();
                            iArr[i30] = Math.max(org.telegram.messenger.g0.L(34.0f), a0Var3.f21561a.e());
                        }
                    } else {
                        int min = Math.min(i17 - max2, i27);
                        int i31 = 0;
                        int i32 = 0;
                        while (i31 < size3) {
                            int i33 = iArr[i31];
                            a0 a0Var4 = (a0) arrayList.get(i31);
                            a0Var4.getClass();
                            int max4 = i33 - Math.max(org.telegram.messenger.g0.L(34.0f), a0Var4.f21561a.e());
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
                    a0 a0Var5 = (a0) arrayList.get(i34);
                    int i35 = iArr[i34];
                    du duVar = a0Var5.f21561a;
                    duVar.f23137e = Math.max(org.telegram.messenger.g0.L(34.0f), i35);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) a0Var5.getLayoutParams();
                    if (layoutParams2 != null) {
                        int i36 = layoutParams2.width;
                        int i37 = duVar.f23137e;
                        if (i36 != i37) {
                            layoutParams2.width = i37;
                            a0Var5.setLayoutParams(layoutParams2);
                        }
                    }
                }
            }
        }
        if (size2 > 0) {
            L = ((a0) arrayList.get(0)).f21561a.c();
            L2 = org.telegram.messenger.g0.L(8.0f);
        } else {
            L = org.telegram.messenger.g0.L(gz.W0 + 18);
            L2 = org.telegram.messenger.g0.L(8.0f);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + L2 + L;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
        setMeasuredDimension(size, paddingBottom);
    }

    @Override
    public final void updateColors() {
        this.f21630x.updateColors();
        int i7 = j6.Fi;
        e6 e6Var = this.f21627r;
        int w02 = j6.w0(i7, e6Var);
        int i10 = j6.f28849d6;
        int w03 = j6.w0(i10, e6Var);
        if (w02 != this.G || w03 != this.H) {
            this.G = w02;
            this.H = w03;
            TextView textView = this.f21631y;
            Drawable background = textView.getBackground();
            j6.H1(background, j6.w(w03, j6.r1(0.1f, w02)), false);
            j6.H1(background, j6.r1(0.16f, w02), true);
            textView.invalidate();
            j6.o oVar = this.I;
            removeCallbacks(oVar);
            postDelayed(oVar, 100L);
            try {
                if (getBackground() instanceof w1) {
                    ((w1) getBackground()).a(j6.w0(i10, e6Var));
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }
}

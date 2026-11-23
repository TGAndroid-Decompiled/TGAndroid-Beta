package oi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.au;
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
public final class e0 extends y implements org.telegram.ui.ActionBar.c6 {
    public final ArrayList E;
    public c0 F;
    public int G;
    public int H;
    public final i6.g I;
    public final int f22130n;
    public final i6 f22131r;
    public final HorizontalScrollView f22132s;
    public final LinearLayout f22133w;
    public final x1 f22134x;
    public final TextView f22135y;

    public e0(int i7, Context context, i6 i6Var) {
        super(context);
        this.E = new ArrayList();
        this.I = new i6.g(this, 7);
        this.f22130n = i7;
        this.f22131r = i6Var;
        f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f22132s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f22133w = linearLayout;
        linearLayout.setOrientation(0);
        horizontalScrollView.addView(linearLayout, new FrameLayout.LayoutParams(-2, -1));
        addView(horizontalScrollView, na.e(-1, -1, 23));
        x1 x1Var = new x1(2131232047, context, i6Var);
        x1Var.f22588e = 19;
        x1Var.updateColors();
        this.f22134x = x1Var;
        x1Var.setSelected(true);
        x1Var.setContentDescription(gd.N0(2131754483, null));
        x1Var.setOnClickListener(new View.OnClickListener(this) {
            public final e0 f22019b;

            {
                this.f22019b = this;
            }

            @Override
            public final void onClick(View view) {
                a aVar;
                a aVar2;
                switch (r2) {
                    case 0:
                        e0 e0Var = this.f22019b;
                        c0 c0Var = e0Var.F;
                        if (c0Var != null && (aVar = e0Var.f22598a) != null) {
                            t3 t3Var = ((l3) c0Var).f22292a;
                            t3Var.r3(false);
                            t3Var.f22495p3.c(new q3(t3Var, aVar, -1), view);
                            return;
                        }
                        return;
                    default:
                        e0 e0Var2 = this.f22019b;
                        c0 c0Var2 = e0Var2.F;
                        if (c0Var2 != null && (aVar2 = e0Var2.f22598a) != null) {
                            t3 t3Var2 = ((l3) c0Var2).f22292a;
                            t3Var2.r3(false);
                            t3Var2.f22495p3.c(new q3(t3Var2, aVar2, -1), view);
                            return;
                        }
                        return;
                }
            }
        });
        addView(x1Var, na.e(38, 38, 21));
        TextView textView = new TextView(context);
        this.f22135y = textView;
        textView.setText(gd.N0(2131745816, null));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(7.0f));
        textView.setPadding(org.telegram.messenger.g0.L(15.0f), 0, org.telegram.messenger.g0.L(15.0f), 0);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final e0 f22019b;

            {
                this.f22019b = this;
            }

            @Override
            public final void onClick(View view) {
                a aVar;
                a aVar2;
                switch (r2) {
                    case 0:
                        e0 e0Var = this.f22019b;
                        c0 c0Var = e0Var.F;
                        if (c0Var != null && (aVar = e0Var.f22598a) != null) {
                            t3 t3Var = ((l3) c0Var).f22292a;
                            t3Var.r3(false);
                            t3Var.f22495p3.c(new q3(t3Var, aVar, -1), view);
                            return;
                        }
                        return;
                    default:
                        e0 e0Var2 = this.f22019b;
                        c0 c0Var2 = e0Var2.F;
                        if (c0Var2 != null && (aVar2 = e0Var2.f22598a) != null) {
                            t3 t3Var2 = ((l3) c0Var2).f22292a;
                            t3Var2.r3(false);
                            t3Var2.f22495p3.c(new q3(t3Var2, aVar2, -1), view);
                            return;
                        }
                        return;
                }
            }
        });
        addView(textView, na.e(-2, 38, 17));
        int i10 = n6.Fi;
        int w02 = n6.w0(i10, i6Var);
        int w10 = n6.w(n6.w0(n6.f29451d6, i6Var), n6.r1(0.1f, w02));
        u6.U(textView, i10, i6Var);
        textView.setBackground(n6.b0(w10, n6.r1(0.16f, w02), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(19.0f)));
        Drawable mutate = getContext().getResources().getDrawable(2131232047).mutate();
        u6.x(this, mutate, i10, i6Var, PorterDuff.Mode.SRC_IN);
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
        hashSet.add(Integer.valueOf(n6.f29451d6));
    }

    public final void h() {
        throw new UnsupportedOperationException("Method not decompiled: oi.e0.h():void");
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
        HorizontalScrollView horizontalScrollView = this.f22132s;
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
                    b0 b0Var = (b0) arrayList.get(i18);
                    b0Var.getClass();
                    int max3 = Math.max(org.telegram.messenger.g0.L(34.0f), b0Var.f22047a.i());
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
                        b0 b0Var2 = (b0) arrayList.get(i28);
                        b0Var2.getClass();
                        i27 += i29 - Math.max(org.telegram.messenger.g0.L(34.0f), b0Var2.f22047a.f());
                    }
                    if (i27 <= 0) {
                        for (int i30 = 0; i30 < size3; i30++) {
                            b0 b0Var3 = (b0) arrayList.get(i30);
                            b0Var3.getClass();
                            iArr[i30] = Math.max(org.telegram.messenger.g0.L(34.0f), b0Var3.f22047a.f());
                        }
                    } else {
                        int min = Math.min(i17 - max2, i27);
                        int i31 = 0;
                        int i32 = 0;
                        while (i31 < size3) {
                            int i33 = iArr[i31];
                            b0 b0Var4 = (b0) arrayList.get(i31);
                            b0Var4.getClass();
                            int max4 = i33 - Math.max(org.telegram.messenger.g0.L(34.0f), b0Var4.f22047a.f());
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
                    b0 b0Var5 = (b0) arrayList.get(i34);
                    int i35 = iArr[i34];
                    au auVar = b0Var5.f22047a;
                    auVar.f23060e = Math.max(org.telegram.messenger.g0.L(34.0f), i35);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) b0Var5.getLayoutParams();
                    if (layoutParams2 != null) {
                        int i36 = layoutParams2.width;
                        int i37 = auVar.f23060e;
                        if (i36 != i37) {
                            layoutParams2.width = i37;
                            b0Var5.setLayoutParams(layoutParams2);
                        }
                    }
                }
            }
        }
        if (size2 > 0) {
            L = ((b0) arrayList.get(0)).f22047a.d();
            L2 = org.telegram.messenger.g0.L(8.0f);
        } else {
            L = org.telegram.messenger.g0.L(bz.W0 + 18);
            L2 = org.telegram.messenger.g0.L(8.0f);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + L2 + L;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
        setMeasuredDimension(size, paddingBottom);
    }

    @Override
    public final void updateColors() {
        this.f22134x.updateColors();
        int i7 = n6.Fi;
        i6 i6Var = this.f22131r;
        int w02 = n6.w0(i7, i6Var);
        int i10 = n6.f29451d6;
        int w03 = n6.w0(i10, i6Var);
        if (w02 != this.G || w03 != this.H) {
            this.G = w02;
            this.H = w03;
            TextView textView = this.f22135y;
            Drawable background = textView.getBackground();
            n6.H1(background, n6.w(w03, n6.r1(0.1f, w02)), false);
            n6.H1(background, n6.r1(0.16f, w02), true);
            textView.invalidate();
            i6.g gVar = this.I;
            removeCallbacks(gVar);
            postDelayed(gVar, 100L);
            try {
                if (getBackground() instanceof y1) {
                    ((y1) getBackground()).a(n6.w0(i10, i6Var));
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }
}

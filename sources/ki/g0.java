package ki;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
public final class g0 extends a0 implements org.telegram.ui.ActionBar.b6 {
    public e0 E;
    public int F;
    public int G;
    public final androidx.activity.i H;
    public final int f15329n;
    public final org.telegram.ui.ActionBar.g6 f15330r;
    public final HorizontalScrollView f15331s;
    public final LinearLayout v;
    public final z1 f15332w;
    public final TextView f15333x;
    public final ArrayList f15334y;

    public g0(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f15334y = new ArrayList();
        this.H = new androidx.activity.i(this, 23);
        this.f15329n = i10;
        this.f15330r = g6Var;
        f(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f15331s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        linearLayout.setOrientation(0);
        horizontalScrollView.addView(linearLayout, new FrameLayout.LayoutParams(-2, -1));
        addView(horizontalScrollView, w7.z5.e(-1, -1, 23));
        z1 z1Var = new z1(context, R.drawable.msg_add, g6Var);
        z1Var.e = 19;
        z1Var.updateColors();
        this.f15332w = z1Var;
        z1Var.setSelected(true);
        z1Var.setContentDescription(LocaleController.getString(R.string.Add));
        z1Var.setOnClickListener(new View.OnClickListener(this) {
            public final g0 f15225b;

            {
                this.f15225b = this;
            }

            @Override
            public final void onClick(View view) {
                a aVar;
                a aVar2;
                switch (r2) {
                    case 0:
                        g0 g0Var = this.f15225b;
                        e0 e0Var = g0Var.E;
                        if (e0Var != null && (aVar = g0Var.f15157a) != null) {
                            w3 w3Var = ((o3) e0Var).f15483a;
                            w3Var.u3(false);
                            w3Var.f15656i3.n(new t3(w3Var, aVar, -1), view);
                            return;
                        }
                        return;
                    default:
                        g0 g0Var2 = this.f15225b;
                        e0 e0Var2 = g0Var2.E;
                        if (e0Var2 != null && (aVar2 = g0Var2.f15157a) != null) {
                            w3 w3Var2 = ((o3) e0Var2).f15483a;
                            w3Var2.u3(false);
                            w3Var2.f15656i3.n(new t3(w3Var2, aVar2, -1), view);
                            return;
                        }
                        return;
                }
            }
        });
        addView(z1Var, w7.z5.e(38, 38, 21));
        TextView textView = new TextView(context);
        this.f15333x = textView;
        textView.setText(LocaleController.getString(R.string.RichEditorAddButton));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(7.0f));
        textView.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final g0 f15225b;

            {
                this.f15225b = this;
            }

            @Override
            public final void onClick(View view) {
                a aVar;
                a aVar2;
                switch (r2) {
                    case 0:
                        g0 g0Var = this.f15225b;
                        e0 e0Var = g0Var.E;
                        if (e0Var != null && (aVar = g0Var.f15157a) != null) {
                            w3 w3Var = ((o3) e0Var).f15483a;
                            w3Var.u3(false);
                            w3Var.f15656i3.n(new t3(w3Var, aVar, -1), view);
                            return;
                        }
                        return;
                    default:
                        g0 g0Var2 = this.f15225b;
                        e0 e0Var2 = g0Var2.E;
                        if (e0Var2 != null && (aVar2 = g0Var2.f15157a) != null) {
                            w3 w3Var2 = ((o3) e0Var2).f15483a;
                            w3Var2.u3(false);
                            w3Var2.f15656i3.n(new t3(w3Var2, aVar2, -1), view);
                            return;
                        }
                        return;
                }
            }
        });
        addView(textView, w7.z5.e(-2, 38, 17));
        int i11 = k6.Oh;
        int w02 = k6.w0(i11, g6Var);
        int v = k6.v(k6.w0(k6.f21183d6, g6Var), k6.o1(0.1f, w02));
        r6.W(textView, i11, g6Var);
        textView.setBackground(k6.a0(v, k6.o1(0.16f, w02), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f)));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_add).mutate();
        r6.z(this, mutate, i11, g6Var, PorterDuff.Mode.SRC_IN);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public static boolean g(View view, float f7, float f10) {
        if (view.getVisibility() != 0) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        if (f7 >= i10 && f7 <= view.getWidth() + i10) {
            int i11 = iArr[1];
            if (f10 >= i11 && f10 <= view.getHeight() + i11) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.f21183d6));
    }

    public final void h() {
        throw new UnsupportedOperationException("Method not decompiled: ki.g0.h():void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int dp;
        int dp2;
        int i13;
        int i14;
        int i15;
        int i16;
        int size = View.MeasureSpec.getSize(i10);
        ArrayList arrayList = this.f15334y;
        int size2 = arrayList.size();
        if (size2 > 0 && size2 < 8) {
            i12 = AndroidUtilities.dp(45.0f);
        } else {
            i12 = 0;
        }
        HorizontalScrollView horizontalScrollView = this.f15331s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) horizontalScrollView.getLayoutParams();
        if (layoutParams.rightMargin != i12) {
            layoutParams.rightMargin = i12;
            horizontalScrollView.setLayoutParams(layoutParams);
        }
        if (size2 > 0) {
            int max = Math.max(0, ((size - getPaddingLeft()) - getPaddingRight()) - i12);
            int size3 = arrayList.size();
            if (size3 != 0) {
                int i17 = size3 - 1;
                int max2 = Math.max(0, max - (AndroidUtilities.dp(7.0f) * i17));
                int[] iArr = new int[size3];
                int i18 = 0;
                for (int i19 = 0; i19 < size3; i19++) {
                    d0 d0Var = (d0) arrayList.get(i19);
                    d0Var.getClass();
                    int max3 = Math.max(AndroidUtilities.dp(34.0f), d0Var.f15249a.getPreferredWidth());
                    iArr[i19] = max3;
                    i18 += max3;
                }
                if (i18 <= max2) {
                    boolean[] zArr = new boolean[size3];
                    int i20 = size3;
                    boolean z10 = true;
                    while (z10 && i20 > 0) {
                        int i21 = max2 / i20;
                        int i22 = i20;
                        boolean z11 = false;
                        for (int i23 = 0; i23 < size3; i23++) {
                            if (!zArr[i23] && (i16 = iArr[i23]) > i21) {
                                zArr[i23] = true;
                                max2 -= i16;
                                i22--;
                                z11 = true;
                            }
                        }
                        z10 = z11;
                        i20 = i22;
                    }
                    if (i20 > 0) {
                        int i24 = max2 / i20;
                        int i25 = max2 - (i20 * i24);
                        for (int i26 = 0; i26 < size3; i26++) {
                            if (!zArr[i26]) {
                                int i27 = i25 - 1;
                                if (i25 > 0) {
                                    i15 = 1;
                                } else {
                                    i15 = 0;
                                }
                                iArr[i26] = i15 + i24;
                                i25 = i27;
                            }
                        }
                    }
                } else {
                    int i28 = 0;
                    for (int i29 = 0; i29 < size3; i29++) {
                        int i30 = iArr[i29];
                        d0 d0Var2 = (d0) arrayList.get(i29);
                        d0Var2.getClass();
                        i28 += i30 - Math.max(AndroidUtilities.dp(34.0f), d0Var2.f15249a.getMinWidth());
                    }
                    if (i28 <= 0) {
                        for (int i31 = 0; i31 < size3; i31++) {
                            d0 d0Var3 = (d0) arrayList.get(i31);
                            d0Var3.getClass();
                            iArr[i31] = Math.max(AndroidUtilities.dp(34.0f), d0Var3.f15249a.getMinWidth());
                        }
                    } else {
                        int min = Math.min(i18 - max2, i28);
                        int i32 = 0;
                        int i33 = 0;
                        while (i32 < size3) {
                            int i34 = iArr[i32];
                            d0 d0Var4 = (d0) arrayList.get(i32);
                            d0Var4.getClass();
                            int max4 = i34 - Math.max(AndroidUtilities.dp(34.0f), d0Var4.f15249a.getMinWidth());
                            if (i32 == i17) {
                                i14 = min - i33;
                                i13 = min;
                            } else {
                                i13 = min;
                                i14 = (int) ((min * max4) / i28);
                            }
                            int min2 = Math.min(i14, max4);
                            iArr[i32] = iArr[i32] - min2;
                            i33 += min2;
                            i32++;
                            min = i13;
                        }
                    }
                }
                for (int i35 = 0; i35 < size3; i35++) {
                    d0 d0Var5 = (d0) arrayList.get(i35);
                    int i36 = iArr[i35];
                    RichMessageLayout.RichButton richButton = d0Var5.f15249a;
                    richButton.width = Math.max(AndroidUtilities.dp(34.0f), i36);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) d0Var5.getLayoutParams();
                    if (layoutParams2 != null) {
                        int i37 = layoutParams2.width;
                        int i38 = richButton.width;
                        if (i37 != i38) {
                            layoutParams2.width = i38;
                            d0Var5.setLayoutParams(layoutParams2);
                        }
                    }
                }
            }
        }
        if (size2 > 0) {
            dp = ((d0) arrayList.get(0)).f15249a.getHeight();
            dp2 = AndroidUtilities.dp(8.0f);
        } else {
            dp = AndroidUtilities.dp(SharedConfig.fontSize + 18);
            dp2 = AndroidUtilities.dp(8.0f);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + dp2 + dp;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
        setMeasuredDimension(size, paddingBottom);
    }

    @Override
    public final void updateColors() {
        this.f15332w.updateColors();
        int i10 = k6.Oh;
        org.telegram.ui.ActionBar.g6 g6Var = this.f15330r;
        int w02 = k6.w0(i10, g6Var);
        int i11 = k6.f21183d6;
        int w03 = k6.w0(i11, g6Var);
        if (w02 != this.F || w03 != this.G) {
            this.F = w02;
            this.G = w03;
            TextView textView = this.f15333x;
            Drawable background = textView.getBackground();
            k6.E1(background, k6.v(w03, k6.o1(0.1f, w02)), false);
            k6.E1(background, k6.o1(0.16f, w02), true);
            textView.invalidate();
            androidx.activity.i iVar = this.H;
            removeCallbacks(iVar);
            postDelayed(iVar, 100L);
            try {
                if (getBackground() instanceof a2) {
                    ((a2) getBackground()).a(k6.w0(i11, g6Var));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}

package ji;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SharedConfig;
public final class g0 extends a0 implements org.telegram.ui.ActionBar.z5 {
    public e0 E;
    public final int f13909n;
    public final org.telegram.ui.ActionBar.f6 f13910r;
    public final HorizontalScrollView f13911s;
    public final LinearLayout v;
    public final y1 f13912w;
    public final TextView f13913x;
    public final ArrayList f13914y;

    public g0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f13914y = new ArrayList();
        this.f13909n = i10;
        this.f13910r = f6Var;
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f13911s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        linearLayout.setOrientation(0);
        horizontalScrollView.addView(linearLayout, new FrameLayout.LayoutParams(-2, -1));
        addView(horizontalScrollView, w7.x5.e(-1, -1, 23));
        y1 y1Var = new y1(context, R.drawable.msg_add, f6Var);
        y1Var.f14340e = 19;
        y1Var.d();
        this.f13912w = y1Var;
        y1Var.setSelected(true);
        y1Var.setContentDescription(LocaleController.getString(R.string.Add));
        y1Var.setOnClickListener(new View.OnClickListener(this) {
            public final g0 f13804b;

            {
                this.f13804b = this;
            }

            @Override
            public final void onClick(View view) {
                a aVar;
                a aVar2;
                switch (r2) {
                    case 0:
                        g0 g0Var = this.f13804b;
                        e0 e0Var = g0Var.E;
                        if (e0Var != null && (aVar = g0Var.f13749a) != null) {
                            v3 v3Var = ((n3) e0Var).f14078a;
                            v3Var.n3(false);
                            v3Var.f14249h3.b(new s3(v3Var, aVar, -1), view);
                            return;
                        }
                        return;
                    default:
                        g0 g0Var2 = this.f13804b;
                        e0 e0Var2 = g0Var2.E;
                        if (e0Var2 != null && (aVar2 = g0Var2.f13749a) != null) {
                            v3 v3Var2 = ((n3) e0Var2).f14078a;
                            v3Var2.n3(false);
                            v3Var2.f14249h3.b(new s3(v3Var2, aVar2, -1), view);
                            return;
                        }
                        return;
                }
            }
        });
        addView(y1Var, w7.x5.e(38, 38, 21));
        TextView textView = new TextView(context);
        this.f13913x = textView;
        textView.setText(LocaleController.getString(R.string.RichEditorAddButton));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(7.0f));
        textView.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final g0 f13804b;

            {
                this.f13804b = this;
            }

            @Override
            public final void onClick(View view) {
                a aVar;
                a aVar2;
                switch (r2) {
                    case 0:
                        g0 g0Var = this.f13804b;
                        e0 e0Var = g0Var.E;
                        if (e0Var != null && (aVar = g0Var.f13749a) != null) {
                            v3 v3Var = ((n3) e0Var).f14078a;
                            v3Var.n3(false);
                            v3Var.f14249h3.b(new s3(v3Var, aVar, -1), view);
                            return;
                        }
                        return;
                    default:
                        g0 g0Var2 = this.f13804b;
                        e0 e0Var2 = g0Var2.E;
                        if (e0Var2 != null && (aVar2 = g0Var2.f13749a) != null) {
                            v3 v3Var2 = ((n3) e0Var2).f14078a;
                            v3Var2.n3(false);
                            v3Var2.f14249h3.b(new s3(v3Var2, aVar2, -1), view);
                            return;
                        }
                        return;
                }
            }
        });
        addView(textView, w7.x5.e(-2, 38, 17));
        j();
    }

    public static boolean h(View view, float f7, float f10) {
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
    public final void d() {
        this.f13912w.d();
        j();
        i();
    }

    public int[] getColorKeys() {
        return null;
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: ji.g0.i():void");
    }

    public final void j() {
        int i10 = org.telegram.ui.ActionBar.j6.Oh;
        org.telegram.ui.ActionBar.f6 f6Var = this.f13910r;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        int v = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20663d6, f6Var), org.telegram.ui.ActionBar.j6.l1(0.1f, v02));
        TextView textView = this.f13913x;
        textView.setTextColor(v02);
        textView.setBackground(org.telegram.ui.ActionBar.j6.Z(v, org.telegram.ui.ActionBar.j6.l1(0.16f, v02), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f)));
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_add).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
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
        ArrayList arrayList = this.f13914y;
        int size2 = arrayList.size();
        if (size2 > 0 && size2 < 8) {
            i12 = AndroidUtilities.dp(45.0f);
        } else {
            i12 = 0;
        }
        HorizontalScrollView horizontalScrollView = this.f13911s;
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
                    int max3 = Math.max(AndroidUtilities.dp(34.0f), d0Var.f13851a.getPreferredWidth());
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
                        i28 += i30 - Math.max(AndroidUtilities.dp(34.0f), d0Var2.f13851a.getMinWidth());
                    }
                    if (i28 <= 0) {
                        for (int i31 = 0; i31 < size3; i31++) {
                            d0 d0Var3 = (d0) arrayList.get(i31);
                            d0Var3.getClass();
                            iArr[i31] = Math.max(AndroidUtilities.dp(34.0f), d0Var3.f13851a.getMinWidth());
                        }
                    } else {
                        int min = Math.min(i18 - max2, i28);
                        int i32 = 0;
                        int i33 = 0;
                        while (i32 < size3) {
                            int i34 = iArr[i32];
                            d0 d0Var4 = (d0) arrayList.get(i32);
                            d0Var4.getClass();
                            int max4 = i34 - Math.max(AndroidUtilities.dp(34.0f), d0Var4.f13851a.getMinWidth());
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
                    RichMessageLayout.RichButton richButton = d0Var5.f13851a;
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
            dp = ((d0) arrayList.get(0)).f13851a.getHeight();
            dp2 = AndroidUtilities.dp(8.0f);
        } else {
            dp = AndroidUtilities.dp(SharedConfig.fontSize + 18);
            dp2 = AndroidUtilities.dp(8.0f);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + dp2 + dp;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
        setMeasuredDimension(size, paddingBottom);
    }
}

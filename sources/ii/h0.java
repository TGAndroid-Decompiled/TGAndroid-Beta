package ii;

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
public final class h0 extends a0 implements org.telegram.ui.ActionBar.x5 {
    public f0 E;
    public final int f11391n;
    public final org.telegram.ui.ActionBar.d6 f11392r;
    public final HorizontalScrollView f11393s;
    public final LinearLayout v;
    public final a2 f11394w;
    public final TextView f11395x;
    public final ArrayList f11396y;

    public h0(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f11396y = new ArrayList();
        this.f11391n = i10;
        this.f11392r = d6Var;
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f11393s = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        linearLayout.setOrientation(0);
        horizontalScrollView.addView(linearLayout, new FrameLayout.LayoutParams(-2, -1));
        addView(horizontalScrollView, w7.y5.e(-1, -1, 23));
        a2 a2Var = new a2(context, R.drawable.msg_add, d6Var);
        a2Var.e = 19;
        a2Var.e();
        this.f11394w = a2Var;
        a2Var.setSelected(true);
        a2Var.setContentDescription(LocaleController.getString(R.string.Add));
        a2Var.setOnClickListener(new View.OnClickListener(this) {
            public final h0 f11287b;

            {
                this.f11287b = this;
            }

            @Override
            public final void onClick(View view) {
                a aVar;
                a aVar2;
                switch (r2) {
                    case 0:
                        h0 h0Var = this.f11287b;
                        f0 f0Var = h0Var.E;
                        if (f0Var != null && (aVar = h0Var.f11207a) != null) {
                            x3 x3Var = ((p3) f0Var).f11548a;
                            x3Var.o3(false);
                            x3Var.f11728h3.J(new u3(x3Var, aVar, -1), view);
                            return;
                        }
                        return;
                    default:
                        h0 h0Var2 = this.f11287b;
                        f0 f0Var2 = h0Var2.E;
                        if (f0Var2 != null && (aVar2 = h0Var2.f11207a) != null) {
                            x3 x3Var2 = ((p3) f0Var2).f11548a;
                            x3Var2.o3(false);
                            x3Var2.f11728h3.J(new u3(x3Var2, aVar2, -1), view);
                            return;
                        }
                        return;
                }
            }
        });
        addView(a2Var, w7.y5.e(38, 38, 21));
        TextView textView = new TextView(context);
        this.f11395x = textView;
        textView.setText(LocaleController.getString(R.string.RichEditorAddButton));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(7.0f));
        textView.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final h0 f11287b;

            {
                this.f11287b = this;
            }

            @Override
            public final void onClick(View view) {
                a aVar;
                a aVar2;
                switch (r2) {
                    case 0:
                        h0 h0Var = this.f11287b;
                        f0 f0Var = h0Var.E;
                        if (f0Var != null && (aVar = h0Var.f11207a) != null) {
                            x3 x3Var = ((p3) f0Var).f11548a;
                            x3Var.o3(false);
                            x3Var.f11728h3.J(new u3(x3Var, aVar, -1), view);
                            return;
                        }
                        return;
                    default:
                        h0 h0Var2 = this.f11287b;
                        f0 f0Var2 = h0Var2.E;
                        if (f0Var2 != null && (aVar2 = h0Var2.f11207a) != null) {
                            x3 x3Var2 = ((p3) f0Var2).f11548a;
                            x3Var2.o3(false);
                            x3Var2.f11728h3.J(new u3(x3Var2, aVar2, -1), view);
                            return;
                        }
                        return;
                }
            }
        });
        addView(textView, w7.y5.e(-2, 38, 17));
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
    public final void e() {
        this.f11394w.e();
        j();
        i();
    }

    public int[] getColorKeys() {
        return null;
    }

    public final void i() {
        throw new UnsupportedOperationException("Method not decompiled: ii.h0.i():void");
    }

    public final void j() {
        int i10 = org.telegram.ui.ActionBar.h6.Oh;
        org.telegram.ui.ActionBar.d6 d6Var = this.f11392r;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
        int v = org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19060d6, d6Var), org.telegram.ui.ActionBar.h6.l1(0.1f, v02));
        TextView textView = this.f11395x;
        textView.setTextColor(v02);
        textView.setBackground(org.telegram.ui.ActionBar.h6.Z(v, org.telegram.ui.ActionBar.h6.l1(0.16f, v02), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f)));
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
        ArrayList arrayList = this.f11396y;
        int size2 = arrayList.size();
        if (size2 > 0 && size2 < 8) {
            i12 = AndroidUtilities.dp(45.0f);
        } else {
            i12 = 0;
        }
        HorizontalScrollView horizontalScrollView = this.f11393s;
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
                    e0 e0Var = (e0) arrayList.get(i19);
                    e0Var.getClass();
                    int max3 = Math.max(AndroidUtilities.dp(34.0f), e0Var.f11302a.getPreferredWidth());
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
                        e0 e0Var2 = (e0) arrayList.get(i29);
                        e0Var2.getClass();
                        i28 += i30 - Math.max(AndroidUtilities.dp(34.0f), e0Var2.f11302a.getMinWidth());
                    }
                    if (i28 <= 0) {
                        for (int i31 = 0; i31 < size3; i31++) {
                            e0 e0Var3 = (e0) arrayList.get(i31);
                            e0Var3.getClass();
                            iArr[i31] = Math.max(AndroidUtilities.dp(34.0f), e0Var3.f11302a.getMinWidth());
                        }
                    } else {
                        int min = Math.min(i18 - max2, i28);
                        int i32 = 0;
                        int i33 = 0;
                        while (i32 < size3) {
                            int i34 = iArr[i32];
                            e0 e0Var4 = (e0) arrayList.get(i32);
                            e0Var4.getClass();
                            int max4 = i34 - Math.max(AndroidUtilities.dp(34.0f), e0Var4.f11302a.getMinWidth());
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
                    e0 e0Var5 = (e0) arrayList.get(i35);
                    int i36 = iArr[i35];
                    RichMessageLayout.RichButton richButton = e0Var5.f11302a;
                    richButton.width = Math.max(AndroidUtilities.dp(34.0f), i36);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) e0Var5.getLayoutParams();
                    if (layoutParams2 != null) {
                        int i37 = layoutParams2.width;
                        int i38 = richButton.width;
                        if (i37 != i38) {
                            layoutParams2.width = i38;
                            e0Var5.setLayoutParams(layoutParams2);
                        }
                    }
                }
            }
        }
        if (size2 > 0) {
            dp = ((e0) arrayList.get(0)).f11302a.getHeight();
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

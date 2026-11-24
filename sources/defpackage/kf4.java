package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.FiltersSetupActivity;
public final class kf4 extends ka {
    public final Context d;
    public final FiltersSetupActivity e;

    public kf4(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.e = filtersSetupActivity;
        this.d = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        if (i != 3 && i != 0 && i != 5 && i != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.e.n.size();
    }

    @Override
    public final int d(int i) {
        hf4 hf4Var;
        ArrayList arrayList = this.e.n;
        if (i >= 0 && i < arrayList.size() && (hf4Var = (hf4) arrayList.get(i)) != null) {
            return hf4Var.a;
        }
        return 3;
    }

    @Override
    public final void t(defpackage.s49 r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kf4.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        ff4 ff4Var;
        int i2;
        int i3;
        int i4;
        int i5;
        Context context = this.d;
        if (i != 0) {
            if (i != 1) {
                int i6 = 5;
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 6) {
                                ?? frameLayout = new FrameLayout(context);
                                TextView textView = new TextView(context);
                                frameLayout.a = textView;
                                zkb.X(textView, bkb.F6, null);
                                ug8.w(textView, 1, 16.0f, 1, 1);
                                textView.setSingleLine(true);
                                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                textView.setEllipsize(truncateAt);
                                if (k96.a0) {
                                    i2 = 5;
                                } else {
                                    i2 = 3;
                                }
                                textView.setGravity(i2);
                                if (k96.a0) {
                                    i3 = 5;
                                } else {
                                    i3 = 3;
                                }
                                frameLayout.addView(textView, nme.d(-2, -2.0f, i3, 22.0f, 10.0f, 22.0f, 0.0f));
                                TextView textView2 = new TextView(context);
                                frameLayout.b = textView2;
                                zkb.X(textView2, bkb.y6, null);
                                ug8.w(textView2, 1, 13.0f, 1, 1);
                                textView2.setSingleLine(true);
                                textView2.setEllipsize(truncateAt);
                                if (k96.a0) {
                                    i4 = 5;
                                } else {
                                    i4 = 3;
                                }
                                textView2.setGravity(i4);
                                if (k96.a0) {
                                    i5 = 5;
                                } else {
                                    i5 = 3;
                                }
                                frameLayout.addView(textView2, nme.d(-2, -2.0f, i5, 22.0f, 35.0f, 22.0f, 0.0f));
                                ls8 ls8Var = new ls8(context);
                                frameLayout.c = ls8Var;
                                ls8Var.setText(k96.M0(2131754483, null));
                                zkb.X(ls8Var, bkb.Ii, null);
                                ls8Var.setProgressColor(bkb.w0(null, bkb.Di, false));
                                int i7 = bkb.Ei;
                                int w0 = bkb.w0(null, i7, false);
                                bkb.w0(null, bkb.Gi, false);
                                ls8Var.setBackground(sjb.e(w0, 14.0f));
                                Drawable background = ls8Var.getBackground();
                                vkb M = zkb.M(i7);
                                ls8Var.setBackground(background);
                                zkb.j(ls8Var, background, M, null, null);
                                frameLayout.addView(ls8Var, nme.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                                frameLayout.setAddOnClickListener(new xf3(this, (Object) frameLayout, (byte) 9));
                                ff4Var = frameLayout;
                            } else {
                                ff4Var = new ahb(context);
                            }
                        } else {
                            ?? frameLayout2 = new FrameLayout(context);
                            jia jiaVar = new jia(context);
                            frameLayout2.a = jiaVar;
                            jiaVar.setTextSize(16);
                            if (!k96.a0) {
                                i6 = 3;
                            }
                            jiaVar.setGravity(i6);
                            int i8 = bkb.n6;
                            zkb.W(jiaVar, i8, null);
                            jiaVar.setTag(Integer.valueOf(i8));
                            frameLayout2.addView(jiaVar);
                            ImageView imageView = new ImageView(context);
                            frameLayout2.b = imageView;
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            frameLayout2.addView(imageView);
                            ff4Var = frameLayout2;
                        }
                    } else {
                        ff4Var = new mhb(context);
                    }
                } else {
                    ff4 ff4Var2 = new ff4(this.e, context);
                    ff4Var2.setOnReorderButtonTouchListener(new f8(this, ff4Var2, (byte) 5));
                    ff4Var2.setOnOptionsClick(new yj3(this, (byte) 16));
                    ff4Var = ff4Var2;
                }
            } else {
                SpannableStringBuilder S2 = gl.S2(k96.a0(null, null, 2131751703, new Object[0]));
                ?? frameLayout3 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout3.a = imageView2;
                imageView2.f(2131624019, 90, 90, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                imageView2.setImportantForAccessibility(2);
                frameLayout3.addView(imageView2, nme.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new yj3(frameLayout3, (byte) 15));
                TextView textView3 = new TextView(context);
                zkb.X(textView3, bkb.A6, null);
                textView3.setTextSize(1, 14.0f);
                textView3.setGravity(17);
                textView3.setText(S2);
                frameLayout3.addView(textView3, nme.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
                ff4Var = frameLayout3;
            }
        } else {
            ff4Var = new ld5(context);
        }
        return new s49(ff4Var);
    }
}

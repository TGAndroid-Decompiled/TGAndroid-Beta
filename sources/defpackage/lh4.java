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
public final class lh4 extends ka {
    public final Context d;
    public final FiltersSetupActivity e;

    public lh4(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.e = filtersSetupActivity;
        this.d = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
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
        jh4 jh4Var;
        ArrayList arrayList = this.e.n;
        if (i >= 0 && i < arrayList.size() && (jh4Var = (jh4) arrayList.get(i)) != null) {
            return jh4Var.a;
        }
        return 3;
    }

    @Override
    public final void t(defpackage.u69 r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lh4.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        hh4 hh4Var;
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
                                anb.X(textView, cmb.F6, null);
                                wi8.w(textView, 1, 16.0f, 1, 1);
                                textView.setSingleLine(true);
                                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                textView.setEllipsize(truncateAt);
                                if (jb6.a0) {
                                    i2 = 5;
                                } else {
                                    i2 = 3;
                                }
                                textView.setGravity(i2);
                                if (jb6.a0) {
                                    i3 = 5;
                                } else {
                                    i3 = 3;
                                }
                                frameLayout.addView(textView, qoe.d(-2, -2.0f, i3, 22.0f, 10.0f, 22.0f, 0.0f));
                                TextView textView2 = new TextView(context);
                                frameLayout.b = textView2;
                                anb.X(textView2, cmb.y6, null);
                                wi8.w(textView2, 1, 13.0f, 1, 1);
                                textView2.setSingleLine(true);
                                textView2.setEllipsize(truncateAt);
                                if (jb6.a0) {
                                    i4 = 5;
                                } else {
                                    i4 = 3;
                                }
                                textView2.setGravity(i4);
                                if (jb6.a0) {
                                    i5 = 5;
                                } else {
                                    i5 = 3;
                                }
                                frameLayout.addView(textView2, qoe.d(-2, -2.0f, i5, 22.0f, 35.0f, 22.0f, 0.0f));
                                mu8 mu8Var = new mu8(context);
                                frameLayout.c = mu8Var;
                                mu8Var.setText(jb6.M0(2131754483, null));
                                anb.X(mu8Var, cmb.Ii, null);
                                mu8Var.setProgressColor(cmb.w0(null, cmb.Di, false));
                                int i7 = cmb.Ei;
                                int w0 = cmb.w0(null, i7, false);
                                cmb.w0(null, cmb.Gi, false);
                                mu8Var.setBackground(ulb.e(w0, 14.0f));
                                Drawable background = mu8Var.getBackground();
                                wmb M = anb.M(i7);
                                mu8Var.setBackground(background);
                                anb.j(mu8Var, background, M, null, null);
                                frameLayout.addView(mu8Var, qoe.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                                frameLayout.setAddOnClickListener(new tf3(this, frameLayout, (byte) 10));
                                hh4Var = frameLayout;
                            } else {
                                hh4Var = new bjb(context);
                            }
                        } else {
                            ?? frameLayout2 = new FrameLayout(context);
                            lka lkaVar = new lka(context);
                            frameLayout2.a = lkaVar;
                            lkaVar.setTextSize(16);
                            if (!jb6.a0) {
                                i6 = 3;
                            }
                            lkaVar.setGravity(i6);
                            int i8 = cmb.n6;
                            anb.W(lkaVar, i8, null);
                            lkaVar.setTag(Integer.valueOf(i8));
                            frameLayout2.addView(lkaVar);
                            ImageView imageView = new ImageView(context);
                            frameLayout2.b = imageView;
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            frameLayout2.addView(imageView);
                            hh4Var = frameLayout2;
                        }
                    } else {
                        hh4Var = new njb(context);
                    }
                } else {
                    hh4 hh4Var2 = new hh4(this.e, context);
                    hh4Var2.setOnReorderButtonTouchListener(new f8(this, hh4Var2, (byte) 5));
                    hh4Var2.setOnOptionsClick(new sf3(this, (byte) 19));
                    hh4Var = hh4Var2;
                }
            } else {
                SpannableStringBuilder S2 = gm.S2(jb6.a0(null, null, 2131751652, new Object[0]));
                ?? frameLayout3 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout3.a = imageView2;
                imageView2.f(2131624019, 90, 90, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                imageView2.setImportantForAccessibility(2);
                frameLayout3.addView(imageView2, qoe.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new sf3(frameLayout3, (byte) 18));
                TextView textView3 = new TextView(context);
                anb.X(textView3, cmb.A6, null);
                textView3.setTextSize(1, 14.0f);
                textView3.setGravity(17);
                textView3.setText(S2);
                frameLayout3.addView(textView3, qoe.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
                hh4Var = frameLayout3;
            }
        } else {
            hh4Var = new jf5(context);
        }
        return new u69(hh4Var);
    }
}

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
public final class ih4 extends la {
    public final Context d;
    public final FiltersSetupActivity e;

    public ih4(FiltersSetupActivity filtersSetupActivity, Context context) {
        this.e = filtersSetupActivity;
        this.d = context;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
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
        gh4 gh4Var;
        ArrayList arrayList = this.e.n;
        if (i >= 0 && i < arrayList.size() && (gh4Var = (gh4) arrayList.get(i)) != null) {
            return gh4Var.a;
        }
        return 3;
    }

    @Override
    public final void t(defpackage.f89 r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ih4.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        eh4 eh4Var;
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
                                yob.X(textView, aob.G6, null);
                                ik8.w(textView, 1, 16.0f, 1, 1);
                                textView.setSingleLine(true);
                                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                textView.setEllipsize(truncateAt);
                                if (ob6.a0) {
                                    i2 = 5;
                                } else {
                                    i2 = 3;
                                }
                                textView.setGravity(i2);
                                if (ob6.a0) {
                                    i3 = 5;
                                } else {
                                    i3 = 3;
                                }
                                frameLayout.addView(textView, tre.d(-2, -2.0f, i3, 22.0f, 10.0f, 22.0f, 0.0f));
                                TextView textView2 = new TextView(context);
                                frameLayout.b = textView2;
                                yob.X(textView2, aob.z6, null);
                                ik8.w(textView2, 1, 13.0f, 1, 1);
                                textView2.setSingleLine(true);
                                textView2.setEllipsize(truncateAt);
                                if (ob6.a0) {
                                    i4 = 5;
                                } else {
                                    i4 = 3;
                                }
                                textView2.setGravity(i4);
                                if (ob6.a0) {
                                    i5 = 5;
                                } else {
                                    i5 = 3;
                                }
                                frameLayout.addView(textView2, tre.d(-2, -2.0f, i5, 22.0f, 35.0f, 22.0f, 0.0f));
                                uv8 uv8Var = new uv8(context);
                                frameLayout.c = uv8Var;
                                uv8Var.setText(ob6.M0(2131754479, null));
                                yob.X(uv8Var, aob.Ji, null);
                                uv8Var.setProgressColor(aob.w0(null, aob.Ei, false));
                                int i7 = aob.Fi;
                                int w0 = aob.w0(null, i7, false);
                                aob.w0(null, aob.Hi, false);
                                uv8Var.setBackground(rnb.e(w0, 14.0f));
                                Drawable background = uv8Var.getBackground();
                                uob M = yob.M(i7);
                                uv8Var.setBackground(background);
                                yob.j(uv8Var, background, M, null, null);
                                frameLayout.addView(uv8Var, tre.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
                                frameLayout.setAddOnClickListener(new je3(this, frameLayout, (byte) 12));
                                eh4Var = frameLayout;
                            } else {
                                eh4Var = new wkb(context);
                            }
                        } else {
                            ?? frameLayout2 = new FrameLayout(context);
                            ema emaVar = new ema(context);
                            frameLayout2.a = emaVar;
                            emaVar.setTextSize(16);
                            if (!ob6.a0) {
                                i6 = 3;
                            }
                            emaVar.setGravity(i6);
                            int i8 = aob.o6;
                            yob.W(emaVar, i8, null);
                            emaVar.setTag(Integer.valueOf(i8));
                            frameLayout2.addView(emaVar);
                            ImageView imageView = new ImageView(context);
                            frameLayout2.b = imageView;
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            frameLayout2.addView(imageView);
                            eh4Var = frameLayout2;
                        }
                    } else {
                        eh4Var = new ilb(context);
                    }
                } else {
                    eh4 eh4Var2 = new eh4(this.e, context);
                    eh4Var2.setOnReorderButtonTouchListener(new g8(this, eh4Var2, (byte) 5));
                    eh4Var2.setOnOptionsClick(new mh3(this, (byte) 18));
                    eh4Var = eh4Var2;
                }
            } else {
                SpannableStringBuilder S2 = hl.S2(ob6.a0(null, null, 2131751680, new Object[0]));
                ?? frameLayout3 = new FrameLayout(context);
                ?? imageView2 = new ImageView(context);
                frameLayout3.a = imageView2;
                imageView2.f(2131624019, 90, 90, null);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.d();
                imageView2.setImportantForAccessibility(2);
                frameLayout3.addView(imageView2, tre.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
                imageView2.setOnClickListener(new mh3(frameLayout3, (byte) 17));
                TextView textView3 = new TextView(context);
                yob.X(textView3, aob.B6, null);
                textView3.setTextSize(1, 14.0f);
                textView3.setGravity(17);
                textView3.setText(S2);
                frameLayout3.addView(textView3, tre.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
                eh4Var = frameLayout3;
            }
        } else {
            eh4Var = new mf5(context);
        }
        return new f89(eh4Var);
    }
}

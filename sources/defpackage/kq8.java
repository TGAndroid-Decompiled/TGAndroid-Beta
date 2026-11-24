package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ProfileActivity;
public final class kq8 extends qaa {
    public final lq8 h;

    public kq8(lq8 lq8Var, Context context, ylb ylbVar) {
        super(context);
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        this.h = lq8Var;
        this.f = z8c.t0;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        ts2.s(textView, 1, 15.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i | 16);
        anb.X(textView, cmb.K6, ylbVar);
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        addView(textView, qoe.t(-1, -2, i2 | 48, 21, 15, 21, 0));
        l66 l66Var = new l66(context, ylbVar);
        this.b = l66Var;
        anb.X(l66Var, cmb.F6, ylbVar);
        l66Var.setTextSize(1, 14.0f);
        anb.G(l66Var, cmb.I6, ylbVar);
        anb.C(l66Var, cmb.J6, ylbVar);
        l66Var.setMovementMethod(new cm((byte) 0));
        if (jb6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        l66Var.setGravity(i3);
        if (jb6.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        addView(l66Var, qoe.t(-2, -2, i4, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, qoe.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        for (int i7 = 0; i7 < 2; i7++) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(ulb.f(cmb.Ei, 8.0f));
            rve.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            td4.x(textView2, cmb.Ii, ylbVar, 1, 14.0f);
            if (i7 == 0) {
                i5 = 0;
            } else {
                i5 = 4;
            }
            if (i7 == 0) {
                i6 = 4;
            } else {
                i6 = 0;
            }
            linearLayout.addView(textView2, qoe.m(0.5f, 0, 44, i5, i6, 0));
            if (i7 == 0) {
                this.c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final kq8 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b = r2;
                        kq8 kq8Var = this.b;
                        switch (b) {
                            case 0:
                                gm.c3(new ge7(kq8Var, kq8Var.e, (byte) 8));
                                return;
                            default:
                                int i8 = kq8Var.e;
                                ProfileActivity profileActivity = kq8Var.h.e;
                                if (i8 == 0) {
                                    profileActivity.presentFragment(new u8(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new p5c(8, null));
                                    return;
                                }
                        }
                    }
                });
            } else {
                this.d = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final kq8 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b = r2;
                        kq8 kq8Var = this.b;
                        switch (b) {
                            case 0:
                                gm.c3(new ge7(kq8Var, kq8Var.e, (byte) 8));
                                return;
                            default:
                                int i8 = kq8Var.e;
                                ProfileActivity profileActivity = kq8Var.h.e;
                                if (i8 == 0) {
                                    profileActivity.presentFragment(new u8(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new p5c(8, null));
                                    return;
                                }
                        }
                    }
                });
            }
        }
    }
}

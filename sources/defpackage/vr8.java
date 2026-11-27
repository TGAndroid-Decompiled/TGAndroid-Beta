package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ProfileActivity;
public final class vr8 extends hca {
    public final wr8 h;

    public vr8(wr8 wr8Var, Context context, vnb vnbVar) {
        super(context);
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        this.h = wr8Var;
        this.f = yac.t0;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        bs2.t(textView, 1, 15.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i | 16);
        yob.X(textView, aob.L6, vnbVar);
        if (ob6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        addView(textView, tre.t(-1, -2, i2 | 48, 21, 15, 21, 0));
        p66 p66Var = new p66(context, vnbVar);
        this.b = p66Var;
        yob.X(p66Var, aob.G6, vnbVar);
        p66Var.setTextSize(1, 14.0f);
        yob.G(p66Var, aob.J6, vnbVar);
        yob.C(p66Var, aob.K6, vnbVar);
        p66Var.setMovementMethod(new dl((byte) 0));
        if (ob6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        p66Var.setGravity(i3);
        if (ob6.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        addView(p66Var, tre.t(-2, -2, i4, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, tre.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        for (int i7 = 0; i7 < 2; i7++) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(rnb.f(aob.Fi, 8.0f));
            iye.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            qd4.w(textView2, aob.Ji, vnbVar, 1, 14.0f);
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
            linearLayout.addView(textView2, tre.m(0.5f, 0, 44, i5, i6, 0));
            if (i7 == 0) {
                this.c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final vr8 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b = r2;
                        vr8 vr8Var = this.b;
                        switch (b) {
                            case 0:
                                hl.c3(new oe7(vr8Var, vr8Var.e, (byte) 9));
                                return;
                            default:
                                int i8 = vr8Var.e;
                                ProfileActivity profileActivity = vr8Var.h.e;
                                if (i8 == 0) {
                                    profileActivity.presentFragment(new v8(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new o7c(8, null));
                                    return;
                                }
                        }
                    }
                });
            } else {
                this.d = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final vr8 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b = r2;
                        vr8 vr8Var = this.b;
                        switch (b) {
                            case 0:
                                hl.c3(new oe7(vr8Var, vr8Var.e, (byte) 9));
                                return;
                            default:
                                int i8 = vr8Var.e;
                                ProfileActivity profileActivity = vr8Var.h.e;
                                if (i8 == 0) {
                                    profileActivity.presentFragment(new v8(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new o7c(8, null));
                                    return;
                                }
                        }
                    }
                });
            }
        }
    }
}

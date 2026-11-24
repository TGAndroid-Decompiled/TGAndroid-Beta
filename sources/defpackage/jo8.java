package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ProfileActivity;
public final class jo8 extends q8a {
    public final ko8 h;

    public jo8(ko8 ko8Var, Context context, wjb wjbVar) {
        super(context);
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        this.h = ko8Var;
        this.f = y6c.t0;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        ir2.t(textView, 1, 15.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i | 16);
        zkb.X(textView, bkb.K6, wjbVar);
        if (k96.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        addView(textView, nme.t(-1, -2, i2 | 48, 21, 15, 21, 0));
        l46 l46Var = new l46(context, wjbVar);
        this.b = l46Var;
        zkb.X(l46Var, bkb.F6, wjbVar);
        l46Var.setTextSize(1, 14.0f);
        zkb.G(l46Var, bkb.I6, wjbVar);
        zkb.C(l46Var, bkb.J6, wjbVar);
        l46Var.setMovementMethod(new cl((byte) 0));
        if (k96.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        l46Var.setGravity(i3);
        if (k96.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        addView(l46Var, nme.t(-2, -2, i4, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, nme.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        for (int i7 = 0; i7 < 2; i7++) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(sjb.f(bkb.Ei, 8.0f));
            ote.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            tb4.w(textView2, bkb.Ii, wjbVar, 1, 14.0f);
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
            linearLayout.addView(textView2, nme.m(0.5f, 0, 44, i5, i6, 0));
            if (i7 == 0) {
                this.c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final jo8 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b = r2;
                        jo8 jo8Var = this.b;
                        switch (b) {
                            case 0:
                                gl.c3(new on7(jo8Var, jo8Var.e, (byte) 6));
                                return;
                            default:
                                int i8 = jo8Var.e;
                                ProfileActivity profileActivity = jo8Var.h.e;
                                if (i8 == 0) {
                                    profileActivity.presentFragment(new u8(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new p3c(8, null));
                                    return;
                                }
                        }
                    }
                });
            } else {
                this.d = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) {
                    public final jo8 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b = r2;
                        jo8 jo8Var = this.b;
                        switch (b) {
                            case 0:
                                gl.c3(new on7(jo8Var, jo8Var.e, (byte) 6));
                                return;
                            default:
                                int i8 = jo8Var.e;
                                ProfileActivity profileActivity = jo8Var.h.e;
                                if (i8 == 0) {
                                    profileActivity.presentFragment(new u8(3));
                                    return;
                                } else {
                                    profileActivity.presentFragment(new p3c(8, null));
                                    return;
                                }
                        }
                    }
                });
            }
        }
    }
}

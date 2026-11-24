package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PasscodeActivity;
public final class u8 extends d {
    public t56 E;
    public final int[] F;
    public int G;
    public boolean H;
    public s09 a;
    public GradientDrawable b;
    public t8 c;
    public TextView d;
    public TextView e;
    public TextView f;
    public LinearLayout h;
    public final TextView[] n;
    public TextView r;
    public int[] s;
    public final byte w;
    public boolean x;
    public nv4 y;

    public u8(int i) {
        super(null);
        this.n = new TextView[6];
        this.F = new int[2];
        this.w = i;
    }

    @Override
    public final View createView(Context context) {
        float f;
        float f2;
        float f3;
        int i;
        float f4;
        int i2;
        String str;
        int i3;
        a aVar = this.actionBar;
        int i4 = 3;
        if (aVar != null) {
            anb.h(cmb.c6, null, aVar);
            this.actionBar.setBackButtonImage(2131231244);
            anb.l(this.actionBar, 1, cmb.u8, null);
            anb.l(this.actionBar, 3, cmb.s8, null);
            this.actionBar.setCastShadows(false);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 0));
        }
        s8 s8Var = new s8((byte) 0, context, this);
        this.fragmentView = s8Var;
        anb.h(cmb.c6, null, s8Var);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        viewGroup.setOnTouchListener(new p8((byte) 0));
        a aVar2 = this.actionBar;
        if (aVar2 != null) {
            viewGroup.addView(aVar2);
        }
        ?? imageView = new ImageView(context);
        this.a = imageView;
        viewGroup.addView(imageView);
        TextView textView = new TextView(context);
        this.e = textView;
        int i5 = cmb.F6;
        anb.X(textView, i5, null);
        this.e.setGravity(1);
        this.e.setPadding(gm.L(32.0f), 0, gm.L(32.0f), 0);
        this.e.setTextSize(1, 24.0f);
        viewGroup.addView(this.e);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        byte b = this.w;
        if (b == 3) {
            i5 = cmb.Ei;
        }
        anb.X(textView2, i5, null);
        this.d.setGravity(1);
        float f5 = 15.0f;
        this.d.setTextSize(1, 15.0f);
        this.d.setSingleLine(true);
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        this.d.setPadding(gm.L(32.0f), 0, gm.L(32.0f), 0);
        this.d.setVisibility(8);
        viewGroup.addView(this.d);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        anb.X(textView3, cmb.C6, null);
        this.f.setGravity(1);
        this.f.setLineSpacing(gm.L(2.0f), 1.0f);
        this.f.setTextSize(1, 15.0f);
        if (b != 6 && b != 3) {
            f = 32.0f;
            f2 = 24.0f;
            this.f.setPadding(gm.L(32.0f), 0, gm.L(32.0f), 0);
        } else {
            f = 32.0f;
            f2 = 24.0f;
            this.f.setPadding(gm.L(48.0f), 0, gm.L(48.0f), 0);
        }
        viewGroup.addView(this.f);
        int i6 = 2;
        int i7 = 5;
        if (b == 5) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.h = linearLayout;
            linearLayout.setOrientation(1);
            f3 = 2.0f;
            this.h.setPadding(gm.L(f2), 0, gm.L(f2), 0);
            LinearLayout linearLayout2 = this.h;
            if (jb6.a0) {
                i = 5;
            } else {
                i = 3;
            }
            linearLayout2.setGravity(i);
            viewGroup.addView(this.h);
            int i8 = 0;
            while (i8 < i4) {
                LinearLayout i9 = hg9.i(context, 0);
                LinearLayout linearLayout3 = this.h;
                if (i8 != i6) {
                    f4 = 7.0f;
                } else {
                    f4 = 0.0f;
                }
                linearLayout3.addView(i9, qoe.k(0.0f, 0.0f, 0.0f, f4, -2, -2));
                int i10 = i8 << 1;
                TextView textView4 = new TextView(context);
                TextView[] textViewArr = this.n;
                textViewArr[i10] = textView4;
                int i11 = cmb.F6;
                anb.X(textView4, i11, null);
                TextView textView5 = textViewArr[i10];
                if (jb6.a0) {
                    i2 = i7;
                } else {
                    i2 = 3;
                }
                textView5.setGravity(i2);
                textViewArr[i10].setTextSize(1, f5);
                TextView textView6 = textViewArr[i10];
                if (jb6.a0) {
                    str = ".%d";
                } else {
                    str = "%d.";
                }
                int i12 = i8 + 1;
                textView6.setText(String.format(str, Integer.valueOf(i12)));
                textViewArr[i10].setTypeface(gm.o());
                int i13 = i10 + 1;
                TextView textView7 = new TextView(context);
                textViewArr[i13] = textView7;
                anb.X(textView7, i11, null);
                TextView textView8 = textViewArr[i13];
                if (jb6.a0) {
                    i3 = 5;
                } else {
                    i3 = 3;
                }
                textView8.setGravity(i3);
                textViewArr[i13].setTextSize(1, f5);
                if (i8 == 0) {
                    anb.G(textViewArr[i13], cmb.I6, null);
                    anb.C(textViewArr[i13], cmb.J6, null);
                    String M0 = jb6.M0(2131753857, null);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                    int indexOf = M0.indexOf(42);
                    int lastIndexOf = M0.lastIndexOf(42);
                    if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                        textViewArr[i13].setMovementMethod(new cm((byte) 0));
                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new g6c(jb6.M0(2131753858, null), (wkb) null), indexOf, lastIndexOf - 1, 33);
                    }
                    textViewArr[i13].setText(spannableStringBuilder);
                } else if (i8 == 1) {
                    textViewArr[i13].setText(jb6.M0(2131753856, null));
                } else {
                    textViewArr[i13].setText(jb6.M0(2131753855, null));
                }
                if (jb6.a0) {
                    i9.setGravity(5);
                    i9.addView(textViewArr[i13], qoe.l(1.0f, 0, -2));
                    i9.addView(textViewArr[i10], qoe.k(4.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    i9.addView(textViewArr[i10], qoe.k(0.0f, 0.0f, 4.0f, 0.0f, -2, -2));
                    i9.addView(textViewArr[i13], qoe.o(-2, -2));
                }
                i8 = i12;
                i4 = 3;
                f5 = 15.0f;
                i6 = 2;
                i7 = 5;
            }
            this.f.setVisibility(8);
        } else {
            f3 = 2.0f;
        }
        TextView textView9 = new TextView(context);
        this.r = textView9;
        anb.X(textView9, cmb.C6, null);
        this.r.setGravity(1);
        this.r.setLineSpacing(gm.L(f3), 1.0f);
        this.r.setTextSize(1, 13.0f);
        this.r.setVisibility(8);
        this.r.setPadding(gm.L(f), 0, gm.L(f), 0);
        viewGroup.addView(this.r);
        this.b = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        t8 t8Var = new t8(this, context);
        this.c = t8Var;
        rve.b(t8Var, 0.02f, 1.2f);
        this.c.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
        this.c.setGravity(17);
        anb.X(this.c, cmb.Ii, null);
        this.c.setTextSize(1, 14.0f);
        this.c.setTypeface(gm.o());
        t8 t8Var2 = this.c;
        int L = gm.L(f2);
        int i14 = cmb.Gi;
        int w0 = cmb.w0(null, i14, false);
        anb.R(t8Var2, cmb.i0(L, L, L, L, 0, w0, w0), null, anb.M(i14), null);
        viewGroup.addView(this.c);
        this.c.setOnClickListener(new View.OnClickListener(this) {
            public final u8 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b2 = r2;
                u8 u8Var = this.b;
                switch (b2) {
                    case 0:
                        if (u8Var.getParentActivity() != null) {
                            byte b3 = u8Var.w;
                            if (b3 != 0) {
                                if (b3 != 3) {
                                    if (b3 != 5) {
                                        if (b3 == 6) {
                                            u8Var.presentFragment(new PasscodeActivity(1), true);
                                            t56 t56Var = u8Var.E;
                                            if (t56Var != null) {
                                                gm.c3(t56Var);
                                                u8Var.E = null;
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } else if (u8Var.getParentActivity() != null) {
                                        if (u8Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                            u8Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                            return;
                                        }
                                        lb1.j0(u8Var.getParentActivity(), 1, new k6d(u8Var, (byte) 3));
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u8Var.getParentActivity());
                                alertDialog$Builder.a.S = jb6.M0(2131747020, null);
                                alertDialog$Builder.a.U = jb6.M0(2131747022, null);
                                alertDialog$Builder.j(jb6.M0(2131752505, null), new o8(u8Var, (byte) 1));
                                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                u8Var.showDialog(alertDialog$Builder.a);
                                return;
                            }
                            u8Var.presentFragment(new fj1(kt6.j(0, "step")), true);
                            return;
                        }
                        return;
                    case 1:
                        if (!u8Var.a.getAnimatedDrawable().l0) {
                            u8Var.a.getAnimatedDrawable().I(0, false, false);
                            u8Var.a.d();
                            return;
                        }
                        return;
                    case 2:
                        if (!u8Var.a.getAnimatedDrawable().l0) {
                            u8Var.a.getAnimatedDrawable().I(0, false, false);
                            u8Var.a.d();
                            return;
                        }
                        return;
                    default:
                        ((ActionBarLayout) u8Var.getParentLayout()).j(true, false);
                        return;
                }
            }
        });
        if (b != 0) {
            if (b != 3) {
                if (b != 5) {
                    if (b == 6) {
                        this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        this.a.f(2131624320, 200, 200, null);
                        this.a.setFocusable(false);
                        this.a.setOnClickListener(new View.OnClickListener(this) {
                            public final u8 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                byte b2 = r2;
                                u8 u8Var = this.b;
                                switch (b2) {
                                    case 0:
                                        if (u8Var.getParentActivity() != null) {
                                            byte b3 = u8Var.w;
                                            if (b3 != 0) {
                                                if (b3 != 3) {
                                                    if (b3 != 5) {
                                                        if (b3 == 6) {
                                                            u8Var.presentFragment(new PasscodeActivity(1), true);
                                                            t56 t56Var = u8Var.E;
                                                            if (t56Var != null) {
                                                                gm.c3(t56Var);
                                                                u8Var.E = null;
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    } else if (u8Var.getParentActivity() != null) {
                                                        if (u8Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                                            u8Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                                            return;
                                                        }
                                                        lb1.j0(u8Var.getParentActivity(), 1, new k6d(u8Var, (byte) 3));
                                                        return;
                                                    } else {
                                                        return;
                                                    }
                                                }
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u8Var.getParentActivity());
                                                alertDialog$Builder.a.S = jb6.M0(2131747020, null);
                                                alertDialog$Builder.a.U = jb6.M0(2131747022, null);
                                                alertDialog$Builder.j(jb6.M0(2131752505, null), new o8(u8Var, (byte) 1));
                                                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                                u8Var.showDialog(alertDialog$Builder.a);
                                                return;
                                            }
                                            u8Var.presentFragment(new fj1(kt6.j(0, "step")), true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        if (!u8Var.a.getAnimatedDrawable().l0) {
                                            u8Var.a.getAnimatedDrawable().I(0, false, false);
                                            u8Var.a.d();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        if (!u8Var.a.getAnimatedDrawable().l0) {
                                            u8Var.a.getAnimatedDrawable().I(0, false, false);
                                            u8Var.a.d();
                                            return;
                                        }
                                        return;
                                    default:
                                        ((ActionBarLayout) u8Var.getParentLayout()).j(true, false);
                                        return;
                                }
                            }
                        });
                        this.e.setText(jb6.M0(2131747390, null));
                        this.f.setText(jb6.M0(2131752495, null));
                        this.c.setText(jb6.M0(2131751092, null));
                        this.a.d();
                        this.x = true;
                    }
                } else {
                    int[] iArr = new int[8];
                    this.s = iArr;
                    this.a.f(2131624169, 334, 334, iArr);
                    this.a.setScaleType(ImageView.ScaleType.CENTER);
                    this.e.setText(jb6.M0(2131753859, null));
                    this.c.setText(jb6.M0(2131753850, null));
                    this.a.d();
                }
            } else {
                this.d.setVisibility(0);
                this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.a.f(2131624313, 200, 200, null);
                this.a.setOnClickListener(new View.OnClickListener(this) {
                    public final u8 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b2 = r2;
                        u8 u8Var = this.b;
                        switch (b2) {
                            case 0:
                                if (u8Var.getParentActivity() != null) {
                                    byte b3 = u8Var.w;
                                    if (b3 != 0) {
                                        if (b3 != 3) {
                                            if (b3 != 5) {
                                                if (b3 == 6) {
                                                    u8Var.presentFragment(new PasscodeActivity(1), true);
                                                    t56 t56Var = u8Var.E;
                                                    if (t56Var != null) {
                                                        gm.c3(t56Var);
                                                        u8Var.E = null;
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            } else if (u8Var.getParentActivity() != null) {
                                                if (u8Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                                    u8Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                                    return;
                                                }
                                                lb1.j0(u8Var.getParentActivity(), 1, new k6d(u8Var, (byte) 3));
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u8Var.getParentActivity());
                                        alertDialog$Builder.a.S = jb6.M0(2131747020, null);
                                        alertDialog$Builder.a.U = jb6.M0(2131747022, null);
                                        alertDialog$Builder.j(jb6.M0(2131752505, null), new o8(u8Var, (byte) 1));
                                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                        u8Var.showDialog(alertDialog$Builder.a);
                                        return;
                                    }
                                    u8Var.presentFragment(new fj1(kt6.j(0, "step")), true);
                                    return;
                                }
                                return;
                            case 1:
                                if (!u8Var.a.getAnimatedDrawable().l0) {
                                    u8Var.a.getAnimatedDrawable().I(0, false, false);
                                    u8Var.a.d();
                                    return;
                                }
                                return;
                            case 2:
                                if (!u8Var.a.getAnimatedDrawable().l0) {
                                    u8Var.a.getAnimatedDrawable().I(0, false, false);
                                    u8Var.a.d();
                                    return;
                                }
                                return;
                            default:
                                ((ActionBarLayout) u8Var.getParentLayout()).j(true, false);
                                return;
                        }
                    }
                });
                z8c userConfig = getUserConfig();
                TLRPC.User W1 = getMessagesController().W1(Long.valueOf(userConfig.n));
                if (W1 == null) {
                    W1 = userConfig.f();
                }
                if (W1 != null) {
                    this.d.setText(jb6.a0("PhoneNumberKeepButton", null, 2131747017, mlb.l(new StringBuilder("+"), W1.phone, r58.f())));
                }
                this.d.setOnClickListener(new View.OnClickListener(this) {
                    public final u8 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b2 = r2;
                        u8 u8Var = this.b;
                        switch (b2) {
                            case 0:
                                if (u8Var.getParentActivity() != null) {
                                    byte b3 = u8Var.w;
                                    if (b3 != 0) {
                                        if (b3 != 3) {
                                            if (b3 != 5) {
                                                if (b3 == 6) {
                                                    u8Var.presentFragment(new PasscodeActivity(1), true);
                                                    t56 t56Var = u8Var.E;
                                                    if (t56Var != null) {
                                                        gm.c3(t56Var);
                                                        u8Var.E = null;
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            } else if (u8Var.getParentActivity() != null) {
                                                if (u8Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                                    u8Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                                    return;
                                                }
                                                lb1.j0(u8Var.getParentActivity(), 1, new k6d(u8Var, (byte) 3));
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u8Var.getParentActivity());
                                        alertDialog$Builder.a.S = jb6.M0(2131747020, null);
                                        alertDialog$Builder.a.U = jb6.M0(2131747022, null);
                                        alertDialog$Builder.j(jb6.M0(2131752505, null), new o8(u8Var, (byte) 1));
                                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                        u8Var.showDialog(alertDialog$Builder.a);
                                        return;
                                    }
                                    u8Var.presentFragment(new fj1(kt6.j(0, "step")), true);
                                    return;
                                }
                                return;
                            case 1:
                                if (!u8Var.a.getAnimatedDrawable().l0) {
                                    u8Var.a.getAnimatedDrawable().I(0, false, false);
                                    u8Var.a.d();
                                    return;
                                }
                                return;
                            case 2:
                                if (!u8Var.a.getAnimatedDrawable().l0) {
                                    u8Var.a.getAnimatedDrawable().I(0, false, false);
                                    u8Var.a.d();
                                    return;
                                }
                                return;
                            default:
                                ((ActionBarLayout) u8Var.getParentLayout()).j(true, false);
                                return;
                        }
                    }
                });
                this.e.setText(jb6.M0(2131747021, null));
                this.f.setText(gm.S2(jb6.M0(2131747018, null)));
                this.c.setText(jb6.M0(2131747021, null));
                this.a.d();
                this.x = true;
            }
        } else {
            this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.a.f(2131623973, 200, 200, null);
            this.e.setText(jb6.M0(2131752415, null));
            this.f.setText(jb6.M0(2131752416, null));
            this.c.setText(jb6.M0(2131752417, null));
            this.a.d();
            this.x = true;
        }
        if (this.x) {
            this.c.setPadding(gm.L(34.0f), gm.L(8.0f), gm.L(34.0f), gm.L(8.0f));
            this.c.setTextSize(1, 15.0f);
        }
        e0();
        return this.fragmentView;
    }

    public final void e0() {
        int i = cmb.Ei;
        int themedColor = getThemedColor(i);
        int themedColor2 = getThemedColor(cmb.Fi);
        boolean z = this.H;
        int[] iArr = this.F;
        if (!z || iArr[0] != themedColor || iArr[1] != themedColor2) {
            iArr[0] = themedColor;
            iArr[1] = themedColor2;
            this.H = true;
            this.b.setColors(iArr);
        }
        this.c.setTextColor(cmb.w0(null, cmb.Ii, false));
        int w0 = cmb.w0(null, cmb.Gi, false);
        if (this.c.getBackground() == null) {
            t8 t8Var = this.c;
            int L = gm.L(24.0f);
            t8Var.setBackground(cmb.i0(L, L, L, L, 0, w0, w0));
        } else if (w0 != this.G) {
            cmb.F1(this.c.getBackground(), w0, true);
        }
        this.G = w0;
        int[] iArr2 = this.s;
        if (iArr2 != null && this.a != null) {
            iArr2[0] = 3355443;
            iArr2[1] = cmb.w0(null, cmb.F6, false);
            int[] iArr3 = this.s;
            iArr3[2] = 16777215;
            int i2 = cmb.c6;
            iArr3[3] = cmb.w0(null, i2, false);
            int[] iArr4 = this.s;
            iArr4[4] = 5285866;
            iArr4[5] = cmb.w0(null, i, false);
            int[] iArr5 = this.s;
            iArr5[6] = 2170912;
            iArr5[7] = cmb.w0(null, i2, false);
            s09 s09Var = this.a;
            int[] iArr6 = this.s;
            p09 p09Var = s09Var.b;
            if (p09Var != null) {
                p09Var.n = iArr6;
                p09Var.B();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        TextView[] textViewArr = this.n;
        TextView textView = textViewArr[0];
        int i = cmb.F6;
        arrayList.add(new cnb(textView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(textViewArr[1], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(textViewArr[1], 2, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.I6));
        arrayList.add(new cnb(textViewArr[2], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(textViewArr[3], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(textViewArr[4], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(textViewArr[5], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (on2.h(cmb.w0(null, cmb.c6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                lb1.j0(getParentActivity(), 1, new k6d(this, (byte) 3));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.U = gm.S2(jb6.M0(2131746236, null));
            alertDialog$Builder.j(jb6.M0(2131747033, null), new o8(this, (byte) 0));
            alertDialog$Builder.g(jb6.M0(2131751709, null), null);
            int i2 = cmb.K5;
            alertDialog$Builder.l(2131624117, 72, cmb.w0(null, i2, false), null);
            alertDialog$Builder.m(i2, null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        e0();
    }
}

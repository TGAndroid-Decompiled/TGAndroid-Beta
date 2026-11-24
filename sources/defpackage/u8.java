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
    public t36 E;
    public final int[] F;
    public int G;
    public boolean H;
    public ry8 a;
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
    public h45 y;

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
            zkb.h(bkb.c6, null, aVar);
            this.actionBar.setBackButtonImage(2131231243);
            zkb.l(this.actionBar, 1, bkb.u8, null);
            zkb.l(this.actionBar, 3, bkb.s8, null);
            this.actionBar.setCastShadows(false);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 0));
        }
        s8 s8Var = new s8((byte) 0, context, this);
        this.fragmentView = s8Var;
        zkb.h(bkb.c6, null, s8Var);
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
        int i5 = bkb.F6;
        zkb.X(textView, i5, null);
        this.e.setGravity(1);
        this.e.setPadding(gl.L(32.0f), 0, gl.L(32.0f), 0);
        this.e.setTextSize(1, 24.0f);
        viewGroup.addView(this.e);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        byte b = this.w;
        if (b == 3) {
            i5 = bkb.Ei;
        }
        zkb.X(textView2, i5, null);
        this.d.setGravity(1);
        float f5 = 15.0f;
        this.d.setTextSize(1, 15.0f);
        this.d.setSingleLine(true);
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        this.d.setPadding(gl.L(32.0f), 0, gl.L(32.0f), 0);
        this.d.setVisibility(8);
        viewGroup.addView(this.d);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        zkb.X(textView3, bkb.C6, null);
        this.f.setGravity(1);
        this.f.setLineSpacing(gl.L(2.0f), 1.0f);
        this.f.setTextSize(1, 15.0f);
        if (b != 6 && b != 3) {
            f = 32.0f;
            f2 = 24.0f;
            this.f.setPadding(gl.L(32.0f), 0, gl.L(32.0f), 0);
        } else {
            f = 32.0f;
            f2 = 24.0f;
            this.f.setPadding(gl.L(48.0f), 0, gl.L(48.0f), 0);
        }
        viewGroup.addView(this.f);
        int i6 = 2;
        int i7 = 5;
        if (b == 5) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.h = linearLayout;
            linearLayout.setOrientation(1);
            f3 = 2.0f;
            this.h.setPadding(gl.L(f2), 0, gl.L(f2), 0);
            LinearLayout linearLayout2 = this.h;
            if (k96.a0) {
                i = 5;
            } else {
                i = 3;
            }
            linearLayout2.setGravity(i);
            viewGroup.addView(this.h);
            int i8 = 0;
            while (i8 < i4) {
                LinearLayout j = de9.j(context, 0);
                LinearLayout linearLayout3 = this.h;
                if (i8 != i6) {
                    f4 = 7.0f;
                } else {
                    f4 = 0.0f;
                }
                linearLayout3.addView(j, nme.k(0.0f, 0.0f, 0.0f, f4, -2, -2));
                int i9 = i8 << 1;
                TextView textView4 = new TextView(context);
                TextView[] textViewArr = this.n;
                textViewArr[i9] = textView4;
                int i10 = bkb.F6;
                zkb.X(textView4, i10, null);
                TextView textView5 = textViewArr[i9];
                if (k96.a0) {
                    i2 = i7;
                } else {
                    i2 = 3;
                }
                textView5.setGravity(i2);
                textViewArr[i9].setTextSize(1, f5);
                TextView textView6 = textViewArr[i9];
                if (k96.a0) {
                    str = ".%d";
                } else {
                    str = "%d.";
                }
                int i11 = i8 + 1;
                textView6.setText(String.format(str, Integer.valueOf(i11)));
                textViewArr[i9].setTypeface(gl.o());
                int i12 = i9 + 1;
                TextView textView7 = new TextView(context);
                textViewArr[i12] = textView7;
                zkb.X(textView7, i10, null);
                TextView textView8 = textViewArr[i12];
                if (k96.a0) {
                    i3 = 5;
                } else {
                    i3 = 3;
                }
                textView8.setGravity(i3);
                textViewArr[i12].setTextSize(1, f5);
                if (i8 == 0) {
                    zkb.G(textViewArr[i12], bkb.I6, null);
                    zkb.C(textViewArr[i12], bkb.J6, null);
                    String M0 = k96.M0(2131753889, null);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                    int indexOf = M0.indexOf(42);
                    int lastIndexOf = M0.lastIndexOf(42);
                    if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                        textViewArr[i12].setMovementMethod(new cl((byte) 0));
                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new g4c(k96.M0(2131753890, null), (vib) null), indexOf, lastIndexOf - 1, 33);
                    }
                    textViewArr[i12].setText(spannableStringBuilder);
                } else if (i8 == 1) {
                    textViewArr[i12].setText(k96.M0(2131753888, null));
                } else {
                    textViewArr[i12].setText(k96.M0(2131753887, null));
                }
                if (k96.a0) {
                    j.setGravity(5);
                    j.addView(textViewArr[i12], nme.l(1.0f, 0, -2));
                    j.addView(textViewArr[i9], nme.k(4.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    j.addView(textViewArr[i9], nme.k(0.0f, 0.0f, 4.0f, 0.0f, -2, -2));
                    j.addView(textViewArr[i12], nme.o(-2, -2));
                }
                i8 = i11;
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
        zkb.X(textView9, bkb.C6, null);
        this.r.setGravity(1);
        this.r.setLineSpacing(gl.L(f3), 1.0f);
        this.r.setTextSize(1, 13.0f);
        this.r.setVisibility(8);
        this.r.setPadding(gl.L(f), 0, gl.L(f), 0);
        viewGroup.addView(this.r);
        this.b = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        t8 t8Var = new t8(this, context);
        this.c = t8Var;
        ote.b(t8Var, 0.02f, 1.2f);
        this.c.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
        this.c.setGravity(17);
        zkb.X(this.c, bkb.Ii, null);
        this.c.setTextSize(1, 14.0f);
        this.c.setTypeface(gl.o());
        t8 t8Var2 = this.c;
        int L = gl.L(f2);
        int i13 = bkb.Gi;
        int w0 = bkb.w0(null, i13, false);
        zkb.R(t8Var2, bkb.i0(L, L, L, L, 0, w0, w0), null, zkb.M(i13), null);
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
                                            t36 t36Var = u8Var.E;
                                            if (t36Var != null) {
                                                gl.d3(t36Var);
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
                                        da1.i0(u8Var.getParentActivity(), 1, new i4d(u8Var));
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u8Var.getParentActivity());
                                alertDialog$Builder.a.S = k96.M0(2131747094, null);
                                alertDialog$Builder.a.U = k96.M0(2131747096, null);
                                alertDialog$Builder.j(k96.M0(2131752540, null), new o8(u8Var, (byte) 1));
                                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                u8Var.showDialog(alertDialog$Builder.a);
                                return;
                            }
                            u8Var.presentFragment(new yh1(ls6.j(0, "step")), true);
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
                                                            t36 t36Var = u8Var.E;
                                                            if (t36Var != null) {
                                                                gl.d3(t36Var);
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
                                                        da1.i0(u8Var.getParentActivity(), 1, new i4d(u8Var));
                                                        return;
                                                    } else {
                                                        return;
                                                    }
                                                }
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u8Var.getParentActivity());
                                                alertDialog$Builder.a.S = k96.M0(2131747094, null);
                                                alertDialog$Builder.a.U = k96.M0(2131747096, null);
                                                alertDialog$Builder.j(k96.M0(2131752540, null), new o8(u8Var, (byte) 1));
                                                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                                u8Var.showDialog(alertDialog$Builder.a);
                                                return;
                                            }
                                            u8Var.presentFragment(new yh1(ls6.j(0, "step")), true);
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
                        this.e.setText(k96.M0(2131747464, null));
                        this.f.setText(k96.M0(2131752530, null));
                        this.c.setText(k96.M0(2131751143, null));
                        this.a.d();
                        this.x = true;
                    }
                } else {
                    int[] iArr = new int[8];
                    this.s = iArr;
                    this.a.f(2131624170, 334, 334, iArr);
                    this.a.setScaleType(ImageView.ScaleType.CENTER);
                    this.e.setText(k96.M0(2131753891, null));
                    this.c.setText(k96.M0(2131753882, null));
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
                                                    t36 t36Var = u8Var.E;
                                                    if (t36Var != null) {
                                                        gl.d3(t36Var);
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
                                                da1.i0(u8Var.getParentActivity(), 1, new i4d(u8Var));
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u8Var.getParentActivity());
                                        alertDialog$Builder.a.S = k96.M0(2131747094, null);
                                        alertDialog$Builder.a.U = k96.M0(2131747096, null);
                                        alertDialog$Builder.j(k96.M0(2131752540, null), new o8(u8Var, (byte) 1));
                                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                        u8Var.showDialog(alertDialog$Builder.a);
                                        return;
                                    }
                                    u8Var.presentFragment(new yh1(ls6.j(0, "step")), true);
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
                y6c userConfig = getUserConfig();
                TLRPC.User V1 = getMessagesController().V1(Long.valueOf(userConfig.n));
                if (V1 == null) {
                    V1 = userConfig.f();
                }
                if (V1 != null) {
                    this.d.setText(k96.a0("PhoneNumberKeepButton", null, 2131747091, yjb.k(new StringBuilder("+"), V1.phone, p38.f())));
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
                                                    t36 t36Var = u8Var.E;
                                                    if (t36Var != null) {
                                                        gl.d3(t36Var);
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
                                                da1.i0(u8Var.getParentActivity(), 1, new i4d(u8Var));
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(u8Var.getParentActivity());
                                        alertDialog$Builder.a.S = k96.M0(2131747094, null);
                                        alertDialog$Builder.a.U = k96.M0(2131747096, null);
                                        alertDialog$Builder.j(k96.M0(2131752540, null), new o8(u8Var, (byte) 1));
                                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                        u8Var.showDialog(alertDialog$Builder.a);
                                        return;
                                    }
                                    u8Var.presentFragment(new yh1(ls6.j(0, "step")), true);
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
                this.e.setText(k96.M0(2131747095, null));
                this.f.setText(gl.T2(k96.M0(2131747092, null)));
                this.c.setText(k96.M0(2131747095, null));
                this.a.d();
                this.x = true;
            }
        } else {
            this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.a.f(2131623973, 200, 200, null);
            this.e.setText(k96.M0(2131752456, null));
            this.f.setText(k96.M0(2131752457, null));
            this.c.setText(k96.M0(2131752458, null));
            this.a.d();
            this.x = true;
        }
        if (this.x) {
            this.c.setPadding(gl.L(34.0f), gl.L(8.0f), gl.L(34.0f), gl.L(8.0f));
            this.c.setTextSize(1, 15.0f);
        }
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        int i = bkb.Ei;
        int themedColor = getThemedColor(i);
        int themedColor2 = getThemedColor(bkb.Fi);
        boolean z = this.H;
        int[] iArr = this.F;
        if (!z || iArr[0] != themedColor || iArr[1] != themedColor2) {
            iArr[0] = themedColor;
            iArr[1] = themedColor2;
            this.H = true;
            this.b.setColors(iArr);
        }
        this.c.setTextColor(bkb.w0(null, bkb.Ii, false));
        int w0 = bkb.w0(null, bkb.Gi, false);
        if (this.c.getBackground() == null) {
            t8 t8Var = this.c;
            int L = gl.L(24.0f);
            t8Var.setBackground(bkb.i0(L, L, L, L, 0, w0, w0));
        } else if (w0 != this.G) {
            bkb.F1(this.c.getBackground(), w0, true);
        }
        this.G = w0;
        int[] iArr2 = this.s;
        if (iArr2 != null && this.a != null) {
            iArr2[0] = 3355443;
            iArr2[1] = bkb.w0(null, bkb.F6, false);
            int[] iArr3 = this.s;
            iArr3[2] = 16777215;
            int i2 = bkb.c6;
            iArr3[3] = bkb.w0(null, i2, false);
            int[] iArr4 = this.s;
            iArr4[4] = 5285866;
            iArr4[5] = bkb.w0(null, i, false);
            int[] iArr5 = this.s;
            iArr5[6] = 2170912;
            iArr5[7] = bkb.w0(null, i2, false);
            ry8 ry8Var = this.a;
            int[] iArr6 = this.s;
            oy8 oy8Var = ry8Var.b;
            if (oy8Var != null) {
                oy8Var.n = iArr6;
                oy8Var.B();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        TextView[] textViewArr = this.n;
        TextView textView = textViewArr[0];
        int i = bkb.F6;
        arrayList.add(new blb(textView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(textViewArr[1], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(textViewArr[1], 2, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.I6));
        arrayList.add(new blb(textViewArr[2], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(textViewArr[3], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(textViewArr[4], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(textViewArr[5], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (bm2.h(bkb.w0(null, bkb.c6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                da1.i0(getParentActivity(), 1, new i4d(this));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.U = gl.T2(k96.M0(2131746310, null));
            alertDialog$Builder.j(k96.M0(2131747107, null), new o8(this, (byte) 0));
            alertDialog$Builder.g(k96.M0(2131751760, null), null);
            int i2 = bkb.K5;
            alertDialog$Builder.l(2131624117, 72, bkb.w0(null, i2, false), null);
            alertDialog$Builder.m(i2, null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        d0();
    }
}

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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PasscodeActivity;
public final class v8 extends e {
    public w56 E;
    public final int[] F;
    public int G;
    public boolean H;
    public e29 a;
    public GradientDrawable b;
    public u8 c;
    public TextView d;
    public TextView e;
    public TextView f;
    public LinearLayout h;
    public final TextView[] n;
    public TextView r;
    public int[] s;
    public final byte w;
    public boolean x;
    public u34 y;

    public v8(int i) {
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
            yob.h(aob.d6, null, aVar);
            this.actionBar.setBackButtonImage(2131231243);
            yob.l(this.actionBar, 1, aob.v8, null);
            yob.l(this.actionBar, 3, aob.t8, null);
            this.actionBar.setCastShadows(false);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 0));
        }
        t8 t8Var = new t8(this, context, (byte) 0);
        this.fragmentView = t8Var;
        yob.h(aob.d6, null, t8Var);
        ViewGroup viewGroup = (ViewGroup) this.fragmentView;
        viewGroup.setOnTouchListener(new q8((byte) 0));
        a aVar2 = this.actionBar;
        if (aVar2 != null) {
            viewGroup.addView(aVar2);
        }
        ?? imageView = new ImageView(context);
        this.a = imageView;
        viewGroup.addView(imageView);
        TextView textView = new TextView(context);
        this.e = textView;
        int i5 = aob.G6;
        yob.X(textView, i5, null);
        this.e.setGravity(1);
        this.e.setPadding(hl.L(32.0f), 0, hl.L(32.0f), 0);
        this.e.setTextSize(1, 24.0f);
        viewGroup.addView(this.e);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        byte b = this.w;
        if (b == 3) {
            i5 = aob.Fi;
        }
        yob.X(textView2, i5, null);
        this.d.setGravity(1);
        float f5 = 15.0f;
        this.d.setTextSize(1, 15.0f);
        this.d.setSingleLine(true);
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        this.d.setPadding(hl.L(32.0f), 0, hl.L(32.0f), 0);
        this.d.setVisibility(8);
        viewGroup.addView(this.d);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        yob.X(textView3, aob.D6, null);
        this.f.setGravity(1);
        this.f.setLineSpacing(hl.L(2.0f), 1.0f);
        this.f.setTextSize(1, 15.0f);
        if (b != 6 && b != 3) {
            f = 32.0f;
            f2 = 24.0f;
            this.f.setPadding(hl.L(32.0f), 0, hl.L(32.0f), 0);
        } else {
            f = 32.0f;
            f2 = 24.0f;
            this.f.setPadding(hl.L(48.0f), 0, hl.L(48.0f), 0);
        }
        viewGroup.addView(this.f);
        int i6 = 2;
        int i7 = 5;
        if (b == 5) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.h = linearLayout;
            linearLayout.setOrientation(1);
            f3 = 2.0f;
            this.h.setPadding(hl.L(f2), 0, hl.L(f2), 0);
            LinearLayout linearLayout2 = this.h;
            if (ob6.a0) {
                i = 5;
            } else {
                i = 3;
            }
            linearLayout2.setGravity(i);
            viewGroup.addView(this.h);
            int i8 = 0;
            while (i8 < i4) {
                LinearLayout j = uh9.j(context, 0);
                LinearLayout linearLayout3 = this.h;
                if (i8 != i6) {
                    f4 = 7.0f;
                } else {
                    f4 = 0.0f;
                }
                linearLayout3.addView(j, tre.k(0.0f, 0.0f, 0.0f, f4, -2, -2));
                int i9 = i8 << 1;
                TextView textView4 = new TextView(context);
                TextView[] textViewArr = this.n;
                textViewArr[i9] = textView4;
                int i10 = aob.G6;
                yob.X(textView4, i10, null);
                TextView textView5 = textViewArr[i9];
                if (ob6.a0) {
                    i2 = i7;
                } else {
                    i2 = 3;
                }
                textView5.setGravity(i2);
                textViewArr[i9].setTextSize(1, f5);
                TextView textView6 = textViewArr[i9];
                if (ob6.a0) {
                    str = ".%d";
                } else {
                    str = "%d.";
                }
                int i11 = i8 + 1;
                textView6.setText(String.format(str, Integer.valueOf(i11)));
                textViewArr[i9].setTypeface(hl.o());
                int i12 = i9 + 1;
                TextView textView7 = new TextView(context);
                textViewArr[i12] = textView7;
                yob.X(textView7, i10, null);
                TextView textView8 = textViewArr[i12];
                if (ob6.a0) {
                    i3 = 5;
                } else {
                    i3 = 3;
                }
                textView8.setGravity(i3);
                textViewArr[i12].setTextSize(1, f5);
                if (i8 == 0) {
                    yob.G(textViewArr[i12], aob.J6, null);
                    yob.C(textViewArr[i12], aob.K6, null);
                    String M0 = ob6.M0(2131753885, null);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                    int indexOf = M0.indexOf(42);
                    int lastIndexOf = M0.lastIndexOf(42);
                    if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                        textViewArr[i12].setMovementMethod(new dl((byte) 0));
                        spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                        spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                        spannableStringBuilder.setSpan(new f8c(ob6.M0(2131753886, null), (rmb) null), indexOf, lastIndexOf - 1, 33);
                    }
                    textViewArr[i12].setText(spannableStringBuilder);
                } else if (i8 == 1) {
                    textViewArr[i12].setText(ob6.M0(2131753884, null));
                } else {
                    textViewArr[i12].setText(ob6.M0(2131753883, null));
                }
                if (ob6.a0) {
                    j.setGravity(5);
                    j.addView(textViewArr[i12], tre.l(1.0f, 0, -2));
                    j.addView(textViewArr[i9], tre.k(4.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    j.addView(textViewArr[i9], tre.k(0.0f, 0.0f, 4.0f, 0.0f, -2, -2));
                    j.addView(textViewArr[i12], tre.o(-2, -2));
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
        yob.X(textView9, aob.D6, null);
        this.r.setGravity(1);
        this.r.setLineSpacing(hl.L(f3), 1.0f);
        this.r.setTextSize(1, 13.0f);
        this.r.setVisibility(8);
        this.r.setPadding(hl.L(f), 0, hl.L(f), 0);
        viewGroup.addView(this.r);
        this.b = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        u8 u8Var = new u8(this, context);
        this.c = u8Var;
        iye.b(u8Var, 0.02f, 1.2f);
        this.c.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
        this.c.setGravity(17);
        yob.X(this.c, aob.Ji, null);
        this.c.setTextSize(1, 14.0f);
        this.c.setTypeface(hl.o());
        u8 u8Var2 = this.c;
        int L = hl.L(f2);
        int i13 = aob.Hi;
        int w0 = aob.w0(null, i13, false);
        yob.R(u8Var2, aob.i0(L, L, L, L, 0, w0, w0), null, yob.M(i13), null);
        viewGroup.addView(this.c);
        this.c.setOnClickListener(new View.OnClickListener(this) {
            public final v8 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b2 = r2;
                v8 v8Var = this.b;
                switch (b2) {
                    case 0:
                        if (v8Var.getParentActivity() != null) {
                            byte b3 = v8Var.w;
                            if (b3 != 0) {
                                if (b3 != 3) {
                                    if (b3 != 5) {
                                        if (b3 == 6) {
                                            v8Var.presentFragment(new PasscodeActivity(1), true);
                                            w56 w56Var = v8Var.E;
                                            if (w56Var != null) {
                                                hl.c3(w56Var);
                                                v8Var.E = null;
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    } else if (v8Var.getParentActivity() != null) {
                                        if (v8Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                            v8Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                            return;
                                        }
                                        la1.i0(v8Var.getParentActivity(), 1, new z8d(v8Var, (byte) 3));
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v8Var.getParentActivity());
                                alertDialog$Builder.a.S = ob6.M0(2131747014, null);
                                alertDialog$Builder.a.U = ob6.M0(2131747016, null);
                                alertDialog$Builder.j(ob6.M0(2131752533, null), new p8(v8Var, (byte) 1));
                                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                v8Var.showDialog(alertDialog$Builder.a);
                                return;
                            }
                            v8Var.presentFragment(new gi1(qu6.j(0, "step")), true);
                            return;
                        }
                        return;
                    case 1:
                        if (!v8Var.a.getAnimatedDrawable().l0) {
                            v8Var.a.getAnimatedDrawable().I(0, false, false);
                            v8Var.a.d();
                            return;
                        }
                        return;
                    case 2:
                        if (!v8Var.a.getAnimatedDrawable().l0) {
                            v8Var.a.getAnimatedDrawable().I(0, false, false);
                            v8Var.a.d();
                            return;
                        }
                        return;
                    default:
                        ((ActionBarLayout) v8Var.getParentLayout()).j(true, false);
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
                            public final v8 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                byte b2 = r2;
                                v8 v8Var = this.b;
                                switch (b2) {
                                    case 0:
                                        if (v8Var.getParentActivity() != null) {
                                            byte b3 = v8Var.w;
                                            if (b3 != 0) {
                                                if (b3 != 3) {
                                                    if (b3 != 5) {
                                                        if (b3 == 6) {
                                                            v8Var.presentFragment(new PasscodeActivity(1), true);
                                                            w56 w56Var = v8Var.E;
                                                            if (w56Var != null) {
                                                                hl.c3(w56Var);
                                                                v8Var.E = null;
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    } else if (v8Var.getParentActivity() != null) {
                                                        if (v8Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                                            v8Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                                            return;
                                                        }
                                                        la1.i0(v8Var.getParentActivity(), 1, new z8d(v8Var, (byte) 3));
                                                        return;
                                                    } else {
                                                        return;
                                                    }
                                                }
                                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v8Var.getParentActivity());
                                                alertDialog$Builder.a.S = ob6.M0(2131747014, null);
                                                alertDialog$Builder.a.U = ob6.M0(2131747016, null);
                                                alertDialog$Builder.j(ob6.M0(2131752533, null), new p8(v8Var, (byte) 1));
                                                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                                v8Var.showDialog(alertDialog$Builder.a);
                                                return;
                                            }
                                            v8Var.presentFragment(new gi1(qu6.j(0, "step")), true);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        if (!v8Var.a.getAnimatedDrawable().l0) {
                                            v8Var.a.getAnimatedDrawable().I(0, false, false);
                                            v8Var.a.d();
                                            return;
                                        }
                                        return;
                                    case 2:
                                        if (!v8Var.a.getAnimatedDrawable().l0) {
                                            v8Var.a.getAnimatedDrawable().I(0, false, false);
                                            v8Var.a.d();
                                            return;
                                        }
                                        return;
                                    default:
                                        ((ActionBarLayout) v8Var.getParentLayout()).j(true, false);
                                        return;
                                }
                            }
                        });
                        this.e.setText(ob6.M0(2131747384, null));
                        this.f.setText(ob6.M0(2131752523, null));
                        this.c.setText(ob6.M0(2131751120, null));
                        this.a.d();
                        this.x = true;
                    }
                } else {
                    int[] iArr = new int[8];
                    this.s = iArr;
                    this.a.f(2131624169, 334, 334, iArr);
                    this.a.setScaleType(ImageView.ScaleType.CENTER);
                    this.e.setText(ob6.M0(2131753887, null));
                    this.c.setText(ob6.M0(2131753878, null));
                    this.a.d();
                }
            } else {
                this.d.setVisibility(0);
                this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.a.f(2131624313, 200, 200, null);
                this.a.setOnClickListener(new View.OnClickListener(this) {
                    public final v8 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b2 = r2;
                        v8 v8Var = this.b;
                        switch (b2) {
                            case 0:
                                if (v8Var.getParentActivity() != null) {
                                    byte b3 = v8Var.w;
                                    if (b3 != 0) {
                                        if (b3 != 3) {
                                            if (b3 != 5) {
                                                if (b3 == 6) {
                                                    v8Var.presentFragment(new PasscodeActivity(1), true);
                                                    w56 w56Var = v8Var.E;
                                                    if (w56Var != null) {
                                                        hl.c3(w56Var);
                                                        v8Var.E = null;
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            } else if (v8Var.getParentActivity() != null) {
                                                if (v8Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                                    v8Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                                    return;
                                                }
                                                la1.i0(v8Var.getParentActivity(), 1, new z8d(v8Var, (byte) 3));
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v8Var.getParentActivity());
                                        alertDialog$Builder.a.S = ob6.M0(2131747014, null);
                                        alertDialog$Builder.a.U = ob6.M0(2131747016, null);
                                        alertDialog$Builder.j(ob6.M0(2131752533, null), new p8(v8Var, (byte) 1));
                                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                        v8Var.showDialog(alertDialog$Builder.a);
                                        return;
                                    }
                                    v8Var.presentFragment(new gi1(qu6.j(0, "step")), true);
                                    return;
                                }
                                return;
                            case 1:
                                if (!v8Var.a.getAnimatedDrawable().l0) {
                                    v8Var.a.getAnimatedDrawable().I(0, false, false);
                                    v8Var.a.d();
                                    return;
                                }
                                return;
                            case 2:
                                if (!v8Var.a.getAnimatedDrawable().l0) {
                                    v8Var.a.getAnimatedDrawable().I(0, false, false);
                                    v8Var.a.d();
                                    return;
                                }
                                return;
                            default:
                                ((ActionBarLayout) v8Var.getParentLayout()).j(true, false);
                                return;
                        }
                    }
                });
                yac userConfig = getUserConfig();
                TLRPC.User X1 = getMessagesController().X1(Long.valueOf(userConfig.n));
                if (X1 == null) {
                    X1 = userConfig.f();
                }
                if (X1 != null) {
                    this.d.setText(ob6.a0("PhoneNumberKeepButton", null, 2131747011, xnb.k(new StringBuilder("+"), X1.phone, f78.f())));
                }
                this.d.setOnClickListener(new View.OnClickListener(this) {
                    public final v8 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b2 = r2;
                        v8 v8Var = this.b;
                        switch (b2) {
                            case 0:
                                if (v8Var.getParentActivity() != null) {
                                    byte b3 = v8Var.w;
                                    if (b3 != 0) {
                                        if (b3 != 3) {
                                            if (b3 != 5) {
                                                if (b3 == 6) {
                                                    v8Var.presentFragment(new PasscodeActivity(1), true);
                                                    w56 w56Var = v8Var.E;
                                                    if (w56Var != null) {
                                                        hl.c3(w56Var);
                                                        v8Var.E = null;
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            } else if (v8Var.getParentActivity() != null) {
                                                if (v8Var.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                                    v8Var.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                                                    return;
                                                }
                                                la1.i0(v8Var.getParentActivity(), 1, new z8d(v8Var, (byte) 3));
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v8Var.getParentActivity());
                                        alertDialog$Builder.a.S = ob6.M0(2131747014, null);
                                        alertDialog$Builder.a.U = ob6.M0(2131747016, null);
                                        alertDialog$Builder.j(ob6.M0(2131752533, null), new p8(v8Var, (byte) 1));
                                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                        v8Var.showDialog(alertDialog$Builder.a);
                                        return;
                                    }
                                    v8Var.presentFragment(new gi1(qu6.j(0, "step")), true);
                                    return;
                                }
                                return;
                            case 1:
                                if (!v8Var.a.getAnimatedDrawable().l0) {
                                    v8Var.a.getAnimatedDrawable().I(0, false, false);
                                    v8Var.a.d();
                                    return;
                                }
                                return;
                            case 2:
                                if (!v8Var.a.getAnimatedDrawable().l0) {
                                    v8Var.a.getAnimatedDrawable().I(0, false, false);
                                    v8Var.a.d();
                                    return;
                                }
                                return;
                            default:
                                ((ActionBarLayout) v8Var.getParentLayout()).j(true, false);
                                return;
                        }
                    }
                });
                this.e.setText(ob6.M0(2131747015, null));
                this.f.setText(hl.S2(ob6.M0(2131747012, null)));
                this.c.setText(ob6.M0(2131747015, null));
                this.a.d();
                this.x = true;
            }
        } else {
            this.a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.a.f(2131623973, 200, 200, null);
            this.e.setText(ob6.M0(2131752443, null));
            this.f.setText(ob6.M0(2131752444, null));
            this.c.setText(ob6.M0(2131752445, null));
            this.a.d();
            this.x = true;
        }
        if (this.x) {
            this.c.setPadding(hl.L(34.0f), hl.L(8.0f), hl.L(34.0f), hl.L(8.0f));
            this.c.setTextSize(1, 15.0f);
        }
        d0();
        return this.fragmentView;
    }

    public final void d0() {
        int i = aob.Fi;
        int themedColor = getThemedColor(i);
        int themedColor2 = getThemedColor(aob.Gi);
        boolean z = this.H;
        int[] iArr = this.F;
        if (!z || iArr[0] != themedColor || iArr[1] != themedColor2) {
            iArr[0] = themedColor;
            iArr[1] = themedColor2;
            this.H = true;
            this.b.setColors(iArr);
        }
        this.c.setTextColor(aob.w0(null, aob.Ji, false));
        int w0 = aob.w0(null, aob.Hi, false);
        if (this.c.getBackground() == null) {
            u8 u8Var = this.c;
            int L = hl.L(24.0f);
            u8Var.setBackground(aob.i0(L, L, L, L, 0, w0, w0));
        } else if (w0 != this.G) {
            aob.F1(this.c.getBackground(), w0, true);
        }
        this.G = w0;
        int[] iArr2 = this.s;
        if (iArr2 != null && this.a != null) {
            iArr2[0] = 3355443;
            iArr2[1] = aob.w0(null, aob.G6, false);
            int[] iArr3 = this.s;
            iArr3[2] = 16777215;
            int i2 = aob.d6;
            iArr3[3] = aob.w0(null, i2, false);
            int[] iArr4 = this.s;
            iArr4[4] = 5285866;
            iArr4[5] = aob.w0(null, i, false);
            int[] iArr5 = this.s;
            iArr5[6] = 2170912;
            iArr5[7] = aob.w0(null, i2, false);
            e29 e29Var = this.a;
            int[] iArr6 = this.s;
            b29 b29Var = e29Var.b;
            if (b29Var != null) {
                b29Var.n = iArr6;
                b29Var.B();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        TextView[] textViewArr = this.n;
        TextView textView = textViewArr[0];
        int i = aob.G6;
        arrayList.add(new apb(textView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(textViewArr[1], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(textViewArr[1], 2, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.J6));
        arrayList.add(new apb(textViewArr[2], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(textViewArr[3], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(textViewArr[4], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(textViewArr[5], 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (vm2.h(aob.w0(null, aob.d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                la1.i0(getParentActivity(), 1, new z8d(this, (byte) 3));
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.a.U = hl.S2(ob6.M0(2131746230, null));
            alertDialog$Builder.j(ob6.M0(2131747027, null), new p8(this, (byte) 0));
            alertDialog$Builder.g(ob6.M0(2131751737, null), null);
            int i2 = aob.L5;
            alertDialog$Builder.l(2131624117, 72, aob.w0(null, i2, false), null);
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

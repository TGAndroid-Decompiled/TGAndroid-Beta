package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class z16 extends n39 {
    public final h26 c;

    public z16(h26 h26Var) {
        this.c = h26Var;
    }

    @Override
    public final boolean D(s49 s49Var) {
        h26 h26Var = this.c;
        int i = h26Var.c2;
        if ((i != 11 && i != 34) || h26Var.T1) {
            int i2 = s49Var.f;
            if (i2 == 1 || i2 == 4) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.c.f2;
    }

    @Override
    public final int d(int i) {
        int i2;
        h26 h26Var = this.c;
        if (h26Var.g2 == i) {
            return 0;
        }
        if (h26Var.h2 == i) {
            return 2;
        }
        if (h26Var.i2 == i) {
            return 3;
        }
        if (h26Var.l2 == i) {
            return 5;
        }
        if (h26Var.m2 == i) {
            return 6;
        }
        if (h26Var.U1 == i) {
            return 7;
        }
        if (h26Var.n2 == i) {
            return 8;
        }
        ArrayList arrayList = h26Var.p2;
        if (arrayList != null && i >= (i2 = h26Var.o2) && i <= arrayList.size() + i2) {
            return 9;
        }
        int i3 = h26Var.c2;
        if (i3 != 5 && i3 != 11 && i3 != 34) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        String str;
        boolean z;
        TL_account.requirementToContactPremium requirementtocontactpremium;
        String d0;
        h26 h26Var = this.c;
        int i2 = h26Var.c2;
        HashSet hashSet = h26Var.t2;
        int i3 = s49Var.f;
        View view = s49Var.a;
        boolean z2 = false;
        boolean z3 = true;
        if (i3 != 1) {
            if (i3 != 9) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        za5 za5Var = (za5) view;
                        if (i2 == 5) {
                            TLRPC.Chat chat = (TLRPC.Chat) h26Var.u2.get(i - h26Var.j2);
                            String str2 = (String) h26Var.v2.get(i - h26Var.j2);
                            String str3 = chat.title;
                            if (i == h26Var.k2 - 1.0f) {
                                z3 = false;
                            }
                            za5Var.e(chat, str3, str2, z3);
                            za5Var.c(hashSet.contains(chat), false);
                            return;
                        } else if (i2 == 11 || i2 == 34) {
                            TLRPC.User user = (TLRPC.User) h26Var.w2.get(i - h26Var.j2);
                            ArrayList arrayList = h26Var.x2;
                            if (arrayList != null && arrayList.contains(Long.valueOf(user.id))) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                requirementtocontactpremium = new TL_account.requirementToContactPremium();
                            } else {
                                requirementtocontactpremium = null;
                            }
                            za5Var.S = true;
                            za5Var.R = requirementtocontactpremium;
                            za5Var.g();
                            if (z) {
                                d0 = k96.M0(2131748934, null);
                            } else {
                                d0 = k96.d0(h26Var.a, user, null, null);
                            }
                            String m = qu2.m(0, user.first_name, user.last_name);
                            if (i == h26Var.k2 - 1.0f) {
                                z3 = false;
                            }
                            za5Var.e(user, m, d0, z3);
                            za5Var.c(hashSet.contains(user), false);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                ld5 ld5Var = (ld5) view;
                if (i2 != 11 && i2 != 34) {
                    if (i2 == 2) {
                        ld5Var.setText(k96.M0(2131742528, null));
                        return;
                    } else {
                        ld5Var.setText(k96.M0(2131748841, null));
                        return;
                    }
                } else if (h26Var.T1) {
                    ld5Var.setText(k96.M0(2131752390, null));
                    return;
                } else if (h26Var.w2.size() == 1) {
                    ld5Var.setText(k96.M0(2131752387, null));
                    return;
                } else {
                    ld5Var.setText(k96.M0(2131752386, null));
                    return;
                }
            }
            int i4 = i - h26Var.o2;
            ArrayList arrayList2 = h26Var.p2;
            if (arrayList2 != null && i4 >= 0 && i4 < arrayList2.size()) {
                c26 c26Var = (c26) view;
                b26 b26Var = (b26) h26Var.p2.get(i4);
                jo0 jo0Var = c26Var.c;
                ImageView imageView = c26Var.a;
                jia jiaVar = c26Var.b;
                if (b26Var instanceof a26) {
                    c26Var.f = (a26) b26Var;
                    c26Var.e = null;
                    imageView.setVisibility(8);
                    jiaVar.setVisibility(8);
                    jo0Var.setVisibility(0);
                    jia jiaVar2 = c26Var.d;
                    a26 a26Var = c26Var.f;
                    if (a26Var.h) {
                        str = "BoostLevelUnlocks";
                    } else {
                        str = "BoostLevel";
                    }
                    jiaVar2.l(k96.G(a26Var.g, str, new Object[0]), false);
                    return;
                } else if (b26Var != null) {
                    c26Var.f = null;
                    c26Var.e = b26Var;
                    imageView.setVisibility(0);
                    imageView.setImageResource(c26Var.e.a);
                    jiaVar.setVisibility(0);
                    b26 b26Var2 = c26Var.e;
                    if (b26Var2.d != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(c26Var.e.d);
                        sb.append("_");
                        int i5 = c26Var.e.e;
                        k96.D0();
                        sb.append(k96.f1(k96.D0().A.a(i5)));
                        String N0 = k96.N0(sb.toString());
                        if (N0.startsWith("LOC_ERR")) {
                            N0 = k96.N0(c26Var.e.d + "_other");
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
                        int indexOf = N0.indexOf("%d");
                        if (indexOf >= 0) {
                            spannableStringBuilder = new SpannableStringBuilder(N0);
                            SpannableString spannableString = new SpannableString(de9.l(new StringBuilder(), c26Var.e.e, ""));
                            spannableString.setSpan(new z3c(gl.o()), 0, spannableString.length(), 33);
                            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                        }
                        jiaVar.l(spannableStringBuilder, false);
                    } else {
                        String M0 = k96.M0(b26Var2.b, null);
                        if (c26Var.e.c != null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(M0);
                            int indexOf2 = M0.indexOf("%s");
                            if (indexOf2 >= 0) {
                                spannableStringBuilder2 = new SpannableStringBuilder(M0);
                                SpannableString spannableString2 = new SpannableString(c26Var.e.c);
                                spannableString2.setSpan(new z3c(gl.o()), 0, spannableString2.length(), 33);
                                spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                            }
                            jiaVar.l(spannableStringBuilder2, false);
                        } else {
                            jiaVar.l(M0, false);
                        }
                    }
                    jo0Var.setVisibility(8);
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        TLRPC.Chat chat2 = (TLRPC.Chat) h26Var.d2.get(i - h26Var.j2);
        jb jbVar = (jb) view;
        TLRPC.Chat currentChannel = jbVar.getCurrentChannel();
        jbVar.a(chat2, false);
        boolean contains = hashSet.contains(chat2);
        if (currentChannel == chat2) {
            z2 = true;
        }
        jbVar.r.a(contains, z2);
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        int i2;
        float f;
        f26 f26Var;
        LinearLayout linearLayout;
        int i3;
        Context context = viewGroup.getContext();
        h26 h26Var = this.c;
        switch (i) {
            case 1:
                linearLayout = new jb(context, new y16(this), true, 9);
                f26Var = linearLayout;
                break;
            case 2:
                int i4 = bkb.Z6;
                View b9aVar = new b9a(context, bkb.v0(i4, h26Var.J0), 0);
                zkb.h(i4, h26Var.J0, b9aVar);
                f26Var = b9aVar;
                break;
            case 3:
                View ld5Var = new ld5(context);
                ld5Var.setPadding(0, 0, 0, gl.L(8.0f));
                f26Var = ld5Var;
                break;
            case 4:
                View za5Var = new za5(1, 0, h26Var.J0, context, false, false);
                int i5 = h26Var.u0;
                za5Var.setPadding(i5, 0, i5, 0);
                f26Var = za5Var;
                break;
            case 5:
                pi4 pi4Var = new pi4(context, null);
                if (h26Var.c2 == 2) {
                    i2 = 22;
                } else {
                    i2 = 21;
                }
                pi4Var.setViewType(i2);
                pi4Var.setIsSingleCell(true);
                pi4Var.setIgnoreHeightCheck(true);
                pi4Var.setItemsCount(10);
                f26Var = pi4Var;
                break;
            case 6:
                f26Var = new d62(h26Var.getContext(), (byte) 11);
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(h26Var.getContext());
                frameLayout.setPadding(gl.L(6.0f) + h26Var.u0, 0, gl.L(6.0f) + h26Var.u0, 0);
                TextView textView = new TextView(context);
                if (h26Var.L2 == null && hc2.N(h26Var.e1())) {
                    h26Var.L2 = new tp5(this, (byte) 10);
                }
                int L = gl.L(18.0f);
                int L2 = gl.L(13.0f);
                if (h26Var.L2 == null) {
                    f = 18.0f;
                } else {
                    f = 50.0f;
                }
                textView.setPadding(L, L2, gl.L(f), gl.L(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, nme.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int L3 = gl.L(8.0f);
                int i6 = bkb.d7;
                int v0 = bkb.v0(i6, h26Var.J0);
                int i7 = bkb.h6;
                int o = bm2.o(bkb.v0(i7, h26Var.J0), 76);
                ff0 i0 = bkb.i0(L3, L3, L3, L3, v0, o, o);
                vkb M = zkb.M(i6);
                vkb g = zkb.g(i7, 76);
                wjb wjbVar = h26Var.J0;
                textView.setBackground(i0);
                zkb.j(textView, i0, M, g, wjbVar);
                zkb.X(textView, bkb.F6, h26Var.J0);
                textView.setOnClickListener(new View.OnClickListener(this) {
                    public final z16 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b = r2;
                        z16 z16Var = this.b;
                        switch (b) {
                            case 0:
                                h26 h26Var2 = z16Var.c;
                                dn0.D0(h26Var2.r1, h26Var2.J0, h26Var2.V1, null);
                                return;
                            case 1:
                                h26 h26Var3 = z16Var.c;
                                gl.g(h26Var3.b1());
                                h26Var3.dismiss();
                                return;
                            case 2:
                                gl.g(z16Var.c.b1());
                                return;
                            default:
                                h26 h26Var4 = z16Var.c;
                                h26Var4.L2.run();
                                h26Var4.dismiss();
                                return;
                        }
                    }
                });
                if (h26Var.L2 != null) {
                    ImageView imageView = new ImageView(h26Var.getContext());
                    imageView.setImageResource(2131232383);
                    zkb.s(imageView, bkb.i5, h26Var.J0, PorterDuff.Mode.SRC_ATOP);
                    imageView.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
                    int L4 = gl.L(20.0f);
                    int o2 = bm2.o(bkb.v0(i7, h26Var.J0), 76);
                    ff0 i02 = bkb.i0(L4, L4, L4, L4, 0, o2, o2);
                    vkb g2 = zkb.g(i7, 76);
                    wjb wjbVar2 = h26Var.J0;
                    imageView.setBackground(i02);
                    zkb.j(imageView, i02, null, g2, wjbVar2);
                    frameLayout.addView(imageView, nme.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    imageView.setOnClickListener(new View.OnClickListener(this) {
                        public final z16 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            byte b = r2;
                            z16 z16Var = this.b;
                            switch (b) {
                                case 0:
                                    h26 h26Var2 = z16Var.c;
                                    dn0.D0(h26Var2.r1, h26Var2.J0, h26Var2.V1, null);
                                    return;
                                case 1:
                                    h26 h26Var3 = z16Var.c;
                                    gl.g(h26Var3.b1());
                                    h26Var3.dismiss();
                                    return;
                                case 2:
                                    gl.g(z16Var.c.b1());
                                    return;
                                default:
                                    h26 h26Var4 = z16Var.c;
                                    h26Var4.L2.run();
                                    h26Var4.dismiss();
                                    return;
                            }
                        }
                    });
                }
                textView.setText(h26Var.b1());
                textView.setGravity(17);
                f26Var = frameLayout;
                break;
            case 8:
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setPadding(gl.L(6.0f) + h26Var.u0, 0, gl.L(6.0f) + h26Var.u0, 0);
                linearLayout2.setOrientation(1);
                nf6 nf6Var = new nf6(context);
                l46 l46Var = new l46(context, null);
                if (h26Var.i1()) {
                    i3 = 2131753186;
                } else {
                    i3 = 2131753187;
                }
                SpannableStringBuilder S2 = gl.S2(k96.M0(i3, null));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131753185, null));
                spannableStringBuilder.setSpan(new r21(this, (byte) 7), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = h26Var.getContext().getResources().getDrawable(2131232064).mutate();
                int i8 = bkb.Wc;
                mutate.setColorFilter(new PorterDuffColorFilter(i8, PorterDuff.Mode.SRC_IN));
                cm2 cm2Var = new cm2(0, mutate);
                cm2Var.a(i8);
                cm2Var.c(gl.L(18.0f));
                cm2Var.F = gl.L(11.0f);
                cm2Var.r = -gl.L(5.0f);
                spannableString.setSpan(cm2Var, 0, spannableString.length(), 33);
                l46Var.setText(TextUtils.concat(S2, " ", gl.G2(spannableStringBuilder, spannableString, ">")));
                l46Var.setTextSize(1, 14.0f);
                l46Var.setLineSpacing(gl.L(3.0f), 1.0f);
                wjb wjbVar3 = h26Var.J0;
                if (wjbVar3 instanceof f53) {
                    zkb.X(l46Var, bkb.x6, wjbVar3);
                } else {
                    zkb.X(l46Var, bkb.F6, wjbVar3);
                }
                l46Var.setGravity(1);
                l46Var.setOnClickListener(new View.OnClickListener(this) {
                    public final z16 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b = r2;
                        z16 z16Var = this.b;
                        switch (b) {
                            case 0:
                                h26 h26Var2 = z16Var.c;
                                dn0.D0(h26Var2.r1, h26Var2.J0, h26Var2.V1, null);
                                return;
                            case 1:
                                h26 h26Var3 = z16Var.c;
                                gl.g(h26Var3.b1());
                                h26Var3.dismiss();
                                return;
                            case 2:
                                gl.g(z16Var.c.b1());
                                return;
                            default:
                                h26 h26Var4 = z16Var.c;
                                h26Var4.L2.run();
                                h26Var4.dismiss();
                                return;
                        }
                    }
                });
                nf6Var.setOnClickListener(new b95(l46Var, (byte) 16));
                if (h26Var.j1()) {
                    u41 u41Var = new u41(h26Var.J0, context, true);
                    u41Var.i(k96.M0(2131751755, null), false, true);
                    u41Var.setOnClickListener(new View.OnClickListener(this) {
                        public final z16 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            byte b = r2;
                            z16 z16Var = this.b;
                            switch (b) {
                                case 0:
                                    h26 h26Var2 = z16Var.c;
                                    dn0.D0(h26Var2.r1, h26Var2.J0, h26Var2.V1, null);
                                    return;
                                case 1:
                                    h26 h26Var3 = z16Var.c;
                                    gl.g(h26Var3.b1());
                                    h26Var3.dismiss();
                                    return;
                                case 2:
                                    gl.g(z16Var.c.b1());
                                    return;
                                default:
                                    h26 h26Var4 = z16Var.c;
                                    h26Var4.L2.run();
                                    h26Var4.dismiss();
                                    return;
                            }
                        }
                    });
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.addView(h26Var.B2, nme.q(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout3.addView(u41Var, nme.q(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout2.addView(linearLayout3, nme.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout2.addView(h26Var.A2, nme.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout2.addView(nf6Var, nme.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout2.addView(l46Var, nme.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                linearLayout = linearLayout2;
                f26Var = linearLayout;
                break;
            case 9:
                f26Var = new c26(h26Var, context, h26Var.J0);
                break;
            default:
                f26 f26Var2 = new f26(h26Var, context);
                h26Var.Y1 = f26Var2;
                f26Var = f26Var2;
                break;
        }
        return ls6.h(f26Var, f26Var, -1, -2);
    }
}

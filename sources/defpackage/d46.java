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
public final class d46 extends c79 {
    public final l46 c;

    public d46(l46 l46Var) {
        this.c = l46Var;
    }

    @Override
    public final boolean D(f89 f89Var) {
        l46 l46Var = this.c;
        int i = l46Var.c2;
        if ((i != 11 && i != 34) || l46Var.T1) {
            int i2 = f89Var.f;
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
        l46 l46Var = this.c;
        if (l46Var.g2 == i) {
            return 0;
        }
        if (l46Var.h2 == i) {
            return 2;
        }
        if (l46Var.i2 == i) {
            return 3;
        }
        if (l46Var.l2 == i) {
            return 5;
        }
        if (l46Var.m2 == i) {
            return 6;
        }
        if (l46Var.U1 == i) {
            return 7;
        }
        if (l46Var.n2 == i) {
            return 8;
        }
        ArrayList arrayList = l46Var.p2;
        if (arrayList != null && i >= (i2 = l46Var.o2) && i <= arrayList.size() + i2) {
            return 9;
        }
        int i3 = l46Var.c2;
        if (i3 != 5 && i3 != 11 && i3 != 34) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        String str;
        boolean z;
        TL_account.requirementToContactPremium requirementtocontactpremium;
        String d0;
        l46 l46Var = this.c;
        int i2 = l46Var.c2;
        HashSet hashSet = l46Var.t2;
        int i3 = f89Var.f;
        View view = f89Var.a;
        boolean z2 = false;
        boolean z3 = true;
        if (i3 != 1) {
            if (i3 != 9) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        bd5 bd5Var = (bd5) view;
                        if (i2 == 5) {
                            TLRPC.Chat chat = (TLRPC.Chat) l46Var.u2.get(i - l46Var.j2);
                            String str2 = (String) l46Var.v2.get(i - l46Var.j2);
                            String str3 = chat.title;
                            if (i == l46Var.k2 - 1.0f) {
                                z3 = false;
                            }
                            bd5Var.e(chat, str3, str2, z3);
                            bd5Var.c(hashSet.contains(chat), false);
                            return;
                        } else if (i2 == 11 || i2 == 34) {
                            TLRPC.User user = (TLRPC.User) l46Var.w2.get(i - l46Var.j2);
                            ArrayList arrayList = l46Var.x2;
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
                            bd5Var.S = true;
                            bd5Var.R = requirementtocontactpremium;
                            bd5Var.g();
                            if (z) {
                                d0 = ob6.M0(2131748880, null);
                            } else {
                                d0 = ob6.d0(l46Var.a, user, null, null);
                            }
                            String m = lv2.m(0, user.first_name, user.last_name);
                            if (i == l46Var.k2 - 1.0f) {
                                z3 = false;
                            }
                            bd5Var.e(user, m, d0, z3);
                            bd5Var.c(hashSet.contains(user), false);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                mf5 mf5Var = (mf5) view;
                if (i2 != 11 && i2 != 34) {
                    if (i2 == 2) {
                        mf5Var.setText(ob6.M0(2131742422, null));
                        return;
                    } else {
                        mf5Var.setText(ob6.M0(2131748787, null));
                        return;
                    }
                } else if (l46Var.T1) {
                    mf5Var.setText(ob6.M0(2131752374, null));
                    return;
                } else if (l46Var.w2.size() == 1) {
                    mf5Var.setText(ob6.M0(2131752371, null));
                    return;
                } else {
                    mf5Var.setText(ob6.M0(2131752370, null));
                    return;
                }
            }
            int i4 = i - l46Var.o2;
            ArrayList arrayList2 = l46Var.p2;
            if (arrayList2 != null && i4 >= 0 && i4 < arrayList2.size()) {
                g46 g46Var = (g46) view;
                f46 f46Var = (f46) l46Var.p2.get(i4);
                jo0 jo0Var = g46Var.c;
                ImageView imageView = g46Var.a;
                ema emaVar = g46Var.b;
                if (f46Var instanceof e46) {
                    g46Var.f = (e46) f46Var;
                    g46Var.e = null;
                    imageView.setVisibility(8);
                    emaVar.setVisibility(8);
                    jo0Var.setVisibility(0);
                    ema emaVar2 = g46Var.d;
                    e46 e46Var = g46Var.f;
                    if (e46Var.h) {
                        str = "BoostLevelUnlocks";
                    } else {
                        str = "BoostLevel";
                    }
                    emaVar2.l(ob6.G(e46Var.g, str, new Object[0]), false);
                    return;
                } else if (f46Var != null) {
                    g46Var.f = null;
                    g46Var.e = f46Var;
                    imageView.setVisibility(0);
                    imageView.setImageResource(g46Var.e.a);
                    emaVar.setVisibility(0);
                    f46 f46Var2 = g46Var.e;
                    if (f46Var2.d != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(g46Var.e.d);
                        sb.append("_");
                        int i5 = g46Var.e.e;
                        ob6.D0();
                        sb.append(ob6.f1(ob6.D0().A.a(i5)));
                        String N0 = ob6.N0(sb.toString());
                        if (N0.startsWith("LOC_ERR")) {
                            N0 = ob6.N0(g46Var.e.d + "_other");
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
                        int indexOf = N0.indexOf("%d");
                        if (indexOf >= 0) {
                            spannableStringBuilder = new SpannableStringBuilder(N0);
                            SpannableString spannableString = new SpannableString(uh9.l(new StringBuilder(), g46Var.e.e, ""));
                            spannableString.setSpan(new y7c(hl.o()), 0, spannableString.length(), 33);
                            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                        }
                        emaVar.l(spannableStringBuilder, false);
                    } else {
                        String M0 = ob6.M0(f46Var2.b, null);
                        if (g46Var.e.c != null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(M0);
                            int indexOf2 = M0.indexOf("%s");
                            if (indexOf2 >= 0) {
                                spannableStringBuilder2 = new SpannableStringBuilder(M0);
                                SpannableString spannableString2 = new SpannableString(g46Var.e.c);
                                spannableString2.setSpan(new y7c(hl.o()), 0, spannableString2.length(), 33);
                                spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                            }
                            emaVar.l(spannableStringBuilder2, false);
                        } else {
                            emaVar.l(M0, false);
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
        TLRPC.Chat chat2 = (TLRPC.Chat) l46Var.d2.get(i - l46Var.j2);
        kb kbVar = (kb) view;
        TLRPC.Chat currentChannel = kbVar.getCurrentChannel();
        kbVar.a(chat2, false);
        boolean contains = hashSet.contains(chat2);
        if (currentChannel == chat2) {
            z2 = true;
        }
        kbVar.r.a(contains, z2);
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        ViewGroup kbVar;
        int i2;
        j46 j46Var;
        float f;
        int i3;
        Context context = viewGroup.getContext();
        l46 l46Var = this.c;
        switch (i) {
            case 1:
                kbVar = new kb(context, new c46(this), true, 9);
                j46Var = kbVar;
                break;
            case 2:
                int i4 = aob.a7;
                View rcaVar = new rca(context, aob.v0(i4, l46Var.J0), 0);
                yob.h(i4, l46Var.J0, rcaVar);
                j46Var = rcaVar;
                break;
            case 3:
                View mf5Var = new mf5(context);
                mf5Var.setPadding(0, 0, 0, hl.L(8.0f));
                j46Var = mf5Var;
                break;
            case 4:
                View bd5Var = new bd5(1, 0, l46Var.J0, context, false, false);
                int i5 = l46Var.u0;
                bd5Var.setPadding(i5, 0, i5, 0);
                j46Var = bd5Var;
                break;
            case 5:
                tk4 tk4Var = new tk4(context, null);
                if (l46Var.c2 == 2) {
                    i2 = 22;
                } else {
                    i2 = 21;
                }
                tk4Var.setViewType(i2);
                tk4Var.setIsSingleCell(true);
                tk4Var.setIgnoreHeightCheck(true);
                tk4Var.setItemsCount(10);
                j46Var = tk4Var;
                break;
            case 6:
                j46Var = new t62(l46Var.getContext(), (byte) 11);
                break;
            case 7:
                kbVar = new FrameLayout(l46Var.getContext());
                kbVar.setPadding(hl.L(6.0f) + l46Var.u0, 0, hl.L(6.0f) + l46Var.u0, 0);
                TextView textView = new TextView(context);
                if (l46Var.L2 == null && xc2.N(l46Var.f1())) {
                    l46Var.L2 = new ea5(this, (byte) 25);
                }
                int L = hl.L(18.0f);
                int L2 = hl.L(13.0f);
                if (l46Var.L2 == null) {
                    f = 18.0f;
                } else {
                    f = 50.0f;
                }
                textView.setPadding(L, L2, hl.L(f), hl.L(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                kbVar.addView(textView, tre.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int L3 = hl.L(8.0f);
                int i6 = aob.e7;
                int v0 = aob.v0(i6, l46Var.J0);
                int i7 = aob.i6;
                int o = vm2.o(aob.v0(i7, l46Var.J0), 76);
                hf0 i0 = aob.i0(L3, L3, L3, L3, v0, o, o);
                uob M = yob.M(i6);
                uob g = yob.g(i7, 76);
                vnb vnbVar = l46Var.J0;
                textView.setBackground(i0);
                yob.j(textView, i0, M, g, vnbVar);
                yob.X(textView, aob.G6, l46Var.J0);
                textView.setOnClickListener(new View.OnClickListener(this) {
                    public final d46 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b = r2;
                        d46 d46Var = this.b;
                        switch (b) {
                            case 0:
                                l46 l46Var2 = d46Var.c;
                                dn0.E0(l46Var2.r1, l46Var2.J0, l46Var2.V1, null);
                                return;
                            case 1:
                                l46 l46Var3 = d46Var.c;
                                hl.g(l46Var3.c1());
                                l46Var3.dismiss();
                                return;
                            case 2:
                                hl.g(d46Var.c.c1());
                                return;
                            default:
                                l46 l46Var4 = d46Var.c;
                                l46Var4.L2.run();
                                l46Var4.dismiss();
                                return;
                        }
                    }
                });
                if (l46Var.L2 != null) {
                    ImageView imageView = new ImageView(l46Var.getContext());
                    imageView.setImageResource(2131232383);
                    yob.s(imageView, aob.j5, l46Var.J0, PorterDuff.Mode.SRC_ATOP);
                    imageView.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
                    int L4 = hl.L(20.0f);
                    int o2 = vm2.o(aob.v0(i7, l46Var.J0), 76);
                    hf0 i02 = aob.i0(L4, L4, L4, L4, 0, o2, o2);
                    uob g2 = yob.g(i7, 76);
                    vnb vnbVar2 = l46Var.J0;
                    imageView.setBackground(i02);
                    yob.j(imageView, i02, null, g2, vnbVar2);
                    kbVar.addView(imageView, tre.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    imageView.setOnClickListener(new View.OnClickListener(this) {
                        public final d46 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            byte b = r2;
                            d46 d46Var = this.b;
                            switch (b) {
                                case 0:
                                    l46 l46Var2 = d46Var.c;
                                    dn0.E0(l46Var2.r1, l46Var2.J0, l46Var2.V1, null);
                                    return;
                                case 1:
                                    l46 l46Var3 = d46Var.c;
                                    hl.g(l46Var3.c1());
                                    l46Var3.dismiss();
                                    return;
                                case 2:
                                    hl.g(d46Var.c.c1());
                                    return;
                                default:
                                    l46 l46Var4 = d46Var.c;
                                    l46Var4.L2.run();
                                    l46Var4.dismiss();
                                    return;
                            }
                        }
                    });
                }
                textView.setText(l46Var.c1());
                textView.setGravity(17);
                j46Var = kbVar;
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setPadding(hl.L(6.0f) + l46Var.u0, 0, hl.L(6.0f) + l46Var.u0, 0);
                linearLayout.setOrientation(1);
                rh6 rh6Var = new rh6(context);
                p66 p66Var = new p66(context, null);
                if (l46Var.j1()) {
                    i3 = 2131753182;
                } else {
                    i3 = 2131753183;
                }
                SpannableStringBuilder S2 = hl.S2(ob6.M0(i3, null));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131753181, null));
                spannableStringBuilder.setSpan(new a31(this, (byte) 7), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = l46Var.getContext().getResources().getDrawable(2131232064).mutate();
                int i8 = aob.Xc;
                mutate.setColorFilter(new PorterDuffColorFilter(i8, PorterDuff.Mode.SRC_IN));
                wm2 wm2Var = new wm2(0, mutate);
                wm2Var.a(i8);
                wm2Var.c(hl.L(18.0f));
                wm2Var.F = hl.L(11.0f);
                wm2Var.r = -hl.L(5.0f);
                spannableString.setSpan(wm2Var, 0, spannableString.length(), 33);
                p66Var.setText(TextUtils.concat(S2, " ", hl.G2(spannableStringBuilder, spannableString, ">")));
                p66Var.setTextSize(1, 14.0f);
                p66Var.setLineSpacing(hl.L(3.0f), 1.0f);
                vnb vnbVar3 = l46Var.J0;
                if (vnbVar3 instanceof x53) {
                    yob.X(p66Var, aob.y6, vnbVar3);
                } else {
                    yob.X(p66Var, aob.G6, vnbVar3);
                }
                p66Var.setGravity(1);
                p66Var.setOnClickListener(new View.OnClickListener(this) {
                    public final d46 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b = r2;
                        d46 d46Var = this.b;
                        switch (b) {
                            case 0:
                                l46 l46Var2 = d46Var.c;
                                dn0.E0(l46Var2.r1, l46Var2.J0, l46Var2.V1, null);
                                return;
                            case 1:
                                l46 l46Var3 = d46Var.c;
                                hl.g(l46Var3.c1());
                                l46Var3.dismiss();
                                return;
                            case 2:
                                hl.g(d46Var.c.c1());
                                return;
                            default:
                                l46 l46Var4 = d46Var.c;
                                l46Var4.L2.run();
                                l46Var4.dismiss();
                                return;
                        }
                    }
                });
                rh6Var.setOnClickListener(new sa5(p66Var, (byte) 17));
                if (l46Var.k1()) {
                    c51 c51Var = new c51(l46Var.J0, context, true);
                    c51Var.i(ob6.M0(2131751732, null), false, true);
                    c51Var.setOnClickListener(new View.OnClickListener(this) {
                        public final d46 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            byte b = r2;
                            d46 d46Var = this.b;
                            switch (b) {
                                case 0:
                                    l46 l46Var2 = d46Var.c;
                                    dn0.E0(l46Var2.r1, l46Var2.J0, l46Var2.V1, null);
                                    return;
                                case 1:
                                    l46 l46Var3 = d46Var.c;
                                    hl.g(l46Var3.c1());
                                    l46Var3.dismiss();
                                    return;
                                case 2:
                                    hl.g(d46Var.c.c1());
                                    return;
                                default:
                                    l46 l46Var4 = d46Var.c;
                                    l46Var4.L2.run();
                                    l46Var4.dismiss();
                                    return;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(l46Var.B2, tre.q(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(c51Var, tre.q(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, tre.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(l46Var.A2, tre.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(rh6Var, tre.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(p66Var, tre.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                j46Var = linearLayout;
                break;
            case 9:
                j46Var = new g46(l46Var, context, l46Var.J0);
                break;
            default:
                j46 j46Var2 = new j46(l46Var, context);
                l46Var.Y1 = j46Var2;
                j46Var = j46Var2;
                break;
        }
        return qu6.h(j46Var, j46Var, -1, -2);
    }
}

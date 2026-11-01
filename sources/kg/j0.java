package kg;

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
import org.telegram.messenger.dd;
import org.telegram.messenger.i5;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Cells.j4;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.y41;
import org.telegram.ui.Components.zz;
import w7.b6;
public final class j0 extends tk0 {
    public final q0 f11131c;

    public j0(q0 q0Var) {
        this.f11131c = q0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        q0 q0Var = this.f11131c;
        int i10 = q0Var.Z1;
        if ((i10 != 11 && i10 != 34) || q0Var.Q1) {
            int i11 = c1Var.f47912f;
            if (i11 == 1 || i11 == 4) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f11131c.f11227c2;
    }

    @Override
    public final int d(int i10) {
        int i11;
        q0 q0Var = this.f11131c;
        if (q0Var.f11228d2 == i10) {
            return 0;
        }
        if (q0Var.f11229e2 == i10) {
            return 2;
        }
        if (q0Var.f11230f2 == i10) {
            return 3;
        }
        if (q0Var.f11233i2 == i10) {
            return 5;
        }
        if (q0Var.f11234j2 == i10) {
            return 6;
        }
        if (q0Var.R1 == i10) {
            return 7;
        }
        if (q0Var.f11235k2 == i10) {
            return 8;
        }
        ArrayList arrayList = q0Var.f11237m2;
        if (arrayList != null && i10 >= (i11 = q0Var.f11236l2) && i10 <= arrayList.size() + i11) {
            return 9;
        }
        int i12 = q0Var.Z1;
        if (i12 != 5 && i12 != 11 && i12 != 34) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        String str;
        boolean z10;
        TL_account.requirementToContactPremium requirementtocontactpremium;
        String d02;
        q0 q0Var = this.f11131c;
        int i11 = q0Var.Z1;
        HashSet hashSet = q0Var.f11241q2;
        int i12 = c1Var.f47912f;
        View view = c1Var.f47909a;
        boolean z11 = false;
        boolean z12 = true;
        if (i12 != 1) {
            if (i12 != 9) {
                if (i12 != 3) {
                    if (i12 == 4) {
                        j4 j4Var = (j4) view;
                        if (i11 == 5) {
                            TLRPC.Chat chat = (TLRPC.Chat) q0Var.f11242r2.get(i10 - q0Var.f11231g2);
                            String str2 = (String) q0Var.f11243s2.get(i10 - q0Var.f11231g2);
                            String str3 = chat.title;
                            if (i10 == q0Var.f11232h2 - 1.0f) {
                                z12 = false;
                            }
                            j4Var.e(chat, str3, str2, z12);
                            j4Var.c(hashSet.contains(chat), false);
                            return;
                        } else if (i11 == 11 || i11 == 34) {
                            TLRPC.User user = (TLRPC.User) q0Var.f11244t2.get(i10 - q0Var.f11231g2);
                            ArrayList arrayList = q0Var.f11245u2;
                            if (arrayList != null && arrayList.contains(Long.valueOf(user.f19943id))) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                requirementtocontactpremium = new TL_account.requirementToContactPremium();
                            } else {
                                requirementtocontactpremium = null;
                            }
                            j4Var.R = true;
                            j4Var.Q = requirementtocontactpremium;
                            j4Var.g();
                            if (z10) {
                                d02 = dd.L0(2131749136, null);
                            } else {
                                d02 = dd.d0(q0Var.f21584a, user, null, null);
                            }
                            String m10 = i5.m(0, user.first_name, user.last_name);
                            if (i10 == q0Var.f11232h2 - 1.0f) {
                                z12 = false;
                            }
                            j4Var.e(user, m10, d02, z12);
                            j4Var.c(hashSet.contains(user), false);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                p4 p4Var = (p4) view;
                if (i11 != 11 && i11 != 34) {
                    if (i11 == 2) {
                        p4Var.setText(dd.L0(2131742816, null));
                        return;
                    } else {
                        p4Var.setText(dd.L0(2131749043, null));
                        return;
                    }
                } else if (q0Var.Q1) {
                    p4Var.setText(dd.L0(2131752402, null));
                    return;
                } else if (q0Var.f11244t2.size() == 1) {
                    p4Var.setText(dd.L0(2131752399, null));
                    return;
                } else {
                    p4Var.setText(dd.L0(2131752398, null));
                    return;
                }
            }
            int i13 = i10 - q0Var.f11236l2;
            ArrayList arrayList2 = q0Var.f11237m2;
            if (arrayList2 != null && i13 >= 0 && i13 < arrayList2.size()) {
                m0 m0Var = (m0) view;
                l0 l0Var = (l0) q0Var.f11237m2.get(i13);
                jg.b1 b1Var = m0Var.f11186c;
                ImageView imageView = m0Var.f11184a;
                u5 u5Var = m0Var.f11185b;
                if (l0Var instanceof k0) {
                    m0Var.f11187f = (k0) l0Var;
                    m0Var.e = null;
                    imageView.setVisibility(8);
                    u5Var.setVisibility(8);
                    b1Var.setVisibility(0);
                    u5 u5Var2 = m0Var.d;
                    k0 k0Var = m0Var.f11187f;
                    if (k0Var.h) {
                        str = "BoostLevelUnlocks";
                    } else {
                        str = "BoostLevel";
                    }
                    u5Var2.l(dd.G(k0Var.f11139g, str, new Object[0]), false);
                    return;
                } else if (l0Var != null) {
                    m0Var.f11187f = null;
                    m0Var.e = l0Var;
                    imageView.setVisibility(0);
                    imageView.setImageResource(m0Var.e.f11165a);
                    u5Var.setVisibility(0);
                    l0 l0Var2 = m0Var.e;
                    String str4 = "";
                    if (l0Var2.d != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m0Var.e.d);
                        sb2.append("_");
                        int i14 = m0Var.e.e;
                        dd.D0();
                        sb2.append(dd.b1(dd.D0().A.a(i14)));
                        String M0 = dd.M0(sb2.toString());
                        if (M0 == null || M0.startsWith("LOC_ERR")) {
                            M0 = dd.M0(m0Var.e.d + "_other");
                        }
                        if (M0 == null) {
                            M0 = "";
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                        int indexOf = M0.indexOf("%d");
                        if (indexOf >= 0) {
                            spannableStringBuilder = new SpannableStringBuilder(M0);
                            SpannableString spannableString = new SpannableString(a1.g.p(new StringBuilder(), m0Var.e.e, ""));
                            spannableString.setSpan(new y41(org.telegram.messenger.i0.o()), 0, spannableString.length(), 33);
                            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                        }
                        u5Var.l(spannableStringBuilder, false);
                    } else {
                        String L0 = dd.L0(l0Var2.f11166b, null);
                        if (L0 != null) {
                            str4 = L0;
                        }
                        if (m0Var.e.f11167c != null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str4);
                            int indexOf2 = str4.indexOf("%s");
                            if (indexOf2 >= 0) {
                                spannableStringBuilder2 = new SpannableStringBuilder(str4);
                                SpannableString spannableString2 = new SpannableString(m0Var.e.f11167c);
                                spannableString2.setSpan(new y41(org.telegram.messenger.i0.o()), 0, spannableString2.length(), 33);
                                spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                            }
                            u5Var.l(spannableStringBuilder2, false);
                        } else {
                            u5Var.l(str4, false);
                        }
                    }
                    b1Var.setVisibility(8);
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        TLRPC.Chat chat2 = (TLRPC.Chat) q0Var.a2.get(i10 - q0Var.f11231g2);
        org.telegram.ui.Cells.m mVar = (org.telegram.ui.Cells.m) view;
        TLRPC.Chat currentChannel = mVar.getCurrentChannel();
        mVar.a(chat2, false);
        boolean contains = hashSet.contains(chat2);
        if (currentChannel == chat2) {
            z11 = true;
        }
        mVar.f22275r.a(contains, z11);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        zz zzVar;
        p0 p0Var;
        float f7;
        int i11;
        Context context = viewGroup.getContext();
        int i12 = 22;
        q0 q0Var = this.f11131c;
        switch (i10) {
            case 1:
                p0Var = new org.telegram.ui.Cells.m(context, new i0(this), true, 9);
                break;
            case 2:
                int i13 = t6.f20873a7;
                View c7Var = new c7(context, t6.w0(i13, q0Var.I0), 0);
                a7.i(i13, c7Var, q0Var.I0);
                p0Var = c7Var;
                break;
            case 3:
                View p4Var = new p4(context);
                p4Var.setPadding(0, 0, 0, org.telegram.messenger.i0.L(8.0f));
                p0Var = p4Var;
                break;
            case 4:
                View j4Var = new j4(1, 0, context, q0Var.I0, false, false);
                int i14 = q0Var.f21616t0;
                j4Var.setPadding(i14, 0, i14, 0);
                p0Var = j4Var;
                break;
            case 5:
                zz zzVar2 = new zz(context, null);
                if (q0Var.Z1 != 2) {
                    i12 = 21;
                }
                zzVar2.setViewType(i12);
                zzVar2.setIsSingleCell(true);
                zzVar2.setIgnoreHeightCheck(true);
                zzVar2.setItemsCount(10);
                zzVar = zzVar2;
                p0Var = zzVar;
                break;
            case 6:
                p0Var = new bn(q0Var.getContext(), 1);
                break;
            case 7:
                ?? frameLayout = new FrameLayout(q0Var.getContext());
                frameLayout.setPadding(org.telegram.messenger.i0.L(6.0f) + q0Var.f21616t0, 0, org.telegram.messenger.i0.L(6.0f) + q0Var.f21616t0, 0);
                TextView textView = new TextView(context);
                if (q0Var.I2 == null && w3.N(q0Var.n1())) {
                    q0Var.I2 = new gg.c(this, 22);
                }
                int L = org.telegram.messenger.i0.L(18.0f);
                int L2 = org.telegram.messenger.i0.L(13.0f);
                if (q0Var.I2 == null) {
                    f7 = 18.0f;
                } else {
                    f7 = 50.0f;
                }
                textView.setPadding(L, L2, org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, b6.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int L3 = org.telegram.messenger.i0.L(8.0f);
                int i15 = t6.e7;
                int w02 = t6.w0(i15, q0Var.I0);
                int i16 = t6.f21021i6;
                int o10 = i0.b.o(t6.w0(i16, q0Var.I0), 76);
                org.telegram.ui.Cells.y k02 = t6.k0(L3, L3, L3, L3, w02, o10, o10);
                w6 N = a7.N(i15);
                w6 h = a7.h(i16, 76);
                p6 p6Var = q0Var.I0;
                textView.setBackground(k02);
                a7.k(textView, k02, N, h, p6Var);
                a7.V(textView, t6.G6, q0Var.I0);
                textView.setOnClickListener(new View.OnClickListener(this) {
                    public final j0 f11100b;

                    {
                        this.f11100b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                q0 q0Var2 = this.f11100b.f11131c;
                                mg.v.I0(q0Var2.f26727o1, q0Var2.I0, q0Var2.S1, null);
                                return;
                            case 1:
                                q0 q0Var3 = this.f11100b.f11131c;
                                org.telegram.messenger.i0.g(q0Var3.k1());
                                q0Var3.dismiss();
                                return;
                            case 2:
                                org.telegram.messenger.i0.g(this.f11100b.f11131c.k1());
                                return;
                            default:
                                q0 q0Var4 = this.f11100b.f11131c;
                                q0Var4.I2.run();
                                q0Var4.dismiss();
                                return;
                        }
                    }
                });
                if (q0Var.I2 != null) {
                    ImageView imageView = new ImageView(q0Var.getContext());
                    imageView.setImageResource(2131232377);
                    a7.t(imageView, t6.f21038j5, q0Var.I0, PorterDuff.Mode.SRC_ATOP);
                    imageView.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
                    int L4 = org.telegram.messenger.i0.L(20.0f);
                    int o11 = i0.b.o(t6.w0(i16, q0Var.I0), 76);
                    org.telegram.ui.Cells.y k03 = t6.k0(L4, L4, L4, L4, 0, o11, o11);
                    w6 h10 = a7.h(i16, 76);
                    p6 p6Var2 = q0Var.I0;
                    imageView.setBackground(k03);
                    a7.k(imageView, k03, null, h10, p6Var2);
                    frameLayout.addView(imageView, b6.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    imageView.setOnClickListener(new View.OnClickListener(this) {
                        public final j0 f11100b;

                        {
                            this.f11100b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    q0 q0Var2 = this.f11100b.f11131c;
                                    mg.v.I0(q0Var2.f26727o1, q0Var2.I0, q0Var2.S1, null);
                                    return;
                                case 1:
                                    q0 q0Var3 = this.f11100b.f11131c;
                                    org.telegram.messenger.i0.g(q0Var3.k1());
                                    q0Var3.dismiss();
                                    return;
                                case 2:
                                    org.telegram.messenger.i0.g(this.f11100b.f11131c.k1());
                                    return;
                                default:
                                    q0 q0Var4 = this.f11100b.f11131c;
                                    q0Var4.I2.run();
                                    q0Var4.dismiss();
                                    return;
                            }
                        }
                    });
                }
                textView.setText(q0Var.k1());
                textView.setGravity(17);
                zzVar = frameLayout;
                p0Var = zzVar;
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setPadding(org.telegram.messenger.i0.L(6.0f) + q0Var.f21616t0, 0, org.telegram.messenger.i0.L(6.0f) + q0Var.f21616t0, 0);
                linearLayout.setOrientation(1);
                w80 w80Var = new w80(context);
                p80 p80Var = new p80(context, null);
                if (q0Var.r1()) {
                    i11 = 2131753189;
                } else {
                    i11 = 2131753190;
                }
                SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(dd.L0(i11, null));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dd.L0(2131753188, null));
                spannableStringBuilder.setSpan(new dh.a(this, 1), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = q0Var.getContext().getResources().getDrawable(2131232058).mutate();
                int i17 = t6.Uc;
                mutate.setColorFilter(new PorterDuffColorFilter(i17, PorterDuff.Mode.SRC_IN));
                dq dqVar = new dq(0, mutate);
                dqVar.a(i17);
                dqVar.c(org.telegram.messenger.i0.L(18.0f));
                dqVar.E = org.telegram.messenger.i0.L(11.0f);
                dqVar.f25568r = -org.telegram.messenger.i0.L(5.0f);
                spannableString.setSpan(dqVar, 0, spannableString.length(), 33);
                p80Var.setText(TextUtils.concat(W2, " ", org.telegram.messenger.i0.J2(spannableStringBuilder, spannableString, ">")));
                p80Var.setTextSize(1, 14.0f);
                p80Var.setLineSpacing(org.telegram.messenger.i0.L(3.0f), 1.0f);
                p6 p6Var3 = q0Var.I0;
                if (p6Var3 instanceof th.b) {
                    a7.V(p80Var, t6.f21312y6, p6Var3);
                } else {
                    a7.V(p80Var, t6.G6, p6Var3);
                }
                p80Var.setGravity(1);
                p80Var.setOnClickListener(new View.OnClickListener(this) {
                    public final j0 f11100b;

                    {
                        this.f11100b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                q0 q0Var2 = this.f11100b.f11131c;
                                mg.v.I0(q0Var2.f26727o1, q0Var2.I0, q0Var2.S1, null);
                                return;
                            case 1:
                                q0 q0Var3 = this.f11100b.f11131c;
                                org.telegram.messenger.i0.g(q0Var3.k1());
                                q0Var3.dismiss();
                                return;
                            case 2:
                                org.telegram.messenger.i0.g(this.f11100b.f11131c.k1());
                                return;
                            default:
                                q0 q0Var4 = this.f11100b.f11131c;
                                q0Var4.I2.run();
                                q0Var4.dismiss();
                                return;
                        }
                    }
                });
                w80Var.setOnClickListener(new ag.g(p80Var, 11));
                if (q0Var.s1()) {
                    vh.d dVar = new vh.d(context, q0Var.I0, true);
                    dVar.i(dd.L0(2131751767, null), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) {
                        public final j0 f11100b;

                        {
                            this.f11100b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    q0 q0Var2 = this.f11100b.f11131c;
                                    mg.v.I0(q0Var2.f26727o1, q0Var2.I0, q0Var2.S1, null);
                                    return;
                                case 1:
                                    q0 q0Var3 = this.f11100b.f11131c;
                                    org.telegram.messenger.i0.g(q0Var3.k1());
                                    q0Var3.dismiss();
                                    return;
                                case 2:
                                    org.telegram.messenger.i0.g(this.f11100b.f11131c.k1());
                                    return;
                                default:
                                    q0 q0Var4 = this.f11100b.f11131c;
                                    q0Var4.I2.run();
                                    q0Var4.dismiss();
                                    return;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(q0Var.f11249y2, b6.q(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, b6.q(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, b6.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(q0Var.f11248x2, b6.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(w80Var, b6.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(p80Var, b6.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                p0Var = linearLayout;
                break;
            case 9:
                p0Var = new m0(q0Var, context, q0Var.I0);
                break;
            default:
                p0 p0Var2 = new p0(q0Var, context);
                q0Var.V1 = p0Var2;
                p0Var = p0Var2;
                break;
        }
        return sc.e.o(p0Var, p0Var, -1, -2);
    }
}

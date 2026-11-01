package ng;

import ag.l;
import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k2.u;
import mg.m0;
import og.a0;
import og.f0;
import og.j;
import og.m;
import og.s;
import og.w;
import og.x;
import og.y;
import og.z;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i0;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.k6;
import org.telegram.messenger.u1;
import org.telegram.messenger.w3;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.uk0;
import rh.r7;
import s4.c1;
public final class b extends hg.c {
    public final p6 d;
    public uk0 f13763f;
    public m0 h;
    public m0 f13764n;
    public s f13765r;
    public m0 f13766s;
    public TLRPC.Chat f13767w;
    public ArrayList e = new ArrayList();
    public final HashMap f13768x = new HashMap();

    public b(p6 p6Var) {
        this.d = p6Var;
        l lVar = new l(this, 21);
        is a02 = is.a0(e20.f15506s0);
        a02.f16331a.c(new u(25, a02, lVar));
    }

    @Override
    public final boolean D(c1 c1Var) {
        int i10 = c1Var.f47912f;
        if (i10 != 2 && i10 != 11 && i10 != 8 && i10 != 10 && i10 != 15 && i10 != 12 && i10 != 17 && i10 != 18) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull M0 = wp.r1(e20.f15506s0).M0(chat.f19794id);
        if (M0 != null && (i10 = M0.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.f13768x;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f19794id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        for (int i10 = 0; i10 < this.e.size(); i10++) {
            if (((a) this.e.get(i10)).f7681a == 7) {
                g(i10);
            }
        }
    }

    @Override
    public final int b() {
        return this.e.size();
    }

    @Override
    public final int d(int i10) {
        return ((a) this.e.get(i10)).f7681a;
    }

    @Override
    public final void t(c1 c1Var, int i10) {
        boolean z10;
        int i11;
        int i12;
        long j10;
        boolean z11;
        int i13 = c1Var.f47912f;
        View view = c1Var.f47909a;
        a aVar = (a) this.e.get(i10);
        if (i13 != 0) {
            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = null;
            if (i13 != 2) {
                if (i13 != 5) {
                    if (i13 != 6) {
                        if (i13 != 7) {
                            String str = "";
                            switch (i13) {
                                case 9:
                                    og.h hVar = (og.h) view;
                                    TLRPC.InputPeer inputPeer = aVar.d;
                                    if (inputPeer != null) {
                                        if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                                            TLRPC.Chat L0 = wp.r1(e20.f15506s0).L0(Long.valueOf(inputPeer.chat_id));
                                            hVar.f(L0, aVar.f13758i, aVar.f13757g, F(L0));
                                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                            TLRPC.Chat L02 = wp.r1(e20.f15506s0).L0(Long.valueOf(inputPeer.channel_id));
                                            hVar.f(L02, aVar.f13758i, aVar.f13757g, F(L02));
                                        }
                                    } else {
                                        TLRPC.Chat chat = aVar.e;
                                        hVar.f(chat, aVar.f13758i, aVar.f13757g, F(chat));
                                    }
                                    hVar.setChatDeleteListener(this.f13764n);
                                    return;
                                case 10:
                                    ((og.i) view).setDate(aVar.h);
                                    return;
                                case 11:
                                    w wVar = (w) view;
                                    int i14 = aVar.f13761l;
                                    boolean z12 = aVar.f7682b;
                                    boolean z13 = aVar.f13757g;
                                    List list = (List) aVar.f13756f;
                                    TLRPC.Chat chat2 = this.f13767w;
                                    og.c cVar = wVar.d;
                                    wVar.f14234s = i14;
                                    boolean V = w3.V(chat2);
                                    if (i14 == 0) {
                                        if (V) {
                                            i12 = 2131753598;
                                        } else {
                                            i12 = 2131753599;
                                        }
                                        cVar.k(dd.a0(null, null, i12, new Object[0]));
                                    } else if (i14 == 1) {
                                        if (V) {
                                            i11 = 2131753336;
                                        } else {
                                            i11 = 2131753337;
                                        }
                                        cVar.k(dd.a0(null, null, i11, new Object[0]));
                                    }
                                    wVar.f14180f.a(z12, false);
                                    wVar.setDivider(z13);
                                    a7.Y(wVar.e, t6.f21115n5, wVar.f14177a);
                                    if (list.size() == 0) {
                                        wVar.setSubtitle(wVar.e(dd.L0(2131753522, null)));
                                        return;
                                    } else if (list.size() <= 3) {
                                        if (list.size() == 1) {
                                            wVar.setSubtitle(wVar.e(dd.a0("BoostingFromAllCountries1", null, 2131753521, ((TLRPC.TL_help_country) list.get(0)).default_name)));
                                            return;
                                        } else if (list.size() == 2) {
                                            wVar.setSubtitle(wVar.e(dd.a0("BoostingFromAllCountries2", null, 2131753520, ((TLRPC.TL_help_country) list.get(0)).default_name, ((TLRPC.TL_help_country) list.get(1)).default_name)));
                                            return;
                                        } else {
                                            wVar.setSubtitle(wVar.e(dd.a0("BoostingFromAllCountries3", null, 2131753519, ((TLRPC.TL_help_country) list.get(0)).default_name, ((TLRPC.TL_help_country) list.get(1)).default_name, ((TLRPC.TL_help_country) list.get(2)).default_name)));
                                            return;
                                        }
                                    } else {
                                        wVar.setSubtitle(wVar.e(dd.G(list.size(), "BoostingFromCountriesCount", new Object[0])));
                                        return;
                                    }
                                case 12:
                                    j jVar = (j) view;
                                    TLObject tLObject = aVar.f13762m;
                                    int i15 = aVar.f13758i;
                                    int i16 = aVar.f13759j;
                                    long j11 = aVar.h;
                                    CharSequence charSequence = aVar.f13755c;
                                    boolean z14 = aVar.f13757g;
                                    boolean z15 = aVar.f7682b;
                                    og.c cVar2 = jVar.d;
                                    jVar.f14206w = tLObject;
                                    if (i15 >= 12) {
                                        cVar2.k(dd.G(1, "Years", new Object[0]));
                                    } else {
                                        cVar2.k(dd.G(i15, "Months", new Object[0]));
                                    }
                                    StringBuilder sb2 = new StringBuilder();
                                    u1 i17 = u1.i();
                                    if (i16 > 0) {
                                        j10 = j11 / i16;
                                    } else {
                                        j10 = j11;
                                    }
                                    sb2.append(i17.f(j10, charSequence.toString()));
                                    sb2.append(" x ");
                                    sb2.append(i16);
                                    jVar.setSubtitle(sb2.toString());
                                    u5 u5Var = jVar.f14205s;
                                    u1 i18 = u1.i();
                                    if (i16 <= 0) {
                                        j11 = 0;
                                    }
                                    u5Var.l(i18.f(j11, charSequence.toString()), false);
                                    jVar.setDivider(z14);
                                    jVar.f14180f.a(z15, false);
                                    return;
                                case 13:
                                    z zVar = (z) view;
                                    zVar.setText(aVar.f13755c);
                                    int i19 = aVar.f13758i;
                                    f6 f6Var = zVar.f14245r;
                                    if (i19 > 0) {
                                        str = dd.G(i19, "BoostingBoostsCountTitle", Integer.valueOf(i19));
                                    }
                                    f6Var.a();
                                    f6Var.c(str, true, true);
                                    return;
                                case 14:
                                    ((og.f) view).setGiveaway((TL_stories.PrepaidGiveaway) aVar.f13756f);
                                    return;
                                case 15:
                                    a0 a0Var = (a0) view;
                                    CharSequence charSequence2 = aVar.f13755c;
                                    boolean z16 = aVar.f7682b;
                                    boolean z17 = aVar.f13757g;
                                    a0Var.K = aVar.f13761l;
                                    a0Var.f(charSequence2, z16, z17);
                                    return;
                                case 16:
                                    m mVar = (m) view;
                                    mVar.setCount(aVar.f13758i);
                                    mVar.setAfterTextChangedListener(this.f13766s);
                                    return;
                                case 17:
                                    y yVar = (y) view;
                                    TLObject tLObject2 = aVar.f13762m;
                                    if (tLObject2 != null) {
                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) tLObject2;
                                    }
                                    int i20 = aVar.f13758i;
                                    long j12 = aVar.h;
                                    boolean z18 = aVar.f7682b;
                                    TextView textView = yVar.f14240f;
                                    f6 f6Var2 = yVar.d;
                                    f6 f6Var3 = yVar.e;
                                    if (yVar.f14242r == tL_starsGiveawayOption) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    yVar.f14237a.a(z18, z11);
                                    yVar.f14242r = tL_starsGiveawayOption;
                                    if (z11) {
                                        f6Var3.a();
                                    }
                                    if (tL_starsGiveawayOption == null) {
                                        f6Var2.c(yVar.h, false, true);
                                        f6Var3.c(yVar.f14241n, z11, true);
                                        textView.setText("");
                                    } else {
                                        f6Var2.c(dd.H(' ', "GiveawayStars", (int) tL_starsGiveawayOption.stars), false, true);
                                        f6Var3.c(dd.H(',', "BoostingStarOptionPerUser", (int) j12), z11, true);
                                        textView.setText(u1.i().f(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                                    }
                                    int i21 = i20 + 1;
                                    yVar.f14243s = i21;
                                    if (!z11) {
                                        yVar.f14244w.e(true, i21);
                                    }
                                    yVar.invalidate();
                                    return;
                                default:
                                    return;
                            }
                        }
                        f0 f0Var = (f0) view;
                        f0Var.setText(aVar.f13755c);
                        f0Var.setBackground(aVar.f13757g);
                        return;
                    }
                    ((p4) view).setText(aVar.f13755c);
                    return;
                }
                x xVar = (x) view;
                List list2 = aVar.f13760k;
                int i22 = aVar.f13758i;
                xVar.getClass();
                String[] strArr = new String[list2.size()];
                for (int i23 = 0; i23 < list2.size(); i23++) {
                    strArr[i23] = String.valueOf((Integer) list2.get(i23));
                }
                xVar.f14235a.b(i22, null, strArr);
                xVar.setCallBack(this.h);
                return;
            }
            og.e eVar = (og.e) view;
            int i24 = aVar.f13761l;
            int i25 = aVar.f13758i;
            TLRPC.User user = (TLRPC.User) aVar.f13756f;
            boolean z19 = aVar.f7682b;
            g9 g9Var = eVar.f14179c;
            p6 p6Var = eVar.f14177a;
            og.c cVar3 = eVar.d;
            u5 u5Var2 = eVar.e;
            r8 r8Var = eVar.f14178b;
            if (eVar.f14186s == i24) {
                z10 = true;
            } else {
                z10 = false;
            }
            eVar.f14186s = i24;
            if (i24 == 0) {
                cVar3.k(dd.L0(2131753541, null));
                eVar.setSubtitle(dd.L0(2131753167, null));
                a7.Y(u5Var2, t6.f21186r5, p6Var);
                r8Var.g(16);
                r8Var.i(-15292942, -15630089);
                eVar.setDivider(true);
                a7.a0(eVar, eVar.getContext(), 2131231231, t6.f20893b7);
            } else if (i24 == 1) {
                cVar3.k(dd.L0(2131753593, null));
                if (i25 == 1 && user != null) {
                    eVar.setSubtitle(eVar.e(k6.m(i20.p(user), u5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
                } else if (i25 > 0) {
                    eVar.setSubtitle(eVar.e(dd.G(i25, "Recipient", new Object[0])));
                } else {
                    eVar.setSubtitle(eVar.e(dd.L0(2131753285, null)));
                }
                a7.Y(u5Var2, t6.f21115n5, p6Var);
                r8Var.g(6);
                r8Var.i(-3905294, -6923014);
                eVar.setDivider(false);
                a7.a0(eVar, eVar.getContext(), 2131231232, t6.f20893b7);
            } else if (i24 == 2) {
                cVar3.k(dd.L0(2131753332, null));
                if (i25 == 1 && user != null) {
                    eVar.setSubtitle(eVar.e(k6.m(i20.p(user), u5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
                } else if (i25 > 0) {
                    eVar.setSubtitle(eVar.e(dd.G(i25, "Recipient", new Object[0])));
                } else {
                    eVar.setSubtitle(eVar.e(dd.L0(2131753167, null)));
                }
                a7.Y(u5Var2, t6.f21115n5, p6Var);
                r8Var.g(25);
                r8Var.i(-3905294, -6923014);
                eVar.setDivider(true);
                a7.a0(eVar, eVar.getContext(), 2131231231, t6.f20893b7);
            } else if (i24 == 3) {
                cVar3.k(p8.b(dd.L0(2131753257, null)));
                eVar.setSubtitle(dd.L0(2131753167, null));
                a7.Y(u5Var2, t6.f21186r5, p6Var);
                r8Var.g(26);
                r8Var.i(-146917, -625593);
                eVar.setDivider(false);
                a7.a0(eVar, eVar.getContext(), 2131231232, t6.f20893b7);
            }
            eVar.f14180f.a(z19, z10);
            g9Var.setImageDrawable(r8Var);
            g9Var.setRoundRadius(i0.L(20.0f));
            return;
        }
        s sVar = (s) view;
        this.f13765r = sVar;
        sVar.setBoostViaGifsText(this.f13767w);
        this.f13765r.setStars(aVar.f13757g);
    }

    @Override
    public final c1 w(ViewGroup viewGroup, int i10) {
        r7 r7Var;
        boolean z10;
        Context context = viewGroup.getContext();
        p6 p6Var = this.d;
        switch (i10) {
            case 2:
                r7Var = new og.e(context, p6Var);
                break;
            case 3:
                r7Var = new View(context);
                break;
            case 4:
                int i11 = t6.f20873a7;
                View c7Var = new c7(context, t6.w0(i11, p6Var), 0);
                a7.i(i11, c7Var, p6Var);
                r7Var = c7Var;
                break;
            case 5:
                r7Var = new x(context, p6Var);
                break;
            case 6:
                View p4Var = new p4(context, t6.L6, 21, 15, 3, false, false, this.d);
                a7.i(t6.f21002h5, p4Var, p6Var);
                r7Var = p4Var;
                break;
            case 7:
                r7Var = new f0(context, p6Var);
                break;
            case 8:
                r7Var = new og.b(context, p6Var);
                break;
            case 9:
                r7Var = new og.h(context, p6Var);
                break;
            case 10:
                r7Var = new og.i(context, p6Var);
                break;
            case 11:
                og.d dVar = new og.d(context, p6Var);
                dVar.f14179c.setVisibility(8);
                r7Var = dVar;
                break;
            case 12:
                r7Var = new j(context, p6Var);
                break;
            case 13:
                View zVar = new z(context, p6Var);
                a7.i(t6.f21002h5, zVar, p6Var);
                r7Var = zVar;
                break;
            case 14:
                r7Var = new og.e(context, p6Var);
                break;
            case 15:
                t8 t8Var = new t8(context, p6Var);
                t8Var.setHeight(50);
                r7Var = t8Var;
                break;
            case 16:
                r7Var = new m(context, p6Var);
                break;
            case 17:
                r7Var = new y(context, p6Var);
                break;
            case 18:
                r7 r7Var2 = new r7(context);
                String L0 = dd.L0(2131747852, null);
                if (r7Var2.f47430c == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r7Var2.f47430c = -1;
                f6 f6Var = r7Var2.f47428a;
                f6Var.c(L0, z10, true);
                int i12 = t6.f21135o6;
                t6.v0(i12);
                a7.Z(f6Var, i12, null);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                ImageView imageView = r7Var2.f47429b;
                a7.t(imageView, i12, null, mode);
                if (z10) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(gr.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                r7Var2.d = false;
                r7Var2.setWillNotDraw(true);
                r7Var = r7Var2;
                break;
            default:
                r7Var = new s(context, p6Var);
                break;
        }
        return sc.e.o(r7Var, r7Var, -1, -2);
    }
}

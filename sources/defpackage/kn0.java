package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class kn0 extends ka {
    public final ylb d;
    public r59 f;
    public so0 h;
    public so0 n;
    public if5 r;
    public so0 s;
    public TLRPC.Chat w;
    public ArrayList e = new ArrayList();
    public final HashMap x = new HashMap();

    public kn0(ylb ylbVar) {
        this.d = ylbVar;
        mf2 mf2Var = new mf2(this, (byte) 5);
        cf7 Y = cf7.Y(z8c.t0);
        Y.a.c(new x30(Y, mf2Var, (byte) 12));
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        if (i != 2 && i != 11 && i != 8 && i != 10 && i != 15 && i != 12 && i != 17 && i != 18) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i;
        TLRPC.ChatFull M0 = oc7.r1(z8c.t0).M0(chat.id);
        if (M0 != null && (i = M0.participants_count) > 0) {
            return i;
        }
        HashMap hashMap = this.x;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        for (int i = 0; i < this.e.size(); i++) {
            if (((jn0) this.e.get(i)).a == 7) {
                g(i);
            }
        }
    }

    @Override
    public final int b() {
        return this.e.size();
    }

    @Override
    public final int d(int i) {
        return ((jn0) this.e.get(i)).a;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        boolean z;
        int i2;
        int i3;
        long j;
        boolean z2;
        int i4 = u69Var.f;
        View view = u69Var.a;
        jn0 jn0Var = (jn0) this.e.get(i);
        if (i4 != 0) {
            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = null;
            if (i4 != 2) {
                if (i4 != 5) {
                    if (i4 != 6) {
                        if (i4 != 7) {
                            String str = "";
                            switch (i4) {
                                case 9:
                                    d92 d92Var = (d92) view;
                                    TLRPC.InputPeer inputPeer = jn0Var.d;
                                    if (inputPeer != null) {
                                        if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                                            TLRPC.Chat L0 = oc7.r1(z8c.t0).L0(Long.valueOf(inputPeer.chat_id));
                                            d92Var.f(L0, jn0Var.i, jn0Var.g, F(L0));
                                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                            TLRPC.Chat L02 = oc7.r1(z8c.t0).L0(Long.valueOf(inputPeer.channel_id));
                                            d92Var.f(L02, jn0Var.i, jn0Var.g, F(L02));
                                        }
                                    } else {
                                        TLRPC.Chat chat = jn0Var.e;
                                        d92Var.f(chat, jn0Var.i, jn0Var.g, F(chat));
                                    }
                                    d92Var.setChatDeleteListener(this.n);
                                    return;
                                case 10:
                                    ((x93) view).setDate(jn0Var.h);
                                    return;
                                case 11:
                                    ex7 ex7Var = (ex7) view;
                                    byte b = jn0Var.l;
                                    boolean z3 = jn0Var.b;
                                    boolean z4 = jn0Var.g;
                                    List list = (List) jn0Var.f;
                                    TLRPC.Chat chat2 = this.w;
                                    dg0 dg0Var = ex7Var.d;
                                    ex7Var.s = b;
                                    boolean V = sd2.V(chat2);
                                    if (b == 0) {
                                        if (V) {
                                            i3 = 2131753563;
                                        } else {
                                            i3 = 2131753564;
                                        }
                                        dg0Var.k(jb6.a0(null, null, i3, new Object[0]));
                                    } else if (b == 1) {
                                        if (V) {
                                            i2 = 2131753301;
                                        } else {
                                            i2 = 2131753302;
                                        }
                                        dg0Var.k(jb6.a0(null, null, i2, new Object[0]));
                                    }
                                    ex7Var.f.a(z3, false);
                                    ex7Var.setDivider(z4);
                                    anb.W(ex7Var.e, cmb.m5, ex7Var.a);
                                    if (list.size() == 0) {
                                        ex7Var.setSubtitle(ex7Var.e(jb6.M0(2131753487, null)));
                                        return;
                                    } else if (list.size() <= 3) {
                                        if (list.size() == 1) {
                                            ex7Var.setSubtitle(ex7Var.e(jb6.a0("BoostingFromAllCountries1", null, 2131753486, ((TLRPC.TL_help_country) list.get(0)).default_name)));
                                            return;
                                        } else if (list.size() == 2) {
                                            ex7Var.setSubtitle(ex7Var.e(jb6.a0("BoostingFromAllCountries2", null, 2131753485, ((TLRPC.TL_help_country) list.get(0)).default_name, ((TLRPC.TL_help_country) list.get(1)).default_name)));
                                            return;
                                        } else {
                                            ex7Var.setSubtitle(ex7Var.e(jb6.a0("BoostingFromAllCountries3", null, 2131753484, ((TLRPC.TL_help_country) list.get(0)).default_name, ((TLRPC.TL_help_country) list.get(1)).default_name, ((TLRPC.TL_help_country) list.get(2)).default_name)));
                                            return;
                                        }
                                    } else {
                                        ex7Var.setSubtitle(ex7Var.e(jb6.G(list.size(), "BoostingFromCountriesCount", new Object[0])));
                                        return;
                                    }
                                case 12:
                                    us3 us3Var = (us3) view;
                                    TLObject tLObject = jn0Var.m;
                                    int i5 = jn0Var.i;
                                    int i6 = jn0Var.j;
                                    long j2 = jn0Var.h;
                                    CharSequence charSequence = jn0Var.c;
                                    boolean z5 = jn0Var.g;
                                    boolean z6 = jn0Var.b;
                                    us3Var.w = tLObject;
                                    dg0 dg0Var2 = us3Var.d;
                                    if (i5 >= 12) {
                                        dg0Var2.k(jb6.G(1, "Years", new Object[0]));
                                    } else {
                                        dg0Var2.k(jb6.G(i5, "Months", new Object[0]));
                                    }
                                    StringBuilder sb = new StringBuilder();
                                    cj0 h = cj0.h();
                                    if (i6 > 0) {
                                        j = j2 / i6;
                                    } else {
                                        j = j2;
                                    }
                                    sb.append(h.e(j, charSequence.toString()));
                                    sb.append(" x ");
                                    sb.append(i6);
                                    us3Var.setSubtitle(sb.toString());
                                    lka lkaVar = us3Var.s;
                                    cj0 h2 = cj0.h();
                                    if (i6 <= 0) {
                                        j2 = 0;
                                    }
                                    lkaVar.l(h2.e(j2, charSequence.toString()), false);
                                    us3Var.setDivider(z5);
                                    us3Var.f.a(z6, false);
                                    return;
                                case 13:
                                    xcb xcbVar = (xcb) view;
                                    xcbVar.setText(jn0Var.c);
                                    int i7 = jn0Var.i;
                                    io ioVar = xcbVar.r;
                                    if (i7 > 0) {
                                        str = jb6.G(i7, "BoostingBoostsCountTitle", Integer.valueOf(i7));
                                    }
                                    ioVar.a();
                                    ioVar.c(str, true, true);
                                    return;
                                case 14:
                                    ((qo0) view).setGiveaway((TL_stories.PrepaidGiveaway) jn0Var.f);
                                    return;
                                case 15:
                                    ueb uebVar = (ueb) view;
                                    CharSequence charSequence2 = jn0Var.c;
                                    boolean z7 = jn0Var.b;
                                    boolean z8 = jn0Var.g;
                                    uebVar.L = jn0Var.l;
                                    uebVar.f(charSequence2, z7, z8);
                                    return;
                                case 16:
                                    n44 n44Var = (n44) view;
                                    n44Var.setCount(jn0Var.i);
                                    n44Var.setAfterTextChangedListener(this.s);
                                    return;
                                case 17:
                                    ata ataVar = (ata) view;
                                    TLObject tLObject2 = jn0Var.m;
                                    if (tLObject2 != null) {
                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) tLObject2;
                                    }
                                    int i8 = jn0Var.i;
                                    long j3 = jn0Var.h;
                                    boolean z9 = jn0Var.b;
                                    TextView textView = ataVar.f;
                                    io ioVar2 = ataVar.e;
                                    if (ataVar.r == tL_starsGiveawayOption) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    ataVar.a.a(z9, z2);
                                    ataVar.r = tL_starsGiveawayOption;
                                    if (z2) {
                                        ioVar2.a();
                                    }
                                    io ioVar3 = ataVar.d;
                                    if (tL_starsGiveawayOption == null) {
                                        ioVar3.c(ataVar.h, false, true);
                                        ioVar2.c(ataVar.n, z2, true);
                                        textView.setText("");
                                    } else {
                                        ioVar3.c(jb6.H(' ', "GiveawayStars", (int) tL_starsGiveawayOption.stars), false, true);
                                        ioVar2.c(jb6.H(',', "BoostingStarOptionPerUser", (int) j3), z2, true);
                                        textView.setText(cj0.h().e(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                                    }
                                    int i9 = i8 + 1;
                                    ataVar.s = i9;
                                    if (!z2) {
                                        ataVar.w.e(true, i9);
                                    }
                                    ataVar.invalidate();
                                    return;
                                default:
                                    return;
                            }
                        }
                        mjb mjbVar = (mjb) view;
                        mjbVar.setText(jn0Var.c);
                        mjbVar.setBackground(jn0Var.g);
                        return;
                    }
                    ((jf5) view).setText(jn0Var.c);
                    return;
                }
                lla llaVar = (lla) view;
                List list2 = jn0Var.k;
                int i10 = jn0Var.i;
                llaVar.getClass();
                String[] strArr = new String[list2.size()];
                for (int i11 = 0; i11 < list2.size(); i11++) {
                    strArr[i11] = String.valueOf((Integer) list2.get(i11));
                }
                llaVar.a.b(i10, null, strArr);
                llaVar.setCallBack(this.h);
                return;
            }
            po0 po0Var = (po0) view;
            byte b2 = jn0Var.l;
            int i12 = jn0Var.i;
            TLRPC.User user = (TLRPC.User) jn0Var.f;
            boolean z10 = jn0Var.b;
            bf0 bf0Var = po0Var.c;
            ylb ylbVar = po0Var.a;
            dg0 dg0Var3 = po0Var.d;
            lka lkaVar2 = po0Var.e;
            pc0 pc0Var = po0Var.b;
            if (po0Var.s == b2) {
                z = true;
            } else {
                z = false;
            }
            po0Var.s = b2;
            if (b2 == 0) {
                dg0Var3.k(jb6.M0(2131753506, null));
                po0Var.setSubtitle(jb6.M0(2131753132, null));
                anb.W(lkaVar2, cmb.q5, ylbVar);
                pc0Var.f(16);
                pc0Var.h(-15292942, -15630089);
                po0Var.setDivider(true);
                anb.Z(po0Var, po0Var.getContext(), 2131231234, cmb.a7);
            } else if (b2 == 1) {
                dg0Var3.k(jb6.M0(2131753558, null));
                if (i12 == 1 && user != null) {
                    po0Var.setSubtitle(po0Var.e(b10.e(lkaVar2, m9c.r(user), false, null, 0)));
                } else if (i12 > 0) {
                    po0Var.setSubtitle(po0Var.e(jb6.G(i12, "Recipient", new Object[0])));
                } else {
                    po0Var.setSubtitle(po0Var.e(jb6.M0(2131753250, null)));
                }
                anb.W(lkaVar2, cmb.m5, ylbVar);
                pc0Var.f(6);
                pc0Var.h(-3905294, -6923014);
                po0Var.setDivider(false);
                anb.Z(po0Var, po0Var.getContext(), 2131231235, cmb.a7);
            } else if (b2 == 2) {
                dg0Var3.k(jb6.M0(2131753297, null));
                if (i12 == 1 && user != null) {
                    po0Var.setSubtitle(po0Var.e(b10.e(lkaVar2, m9c.r(user), false, null, 0)));
                } else if (i12 > 0) {
                    po0Var.setSubtitle(po0Var.e(jb6.G(i12, "Recipient", new Object[0])));
                } else {
                    po0Var.setSubtitle(po0Var.e(jb6.M0(2131753132, null)));
                }
                anb.W(lkaVar2, cmb.m5, ylbVar);
                pc0Var.f(25);
                pc0Var.h(-3905294, -6923014);
                po0Var.setDivider(true);
                anb.Z(po0Var, po0Var.getContext(), 2131231234, cmb.a7);
            } else if (b2 == 3) {
                dg0Var3.k(xib.b(jb6.M0(2131753222, null)));
                po0Var.setSubtitle(jb6.M0(2131753132, null));
                anb.W(lkaVar2, cmb.q5, ylbVar);
                pc0Var.f(26);
                pc0Var.h(-146917, -625593);
                po0Var.setDivider(false);
                anb.Z(po0Var, po0Var.getContext(), 2131231235, cmb.a7);
            }
            po0Var.f.a(z10, z);
            bf0Var.setImageDrawable(pc0Var);
            bf0Var.setRoundRadius(gm.L(20.0f));
            return;
        }
        if5 if5Var = (if5) view;
        this.r = if5Var;
        if5Var.setBoostViaGifsText(this.w);
        this.r.setStars(jn0Var.g);
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        xwa xwaVar;
        boolean z;
        Context context = viewGroup.getContext();
        ylb ylbVar = this.d;
        switch (i) {
            case 2:
                xwaVar = new po0(context, ylbVar);
                break;
            case 3:
                xwaVar = new View(context);
                break;
            case 4:
                int i2 = cmb.Z6;
                View bbaVar = new bba(context, cmb.v0(i2, ylbVar), 0);
                anb.h(i2, ylbVar, bbaVar);
                xwaVar = bbaVar;
                break;
            case 5:
                xwaVar = new lla(context, ylbVar);
                break;
            case 6:
                View jf5Var = new jf5(context, cmb.K6, 21, 15, 3, false, false, this.d);
                anb.h(cmb.g5, ylbVar, jf5Var);
                xwaVar = jf5Var;
                break;
            case 7:
                xwaVar = new mjb(context, ylbVar);
                break;
            case 8:
                xwaVar = new na(context, ylbVar);
                break;
            case 9:
                xwaVar = new d92(context, ylbVar);
                break;
            case 10:
                xwaVar = new x93(context, ylbVar);
                break;
            case 11:
                gg0 gg0Var = new gg0(context, ylbVar);
                gg0Var.c.setVisibility(8);
                xwaVar = gg0Var;
                break;
            case 12:
                xwaVar = new us3(context, ylbVar);
                break;
            case 13:
                View xcbVar = new xcb(context, ylbVar);
                anb.h(cmb.g5, ylbVar, xcbVar);
                xwaVar = xcbVar;
                break;
            case 14:
                xwaVar = new po0(context, ylbVar);
                break;
            case 15:
                bjb bjbVar = new bjb(context, ylbVar);
                bjbVar.setHeight(50);
                xwaVar = bjbVar;
                break;
            case 16:
                xwaVar = new n44(context, ylbVar);
                break;
            case 17:
                xwaVar = new ata(context, ylbVar);
                break;
            case 18:
                xwa xwaVar2 = new xwa(context);
                String M0 = jb6.M0(2131747569, null);
                if (xwaVar2.c == -1) {
                    z = true;
                } else {
                    z = false;
                }
                xwaVar2.c = -1;
                io ioVar = xwaVar2.a;
                ioVar.c(M0, z, true);
                int i3 = cmb.n6;
                cmb.u0(i3);
                anb.U(ioVar, i3, null);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                ImageView imageView = xwaVar2.b;
                anb.s(imageView, i3, null, mode);
                if (z) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(d53.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                xwaVar2.d = false;
                xwaVar2.setWillNotDraw(true);
                xwaVar = xwaVar2;
                break;
            default:
                xwaVar = new if5(context, ylbVar);
                break;
        }
        return kt6.h(xwaVar, xwaVar, -1, -2);
    }
}

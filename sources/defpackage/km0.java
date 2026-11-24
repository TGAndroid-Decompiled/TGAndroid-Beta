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
public final class km0 extends ka {
    public final wjb d;
    public o39 f;
    public sn0 h;
    public sn0 n;
    public kd5 r;
    public sn0 s;
    public TLRPC.Chat w;
    public ArrayList e = new ArrayList();
    public final HashMap x = new HashMap();

    public km0(wjb wjbVar) {
        this.d = wjbVar;
        be2 be2Var = new be2(this, (byte) 5);
        ad7 Y = ad7.Y(y6c.t0);
        Y.a.c(new z20(Y, be2Var, (byte) 11));
    }

    @Override
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        if (i != 2 && i != 11 && i != 8 && i != 10 && i != 15 && i != 12 && i != 17 && i != 18) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i;
        TLRPC.ChatFull L0 = na7.q1(y6c.t0).L0(chat.id);
        if (L0 != null && (i = L0.participants_count) > 0) {
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
            if (((jm0) this.e.get(i)).a == 7) {
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
        return ((jm0) this.e.get(i)).a;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        boolean z;
        int i2;
        int i3;
        long j;
        boolean z2;
        int i4 = s49Var.f;
        View view = s49Var.a;
        jm0 jm0Var = (jm0) this.e.get(i);
        if (i4 != 0) {
            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = null;
            if (i4 != 2) {
                if (i4 != 5) {
                    if (i4 != 6) {
                        if (i4 != 7) {
                            String str = "";
                            switch (i4) {
                                case 9:
                                    s72 s72Var = (s72) view;
                                    TLRPC.InputPeer inputPeer = jm0Var.d;
                                    if (inputPeer != null) {
                                        if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                                            TLRPC.Chat K0 = na7.q1(y6c.t0).K0(Long.valueOf(inputPeer.chat_id));
                                            s72Var.f(K0, jm0Var.i, jm0Var.g, F(K0));
                                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                            TLRPC.Chat K02 = na7.q1(y6c.t0).K0(Long.valueOf(inputPeer.channel_id));
                                            s72Var.f(K02, jm0Var.i, jm0Var.g, F(K02));
                                        }
                                    } else {
                                        TLRPC.Chat chat = jm0Var.e;
                                        s72Var.f(chat, jm0Var.i, jm0Var.g, F(chat));
                                    }
                                    s72Var.setChatDeleteListener(this.n);
                                    return;
                                case 10:
                                    ((l83) view).setDate(jm0Var.h);
                                    return;
                                case 11:
                                    dv7 dv7Var = (dv7) view;
                                    byte b = jm0Var.l;
                                    boolean z3 = jm0Var.b;
                                    boolean z4 = jm0Var.g;
                                    List list = (List) jm0Var.f;
                                    TLRPC.Chat chat2 = this.w;
                                    df0 df0Var = dv7Var.d;
                                    dv7Var.s = b;
                                    boolean V = hc2.V(chat2);
                                    if (b == 0) {
                                        if (V) {
                                            i3 = 2131753595;
                                        } else {
                                            i3 = 2131753596;
                                        }
                                        df0Var.k(k96.a0(null, null, i3, new Object[0]));
                                    } else if (b == 1) {
                                        if (V) {
                                            i2 = 2131753333;
                                        } else {
                                            i2 = 2131753334;
                                        }
                                        df0Var.k(k96.a0(null, null, i2, new Object[0]));
                                    }
                                    dv7Var.f.a(z3, false);
                                    dv7Var.setDivider(z4);
                                    zkb.W(dv7Var.e, bkb.m5, dv7Var.a);
                                    if (list.size() == 0) {
                                        dv7Var.setSubtitle(dv7Var.e(k96.M0(2131753519, null)));
                                        return;
                                    } else if (list.size() <= 3) {
                                        if (list.size() == 1) {
                                            dv7Var.setSubtitle(dv7Var.e(k96.a0("BoostingFromAllCountries1", null, 2131753518, ((TLRPC.TL_help_country) list.get(0)).default_name)));
                                            return;
                                        } else if (list.size() == 2) {
                                            dv7Var.setSubtitle(dv7Var.e(k96.a0("BoostingFromAllCountries2", null, 2131753517, ((TLRPC.TL_help_country) list.get(0)).default_name, ((TLRPC.TL_help_country) list.get(1)).default_name)));
                                            return;
                                        } else {
                                            dv7Var.setSubtitle(dv7Var.e(k96.a0("BoostingFromAllCountries3", null, 2131753516, ((TLRPC.TL_help_country) list.get(0)).default_name, ((TLRPC.TL_help_country) list.get(1)).default_name, ((TLRPC.TL_help_country) list.get(2)).default_name)));
                                            return;
                                        }
                                    } else {
                                        dv7Var.setSubtitle(dv7Var.e(k96.G(list.size(), "BoostingFromCountriesCount", new Object[0])));
                                        return;
                                    }
                                case 12:
                                    kr3 kr3Var = (kr3) view;
                                    TLObject tLObject = jm0Var.m;
                                    int i5 = jm0Var.i;
                                    int i6 = jm0Var.j;
                                    long j2 = jm0Var.h;
                                    CharSequence charSequence = jm0Var.c;
                                    boolean z5 = jm0Var.g;
                                    boolean z6 = jm0Var.b;
                                    kr3Var.w = tLObject;
                                    df0 df0Var2 = kr3Var.d;
                                    if (i5 >= 12) {
                                        df0Var2.k(k96.G(1, "Years", new Object[0]));
                                    } else {
                                        df0Var2.k(k96.G(i5, "Months", new Object[0]));
                                    }
                                    StringBuilder sb = new StringBuilder();
                                    ci0 h = ci0.h();
                                    if (i6 > 0) {
                                        j = j2 / i6;
                                    } else {
                                        j = j2;
                                    }
                                    sb.append(h.e(j, charSequence.toString()));
                                    sb.append(" x ");
                                    sb.append(i6);
                                    kr3Var.setSubtitle(sb.toString());
                                    jia jiaVar = kr3Var.s;
                                    ci0 h2 = ci0.h();
                                    if (i6 <= 0) {
                                        j2 = 0;
                                    }
                                    jiaVar.l(h2.e(j2, charSequence.toString()), false);
                                    kr3Var.setDivider(z5);
                                    kr3Var.f.a(z6, false);
                                    return;
                                case 13:
                                    wab wabVar = (wab) view;
                                    wabVar.setText(jm0Var.c);
                                    int i7 = jm0Var.i;
                                    hn hnVar = wabVar.r;
                                    if (i7 > 0) {
                                        str = k96.G(i7, "BoostingBoostsCountTitle", Integer.valueOf(i7));
                                    }
                                    hnVar.a();
                                    hnVar.c(str, true, true);
                                    return;
                                case 14:
                                    ((qn0) view).setGiveaway((TL_stories.PrepaidGiveaway) jm0Var.f);
                                    return;
                                case 15:
                                    scb scbVar = (scb) view;
                                    CharSequence charSequence2 = jm0Var.c;
                                    boolean z7 = jm0Var.b;
                                    boolean z8 = jm0Var.g;
                                    scbVar.L = jm0Var.l;
                                    scbVar.f(charSequence2, z7, z8);
                                    return;
                                case 16:
                                    c34 c34Var = (c34) view;
                                    c34Var.setCount(jm0Var.i);
                                    c34Var.setAfterTextChangedListener(this.s);
                                    return;
                                case 17:
                                    zqa zqaVar = (zqa) view;
                                    TLObject tLObject2 = jm0Var.m;
                                    if (tLObject2 != null) {
                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) tLObject2;
                                    }
                                    int i8 = jm0Var.i;
                                    long j3 = jm0Var.h;
                                    boolean z9 = jm0Var.b;
                                    TextView textView = zqaVar.f;
                                    hn hnVar2 = zqaVar.e;
                                    if (zqaVar.r == tL_starsGiveawayOption) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    zqaVar.a.a(z9, z2);
                                    zqaVar.r = tL_starsGiveawayOption;
                                    if (z2) {
                                        hnVar2.a();
                                    }
                                    hn hnVar3 = zqaVar.d;
                                    if (tL_starsGiveawayOption == null) {
                                        hnVar3.c(zqaVar.h, false, true);
                                        hnVar2.c(zqaVar.n, z2, true);
                                        textView.setText("");
                                    } else {
                                        hnVar3.c(k96.H(' ', "GiveawayStars", (int) tL_starsGiveawayOption.stars), false, true);
                                        hnVar2.c(k96.H(',', "BoostingStarOptionPerUser", (int) j3), z2, true);
                                        textView.setText(ci0.h().e(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                                    }
                                    int i9 = i8 + 1;
                                    zqaVar.s = i9;
                                    if (!z2) {
                                        zqaVar.w.e(true, i9);
                                    }
                                    zqaVar.invalidate();
                                    return;
                                default:
                                    return;
                            }
                        }
                        lhb lhbVar = (lhb) view;
                        lhbVar.setText(jm0Var.c);
                        lhbVar.setBackground(jm0Var.g);
                        return;
                    }
                    ((ld5) view).setText(jm0Var.c);
                    return;
                }
                kja kjaVar = (kja) view;
                List list2 = jm0Var.k;
                int i10 = jm0Var.i;
                kjaVar.getClass();
                String[] strArr = new String[list2.size()];
                for (int i11 = 0; i11 < list2.size(); i11++) {
                    strArr[i11] = String.valueOf((Integer) list2.get(i11));
                }
                kjaVar.a.b(i10, null, strArr);
                kjaVar.setCallBack(this.h);
                return;
            }
            pn0 pn0Var = (pn0) view;
            byte b2 = jm0Var.l;
            int i12 = jm0Var.i;
            TLRPC.User user = (TLRPC.User) jm0Var.f;
            boolean z10 = jm0Var.b;
            be0 be0Var = pn0Var.c;
            wjb wjbVar = pn0Var.a;
            df0 df0Var3 = pn0Var.d;
            jia jiaVar2 = pn0Var.e;
            pb0 pb0Var = pn0Var.b;
            if (pn0Var.s == b2) {
                z = true;
            } else {
                z = false;
            }
            pn0Var.s = b2;
            if (b2 == 0) {
                df0Var3.k(k96.M0(2131753538, null));
                pn0Var.setSubtitle(k96.M0(2131753164, null));
                zkb.W(jiaVar2, bkb.q5, wjbVar);
                pb0Var.f(16);
                pb0Var.h(-15292942, -15630089);
                pn0Var.setDivider(true);
                zkb.Z(pn0Var, pn0Var.getContext(), 2131231233, bkb.a7);
            } else if (b2 == 1) {
                df0Var3.k(k96.M0(2131753590, null));
                if (i12 == 1 && user != null) {
                    pn0Var.setSubtitle(pn0Var.e(b00.e(jiaVar2, l7c.r(user), false, null, 0)));
                } else if (i12 > 0) {
                    pn0Var.setSubtitle(pn0Var.e(k96.G(i12, "Recipient", new Object[0])));
                } else {
                    pn0Var.setSubtitle(pn0Var.e(k96.M0(2131753282, null)));
                }
                zkb.W(jiaVar2, bkb.m5, wjbVar);
                pb0Var.f(6);
                pb0Var.h(-3905294, -6923014);
                pn0Var.setDivider(false);
                zkb.Z(pn0Var, pn0Var.getContext(), 2131231234, bkb.a7);
            } else if (b2 == 2) {
                df0Var3.k(k96.M0(2131753329, null));
                if (i12 == 1 && user != null) {
                    pn0Var.setSubtitle(pn0Var.e(b00.e(jiaVar2, l7c.r(user), false, null, 0)));
                } else if (i12 > 0) {
                    pn0Var.setSubtitle(pn0Var.e(k96.G(i12, "Recipient", new Object[0])));
                } else {
                    pn0Var.setSubtitle(pn0Var.e(k96.M0(2131753164, null)));
                }
                zkb.W(jiaVar2, bkb.m5, wjbVar);
                pb0Var.f(25);
                pb0Var.h(-3905294, -6923014);
                pn0Var.setDivider(true);
                zkb.Z(pn0Var, pn0Var.getContext(), 2131231233, bkb.a7);
            } else if (b2 == 3) {
                df0Var3.k(wgb.b(k96.M0(2131753254, null)));
                pn0Var.setSubtitle(k96.M0(2131753164, null));
                zkb.W(jiaVar2, bkb.q5, wjbVar);
                pb0Var.f(26);
                pb0Var.h(-146917, -625593);
                pn0Var.setDivider(false);
                zkb.Z(pn0Var, pn0Var.getContext(), 2131231234, bkb.a7);
            }
            pn0Var.f.a(z10, z);
            be0Var.setImageDrawable(pb0Var);
            be0Var.setRoundRadius(gl.L(20.0f));
            return;
        }
        kd5 kd5Var = (kd5) view;
        this.r = kd5Var;
        kd5Var.setBoostViaGifsText(this.w);
        this.r.setStars(jm0Var.g);
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        tua tuaVar;
        boolean z;
        Context context = viewGroup.getContext();
        wjb wjbVar = this.d;
        switch (i) {
            case 2:
                tuaVar = new pn0(context, wjbVar);
                break;
            case 3:
                tuaVar = new View(context);
                break;
            case 4:
                int i2 = bkb.Z6;
                View b9aVar = new b9a(context, bkb.v0(i2, wjbVar), 0);
                zkb.h(i2, wjbVar, b9aVar);
                tuaVar = b9aVar;
                break;
            case 5:
                tuaVar = new kja(context, wjbVar);
                break;
            case 6:
                View ld5Var = new ld5(context, bkb.K6, 21, 15, 3, false, false, this.d);
                zkb.h(bkb.g5, wjbVar, ld5Var);
                tuaVar = ld5Var;
                break;
            case 7:
                tuaVar = new lhb(context, wjbVar);
                break;
            case 8:
                tuaVar = new na(context, wjbVar);
                break;
            case 9:
                tuaVar = new s72(context, wjbVar);
                break;
            case 10:
                tuaVar = new l83(context, wjbVar);
                break;
            case 11:
                gf0 gf0Var = new gf0(context, wjbVar);
                gf0Var.c.setVisibility(8);
                tuaVar = gf0Var;
                break;
            case 12:
                tuaVar = new kr3(context, wjbVar);
                break;
            case 13:
                View wabVar = new wab(context, wjbVar);
                zkb.h(bkb.g5, wjbVar, wabVar);
                tuaVar = wabVar;
                break;
            case 14:
                tuaVar = new pn0(context, wjbVar);
                break;
            case 15:
                ahb ahbVar = new ahb(context, wjbVar);
                ahbVar.setHeight(50);
                tuaVar = ahbVar;
                break;
            case 16:
                tuaVar = new c34(context, wjbVar);
                break;
            case 17:
                tuaVar = new zqa(context, wjbVar);
                break;
            case 18:
                tua tuaVar2 = new tua(context);
                String M0 = k96.M0(2131747643, null);
                if (tuaVar2.c == -1) {
                    z = true;
                } else {
                    z = false;
                }
                tuaVar2.c = -1;
                hn hnVar = tuaVar2.a;
                hnVar.c(M0, z, true);
                int i3 = bkb.n6;
                bkb.u0(i3);
                zkb.U(hnVar, i3, null);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                ImageView imageView = tuaVar2.b;
                zkb.s(imageView, i3, null, mode);
                if (z) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(s33.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                tuaVar2.d = false;
                tuaVar2.setWillNotDraw(true);
                tuaVar = tuaVar2;
                break;
            default:
                tuaVar = new kd5(context, wjbVar);
                break;
        }
        return ls6.h(tuaVar, tuaVar, -1, -2);
    }
}

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
public final class km0 extends la {
    public final vnb d;
    public d79 f;
    public sn0 h;
    public sn0 n;
    public lf5 r;
    public sn0 s;
    public TLRPC.Chat w;
    public ArrayList e = new ArrayList();
    public final HashMap x = new HashMap();

    public km0(vnb vnbVar) {
        this.d = vnbVar;
        te2 te2Var = new te2(this, (byte) 5);
        jf7 Y = jf7.Y(yac.t0);
        Y.a.c(new a30(Y, te2Var, (byte) 8));
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        if (i != 2 && i != 11 && i != 8 && i != 10 && i != 15 && i != 12 && i != 17 && i != 18) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i;
        TLRPC.ChatFull N0 = uc7.s1(yac.t0).N0(chat.id);
        if (N0 != null && (i = N0.participants_count) > 0) {
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
    public final void t(f89 f89Var, int i) {
        boolean z;
        int i2;
        int i3;
        long j;
        boolean z2;
        int i4 = f89Var.f;
        View view = f89Var.a;
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
                                    j82 j82Var = (j82) view;
                                    TLRPC.InputPeer inputPeer = jm0Var.d;
                                    if (inputPeer != null) {
                                        if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                                            TLRPC.Chat M0 = uc7.s1(yac.t0).M0(Long.valueOf(inputPeer.chat_id));
                                            j82Var.f(M0, jm0Var.i, jm0Var.g, F(M0));
                                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                            TLRPC.Chat M02 = uc7.s1(yac.t0).M0(Long.valueOf(inputPeer.channel_id));
                                            j82Var.f(M02, jm0Var.i, jm0Var.g, F(M02));
                                        }
                                    } else {
                                        TLRPC.Chat chat = jm0Var.e;
                                        j82Var.f(chat, jm0Var.i, jm0Var.g, F(chat));
                                    }
                                    j82Var.setChatDeleteListener(this.n);
                                    return;
                                case 10:
                                    ((e93) view).setDate(jm0Var.h);
                                    return;
                                case 11:
                                    ky7 ky7Var = (ky7) view;
                                    byte b = jm0Var.l;
                                    boolean z3 = jm0Var.b;
                                    boolean z4 = jm0Var.g;
                                    List list = (List) jm0Var.f;
                                    TLRPC.Chat chat2 = this.w;
                                    ff0 ff0Var = ky7Var.d;
                                    ky7Var.s = b;
                                    boolean V = xc2.V(chat2);
                                    if (b == 0) {
                                        if (V) {
                                            i3 = 2131753591;
                                        } else {
                                            i3 = 2131753592;
                                        }
                                        ff0Var.k(ob6.a0(null, null, i3, new Object[0]));
                                    } else if (b == 1) {
                                        if (V) {
                                            i2 = 2131753329;
                                        } else {
                                            i2 = 2131753330;
                                        }
                                        ff0Var.k(ob6.a0(null, null, i2, new Object[0]));
                                    }
                                    ky7Var.f.a(z3, false);
                                    ky7Var.setDivider(z4);
                                    yob.W(ky7Var.e, aob.n5, ky7Var.a);
                                    if (list.size() == 0) {
                                        ky7Var.setSubtitle(ky7Var.e(ob6.M0(2131753515, null)));
                                        return;
                                    } else if (list.size() <= 3) {
                                        if (list.size() == 1) {
                                            ky7Var.setSubtitle(ky7Var.e(ob6.a0("BoostingFromAllCountries1", null, 2131753514, ((TLRPC.TL_help_country) list.get(0)).default_name)));
                                            return;
                                        } else if (list.size() == 2) {
                                            ky7Var.setSubtitle(ky7Var.e(ob6.a0("BoostingFromAllCountries2", null, 2131753513, ((TLRPC.TL_help_country) list.get(0)).default_name, ((TLRPC.TL_help_country) list.get(1)).default_name)));
                                            return;
                                        } else {
                                            ky7Var.setSubtitle(ky7Var.e(ob6.a0("BoostingFromAllCountries3", null, 2131753512, ((TLRPC.TL_help_country) list.get(0)).default_name, ((TLRPC.TL_help_country) list.get(1)).default_name, ((TLRPC.TL_help_country) list.get(2)).default_name)));
                                            return;
                                        }
                                    } else {
                                        ky7Var.setSubtitle(ky7Var.e(ob6.G(list.size(), "BoostingFromCountriesCount", new Object[0])));
                                        return;
                                    }
                                case 12:
                                    cs3 cs3Var = (cs3) view;
                                    TLObject tLObject = jm0Var.m;
                                    int i5 = jm0Var.i;
                                    int i6 = jm0Var.j;
                                    long j2 = jm0Var.h;
                                    CharSequence charSequence = jm0Var.c;
                                    boolean z5 = jm0Var.g;
                                    boolean z6 = jm0Var.b;
                                    cs3Var.w = tLObject;
                                    ff0 ff0Var2 = cs3Var.d;
                                    if (i5 >= 12) {
                                        ff0Var2.k(ob6.G(1, "Years", new Object[0]));
                                    } else {
                                        ff0Var2.k(ob6.G(i5, "Months", new Object[0]));
                                    }
                                    StringBuilder sb = new StringBuilder();
                                    di0 h = di0.h();
                                    if (i6 > 0) {
                                        j = j2 / i6;
                                    } else {
                                        j = j2;
                                    }
                                    sb.append(h.e(j, charSequence.toString()));
                                    sb.append(" x ");
                                    sb.append(i6);
                                    cs3Var.setSubtitle(sb.toString());
                                    ema emaVar = cs3Var.s;
                                    di0 h2 = di0.h();
                                    if (i6 <= 0) {
                                        j2 = 0;
                                    }
                                    emaVar.l(h2.e(j2, charSequence.toString()), false);
                                    cs3Var.setDivider(z5);
                                    cs3Var.f.a(z6, false);
                                    return;
                                case 13:
                                    teb tebVar = (teb) view;
                                    tebVar.setText(jm0Var.c);
                                    int i7 = jm0Var.i;
                                    in inVar = tebVar.r;
                                    if (i7 > 0) {
                                        str = ob6.G(i7, "BoostingBoostsCountTitle", Integer.valueOf(i7));
                                    }
                                    inVar.a();
                                    inVar.c(str, true, true);
                                    return;
                                case 14:
                                    ((qn0) view).setGiveaway((TL_stories.PrepaidGiveaway) jm0Var.f);
                                    return;
                                case 15:
                                    ogb ogbVar = (ogb) view;
                                    CharSequence charSequence2 = jm0Var.c;
                                    boolean z7 = jm0Var.b;
                                    boolean z8 = jm0Var.g;
                                    ogbVar.L = jm0Var.l;
                                    ogbVar.f(charSequence2, z7, z8);
                                    return;
                                case 16:
                                    y34 y34Var = (y34) view;
                                    y34Var.setCount(jm0Var.i);
                                    y34Var.setAfterTextChangedListener(this.s);
                                    return;
                                case 17:
                                    ava avaVar = (ava) view;
                                    TLObject tLObject2 = jm0Var.m;
                                    if (tLObject2 != null) {
                                        tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) tLObject2;
                                    }
                                    int i8 = jm0Var.i;
                                    long j3 = jm0Var.h;
                                    boolean z9 = jm0Var.b;
                                    TextView textView = avaVar.f;
                                    in inVar2 = avaVar.e;
                                    if (avaVar.r == tL_starsGiveawayOption) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    avaVar.a.a(z9, z2);
                                    avaVar.r = tL_starsGiveawayOption;
                                    if (z2) {
                                        inVar2.a();
                                    }
                                    in inVar3 = avaVar.d;
                                    if (tL_starsGiveawayOption == null) {
                                        inVar3.c(avaVar.h, false, true);
                                        inVar2.c(avaVar.n, z2, true);
                                        textView.setText("");
                                    } else {
                                        inVar3.c(ob6.H(' ', "GiveawayStars", (int) tL_starsGiveawayOption.stars), false, true);
                                        inVar2.c(ob6.H(',', "BoostingStarOptionPerUser", (int) j3), z2, true);
                                        textView.setText(di0.h().e(tL_starsGiveawayOption.amount, tL_starsGiveawayOption.currency));
                                    }
                                    int i9 = i8 + 1;
                                    avaVar.s = i9;
                                    if (!z2) {
                                        avaVar.w.e(true, i9);
                                    }
                                    avaVar.invalidate();
                                    return;
                                default:
                                    return;
                            }
                        }
                        hlb hlbVar = (hlb) view;
                        hlbVar.setText(jm0Var.c);
                        hlbVar.setBackground(jm0Var.g);
                        return;
                    }
                    ((mf5) view).setText(jm0Var.c);
                    return;
                }
                dna dnaVar = (dna) view;
                List list2 = jm0Var.k;
                int i10 = jm0Var.i;
                dnaVar.getClass();
                String[] strArr = new String[list2.size()];
                for (int i11 = 0; i11 < list2.size(); i11++) {
                    strArr[i11] = String.valueOf((Integer) list2.get(i11));
                }
                dnaVar.a.b(i10, null, strArr);
                dnaVar.setCallBack(this.h);
                return;
            }
            pn0 pn0Var = (pn0) view;
            byte b2 = jm0Var.l;
            int i12 = jm0Var.i;
            TLRPC.User user = (TLRPC.User) jm0Var.f;
            boolean z10 = jm0Var.b;
            de0 de0Var = pn0Var.c;
            vnb vnbVar = pn0Var.a;
            ff0 ff0Var3 = pn0Var.d;
            ema emaVar2 = pn0Var.e;
            rb0 rb0Var = pn0Var.b;
            if (pn0Var.s == b2) {
                z = true;
            } else {
                z = false;
            }
            pn0Var.s = b2;
            if (b2 == 0) {
                ff0Var3.k(ob6.M0(2131753534, null));
                pn0Var.setSubtitle(ob6.M0(2131753160, null));
                yob.W(emaVar2, aob.r5, vnbVar);
                rb0Var.f(16);
                rb0Var.h(-15292942, -15630089);
                pn0Var.setDivider(true);
                yob.Z(pn0Var, pn0Var.getContext(), 2131231233, aob.b7);
            } else if (b2 == 1) {
                ff0Var3.k(ob6.M0(2131753586, null));
                if (i12 == 1 && user != null) {
                    pn0Var.setSubtitle(pn0Var.e(c00.f(emaVar2, lbc.r(user), false, null, 0)));
                } else if (i12 > 0) {
                    pn0Var.setSubtitle(pn0Var.e(ob6.G(i12, "Recipient", new Object[0])));
                } else {
                    pn0Var.setSubtitle(pn0Var.e(ob6.M0(2131753278, null)));
                }
                yob.W(emaVar2, aob.n5, vnbVar);
                rb0Var.f(6);
                rb0Var.h(-3905294, -6923014);
                pn0Var.setDivider(false);
                yob.Z(pn0Var, pn0Var.getContext(), 2131231234, aob.b7);
            } else if (b2 == 2) {
                ff0Var3.k(ob6.M0(2131753325, null));
                if (i12 == 1 && user != null) {
                    pn0Var.setSubtitle(pn0Var.e(c00.f(emaVar2, lbc.r(user), false, null, 0)));
                } else if (i12 > 0) {
                    pn0Var.setSubtitle(pn0Var.e(ob6.G(i12, "Recipient", new Object[0])));
                } else {
                    pn0Var.setSubtitle(pn0Var.e(ob6.M0(2131753160, null)));
                }
                yob.W(emaVar2, aob.n5, vnbVar);
                rb0Var.f(25);
                rb0Var.h(-3905294, -6923014);
                pn0Var.setDivider(true);
                yob.Z(pn0Var, pn0Var.getContext(), 2131231233, aob.b7);
            } else if (b2 == 3) {
                ff0Var3.k(skb.b(ob6.M0(2131753250, null)));
                pn0Var.setSubtitle(ob6.M0(2131753160, null));
                yob.W(emaVar2, aob.r5, vnbVar);
                rb0Var.f(26);
                rb0Var.h(-146917, -625593);
                pn0Var.setDivider(false);
                yob.Z(pn0Var, pn0Var.getContext(), 2131231234, aob.b7);
            }
            pn0Var.f.a(z10, z);
            de0Var.setImageDrawable(rb0Var);
            de0Var.setRoundRadius(hl.L(20.0f));
            return;
        }
        lf5 lf5Var = (lf5) view;
        this.r = lf5Var;
        lf5Var.setBoostViaGifsText(this.w);
        this.r.setStars(jm0Var.g);
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        xya xyaVar;
        boolean z;
        Context context = viewGroup.getContext();
        vnb vnbVar = this.d;
        switch (i) {
            case 2:
                xyaVar = new pn0(context, vnbVar);
                break;
            case 3:
                xyaVar = new View(context);
                break;
            case 4:
                int i2 = aob.a7;
                View rcaVar = new rca(context, aob.v0(i2, vnbVar), 0);
                yob.h(i2, vnbVar, rcaVar);
                xyaVar = rcaVar;
                break;
            case 5:
                xyaVar = new dna(context, vnbVar);
                break;
            case 6:
                View mf5Var = new mf5(context, aob.L6, 21, 15, 3, false, false, this.d);
                yob.h(aob.h5, vnbVar, mf5Var);
                xyaVar = mf5Var;
                break;
            case 7:
                xyaVar = new hlb(context, vnbVar);
                break;
            case 8:
                xyaVar = new oa(context, vnbVar);
                break;
            case 9:
                xyaVar = new j82(context, vnbVar);
                break;
            case 10:
                xyaVar = new e93(context, vnbVar);
                break;
            case 11:
                if0 if0Var = new if0(context, vnbVar);
                if0Var.c.setVisibility(8);
                xyaVar = if0Var;
                break;
            case 12:
                xyaVar = new cs3(context, vnbVar);
                break;
            case 13:
                View tebVar = new teb(context, vnbVar);
                yob.h(aob.h5, vnbVar, tebVar);
                xyaVar = tebVar;
                break;
            case 14:
                xyaVar = new pn0(context, vnbVar);
                break;
            case 15:
                wkb wkbVar = new wkb(context, vnbVar);
                wkbVar.setHeight(50);
                xyaVar = wkbVar;
                break;
            case 16:
                xyaVar = new y34(context, vnbVar);
                break;
            case 17:
                xyaVar = new ava(context, vnbVar);
                break;
            case 18:
                xya xyaVar2 = new xya(context);
                String M0 = ob6.M0(2131747563, null);
                if (xyaVar2.c == -1) {
                    z = true;
                } else {
                    z = false;
                }
                xyaVar2.c = -1;
                in inVar = xyaVar2.a;
                inVar.c(M0, z, true);
                int i3 = aob.o6;
                aob.u0(i3);
                yob.U(inVar, i3, null);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                ImageView imageView = xyaVar2.b;
                yob.s(imageView, i3, null, mode);
                if (z) {
                    imageView.animate().rotation(0.0f).setDuration(340L).setInterpolator(k43.h);
                } else {
                    imageView.setRotation(0.0f);
                }
                xyaVar2.d = false;
                xyaVar2.setWillNotDraw(true);
                xyaVar = xyaVar2;
                break;
            default:
                xyaVar = new lf5(context, vnbVar);
                break;
        }
        return qu6.h(xyaVar, xyaVar, -1, -2);
    }
}

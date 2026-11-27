package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
public final class s38 extends c79 {
    public final Context c;
    public final boolean d;
    public final a48 e;

    public s38(a48 a48Var, Context context, int i) {
        this.e = a48Var;
        this.c = context;
        this.d = i;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        if (i != 3 && i != 6 && i != 8 && i != 12) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.e.l0;
    }

    @Override
    public final int d(int i) {
        a48 a48Var = this.e;
        if (i != a48Var.S && i != a48Var.h0 && i != a48Var.U && i != a48Var.a0) {
            if (i == a48Var.R) {
                return 1;
            }
            if (i == a48Var.T) {
                return 3;
            }
            if (i == a48Var.V) {
                return 5;
            }
            if (i == a48Var.W) {
                return 6;
            }
            if (i == a48Var.i0) {
                return 10;
            }
            if (i == a48Var.j0) {
                return 11;
            }
            if (i == a48Var.b0) {
                return 7;
            }
            if (i >= a48Var.c0 && i < a48Var.d0) {
                if (a48Var.L == null) {
                    return 8;
                }
                return 12;
            } else if (i >= a48Var.e0 && i < a48Var.f0) {
                return 9;
            } else {
                if (i == a48Var.l0 - 1 || i == a48Var.k0) {
                    return 4;
                }
                return 2;
            }
        }
        return 2;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        int i2;
        String M0;
        int i3;
        int i4;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        boolean z;
        int i5;
        boolean z2;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = f89Var.a;
        a48 a48Var = this.e;
        HashMap hashMap = a48Var.N;
        ArrayList arrayList = a48Var.m0;
        h48 h48Var = a48Var.q0;
        ArrayList arrayList2 = a48Var.M;
        int d = d(i);
        boolean z3 = this.d;
        int i6 = 1;
        r11 = true;
        boolean z4 = true;
        switch (d) {
            case 1:
                yob.h(aob.d6, h48Var.getResourceProvider(), view);
                ((d48) view).updateColors();
                return;
            case 2:
                ilb ilbVar = (ilb) view;
                ilbVar.setFixedSize(0);
                if (i == a48Var.S) {
                    if (z3) {
                        if (h48Var.a) {
                            i3 = 2131752408;
                        } else {
                            i3 = 2131743407;
                        }
                        M0 = ob6.M0(i3, null);
                    } else {
                        if (h48Var.a) {
                            i2 = 2131752292;
                        } else {
                            i2 = 2131743389;
                        }
                        M0 = ob6.M0(i2, null);
                    }
                    ilbVar.setText(hl.D2(hl.N2(M0, -1, 0, new q38(this, z3 ? 1 : 0), null), true));
                    return;
                } else if (i == a48Var.a0) {
                    ilbVar.setText("");
                    ilbVar.setFixedSize(12);
                    return;
                } else if (i == a48Var.h0) {
                    ilbVar.setText(ob6.M0(2131743395, null));
                    return;
                } else {
                    return;
                }
            case 3:
                ((z38) view).updateColors();
                return;
            case 4:
            case 5:
            case 9:
            default:
                return;
            case 6:
                skb skbVar = (skb) view;
                skbVar.updateColors();
                yob.h(aob.d6, h48Var.getResourceProvider(), skbVar);
                skbVar.updateColors();
                if (i == a48Var.W) {
                    if (h48Var.a) {
                        i4 = 2131752294;
                    } else {
                        i4 = 2131743392;
                    }
                    skbVar.k(ob6.M0(i4, null), false);
                    return;
                }
                return;
            case 7:
                mf5 mf5Var = (mf5) view;
                if (i == a48Var.b0) {
                    mf5Var.c(ob6.M0(2131743396, null), false);
                }
                yob.h(aob.d6, h48Var.getResourceProvider(), mf5Var);
                return;
            case 8:
                m38 m38Var = (m38) view;
                int i7 = i - a48Var.c0;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i7);
                    m38Var.a(i7, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = a48Var.r;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.id) || ((tL_peerColorCollectible = a48Var.s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.id)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    m38Var.b(z, false);
                    m38Var.d.invalidate();
                    return;
                }
                return;
            case 10:
                a48Var.G = view;
                g48 g48Var = a48Var.F;
                arrayList2.clear();
                hashMap.clear();
                i5 = ((e) h48Var).currentAccount;
                ArrayList arrayList3 = jxa.v(i5, false).I;
                arrayList2.add(ob6.M0(2131749892, null));
                int i8 = 0;
                int i9 = 0;
                while (i8 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i8);
                    if ((!z3 || (z3 == i6 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (a48Var.L == starGift) {
                            i9 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i6);
                        textPaint.setTextSize(hl.L(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        hm hmVar = new hm(starGift.getDocument(), textPaint.getFontMetricsInt());
                        hmVar.size = hl.L(14.0f);
                        spannableStringBuilder.setSpan(hmVar, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i8++;
                    i6 = 1;
                }
                r38 r38Var = new r38(this, (byte) 0);
                ArrayList arrayList4 = g48Var.f;
                if (g48Var.L == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                g48Var.L = 0;
                g48Var.h = r38Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                g48Var.c.f();
                g48Var.a(i9, z2);
                a48Var.l(g48Var);
                view.post(new o38(a48Var, (byte) 2));
                return;
            case 11:
                ((y38) view).updateColors();
                return;
            case 12:
                sx4 sx4Var = (sx4) view;
                int i10 = i - a48Var.c0;
                if (a48Var.K != null && i10 >= 0 && i10 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i10);
                    sx4Var.h(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = a48Var.r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible2 = a48Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.id)) {
                        z4 = false;
                    }
                    sx4Var.f(z4, false);
                    return;
                }
                return;
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        int i2;
        vnb vnbVar;
        z38 z38Var;
        vnb vnbVar2;
        vnb vnbVar3;
        vnb vnbVar4;
        int i3;
        vnb vnbVar5;
        a48 a48Var = this.e;
        h48 h48Var = a48Var.q0;
        switch (i) {
            case 1:
                Context context = a48Var.getContext();
                i2 = ((e) h48Var).currentAccount;
                vnbVar = ((e) h48Var).resourceProvider;
                d48 d48Var = new d48(this.d ? 1 : 0, i2, vnbVar, context);
                a48Var.f = d48Var;
                yob.h(aob.d6, h48Var.getResourceProvider(), d48Var);
                d48Var.a(a48Var.h, false);
                d48Var.setOnColorClick(new r38(this, (byte) 1));
                z38Var = d48Var;
                break;
            case 2:
            default:
                z38Var = new ilb(a48Var.getContext(), h48Var.getResourceProvider());
                break;
            case 3:
                z38 z38Var2 = new z38(a48Var, a48Var.getContext());
                a48Var.E = z38Var2;
                z38Var2.b(false);
                z38Var = z38Var2;
                break;
            case 4:
                View t62Var = new t62(a48Var.getContext(), (byte) 18);
                t62Var.setTag(-33024);
                z38Var = t62Var;
                break;
            case 5:
                View view = new View(a48Var.getContext());
                view.setTag(-33024);
                z38Var = view;
                break;
            case 6:
                View skbVar = new skb(a48Var.getContext(), h48Var.getResourceProvider());
                yob.h(aob.d6, h48Var.getResourceProvider(), skbVar);
                z38Var = skbVar;
                break;
            case 7:
                Context context2 = a48Var.getContext();
                vnbVar2 = ((e) h48Var).resourceProvider;
                View mf5Var = new mf5(context2, vnbVar2);
                yob.h(aob.d6, h48Var.getResourceProvider(), mf5Var);
                z38Var = mf5Var;
                break;
            case 8:
                Context context3 = a48Var.getContext();
                vnbVar3 = ((e) h48Var).resourceProvider;
                View m38Var = new m38(vnbVar3, context3, false);
                m38Var.setTag(-33024);
                z38Var = m38Var;
                break;
            case 9:
                Context context4 = this.c;
                vnbVar4 = ((e) h48Var).resourceProvider;
                tk4 tk4Var = new tk4(context4, vnbVar4);
                tk4Var.setIsSingleCell(true);
                tk4Var.setViewType(35);
                tk4Var.setTag(-33024);
                z38Var = tk4Var;
                break;
            case 10:
                View t62Var2 = new t62(a48Var.getContext(), (byte) 19);
                t62Var2.setTag(-33024);
                z38Var = t62Var2;
                break;
            case 11:
                z38Var = new y38(a48Var, a48Var.getContext());
                break;
            case 12:
                Context context5 = a48Var.getContext();
                i3 = ((e) h48Var).currentAccount;
                vnbVar5 = ((e) h48Var).resourceProvider;
                View sx4Var = new sx4(i3, vnbVar5, context5);
                sx4Var.setTag(-33024);
                z38Var = sx4Var;
                break;
        }
        return new f89(z38Var);
    }

    @Override
    public final void y(f89 f89Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        a48 a48Var = this.e;
        ArrayList arrayList = a48Var.m0;
        int i = f89Var.f;
        View view = f89Var.a;
        if (i == 10) {
            a48Var.G = view;
            view.post(new o38(a48Var, (byte) 2));
            return;
        }
        boolean z = true;
        if (i == 8) {
            m38 m38Var = (m38) view;
            int b = f89Var.b() - a48Var.c0;
            if (b >= 0 && b < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b);
                m38Var.a(b, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = a48Var.r;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.id) && ((tL_peerColorCollectible2 = a48Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.id)) {
                    z = false;
                }
                m38Var.b(z, false);
            }
        } else if (i == 12) {
            sx4 sx4Var = (sx4) view;
            int b2 = f89Var.b() - a48Var.c0;
            if (a48Var.K != null && b2 >= 0 && b2 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b2);
                sx4Var.h(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = a48Var.r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible = a48Var.s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.id)) {
                    z = false;
                }
                sx4Var.f(z, false);
            }
        }
    }
}

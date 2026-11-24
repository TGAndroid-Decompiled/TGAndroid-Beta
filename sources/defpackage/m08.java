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
import org.telegram.ui.ActionBar.d;
public final class m08 extends n39 {
    public final Context c;
    public final boolean d;
    public final t08 e;

    public m08(t08 t08Var, Context context, int i) {
        this.e = t08Var;
        this.c = context;
        this.d = i;
    }

    @Override
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
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
        t08 t08Var = this.e;
        if (i != t08Var.S && i != t08Var.h0 && i != t08Var.U && i != t08Var.a0) {
            if (i == t08Var.R) {
                return 1;
            }
            if (i == t08Var.T) {
                return 3;
            }
            if (i == t08Var.V) {
                return 5;
            }
            if (i == t08Var.W) {
                return 6;
            }
            if (i == t08Var.i0) {
                return 10;
            }
            if (i == t08Var.j0) {
                return 11;
            }
            if (i == t08Var.b0) {
                return 7;
            }
            if (i >= t08Var.c0 && i < t08Var.d0) {
                if (t08Var.L == null) {
                    return 8;
                }
                return 12;
            } else if (i >= t08Var.e0 && i < t08Var.f0) {
                return 9;
            } else {
                if (i == t08Var.l0 - 1 || i == t08Var.k0) {
                    return 4;
                }
                return 2;
            }
        }
        return 2;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        int i2;
        String M0;
        int i3;
        int i4;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        boolean z;
        int i5;
        boolean z2;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = s49Var.a;
        t08 t08Var = this.e;
        HashMap hashMap = t08Var.N;
        ArrayList arrayList = t08Var.m0;
        a18 a18Var = t08Var.q0;
        ArrayList arrayList2 = t08Var.M;
        int d = d(i);
        boolean z3 = this.d;
        int i6 = 1;
        r11 = true;
        boolean z4 = true;
        switch (d) {
            case 1:
                zkb.h(bkb.c6, a18Var.getResourceProvider(), view);
                ((w08) view).updateColors();
                return;
            case 2:
                mhb mhbVar = (mhb) view;
                mhbVar.setFixedSize(0);
                if (i == t08Var.S) {
                    if (z3) {
                        if (a18Var.a) {
                            i3 = 2131752422;
                        } else {
                            i3 = 2131743513;
                        }
                        M0 = k96.M0(i3, null);
                    } else {
                        if (a18Var.a) {
                            i2 = 2131752310;
                        } else {
                            i2 = 2131743495;
                        }
                        M0 = k96.M0(i2, null);
                    }
                    mhbVar.setText(gl.E2(gl.O2(M0, -1, 0, new k08(this, z3 ? 1 : 0), null), true));
                    return;
                } else if (i == t08Var.a0) {
                    mhbVar.setText("");
                    mhbVar.setFixedSize(12);
                    return;
                } else if (i == t08Var.h0) {
                    mhbVar.setText(k96.M0(2131743501, null));
                    return;
                } else {
                    return;
                }
            case 3:
                ((s08) view).updateColors();
                return;
            case 4:
            case 5:
            case 9:
            default:
                return;
            case 6:
                wgb wgbVar = (wgb) view;
                wgbVar.updateColors();
                zkb.h(bkb.c6, a18Var.getResourceProvider(), wgbVar);
                wgbVar.updateColors();
                if (i == t08Var.W) {
                    if (a18Var.a) {
                        i4 = 2131752312;
                    } else {
                        i4 = 2131743498;
                    }
                    wgbVar.k(k96.M0(i4, null), false);
                    return;
                }
                return;
            case 7:
                ld5 ld5Var = (ld5) view;
                if (i == t08Var.b0) {
                    ld5Var.c(k96.M0(2131743502, null), false);
                }
                zkb.h(bkb.c6, a18Var.getResourceProvider(), ld5Var);
                return;
            case 8:
                g08 g08Var = (g08) view;
                int i7 = i - t08Var.c0;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i7);
                    g08Var.a(i7, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = t08Var.r;
                    if ((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.id) || ((tL_peerColorCollectible = t08Var.s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.id)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    g08Var.b(z, false);
                    g08Var.d.invalidate();
                    return;
                }
                return;
            case 10:
                t08Var.G = view;
                z08 z08Var = t08Var.F;
                arrayList2.clear();
                hashMap.clear();
                i5 = ((d) a18Var).currentAccount;
                ArrayList arrayList3 = gta.v(i5, false).I;
                arrayList2.add(k96.M0(2131749930, null));
                int i8 = 0;
                int i9 = 0;
                while (i8 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i8);
                    if ((!z3 || (z3 == i6 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (t08Var.L == starGift) {
                            i9 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i6);
                        textPaint.setTextSize(gl.L(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        gm gmVar = new gm(starGift.getDocument(), textPaint.getFontMetricsInt());
                        gmVar.size = gl.L(14.0f);
                        spannableStringBuilder.setSpan(gmVar, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i8++;
                    i6 = 1;
                }
                l08 l08Var = new l08(this, (byte) 0);
                ArrayList arrayList4 = z08Var.f;
                if (z08Var.L == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z08Var.L = 0;
                z08Var.h = l08Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                z08Var.c.f();
                z08Var.a(i9, z2);
                t08Var.l(z08Var);
                view.post(new i08(t08Var, (byte) 3));
                return;
            case 11:
                ((r08) view).updateColors();
                return;
            case 12:
                nv4 nv4Var = (nv4) view;
                int i10 = i - t08Var.c0;
                if (t08Var.K != null && i10 >= 0 && i10 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i10);
                    nv4Var.h(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = t08Var.r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible2 = t08Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.id)) {
                        z4 = false;
                    }
                    nv4Var.f(z4, false);
                    return;
                }
                return;
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        int i2;
        wjb wjbVar;
        s08 s08Var;
        wjb wjbVar2;
        wjb wjbVar3;
        wjb wjbVar4;
        int i3;
        wjb wjbVar5;
        t08 t08Var = this.e;
        a18 a18Var = t08Var.q0;
        switch (i) {
            case 1:
                Context context = t08Var.getContext();
                i2 = ((d) a18Var).currentAccount;
                wjbVar = ((d) a18Var).resourceProvider;
                w08 w08Var = new w08(this.d ? 1 : 0, i2, wjbVar, context);
                t08Var.f = w08Var;
                zkb.h(bkb.c6, a18Var.getResourceProvider(), w08Var);
                w08Var.a(t08Var.h, false);
                w08Var.setOnColorClick(new l08(this, (byte) 1));
                s08Var = w08Var;
                break;
            case 2:
            default:
                s08Var = new mhb(t08Var.getContext(), a18Var.getResourceProvider());
                break;
            case 3:
                s08 s08Var2 = new s08(t08Var, t08Var.getContext());
                t08Var.E = s08Var2;
                s08Var2.b(false);
                s08Var = s08Var2;
                break;
            case 4:
                View d62Var = new d62(t08Var.getContext(), (byte) 18);
                d62Var.setTag(-33024);
                s08Var = d62Var;
                break;
            case 5:
                View view = new View(t08Var.getContext());
                view.setTag(-33024);
                s08Var = view;
                break;
            case 6:
                View wgbVar = new wgb(t08Var.getContext(), a18Var.getResourceProvider());
                zkb.h(bkb.c6, a18Var.getResourceProvider(), wgbVar);
                s08Var = wgbVar;
                break;
            case 7:
                Context context2 = t08Var.getContext();
                wjbVar2 = ((d) a18Var).resourceProvider;
                View ld5Var = new ld5(context2, wjbVar2);
                zkb.h(bkb.c6, a18Var.getResourceProvider(), ld5Var);
                s08Var = ld5Var;
                break;
            case 8:
                Context context3 = t08Var.getContext();
                wjbVar3 = ((d) a18Var).resourceProvider;
                View g08Var = new g08(wjbVar3, context3, false);
                g08Var.setTag(-33024);
                s08Var = g08Var;
                break;
            case 9:
                Context context4 = this.c;
                wjbVar4 = ((d) a18Var).resourceProvider;
                pi4 pi4Var = new pi4(context4, wjbVar4);
                pi4Var.setIsSingleCell(true);
                pi4Var.setViewType(35);
                pi4Var.setTag(-33024);
                s08Var = pi4Var;
                break;
            case 10:
                View d62Var2 = new d62(t08Var.getContext(), (byte) 19);
                d62Var2.setTag(-33024);
                s08Var = d62Var2;
                break;
            case 11:
                s08Var = new r08(t08Var, t08Var.getContext());
                break;
            case 12:
                Context context5 = t08Var.getContext();
                i3 = ((d) a18Var).currentAccount;
                wjbVar5 = ((d) a18Var).resourceProvider;
                View nv4Var = new nv4(i3, wjbVar5, context5);
                nv4Var.setTag(-33024);
                s08Var = nv4Var;
                break;
        }
        return new s49(s08Var);
    }

    @Override
    public final void y(s49 s49Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        t08 t08Var = this.e;
        ArrayList arrayList = t08Var.m0;
        int i = s49Var.f;
        View view = s49Var.a;
        if (i == 10) {
            t08Var.G = view;
            view.post(new i08(t08Var, (byte) 2));
            return;
        }
        boolean z = true;
        if (i == 8) {
            g08 g08Var = (g08) view;
            int b = s49Var.b() - t08Var.c0;
            if (b >= 0 && b < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b);
                g08Var.a(b, tL_starGiftUnique);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = t08Var.r;
                if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.id) && ((tL_peerColorCollectible2 = t08Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.id)) {
                    z = false;
                }
                g08Var.b(z, false);
            }
        } else if (i == 12) {
            nv4 nv4Var = (nv4) view;
            int b2 = s49Var.b() - t08Var.c0;
            if (t08Var.K != null && b2 >= 0 && b2 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b2);
                nv4Var.h(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = t08Var.r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible = t08Var.s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.id)) {
                    z = false;
                }
                nv4Var.f(z, false);
            }
        }
    }
}

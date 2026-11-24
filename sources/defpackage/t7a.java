package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
public final class t7a implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public t7a(gta gtaVar, boolean[] zArr, i8c i8cVar) {
        this.a = (byte) 26;
        this.b = zArr;
        this.c = i8cVar;
    }

    @Override
    public final void run() {
        byte b;
        String[] strArr;
        String str;
        String a0;
        TLRPC.Chat K0;
        k27 messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z;
        TLRPC.TL_messageReactions tL_messageReactions2;
        long j = 0;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        switch (this.a) {
            case 0:
                ((d8a) this.b).f0((TLRPC.TL_attachMenuBot) this.c);
                return;
            case 1:
                taa taaVar = (taa) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    taaVar.f2 = (TLRPC.TL_exportedMessageLink) tLObject;
                    taaVar.V0();
                    if (taaVar.h2) {
                        taaVar.F0();
                    }
                }
                taaVar.g2 = false;
                return;
            case 2:
                z1b z1bVar = (z1b) this.c;
                oca ocaVar = ((nfa) this.b).c0;
                if (ocaVar != null) {
                    int i = z1bVar.a;
                    ocaVar.b.e(i, ocaVar.d.i(i));
                    return;
                }
                return;
            case 3:
                iea ieaVar = (iea) this.b;
                ar8 ar8Var = (ar8) this.c;
                ieaVar.G = null;
                ieaVar.H = null;
                ar8Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new ng9(ar8Var, (byte) 13)).start();
                return;
            case 4:
                xsa xsaVar = (xsa) this.b;
                xsaVar.e = !xsaVar.e;
                ((Runnable[]) this.c)[0].run();
                xsaVar.k(true);
                return;
            case 5:
                u21.b0(((zda) this.b).f.y1).Q(2131623990, 36, k96.a0(null, null, 2131742573, ((TLRPC.Chat) this.c).title)).k(true);
                return;
            case 6:
                kea keaVar = (kea) this.b;
                String str2 = (String) this.c;
                if (!keaVar.w.w1[keaVar.r].a.isEmpty() && ((b = keaVar.r) == 1 || b == 4)) {
                    k27 k27Var = (k27) b00.f(1, keaVar.w.w1[b].a);
                    int e1 = k27Var.e1();
                    long B0 = k27.B0(k27Var.k);
                    nfa nfaVar = keaVar.w;
                    if (nfaVar.m1 == nfaVar.y1.getUserConfig().e()) {
                        j = k27Var.P1();
                    }
                    keaVar.F(e1, B0, j, str2);
                } else if (keaVar.r == 3) {
                    nfa nfaVar2 = keaVar.w;
                    keaVar.F(0, nfaVar2.m1, nfaVar2.G, str2);
                }
                byte b2 = keaVar.r;
                if (b2 == 1 || b2 == 4) {
                    ArrayList arrayList2 = new ArrayList(keaVar.w.w1[keaVar.r].a);
                    keaVar.s++;
                    Utilities.g.c(new q3a(keaVar, str2, arrayList2, (byte) 9));
                    return;
                }
                return;
            case 7:
                kea keaVar2 = (kea) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                nfa nfaVar3 = keaVar2.w;
                boolean z2 = nfaVar3.Y0;
                iea[] ieaVarArr = nfaVar3.n0;
                if (z2) {
                    keaVar2.s--;
                    int b3 = keaVar2.b();
                    keaVar2.d = arrayList3;
                    int b4 = keaVar2.b();
                    if (keaVar2.s == 0 || b4 != 0) {
                        nfaVar3.z1(false);
                    }
                    for (int i2 = 0; i2 < ieaVarArr.length; i2++) {
                        iea ieaVar2 = ieaVarArr[i2];
                        if (ieaVar2.F == keaVar2.r) {
                            if (keaVar2.s == 0 && b4 == 0) {
                                ieaVar2.w.d.setText(k96.M0(2131747975, "NoResult"));
                                ieaVarArr[i2].w.f.setVisibility(8);
                                ieaVarArr[i2].w.e(false, true);
                            } else if (b3 == 0) {
                                nfaVar3.i(ieaVar2.h, 0, null);
                            }
                        }
                    }
                    keaVar2.f();
                    return;
                }
                return;
            case 8:
                zka zkaVar = (zka) this.b;
                yka ykaVar = (yka) this.c;
                View view = ykaVar.W;
                View view2 = zkaVar.fragmentView;
                if ((view2 instanceof ViewGroup) && view != null) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    vt4 vt4Var = new vt4(zkaVar.getParentActivity(), view, zkaVar.getResourceProvider(), new wh9(zkaVar, (byte) 20));
                    vt4Var.M = gl.L(220.0f);
                    vt4Var.n = gl.L(292.0f);
                    vt4Var.L = 0;
                    vt4Var.S = true;
                    int v0 = bkb.v0(bkb.F6, zkaVar.getResourceProvider());
                    String g0 = DictationAsr.g0(ykaVar.f, ykaVar.a);
                    for (String str3 : ykaVar.V) {
                        vt4Var.a(new k7(zkaVar.getParentActivity(), jm3.N(str3), null, v0, str3.equals(g0)), 44, new t7a(ykaVar, str3, (byte) 9));
                    }
                    vt4Var.setFocusableInTouchMode(true);
                    vt4Var.setOnKeyListener(new fm3(vt4Var, (byte) 3));
                    viewGroup.addView(vt4Var, new FrameLayout.LayoutParams(-1, -1));
                    vt4Var.requestFocus();
                    vt4Var.f();
                    return;
                }
                return;
            case 9:
                yka ykaVar2 = (yka) this.b;
                DictationAsr.b0(ykaVar2.a, (String) this.c);
                ykaVar2.c();
                return;
            case 10:
                d dVar = (d) this.b;
                new vma(dVar.getContext(), dVar.getCurrentAccount(), dVar.getResourceProvider(), (x0) this.c).show();
                return;
            case 11:
                vqa vqaVar = (vqa) this.b;
                Long l = (Long) this.c;
                if (l.longValue() < 0 && (K0 = na7.q1(vqaVar.a).K0(Long.valueOf(-l.longValue()))) != null) {
                    str = K0.title;
                } else {
                    str = "";
                }
                u21 j2 = vqaVar.j();
                if (TextUtils.isEmpty(str)) {
                    a0 = k96.M0(2131749444, null);
                } else {
                    a0 = k96.a0(null, null, 2131749445, str);
                }
                m21 Q = j2.Q(2131623990, 36, gl.S2(a0));
                Q.t = true;
                Q.j();
                return;
            case 12:
                vqa vqaVar2 = (vqa) this.b;
                du4 du4Var = (du4) this.c;
                if (du4Var != null) {
                    du4Var.dismiss();
                    vqaVar2.O0 = true;
                }
                vqaVar2.dismiss();
                return;
            case 13:
                ysa ysaVar = (ysa) this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.c;
                if (ysaVar instanceof q99) {
                    ((q99) ysaVar).n(tL_starGiftUnique);
                    return;
                }
                return;
            case 14:
                jq5 jq5Var = (jq5) this.c;
                Runnable runnable = ((Runnable[]) this.b)[0];
                if (runnable != null) {
                    runnable.run();
                }
                jq5Var.a(0L);
                return;
            case 15:
                vqa vqaVar3 = (vqa) this.b;
                if (!((gta) this.c).e) {
                    m21 Q2 = vqaVar3.j().Q(2131624012, 36, k96.a0(null, null, 2131743639, "NO_BALANCE"));
                    Q2.t = true;
                    Q2.j();
                    return;
                }
                vqaVar3.f2.setLoading(false);
                vqaVar3.l1();
                return;
            case 16:
                ((vqa) this.b).j().g0((TLRPC.TL_error) this.c, false);
                return;
            case 17:
                na7.q1(((vqa) this.b).a).R3((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 18:
                vqa vqaVar4 = (vqa) this.b;
                u21.b0((mu1) this.c).L(2131624034, k96.M0(2131744859, null), gl.S2(k96.a0(null, null, 2131744857, cf3.s(vqaVar4.S1))), k96.M0(2131744858, null), new nna(vqaVar4, (byte) 12)).k(true);
                return;
            case 19:
                vqa vqaVar5 = (vqa) this.b;
                ((boolean[]) this.c)[0] = true;
                vqaVar5.f2.setLoading(false);
                vqaVar5.l1();
                return;
            case 20:
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.c;
                b00.u(k96.a0(null, null, 2131749446, tL_starGiftUnique2.title + " #" + tL_starGiftUnique2.num), ((vqa) this.b).j(), 2131624052, 36);
                return;
            case 21:
                ((vqa) this.b).t2((CharSequence) this.c);
                return;
            case 22:
                ((vqa) this.b).J1((TL_stars.TL_payments_uniqueStarGift) this.c);
                return;
            case 23:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                ((hd) this.b).dismiss();
                d S = LaunchActivity.S();
                if (S != null) {
                    if (tL_error != null && "STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        ir2.v(null, 2131743641, u21.b0(S), 2131624021, 36);
                        return;
                    } else {
                        ir2.v(null, 2131743642, u21.b0(S), 2131624012, 36);
                        return;
                    }
                }
                return;
            case 24:
                jra jraVar = (jra) this.b;
                mu1 mu1Var = (mu1) this.c;
                hf0 hf0Var = jraVar.b;
                if (hf0Var != null) {
                    try {
                        hf0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    jraVar.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    hf0 hf0Var2 = jraVar.b;
                    if (hf0Var2 instanceof gb2) {
                        messageObject = ((gb2) hf0Var2).getPrimaryMessageObject();
                        if (messageObject != null) {
                            TLRPC.Message message = messageObject.k;
                            if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                                arrayList = tL_messageReactions2.top_reactors;
                            }
                        } else {
                            return;
                        }
                    } else if ((hf0Var2 instanceof uk1) && (messageObject = ((uk1) hf0Var2).getMessageObject()) != null) {
                        TLRPC.Message message2 = messageObject.k;
                        if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                            arrayList = tL_messageReactions.top_reactors;
                        }
                    } else {
                        return;
                    }
                    ArrayList<TLRPC.MessageReactor> arrayList4 = arrayList;
                    eta etaVar = gta.v(messageObject.K1, false).B;
                    if (etaVar != null) {
                        etaVar.b();
                    }
                    TLRPC.ChatFull chatFull = mu1Var.r8;
                    Context context = jraVar.getContext();
                    int currentAccount = mu1Var.getCurrentAccount();
                    long a = mu1Var.a();
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z = false;
                    } else {
                        z = true;
                    }
                    k27 k27Var2 = messageObject;
                    bwa bwaVar = new bwa(context, currentAccount, a, mu1Var, k27Var2, arrayList4, z, false, 0L, mu1Var.getResourceProvider());
                    k27Var2.e1();
                    hf0 hf0Var3 = jraVar.b;
                    bwaVar.P1 = mu1Var;
                    bwaVar.Q1 = hf0Var3;
                    bwaVar.show();
                    return;
                }
                return;
            case 25:
                TLObject tLObject2 = (TLObject) this.b;
                ae9 ae9Var = (ae9) this.c;
                if (tLObject2 instanceof TL_stars.StarGifts) {
                    ae9Var.a((TL_stars.StarGifts) tLObject2);
                    return;
                } else {
                    ae9Var.a(null);
                    return;
                }
            case 26:
                boolean[] zArr = (boolean[]) this.b;
                i8c i8cVar = (i8c) this.c;
                if (!zArr[0]) {
                    i8cVar.a("cancelled", 0L);
                    zArr[0] = true;
                    return;
                }
                return;
            case 27:
                xsa xsaVar2 = (xsa) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                ArrayList arrayList5 = xsaVar2.l;
                int i3 = xsaVar2.a;
                if (tLObject3 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject3;
                    na7.q1(i3).b4(tL_payments_savedStarGifts.users, false);
                    na7.q1(i3).V3(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i4 = 0;
                        while (i4 < arrayList5.size() && ((TL_stars.SavedStarGift) arrayList5.get(i4)).pinned_to_top) {
                            i4++;
                        }
                        arrayList5.add(i4, savedStarGift);
                        kk7.f(i3).k(232, Long.valueOf(xsaVar2.b), xsaVar2);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                new u21(((fx0[]) this.b)[0].F, (wjb) this.c).Q(2131623994, 36, k96.M0(2131744710, null)).k(false);
                return;
            default:
                bwa bwaVar2 = (bwa) this.b;
                bwaVar2.N1 = true;
                bwaVar2.E0(new cta((eta) this.c, (byte) 2));
                gl.d3(new kva(bwaVar2, (byte) 1), 240L);
                return;
        }
    }

    public t7a(taa taaVar, TLObject tLObject, Context context) {
        this.a = (byte) 1;
        this.b = taaVar;
        this.c = tLObject;
    }

    public t7a(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}

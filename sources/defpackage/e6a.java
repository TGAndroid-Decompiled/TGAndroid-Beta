package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
public final class e6a implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public e6a(jva jvaVar, boolean[] zArr, jac jacVar) {
        this.a = (byte) 28;
        this.b = zArr;
        this.c = jacVar;
    }

    @Override
    public final void run() {
        byte b;
        String[] strArr;
        String str;
        String a0;
        TLRPC.Chat L0;
        k47 messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z;
        TLRPC.TL_messageReactions tL_messageReactions2;
        long j = 0;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        switch (this.a) {
            case 0:
                ((WindowManager) this.c).removeView(((l6a) this.b).B);
                return;
            case 1:
                gm.g((String) this.c);
                c41.b0((daa) this.b).k(false).j();
                return;
            case 2:
                ((daa) this.b).g0((TLRPC.TL_attachMenuBot) this.c);
                return;
            case 3:
                tca tcaVar = (tca) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    tcaVar.f2 = (TLRPC.TL_exportedMessageLink) tLObject;
                    tcaVar.V0();
                    if (tcaVar.h2) {
                        tcaVar.F0();
                    }
                }
                tcaVar.g2 = false;
                return;
            case 4:
                a4b a4bVar = (a4b) this.c;
                oea oeaVar = ((nha) this.b).c0;
                if (oeaVar != null) {
                    int i = a4bVar.a;
                    oeaVar.b.e(i, oeaVar.d.i(i));
                    return;
                }
                return;
            case 5:
                iga igaVar = (iga) this.b;
                ct8 ct8Var = (ct8) this.c;
                igaVar.G = null;
                igaVar.H = null;
                ct8Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new c39(ct8Var, (byte) 15)).start();
                return;
            case 6:
                ava avaVar = (ava) this.b;
                avaVar.e = !avaVar.e;
                ((Runnable[]) this.c)[0].run();
                avaVar.k(true);
                return;
            case 7:
                c41.b0(((zfa) this.b).f.y1).Q(2131623990, 36, jb6.a0(null, null, 2131742499, ((TLRPC.Chat) this.c).title)).k(true);
                return;
            case 8:
                kga kgaVar = (kga) this.b;
                String str2 = (String) this.c;
                if (!kgaVar.w.w1[kgaVar.r].a.isEmpty() && ((b = kgaVar.r) == 1 || b == 4)) {
                    k47 k47Var = (k47) b10.f(1, kgaVar.w.w1[b].a);
                    int e1 = k47Var.e1();
                    long B0 = k47.B0(k47Var.k);
                    nha nhaVar = kgaVar.w;
                    if (nhaVar.m1 == nhaVar.y1.getUserConfig().e()) {
                        j = k47Var.P1();
                    }
                    kgaVar.F(e1, B0, j, str2);
                } else if (kgaVar.r == 3) {
                    nha nhaVar2 = kgaVar.w;
                    kgaVar.F(0, nhaVar2.m1, nhaVar2.G, str2);
                }
                byte b2 = kgaVar.r;
                if (b2 == 1 || b2 == 4) {
                    ArrayList arrayList2 = new ArrayList(kgaVar.w.w1[kgaVar.r].a);
                    kgaVar.s++;
                    Utilities.g.c(new hw9(kgaVar, str2, arrayList2, (byte) 12));
                    return;
                }
                return;
            case 9:
                kga kgaVar2 = (kga) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                nha nhaVar3 = kgaVar2.w;
                boolean z2 = nhaVar3.Y0;
                iga[] igaVarArr = nhaVar3.n0;
                if (z2) {
                    kgaVar2.s--;
                    int b3 = kgaVar2.b();
                    kgaVar2.d = arrayList3;
                    int b4 = kgaVar2.b();
                    if (kgaVar2.s == 0 || b4 != 0) {
                        nhaVar3.z1(false);
                    }
                    for (int i2 = 0; i2 < igaVarArr.length; i2++) {
                        iga igaVar2 = igaVarArr[i2];
                        if (igaVar2.F == kgaVar2.r) {
                            if (kgaVar2.s == 0 && b4 == 0) {
                                igaVar2.w.d.setText(jb6.M0(2131747901, "NoResult"));
                                igaVarArr[i2].w.f.setVisibility(8);
                                igaVarArr[i2].w.e(false, true);
                            } else if (b3 == 0) {
                                nhaVar3.i(igaVar2.h, 0, null);
                            }
                        }
                    }
                    kgaVar2.f();
                    return;
                }
                return;
            case 10:
                ana anaVar = (ana) this.b;
                zma zmaVar = (zma) this.c;
                View view = zmaVar.W;
                View view2 = anaVar.fragmentView;
                if ((view2 instanceof ViewGroup) && view != null) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    xv4 xv4Var = new xv4(anaVar.getParentActivity(), view, anaVar.getResourceProvider(), new yf9(anaVar, (byte) 24));
                    xv4Var.M = gm.L(220.0f);
                    xv4Var.n = gm.L(292.0f);
                    xv4Var.L = 0;
                    xv4Var.S = true;
                    int v0 = cmb.v0(cmb.F6, anaVar.getResourceProvider());
                    String g0 = DictationAsr.g0(zmaVar.f, zmaVar.a);
                    for (String str3 : zmaVar.V) {
                        xv4Var.a(new k7(anaVar.getParentActivity(), un3.N(str3), null, v0, str3.equals(g0)), 44, new e6a(zmaVar, str3, (byte) 11));
                    }
                    xv4Var.setFocusableInTouchMode(true);
                    xv4Var.setOnKeyListener(new qn3(xv4Var, (byte) 3));
                    viewGroup.addView(xv4Var, new FrameLayout.LayoutParams(-1, -1));
                    xv4Var.requestFocus();
                    xv4Var.f();
                    return;
                }
                return;
            case 11:
                zma zmaVar2 = (zma) this.b;
                DictationAsr.b0(zmaVar2.a, (String) this.c);
                zmaVar2.c();
                return;
            case 12:
                d dVar = (d) this.b;
                new woa(dVar.getContext(), dVar.getCurrentAccount(), dVar.getResourceProvider(), (x0) this.c).show();
                return;
            case 13:
                wsa wsaVar = (wsa) this.b;
                Long l = (Long) this.c;
                if (l.longValue() < 0 && (L0 = oc7.r1(wsaVar.a).L0(Long.valueOf(-l.longValue()))) != null) {
                    str = L0.title;
                } else {
                    str = "";
                }
                c41 j2 = wsaVar.j();
                if (TextUtils.isEmpty(str)) {
                    a0 = jb6.M0(2131749393, null);
                } else {
                    a0 = jb6.a0(null, null, 2131749394, str);
                }
                u31 Q = j2.Q(2131623990, 36, gm.S2(a0));
                Q.u = true;
                Q.j();
                return;
            case 14:
                wsa wsaVar2 = (wsa) this.b;
                fw4 fw4Var = (fw4) this.c;
                if (fw4Var != null) {
                    fw4Var.dismiss();
                    wsaVar2.O0 = true;
                }
                wsaVar2.dismiss();
                return;
            case 15:
                bva bvaVar = (bva) this.b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.c;
                if (bvaVar instanceof qb9) {
                    ((qb9) bvaVar).n(tL_starGiftUnique);
                    return;
                }
                return;
            case 16:
                hs5 hs5Var = (hs5) this.c;
                Runnable runnable = ((Runnable[]) this.b)[0];
                if (runnable != null) {
                    runnable.run();
                }
                hs5Var.a(0L);
                return;
            case 17:
                wsa wsaVar3 = (wsa) this.b;
                if (!((jva) this.c).e) {
                    u31 Q2 = wsaVar3.j().Q(2131624012, 36, jb6.a0(null, null, 2131743565, "NO_BALANCE"));
                    Q2.u = true;
                    Q2.j();
                    return;
                }
                wsaVar3.f2.setLoading(false);
                wsaVar3.l1();
                return;
            case 18:
                ((wsa) this.b).j().g0((TLRPC.TL_error) this.c, false);
                return;
            case 19:
                oc7.r1(((wsa) this.b).a).T3((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 20:
                wsa wsaVar4 = (wsa) this.b;
                c41.b0((yv1) this.c).L(2131624034, jb6.M0(2131744785, null), gm.S2(jb6.a0(null, null, 2131744783, pg3.s(wsaVar4.S1))), jb6.M0(2131744784, null), new npa(wsaVar4, (byte) 12)).k(true);
                return;
            case 21:
                wsa wsaVar5 = (wsa) this.b;
                ((boolean[]) this.c)[0] = true;
                wsaVar5.f2.setLoading(false);
                wsaVar5.l1();
                return;
            case 22:
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.c;
                b10.u(jb6.a0(null, null, 2131749395, tL_starGiftUnique2.title + " #" + tL_starGiftUnique2.num), ((wsa) this.b).j(), 2131624052, 36);
                return;
            case 23:
                ((wsa) this.b).t2((CharSequence) this.c);
                return;
            case 24:
                ((wsa) this.b).J1((TL_stars.TL_payments_uniqueStarGift) this.c);
                return;
            case 25:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                ((he) this.b).dismiss();
                d S = LaunchActivity.S();
                if (S != null) {
                    if (tL_error != null && "STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        ts2.u(null, 2131743567, c41.b0(S), 2131624021, 36);
                        return;
                    } else {
                        ts2.u(null, 2131743568, c41.b0(S), 2131624012, 36);
                        return;
                    }
                }
                return;
            case 26:
                kta ktaVar = (kta) this.b;
                yv1 yv1Var = (yv1) this.c;
                hg0 hg0Var = ktaVar.b;
                if (hg0Var != null) {
                    try {
                        hg0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ktaVar.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    hg0 hg0Var2 = ktaVar.b;
                    if (hg0Var2 instanceof rc2) {
                        messageObject = ((rc2) hg0Var2).getPrimaryMessageObject();
                        if (messageObject != null) {
                            TLRPC.Message message = messageObject.k;
                            if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                                arrayList = tL_messageReactions2.top_reactors;
                            }
                        } else {
                            return;
                        }
                    } else if ((hg0Var2 instanceof cm1) && (messageObject = ((cm1) hg0Var2).getMessageObject()) != null) {
                        TLRPC.Message message2 = messageObject.k;
                        if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                            arrayList = tL_messageReactions.top_reactors;
                        }
                    } else {
                        return;
                    }
                    ArrayList<TLRPC.MessageReactor> arrayList4 = arrayList;
                    hva hvaVar = jva.v(messageObject.K1, false).B;
                    if (hvaVar != null) {
                        hvaVar.b();
                    }
                    TLRPC.ChatFull chatFull = yv1Var.r8;
                    Context context = ktaVar.getContext();
                    int currentAccount = yv1Var.getCurrentAccount();
                    long a = yv1Var.a();
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z = false;
                    } else {
                        z = true;
                    }
                    k47 k47Var2 = messageObject;
                    eya eyaVar = new eya(context, currentAccount, a, yv1Var, k47Var2, arrayList4, z, false, 0L, yv1Var.getResourceProvider());
                    k47Var2.e1();
                    hg0 hg0Var3 = ktaVar.b;
                    eyaVar.P1 = yv1Var;
                    eyaVar.Q1 = hg0Var3;
                    eyaVar.show();
                    return;
                }
                return;
            case 27:
                TLObject tLObject2 = (TLObject) this.b;
                eg9 eg9Var = (eg9) this.c;
                if (tLObject2 instanceof TL_stars.StarGifts) {
                    eg9Var.a((TL_stars.StarGifts) tLObject2);
                    return;
                } else {
                    eg9Var.a(null);
                    return;
                }
            case 28:
                boolean[] zArr = (boolean[]) this.b;
                jac jacVar = (jac) this.c;
                if (!zArr[0]) {
                    jacVar.a("cancelled", 0L);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                ava avaVar2 = (ava) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                ArrayList arrayList5 = avaVar2.l;
                int i3 = avaVar2.a;
                if (tLObject3 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject3;
                    oc7.r1(i3).d4(tL_payments_savedStarGifts.users, false);
                    oc7.r1(i3).X3(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i4 = 0;
                        while (i4 < arrayList5.size() && ((TL_stars.SavedStarGift) arrayList5.get(i4)).pinned_to_top) {
                            i4++;
                        }
                        arrayList5.add(i4, savedStarGift);
                        nm7.f(i3).k(233, Long.valueOf(avaVar2.b), avaVar2);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public e6a(tca tcaVar, TLObject tLObject, Context context) {
        this.a = (byte) 3;
        this.b = tcaVar;
        this.c = tLObject;
    }

    public e6a(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}

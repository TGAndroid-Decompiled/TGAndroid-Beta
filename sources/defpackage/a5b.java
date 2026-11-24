package defpackage;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.f;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class a5b implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public a5b(kxb kxbVar, ArrayList arrayList, jc jcVar) {
        this.a = (byte) 20;
        this.b = kxbVar;
        this.c = arrayList;
    }

    @Override
    public final void run() {
        d28 d28Var;
        c30 c30Var;
        y29 y29Var;
        long j;
        byte b = this.a;
        int i = 2;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                u41 u41Var = (u41) obj2;
                Runnable runnable = (Runnable) obj;
                if (u41Var != null) {
                    u41Var.setLoading(false);
                }
                runnable.run();
                return;
            case 1:
                ((a5b) obj).run();
                ((t7b) obj2).o0();
                return;
            case 2:
                t7b t7bVar = (t7b) obj2;
                t7bVar.c(false);
                gl.r(t7bVar.h2);
                t7bVar.h2 = null;
                t7bVar.T1 = false;
                ((Runnable) obj).run();
                return;
            case 3:
                l8b l8bVar = (l8b) obj;
                m8b m8bVar = ((d8b) obj2).d;
                y28 currentPeerView = m8bVar.o0.getCurrentPeerView();
                if (currentPeerView != null && (d28Var = currentPeerView.S0) != null && (c30Var = m8bVar.G0) != null && ((l8b) c30Var.c) == l8bVar) {
                    d28Var.invalidate();
                    return;
                }
                return;
            case 4:
                na7.q1(((yab) obj2).a.a).m5((TLRPC.EmojiStatus) obj, null);
                return;
            case 5:
                ((hj3) obj2).a((TLRPC.Chat) obj);
                return;
            case 6:
                akb akbVar = (akb) obj2;
                akbVar.b((File) obj, akbVar.i0);
                gl.d3(new bj4(akbVar, (byte) 1));
                return;
            case 7:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().J4(true);
                if (view instanceof ahb) {
                    ((ahb) view).setChecked(themeActivity.getMessagesController().X4());
                    return;
                }
                return;
            case 8:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                bkb.w = str;
                if (str == null) {
                    bkb.w = String.format("(%.06f, %.06f)", Double.valueOf(bkb.x), Double.valueOf(bkb.y));
                }
                bkb.u1();
                o39 o39Var = themeActivity2.b;
                if (o39Var != null && (y29Var = (y29) o39Var.K(themeActivity2.Z)) != null) {
                    View view2 = y29Var.a;
                    if (view2 instanceof uib) {
                        ((uib) view2).c(k96.M0(2131753778, "AutoNightUpdateLocation"), bkb.w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                qmb qmbVar = (qmb) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (qmbVar.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    qmbVar.C0.c(qmbVar.M0[0]);
                    return;
                }
                return;
            case 10:
                ((ymb) obj2).a0((TLRPC.TL_theme) obj);
                return;
            case 11:
                ((ymb) obj2).Z((String) obj);
                return;
            case 12:
                ((f) obj2).z1((akb) obj);
                return;
            case 13:
                iob iobVar = (iob) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (iobVar.k && !iobVar.i) {
                    iobVar.d.add(new hob(iobVar, bitmap));
                    iobVar.k = false;
                    iobVar.n.invalidate();
                    return;
                }
                return;
            case 14:
                gl.g((String) obj);
                ((jpb) obj2).b(true);
                return;
            case 15:
                gl.g(k27.h0(((TLRPC.TodoItem) obj).title, false));
                ((jpb) obj2).b(true);
                return;
            case 16:
                pub pubVar = (pub) obj2;
                ArrayList arrayList = (ArrayList) obj;
                HashSet hashSet = new HashSet();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    zc7 zc7Var = (zc7) arrayList.get(i2);
                    long j2 = -zc7Var.a;
                    vf6 vf6Var = (vf6) pubVar.b.f(j2);
                    if (vf6Var != null) {
                        vf6Var.l(zc7Var.b);
                    }
                    ArrayList arrayList2 = (ArrayList) pubVar.a.f(j2);
                    if (arrayList2 != null) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= arrayList2.size()) {
                                break;
                            }
                            if (pubVar.getMessagesController().x2(zc7Var.a)) {
                                j = cf3.n(((TLRPC.TL_forumTopic) arrayList2.get(i3)).from_id);
                            } else {
                                j = ((TLRPC.TL_forumTopic) arrayList2.get(i3)).id;
                            }
                            if (j == zc7Var.b) {
                                arrayList2.remove(i3);
                                pubVar.getNotificationCenter().k(113, Long.valueOf(-j2), Long.valueOf(zc7Var.b));
                                hashSet.add(Long.valueOf(j2));
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    pubVar.y(((Long) it.next()).longValue(), true);
                }
                return;
            case 17:
                Bundle bundle = new Bundle();
                qvb qvbVar = ((xub) obj2).b;
                bundle.putLong("dialog_id", -qvbVar.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                qvbVar.presentFragment(new pr8(bundle, null));
                return;
            case 18:
                mvb mvbVar = (mvb) obj2;
                String str2 = (String) obj;
                ArrayList arrayList3 = mvbVar.f0;
                qvb qvbVar2 = mvbVar.w0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList4 = new ArrayList();
                int i4 = 0;
                while (true) {
                    ArrayList arrayList5 = qvbVar2.b;
                    if (i4 < arrayList5.size()) {
                        if (((ivb) arrayList5.get(i4)).c != null && ((ivb) arrayList5.get(i4)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList4.add(((ivb) arrayList5.get(i4)).c);
                            ((ivb) arrayList5.get(i4)).c.searchQuery = lowerCase;
                        }
                        i4++;
                    } else {
                        arrayList3.clear();
                        arrayList3.addAll(arrayList4);
                        mvbVar.N();
                        if (!arrayList3.isEmpty()) {
                            mvbVar.o0 = false;
                            mvbVar.r0.b(0);
                        }
                        mvbVar.L(str2);
                        return;
                    }
                }
                break;
            case 19:
                wvb wvbVar = ((svb) obj2).b.a;
                wvbVar.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                wvbVar.Z();
                return;
            case 20:
                kxb kxbVar = (kxb) obj2;
                na7.q1(kxbVar.e).g4.d((ArrayList) obj, -kxbVar.f);
                return;
            case 21:
                na7.q1(((kxb) obj2).e).X2(0, ((TLRPC.Updates) obj).chats.get(0).id, true);
                return;
            case 22:
                bb2 bb2Var = (bb2) obj2;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) obj;
                if (bb2Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i = 1;
                    }
                    bb2Var.c0(i);
                    return;
                }
                return;
            case 23:
                kk7 kk7Var = (kk7) obj2;
                ryb rybVar = (ryb) obj;
                kk7Var.n(rybVar, 142);
                kk7Var.n(rybVar, 143);
                return;
            case 24:
                rzb rzbVar = (rzb) obj2;
                TLObject tLObject = (TLObject) obj;
                ig9 ig9Var = rzbVar.s1;
                rzbVar.l1 = null;
                if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
                    TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject;
                    if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                        rzbVar.O1 = false;
                        TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                        if (ig9Var != null) {
                            ig9Var.set(richMessage);
                            rzbVar.H1.D(ig9Var);
                            return;
                        }
                        return;
                    }
                }
                if (rzbVar.O1) {
                    rzbVar.dismiss();
                    kk7.e().k(295, 1, k96.M0(2131743707, null));
                    return;
                }
                yjb.x(null, 2131743707, new u21((FrameLayout) rzbVar.b, rzbVar.J0), null);
                mzb mzbVar = rzbVar.w1.e;
                String str3 = rzbVar.v1;
                rzbVar.u1 = str3;
                mzbVar.setText(rzb.J0(str3, null, null));
                return;
            case 25:
                mr1 mr1Var = (mr1) obj2;
                ((m8) obj).d(true);
                g0c.a(mr1Var.getContext(), mr1Var.d);
                return;
            case 26:
                ((b1c) obj).J(((mr1) obj2).b, false, false);
                return;
            case 27:
                ((TwoStepVerificationActivity) obj2).q0((byte[]) obj);
                return;
            case 28:
                ((TwoStepVerificationActivity) obj2).i0((TL_account.updatePasswordSettings) obj);
                return;
            default:
                ((TwoStepVerificationActivity) obj2).p0((TLRPC.TL_error) obj);
                return;
        }
    }

    public a5b(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}

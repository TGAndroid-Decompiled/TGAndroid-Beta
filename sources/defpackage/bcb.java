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
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.p;
public final class bcb implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public bcb(l1c l1cVar, ArrayList arrayList, kc kcVar) {
        this.a = (byte) 17;
        this.b = l1cVar;
        this.c = arrayList;
    }

    @Override
    public final void run() {
        t58 t58Var;
        d30 d30Var;
        n69 n69Var;
        long j;
        byte b = this.a;
        int i = 2;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                kcb kcbVar = (kcb) obj;
                lcb lcbVar = ((ccb) obj2).d;
                o68 currentPeerView = lcbVar.o0.getCurrentPeerView();
                if (currentPeerView != null && (t58Var = currentPeerView.M0) != null && (d30Var = lcbVar.G0) != null && ((kcb) d30Var.c) == kcbVar) {
                    t58Var.invalidate();
                    return;
                }
                return;
            case 1:
                uc7.s1(((veb) obj2).a.a).v5((TLRPC.EmojiStatus) obj, null);
                return;
            case 2:
                ((zj3) obj2).a((TLRPC.Chat) obj);
                return;
            case 3:
                znb znbVar = (znb) obj2;
                znbVar.b((File) obj, znbVar.i0);
                hl.c3(new fl4(znbVar, (byte) 1));
                return;
            case 4:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                String str = (String) obj;
                aob.w = str;
                if (str == null) {
                    aob.w = String.format("(%.06f, %.06f)", Double.valueOf(aob.x), Double.valueOf(aob.y));
                }
                aob.u1();
                d79 d79Var = themeActivity.b;
                if (d79Var != null && (n69Var = (n69) d79Var.L(themeActivity.Z)) != null) {
                    View view = n69Var.a;
                    if (view instanceof qmb) {
                        ((qmb) view).c(ob6.M0(2131753774, "AutoNightUpdateLocation"), aob.w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                View view2 = (View) obj;
                themeActivity2.getMessagesController().S4(true);
                if (view2 instanceof wkb) {
                    ((wkb) view2).setChecked(themeActivity2.getMessagesController().g5());
                    return;
                }
                return;
            case 6:
                pqb pqbVar = (pqb) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (pqbVar.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    pqbVar.C0.c(pqbVar.M0[0]);
                    return;
                }
                return;
            case 7:
                ((xqb) obj2).a0((TLRPC.TL_theme) obj);
                return;
            case 8:
                ((xqb) obj2).Z((String) obj);
                return;
            case 9:
                ((f) obj2).A1((znb) obj);
                return;
            case 10:
                isb isbVar = (isb) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (isbVar.k && !isbVar.i) {
                    isbVar.d.add(new hsb(isbVar, bitmap));
                    isbVar.k = false;
                    isbVar.n.invalidate();
                    return;
                }
                return;
            case 11:
                hl.g((String) obj);
                ((ktb) obj2).b(true);
                return;
            case 12:
                hl.g(r47.h0(((TLRPC.TodoItem) obj).title, false));
                ((ktb) obj2).b(true);
                return;
            case 13:
                qyb qybVar = (qyb) obj2;
                ArrayList arrayList = (ArrayList) obj;
                HashSet hashSet = new HashSet();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if7 if7Var = (if7) arrayList.get(i2);
                    long j2 = -if7Var.a;
                    zh6 zh6Var = (zh6) qybVar.b.f(j2);
                    if (zh6Var != null) {
                        zh6Var.l(if7Var.b);
                    }
                    ArrayList arrayList2 = (ArrayList) qybVar.a.f(j2);
                    if (arrayList2 != null) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= arrayList2.size()) {
                                break;
                            }
                            if (qybVar.getMessagesController().B2(if7Var.a)) {
                                j = wf3.n(((TLRPC.TL_forumTopic) arrayList2.get(i3)).from_id);
                            } else {
                                j = ((TLRPC.TL_forumTopic) arrayList2.get(i3)).id;
                            }
                            if (j == if7Var.b) {
                                arrayList2.remove(i3);
                                qybVar.getNotificationCenter().k(114, Long.valueOf(-j2), Long.valueOf(if7Var.b));
                                hashSet.add(Long.valueOf(j2));
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    qybVar.y(((Long) it.next()).longValue(), true);
                }
                return;
            case 14:
                Bundle bundle = new Bundle();
                tzb tzbVar = ((yyb) obj2).b;
                bundle.putLong("dialog_id", -tzbVar.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                tzbVar.presentFragment(new zu8(bundle, null));
                return;
            case 15:
                ozb ozbVar = (ozb) obj2;
                String str2 = (String) obj;
                ArrayList arrayList3 = ozbVar.f0;
                tzb tzbVar2 = ozbVar.w0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList4 = new ArrayList();
                int i4 = 0;
                while (true) {
                    ArrayList arrayList5 = tzbVar2.b;
                    if (i4 < arrayList5.size()) {
                        if (((kzb) arrayList5.get(i4)).c != null && ((kzb) arrayList5.get(i4)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList4.add(((kzb) arrayList5.get(i4)).c);
                            ((kzb) arrayList5.get(i4)).c.searchQuery = lowerCase;
                        }
                        i4++;
                    } else {
                        arrayList3.clear();
                        arrayList3.addAll(arrayList4);
                        ozbVar.O();
                        if (!arrayList3.isEmpty()) {
                            ozbVar.o0 = false;
                            ozbVar.r0.b(0);
                        }
                        ozbVar.M(str2);
                        return;
                    }
                }
                break;
            case 16:
                zzb zzbVar = ((vzb) obj2).b.a;
                zzbVar.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                zzbVar.Z();
                return;
            case 17:
                l1c l1cVar = (l1c) obj2;
                uc7.s1(l1cVar.e).g4.d((ArrayList) obj, -l1cVar.f);
                return;
            case 18:
                uc7.s1(((l1c) obj2).e).e3(0, ((TLRPC.Updates) obj).chats.get(0).id, true);
                return;
            case 19:
                rb2 rb2Var = (rb2) obj2;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) obj;
                if (rb2Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i = 1;
                    }
                    rb2Var.Y(i);
                    return;
                }
                return;
            case 20:
                jn7 jn7Var = (jn7) obj2;
                r2c r2cVar = (r2c) obj;
                jn7Var.n(r2cVar, 143);
                jn7Var.n(r2cVar, 144);
                return;
            case 21:
                r3c r3cVar = (r3c) obj2;
                TLObject tLObject = (TLObject) obj;
                zj9 zj9Var = r3cVar.s1;
                r3cVar.l1 = null;
                if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
                    TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject;
                    if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                        r3cVar.O1 = false;
                        TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                        if (zj9Var != null) {
                            zj9Var.set(richMessage);
                            r3cVar.H1.D(zj9Var);
                            return;
                        }
                        return;
                    }
                }
                if (r3cVar.O1) {
                    r3cVar.dismiss();
                    jn7.e().k(296, 1, ob6.M0(2131743601, null));
                    return;
                }
                xnb.x(null, 2131743601, new d31((FrameLayout) r3cVar.b, r3cVar.J0), null);
                m3c m3cVar = r3cVar.w1.e;
                String str3 = r3cVar.v1;
                r3cVar.u1 = str3;
                m3cVar.setText(r3c.K0(str3, null, null));
                return;
            case 22:
                as1 as1Var = (as1) obj2;
                ((n8) obj).d(true);
                f4c.a(as1Var.getContext(), as1Var.d);
                return;
            case 23:
                ((a5c) obj).J(((as1) obj2).b, false, false);
                return;
            case 24:
                ((TwoStepVerificationActivity) obj2).q0((byte[]) obj);
                return;
            case 25:
                ((TwoStepVerificationActivity) obj2).p0((TLRPC.TL_error) obj);
                return;
            case 26:
                ((TwoStepVerificationActivity) obj2).i0((TL_account.updatePasswordSettings) obj);
                return;
            case 27:
                ((o7c) obj2).s0((String) obj);
                return;
            case 28:
                Runnable runnable = (Runnable) obj;
                for (ok2 ok2Var : ((o7c) obj2).x.f) {
                    ok2Var.D(0.0f);
                }
                runnable.run();
                return;
            default:
                UndoView undoView = (UndoView) obj2;
                TLObject tLObject2 = (TLObject) obj;
                int i5 = UndoView.j0;
                if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    undoView.s.presentFragment(new p((TLRPC.PaymentReceipt) tLObject2));
                    return;
                }
                return;
        }
    }

    public bcb(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}

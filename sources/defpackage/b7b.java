package defpackage;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.f;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class b7b implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public b7b(mzb mzbVar, ArrayList arrayList, jd jdVar) {
        this.a = (byte) 22;
        this.b = mzbVar;
        this.c = arrayList;
    }

    @Override
    public final void run() {
        g48 g48Var;
        c40 c40Var;
        b59 b59Var;
        long j;
        byte b = this.a;
        int i = 2;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                a8b a8bVar = (a8b) obj2;
                HashMap f0 = ((cf7) obj).f0();
                if (!f0.isEmpty()) {
                    gm.c3(new b7b(a8bVar, f0, (byte) 1));
                    return;
                }
                return;
            case 1:
                a8b a8bVar2 = (a8b) obj2;
                HashMap hashMap = (HashMap) obj;
                HashMap hashMap2 = a8bVar2.J1;
                if (hashMap2 == null) {
                    hashMap2 = new HashMap();
                    a8bVar2.J1 = hashMap2;
                }
                hashMap2.putAll(hashMap);
                return;
            case 2:
                b61 b61Var = (b61) obj2;
                Runnable runnable = (Runnable) obj;
                if (b61Var != null) {
                    b61Var.setLoading(false);
                }
                runnable.run();
                return;
            case 3:
                ((b7b) obj).run();
                ((v9b) obj2).o0();
                return;
            case 4:
                v9b v9bVar = (v9b) obj2;
                v9bVar.c(false);
                gm.r(v9bVar.h2);
                v9bVar.h2 = null;
                v9bVar.T1 = false;
                ((Runnable) obj).run();
                return;
            case 5:
                nab nabVar = (nab) obj;
                oab oabVar = ((fab) obj2).d;
                a58 currentPeerView = oabVar.o0.getCurrentPeerView();
                if (currentPeerView != null && (g48Var = currentPeerView.S0) != null && (c40Var = oabVar.G0) != null && ((nab) c40Var.c) == nabVar) {
                    g48Var.invalidate();
                    return;
                }
                return;
            case 6:
                oc7.r1(((adb) obj2).a.a).p5((TLRPC.EmojiStatus) obj, null);
                return;
            case 7:
                ((sk3) obj2).a((TLRPC.Chat) obj);
                return;
            case 8:
                bmb bmbVar = (bmb) obj2;
                bmbVar.b((File) obj, bmbVar.i0);
                gm.c3(new fl4(bmbVar, (byte) 1));
                return;
            case 9:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().M4(true);
                if (view instanceof bjb) {
                    ((bjb) view).setChecked(themeActivity.getMessagesController().a5());
                    return;
                }
                return;
            case 10:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                cmb.w = str;
                if (str == null) {
                    cmb.w = String.format("(%.06f, %.06f)", Double.valueOf(cmb.x), Double.valueOf(cmb.y));
                }
                cmb.u1();
                r59 r59Var = themeActivity2.b;
                if (r59Var != null && (b59Var = (b59) r59Var.K(themeActivity2.Z)) != null) {
                    View view2 = b59Var.a;
                    if (view2 instanceof vkb) {
                        ((vkb) view2).c(jb6.M0(2131753746, "AutoNightUpdateLocation"), cmb.w, false, false);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                rob robVar = (rob) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (robVar.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    robVar.C0.c(robVar.M0[0]);
                    return;
                }
                return;
            case 12:
                ((zob) obj2).b0((TLRPC.TL_theme) obj);
                return;
            case 13:
                ((zob) obj2).a0((String) obj);
                return;
            case 14:
                ((f) obj2).z1((bmb) obj);
                return;
            case 15:
                jqb jqbVar = (jqb) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (jqbVar.k && !jqbVar.i) {
                    jqbVar.d.add(new iqb(jqbVar, bitmap));
                    jqbVar.k = false;
                    jqbVar.n.invalidate();
                    return;
                }
                return;
            case 16:
                gm.g((String) obj);
                ((krb) obj2).b(true);
                return;
            case 17:
                gm.g(k47.h0(((TLRPC.TodoItem) obj).title, false));
                ((krb) obj2).b(true);
                return;
            case 18:
                qwb qwbVar = (qwb) obj2;
                ArrayList arrayList = (ArrayList) obj;
                HashSet hashSet = new HashSet();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    bf7 bf7Var = (bf7) arrayList.get(i2);
                    long j2 = -bf7Var.a;
                    vh6 vh6Var = (vh6) qwbVar.b.f(j2);
                    if (vh6Var != null) {
                        vh6Var.l(bf7Var.b);
                    }
                    ArrayList arrayList2 = (ArrayList) qwbVar.a.f(j2);
                    if (arrayList2 != null) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= arrayList2.size()) {
                                break;
                            }
                            if (qwbVar.getMessagesController().y2(bf7Var.a)) {
                                j = pg3.n(((TLRPC.TL_forumTopic) arrayList2.get(i3)).from_id);
                            } else {
                                j = ((TLRPC.TL_forumTopic) arrayList2.get(i3)).id;
                            }
                            if (j == bf7Var.b) {
                                arrayList2.remove(i3);
                                qwbVar.getNotificationCenter().k(114, Long.valueOf(-j2), Long.valueOf(bf7Var.b));
                                hashSet.add(Long.valueOf(j2));
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    qwbVar.y(((Long) it.next()).longValue(), true);
                }
                return;
            case 19:
                Bundle bundle = new Bundle();
                sxb sxbVar = ((ywb) obj2).b;
                bundle.putLong("dialog_id", -sxbVar.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                sxbVar.presentFragment(new st8(bundle, null));
                return;
            case 20:
                nxb nxbVar = (nxb) obj2;
                String str2 = (String) obj;
                ArrayList arrayList3 = nxbVar.f0;
                sxb sxbVar2 = nxbVar.w0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList4 = new ArrayList();
                int i4 = 0;
                while (true) {
                    ArrayList arrayList5 = sxbVar2.b;
                    if (i4 < arrayList5.size()) {
                        if (((jxb) arrayList5.get(i4)).c != null && ((jxb) arrayList5.get(i4)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList4.add(((jxb) arrayList5.get(i4)).c);
                            ((jxb) arrayList5.get(i4)).c.searchQuery = lowerCase;
                        }
                        i4++;
                    } else {
                        arrayList3.clear();
                        arrayList3.addAll(arrayList4);
                        nxbVar.N();
                        if (!arrayList3.isEmpty()) {
                            nxbVar.o0 = false;
                            nxbVar.r0.b(0);
                        }
                        nxbVar.L(str2);
                        return;
                    }
                }
                break;
            case 21:
                zxb zxbVar = ((vxb) obj2).b.a;
                zxbVar.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                zxbVar.a0();
                return;
            case 22:
                mzb mzbVar = (mzb) obj2;
                oc7.r1(mzbVar.e).g4.d((ArrayList) obj, -mzbVar.f);
                return;
            case 23:
                oc7.r1(((mzb) obj2).e).a3(0, ((TLRPC.Updates) obj).chats.get(0).id, true);
                return;
            case 24:
                mc2 mc2Var = (mc2) obj2;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) obj;
                if (mc2Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i = 1;
                    }
                    mc2Var.Y(i);
                    return;
                }
                return;
            case 25:
                nm7 nm7Var = (nm7) obj2;
                s0c s0cVar = (s0c) obj;
                nm7Var.n(s0cVar, 143);
                nm7Var.n(s0cVar, 144);
                return;
            case 26:
                s1c s1cVar = (s1c) obj2;
                TLObject tLObject = (TLObject) obj;
                mi9 mi9Var = s1cVar.s1;
                s1cVar.l1 = null;
                if (tLObject instanceof TLRPC.TL_messages_translatedRichMessage) {
                    TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject;
                    if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                        s1cVar.O1 = false;
                        TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                        if (mi9Var != null) {
                            mi9Var.set(richMessage);
                            s1cVar.H1.D(mi9Var);
                            return;
                        }
                        return;
                    }
                }
                if (s1cVar.O1) {
                    s1cVar.dismiss();
                    nm7.e().k(297, 1, jb6.M0(2131743633, null));
                    return;
                }
                mlb.y(null, 2131743633, new c41((FrameLayout) s1cVar.b, s1cVar.J0), null);
                n1c n1cVar = s1cVar.w1.e;
                String str3 = s1cVar.v1;
                s1cVar.u1 = str3;
                n1cVar.setText(s1c.J0(str3, null, null));
                return;
            case 27:
                zs1 zs1Var = (zs1) obj2;
                ((m8) obj).d(true);
                g2c.a(zs1Var.getContext(), zs1Var.d);
                return;
            case 28:
                ((b3c) obj).J(((zs1) obj2).b, false, false);
                return;
            default:
                ((TwoStepVerificationActivity) obj2).r0((byte[]) obj);
                return;
        }
    }

    public b7b(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}

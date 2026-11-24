package defpackage;

import android.app.job.JobParameters;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
public final class fd5 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public fd5(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        Object obj;
        Object obj2;
        Object obj3;
        xs5 xs5Var;
        kg1 kg1Var;
        byte b = this.a;
        Object obj4 = null;
        boolean z = true;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                gd5 gd5Var = (gd5) obj6;
                String str = (String) obj5;
                hd5 hd5Var = gd5Var.a;
                hd5Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                hd5Var.c = hd5Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new cx3(gd5Var, str, (byte) 10), 66);
                return;
            case 1:
                TLObject tLObject = (TLObject) obj5;
                kd5 kd5Var = ((gd5) obj6).a.h;
                if (tLObject != null) {
                    kd5Var.i0((TLRPC.TL_messages_stickerSet) tLObject);
                    return;
                } else {
                    kd5Var.i0(null);
                    return;
                }
            case 2:
                jd5 jd5Var = (jd5) obj6;
                String str2 = (String) obj5;
                jd5Var.h = str2;
                kd5 kd5Var2 = jd5Var.r;
                if (kd5Var2.O) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                jd5Var.n = kd5Var2.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new i65(jd5Var, str2, str2, (byte) 1), 66);
                return;
            case 3:
                lg5 lg5Var = (lg5) ((cn0) obj6).c;
                ArrayList arrayList = lg5Var.h;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj5);
                lg5Var.n = false;
                va vaVar = lg5Var.a;
                if (vaVar != null) {
                    vaVar.g3.O(true);
                    return;
                }
                return;
            case 4:
                rg5 rg5Var = (rg5) obj6;
                jte.p(rg5Var.k);
                rg5Var.i.remove((String) obj5);
                if (rg5Var.m != null) {
                    rg5Var.e(-9223372036854775807L);
                    return;
                }
                return;
            case 5:
                lj4 lj4Var = ((sh5) obj6).c;
                Uri uri = ((sg5) obj5).y;
                ec3 ec3Var = (ec3) ((tg5) lj4Var.a).b.d.get(uri);
                if (ec3Var != null) {
                    ec3Var.e(uri, true);
                    return;
                }
                return;
            case 6:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj5;
                try {
                    taskCompletionSource.setResult(((dm5) obj6).a());
                    return;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 7:
                gm.c3(new fd5(((fn5) obj6).h(), (Runnable) obj5, (byte) 9));
                return;
            case 8:
                fn5 fn5Var = (fn5) obj6;
                fn5Var.B.add((wm5) obj5);
                gm.c3(new ob4(fn5Var, (Object) null, 0, (byte) 4));
                return;
            case 9:
                Runnable runnable = (Runnable) obj5;
                bc4.L = (SparseArray) obj6;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 10:
                sm5 sm5Var = (sm5) obj6;
                tm5 tm5Var = sm5Var.a;
                fn5 fn5Var2 = sm5Var.e;
                an5 an5Var = new an5(fn5Var2, tm5Var, (String) obj5);
                tm5Var.t = an5Var;
                fn5Var2.n.add(an5Var);
                fn5Var2.Q(false);
                return;
            case 11:
                um5 um5Var = (um5) obj6;
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj5;
                fn5 fn5Var3 = um5Var.e;
                lm5 lm5Var = fn5Var3.e;
                tm5 tm5Var2 = um5Var.c;
                if (bitmapDrawable instanceof p09) {
                    p09 p09Var = (p09) bitmapDrawable;
                    Object obj7 = (Drawable) lm5Var.f(tm5Var2.d);
                    if (obj7 == null) {
                        lm5Var.l(tm5Var2.d, p09Var);
                        obj3 = p09Var;
                    } else {
                        p09Var.x(false);
                        obj3 = obj7;
                    }
                    fn5Var3.D(tm5Var2.d);
                    obj = tm5Var2.d;
                    obj4 = obj3;
                } else if (bitmapDrawable instanceof kn) {
                    kn knVar = (kn) bitmapDrawable;
                    if (knVar.o0) {
                        String str3 = tm5Var2.d;
                        ThreadLocal threadLocal = fn5.I;
                        Object u = fn5Var3.u(str3);
                        if (u == null) {
                            lm5Var.l(tm5Var2.d, knVar);
                            obj2 = knVar;
                        } else {
                            knVar.u();
                            obj2 = u;
                        }
                        fn5Var3.D(tm5Var2.d);
                        obj = tm5Var2.d;
                        obj4 = obj2;
                    }
                    obj = obj4;
                    obj4 = bitmapDrawable;
                } else if (wi8.A(bitmapDrawable)) {
                    BitmapDrawable v = fn5Var3.v(tm5Var2.d);
                    if (v == null) {
                        if (tm5Var2.d.endsWith("_f")) {
                            fn5Var3.d.l(tm5Var2.d, bitmapDrawable);
                            z = false;
                        } else if (!tm5Var2.d.endsWith("_isc") && !tm5Var2.d.endsWith("_nocache") && bitmapDrawable.getBitmap().getWidth() <= gm.p * 80.0f && bitmapDrawable.getBitmap().getHeight() <= gm.p * 80.0f) {
                            fn5Var3.b.l(tm5Var2.d, bitmapDrawable);
                        } else if (!tm5Var2.d.endsWith("_nocache")) {
                            fn5Var3.c.l(tm5Var2.d, bitmapDrawable);
                        }
                    } else {
                        gm.w2(bitmapDrawable.getBitmap());
                        bitmapDrawable = v;
                    }
                    if (z) {
                        fn5Var3.D(tm5Var2.d);
                        obj4 = tm5Var2.d;
                    }
                    obj = obj4;
                    obj4 = bitmapDrawable;
                } else {
                    obj = null;
                }
                fn5Var3.s.d(new if4(um5Var, obj4, obj, (byte) 24), tm5Var2.a ? 1L : 0L);
                return;
            case 12:
                ((en5) obj6).d.v.remove((String) obj5);
                return;
            case 13:
                wn5 wn5Var = (wn5) obj6;
                Uri uri2 = (Uri) obj5;
                wn5Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) wn5Var.a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri2 != null) {
                            bundle.putParcelable("photoUri", uri2);
                        }
                        ?? dVar = new d(bundle);
                        dVar.e = false;
                        dVar.f = false;
                        dVar.c = wn5Var;
                        launchActivity.t0(dVar);
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    wn5Var.r(false, fn5.G(null, uri2, 800.0f, 800.0f, true), null);
                    return;
                }
            case 14:
                xs5 xs5Var2 = (xs5) obj6;
                TLObject tLObject2 = (TLObject) obj5;
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        xs5Var2.m1.put(Long.valueOf(xs5Var2.l1.admin_id), (TLRPC.User) vector.objects.get(0));
                        xs5Var2.N1.f();
                        return;
                    }
                    return;
                }
                return;
            case 15:
                rs5 rs5Var = (rs5) obj6;
                if (((TLRPC.TL_error) obj5) == null && (kg1Var = (xs5Var = rs5Var.a.c).d2) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = xs5Var.l1;
                    vg1 vg1Var = kg1Var.a;
                    ArrayList arrayList2 = vg1Var.p0;
                    int size = arrayList2.size();
                    int i = vg1Var.F.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = z8c.h(vg1Var.getAccountInstance().a).n;
                    if (new k47(vg1.G0(vg1Var), tL_channelAdminLogEvent, vg1Var.o0, vg1Var.n0, vg1Var.f, vg1Var.U, true).U >= 0) {
                        vg1Var.O0();
                        int size2 = arrayList2.size() - size;
                        if (size2 > 0) {
                            vg1Var.D0.N = true;
                            sg1 sg1Var = vg1Var.F;
                            sg1Var.p(sg1Var.h, size2);
                            vg1Var.Y0();
                        }
                        vg1Var.z0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                l7 l7Var = (l7) obj5;
                ((it5) obj6).v0(true);
                l7Var.requestFocus();
                gm.c3(new ys5(l7Var, (byte) 1));
                return;
            case 17:
                int i2 = JobInfoSchedulerService.a;
                ((JobInfoSchedulerService) obj6).jobFinished((JobParameters) obj5, false);
                return;
            case 18:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj6).guard_bot_id);
                ((qa2) obj5).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 19:
                gm.d3(new y31((fx5) obj6, (t61) obj5, (byte) 4), 150L);
                return;
            case 20:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj6;
                languageSelectActivity.e = (ArrayList) obj5;
                languageSelectActivity.c.f();
                return;
            case 21:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) obj6;
                String str4 = (String) obj5;
                if (str4.trim().toLowerCase().length() == 0) {
                    gm.c3(new fd5(languageSelectActivity2, new ArrayList(), (byte) 20));
                    return;
                }
                System.currentTimeMillis();
                ArrayList arrayList3 = new ArrayList();
                int size3 = languageSelectActivity2.h.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    hb6 hb6Var = (hb6) languageSelectActivity2.h.get(i3);
                    if (hb6Var.a.toLowerCase().startsWith(str4) || hb6Var.b.toLowerCase().startsWith(str4)) {
                        arrayList3.add(hb6Var);
                    }
                }
                int size4 = languageSelectActivity2.f.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    hb6 hb6Var2 = (hb6) languageSelectActivity2.f.get(i4);
                    if (hb6Var2.a.toLowerCase().startsWith(str4) || hb6Var2.b.toLowerCase().startsWith(str4)) {
                        arrayList3.add(hb6Var2);
                    }
                }
                gm.c3(new fd5(languageSelectActivity2, arrayList3, (byte) 20));
                return;
            case 22:
                LaunchActivity launchActivity2 = (LaunchActivity) obj6;
                TLObject tLObject3 = (TLObject) obj5;
                String str5 = LaunchActivity.C1;
                if (tLObject3 instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject3;
                    oc7.r1(launchActivity2.P).d4(resolvedbusinesschatlinks.users, false);
                    oc7.r1(launchActivity2.P).X3(resolvedbusinesschatlinks.chats, false);
                    cf7.Y(launchActivity2.P).j1(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle3 = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle3.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle3.putLong("chat_id", peer.channel_id);
                    }
                    yv1 yv1Var = new yv1(bundle3);
                    yv1Var.Fa = resolvedbusinesschatlinks;
                    launchActivity2.u0(yv1Var, false, true);
                    return;
                }
                launchActivity2.F0(ik.K(launchActivity2, jb6.M0(2131752669, null), jb6.M0(2131752665, null)));
                return;
            case 23:
                LaunchActivity launchActivity3 = (LaunchActivity) obj6;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) obj5;
                String str6 = LaunchActivity.C1;
                oc7.r1(launchActivity3.P).d4(tL_chatInviteJoinResultWebView.users, false);
                br0 b2 = br0.b(launchActivity3.P);
                long j = tL_chatInviteJoinResultWebView.bot_id;
                b2.c(j, j, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            case 24:
                String str7 = LaunchActivity.C1;
                ik.r0((u8) obj6, jb6.M0(2131753859, null), jb6.M0(2131751042, null) + "\n" + ((TLRPC.TL_error) obj5).text, null);
                return;
            case 25:
                LaunchActivity launchActivity4 = (LaunchActivity) obj6;
                String str8 = (String) obj5;
                String str9 = LaunchActivity.C1;
                if (!launchActivity4.p0.getFragmentStack().isEmpty()) {
                    launchActivity4.p0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str8).getQueryParameter("ref")));
                    return;
                }
                return;
            case 26:
                String str10 = LaunchActivity.C1;
                ((LaunchActivity) obj6).k0((TL_account.Password) obj5);
                return;
            case 27:
                u31 u31Var = (u31) obj5;
                String str11 = LaunchActivity.C1;
                if (!((LaunchActivity) obj6).R && LaunchActivity.G1) {
                    u31Var.j();
                    return;
                }
                return;
            case 28:
                LaunchActivity launchActivity5 = (LaunchActivity) obj6;
                bi3 bi3Var = (bi3) obj5;
                String str12 = LaunchActivity.C1;
                launchActivity5.p0.getView().setVisibility(4);
                if (gm.O1()) {
                    ActionBarLayout actionBarLayout = launchActivity5.q0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity5.q0.getView().getVisibility() == 0) {
                        launchActivity5.q0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity5.r0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity5.r0.getView().setVisibility(4);
                    }
                }
                if (bi3Var != null) {
                    bi3Var.run();
                    return;
                }
                return;
            default:
                String str13 = LaunchActivity.C1;
                ((LaunchActivity) obj6).t0((rob) obj5);
                return;
        }
    }
}

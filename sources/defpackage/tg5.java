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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
public final class tg5 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public tg5(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void run() {
        Object obj;
        Object obj2;
        Object obj3;
        bt5 bt5Var;
        lf1 lf1Var;
        int i;
        int i2;
        byte b = this.a;
        Object obj4 = null;
        boolean z = true;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                ug5 ug5Var = (ug5) obj6;
                yve.p(ug5Var.k);
                ug5Var.i.remove((String) obj5);
                if (ug5Var.m != null) {
                    ug5Var.e(-9223372036854775807L);
                    return;
                }
                return;
            case 1:
                kj4 kj4Var = ((vh5) obj6).c;
                Uri uri = ((vg5) obj5).y;
                lb3 lb3Var = (lb3) ((wg5) kj4Var.b).b.d.get(uri);
                if (lb3Var != null) {
                    lb3Var.e(uri, true);
                    return;
                }
                return;
            case 2:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj5;
                try {
                    taskCompletionSource.setResult(((gm5) obj6).a());
                    return;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 3:
                hl.c3(new tg5(((in5) obj6).h(), (Runnable) obj5, (byte) 4));
                return;
            case 4:
                Runnable runnable = (Runnable) obj5;
                xb4.L = (SparseArray) obj6;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 5:
                in5 in5Var = (in5) obj6;
                in5Var.B.add((zm5) obj5);
                hl.c3(new sb4(in5Var, (Object) null, 0, (byte) 4));
                return;
            case 6:
                vm5 vm5Var = (vm5) obj6;
                wm5 wm5Var = vm5Var.a;
                in5 in5Var2 = vm5Var.e;
                dn5 dn5Var = new dn5(in5Var2, wm5Var, (String) obj5);
                wm5Var.t = dn5Var;
                in5Var2.n.add(dn5Var);
                in5Var2.Q(false);
                return;
            case 7:
                xm5 xm5Var = (xm5) obj6;
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj5;
                in5 in5Var3 = xm5Var.e;
                om5 om5Var = in5Var3.e;
                wm5 wm5Var2 = xm5Var.c;
                if (bitmapDrawable instanceof b29) {
                    b29 b29Var = (b29) bitmapDrawable;
                    Object obj7 = (Drawable) om5Var.f(wm5Var2.d);
                    if (obj7 == null) {
                        om5Var.l(wm5Var2.d, b29Var);
                        obj3 = b29Var;
                    } else {
                        b29Var.x(false);
                        obj3 = obj7;
                    }
                    in5Var3.D(wm5Var2.d);
                    obj = wm5Var2.d;
                    obj4 = obj3;
                } else if (bitmapDrawable instanceof lm) {
                    lm lmVar = (lm) bitmapDrawable;
                    if (lmVar.o0) {
                        String str = wm5Var2.d;
                        ThreadLocal threadLocal = in5.I;
                        Object u = in5Var3.u(str);
                        if (u == null) {
                            om5Var.l(wm5Var2.d, lmVar);
                            obj2 = lmVar;
                        } else {
                            lmVar.u();
                            obj2 = u;
                        }
                        in5Var3.D(wm5Var2.d);
                        obj = wm5Var2.d;
                        obj4 = obj2;
                    }
                    obj = obj4;
                    obj4 = bitmapDrawable;
                } else if (ik8.A(bitmapDrawable)) {
                    BitmapDrawable v = in5Var3.v(wm5Var2.d);
                    if (v == null) {
                        if (wm5Var2.d.endsWith("_f")) {
                            in5Var3.d.l(wm5Var2.d, bitmapDrawable);
                            z = false;
                        } else if (!wm5Var2.d.endsWith("_isc") && !wm5Var2.d.endsWith("_nocache") && bitmapDrawable.getBitmap().getWidth() <= hl.p * 80.0f && bitmapDrawable.getBitmap().getHeight() <= hl.p * 80.0f) {
                            in5Var3.b.l(wm5Var2.d, bitmapDrawable);
                        } else if (!wm5Var2.d.endsWith("_nocache")) {
                            in5Var3.c.l(wm5Var2.d, bitmapDrawable);
                        }
                    } else {
                        hl.w2(bitmapDrawable.getBitmap());
                        bitmapDrawable = v;
                    }
                    if (z) {
                        in5Var3.D(wm5Var2.d);
                        obj4 = wm5Var2.d;
                    }
                    obj = obj4;
                    obj4 = bitmapDrawable;
                } else {
                    obj = null;
                }
                in5Var3.s.d(new re4(xm5Var, obj4, obj, (byte) 27), wm5Var2.a ? 1L : 0L);
                return;
            case 8:
                ((hn5) obj6).d.v.remove((String) obj5);
                return;
            case 9:
                zn5 zn5Var = (zn5) obj6;
                Uri uri2 = (Uri) obj5;
                zn5Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) zn5Var.a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri2 != null) {
                            bundle.putParcelable("photoUri", uri2);
                        }
                        ?? eVar = new e(bundle);
                        eVar.e = false;
                        eVar.f = false;
                        eVar.c = zn5Var;
                        launchActivity.t0(eVar);
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    zn5Var.r(false, in5.G(null, uri2, 800.0f, 800.0f, true), null);
                    return;
                }
            case 10:
                bt5 bt5Var2 = (bt5) obj6;
                TLObject tLObject = (TLObject) obj5;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        bt5Var2.m1.put(Long.valueOf(bt5Var2.l1.admin_id), (TLRPC.User) vector.objects.get(0));
                        bt5Var2.N1.f();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                vs5 vs5Var = (vs5) obj6;
                if (((TLRPC.TL_error) obj5) == null && (lf1Var = (bt5Var = vs5Var.a.c).d2) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = bt5Var.l1;
                    wf1 wf1Var = lf1Var.a;
                    ArrayList arrayList = wf1Var.p0;
                    int size = arrayList.size();
                    int i3 = wf1Var.F.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = yac.h(wf1Var.getAccountInstance().a).n;
                    i = ((e) wf1Var).currentAccount;
                    if (new r47(i, tL_channelAdminLogEvent, wf1Var.o0, wf1Var.n0, wf1Var.f, wf1Var.U, true).U >= 0) {
                        wf1Var.O0();
                        int size2 = arrayList.size() - size;
                        if (size2 > 0) {
                            wf1Var.D0.N = true;
                            tf1 tf1Var = wf1Var.F;
                            tf1Var.p(tf1Var.h, size2);
                            wf1Var.Y0();
                        }
                        wf1Var.z0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                m7 m7Var = (m7) obj5;
                ((lt5) obj6).w0(true);
                m7Var.requestFocus();
                hl.c3(new ct5(m7Var, (byte) 1));
                return;
            case 13:
                int i4 = JobInfoSchedulerService.a;
                ((JobInfoSchedulerService) obj6).jobFinished((JobParameters) obj5, false);
                return;
            case 14:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj6).guard_bot_id);
                ((v92) obj5).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 15:
                hl.d3(new z21((kx5) obj6, (u51) obj5, (byte) 3), 150L);
                return;
            case 16:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj6;
                languageSelectActivity.e = (ArrayList) obj5;
                languageSelectActivity.c.f();
                return;
            case 17:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) obj6;
                String str2 = (String) obj5;
                if (str2.trim().toLowerCase().length() == 0) {
                    hl.c3(new tg5(languageSelectActivity2, new ArrayList(), (byte) 16));
                    return;
                }
                System.currentTimeMillis();
                ArrayList arrayList2 = new ArrayList();
                int size3 = languageSelectActivity2.h.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    mb6 mb6Var = (mb6) languageSelectActivity2.h.get(i5);
                    if (mb6Var.a.toLowerCase().startsWith(str2) || mb6Var.b.toLowerCase().startsWith(str2)) {
                        arrayList2.add(mb6Var);
                    }
                }
                int size4 = languageSelectActivity2.f.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    mb6 mb6Var2 = (mb6) languageSelectActivity2.f.get(i6);
                    if (mb6Var2.a.toLowerCase().startsWith(str2) || mb6Var2.b.toLowerCase().startsWith(str2)) {
                        arrayList2.add(mb6Var2);
                    }
                }
                hl.c3(new tg5(languageSelectActivity2, arrayList2, (byte) 16));
                return;
            case 18:
                LaunchActivity launchActivity2 = (LaunchActivity) obj6;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) obj5;
                String str3 = LaunchActivity.C1;
                uc7.s1(launchActivity2.P).j4(tL_chatInviteJoinResultWebView.users, false);
                bq0 b2 = bq0.b(launchActivity2.P);
                long j = tL_chatInviteJoinResultWebView.bot_id;
                b2.c(j, j, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            case 19:
                String str4 = LaunchActivity.C1;
                jj.r0((v8) obj6, ob6.M0(2131753887, null), ob6.M0(2131751070, null) + "\n" + ((TLRPC.TL_error) obj5).text, null);
                return;
            case 20:
                v21 v21Var = (v21) obj5;
                String str5 = LaunchActivity.C1;
                if (!((LaunchActivity) obj6).R && LaunchActivity.G1) {
                    v21Var.j();
                    return;
                }
                return;
            case 21:
                String str6 = LaunchActivity.C1;
                ((LaunchActivity) obj6).k0((TL_account.Password) obj5);
                return;
            case 22:
                LaunchActivity launchActivity3 = (LaunchActivity) obj6;
                zg3 zg3Var = (zg3) obj5;
                String str7 = LaunchActivity.C1;
                launchActivity3.p0.getView().setVisibility(4);
                if (hl.O1()) {
                    ActionBarLayout actionBarLayout = launchActivity3.q0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity3.q0.getView().getVisibility() == 0) {
                        launchActivity3.q0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity3.r0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity3.r0.getView().setVisibility(4);
                    }
                }
                if (zg3Var != null) {
                    zg3Var.run();
                    return;
                }
                return;
            case 23:
                String str8 = LaunchActivity.C1;
                ((LaunchActivity) obj6).t0((pqb) obj5);
                return;
            case 24:
                LaunchActivity launchActivity4 = (LaunchActivity) obj6;
                l01 l01Var = (l01) obj5;
                String str9 = LaunchActivity.C1;
                launchActivity4.P0 = null;
                launchActivity4.Q0 = null;
                launchActivity4.R0 = null;
                launchActivity4.S0 = null;
                launchActivity4.V0 = null;
                launchActivity4.T0 = null;
                if (l01Var != null) {
                    l01Var.b();
                    return;
                }
                return;
            case 25:
                l01 l01Var2 = (l01) obj6;
                id idVar = (id) obj5;
                String str10 = LaunchActivity.C1;
                if (l01Var2 != null) {
                    l01Var2.b();
                }
                idVar.dismiss();
                return;
            case 26:
                LaunchActivity launchActivity5 = (LaunchActivity) obj6;
                String str11 = (String) obj5;
                String str12 = LaunchActivity.C1;
                if (!launchActivity5.p0.getFragmentStack().isEmpty()) {
                    launchActivity5.p0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str11).getQueryParameter("ref")));
                    return;
                }
                return;
            case 27:
                LaunchActivity launchActivity6 = (LaunchActivity) obj6;
                TLObject tLObject2 = (TLObject) obj5;
                String str13 = LaunchActivity.C1;
                if (tLObject2 instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject2;
                    uc7.s1(launchActivity6.P).j4(resolvedbusinesschatlinks.users, false);
                    uc7.s1(launchActivity6.P).c4(resolvedbusinesschatlinks.chats, false);
                    jf7.Y(launchActivity6.P).j1(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle3 = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle3.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle3.putLong("chat_id", peer.channel_id);
                    }
                    zu1 zu1Var = new zu1(bundle3);
                    zu1Var.Fa = resolvedbusinesschatlinks;
                    launchActivity6.u0(zu1Var, false, true);
                    return;
                }
                launchActivity6.F0(jj.K(launchActivity6, ob6.M0(2131752697, null), ob6.M0(2131752693, null)));
                return;
            case 28:
                l46 l46Var = (l46) obj6;
                TLObject tLObject3 = (TLObject) obj5;
                ArrayList arrayList3 = l46Var.d2;
                d79 d79Var = l46Var.n1;
                if (tLObject3 != null) {
                    arrayList3.clear();
                    arrayList3.addAll(((TLRPC.TL_messages_chats) tLObject3).chats);
                    l46Var.D2 = false;
                    l46Var.E2.b(l46Var.i2 + 4);
                    int i7 = 0;
                    while (true) {
                        if (i7 < d79Var.getChildCount()) {
                            if (d79Var.getChildAt(i7) instanceof j46) {
                                i2 = d79Var.getChildAt(i7).getTop();
                            } else {
                                i7++;
                            }
                        } else {
                            i2 = 0;
                        }
                    }
                    l46Var.y1();
                    if (l46Var.g2 >= 0 && i2 != 0) {
                        ((x46) d79Var.getLayoutManager()).g1(l46Var.g2 + 1, i2);
                    }
                }
                int max = Math.max(arrayList3.size(), l46Var.H2.e);
                l46Var.s2.j(max, false);
                l46Var.s2.setBagePosition(max / l46Var.H2.f);
                i46 i46Var = l46Var.s2;
                i46Var.I = true;
                i46Var.requestLayout();
                return;
            default:
                ((l46) obj6).Z0((ka6) obj5, true);
                return;
        }
    }
}

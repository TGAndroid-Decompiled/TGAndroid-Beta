package ab;

import a8.r7;
import ai.f1;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.RectF;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bi.e4;
import bi.f2;
import bi.g2;
import bi.k7;
import bi.r3;
import bi.w2;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import di.a4;
import di.f8;
import di.h4;
import di.j4;
import di.q9;
import di.y0;
import e2.c1;
import fi.b8;
import fi.e8;
import fi.g8;
import fi.n8;
import fi.q8;
import fi.s8;
import fi.u8;
import fi.w7;
import fi.y7;
import hi.q3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import jg.i1;
import li.a3;
import li.e6;
import li.g1;
import li.g4;
import li.p5;
import li.t3;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.y10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.ws;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.h10;
import org.telegram.ui.pa0;
import org.telegram.ui.pa1;
import org.telegram.ui.u01;
public final class g implements OnCompleteListener, Continuation, CameraView.CameraViewDelegate, pa1, r1, OnFailureListener, u9.d, u01, jh.i, y7, cj0, dj0, y10, pa0, li.m0, ws, g4, h2.p, h2.o {
    public final int f927a;
    public final Object f928b;
    public final Object f929c;

    public g(int i7, Object obj, Object obj2) {
        this.f927a = i7;
        this.f928b = obj;
        this.f929c = obj2;
    }

    @Override
    public k60 a(g1 g1Var) {
        li.p pVar = (li.p) ((wf.b) this.f928b).f57667c;
        k60 k60Var = new k60(pVar, (h6) this.f929c, g1Var, false, false, true);
        pVar.H = k60Var;
        return k60Var;
    }

    @Override
    public void b(RectF rectF, View view) {
        ((fh.g) this.f928b).i(rectF.left, rectF.top);
        View view2 = (View) ((WeakReference) this.f929c).get();
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override
    public boolean c(int i7, View view) {
        return q3.E0((q3) this.f928b, (Context) this.f929c, view, i7);
    }

    @Override
    public void d(org.telegram.tgnet.TLRPC.MessageMedia r1, int r2, boolean r3, int r4, long r5) {
        throw new UnsupportedOperationException("Method not decompiled: ab.g.d(org.telegram.tgnet.TLRPC$MessageMedia, int, boolean, int, long):void");
    }

    @Override
    public Object e(r7 r7Var) {
        String valueOf;
        switch (this.f927a) {
            case 7:
                String str = (String) this.f928b;
                Context context = (Context) r7Var.a(Context.class);
                switch (((ni.a) this.f929c).f20615a) {
                    case 4:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        valueOf = "";
                        break;
                    case 5:
                        valueOf = FirebaseCommonRegistrar.a(context);
                        break;
                    case 6:
                        int i7 = Build.VERSION.SDK_INT;
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            valueOf = "tv";
                            break;
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            valueOf = "watch";
                            break;
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            valueOf = "auto";
                            break;
                        } else {
                            if (i7 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                valueOf = "embedded";
                                break;
                            }
                            valueOf = "";
                            break;
                        }
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            valueOf = FirebaseCommonRegistrar.b(installerPackageName);
                            break;
                        }
                        valueOf = "";
                        break;
                }
                return new cb.a(str, valueOf);
            default:
                String str2 = (String) this.f928b;
                u9.a aVar = (u9.a) this.f929c;
                try {
                    Trace.beginSection(str2);
                    return aVar.f56467f.e(r7Var);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        long e10;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z9;
        String str;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        n8 n8Var = (n8) this.f928b;
        Context context = (Context) this.f929c;
        ArrayList arrayList2 = n8Var.L;
        a0.h hVar = n8Var.f12490b;
        g8 g8Var = n8Var.f12499y;
        ArrayList arrayList3 = n8Var.f12491c;
        HashMap hashMap = n8Var.d;
        s8 s8Var = n8Var.W;
        m2 m2Var = s8Var.f28675c;
        if (i7 >= 0 && i7 < arrayList2.size()) {
            b8 b8Var = (b8) arrayList2.get(i7);
            int i14 = b8Var.f54543a;
            int i15 = 0;
            if (i14 == 3) {
                if (b8Var.f11705n && s8Var.f12818z1) {
                    new w7(context, s8Var.f28669a, s8Var.E1, s8Var.f12806m1, new e8(n8Var, 0), s8Var.I0).show();
                    return;
                }
                int i16 = b8Var.f11700i;
                if (i16 == 1) {
                    if (s8Var.H1 == 1 || s8.J0(s8Var).isEmpty()) {
                        s8Var.G1 = 1;
                        s8Var.l1.E(1);
                    }
                    s8Var.H1 = 1;
                    n8Var.g(true);
                } else if (i16 == 3) {
                    if (s8Var.H1 == 3 || (s8Var.f12810r1.isEmpty() && s8Var.f12811s1.isEmpty())) {
                        s8Var.G1 = 3;
                        s8Var.l1.E(1);
                    }
                    s8Var.H1 = 3;
                    n8Var.g(true);
                } else if (i16 == 2) {
                    if (s8Var.H1 == 2) {
                        s8Var.G1 = 2;
                        s8Var.l1.E(1);
                    }
                    s8Var.H1 = 2;
                    n8Var.g(true);
                } else if (i16 == 4) {
                    if (s8Var.H1 == 4) {
                        s8Var.G1 = 4;
                        s8Var.l1.E(1);
                    }
                    s8Var.H1 = 4;
                    n8Var.g(true);
                } else {
                    if (i16 > 0) {
                        arrayList3.clear();
                        hashMap.clear();
                        s8Var.H1 = b8Var.f11700i;
                        g8Var.d.a();
                    } else {
                        TLRPC.Chat chat = b8Var.h;
                        if (chat != null) {
                            long j3 = chat.f26960id;
                            if (s8.K0(s8Var, chat) > 200) {
                                try {
                                    n8Var.performHapticFeedback(3, 1);
                                } catch (Throwable unused) {
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, n8Var.getContext(), s8Var.I0);
                                String M0 = id.M0(2131749394, null);
                                u1 u1Var = alertDialog$Builder.f27300a;
                                u1Var.R = M0;
                                u1Var.T = id.M0(2131749393, null);
                                jg.g.C(null, 2131747831, alertDialog$Builder, null);
                            } else if (hashMap.containsKey(Long.valueOf(j3))) {
                                ArrayList arrayList4 = (ArrayList) hashMap.get(Long.valueOf(j3));
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    while (i15 < size) {
                                        Object obj = arrayList4.get(i15);
                                        i15++;
                                        hVar.k(Boolean.FALSE, ((Long) obj).longValue());
                                    }
                                }
                                hashMap.remove(Long.valueOf(j3));
                                n8Var.j(true);
                            } else {
                                TLRPC.Chat M02 = qp.s1(s8Var.f28669a).M0(Long.valueOf(j3));
                                TLRPC.ChatFull N0 = qp.s1(s8Var.f28669a).N0(j3);
                                if (N0 != null && (chatParticipants = N0.participants) != null && (arrayList = chatParticipants.participants) != null && !arrayList.isEmpty() && N0.participants.participants.size() >= N0.participants_count - 1) {
                                    n8Var.e(j3, N0.participants);
                                    z9 = true;
                                    str = null;
                                } else {
                                    u1 u1Var2 = n8Var.G;
                                    if (u1Var2 != null) {
                                        u1Var2.dismiss();
                                        str = null;
                                        n8Var.G = null;
                                    } else {
                                        str = null;
                                    }
                                    n8Var.H = j3;
                                    u1 u1Var3 = new u1(3, n8Var.getContext(), s8Var.I0);
                                    n8Var.G = u1Var3;
                                    u1Var3.r(50L);
                                    yr a02 = yr.a0(s8Var.f28669a);
                                    z9 = true;
                                    a02.f26723a.c(new w2(n8Var, M02, a02, j3, 12));
                                }
                                if (!TextUtils.isEmpty(n8Var.I)) {
                                    g8Var.setText("");
                                    n8Var.I = str;
                                    n8Var.h(false);
                                }
                            }
                        } else {
                            z9 = true;
                            TLRPC.User user = b8Var.f11699g;
                            if (user != null) {
                                if (n8Var.f12489a == 0) {
                                    s8Var.H1 = 0;
                                }
                                long j10 = user.f27109id;
                                HashSet hashSet = new HashSet(arrayList3);
                                if (arrayList3.contains(Long.valueOf(j10))) {
                                    Iterator it = hashMap.entrySet().iterator();
                                    while (it.hasNext()) {
                                        Map.Entry entry = (Map.Entry) it.next();
                                        if (((ArrayList) entry.getValue()).contains(Long.valueOf(j10))) {
                                            it.remove();
                                            hashSet.addAll((Collection) entry.getValue());
                                        }
                                    }
                                    hashSet.remove(Long.valueOf(j10));
                                    hVar.k(Boolean.FALSE, j10);
                                } else {
                                    Iterator it2 = hashMap.entrySet().iterator();
                                    while (it2.hasNext()) {
                                        Map.Entry entry2 = (Map.Entry) it2.next();
                                        if (((ArrayList) entry2.getValue()).contains(Long.valueOf(j10))) {
                                            it2.remove();
                                            hashSet.addAll((Collection) entry2.getValue());
                                        }
                                    }
                                    hashSet.add(Long.valueOf(j10));
                                    if (!TextUtils.isEmpty(n8Var.I)) {
                                        g8Var.setText("");
                                        n8Var.I = null;
                                        n8Var.h(false);
                                    }
                                    hVar.k(Boolean.TRUE, j10);
                                }
                                arrayList3.clear();
                                arrayList3.addAll(hashSet);
                                n8Var.j(true);
                            }
                        }
                        n8Var.g(z9);
                        n8Var.f(z9);
                        g8Var.L = z9;
                    }
                    z9 = true;
                    n8Var.g(z9);
                    n8Var.f(z9);
                    g8Var.L = z9;
                }
            } else if (i14 == 7) {
                if (view instanceof m8) {
                    m8 m8Var = (m8) view;
                    m8Var.setChecked(!m8Var.d());
                    b8Var.f11702k = m8Var.d();
                    int i17 = b8Var.f11696c;
                    if (i17 == 0) {
                        boolean d = m8Var.d();
                        s8Var.f12815w1 = d;
                        if (s8Var.H1 == 4) {
                            i15 = 1;
                        }
                        if (d) {
                            gc gcVar = new gc(m2Var, s8Var.I0);
                            if (i15 != 0) {
                                i13 = 2131744669;
                            } else {
                                i13 = 2131744670;
                            }
                            bc G = gcVar.G(2131624055, 4, id.M0(i13, null));
                            G.f32203j = 5000;
                            G.k(true);
                            return;
                        }
                        gc gcVar2 = new gc(m2Var, s8Var.I0);
                        if (i15 != 0) {
                            i12 = 2131744683;
                        } else {
                            i12 = 2131744684;
                        }
                        bc G2 = gcVar2.G(2131624112, 4, id.M0(i12, null));
                        G2.f32203j = 5000;
                        G2.k(true);
                    } else if (i17 == 1) {
                        boolean d2 = m8Var.d();
                        s8Var.f12816x1 = d2;
                        boolean z10 = s8Var.f12806m1 instanceof TLRPC.TL_inputPeerChannel;
                        if (d2) {
                            gc gcVar3 = new gc(m2Var, s8Var.I0);
                            if (z10) {
                                i11 = 2131744707;
                            } else {
                                i11 = 2131744671;
                            }
                            bc G3 = gcVar3.G(2131624102, 4, id.M0(i11, null));
                            G3.f32203j = 5000;
                            G3.k(true);
                        } else {
                            gc gcVar4 = new gc(m2Var, s8Var.I0);
                            if (z10) {
                                i10 = 2131744708;
                            } else {
                                i10 = 2131744685;
                            }
                            bc G4 = gcVar4.G(2131624020, 4, id.M0(i10, null));
                            G4.f32203j = 5000;
                            G4.k(true);
                        }
                        n8Var.h(true);
                    } else if (i17 == 2) {
                        s8Var.f12814v1 = m8Var.d();
                        n8Var.h(true);
                    }
                }
            } else if (i14 == 9) {
                int i18 = b8Var.f11708q;
                if (i18 == 0) {
                    u8 u8Var = s8Var.W1;
                    if (u8Var != null) {
                        u8Var.run();
                    }
                } else if (i18 == 1) {
                    TLRPC.InputPeer inputPeer = s8Var.f12806m1;
                    if (inputPeer != null) {
                        e10 = m5.n(inputPeer);
                    } else {
                        e10 = p10.i(s8Var.f28669a).e();
                    }
                    k60 F = k60.F(n8Var, s8Var.I0, view);
                    F.c(2131232046, id.M0(2131744785, null), new r3(n8Var, e10, 7), false);
                    F.k();
                    k60.f(F, qp.s1(s8Var.f28669a).P1().B(e10, true), s8Var.f12813u1, false, null, new f1(12, n8Var, F));
                    F.Z();
                } else if (i18 == 5) {
                    Context context2 = n8Var.getContext();
                    int i19 = s8.X1;
                    u1 u1Var4 = new u1(3, context2, s8Var.I0);
                    u1Var4.r(500L);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.live_story = true;
                    TLRPC.InputPeer inputPeer2 = s8Var.f12806m1;
                    if (inputPeer2 == null) {
                        inputPeer2 = new TLRPC.TL_inputPeerSelf();
                    }
                    getgroupcallstreamrtmpurl.peer = inputPeer2;
                    ConnectionsManager.getInstance(s8Var.f28669a).sendRequest(getgroupcallstreamrtmpurl, new f2(n8Var, u1Var4, getgroupcallstreamrtmpurl));
                } else if (i18 == 6) {
                    s8Var.A1 = false;
                    n8Var.h(true);
                }
            }
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(u1 u1Var, int i7) {
        switch (this.f927a) {
            case 5:
                k7 k7Var = (k7) this.f928b;
                vf.b h = u1Var.h(i7, true, true);
                h.d();
                int i10 = k7Var.f28669a;
                e4 e4Var = new e4(k7Var, h, (wg.f1) this.f929c, 1);
                org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(i10);
                x10.m0(new h10(i10, e4Var, x10));
                return;
            case 13:
                a4 a4Var = (a4) this.f928b;
                di.g1 g1Var = ((q9) this.f929c).A0;
                if (g1Var != null) {
                    if (!g1Var.f9011x) {
                        TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                        discardgroupcall.call = g1Var.f9006f;
                        ConnectionsManager.getInstance(g1Var.f9005e).sendRequest(discardgroupcall, new y0(g1Var, 4));
                        g1Var.e();
                        return;
                    }
                    return;
                }
                j4.d0(a4Var.f8813x);
                return;
            case 15:
                q3.B0((q3) this.f928b, (TL_payments.connectedBotStarRef) this.f929c);
                return;
            case 17:
                i1 i1Var = (i1) this.f928b;
                i1Var.getClass();
                ((boolean[]) this.f929c)[0] = true;
                i1Var.Q();
                return;
            default:
                kg.v.e0((kg.v) this.f928b, (TL_account.TL_businessChatLink) this.f929c);
                return;
        }
    }

    @Override
    public void h(Object obj, e2.s sVar) {
        ((m2.b) obj).E((c1) this.f929c, new wf.b(sVar, ((m2.e) this.f928b).f19536e));
    }

    @Override
    public void i(q8 q8Var, boolean z9, boolean z10, boolean z11, boolean z12, TLRPC.InputPeer inputPeer, int i7, f2.h hVar, f8 f8Var) {
        boolean z13;
        switch (this.f927a) {
            case 11:
                j4 j4Var = (j4) this.f928b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f929c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = qp.s1(j4Var.f9205l2).j1(storyItem.dialogId);
                tL_stories_editStory.f27203id = storyItem.f27199id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = q8Var.f12683b;
                ConnectionsManager.getInstance(j4Var.f9205l2).sendRequest(tL_stories_editStory, new g2(j4Var, hVar, storyItem, q8Var, 5));
                return;
            default:
                a4 a4Var = (a4) this.f928b;
                s8 s8Var = (s8) this.f929c;
                j4 j4Var2 = a4Var.f8813x;
                h4 h4Var = j4Var2.f9250x1;
                TL_stories.StoryItem storyItem2 = h4Var.f9069a;
                if (storyItem2 != null && storyItem2.pinned) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13 != z11) {
                    qp.s1(j4Var2.f9205l2).P1().r0(j4Var2.f9201k1, j4Var2.f9178e1, z11, null);
                }
                TL_stories.StoryItem storyItem3 = h4Var.f9069a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z9);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i7);
                        ConnectionsManager.getInstance(j4Var2.f9205l2).sendRequest(togglegroupcallsettings, new bi.j(8, a4Var, s8Var));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f927a) {
            case 27:
                ((m2.b) obj).r((m2.a) this.f928b, (x2.b0) this.f929c);
                return;
            default:
                ((m2.b) obj).onRenderedFirstFrame((m2.a) this.f928b);
                return;
        }
    }

    @Override
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((bi.z) this.f928b).u0(false, 0L, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f929c);
    }

    @Override
    public void k(Object obj, TLRPC.Document document, Boolean bool) {
        kg.m mVar = (kg.m) this.f928b;
        mVar.f17437x = false;
        org.telegram.messenger.g0.r(mVar.f17431e);
        kg.i iVar = mVar.f17433n;
        mVar.f17438y = document;
        iVar.setSticker(document);
        ((m8) ((View) this.f929c)).setValueSticker(document);
        mVar.j0(true);
    }

    @Override
    public void m() {
        switch (this.f927a) {
            case 23:
                ((li.j0) this.f928b).i();
                ((li.i0) this.f929c).L1();
                return;
            default:
                li.m5 m5Var = (li.m5) this.f928b;
                p5 p5Var = (p5) this.f929c;
                TL_iv.pageTableCell pagetablecell = p5Var.f18782b;
                if (pagetablecell != null) {
                    e6.d(pagetablecell, p5Var.f18781a.getText());
                }
                a3 a3Var = m5Var.E;
                if (a3Var != null && m5Var.f18994a != null) {
                    t3.S1(a3Var.f18422a);
                    return;
                }
                return;
        }
    }

    @Override
    public void onCameraInit() {
        ai.i0 i0Var = (ai.i0) this.f928b;
        ((CameraView) this.f929c).animate().alpha(1.0f).setDuration(180L).start();
        if (!i0Var.V && !i0Var.f1251h0 && !i0Var.f1255l0) {
            i0Var.f1251h0 = true;
            i0Var.f1250g0.postDelayed(i0Var.f1273y0, 150L);
        }
    }

    @Override
    public void onComplete(Task task) {
        ((h) this.f928b).a((Intent) this.f929c);
    }

    @Override
    public void onFailure(Exception e10) {
        String str;
        w0.i gVar;
        String str2;
        w0.d cVar;
        switch (this.f927a) {
            case 6:
                c1.e eVar = (c1.e) this.f928b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f929c;
                kotlin.jvm.internal.j.e(e10, "e");
                if ((e10 instanceof com.google.android.gms.common.api.f) && b1.d.f2898b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e10).getStatusCode()))) {
                    str = "GET_INTERRUPTED";
                } else {
                    str = "GET_NO_CREDENTIALS";
                }
                String str3 = "During begin sign in, failure response from one tap: " + e10.getMessage();
                int hashCode = str.hashCode();
                if (hashCode != -1567968963) {
                    if (hashCode != -154594663) {
                        if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                            gVar = new w0.k(str3);
                        }
                        gVar = new w0.h(2, str3);
                    } else {
                        if (str.equals("GET_INTERRUPTED")) {
                            gVar = new w0.j(str3);
                        }
                        gVar = new w0.h(2, str3);
                    }
                } else {
                    if (str.equals("GET_CANCELED_TAG")) {
                        gVar = new w0.g(str3);
                    }
                    gVar = new w0.h(2, str3);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal)) {
                    eVar.g().execute(new c1.a(eVar, gVar, 0));
                    return;
                }
                return;
            default:
                d1.e eVar2 = (d1.e) this.f928b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f929c;
                kotlin.jvm.internal.j.e(e10, "e");
                if ((e10 instanceof com.google.android.gms.common.api.f) && b1.d.f2898b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e10).getStatusCode()))) {
                    str2 = "CREATE_INTERRUPTED";
                } else {
                    str2 = "CREATE_UNKNOWN";
                }
                String str4 = "During create public key credential, fido registration failure: " + e10.getMessage();
                if (str2.equals("CREATE_CANCELED")) {
                    cVar = new w0.b(str4);
                } else if (str2.equals("CREATE_INTERRUPTED")) {
                    cVar = new w0.e(str4);
                } else {
                    cVar = new w0.c(2, str4);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal2)) {
                    Executor executor = eVar2.f7945g;
                    if (executor != null) {
                        executor.execute(new d1.a(eVar2, cVar, 1));
                        return;
                    } else {
                        kotlin.jvm.internal.j.h("executor");
                        throw null;
                    }
                }
                return;
        }
    }

    @Override
    public void run(long j3) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j3;
        ((li.q3) this.f928b).a((String) this.f929c, tL_inlineButtonTypeUserProfile);
    }

    @Override
    public Object then(Task task) {
        k kVar = (k) this.f928b;
        String str = (String) this.f929c;
        synchronized (kVar) {
            ((a0.f) kVar.f961b).remove(str);
        }
        return task;
    }

    public g(m2.a aVar, Object obj, long j3) {
        this.f927a = 28;
        this.f928b = aVar;
        this.f929c = obj;
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}

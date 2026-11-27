package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.widget.FrameLayout;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class kta implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public kta(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        r3c r3cVar = (r3c) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLObject tLObject = (TLObject) this.d;
        TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.e;
        b3c b3cVar = r3cVar.y1;
        q3c q3cVar = r3cVar.H1;
        r3cVar.l1 = null;
        if (tL_error != null && "TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error.text)) {
            r3cVar.U0();
            return;
        }
        if (tLObject instanceof TLRPC.TL_messages_translateResult) {
            TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) tLObject;
            if (!tL_messages_translateResult.result.isEmpty() && tL_messages_translateResult.result.get(0) != null && tL_messages_translateResult.result.get(0).text != null) {
                r3cVar.O1 = false;
                TLRPC.TL_textWithEntities M0 = r3c.M0(tL_textWithEntities, tL_messages_translateResult.result.get(0));
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M0.text);
                r47.b(valueOf, M0.entities, false, true, false, false, 0);
                r3cVar.z1.setText(r3cVar.N0(valueOf));
                q3cVar.D(b3cVar);
                return;
            }
        }
        if (r3cVar.O1) {
            r3cVar.dismiss();
            jn7.e().k(jn7.S4, 1, ob6.M0(2131743601, null));
            return;
        }
        xnb.x(null, 2131743601, new d31((FrameLayout) r3cVar.b, r3cVar.J0), null);
        m3c m3cVar = r3cVar.w1.e;
        String str = r3cVar.v1;
        r3cVar.u1 = str;
        m3cVar.setText(r3c.K0(str, null, null));
        q3cVar.D(b3cVar);
    }

    private final void b() {
        ((TwoStepVerificationActivity) this.b).n0((byte[]) this.c, (TLObject) this.d, (byte[]) this.e);
    }

    private final void c() {
        String G;
        o7c o7cVar = (o7c) this.b;
        String str = (String) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        if (((TLObject) this.c) instanceof TLRPC.TL_boolTrue) {
            o7cVar.k0(new bcb(o7cVar, str, (byte) 27));
        } else if (tL_error != null && !tL_error.text.startsWith("CODE_INVALID")) {
            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                int intValue = Utilities.z(tL_error.text).intValue();
                if (intValue < 60) {
                    G = ob6.G(intValue, "Seconds", new Object[0]);
                } else {
                    G = ob6.G(intValue / 60, "Minutes", new Object[0]);
                }
                o7cVar.L0(ob6.M0(2131743586, null), ob6.a0("FloodWaitTime", null, 2131750646, G));
                return;
            }
            o7cVar.L0(ob6.M0(2131743586, null), tL_error.text);
        } else {
            o7cVar.D0();
        }
    }

    private final void d() {
        u8c u8cVar = (u8c) this.b;
        HashSet hashSet = (HashSet) this.c;
        ArrayList arrayList = (ArrayList) this.e;
        int i = u8cVar.a;
        uc7.s1(i).j4((ArrayList) this.d, true);
        ArrayList arrayList2 = u8cVar.b;
        boolean isEmpty = arrayList2.isEmpty();
        int i2 = 0;
        while (i2 < arrayList2.size()) {
            t8c t8cVar = (t8c) arrayList2.get(i2);
            if (t8cVar == null || t8cVar.a() <= 0 || hashSet.contains(Long.valueOf(t8cVar.b))) {
                arrayList2.remove(i2);
                i2--;
            }
            i2++;
        }
        arrayList2.addAll(arrayList);
        boolean isEmpty2 = arrayList2.isEmpty();
        u8cVar.c = true;
        u8cVar.d = false;
        if (isEmpty != isEmpty2) {
            jn7.f(i).k(jn7.f3, new Object[0]);
        }
        u8cVar.e();
        if (u8cVar.e) {
            u8cVar.e = false;
            u8cVar.d();
        }
    }

    private final void e() {
        String e;
        BufferedWriter bufferedWriter;
        gd4 gd4Var = (gd4) this.b;
        String str = (String) this.c;
        Map map = (Map) this.d;
        List list = (List) this.e;
        qf7 qf7Var = (qf7) gd4Var.b;
        AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) gd4Var.g;
        if (((String) atomicMarkableReference.getReference()) != null) {
            qf7Var.i(str, (String) atomicMarkableReference.getReference());
        }
        if (!map.isEmpty()) {
            qf7Var.h(str, map, false);
        }
        if (!list.isEmpty()) {
            File b = qf7Var.a.b(str, "rollouts-state");
            if (list.isEmpty()) {
                qf7.g(b, "Rollout state is empty for session: " + str);
                return;
            }
            BufferedWriter bufferedWriter2 = null;
            try {
                try {
                    e = qf7.e(list);
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b), qf7.b));
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e2) {
                e = e2;
            }
            try {
                bufferedWriter.write(e);
                bufferedWriter.flush();
                jn2.b(bufferedWriter, "Failed to close rollouts state file.");
            } catch (Exception e3) {
                e = e3;
                bufferedWriter2 = bufferedWriter;
                Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
                qf7.f(b);
                jn2.b(bufferedWriter2, "Failed to close rollouts state file.");
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter2 = bufferedWriter;
                jn2.b(bufferedWriter2, "Failed to close rollouts state file.");
                throw th;
            }
        }
    }

    private final void f() {
        e Q;
        kbc kbcVar = (kbc) this.b;
        String str = (String) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.e;
        int i = kbcVar.a;
        ArrayList arrayList = (ArrayList) kbcVar.c.remove(str);
        if (arrayList != null) {
            int i2 = 0;
            if (tL_error != null) {
                String str2 = tL_error.text;
                if (str2 != null && "STARREF_EXPIRED".equals(str2)) {
                    while (i2 < arrayList.size()) {
                        ((pcc) arrayList.get(i2)).a(Long.MAX_VALUE);
                        i2++;
                    }
                    return;
                }
                while (i2 < arrayList.size()) {
                    ((pcc) arrayList.get(i2)).a(null);
                    i2++;
                }
                String str3 = tL_error.text;
                if (str3 != null && str3.contains("FLOOD_WAIT") && (Q = LaunchActivity.Q()) != null) {
                    xnb.x(null, 2131750647, d31.b0(Q), null);
                    return;
                }
                return;
            }
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            uc7.s1(i).j4(tL_contacts_resolvedPeer.users, false);
            uc7.s1(i).c4(tL_contacts_resolvedPeer.chats, false);
            jf7.Y(i).j1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
            long B1 = r47.B1(tL_contacts_resolvedPeer.peer);
            kbcVar.b.put(str, new jbc(B1));
            while (i2 < arrayList.size()) {
                ((pcc) arrayList.get(i2)).a(Long.valueOf(B1));
                i2++;
            }
        }
    }

    private final void g() {
        ((VideoAds) this.b).lambda$show$14((Context) this.c, (TLRPC.TL_sponsoredMessage) this.d, (fu5) this.e);
    }

    private final void h() {
        VoIPPreNotificationService.lambda$acknowledge$2((TLObject) this.b, (TLRPC.TL_error) this.c, (Context) this.d, (Runnable) this.e);
    }

    private final void i() {
        ((VoIPService) this.b).lambda$startGroupCheckShortpoll$66((TLRPC.TL_error) this.c, (TLObject) this.d, (TL_phone.checkGroupCall) this.e);
    }

    private final void j() {
        ((VoIPService) this.b).lambda$startConferenceGroupCall$34((TLObject) this.c, (k5) this.d, (TLRPC.TL_error) this.e);
    }

    private final void k() {
        ((VoIPService) this.b).lambda$startOutgoingCall$9((TLRPC.TL_error) this.c, (TLObject) this.d, (byte[]) this.e);
    }

    private final void l() {
        ((VoIPService) this.b).lambda$startConferenceGroupCall$47((TLObject) this.c, (TL_phone.PhoneCall) this.d, (TL_phone.exportGroupCallInvite) this.e);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kta.run():void");
    }

    public kta(Object obj, ArrayList arrayList, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.d = arrayList;
        this.c = obj2;
        this.e = obj3;
    }
}

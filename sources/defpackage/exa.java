package defpackage;

import android.util.Log;
import android.widget.LinearLayout;
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
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;
public final class exa implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public exa(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
        this.e = obj4;
    }

    private final void a() {
        String G;
        p3c p3cVar = (p3c) this.d;
        String str = (String) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        if (((TLObject) this.b) instanceof TLRPC.TL_boolTrue) {
            p3cVar.k0(new l3c(p3cVar, str, (byte) 0));
        } else if (tL_error != null && !tL_error.text.startsWith("CODE_INVALID")) {
            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                int intValue = Utilities.z(tL_error.text).intValue();
                if (intValue < 60) {
                    G = k96.G(intValue, "Seconds", new Object[0]);
                } else {
                    G = k96.G(intValue / 60, "Minutes", new Object[0]);
                }
                p3cVar.K0(k96.M0(2131743692, null), k96.a0("FloodWaitTime", null, 2131750669, G));
                return;
            }
            p3cVar.K0(k96.M0(2131743692, null), tL_error.text);
        } else {
            p3cVar.C0();
        }
    }

    private final void b() {
        v4c v4cVar = (v4c) this.d;
        HashSet hashSet = (HashSet) this.c;
        ArrayList arrayList = (ArrayList) this.e;
        int i = v4cVar.a;
        na7.q1(i).a4((ArrayList) this.b, true);
        ArrayList arrayList2 = v4cVar.b;
        boolean isEmpty = arrayList2.isEmpty();
        int i2 = 0;
        while (i2 < arrayList2.size()) {
            u4c u4cVar = (u4c) arrayList2.get(i2);
            if (u4cVar == null || u4cVar.a() <= 0 || hashSet.contains(Long.valueOf(u4cVar.b))) {
                arrayList2.remove(i2);
                i2--;
            }
            i2++;
        }
        arrayList2.addAll(arrayList);
        boolean isEmpty2 = arrayList2.isEmpty();
        v4cVar.c = true;
        v4cVar.d = false;
        if (isEmpty != isEmpty2) {
            kk7.f(i).k(kk7.e3, new Object[0]);
        }
        v4cVar.e();
        if (v4cVar.e) {
            v4cVar.e = false;
            v4cVar.d();
        }
    }

    private final void c() {
        String e;
        BufferedWriter bufferedWriter;
        jb4 jb4Var = (jb4) this.d;
        String str = (String) this.c;
        Map map = (Map) this.b;
        List list = (List) this.e;
        hd7 hd7Var = (hd7) jb4Var.b;
        AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) jb4Var.g;
        if (((String) atomicMarkableReference.getReference()) != null) {
            hd7Var.i(str, (String) atomicMarkableReference.getReference());
        }
        if (!map.isEmpty()) {
            hd7Var.h(str, map, false);
        }
        if (!list.isEmpty()) {
            File b = hd7Var.a.b(str, "rollouts-state");
            if (list.isEmpty()) {
                hd7.g(b, "Rollout state is empty for session: " + str);
                return;
            }
            BufferedWriter bufferedWriter2 = null;
            try {
                try {
                    e = hd7.e(list);
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b), hd7.b));
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e2) {
                e = e2;
            }
            try {
                bufferedWriter.write(e);
                bufferedWriter.flush();
                pm2.b(bufferedWriter, "Failed to close rollouts state file.");
            } catch (Exception e3) {
                e = e3;
                bufferedWriter2 = bufferedWriter;
                Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
                hd7.f(b);
                pm2.b(bufferedWriter2, "Failed to close rollouts state file.");
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter2 = bufferedWriter;
                pm2.b(bufferedWriter2, "Failed to close rollouts state file.");
                throw th;
            }
        }
    }

    private final void d() {
        d Q;
        k7c k7cVar = (k7c) this.d;
        String str = (String) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
        TLObject tLObject = (TLObject) this.e;
        int i = k7cVar.a;
        ArrayList arrayList = (ArrayList) k7cVar.c.remove(str);
        if (arrayList != null) {
            int i2 = 0;
            if (tL_error != null) {
                String str2 = tL_error.text;
                if (str2 != null && "STARREF_EXPIRED".equals(str2)) {
                    while (i2 < arrayList.size()) {
                        ((p8c) arrayList.get(i2)).a(Long.MAX_VALUE);
                        i2++;
                    }
                    return;
                }
                while (i2 < arrayList.size()) {
                    ((p8c) arrayList.get(i2)).a(null);
                    i2++;
                }
                String str3 = tL_error.text;
                if (str3 != null && str3.contains("FLOOD_WAIT") && (Q = LaunchActivity.Q()) != null) {
                    yjb.x(null, 2131750670, u21.b0(Q), null);
                    return;
                }
                return;
            }
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            na7.q1(i).a4(tL_contacts_resolvedPeer.users, false);
            na7.q1(i).U3(tL_contacts_resolvedPeer.chats, false);
            ad7.Y(i).j1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
            long B1 = k27.B1(tL_contacts_resolvedPeer.peer);
            k7cVar.b.put(str, new j7c(B1));
            while (i2 < arrayList.size()) {
                ((p8c) arrayList.get(i2)).a(Long.valueOf(B1));
                i2++;
            }
        }
    }

    private final void e() {
        ((VoIPService) this.d).lambda$startConferenceGroupCall$34((TLObject) this.b, (j5) this.c, (TLRPC.TL_error) this.e);
    }

    private final void f() {
        ((VoIPService) this.d).lambda$startOutgoingCall$9((TLRPC.TL_error) this.b, (TLObject) this.c, (byte[]) this.e);
    }

    private final void g() {
        ((VoIPService) this.d).lambda$startConferenceGroupCall$47((TLObject) this.b, (TL_phone.PhoneCall) this.c, (TL_phone.exportGroupCallInvite) this.e);
    }

    private final void h() {
        ((hmc) this.d).D0((LinearLayout) this.b, (c) this.c, (cs5) this.e);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.exa.run():void");
    }

    public exa(Object obj, String str, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.c = str;
        this.b = obj2;
        this.e = obj3;
    }
}

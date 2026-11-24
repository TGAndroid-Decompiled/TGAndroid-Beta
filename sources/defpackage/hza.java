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
public final class hza implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public hza(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
        this.e = obj4;
    }

    private final void a() {
        String G;
        p5c p5cVar = (p5c) this.d;
        String str = (String) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        if (((TLObject) this.b) instanceof TLRPC.TL_boolTrue) {
            p5cVar.l0(new x4c(p5cVar, str, (byte) 2));
        } else if (tL_error != null && !tL_error.text.startsWith("CODE_INVALID")) {
            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                int intValue = Utilities.z(tL_error.text).intValue();
                if (intValue < 60) {
                    G = jb6.G(intValue, "Seconds", new Object[0]);
                } else {
                    G = jb6.G(intValue / 60, "Minutes", new Object[0]);
                }
                p5cVar.L0(jb6.M0(2131743618, null), jb6.a0("FloodWaitTime", null, 2131750618, G));
                return;
            }
            p5cVar.L0(jb6.M0(2131743618, null), tL_error.text);
        } else {
            p5cVar.D0();
        }
    }

    private final void b() {
        v6c v6cVar = (v6c) this.d;
        HashSet hashSet = (HashSet) this.c;
        ArrayList arrayList = (ArrayList) this.e;
        int i = v6cVar.a;
        oc7.r1(i).d4((ArrayList) this.b, true);
        ArrayList arrayList2 = v6cVar.b;
        boolean isEmpty = arrayList2.isEmpty();
        int i2 = 0;
        while (i2 < arrayList2.size()) {
            u6c u6cVar = (u6c) arrayList2.get(i2);
            if (u6cVar == null || u6cVar.a() <= 0 || hashSet.contains(Long.valueOf(u6cVar.b))) {
                arrayList2.remove(i2);
                i2--;
            }
            i2++;
        }
        arrayList2.addAll(arrayList);
        boolean isEmpty2 = arrayList2.isEmpty();
        v6cVar.c = true;
        v6cVar.d = false;
        if (isEmpty != isEmpty2) {
            nm7.f(i).k(nm7.f3, new Object[0]);
        }
        v6cVar.e();
        if (v6cVar.e) {
            v6cVar.e = false;
            v6cVar.d();
        }
    }

    private final void c() {
        String e;
        BufferedWriter bufferedWriter;
        jd4 jd4Var = (jd4) this.d;
        String str = (String) this.c;
        Map map = (Map) this.b;
        List list = (List) this.e;
        jf7 jf7Var = (jf7) jd4Var.b;
        AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) jd4Var.g;
        if (((String) atomicMarkableReference.getReference()) != null) {
            jf7Var.i(str, (String) atomicMarkableReference.getReference());
        }
        if (!map.isEmpty()) {
            jf7Var.h(str, map, false);
        }
        if (!list.isEmpty()) {
            File b = jf7Var.a.b(str, "rollouts-state");
            if (list.isEmpty()) {
                jf7.g(b, "Rollout state is empty for session: " + str);
                return;
            }
            BufferedWriter bufferedWriter2 = null;
            try {
                try {
                    e = jf7.e(list);
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b), jf7.b));
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e2) {
                e = e2;
            }
            try {
                bufferedWriter.write(e);
                bufferedWriter.flush();
                bo2.b(bufferedWriter, "Failed to close rollouts state file.");
            } catch (Exception e3) {
                e = e3;
                bufferedWriter2 = bufferedWriter;
                Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
                jf7.f(b);
                bo2.b(bufferedWriter2, "Failed to close rollouts state file.");
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter2 = bufferedWriter;
                bo2.b(bufferedWriter2, "Failed to close rollouts state file.");
                throw th;
            }
        }
    }

    private final void d() {
        d Q;
        l9c l9cVar = (l9c) this.d;
        String str = (String) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
        TLObject tLObject = (TLObject) this.e;
        int i = l9cVar.a;
        ArrayList arrayList = (ArrayList) l9cVar.c.remove(str);
        if (arrayList != null) {
            int i2 = 0;
            if (tL_error != null) {
                String str2 = tL_error.text;
                if (str2 != null && "STARREF_EXPIRED".equals(str2)) {
                    while (i2 < arrayList.size()) {
                        ((qac) arrayList.get(i2)).a(Long.MAX_VALUE);
                        i2++;
                    }
                    return;
                }
                while (i2 < arrayList.size()) {
                    ((qac) arrayList.get(i2)).a(null);
                    i2++;
                }
                String str3 = tL_error.text;
                if (str3 != null && str3.contains("FLOOD_WAIT") && (Q = LaunchActivity.Q()) != null) {
                    mlb.y(null, 2131750619, c41.b0(Q), null);
                    return;
                }
                return;
            }
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            oc7.r1(i).d4(tL_contacts_resolvedPeer.users, false);
            oc7.r1(i).X3(tL_contacts_resolvedPeer.chats, false);
            cf7.Y(i).j1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
            long B1 = k47.B1(tL_contacts_resolvedPeer.peer);
            l9cVar.b.put(str, new k9c(B1));
            while (i2 < arrayList.size()) {
                ((qac) arrayList.get(i2)).a(Long.valueOf(B1));
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
        ((goc) this.d).E0((LinearLayout) this.b, (c) this.c, (bu5) this.e);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hza.run():void");
    }

    public hza(Object obj, String str, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.c = str;
        this.b = obj2;
        this.e = obj3;
    }
}

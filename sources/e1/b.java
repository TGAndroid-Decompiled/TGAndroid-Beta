package e1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import b8.gd;
import b8.yf;
import ci.e0;
import dd.k;
import i7.e;
import i7.g;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import od.l;
import ra.i;
import v0.f;
import v0.h;
import x7.g5;
public final class b implements l {
    public final int f9315a;
    public final Object f9316b;
    public final Object f9317c;
    public final Object d;
    public final Object f9318e;

    public b(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f9315a = i3;
        this.f9316b = obj;
        this.f9318e = obj2;
        this.f9317c = obj3;
        this.d = obj4;
    }

    @Override
    public final Object invoke(Object obj) {
        long j10;
        Object obj2;
        switch (this.f9315a) {
            case 0:
                CancellationSignal cancellationSignal = (CancellationSignal) this.f9316b;
                d dVar = (d) this.f9318e;
                Context context = dVar.f9322e;
                Executor executor = (Executor) this.f9317c;
                h hVar = (h) this.d;
                e eVar = (e) obj;
                PendingIntent pendingIntent = eVar.f14672a;
                g gVar = eVar.f14673b;
                if (pendingIntent == null && gVar == null) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!a1.h.a(cancellationSignal)) {
                        executor.execute(new a1.e(hVar, 9));
                    }
                } else {
                    if (pendingIntent != null) {
                        Intent intent = new Intent(context, HiddenActivity.class);
                        b1.d.a(dVar.f9325i, intent, "CREATE_PUBLIC_KEY_CREDENTIAL");
                        intent.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingIntent);
                        try {
                            context.startActivity(intent);
                        } catch (Exception unused) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.h.a(cancellationSignal)) {
                                Executor executor2 = dVar.f9324g;
                                if (executor2 != null) {
                                    executor2.execute(new a(dVar, 0));
                                } else {
                                    j.h("executor");
                                    throw null;
                                }
                            }
                        }
                    }
                    if (gVar != null) {
                        v0.c a10 = g5.a(gVar.f14679a, gVar.f14680b);
                        if (a10 instanceof f) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.h.a(cancellationSignal)) {
                                executor.execute(new e0(27, hVar, (f) a10));
                            }
                        }
                    }
                    if (pendingIntent == null) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.h.a(cancellationSignal)) {
                            executor.execute(new a1.e(hVar, 8));
                        }
                    }
                }
                return k.f8801a;
            case 1:
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f9316b;
                f1.a aVar = (f1.a) this.f9318e;
                Context context2 = aVar.f11335e;
                Executor executor3 = (Executor) this.f9317c;
                h hVar2 = (h) this.d;
                i7.l lVar = (i7.l) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, HiddenActivity.class);
                    b1.d.a(aVar.f11338i, intent2, "BEGIN_SIGN_IN");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", lVar.f14689a);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.h.a(cancellationSignal2)) {
                            executor3.execute(new a1.e(hVar2, 10));
                        }
                    }
                }
                return k.f8801a;
            default:
                String str = (String) this.f9318e;
                String str2 = (String) this.f9317c;
                p1.e eVar2 = (p1.e) this.d;
                p1.b bVar = (p1.b) obj;
                ((i) this.f9316b).getClass();
                p1.e eVar3 = i.f54466c;
                p1.e eVar4 = i.d;
                String str3 = "";
                if (((String) gd.a(bVar, eVar4, "")).equals(str)) {
                    p1.e d = i.d(bVar, str);
                    if (d != null && !d.f53065a.equals(str2)) {
                        i.f(bVar, str);
                        HashSet hashSet = new HashSet((Collection) gd.a(bVar, eVar2, new HashSet()));
                        hashSet.add(str);
                        bVar.e(eVar2, hashSet);
                    }
                    return null;
                }
                long longValue = ((Long) gd.a(bVar, eVar3, 0L)).longValue();
                long j11 = 1;
                if (longValue + 1 == 30) {
                    long longValue2 = ((Long) gd.a(bVar, eVar3, 0L)).longValue();
                    Set hashSet2 = new HashSet();
                    String str4 = null;
                    for (Map.Entry entry : bVar.a().entrySet()) {
                        if (entry.getValue() instanceof Set) {
                            Set<String> set = (Set) entry.getValue();
                            for (String str5 : set) {
                                long j12 = j11;
                                if (str4 == null || str4.compareTo(str5) > 0) {
                                    str3 = ((p1.e) entry.getKey()).f53065a;
                                    hashSet2 = set;
                                    str4 = str5;
                                }
                                j11 = j12;
                            }
                        }
                        j11 = j11;
                    }
                    j10 = j11;
                    obj2 = null;
                    HashSet hashSet3 = new HashSet(hashSet2);
                    hashSet3.remove(str4);
                    bVar.e(yf.b(str3), hashSet3);
                    longValue = longValue2 - j10;
                    bVar.e(eVar3, Long.valueOf(longValue));
                } else {
                    j10 = 1;
                    obj2 = null;
                }
                HashSet hashSet4 = new HashSet((Collection) gd.a(bVar, eVar2, new HashSet()));
                hashSet4.add(str);
                bVar.e(eVar2, hashSet4);
                bVar.e(eVar3, Long.valueOf(longValue + j10));
                bVar.e(eVar4, str);
                return obj2;
        }
    }
}

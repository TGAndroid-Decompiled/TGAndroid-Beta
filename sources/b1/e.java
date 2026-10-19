package b1;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import id.i;
import td.p;
import v7.c0;
public final class e implements p {
    public final int f3661a;

    public e(int i10) {
        this.f3661a = i10;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        kd.b bVar;
        int i10 = this.f3661a;
        i iVar = i.f12777a;
        switch (i10) {
            case 0:
                td.a f7 = (td.a) obj2;
                kotlin.jvm.internal.i.e(f7, "f");
                int i11 = d.d;
                c0.a((CancellationSignal) obj, f7);
                return iVar;
            case 1:
                td.a f10 = (td.a) obj2;
                kotlin.jvm.internal.i.e(f10, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a((CancellationSignal) obj)) {
                    f10.invoke();
                }
                return iVar;
            case 2:
                td.a f11 = (td.a) obj2;
                kotlin.jvm.internal.i.e(f11, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a((CancellationSignal) obj)) {
                    f11.invoke();
                }
                return iVar;
            case 3:
                td.a f12 = (td.a) obj2;
                kotlin.jvm.internal.i.e(f12, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a((CancellationSignal) obj)) {
                    f12.invoke();
                }
                return iVar;
            case 4:
                String acc = (String) obj;
                kd.f element = (kd.f) obj2;
                kotlin.jvm.internal.i.e(acc, "acc");
                kotlin.jvm.internal.i.e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            default:
                kd.h acc2 = (kd.h) obj;
                kd.f element2 = (kd.f) obj2;
                kotlin.jvm.internal.i.e(acc2, "acc");
                kotlin.jvm.internal.i.e(element2, "element");
                kd.h minusKey = acc2.minusKey(element2.getKey());
                kd.i iVar2 = kd.i.f15031a;
                if (minusKey != iVar2) {
                    kd.d dVar = kd.d.f15030a;
                    kd.e eVar = (kd.e) minusKey.get(dVar);
                    if (eVar == null) {
                        bVar = new kd.b(element2, minusKey);
                    } else {
                        kd.h minusKey2 = minusKey.minusKey(dVar);
                        if (minusKey2 == iVar2) {
                            return new kd.b(eVar, element2);
                        }
                        bVar = new kd.b(eVar, new kd.b(element2, minusKey2));
                    }
                    return bVar;
                }
                return element2;
        }
    }
}

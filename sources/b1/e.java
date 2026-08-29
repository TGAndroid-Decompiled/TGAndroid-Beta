package b1;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bd.p;
import h7.g5;
import kotlin.jvm.internal.j;
import qc.i;
public final class e implements p {
    public final int f1887a;

    public e(int i10) {
        this.f1887a = i10;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        sc.b bVar;
        int i10 = this.f1887a;
        i iVar = i.f46603a;
        switch (i10) {
            case 0:
                bd.a f9 = (bd.a) obj2;
                j.e(f9, "f");
                int i11 = d.d;
                g5.a((CancellationSignal) obj, f9);
                return iVar;
            case 1:
                bd.a f10 = (bd.a) obj2;
                j.e(f10, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a((CancellationSignal) obj)) {
                    f10.invoke();
                }
                return iVar;
            case 2:
                bd.a f11 = (bd.a) obj2;
                j.e(f11, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a((CancellationSignal) obj)) {
                    f11.invoke();
                }
                return iVar;
            case 3:
                bd.a f12 = (bd.a) obj2;
                j.e(f12, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a((CancellationSignal) obj)) {
                    f12.invoke();
                }
                return iVar;
            case 4:
                String acc = (String) obj;
                sc.f element = (sc.f) obj2;
                j.e(acc, "acc");
                j.e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            default:
                sc.h acc2 = (sc.h) obj;
                sc.f element2 = (sc.f) obj2;
                j.e(acc2, "acc");
                j.e(element2, "element");
                sc.h minusKey = acc2.minusKey(element2.getKey());
                sc.i iVar2 = sc.i.f47711a;
                if (minusKey != iVar2) {
                    sc.d dVar = sc.d.f47710a;
                    sc.e eVar = (sc.e) minusKey.get(dVar);
                    if (eVar == null) {
                        bVar = new sc.b(element2, minusKey);
                    } else {
                        sc.h minusKey2 = minusKey.minusKey(dVar);
                        if (minusKey2 == iVar2) {
                            return new sc.b(eVar, element2);
                        }
                        bVar = new sc.b(eVar, new sc.b(element2, minusKey2));
                    }
                    return bVar;
                }
                return element2;
        }
    }
}

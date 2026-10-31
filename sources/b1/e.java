package b1;

import ad.j;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import kotlin.jvm.internal.i;
import ld.p;
import v7.c0;
public final class e implements p {
    public final int f1950a;

    public e(int i10) {
        this.f1950a = i10;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        cd.b bVar;
        int i10 = this.f1950a;
        j jVar = j.f401a;
        switch (i10) {
            case 0:
                ld.a f7 = (ld.a) obj2;
                i.e(f7, "f");
                int i11 = d.d;
                c0.a((CancellationSignal) obj, f7);
                return jVar;
            case 1:
                ld.a f10 = (ld.a) obj2;
                i.e(f10, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a((CancellationSignal) obj)) {
                    f10.invoke();
                }
                return jVar;
            case 2:
                String acc = (String) obj;
                cd.f element = (cd.f) obj2;
                i.e(acc, "acc");
                i.e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            case 3:
                cd.h acc2 = (cd.h) obj;
                cd.f element2 = (cd.f) obj2;
                i.e(acc2, "acc");
                i.e(element2, "element");
                cd.h minusKey = acc2.minusKey(element2.getKey());
                cd.i iVar = cd.i.f4123a;
                if (minusKey != iVar) {
                    cd.d dVar = cd.d.f4122a;
                    cd.e eVar = (cd.e) minusKey.get(dVar);
                    if (eVar == null) {
                        bVar = new cd.b(element2, minusKey);
                    } else {
                        cd.h minusKey2 = minusKey.minusKey(dVar);
                        if (minusKey2 == iVar) {
                            return new cd.b(eVar, element2);
                        }
                        bVar = new cd.b(eVar, new cd.b(element2, minusKey2));
                    }
                    return bVar;
                }
                return element2;
            case 4:
                ld.a f11 = (ld.a) obj2;
                i.e(f11, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a((CancellationSignal) obj)) {
                    f11.invoke();
                }
                return jVar;
            default:
                ld.a f12 = (ld.a) obj2;
                i.e(f12, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a((CancellationSignal) obj)) {
                    f12.invoke();
                }
                return jVar;
        }
    }
}

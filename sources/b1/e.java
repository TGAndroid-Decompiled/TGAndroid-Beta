package b1;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import dd.p;
import j7.b0;
import kotlin.jvm.internal.j;
import sc.i;
public final class e implements p {
    public final int f1289a;

    public e(int i10) {
        this.f1289a = i10;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        uc.b bVar;
        int i10 = this.f1289a;
        i iVar = i.f44318a;
        switch (i10) {
            case 0:
                dd.a f10 = (dd.a) obj2;
                j.e(f10, "f");
                int i11 = d.d;
                b0.a((CancellationSignal) obj, f10);
                return iVar;
            case 1:
                dd.a f11 = (dd.a) obj2;
                j.e(f11, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a((CancellationSignal) obj)) {
                    f11.invoke();
                }
                return iVar;
            case 2:
                dd.a f12 = (dd.a) obj2;
                j.e(f12, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a((CancellationSignal) obj)) {
                    f12.invoke();
                }
                return iVar;
            case 3:
                dd.a f13 = (dd.a) obj2;
                j.e(f13, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a((CancellationSignal) obj)) {
                    f13.invoke();
                }
                return iVar;
            case 4:
                String acc = (String) obj;
                uc.f element = (uc.f) obj2;
                j.e(acc, "acc");
                j.e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            default:
                uc.h acc2 = (uc.h) obj;
                uc.f element2 = (uc.f) obj2;
                j.e(acc2, "acc");
                j.e(element2, "element");
                uc.h minusKey = acc2.minusKey(element2.getKey());
                uc.i iVar2 = uc.i.f45281a;
                if (minusKey != iVar2) {
                    uc.d dVar = uc.d.f45280a;
                    uc.e eVar = (uc.e) minusKey.get(dVar);
                    if (eVar == null) {
                        bVar = new uc.b(element2, minusKey);
                    } else {
                        uc.h minusKey2 = minusKey.minusKey(dVar);
                        if (minusKey2 == iVar2) {
                            return new uc.b(eVar, element2);
                        }
                        bVar = new uc.b(eVar, new uc.b(element2, minusKey2));
                    }
                    return bVar;
                }
                return element2;
        }
    }
}

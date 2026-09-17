package b1;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import gd.i;
import rd.p;
import v7.f0;
public final class e implements p {
    public final int f1952a;

    public e(int i10) {
        this.f1952a = i10;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        id.b bVar;
        int i10 = this.f1952a;
        i iVar = i.f10616a;
        switch (i10) {
            case 0:
                rd.a f7 = (rd.a) obj2;
                kotlin.jvm.internal.i.e(f7, "f");
                int i11 = d.d;
                f0.a((CancellationSignal) obj, f7);
                return iVar;
            case 1:
                rd.a f10 = (rd.a) obj2;
                kotlin.jvm.internal.i.e(f10, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a((CancellationSignal) obj)) {
                    f10.invoke();
                }
                return iVar;
            case 2:
                rd.a f11 = (rd.a) obj2;
                kotlin.jvm.internal.i.e(f11, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a((CancellationSignal) obj)) {
                    f11.invoke();
                }
                return iVar;
            case 3:
                rd.a f12 = (rd.a) obj2;
                kotlin.jvm.internal.i.e(f12, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a((CancellationSignal) obj)) {
                    f12.invoke();
                }
                return iVar;
            case 4:
                String acc = (String) obj;
                id.f element = (id.f) obj2;
                kotlin.jvm.internal.i.e(acc, "acc");
                kotlin.jvm.internal.i.e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            default:
                id.h acc2 = (id.h) obj;
                id.f element2 = (id.f) obj2;
                kotlin.jvm.internal.i.e(acc2, "acc");
                kotlin.jvm.internal.i.e(element2, "element");
                id.h minusKey = acc2.minusKey(element2.getKey());
                id.i iVar2 = id.i.f11980a;
                if (minusKey != iVar2) {
                    id.d dVar = id.d.f11979a;
                    id.e eVar = (id.e) minusKey.get(dVar);
                    if (eVar == null) {
                        bVar = new id.b(element2, minusKey);
                    } else {
                        id.h minusKey2 = minusKey.minusKey(dVar);
                        if (minusKey2 == iVar2) {
                            return new id.b(eVar, element2);
                        }
                        bVar = new id.b(eVar, new id.b(element2, minusKey2));
                    }
                    return bVar;
                }
                return element2;
        }
    }
}

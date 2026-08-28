package b1;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import f7.f0;
import oc.i;
import zc.p;
public final class e implements p {
    public final int f1397a;

    public e(int i9) {
        this.f1397a = i9;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        qc.b bVar;
        int i9 = this.f1397a;
        i iVar = i.f19197a;
        switch (i9) {
            case 0:
                zc.a f10 = (zc.a) obj2;
                kotlin.jvm.internal.i.e(f10, "f");
                int i10 = d.d;
                f0.a((CancellationSignal) obj, f10);
                return iVar;
            case 1:
                zc.a f11 = (zc.a) obj2;
                kotlin.jvm.internal.i.e(f11, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a((CancellationSignal) obj)) {
                    f11.invoke();
                }
                return iVar;
            case 2:
                zc.a f12 = (zc.a) obj2;
                kotlin.jvm.internal.i.e(f12, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a((CancellationSignal) obj)) {
                    f12.invoke();
                }
                return iVar;
            case 3:
                zc.a f13 = (zc.a) obj2;
                kotlin.jvm.internal.i.e(f13, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a((CancellationSignal) obj)) {
                    f13.invoke();
                }
                return iVar;
            case 4:
                String acc = (String) obj;
                qc.f element = (qc.f) obj2;
                kotlin.jvm.internal.i.e(acc, "acc");
                kotlin.jvm.internal.i.e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            default:
                qc.h acc2 = (qc.h) obj;
                qc.f element2 = (qc.f) obj2;
                kotlin.jvm.internal.i.e(acc2, "acc");
                kotlin.jvm.internal.i.e(element2, "element");
                qc.h minusKey = acc2.minusKey(element2.getKey());
                qc.i iVar2 = qc.i.f46140a;
                if (minusKey != iVar2) {
                    qc.d dVar = qc.d.f46139a;
                    qc.e eVar = (qc.e) minusKey.get(dVar);
                    if (eVar == null) {
                        bVar = new qc.b(element2, minusKey);
                    } else {
                        qc.h minusKey2 = minusKey.minusKey(dVar);
                        if (minusKey2 == iVar2) {
                            return new qc.b(eVar, element2);
                        }
                        bVar = new qc.b(eVar, new qc.b(element2, minusKey2));
                    }
                    return bVar;
                }
                return element2;
        }
    }
}

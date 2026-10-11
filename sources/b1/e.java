package b1;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import hd.i;
import sd.p;
import v7.c0;
public final class e implements p {
    public final int f3198a;

    public e(int i10) {
        this.f3198a = i10;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        jd.b bVar;
        int i10 = this.f3198a;
        i iVar = i.f11091a;
        switch (i10) {
            case 0:
                sd.a f7 = (sd.a) obj2;
                kotlin.jvm.internal.i.e(f7, "f");
                int i11 = d.d;
                c0.a((CancellationSignal) obj, f7);
                return iVar;
            case 1:
                sd.a f10 = (sd.a) obj2;
                kotlin.jvm.internal.i.e(f10, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a((CancellationSignal) obj)) {
                    f10.invoke();
                }
                return iVar;
            case 2:
                sd.a f11 = (sd.a) obj2;
                kotlin.jvm.internal.i.e(f11, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a((CancellationSignal) obj)) {
                    f11.invoke();
                }
                return iVar;
            case 3:
                sd.a f12 = (sd.a) obj2;
                kotlin.jvm.internal.i.e(f12, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a((CancellationSignal) obj)) {
                    f12.invoke();
                }
                return iVar;
            case 4:
                String acc = (String) obj;
                jd.f element = (jd.f) obj2;
                kotlin.jvm.internal.i.e(acc, "acc");
                kotlin.jvm.internal.i.e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            default:
                jd.h acc2 = (jd.h) obj;
                jd.f element2 = (jd.f) obj2;
                kotlin.jvm.internal.i.e(acc2, "acc");
                kotlin.jvm.internal.i.e(element2, "element");
                jd.h minusKey = acc2.minusKey(element2.getKey());
                jd.i iVar2 = jd.i.f14128a;
                if (minusKey != iVar2) {
                    jd.d dVar = jd.d.f14127a;
                    jd.e eVar = (jd.e) minusKey.get(dVar);
                    if (eVar == null) {
                        bVar = new jd.b(element2, minusKey);
                    } else {
                        jd.h minusKey2 = minusKey.minusKey(dVar);
                        if (minusKey2 == iVar2) {
                            return new jd.b(eVar, element2);
                        }
                        bVar = new jd.b(eVar, new jd.b(element2, minusKey2));
                    }
                    return bVar;
                }
                return element2;
        }
    }
}

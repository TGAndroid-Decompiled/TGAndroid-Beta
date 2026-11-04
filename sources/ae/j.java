package ae;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b8.f1;
import be.w;
import wd.u1;
public final class j implements od.p {
    public final int f402a;

    public j(int i3) {
        this.f402a = i3;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i3;
        fd.b bVar;
        int i10 = this.f402a;
        Integer num = null;
        dd.k kVar = dd.k.f8801a;
        switch (i10) {
            case 0:
                fd.f fVar = (fd.f) obj2;
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 1:
                od.a f10 = (od.a) obj2;
                kotlin.jvm.internal.j.e(f10, "f");
                int i11 = b1.d.d;
                f1.a((CancellationSignal) obj, f10);
                return kVar;
            case 2:
                fd.f fVar2 = (fd.f) obj2;
                if (fVar2 instanceof u1) {
                    if (obj instanceof Integer) {
                        num = (Integer) obj;
                    }
                    if (num != null) {
                        i3 = num.intValue();
                    } else {
                        i3 = 1;
                    }
                    if (i3 == 0) {
                        return fVar2;
                    }
                    return Integer.valueOf(i3 + 1);
                }
                return obj;
            case 3:
                u1 u1Var = (u1) obj;
                fd.f fVar3 = (fd.f) obj2;
                if (u1Var != null) {
                    return u1Var;
                }
                if (!(fVar3 instanceof u1)) {
                    return null;
                }
                return (u1) fVar3;
            case 4:
                fd.f fVar4 = (fd.f) obj2;
                return (w) obj;
            case 5:
                od.a f11 = (od.a) obj2;
                kotlin.jvm.internal.j.e(f11, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a((CancellationSignal) obj)) {
                    f11.invoke();
                }
                return kVar;
            case 6:
                od.a f12 = (od.a) obj2;
                kotlin.jvm.internal.j.e(f12, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a((CancellationSignal) obj)) {
                    f12.invoke();
                }
                return kVar;
            case 7:
                od.a f13 = (od.a) obj2;
                kotlin.jvm.internal.j.e(f13, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a((CancellationSignal) obj)) {
                    f13.invoke();
                }
                return kVar;
            case 8:
                String acc = (String) obj;
                fd.f element = (fd.f) obj2;
                kotlin.jvm.internal.j.e(acc, "acc");
                kotlin.jvm.internal.j.e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            case 9:
                fd.h acc2 = (fd.h) obj;
                fd.f element2 = (fd.f) obj2;
                kotlin.jvm.internal.j.e(acc2, "acc");
                kotlin.jvm.internal.j.e(element2, "element");
                fd.h minusKey = acc2.minusKey(element2.getKey());
                fd.i iVar = fd.i.f11567a;
                if (minusKey != iVar) {
                    fd.d dVar = fd.d.f11566a;
                    fd.e eVar = (fd.e) minusKey.get(dVar);
                    if (eVar == null) {
                        bVar = new fd.b(element2, minusKey);
                    } else {
                        fd.h minusKey2 = minusKey.minusKey(dVar);
                        if (minusKey2 == iVar) {
                            return new fd.b(eVar, element2);
                        }
                        bVar = new fd.b(eVar, new fd.b(element2, minusKey2));
                    }
                    return bVar;
                }
                return element2;
            case 10:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                fd.f fVar5 = (fd.f) obj2;
                return bool;
            case 11:
                return ((fd.h) obj).plus((fd.f) obj2);
            default:
                return ((fd.h) obj).plus((fd.f) obj2);
        }
    }
}

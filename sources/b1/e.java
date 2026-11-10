package b1;

import a8.d7;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import ee.v;
import gd.k;
import id.h;
import id.i;
import kotlin.jvm.internal.j;
import rd.p;
import zd.u1;
public final class e implements p {
    public final int f2900a;

    public e(int i7) {
        this.f2900a = i7;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i7;
        id.b bVar;
        int i10 = this.f2900a;
        Integer num = null;
        k kVar = k.f13831a;
        switch (i10) {
            case 0:
                rd.a f10 = (rd.a) obj2;
                j.e(f10, "f");
                int i11 = d.d;
                d7.a((CancellationSignal) obj, f10);
                return kVar;
            case 1:
                rd.a f11 = (rd.a) obj2;
                j.e(f11, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a((CancellationSignal) obj)) {
                    f11.invoke();
                }
                return kVar;
            case 2:
                rd.a f12 = (rd.a) obj2;
                j.e(f12, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a((CancellationSignal) obj)) {
                    f12.invoke();
                }
                return kVar;
            case 3:
                id.f fVar = (id.f) obj2;
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 4:
                rd.a f13 = (rd.a) obj2;
                j.e(f13, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a((CancellationSignal) obj)) {
                    f13.invoke();
                }
                return kVar;
            case 5:
                id.f fVar2 = (id.f) obj2;
                if (fVar2 instanceof u1) {
                    if (obj instanceof Integer) {
                        num = (Integer) obj;
                    }
                    if (num != null) {
                        i7 = num.intValue();
                    } else {
                        i7 = 1;
                    }
                    if (i7 == 0) {
                        return fVar2;
                    }
                    return Integer.valueOf(i7 + 1);
                }
                return obj;
            case 6:
                u1 u1Var = (u1) obj;
                id.f fVar3 = (id.f) obj2;
                if (u1Var != null) {
                    return u1Var;
                }
                if (!(fVar3 instanceof u1)) {
                    return null;
                }
                return (u1) fVar3;
            case 7:
                id.f fVar4 = (id.f) obj2;
                return (v) obj;
            case 8:
                String acc = (String) obj;
                id.f element = (id.f) obj2;
                j.e(acc, "acc");
                j.e(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            case 9:
                h acc2 = (h) obj;
                id.f element2 = (id.f) obj2;
                j.e(acc2, "acc");
                j.e(element2, "element");
                h minusKey = acc2.minusKey(element2.getKey());
                i iVar = i.f15458a;
                if (minusKey != iVar) {
                    id.d dVar = id.d.f15457a;
                    id.e eVar = (id.e) minusKey.get(dVar);
                    if (eVar == null) {
                        bVar = new id.b(element2, minusKey);
                    } else {
                        h minusKey2 = minusKey.minusKey(dVar);
                        if (minusKey2 == iVar) {
                            return new id.b(eVar, element2);
                        }
                        bVar = new id.b(eVar, new id.b(element2, minusKey2));
                    }
                    return bVar;
                }
                return element2;
            case 10:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                id.f fVar5 = (id.f) obj2;
                return bool;
            case 11:
                return ((h) obj).plus((id.f) obj2);
            default:
                return ((h) obj).plus((id.f) obj2);
        }
    }
}

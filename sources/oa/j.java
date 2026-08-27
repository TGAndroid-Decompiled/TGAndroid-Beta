package oa;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public final class j extends AbstractSet {

    public final int f19393a;

    public final l f19394b;

    public j(l lVar, int i10) {
        this.f19393a = i10;
        this.f19394b = lVar;
    }

    @Override
    public final void clear() {
        switch (this.f19393a) {
            case 0:
                this.f19394b.clear();
                break;
            default:
                this.f19394b.clear();
                break;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        k kVarA;
        switch (this.f19393a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                l lVar = this.f19394b;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                k kVar = null;
                if (key != null) {
                    try {
                        kVarA = lVar.a(key, false);
                    } catch (ClassCastException unused) {
                        kVarA = null;
                    }
                    break;
                } else {
                    kVarA = null;
                }
                if (kVarA != null && Objects.equals(kVarA.f19400n, entry.getValue())) {
                    kVar = kVarA;
                }
                return kVar != null;
            default:
                return this.f19394b.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f19393a) {
            case 0:
                return new i(this.f19394b, 0);
            default:
                return new i(this.f19394b, 1);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        k kVarA;
        switch (this.f19393a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                l lVar = this.f19394b;
                k kVar = null;
                if (key != null) {
                    try {
                        kVarA = lVar.a(key, false);
                    } catch (ClassCastException unused) {
                        kVarA = null;
                    }
                    break;
                } else {
                    kVarA = null;
                }
                if (kVarA != null && Objects.equals(kVarA.f19400n, entry.getValue())) {
                    kVar = kVarA;
                }
                if (kVar == null) {
                    return false;
                }
                lVar.c(kVar, true);
                return true;
            default:
                l lVar2 = this.f19394b;
                k kVarA2 = null;
                if (obj != null) {
                    try {
                        kVarA2 = lVar2.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (kVarA2 != null) {
                    lVar2.c(kVarA2, true);
                }
                return kVarA2 != null;
        }
    }

    @Override
    public final int size() {
        switch (this.f19393a) {
            case 0:
                break;
        }
        return this.f19394b.d;
    }
}

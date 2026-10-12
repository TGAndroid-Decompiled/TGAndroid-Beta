package b2;

import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.SparseBooleanArray;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.internal.play_billing.y3;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import v7.u6;
public final class u implements s4.d0, androidx.lifecycle.a0, y9.i {
    public final int f2395a;
    public boolean f2396b;
    public Object f2397c;

    public u(int i10) {
        this.f2395a = i10;
    }

    public static u g(Bundle bundle) {
        p4.m mVar;
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i10);
                if (bundle2 != null) {
                    mVar = new p4.m(bundle2);
                } else {
                    mVar = null;
                }
                arrayList.add(mVar);
            }
        }
        return new u(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    @Override
    public void D(int i10, int i11) {
        this.f2396b = true;
        ((s4.g0) this.f2397c).p(i10, i11);
    }

    @Override
    public void P0(int i10, int i11) {
        this.f2396b = true;
        ((s4.g0) this.f2397c).t(i10, i11);
    }

    @Override
    public void a(y9.h hVar, int i10) {
        StringBuilder sb2 = (StringBuilder) this.f2397c;
        if (this.f2396b) {
            this.f2396b = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i10);
    }

    public void b(int i10) {
        u6.p(!this.f2396b);
        ((SparseBooleanArray) this.f2397c).append(i10, true);
    }

    public void c(v vVar) {
        for (int i10 = 0; i10 < vVar.f2443a.size(); i10++) {
            b(vVar.a(i10));
        }
    }

    public v d() {
        u6.p(!this.f2396b);
        this.f2396b = true;
        return new v((SparseBooleanArray) this.f2397c);
    }

    public void e() {
        synchronized (this) {
            try {
                if (this.f2396b) {
                    return;
                }
                this.f2396b = true;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f2397c;
                if (cancellationSignal != null) {
                    try {
                        cancellationSignal.cancel();
                    } catch (Throwable th2) {
                        synchronized (this) {
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                synchronized (this) {
                    notifyAll();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public boolean f() {
        return this.f2396b;
    }

    public boolean h(int i10, CharSequence charSequence) {
        if (charSequence != null && i10 >= 0 && charSequence.length() - i10 >= 0) {
            p0.e eVar = (p0.e) this.f2397c;
            if (eVar == null) {
                return f();
            }
            eVar.getClass();
            boolean z10 = true;
            for (int i11 = 0; i11 < i10 && z10; i11++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i11));
                u uVar = p0.f.f42827a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                z10 = true;
                                break;
                        }
                    }
                    z10 = false;
                }
                z10 = true;
            }
            if (!z10) {
                return true;
            }
            if (z10) {
                return false;
            }
            return f();
        }
        throw new IllegalArgumentException();
    }

    public void i(y3 y3Var) {
        if (this.f2396b) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((l5.r) this.f2397c).a(new i5.a(null, y3Var, i5.d.f11319a, null), new k2.y0(2));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "logging failed.");
        }
    }

    @Override
    public void j0(int i10, int i11) {
        this.f2396b = true;
        ((s4.g0) this.f2397c).s(i10, i11);
    }

    @Override
    public void m1(int i10, int i11) {
        ((s4.g0) this.f2397c).r(i10, i11, null);
    }

    public String toString() {
        switch (this.f2395a) {
            case 5:
                StringBuilder sb2 = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = (List) this.f2397c;
                sb2.append(Arrays.toString(list.toArray()));
                sb2.append(", isValid=");
                int size = list.size();
                boolean z10 = false;
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        p4.m mVar = (p4.m) list.get(i10);
                        if (mVar != null && mVar.e()) {
                            i10++;
                        }
                    } else {
                        z10 = true;
                    }
                }
                sb2.append(z10);
                sb2.append(" }");
                return sb2.toString();
            case 6:
            default:
                return super.toString();
            case 7:
                return ((qb.c) this.f2397c).toString();
        }
    }

    @Override
    public void v0(Object obj) {
        this.f2396b = true;
        qb.c cVar = (qb.c) this.f2397c;
        cVar.getClass();
        Void r32 = (Void) obj;
        SignInHubActivity signInHubActivity = (SignInHubActivity) cVar.f43343b;
        signInHubActivity.setResult(signInHubActivity.R, signInHubActivity.S);
        signInHubActivity.finish();
    }

    public u(Object obj, int i10) {
        this.f2395a = i10;
        this.f2397c = obj;
    }

    public u() {
        this.f2395a = 0;
        this.f2397c = new SparseBooleanArray();
    }

    public u(ArrayList arrayList, boolean z10) {
        this.f2395a = 5;
        if (arrayList.isEmpty()) {
            this.f2397c = Collections.EMPTY_LIST;
        } else {
            this.f2397c = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.f2396b = z10;
    }

    public u(p0.e eVar, boolean z10) {
        this(eVar, 4);
        this.f2395a = 4;
        this.f2396b = z10;
    }

    public u(a6.d dVar, qb.c cVar) {
        this.f2395a = 7;
        this.f2396b = false;
        this.f2397c = cVar;
    }

    public u(StringBuilder sb2) {
        this.f2395a = 8;
        this.f2397c = sb2;
        this.f2396b = true;
    }
}

package c2;

import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.SparseBooleanArray;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.internal.play_billing.w3;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class t implements g9.j, f2.m0, androidx.lifecycle.a0 {

    public final int f2345a;

    public boolean f2346b;

    public Object f2347c;

    public t(int i10) {
        this.f2345a = i10;
    }

    public static t f(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i10);
                arrayList.add(bundle2 != null ? new n(bundle2) : null);
            }
        }
        return new t(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    @Override
    public void A(int i10, int i11) {
        this.f2346b = true;
        ((f2.q0) this.f2347c).p(i10, i11);
    }

    @Override
    public void J(Object obj) {
        this.f2346b = true;
        ga.c cVar = (ga.c) this.f2347c;
        cVar.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) cVar.f6834b;
        signInHubActivity.setResult(signInHubActivity.N, signInHubActivity.O);
        signInHubActivity.finish();
    }

    @Override
    public void K0(int i10, int i11) {
        this.f2346b = true;
        ((f2.q0) this.f2347c).t(i10, i11);
    }

    @Override
    public void S(int i10, int i11) {
        this.f2346b = true;
        ((f2.q0) this.f2347c).s(i10, i11);
    }

    @Override
    public void a(g9.i iVar, int i10) {
        StringBuilder sb2 = (StringBuilder) this.f2347c;
        if (this.f2346b) {
            this.f2346b = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i10);
    }

    public void b(int i10) {
        d5.a.i(!this.f2346b);
        ((SparseBooleanArray) this.f2347c).append(i10, true);
    }

    public d5.g c() {
        d5.a.i(!this.f2346b);
        this.f2346b = true;
        return new d5.g((SparseBooleanArray) this.f2347c);
    }

    public void d() {
        synchronized (this) {
            try {
                if (this.f2346b) {
                    return;
                }
                this.f2346b = true;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f2347c;
                if (cancellationSignal != null) {
                    try {
                        cancellationSignal.cancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (this) {
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean e() {
        return this.f2346b;
    }

    public boolean g(int i10, CharSequence charSequence) {
        if (charSequence == null || i10 < 0 || charSequence.length() - i10 < 0) {
            throw new IllegalArgumentException();
        }
        p0.e eVar = (p0.e) this.f2347c;
        if (eVar == null) {
            return e();
        }
        eVar.getClass();
        char c10 = 2;
        for (int i11 = 0; i11 < i10 && c10 == 2; i11++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i11));
            t tVar = p0.f.f45338a;
            if (directionality == 0) {
                c10 = 1;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        c10 = 1;
                        break;
                    case 16:
                    case 17:
                        c10 = 0;
                        break;
                    default:
                        c10 = 2;
                        break;
                }
            } else {
                c10 = 0;
            }
        }
        if (c10 == 0) {
            return true;
        }
        if (c10 != 1) {
            return e();
        }
        return false;
    }

    public void h(w3 w3Var) {
        if (this.f2346b) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((w2.p) this.f2347c).a(new t2.a(null, w3Var, t2.d.f48012a, null), new u3.k(6));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "logging failed.");
        }
    }

    @Override
    public void k1(int i10, int i11) {
        ((f2.q0) this.f2347c).r(i10, i11, null);
    }

    public String toString() {
        switch (this.f2345a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = (List) this.f2347c;
                sb2.append(Arrays.toString(list.toArray()));
                sb2.append(", isValid=");
                int size = list.size();
                boolean z10 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    n nVar = (n) list.get(i10);
                    if (nVar == null || !nVar.e()) {
                        sb2.append(z10);
                        sb2.append(" }");
                        return sb2.toString();
                    }
                }
                z10 = true;
                sb2.append(z10);
                sb2.append(" }");
                return sb2.toString();
            case 8:
                return ((ga.c) this.f2347c).toString();
            default:
                return super.toString();
        }
    }

    public t(Object obj, int i10) {
        this.f2345a = i10;
        this.f2347c = obj;
    }

    public t() {
        this.f2345a = 1;
        this.f2347c = new SparseBooleanArray();
    }

    public t(ArrayList arrayList, boolean z10) {
        this.f2345a = 0;
        if (arrayList.isEmpty()) {
            this.f2347c = Collections.EMPTY_LIST;
        } else {
            this.f2347c = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.f2346b = z10;
    }

    public t(p0.e eVar, boolean z10) {
        this(eVar, 6);
        this.f2345a = 6;
        this.f2346b = z10;
    }

    public t(k5.d dVar, ga.c cVar) {
        this.f2345a = 8;
        this.f2346b = false;
        this.f2347c = cVar;
    }

    public t(StringBuilder sb2) {
        this.f2345a = 2;
        this.f2347c = sb2;
        this.f2346b = true;
    }
}

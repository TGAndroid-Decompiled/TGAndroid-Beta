package c2;

import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.SparseBooleanArray;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.internal.play_billing.x3;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public final class t implements f9.j, f2.o0, androidx.lifecycle.a0 {
    public final int f2232a;
    public boolean f2233b;
    public Object f2234c;

    public t(int i9) {
        this.f2232a = i9;
    }

    public static t f(Bundle bundle) {
        n nVar;
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i9 = 0; i9 < parcelableArrayList.size(); i9++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i9);
                if (bundle2 != null) {
                    nVar = new n(bundle2);
                } else {
                    nVar = null;
                }
                arrayList.add(nVar);
            }
        }
        return new t(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    @Override
    public void E(Object obj) {
        this.f2233b = true;
        k5.i iVar = (k5.i) this.f2234c;
        iVar.getClass();
        Void r32 = (Void) obj;
        SignInHubActivity signInHubActivity = (SignInHubActivity) iVar.f14659b;
        signInHubActivity.setResult(signInHubActivity.N, signInHubActivity.O);
        signInHubActivity.finish();
    }

    @Override
    public void I(int i9, int i10) {
        this.f2233b = true;
        ((f2.r0) this.f2234c).s(i9, i10);
    }

    @Override
    public void J0(int i9, int i10) {
        this.f2233b = true;
        ((f2.r0) this.f2234c).t(i9, i10);
    }

    @Override
    public void a(f9.i iVar, int i9) {
        StringBuilder sb2 = (StringBuilder) this.f2234c;
        if (this.f2233b) {
            this.f2233b = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i9);
    }

    public void b(int i9) {
        d5.a.i(!this.f2233b);
        ((SparseBooleanArray) this.f2234c).append(i9, true);
    }

    public d5.g c() {
        d5.a.i(!this.f2233b);
        this.f2233b = true;
        return new d5.g((SparseBooleanArray) this.f2234c);
    }

    public void d() {
        synchronized (this) {
            try {
                if (this.f2233b) {
                    return;
                }
                this.f2233b = true;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f2234c;
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
        return this.f2233b;
    }

    public boolean g(int i9, CharSequence charSequence) {
        if (charSequence != null && i9 >= 0 && charSequence.length() - i9 >= 0) {
            p0.e eVar = (p0.e) this.f2234c;
            if (eVar == null) {
                return e();
            }
            eVar.getClass();
            char c10 = 2;
            for (int i10 = 0; i10 < i9 && c10 == 2; i10++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i10));
                t tVar = p0.f.f45332a;
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
                                c10 = 2;
                                break;
                        }
                    }
                    c10 = 0;
                }
                c10 = 1;
            }
            if (c10 == 0) {
                return true;
            }
            if (c10 == 1) {
                return false;
            }
            return e();
        }
        throw new IllegalArgumentException();
    }

    public void h(x3 x3Var) {
        if (this.f2233b) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((w2.p) this.f2234c).a(new t2.a(null, x3Var, t2.d.f47601a, null), new v0.l(1));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "logging failed.");
        }
    }

    @Override
    public void j1(int i9, int i10) {
        ((f2.r0) this.f2234c).r(i9, i10, null);
    }

    @Override
    public void t(int i9, int i10) {
        this.f2233b = true;
        ((f2.r0) this.f2234c).p(i9, i10);
    }

    public String toString() {
        switch (this.f2232a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = (List) this.f2234c;
                sb2.append(Arrays.toString(list.toArray()));
                sb2.append(", isValid=");
                int size = list.size();
                boolean z10 = false;
                int i9 = 0;
                while (true) {
                    if (i9 < size) {
                        n nVar = (n) list.get(i9);
                        if (nVar != null && nVar.e()) {
                            i9++;
                        }
                    } else {
                        z10 = true;
                    }
                }
                sb2.append(z10);
                sb2.append(" }");
                return sb2.toString();
            case 8:
                return ((k5.i) this.f2234c).toString();
            default:
                return super.toString();
        }
    }

    public t(Object obj, int i9) {
        this.f2232a = i9;
        this.f2234c = obj;
    }

    public t() {
        this.f2232a = 1;
        this.f2234c = new SparseBooleanArray();
    }

    public t(ArrayList arrayList, boolean z10) {
        this.f2232a = 0;
        if (arrayList.isEmpty()) {
            this.f2234c = Collections.EMPTY_LIST;
        } else {
            this.f2234c = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.f2233b = z10;
    }

    public t(p0.e eVar, boolean z10) {
        this(eVar, 7);
        this.f2232a = 7;
        this.f2233b = z10;
    }

    public t(k5.d dVar, k5.i iVar) {
        this.f2232a = 8;
        this.f2233b = false;
        this.f2234c = iVar;
    }

    public t(StringBuilder sb2) {
        this.f2232a = 2;
        this.f2234c = sb2;
        this.f2233b = true;
    }
}

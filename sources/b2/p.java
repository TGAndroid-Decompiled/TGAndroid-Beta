package b2;

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
public final class p implements s4.e0, androidx.lifecycle.a0, x9.i {
    public final int f3167a;
    public boolean f3168b;
    public Object f3169c;

    public p(int i10) {
        this.f3167a = i10;
    }

    public static p g(Bundle bundle) {
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
        return new p(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    @Override
    public void D(int i10, int i11) {
        this.f3168b = true;
        ((s4.h0) this.f3169c).p(i10, i11);
    }

    @Override
    public void O0(int i10, int i11) {
        this.f3168b = true;
        ((s4.h0) this.f3169c).t(i10, i11);
    }

    @Override
    public void a(x9.h hVar, int i10) {
        StringBuilder sb2 = (StringBuilder) this.f3169c;
        if (this.f3168b) {
            this.f3168b = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i10);
    }

    public void b(int i10) {
        e2.d.g(!this.f3168b);
        ((SparseBooleanArray) this.f3169c).append(i10, true);
    }

    public void c(q qVar) {
        for (int i10 = 0; i10 < qVar.f3194a.size(); i10++) {
            b(qVar.a(i10));
        }
    }

    public q d() {
        e2.d.g(!this.f3168b);
        this.f3168b = true;
        return new q((SparseBooleanArray) this.f3169c);
    }

    public void e() {
        synchronized (this) {
            try {
                if (this.f3168b) {
                    return;
                }
                this.f3168b = true;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f3169c;
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
        return this.f3168b;
    }

    public boolean h(int i10, CharSequence charSequence) {
        if (charSequence != null && i10 >= 0 && charSequence.length() - i10 >= 0) {
            p0.e eVar = (p0.e) this.f3169c;
            if (eVar == null) {
                return f();
            }
            eVar.getClass();
            char c10 = 2;
            for (int i11 = 0; i11 < i10 && c10 == 2; i11++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i11));
                p pVar = p0.f.f40645a;
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
            return f();
        }
        throw new IllegalArgumentException();
    }

    public void i(x3 x3Var) {
        if (this.f3168b) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((l5.r) this.f3169c).a(new i5.a(null, x3Var, i5.d.f10983a, null), new j2.e(19));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "logging failed.");
        }
    }

    @Override
    public void k0(int i10, int i11) {
        this.f3168b = true;
        ((s4.h0) this.f3169c).s(i10, i11);
    }

    @Override
    public void l1(int i10, int i11) {
        ((s4.h0) this.f3169c).r(i10, i11, null);
    }

    @Override
    public void m0(Object obj) {
        this.f3168b = true;
        a6.m mVar = (a6.m) this.f3169c;
        mVar.getClass();
        Void r32 = (Void) obj;
        SignInHubActivity signInHubActivity = (SignInHubActivity) mVar.f307b;
        signInHubActivity.setResult(signInHubActivity.R, signInHubActivity.S);
        signInHubActivity.finish();
    }

    public String toString() {
        switch (this.f3167a) {
            case 5:
                StringBuilder sb2 = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = (List) this.f3169c;
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
            case 8:
                return ((a6.m) this.f3169c).toString();
            default:
                return super.toString();
        }
    }

    public p(Object obj, int i10) {
        this.f3167a = i10;
        this.f3169c = obj;
    }

    public p() {
        this.f3167a = 0;
        this.f3169c = new SparseBooleanArray();
    }

    public p(ArrayList arrayList, boolean z10) {
        this.f3167a = 5;
        if (arrayList.isEmpty()) {
            this.f3169c = Collections.EMPTY_LIST;
        } else {
            this.f3169c = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.f3168b = z10;
    }

    public p(p0.e eVar, boolean z10) {
        this(eVar, 4);
        this.f3167a = 4;
        this.f3168b = z10;
    }

    public p(a6.d dVar, a6.m mVar) {
        this.f3167a = 8;
        this.f3168b = false;
        this.f3169c = mVar;
    }

    public p(StringBuilder sb2) {
        this.f3167a = 9;
        this.f3169c = sb2;
        this.f3168b = true;
    }
}

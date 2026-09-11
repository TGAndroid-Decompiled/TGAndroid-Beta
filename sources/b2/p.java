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
    public final int f2231a;
    public boolean f2232b;
    public Object f2233c;

    public p(int i10) {
        this.f2231a = i10;
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
        this.f2232b = true;
        ((s4.h0) this.f2233c).p(i10, i11);
    }

    @Override
    public void P0(int i10, int i11) {
        this.f2232b = true;
        ((s4.h0) this.f2233c).t(i10, i11);
    }

    @Override
    public void a(x9.h hVar, int i10) {
        StringBuilder sb2 = (StringBuilder) this.f2233c;
        if (this.f2232b) {
            this.f2232b = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i10);
    }

    public void b(int i10) {
        e2.d.g(!this.f2232b);
        ((SparseBooleanArray) this.f2233c).append(i10, true);
    }

    public void c(q qVar) {
        for (int i10 = 0; i10 < qVar.f2259a.size(); i10++) {
            b(qVar.a(i10));
        }
    }

    public q d() {
        e2.d.g(!this.f2232b);
        this.f2232b = true;
        return new q((SparseBooleanArray) this.f2233c);
    }

    public void e() {
        synchronized (this) {
            try {
                if (this.f2232b) {
                    return;
                }
                this.f2232b = true;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f2233c;
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
        return this.f2232b;
    }

    @Override
    public void f0(Object obj) {
        this.f2232b = true;
        a6.m mVar = (a6.m) this.f2233c;
        mVar.getClass();
        Void r32 = (Void) obj;
        SignInHubActivity signInHubActivity = (SignInHubActivity) mVar.f316b;
        signInHubActivity.setResult(signInHubActivity.R, signInHubActivity.S);
        signInHubActivity.finish();
    }

    public boolean h(int i10, CharSequence charSequence) {
        if (charSequence != null && i10 >= 0 && charSequence.length() - i10 >= 0) {
            p0.e eVar = (p0.e) this.f2233c;
            if (eVar == null) {
                return f();
            }
            eVar.getClass();
            char c10 = 2;
            for (int i11 = 0; i11 < i10 && c10 == 2; i11++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i11));
                p pVar = p0.f.f43634a;
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
        if (this.f2232b) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((l5.r) this.f2233c).a(new i5.a(null, x3Var, i5.d.f11859a, null), new j2.e(17));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "logging failed.");
        }
    }

    @Override
    public void k0(int i10, int i11) {
        this.f2232b = true;
        ((s4.h0) this.f2233c).s(i10, i11);
    }

    @Override
    public void m1(int i10, int i11) {
        ((s4.h0) this.f2233c).r(i10, i11, null);
    }

    public String toString() {
        switch (this.f2231a) {
            case 5:
                StringBuilder sb2 = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = (List) this.f2233c;
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
                return ((a6.m) this.f2233c).toString();
            default:
                return super.toString();
        }
    }

    public p(Object obj, int i10) {
        this.f2231a = i10;
        this.f2233c = obj;
    }

    public p() {
        this.f2231a = 0;
        this.f2233c = new SparseBooleanArray();
    }

    public p(ArrayList arrayList, boolean z10) {
        this.f2231a = 5;
        if (arrayList.isEmpty()) {
            this.f2233c = Collections.EMPTY_LIST;
        } else {
            this.f2233c = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.f2232b = z10;
    }

    public p(p0.e eVar, boolean z10) {
        this(eVar, 4);
        this.f2231a = 4;
        this.f2232b = z10;
    }

    public p(a6.d dVar, a6.m mVar) {
        this.f2231a = 8;
        this.f2232b = false;
        this.f2233c = mVar;
    }

    public p(StringBuilder sb2) {
        this.f2231a = 9;
        this.f2233c = sb2;
        this.f2232b = true;
    }
}

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
public final class u implements j9.j, f2.l0, androidx.lifecycle.a0 {
    public final int f2178a;
    public boolean f2179b;
    public Object f2180c;

    public u(int i10) {
        this.f2178a = i10;
    }

    public static u f(Bundle bundle) {
        n nVar;
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i10);
                if (bundle2 != null) {
                    nVar = new n(bundle2);
                } else {
                    nVar = null;
                }
                arrayList.add(nVar);
            }
        }
        return new u(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    @Override
    public void C(int i10, int i11) {
        this.f2179b = true;
        ((f2.p0) this.f2180c).p(i10, i11);
    }

    @Override
    public void L0(int i10, int i11) {
        this.f2179b = true;
        ((f2.p0) this.f2180c).t(i10, i11);
    }

    @Override
    public void W(Object obj) {
        this.f2179b = true;
        androidx.biometric.f0 f0Var = (androidx.biometric.f0) this.f2180c;
        f0Var.getClass();
        Void r32 = (Void) obj;
        SignInHubActivity signInHubActivity = (SignInHubActivity) f0Var.f532b;
        signInHubActivity.setResult(signInHubActivity.O, signInHubActivity.P);
        signInHubActivity.finish();
    }

    @Override
    public void a(j9.i iVar, int i10) {
        StringBuilder sb = (StringBuilder) this.f2180c;
        if (this.f2179b) {
            this.f2179b = false;
        } else {
            sb.append(", ");
        }
        sb.append(i10);
    }

    public void b(int i10) {
        h5.a.i(!this.f2179b);
        ((SparseBooleanArray) this.f2180c).append(i10, true);
    }

    public h5.g c() {
        h5.a.i(!this.f2179b);
        this.f2179b = true;
        return new h5.g((SparseBooleanArray) this.f2180c);
    }

    public void d() {
        synchronized (this) {
            try {
                if (this.f2179b) {
                    return;
                }
                this.f2179b = true;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f2180c;
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

    public boolean e() {
        return this.f2179b;
    }

    public boolean g(int i10, CharSequence charSequence) {
        if (charSequence != null && i10 >= 0 && charSequence.length() - i10 >= 0) {
            p0.e eVar = (p0.e) this.f2180c;
            if (eVar == null) {
                return e();
            }
            eVar.getClass();
            char c3 = 2;
            for (int i11 = 0; i11 < i10 && c3 == 2; i11++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i11));
                u uVar = p0.f.f44083a;
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
                                c3 = 2;
                                break;
                        }
                    }
                    c3 = 0;
                }
                c3 = 1;
            }
            if (c3 == 0) {
                return true;
            }
            if (c3 == 1) {
                return false;
            }
            return e();
        }
        throw new IllegalArgumentException();
    }

    public void h(x3 x3Var) {
        if (this.f2179b) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((y2.p) this.f2180c).a(new v2.a(null, x3Var, v2.d.f48850a, null), new sg.a(28));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "logging failed.");
        }
    }

    @Override
    public void i1(int i10, int i11) {
        ((f2.p0) this.f2180c).r(i10, i11, null);
    }

    @Override
    public void j0(int i10, int i11) {
        this.f2179b = true;
        ((f2.p0) this.f2180c).s(i10, i11);
    }

    public String toString() {
        switch (this.f2178a) {
            case 0:
                StringBuilder sb = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = (List) this.f2180c;
                sb.append(Arrays.toString(list.toArray()));
                sb.append(", isValid=");
                int size = list.size();
                boolean z4 = false;
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        n nVar = (n) list.get(i10);
                        if (nVar != null && nVar.e()) {
                            i10++;
                        }
                    } else {
                        z4 = true;
                    }
                }
                sb.append(z4);
                sb.append(" }");
                return sb.toString();
            case 8:
                return ((androidx.biometric.f0) this.f2180c).toString();
            default:
                return super.toString();
        }
    }

    public u(Object obj, int i10) {
        this.f2178a = i10;
        this.f2180c = obj;
    }

    public u(ArrayList arrayList, boolean z4) {
        this.f2178a = 0;
        if (arrayList.isEmpty()) {
            this.f2180c = Collections.EMPTY_LIST;
        } else {
            this.f2180c = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.f2179b = z4;
    }

    public u() {
        this.f2178a = 1;
        this.f2180c = new SparseBooleanArray();
    }

    public u(p0.e eVar, boolean z4) {
        this(eVar, 4);
        this.f2178a = 4;
        this.f2179b = z4;
    }

    public u(o5.d dVar, androidx.biometric.f0 f0Var) {
        this.f2178a = 8;
        this.f2179b = false;
        this.f2180c = f0Var;
    }

    public u(StringBuilder sb) {
        this.f2178a = 2;
        this.f2180c = sb;
        this.f2179b = true;
    }
}

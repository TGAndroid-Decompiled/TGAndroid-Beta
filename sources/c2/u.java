package c2;

import ag.o1;
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
public final class u implements h9.j, f2.l0, androidx.lifecycle.a0 {
    public final int f2910a;
    public boolean f2911b;
    public Object f2912c;

    public u(int i10) {
        this.f2910a = i10;
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
    public void H0(int i10, int i11) {
        this.f2911b = true;
        ((f2.p0) this.f2912c).t(i10, i11);
    }

    @Override
    public void S(Object obj) {
        this.f2911b = true;
        o1 o1Var = (o1) this.f2912c;
        o1Var.getClass();
        Void r32 = (Void) obj;
        SignInHubActivity signInHubActivity = (SignInHubActivity) o1Var.f624b;
        signInHubActivity.setResult(signInHubActivity.N, signInHubActivity.O);
        signInHubActivity.finish();
    }

    @Override
    public void a(h9.i iVar, int i10) {
        StringBuilder sb2 = (StringBuilder) this.f2912c;
        if (this.f2911b) {
            this.f2911b = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i10);
    }

    public void b(int i10) {
        f5.a.i(!this.f2911b);
        ((SparseBooleanArray) this.f2912c).append(i10, true);
    }

    public f5.g c() {
        f5.a.i(!this.f2911b);
        this.f2911b = true;
        return new f5.g((SparseBooleanArray) this.f2912c);
    }

    public void d() {
        synchronized (this) {
            try {
                if (this.f2911b) {
                    return;
                }
                this.f2911b = true;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f2912c;
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
        return this.f2911b;
    }

    @Override
    public void f1(int i10, int i11) {
        ((f2.p0) this.f2912c).r(i10, i11, null);
    }

    public boolean g(int i10, CharSequence charSequence) {
        if (charSequence != null && i10 >= 0 && charSequence.length() - i10 >= 0) {
            p0.e eVar = (p0.e) this.f2912c;
            if (eVar == null) {
                return e();
            }
            eVar.getClass();
            char c3 = 2;
            for (int i11 = 0; i11 < i10 && c3 == 2; i11++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i11));
                u uVar = p0.f.f45412a;
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

    public void h(w3 w3Var) {
        if (this.f2911b) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((y2.p) this.f2912c).a(new v2.a(null, w3Var, v2.d.f49328a, null), new sg.j(17));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "logging failed.");
        }
    }

    @Override
    public void i0(int i10, int i11) {
        this.f2911b = true;
        ((f2.p0) this.f2912c).s(i10, i11);
    }

    public String toString() {
        switch (this.f2910a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = (List) this.f2912c;
                sb2.append(Arrays.toString(list.toArray()));
                sb2.append(", isValid=");
                int size = list.size();
                boolean z10 = false;
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        n nVar = (n) list.get(i10);
                        if (nVar != null && nVar.e()) {
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
                return ((o1) this.f2912c).toString();
            default:
                return super.toString();
        }
    }

    @Override
    public void z(int i10, int i11) {
        this.f2911b = true;
        ((f2.p0) this.f2912c).p(i10, i11);
    }

    public u(Object obj, int i10) {
        this.f2910a = i10;
        this.f2912c = obj;
    }

    public u() {
        this.f2910a = 1;
        this.f2912c = new SparseBooleanArray();
    }

    public u(ArrayList arrayList, boolean z10) {
        this.f2910a = 0;
        if (arrayList.isEmpty()) {
            this.f2912c = Collections.EMPTY_LIST;
        } else {
            this.f2912c = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.f2911b = z10;
    }

    public u(p0.e eVar, boolean z10) {
        this(eVar, 5);
        this.f2910a = 5;
        this.f2911b = z10;
    }

    public u(m5.d dVar, o1 o1Var) {
        this.f2910a = 8;
        this.f2911b = false;
        this.f2912c = o1Var;
    }

    public u(StringBuilder sb2) {
        this.f2910a = 2;
        this.f2912c = sb2;
        this.f2911b = true;
    }
}

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
    public final int f1868a;
    public boolean f1869b;
    public Object f1870c;

    public p(int i10) {
        this.f1868a = i10;
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
    public void C(int i10, int i11) {
        this.f1869b = true;
        ((s4.h0) this.f1870c).p(i10, i11);
    }

    @Override
    public void O0(int i10, int i11) {
        this.f1869b = true;
        ((s4.h0) this.f1870c).t(i10, i11);
    }

    @Override
    public void a(x9.h hVar, int i10) {
        StringBuilder sb2 = (StringBuilder) this.f1870c;
        if (this.f1869b) {
            this.f1869b = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i10);
    }

    public void b(int i10) {
        e2.d.g(!this.f1869b);
        ((SparseBooleanArray) this.f1870c).append(i10, true);
    }

    public void c(q qVar) {
        for (int i10 = 0; i10 < qVar.f1895a.size(); i10++) {
            b(qVar.a(i10));
        }
    }

    public q d() {
        e2.d.g(!this.f1869b);
        this.f1869b = true;
        return new q((SparseBooleanArray) this.f1870c);
    }

    public void e() {
        synchronized (this) {
            try {
                if (this.f1869b) {
                    return;
                }
                this.f1869b = true;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f1870c;
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
        return this.f1869b;
    }

    public boolean h(int i10, CharSequence charSequence) {
        if (charSequence != null && i10 >= 0 && charSequence.length() - i10 >= 0) {
            p0.e eVar = (p0.e) this.f1870c;
            if (eVar == null) {
                return f();
            }
            eVar.getClass();
            char c10 = 2;
            for (int i11 = 0; i11 < i10 && c10 == 2; i11++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i11));
                p pVar = p0.f.f39517a;
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
        if (this.f1869b) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((l5.r) this.f1870c).a(new i5.a(null, x3Var, i5.d.f10477a, null), new j2.h(10));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "logging failed.");
        }
    }

    @Override
    public void j0(int i10, int i11) {
        this.f1869b = true;
        ((s4.h0) this.f1870c).s(i10, i11);
    }

    @Override
    public void k1(int i10, int i11) {
        ((s4.h0) this.f1870c).r(i10, i11, null);
    }

    @Override
    public void r0(Object obj) {
        this.f1869b = true;
        pb.c cVar = (pb.c) this.f1870c;
        cVar.getClass();
        Void r32 = (Void) obj;
        SignInHubActivity signInHubActivity = (SignInHubActivity) cVar.f39876b;
        signInHubActivity.setResult(signInHubActivity.R, signInHubActivity.S);
        signInHubActivity.finish();
    }

    public String toString() {
        switch (this.f1868a) {
            case 5:
                StringBuilder sb2 = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = (List) this.f1870c;
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
                return ((pb.c) this.f1870c).toString();
            default:
                return super.toString();
        }
    }

    public p(Object obj, int i10) {
        this.f1868a = i10;
        this.f1870c = obj;
    }

    public p() {
        this.f1868a = 0;
        this.f1870c = new SparseBooleanArray();
    }

    public p(ArrayList arrayList, boolean z10) {
        this.f1868a = 5;
        if (arrayList.isEmpty()) {
            this.f1870c = Collections.EMPTY_LIST;
        } else {
            this.f1870c = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.f1869b = z10;
    }

    public p(p0.e eVar, boolean z10) {
        this(eVar, 4);
        this.f1868a = 4;
        this.f1869b = z10;
    }

    public p(a6.d dVar, pb.c cVar) {
        this.f1868a = 8;
        this.f1869b = false;
        this.f1870c = cVar;
    }

    public p(StringBuilder sb2) {
        this.f1868a = 9;
        this.f1870c = sb2;
        this.f1869b = true;
    }
}

package b2;

import a8.yb;
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
public final class u implements s4.e0, androidx.lifecycle.a0, z9.i {
    public final int f3462a;
    public boolean f3463b;
    public Object f3464c;

    public u(int i10) {
        this.f3462a = i10;
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
    public void A(int i10, int i11) {
        this.f3463b = true;
        ((s4.h0) this.f3464c).p(i10, i11);
    }

    @Override
    public void N0(int i10, int i11) {
        this.f3463b = true;
        ((s4.h0) this.f3464c).t(i10, i11);
    }

    @Override
    public void Q(Object obj) {
        this.f3463b = true;
        a4.l lVar = (a4.l) this.f3464c;
        lVar.getClass();
        Void r32 = (Void) obj;
        SignInHubActivity signInHubActivity = (SignInHubActivity) lVar.f279b;
        signInHubActivity.setResult(signInHubActivity.R, signInHubActivity.S);
        signInHubActivity.finish();
    }

    @Override
    public void a(z9.h hVar, int i10) {
        StringBuilder sb2 = (StringBuilder) this.f3464c;
        if (this.f3463b) {
            this.f3463b = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i10);
    }

    public void b(int i10) {
        yb.p(!this.f3463b);
        ((SparseBooleanArray) this.f3464c).append(i10, true);
    }

    public void c(v vVar) {
        for (int i10 = 0; i10 < vVar.f3510a.size(); i10++) {
            b(vVar.a(i10));
        }
    }

    public v d() {
        yb.p(!this.f3463b);
        this.f3463b = true;
        return new v((SparseBooleanArray) this.f3464c);
    }

    public void e() {
        synchronized (this) {
            try {
                if (this.f3463b) {
                    return;
                }
                this.f3463b = true;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f3464c;
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
        return this.f3463b;
    }

    @Override
    public void g1(int i10, int i11) {
        ((s4.h0) this.f3464c).r(i10, i11, null);
    }

    public boolean h(int i10, CharSequence charSequence) {
        if (charSequence != null && i10 >= 0 && charSequence.length() - i10 >= 0) {
            p0.e eVar = (p0.e) this.f3464c;
            if (eVar == null) {
                return f();
            }
            eVar.getClass();
            boolean z10 = true;
            for (int i11 = 0; i11 < i10 && z10; i11++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i11));
                u uVar = p0.f.f46477a;
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

    public void i(x3 x3Var) {
        if (this.f3463b) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((m5.s) this.f3464c).a(new j5.a(null, x3Var, j5.d.f15513a, null), new m4.x0(11));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "logging failed.");
        }
    }

    @Override
    public void i0(int i10, int i11) {
        this.f3463b = true;
        ((s4.h0) this.f3464c).s(i10, i11);
    }

    public String toString() {
        switch (this.f3462a) {
            case 5:
                StringBuilder sb2 = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = (List) this.f3464c;
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
                return ((a4.l) this.f3464c).toString();
        }
    }

    public u(Object obj, int i10) {
        this.f3462a = i10;
        this.f3464c = obj;
    }

    public u() {
        this.f3462a = 0;
        this.f3464c = new SparseBooleanArray();
    }

    public u(ArrayList arrayList, boolean z10) {
        this.f3462a = 5;
        if (arrayList.isEmpty()) {
            this.f3464c = Collections.EMPTY_LIST;
        } else {
            this.f3464c = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.f3463b = z10;
    }

    public u(p0.e eVar, boolean z10) {
        this(eVar, 4);
        this.f3462a = 4;
        this.f3463b = z10;
    }

    public u(b6.d dVar, a4.l lVar) {
        this.f3462a = 7;
        this.f3463b = false;
        this.f3464c = lVar;
    }

    public u(StringBuilder sb2) {
        this.f3462a = 8;
        this.f3464c = sb2;
        this.f3463b = true;
    }
}

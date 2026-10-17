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
import v7.u6;
public final class t implements s4.d0, androidx.lifecycle.a0, y9.i {
    public final int f4007a;
    public boolean f4008b;
    public Object f4009c;

    public t(int i10) {
        this.f4007a = i10;
    }

    public static t g(Bundle bundle) {
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
        return new t(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    @Override
    public void X(int i10, int i11) {
        this.f4008b = true;
        ((s4.g0) this.f4009c).s(i10, i11);
    }

    @Override
    public void Z(Object obj) {
        this.f4008b = true;
        a6.m mVar = (a6.m) this.f4009c;
        mVar.getClass();
        Void r32 = (Void) obj;
        SignInHubActivity signInHubActivity = (SignInHubActivity) mVar.f310b;
        signInHubActivity.setResult(signInHubActivity.R, signInHubActivity.S);
        signInHubActivity.finish();
    }

    @Override
    public void a(y9.h hVar, int i10) {
        StringBuilder sb2 = (StringBuilder) this.f4009c;
        if (this.f4008b) {
            this.f4008b = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i10);
    }

    @Override
    public void a1(int i10, int i11) {
        ((s4.g0) this.f4009c).r(i10, i11, null);
    }

    public void b(int i10) {
        u6.p(!this.f4008b);
        ((SparseBooleanArray) this.f4009c).append(i10, true);
    }

    public void c(u uVar) {
        for (int i10 = 0; i10 < uVar.f4055a.size(); i10++) {
            b(uVar.a(i10));
        }
    }

    public u d() {
        u6.p(!this.f4008b);
        this.f4008b = true;
        return new u((SparseBooleanArray) this.f4009c);
    }

    public void e() {
        synchronized (this) {
            try {
                if (this.f4008b) {
                    return;
                }
                this.f4008b = true;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f4009c;
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
        return this.f4008b;
    }

    public boolean h(int i10, CharSequence charSequence) {
        if (charSequence != null && i10 >= 0 && charSequence.length() - i10 >= 0) {
            p0.e eVar = (p0.e) this.f4009c;
            if (eVar == null) {
                return f();
            }
            eVar.getClass();
            boolean z10 = true;
            for (int i11 = 0; i11 < i10 && z10; i11++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i11));
                t tVar = p0.f.f43934a;
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
        if (this.f4008b) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((l5.s) this.f4009c).a(new i5.a(null, x3Var, i5.d.f12712a, null), new k2.f0(4));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.u.h("BillingLogger", "logging failed.");
        }
    }

    @Override
    public void t0(int i10, int i11) {
        this.f4008b = true;
        ((s4.g0) this.f4009c).t(i10, i11);
    }

    public String toString() {
        switch (this.f4007a) {
            case 5:
                StringBuilder sb2 = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = (List) this.f4009c;
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
                return ((a6.m) this.f4009c).toString();
        }
    }

    @Override
    public void y(int i10, int i11) {
        this.f4008b = true;
        ((s4.g0) this.f4009c).p(i10, i11);
    }

    public t(Object obj, int i10) {
        this.f4007a = i10;
        this.f4009c = obj;
    }

    public t() {
        this.f4007a = 0;
        this.f4009c = new SparseBooleanArray();
    }

    public t(ArrayList arrayList, boolean z10) {
        this.f4007a = 5;
        if (arrayList.isEmpty()) {
            this.f4009c = Collections.EMPTY_LIST;
        } else {
            this.f4009c = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        }
        this.f4008b = z10;
    }

    public t(p0.e eVar, boolean z10) {
        this(eVar, 4);
        this.f4007a = 4;
        this.f4008b = z10;
    }

    public t(a6.d dVar, a6.m mVar) {
        this.f4007a = 7;
        this.f4008b = false;
        this.f4009c = mVar;
    }

    public t(StringBuilder sb2) {
        this.f4007a = 8;
        this.f4009c = sb2;
        this.f4008b = true;
    }
}

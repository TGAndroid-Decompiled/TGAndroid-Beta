package b1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import java.util.concurrent.Executor;
import td.l;
import w0.i;
public final class f implements l {
    public final int f3660a;
    public final Object f3661b;
    public final Object f3662c;

    public f(int i10, Object obj, Object obj2) {
        this.f3660a = i10;
        this.f3661b = obj;
        this.f3662c = obj2;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f3660a) {
            case 0:
                i e = (i) obj;
                kotlin.jvm.internal.i.e(e, "e");
                ((Executor) this.f3661b).execute(new h((v0.i) this.f3662c, e, 1));
                return id.i.f12775a;
            case 1:
                CancellationSignal cancellationSignal = (CancellationSignal) this.f3661b;
                c1.e eVar = (c1.e) this.f3662c;
                Context context = eVar.e;
                x5.f fVar = (x5.f) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a(cancellationSignal)) {
                    Intent intent = new Intent(context, HiddenActivity.class);
                    d.a(eVar.f4485i, intent, "BEGIN_SIGN_IN");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", fVar.f49304a);
                    try {
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.h.a(cancellationSignal)) {
                            eVar.f().execute(new androidx.fragment.app.d(eVar, 3));
                        }
                    }
                }
                return id.i.f12775a;
            default:
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f3661b;
                d1.e eVar2 = (d1.e) this.f3662c;
                Context context2 = eVar2.e;
                PendingIntent result = (PendingIntent) obj;
                kotlin.jvm.internal.i.e(result, "result");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, HiddenActivity.class);
                    d.a(eVar2.f7730i, intent2, "CREATE_PUBLIC_KEY_CREDENTIAL");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", result);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.h.a(cancellationSignal2)) {
                            Executor executor = eVar2.f7729g;
                            if (executor != null) {
                                executor.execute(new d1.d(eVar2, 0));
                            } else {
                                kotlin.jvm.internal.i.h("executor");
                                throw null;
                            }
                        }
                    }
                }
                return id.i.f12775a;
        }
    }
}

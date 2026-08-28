package b1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import java.util.concurrent.Executor;
import w0.i;
import zc.l;
public final class f implements l {
    public final int f1398a;
    public final Object f1399b;
    public final Object f1400c;

    public f(int i9, Object obj, Object obj2) {
        this.f1398a = i9;
        this.f1399b = obj;
        this.f1400c = obj2;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f1398a) {
            case 0:
                i e10 = (i) obj;
                kotlin.jvm.internal.i.e(e10, "e");
                ((Executor) this.f1399b).execute(new h((v0.i) this.f1400c, e10, 1));
                return oc.i.f19197a;
            case 1:
                CancellationSignal cancellationSignal = (CancellationSignal) this.f1399b;
                c1.e eVar = (c1.e) this.f1400c;
                Context context = eVar.f2086e;
                h5.f fVar = (h5.f) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal)) {
                    Intent intent = new Intent(context, HiddenActivity.class);
                    d.a(eVar.f2089i, intent, "BEGIN_SIGN_IN");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", fVar.f9849a);
                    try {
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal)) {
                            eVar.f().execute(new af.e(eVar, 15));
                        }
                    }
                }
                return oc.i.f19197a;
            default:
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f1399b;
                d1.e eVar2 = (d1.e) this.f1400c;
                Context context2 = eVar2.f4249e;
                PendingIntent result = (PendingIntent) obj;
                kotlin.jvm.internal.i.e(result, "result");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, HiddenActivity.class);
                    d.a(eVar2.f4252i, intent2, "CREATE_PUBLIC_KEY_CREDENTIAL");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", result);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal2)) {
                            Executor executor = eVar2.f4251g;
                            if (executor != null) {
                                executor.execute(new d1.d(eVar2, 0));
                            } else {
                                kotlin.jvm.internal.i.h("executor");
                                throw null;
                            }
                        }
                    }
                }
                return oc.i.f19197a;
        }
    }
}

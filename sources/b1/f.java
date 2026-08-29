package b1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import bd.l;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import w0.i;
public final class f implements l {
    public final int f1888a;
    public final Object f1889b;
    public final Object f1890c;

    public f(int i10, Object obj, Object obj2) {
        this.f1888a = i10;
        this.f1889b = obj;
        this.f1890c = obj2;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f1888a) {
            case 0:
                i e10 = (i) obj;
                j.e(e10, "e");
                ((Executor) this.f1889b).execute(new h((v0.i) this.f1890c, e10, 1));
                return qc.i.f46603a;
            case 1:
                CancellationSignal cancellationSignal = (CancellationSignal) this.f1889b;
                c1.e eVar = (c1.e) this.f1890c;
                Context context = eVar.f2755e;
                j5.f fVar = (j5.f) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal)) {
                    Intent intent = new Intent(context, HiddenActivity.class);
                    d.a(eVar.f2758i, intent, "BEGIN_SIGN_IN");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", fVar.f10886a);
                    try {
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal)) {
                            eVar.f().execute(new a4.g(eVar, 21));
                        }
                    }
                }
                return qc.i.f46603a;
            default:
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f1889b;
                d1.e eVar2 = (d1.e) this.f1890c;
                Context context2 = eVar2.f5258e;
                PendingIntent result = (PendingIntent) obj;
                j.e(result, "result");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, HiddenActivity.class);
                    d.a(eVar2.f5261i, intent2, "CREATE_PUBLIC_KEY_CREDENTIAL");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", result);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal2)) {
                            Executor executor = eVar2.f5260g;
                            if (executor != null) {
                                executor.execute(new d1.d(eVar2, 0));
                            } else {
                                j.h("executor");
                                throw null;
                            }
                        }
                    }
                }
                return qc.i.f46603a;
        }
    }
}

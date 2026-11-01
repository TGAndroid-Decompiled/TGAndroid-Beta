package b1;

import ad.j;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import java.util.concurrent.Executor;
import ld.l;
import w0.i;
public final class f implements l {
    public final int f1951a;
    public final Object f1952b;
    public final Object f1953c;

    public f(int i10, Object obj, Object obj2) {
        this.f1951a = i10;
        this.f1952b = obj;
        this.f1953c = obj2;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f1951a) {
            case 0:
                i e = (i) obj;
                kotlin.jvm.internal.i.e(e, "e");
                ((Executor) this.f1952b).execute(new h((v0.h) this.f1953c, e, 1));
                return j.f401a;
            case 1:
                CancellationSignal cancellationSignal = (CancellationSignal) this.f1952b;
                c1.d dVar = (c1.d) this.f1953c;
                Context context = dVar.e;
                x5.f fVar = (x5.f) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a(cancellationSignal)) {
                    Intent intent = new Intent(context, HiddenActivity.class);
                    d.a(dVar.f3522i, intent, "BEGIN_SIGN_IN");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", fVar.f53096a);
                    try {
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.h.a(cancellationSignal)) {
                            dVar.f().execute(new a3.d(dVar, 24));
                        }
                    }
                }
                return j.f401a;
            default:
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f1952b;
                d1.f fVar2 = (d1.f) this.f1953c;
                Context context2 = fVar2.e;
                PendingIntent result = (PendingIntent) obj;
                kotlin.jvm.internal.i.e(result, "result");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, HiddenActivity.class);
                    d.a(fVar2.f5643i, intent2, "CREATE_PUBLIC_KEY_CREDENTIAL");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", result);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.h.a(cancellationSignal2)) {
                            Executor executor = fVar2.f5642g;
                            if (executor != null) {
                                executor.execute(new d1.d(fVar2, 0));
                            } else {
                                kotlin.jvm.internal.i.h("executor");
                                throw null;
                            }
                        }
                    }
                }
                return j.f401a;
        }
    }
}

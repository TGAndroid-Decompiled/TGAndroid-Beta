package b1;

import ad.l;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import v0.i;

public final class f implements l {

    public final int f1894a;

    public final Object f1895b;

    public final Object f1896c;

    public f(int i10, Object obj, Object obj2) {
        this.f1894a = i10;
        this.f1895b = obj;
        this.f1896c = obj2;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f1894a) {
            case 0:
                Executor executor = (Executor) this.f1895b;
                i iVar = (i) this.f1896c;
                w0.i e9 = (w0.i) obj;
                j.e(e9, "e");
                executor.execute(new h(iVar, e9, 1));
                return pc.i.f45696a;
            case 1:
                CancellationSignal cancellationSignal = (CancellationSignal) this.f1895b;
                c1.e eVar = (c1.e) this.f1896c;
                Context context = eVar.f2225e;
                h5.f fVar = (h5.f) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal)) {
                    Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
                    d.a(eVar.f2228i, intent, "BEGIN_SIGN_IN");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", fVar.f8279a);
                    try {
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal)) {
                            eVar.f().execute(new af.e(eVar, 15));
                        }
                    }
                    break;
                }
                return pc.i.f45696a;
            default:
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f1895b;
                d1.e eVar2 = (d1.e) this.f1896c;
                Context context2 = eVar2.f4691e;
                PendingIntent result = (PendingIntent) obj;
                j.e(result, "result");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, (Class<?>) HiddenActivity.class);
                    d.a(eVar2.f4694i, intent2, "CREATE_PUBLIC_KEY_CREDENTIAL");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", result);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal2)) {
                            Executor executor2 = eVar2.f4693g;
                            if (executor2 == null) {
                                j.h("executor");
                                throw null;
                            }
                            executor2.execute(new d1.d(eVar2, 0));
                        }
                    }
                    break;
                }
                return pc.i.f45696a;
        }
    }
}

package b1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import dd.l;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import w0.i;
public final class f implements l {
    public final int f1290a;
    public final Object f1291b;
    public final Object f1292c;

    public f(int i10, Object obj, Object obj2) {
        this.f1290a = i10;
        this.f1291b = obj;
        this.f1292c = obj2;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f1290a) {
            case 0:
                i e = (i) obj;
                j.e(e, "e");
                ((Executor) this.f1291b).execute(new h((v0.i) this.f1292c, e, 1));
                return sc.i.f44318a;
            case 1:
                CancellationSignal cancellationSignal = (CancellationSignal) this.f1291b;
                c1.f fVar = (c1.f) this.f1292c;
                Context context = fVar.e;
                l5.f fVar2 = (l5.f) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal)) {
                    Intent intent = new Intent(context, HiddenActivity.class);
                    d.a(fVar.f1897i, intent, "BEGIN_SIGN_IN");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", fVar2.f11460a);
                    try {
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal)) {
                            fVar.f().execute(new ag.d(fVar, 8));
                        }
                    }
                }
                return sc.i.f44318a;
            default:
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f1291b;
                d1.e eVar = (d1.e) this.f1292c;
                Context context2 = eVar.e;
                PendingIntent result = (PendingIntent) obj;
                j.e(result, "result");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, HiddenActivity.class);
                    d.a(eVar.f4078i, intent2, "CREATE_PUBLIC_KEY_CREDENTIAL");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", result);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal2)) {
                            Executor executor = eVar.f4077g;
                            if (executor != null) {
                                executor.execute(new d1.d(eVar, 0));
                            } else {
                                j.h("executor");
                                throw null;
                            }
                        }
                    }
                }
                return sc.i.f44318a;
        }
    }
}

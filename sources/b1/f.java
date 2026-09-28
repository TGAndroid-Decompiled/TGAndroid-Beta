package b1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import androidx.fragment.app.a0;
import java.util.concurrent.Executor;
import rd.l;
import w0.i;
public final class f implements l {
    public final int f2889a;
    public final Object f2890b;
    public final Object f2891c;

    public f(int i10, Object obj, Object obj2) {
        this.f2889a = i10;
        this.f2890b = obj;
        this.f2891c = obj2;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f2889a) {
            case 0:
                i e = (i) obj;
                kotlin.jvm.internal.i.e(e, "e");
                ((Executor) this.f2890b).execute(new h((v0.i) this.f2891c, e, 1));
                return gd.i.f9602a;
            case 1:
                CancellationSignal cancellationSignal = (CancellationSignal) this.f2890b;
                c1.e eVar = (c1.e) this.f2891c;
                Context context = eVar.e;
                x5.f fVar = (x5.f) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal)) {
                    Intent intent = new Intent(context, HiddenActivity.class);
                    d.a(eVar.f3647i, intent, "BEGIN_SIGN_IN");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", fVar.f45619a);
                    try {
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal)) {
                            eVar.f().execute(new a0(eVar, 4));
                        }
                    }
                }
                return gd.i.f9602a;
            default:
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f2890b;
                d1.e eVar2 = (d1.e) this.f2891c;
                Context context2 = eVar2.e;
                PendingIntent result = (PendingIntent) obj;
                kotlin.jvm.internal.i.e(result, "result");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, HiddenActivity.class);
                    d.a(eVar2.f7394i, intent2, "CREATE_PUBLIC_KEY_CREDENTIAL");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", result);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal2)) {
                            Executor executor = eVar2.f7393g;
                            if (executor != null) {
                                executor.execute(new d1.d(eVar2, 0));
                            } else {
                                kotlin.jvm.internal.i.h("executor");
                                throw null;
                            }
                        }
                    }
                }
                return gd.i.f9602a;
        }
    }
}

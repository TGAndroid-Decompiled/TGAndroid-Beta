package b1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import androidx.fragment.app.a0;
import java.util.concurrent.Executor;
import sd.l;
import w0.i;
public final class f implements l {
    public final int f3199a;
    public final Object f3200b;
    public final Object f3201c;

    public f(int i10, Object obj, Object obj2) {
        this.f3199a = i10;
        this.f3200b = obj;
        this.f3201c = obj2;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f3199a) {
            case 0:
                i e7 = (i) obj;
                kotlin.jvm.internal.i.e(e7, "e");
                ((Executor) this.f3200b).execute(new h((v0.i) this.f3201c, e7, 1));
                return hd.i.f11091a;
            case 1:
                CancellationSignal cancellationSignal = (CancellationSignal) this.f3200b;
                c1.e eVar = (c1.e) this.f3201c;
                Context context = eVar.f3989e;
                x5.f fVar = (x5.f) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a(cancellationSignal)) {
                    Intent intent = new Intent(context, HiddenActivity.class);
                    d.a(eVar.f3992i, intent, "BEGIN_SIGN_IN");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", fVar.f50800a);
                    try {
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.h.a(cancellationSignal)) {
                            eVar.f().execute(new a0(eVar, 4));
                        }
                    }
                }
                return hd.i.f11091a;
            default:
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f3200b;
                d1.e eVar2 = (d1.e) this.f3201c;
                Context context2 = eVar2.f8043e;
                PendingIntent result = (PendingIntent) obj;
                kotlin.jvm.internal.i.e(result, "result");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, HiddenActivity.class);
                    d.a(eVar2.f8046i, intent2, "CREATE_PUBLIC_KEY_CREDENTIAL");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", result);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.h.a(cancellationSignal2)) {
                            Executor executor = eVar2.f8045g;
                            if (executor != null) {
                                executor.execute(new d1.d(eVar2, 0));
                            } else {
                                kotlin.jvm.internal.i.h("executor");
                                throw null;
                            }
                        }
                    }
                }
                return hd.i.f11091a;
        }
    }
}

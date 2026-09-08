package b1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import bi.oa;
import java.util.concurrent.Executor;
import rd.l;
import w0.i;
public final class f implements l {
    public final int f1953a;
    public final Object f1954b;
    public final Object f1955c;

    public f(int i10, Object obj, Object obj2) {
        this.f1953a = i10;
        this.f1954b = obj;
        this.f1955c = obj2;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f1953a) {
            case 0:
                i e7 = (i) obj;
                kotlin.jvm.internal.i.e(e7, "e");
                ((Executor) this.f1954b).execute(new h((v0.i) this.f1955c, e7, 1));
                return gd.i.f10616a;
            case 1:
                CancellationSignal cancellationSignal = (CancellationSignal) this.f1954b;
                c1.e eVar = (c1.e) this.f1955c;
                Context context = eVar.f4161e;
                x5.f fVar = (x5.f) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal)) {
                    Intent intent = new Intent(context, HiddenActivity.class);
                    d.a(eVar.f4164i, intent, "BEGIN_SIGN_IN");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", fVar.f48934a);
                    try {
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal)) {
                            eVar.f().execute(new oa(eVar, 5));
                        }
                    }
                }
                return gd.i.f10616a;
            default:
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f1954b;
                d1.e eVar2 = (d1.e) this.f1955c;
                Context context2 = eVar2.f6492e;
                PendingIntent result = (PendingIntent) obj;
                kotlin.jvm.internal.i.e(result, "result");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, HiddenActivity.class);
                    d.a(eVar2.f6495i, intent2, "CREATE_PUBLIC_KEY_CREDENTIAL");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", result);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal2)) {
                            Executor executor = eVar2.f6494g;
                            if (executor != null) {
                                executor.execute(new d1.d(eVar2, 0));
                            } else {
                                kotlin.jvm.internal.i.h("executor");
                                throw null;
                            }
                        }
                    }
                }
                return gd.i.f10616a;
        }
    }
}

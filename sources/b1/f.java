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
    public final int f1926a;
    public final Object f1927b;
    public final Object f1928c;

    public f(int i10, Object obj, Object obj2) {
        this.f1926a = i10;
        this.f1927b = obj;
        this.f1928c = obj2;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f1926a) {
            case 0:
                i e7 = (i) obj;
                kotlin.jvm.internal.i.e(e7, "e");
                ((Executor) this.f1927b).execute(new h((v0.i) this.f1928c, e7, 1));
                return gd.i.f10588a;
            case 1:
                CancellationSignal cancellationSignal = (CancellationSignal) this.f1927b;
                c1.e eVar = (c1.e) this.f1928c;
                Context context = eVar.f4134e;
                x5.f fVar = (x5.f) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal)) {
                    Intent intent = new Intent(context, HiddenActivity.class);
                    d.a(eVar.f4137i, intent, "BEGIN_SIGN_IN");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", fVar.f48905a);
                    try {
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal)) {
                            eVar.f().execute(new oa(eVar, 5));
                        }
                    }
                }
                return gd.i.f10588a;
            default:
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f1927b;
                d1.e eVar2 = (d1.e) this.f1928c;
                Context context2 = eVar2.f6465e;
                PendingIntent result = (PendingIntent) obj;
                kotlin.jvm.internal.i.e(result, "result");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, HiddenActivity.class);
                    d.a(eVar2.f6468i, intent2, "CREATE_PUBLIC_KEY_CREDENTIAL");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", result);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal2)) {
                            Executor executor = eVar2.f6467g;
                            if (executor != null) {
                                executor.execute(new d1.d(eVar2, 0));
                            } else {
                                kotlin.jvm.internal.i.h("executor");
                                throw null;
                            }
                        }
                    }
                }
                return gd.i.f10588a;
        }
    }
}

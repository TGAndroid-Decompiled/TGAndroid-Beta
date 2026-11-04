package b1;

import ai.s;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import dd.k;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import od.l;
import v0.h;
import w0.i;
public final class e implements l {
    public final int f2332a;
    public final Object f2333b;
    public final Object f2334c;

    public e(int i3, Object obj, Object obj2) {
        this.f2332a = i3;
        this.f2333b = obj;
        this.f2334c = obj2;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f2332a) {
            case 0:
                i e10 = (i) obj;
                j.e(e10, "e");
                ((Executor) this.f2333b).execute(new g((h) this.f2334c, e10, 1));
                break;
            case 1:
                CancellationSignal cancellationSignal = (CancellationSignal) this.f2333b;
                c1.e eVar = (c1.e) this.f2334c;
                Context context = eVar.f3966e;
                z5.f fVar = (z5.f) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a(cancellationSignal)) {
                    Intent intent = new Intent(context, HiddenActivity.class);
                    d.a(eVar.f3969i, intent, "BEGIN_SIGN_IN");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", fVar.f59782a);
                    try {
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.h.a(cancellationSignal)) {
                            eVar.f().execute(new s(eVar, 18));
                        }
                    }
                }
                return k.f8801a;
            case 2:
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f2333b;
                d1.e eVar2 = (d1.e) this.f2334c;
                Context context2 = eVar2.f7995e;
                PendingIntent result = (PendingIntent) obj;
                j.e(result, "result");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.h.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, HiddenActivity.class);
                    d.a(eVar2.f7998i, intent2, "CREATE_PUBLIC_KEY_CREDENTIAL");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", result);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.h.a(cancellationSignal2)) {
                            Executor executor = eVar2.f7997g;
                            if (executor != null) {
                                executor.execute(new d1.d(eVar2, 0));
                            } else {
                                j.h("executor");
                                throw null;
                            }
                        }
                    }
                }
                return k.f8801a;
            default:
                Throwable th2 = (Throwable) obj;
                ((xd.c) this.f2333b).f58618c.removeCallbacks((u9.k) this.f2334c);
                break;
        }
        return k.f8801a;
    }
}

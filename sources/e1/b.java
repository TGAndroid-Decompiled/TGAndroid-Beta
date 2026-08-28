package e1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import g7.w7;
import java.util.concurrent.Executor;
import q6.e;
import q6.g;
import v0.f;
import v0.i;
import zc.l;
public final class b implements l {
    public final int f4791a;
    public final CancellationSignal f4792b;
    public final Executor f4793c;
    public final i d;
    public final b1.d f4794e;

    public b(CancellationSignal cancellationSignal, b1.d dVar, Executor executor, i iVar, int i9) {
        this.f4791a = i9;
        this.f4792b = cancellationSignal;
        this.f4794e = dVar;
        this.f4793c = executor;
        this.d = iVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f4791a) {
            case 0:
                d dVar = (d) this.f4794e;
                Context context = dVar.f4798e;
                e eVar = (e) obj;
                PendingIntent pendingIntent = eVar.f46075a;
                g gVar = eVar.f46076b;
                CancellationSignal cancellationSignal = this.f4792b;
                Executor executor = this.f4793c;
                i iVar = this.d;
                if (pendingIntent == null && gVar == null) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!a1.g.a(cancellationSignal)) {
                        executor.execute(new a1.b(iVar, 9));
                    }
                } else {
                    if (pendingIntent != null) {
                        Intent intent = new Intent(context, HiddenActivity.class);
                        b1.d.a(dVar.f4801i, intent, "CREATE_PUBLIC_KEY_CREDENTIAL");
                        intent.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingIntent);
                        try {
                            context.startActivity(intent);
                        } catch (Exception unused) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.g.a(cancellationSignal)) {
                                Executor executor2 = dVar.f4800g;
                                if (executor2 != null) {
                                    executor2.execute(new a(dVar, 0));
                                } else {
                                    kotlin.jvm.internal.i.h("executor");
                                    throw null;
                                }
                            }
                        }
                    }
                    if (gVar != null) {
                        v0.c a2 = w7.a(gVar.f46082a, gVar.f46083b);
                        if (a2 instanceof f) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.g.a(cancellationSignal)) {
                                executor.execute(new a1.e(28, iVar, (f) a2));
                            }
                        }
                    }
                    if (pendingIntent == null) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal)) {
                            executor.execute(new a1.b(iVar, 8));
                        }
                    }
                }
                return oc.i.f19197a;
            default:
                f1.b bVar = (f1.b) this.f4794e;
                Context context2 = bVar.f5302e;
                q6.l lVar = (q6.l) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                CancellationSignal cancellationSignal2 = this.f4792b;
                if (!a1.g.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, HiddenActivity.class);
                    b1.d.a(bVar.f5305i, intent2, "BEGIN_SIGN_IN");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", lVar.f46092a);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal2)) {
                            this.f4793c.execute(new a1.b(this.d, 10));
                        }
                    }
                }
                return oc.i.f19197a;
        }
    }
}

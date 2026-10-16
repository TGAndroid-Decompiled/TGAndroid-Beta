package e1;

import a1.h;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import di.y6;
import g7.e;
import g7.g;
import java.util.concurrent.Executor;
import td.l;
import v0.f;
import v0.i;
import w7.z7;
public final class b implements l {
    public final int f8300a;
    public final CancellationSignal f8301b;
    public final Executor f8302c;
    public final i d;
    public final b1.d e;

    public b(CancellationSignal cancellationSignal, b1.d dVar, Executor executor, i iVar, int i10) {
        this.f8300a = i10;
        this.f8301b = cancellationSignal;
        this.e = dVar;
        this.f8302c = executor;
        this.d = iVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f8300a) {
            case 0:
                d dVar = (d) this.e;
                Context context = dVar.e;
                e eVar = (e) obj;
                PendingIntent pendingIntent = eVar.f9999a;
                g gVar = eVar.f10000b;
                CancellationSignal cancellationSignal = this.f8301b;
                Executor executor = this.f8302c;
                i iVar = this.d;
                if (pendingIntent == null && gVar == null) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!h.a(cancellationSignal)) {
                        executor.execute(new a1.e(iVar, 9));
                    }
                } else {
                    if (pendingIntent != null) {
                        Intent intent = new Intent(context, HiddenActivity.class);
                        b1.d.a(dVar.f8308i, intent, "CREATE_PUBLIC_KEY_CREDENTIAL");
                        intent.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingIntent);
                        try {
                            context.startActivity(intent);
                        } catch (Exception unused) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!h.a(cancellationSignal)) {
                                Executor executor2 = dVar.f8307g;
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
                        v0.c a2 = z7.a(gVar.f10005a, gVar.f10006b);
                        if (a2 instanceof f) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!h.a(cancellationSignal)) {
                                executor.execute(new y6(17, iVar, (f) a2));
                            }
                        }
                    }
                    if (pendingIntent == null) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!h.a(cancellationSignal)) {
                            executor.execute(new a1.e(iVar, 8));
                        }
                    }
                }
                return id.i.f11390a;
            default:
                f1.b bVar = (f1.b) this.e;
                Context context2 = bVar.e;
                g7.l lVar = (g7.l) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                CancellationSignal cancellationSignal2 = this.f8301b;
                if (!h.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, HiddenActivity.class);
                    b1.d.a(bVar.f8836i, intent2, "BEGIN_SIGN_IN");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", lVar.f10014a);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!h.a(cancellationSignal2)) {
                            this.f8302c.execute(new a1.e(this.d, 10));
                        }
                    }
                }
                return id.i.f11390a;
        }
    }
}

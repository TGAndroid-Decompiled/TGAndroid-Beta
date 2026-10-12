package e1;

import a1.h;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import di.x6;
import g7.e;
import g7.g;
import java.util.concurrent.Executor;
import td.l;
import v0.f;
import v0.i;
import w7.z7;
public final class b implements l {
    public final int f8297a;
    public final CancellationSignal f8298b;
    public final Executor f8299c;
    public final i d;
    public final b1.d e;

    public b(CancellationSignal cancellationSignal, b1.d dVar, Executor executor, i iVar, int i10) {
        this.f8297a = i10;
        this.f8298b = cancellationSignal;
        this.e = dVar;
        this.f8299c = executor;
        this.d = iVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f8297a) {
            case 0:
                d dVar = (d) this.e;
                Context context = dVar.e;
                e eVar = (e) obj;
                PendingIntent pendingIntent = eVar.f9996a;
                g gVar = eVar.f9997b;
                CancellationSignal cancellationSignal = this.f8298b;
                Executor executor = this.f8299c;
                i iVar = this.d;
                if (pendingIntent == null && gVar == null) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!h.a(cancellationSignal)) {
                        executor.execute(new a1.e(iVar, 9));
                    }
                } else {
                    if (pendingIntent != null) {
                        Intent intent = new Intent(context, HiddenActivity.class);
                        b1.d.a(dVar.f8305i, intent, "CREATE_PUBLIC_KEY_CREDENTIAL");
                        intent.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingIntent);
                        try {
                            context.startActivity(intent);
                        } catch (Exception unused) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!h.a(cancellationSignal)) {
                                Executor executor2 = dVar.f8304g;
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
                        v0.c a2 = z7.a(gVar.f10002a, gVar.f10003b);
                        if (a2 instanceof f) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!h.a(cancellationSignal)) {
                                executor.execute(new x6(17, iVar, (f) a2));
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
                return id.i.f11386a;
            default:
                f1.b bVar = (f1.b) this.e;
                Context context2 = bVar.e;
                g7.l lVar = (g7.l) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                CancellationSignal cancellationSignal2 = this.f8298b;
                if (!h.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, HiddenActivity.class);
                    b1.d.a(bVar.f8833i, intent2, "BEGIN_SIGN_IN");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", lVar.f10011a);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!h.a(cancellationSignal2)) {
                            this.f8299c.execute(new a1.e(this.d, 10));
                        }
                    }
                }
                return id.i.f11386a;
        }
    }
}

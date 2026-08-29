package e1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import bd.l;
import i7.f8;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import s6.e;
import s6.g;
import s6.m;
import v0.f;
import v0.i;
public final class b implements l {
    public final int f5761a;
    public final CancellationSignal f5762b;
    public final Executor f5763c;
    public final i d;
    public final b1.d f5764e;

    public b(CancellationSignal cancellationSignal, b1.d dVar, Executor executor, i iVar, int i10) {
        this.f5761a = i10;
        this.f5762b = cancellationSignal;
        this.f5764e = dVar;
        this.f5763c = executor;
        this.d = iVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f5761a) {
            case 0:
                d dVar = (d) this.f5764e;
                Context context = dVar.f5768e;
                e eVar = (e) obj;
                PendingIntent pendingIntent = eVar.f47646a;
                g gVar = eVar.f47647b;
                CancellationSignal cancellationSignal = this.f5762b;
                Executor executor = this.f5763c;
                i iVar = this.d;
                if (pendingIntent == null && gVar == null) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!a1.g.a(cancellationSignal)) {
                        executor.execute(new a1.b(iVar, 9));
                    }
                } else {
                    if (pendingIntent != null) {
                        Intent intent = new Intent(context, HiddenActivity.class);
                        b1.d.a(dVar.f5771i, intent, "CREATE_PUBLIC_KEY_CREDENTIAL");
                        intent.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingIntent);
                        try {
                            context.startActivity(intent);
                        } catch (Exception unused) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.g.a(cancellationSignal)) {
                                Executor executor2 = dVar.f5770g;
                                if (executor2 != null) {
                                    executor2.execute(new a(dVar, 0));
                                } else {
                                    j.h("executor");
                                    throw null;
                                }
                            }
                        }
                    }
                    if (gVar != null) {
                        v0.c a2 = f8.a(gVar.f47653a, gVar.f47654b);
                        if (a2 instanceof f) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.g.a(cancellationSignal)) {
                                executor.execute(new a1.e(26, iVar, (f) a2));
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
                return qc.i.f46603a;
            default:
                f1.b bVar = (f1.b) this.f5764e;
                Context context2 = bVar.f6264e;
                m mVar = (m) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                CancellationSignal cancellationSignal2 = this.f5762b;
                if (!a1.g.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, HiddenActivity.class);
                    b1.d.a(bVar.f6267i, intent2, "BEGIN_SIGN_IN");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", mVar.f47664a);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal2)) {
                            this.f5763c.execute(new a1.b(this.d, 10));
                        }
                    }
                }
                return qc.i.f46603a;
        }
    }
}

package e1;

import ad.j;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import g7.e;
import g7.g;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import ld.l;
import v0.f;
import v0.h;
import w7.f8;
public final class b implements l {
    public final int f6091a;
    public final CancellationSignal f6092b;
    public final Executor f6093c;
    public final h d;
    public final b1.d e;

    public b(CancellationSignal cancellationSignal, b1.d dVar, Executor executor, h hVar, int i10) {
        this.f6091a = i10;
        this.f6092b = cancellationSignal;
        this.e = dVar;
        this.f6093c = executor;
        this.d = hVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f6091a) {
            case 0:
                d dVar = (d) this.e;
                Context context = dVar.e;
                e eVar = (e) obj;
                PendingIntent pendingIntent = eVar.f7430a;
                g gVar = eVar.f7431b;
                CancellationSignal cancellationSignal = this.f6092b;
                Executor executor = this.f6093c;
                h hVar = this.d;
                if (pendingIntent == null && gVar == null) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!a1.h.a(cancellationSignal)) {
                        executor.execute(new a1.e(hVar, 9));
                    }
                } else {
                    if (pendingIntent != null) {
                        Intent intent = new Intent(context, HiddenActivity.class);
                        b1.d.a(dVar.f6099i, intent, "CREATE_PUBLIC_KEY_CREDENTIAL");
                        intent.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingIntent);
                        try {
                            context.startActivity(intent);
                        } catch (Exception unused) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.h.a(cancellationSignal)) {
                                Executor executor2 = dVar.f6098g;
                                if (executor2 != null) {
                                    executor2.execute(new a(dVar, 0));
                                } else {
                                    i.h("executor");
                                    throw null;
                                }
                            }
                        }
                    }
                    if (gVar != null) {
                        v0.c a2 = f8.a(gVar.f7436a, gVar.f7437b);
                        if (a2 instanceof f) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.h.a(cancellationSignal)) {
                                executor.execute(new d1.e(5, hVar, (f) a2));
                            }
                        }
                    }
                    if (pendingIntent == null) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.h.a(cancellationSignal)) {
                            executor.execute(new a1.e(hVar, 8));
                        }
                    }
                }
                return j.f401a;
            default:
                f1.b bVar = (f1.b) this.e;
                Context context2 = bVar.e;
                g7.l lVar = (g7.l) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                CancellationSignal cancellationSignal2 = this.f6092b;
                if (!a1.h.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, HiddenActivity.class);
                    b1.d.a(bVar.f6727i, intent2, "BEGIN_SIGN_IN");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", lVar.f7445a);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.h.a(cancellationSignal2)) {
                            this.f6093c.execute(new a1.e(this.d, 10));
                        }
                    }
                }
                return j.f401a;
        }
    }
}

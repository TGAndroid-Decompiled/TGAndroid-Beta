package e1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import ci.x8;
import g7.e;
import g7.g;
import java.util.concurrent.Executor;
import rd.l;
import v0.f;
import v0.i;
import w7.w7;
public final class b implements l {
    public final int f8510a;
    public final CancellationSignal f8511b;
    public final Executor f8512c;
    public final i d;
    public final b1.d f8513e;

    public b(CancellationSignal cancellationSignal, b1.d dVar, Executor executor, i iVar, int i10) {
        this.f8510a = i10;
        this.f8511b = cancellationSignal;
        this.f8513e = dVar;
        this.f8512c = executor;
        this.d = iVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f8510a) {
            case 0:
                d dVar = (d) this.f8513e;
                Context context = dVar.f8517e;
                e eVar = (e) obj;
                PendingIntent pendingIntent = eVar.f10316a;
                g gVar = eVar.f10317b;
                CancellationSignal cancellationSignal = this.f8511b;
                Executor executor = this.f8512c;
                i iVar = this.d;
                if (pendingIntent == null && gVar == null) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!a1.g.a(cancellationSignal)) {
                        executor.execute(new a1.b(iVar, 9));
                    }
                } else {
                    if (pendingIntent != null) {
                        Intent intent = new Intent(context, HiddenActivity.class);
                        b1.d.a(dVar.f8520i, intent, "CREATE_PUBLIC_KEY_CREDENTIAL");
                        intent.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingIntent);
                        try {
                            context.startActivity(intent);
                        } catch (Exception unused) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.g.a(cancellationSignal)) {
                                Executor executor2 = dVar.f8519g;
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
                        v0.c a2 = w7.a(gVar.f10323a, gVar.f10324b);
                        if (a2 instanceof f) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.g.a(cancellationSignal)) {
                                executor.execute(new x8(9, iVar, (f) a2));
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
                return gd.i.f10453a;
            default:
                f1.a aVar = (f1.a) this.f8513e;
                Context context2 = aVar.f9544e;
                g7.l lVar = (g7.l) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                CancellationSignal cancellationSignal2 = this.f8511b;
                if (!a1.g.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, HiddenActivity.class);
                    b1.d.a(aVar.f9547i, intent2, "BEGIN_SIGN_IN");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", lVar.f10333a);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal2)) {
                            this.f8512c.execute(new a1.b(this.d, 10));
                        }
                    }
                }
                return gd.i.f10453a;
        }
    }
}

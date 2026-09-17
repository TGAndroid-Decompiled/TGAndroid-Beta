package e1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import di.b7;
import g7.e;
import g7.g;
import java.util.concurrent.Executor;
import rd.l;
import v0.f;
import v0.i;
import w7.u7;
public final class b implements l {
    public final int f8709a;
    public final CancellationSignal f8710b;
    public final Executor f8711c;
    public final i d;
    public final b1.d f8712e;

    public b(CancellationSignal cancellationSignal, b1.d dVar, Executor executor, i iVar, int i10) {
        this.f8709a = i10;
        this.f8710b = cancellationSignal;
        this.f8712e = dVar;
        this.f8711c = executor;
        this.d = iVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f8709a) {
            case 0:
                d dVar = (d) this.f8712e;
                Context context = dVar.f8716e;
                e eVar = (e) obj;
                PendingIntent pendingIntent = eVar.f10452a;
                g gVar = eVar.f10453b;
                CancellationSignal cancellationSignal = this.f8710b;
                Executor executor = this.f8711c;
                i iVar = this.d;
                if (pendingIntent == null && gVar == null) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!a1.g.a(cancellationSignal)) {
                        executor.execute(new a1.b(iVar, 9));
                    }
                } else {
                    if (pendingIntent != null) {
                        Intent intent = new Intent(context, HiddenActivity.class);
                        b1.d.a(dVar.f8719i, intent, "CREATE_PUBLIC_KEY_CREDENTIAL");
                        intent.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingIntent);
                        try {
                            context.startActivity(intent);
                        } catch (Exception unused) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.g.a(cancellationSignal)) {
                                Executor executor2 = dVar.f8718g;
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
                        v0.c a2 = u7.a(gVar.f10459a, gVar.f10460b);
                        if (a2 instanceof f) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.g.a(cancellationSignal)) {
                                executor.execute(new b7(15, iVar, (f) a2));
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
                return gd.i.f10588a;
            default:
                f1.a aVar = (f1.a) this.f8712e;
                Context context2 = aVar.f9166e;
                g7.l lVar = (g7.l) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                CancellationSignal cancellationSignal2 = this.f8710b;
                if (!a1.g.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, HiddenActivity.class);
                    b1.d.a(aVar.f9169i, intent2, "BEGIN_SIGN_IN");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", lVar.f10469a);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal2)) {
                            this.f8711c.execute(new a1.b(this.d, 10));
                        }
                    }
                }
                return gd.i.f10588a;
        }
    }
}

package e1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import ci.y8;
import g7.e;
import g7.g;
import java.util.concurrent.Executor;
import rd.l;
import v0.f;
import v0.i;
import w7.v7;
public final class b implements l {
    public final int f7845a;
    public final CancellationSignal f7846b;
    public final Executor f7847c;
    public final i d;
    public final b1.d e;

    public b(CancellationSignal cancellationSignal, b1.d dVar, Executor executor, i iVar, int i10) {
        this.f7845a = i10;
        this.f7846b = cancellationSignal;
        this.e = dVar;
        this.f7847c = executor;
        this.d = iVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f7845a) {
            case 0:
                d dVar = (d) this.e;
                Context context = dVar.e;
                e eVar = (e) obj;
                PendingIntent pendingIntent = eVar.f9474a;
                g gVar = eVar.f9475b;
                CancellationSignal cancellationSignal = this.f7846b;
                Executor executor = this.f7847c;
                i iVar = this.d;
                if (pendingIntent == null && gVar == null) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!a1.g.a(cancellationSignal)) {
                        executor.execute(new a1.b(iVar, 9));
                    }
                } else {
                    if (pendingIntent != null) {
                        Intent intent = new Intent(context, HiddenActivity.class);
                        b1.d.a(dVar.f7853i, intent, "CREATE_PUBLIC_KEY_CREDENTIAL");
                        intent.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingIntent);
                        try {
                            context.startActivity(intent);
                        } catch (Exception unused) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.g.a(cancellationSignal)) {
                                Executor executor2 = dVar.f7852g;
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
                        v0.c a2 = v7.a(gVar.f9480a, gVar.f9481b);
                        if (a2 instanceof f) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.g.a(cancellationSignal)) {
                                executor.execute(new y8(9, iVar, (f) a2));
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
                return gd.i.f9602a;
            default:
                f1.a aVar = (f1.a) this.e;
                Context context2 = aVar.e;
                g7.l lVar = (g7.l) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                CancellationSignal cancellationSignal2 = this.f7846b;
                if (!a1.g.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, HiddenActivity.class);
                    b1.d.a(aVar.f8778i, intent2, "BEGIN_SIGN_IN");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", lVar.f9489a);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal2)) {
                            this.f7847c.execute(new a1.b(this.d, 10));
                        }
                    }
                }
                return gd.i.f9602a;
        }
    }
}

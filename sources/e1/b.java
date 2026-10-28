package e1;

import a1.h;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import di.b4;
import h7.g;
import java.util.concurrent.Executor;
import ud.l;
import v0.f;
import v0.i;
import w7.t;
public final class b implements l {
    public final int f9609a;
    public final CancellationSignal f9610b;
    public final Executor f9611c;
    public final i d;
    public final b1.d e;

    public b(CancellationSignal cancellationSignal, b1.d dVar, Executor executor, i iVar, int i10) {
        this.f9609a = i10;
        this.f9610b = cancellationSignal;
        this.e = dVar;
        this.f9611c = executor;
        this.d = iVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f9609a) {
            case 0:
                e eVar = (e) this.e;
                Context context = eVar.e;
                h7.e eVar2 = (h7.e) obj;
                PendingIntent pendingIntent = eVar2.f12682a;
                g gVar = eVar2.f12683b;
                CancellationSignal cancellationSignal = this.f9610b;
                Executor executor = this.f9611c;
                i iVar = this.d;
                if (pendingIntent == null && gVar == null) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!h.a(cancellationSignal)) {
                        executor.execute(new a1.e(iVar, 9));
                    }
                } else {
                    if (pendingIntent != null) {
                        Intent intent = new Intent(context, HiddenActivity.class);
                        b1.d.a(eVar.f9619i, intent, "CREATE_PUBLIC_KEY_CREDENTIAL");
                        intent.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingIntent);
                        try {
                            context.startActivity(intent);
                        } catch (Exception unused) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!h.a(cancellationSignal)) {
                                Executor executor2 = eVar.f9618g;
                                if (executor2 != null) {
                                    executor2.execute(new a(eVar, 0));
                                } else {
                                    kotlin.jvm.internal.i.h("executor");
                                    throw null;
                                }
                            }
                        }
                    }
                    if (gVar != null) {
                        v0.c a2 = t.a(gVar.f12688a, gVar.f12689b);
                        if (a2 instanceof f) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!h.a(cancellationSignal)) {
                                executor.execute(new b4(23, iVar, (f) a2));
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
                return jd.i.f15579a;
            default:
                f1.a aVar = (f1.a) this.e;
                Context context2 = aVar.e;
                h7.l lVar = (h7.l) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                CancellationSignal cancellationSignal2 = this.f9610b;
                if (!h.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, HiddenActivity.class);
                    b1.d.a(aVar.f10053i, intent2, "BEGIN_SIGN_IN");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", lVar.f12697a);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!h.a(cancellationSignal2)) {
                            this.f9611c.execute(new a1.e(this.d, 10));
                        }
                    }
                }
                return jd.i.f15579a;
        }
    }
}

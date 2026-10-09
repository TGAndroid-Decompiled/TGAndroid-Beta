package e1;

import a1.h;
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
import sd.l;
import v0.f;
import v0.i;
import w7.v7;
public final class b implements l {
    public final int f8503a;
    public final CancellationSignal f8504b;
    public final Executor f8505c;
    public final i d;
    public final b1.d f8506e;

    public b(CancellationSignal cancellationSignal, b1.d dVar, Executor executor, i iVar, int i10) {
        this.f8503a = i10;
        this.f8504b = cancellationSignal;
        this.f8506e = dVar;
        this.f8505c = executor;
        this.d = iVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f8503a) {
            case 0:
                d dVar = (d) this.f8506e;
                Context context = dVar.f8510e;
                e eVar = (e) obj;
                PendingIntent pendingIntent = eVar.f10389a;
                g gVar = eVar.f10390b;
                CancellationSignal cancellationSignal = this.f8504b;
                Executor executor = this.f8505c;
                i iVar = this.d;
                if (pendingIntent == null && gVar == null) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!h.a(cancellationSignal)) {
                        executor.execute(new a1.e(iVar, 9));
                    }
                } else {
                    if (pendingIntent != null) {
                        Intent intent = new Intent(context, HiddenActivity.class);
                        b1.d.a(dVar.f8513i, intent, "CREATE_PUBLIC_KEY_CREDENTIAL");
                        intent.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingIntent);
                        try {
                            context.startActivity(intent);
                        } catch (Exception unused) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!h.a(cancellationSignal)) {
                                Executor executor2 = dVar.f8512g;
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
                        v0.c a2 = v7.a(gVar.f10396a, gVar.f10397b);
                        if (a2 instanceof f) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!h.a(cancellationSignal)) {
                                executor.execute(new y8(9, iVar, (f) a2));
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
                return hd.i.f11092a;
            default:
                f1.a aVar = (f1.a) this.f8506e;
                Context context2 = aVar.f9554e;
                g7.l lVar = (g7.l) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                CancellationSignal cancellationSignal2 = this.f8504b;
                if (!h.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, HiddenActivity.class);
                    b1.d.a(aVar.f9557i, intent2, "BEGIN_SIGN_IN");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", lVar.f10406a);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!h.a(cancellationSignal2)) {
                            this.f8505c.execute(new a1.e(this.d, 10));
                        }
                    }
                }
                return hd.i.f11092a;
        }
    }
}

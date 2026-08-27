package e1;

import ad.l;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import d5.u;
import h7.t7;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import r6.e;
import r6.g;
import r6.m;
import v0.f;
import v0.i;

public final class b implements l {

    public final int f5148a;

    public final CancellationSignal f5149b;

    public final Executor f5150c;
    public final i d;

    public final b1.d f5151e;

    public b(CancellationSignal cancellationSignal, b1.d dVar, Executor executor, i iVar, int i10) {
        this.f5148a = i10;
        this.f5149b = cancellationSignal;
        this.f5151e = dVar;
        this.f5150c = executor;
        this.d = iVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f5148a) {
            case 0:
                d dVar = (d) this.f5151e;
                Context context = dVar.f5155e;
                e eVar = (e) obj;
                PendingIntent pendingIntent = eVar.f46834a;
                g gVar = eVar.f46835b;
                CancellationSignal cancellationSignal = this.f5149b;
                Executor executor = this.f5150c;
                i iVar = this.d;
                if (pendingIntent != null || gVar != null) {
                    if (pendingIntent != null) {
                        Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
                        b1.d.a(dVar.f5158i, intent, "CREATE_PUBLIC_KEY_CREDENTIAL");
                        intent.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingIntent);
                        try {
                            context.startActivity(intent);
                        } catch (Exception unused) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.g.a(cancellationSignal)) {
                                Executor executor2 = dVar.f5157g;
                                if (executor2 == null) {
                                    j.h("executor");
                                    throw null;
                                }
                                executor2.execute(new a(dVar, 0));
                            }
                        }
                    }
                    if (gVar != null) {
                        v0.c cVarA = t7.a(gVar.f46841a, gVar.f46842b);
                        if (cVarA instanceof f) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.g.a(cancellationSignal)) {
                                executor.execute(new u(3, iVar, (f) cVarA));
                            }
                        } else if (pendingIntent == null) {
                            CredentialProviderPlayServicesImpl.Companion.getClass();
                            if (!a1.g.a(cancellationSignal)) {
                                executor.execute(new a1.b(iVar, 8));
                            }
                        }
                    } else if (pendingIntent == null) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal)) {
                            executor.execute(new a1.b(iVar, 8));
                        }
                    }
                    break;
                } else {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!a1.g.a(cancellationSignal)) {
                        executor.execute(new a1.b(iVar, 9));
                    }
                }
                return pc.i.f45696a;
            default:
                f1.b bVar = (f1.b) this.f5151e;
                Context context2 = bVar.f5607e;
                m mVar = (m) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                CancellationSignal cancellationSignal2 = this.f5149b;
                if (!a1.g.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, (Class<?>) HiddenActivity.class);
                    b1.d.a(bVar.f5610i, intent2, "BEGIN_SIGN_IN");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", mVar.f46852a);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal2)) {
                            this.f5150c.execute(new a1.b(this.d, 10));
                        }
                    }
                    break;
                }
                return pc.i.f45696a;
        }
    }
}

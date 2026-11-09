package ae;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import androidx.credentials.playservices.controllers.identitycredentials.IdentityCredentialApiHiddenActivity;
import b1.g;
import bi.ab;
import gd.k;
import j7.m;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import m9.u;
import rd.l;
import w0.i;
public final class d implements l {
    public final int f1048a;
    public final Object f1049b;
    public final Object f1050c;

    public d(int i7, Object obj, Object obj2) {
        this.f1048a = i7;
        this.f1049b = obj;
        this.f1050c = obj2;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f1048a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                ((e) this.f1049b).f1051c.removeCallbacks((u) this.f1050c);
                break;
            case 1:
                i e10 = (i) obj;
                j.e(e10, "e");
                ((Executor) this.f1049b).execute(new g((v0.g) this.f1050c, e10, 1));
                break;
            case 2:
                CancellationSignal cancellationSignal = (CancellationSignal) this.f1049b;
                c1.e eVar = (c1.e) this.f1050c;
                Context context = eVar.f5252e;
                a6.f fVar = (a6.f) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal)) {
                    Intent intent = new Intent(context, HiddenActivity.class);
                    b1.d.a(eVar.f5255i, intent, "BEGIN_SIGN_IN");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", fVar.f291a);
                    try {
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal)) {
                            eVar.g().execute(new ab(eVar, 5));
                        }
                    }
                }
                return k.f13829a;
            case 3:
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f1049b;
                d1.e eVar2 = (d1.e) this.f1050c;
                Context context2 = eVar2.f7938e;
                PendingIntent result = (PendingIntent) obj;
                j.e(result, "result");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, HiddenActivity.class);
                    b1.d.a(eVar2.f7941i, intent2, "CREATE_PUBLIC_KEY_CREDENTIAL");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", result);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal2)) {
                            Executor executor = eVar2.f7940g;
                            if (executor != null) {
                                executor.execute(new d1.d(eVar2, 0));
                            } else {
                                j.h("executor");
                                throw null;
                            }
                        }
                    }
                }
                return k.f13829a;
            default:
                g1.a aVar = (g1.a) this.f1050c;
                Context context3 = aVar.f13410e;
                m mVar = (m) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a((CancellationSignal) this.f1049b)) {
                    Intent intent3 = new Intent(context3, IdentityCredentialApiHiddenActivity.class);
                    intent3.setFlags(65536);
                    intent3.putExtra("RESULT_RECEIVER", b1.d.d(aVar.f13413i));
                    intent3.putExtra("EXTRA_FLOW_PENDING_INTENT", mVar.f16578a);
                    intent3.putExtra("EXTRA_ERROR_NAME", "GET_UNKNOWN");
                    context3.startActivity(intent3);
                }
                return k.f13829a;
        }
        return k.f13829a;
    }
}

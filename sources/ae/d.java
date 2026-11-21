package ae;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import androidx.credentials.playservices.controllers.identitycredentials.IdentityCredentialApiHiddenActivity;
import b1.g;
import gd.k;
import j7.m;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import m9.u;
import rd.l;
import w0.i;
public final class d implements l {
    public final int f1045a;
    public final Object f1046b;
    public final Object f1047c;

    public d(int i7, Object obj, Object obj2) {
        this.f1045a = i7;
        this.f1046b = obj;
        this.f1047c = obj2;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f1045a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                ((e) this.f1046b).f1048c.removeCallbacks((u) this.f1047c);
                break;
            case 1:
                i e10 = (i) obj;
                j.e(e10, "e");
                ((Executor) this.f1046b).execute(new g((v0.g) this.f1047c, e10, 1));
                break;
            case 2:
                CancellationSignal cancellationSignal = (CancellationSignal) this.f1046b;
                c1.f fVar = (c1.f) this.f1047c;
                Context context = fVar.f4386e;
                a6.f fVar2 = (a6.f) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal)) {
                    Intent intent = new Intent(context, HiddenActivity.class);
                    b1.d.a(fVar.f4389i, intent, "BEGIN_SIGN_IN");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", fVar2.f291a);
                    try {
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal)) {
                            fVar.g().execute(new a3.f(fVar, 29));
                        }
                    }
                }
                return k.f13514a;
            case 3:
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f1046b;
                d1.e eVar = (d1.e) this.f1047c;
                Context context2 = eVar.f7639e;
                PendingIntent result = (PendingIntent) obj;
                j.e(result, "result");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, HiddenActivity.class);
                    b1.d.a(eVar.f7642i, intent2, "CREATE_PUBLIC_KEY_CREDENTIAL");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", result);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!a1.g.a(cancellationSignal2)) {
                            Executor executor = eVar.f7641g;
                            if (executor != null) {
                                executor.execute(new d1.d(eVar, 0));
                            } else {
                                j.h("executor");
                                throw null;
                            }
                        }
                    }
                }
                return k.f13514a;
            default:
                g1.a aVar = (g1.a) this.f1047c;
                Context context3 = aVar.f13105e;
                m mVar = (m) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a((CancellationSignal) this.f1046b)) {
                    Intent intent3 = new Intent(context3, IdentityCredentialApiHiddenActivity.class);
                    intent3.setFlags(65536);
                    intent3.putExtra("RESULT_RECEIVER", b1.d.d(aVar.f13108i));
                    intent3.putExtra("EXTRA_FLOW_PENDING_INTENT", mVar.f17338a);
                    intent3.putExtra("EXTRA_ERROR_NAME", "GET_UNKNOWN");
                    context3.startActivity(intent3);
                }
                return k.f13514a;
        }
        return k.f13514a;
    }
}

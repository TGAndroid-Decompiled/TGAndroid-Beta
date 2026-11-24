package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import androidx.credentials.playservices.controllers.identitycredentials.IdentityCredentialApiHiddenActivity;
import java.util.concurrent.Executor;
public final class f33 implements rr4 {
    public final byte a;
    public final Object b;
    public final Object c;

    public f33(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final Object invoke(Object obj) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                CancellationSignal cancellationSignal = (CancellationSignal) obj3;
                h33 h33Var = (h33) obj2;
                Context context = h33Var.e;
                ii0 ii0Var = (ii0) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!w33.a(cancellationSignal)) {
                    Intent intent = new Intent(context, HiddenActivity.class);
                    j33.a(h33Var.i, intent, "BEGIN_SIGN_IN");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", ii0Var.a);
                    try {
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!w33.a(cancellationSignal)) {
                            h33Var.f().execute(new xf2(h33Var, (byte) 19));
                        }
                    }
                }
                return g7cVar;
            case 1:
                CancellationSignal cancellationSignal2 = (CancellationSignal) obj3;
                o33 o33Var = (o33) obj2;
                Context context2 = o33Var.e;
                PendingIntent pendingIntent = (PendingIntent) obj;
                pendingIntent.getClass();
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!w33.a(cancellationSignal2)) {
                    Intent intent2 = new Intent(context2, HiddenActivity.class);
                    j33.a(o33Var.i, intent2, "CREATE_PUBLIC_KEY_CREDENTIAL");
                    intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingIntent);
                    try {
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!w33.a(cancellationSignal2)) {
                            Executor executor = o33Var.g;
                            if (executor != null) {
                                executor.execute(new m33(o33Var, (byte) 0));
                            } else {
                                rr5.e("executor");
                                throw null;
                            }
                        }
                    }
                }
                return g7cVar;
            case 2:
                t33 t33Var = (t33) obj2;
                Context context3 = t33Var.e;
                b58 b58Var = (b58) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!w33.a((CancellationSignal) obj3)) {
                    Intent intent3 = new Intent(context3, IdentityCredentialApiHiddenActivity.class);
                    intent3.setFlags(65536);
                    intent3.putExtra("RESULT_RECEIVER", j33.c(t33Var.i));
                    intent3.putExtra("EXTRA_FLOW_PENDING_INTENT", b58Var.a);
                    intent3.putExtra("EXTRA_ERROR_NAME", "GET_UNKNOWN");
                    context3.startActivity(intent3);
                }
                return g7cVar;
            default:
                Throwable th = (Throwable) obj;
                ((ie5) obj3).c.removeCallbacks((tnd) obj2);
                return g7cVar;
        }
    }
}

package org.telegram.messenger;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public class PasskeysController {

    public class AnonymousClass1 implements v0.i {
        final Context val$context;
        final int val$currentAccount;
        final Utilities.Callback3 val$done;

        public AnonymousClass1(Utilities.Callback3 callback3, Context context, int i9) {
            this.val$done = callback3;
            this.val$context = context;
            this.val$currentAccount = i9;
        }

        public static void lambda$onResult$0(org.telegram.ui.ActionBar.c2 c2Var, Utilities.Callback3 callback3, long j10, TLRPC.auth_Authorization auth_authorization, TLRPC.TL_error tL_error) {
            c2Var.dismiss();
            if (tL_error != null) {
                callback3.run(Long.valueOf(j10), null, tL_error.text);
            } else {
                callback3.run(Long.valueOf(j10), auth_authorization, null);
            }
        }

        public static void lambda$onResult$1(int i9, int i10, Utilities.Callback3 callback3, long j10, DialogInterface dialogInterface) {
            ConnectionsManager.getInstance(i9).cancelRequest(i10, true);
            callback3.run(Long.valueOf(j10), null, "CANCELLED");
        }

        @Override
        public void onError(w0.i iVar) {
            if (iVar instanceof w0.k) {
                this.val$done.run(0L, null, "EMPTY");
            } else if (iVar instanceof w0.g) {
                this.val$done.run(0L, null, "CANCELLED");
            } else if (iVar instanceof w0.j) {
                this.val$done.run(0L, null, "CANCELLED");
            } else if (iVar != null) {
                this.val$done.run(0L, null, iVar.getMessage());
            }
        }

        @Override
        public void onResult(v0.p pVar) {
            a8.a aVar = pVar.f48241a;
            TL_account.finishPasskeyLogin finishpasskeylogin = new TL_account.finishPasskeyLogin();
            finishpasskeylogin.credential = new TL_account.inputPasskeyCredentialPublicKey();
            try {
                JSONObject jSONObject = new JSONObject(((Bundle) aVar.f108a).getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON"));
                finishpasskeylogin.credential.f22589id = jSONObject.getString("id");
                finishpasskeylogin.credential.raw_id = jSONObject.getString("rawId");
                JSONObject jSONObject2 = jSONObject.getJSONObject("response");
                TL_account.inputPasskeyResponseLogin inputpasskeyresponselogin = new TL_account.inputPasskeyResponseLogin();
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                inputpasskeyresponselogin.client_data = tL_dataJSON;
                tL_dataJSON.data = new String(Base64.decode(jSONObject2.getString("clientDataJSON"), 8));
                inputpasskeyresponselogin.authenticator_data = Base64.decode(jSONObject2.getString("authenticatorData"), 8);
                inputpasskeyresponselogin.signature = Base64.decode(jSONObject2.getString("signature"), 8);
                String str = new String(Base64.decode(jSONObject2.getString("userHandle"), 8));
                inputpasskeyresponselogin.user_handle = str;
                int parseInt = Integer.parseInt(str.split(":")[0]);
                final long parseLong = Long.parseLong(inputpasskeyresponselogin.user_handle.split(":")[1]);
                finishpasskeylogin.credential.response = inputpasskeyresponselogin;
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(this.val$context, 3, null);
                c2Var.q(500L);
                if (parseInt != ConnectionsManager.getInstance(this.val$currentAccount).getCurrentDatacenterId()) {
                    int currentDatacenterId = ConnectionsManager.getInstance(this.val$currentAccount).getCurrentDatacenterId();
                    long currentAuthKeyId = ConnectionsManager.getInstance(this.val$currentAccount).getCurrentAuthKeyId();
                    ConnectionsManager.getInstance(this.val$currentAccount).setDefaultDatacenterId(parseInt);
                    finishpasskeylogin.flags = 1 | finishpasskeylogin.flags;
                    finishpasskeylogin.from_dc_id = currentDatacenterId;
                    finishpasskeylogin.from_auth_key_id = currentAuthKeyId;
                }
                final int sendRequestTyped = ConnectionsManager.getInstance(this.val$currentAccount).sendRequestTyped(finishpasskeylogin, new Object(), new hh(c2Var, this.val$done, parseLong, 0), parseInt, 72);
                final int i9 = this.val$currentAccount;
                final Utilities.Callback3 callback3 = this.val$done;
                c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public final void onCancel(DialogInterface dialogInterface) {
                        PasskeysController.AnonymousClass1.lambda$onResult$1(i9, sendRequestTyped, callback3, parseLong, dialogInterface);
                    }
                });
            } catch (Exception e10) {
                FileLog.e(e10);
                this.val$done.run(0L, null, e10.getMessage());
            }
        }
    }

    public static String bytesToHex(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        int length = bArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            sb2.append(String.format("%02x", Byte.valueOf(bArr[i9])));
        }
        return sb2.toString();
    }

    public static void create(Context context, int i9, Utilities.Callback2<TL_account.Passkey, String> callback2) {
        if (!BuildVars.SUPPORTS_PASSKEYS) {
            return;
        }
        kotlin.jvm.internal.i.e(context, "context");
        g6.b bVar = new g6.b(context, 1);
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, null);
        c2Var.q(500L);
        ConnectionsManager.getInstance(i9).sendRequestTyped(new TL_account.initPasskeyRegistration(), new Object(), new ch(c2Var, callback2, bVar, context, i9));
    }

    public static <T> qc.c ktxCallback(Utilities.Callback2<T, Throwable> callback2) {
        return ktxCallback(qc.i.f46140a, callback2);
    }

    public static void lambda$create$2(Utilities.Callback2 callback2, Throwable th) {
        callback2.run(null, th.getMessage());
    }

    public static void lambda$create$3(Utilities.Callback2 callback2, Exception exc) {
        callback2.run(null, exc.getMessage());
    }

    public static void lambda$create$4(org.telegram.ui.ActionBar.c2 c2Var, Utilities.Callback2 callback2, TL_account.Passkey passkey, TLRPC.TL_error tL_error) {
        c2Var.dismiss();
        if (tL_error != null) {
            callback2.run(null, tL_error.text);
        } else {
            callback2.run(passkey, null);
        }
    }

    public static void lambda$create$5(int i9, int i10, Utilities.Callback2 callback2, DialogInterface dialogInterface) {
        ConnectionsManager.getInstance(i9).cancelRequest(i10, true);
        callback2.run(null, "CANCELLED");
    }

    public static void lambda$create$6(Context context, final int i9, TL_account.registerPasskey registerpasskey, final Utilities.Callback2 callback2) {
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, null);
        c2Var.q(500L);
        final int sendRequestTyped = ConnectionsManager.getInstance(i9).sendRequestTyped(registerpasskey, new Object(), new d1(3, c2Var, callback2));
        c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                PasskeysController.lambda$create$5(i9, sendRequestTyped, callback2, dialogInterface);
            }
        });
    }

    public static void lambda$create$7(final Utilities.Callback2 callback2, Context context, int i9, v0.c cVar, Throwable th) {
        if (!(th instanceof w0.b) && !(th instanceof w0.e)) {
            if (th instanceof w0.f) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r1) {
                            case 0:
                                callback2.run(null, "CANCELLED");
                                return;
                            default:
                                callback2.run(null, "EMPTY");
                                return;
                        }
                    }
                });
                return;
            } else if (th != null) {
                FileLog.e(th);
                AndroidUtilities.runOnUIThread(new og(5, callback2, th));
                return;
            } else {
                TL_account.registerPasskey registerpasskey = new TL_account.registerPasskey();
                try {
                    JSONObject jSONObject = new JSONObject(cVar.f48233a.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON"));
                    TL_account.inputPasskeyCredentialPublicKey inputpasskeycredentialpublickey = new TL_account.inputPasskeyCredentialPublicKey();
                    registerpasskey.credential = inputpasskeycredentialpublickey;
                    inputpasskeycredentialpublickey.f22589id = jSONObject.getString("id");
                    registerpasskey.credential.raw_id = jSONObject.getString("rawId");
                    JSONObject jSONObject2 = jSONObject.getJSONObject("response");
                    TL_account.inputPasskeyResponseRegister inputpasskeyresponseregister = new TL_account.inputPasskeyResponseRegister();
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    inputpasskeyresponseregister.client_data = tL_dataJSON;
                    tL_dataJSON.data = new String(Base64.decode(jSONObject2.getString("clientDataJSON"), 8));
                    inputpasskeyresponseregister.attestation_object = Base64.decode(jSONObject2.getString("attestationObject"), 8);
                    FileLog.d("AAGUID: " + bytesToHex(Arrays.copyOfRange(inputpasskeyresponseregister.attestation_object, 67, 83)));
                    registerpasskey.credential.response = inputpasskeyresponseregister;
                    AndroidUtilities.runOnUIThread(new h0(context, i9, registerpasskey, callback2, 17));
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    AndroidUtilities.runOnUIThread(new fh(callback2, e10, 0));
                    return;
                }
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                switch (r1) {
                    case 0:
                        callback2.run(null, "CANCELLED");
                        return;
                    default:
                        callback2.run(null, "EMPTY");
                        return;
                }
            }
        });
    }

    public static void lambda$create$8(Utilities.Callback2 callback2, Exception exc) {
        callback2.run(null, exc.getMessage());
    }

    public static void lambda$create$9(org.telegram.ui.ActionBar.c2 c2Var, Utilities.Callback2 callback2, v0.h hVar, Context context, int i9, TL_account.passkeyRegistrationOptions passkeyregistrationoptions, TLRPC.TL_error tL_error) {
        c2Var.dismiss();
        if (tL_error != null) {
            callback2.run(null, tL_error.text);
            return;
        }
        try {
            try {
                ((g6.b) hVar).a(context, new v0.e(new JSONObject(passkeyregistrationoptions.options.data).getJSONObject("publicKey").toString()), ktxCallback(new gh(context, i9, callback2)));
            } catch (Exception e10) {
                FileLog.e(e10);
                AndroidUtilities.runOnUIThread(new fh(callback2, e10, 1));
            }
        } catch (Exception e11) {
            FileLog.e(e11);
            callback2.run(null, e11.getMessage());
        }
    }

    public static void lambda$login$10(boolean[] zArr, Utilities.Callback3 callback3, boolean z10, v0.h hVar, Context context, int i9, Runnable[] runnableArr, TL_account.passkeyLoginOptions passkeyloginoptions, TLRPC.TL_error tL_error) {
        if (zArr[0]) {
            return;
        }
        if (tL_error != null) {
            callback3.run(0L, null, tL_error.text);
            return;
        }
        try {
            v0.q qVar = new v0.q(new JSONObject(passkeyloginoptions.options.data).getJSONObject("publicKey").toString());
            ArrayList arrayList = new ArrayList();
            arrayList.add(qVar);
            v0.o oVar = new v0.o(pc.g.m(arrayList), !z10);
            try {
                CancellationSignal cancellationSignal = new CancellationSignal();
                Executor executor = context.getMainExecutor();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(callback3, context, i9);
                ((g6.b) hVar).getClass();
                kotlin.jvm.internal.i.e(executor, "executor");
                v0.j b10 = u5.h.b(new u5.h(context, 3), oVar);
                if (b10 == null) {
                    anonymousClass1.onError((Object) new w0.h("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
                } else {
                    b10.onGetCredential(context, oVar, cancellationSignal, executor, anonymousClass1);
                }
                runnableArr[0] = new ng(cancellationSignal, 3);
            } catch (Exception e10) {
                callback3.run(0L, null, e10.getMessage());
            }
        } catch (Exception e11) {
            FileLog.e(e11);
            callback3.run(0L, null, e11.getMessage());
        }
    }

    public static void lambda$login$11(int i9, int i10) {
        ConnectionsManager.getInstance(i9).cancelRequest(i10, true);
    }

    public static void lambda$login$12(boolean[] zArr, Runnable[] runnableArr) {
        zArr[0] = true;
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            runnable.run();
        }
    }

    public static Runnable login(final Context context, final int i9, final boolean z10, final Utilities.Callback3<Long, TLRPC.auth_Authorization, String> callback3) {
        if (!BuildVars.SUPPORTS_PASSKEYS) {
            return null;
        }
        kotlin.jvm.internal.i.e(context, "context");
        final g6.b bVar = new g6.b(context, 1);
        final boolean[] zArr = new boolean[1];
        TL_account.initPasskeyLogin initpasskeylogin = new TL_account.initPasskeyLogin();
        initpasskeylogin.api_id = BuildVars.APP_ID;
        initpasskeylogin.api_hash = BuildVars.APP_HASH;
        final Runnable[] runnableArr = {new dh(i9, ConnectionsManager.getInstance(i9).sendRequestTyped(initpasskeylogin, new Object(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                PasskeysController.lambda$login$10(zArr, callback3, z10, bVar, context, i9, runnableArr, (TL_account.passkeyLoginOptions) obj, (TLRPC.TL_error) obj2);
            }
        }, 8), 0)};
        return new lc(zArr, runnableArr, 1);
    }

    public static <T> qc.c ktxCallback(final qc.h hVar, final Utilities.Callback2<T, Throwable> callback2) {
        return new qc.c() {
            @Override
            public qc.h getContext() {
                return hVar;
            }

            @Override
            public void resumeWith(Object obj) {
                if (obj instanceof oc.e) {
                    callback2.run(null, ((oc.e) obj).f19191a);
                } else {
                    callback2.run(obj, null);
                }
            }
        };
    }
}

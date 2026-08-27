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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public class PasskeysController {

    public class AnonymousClass1 implements v0.i {
        final Context val$context;
        final int val$currentAccount;
        final Utilities.Callback3 val$done;

        public AnonymousClass1(Utilities.Callback3 callback3, Context context, int i10) {
            this.val$done = callback3;
            this.val$context = context;
            this.val$currentAccount = i10;
        }

        public static void lambda$onResult$0(org.telegram.ui.ActionBar.b2 b2Var, Utilities.Callback3 callback3, long j10, TLRPC.auth_Authorization auth_authorization, TLRPC.TL_error tL_error) {
            b2Var.dismiss();
            if (tL_error != null) {
                callback3.run(Long.valueOf(j10), null, tL_error.text);
            } else {
                callback3.run(Long.valueOf(j10), auth_authorization, null);
            }
        }

        public static void lambda$onResult$1(int i10, int i11, Utilities.Callback3 callback3, long j10, DialogInterface dialogInterface) {
            ConnectionsManager.getInstance(i10).cancelRequest(i11, true);
            callback3.run(Long.valueOf(j10), null, "CANCELLED");
        }

        @Override
        public void onError(w0.i iVar) {
            if (iVar instanceof w0.k) {
                this.val$done.run(0L, null, "EMPTY");
                return;
            }
            if (iVar instanceof w0.g) {
                this.val$done.run(0L, null, "CANCELLED");
            } else if (iVar instanceof w0.j) {
                this.val$done.run(0L, null, "CANCELLED");
            } else if (iVar != null) {
                this.val$done.run(0L, null, iVar.getMessage());
            }
        }

        @Override
        public void onResult(v0.p pVar) {
            b8.a aVar = pVar.f48668a;
            TL_account.finishPasskeyLogin finishpasskeylogin = new TL_account.finishPasskeyLogin();
            finishpasskeylogin.credential = new TL_account.inputPasskeyCredentialPublicKey();
            try {
                JSONObject jSONObject = new JSONObject(((Bundle) aVar.f2040a).getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON"));
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
                int i10 = Integer.parseInt(str.split(":")[0]);
                final long j10 = Long.parseLong(inputpasskeyresponselogin.user_handle.split(":")[1]);
                finishpasskeylogin.credential.response = inputpasskeyresponselogin;
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(this.val$context, 3, null);
                b2Var.q(500L);
                if (i10 != ConnectionsManager.getInstance(this.val$currentAccount).getCurrentDatacenterId()) {
                    int currentDatacenterId = ConnectionsManager.getInstance(this.val$currentAccount).getCurrentDatacenterId();
                    long currentAuthKeyId = ConnectionsManager.getInstance(this.val$currentAccount).getCurrentAuthKeyId();
                    ConnectionsManager.getInstance(this.val$currentAccount).setDefaultDatacenterId(i10);
                    finishpasskeylogin.flags = 1 | finishpasskeylogin.flags;
                    finishpasskeylogin.from_dc_id = currentDatacenterId;
                    finishpasskeylogin.from_auth_key_id = currentAuthKeyId;
                }
                final int iSendRequestTyped = ConnectionsManager.getInstance(this.val$currentAccount).sendRequestTyped(finishpasskeylogin, new a(), new lh(b2Var, this.val$done, j10, 0), i10, 72);
                final int i11 = this.val$currentAccount;
                final Utilities.Callback3 callback3 = this.val$done;
                b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public final void onCancel(DialogInterface dialogInterface) {
                        PasskeysController.AnonymousClass1.lambda$onResult$1(i11, iSendRequestTyped, callback3, j10, dialogInterface);
                    }
                });
            } catch (Exception e9) {
                FileLog.e(e9);
                this.val$done.run(0L, null, e9.getMessage());
            }
        }
    }

    public static String bytesToHex(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            sb2.append(String.format("%02x", Byte.valueOf(b10)));
        }
        return sb2.toString();
    }

    public static void create(Context context, int i10, Utilities.Callback2<TL_account.Passkey, String> callback2) {
        if (BuildVars.SUPPORTS_PASSKEYS) {
            kotlin.jvm.internal.j.e(context, "context");
            v0.j jVar = new v0.j(context);
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
            b2Var.q(500L);
            ConnectionsManager.getInstance(i10).sendRequestTyped(new TL_account.initPasskeyRegistration(), new a(), new gh(b2Var, callback2, jVar, context, i10));
        }
    }

    public static <T> rc.c ktxCallback(Utilities.Callback2<T, Throwable> callback2) {
        return ktxCallback(rc.i.f46899a, callback2);
    }

    public static void lambda$create$2(Utilities.Callback2 callback2, Throwable th) {
        callback2.run(null, th.getMessage());
    }

    public static void lambda$create$3(Utilities.Callback2 callback2, Exception exc) {
        callback2.run(null, exc.getMessage());
    }

    public static void lambda$create$4(org.telegram.ui.ActionBar.b2 b2Var, Utilities.Callback2 callback2, TL_account.Passkey passkey, TLRPC.TL_error tL_error) {
        b2Var.dismiss();
        if (tL_error != null) {
            callback2.run(null, tL_error.text);
        } else {
            callback2.run(passkey, null);
        }
    }

    public static void lambda$create$5(int i10, int i11, Utilities.Callback2 callback2, DialogInterface dialogInterface) {
        ConnectionsManager.getInstance(i10).cancelRequest(i11, true);
        callback2.run(null, "CANCELLED");
    }

    public static void lambda$create$6(Context context, final int i10, TL_account.registerPasskey registerpasskey, final Utilities.Callback2 callback2) {
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
        b2Var.q(500L);
        final int iSendRequestTyped = ConnectionsManager.getInstance(i10).sendRequestTyped(registerpasskey, new a(), new c1(3, b2Var, callback2));
        b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                PasskeysController.lambda$create$5(i10, iSendRequestTyped, callback2, dialogInterface);
            }
        });
    }

    public static void lambda$create$7(final Utilities.Callback2 callback2, Context context, int i10, v0.c cVar, Throwable th) {
        if ((th instanceof w0.b) || (th instanceof w0.e)) {
            final int i11 = 0;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    switch (i11) {
                        case 0:
                            callback2.run(null, "CANCELLED");
                            break;
                        default:
                            callback2.run(null, "EMPTY");
                            break;
                    }
                }
            });
            return;
        }
        if (th instanceof w0.f) {
            final int i12 = 1;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    switch (i12) {
                        case 0:
                            callback2.run(null, "CANCELLED");
                            break;
                        default:
                            callback2.run(null, "EMPTY");
                            break;
                    }
                }
            });
            return;
        }
        if (th != null) {
            FileLog.e(th);
            AndroidUtilities.runOnUIThread(new sg(5, callback2, th));
            return;
        }
        TL_account.registerPasskey registerpasskey = new TL_account.registerPasskey();
        try {
            JSONObject jSONObject = new JSONObject(cVar.f48660a.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON"));
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
            AndroidUtilities.runOnUIThread(new h0(context, i10, registerpasskey, callback2, 17));
        } catch (Exception e9) {
            FileLog.e(e9);
            AndroidUtilities.runOnUIThread(new jh(callback2, e9, 0));
        }
    }

    public static void lambda$create$8(Utilities.Callback2 callback2, Exception exc) {
        callback2.run(null, exc.getMessage());
    }

    public static void lambda$create$9(org.telegram.ui.ActionBar.b2 b2Var, Utilities.Callback2 callback2, v0.h hVar, Context context, int i10, TL_account.passkeyRegistrationOptions passkeyregistrationoptions, TLRPC.TL_error tL_error) {
        b2Var.dismiss();
        if (tL_error != null) {
            callback2.run(null, tL_error.text);
            return;
        }
        try {
            try {
                ((v0.j) hVar).b(context, new v0.e(new JSONObject(passkeyregistrationoptions.options.data).getJSONObject("publicKey").toString()), ktxCallback(new kh(context, i10, callback2)));
            } catch (Exception e9) {
                FileLog.e(e9);
                AndroidUtilities.runOnUIThread(new jh(callback2, e9, 1));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            callback2.run(null, e10.getMessage());
        }
    }

    public static void lambda$login$10(boolean[] zArr, Utilities.Callback3 callback3, boolean z10, v0.h hVar, Context context, int i10, Runnable[] runnableArr, TL_account.passkeyLoginOptions passkeyloginoptions, TLRPC.TL_error tL_error) {
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
            v0.o oVar = new v0.o(qc.g.m(arrayList), !z10);
            try {
                CancellationSignal cancellationSignal = new CancellationSignal();
                Executor executor = context.getMainExecutor();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(callback3, context, i10);
                ((v0.j) hVar).getClass();
                kotlin.jvm.internal.j.e(executor, "executor");
                v0.k kVarB = androidx.biometric.s.b(new androidx.biometric.s(context, 2), oVar);
                if (kVarB == null) {
                    anonymousClass1.onError((Object) new w0.h("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
                } else {
                    kVarB.onGetCredential(context, oVar, cancellationSignal, executor, anonymousClass1);
                }
                runnableArr[0] = new rg(cancellationSignal, 3);
            } catch (Exception e9) {
                callback3.run(0L, null, e9.getMessage());
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            callback3.run(0L, null, e10.getMessage());
        }
    }

    public static void lambda$login$11(int i10, int i11) {
        ConnectionsManager.getInstance(i10).cancelRequest(i11, true);
    }

    public static void lambda$login$12(boolean[] zArr, Runnable[] runnableArr) {
        zArr[0] = true;
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            runnable.run();
        }
    }

    public static Runnable login(final Context context, final int i10, final boolean z10, final Utilities.Callback3<Long, TLRPC.auth_Authorization, String> callback3) {
        if (!BuildVars.SUPPORTS_PASSKEYS) {
            return null;
        }
        kotlin.jvm.internal.j.e(context, "context");
        final v0.j jVar = new v0.j(context);
        final boolean[] zArr = new boolean[1];
        final Runnable[] runnableArr = new Runnable[1];
        TL_account.initPasskeyLogin initpasskeylogin = new TL_account.initPasskeyLogin();
        initpasskeylogin.api_id = BuildVars.APP_ID;
        initpasskeylogin.api_hash = BuildVars.APP_HASH;
        runnableArr[0] = new hh(i10, ConnectionsManager.getInstance(i10).sendRequestTyped(initpasskeylogin, new a(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                PasskeysController.lambda$login$10(zArr, callback3, z10, jVar, context, i10, runnableArr, (TL_account.passkeyLoginOptions) obj, (TLRPC.TL_error) obj2);
            }
        }, 8), 0);
        return new pc(zArr, runnableArr, 1);
    }

    public static <T> rc.c ktxCallback(final rc.h hVar, final Utilities.Callback2<T, Throwable> callback2) {
        return new rc.c() {
            @Override
            public rc.h getContext() {
                return hVar;
            }

            @Override
            public void resumeWith(Object obj) {
                if (obj instanceof pc.e) {
                    callback2.run(null, ((pc.e) obj).f45690a);
                } else {
                    callback2.run(obj, null);
                }
            }
        };
    }
}

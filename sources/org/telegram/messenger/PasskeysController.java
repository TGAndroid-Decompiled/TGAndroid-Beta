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

        public AnonymousClass1(Utilities.Callback3 callback3, Context context, int i10) {
            this.val$done = callback3;
            this.val$context = context;
            this.val$currentAccount = i10;
        }

        public static void lambda$onResult$0(org.telegram.ui.ActionBar.b2 b2Var, Utilities.Callback3 callback3, long j3, TLRPC.auth_Authorization auth_authorization, TLRPC.TL_error tL_error) {
            b2Var.dismiss();
            if (tL_error != null) {
                callback3.run(Long.valueOf(j3), null, tL_error.text);
            } else {
                callback3.run(Long.valueOf(j3), auth_authorization, null);
            }
        }

        public static void lambda$onResult$1(int i10, int i11, Utilities.Callback3 callback3, long j3, DialogInterface dialogInterface) {
            ConnectionsManager.getInstance(i10).cancelRequest(i11, true);
            callback3.run(Long.valueOf(j3), null, "CANCELLED");
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
        public void onResult(v0.o oVar) {
            b2.g gVar = oVar.f47273a;
            TL_account.finishPasskeyLogin finishpasskeylogin = new TL_account.finishPasskeyLogin();
            finishpasskeylogin.credential = new TL_account.inputPasskeyCredentialPublicKey();
            try {
                JSONObject jSONObject = new JSONObject(((Bundle) gVar.f2041a).getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON"));
                finishpasskeylogin.credential.f20079id = jSONObject.getString("id");
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
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(this.val$context, 3, null);
                b2Var.q(500L);
                if (parseInt != ConnectionsManager.getInstance(this.val$currentAccount).getCurrentDatacenterId()) {
                    int currentDatacenterId = ConnectionsManager.getInstance(this.val$currentAccount).getCurrentDatacenterId();
                    long currentAuthKeyId = ConnectionsManager.getInstance(this.val$currentAccount).getCurrentAuthKeyId();
                    ConnectionsManager.getInstance(this.val$currentAccount).setDefaultDatacenterId(parseInt);
                    finishpasskeylogin.flags = 1 | finishpasskeylogin.flags;
                    finishpasskeylogin.from_dc_id = currentDatacenterId;
                    finishpasskeylogin.from_auth_key_id = currentAuthKeyId;
                }
                final int sendRequestTyped = ConnectionsManager.getInstance(this.val$currentAccount).sendRequestTyped(finishpasskeylogin, new Object(), new oh(b2Var, this.val$done, parseLong, 0), parseInt, 72);
                final int i10 = this.val$currentAccount;
                final Utilities.Callback3 callback3 = this.val$done;
                b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public final void onCancel(DialogInterface dialogInterface) {
                        PasskeysController.AnonymousClass1.lambda$onResult$1(i10, sendRequestTyped, callback3, parseLong, dialogInterface);
                    }
                });
            } catch (Exception e7) {
                FileLog.e(e7);
                this.val$done.run(0L, null, e7.getMessage());
            }
        }
    }

    public static String bytesToHex(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append(String.format("%02x", Byte.valueOf(bArr[i10])));
        }
        return sb2.toString();
    }

    public static void create(Context context, int i10, Utilities.Callback2<TL_account.Passkey, String> callback2) {
        if (!BuildVars.SUPPORTS_PASSKEYS) {
            return;
        }
        kotlin.jvm.internal.i.e(context, "context");
        androidx.biometric.s sVar = new androidx.biometric.s(context, 3);
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
        b2Var.q(500L);
        ConnectionsManager.getInstance(i10).sendRequestTyped(new TL_account.initPasskeyRegistration(), new Object(), new jh(b2Var, callback2, sVar, context, i10));
    }

    public static <T> id.c ktxCallback(Utilities.Callback2<T, Throwable> callback2) {
        return ktxCallback(id.i.f11954a, callback2);
    }

    public static void lambda$create$2(Utilities.Callback2 callback2, Throwable th2) {
        callback2.run(null, th2.getMessage());
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
        final int sendRequestTyped = ConnectionsManager.getInstance(i10).sendRequestTyped(registerpasskey, new Object(), new c1(3, b2Var, callback2));
        b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                PasskeysController.lambda$create$5(i10, sendRequestTyped, callback2, dialogInterface);
            }
        });
    }

    public static void lambda$create$7(final Utilities.Callback2 callback2, Context context, int i10, v0.c cVar, Throwable th2) {
        if (!(th2 instanceof w0.b) && !(th2 instanceof w0.e)) {
            if (th2 instanceof w0.f) {
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
            } else if (th2 != null) {
                FileLog.e(th2);
                AndroidUtilities.runOnUIThread(new vg(5, callback2, th2));
                return;
            } else {
                TL_account.registerPasskey registerpasskey = new TL_account.registerPasskey();
                try {
                    JSONObject jSONObject = new JSONObject(cVar.f47266a.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON"));
                    TL_account.inputPasskeyCredentialPublicKey inputpasskeycredentialpublickey = new TL_account.inputPasskeyCredentialPublicKey();
                    registerpasskey.credential = inputpasskeycredentialpublickey;
                    inputpasskeycredentialpublickey.f20079id = jSONObject.getString("id");
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
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    AndroidUtilities.runOnUIThread(new mh(callback2, e7, 0));
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

    public static void lambda$create$9(org.telegram.ui.ActionBar.b2 b2Var, Utilities.Callback2 callback2, v0.h hVar, Context context, int i10, TL_account.passkeyRegistrationOptions passkeyregistrationoptions, TLRPC.TL_error tL_error) {
        b2Var.dismiss();
        if (tL_error != null) {
            callback2.run(null, tL_error.text);
            return;
        }
        try {
            try {
                ((androidx.biometric.s) hVar).c(context, new v0.e(new JSONObject(passkeyregistrationoptions.options.data).getJSONObject("publicKey").toString()), ktxCallback(new nh(context, i10, callback2)));
            } catch (Exception e7) {
                FileLog.e(e7);
                AndroidUtilities.runOnUIThread(new mh(callback2, e7, 1));
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
            v0.p pVar = new v0.p(new JSONObject(passkeyloginoptions.options.data).getJSONObject("publicKey").toString());
            ArrayList arrayList = new ArrayList();
            arrayList.add(pVar);
            v0.n nVar = new v0.n(hd.g.m(arrayList), !z10);
            try {
                CancellationSignal cancellationSignal = new CancellationSignal();
                Executor executor = context.getMainExecutor();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(callback3, context, i10);
                ((androidx.biometric.s) hVar).getClass();
                kotlin.jvm.internal.i.e(executor, "executor");
                v0.j b10 = k6.h.b(new k6.h(context, 2), nVar);
                if (b10 == null) {
                    anonymousClass1.onError((Object) new w0.h("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
                } else {
                    b10.onGetCredential(context, nVar, cancellationSignal, executor, anonymousClass1);
                }
                runnableArr[0] = new ug(cancellationSignal, 3);
            } catch (Exception e7) {
                callback3.run(0L, null, e7.getMessage());
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
        kotlin.jvm.internal.i.e(context, "context");
        final androidx.biometric.s sVar = new androidx.biometric.s(context, 3);
        final boolean[] zArr = new boolean[1];
        TL_account.initPasskeyLogin initpasskeylogin = new TL_account.initPasskeyLogin();
        initpasskeylogin.api_id = BuildVars.APP_ID;
        initpasskeylogin.api_hash = BuildVars.APP_HASH;
        final Runnable[] runnableArr = {new kh(i10, ConnectionsManager.getInstance(i10).sendRequestTyped(initpasskeylogin, new Object(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                PasskeysController.lambda$login$10(zArr, callback3, z10, sVar, context, i10, runnableArr, (TL_account.passkeyLoginOptions) obj, (TLRPC.TL_error) obj2);
            }
        }, 8), 0)};
        return new pc(zArr, runnableArr, 1);
    }

    public static <T> id.c ktxCallback(final id.h hVar, final Utilities.Callback2<T, Throwable> callback2) {
        return new id.c() {
            @Override
            public id.h getContext() {
                return hVar;
            }

            @Override
            public void resumeWith(Object obj) {
                if (obj instanceof gd.e) {
                    callback2.run(null, ((gd.e) obj).f10582a);
                } else {
                    callback2.run(obj, null);
                }
            }
        };
    }
}

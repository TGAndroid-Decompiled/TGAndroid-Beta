package org.telegram.messenger;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Base64;
import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.credentials.Credential;
import androidx.credentials.CredentialManager;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.CredentialManagerImpl;
import androidx.credentials.CredentialProvider;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.GetPublicKeyCredentialOption;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialInterruptedException;
import androidx.credentials.exceptions.CreateCredentialNoCreateOptionException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.NoCredentialException;
import com.google.android.play.integrity.internal.az;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Executor;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.GroupCallSheet$$ExternalSyntheticLambda5;

public class PasskeysController {

    public class AnonymousClass1 implements CredentialManagerCallback {
        final Context val$context;
        final int val$currentAccount;
        final Utilities.Callback3 val$done;

        public AnonymousClass1(Utilities.Callback3 callback3, Context context, int i) {
            this.val$done = callback3;
            this.val$context = context;
            this.val$currentAccount = i;
        }

        public static void lambda$onResult$0(AlertDialog alertDialog, Utilities.Callback3 callback3, long j, TLRPC.auth_Authorization auth_authorization, TLRPC.TL_error tL_error) {
            alertDialog.dismiss();
            if (tL_error != null) {
                callback3.run(Long.valueOf(j), null, tL_error.text);
            } else {
                callback3.run(Long.valueOf(j), auth_authorization, null);
            }
        }

        public static void lambda$onResult$1(int i, int i2, Utilities.Callback3 callback3, long j, DialogInterface dialogInterface) {
            ConnectionsManager.getInstance(i).cancelRequest(i2, true);
            callback3.run(Long.valueOf(j), null, "CANCELLED");
        }

        @Override
        public void onError(GetCredentialException getCredentialException) {
            if (getCredentialException instanceof NoCredentialException) {
                this.val$done.run(0L, null, "EMPTY");
                return;
            }
            if (getCredentialException instanceof GetCredentialCancellationException) {
                this.val$done.run(0L, null, "CANCELLED");
            } else if (getCredentialException instanceof GetCredentialInterruptedException) {
                this.val$done.run(0L, null, "CANCELLED");
            } else if (getCredentialException != null) {
                this.val$done.run(0L, null, getCredentialException.getMessage());
            }
        }

        @Override
        public void onResult(GetCredentialResponse getCredentialResponse) {
            Credential credential = getCredentialResponse.credential;
            TL_account.finishPasskeyLogin finishpasskeylogin = new TL_account.finishPasskeyLogin();
            finishpasskeylogin.credential = new TL_account.inputPasskeyCredentialPublicKey();
            try {
                JSONObject jSONObject = new JSONObject(((Bundle) credential.data).getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON"));
                finishpasskeylogin.credential.id = jSONObject.getString("id");
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
                int i = Integer.parseInt(str.split(":")[0]);
                final long j = Long.parseLong(inputpasskeyresponselogin.user_handle.split(":")[1]);
                finishpasskeylogin.credential.response = inputpasskeyresponselogin;
                AlertDialog alertDialog = new AlertDialog(this.val$context, 3, null);
                AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
                AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 500L);
                if (i != ConnectionsManager.getInstance(this.val$currentAccount).getCurrentDatacenterId()) {
                    int currentDatacenterId = ConnectionsManager.getInstance(this.val$currentAccount).getCurrentDatacenterId();
                    long currentAuthKeyId = ConnectionsManager.getInstance(this.val$currentAccount).getCurrentAuthKeyId();
                    ConnectionsManager.getInstance(this.val$currentAccount).setDefaultDatacenterId(i);
                    finishpasskeylogin.flags = 1 | finishpasskeylogin.flags;
                    finishpasskeylogin.from_dc_id = currentDatacenterId;
                    finishpasskeylogin.from_auth_key_id = currentAuthKeyId;
                }
                final int iSendRequestTyped = ConnectionsManager.getInstance(this.val$currentAccount).sendRequestTyped(finishpasskeylogin, new AiTonesController$$ExternalSyntheticLambda0(), new BotForumHelper$$ExternalSyntheticLambda3(alertDialog, this.val$done, j, 1), i, 72);
                final int i2 = this.val$currentAccount;
                final Utilities.Callback3 callback3 = this.val$done;
                alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public final void onCancel(DialogInterface dialogInterface) {
                        PasskeysController.AnonymousClass1.lambda$onResult$1(i2, iSendRequestTyped, callback3, j, dialogInterface);
                    }
                });
            } catch (Exception e) {
                FileLog.e(e);
                this.val$done.run(0L, null, e.getMessage());
            }
        }
    }

    public static String bytesToHex(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    public static void create(final Context context, final int i, final Utilities.Callback2<TL_account.Passkey, String> callback2) {
        if (BuildVars.SUPPORTS_PASSKEYS) {
            Intrinsics.checkNotNullParameter(context, "context");
            final CredentialManagerImpl credentialManagerImpl = new CredentialManagerImpl(context, 0);
            final AlertDialog alertDialog = new AlertDialog(context, 3, null);
            AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
            AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
            AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 500L);
            ConnectionsManager.getInstance(i).sendRequestTyped(new TL_account.initPasskeyRegistration(), new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    AlertDialog alertDialog2 = alertDialog;
                    CredentialManagerImpl credentialManagerImpl2 = credentialManagerImpl;
                    Context context2 = context;
                    int i2 = i;
                    PasskeysController.lambda$create$9(alertDialog2, callback2, credentialManagerImpl2, context2, i2, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                }
            });
        }
    }

    public static <T> Continuation ktxCallback(Utilities.Callback2<T, Throwable> callback2) {
        return ktxCallback(EmptyCoroutineContext.INSTANCE, callback2);
    }

    public static void lambda$create$2(Utilities.Callback2 callback2, Throwable th) {
        callback2.run(null, th.getMessage());
    }

    public static void lambda$create$3(Utilities.Callback2 callback2, Exception exc) {
        callback2.run(null, exc.getMessage());
    }

    public static void lambda$create$4(AlertDialog alertDialog, Utilities.Callback2 callback2, TL_account.Passkey passkey, TLRPC.TL_error tL_error) {
        alertDialog.dismiss();
        if (tL_error != null) {
            callback2.run(null, tL_error.text);
        } else {
            callback2.run(passkey, null);
        }
    }

    public static void lambda$create$5(int i, int i2, Utilities.Callback2 callback2, DialogInterface dialogInterface) {
        ConnectionsManager.getInstance(i).cancelRequest(i2, true);
        callback2.run(null, "CANCELLED");
    }

    public static void lambda$create$6(Context context, final int i, TL_account.registerPasskey registerpasskey, final Utilities.Callback2 callback2) {
        AlertDialog alertDialog = new AlertDialog(context, 3, null);
        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 500L);
        final int iSendRequestTyped = ConnectionsManager.getInstance(i).sendRequestTyped(registerpasskey, new AiTonesController$$ExternalSyntheticLambda0(), new ChatThemeController$$ExternalSyntheticLambda9(3, alertDialog, callback2));
        alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                PasskeysController.lambda$create$5(i, iSendRequestTyped, callback2, dialogInterface);
            }
        });
    }

    public static void lambda$create$7(final Utilities.Callback2 callback2, Context context, int i, CreateCredentialResponse createCredentialResponse, Throwable th) {
        if ((th instanceof CreateCredentialCancellationException) || (th instanceof CreateCredentialInterruptedException)) {
            final int i2 = 1;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    switch (i2) {
                        case 0:
                            callback2.run(null, "EMPTY");
                            break;
                        default:
                            callback2.run(null, "CANCELLED");
                            break;
                    }
                }
            });
            return;
        }
        if (th instanceof CreateCredentialNoCreateOptionException) {
            final int i3 = 0;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    switch (i3) {
                        case 0:
                            callback2.run(null, "EMPTY");
                            break;
                        default:
                            callback2.run(null, "CANCELLED");
                            break;
                    }
                }
            });
            return;
        }
        if (th != null) {
            FileLog.e(th);
            AndroidUtilities.runOnUIThread(new UserConfig$$ExternalSyntheticLambda3(6, callback2, th));
            return;
        }
        TL_account.registerPasskey registerpasskey = new TL_account.registerPasskey();
        try {
            JSONObject jSONObject = new JSONObject(createCredentialResponse.data.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON"));
            TL_account.inputPasskeyCredentialPublicKey inputpasskeycredentialpublickey = new TL_account.inputPasskeyCredentialPublicKey();
            registerpasskey.credential = inputpasskeycredentialpublickey;
            inputpasskeycredentialpublickey.id = jSONObject.getString("id");
            registerpasskey.credential.raw_id = jSONObject.getString("rawId");
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            TL_account.inputPasskeyResponseRegister inputpasskeyresponseregister = new TL_account.inputPasskeyResponseRegister();
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            inputpasskeyresponseregister.client_data = tL_dataJSON;
            tL_dataJSON.data = new String(Base64.decode(jSONObject2.getString("clientDataJSON"), 8));
            inputpasskeyresponseregister.attestation_object = Base64.decode(jSONObject2.getString("attestationObject"), 8);
            FileLog.d("AAGUID: " + bytesToHex(Arrays.copyOfRange(inputpasskeyresponseregister.attestation_object, 67, 83)));
            registerpasskey.credential.response = inputpasskeyresponseregister;
            AndroidUtilities.runOnUIThread(new ImageLoader$$ExternalSyntheticLambda14(context, i, registerpasskey, callback2, 17));
        } catch (Exception e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new PasskeysController$$ExternalSyntheticLambda6(callback2, e, 0));
        }
    }

    public static void lambda$create$8(Utilities.Callback2 callback2, Exception exc) {
        callback2.run(null, exc.getMessage());
    }

    public static void lambda$create$9(AlertDialog alertDialog, Utilities.Callback2 callback2, CredentialManager credentialManager, Context context, int i, TL_account.passkeyRegistrationOptions passkeyregistrationoptions, TLRPC.TL_error tL_error) {
        alertDialog.dismiss();
        if (tL_error != null) {
            callback2.run(null, tL_error.text);
            return;
        }
        try {
            try {
                ((CredentialManagerImpl) credentialManager).createCredential(context, new CreatePublicKeyCredentialRequest(new JSONObject(passkeyregistrationoptions.options.data).getJSONObject("publicKey").toString()), ktxCallback(new PasskeysController$$ExternalSyntheticLambda8(context, i, callback2)));
            } catch (Exception e) {
                FileLog.e(e);
                AndroidUtilities.runOnUIThread(new PasskeysController$$ExternalSyntheticLambda6(callback2, e, 1));
            }
        } catch (Exception e2) {
            FileLog.e(e2);
            callback2.run(null, e2.getMessage());
        }
    }

    public static void lambda$login$10(boolean[] zArr, Utilities.Callback3 callback3, boolean z, CredentialManager credentialManager, Context context, int i, Runnable[] runnableArr, TL_account.passkeyLoginOptions passkeyloginoptions, TLRPC.TL_error tL_error) {
        if (zArr[0]) {
            return;
        }
        if (tL_error != null) {
            callback3.run(0L, null, tL_error.text);
            return;
        }
        try {
            GetPublicKeyCredentialOption getPublicKeyCredentialOption = new GetPublicKeyCredentialOption(new JSONObject(passkeyloginoptions.options.data).getJSONObject("publicKey").toString());
            ArrayList arrayList = new ArrayList();
            arrayList.add(getPublicKeyCredentialOption);
            GetCredentialRequest getCredentialRequest = new GetCredentialRequest(CollectionsKt.toList(arrayList), !z);
            try {
                CancellationSignal cancellationSignal = new CancellationSignal();
                Executor executor = context.getMainExecutor();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(callback3, context, i);
                ((CredentialManagerImpl) credentialManager).getClass();
                Intrinsics.checkNotNullParameter(executor, "executor");
                CredentialProvider bestAvailableProvider$default = az.getBestAvailableProvider$default(new az(context), getCredentialRequest);
                if (bestAvailableProvider$default == null) {
                    anonymousClass1.onError((Object) new GetCredentialCustomException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 1));
                } else {
                    bestAvailableProvider$default.onGetCredential(context, getCredentialRequest, cancellationSignal, executor, anonymousClass1);
                }
                runnableArr[0] = new SecretChatHelper$$ExternalSyntheticLambda22(cancellationSignal, 4);
            } catch (Exception e) {
                callback3.run(0L, null, e.getMessage());
            }
        } catch (Exception e2) {
            FileLog.e(e2);
            callback3.run(0L, null, e2.getMessage());
        }
    }

    public static void lambda$login$11(int i, int i2) {
        ConnectionsManager.getInstance(i).cancelRequest(i2, true);
    }

    public static void lambda$login$12(boolean[] zArr, Runnable[] runnableArr) {
        zArr[0] = true;
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            runnable.run();
        }
    }

    public static Runnable login(final Context context, final int i, final boolean z, final Utilities.Callback3<Long, TLRPC.auth_Authorization, String> callback3) {
        if (!BuildVars.SUPPORTS_PASSKEYS) {
            return null;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        final CredentialManagerImpl credentialManagerImpl = new CredentialManagerImpl(context, 0);
        final boolean[] zArr = new boolean[1];
        final Runnable[] runnableArr = new Runnable[1];
        TL_account.initPasskeyLogin initpasskeylogin = new TL_account.initPasskeyLogin();
        initpasskeylogin.api_id = BuildVars.APP_ID;
        initpasskeylogin.api_hash = BuildVars.APP_HASH;
        runnableArr[0] = new GroupCallSheet$$ExternalSyntheticLambda5(i, ConnectionsManager.getInstance(i).sendRequestTyped(initpasskeylogin, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                boolean[] zArr2 = zArr;
                CredentialManagerImpl credentialManagerImpl2 = credentialManagerImpl;
                Context context2 = context;
                Runnable[] runnableArr2 = runnableArr;
                PasskeysController.lambda$login$10(zArr2, callback3, z, credentialManagerImpl2, context2, i, runnableArr2, (TL_account.passkeyLoginOptions) obj, (TLRPC.TL_error) obj2);
            }
        }, 8), 1);
        return new PasskeysController$$ExternalSyntheticLambda2(zArr, runnableArr, 0);
    }

    public static <T> Continuation ktxCallback(final CoroutineContext coroutineContext, final Utilities.Callback2<T, Throwable> callback2) {
        return new Continuation() {
            @Override
            public CoroutineContext getContext() {
                return coroutineContext;
            }

            @Override
            public void resumeWith(Object obj) {
                if (obj instanceof Result.Failure) {
                    callback2.run(null, ((Result.Failure) obj).exception);
                } else {
                    callback2.run(obj, null);
                }
            }
        };
    }
}

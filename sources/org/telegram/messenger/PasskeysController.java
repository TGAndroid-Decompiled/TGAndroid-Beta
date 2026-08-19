package org.telegram.messenger;

import android.content.Context;
import android.content.DialogInterface;
import android.os.CancellationSignal;
import android.util.Base64;
import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.credentials.Credential;
import androidx.credentials.CredentialManager;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.GetPublicKeyCredentialOption;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialInterruptedException;
import androidx.credentials.exceptions.CreateCredentialNoCreateOptionException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.NoCredentialException;
import java.util.Arrays;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;

public class PasskeysController {
    public static void create(final Context context, final int i, final Utilities.Callback2<TL_account.Passkey, String> callback2) {
        if (BuildVars.SUPPORTS_PASSKEYS) {
            final CredentialManager credentialManagerCreate = CredentialManager.CC.create(context);
            final AlertDialog alertDialog = new AlertDialog(context, 3);
            alertDialog.showDelayed(500L);
            ConnectionsManager.getInstance(i).sendRequestTyped(new TL_account.initPasskeyRegistration(), new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    PasskeysController.m962$r8$lambda$uzlz7C9RirnBVnV8ty3z_v7jkQ(alertDialog, callback2, credentialManagerCreate, context, i, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                }
            });
        }
    }

    public static void m962$r8$lambda$uzlz7C9RirnBVnV8ty3z_v7jkQ(AlertDialog alertDialog, final Utilities.Callback2 callback2, CredentialManager credentialManager, final Context context, final int i, TL_account.passkeyRegistrationOptions passkeyregistrationoptions, TLRPC.TL_error tL_error) {
        alertDialog.dismiss();
        if (tL_error != null) {
            callback2.run(null, tL_error.text);
            return;
        }
        try {
            try {
                credentialManager.createCredential(context, new CreatePublicKeyCredentialRequest(new JSONObject(passkeyregistrationoptions.options.data).getJSONObject("publicKey").toString()), ktxCallback(new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        PasskeysController.$r8$lambda$UFW9mxCL6OVJAvCzDQKgbaWCx_g(callback2, context, i, (CreateCredentialResponse) obj, (Throwable) obj2);
                    }
                }));
            } catch (Exception e) {
                FileLog.e(e);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        callback2.run(null, e.getMessage());
                    }
                });
            }
        } catch (Exception e2) {
            FileLog.e(e2);
            callback2.run(null, e2.getMessage());
        }
    }

    public static void $r8$lambda$UFW9mxCL6OVJAvCzDQKgbaWCx_g(final Utilities.Callback2 callback2, final Context context, final int i, CreateCredentialResponse createCredentialResponse, final Throwable th) {
        if ((th instanceof CreateCredentialCancellationException) || (th instanceof CreateCredentialInterruptedException)) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    callback2.run(null, "CANCELLED");
                }
            });
            return;
        }
        if (th instanceof CreateCredentialNoCreateOptionException) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    callback2.run(null, "EMPTY");
                }
            });
            return;
        }
        if (th != null) {
            FileLog.e(th);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    callback2.run(null, th.getMessage());
                }
            });
            return;
        }
        final TL_account.registerPasskey registerpasskey = new TL_account.registerPasskey();
        try {
            JSONObject jSONObject = new JSONObject(createCredentialResponse.getData().getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON"));
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
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PasskeysController.$r8$lambda$y0t8xdzxstUVdPjML0pMI_yGUOg(context, i, registerpasskey, callback2);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    callback2.run(null, e.getMessage());
                }
            });
        }
    }

    public static void $r8$lambda$y0t8xdzxstUVdPjML0pMI_yGUOg(Context context, final int i, TL_account.registerPasskey registerpasskey, final Utilities.Callback2 callback2) {
        final AlertDialog alertDialog = new AlertDialog(context, 3);
        alertDialog.showDelayed(500L);
        final int iSendRequestTyped = ConnectionsManager.getInstance(i).sendRequestTyped(registerpasskey, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                PasskeysController.$r8$lambda$9XpDvasej2ZlaH5A73JOyh8A3uo(alertDialog, callback2, (TL_account.Passkey) obj, (TLRPC.TL_error) obj2);
            }
        });
        alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                PasskeysController.$r8$lambda$nn76CV_Y1sHdcydbtd3_ZJgwwi4(i, iSendRequestTyped, callback2, dialogInterface);
            }
        });
    }

    public static void $r8$lambda$9XpDvasej2ZlaH5A73JOyh8A3uo(AlertDialog alertDialog, Utilities.Callback2 callback2, TL_account.Passkey passkey, TLRPC.TL_error tL_error) {
        alertDialog.dismiss();
        if (tL_error != null) {
            callback2.run(null, tL_error.text);
        } else {
            callback2.run(passkey, null);
        }
    }

    public static void $r8$lambda$nn76CV_Y1sHdcydbtd3_ZJgwwi4(int i, int i2, Utilities.Callback2 callback2, DialogInterface dialogInterface) {
        ConnectionsManager.getInstance(i).cancelRequest(i2, true);
        callback2.run(null, "CANCELLED");
    }

    public static Runnable login(final Context context, final int i, final boolean z, final Utilities.Callback3<Long, TLRPC.auth_Authorization, String> callback3) {
        if (!BuildVars.SUPPORTS_PASSKEYS) {
            return null;
        }
        final CredentialManager credentialManagerCreate = CredentialManager.CC.create(context);
        final boolean[] zArr = new boolean[1];
        TL_account.initPasskeyLogin initpasskeylogin = new TL_account.initPasskeyLogin();
        initpasskeylogin.api_id = BuildVars.APP_ID;
        initpasskeylogin.api_hash = BuildVars.APP_HASH;
        final int iSendRequestTyped = ConnectionsManager.getInstance(i).sendRequestTyped(initpasskeylogin, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                PasskeysController.$r8$lambda$3L4sUw_47wNxWVaSQ6GIWRaiOEQ(zArr, callback3, z, credentialManagerCreate, context, i, runnableArr, (TL_account.passkeyLoginOptions) obj, (TLRPC.TL_error) obj2);
            }
        }, 8);
        final Runnable[] runnableArr = {new Runnable() {
            @Override
            public final void run() {
                ConnectionsManager.getInstance(i).cancelRequest(iSendRequestTyped, true);
            }
        }};
        return new Runnable() {
            @Override
            public final void run() {
                PasskeysController.m961$r8$lambda$r0BjSG3ZEIMsdcfxhA6pR0B2FM(zArr, runnableArr);
            }
        };
    }

    public static void $r8$lambda$3L4sUw_47wNxWVaSQ6GIWRaiOEQ(boolean[] zArr, Utilities.Callback3 callback3, boolean z, CredentialManager credentialManager, Context context, int i, Runnable[] runnableArr, TL_account.passkeyLoginOptions passkeyloginoptions, TLRPC.TL_error tL_error) {
        if (zArr[0]) {
            return;
        }
        if (tL_error != null) {
            callback3.run(0L, null, tL_error.text);
            return;
        }
        try {
            GetCredentialRequest getCredentialRequestBuild = new GetCredentialRequest.Builder().addCredentialOption(new GetPublicKeyCredentialOption(new JSONObject(passkeyloginoptions.options.data).getJSONObject("publicKey").toString())).setPreferImmediatelyAvailableCredentials(!z).build();
            try {
                final CancellationSignal cancellationSignal = new CancellationSignal();
                credentialManager.getCredentialAsync(context, getCredentialRequestBuild, cancellationSignal, context.getMainExecutor(), new AnonymousClass1(callback3, context, i));
                runnableArr[0] = new Runnable() {
                    @Override
                    public final void run() {
                        cancellationSignal.cancel();
                    }
                };
            } catch (Exception e) {
                callback3.run(0L, null, e.getMessage());
            }
        } catch (Exception e2) {
            FileLog.e(e2);
            callback3.run(0L, null, e2.getMessage());
        }
    }

    class AnonymousClass1 implements CredentialManagerCallback {
        final Context val$context;
        final int val$currentAccount;
        final Utilities.Callback3 val$done;

        AnonymousClass1(Utilities.Callback3 callback3, Context context, int i) {
            this.val$done = callback3;
            this.val$context = context;
            this.val$currentAccount = i;
        }

        @Override
        public void onResult(GetCredentialResponse getCredentialResponse) {
            Credential credential = getCredentialResponse.getCredential();
            TL_account.finishPasskeyLogin finishpasskeylogin = new TL_account.finishPasskeyLogin();
            finishpasskeylogin.credential = new TL_account.inputPasskeyCredentialPublicKey();
            try {
                JSONObject jSONObject = new JSONObject(credential.getData().getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON"));
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
                final AlertDialog alertDialog = new AlertDialog(this.val$context, 3);
                alertDialog.showDelayed(500L);
                if (i != ConnectionsManager.getInstance(this.val$currentAccount).getCurrentDatacenterId()) {
                    int currentDatacenterId = ConnectionsManager.getInstance(this.val$currentAccount).getCurrentDatacenterId();
                    long currentAuthKeyId = ConnectionsManager.getInstance(this.val$currentAccount).getCurrentAuthKeyId();
                    ConnectionsManager.getInstance(this.val$currentAccount).setDefaultDatacenterId(i);
                    finishpasskeylogin.flags = 1 | finishpasskeylogin.flags;
                    finishpasskeylogin.from_dc_id = currentDatacenterId;
                    finishpasskeylogin.from_auth_key_id = currentAuthKeyId;
                }
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.val$currentAccount);
                AiTonesController$$ExternalSyntheticLambda0 aiTonesController$$ExternalSyntheticLambda0 = new AiTonesController$$ExternalSyntheticLambda0();
                final Utilities.Callback3 callback3 = this.val$done;
                final int iSendRequestTyped = connectionsManager.sendRequestTyped(finishpasskeylogin, aiTonesController$$ExternalSyntheticLambda0, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        PasskeysController.AnonymousClass1.$r8$lambda$gx4vqzEbMkPbuY3kEBWRgHgji2Q(alertDialog, callback3, j, (TLRPC.auth_Authorization) obj, (TLRPC.TL_error) obj2);
                    }
                }, i, 72);
                final int i2 = this.val$currentAccount;
                final Utilities.Callback3 callback4 = this.val$done;
                alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public final void onCancel(DialogInterface dialogInterface) {
                        PasskeysController.AnonymousClass1.$r8$lambda$aD_TSB9_08HxxMQbIkVP1CwvnZ0(i2, iSendRequestTyped, callback4, j, dialogInterface);
                    }
                });
            } catch (Exception e) {
                FileLog.e(e);
                this.val$done.run(0L, null, e.getMessage());
            }
        }

        public static void $r8$lambda$gx4vqzEbMkPbuY3kEBWRgHgji2Q(AlertDialog alertDialog, Utilities.Callback3 callback3, long j, TLRPC.auth_Authorization auth_authorization, TLRPC.TL_error tL_error) {
            alertDialog.dismiss();
            if (tL_error != null) {
                callback3.run(Long.valueOf(j), null, tL_error.text);
            } else {
                callback3.run(Long.valueOf(j), auth_authorization, null);
            }
        }

        public static void $r8$lambda$aD_TSB9_08HxxMQbIkVP1CwvnZ0(int i, int i2, Utilities.Callback3 callback3, long j, DialogInterface dialogInterface) {
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
    }

    public static void m961$r8$lambda$r0BjSG3ZEIMsdcfxhA6pR0B2FM(boolean[] zArr, Runnable[] runnableArr) {
        zArr[0] = true;
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            runnable.run();
        }
    }

    public static <T> Continuation ktxCallback(Utilities.Callback2<T, Throwable> callback2) {
        return ktxCallback(EmptyCoroutineContext.INSTANCE, callback2);
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

    public static String bytesToHex(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }
}

package org.telegram.messenger.support.fingerprint;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import androidx.core.p002os.CancellationSignal;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import org.telegram.messenger.support.fingerprint.FingerprintManagerCompatApi23;

public final class FingerprintManagerCompat {
    static final FingerprintManagerCompatImpl IMPL;
    private Context mContext;

    public static abstract class AuthenticationCallback {
        public abstract void onAuthenticationError(int i, CharSequence charSequence);

        public abstract void onAuthenticationFailed();

        public abstract void onAuthenticationHelp(int i, CharSequence charSequence);

        public abstract void onAuthenticationSucceeded(AuthenticationResult authenticationResult);
    }

    public interface FingerprintManagerCompatImpl {
        void authenticate(Context context, CryptoObject cryptoObject, int i, CancellationSignal cancellationSignal, AuthenticationCallback authenticationCallback, Handler handler);

        boolean hasEnrolledFingerprints(Context context);

        boolean isHardwareDetected(Context context);
    }

    private static class LegacyFingerprintManagerCompatImpl implements FingerprintManagerCompatImpl {
        @Override
        public void authenticate(Context context, CryptoObject cryptoObject, int i, CancellationSignal cancellationSignal, AuthenticationCallback authenticationCallback, Handler handler) {
        }

        @Override
        public boolean hasEnrolledFingerprints(Context context) {
            return false;
        }

        @Override
        public boolean isHardwareDetected(Context context) {
            return false;
        }
    }

    public static FingerprintManagerCompat from(Context context) {
        return new FingerprintManagerCompat(context);
    }

    private FingerprintManagerCompat(Context context) {
        this.mContext = context;
    }

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            IMPL = new Api23FingerprintManagerCompatImpl();
        } else {
            IMPL = new LegacyFingerprintManagerCompatImpl();
        }
    }

    public boolean hasEnrolledFingerprints() {
        return IMPL.hasEnrolledFingerprints(this.mContext);
    }

    public boolean isHardwareDetected() {
        return IMPL.isHardwareDetected(this.mContext);
    }

    public void authenticate(CryptoObject cryptoObject, int i, CancellationSignal cancellationSignal, AuthenticationCallback authenticationCallback, Handler handler) {
        IMPL.authenticate(this.mContext, cryptoObject, i, cancellationSignal, authenticationCallback, handler);
    }

    public static class CryptoObject {
        private final Cipher mCipher;
        private final Mac mMac;
        private final Signature mSignature;

        public CryptoObject(Signature signature) {
            this.mSignature = signature;
            this.mCipher = null;
            this.mMac = null;
        }

        public CryptoObject(Cipher cipher) {
            this.mCipher = cipher;
            this.mSignature = null;
            this.mMac = null;
        }

        public CryptoObject(Mac mac) {
            this.mMac = mac;
            this.mCipher = null;
            this.mSignature = null;
        }

        public Signature getSignature() {
            return this.mSignature;
        }

        public Cipher getCipher() {
            return this.mCipher;
        }

        public Mac getMac() {
            return this.mMac;
        }
    }

    public static final class AuthenticationResult {
        public AuthenticationResult(CryptoObject cryptoObject) {
        }
    }

    private static class Api23FingerprintManagerCompatImpl implements FingerprintManagerCompatImpl {
        @Override
        public boolean hasEnrolledFingerprints(Context context) {
            return FingerprintManagerCompatApi23.hasEnrolledFingerprints(context);
        }

        @Override
        public boolean isHardwareDetected(Context context) {
            return FingerprintManagerCompatApi23.isHardwareDetected(context);
        }

        @Override
        public void authenticate(Context context, CryptoObject cryptoObject, int i, CancellationSignal cancellationSignal, AuthenticationCallback authenticationCallback, Handler handler) {
            FingerprintManagerCompatApi23.authenticate(context, wrapCryptoObject(cryptoObject), i, cancellationSignal != null ? cancellationSignal.getCancellationSignalObject() : null, wrapCallback(authenticationCallback), handler);
        }

        private static FingerprintManagerCompatApi23.CryptoObject wrapCryptoObject(CryptoObject cryptoObject) {
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new FingerprintManagerCompatApi23.CryptoObject(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new FingerprintManagerCompatApi23.CryptoObject(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new FingerprintManagerCompatApi23.CryptoObject(cryptoObject.getMac());
            }
            return null;
        }

        static CryptoObject unwrapCryptoObject(FingerprintManagerCompatApi23.CryptoObject cryptoObject) {
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new CryptoObject(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new CryptoObject(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new CryptoObject(cryptoObject.getMac());
            }
            return null;
        }

        private static FingerprintManagerCompatApi23.AuthenticationCallback wrapCallback(final AuthenticationCallback authenticationCallback) {
            return new FingerprintManagerCompatApi23.AuthenticationCallback() {
                @Override
                public void onAuthenticationError(int i, CharSequence charSequence) {
                    authenticationCallback.onAuthenticationError(i, charSequence);
                }

                @Override
                public void onAuthenticationHelp(int i, CharSequence charSequence) {
                    authenticationCallback.onAuthenticationHelp(i, charSequence);
                }

                @Override
                public void onAuthenticationSucceeded(FingerprintManagerCompatApi23.AuthenticationResultInternal authenticationResultInternal) {
                    authenticationCallback.onAuthenticationSucceeded(new AuthenticationResult(Api23FingerprintManagerCompatImpl.unwrapCryptoObject(authenticationResultInternal.getCryptoObject())));
                }

                @Override
                public void onAuthenticationFailed() {
                    authenticationCallback.onAuthenticationFailed();
                }
            };
        }
    }
}

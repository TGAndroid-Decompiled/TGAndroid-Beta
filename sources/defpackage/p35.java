package defpackage;

import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import org.telegram.ui.LaunchActivity;
public final class p35 {
    public final CountDownLatch a = new CountDownLatch(1);
    public volatile boolean b;
    public String c;
    public String d;
    public LaunchActivity e;
    public boolean f;
    public int g;
    public CancellationSignal h;
    public AlertDialog i;

    public final void a() {
        if (!this.f && f()) {
            this.f = true;
            e();
            try {
                KeyguardManager keyguardManager = (KeyguardManager) this.e.getSystemService("keyguard");
                Intent intent = null;
                if (keyguardManager != null) {
                    intent = keyguardManager.createConfirmDeviceCredentialIntent(ob6.M0(2131742601, null), null);
                }
                if (intent == null) {
                    c("AUTH_UNAVAILABLE");
                    return;
                }
                int i = tne.a;
                int i2 = i + 1;
                tne.a = i2;
                this.g = i;
                if (i2 > 22399) {
                    tne.a = 22336;
                }
                this.e.startActivityForResult(intent, i);
            } catch (Exception e) {
                cc4.g(e, true);
                c("AUTH_UNAVAILABLE");
            }
        }
    }

    public final void b() {
        FingerprintManager fingerprintManager = (FingerprintManager) this.e.getSystemService("fingerprint");
        if (fingerprintManager != null && fingerprintManager.isHardwareDetected() && fingerprintManager.hasEnrolledFingerprints()) {
            this.h = new CancellationSignal();
            this.i = new AlertDialog.Builder(this.e).setTitle(ob6.M0(2131742601, null)).setMessage(ob6.M0(2131742620, null)).setNegativeButton(ob6.M0(2131752570, null), new DialogInterface.OnClickListener(this) {
                public final p35 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    byte b = r2;
                    p35 p35Var = this.b;
                    switch (b) {
                        case 0:
                            p35Var.c("AUTH_CANCELED");
                            return;
                        default:
                            p35Var.a();
                            return;
                    }
                }
            }).setPositiveButton(ob6.M0(2131742596, null), new DialogInterface.OnClickListener(this) {
                public final p35 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    byte b = r2;
                    p35 p35Var = this.b;
                    switch (b) {
                        case 0:
                            p35Var.c("AUTH_CANCELED");
                            return;
                        default:
                            p35Var.a();
                            return;
                    }
                }
            }).setOnCancelListener(new cs0(this, (byte) 9)).show();
            fingerprintManager.authenticate(null, this.h, 0, new o35(this), new Handler(Looper.getMainLooper()));
            return;
        }
        a();
    }

    public final void c(String str) {
        CountDownLatch countDownLatch = this.a;
        if (countDownLatch.getCount() == 0) {
            return;
        }
        this.c = str;
        countDownLatch.countDown();
    }

    public final void d() {
        this.h = new CancellationSignal();
        new BiometricPrompt.Builder(this.e).setTitle(ob6.M0(2131742601, null)).setAllowedAuthenticators(32783).build().authenticate(this.h, this.e.getMainExecutor(), new n35(this));
    }

    public final void e() {
        try {
            CancellationSignal cancellationSignal = this.h;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        try {
            AlertDialog alertDialog = this.i;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
        this.i = null;
    }

    public final boolean f() {
        if (!this.b && this.a.getCount() != 0) {
            return true;
        }
        return false;
    }
}

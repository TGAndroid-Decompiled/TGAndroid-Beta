package defpackage;

import android.os.SystemClock;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
public final class nz7 implements RequestDelegate {
    public final boolean a;
    public final byte[] b;
    public final TL_account.getPasswordSettings c;
    public final String d;
    public final xz7 e;

    public nz7(xz7 xz7Var, boolean z, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = xz7Var;
        this.a = z;
        this.b = bArr;
        this.c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i;
        tk5 tk5Var;
        tk5 tk5Var2;
        int i2;
        xz7 xz7Var = this.e;
        if (xz7Var.Z == null) {
            return;
        }
        if (!this.a) {
            i2 = ((d) xz7Var).currentAccount;
            z8c h = z8c.h(i2);
            byte[] bArr = this.b;
            byte[] bArr2 = this.e.f1;
            h.m0 = SystemClock.elapsedRealtime();
            h.k0 = bArr;
            h.l0 = bArr2;
        }
        int i3 = 0;
        gm.t1(this.e.Z[0]);
        xz7 xz7Var2 = this.e;
        xz7Var2.g1 = true;
        long j = xz7Var2.c;
        if (j == 0) {
            i3 = 8;
        }
        xz7 xz7Var3 = new xz7(i3, j, xz7Var2.h, xz7Var2.r, xz7Var2.d, xz7Var2.e, xz7Var2.n, xz7Var2.E, xz7Var2.K);
        xz7 xz7Var4 = this.e;
        xz7Var3.e1 = xz7Var4.e1;
        i = ((d) xz7Var4).currentAccount;
        ((d) xz7Var3).currentAccount = i;
        xz7 xz7Var5 = this.e;
        xz7Var3.f1 = xz7Var5.f1;
        xz7Var3.d1 = xz7Var5.d1;
        xz7Var3.c1 = xz7Var5.c1;
        xz7Var3.D1 = xz7Var5.D1;
        tk5Var = ((d) xz7Var5).parentLayout;
        if (tk5Var != null) {
            tk5Var2 = ((d) this.e).parentLayout;
            if (((ActionBarLayout) tk5Var2).h()) {
                this.e.i1 = xz7Var3;
                return;
            }
        }
        this.e.presentFragment(xz7Var3, true);
    }

    public final void b() {
        int i;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        xz7 xz7Var = this.e;
        TL_account.Password password = xz7Var.K;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = nq9.d(this.b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        }
        TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
        updatepasswordsettings.new_settings = passwordinputsettings;
        passwordinputsettings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
        TLRPC.TL_secureSecretSettings tL_secureSecretSettings = updatepasswordsettings.new_settings.new_secure_settings;
        tL_secureSecretSettings.secure_secret = new byte[0];
        tL_secureSecretSettings.secure_algo = new TLRPC.TL_securePasswordKdfAlgoUnknown();
        TL_account.passwordInputSettings passwordinputsettings2 = updatepasswordsettings.new_settings;
        passwordinputsettings2.new_secure_settings.secure_secret_id = 0L;
        passwordinputsettings2.flags |= 4;
        i = ((d) xz7Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(this.c, new lz7(this, (byte) 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i;
        if (tL_error != null) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                TL_account.getPassword getpassword = new TL_account.getPassword();
                i = ((d) this.e).currentAccount;
                ConnectionsManager.getInstance(i).sendRequest(getpassword, new r91((byte) 7, this, this.a), 8);
                return;
            }
            gm.c3(new yl6(this, this.a, tL_error, (byte) 10));
            return;
        }
        Utilities.e.c(new eb7(this, tLObject, this.d, this.a, (byte) 6));
    }
}

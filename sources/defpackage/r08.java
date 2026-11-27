package defpackage;

import android.os.SystemClock;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;
public final class r08 implements RequestDelegate {
    public final boolean a;
    public final byte[] b;
    public final TL_account.getPasswordSettings c;
    public final String d;
    public final b18 e;

    public r08(b18 b18Var, boolean z, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = b18Var;
        this.a = z;
        this.b = bArr;
        this.c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i;
        wk5 wk5Var;
        wk5 wk5Var2;
        int i2;
        b18 b18Var = this.e;
        if (b18Var.Z == null) {
            return;
        }
        if (!this.a) {
            i2 = ((e) b18Var).currentAccount;
            yac h = yac.h(i2);
            byte[] bArr = this.b;
            byte[] bArr2 = this.e.f1;
            h.m0 = SystemClock.elapsedRealtime();
            h.k0 = bArr;
            h.l0 = bArr2;
        }
        int i3 = 0;
        hl.t1(this.e.Z[0]);
        b18 b18Var2 = this.e;
        b18Var2.g1 = true;
        long j = b18Var2.c;
        if (j == 0) {
            i3 = 8;
        }
        b18 b18Var3 = new b18(i3, j, b18Var2.h, b18Var2.r, b18Var2.d, b18Var2.e, b18Var2.n, b18Var2.E, b18Var2.K);
        b18 b18Var4 = this.e;
        b18Var3.e1 = b18Var4.e1;
        i = ((e) b18Var4).currentAccount;
        ((e) b18Var3).currentAccount = i;
        b18 b18Var5 = this.e;
        b18Var3.f1 = b18Var5.f1;
        b18Var3.d1 = b18Var5.d1;
        b18Var3.c1 = b18Var5.c1;
        b18Var3.D1 = b18Var5.D1;
        wk5Var = ((e) b18Var5).parentLayout;
        if (wk5Var != null) {
            wk5Var2 = ((e) this.e).parentLayout;
            if (((ActionBarLayout) wk5Var2).h()) {
                this.e.i1 = b18Var3;
                return;
            }
        }
        this.e.presentFragment(b18Var3, true);
    }

    public final void b() {
        int i;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        b18 b18Var = this.e;
        TL_account.Password password = b18Var.K;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = es9.d(this.b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i = ((e) b18Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(this.c, new o08(this, (byte) 2));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i;
        if (tL_error != null) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                TL_account.getPassword getpassword = new TL_account.getPassword();
                i = ((e) this.e).currentAccount;
                ConnectionsManager.getInstance(i).sendRequest(getpassword, new q81((byte) 7, this, this.a), 8);
                return;
            }
            hl.c3(new yn6(this, this.a, tL_error, (byte) 9));
            return;
        }
        Utilities.e.c(new lb7(this, tLObject, this.d, this.a, (byte) 7));
    }
}

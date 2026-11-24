package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.TwoStepVerificationActivity;
public class p5c extends d {
    public a91 E;
    public c7 F;
    public boolean G;
    public int H;
    public boolean I;
    public AnimatorSet J;
    public final ArrayList K;
    public AnimatorSet L;
    public RadialProgressView M;
    public boolean N;
    public boolean O;
    public final byte P;
    public String Q;
    public String R;
    public String S;
    public boolean T;
    public boolean U;
    public TL_account.Password V;
    public byte[] W;
    public long X;
    public byte[] Y;
    public boolean Z;
    public s09 a;
    public boolean a0;
    public TextView b;
    public String b0;
    public TextView c;
    public wm9 c0;
    public xna d;
    public wp4 d0;
    public TextView e;
    public x0c e0;
    public TextView f;
    public d63 f0;
    public p09[] g0;
    public TextView h;
    public g5c h0;
    public final Runnable i0;
    public final Runnable j0;
    public t56 k0;
    public EditTextBoldCursor n;
    public EditTextBoldCursor r;
    public gt7 s;
    public gt7 w;
    public xe6 x;
    public o5c y;

    public p5c(int i, int i2, TL_account.Password password) {
        super(null);
        this.G = false;
        this.H = -1;
        this.K = new ArrayList();
        this.W = new byte[0];
        this.i0 = new g5c(this, (byte) 0);
        this.j0 = new g5c(this, (byte) 1);
        this.currentAccount = i;
        this.P = i2;
        this.V = password;
        this.U = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        if (this.V == null) {
            if (i2 == 6 || i2 == 8) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new i5c(this, (byte) 0), 10);
            }
        }
    }

    public static a a0(p5c p5cVar) {
        return p5cVar.actionBar;
    }

    public static a b0(p5c p5cVar) {
        return p5cVar.actionBar;
    }

    public static a k0(p5c p5cVar) {
        return p5cVar.actionBar;
    }

    public final void A0(TLObject tLObject, boolean z, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP;
        if (tLObject instanceof TL_account.updatePasswordSettings) {
            TL_account.updatePasswordSettings updatepasswordsettings = (TL_account.updatePasswordSettings) tLObject;
            if (updatepasswordsettings.password == null) {
                TL_account.Password password = this.V;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    tL_inputCheckPasswordSRP = nq9.d(this.W, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    tL_inputCheckPasswordSRP = null;
                }
                updatepasswordsettings.password = tL_inputCheckPasswordSRP;
            }
        }
        if (!z && str != null) {
            byte[] g1 = gm.g1(str);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = this.V.new_algo;
            if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                bArr2 = g1;
                bArr = nq9.c(g1, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            } else {
                bArr2 = g1;
                bArr = null;
            }
        } else {
            bArr = null;
            bArr2 = null;
        }
        bh2 bh2Var = new bh2(this, z, bArr, str, passwordinputsettings, (byte) 5);
        if (!z) {
            if (str != null && (bArr3 = this.Y) != null && bArr3.length == 32) {
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = this.V.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] m = Utilities.m(bArr2, tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    byte[] bArr4 = new byte[32];
                    System.arraycopy(m, 0, bArr4, 0, 32);
                    byte[] bArr5 = new byte[16];
                    System.arraycopy(m, 32, bArr5, 0, 16);
                    byte[] bArr6 = new byte[32];
                    System.arraycopy(this.Y, 0, bArr6, 0, 32);
                    Utilities.b(bArr6, bArr4, bArr5, 0, 32, 0, 1);
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = new TLRPC.TL_secureSecretSettings();
                    passwordinputsettings.new_secure_settings = tL_secureSecretSettings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = bArr6;
                    tL_secureSecretSettings.secure_secret_id = this.X;
                    passwordinputsettings.flags |= 4;
                }
            }
            TLRPC.PasswordKdfAlgo passwordKdfAlgo3 = this.V.new_algo;
            if (passwordKdfAlgo3 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                if (str != null) {
                    byte[] b = nq9.b(bArr2, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo3);
                    passwordinputsettings.new_password_hash = b;
                    if (b == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "ALGO_INVALID";
                        bh2Var.run(null, tL_error);
                    }
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLObject, bh2Var, 10);
                return;
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "PASSWORD_HASH_INVALID";
            bh2Var.run(null, tL_error2);
            return;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLObject, bh2Var, 10);
    }

    public final void B0() {
        this.d0.f(false, true);
    }

    public final void C0() {
        if (getParentActivity() != null && !getParentActivity().isFinishing()) {
            this.d0.f(true, true);
        }
    }

    public final void D0() {
        gl2[] gl2VarArr;
        for (gl2 gl2Var : this.x.f) {
            gl2Var.setText("");
            gl2Var.A(1.0f);
        }
        this.x.f[0].requestFocus();
        gm.A3(8.0f, this.x, new g5c(this, (byte) 6));
    }

    public final void E0(gt7 gt7Var, EditTextBoldCursor editTextBoldCursor, boolean z) {
        if (getParentActivity() == null) {
            return;
        }
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z) {
            editTextBoldCursor.setText("");
        }
        gm.A3(5.0f, gt7Var, null);
    }

    public final void F0() {
        TL_account.Password password = this.V;
        if (!password.has_recovery) {
            p5c p5cVar = new p5c(this.currentAccount, 3, password);
            p5cVar.I = this.I;
            p5cVar.I0(this.W, this.X, this.Y, this.a0);
            p5cVar.Q = this.Q;
            p5cVar.R = this.R;
            ArrayList arrayList = this.K;
            ArrayList arrayList2 = p5cVar.K;
            arrayList2.addAll(arrayList);
            arrayList2.add(this);
            p5cVar.Z = this.Z;
            p5cVar.H = this.H;
            presentFragment(p5cVar);
            return;
        }
        this.S = "";
        J0(false);
    }

    public final void H0() {
        if (getParentActivity() != null) {
            int i = 2;
            switch (this.P) {
                case 0:
                case 1:
                    if (this.n.length() == 0) {
                        E0(this.s, this.n, false);
                        return;
                    } else if (!this.n.getText().toString().equals(this.Q) && this.P == 1) {
                        gm.A3(5.0f, this.s, null);
                        try {
                            this.s.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        try {
                            Toast.makeText(getParentActivity(), jb6.M0(2131747179, null), 0).show();
                            return;
                        } catch (Exception e) {
                            fc4.g(e, true);
                            return;
                        }
                    } else {
                        int i2 = this.currentAccount;
                        if (this.P == 0) {
                            i = 1;
                        }
                        p5c p5cVar = new p5c(i2, i, this.V);
                        p5cVar.I = this.I;
                        p5cVar.Q = this.n.getText().toString();
                        p5cVar.I0(this.W, this.X, this.Y, this.a0);
                        p5cVar.b0 = this.b0;
                        p5cVar.K.addAll(this.K);
                        p5cVar.K.add(this);
                        p5cVar.Z = this.Z;
                        p5cVar.H = this.H;
                        presentFragment(p5cVar);
                        return;
                    }
                case 2:
                    String obj = this.n.getText().toString();
                    this.R = obj;
                    if (obj.equalsIgnoreCase(this.Q)) {
                        try {
                            Toast.makeText(getParentActivity(), jb6.M0(2131747181, null), 0).show();
                        } catch (Exception e2) {
                            fc4.g(e2, true);
                        }
                        E0(this.s, this.n, false);
                        return;
                    }
                    F0();
                    return;
                case 3:
                    if (!this.a0 && this.h.getAlpha() < 1.0f) {
                        this.h.animate().cancel();
                        this.h.animate().alpha(1.0f).start();
                    }
                    String obj2 = this.n.getText().toString();
                    this.S = obj2;
                    if (obj2 != null && obj2.length() >= 3) {
                        int lastIndexOf = obj2.lastIndexOf(46);
                        int lastIndexOf2 = obj2.lastIndexOf(64);
                        if (lastIndexOf2 >= 0 && lastIndexOf >= lastIndexOf2) {
                            J0(false);
                            return;
                        }
                    }
                    E0(this.s, this.n, false);
                    return;
                case 4:
                    String code = this.x.getCode();
                    TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
                    tL_auth_checkRecoveryPassword.code = code;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new ara(this, code, (byte) 18), 10);
                    return;
                case 5:
                    TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                    confirmpasswordemail.code = this.x.getCode();
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new i5c(this, (byte) 2), 10);
                    C0();
                    return;
                case 6:
                    TL_account.Password password = this.V;
                    if (password == null) {
                        C0();
                        this.O = true;
                        return;
                    }
                    p5c p5cVar2 = new p5c(this.currentAccount, 0, password);
                    p5cVar2.I = this.I;
                    p5cVar2.Z = this.Z;
                    p5cVar2.H = this.H;
                    presentFragment(p5cVar2, true);
                    return;
                case 7:
                    if (this.Z) {
                        finishFragment();
                        return;
                    } else if (this.I) {
                        Bundle l = ts2.l("afterSignup", true);
                        bj6 bj6Var = new bj6();
                        bj6Var.n0(l);
                        presentFragment(bj6Var, true);
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.A0(this.V, this.W, this.X, this.Y);
                        twoStepVerificationActivity.Y = this.H;
                        presentFragment(twoStepVerificationActivity, true);
                        t56 t56Var = this.k0;
                        if (t56Var != null) {
                            gm.c3(t56Var);
                            this.k0 = null;
                            return;
                        }
                        return;
                    }
                case 8:
                    if (this.V == null) {
                        C0();
                        this.O = true;
                        return;
                    }
                    String obj3 = this.n.getText().toString();
                    if (obj3.length() == 0) {
                        E0(this.s, this.n, false);
                        return;
                    }
                    byte[] g1 = gm.g1(obj3);
                    C0();
                    Utilities.e.c(new j5c(this, g1, (byte) 0));
                    return;
                case 9:
                    finishFragment();
                    return;
                default:
                    return;
            }
        }
    }

    public final void I0(byte[] bArr, long j, byte[] bArr2, boolean z) {
        this.W = bArr;
        this.Y = bArr2;
        this.X = j;
        this.a0 = z;
    }

    public final void J0(boolean z) {
        TL_account.Password password;
        TL_account.updatePasswordSettings updatepasswordsettings;
        if (z && this.U && this.V.has_password) {
            C0();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.cancelPasswordEmail(), new i5c(this, (byte) 3));
            return;
        }
        String str = this.Q;
        TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
        String str2 = "";
        if (z) {
            z8c.h(this.currentAccount).t();
            this.Y = null;
            if (this.U) {
                passwordinputsettings.flags = 2;
                passwordinputsettings.email = "";
            } else {
                passwordinputsettings.flags = 3;
                passwordinputsettings.hint = "";
                passwordinputsettings.new_password_hash = new byte[0];
                passwordinputsettings.new_algo = new TLRPC.TL_passwordKdfAlgoUnknown();
                passwordinputsettings.email = "";
            }
        } else {
            String str3 = this.R;
            if (str3 == null && (password = this.V) != null) {
                str3 = password.hint;
                this.R = str3;
            }
            if (str3 == null) {
                this.R = "";
            } else {
                str2 = str3;
            }
            if (str != null) {
                passwordinputsettings.flags |= 1;
                passwordinputsettings.hint = str2;
                passwordinputsettings.new_algo = this.V.new_algo;
            }
            if (this.S.length() > 0) {
                passwordinputsettings.flags |= 2;
                passwordinputsettings.email = this.S.trim();
            }
        }
        if (this.b0 != null) {
            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
            tL_auth_recoverPassword.code = this.b0;
            tL_auth_recoverPassword.new_settings = passwordinputsettings;
            tL_auth_recoverPassword.flags |= 1;
            updatepasswordsettings = tL_auth_recoverPassword;
        } else {
            TL_account.updatePasswordSettings updatepasswordsettings2 = new TL_account.updatePasswordSettings();
            byte[] bArr = this.W;
            if (bArr == null || bArr.length == 0 || (z && this.U)) {
                updatepasswordsettings2.password = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            updatepasswordsettings2.new_settings = passwordinputsettings;
            updatepasswordsettings = updatepasswordsettings2;
        }
        TL_account.updatePasswordSettings updatepasswordsettings3 = updatepasswordsettings;
        C0();
        Utilities.e.c(new aa7(this, updatepasswordsettings3, z, str, passwordinputsettings, (byte) 23));
    }

    public final void K0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p5c.K0(boolean):void");
    }

    public final void L0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.j(jb6.M0(2131747564, null), null);
        he heVar = alertDialog$Builder.a;
        heVar.S = str;
        heVar.U = str2;
        showDialog(heVar);
    }

    public final void M0(boolean z) {
        boolean z2;
        Integer num;
        if (this.b.getTag() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z == z2) {
            return;
        }
        AnimatorSet animatorSet = this.J;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        TextView textView = this.b;
        if (z) {
            num = 1;
        } else {
            num = null;
        }
        textView.setTag(num);
        this.J = new AnimatorSet();
        if (z) {
            this.b.setVisibility(0);
            AnimatorSet animatorSet2 = this.J;
            TextView textView2 = this.e;
            Property property = View.SCALE_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, property, 0.9f);
            TextView textView3 = this.e;
            Property property2 = View.SCALE_Y;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView3, property2, 0.9f);
            TextView textView4 = this.e;
            Property property3 = View.ALPHA;
            animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView4, property3, 0.0f), ObjectAnimator.ofFloat(this.b, property, 1.0f), ObjectAnimator.ofFloat(this.b, property2, 1.0f), ObjectAnimator.ofFloat(this.b, property3, 1.0f));
        } else {
            this.e.setVisibility(0);
            AnimatorSet animatorSet3 = this.J;
            TextView textView5 = this.b;
            Property property4 = View.SCALE_X;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView5, property4, 0.9f);
            TextView textView6 = this.b;
            Property property5 = View.SCALE_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textView6, property5, 0.9f);
            TextView textView7 = this.b;
            Property property6 = View.ALPHA;
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textView7, property6, 0.0f), ObjectAnimator.ofFloat(this.e, property4, 1.0f), ObjectAnimator.ofFloat(this.e, property5, 1.0f), ObjectAnimator.ofFloat(this.e, property6, 1.0f));
        }
        this.J.addListener(new sw9((byte) 13, this, z));
        this.J.setDuration(150L);
        this.J.start();
    }

    public final void N0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = jb6.M0(2131742611, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.G(this.H, "ForceSetPasswordAlertMessageShort", new Object[0]);
        alertDialog$Builder.j(jb6.M0(2131743620, null), null);
        alertDialog$Builder.g(jb6.M0(2131750526, null), new h5c(this, (byte) 0));
        anb.X((TextView) alertDialog$Builder.o().c(-2), cmb.p7, null);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    @Override
    public final View createView(Context context) {
        int i;
        char c;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        byte b;
        ?? r12;
        ?? r10;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setBackButtonImage(2131231244);
        this.actionBar.setAllowOverlayTitle(false);
        a aVar = this.actionBar;
        int i4 = cmb.F6;
        anb.l(aVar, 5, i4, null);
        anb.l(this.actionBar, 1, i4, null);
        anb.l(this.actionBar, 3, cmb.t8, null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new n5c(this));
        byte b2 = this.P;
        if (b2 == 5) {
            this.actionBar.t().a(0, 2131231248).g(1, jb6.M0(2131754947, null));
        }
        wp4 wp4Var = new wp4(this.resourceProvider, context, false);
        this.d0 = wp4Var;
        this.c0 = new wm9(wp4Var);
        this.d0.setOnClickListener(new View.OnClickListener(this) {
            public final p5c b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b3 = r2;
                p5c p5cVar = this.b;
                switch (b3) {
                    case 0:
                        p5cVar.H0();
                        return;
                    case 1:
                        byte b4 = p5cVar.P;
                        p5cVar.N = true;
                        TransformationMethod transformationMethod = p5cVar.n.getTransformationMethod();
                        EditTextBoldCursor editTextBoldCursor = p5cVar.n;
                        if (transformationMethod == null) {
                            editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            anb.s(p5cVar.F, cmb.Ne, null, PorterDuff.Mode.MULTIPLY);
                            if (b4 == 0 && p5cVar.n.length() > 0 && p5cVar.n.hasFocus()) {
                                p5cVar.g0[3].K(-1);
                                p09 animatedDrawable = p5cVar.a.getAnimatedDrawable();
                                p09 p09Var = p5cVar.g0[3];
                                if (animatedDrawable != p09Var) {
                                    p5cVar.a.setAnimation(p09Var);
                                    p5cVar.g0[3].I(18, false, false);
                                }
                                p5cVar.a.d();
                            }
                        } else {
                            editTextBoldCursor.setTransformationMethod(null);
                            anb.s(p5cVar.F, cmb.Oe, null, PorterDuff.Mode.MULTIPLY);
                            if (b4 == 0 && p5cVar.n.length() > 0 && p5cVar.n.hasFocus()) {
                                p5cVar.g0[3].K(18);
                                p09 animatedDrawable2 = p5cVar.a.getAnimatedDrawable();
                                p09 p09Var2 = p5cVar.g0[3];
                                if (animatedDrawable2 != p09Var2) {
                                    p5cVar.a.setAnimation(p09Var2);
                                }
                                p5cVar.g0[3].O(false, 0.0f);
                                p5cVar.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor2 = p5cVar.n;
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        p5cVar.N = false;
                        return;
                    case 2:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p5cVar.getParentActivity());
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        alertDialog$Builder.j(jb6.M0(2131745851, null), new h5c(p5cVar, (byte) 1));
                        String M0 = jb6.M0(2131745826, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M0;
                        heVar.U = jb6.M0(2131745807, null);
                        p5cVar.showDialog(heVar);
                        return;
                    case 3:
                        p5cVar.n0();
                        return;
                    case 4:
                        if (p5cVar.h.getAlpha() >= 0.5f) {
                            byte b5 = p5cVar.P;
                            if (b5 == 0) {
                                p5cVar.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = p5cVar.b0;
                                p5cVar.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new i5c(p5cVar, (byte) 1));
                                return;
                            } else if (b5 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p5cVar.getParentActivity());
                                String M02 = jb6.M0(2131742478, null);
                                he heVar2 = alertDialog$Builder2.a;
                                heVar2.U = M02;
                                heVar2.S = jb6.M0(2131742479, null);
                                alertDialog$Builder2.j(jb6.M0(2131742480, null), new h5c(p5cVar, (byte) 2));
                                alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                                p5cVar.showDialog(heVar2);
                                TextView textView = (TextView) heVar2.c(-1);
                                if (textView != null) {
                                    anb.X(textView, cmb.p7, null);
                                    return;
                                }
                                return;
                            } else if (b5 == 2) {
                                p5cVar.F0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 5:
                        if (p5cVar.P == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.X = true;
                            twoStepVerificationActivity.J = p5cVar.V;
                            twoStepVerificationActivity.K = false;
                            twoStepVerificationActivity.Y = p5cVar.H;
                            p5cVar.presentFragment(twoStepVerificationActivity, true);
                            t56 t56Var = p5cVar.k0;
                            if (t56Var != null) {
                                gm.c3(t56Var);
                                p5cVar.k0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        p5cVar.H0();
                        return;
                }
            }
        });
        x0c x0cVar = new x0c(context);
        this.e0 = x0cVar;
        x0cVar.setTransformType(1);
        this.e0.setProgress(0.0f);
        this.e0.setColor(cmb.w0(null, cmb.N9, false));
        this.e0.setDrawBackground(false);
        this.d0.setContentDescription(jb6.M0(2131747984, null));
        this.d0.addView(this.e0, qoe.e(56, 56, 17));
        this.d0.a(this.e0);
        TextView textView = new TextView(context);
        this.h = textView;
        anb.X(textView, cmb.n6, null);
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(19);
        this.h.setVisibility(8);
        wm9.c(this.h);
        this.h.setPadding(gm.L(32.0f), 0, gm.L(32.0f), 0);
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final p5c b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b3 = r2;
                p5c p5cVar = this.b;
                switch (b3) {
                    case 0:
                        p5cVar.H0();
                        return;
                    case 1:
                        byte b4 = p5cVar.P;
                        p5cVar.N = true;
                        TransformationMethod transformationMethod = p5cVar.n.getTransformationMethod();
                        EditTextBoldCursor editTextBoldCursor = p5cVar.n;
                        if (transformationMethod == null) {
                            editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            anb.s(p5cVar.F, cmb.Ne, null, PorterDuff.Mode.MULTIPLY);
                            if (b4 == 0 && p5cVar.n.length() > 0 && p5cVar.n.hasFocus()) {
                                p5cVar.g0[3].K(-1);
                                p09 animatedDrawable = p5cVar.a.getAnimatedDrawable();
                                p09 p09Var = p5cVar.g0[3];
                                if (animatedDrawable != p09Var) {
                                    p5cVar.a.setAnimation(p09Var);
                                    p5cVar.g0[3].I(18, false, false);
                                }
                                p5cVar.a.d();
                            }
                        } else {
                            editTextBoldCursor.setTransformationMethod(null);
                            anb.s(p5cVar.F, cmb.Oe, null, PorterDuff.Mode.MULTIPLY);
                            if (b4 == 0 && p5cVar.n.length() > 0 && p5cVar.n.hasFocus()) {
                                p5cVar.g0[3].K(18);
                                p09 animatedDrawable2 = p5cVar.a.getAnimatedDrawable();
                                p09 p09Var2 = p5cVar.g0[3];
                                if (animatedDrawable2 != p09Var2) {
                                    p5cVar.a.setAnimation(p09Var2);
                                }
                                p5cVar.g0[3].O(false, 0.0f);
                                p5cVar.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor2 = p5cVar.n;
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        p5cVar.N = false;
                        return;
                    case 2:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p5cVar.getParentActivity());
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        alertDialog$Builder.j(jb6.M0(2131745851, null), new h5c(p5cVar, (byte) 1));
                        String M0 = jb6.M0(2131745826, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M0;
                        heVar.U = jb6.M0(2131745807, null);
                        p5cVar.showDialog(heVar);
                        return;
                    case 3:
                        p5cVar.n0();
                        return;
                    case 4:
                        if (p5cVar.h.getAlpha() >= 0.5f) {
                            byte b5 = p5cVar.P;
                            if (b5 == 0) {
                                p5cVar.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = p5cVar.b0;
                                p5cVar.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new i5c(p5cVar, (byte) 1));
                                return;
                            } else if (b5 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p5cVar.getParentActivity());
                                String M02 = jb6.M0(2131742478, null);
                                he heVar2 = alertDialog$Builder2.a;
                                heVar2.U = M02;
                                heVar2.S = jb6.M0(2131742479, null);
                                alertDialog$Builder2.j(jb6.M0(2131742480, null), new h5c(p5cVar, (byte) 2));
                                alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                                p5cVar.showDialog(heVar2);
                                TextView textView2 = (TextView) heVar2.c(-1);
                                if (textView2 != null) {
                                    anb.X(textView2, cmb.p7, null);
                                    return;
                                }
                                return;
                            } else if (b5 == 2) {
                                p5cVar.F0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 5:
                        if (p5cVar.P == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.X = true;
                            twoStepVerificationActivity.J = p5cVar.V;
                            twoStepVerificationActivity.K = false;
                            twoStepVerificationActivity.Y = p5cVar.H;
                            p5cVar.presentFragment(twoStepVerificationActivity, true);
                            t56 t56Var = p5cVar.k0;
                            if (t56Var != null) {
                                gm.c3(t56Var);
                                p5cVar.k0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        p5cVar.H0();
                        return;
                }
            }
        });
        ?? imageView = new ImageView(context);
        this.a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        if (b2 == 2 && gm.M1()) {
            this.a.setVisibility(8);
        } else if (b2 != 6 && b2 != 9 && b2 != 7) {
            s09 s09Var = this.a;
            Point point = gm.q;
            if (point.x > point.y) {
                i = 8;
            } else {
                i = 0;
            }
            s09Var.setVisibility(i);
        }
        TextView textView2 = new TextView(context);
        this.c = textView2;
        anb.X(textView2, i4, null);
        this.c.setGravity(1);
        this.c.setPadding(gm.L(32.0f), 0, gm.L(32.0f), 0);
        this.c.setTextSize(1, 24.0f);
        xna xnaVar = new xna(context);
        this.d = xnaVar;
        int i5 = cmb.C6;
        anb.X(xnaVar, i5, null);
        this.d.setGravity(1);
        this.d.setLineSpacing(gm.L(2.0f), 1.0f);
        this.d.setTextSize(1, 15.0f);
        this.d.setVisibility(8);
        this.d.setPadding(gm.L(32.0f), 0, gm.L(32.0f), 0);
        TextView textView3 = new TextView(context);
        this.e = textView3;
        anb.X(textView3, i5, null);
        this.e.setGravity(1);
        this.e.setTextSize(1, 14.0f);
        this.e.setLineSpacing(gm.L(2.0f), 1.0f);
        this.e.setPadding(gm.L(32.0f), 0, gm.L(32.0f), 0);
        this.e.setVisibility(8);
        this.e.setOnClickListener(new View.OnClickListener(this) {
            public final p5c b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b3 = r2;
                p5c p5cVar = this.b;
                switch (b3) {
                    case 0:
                        p5cVar.H0();
                        return;
                    case 1:
                        byte b4 = p5cVar.P;
                        p5cVar.N = true;
                        TransformationMethod transformationMethod = p5cVar.n.getTransformationMethod();
                        EditTextBoldCursor editTextBoldCursor = p5cVar.n;
                        if (transformationMethod == null) {
                            editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            anb.s(p5cVar.F, cmb.Ne, null, PorterDuff.Mode.MULTIPLY);
                            if (b4 == 0 && p5cVar.n.length() > 0 && p5cVar.n.hasFocus()) {
                                p5cVar.g0[3].K(-1);
                                p09 animatedDrawable = p5cVar.a.getAnimatedDrawable();
                                p09 p09Var = p5cVar.g0[3];
                                if (animatedDrawable != p09Var) {
                                    p5cVar.a.setAnimation(p09Var);
                                    p5cVar.g0[3].I(18, false, false);
                                }
                                p5cVar.a.d();
                            }
                        } else {
                            editTextBoldCursor.setTransformationMethod(null);
                            anb.s(p5cVar.F, cmb.Oe, null, PorterDuff.Mode.MULTIPLY);
                            if (b4 == 0 && p5cVar.n.length() > 0 && p5cVar.n.hasFocus()) {
                                p5cVar.g0[3].K(18);
                                p09 animatedDrawable2 = p5cVar.a.getAnimatedDrawable();
                                p09 p09Var2 = p5cVar.g0[3];
                                if (animatedDrawable2 != p09Var2) {
                                    p5cVar.a.setAnimation(p09Var2);
                                }
                                p5cVar.g0[3].O(false, 0.0f);
                                p5cVar.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor2 = p5cVar.n;
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        p5cVar.N = false;
                        return;
                    case 2:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p5cVar.getParentActivity());
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        alertDialog$Builder.j(jb6.M0(2131745851, null), new h5c(p5cVar, (byte) 1));
                        String M0 = jb6.M0(2131745826, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M0;
                        heVar.U = jb6.M0(2131745807, null);
                        p5cVar.showDialog(heVar);
                        return;
                    case 3:
                        p5cVar.n0();
                        return;
                    case 4:
                        if (p5cVar.h.getAlpha() >= 0.5f) {
                            byte b5 = p5cVar.P;
                            if (b5 == 0) {
                                p5cVar.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = p5cVar.b0;
                                p5cVar.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new i5c(p5cVar, (byte) 1));
                                return;
                            } else if (b5 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p5cVar.getParentActivity());
                                String M02 = jb6.M0(2131742478, null);
                                he heVar2 = alertDialog$Builder2.a;
                                heVar2.U = M02;
                                heVar2.S = jb6.M0(2131742479, null);
                                alertDialog$Builder2.j(jb6.M0(2131742480, null), new h5c(p5cVar, (byte) 2));
                                alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                                p5cVar.showDialog(heVar2);
                                TextView textView22 = (TextView) heVar2.c(-1);
                                if (textView22 != null) {
                                    anb.X(textView22, cmb.p7, null);
                                    return;
                                }
                                return;
                            } else if (b5 == 2) {
                                p5cVar.F0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 5:
                        if (p5cVar.P == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.X = true;
                            twoStepVerificationActivity.J = p5cVar.V;
                            twoStepVerificationActivity.K = false;
                            twoStepVerificationActivity.Y = p5cVar.H;
                            p5cVar.presentFragment(twoStepVerificationActivity, true);
                            t56 t56Var = p5cVar.k0;
                            if (t56Var != null) {
                                gm.c3(t56Var);
                                p5cVar.k0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        p5cVar.H0();
                        return;
                }
            }
        });
        TextView textView4 = new TextView(context);
        this.b = textView4;
        textView4.setMinWidth(gm.L(220.0f));
        this.b.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
        this.b.setGravity(17);
        anb.X(this.b, cmb.Ii, null);
        this.b.setTextSize(1, 15.0f);
        this.b.setTypeface(gm.o());
        this.b.setBackground(ulb.f(cmb.Ei, 24.0f));
        this.b.setOnClickListener(new View.OnClickListener(this) {
            public final p5c b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b3 = r2;
                p5c p5cVar = this.b;
                switch (b3) {
                    case 0:
                        p5cVar.H0();
                        return;
                    case 1:
                        byte b4 = p5cVar.P;
                        p5cVar.N = true;
                        TransformationMethod transformationMethod = p5cVar.n.getTransformationMethod();
                        EditTextBoldCursor editTextBoldCursor = p5cVar.n;
                        if (transformationMethod == null) {
                            editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            anb.s(p5cVar.F, cmb.Ne, null, PorterDuff.Mode.MULTIPLY);
                            if (b4 == 0 && p5cVar.n.length() > 0 && p5cVar.n.hasFocus()) {
                                p5cVar.g0[3].K(-1);
                                p09 animatedDrawable = p5cVar.a.getAnimatedDrawable();
                                p09 p09Var = p5cVar.g0[3];
                                if (animatedDrawable != p09Var) {
                                    p5cVar.a.setAnimation(p09Var);
                                    p5cVar.g0[3].I(18, false, false);
                                }
                                p5cVar.a.d();
                            }
                        } else {
                            editTextBoldCursor.setTransformationMethod(null);
                            anb.s(p5cVar.F, cmb.Oe, null, PorterDuff.Mode.MULTIPLY);
                            if (b4 == 0 && p5cVar.n.length() > 0 && p5cVar.n.hasFocus()) {
                                p5cVar.g0[3].K(18);
                                p09 animatedDrawable2 = p5cVar.a.getAnimatedDrawable();
                                p09 p09Var2 = p5cVar.g0[3];
                                if (animatedDrawable2 != p09Var2) {
                                    p5cVar.a.setAnimation(p09Var2);
                                }
                                p5cVar.g0[3].O(false, 0.0f);
                                p5cVar.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor2 = p5cVar.n;
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        p5cVar.N = false;
                        return;
                    case 2:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p5cVar.getParentActivity());
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        alertDialog$Builder.j(jb6.M0(2131745851, null), new h5c(p5cVar, (byte) 1));
                        String M0 = jb6.M0(2131745826, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M0;
                        heVar.U = jb6.M0(2131745807, null);
                        p5cVar.showDialog(heVar);
                        return;
                    case 3:
                        p5cVar.n0();
                        return;
                    case 4:
                        if (p5cVar.h.getAlpha() >= 0.5f) {
                            byte b5 = p5cVar.P;
                            if (b5 == 0) {
                                p5cVar.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = p5cVar.b0;
                                p5cVar.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new i5c(p5cVar, (byte) 1));
                                return;
                            } else if (b5 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p5cVar.getParentActivity());
                                String M02 = jb6.M0(2131742478, null);
                                he heVar2 = alertDialog$Builder2.a;
                                heVar2.U = M02;
                                heVar2.S = jb6.M0(2131742479, null);
                                alertDialog$Builder2.j(jb6.M0(2131742480, null), new h5c(p5cVar, (byte) 2));
                                alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                                p5cVar.showDialog(heVar2);
                                TextView textView22 = (TextView) heVar2.c(-1);
                                if (textView22 != null) {
                                    anb.X(textView22, cmb.p7, null);
                                    return;
                                }
                                return;
                            } else if (b5 == 2) {
                                p5cVar.F0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 5:
                        if (p5cVar.P == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.X = true;
                            twoStepVerificationActivity.J = p5cVar.V;
                            twoStepVerificationActivity.K = false;
                            twoStepVerificationActivity.Y = p5cVar.H;
                            p5cVar.presentFragment(twoStepVerificationActivity, true);
                            t56 t56Var = p5cVar.k0;
                            if (t56Var != null) {
                                gm.c3(t56Var);
                                p5cVar.k0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        p5cVar.H0();
                        return;
                }
            }
        });
        if (b2 != 6 && b2 != 7 && b2 != 9) {
            this.c.setTypeface(gm.o());
            this.c.setTextSize(1, 18.0f);
        } else {
            this.c.setTypeface(Typeface.DEFAULT);
            this.c.setTextSize(1, 24.0f);
        }
        switch (b2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                c = 5;
                bdb bdbVar = new bdb((byte) 4, context, this);
                jx7 jx7Var = new jx7(this, context, bdbVar, (byte) 1);
                jx7Var.addView(bdbVar);
                ib1 ib1Var = new ib1(this, context, jx7Var);
                o5c o5cVar = new o5c(this, context);
                this.y = o5cVar;
                o5cVar.setVerticalScrollBarEnabled(false);
                bdbVar.addView(this.y, qoe.c(-1.0f, -1));
                bdbVar.addView(this.h, qoe.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                bdbVar.addView(this.d0, wp4.b());
                ib1Var.addView(jx7Var, qoe.c(-1.0f, -1));
                qmb qmbVar = new qmb((byte) 22, context, this);
                qmbVar.setOrientation(1);
                this.y.addView(qmbVar, qoe.x(-1, -1, 51));
                qmbVar.addView(this.a, qoe.t(-2, -2, 49, 0, 69, 0, 0));
                qmbVar.addView(this.c, qoe.t(-2, -2, 49, 0, 8, 0, 0));
                qmbVar.addView(this.d, qoe.t(-2, -2, 49, 0, 9, 0, 0));
                gt7 gt7Var = new gt7(context, null);
                this.s = gt7Var;
                gt7Var.b(1.0f, 1.0f, false);
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.n = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                int L = gm.L(16.0f);
                this.n.setPadding(L, L, L, L);
                EditTextBoldCursor editTextBoldCursor2 = this.n;
                int i6 = cmb.k6;
                anb.v(editTextBoldCursor2, i6, null);
                anb.X(this.n, i4, null);
                this.n.setBackground(null);
                this.n.setMaxLines(1);
                this.n.setLines(1);
                this.n.setGravity(3);
                this.n.setCursorSize(gm.L(20.0f));
                this.n.setSingleLine(true);
                this.n.setCursorWidth(1.5f);
                this.n.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final p5c b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i7, KeyEvent keyEvent) {
                        byte b3 = r2;
                        p5c p5cVar = this.b;
                        switch (b3) {
                            case 0:
                                if (i7 != 5 && i7 != 6) {
                                    return false;
                                }
                                p5cVar.H0();
                                return true;
                            default:
                                if (i7 != 5 && i7 != 6) {
                                    return false;
                                }
                                if (p5cVar.w.getVisibility() == 0) {
                                    p5cVar.r.requestFocus();
                                } else {
                                    p5cVar.H0();
                                }
                                return true;
                        }
                    }
                });
                this.s.e(this.n);
                this.n.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final p5c b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z3) {
                        byte b3 = r2;
                        float f = 0.0f;
                        p5c p5cVar = this.b;
                        switch (b3) {
                            case 0:
                                gt7 gt7Var2 = p5cVar.w;
                                if (z3) {
                                    f = 1.0f;
                                }
                                gt7Var2.b(f, f, true);
                                return;
                            case 1:
                                if (z3) {
                                    p5cVar.f0.setEditText((EditText) view);
                                    p5cVar.f0.setDispatchBackWhenEmpty(true);
                                    return;
                                }
                                return;
                            default:
                                gt7 gt7Var3 = p5cVar.s;
                                if (z3) {
                                    f = 1.0f;
                                }
                                gt7Var3.b(f, f, true);
                                return;
                        }
                    }
                });
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.addView(this.n, qoe.l(1.0f, 0, -2));
                c7 c7Var = new c7((byte) 4, context, this);
                this.F = c7Var;
                c7Var.setImageResource(2131232230);
                this.F.setScaleType(scaleType);
                this.F.setContentDescription(jb6.M0(2131743619, null));
                c7 c7Var2 = this.F;
                int i7 = cmb.h6;
                anb.R(c7Var2, cmb.f0(cmb.w0(null, i7, false), 1, -1), null, anb.M(i7), null);
                anb.s(this.F, cmb.Ne, null, PorterDuff.Mode.MULTIPLY);
                gm.T3(this.F, false, 0.1f, true, false);
                this.F.setOnClickListener(new View.OnClickListener(this) {
                    public final p5c b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b3 = r2;
                        p5c p5cVar = this.b;
                        switch (b3) {
                            case 0:
                                p5cVar.H0();
                                return;
                            case 1:
                                byte b4 = p5cVar.P;
                                p5cVar.N = true;
                                TransformationMethod transformationMethod = p5cVar.n.getTransformationMethod();
                                EditTextBoldCursor editTextBoldCursor3 = p5cVar.n;
                                if (transformationMethod == null) {
                                    editTextBoldCursor3.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    anb.s(p5cVar.F, cmb.Ne, null, PorterDuff.Mode.MULTIPLY);
                                    if (b4 == 0 && p5cVar.n.length() > 0 && p5cVar.n.hasFocus()) {
                                        p5cVar.g0[3].K(-1);
                                        p09 animatedDrawable = p5cVar.a.getAnimatedDrawable();
                                        p09 p09Var = p5cVar.g0[3];
                                        if (animatedDrawable != p09Var) {
                                            p5cVar.a.setAnimation(p09Var);
                                            p5cVar.g0[3].I(18, false, false);
                                        }
                                        p5cVar.a.d();
                                    }
                                } else {
                                    editTextBoldCursor3.setTransformationMethod(null);
                                    anb.s(p5cVar.F, cmb.Oe, null, PorterDuff.Mode.MULTIPLY);
                                    if (b4 == 0 && p5cVar.n.length() > 0 && p5cVar.n.hasFocus()) {
                                        p5cVar.g0[3].K(18);
                                        p09 animatedDrawable2 = p5cVar.a.getAnimatedDrawable();
                                        p09 p09Var2 = p5cVar.g0[3];
                                        if (animatedDrawable2 != p09Var2) {
                                            p5cVar.a.setAnimation(p09Var2);
                                        }
                                        p5cVar.g0[3].O(false, 0.0f);
                                        p5cVar.a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor22 = p5cVar.n;
                                editTextBoldCursor22.setSelection(editTextBoldCursor22.length());
                                p5cVar.N = false;
                                return;
                            case 2:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p5cVar.getParentActivity());
                                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                alertDialog$Builder.j(jb6.M0(2131745851, null), new h5c(p5cVar, (byte) 1));
                                String M0 = jb6.M0(2131745826, null);
                                he heVar = alertDialog$Builder.a;
                                heVar.S = M0;
                                heVar.U = jb6.M0(2131745807, null);
                                p5cVar.showDialog(heVar);
                                return;
                            case 3:
                                p5cVar.n0();
                                return;
                            case 4:
                                if (p5cVar.h.getAlpha() >= 0.5f) {
                                    byte b5 = p5cVar.P;
                                    if (b5 == 0) {
                                        p5cVar.C0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = p5cVar.b0;
                                        p5cVar.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new i5c(p5cVar, (byte) 1));
                                        return;
                                    } else if (b5 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p5cVar.getParentActivity());
                                        String M02 = jb6.M0(2131742478, null);
                                        he heVar2 = alertDialog$Builder2.a;
                                        heVar2.U = M02;
                                        heVar2.S = jb6.M0(2131742479, null);
                                        alertDialog$Builder2.j(jb6.M0(2131742480, null), new h5c(p5cVar, (byte) 2));
                                        alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                                        p5cVar.showDialog(heVar2);
                                        TextView textView22 = (TextView) heVar2.c(-1);
                                        if (textView22 != null) {
                                            anb.X(textView22, cmb.p7, null);
                                            return;
                                        }
                                        return;
                                    } else if (b5 == 2) {
                                        p5cVar.F0();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            case 5:
                                if (p5cVar.P == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.X = true;
                                    twoStepVerificationActivity.J = p5cVar.V;
                                    twoStepVerificationActivity.K = false;
                                    twoStepVerificationActivity.Y = p5cVar.H;
                                    p5cVar.presentFragment(twoStepVerificationActivity, true);
                                    t56 t56Var = p5cVar.k0;
                                    if (t56Var != null) {
                                        gm.c3(t56Var);
                                        p5cVar.k0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                p5cVar.H0();
                                return;
                        }
                    }
                });
                linearLayout.addView(this.F, qoe.t(24, 24, 16, 0, 0, 16, 0));
                this.n.addTextChangedListener(new m5c(this, (byte) 1));
                this.s.addView(linearLayout, qoe.c(-2.0f, -1));
                qmbVar.addView(this.s, qoe.d(-1, -2.0f, 49, 24.0f, 32.0f, 24.0f, 32.0f));
                this.w = new gt7(context, null);
                EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
                this.r = editTextBoldCursor3;
                editTextBoldCursor3.setTextSize(1, 18.0f);
                int L2 = gm.L(16.0f);
                this.r.setPadding(L2, L2, L2, L2);
                anb.v(this.r, i6, null);
                anb.X(this.r, i4, null);
                this.r.setBackground(null);
                this.r.setMaxLines(1);
                this.r.setLines(1);
                this.r.setGravity(3);
                this.r.setCursorSize(gm.L(20.0f));
                this.r.setSingleLine(true);
                this.r.setCursorWidth(1.5f);
                this.r.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final p5c b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i72, KeyEvent keyEvent) {
                        byte b3 = r2;
                        p5c p5cVar = this.b;
                        switch (b3) {
                            case 0:
                                if (i72 != 5 && i72 != 6) {
                                    return false;
                                }
                                p5cVar.H0();
                                return true;
                            default:
                                if (i72 != 5 && i72 != 6) {
                                    return false;
                                }
                                if (p5cVar.w.getVisibility() == 0) {
                                    p5cVar.r.requestFocus();
                                } else {
                                    p5cVar.H0();
                                }
                                return true;
                        }
                    }
                });
                this.w.e(this.r);
                this.r.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final p5c b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z3) {
                        byte b3 = r2;
                        float f = 0.0f;
                        p5c p5cVar = this.b;
                        switch (b3) {
                            case 0:
                                gt7 gt7Var2 = p5cVar.w;
                                if (z3) {
                                    f = 1.0f;
                                }
                                gt7Var2.b(f, f, true);
                                return;
                            case 1:
                                if (z3) {
                                    p5cVar.f0.setEditText((EditText) view);
                                    p5cVar.f0.setDispatchBackWhenEmpty(true);
                                    return;
                                }
                                return;
                            default:
                                gt7 gt7Var3 = p5cVar.s;
                                if (z3) {
                                    f = 1.0f;
                                }
                                gt7Var3.b(f, f, true);
                                return;
                        }
                    }
                });
                this.w.addView(this.r, qoe.c(-2.0f, -1));
                qmbVar.addView(this.w, qoe.d(-1, -2.0f, 49, 24.0f, 16.0f, 24.0f, 0.0f));
                this.w.setVisibility(8);
                d63 d63Var = new d63(context);
                this.f0 = d63Var;
                d63Var.setVisibility(8);
                jx7Var.addView(this.f0);
                xe6 xe6Var = new xe6((byte) 3, context, this);
                this.x = xe6Var;
                final byte b3 = 1;
                xe6Var.b(6, 1);
                gl2[] gl2VarArr = this.x.f;
                int length = gl2VarArr.length;
                int i8 = 0;
                while (i8 < length) {
                    gl2 gl2Var = gl2VarArr[i8];
                    gl2Var.setShowSoftInputOnFocusCompat(m0() ^ b3);
                    gl2Var.addTextChangedListener(new ej1(this));
                    gl2Var.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                        public final p5c b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onFocusChange(View view, boolean z3) {
                            byte b32 = b3;
                            float f = 0.0f;
                            p5c p5cVar = this.b;
                            switch (b32) {
                                case 0:
                                    gt7 gt7Var2 = p5cVar.w;
                                    if (z3) {
                                        f = 1.0f;
                                    }
                                    gt7Var2.b(f, f, true);
                                    return;
                                case 1:
                                    if (z3) {
                                        p5cVar.f0.setEditText((EditText) view);
                                        p5cVar.f0.setDispatchBackWhenEmpty(true);
                                        return;
                                    }
                                    return;
                                default:
                                    gt7 gt7Var3 = p5cVar.s;
                                    if (z3) {
                                        f = 1.0f;
                                    }
                                    gt7Var3.b(f, f, true);
                                    return;
                            }
                        }
                    });
                    i8++;
                    b3 = 1;
                }
                this.x.setVisibility(8);
                qmbVar.addView(this.x, qoe.t(-2, -2, 1, 0, 32, 0, 0));
                FrameLayout frameLayout = new FrameLayout(context);
                qmbVar.addView(frameLayout, qoe.t(-1, -2, 51, 0, 36, 0, 22));
                frameLayout.addView(this.e, qoe.e(-2, -2, 49));
                if (b2 == 4) {
                    TextView textView5 = new TextView(context);
                    this.f = textView5;
                    anb.X(textView5, cmb.I6, null);
                    this.f.setGravity(1);
                    this.f.setTextSize(1, 14.0f);
                    this.f.setLineSpacing(gm.L(2.0f), 1.0f);
                    this.f.setPadding(gm.L(32.0f), 0, gm.L(32.0f), 0);
                    this.f.setText(jb6.M0(2131745809, null));
                    qmbVar.addView(this.f, qoe.t(-2, -2, 49, 0, 0, 0, 25));
                    this.f.setOnClickListener(new View.OnClickListener(this) {
                        public final p5c b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            byte b32 = r2;
                            p5c p5cVar = this.b;
                            switch (b32) {
                                case 0:
                                    p5cVar.H0();
                                    return;
                                case 1:
                                    byte b4 = p5cVar.P;
                                    p5cVar.N = true;
                                    TransformationMethod transformationMethod = p5cVar.n.getTransformationMethod();
                                    EditTextBoldCursor editTextBoldCursor32 = p5cVar.n;
                                    if (transformationMethod == null) {
                                        editTextBoldCursor32.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                        anb.s(p5cVar.F, cmb.Ne, null, PorterDuff.Mode.MULTIPLY);
                                        if (b4 == 0 && p5cVar.n.length() > 0 && p5cVar.n.hasFocus()) {
                                            p5cVar.g0[3].K(-1);
                                            p09 animatedDrawable = p5cVar.a.getAnimatedDrawable();
                                            p09 p09Var = p5cVar.g0[3];
                                            if (animatedDrawable != p09Var) {
                                                p5cVar.a.setAnimation(p09Var);
                                                p5cVar.g0[3].I(18, false, false);
                                            }
                                            p5cVar.a.d();
                                        }
                                    } else {
                                        editTextBoldCursor32.setTransformationMethod(null);
                                        anb.s(p5cVar.F, cmb.Oe, null, PorterDuff.Mode.MULTIPLY);
                                        if (b4 == 0 && p5cVar.n.length() > 0 && p5cVar.n.hasFocus()) {
                                            p5cVar.g0[3].K(18);
                                            p09 animatedDrawable2 = p5cVar.a.getAnimatedDrawable();
                                            p09 p09Var2 = p5cVar.g0[3];
                                            if (animatedDrawable2 != p09Var2) {
                                                p5cVar.a.setAnimation(p09Var2);
                                            }
                                            p5cVar.g0[3].O(false, 0.0f);
                                            p5cVar.a.d();
                                        }
                                    }
                                    EditTextBoldCursor editTextBoldCursor22 = p5cVar.n;
                                    editTextBoldCursor22.setSelection(editTextBoldCursor22.length());
                                    p5cVar.N = false;
                                    return;
                                case 2:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p5cVar.getParentActivity());
                                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                    alertDialog$Builder.j(jb6.M0(2131745851, null), new h5c(p5cVar, (byte) 1));
                                    String M0 = jb6.M0(2131745826, null);
                                    he heVar = alertDialog$Builder.a;
                                    heVar.S = M0;
                                    heVar.U = jb6.M0(2131745807, null);
                                    p5cVar.showDialog(heVar);
                                    return;
                                case 3:
                                    p5cVar.n0();
                                    return;
                                case 4:
                                    if (p5cVar.h.getAlpha() >= 0.5f) {
                                        byte b5 = p5cVar.P;
                                        if (b5 == 0) {
                                            p5cVar.C0();
                                            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                            tL_auth_recoverPassword.code = p5cVar.b0;
                                            p5cVar.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new i5c(p5cVar, (byte) 1));
                                            return;
                                        } else if (b5 == 3) {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p5cVar.getParentActivity());
                                            String M02 = jb6.M0(2131742478, null);
                                            he heVar2 = alertDialog$Builder2.a;
                                            heVar2.U = M02;
                                            heVar2.S = jb6.M0(2131742479, null);
                                            alertDialog$Builder2.j(jb6.M0(2131742480, null), new h5c(p5cVar, (byte) 2));
                                            alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                                            p5cVar.showDialog(heVar2);
                                            TextView textView22 = (TextView) heVar2.c(-1);
                                            if (textView22 != null) {
                                                anb.X(textView22, cmb.p7, null);
                                                return;
                                            }
                                            return;
                                        } else if (b5 == 2) {
                                            p5cVar.F0();
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    return;
                                case 5:
                                    if (p5cVar.P == 8) {
                                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                        twoStepVerificationActivity.X = true;
                                        twoStepVerificationActivity.J = p5cVar.V;
                                        twoStepVerificationActivity.K = false;
                                        twoStepVerificationActivity.Y = p5cVar.H;
                                        p5cVar.presentFragment(twoStepVerificationActivity, true);
                                        t56 t56Var = p5cVar.k0;
                                        if (t56Var != null) {
                                            gm.c3(t56Var);
                                            p5cVar.k0 = null;
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    p5cVar.H0();
                                    return;
                            }
                        }
                    });
                }
                this.fragmentView = ib1Var;
                a91 a91Var = new a91(this, context);
                this.E = a91Var;
                a91Var.setAlpha(0.0f);
                ib1Var.addView(this.E);
                ib1Var.addView(this.actionBar);
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                this.M = radialProgressView;
                radialProgressView.setSize(gm.L(20.0f));
                this.M.setAlpha(0.0f);
                this.M.setScaleX(0.1f);
                this.M.setScaleY(0.1f);
                this.M.setProgressColor(cmb.w0(null, cmb.k6, false));
                bdbVar.addView(this.M, qoe.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                break;
            case 6:
            case 7:
            case 9:
                s8 s8Var = new s8((byte) 2, context, this);
                s8Var.setOnTouchListener(new xob((byte) 3));
                s8Var.addView(this.actionBar);
                s8Var.addView(this.a);
                s8Var.addView(this.c);
                s8Var.addView(this.d);
                s8Var.addView(this.b);
                this.fragmentView = s8Var;
            default:
                c = 5;
                break;
        }
        anb.h(cmb.c6, null, this.fragmentView);
        String str = "";
        switch (b2) {
            case 0:
            case 1:
                int i9 = 2131746146;
                if (this.V.has_password) {
                    this.actionBar.setTitle(jb6.M0(2131746944, null));
                    this.c.setText(jb6.M0(2131746944, null));
                } else {
                    if (b2 == 0) {
                        i2 = 2131751642;
                    } else {
                        i2 = 2131746146;
                    }
                    String M0 = jb6.M0(i2, null);
                    this.actionBar.setTitle(M0);
                    this.c.setText(M0);
                }
                if (!TextUtils.isEmpty(this.b0)) {
                    this.h.setVisibility(0);
                    this.h.setText(jb6.M0(2131742480, null));
                }
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                gt7 gt7Var2 = this.s;
                if (b2 == 0) {
                    i3 = 2131751053;
                } else {
                    i3 = 2131746146;
                }
                gt7Var2.setText(jb6.M0(i3, null));
                EditTextBoldCursor editTextBoldCursor4 = this.n;
                if (b2 == 0) {
                    i9 = 2131751053;
                }
                editTextBoldCursor4.setContentDescription(jb6.M0(i9, null));
                this.n.setImeOptions(268435461);
                this.n.setInputType(129);
                this.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.n.setTypeface(Typeface.DEFAULT);
                if (b2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.G = z;
                gm.T3(this.F, false, 0.1f, true, false);
                p09[] p09VarArr = new p09[7];
                this.g0 = p09VarArr;
                p09VarArr[0] = new p09(2131624305, gm.L(120.0f), gm.L(120.0f), true, null);
                this.g0[1] = new p09(2131624306, gm.L(120.0f), gm.L(120.0f), true, null);
                this.g0[2] = new p09(2131624298, gm.L(120.0f), gm.L(120.0f), true, null);
                this.g0[3] = new p09(2131624307, gm.L(120.0f), gm.L(120.0f), true, null);
                this.g0[4] = new p09(2131624304, gm.L(120.0f), gm.L(120.0f), true, null);
                this.g0[c] = new p09(2131624303, gm.L(120.0f), gm.L(120.0f), true, null);
                this.g0[6] = new p09(2131624308, gm.L(120.0f), gm.L(120.0f), true, null);
                p09 p09Var = this.g0[6];
                p09Var.h = true;
                p09Var.K(19);
                this.g0[2].N(97, this.j0);
                K0(true);
                if (b2 == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    g5c g5cVar = this.h0;
                    if (g5cVar != null) {
                        gm.r(g5cVar);
                    }
                    this.a.setAnimation(this.g0[6]);
                    this.a.d();
                    b = 0;
                    break;
                } else {
                    EditTextBoldCursor editTextBoldCursor5 = this.n;
                    ArrayList arrayList = editTextBoldCursor5.g1;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        TextWatcher textWatcher = (TextWatcher) obj;
                        textWatcher.beforeTextChanged("", 0, editTextBoldCursor5.length(), editTextBoldCursor5.length());
                        textWatcher.onTextChanged(editTextBoldCursor5.getText(), 0, editTextBoldCursor5.length(), editTextBoldCursor5.length());
                        textWatcher.afterTextChanged(editTextBoldCursor5.getText());
                    }
                    b = 0;
                    K0(true);
                    break;
                }
            case 2:
                this.actionBar.setTitle(jb6.M0(2131747177, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.h.setVisibility(0);
                this.h.setText(jb6.M0(2131742480, null));
                this.c.setText(jb6.M0(2131747177, null));
                this.d.setText(jb6.M0(2131747176, null));
                this.d.setVisibility(0);
                this.s.setText(jb6.M0(2131747175, null));
                this.n.setContentDescription(jb6.M0(2131747175, null));
                this.n.setImeOptions(268435461);
                this.w.setVisibility(8);
                this.a.f(2131624300, 120, 120, null);
                this.a.d();
                b = 0;
                break;
            case 3:
                this.actionBar.setTitle(jb6.M0(2131746077, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                if (!this.a0) {
                    this.h.setVisibility(0);
                    this.h.setAlpha(0.0f);
                    r12 = 0;
                    this.h.setText(jb6.M0(2131742480, null));
                } else {
                    r12 = 0;
                }
                this.c.setText(jb6.M0(2131746077, r12));
                this.d.setText(jb6.M0(2131746078, r12));
                this.d.setVisibility(0);
                this.s.setText(jb6.M0(2131747109, r12));
                this.n.setContentDescription(jb6.M0(2131747109, r12));
                this.n.setImeOptions(268435461);
                this.n.setInputType(33);
                this.w.setVisibility(8);
                this.a.f(2131624299, 120, 120, r12);
                this.a.d();
                b = 0;
                break;
            case 4:
                this.actionBar.setTitle(jb6.M0(2131747170, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.c.setText(jb6.M0(2131747170, null));
                this.f0.setVisibility(0);
                this.s.setVisibility(8);
                String str2 = this.V.email_unconfirmed_pattern;
                if (str2 != null) {
                    str = str2;
                }
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                int indexOf = str.indexOf(42);
                int lastIndexOf = str.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj2 = new Object();
                    obj2.a |= 256;
                    obj2.b = indexOf;
                    int i11 = lastIndexOf + 1;
                    obj2.c = i11;
                    r10 = 0;
                    valueOf.setSpan(new xkb(obj2, 0), indexOf, i11, 0);
                } else {
                    r10 = 0;
                }
                xna xnaVar2 = this.d;
                String M02 = jb6.M0(2131745813, null);
                CharSequence[] charSequenceArr = new CharSequence[1];
                charSequenceArr[r10] = valueOf;
                xnaVar2.setText(gm.m0(M02, charSequenceArr));
                this.d.setVisibility(r10);
                this.d0.e(r10, r10);
                this.x.setVisibility(r10);
                this.a.f(2131624302, 120, 120, null);
                this.a.d();
                b = 0;
                break;
            case 5:
                this.actionBar.setTitle(jb6.M0(2131743306, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.c.setText(jb6.M0(2131743306, null));
                this.s.setVisibility(8);
                this.f0.setVisibility(0);
                xna xnaVar3 = this.d;
                String str3 = this.V.email_unconfirmed_pattern;
                if (str3 != null) {
                    str = str3;
                }
                xnaVar3.setText(jb6.a0("EmailPasswordConfirmText2", null, 2131751136, str));
                this.d.setVisibility(0);
                this.d0.e(false, false);
                this.h.setVisibility(0);
                this.h.setGravity(17);
                ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).bottomMargin = 0;
                this.h.setText(jb6.M0(2131745854, null));
                this.h.setOnClickListener(new View.OnClickListener(this) {
                    public final p5c b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b32 = r2;
                        p5c p5cVar = this.b;
                        switch (b32) {
                            case 0:
                                p5cVar.H0();
                                return;
                            case 1:
                                byte b4 = p5cVar.P;
                                p5cVar.N = true;
                                TransformationMethod transformationMethod = p5cVar.n.getTransformationMethod();
                                EditTextBoldCursor editTextBoldCursor32 = p5cVar.n;
                                if (transformationMethod == null) {
                                    editTextBoldCursor32.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    anb.s(p5cVar.F, cmb.Ne, null, PorterDuff.Mode.MULTIPLY);
                                    if (b4 == 0 && p5cVar.n.length() > 0 && p5cVar.n.hasFocus()) {
                                        p5cVar.g0[3].K(-1);
                                        p09 animatedDrawable = p5cVar.a.getAnimatedDrawable();
                                        p09 p09Var2 = p5cVar.g0[3];
                                        if (animatedDrawable != p09Var2) {
                                            p5cVar.a.setAnimation(p09Var2);
                                            p5cVar.g0[3].I(18, false, false);
                                        }
                                        p5cVar.a.d();
                                    }
                                } else {
                                    editTextBoldCursor32.setTransformationMethod(null);
                                    anb.s(p5cVar.F, cmb.Oe, null, PorterDuff.Mode.MULTIPLY);
                                    if (b4 == 0 && p5cVar.n.length() > 0 && p5cVar.n.hasFocus()) {
                                        p5cVar.g0[3].K(18);
                                        p09 animatedDrawable2 = p5cVar.a.getAnimatedDrawable();
                                        p09 p09Var22 = p5cVar.g0[3];
                                        if (animatedDrawable2 != p09Var22) {
                                            p5cVar.a.setAnimation(p09Var22);
                                        }
                                        p5cVar.g0[3].O(false, 0.0f);
                                        p5cVar.a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor22 = p5cVar.n;
                                editTextBoldCursor22.setSelection(editTextBoldCursor22.length());
                                p5cVar.N = false;
                                return;
                            case 2:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p5cVar.getParentActivity());
                                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                alertDialog$Builder.j(jb6.M0(2131745851, null), new h5c(p5cVar, (byte) 1));
                                String M03 = jb6.M0(2131745826, null);
                                he heVar = alertDialog$Builder.a;
                                heVar.S = M03;
                                heVar.U = jb6.M0(2131745807, null);
                                p5cVar.showDialog(heVar);
                                return;
                            case 3:
                                p5cVar.n0();
                                return;
                            case 4:
                                if (p5cVar.h.getAlpha() >= 0.5f) {
                                    byte b5 = p5cVar.P;
                                    if (b5 == 0) {
                                        p5cVar.C0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = p5cVar.b0;
                                        p5cVar.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new i5c(p5cVar, (byte) 1));
                                        return;
                                    } else if (b5 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p5cVar.getParentActivity());
                                        String M022 = jb6.M0(2131742478, null);
                                        he heVar2 = alertDialog$Builder2.a;
                                        heVar2.U = M022;
                                        heVar2.S = jb6.M0(2131742479, null);
                                        alertDialog$Builder2.j(jb6.M0(2131742480, null), new h5c(p5cVar, (byte) 2));
                                        alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                                        p5cVar.showDialog(heVar2);
                                        TextView textView22 = (TextView) heVar2.c(-1);
                                        if (textView22 != null) {
                                            anb.X(textView22, cmb.p7, null);
                                            return;
                                        }
                                        return;
                                    } else if (b5 == 2) {
                                        p5cVar.F0();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            case 5:
                                if (p5cVar.P == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.X = true;
                                    twoStepVerificationActivity.J = p5cVar.V;
                                    twoStepVerificationActivity.K = false;
                                    twoStepVerificationActivity.Y = p5cVar.H;
                                    p5cVar.presentFragment(twoStepVerificationActivity, true);
                                    t56 t56Var = p5cVar.k0;
                                    if (t56Var != null) {
                                        gm.c3(t56Var);
                                        p5cVar.k0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                p5cVar.H0();
                                return;
                        }
                    }
                });
                this.x.setVisibility(0);
                this.a.f(2131624302, 120, 120, null);
                this.a.d();
                b = 0;
                break;
            case 6:
                this.c.setText(jb6.M0(2131743618, null));
                this.d.setText(jb6.M0(2131745282, null));
                this.b.setText(jb6.M0(2131743620, null));
                this.d.setVisibility(0);
                this.a.f(2131624301, 140, 140, null);
                this.a.d();
                b = 0;
                break;
            case 7:
                this.c.setText(jb6.M0(2131743622, null));
                this.d.setText(jb6.M0(2131743621, null));
                if (this.Z) {
                    this.b.setText(jb6.M0(2131743624, null));
                } else {
                    boolean z3 = this.I;
                    TextView textView6 = this.b;
                    if (z3) {
                        textView6.setText(jb6.M0(2131751708, null));
                    } else {
                        textView6.setText(jb6.M0(2131743623, null));
                    }
                }
                this.d.setVisibility(0);
                this.a.f(2131624349, 160, 160, null);
                this.a.d();
                b = 0;
                break;
            case 8:
                this.actionBar.setTitle(jb6.M0(2131746950, null));
                this.c.setText(jb6.M0(2131746950, null));
                this.d.setText(jb6.M0(2131752097, null));
                this.d.setVisibility(0);
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.e.setText(jb6.M0(2131750523, null));
                anb.X(this.e, cmb.n6, null);
                this.s.setText(jb6.M0(2131748483, null));
                this.n.setContentDescription(jb6.M0(2131748483, null));
                this.n.setImeOptions(268435462);
                this.n.setInputType(129);
                this.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.n.setTypeface(Typeface.DEFAULT);
                this.a.f(2131624355, 120, 120, null);
                this.a.d();
                b = 0;
                break;
            case 9:
                this.c.setText(jb6.M0(2131752096, null));
                this.d.setText(jb6.M0(2131752095, null));
                this.b.setText(jb6.M0(2131752098, null));
                this.d.setVisibility(0);
                this.a.f(2131624354, 140, 140, null);
                this.a.d();
                b = 0;
                break;
            default:
                b = 0;
                break;
        }
        EditTextBoldCursor editTextBoldCursor6 = this.n;
        if (editTextBoldCursor6 != null) {
            editTextBoldCursor6.addTextChangedListener(new m5c(this, b));
        }
        return this.fragmentView;
    }

    @Override
    public final boolean finishFragment(boolean z) {
        for (d dVar : getParentLayout().getFragmentStack()) {
            if (dVar != this && (dVar instanceof p5c)) {
                ((ccc) ((p5c) dVar).c0.b).b = true;
            }
        }
        return super.finishFragment(z);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Z6));
        arrayList.add(new cnb(this.c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.C6));
        arrayList.add(new cnb(this.n, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.G6));
        arrayList.add(new cnb(this.n, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.j6));
        arrayList.add(new cnb(this.n, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.k6));
        return arrayList;
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        byte b = this.P;
        if (b != 7 && b != 9) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (on2.h(cmb.w0(null, cmb.c6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.H >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void l0(Runnable runnable) {
        int i = 0;
        while (true) {
            xe6 xe6Var = this.x;
            gl2[] gl2VarArr = xe6Var.f;
            if (i < gl2VarArr.length) {
                gl2 gl2Var = gl2VarArr[i];
                gl2Var.postDelayed(new ix7(gl2Var, (byte) 1), i * 75);
                i++;
            } else {
                xe6Var.postDelayed(new x4c(this, runnable, (byte) 3), (gl2VarArr.length * 75) + 350);
                return;
            }
        }
    }

    public final boolean m0() {
        byte b = this.P;
        if ((b == 5 || b == 4) && !gm.O1()) {
            Point point = gm.q;
            if (point.x < point.y && !gm.A1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void n0() {
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new nf2((byte) 0));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = jb6.M0(2131745853, null);
        he heVar = alertDialog$Builder.a;
        heVar.U = M0;
        heVar.S = jb6.M0(2131743618, null);
        alertDialog$Builder.j(jb6.M0(2131747564, null), null);
        showDialog(heVar);
    }

    public final void o0() {
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((d) arrayList.get(i)).removeSelfFromStack();
        }
        nm7.f(this.currentAccount).k(nm7.p0, new Object[0]);
        finishFragment();
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (this.H >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            if (z) {
                N0();
                return false;
            }
            return false;
        }
        if (z) {
            finishFragment();
        }
        return true;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        int i2 = 0;
        if (this.a != null) {
            byte b = this.P;
            if (b == 2 && gm.M1()) {
                this.a.setVisibility(8);
            } else if (b != 6 && b != 9 && b != 7) {
                s09 s09Var = this.a;
                Point point = gm.q;
                if (point.x > point.y) {
                    i = 8;
                } else {
                    i = 0;
                }
                s09Var.setVisibility(i);
            }
        }
        d63 d63Var = this.f0;
        if (d63Var != null) {
            if (!m0()) {
                i2 = 8;
            }
            d63Var.setVisibility(i2);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.O = false;
        g5c g5cVar = this.h0;
        if (g5cVar != null) {
            gm.r(g5cVar);
            this.h0 = null;
        }
        if (this.g0 != null) {
            int i = 0;
            while (true) {
                p09[] p09VarArr = this.g0;
                if (i >= p09VarArr.length) {
                    break;
                }
                p09VarArr[i].x(false);
                i++;
            }
            this.g0 = null;
        }
        gm.y2(getParentActivity(), this.classGuid);
        if (m0()) {
            gm.z2(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.T = true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.T = false;
        gm.V2(getParentActivity(), this.classGuid);
        if (m0()) {
            gm.W2(getParentActivity(), this.classGuid);
            gm.t1(this.fragmentView);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            x0c x0cVar = this.e0;
            if (x0cVar != null) {
                x0cVar.setColor(cmb.w0(null, cmb.N9, false));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        try {
            int w0 = cmb.w0(null, cmb.k6, false);
            RadialProgressView radialProgressView = this.M;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(w0);
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            if (this.n != null && !m0()) {
                gm.d3(new g5c(this, (byte) 2), 200L);
            }
            xe6 xe6Var = this.x;
            if (xe6Var != null && xe6Var.getVisibility() == 0) {
                gm.d3(new g5c(this, (byte) 3), 200L);
            }
        }
    }

    public final void p0(TLObject tLObject, TLRPC.TL_error tL_error) {
        String str;
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.V = password;
            if (!TwoStepVerificationActivity.b0(password, false)) {
                ik.u0(getParentActivity(), jb6.M0(2131743507, null), true);
                return;
            }
            this.U = !TextUtils.isEmpty(this.V.email_unconfirmed_pattern);
            TwoStepVerificationActivity.f0(this.V);
            if (!this.T && this.Z) {
                TL_account.Password password2 = this.V;
                if (password2.has_password) {
                    TLRPC.PasswordKdfAlgo passwordKdfAlgo = password2.current_algo;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password2.new_secure_algo;
                    byte[] bArr = password2.secure_random;
                    if (password2.has_recovery) {
                        str = "1";
                    } else {
                        str = null;
                    }
                    String str2 = password2.hint;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (!this.U && passwordKdfAlgo != null) {
                        nm7.f(this.currentAccount).k(nm7.p0, null, passwordKdfAlgo, securePasswordKdfAlgo, bArr, str, str2, null, null);
                        finishFragment();
                    }
                }
            }
            if (this.O) {
                B0();
                H0();
            }
            nm7.f(this.currentAccount).k(nm7.q0, this.V);
        }
    }

    public final void q0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.V = password;
            TwoStepVerificationActivity.f0(password);
            nm7.f(this.currentAccount).k(nm7.q0, this.V);
            H0();
        }
    }

    public final void r0(TLRPC.TL_error tL_error) {
        String G;
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new i5c(this, (byte) 4), 8);
            return;
        }
        B0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            this.d.setText(jb6.M0(2131752094, null));
            anb.X(this.d, cmb.o7, null);
            E0(this.s, this.n, true);
            M0(false);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.z(tL_error.text).intValue();
            if (intValue < 60) {
                G = jb6.G(intValue, "Seconds", new Object[0]);
            } else {
                G = jb6.G(intValue / 60, "Minutes", new Object[0]);
            }
            L0(jb6.M0(2131689472, null), jb6.a0("FloodWaitTime", null, 2131750618, G));
        } else {
            L0(jb6.M0(2131689472, null), tL_error.text);
        }
    }

    public final void s0(byte[] bArr) {
        byte[] bArr2;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = this.V.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = nq9.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        ara araVar = new ara(this, bArr2, (byte) 19);
        TL_account.Password password = this.V;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP d = nq9.d(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            getpasswordsettings.password = d;
            if (d == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                araVar.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getpasswordsettings, araVar, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        araVar.run(null, tL_error2);
    }

    public final void t0(String str) {
        p5c p5cVar = new p5c(this.currentAccount, 0, this.V);
        p5cVar.I = this.I;
        p5cVar.K.addAll(this.K);
        p5cVar.K.add(this);
        p5cVar.b0 = str;
        p5cVar.H = this.H;
        presentFragment(p5cVar, true);
    }

    public final void u0() {
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((d) arrayList.get(i)).removeSelfFromStack();
        }
        nm7 f = nm7.f(this.currentAccount);
        byte[] bArr = this.W;
        TL_account.Password password = this.V;
        f.k(nm7.p0, bArr, password.new_algo, password.new_secure_algo, password.secure_random, this.S, this.R, null, this.Q);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password2 = this.V;
        password2.has_password = true;
        password2.has_recovery = true;
        password2.email_unconfirmed_pattern = "";
        twoStepVerificationActivity.A0(password2, this.W, this.X, this.Y);
        twoStepVerificationActivity.Y = this.H;
        presentFragment(twoStepVerificationActivity, true);
        nm7.f(this.currentAccount).k(nm7.q0, this.V);
        t56 t56Var = this.k0;
        if (t56Var != null) {
            gm.c3(t56Var);
            this.k0 = null;
        }
    }

    public final void v0() {
        if (this.V.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.j(jb6.M0(2131747564, null), new h5c(this, (byte) 4));
            boolean z = this.V.has_recovery;
            he heVar = alertDialog$Builder.a;
            if (z) {
                heVar.U = jb6.M0(2131742477, null);
            } else {
                heVar.U = jb6.M0(2131742476, null);
            }
            heVar.S = jb6.M0(2131742461, null);
            Dialog showDialog = showDialog(heVar);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((d) arrayList.get(i)).removeSelfFromStack();
        }
        TL_account.Password password = this.V;
        password.has_password = true;
        password.has_recovery = true;
        password.email_unconfirmed_pattern = "";
        p5c p5cVar = new p5c(7, password);
        p5cVar.I = this.I;
        p5cVar.I0(this.W, this.X, this.Y, this.a0);
        p5cVar.K.addAll(arrayList);
        p5cVar.Z = this.Z;
        p5cVar.H = this.H;
        presentFragment(p5cVar, true);
        nm7 f = nm7.f(this.currentAccount);
        byte[] bArr = this.W;
        TL_account.Password password2 = this.V;
        f.k(nm7.p0, bArr, password2.new_algo, password2.new_secure_algo, password2.secure_random, this.S, this.R, null, this.Q);
        nm7.f(this.currentAccount).k(nm7.q0, this.V);
    }

    public final void w0(TLRPC.TL_error tL_error) {
        B0();
        if (tL_error == null) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            TL_account.Password password = this.V;
            password.has_recovery = false;
            password.email_unconfirmed_pattern = "";
            twoStepVerificationActivity.A0(password, this.W, this.X, this.Y);
            twoStepVerificationActivity.Y = this.H;
            presentFragment(twoStepVerificationActivity, true);
            nm7.f(this.currentAccount).k(nm7.r0, new Object[0]);
            t56 t56Var = this.k0;
            if (t56Var != null) {
                gm.c3(t56Var);
                this.k0 = null;
            }
        }
    }

    public final void x0(TLObject tLObject, TLRPC.TL_error tL_error, boolean z) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.V = password;
            TwoStepVerificationActivity.f0(password);
            J0(z);
            nm7.f(this.currentAccount).k(nm7.q0, this.V);
        }
    }

    public final void y0(byte[] bArr) {
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((d) arrayList.get(i)).removeSelfFromStack();
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password = this.V;
        password.has_password = true;
        if (!password.has_recovery) {
            password.has_recovery = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
        TL_account.Password password2 = this.V;
        if (bArr == null) {
            bArr = this.W;
        }
        twoStepVerificationActivity.A0(password2, bArr, this.X, this.Y);
        twoStepVerificationActivity.Y = this.H;
        presentFragment(twoStepVerificationActivity, true);
        nm7.f(this.currentAccount).k(nm7.q0, this.V);
        t56 t56Var = this.k0;
        if (t56Var != null) {
            gm.c3(t56Var);
            this.k0 = null;
        }
    }

    public final void z0(TLRPC.TL_error tL_error, boolean z, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr2;
        String G;
        byte[] bArr3;
        TL_account.Password password;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new r91((byte) 11, this, z), 8);
            return;
        }
        B0();
        int i = nm7.p0;
        ArrayList arrayList = this.K;
        if (tL_error == null) {
            if ((tLObject instanceof TLRPC.TL_boolTrue) || (tLObject instanceof TLRPC.auth_Authorization)) {
                getMessagesController().p4(0L, "VALIDATE_PASSWORD");
                int i2 = nm7.q0;
                if (z) {
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((d) arrayList.get(i3)).removeSelfFromStack();
                    }
                    nm7.f(this.currentAccount).k(nm7.r0, new Object[0]);
                    nm7.f(this.currentAccount).k(i2, new Object[0]);
                    finishFragment();
                } else if (getParentActivity() != null) {
                    if (this.V.has_password) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.j(jb6.M0(2131747564, null), new uxb(this, bArr, (byte) 2));
                        he heVar = alertDialog$Builder.a;
                        if (str == null && (password = this.V) != null && password.has_password) {
                            heVar.U = jb6.M0(2131742476, null);
                        } else {
                            heVar.U = jb6.M0(2131742467, null);
                        }
                        heVar.S = jb6.M0(2131742461, null);
                        Dialog showDialog = showDialog(heVar);
                        if (showDialog != null) {
                            showDialog.setCanceledOnTouchOutside(false);
                            showDialog.setCancelable(false);
                            return;
                        }
                        return;
                    }
                    int size2 = arrayList.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        ((d) arrayList.get(i4)).removeSelfFromStack();
                    }
                    TL_account.Password password2 = this.V;
                    password2.has_password = true;
                    if (!password2.has_recovery) {
                        password2.has_recovery = !TextUtils.isEmpty(password2.email_unconfirmed_pattern);
                    }
                    if (this.Z) {
                        nm7.f(this.currentAccount).k(i, new Object[0]);
                    }
                    p5c p5cVar = new p5c(7, this.V);
                    p5cVar.I = this.I;
                    if (bArr != null) {
                        bArr3 = bArr;
                    } else {
                        bArr3 = this.W;
                    }
                    p5cVar.I0(bArr3, this.X, this.Y, this.a0);
                    p5cVar.Z = this.Z;
                    p5cVar.H = this.H;
                    presentFragment(p5cVar, true);
                    nm7.f(this.currentAccount).k(i2, this.V);
                }
            }
        } else if (!"EMAIL_UNCONFIRMED".equals(tL_error.text) && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
            if ("EMAIL_INVALID".equals(tL_error.text)) {
                L0(jb6.M0(2131689472, null), jb6.M0(2131747178, null));
            } else if ("EMAIL_NOT_ALLOWED".equals(tL_error.text)) {
                L0(jb6.M0(2131689472, null), jb6.M0(2131751137, null));
            } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                int intValue = Utilities.z(tL_error.text).intValue();
                if (intValue < 60) {
                    G = jb6.G(intValue, "Seconds", new Object[0]);
                } else {
                    G = jb6.G(intValue / 60, "Minutes", new Object[0]);
                }
                L0(jb6.M0(2131689472, null), jb6.a0("FloodWaitTime", null, 2131750618, G));
            } else {
                L0(jb6.M0(2131689472, null), tL_error.text);
            }
        } else {
            nm7.f(this.currentAccount).k(i, new Object[0]);
            int size3 = arrayList.size();
            for (int i5 = 0; i5 < size3; i5++) {
                ((d) arrayList.get(i5)).removeSelfFromStack();
            }
            nm7 f = nm7.f(this.currentAccount);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = passwordinputsettings.new_algo;
            TL_account.Password password3 = this.V;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password3.new_secure_algo;
            byte[] bArr4 = password3.secure_random;
            String str2 = this.S;
            f.k(i, bArr, passwordKdfAlgo, securePasswordKdfAlgo, bArr4, str2, this.R, str2, this.Q);
            TL_account.Password password4 = this.V;
            password4.email_unconfirmed_pattern = this.S;
            p5c p5cVar2 = new p5c(5, password4);
            p5cVar2.I = this.I;
            if (bArr != null) {
                bArr2 = bArr;
            } else {
                bArr2 = this.W;
            }
            p5cVar2.I0(bArr2, this.X, this.Y, this.a0);
            p5cVar2.Z = this.Z;
            p5cVar2.H = this.H;
            presentFragment(p5cVar2, true);
        }
    }

    public void G0() {
    }

    @Override
    public final void finishFragment() {
        if (this.H >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            Bundle l = ts2.l("afterSignup", true);
            bj6 bj6Var = new bj6();
            bj6Var.n0(l);
            presentFragment(bj6Var, true);
            return;
        }
        super.finishFragment();
    }

    public p5c(int i, TL_account.Password password) {
        super(null);
        this.G = false;
        this.H = -1;
        this.K = new ArrayList();
        this.W = new byte[0];
        this.i0 = new g5c(this, (byte) 0);
        this.j0 = new g5c(this, (byte) 1);
        this.P = i;
        this.V = password;
        if (password == null && (i == 6 || i == 8)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new i5c(this, (byte) 0), 10);
            return;
        }
        this.U = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
    }
}

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
public class p3c extends d {
    public s71 E;
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
    public ry8 a;
    public boolean a0;
    public TextView b;
    public String b0;
    public TextView c;
    public vk9 c0;
    public wla d;
    public un4 d0;
    public TextView e;
    public wyb e0;
    public TextView f;
    public s43 f0;
    public oy8[] g0;
    public TextView h;
    public f3c h0;
    public final Runnable i0;
    public final Runnable j0;
    public t36 k0;
    public EditTextBoldCursor n;
    public EditTextBoldCursor r;
    public er7 s;
    public er7 w;
    public yc6 x;
    public o3c y;

    public p3c(int i, int i2, TL_account.Password password) {
        super(null);
        this.G = false;
        this.H = -1;
        this.K = new ArrayList();
        this.W = new byte[0];
        this.i0 = new f3c(this, (byte) 0);
        this.j0 = new f3c(this, (byte) 1);
        this.currentAccount = i;
        this.P = i2;
        this.V = password;
        this.U = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        if (this.V == null) {
            if (i2 == 6 || i2 == 8) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new h3c(this, (byte) 0), 10);
            }
        }
    }

    public static a Z(p3c p3cVar) {
        return p3cVar.actionBar;
    }

    public static a a0(p3c p3cVar) {
        return p3cVar.actionBar;
    }

    public static a j0(p3c p3cVar) {
        return p3cVar.actionBar;
    }

    public final void A0() {
        this.d0.f(false, true);
    }

    public final void B0() {
        if (getParentActivity() != null && !getParentActivity().isFinishing()) {
            this.d0.f(true, true);
        }
    }

    public final void C0() {
        sj2[] sj2VarArr;
        for (sj2 sj2Var : this.x.f) {
            sj2Var.setText("");
            sj2Var.A(1.0f);
        }
        this.x.f[0].requestFocus();
        gl.B3(8.0f, this.x, new f3c(this, (byte) 6));
    }

    public final void D0(er7 er7Var, EditTextBoldCursor editTextBoldCursor, boolean z) {
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
        gl.B3(5.0f, er7Var, null);
    }

    public final void E0() {
        TL_account.Password password = this.V;
        if (!password.has_recovery) {
            p3c p3cVar = new p3c(this.currentAccount, 3, password);
            p3cVar.I = this.I;
            p3cVar.H0(this.W, this.X, this.Y, this.a0);
            p3cVar.Q = this.Q;
            p3cVar.R = this.R;
            ArrayList arrayList = this.K;
            ArrayList arrayList2 = p3cVar.K;
            arrayList2.addAll(arrayList);
            arrayList2.add(this);
            p3cVar.Z = this.Z;
            p3cVar.H = this.H;
            presentFragment(p3cVar);
            return;
        }
        this.S = "";
        I0(false);
    }

    public final void G0() {
        if (getParentActivity() != null) {
            int i = 2;
            switch (this.P) {
                case 0:
                case 1:
                    if (this.n.length() == 0) {
                        D0(this.s, this.n, false);
                        return;
                    } else if (!this.n.getText().toString().equals(this.Q) && this.P == 1) {
                        gl.B3(5.0f, this.s, null);
                        try {
                            this.s.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        try {
                            Toast.makeText(getParentActivity(), k96.M0(2131747253, null), 0).show();
                            return;
                        } catch (Exception e) {
                            fa4.g(e, true);
                            return;
                        }
                    } else {
                        int i2 = this.currentAccount;
                        if (this.P == 0) {
                            i = 1;
                        }
                        p3c p3cVar = new p3c(i2, i, this.V);
                        p3cVar.I = this.I;
                        p3cVar.Q = this.n.getText().toString();
                        p3cVar.H0(this.W, this.X, this.Y, this.a0);
                        p3cVar.b0 = this.b0;
                        p3cVar.K.addAll(this.K);
                        p3cVar.K.add(this);
                        p3cVar.Z = this.Z;
                        p3cVar.H = this.H;
                        presentFragment(p3cVar);
                        return;
                    }
                case 2:
                    String obj = this.n.getText().toString();
                    this.R = obj;
                    if (obj.equalsIgnoreCase(this.Q)) {
                        try {
                            Toast.makeText(getParentActivity(), k96.M0(2131747255, null), 0).show();
                        } catch (Exception e2) {
                            fa4.g(e2, true);
                        }
                        D0(this.s, this.n, false);
                        return;
                    }
                    E0();
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
                            I0(false);
                            return;
                        }
                    }
                    D0(this.s, this.n, false);
                    return;
                case 4:
                    String code = this.x.getCode();
                    TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
                    tL_auth_checkRecoveryPassword.code = code;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new apa(this, code, (byte) 18), 10);
                    return;
                case 5:
                    TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                    confirmpasswordemail.code = this.x.getCode();
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new h3c(this, (byte) 2), 10);
                    B0();
                    return;
                case 6:
                    TL_account.Password password = this.V;
                    if (password == null) {
                        B0();
                        this.O = true;
                        return;
                    }
                    p3c p3cVar2 = new p3c(this.currentAccount, 0, password);
                    p3cVar2.I = this.I;
                    p3cVar2.Z = this.Z;
                    p3cVar2.H = this.H;
                    presentFragment(p3cVar2, true);
                    return;
                case 7:
                    if (this.Z) {
                        finishFragment();
                        return;
                    } else if (this.I) {
                        Bundle l = ir2.l("afterSignup", true);
                        ah6 ah6Var = new ah6();
                        ah6Var.q0(l);
                        presentFragment(ah6Var, true);
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.z0(this.V, this.W, this.X, this.Y);
                        twoStepVerificationActivity.Y = this.H;
                        presentFragment(twoStepVerificationActivity, true);
                        t36 t36Var = this.k0;
                        if (t36Var != null) {
                            gl.d3(t36Var);
                            this.k0 = null;
                            return;
                        }
                        return;
                    }
                case 8:
                    if (this.V == null) {
                        B0();
                        this.O = true;
                        return;
                    }
                    String obj3 = this.n.getText().toString();
                    if (obj3.length() == 0) {
                        D0(this.s, this.n, false);
                        return;
                    }
                    byte[] g1 = gl.g1(obj3);
                    B0();
                    Utilities.e.c(new i3c(this, g1, (byte) 0));
                    return;
                case 9:
                    finishFragment();
                    return;
                default:
                    return;
            }
        }
    }

    public final void H0(byte[] bArr, long j, byte[] bArr2, boolean z) {
        this.W = bArr;
        this.Y = bArr2;
        this.X = j;
        this.a0 = z;
    }

    public final void I0(boolean z) {
        TL_account.Password password;
        TL_account.updatePasswordSettings updatepasswordsettings;
        if (z && this.U && this.V.has_password) {
            B0();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.cancelPasswordEmail(), new h3c(this, (byte) 3));
            return;
        }
        String str = this.Q;
        TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
        String str2 = "";
        if (z) {
            y6c.h(this.currentAccount).t();
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
        B0();
        Utilities.e.c(new z77(this, updatepasswordsettings3, z, str, passwordinputsettings, (byte) 23));
    }

    public final void J0(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p3c.J0(boolean):void");
    }

    public final void K0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.j(k96.M0(2131747638, null), null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = str;
        hdVar.U = str2;
        showDialog(hdVar);
    }

    public final void L0(boolean z) {
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
        this.J.addListener(new pu9((byte) 13, this, z));
        this.J.setDuration(150L);
        this.J.start();
    }

    public final void M0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = k96.M0(2131742685, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.G(this.H, "ForceSetPasswordAlertMessageShort", new Object[0]);
        alertDialog$Builder.j(k96.M0(2131743694, null), null);
        alertDialog$Builder.g(k96.M0(2131750577, null), new g3c(this, (byte) 0));
        zkb.X((TextView) alertDialog$Builder.o().c(-2), bkb.p7, null);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
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
        this.actionBar.setBackButtonImage(2131231243);
        this.actionBar.setAllowOverlayTitle(false);
        a aVar = this.actionBar;
        int i4 = bkb.F6;
        zkb.l(aVar, 5, i4, null);
        zkb.l(this.actionBar, 1, i4, null);
        zkb.l(this.actionBar, 3, bkb.t8, null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new n3c(this));
        byte b2 = this.P;
        if (b2 == 5) {
            this.actionBar.t().a(0, 2131231247).g(1, k96.M0(2131754947, null));
        }
        un4 un4Var = new un4(this.resourceProvider, context, false);
        this.d0 = un4Var;
        this.c0 = new vk9(un4Var);
        this.d0.setOnClickListener(new View.OnClickListener(this) {
            public final p3c b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b3 = r2;
                p3c p3cVar = this.b;
                switch (b3) {
                    case 0:
                        p3cVar.G0();
                        return;
                    case 1:
                        byte b4 = p3cVar.P;
                        p3cVar.N = true;
                        TransformationMethod transformationMethod = p3cVar.n.getTransformationMethod();
                        EditTextBoldCursor editTextBoldCursor = p3cVar.n;
                        if (transformationMethod == null) {
                            editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            zkb.s(p3cVar.F, bkb.Ne, null, PorterDuff.Mode.MULTIPLY);
                            if (b4 == 0 && p3cVar.n.length() > 0 && p3cVar.n.hasFocus()) {
                                p3cVar.g0[3].K(-1);
                                oy8 animatedDrawable = p3cVar.a.getAnimatedDrawable();
                                oy8 oy8Var = p3cVar.g0[3];
                                if (animatedDrawable != oy8Var) {
                                    p3cVar.a.setAnimation(oy8Var);
                                    p3cVar.g0[3].I(18, false, false);
                                }
                                p3cVar.a.d();
                            }
                        } else {
                            editTextBoldCursor.setTransformationMethod(null);
                            zkb.s(p3cVar.F, bkb.Oe, null, PorterDuff.Mode.MULTIPLY);
                            if (b4 == 0 && p3cVar.n.length() > 0 && p3cVar.n.hasFocus()) {
                                p3cVar.g0[3].K(18);
                                oy8 animatedDrawable2 = p3cVar.a.getAnimatedDrawable();
                                oy8 oy8Var2 = p3cVar.g0[3];
                                if (animatedDrawable2 != oy8Var2) {
                                    p3cVar.a.setAnimation(oy8Var2);
                                }
                                p3cVar.g0[3].O(false, 0.0f);
                                p3cVar.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor2 = p3cVar.n;
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        p3cVar.N = false;
                        return;
                    case 2:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p3cVar.getParentActivity());
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        alertDialog$Builder.j(k96.M0(2131745925, null), new g3c(p3cVar, (byte) 1));
                        String M0 = k96.M0(2131745900, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        hdVar.U = k96.M0(2131745881, null);
                        p3cVar.showDialog(hdVar);
                        return;
                    case 3:
                        p3cVar.m0();
                        return;
                    case 4:
                        if (p3cVar.h.getAlpha() >= 0.5f) {
                            byte b5 = p3cVar.P;
                            if (b5 == 0) {
                                p3cVar.B0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = p3cVar.b0;
                                p3cVar.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new h3c(p3cVar, (byte) 1));
                                return;
                            } else if (b5 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p3cVar.getParentActivity());
                                String M02 = k96.M0(2131742552, null);
                                hd hdVar2 = alertDialog$Builder2.a;
                                hdVar2.U = M02;
                                hdVar2.S = k96.M0(2131742553, null);
                                alertDialog$Builder2.j(k96.M0(2131742554, null), new g3c(p3cVar, (byte) 2));
                                alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                                p3cVar.showDialog(hdVar2);
                                TextView textView = (TextView) hdVar2.c(-1);
                                if (textView != null) {
                                    zkb.X(textView, bkb.p7, null);
                                    return;
                                }
                                return;
                            } else if (b5 == 2) {
                                p3cVar.E0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 5:
                        if (p3cVar.P == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.X = true;
                            twoStepVerificationActivity.J = p3cVar.V;
                            twoStepVerificationActivity.K = false;
                            twoStepVerificationActivity.Y = p3cVar.H;
                            p3cVar.presentFragment(twoStepVerificationActivity, true);
                            t36 t36Var = p3cVar.k0;
                            if (t36Var != null) {
                                gl.d3(t36Var);
                                p3cVar.k0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        p3cVar.G0();
                        return;
                }
            }
        });
        wyb wybVar = new wyb(context);
        this.e0 = wybVar;
        wybVar.setTransformType(1);
        this.e0.setProgress(0.0f);
        this.e0.setColor(bkb.w0(null, bkb.N9, false));
        this.e0.setDrawBackground(false);
        this.d0.setContentDescription(k96.M0(2131748058, null));
        this.d0.addView(this.e0, nme.e(56, 56, 17));
        this.d0.a(this.e0);
        TextView textView = new TextView(context);
        this.h = textView;
        zkb.X(textView, bkb.n6, null);
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(19);
        this.h.setVisibility(8);
        vk9.c(this.h);
        this.h.setPadding(gl.L(32.0f), 0, gl.L(32.0f), 0);
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final p3c b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b3 = r2;
                p3c p3cVar = this.b;
                switch (b3) {
                    case 0:
                        p3cVar.G0();
                        return;
                    case 1:
                        byte b4 = p3cVar.P;
                        p3cVar.N = true;
                        TransformationMethod transformationMethod = p3cVar.n.getTransformationMethod();
                        EditTextBoldCursor editTextBoldCursor = p3cVar.n;
                        if (transformationMethod == null) {
                            editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            zkb.s(p3cVar.F, bkb.Ne, null, PorterDuff.Mode.MULTIPLY);
                            if (b4 == 0 && p3cVar.n.length() > 0 && p3cVar.n.hasFocus()) {
                                p3cVar.g0[3].K(-1);
                                oy8 animatedDrawable = p3cVar.a.getAnimatedDrawable();
                                oy8 oy8Var = p3cVar.g0[3];
                                if (animatedDrawable != oy8Var) {
                                    p3cVar.a.setAnimation(oy8Var);
                                    p3cVar.g0[3].I(18, false, false);
                                }
                                p3cVar.a.d();
                            }
                        } else {
                            editTextBoldCursor.setTransformationMethod(null);
                            zkb.s(p3cVar.F, bkb.Oe, null, PorterDuff.Mode.MULTIPLY);
                            if (b4 == 0 && p3cVar.n.length() > 0 && p3cVar.n.hasFocus()) {
                                p3cVar.g0[3].K(18);
                                oy8 animatedDrawable2 = p3cVar.a.getAnimatedDrawable();
                                oy8 oy8Var2 = p3cVar.g0[3];
                                if (animatedDrawable2 != oy8Var2) {
                                    p3cVar.a.setAnimation(oy8Var2);
                                }
                                p3cVar.g0[3].O(false, 0.0f);
                                p3cVar.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor2 = p3cVar.n;
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        p3cVar.N = false;
                        return;
                    case 2:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p3cVar.getParentActivity());
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        alertDialog$Builder.j(k96.M0(2131745925, null), new g3c(p3cVar, (byte) 1));
                        String M0 = k96.M0(2131745900, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        hdVar.U = k96.M0(2131745881, null);
                        p3cVar.showDialog(hdVar);
                        return;
                    case 3:
                        p3cVar.m0();
                        return;
                    case 4:
                        if (p3cVar.h.getAlpha() >= 0.5f) {
                            byte b5 = p3cVar.P;
                            if (b5 == 0) {
                                p3cVar.B0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = p3cVar.b0;
                                p3cVar.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new h3c(p3cVar, (byte) 1));
                                return;
                            } else if (b5 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p3cVar.getParentActivity());
                                String M02 = k96.M0(2131742552, null);
                                hd hdVar2 = alertDialog$Builder2.a;
                                hdVar2.U = M02;
                                hdVar2.S = k96.M0(2131742553, null);
                                alertDialog$Builder2.j(k96.M0(2131742554, null), new g3c(p3cVar, (byte) 2));
                                alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                                p3cVar.showDialog(hdVar2);
                                TextView textView2 = (TextView) hdVar2.c(-1);
                                if (textView2 != null) {
                                    zkb.X(textView2, bkb.p7, null);
                                    return;
                                }
                                return;
                            } else if (b5 == 2) {
                                p3cVar.E0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 5:
                        if (p3cVar.P == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.X = true;
                            twoStepVerificationActivity.J = p3cVar.V;
                            twoStepVerificationActivity.K = false;
                            twoStepVerificationActivity.Y = p3cVar.H;
                            p3cVar.presentFragment(twoStepVerificationActivity, true);
                            t36 t36Var = p3cVar.k0;
                            if (t36Var != null) {
                                gl.d3(t36Var);
                                p3cVar.k0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        p3cVar.G0();
                        return;
                }
            }
        });
        ?? imageView = new ImageView(context);
        this.a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        if (b2 == 2 && gl.M1()) {
            this.a.setVisibility(8);
        } else if (b2 != 6 && b2 != 9 && b2 != 7) {
            ry8 ry8Var = this.a;
            Point point = gl.q;
            if (point.x > point.y) {
                i = 8;
            } else {
                i = 0;
            }
            ry8Var.setVisibility(i);
        }
        TextView textView2 = new TextView(context);
        this.c = textView2;
        zkb.X(textView2, i4, null);
        this.c.setGravity(1);
        this.c.setPadding(gl.L(32.0f), 0, gl.L(32.0f), 0);
        this.c.setTextSize(1, 24.0f);
        wla wlaVar = new wla(context);
        this.d = wlaVar;
        int i5 = bkb.C6;
        zkb.X(wlaVar, i5, null);
        this.d.setGravity(1);
        this.d.setLineSpacing(gl.L(2.0f), 1.0f);
        this.d.setTextSize(1, 15.0f);
        this.d.setVisibility(8);
        this.d.setPadding(gl.L(32.0f), 0, gl.L(32.0f), 0);
        TextView textView3 = new TextView(context);
        this.e = textView3;
        zkb.X(textView3, i5, null);
        this.e.setGravity(1);
        this.e.setTextSize(1, 14.0f);
        this.e.setLineSpacing(gl.L(2.0f), 1.0f);
        this.e.setPadding(gl.L(32.0f), 0, gl.L(32.0f), 0);
        this.e.setVisibility(8);
        this.e.setOnClickListener(new View.OnClickListener(this) {
            public final p3c b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b3 = r2;
                p3c p3cVar = this.b;
                switch (b3) {
                    case 0:
                        p3cVar.G0();
                        return;
                    case 1:
                        byte b4 = p3cVar.P;
                        p3cVar.N = true;
                        TransformationMethod transformationMethod = p3cVar.n.getTransformationMethod();
                        EditTextBoldCursor editTextBoldCursor = p3cVar.n;
                        if (transformationMethod == null) {
                            editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            zkb.s(p3cVar.F, bkb.Ne, null, PorterDuff.Mode.MULTIPLY);
                            if (b4 == 0 && p3cVar.n.length() > 0 && p3cVar.n.hasFocus()) {
                                p3cVar.g0[3].K(-1);
                                oy8 animatedDrawable = p3cVar.a.getAnimatedDrawable();
                                oy8 oy8Var = p3cVar.g0[3];
                                if (animatedDrawable != oy8Var) {
                                    p3cVar.a.setAnimation(oy8Var);
                                    p3cVar.g0[3].I(18, false, false);
                                }
                                p3cVar.a.d();
                            }
                        } else {
                            editTextBoldCursor.setTransformationMethod(null);
                            zkb.s(p3cVar.F, bkb.Oe, null, PorterDuff.Mode.MULTIPLY);
                            if (b4 == 0 && p3cVar.n.length() > 0 && p3cVar.n.hasFocus()) {
                                p3cVar.g0[3].K(18);
                                oy8 animatedDrawable2 = p3cVar.a.getAnimatedDrawable();
                                oy8 oy8Var2 = p3cVar.g0[3];
                                if (animatedDrawable2 != oy8Var2) {
                                    p3cVar.a.setAnimation(oy8Var2);
                                }
                                p3cVar.g0[3].O(false, 0.0f);
                                p3cVar.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor2 = p3cVar.n;
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        p3cVar.N = false;
                        return;
                    case 2:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p3cVar.getParentActivity());
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        alertDialog$Builder.j(k96.M0(2131745925, null), new g3c(p3cVar, (byte) 1));
                        String M0 = k96.M0(2131745900, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        hdVar.U = k96.M0(2131745881, null);
                        p3cVar.showDialog(hdVar);
                        return;
                    case 3:
                        p3cVar.m0();
                        return;
                    case 4:
                        if (p3cVar.h.getAlpha() >= 0.5f) {
                            byte b5 = p3cVar.P;
                            if (b5 == 0) {
                                p3cVar.B0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = p3cVar.b0;
                                p3cVar.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new h3c(p3cVar, (byte) 1));
                                return;
                            } else if (b5 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p3cVar.getParentActivity());
                                String M02 = k96.M0(2131742552, null);
                                hd hdVar2 = alertDialog$Builder2.a;
                                hdVar2.U = M02;
                                hdVar2.S = k96.M0(2131742553, null);
                                alertDialog$Builder2.j(k96.M0(2131742554, null), new g3c(p3cVar, (byte) 2));
                                alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                                p3cVar.showDialog(hdVar2);
                                TextView textView22 = (TextView) hdVar2.c(-1);
                                if (textView22 != null) {
                                    zkb.X(textView22, bkb.p7, null);
                                    return;
                                }
                                return;
                            } else if (b5 == 2) {
                                p3cVar.E0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 5:
                        if (p3cVar.P == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.X = true;
                            twoStepVerificationActivity.J = p3cVar.V;
                            twoStepVerificationActivity.K = false;
                            twoStepVerificationActivity.Y = p3cVar.H;
                            p3cVar.presentFragment(twoStepVerificationActivity, true);
                            t36 t36Var = p3cVar.k0;
                            if (t36Var != null) {
                                gl.d3(t36Var);
                                p3cVar.k0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        p3cVar.G0();
                        return;
                }
            }
        });
        TextView textView4 = new TextView(context);
        this.b = textView4;
        textView4.setMinWidth(gl.L(220.0f));
        this.b.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
        this.b.setGravity(17);
        zkb.X(this.b, bkb.Ii, null);
        this.b.setTextSize(1, 15.0f);
        this.b.setTypeface(gl.o());
        this.b.setBackground(sjb.f(bkb.Ei, 24.0f));
        this.b.setOnClickListener(new View.OnClickListener(this) {
            public final p3c b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b3 = r2;
                p3c p3cVar = this.b;
                switch (b3) {
                    case 0:
                        p3cVar.G0();
                        return;
                    case 1:
                        byte b4 = p3cVar.P;
                        p3cVar.N = true;
                        TransformationMethod transformationMethod = p3cVar.n.getTransformationMethod();
                        EditTextBoldCursor editTextBoldCursor = p3cVar.n;
                        if (transformationMethod == null) {
                            editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            zkb.s(p3cVar.F, bkb.Ne, null, PorterDuff.Mode.MULTIPLY);
                            if (b4 == 0 && p3cVar.n.length() > 0 && p3cVar.n.hasFocus()) {
                                p3cVar.g0[3].K(-1);
                                oy8 animatedDrawable = p3cVar.a.getAnimatedDrawable();
                                oy8 oy8Var = p3cVar.g0[3];
                                if (animatedDrawable != oy8Var) {
                                    p3cVar.a.setAnimation(oy8Var);
                                    p3cVar.g0[3].I(18, false, false);
                                }
                                p3cVar.a.d();
                            }
                        } else {
                            editTextBoldCursor.setTransformationMethod(null);
                            zkb.s(p3cVar.F, bkb.Oe, null, PorterDuff.Mode.MULTIPLY);
                            if (b4 == 0 && p3cVar.n.length() > 0 && p3cVar.n.hasFocus()) {
                                p3cVar.g0[3].K(18);
                                oy8 animatedDrawable2 = p3cVar.a.getAnimatedDrawable();
                                oy8 oy8Var2 = p3cVar.g0[3];
                                if (animatedDrawable2 != oy8Var2) {
                                    p3cVar.a.setAnimation(oy8Var2);
                                }
                                p3cVar.g0[3].O(false, 0.0f);
                                p3cVar.a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor2 = p3cVar.n;
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        p3cVar.N = false;
                        return;
                    case 2:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p3cVar.getParentActivity());
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        alertDialog$Builder.j(k96.M0(2131745925, null), new g3c(p3cVar, (byte) 1));
                        String M0 = k96.M0(2131745900, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        hdVar.U = k96.M0(2131745881, null);
                        p3cVar.showDialog(hdVar);
                        return;
                    case 3:
                        p3cVar.m0();
                        return;
                    case 4:
                        if (p3cVar.h.getAlpha() >= 0.5f) {
                            byte b5 = p3cVar.P;
                            if (b5 == 0) {
                                p3cVar.B0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = p3cVar.b0;
                                p3cVar.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new h3c(p3cVar, (byte) 1));
                                return;
                            } else if (b5 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p3cVar.getParentActivity());
                                String M02 = k96.M0(2131742552, null);
                                hd hdVar2 = alertDialog$Builder2.a;
                                hdVar2.U = M02;
                                hdVar2.S = k96.M0(2131742553, null);
                                alertDialog$Builder2.j(k96.M0(2131742554, null), new g3c(p3cVar, (byte) 2));
                                alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                                p3cVar.showDialog(hdVar2);
                                TextView textView22 = (TextView) hdVar2.c(-1);
                                if (textView22 != null) {
                                    zkb.X(textView22, bkb.p7, null);
                                    return;
                                }
                                return;
                            } else if (b5 == 2) {
                                p3cVar.E0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 5:
                        if (p3cVar.P == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.X = true;
                            twoStepVerificationActivity.J = p3cVar.V;
                            twoStepVerificationActivity.K = false;
                            twoStepVerificationActivity.Y = p3cVar.H;
                            p3cVar.presentFragment(twoStepVerificationActivity, true);
                            t36 t36Var = p3cVar.k0;
                            if (t36Var != null) {
                                gl.d3(t36Var);
                                p3cVar.k0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        p3cVar.G0();
                        return;
                }
            }
        });
        if (b2 != 6 && b2 != 7 && b2 != 9) {
            this.c.setTypeface(gl.o());
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
                zab zabVar = new zab((byte) 4, context, this);
                hv7 hv7Var = new hv7(this, context, zabVar, (byte) 1);
                hv7Var.addView(zabVar);
                aa1 aa1Var = new aa1(this, context, hv7Var);
                o3c o3cVar = new o3c(this, context);
                this.y = o3cVar;
                o3cVar.setVerticalScrollBarEnabled(false);
                zabVar.addView(this.y, nme.c(-1.0f, -1));
                zabVar.addView(this.h, nme.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                zabVar.addView(this.d0, un4.b());
                aa1Var.addView(hv7Var, nme.c(-1.0f, -1));
                pkb pkbVar = new pkb((byte) 22, context, this);
                pkbVar.setOrientation(1);
                this.y.addView(pkbVar, nme.x(-1, -1, 51));
                pkbVar.addView(this.a, nme.t(-2, -2, 49, 0, 69, 0, 0));
                pkbVar.addView(this.c, nme.t(-2, -2, 49, 0, 8, 0, 0));
                pkbVar.addView(this.d, nme.t(-2, -2, 49, 0, 9, 0, 0));
                er7 er7Var = new er7(context, null);
                this.s = er7Var;
                er7Var.b(1.0f, 1.0f, false);
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.n = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                int L = gl.L(16.0f);
                this.n.setPadding(L, L, L, L);
                EditTextBoldCursor editTextBoldCursor2 = this.n;
                int i6 = bkb.k6;
                zkb.v(editTextBoldCursor2, i6, null);
                zkb.X(this.n, i4, null);
                this.n.setBackground(null);
                this.n.setMaxLines(1);
                this.n.setLines(1);
                this.n.setGravity(3);
                this.n.setCursorSize(gl.L(20.0f));
                this.n.setSingleLine(true);
                this.n.setCursorWidth(1.5f);
                this.n.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final p3c b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i7, KeyEvent keyEvent) {
                        byte b3 = r2;
                        p3c p3cVar = this.b;
                        switch (b3) {
                            case 0:
                                if (i7 != 5 && i7 != 6) {
                                    return false;
                                }
                                p3cVar.G0();
                                return true;
                            default:
                                if (i7 != 5 && i7 != 6) {
                                    return false;
                                }
                                if (p3cVar.w.getVisibility() == 0) {
                                    p3cVar.r.requestFocus();
                                } else {
                                    p3cVar.G0();
                                }
                                return true;
                        }
                    }
                });
                this.s.e(this.n);
                this.n.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final p3c b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z3) {
                        byte b3 = r2;
                        float f = 0.0f;
                        p3c p3cVar = this.b;
                        switch (b3) {
                            case 0:
                                er7 er7Var2 = p3cVar.w;
                                if (z3) {
                                    f = 1.0f;
                                }
                                er7Var2.b(f, f, true);
                                return;
                            case 1:
                                if (z3) {
                                    p3cVar.f0.setEditText((EditText) view);
                                    p3cVar.f0.setDispatchBackWhenEmpty(true);
                                    return;
                                }
                                return;
                            default:
                                er7 er7Var3 = p3cVar.s;
                                if (z3) {
                                    f = 1.0f;
                                }
                                er7Var3.b(f, f, true);
                                return;
                        }
                    }
                });
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.addView(this.n, nme.l(1.0f, 0, -2));
                c7 c7Var = new c7((byte) 4, context, this);
                this.F = c7Var;
                c7Var.setImageResource(2131232229);
                this.F.setScaleType(scaleType);
                this.F.setContentDescription(k96.M0(2131743693, null));
                c7 c7Var2 = this.F;
                int i7 = bkb.h6;
                zkb.R(c7Var2, bkb.f0(bkb.w0(null, i7, false), 1, -1), null, zkb.M(i7), null);
                zkb.s(this.F, bkb.Ne, null, PorterDuff.Mode.MULTIPLY);
                gl.U3(this.F, false, 0.1f, true, false);
                this.F.setOnClickListener(new View.OnClickListener(this) {
                    public final p3c b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b3 = r2;
                        p3c p3cVar = this.b;
                        switch (b3) {
                            case 0:
                                p3cVar.G0();
                                return;
                            case 1:
                                byte b4 = p3cVar.P;
                                p3cVar.N = true;
                                TransformationMethod transformationMethod = p3cVar.n.getTransformationMethod();
                                EditTextBoldCursor editTextBoldCursor3 = p3cVar.n;
                                if (transformationMethod == null) {
                                    editTextBoldCursor3.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    zkb.s(p3cVar.F, bkb.Ne, null, PorterDuff.Mode.MULTIPLY);
                                    if (b4 == 0 && p3cVar.n.length() > 0 && p3cVar.n.hasFocus()) {
                                        p3cVar.g0[3].K(-1);
                                        oy8 animatedDrawable = p3cVar.a.getAnimatedDrawable();
                                        oy8 oy8Var = p3cVar.g0[3];
                                        if (animatedDrawable != oy8Var) {
                                            p3cVar.a.setAnimation(oy8Var);
                                            p3cVar.g0[3].I(18, false, false);
                                        }
                                        p3cVar.a.d();
                                    }
                                } else {
                                    editTextBoldCursor3.setTransformationMethod(null);
                                    zkb.s(p3cVar.F, bkb.Oe, null, PorterDuff.Mode.MULTIPLY);
                                    if (b4 == 0 && p3cVar.n.length() > 0 && p3cVar.n.hasFocus()) {
                                        p3cVar.g0[3].K(18);
                                        oy8 animatedDrawable2 = p3cVar.a.getAnimatedDrawable();
                                        oy8 oy8Var2 = p3cVar.g0[3];
                                        if (animatedDrawable2 != oy8Var2) {
                                            p3cVar.a.setAnimation(oy8Var2);
                                        }
                                        p3cVar.g0[3].O(false, 0.0f);
                                        p3cVar.a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor22 = p3cVar.n;
                                editTextBoldCursor22.setSelection(editTextBoldCursor22.length());
                                p3cVar.N = false;
                                return;
                            case 2:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p3cVar.getParentActivity());
                                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                alertDialog$Builder.j(k96.M0(2131745925, null), new g3c(p3cVar, (byte) 1));
                                String M0 = k96.M0(2131745900, null);
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.S = M0;
                                hdVar.U = k96.M0(2131745881, null);
                                p3cVar.showDialog(hdVar);
                                return;
                            case 3:
                                p3cVar.m0();
                                return;
                            case 4:
                                if (p3cVar.h.getAlpha() >= 0.5f) {
                                    byte b5 = p3cVar.P;
                                    if (b5 == 0) {
                                        p3cVar.B0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = p3cVar.b0;
                                        p3cVar.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new h3c(p3cVar, (byte) 1));
                                        return;
                                    } else if (b5 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p3cVar.getParentActivity());
                                        String M02 = k96.M0(2131742552, null);
                                        hd hdVar2 = alertDialog$Builder2.a;
                                        hdVar2.U = M02;
                                        hdVar2.S = k96.M0(2131742553, null);
                                        alertDialog$Builder2.j(k96.M0(2131742554, null), new g3c(p3cVar, (byte) 2));
                                        alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                                        p3cVar.showDialog(hdVar2);
                                        TextView textView22 = (TextView) hdVar2.c(-1);
                                        if (textView22 != null) {
                                            zkb.X(textView22, bkb.p7, null);
                                            return;
                                        }
                                        return;
                                    } else if (b5 == 2) {
                                        p3cVar.E0();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            case 5:
                                if (p3cVar.P == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.X = true;
                                    twoStepVerificationActivity.J = p3cVar.V;
                                    twoStepVerificationActivity.K = false;
                                    twoStepVerificationActivity.Y = p3cVar.H;
                                    p3cVar.presentFragment(twoStepVerificationActivity, true);
                                    t36 t36Var = p3cVar.k0;
                                    if (t36Var != null) {
                                        gl.d3(t36Var);
                                        p3cVar.k0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                p3cVar.G0();
                                return;
                        }
                    }
                });
                linearLayout.addView(this.F, nme.t(24, 24, 16, 0, 0, 16, 0));
                this.n.addTextChangedListener(new m3c(this, (byte) 1));
                this.s.addView(linearLayout, nme.c(-2.0f, -1));
                pkbVar.addView(this.s, nme.d(-1, -2.0f, 49, 24.0f, 32.0f, 24.0f, 32.0f));
                this.w = new er7(context, null);
                EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
                this.r = editTextBoldCursor3;
                editTextBoldCursor3.setTextSize(1, 18.0f);
                int L2 = gl.L(16.0f);
                this.r.setPadding(L2, L2, L2, L2);
                zkb.v(this.r, i6, null);
                zkb.X(this.r, i4, null);
                this.r.setBackground(null);
                this.r.setMaxLines(1);
                this.r.setLines(1);
                this.r.setGravity(3);
                this.r.setCursorSize(gl.L(20.0f));
                this.r.setSingleLine(true);
                this.r.setCursorWidth(1.5f);
                this.r.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final p3c b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i72, KeyEvent keyEvent) {
                        byte b3 = r2;
                        p3c p3cVar = this.b;
                        switch (b3) {
                            case 0:
                                if (i72 != 5 && i72 != 6) {
                                    return false;
                                }
                                p3cVar.G0();
                                return true;
                            default:
                                if (i72 != 5 && i72 != 6) {
                                    return false;
                                }
                                if (p3cVar.w.getVisibility() == 0) {
                                    p3cVar.r.requestFocus();
                                } else {
                                    p3cVar.G0();
                                }
                                return true;
                        }
                    }
                });
                this.w.e(this.r);
                this.r.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final p3c b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z3) {
                        byte b3 = r2;
                        float f = 0.0f;
                        p3c p3cVar = this.b;
                        switch (b3) {
                            case 0:
                                er7 er7Var2 = p3cVar.w;
                                if (z3) {
                                    f = 1.0f;
                                }
                                er7Var2.b(f, f, true);
                                return;
                            case 1:
                                if (z3) {
                                    p3cVar.f0.setEditText((EditText) view);
                                    p3cVar.f0.setDispatchBackWhenEmpty(true);
                                    return;
                                }
                                return;
                            default:
                                er7 er7Var3 = p3cVar.s;
                                if (z3) {
                                    f = 1.0f;
                                }
                                er7Var3.b(f, f, true);
                                return;
                        }
                    }
                });
                this.w.addView(this.r, nme.c(-2.0f, -1));
                pkbVar.addView(this.w, nme.d(-1, -2.0f, 49, 24.0f, 16.0f, 24.0f, 0.0f));
                this.w.setVisibility(8);
                s43 s43Var = new s43(context);
                this.f0 = s43Var;
                s43Var.setVisibility(8);
                hv7Var.addView(this.f0);
                yc6 yc6Var = new yc6((byte) 3, context, this);
                this.x = yc6Var;
                final byte b3 = 1;
                yc6Var.b(6, 1);
                sj2[] sj2VarArr = this.x.f;
                int length = sj2VarArr.length;
                int i8 = 0;
                while (i8 < length) {
                    sj2 sj2Var = sj2VarArr[i8];
                    sj2Var.setShowSoftInputOnFocusCompat(l0() ^ b3);
                    sj2Var.addTextChangedListener(new xh1(this));
                    sj2Var.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                        public final p3c b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onFocusChange(View view, boolean z3) {
                            byte b32 = b3;
                            float f = 0.0f;
                            p3c p3cVar = this.b;
                            switch (b32) {
                                case 0:
                                    er7 er7Var2 = p3cVar.w;
                                    if (z3) {
                                        f = 1.0f;
                                    }
                                    er7Var2.b(f, f, true);
                                    return;
                                case 1:
                                    if (z3) {
                                        p3cVar.f0.setEditText((EditText) view);
                                        p3cVar.f0.setDispatchBackWhenEmpty(true);
                                        return;
                                    }
                                    return;
                                default:
                                    er7 er7Var3 = p3cVar.s;
                                    if (z3) {
                                        f = 1.0f;
                                    }
                                    er7Var3.b(f, f, true);
                                    return;
                            }
                        }
                    });
                    i8++;
                    b3 = 1;
                }
                this.x.setVisibility(8);
                pkbVar.addView(this.x, nme.t(-2, -2, 1, 0, 32, 0, 0));
                FrameLayout frameLayout = new FrameLayout(context);
                pkbVar.addView(frameLayout, nme.t(-1, -2, 51, 0, 36, 0, 22));
                frameLayout.addView(this.e, nme.e(-2, -2, 49));
                if (b2 == 4) {
                    TextView textView5 = new TextView(context);
                    this.f = textView5;
                    zkb.X(textView5, bkb.I6, null);
                    this.f.setGravity(1);
                    this.f.setTextSize(1, 14.0f);
                    this.f.setLineSpacing(gl.L(2.0f), 1.0f);
                    this.f.setPadding(gl.L(32.0f), 0, gl.L(32.0f), 0);
                    this.f.setText(k96.M0(2131745883, null));
                    pkbVar.addView(this.f, nme.t(-2, -2, 49, 0, 0, 0, 25));
                    this.f.setOnClickListener(new View.OnClickListener(this) {
                        public final p3c b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            byte b32 = r2;
                            p3c p3cVar = this.b;
                            switch (b32) {
                                case 0:
                                    p3cVar.G0();
                                    return;
                                case 1:
                                    byte b4 = p3cVar.P;
                                    p3cVar.N = true;
                                    TransformationMethod transformationMethod = p3cVar.n.getTransformationMethod();
                                    EditTextBoldCursor editTextBoldCursor32 = p3cVar.n;
                                    if (transformationMethod == null) {
                                        editTextBoldCursor32.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                        zkb.s(p3cVar.F, bkb.Ne, null, PorterDuff.Mode.MULTIPLY);
                                        if (b4 == 0 && p3cVar.n.length() > 0 && p3cVar.n.hasFocus()) {
                                            p3cVar.g0[3].K(-1);
                                            oy8 animatedDrawable = p3cVar.a.getAnimatedDrawable();
                                            oy8 oy8Var = p3cVar.g0[3];
                                            if (animatedDrawable != oy8Var) {
                                                p3cVar.a.setAnimation(oy8Var);
                                                p3cVar.g0[3].I(18, false, false);
                                            }
                                            p3cVar.a.d();
                                        }
                                    } else {
                                        editTextBoldCursor32.setTransformationMethod(null);
                                        zkb.s(p3cVar.F, bkb.Oe, null, PorterDuff.Mode.MULTIPLY);
                                        if (b4 == 0 && p3cVar.n.length() > 0 && p3cVar.n.hasFocus()) {
                                            p3cVar.g0[3].K(18);
                                            oy8 animatedDrawable2 = p3cVar.a.getAnimatedDrawable();
                                            oy8 oy8Var2 = p3cVar.g0[3];
                                            if (animatedDrawable2 != oy8Var2) {
                                                p3cVar.a.setAnimation(oy8Var2);
                                            }
                                            p3cVar.g0[3].O(false, 0.0f);
                                            p3cVar.a.d();
                                        }
                                    }
                                    EditTextBoldCursor editTextBoldCursor22 = p3cVar.n;
                                    editTextBoldCursor22.setSelection(editTextBoldCursor22.length());
                                    p3cVar.N = false;
                                    return;
                                case 2:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p3cVar.getParentActivity());
                                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                    alertDialog$Builder.j(k96.M0(2131745925, null), new g3c(p3cVar, (byte) 1));
                                    String M0 = k96.M0(2131745900, null);
                                    hd hdVar = alertDialog$Builder.a;
                                    hdVar.S = M0;
                                    hdVar.U = k96.M0(2131745881, null);
                                    p3cVar.showDialog(hdVar);
                                    return;
                                case 3:
                                    p3cVar.m0();
                                    return;
                                case 4:
                                    if (p3cVar.h.getAlpha() >= 0.5f) {
                                        byte b5 = p3cVar.P;
                                        if (b5 == 0) {
                                            p3cVar.B0();
                                            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                            tL_auth_recoverPassword.code = p3cVar.b0;
                                            p3cVar.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new h3c(p3cVar, (byte) 1));
                                            return;
                                        } else if (b5 == 3) {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p3cVar.getParentActivity());
                                            String M02 = k96.M0(2131742552, null);
                                            hd hdVar2 = alertDialog$Builder2.a;
                                            hdVar2.U = M02;
                                            hdVar2.S = k96.M0(2131742553, null);
                                            alertDialog$Builder2.j(k96.M0(2131742554, null), new g3c(p3cVar, (byte) 2));
                                            alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                                            p3cVar.showDialog(hdVar2);
                                            TextView textView22 = (TextView) hdVar2.c(-1);
                                            if (textView22 != null) {
                                                zkb.X(textView22, bkb.p7, null);
                                                return;
                                            }
                                            return;
                                        } else if (b5 == 2) {
                                            p3cVar.E0();
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    return;
                                case 5:
                                    if (p3cVar.P == 8) {
                                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                        twoStepVerificationActivity.X = true;
                                        twoStepVerificationActivity.J = p3cVar.V;
                                        twoStepVerificationActivity.K = false;
                                        twoStepVerificationActivity.Y = p3cVar.H;
                                        p3cVar.presentFragment(twoStepVerificationActivity, true);
                                        t36 t36Var = p3cVar.k0;
                                        if (t36Var != null) {
                                            gl.d3(t36Var);
                                            p3cVar.k0 = null;
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    p3cVar.G0();
                                    return;
                            }
                        }
                    });
                }
                this.fragmentView = aa1Var;
                s71 s71Var = new s71(this, context);
                this.E = s71Var;
                s71Var.setAlpha(0.0f);
                aa1Var.addView(this.E);
                aa1Var.addView(this.actionBar);
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                this.M = radialProgressView;
                radialProgressView.setSize(gl.L(20.0f));
                this.M.setAlpha(0.0f);
                this.M.setScaleX(0.1f);
                this.M.setScaleY(0.1f);
                this.M.setProgressColor(bkb.w0(null, bkb.k6, false));
                zabVar.addView(this.M, nme.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                break;
            case 6:
            case 7:
            case 9:
                s8 s8Var = new s8((byte) 2, context, this);
                s8Var.setOnTouchListener(new wmb((byte) 3));
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
        zkb.h(bkb.c6, null, this.fragmentView);
        String str = "";
        switch (b2) {
            case 0:
            case 1:
                int i9 = 2131746220;
                if (this.V.has_password) {
                    this.actionBar.setTitle(k96.M0(2131747018, null));
                    this.c.setText(k96.M0(2131747018, null));
                } else {
                    if (b2 == 0) {
                        i2 = 2131751693;
                    } else {
                        i2 = 2131746220;
                    }
                    String M0 = k96.M0(i2, null);
                    this.actionBar.setTitle(M0);
                    this.c.setText(M0);
                }
                if (!TextUtils.isEmpty(this.b0)) {
                    this.h.setVisibility(0);
                    this.h.setText(k96.M0(2131742554, null));
                }
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                er7 er7Var2 = this.s;
                if (b2 == 0) {
                    i3 = 2131751104;
                } else {
                    i3 = 2131746220;
                }
                er7Var2.setText(k96.M0(i3, null));
                EditTextBoldCursor editTextBoldCursor4 = this.n;
                if (b2 == 0) {
                    i9 = 2131751104;
                }
                editTextBoldCursor4.setContentDescription(k96.M0(i9, null));
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
                gl.U3(this.F, false, 0.1f, true, false);
                oy8[] oy8VarArr = new oy8[7];
                this.g0 = oy8VarArr;
                oy8VarArr[0] = new oy8(2131624305, gl.L(120.0f), gl.L(120.0f), true, null);
                this.g0[1] = new oy8(2131624306, gl.L(120.0f), gl.L(120.0f), true, null);
                this.g0[2] = new oy8(2131624298, gl.L(120.0f), gl.L(120.0f), true, null);
                this.g0[3] = new oy8(2131624307, gl.L(120.0f), gl.L(120.0f), true, null);
                this.g0[4] = new oy8(2131624304, gl.L(120.0f), gl.L(120.0f), true, null);
                this.g0[c] = new oy8(2131624303, gl.L(120.0f), gl.L(120.0f), true, null);
                this.g0[6] = new oy8(2131624308, gl.L(120.0f), gl.L(120.0f), true, null);
                oy8 oy8Var = this.g0[6];
                oy8Var.h = true;
                oy8Var.K(19);
                this.g0[2].N(97, this.j0);
                J0(true);
                if (b2 == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    f3c f3cVar = this.h0;
                    if (f3cVar != null) {
                        gl.r(f3cVar);
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
                    J0(true);
                    break;
                }
            case 2:
                this.actionBar.setTitle(k96.M0(2131747251, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.h.setVisibility(0);
                this.h.setText(k96.M0(2131742554, null));
                this.c.setText(k96.M0(2131747251, null));
                this.d.setText(k96.M0(2131747250, null));
                this.d.setVisibility(0);
                this.s.setText(k96.M0(2131747249, null));
                this.n.setContentDescription(k96.M0(2131747249, null));
                this.n.setImeOptions(268435461);
                this.w.setVisibility(8);
                this.a.f(2131624300, 120, 120, null);
                this.a.d();
                b = 0;
                break;
            case 3:
                this.actionBar.setTitle(k96.M0(2131746151, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                if (!this.a0) {
                    this.h.setVisibility(0);
                    this.h.setAlpha(0.0f);
                    r12 = 0;
                    this.h.setText(k96.M0(2131742554, null));
                } else {
                    r12 = 0;
                }
                this.c.setText(k96.M0(2131746151, r12));
                this.d.setText(k96.M0(2131746152, r12));
                this.d.setVisibility(0);
                this.s.setText(k96.M0(2131747183, r12));
                this.n.setContentDescription(k96.M0(2131747183, r12));
                this.n.setImeOptions(268435461);
                this.n.setInputType(33);
                this.w.setVisibility(8);
                this.a.f(2131624299, 120, 120, r12);
                this.a.d();
                b = 0;
                break;
            case 4:
                this.actionBar.setTitle(k96.M0(2131747244, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.c.setText(k96.M0(2131747244, null));
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
                    valueOf.setSpan(new wib(obj2, 0), indexOf, i11, 0);
                } else {
                    r10 = 0;
                }
                wla wlaVar2 = this.d;
                String M02 = k96.M0(2131745887, null);
                CharSequence[] charSequenceArr = new CharSequence[1];
                charSequenceArr[r10] = valueOf;
                wlaVar2.setText(gl.m0(M02, charSequenceArr));
                this.d.setVisibility(r10);
                this.d0.e(r10, r10);
                this.x.setVisibility(r10);
                this.a.f(2131624302, 120, 120, null);
                this.a.d();
                b = 0;
                break;
            case 5:
                this.actionBar.setTitle(k96.M0(2131743380, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.c.setText(k96.M0(2131743380, null));
                this.s.setVisibility(8);
                this.f0.setVisibility(0);
                wla wlaVar3 = this.d;
                String str3 = this.V.email_unconfirmed_pattern;
                if (str3 != null) {
                    str = str3;
                }
                wlaVar3.setText(k96.a0("EmailPasswordConfirmText2", null, 2131751187, str));
                this.d.setVisibility(0);
                this.d0.e(false, false);
                this.h.setVisibility(0);
                this.h.setGravity(17);
                ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).bottomMargin = 0;
                this.h.setText(k96.M0(2131745928, null));
                this.h.setOnClickListener(new View.OnClickListener(this) {
                    public final p3c b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b32 = r2;
                        p3c p3cVar = this.b;
                        switch (b32) {
                            case 0:
                                p3cVar.G0();
                                return;
                            case 1:
                                byte b4 = p3cVar.P;
                                p3cVar.N = true;
                                TransformationMethod transformationMethod = p3cVar.n.getTransformationMethod();
                                EditTextBoldCursor editTextBoldCursor32 = p3cVar.n;
                                if (transformationMethod == null) {
                                    editTextBoldCursor32.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    zkb.s(p3cVar.F, bkb.Ne, null, PorterDuff.Mode.MULTIPLY);
                                    if (b4 == 0 && p3cVar.n.length() > 0 && p3cVar.n.hasFocus()) {
                                        p3cVar.g0[3].K(-1);
                                        oy8 animatedDrawable = p3cVar.a.getAnimatedDrawable();
                                        oy8 oy8Var2 = p3cVar.g0[3];
                                        if (animatedDrawable != oy8Var2) {
                                            p3cVar.a.setAnimation(oy8Var2);
                                            p3cVar.g0[3].I(18, false, false);
                                        }
                                        p3cVar.a.d();
                                    }
                                } else {
                                    editTextBoldCursor32.setTransformationMethod(null);
                                    zkb.s(p3cVar.F, bkb.Oe, null, PorterDuff.Mode.MULTIPLY);
                                    if (b4 == 0 && p3cVar.n.length() > 0 && p3cVar.n.hasFocus()) {
                                        p3cVar.g0[3].K(18);
                                        oy8 animatedDrawable2 = p3cVar.a.getAnimatedDrawable();
                                        oy8 oy8Var22 = p3cVar.g0[3];
                                        if (animatedDrawable2 != oy8Var22) {
                                            p3cVar.a.setAnimation(oy8Var22);
                                        }
                                        p3cVar.g0[3].O(false, 0.0f);
                                        p3cVar.a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor22 = p3cVar.n;
                                editTextBoldCursor22.setSelection(editTextBoldCursor22.length());
                                p3cVar.N = false;
                                return;
                            case 2:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p3cVar.getParentActivity());
                                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                alertDialog$Builder.j(k96.M0(2131745925, null), new g3c(p3cVar, (byte) 1));
                                String M03 = k96.M0(2131745900, null);
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.S = M03;
                                hdVar.U = k96.M0(2131745881, null);
                                p3cVar.showDialog(hdVar);
                                return;
                            case 3:
                                p3cVar.m0();
                                return;
                            case 4:
                                if (p3cVar.h.getAlpha() >= 0.5f) {
                                    byte b5 = p3cVar.P;
                                    if (b5 == 0) {
                                        p3cVar.B0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = p3cVar.b0;
                                        p3cVar.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new h3c(p3cVar, (byte) 1));
                                        return;
                                    } else if (b5 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p3cVar.getParentActivity());
                                        String M022 = k96.M0(2131742552, null);
                                        hd hdVar2 = alertDialog$Builder2.a;
                                        hdVar2.U = M022;
                                        hdVar2.S = k96.M0(2131742553, null);
                                        alertDialog$Builder2.j(k96.M0(2131742554, null), new g3c(p3cVar, (byte) 2));
                                        alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                                        p3cVar.showDialog(hdVar2);
                                        TextView textView22 = (TextView) hdVar2.c(-1);
                                        if (textView22 != null) {
                                            zkb.X(textView22, bkb.p7, null);
                                            return;
                                        }
                                        return;
                                    } else if (b5 == 2) {
                                        p3cVar.E0();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            case 5:
                                if (p3cVar.P == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.X = true;
                                    twoStepVerificationActivity.J = p3cVar.V;
                                    twoStepVerificationActivity.K = false;
                                    twoStepVerificationActivity.Y = p3cVar.H;
                                    p3cVar.presentFragment(twoStepVerificationActivity, true);
                                    t36 t36Var = p3cVar.k0;
                                    if (t36Var != null) {
                                        gl.d3(t36Var);
                                        p3cVar.k0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                p3cVar.G0();
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
                this.c.setText(k96.M0(2131743692, null));
                this.d.setText(k96.M0(2131745356, null));
                this.b.setText(k96.M0(2131743694, null));
                this.d.setVisibility(0);
                this.a.f(2131624301, 140, 140, null);
                this.a.d();
                b = 0;
                break;
            case 7:
                this.c.setText(k96.M0(2131743696, null));
                this.d.setText(k96.M0(2131743695, null));
                if (this.Z) {
                    this.b.setText(k96.M0(2131743698, null));
                } else {
                    boolean z3 = this.I;
                    TextView textView6 = this.b;
                    if (z3) {
                        textView6.setText(k96.M0(2131751759, null));
                    } else {
                        textView6.setText(k96.M0(2131743697, null));
                    }
                }
                this.d.setVisibility(0);
                this.a.f(2131624349, 160, 160, null);
                this.a.d();
                b = 0;
                break;
            case 8:
                this.actionBar.setTitle(k96.M0(2131747024, null));
                this.c.setText(k96.M0(2131747024, null));
                this.d.setText(k96.M0(2131752148, null));
                this.d.setVisibility(0);
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.e.setText(k96.M0(2131750574, null));
                zkb.X(this.e, bkb.n6, null);
                this.s.setText(k96.M0(2131748534, null));
                this.n.setContentDescription(k96.M0(2131748534, null));
                this.n.setImeOptions(268435462);
                this.n.setInputType(129);
                this.n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.n.setTypeface(Typeface.DEFAULT);
                this.a.f(2131624355, 120, 120, null);
                this.a.d();
                b = 0;
                break;
            case 9:
                this.c.setText(k96.M0(2131752147, null));
                this.d.setText(k96.M0(2131752146, null));
                this.b.setText(k96.M0(2131752149, null));
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
            editTextBoldCursor6.addTextChangedListener(new m3c(this, b));
        }
        return this.fragmentView;
    }

    @Override
    public final boolean finishFragment(boolean z) {
        for (d dVar : getParentLayout().getFragmentStack()) {
            if (dVar != this && (dVar instanceof p3c)) {
                ((bac) ((p3c) dVar).c0.b).b = true;
            }
        }
        return super.finishFragment(z);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Z6));
        arrayList.add(new blb(this.c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.C6));
        arrayList.add(new blb(this.n, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.G6));
        arrayList.add(new blb(this.n, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.j6));
        arrayList.add(new blb(this.n, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.k6));
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
        if (bm2.h(bkb.w0(null, bkb.c6, true)) > 0.699999988079071d) {
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

    public final void k0(Runnable runnable) {
        int i = 0;
        while (true) {
            yc6 yc6Var = this.x;
            sj2[] sj2VarArr = yc6Var.f;
            if (i < sj2VarArr.length) {
                sj2 sj2Var = sj2VarArr[i];
                sj2Var.postDelayed(new gv7(sj2Var, (byte) 1), i * 75);
                i++;
            } else {
                yc6Var.postDelayed(new l3c(this, runnable, (byte) 1), (sj2VarArr.length * 75) + 350);
                return;
            }
        }
    }

    public final boolean l0() {
        byte b = this.P;
        if ((b == 5 || b == 4) && !gl.O1()) {
            Point point = gl.q;
            if (point.x < point.y && !gl.A1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void m0() {
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new ce2((byte) 0));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = k96.M0(2131745927, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.U = M0;
        hdVar.S = k96.M0(2131743692, null);
        alertDialog$Builder.j(k96.M0(2131747638, null), null);
        showDialog(hdVar);
    }

    public final void n0() {
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((d) arrayList.get(i)).removeSelfFromStack();
        }
        kk7.f(this.currentAccount).k(kk7.o0, new Object[0]);
        finishFragment();
    }

    public final void o0(TLObject tLObject, TLRPC.TL_error tL_error) {
        String str;
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.V = password;
            if (!TwoStepVerificationActivity.a0(password, false)) {
                ij.u0(getParentActivity(), k96.M0(2131743581, null), true);
                return;
            }
            this.U = !TextUtils.isEmpty(this.V.email_unconfirmed_pattern);
            TwoStepVerificationActivity.e0(this.V);
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
                        kk7.f(this.currentAccount).k(kk7.o0, null, passwordKdfAlgo, securePasswordKdfAlgo, bArr, str, str2, null, null);
                        finishFragment();
                    }
                }
            }
            if (this.O) {
                A0();
                G0();
            }
            kk7.f(this.currentAccount).k(kk7.p0, this.V);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (this.H >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            if (z) {
                M0();
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
            if (b == 2 && gl.M1()) {
                this.a.setVisibility(8);
            } else if (b != 6 && b != 9 && b != 7) {
                ry8 ry8Var = this.a;
                Point point = gl.q;
                if (point.x > point.y) {
                    i = 8;
                } else {
                    i = 0;
                }
                ry8Var.setVisibility(i);
            }
        }
        s43 s43Var = this.f0;
        if (s43Var != null) {
            if (!l0()) {
                i2 = 8;
            }
            s43Var.setVisibility(i2);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.O = false;
        f3c f3cVar = this.h0;
        if (f3cVar != null) {
            gl.r(f3cVar);
            this.h0 = null;
        }
        if (this.g0 != null) {
            int i = 0;
            while (true) {
                oy8[] oy8VarArr = this.g0;
                if (i >= oy8VarArr.length) {
                    break;
                }
                oy8VarArr[i].x(false);
                i++;
            }
            this.g0 = null;
        }
        gl.y2(getParentActivity(), this.classGuid);
        if (l0()) {
            gl.z2(getParentActivity(), this.classGuid);
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
        gl.W2(getParentActivity(), this.classGuid);
        if (l0()) {
            gl.X2(getParentActivity(), this.classGuid);
            gl.t1(this.fragmentView);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            wyb wybVar = this.e0;
            if (wybVar != null) {
                wybVar.setColor(bkb.w0(null, bkb.N9, false));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        try {
            int w0 = bkb.w0(null, bkb.k6, false);
            RadialProgressView radialProgressView = this.M;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(w0);
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            if (this.n != null && !l0()) {
                gl.e3(new f3c(this, (byte) 2), 200L);
            }
            yc6 yc6Var = this.x;
            if (yc6Var != null && yc6Var.getVisibility() == 0) {
                gl.e3(new f3c(this, (byte) 3), 200L);
            }
        }
    }

    public final void p0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.V = password;
            TwoStepVerificationActivity.e0(password);
            kk7.f(this.currentAccount).k(kk7.p0, this.V);
            G0();
        }
    }

    public final void q0(TLRPC.TL_error tL_error) {
        String G;
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new h3c(this, (byte) 4), 8);
            return;
        }
        A0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            this.d.setText(k96.M0(2131752145, null));
            zkb.X(this.d, bkb.o7, null);
            D0(this.s, this.n, true);
            L0(false);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.z(tL_error.text).intValue();
            if (intValue < 60) {
                G = k96.G(intValue, "Seconds", new Object[0]);
            } else {
                G = k96.G(intValue / 60, "Minutes", new Object[0]);
            }
            K0(k96.M0(2131689472, null), k96.a0("FloodWaitTime", null, 2131750669, G));
        } else {
            K0(k96.M0(2131689472, null), tL_error.text);
        }
    }

    public final void r0(byte[] bArr) {
        byte[] bArr2;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = this.V.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = mo9.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        apa apaVar = new apa(this, bArr2, (byte) 19);
        TL_account.Password password = this.V;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP d = mo9.d(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            getpasswordsettings.password = d;
            if (d == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                apaVar.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getpasswordsettings, apaVar, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        apaVar.run(null, tL_error2);
    }

    public final void s0(String str) {
        p3c p3cVar = new p3c(this.currentAccount, 0, this.V);
        p3cVar.I = this.I;
        p3cVar.K.addAll(this.K);
        p3cVar.K.add(this);
        p3cVar.b0 = str;
        p3cVar.H = this.H;
        presentFragment(p3cVar, true);
    }

    public final void t0() {
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((d) arrayList.get(i)).removeSelfFromStack();
        }
        kk7 f = kk7.f(this.currentAccount);
        byte[] bArr = this.W;
        TL_account.Password password = this.V;
        f.k(kk7.o0, bArr, password.new_algo, password.new_secure_algo, password.secure_random, this.S, this.R, null, this.Q);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password2 = this.V;
        password2.has_password = true;
        password2.has_recovery = true;
        password2.email_unconfirmed_pattern = "";
        twoStepVerificationActivity.z0(password2, this.W, this.X, this.Y);
        twoStepVerificationActivity.Y = this.H;
        presentFragment(twoStepVerificationActivity, true);
        kk7.f(this.currentAccount).k(kk7.p0, this.V);
        t36 t36Var = this.k0;
        if (t36Var != null) {
            gl.d3(t36Var);
            this.k0 = null;
        }
    }

    public final void u0() {
        if (this.V.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.j(k96.M0(2131747638, null), new g3c(this, (byte) 4));
            boolean z = this.V.has_recovery;
            hd hdVar = alertDialog$Builder.a;
            if (z) {
                hdVar.U = k96.M0(2131742551, null);
            } else {
                hdVar.U = k96.M0(2131742550, null);
            }
            hdVar.S = k96.M0(2131742535, null);
            Dialog showDialog = showDialog(hdVar);
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
        p3c p3cVar = new p3c(7, password);
        p3cVar.I = this.I;
        p3cVar.H0(this.W, this.X, this.Y, this.a0);
        p3cVar.K.addAll(arrayList);
        p3cVar.Z = this.Z;
        p3cVar.H = this.H;
        presentFragment(p3cVar, true);
        kk7 f = kk7.f(this.currentAccount);
        byte[] bArr = this.W;
        TL_account.Password password2 = this.V;
        f.k(kk7.o0, bArr, password2.new_algo, password2.new_secure_algo, password2.secure_random, this.S, this.R, null, this.Q);
        kk7.f(this.currentAccount).k(kk7.p0, this.V);
    }

    public final void v0(TLRPC.TL_error tL_error) {
        A0();
        if (tL_error == null) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            TL_account.Password password = this.V;
            password.has_recovery = false;
            password.email_unconfirmed_pattern = "";
            twoStepVerificationActivity.z0(password, this.W, this.X, this.Y);
            twoStepVerificationActivity.Y = this.H;
            presentFragment(twoStepVerificationActivity, true);
            kk7.f(this.currentAccount).k(kk7.q0, new Object[0]);
            t36 t36Var = this.k0;
            if (t36Var != null) {
                gl.d3(t36Var);
                this.k0 = null;
            }
        }
    }

    public final void w0(TLObject tLObject, TLRPC.TL_error tL_error, boolean z) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.V = password;
            TwoStepVerificationActivity.e0(password);
            I0(z);
            kk7.f(this.currentAccount).k(kk7.p0, this.V);
        }
    }

    public final void x0(byte[] bArr) {
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
        twoStepVerificationActivity.z0(password2, bArr, this.X, this.Y);
        twoStepVerificationActivity.Y = this.H;
        presentFragment(twoStepVerificationActivity, true);
        kk7.f(this.currentAccount).k(kk7.p0, this.V);
        t36 t36Var = this.k0;
        if (t36Var != null) {
            gl.d3(t36Var);
            this.k0 = null;
        }
    }

    public final void y0(TLRPC.TL_error tL_error, boolean z, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr2;
        String G;
        byte[] bArr3;
        TL_account.Password password;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new i81((byte) 11, this, z), 8);
            return;
        }
        A0();
        int i = kk7.o0;
        ArrayList arrayList = this.K;
        if (tL_error == null) {
            if ((tLObject instanceof TLRPC.TL_boolTrue) || (tLObject instanceof TLRPC.auth_Authorization)) {
                getMessagesController().m4(0L, "VALIDATE_PASSWORD");
                int i2 = kk7.p0;
                if (z) {
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((d) arrayList.get(i3)).removeSelfFromStack();
                    }
                    kk7.f(this.currentAccount).k(kk7.q0, new Object[0]);
                    kk7.f(this.currentAccount).k(i2, new Object[0]);
                    finishFragment();
                } else if (getParentActivity() != null) {
                    if (this.V.has_password) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        alertDialog$Builder.j(k96.M0(2131747638, null), new cwb(this, bArr, (byte) 1));
                        hd hdVar = alertDialog$Builder.a;
                        if (str == null && (password = this.V) != null && password.has_password) {
                            hdVar.U = k96.M0(2131742550, null);
                        } else {
                            hdVar.U = k96.M0(2131742541, null);
                        }
                        hdVar.S = k96.M0(2131742535, null);
                        Dialog showDialog = showDialog(hdVar);
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
                        kk7.f(this.currentAccount).k(i, new Object[0]);
                    }
                    p3c p3cVar = new p3c(7, this.V);
                    p3cVar.I = this.I;
                    if (bArr != null) {
                        bArr3 = bArr;
                    } else {
                        bArr3 = this.W;
                    }
                    p3cVar.H0(bArr3, this.X, this.Y, this.a0);
                    p3cVar.Z = this.Z;
                    p3cVar.H = this.H;
                    presentFragment(p3cVar, true);
                    kk7.f(this.currentAccount).k(i2, this.V);
                }
            }
        } else if (!"EMAIL_UNCONFIRMED".equals(tL_error.text) && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
            if ("EMAIL_INVALID".equals(tL_error.text)) {
                K0(k96.M0(2131689472, null), k96.M0(2131747252, null));
            } else if ("EMAIL_NOT_ALLOWED".equals(tL_error.text)) {
                K0(k96.M0(2131689472, null), k96.M0(2131751188, null));
            } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                int intValue = Utilities.z(tL_error.text).intValue();
                if (intValue < 60) {
                    G = k96.G(intValue, "Seconds", new Object[0]);
                } else {
                    G = k96.G(intValue / 60, "Minutes", new Object[0]);
                }
                K0(k96.M0(2131689472, null), k96.a0("FloodWaitTime", null, 2131750669, G));
            } else {
                K0(k96.M0(2131689472, null), tL_error.text);
            }
        } else {
            kk7.f(this.currentAccount).k(i, new Object[0]);
            int size3 = arrayList.size();
            for (int i5 = 0; i5 < size3; i5++) {
                ((d) arrayList.get(i5)).removeSelfFromStack();
            }
            kk7 f = kk7.f(this.currentAccount);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = passwordinputsettings.new_algo;
            TL_account.Password password3 = this.V;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password3.new_secure_algo;
            byte[] bArr4 = password3.secure_random;
            String str2 = this.S;
            f.k(i, bArr, passwordKdfAlgo, securePasswordKdfAlgo, bArr4, str2, this.R, str2, this.Q);
            TL_account.Password password4 = this.V;
            password4.email_unconfirmed_pattern = this.S;
            p3c p3cVar2 = new p3c(5, password4);
            p3cVar2.I = this.I;
            if (bArr != null) {
                bArr2 = bArr;
            } else {
                bArr2 = this.W;
            }
            p3cVar2.H0(bArr2, this.X, this.Y, this.a0);
            p3cVar2.Z = this.Z;
            p3cVar2.H = this.H;
            presentFragment(p3cVar2, true);
        }
    }

    public final void z0(TLObject tLObject, boolean z, String str, TL_account.passwordInputSettings passwordinputsettings) {
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
                    tL_inputCheckPasswordSRP = mo9.d(this.W, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    tL_inputCheckPasswordSRP = null;
                }
                updatepasswordsettings.password = tL_inputCheckPasswordSRP;
            }
        }
        if (!z && str != null) {
            byte[] g1 = gl.g1(str);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = this.V.new_algo;
            if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                bArr2 = g1;
                bArr = mo9.c(g1, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            } else {
                bArr2 = g1;
                bArr = null;
            }
        } else {
            bArr = null;
            bArr2 = null;
        }
        pf2 pf2Var = new pf2(this, z, bArr, str, passwordinputsettings, (byte) 5);
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
                    byte[] b = mo9.b(bArr2, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo3);
                    passwordinputsettings.new_password_hash = b;
                    if (b == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "ALGO_INVALID";
                        pf2Var.run(null, tL_error);
                    }
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLObject, pf2Var, 10);
                return;
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "PASSWORD_HASH_INVALID";
            pf2Var.run(null, tL_error2);
            return;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLObject, pf2Var, 10);
    }

    public void F0() {
    }

    @Override
    public final void finishFragment() {
        if (this.H >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            Bundle l = ir2.l("afterSignup", true);
            ah6 ah6Var = new ah6();
            ah6Var.q0(l);
            presentFragment(ah6Var, true);
            return;
        }
        super.finishFragment();
    }

    public p3c(int i, TL_account.Password password) {
        super(null);
        this.G = false;
        this.H = -1;
        this.K = new ArrayList();
        this.W = new byte[0];
        this.i0 = new f3c(this, (byte) 0);
        this.j0 = new f3c(this, (byte) 1);
        this.P = i;
        this.V = password;
        if (password == null && (i == 6 || i == 8)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new h3c(this, (byte) 0), 10);
            return;
        }
        this.U = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
    }
}

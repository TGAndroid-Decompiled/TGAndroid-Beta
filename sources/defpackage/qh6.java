package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.BackupAgent;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.b;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
public final class qh6 extends e implements fn7 {
    public static final short A0;
    public boolean E;
    public boolean F;
    public byte G;
    public String H;
    public Bundle I;
    public TLRPC.TL_auth_sentCode J;
    public boolean K;
    public final AnimatorSet[] L;
    public AnimatorSet M;
    public w2c N;
    public zp4 O;
    public ko9 P;
    public int Q;
    public final boolean[] R;
    public id S;
    public w81 T;
    public fh6 U;
    public ImageView V;
    public RadialProgressView W;
    public ImageView X;
    public cx8 Y;
    public LinearLayout Z;
    public int a;
    public d26 a0;
    public final cna[] b;
    public boolean b0;
    public k53 c;
    public eh6 c0;
    public ValueAnimator d;
    public boolean d0;
    public boolean e;
    public Runnable e0;
    public boolean f;
    public ch3 f0;
    public TextView g0;
    public Dialog h;
    public boolean h0;
    public boolean i0;
    public final boolean[] j0;
    public final Runnable[] k0;
    public final boolean[] l0;
    public boolean m0;
    public Dialog n;
    public Space n0;
    public View o0;
    public boolean p0;
    public ls5 q0;
    public final ArrayList r;
    public boolean r0;
    public final ArrayList s;
    public TLRPC.TL_help_termsOfService s0;
    public int t0;
    public int u0;
    public int v0;
    public boolean w;
    public int w0;
    public boolean x;
    public int x0;
    public boolean y;
    public boolean y0;
    public ie6 z0;

    static {
        short s;
        if (xea.o() <= 1) {
            s = 150;
        } else {
            s = 100;
        }
        A0 = s;
    }

    public qh6(int i) {
        super(null);
        this.b = new cna[19];
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = true;
        this.x = true;
        this.E = true;
        this.F = false;
        this.G = (byte) 0;
        this.L = new AnimatorSet[2];
        this.R = new boolean[]{true, false};
        this.b0 = false;
        this.j0 = new boolean[2];
        this.k0 = new Runnable[2];
        this.l0 = new boolean[2];
        this.currentAccount = i;
        this.y = true;
    }

    public static int A0(qh6 qh6Var) {
        return qh6Var.currentAccount;
    }

    public static void A1(e eVar, String str, pm3 pm3Var, boolean z) {
        List list;
        if (eVar != null && eVar.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eVar.getParentActivity());
            id idVar = alertDialog$Builder.a;
            if (z) {
                idVar.S = ob6.M0(2131745798, null);
                idVar.U = ob6.M0(2131753718, "BannedPhoneNumber");
            } else if (pm3Var != null && (list = (List) pm3Var.d) != null && !list.isEmpty() && ((gy2) pm3Var.b) != null) {
                int i = Integer.MAX_VALUE;
                for (String str2 : (List) pm3Var.d) {
                    int length = str2.replace(" ", "").length();
                    if (length < i) {
                        i = length;
                    }
                }
                if (f78.h(str, false).length() - ((gy2) pm3Var.b).c.length() < i) {
                    idVar.S = ob6.M0(2131742488, null);
                    idVar.U = hl.S2(ob6.a0("ShortNumberInfo", null, 2131745084, ((gy2) pm3Var.b).a, (String) pm3Var.c));
                } else {
                    idVar.S = ob6.M0(2131745798, null);
                    idVar.U = ob6.M0(2131748933, null);
                }
            } else {
                idVar.S = ob6.M0(2131745798, null);
                idVar.U = ob6.M0(2131748933, null);
            }
            alertDialog$Builder.h(ob6.M0(2131753054, "BotHelp"), new bh(str, eVar, z));
            alertDialog$Builder.j(ob6.M0(2131747558, "OK"), null);
            eVar.showDialog(idVar);
        }
    }

    public static void E1(View view, boolean z) {
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        hl.A3(3.5f, view, null);
        if (z && (view instanceof lu7)) {
            Runnable runnable = (Runnable) view.getTag(2131296715);
            if (runnable != null) {
                view.removeCallbacks(runnable);
            }
            lu7 lu7Var = (lu7) view;
            AtomicReference atomicReference = new AtomicReference();
            EditText attachedEditText = lu7Var.getAttachedEditText();
            ry ryVar = new ry(attachedEditText, atomicReference, false, (byte) 5);
            lu7Var.a(1.0f);
            g65 g65Var = new g65(lu7Var, view, attachedEditText, ryVar, (byte) 15);
            atomicReference.set(g65Var);
            view.postDelayed(g65Var, 2000L);
            view.setTag(2131296715, g65Var);
            if (attachedEditText != null) {
                attachedEditText.addTextChangedListener(ryVar);
            }
        }
    }

    public static void G1(Bundle bundle, SharedPreferences.Editor editor, String str) {
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj instanceof String) {
                if (str != null) {
                    editor.putString(qd4.y(str, "_|_", str2), (String) obj);
                } else {
                    editor.putString(str2, (String) obj);
                }
            } else if (obj instanceof Integer) {
                if (str != null) {
                    editor.putInt(qd4.y(str, "_|_", str2), ((Integer) obj).intValue());
                } else {
                    editor.putInt(str2, ((Integer) obj).intValue());
                }
            } else if (obj instanceof Boolean) {
                if (str != null) {
                    editor.putBoolean(qd4.y(str, "_|_", str2), ((Boolean) obj).booleanValue());
                } else {
                    editor.putBoolean(str2, ((Boolean) obj).booleanValue());
                }
            } else if (obj instanceof Bundle) {
                G1((Bundle) obj, editor, str2);
            }
        }
    }

    public static void m1(ImageView imageView, int i, int i2, PorterDuff.Mode mode) {
        if (imageView != null) {
            if (i != i2 || imageView.getColorFilter() == null) {
                imageView.setColorFilter(new PorterDuffColorFilter(i, mode));
            }
        }
    }

    public static void n1(ImageView imageView, int i, int i2) {
        if (imageView != null) {
            Drawable background = imageView.getBackground();
            if (background == null) {
                imageView.setBackground(aob.f0(i, 1, -1));
            } else if (i != i2) {
                aob.F1(background, i, true);
            }
        }
    }

    public static String p1(Exception exc) {
        if (exc == null) {
            return "NULL";
        }
        String simpleName = exc.getClass().getSimpleName();
        if (exc.getMessage() != null) {
            if (simpleName.length() > 0) {
                simpleName = simpleName.concat(" ");
            }
            simpleName = simpleName + exc.getMessage();
        }
        return simpleName.toUpperCase().replaceAll(" ", "_");
    }

    public static Bundle x1(int i, boolean z) {
        String str;
        try {
            Bundle bundle = new Bundle();
            Context context = a.b;
            if (z) {
                str = "_" + i;
            } else {
                str = "";
            }
            for (Map.Entry<String, ?> entry : context.getSharedPreferences("logininfo2".concat(str), 0).getAll().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                String[] split = key.split("_\\|_");
                if (split.length == 1) {
                    if (value instanceof String) {
                        bundle.putString(key, (String) value);
                    } else if (value instanceof Integer) {
                        bundle.putInt(key, ((Integer) value).intValue());
                    } else if (value instanceof Boolean) {
                        bundle.putBoolean(key, ((Boolean) value).booleanValue());
                    }
                } else if (split.length == 2) {
                    Bundle bundle2 = bundle.getBundle(split[0]);
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                        bundle.putBundle(split[0], bundle2);
                    }
                    if (value instanceof String) {
                        bundle2.putString(split[1], (String) value);
                    } else if (value instanceof Integer) {
                        bundle2.putInt(split[1], ((Integer) value).intValue());
                    } else if (value instanceof Boolean) {
                        bundle2.putBoolean(split[1], ((Boolean) value).booleanValue());
                    }
                }
            }
            return bundle;
        } catch (Exception e) {
            cc4.g(e, true);
            return null;
        }
    }

    public final void B1(int i, boolean z) {
        if (this.G == 1 && i == 0) {
            if (this.S == null && getParentActivity() != null && !getParentActivity().isFinishing()) {
                id idVar = new id(3, null, getParentActivity());
                this.S = idVar;
                idVar.j0 = false;
                idVar.show();
                return;
            }
            return;
        }
        this.Q = i;
        L1(true, z, false);
    }

    public final void C1(TLRPC.TL_auth_authorization tL_auth_authorization, boolean z) {
        uc7.s1(this.currentAccount).O();
        ConnectionsManager.getInstance(this.currentAccount).setUserId(tL_auth_authorization.user.id);
        yac.h(this.currentAccount).b();
        uc7.s1(this.currentAccount).O();
        yac.h(this.currentAccount).V = this.E;
        yac.h(this.currentAccount).v(tL_auth_authorization.user);
        yac.h(this.currentAccount).u(true);
        kf7 a0 = kf7.a0(this.currentAccount);
        a0.a.c(new ke7(a0, true, (byte) 1));
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_auth_authorization.user);
        kf7.a0(this.currentAccount).n1(arrayList, null, true, true);
        uc7.s1(this.currentAccount).i4(tL_auth_authorization.user, false, false);
        lv2 r = lv2.r(this.currentAccount);
        r.a = null;
        Utilities.e.c(new pu2(r, (byte) 0));
        Utilities.d.c(new pa7(uc7.s1(this.currentAccount), (byte) 9));
        ConnectionsManager.getInstance(this.currentAccount).updateDcSettings();
        uc7.s1(this.currentAccount).a3(true);
        uc7.s1(this.currentAccount).p3();
        uc7.s1(this.currentAccount).K(false);
        byte[] bArr = tL_auth_authorization.future_auth_token;
        if (bArr != null) {
            boolean z2 = f11.a;
            cc4.b("saveLogInToken ".concat(new String(bArr, StandardCharsets.UTF_8)));
            ArrayList b = r40.b();
            if (b == null) {
                b = new ArrayList();
            }
            b.add(0, tL_auth_authorization);
            SharedPreferences sharedPreferences = a.b.getSharedPreferences("saved_tokens_login", 0);
            ArrayList arrayList2 = new ArrayList();
            sharedPreferences.edit().clear().apply();
            for (int i = 0; i < Math.min(20, b.size()); i++) {
                arrayList2.add((TLRPC.TL_auth_authorization) b.get(i));
            }
            if (arrayList2.size() > 0) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putInt("count", arrayList2.size());
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    SerializedData serializedData = new SerializedData(((TLRPC.TL_auth_authorization) arrayList2.get(i2)).getObjectSize());
                    ((TLRPC.TL_auth_authorization) arrayList2.get(i2)).serializeToStream(serializedData);
                    edit.putString("log_in_token_" + i2, Utilities.f(serializedData.toByteArray()));
                }
                edit.apply();
                BackupAgent.a();
            }
        } else {
            cc4.b("onAuthSuccess future_auth_token is empty");
        }
        if (z) {
            uc7 s1 = uc7.s1(this.currentAccount);
            s1.U1.put(0, true);
            s1.V1.put(0, true);
        }
        ls6.d0(this.currentAccount).d1("tg_placeholders_android", false, true);
        boolean z3 = tL_auth_authorization.setup_password_required;
        int i3 = tL_auth_authorization.otherwise_relogin_days;
        if (getParentActivity() != null) {
            hl.k3(getParentActivity(), false);
        }
        o1();
        if (getParentActivity() instanceof LaunchActivity) {
            if (this.y) {
                this.y = false;
                this.p0 = true;
                ((LaunchActivity) getParentActivity()).O0(this.currentAccount, new k64((byte) 2, z));
                this.p0 = false;
                finishFragment();
                return;
            }
            if (z && z3) {
                o7c o7cVar = new o7c(6, null);
                o7cVar.H = i3;
                o7cVar.I = true;
                presentFragment(o7cVar, true);
            } else {
                Bundle l = bs2.l("afterSignup", z);
                fj6 fj6Var = new fj6();
                fj6Var.s0(l);
                presentFragment(fj6Var, true);
            }
            jn7.f(this.currentAccount).k(jn7.j0, new Object[0]);
            ob6.D0().V0(this.currentAccount, true);
            ee9.Y(true);
        } else if (getParentActivity() instanceof ExternalActionActivity) {
            ExternalActionActivity externalActionActivity = (ExternalActionActivity) getParentActivity();
            externalActionActivity.d(externalActionActivity.h, externalActionActivity.n, externalActionActivity.w, true, externalActionActivity.r, externalActionActivity.s ? 1 : 0);
            externalActionActivity.c.Z();
            ActionBarLayout actionBarLayout = externalActionActivity.d;
            if (actionBarLayout != null) {
                actionBarLayout.Z();
            }
            wma wmaVar = externalActionActivity.e;
            if (wmaVar != null) {
                wmaVar.setVisibility(0);
            }
        }
    }

    public final void D1() {
        if (this.R[this.K ? 1 : 0]) {
            if (this.W.getTag() != null) {
                if (getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = ob6.M0(2131744489, "StopLoadingTitle");
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131744490, "StopLoading");
                alertDialog$Builder.j(ob6.M0(2131742865, "WaitMore"), null);
                alertDialog$Builder.g(ob6.M0(2131744498, "Stop"), new ke6(this, (byte) 0));
                showDialog(idVar);
                return;
            }
            this.b[this.a].h(null);
        }
    }

    public final void F1(String str, TLRPC.auth_SentCode auth_sentcode) {
        if (this.fragmentView == null) {
            this.q0 = new ls5(this, str, auth_sentcode, (byte) 21);
            return;
        }
        this.e = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", "+" + str);
        bundle.putString("ephone", "+" + str);
        bundle.putString("phoneFormated", str);
        q1(bundle, auth_sentcode, true);
    }

    public final void H1(Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str) {
        if (!this.r0) {
            return;
        }
        y1(false, true);
        this.r0 = false;
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = bundle.getString("phoneFormated");
        tL_auth_resendCode.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_resendCode.flags |= 1;
        tL_auth_resendCode.reason = str;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_resendCode, new mw3(this, bundle, (byte) 19), 10);
    }

    public final void I1(boolean z, boolean z2) {
        if (this.b0 == z && z2) {
            return;
        }
        this.b0 = z;
        if (hl.A1()) {
            z = false;
        }
        if (z) {
            hl.t1(this.fragmentView);
            hl.W2(getParentActivity(), this.classGuid);
            if (z2) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                this.d = duration;
                duration.setInterpolator(k43.f);
                this.d.addUpdateListener(new je6(this, (byte) 0));
                this.d.addListener(new se6(this, (byte) 0));
                this.d.start();
                return;
            }
            this.c.setVisibility(0);
            return;
        }
        hl.z2(getParentActivity(), this.classGuid);
        if (z2) {
            ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(300L);
            this.d = duration2;
            duration2.setInterpolator(dt3.e);
            this.d.addUpdateListener(new je6(this, (byte) 1));
            this.d.addListener(new se6(this, (byte) 1));
            this.d.start();
            return;
        }
        this.c.setVisibility(8);
    }

    public final void J1(int i, boolean z, Bundle bundle, boolean z2) {
        boolean z3;
        int i2;
        if (i != 0 && i != 5 && i != 6 && i != 9 && i != 10 && i != 12 && i != 17 && i != 16) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i == this.a) {
            z = false;
        }
        int i3 = 8;
        if (z3) {
            if (i == 0) {
                this.w = true;
                this.x = true;
            }
            this.K = true;
            K1(false, z);
            L1(false, z, false);
            this.K = false;
            L1(false, z, false);
            if (!z) {
                K1(true, false);
            }
        } else {
            this.K = false;
            K1(false, z);
            L1(false, z, false);
            if (i != 8) {
                this.K = true;
            }
        }
        cna[] cnaVarArr = this.b;
        if (z) {
            cna cnaVar = cnaVarArr[this.a];
            cna cnaVar2 = cnaVarArr[i];
            this.a = i;
            ImageView imageView = this.V;
            if (cnaVar2.b() || this.y) {
                i3 = 0;
            }
            imageView.setVisibility(i3);
            cnaVar2.m(bundle, false);
            setParentActivityTitle(cnaVar2.getHeaderName());
            cnaVar2.j();
            Point point = hl.q;
            int i4 = point.x;
            if (z2) {
                i4 = -i4;
            }
            cnaVar2.setX(i4);
            cnaVar2.setVisibility(0);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new rw(this, z3, cnaVar, (byte) 6));
            Property property = View.TRANSLATION_X;
            int i5 = point.x;
            if (!z2) {
                i5 = -i5;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(cnaVar, property, i5), ObjectAnimator.ofFloat(cnaVar2, property, 0.0f));
            animatorSet.setDuration(300L);
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.start();
            I1(cnaVar2.a(), true);
            return;
        }
        ImageView imageView2 = this.V;
        if (!cnaVarArr[i].b() && !this.y) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        imageView2.setVisibility(i2);
        cnaVarArr[this.a].setVisibility(8);
        cnaVarArr[this.a].g();
        this.a = i;
        cnaVarArr[i].m(bundle, false);
        cnaVarArr[i].setVisibility(0);
        setParentActivityTitle(cnaVarArr[i].getHeaderName());
        cnaVarArr[i].j();
        I1(cnaVarArr[i].a(), false);
    }

    public final void K1(boolean z, boolean z2) {
        TimeInterpolator timeInterpolator;
        boolean z3 = this.K;
        boolean z4 = !z3 ? 1 : 0;
        boolean[] zArr = this.R;
        if (zArr[z3 ? 1 : 0] != z) {
            AnimatorSet[] animatorSetArr = this.L;
            AnimatorSet animatorSet = animatorSetArr[z3 ? 1 : 0];
            if (animatorSet != null) {
                if (z2) {
                    animatorSet.removeAllListeners();
                }
                animatorSetArr[this.K ? 1 : 0].cancel();
            }
            boolean z5 = this.K;
            zArr[z5 ? 1 : 0] = z;
            if (z2) {
                animatorSetArr[z5 ? 1 : 0] = new AnimatorSet();
                if (!z3) {
                    this.O.e(z, z2);
                }
                animatorSetArr[this.K ? 1 : 0].addListener(new y5(this, z4, z, (byte) 4));
                int i = 150;
                if (!z3) {
                    if (z) {
                        timeInterpolator = hl.F;
                        i = 200;
                    } else {
                        timeInterpolator = hl.G;
                    }
                } else {
                    timeInterpolator = null;
                }
                animatorSetArr[this.K ? 1 : 0].setDuration(i);
                animatorSetArr[this.K ? 1 : 0].setInterpolator(timeInterpolator);
                animatorSetArr[this.K ? 1 : 0].start();
            } else if (!z3) {
                this.O.e(z, z2);
            }
        }
    }

    public final void L1(boolean z, boolean z2, boolean z3) {
        boolean[] zArr = this.j0;
        if (z2 && zArr[this.K ? 1 : 0] == z && !z3) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            hl.c3(new ne6(this, z, z2, z3));
            return;
        }
        boolean z4 = this.K;
        boolean[] zArr2 = this.l0;
        if (!z3 && z4) {
            zArr[z4 ? 1 : 0] = z;
            if (z2) {
                boolean z5 = zArr2[z4 ? 1 : 0];
                Runnable[] runnableArr = this.k0;
                if (z5) {
                    hl.r(runnableArr[z4 ? 1 : 0]);
                    zArr2[this.K ? 1 : 0] = false;
                    return;
                } else if (z) {
                    ne6 ne6Var = new ne6(this, z4 ? 1 : 0, z, z2);
                    runnableArr[z4 ? 1 : 0] = ne6Var;
                    hl.d3(ne6Var, 2000L);
                    zArr2[this.K ? 1 : 0] = true;
                    return;
                }
            }
        } else {
            zArr2[z4 ? 1 : 0] = false;
            zArr[z4 ? 1 : 0] = z;
        }
        AnimatorSet animatorSet = this.M;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (!z4) {
            this.O.f(z, z2);
            return;
        }
        float f = 0.0f;
        float f2 = 1.0f;
        if (z2) {
            this.M = new AnimatorSet();
            if (z) {
                f2 = 0.0f;
                f = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            ofFloat.addListener(new gf4((byte) 12, this, z));
            ofFloat.addUpdateListener(new je6(this, (byte) 2));
            this.M.playTogether(ofFloat);
            this.M.setDuration(150L);
            this.M.start();
            return;
        }
        RadialProgressView radialProgressView = this.W;
        if (z) {
            radialProgressView.setVisibility(0);
            this.W.setScaleX(1.0f);
            this.W.setScaleY(1.0f);
            this.W.setAlpha(1.0f);
            return;
        }
        radialProgressView.setTag(null);
        this.W.setVisibility(4);
        this.W.setScaleX(0.1f);
        this.W.setScaleY(0.1f);
        this.W.setAlpha(0.0f);
    }

    public final boolean M1(View view) {
        if (!s1()) {
            return hl.E3(view);
        }
        return true;
    }

    public final void N1(boolean z, boolean z2) {
        if (z == this.y0) {
            return;
        }
        ie6 ie6Var = this.z0;
        if (ie6Var != null) {
            hl.r(ie6Var);
            this.z0 = null;
        }
        this.y0 = z;
        this.X.clearAnimation();
        ImageView imageView = this.X;
        float f = 0.0f;
        int i = 0;
        if (z2) {
            imageView.setVisibility(0);
            ViewPropertyAnimator animate = this.X.animate();
            if (z) {
                f = 1.0f;
            }
            animate.alpha(f).withEndAction(new xac((byte) 26, this, z)).start();
            return;
        }
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        ImageView imageView2 = this.X;
        if (z) {
            f = 1.0f;
        }
        imageView2.setAlpha(f);
    }

    public final void O1(String str, String str2, String str3) {
        if (this.W.getTag() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = ob6.M0(2131745824, "ResetMyAccountWarningText");
        id idVar = alertDialog$Builder.a;
        idVar.U = M0;
        idVar.S = ob6.M0(2131745826, "ResetMyAccountWarning");
        alertDialog$Builder.j(ob6.M0(2131745825, "ResetMyAccountWarningReset"), new pt((Object) this, (Object) str, (Object) str2, (Object) str3, (byte) 14));
        alertDialog$Builder.g(ob6.M0(2131752570, "Cancel"), null);
        showDialog(idVar);
    }

    public final void P1() {
        boolean z;
        this.fragmentView.setBackgroundColor(aob.w0(null, aob.d6, false));
        ImageView imageView = this.V;
        int i = aob.G6;
        int w0 = aob.w0(null, i, false);
        m1(imageView, w0, this.t0, PorterDuff.Mode.SRC_ATOP);
        this.t0 = w0;
        ImageView imageView2 = this.V;
        int i2 = aob.i6;
        int w02 = aob.w0(null, i2, false);
        n1(imageView2, w02, this.u0);
        this.u0 = w02;
        int w03 = aob.w0(null, i, false);
        if (w03 != this.v0 || this.Y.getColorFilter() == null) {
            this.Y.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            this.v0 = w03;
        }
        ImageView imageView3 = this.X;
        int w04 = aob.w0(null, i2, false);
        n1(imageView3, w04, this.w0);
        this.w0 = w04;
        RadialProgressView radialProgressView = this.W;
        int i3 = aob.P9;
        radialProgressView.setProgressColor(aob.w0(null, i3, false));
        this.O.updateColors();
        this.N.setColor(aob.w0(null, aob.O9, false));
        this.N.setBackgroundColor(aob.w0(null, i3, false));
        for (cna cnaVar : this.b) {
            cnaVar.updateColors();
        }
        k53 k53Var = this.c;
        i53 i53Var = k53Var.a;
        int w05 = aob.w0(null, aob.G6, false);
        if (w05 != k53Var.s || i53Var.getColorFilter() == null) {
            k53Var.s = w05;
            i53Var.setColorFilter(w05, PorterDuff.Mode.SRC_ATOP);
        }
        int w06 = aob.w0(null, aob.i6, false);
        int o = vm2.o(w06, 30);
        if (w06 != k53Var.w) {
            z = true;
        } else {
            z = false;
        }
        k53Var.w = w06;
        int i4 = 0;
        while (true) {
            View[] viewArr = k53Var.c;
            if (i4 >= viewArr.length) {
                break;
            }
            View view = viewArr[i4];
            if (view != null) {
                if (view.getBackground() != null) {
                    if (z) {
                        aob.F1(view.getBackground(), w06, false);
                        aob.F1(view.getBackground(), o, true);
                    }
                } else {
                    k53.a(i4, view);
                }
                if (view instanceof j53) {
                    ((j53) view).updateColors();
                }
            }
            i4++;
        }
        eh6 eh6Var = this.c0;
        if (eh6Var != null) {
            int i5 = eh6.G;
            eh6Var.b();
        }
    }

    public final void Q1(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        if (this.Y != null) {
            int connectionState = getConnectionsManager().getConnectionState();
            if (this.x0 != connectionState || z2) {
                this.x0 = connectionState;
                SharedPreferences sharedPreferences = a.b.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("proxy_ip", "");
                if (sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i = this.x0;
                if (i != 3 && i != 5) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (i != 1 && i != 2 && i != 4) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (z3) {
                    this.Y.b(true, z4, z);
                    N1(true, z);
                } else if ((getMessagesController().l3 && !xea.v1.isEmpty()) || z5) {
                    this.Y.b(true, z4, z);
                    if (this.y0) {
                        return;
                    }
                    ie6 ie6Var = this.z0;
                    if (ie6Var != null) {
                        hl.r(ie6Var);
                    }
                    this.y0 = true;
                    ie6 ie6Var2 = new ie6(this, (byte) 1);
                    this.z0 = ie6Var2;
                    hl.d3(ie6Var2, 5000L);
                } else {
                    N1(false, z);
                }
            }
        }
    }

    @Override
    public final void clearViews() {
        View view = this.fragmentView;
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                try {
                    onRemoveFromParent();
                    viewGroup.removeViewInLayout(this.fragmentView);
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
            if (this.p0) {
                this.o0 = this.fragmentView;
            }
            this.fragmentView = null;
        }
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar != null && !this.p0) {
            ViewGroup viewGroup2 = (ViewGroup) aVar.getParent();
            if (viewGroup2 != null) {
                try {
                    viewGroup2.removeViewInLayout(this.actionBar);
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
            }
            this.actionBar = null;
        }
        clearSheets();
        this.parentLayout = null;
    }

    @Override
    public final android.view.View createView(android.content.Context r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qh6.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.T1) {
            Q1(true, false);
        } else if (i == jn7.s1 && this.i0) {
            uc7 messagesController = getMessagesController();
            if (!messagesController.v3.contains("SETUP_LOGIN_EMAIL") && !messagesController.v3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
                finishFragment();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return zye.a(new u00(this, (byte) 9), aob.G6, aob.D6, aob.H6, aob.i6, aob.P9, aob.O9, aob.k6, aob.l6, aob.I6, aob.q7, aob.y6, aob.i7, aob.q6, aob.Ni, aob.Q9, aob.p7, aob.J6, aob.Y6, aob.W6, aob.X6, aob.h5, aob.q5, aob.j5);
    }

    @Override
    public final boolean isLightStatusBar() {
        if (vm2.h(aob.w0(null, aob.d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.i0;
    }

    public final void o1() {
        String str;
        Context context = a.b;
        if (this.y) {
            str = "_" + this.currentAccount;
        } else {
            str = "";
        }
        SharedPreferences.Editor edit = context.getSharedPreferences("logininfo2".concat(str), 0).edit();
        edit.clear();
        edit.commit();
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        cg6 cg6Var = (cg6) this.b[5];
        if (cg6Var != null) {
            cg6Var.N.h(i, i2, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (!this.i0 || this.a != 12) {
            int i = this.a;
            cna[] cnaVarArr = this.b;
            if (i == 0 || (this.G == 3 && i == 12)) {
                if (z) {
                    for (cna cnaVar : cnaVarArr) {
                        if (cnaVar != null) {
                            cnaVar.e();
                        }
                    }
                    o1();
                }
                return true;
            } else if (i == 6) {
                if (z) {
                    cnaVarArr[i].c(true);
                    J1(0, true, null, true);
                    return false;
                }
            } else if (i != 7 && i != 8) {
                if ((i < 1 || i > 4) && i != 11 && i != 15) {
                    if (i == 5) {
                        if (z) {
                            ((cg6) cnaVarArr[i]).x.callOnClick();
                            return false;
                        }
                    } else if (i == 9) {
                        if (z) {
                            cnaVarArr[i].c(true);
                            J1(7, true, null, true);
                            return false;
                        }
                    } else if (i == 10) {
                        if (z) {
                            cnaVarArr[i].c(true);
                            J1(9, true, null, true);
                            return false;
                        }
                    } else if (i == 13) {
                        if (z) {
                            cnaVarArr[i].c(true);
                            J1(12, true, null, true);
                            return false;
                        }
                    } else if (z && cnaVarArr[i].c(true)) {
                        J1(0, true, null, true);
                        return false;
                    }
                } else if (z && cnaVarArr[i].c(false)) {
                    J1(0, true, null, true);
                    return false;
                }
            } else if (z) {
                cnaVarArr[i].c(true);
                J1(6, true, null, true);
            }
        }
        return false;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        I1(this.b[this.a].a(), false);
        eh6 eh6Var = this.c0;
        if (eh6Var != null) {
            int i = eh6.G;
            eh6Var.a();
        }
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z, Runnable runnable) {
        return null;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        try {
            if (dialog == this.h) {
                ArrayList arrayList = this.r;
                if (!arrayList.isEmpty() && getParentActivity() != null) {
                    getParentActivity().requestPermissions((String[]) arrayList.toArray(new String[0]), 6);
                    return;
                }
            }
            if (dialog == this.n) {
                ArrayList arrayList2 = this.s;
                if (!arrayList2.isEmpty() && getParentActivity() != null) {
                    hl.d3(new ie6(this, (byte) 0), 200L);
                    getParentActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 7);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, jn7.T1);
        getNotificationCenter().b(this, jn7.s1);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        Runnable[] runnableArr;
        super.onFragmentDestroy();
        int i = 0;
        while (true) {
            cna[] cnaVarArr = this.b;
            if (i >= cnaVarArr.length) {
                break;
            }
            cna cnaVar = cnaVarArr[i];
            if (cnaVar != null) {
                cnaVar.e();
            }
            i++;
        }
        id idVar = this.S;
        if (idVar != null) {
            idVar.dismiss();
            this.S = null;
        }
        for (Runnable runnable : this.k0) {
            if (runnable != null) {
                hl.r(runnable);
            }
        }
        getNotificationCenter().n(this, jn7.T1);
        getNotificationCenter().n(this, jn7.s1);
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.y) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(true, false);
        }
        hl.z2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        boolean z;
        if (strArr.length != 0 && iArr.length != 0) {
            if (iArr[0] == 0) {
                z = true;
            } else {
                z = false;
            }
            cna[] cnaVarArr = this.b;
            if (i == 6) {
                this.w = false;
                int i2 = this.a;
                if (i2 == 0) {
                    cna cnaVar = cnaVarArr[i2];
                    ((ph6) cnaVar).O = true;
                    cnaVar.h(null);
                }
            } else if (i == 7) {
                this.x = false;
                int i3 = this.a;
                if (i3 == 0) {
                    ((ph6) cnaVarArr[i3]).p();
                }
            } else if (i == 20) {
                if (z) {
                    ((cg6) cnaVarArr[5]).N.l();
                }
            } else if (i == 151 && z) {
                cg6 cg6Var = (cg6) cnaVarArr[5];
                cg6Var.post(new re6(cg6Var, (byte) 0));
            }
        }
    }

    @Override
    public final void onResume() {
        cna cnaVar;
        int i;
        cna[] cnaVarArr = this.b;
        super.onResume();
        if (this.y) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(false, false);
        }
        hl.V2(getParentActivity(), this.classGuid);
        View view = this.fragmentView;
        if (view != null) {
            view.requestLayout();
        }
        try {
            int i2 = this.a;
            if (i2 >= 1 && i2 <= 4) {
                cna cnaVar2 = cnaVarArr[i2];
                if ((cnaVar2 instanceof tg6) && (i = ((tg6) cnaVar2).W) != 0 && Math.abs((System.currentTimeMillis() / 1000) - i) >= 86400) {
                    cnaVarArr[this.a].c(true);
                    J1(0, false, null, true);
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        int i3 = this.a;
        if (i3 == 0 && !this.d0 && (cnaVar = cnaVarArr[i3]) != null) {
            cnaVar.j();
        }
        if (s1()) {
            hl.t1(this.fragmentView);
            hl.W2(getParentActivity(), this.classGuid);
        }
        int i4 = this.a;
        if (i4 >= 0 && i4 < cnaVarArr.length) {
            cnaVarArr[i4].i();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            if (this.fragmentView != null && this.V != null && this.Y != null && this.X != null && this.W != null && this.O != null && this.N != null && this.c != null) {
                for (cna cnaVar : this.b) {
                    if (cnaVar == null) {
                        return;
                    }
                }
                P1();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void q1(final Bundle bundle, final TLRPC.auth_SentCode auth_sentcode, boolean z) {
        if (auth_sentcode instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
            TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) auth_sentcode;
            bundle.putString("product", tL_auth_sentCodePaymentRequired.store_product);
            bundle.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
            bundle.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
            bundle.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
            bundle.putString("currency", tL_auth_sentCodePaymentRequired.currency);
            bundle.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
            bundle.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
            J1(18, true, bundle, true);
            return;
        }
        TLRPC.auth_SentCodeType auth_sentcodetype = auth_sentcode.type;
        if ((auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms) && !auth_sentcodetype.verifiedFirebase && !this.r0) {
            if (b.b.hasServices()) {
                TLRPC.TL_auth_sentCodeTypeFirebaseSms tL_auth_sentCodeTypeFirebaseSms = (TLRPC.TL_auth_sentCodeTypeFirebaseSms) auth_sentcode.type;
                B1(0, true);
                this.r0 = true;
                String string = bundle.getString("phoneFormated");
                if (tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce != null) {
                    IntegrityManager create = IntegrityManagerFactory.create(getParentActivity());
                    String str = new String(Base64.encode(tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce, 8));
                    cc4.b("getting classic integrity with nonce = ".concat(str));
                    create.requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str).setCloudProjectNumber(tL_auth_sentCodeTypeFirebaseSms.play_integrity_project_id).build()).addOnSuccessListener(new le6(this, bundle, auth_sentcode, string, z)).addOnFailureListener(new OnFailureListener(this) {
                        public final qh6 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onFailure(Exception exc) {
                            byte b = r4;
                            TLRPC.auth_SentCode auth_sentcode2 = auth_sentcode;
                            Bundle bundle2 = bundle;
                            qh6 qh6Var = this.b;
                            switch (b) {
                                case 0:
                                    String str2 = "PLAYINTEGRITY_EXCEPTION_" + qh6.p1(exc);
                                    cc4.e("{" + str2 + "} Resend firebase sms because integrity threw error", exc);
                                    qh6Var.H1(bundle2, auth_sentcode2, str2);
                                    return;
                                default:
                                    cc4.g(exc, true);
                                    String str3 = "SAFETYNET_EXCEPTION_" + qh6.p1(exc);
                                    cc4.b("{" + str3 + "} Resend firebase sms because of safetynet exception");
                                    qh6Var.H1(bundle2, auth_sentcode2, str3);
                                    return;
                            }
                        }
                    });
                    return;
                }
                h05 h05Var = new h05(a.b, ss9.a, (wn) null, new uif((byte) 13));
                byte[] bArr = auth_sentcode.type.nonce;
                String str2 = f11.f;
                o6d o6dVar = h05Var.i;
                g5e g5eVar = new g5e(o6dVar, bArr, str2);
                o6dVar.b.d(0, g5eVar);
                pgd.a(g5eVar, new j09(new Object(), (byte) 26)).addOnSuccessListener(new le6(this, string, auth_sentcode, bundle, z)).addOnFailureListener(new OnFailureListener(this) {
                    public final qh6 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onFailure(Exception exc) {
                        byte b = r4;
                        TLRPC.auth_SentCode auth_sentcode2 = auth_sentcode;
                        Bundle bundle2 = bundle;
                        qh6 qh6Var = this.b;
                        switch (b) {
                            case 0:
                                String str22 = "PLAYINTEGRITY_EXCEPTION_" + qh6.p1(exc);
                                cc4.e("{" + str22 + "} Resend firebase sms because integrity threw error", exc);
                                qh6Var.H1(bundle2, auth_sentcode2, str22);
                                return;
                            default:
                                cc4.g(exc, true);
                                String str3 = "SAFETYNET_EXCEPTION_" + qh6.p1(exc);
                                cc4.b("{" + str3 + "} Resend firebase sms because of safetynet exception");
                                qh6Var.H1(bundle2, auth_sentcode2, str3);
                                return;
                        }
                    }
                });
                return;
            }
            cc4.b("{GOOGLE_PLAY_SERVICES_NOT_AVAILABLE} Resend firebase sms because firebase is not available");
            H1(bundle, auth_sentcode, "GOOGLE_PLAY_SERVICES_NOT_AVAILABLE");
            return;
        }
        bundle.putString("phoneHash", auth_sentcode.phone_code_hash);
        TLRPC.auth_CodeType auth_codetype = auth_sentcode.next_type;
        if (auth_codetype instanceof TLRPC.TL_auth_codeTypeCall) {
            bundle.putInt("nextType", 4);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeFlashCall) {
            bundle.putInt("nextType", 3);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeSms) {
            bundle.putInt("nextType", 2);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeMissedCall) {
            bundle.putInt("nextType", 11);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeFragmentSms) {
            bundle.putInt("nextType", 15);
        }
        if (auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeApp) {
            bundle.putInt("type", 1);
            bundle.putInt("length", auth_sentcode.type.length);
            J1(1, z, bundle, false);
            return;
        }
        int i = auth_sentcode.timeout;
        if (i == 0) {
            boolean z2 = f11.a;
            i = 60;
            auth_sentcode.timeout = 60;
        }
        bundle.putInt("timeout", i * 1000);
        TLRPC.auth_SentCodeType auth_sentcodetype2 = auth_sentcode.type;
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeCall) {
            bundle.putInt("type", 4);
            bundle.putInt("length", auth_sentcode.type.length);
            J1(4, z, bundle, false);
        } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt("type", 3);
            bundle.putString("pattern", auth_sentcode.type.pattern);
            J1(3, z, bundle, false);
        } else if (!(auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSms) && !(auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
            if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFragmentSms) {
                bundle.putInt("type", 15);
                bundle.putString("url", auth_sentcode.type.url);
                bundle.putInt("length", auth_sentcode.type.length);
                J1(15, z, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeMissedCall) {
                bundle.putInt("type", 11);
                bundle.putInt("length", auth_sentcode.type.length);
                bundle.putString("prefix", auth_sentcode.type.prefix);
                J1(11, z, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSetUpEmailRequired) {
                bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
                J1(12, z, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
                bundle.putString("emailPattern", auth_sentcode.type.email_pattern);
                bundle.putInt("length", auth_sentcode.type.length);
                bundle.putInt("nextPhoneLoginDate", auth_sentcode.type.next_phone_login_date);
                bundle.putInt("resetAvailablePeriod", auth_sentcode.type.reset_available_period);
                bundle.putInt("resetPendingDate", auth_sentcode.type.reset_pending_date);
                J1(14, z, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                String str3 = auth_sentcodetype2.beginning;
                if (str3 != null) {
                    bundle.putString("beginning", str3);
                }
                J1(16, z, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                String str4 = auth_sentcodetype2.beginning;
                if (str4 != null) {
                    bundle.putString("beginning", str4);
                }
                J1(17, z, bundle, false);
            }
        } else {
            bundle.putInt("type", 2);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putBoolean("firebase", auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms);
            J1(2, z, bundle, false);
        }
    }

    public final HashSet r1() {
        List<SubscriptionInfo> list;
        HashSet hashSet = new HashSet();
        try {
            String line1Number = ((TelephonyManager) a.b.getSystemService("phone")).getLine1Number();
            if (!TextUtils.isEmpty(line1Number)) {
                hashSet.add(line1Number);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        try {
            SubscriptionManager from = SubscriptionManager.from(getParentActivity());
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                list = from.getCompleteActiveSubscriptionInfoList();
            } else {
                list = null;
            }
            if ((list == null || list.isEmpty()) && i >= 28) {
                list = from.getAccessibleSubscriptionInfoList();
            }
            if (list == null || list.isEmpty()) {
                list = from.getActiveSubscriptionInfoList();
            }
            if (list != null) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    String number = list.get(i2).getNumber();
                    if (!TextUtils.isEmpty(number)) {
                        hashSet.add(number);
                    }
                }
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
        return hashSet;
    }

    public final boolean s1() {
        if (this.b[this.a].a() && !hl.A1()) {
            return true;
        }
        return false;
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("currentViewNum", this.a);
            bundle2.putInt("syncContacts", this.E ? 1 : 0);
            for (int i = 0; i <= this.a; i++) {
                cna cnaVar = this.b[i];
                if (cnaVar != null) {
                    cnaVar.l(bundle2);
                }
            }
            Context context = a.b;
            StringBuilder sb = new StringBuilder();
            sb.append("logininfo2");
            if (this.y) {
                str = "_" + this.currentAccount;
            } else {
                str = "";
            }
            sb.append(str);
            SharedPreferences.Editor edit = context.getSharedPreferences(sb.toString(), 0).edit();
            edit.clear();
            G1(bundle2, edit, null);
            edit.commit();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void t1(Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z, IntegrityTokenResponse integrityTokenResponse) {
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            cc4.b("Resend firebase sms because integrity token = null");
            H1(bundle, auth_sentcode, "PLAYINTEGRITY_TOKEN_NULL");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.play_integrity_token = str2;
        tL_auth_requestFirebaseSms.flags |= 4;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new oe6((byte) 1, this, bundle, auth_sentcode, z), 10);
    }

    public final void u1(String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z, ts9 ts9Var) {
        String str2;
        l9d l9dVar = ((zbf) ((ie9) ts9Var.a)).b;
        if (l9dVar == null) {
            str2 = null;
        } else {
            str2 = l9dVar.a;
        }
        if (str2 != null) {
            TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
            tL_auth_requestFirebaseSms.phone_number = str;
            tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
            tL_auth_requestFirebaseSms.safety_net_token = str2;
            tL_auth_requestFirebaseSms.flags |= 1;
            String[] split = str2.split("\\.");
            if (split.length > 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(Base64.decode(split[1].getBytes(StandardCharsets.UTF_8), 0)));
                    boolean optBoolean = jSONObject.optBoolean("basicIntegrity");
                    boolean optBoolean2 = jSONObject.optBoolean("ctsProfileMatch");
                    try {
                        if (optBoolean) {
                            if (optBoolean2) {
                                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new oe6((byte) 0, this, bundle, auth_sentcode, z), 10);
                            } else if (!optBoolean2) {
                                cc4.b("{SAFETYNET_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false");
                                H1(bundle, auth_sentcode, "SAFETYNET_CTSPROFILEMATCH_FALSE");
                            }
                        } else if (!optBoolean2) {
                            cc4.b("{SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false and basicIntegrity = false");
                            H1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE");
                        } else {
                            cc4.b("{SAFETYNET_BASICINTEGRITY_FALSE} Resend firebase sms because basicIntegrity = false");
                            H1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_FALSE");
                        }
                    } catch (JSONException e) {
                        e = e;
                        cc4.g(e, true);
                        cc4.b("{SAFETYNET_JSON_EXCEPTION} Resend firebase sms because of exception");
                        H1(bundle, auth_sentcode, "SAFETYNET_JSON_EXCEPTION");
                    }
                } catch (JSONException e2) {
                    e = e2;
                }
            } else {
                cc4.b("{SAFETYNET_CANT_SPLIT} Resend firebase sms because can't split JWS token");
                H1(bundle, auth_sentcode, "SAFETYNET_CANT_SPLIT");
            }
        } else {
            cc4.b("{SAFETYNET_NULL_JWS} Resend firebase sms because JWS = null");
            H1(bundle, auth_sentcode, "SAFETYNET_NULL_JWS");
        }
    }

    public final void v1(TLRPC.TL_error tL_error, String str, String str2, String str3) {
        y1(false, true);
        if (tL_error == null) {
            if (str != null && str2 != null && str3 != null) {
                Bundle bundle = new Bundle();
                bundle.putString("phoneFormated", str);
                bundle.putString("phoneHash", str2);
                bundle.putString("code", str3);
                J1(5, true, bundle, false);
                return;
            }
            J1(0, true, null, true);
        } else if (tL_error.text.equals("2FA_RECENT_CONFIRM")) {
            z1(ob6.M0(2131745798, null), ob6.M0(2131745842, "ResetAccountCancelledAlert"));
        } else if (tL_error.text.startsWith("2FA_CONFIRM_WAIT_")) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("phoneFormated", str);
            bundle2.putString("phoneHash", str2);
            bundle2.putString("code", str3);
            bundle2.putInt("startTime", ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
            bundle2.putInt("waitTime", Utilities.z(tL_error.text.replace("2FA_CONFIRM_WAIT_", "")).intValue());
            J1(8, true, bundle2, false);
        } else {
            z1(ob6.M0(2131745798, null), tL_error.text);
        }
    }

    public final void w1(String str, String str2, String str3) {
        B1(0, true);
        TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
        deleteaccount.reason = "Forgot password";
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(deleteaccount, new au0(this, str, str2, str3), 10);
    }

    public final void y1(boolean z, boolean z2) {
        id idVar;
        if (this.Q != 0) {
            if (z) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.Q, true);
            }
            this.Q = 0;
        }
        if (this.G == 1 && (idVar = this.S) != null) {
            idVar.dismiss();
            this.S = null;
        }
        L1(false, z2, false);
    }

    public final void z1(String str, String str2) {
        if (str2 != null && getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            id idVar = alertDialog$Builder.a;
            idVar.S = str;
            idVar.U = str2;
            alertDialog$Builder.j(ob6.M0(2131747558, "OK"), null);
            showDialog(idVar);
        }
    }

    public qh6() {
        super(null);
        this.b = new cna[19];
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = true;
        this.x = true;
        this.E = true;
        this.F = false;
        this.G = (byte) 0;
        this.L = new AnimatorSet[2];
        this.R = new boolean[]{true, false};
        this.b0 = false;
        this.j0 = new boolean[2];
        this.k0 = new Runnable[2];
        this.l0 = new boolean[2];
    }
}

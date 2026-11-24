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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ExternalActionActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProxyListActivity;
public final class mf6 extends d implements gk7 {
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
    public wyb N;
    public un4 O;
    public vk9 P;
    public int Q;
    public final boolean[] R;
    public hd S;
    public n81 T;
    public bf6 U;
    public ImageView V;
    public RadialProgressView W;
    public ImageView X;
    public tt8 Y;
    public LinearLayout Z;
    public int a;
    public oc6 a0;
    public final jja[] b;
    public boolean b0;
    public s43 c;
    public af6 c0;
    public ValueAnimator d;
    public boolean d0;
    public boolean e;
    public Runnable e0;
    public boolean f;
    public sg3 f0;
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
    public sx5 q0;
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
    public ec6 z0;

    static {
        short s;
        if (gba.o() <= 1) {
            s = 150;
        } else {
            s = 100;
        }
        A0 = s;
    }

    public mf6(int i) {
        super(null);
        this.b = new jja[19];
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

    public static void D1(View view, boolean z) {
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        gl.B3(3.5f, view, null);
        if (z && (view instanceof er7)) {
            Runnable runnable = (Runnable) view.getTag(2131296715);
            if (runnable != null) {
                view.removeCallbacks(runnable);
            }
            er7 er7Var = (er7) view;
            AtomicReference atomicReference = new AtomicReference();
            EditText attachedEditText = er7Var.getAttachedEditText();
            qy qyVar = new qy(attachedEditText, atomicReference, false, (byte) 5);
            er7Var.a(1.0f);
            e45 e45Var = new e45(er7Var, view, attachedEditText, qyVar, (byte) 15);
            atomicReference.set(e45Var);
            view.postDelayed(e45Var, 2000L);
            view.setTag(2131296715, e45Var);
            if (attachedEditText != null) {
                attachedEditText.addTextChangedListener(qyVar);
            }
        }
    }

    public static void F1(Bundle bundle, SharedPreferences.Editor editor, String str) {
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj instanceof String) {
                if (str != null) {
                    editor.putString(tb4.y(str, "_|_", str2), (String) obj);
                } else {
                    editor.putString(str2, (String) obj);
                }
            } else if (obj instanceof Integer) {
                if (str != null) {
                    editor.putInt(tb4.y(str, "_|_", str2), ((Integer) obj).intValue());
                } else {
                    editor.putInt(str2, ((Integer) obj).intValue());
                }
            } else if (obj instanceof Boolean) {
                if (str != null) {
                    editor.putBoolean(tb4.y(str, "_|_", str2), ((Boolean) obj).booleanValue());
                } else {
                    editor.putBoolean(str2, ((Boolean) obj).booleanValue());
                }
            } else if (obj instanceof Bundle) {
                F1((Bundle) obj, editor, str2);
            }
        }
    }

    public static void l1(ImageView imageView, int i, int i2, PorterDuff.Mode mode) {
        if (imageView != null) {
            if (i != i2 || imageView.getColorFilter() == null) {
                imageView.setColorFilter(new PorterDuffColorFilter(i, mode));
            }
        }
    }

    public static void m1(ImageView imageView, int i, int i2) {
        if (imageView != null) {
            Drawable background = imageView.getBackground();
            if (background == null) {
                imageView.setBackground(bkb.f0(i, 1, -1));
            } else if (i != i2) {
                bkb.F1(background, i, true);
            }
        }
    }

    public static String o1(Exception exc) {
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

    public static Bundle w1(int i, boolean z) {
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
            fa4.g(e, true);
            return null;
        }
    }

    public static void z1(d dVar, String str, xl3 xl3Var, boolean z) {
        List list;
        if (dVar != null && dVar.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dVar.getParentActivity());
            hd hdVar = alertDialog$Builder.a;
            if (z) {
                hdVar.S = k96.M0(2131745878, null);
                hdVar.U = k96.M0(2131753722, "BannedPhoneNumber");
            } else if (xl3Var != null && (list = (List) xl3Var.d) != null && !list.isEmpty() && ((mx2) xl3Var.b) != null) {
                int i = Integer.MAX_VALUE;
                for (String str2 : (List) xl3Var.d) {
                    int length = str2.replace(" ", "").length();
                    if (length < i) {
                        i = length;
                    }
                }
                if (p38.h(str, false).length() - ((mx2) xl3Var.b).c.length() < i) {
                    hdVar.S = k96.M0(2131742594, null);
                    hdVar.U = gl.T2(k96.a0("ShortNumberInfo", null, 2131745164, ((mx2) xl3Var.b).a, (String) xl3Var.c));
                } else {
                    hdVar.S = k96.M0(2131745878, null);
                    hdVar.U = k96.M0(2131748987, null);
                }
            } else {
                hdVar.S = k96.M0(2131745878, null);
                hdVar.U = k96.M0(2131748987, null);
            }
            alertDialog$Builder.h(k96.M0(2131753058, "BotHelp"), new ch(str, dVar, z));
            alertDialog$Builder.j(k96.M0(2131747638, "OK"), null);
            dVar.showDialog(hdVar);
        }
    }

    public final void A1(int i, boolean z) {
        if (this.G == 1 && i == 0) {
            if (this.S == null && getParentActivity() != null && !getParentActivity().isFinishing()) {
                hd hdVar = new hd(3, null, getParentActivity());
                this.S = hdVar;
                hdVar.j0 = false;
                hdVar.show();
                return;
            }
            return;
        }
        this.Q = i;
        K1(true, z, false);
    }

    public final void B1(TLRPC.TL_auth_authorization tL_auth_authorization, boolean z) {
        na7.q1(this.currentAccount).M();
        ConnectionsManager.getInstance(this.currentAccount).setUserId(tL_auth_authorization.user.id);
        y6c.h(this.currentAccount).b();
        na7.q1(this.currentAccount).M();
        y6c.h(this.currentAccount).V = this.E;
        y6c.h(this.currentAccount).v(tL_auth_authorization.user);
        y6c.h(this.currentAccount).u(true);
        ad7 Y = ad7.Y(this.currentAccount);
        Y.a.c(new cc7(Y, true, (byte) 1));
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_auth_authorization.user);
        ad7.Y(this.currentAccount).j1(arrayList, null, true, true);
        na7.q1(this.currentAccount).Z3(tL_auth_authorization.user, false, false);
        qu2 r = qu2.r(this.currentAccount);
        r.a = null;
        Utilities.e.c(new wt2(r, (byte) 0));
        Utilities.d.c(new c87(na7.q1(this.currentAccount), (byte) 11));
        ConnectionsManager.getInstance(this.currentAccount).updateDcSettings();
        na7.q1(this.currentAccount).T2(true);
        na7.q1(this.currentAccount).i3();
        na7.q1(this.currentAccount).I(false);
        byte[] bArr = tL_auth_authorization.future_auth_token;
        if (bArr != null) {
            boolean z2 = w01.a;
            fa4.b("saveLogInToken ".concat(new String(bArr, StandardCharsets.UTF_8)));
            ArrayList b = p40.b();
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
            fa4.b("onAuthSuccess future_auth_token is empty");
        }
        if (z) {
            na7 q1 = na7.q1(this.currentAccount);
            q1.U1.put(0, true);
            q1.V1.put(0, true);
        }
        hq6.d0(this.currentAccount).d1("tg_placeholders_android", false, true);
        boolean z3 = tL_auth_authorization.setup_password_required;
        int i3 = tL_auth_authorization.otherwise_relogin_days;
        if (getParentActivity() != null) {
            gl.l3(getParentActivity(), false);
        }
        n1();
        if (getParentActivity() instanceof LaunchActivity) {
            if (this.y) {
                this.y = false;
                this.p0 = true;
                ((LaunchActivity) getParentActivity()).O0(this.currentAccount, new p54((byte) 2, z));
                this.p0 = false;
                finishFragment();
                return;
            }
            if (z && z3) {
                p3c p3cVar = new p3c(6, null);
                p3cVar.H = i3;
                p3cVar.I = true;
                presentFragment(p3cVar, true);
            } else {
                Bundle l = ir2.l("afterSignup", z);
                ah6 ah6Var = new ah6();
                ah6Var.q0(l);
                presentFragment(ah6Var, true);
            }
            kk7.f(this.currentAccount).k(kk7.i0, new Object[0]);
            k96.D0().V0(this.currentAccount, true);
            qa9.Y(true);
        } else if (getParentActivity() instanceof ExternalActionActivity) {
            ExternalActionActivity externalActionActivity = (ExternalActionActivity) getParentActivity();
            externalActionActivity.d(externalActionActivity.h, externalActionActivity.n, externalActionActivity.w, true, externalActionActivity.r, externalActionActivity.s ? 1 : 0);
            externalActionActivity.c.Z();
            ActionBarLayout actionBarLayout = externalActionActivity.d;
            if (actionBarLayout != null) {
                actionBarLayout.Z();
            }
            cja cjaVar = externalActionActivity.e;
            if (cjaVar != null) {
                cjaVar.setVisibility(0);
            }
        }
    }

    public final void C1() {
        if (this.R[this.K ? 1 : 0]) {
            if (this.W.getTag() != null) {
                if (getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = k96.M0(2131744595, "StopLoadingTitle");
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.M0(2131744596, "StopLoading");
                alertDialog$Builder.j(k96.M0(2131742971, "WaitMore"), null);
                alertDialog$Builder.g(k96.M0(2131744604, "Stop"), new hc6(this, (byte) 0));
                showDialog(hdVar);
                return;
            }
            this.b[this.a].h(null);
        }
    }

    public final void E1(String str, TLRPC.auth_SentCode auth_sentcode) {
        if (this.fragmentView == null) {
            this.q0 = new sx5(this, str, auth_sentcode, (byte) 16);
            return;
        }
        this.e = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", "+" + str);
        bundle.putString("ephone", "+" + str);
        bundle.putString("phoneFormated", str);
        p1(bundle, auth_sentcode, true);
    }

    public final void G1(Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str) {
        if (!this.r0) {
            return;
        }
        x1(false, true);
        this.r0 = false;
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = bundle.getString("phoneFormated");
        tL_auth_resendCode.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_resendCode.flags |= 1;
        tL_auth_resendCode.reason = str;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_resendCode, new rv3(this, bundle, (byte) 19), 10);
    }

    public final void H1(boolean z, boolean z2) {
        if (this.b0 == z && z2) {
            return;
        }
        this.b0 = z;
        if (gl.A1()) {
            z = false;
        }
        if (z) {
            gl.t1(this.fragmentView);
            gl.X2(getParentActivity(), this.classGuid);
            if (z2) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                this.d = duration;
                duration.setInterpolator(s33.f);
                this.d.addUpdateListener(new fc6(this, (byte) 2));
                this.d.addListener(new pc6(this, (byte) 0));
                this.d.start();
                return;
            }
            this.c.setVisibility(0);
            return;
        }
        gl.z2(getParentActivity(), this.classGuid);
        if (z2) {
            ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(300L);
            this.d = duration2;
            duration2.setInterpolator(ls3.e);
            this.d.addUpdateListener(new fc6(this, (byte) 0));
            this.d.addListener(new pc6(this, (byte) 1));
            this.d.start();
            return;
        }
        this.c.setVisibility(8);
    }

    public final void I1(int i, boolean z, Bundle bundle, boolean z2) {
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
            J1(false, z);
            K1(false, z, false);
            this.K = false;
            K1(false, z, false);
            if (!z) {
                J1(true, false);
            }
        } else {
            this.K = false;
            J1(false, z);
            K1(false, z, false);
            if (i != 8) {
                this.K = true;
            }
        }
        jja[] jjaVarArr = this.b;
        if (z) {
            jja jjaVar = jjaVarArr[this.a];
            jja jjaVar2 = jjaVarArr[i];
            this.a = i;
            ImageView imageView = this.V;
            if (jjaVar2.b() || this.y) {
                i3 = 0;
            }
            imageView.setVisibility(i3);
            jjaVar2.m(bundle, false);
            setParentActivityTitle(jjaVar2.getHeaderName());
            jjaVar2.j();
            Point point = gl.q;
            int i4 = point.x;
            if (z2) {
                i4 = -i4;
            }
            jjaVar2.setX(i4);
            jjaVar2.setVisibility(0);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new qw(this, z3, jjaVar, (byte) 6));
            Property property = View.TRANSLATION_X;
            int i5 = point.x;
            if (!z2) {
                i5 = -i5;
            }
            animatorSet.playTogether(ObjectAnimator.ofFloat(jjaVar, property, i5), ObjectAnimator.ofFloat(jjaVar2, property, 0.0f));
            animatorSet.setDuration(300L);
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.start();
            H1(jjaVar2.a(), true);
            return;
        }
        ImageView imageView2 = this.V;
        if (!jjaVarArr[i].b() && !this.y) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        imageView2.setVisibility(i2);
        jjaVarArr[this.a].setVisibility(8);
        jjaVarArr[this.a].g();
        this.a = i;
        jjaVarArr[i].m(bundle, false);
        jjaVarArr[i].setVisibility(0);
        setParentActivityTitle(jjaVarArr[i].getHeaderName());
        jjaVarArr[i].j();
        H1(jjaVarArr[i].a(), false);
    }

    public final void J1(boolean z, boolean z2) {
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
                animatorSetArr[this.K ? 1 : 0].addListener(new x5(this, z4, z, (byte) 4));
                int i = 150;
                if (!z3) {
                    if (z) {
                        timeInterpolator = gl.F;
                        i = 200;
                    } else {
                        timeInterpolator = gl.G;
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

    public final void K1(boolean z, boolean z2, boolean z3) {
        boolean[] zArr = this.j0;
        if (z2 && zArr[this.K ? 1 : 0] == z && !z3) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            gl.d3(new gc6(this, z, z2, z3));
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
                    gl.r(runnableArr[z4 ? 1 : 0]);
                    zArr2[this.K ? 1 : 0] = false;
                    return;
                } else if (z) {
                    gc6 gc6Var = new gc6(this, z4 ? 1 : 0, z, z2);
                    runnableArr[z4 ? 1 : 0] = gc6Var;
                    gl.e3(gc6Var, 2000L);
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
            ofFloat.addListener(new id4((byte) 12, this, z));
            ofFloat.addUpdateListener(new fc6(this, (byte) 1));
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

    public final boolean L1(View view) {
        if (!r1()) {
            return gl.F3(view);
        }
        return true;
    }

    public final void M1(boolean z, boolean z2) {
        if (z == this.y0) {
            return;
        }
        ec6 ec6Var = this.z0;
        if (ec6Var != null) {
            gl.r(ec6Var);
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
            animate.alpha(f).withEndAction(new x6c((byte) 26, this, z)).start();
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

    public final void N1(String str, String str2, String str3) {
        if (this.W.getTag() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = k96.M0(2131745904, "ResetMyAccountWarningText");
        hd hdVar = alertDialog$Builder.a;
        hdVar.U = M0;
        hdVar.S = k96.M0(2131745906, "ResetMyAccountWarning");
        alertDialog$Builder.j(k96.M0(2131745905, "ResetMyAccountWarningReset"), new lt((Object) this, (Object) str, (Object) str2, (Object) str3, (byte) 14));
        alertDialog$Builder.g(k96.M0(2131752577, "Cancel"), null);
        showDialog(hdVar);
    }

    public final void O1() {
        boolean z;
        this.fragmentView.setBackgroundColor(bkb.w0(null, bkb.c6, false));
        ImageView imageView = this.V;
        int i = bkb.F6;
        int w0 = bkb.w0(null, i, false);
        l1(imageView, w0, this.t0, PorterDuff.Mode.SRC_ATOP);
        this.t0 = w0;
        ImageView imageView2 = this.V;
        int i2 = bkb.h6;
        int w02 = bkb.w0(null, i2, false);
        m1(imageView2, w02, this.u0);
        this.u0 = w02;
        int w03 = bkb.w0(null, i, false);
        if (w03 != this.v0 || this.Y.getColorFilter() == null) {
            this.Y.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
            this.v0 = w03;
        }
        ImageView imageView3 = this.X;
        int w04 = bkb.w0(null, i2, false);
        m1(imageView3, w04, this.w0);
        this.w0 = w04;
        RadialProgressView radialProgressView = this.W;
        int i3 = bkb.O9;
        radialProgressView.setProgressColor(bkb.w0(null, i3, false));
        this.O.updateColors();
        this.N.setColor(bkb.w0(null, bkb.N9, false));
        this.N.setBackgroundColor(bkb.w0(null, i3, false));
        for (jja jjaVar : this.b) {
            jjaVar.updateColors();
        }
        s43 s43Var = this.c;
        q43 q43Var = s43Var.a;
        int w05 = bkb.w0(null, bkb.F6, false);
        if (w05 != s43Var.s || q43Var.getColorFilter() == null) {
            s43Var.s = w05;
            q43Var.setColorFilter(w05, PorterDuff.Mode.SRC_ATOP);
        }
        int w06 = bkb.w0(null, bkb.h6, false);
        int o = bm2.o(w06, 30);
        if (w06 != s43Var.w) {
            z = true;
        } else {
            z = false;
        }
        s43Var.w = w06;
        int i4 = 0;
        while (true) {
            View[] viewArr = s43Var.c;
            if (i4 >= viewArr.length) {
                break;
            }
            View view = viewArr[i4];
            if (view != null) {
                if (view.getBackground() != null) {
                    if (z) {
                        bkb.F1(view.getBackground(), w06, false);
                        bkb.F1(view.getBackground(), o, true);
                    }
                } else {
                    s43.a(i4, view);
                }
                if (view instanceof r43) {
                    ((r43) view).updateColors();
                }
            }
            i4++;
        }
        af6 af6Var = this.c0;
        if (af6Var != null) {
            int i5 = af6.G;
            af6Var.b();
        }
    }

    public final void P1(boolean z, boolean z2) {
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
                    M1(true, z);
                } else if ((getMessagesController().l3 && !gba.w1.isEmpty()) || z5) {
                    this.Y.b(true, z4, z);
                    if (this.y0) {
                        return;
                    }
                    ec6 ec6Var = this.z0;
                    if (ec6Var != null) {
                        gl.r(ec6Var);
                    }
                    this.y0 = true;
                    ec6 ec6Var2 = new ec6(this, (byte) 1);
                    this.z0 = ec6Var2;
                    gl.e3(ec6Var2, 5000L);
                } else {
                    M1(false, z);
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
                    fa4.g(e, true);
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
                    fa4.g(e2, true);
                }
            }
            this.actionBar = null;
        }
        clearSheets();
        this.parentLayout = null;
    }

    @Override
    public final View createView(Context context) {
        int i;
        Bundle bundle;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        float f;
        float f2;
        float f3;
        View view = this.o0;
        if (view != null) {
            this.fragmentView = view;
            this.o0 = null;
            return view;
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 5));
        this.K = false;
        boolean[] zArr = this.R;
        zArr[0] = true;
        zArr[1] = false;
        n81 n81Var = new n81((byte) 5, context, this);
        this.T = n81Var;
        n81Var.setDelegate(new ov0(this, (byte) 1));
        this.fragmentView = this.T;
        xc xcVar = new xc(this, context, (byte) 3);
        xcVar.setFillViewport(true);
        this.T.addView(xcVar, nme.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Z = linearLayout;
        linearLayout.setOrientation(1);
        xcVar.addView(this.Z, nme.x(-1, -2, 51));
        Space space = new Space(context);
        this.n0 = space;
        if (gl.O1()) {
            i = 0;
        } else {
            i = gl.m;
        }
        space.setMinimumHeight(i);
        this.Z.addView(this.n0);
        oc6 oc6Var = new oc6((byte) 0, context, this);
        this.a0 = oc6Var;
        this.Z.addView(oc6Var, nme.l(1.0f, -1, 0));
        s43 s43Var = new s43(context);
        this.c = s43Var;
        s43Var.setViewToFindFocus(this.a0);
        this.Z.addView(this.c, nme.o(-1, 230));
        lf6 lf6Var = new lf6(this, context);
        jja[] jjaVarArr = this.b;
        jjaVarArr[0] = lf6Var;
        jjaVarArr[1] = new qe6(this, context, 1);
        jjaVarArr[2] = new qe6(this, context, 2);
        jjaVarArr[3] = new qe6(this, context, 3);
        jjaVarArr[4] = new qe6(this, context, 4);
        jjaVarArr[5] = new ae6(this, context);
        jjaVarArr[6] = new jd6(this, context);
        jjaVarArr[7] = new td6(this, context);
        jjaVarArr[8] = new be6(this, context);
        jjaVarArr[9] = new gd6(this, context, 0);
        jjaVarArr[10] = new gd6(this, context, 1);
        jjaVarArr[11] = new qe6(this, context, 11);
        jjaVarArr[12] = new de6(this, context);
        jjaVarArr[13] = new ad6(this, context, true);
        jjaVarArr[14] = new ad6(this, context, false);
        jjaVarArr[15] = new qe6(this, context, 15);
        jjaVarArr[16] = new qd6(this, context, 16);
        jjaVarArr[17] = new qd6(this, context, 17);
        int i6 = 18;
        jjaVarArr[18] = new ve6(this, context);
        int i7 = 0;
        while (i7 < jjaVarArr.length) {
            jja jjaVar = jjaVarArr[i7];
            if (i7 == 0) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            jjaVar.setVisibility(i5);
            if (i7 != i6) {
                z3 = true;
            } else {
                z3 = false;
            }
            oc6 oc6Var2 = this.a0;
            jja jjaVar2 = jjaVarArr[i7];
            if (gl.O1()) {
                f = 26.0f;
            } else {
                f = 18.0f;
            }
            if (z3) {
                f2 = 30.0f;
            } else {
                f2 = 0.0f;
            }
            if (gl.O1()) {
                f3 = 26.0f;
            } else {
                f3 = 18.0f;
            }
            oc6Var2.addView(jjaVar2, nme.d(-1, -1.0f, 17, f, f2, f3, 0.0f));
            i7++;
            i6 = 18;
        }
        if (this.G == 0) {
            bundle = w1(this.currentAccount, this.y);
        } else {
            bundle = null;
        }
        if (bundle != null && ((i4 = bundle.getInt("currentViewNum", 0)) < 0 || i4 >= jjaVarArr.length)) {
            bundle = null;
        }
        if (bundle != null) {
            this.a = bundle.getInt("currentViewNum", 0);
            if (bundle.getInt("syncContacts", 1) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.E = z2;
            int i8 = this.a;
            if (i8 >= 1 && i8 <= 4) {
                int i9 = bundle.getInt("open");
                if (i9 != 0 && Math.abs((System.currentTimeMillis() / 1000) - i9) >= 86400) {
                    this.a = 0;
                    n1();
                    bundle = null;
                }
            } else if (i8 == 6) {
                if (((jd6) jjaVarArr[6]).n == null) {
                    this.a = 0;
                    n1();
                    bundle = null;
                }
            } else if (i8 == 7 && ((td6) jjaVarArr[7]).h == null) {
                this.a = 0;
                n1();
                bundle = null;
            }
        }
        un4 un4Var = new un4(this.resourceProvider, context, false);
        this.O = un4Var;
        un4Var.e(zArr[0], false);
        this.P = new vk9(this.O);
        n81 n81Var2 = this.T;
        un4 un4Var2 = this.O;
        if (k96.a0) {
            i2 = 3;
        } else {
            i2 = 5;
        }
        n81Var2.addView(un4Var2, nme.d(56, 56.0f, i2 | 80, 20.0f, 0.0f, 20.0f, 14.0f));
        this.O.setOnClickListener(new View.OnClickListener(this) {
            public final mf6 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                mf6 mf6Var = this.b;
                switch (b) {
                    case 0:
                        mf6Var.C1();
                        return;
                    case 1:
                        if (mf6Var.onBackPressed(true)) {
                            mf6Var.finishFragment();
                            return;
                        }
                        return;
                    case 2:
                        sg3 sg3Var = mf6Var.f0;
                        if (sg3Var != null) {
                            sg3Var.run();
                        }
                        mf6Var.finishFragment();
                        return;
                    default:
                        mf6Var.presentFragment(new ProxyListActivity());
                        return;
                }
            }
        });
        ((yla) this.P.c).b(new h10(this, (byte) 7));
        ImageView imageView = new ImageView(context);
        this.V = imageView;
        imageView.setImageResource(2131231243);
        this.V.setOnClickListener(new View.OnClickListener(this) {
            public final mf6 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                mf6 mf6Var = this.b;
                switch (b) {
                    case 0:
                        mf6Var.C1();
                        return;
                    case 1:
                        if (mf6Var.onBackPressed(true)) {
                            mf6Var.finishFragment();
                            return;
                        }
                        return;
                    case 2:
                        sg3 sg3Var = mf6Var.f0;
                        if (sg3Var != null) {
                            sg3Var.run();
                        }
                        mf6Var.finishFragment();
                        return;
                    default:
                        mf6Var.presentFragment(new ProxyListActivity());
                        return;
                }
            }
        });
        this.V.setContentDescription(k96.M0(2131754878, null));
        int L = gl.L(4.0f);
        this.V.setPadding(L, L, L, L);
        this.T.addView(this.V, nme.d(32, 32.0f, 51, 16.0f, 16.0f, 0.0f, 0.0f));
        if (this.f0 != null && !this.h0 && this.i0) {
            TextView textView = new TextView(context);
            this.g0 = textView;
            textView.setGravity(19);
            this.g0.setTextSize(1, 15.0f);
            this.g0.setLineSpacing(gl.L(2.0f), 1.0f);
            this.g0.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
            this.g0.setText(k96.M0(2131742554, null));
            zkb.X(this.g0, bkb.p6, null);
            this.T.addView(this.g0, nme.d(-2, 30.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
            this.g0.setOnClickListener(new View.OnClickListener(this) {
                public final mf6 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view2) {
                    byte b = r2;
                    mf6 mf6Var = this.b;
                    switch (b) {
                        case 0:
                            mf6Var.C1();
                            return;
                        case 1:
                            if (mf6Var.onBackPressed(true)) {
                                mf6Var.finishFragment();
                                return;
                            }
                            return;
                        case 2:
                            sg3 sg3Var = mf6Var.f0;
                            if (sg3Var != null) {
                                sg3Var.run();
                            }
                            mf6Var.finishFragment();
                            return;
                        default:
                            mf6Var.presentFragment(new ProxyListActivity());
                            return;
                    }
                }
            });
        }
        ImageView imageView2 = new ImageView(context);
        this.X = imageView2;
        tt8 tt8Var = new tt8(context);
        this.Y = tt8Var;
        imageView2.setImageDrawable(tt8Var);
        this.X.setOnClickListener(new View.OnClickListener(this) {
            public final mf6 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                mf6 mf6Var = this.b;
                switch (b) {
                    case 0:
                        mf6Var.C1();
                        return;
                    case 1:
                        if (mf6Var.onBackPressed(true)) {
                            mf6Var.finishFragment();
                            return;
                        }
                        return;
                    case 2:
                        sg3 sg3Var = mf6Var.f0;
                        if (sg3Var != null) {
                            sg3Var.run();
                        }
                        mf6Var.finishFragment();
                        return;
                    default:
                        mf6Var.presentFragment(new ProxyListActivity());
                        return;
                }
            }
        });
        this.X.setAlpha(0.0f);
        this.X.setVisibility(8);
        this.T.addView(this.X, nme.d(32, 32.0f, 53, 16.0f, 16.0f, 16.0f, 16.0f));
        P1(false, true);
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.W = radialProgressView;
        radialProgressView.setSize(gl.L(20.0f));
        this.W.setAlpha(0.0f);
        this.W.setScaleX(0.1f);
        this.W.setScaleY(0.1f);
        this.T.addView(this.W, nme.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
        wyb wybVar = new wyb(context);
        this.N = wybVar;
        wybVar.setTransformType(0);
        this.N.setProgress(1.0f);
        this.N.setDrawBackground(false);
        this.O.setContentDescription(k96.M0(2131751342, null));
        this.O.addView(this.N, nme.e(56, 56, 17));
        this.O.a(this.N);
        if (bundle != null) {
            this.f = true;
        }
        for (int i10 = 0; i10 < jjaVarArr.length; i10++) {
            jja jjaVar3 = jjaVarArr[i10];
            if (bundle != null) {
                if (i10 >= 1 && i10 <= 4) {
                    if (i10 == this.a) {
                        jjaVar3.k(bundle);
                    }
                } else {
                    jjaVar3.k(bundle);
                }
            }
            if (this.a == i10) {
                ImageView imageView3 = this.V;
                if (!jjaVar3.b() && !this.y && this.G != 2) {
                    i3 = 8;
                } else {
                    i3 = 0;
                }
                imageView3.setVisibility(i3);
                jjaVar3.setVisibility(0);
                jjaVar3.j();
                H1(jjaVar3.a(), false);
                this.K = false;
                if (i10 != 0 && i10 != 5 && i10 != 6 && i10 != 9 && i10 != 10 && i10 != 12) {
                    z = false;
                } else {
                    z = true;
                }
                J1(z, false);
                if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                    this.K = true;
                }
            } else if (jjaVar3.getVisibility() != 8) {
                jjaVar3.setVisibility(8);
                jjaVar3.g();
            }
        }
        this.f = false;
        O1();
        if (this.G == 1) {
            p1(this.I, this.J, false);
        }
        sx5 sx5Var = this.q0;
        if (sx5Var != null) {
            this.q0 = null;
            sx5Var.run();
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.S1) {
            P1(true, false);
        } else if (i == kk7.r1 && this.i0) {
            na7 messagesController = getMessagesController();
            if (!messagesController.u3.contains("SETUP_LOGIN_EMAIL") && !messagesController.u3.contains("SETUP_LOGIN_EMAIL_NOSKIP")) {
                finishFragment();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return hue.a(new t00(this, (byte) 9), bkb.F6, bkb.C6, bkb.G6, bkb.h6, bkb.O9, bkb.N9, bkb.j6, bkb.k6, bkb.H6, bkb.p7, bkb.x6, bkb.h7, bkb.p6, bkb.Mi, bkb.P9, bkb.o7, bkb.I6, bkb.X6, bkb.V6, bkb.W6, bkb.g5, bkb.p5, bkb.i5);
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
        return !this.i0;
    }

    public final void n1() {
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
        ae6 ae6Var = (ae6) this.b[5];
        if (ae6Var != null) {
            ae6Var.N.h(i, i2, intent);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (!this.i0 || this.a != 12) {
            int i = this.a;
            jja[] jjaVarArr = this.b;
            if (i == 0 || (this.G == 3 && i == 12)) {
                if (z) {
                    for (jja jjaVar : jjaVarArr) {
                        if (jjaVar != null) {
                            jjaVar.f();
                        }
                    }
                    n1();
                }
                return true;
            } else if (i == 6) {
                if (z) {
                    jjaVarArr[i].d(true);
                    I1(0, true, null, true);
                    return false;
                }
            } else if (i != 7 && i != 8) {
                if ((i < 1 || i > 4) && i != 11 && i != 15) {
                    if (i == 5) {
                        if (z) {
                            ((ae6) jjaVarArr[i]).x.callOnClick();
                            return false;
                        }
                    } else if (i == 9) {
                        if (z) {
                            jjaVarArr[i].d(true);
                            I1(7, true, null, true);
                            return false;
                        }
                    } else if (i == 10) {
                        if (z) {
                            jjaVarArr[i].d(true);
                            I1(9, true, null, true);
                            return false;
                        }
                    } else if (i == 13) {
                        if (z) {
                            jjaVarArr[i].d(true);
                            I1(12, true, null, true);
                            return false;
                        }
                    } else if (z && jjaVarArr[i].d(true)) {
                        I1(0, true, null, true);
                        return false;
                    }
                } else if (z && jjaVarArr[i].d(false)) {
                    I1(0, true, null, true);
                    return false;
                }
            } else if (z) {
                jjaVarArr[i].d(true);
                I1(6, true, null, true);
            }
        }
        return false;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        H1(this.b[this.a].a(), false);
        af6 af6Var = this.c0;
        if (af6Var != null) {
            int i = af6.G;
            af6Var.a();
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
                    gl.e3(new ec6(this, (byte) 0), 200L);
                    getParentActivity().requestPermissions((String[]) arrayList2.toArray(new String[0]), 7);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, kk7.S1);
        getNotificationCenter().b(this, kk7.r1);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        Runnable[] runnableArr;
        super.onFragmentDestroy();
        int i = 0;
        while (true) {
            jja[] jjaVarArr = this.b;
            if (i >= jjaVarArr.length) {
                break;
            }
            jja jjaVar = jjaVarArr[i];
            if (jjaVar != null) {
                jjaVar.f();
            }
            i++;
        }
        hd hdVar = this.S;
        if (hdVar != null) {
            hdVar.dismiss();
            this.S = null;
        }
        for (Runnable runnable : this.k0) {
            if (runnable != null) {
                gl.r(runnable);
            }
        }
        getNotificationCenter().n(this, kk7.S1);
        getNotificationCenter().n(this, kk7.r1);
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.y) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(true, false);
        }
        gl.z2(getParentActivity(), this.classGuid);
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
            jja[] jjaVarArr = this.b;
            if (i == 6) {
                this.w = false;
                int i2 = this.a;
                if (i2 == 0) {
                    jja jjaVar = jjaVarArr[i2];
                    ((lf6) jjaVar).O = true;
                    jjaVar.h(null);
                }
            } else if (i == 7) {
                this.x = false;
                int i3 = this.a;
                if (i3 == 0) {
                    ((lf6) jjaVarArr[i3]).p();
                }
            } else if (i == 20) {
                if (z) {
                    ((ae6) jjaVarArr[5]).N.l();
                }
            } else if (i == 151 && z) {
                ae6 ae6Var = (ae6) jjaVarArr[5];
                ae6Var.post(new nc6(ae6Var, (byte) 0));
            }
        }
    }

    @Override
    public final void onResume() {
        jja jjaVar;
        int i;
        jja[] jjaVarArr = this.b;
        super.onResume();
        if (this.y) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(false, false);
        }
        gl.W2(getParentActivity(), this.classGuid);
        View view = this.fragmentView;
        if (view != null) {
            view.requestLayout();
        }
        try {
            int i2 = this.a;
            if (i2 >= 1 && i2 <= 4) {
                jja jjaVar2 = jjaVarArr[i2];
                if ((jjaVar2 instanceof qe6) && (i = ((qe6) jjaVar2).W) != 0 && Math.abs((System.currentTimeMillis() / 1000) - i) >= 86400) {
                    jjaVarArr[this.a].d(true);
                    I1(0, false, null, true);
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        int i3 = this.a;
        if (i3 == 0 && !this.d0 && (jjaVar = jjaVarArr[i3]) != null) {
            jjaVar.j();
        }
        if (r1()) {
            gl.t1(this.fragmentView);
            gl.X2(getParentActivity(), this.classGuid);
        }
        int i4 = this.a;
        if (i4 >= 0 && i4 < jjaVarArr.length) {
            jjaVarArr[i4].i();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            if (this.fragmentView != null && this.V != null && this.Y != null && this.X != null && this.W != null && this.O != null && this.N != null && this.c != null) {
                for (jja jjaVar : this.b) {
                    if (jjaVar == null) {
                        return;
                    }
                }
                O1();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void p1(final Bundle bundle, final TLRPC.auth_SentCode auth_sentcode, boolean z) {
        if (auth_sentcode instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
            TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) auth_sentcode;
            bundle.putString("product", tL_auth_sentCodePaymentRequired.store_product);
            bundle.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
            bundle.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
            bundle.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
            bundle.putString("currency", tL_auth_sentCodePaymentRequired.currency);
            bundle.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
            bundle.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
            I1(18, true, bundle, true);
            return;
        }
        TLRPC.auth_SentCodeType auth_sentcodetype = auth_sentcode.type;
        if ((auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms) && !auth_sentcodetype.verifiedFirebase && !this.r0) {
            if (b.b.hasServices()) {
                TLRPC.TL_auth_sentCodeTypeFirebaseSms tL_auth_sentCodeTypeFirebaseSms = (TLRPC.TL_auth_sentCodeTypeFirebaseSms) auth_sentcode.type;
                A1(0, true);
                this.r0 = true;
                String string = bundle.getString("phoneFormated");
                if (tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce != null) {
                    IntegrityManager create = IntegrityManagerFactory.create(getParentActivity());
                    String str = new String(Base64.encode(tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce, 8));
                    fa4.b("getting classic integrity with nonce = ".concat(str));
                    create.requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str).setCloudProjectNumber(tL_auth_sentCodeTypeFirebaseSms.play_integrity_project_id).build()).addOnSuccessListener(new ic6(this, bundle, auth_sentcode, string, z)).addOnFailureListener(new OnFailureListener(this) {
                        public final mf6 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onFailure(Exception exc) {
                            byte b = r4;
                            TLRPC.auth_SentCode auth_sentcode2 = auth_sentcode;
                            Bundle bundle2 = bundle;
                            mf6 mf6Var = this.b;
                            switch (b) {
                                case 0:
                                    String str2 = "PLAYINTEGRITY_EXCEPTION_" + mf6.o1(exc);
                                    fa4.e("{" + str2 + "} Resend firebase sms because integrity threw error", exc);
                                    mf6Var.G1(bundle2, auth_sentcode2, str2);
                                    return;
                                default:
                                    fa4.g(exc, true);
                                    String str3 = "SAFETYNET_EXCEPTION_" + mf6.o1(exc);
                                    fa4.b("{" + str3 + "} Resend firebase sms because of safetynet exception");
                                    mf6Var.G1(bundle2, auth_sentcode2, str3);
                                    return;
                            }
                        }
                    });
                    return;
                }
                by4 by4Var = new by4(a.b, ap9.a, (vn) null, new eef((byte) 13));
                byte[] bArr = auth_sentcode.type.nonce;
                String str2 = w01.f;
                x1d x1dVar = by4Var.i;
                q0e q0eVar = new q0e(x1dVar, bArr, str2);
                x1dVar.b.d(0, q0eVar);
                wbd.a(q0eVar, new ln8(new Object(), (byte) 27)).addOnSuccessListener(new ic6(this, string, auth_sentcode, bundle, z)).addOnFailureListener(new OnFailureListener(this) {
                    public final mf6 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onFailure(Exception exc) {
                        byte b = r4;
                        TLRPC.auth_SentCode auth_sentcode2 = auth_sentcode;
                        Bundle bundle2 = bundle;
                        mf6 mf6Var = this.b;
                        switch (b) {
                            case 0:
                                String str22 = "PLAYINTEGRITY_EXCEPTION_" + mf6.o1(exc);
                                fa4.e("{" + str22 + "} Resend firebase sms because integrity threw error", exc);
                                mf6Var.G1(bundle2, auth_sentcode2, str22);
                                return;
                            default:
                                fa4.g(exc, true);
                                String str3 = "SAFETYNET_EXCEPTION_" + mf6.o1(exc);
                                fa4.b("{" + str3 + "} Resend firebase sms because of safetynet exception");
                                mf6Var.G1(bundle2, auth_sentcode2, str3);
                                return;
                        }
                    }
                });
                return;
            }
            fa4.b("{GOOGLE_PLAY_SERVICES_NOT_AVAILABLE} Resend firebase sms because firebase is not available");
            G1(bundle, auth_sentcode, "GOOGLE_PLAY_SERVICES_NOT_AVAILABLE");
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
            I1(1, z, bundle, false);
            return;
        }
        int i = auth_sentcode.timeout;
        if (i == 0) {
            boolean z2 = w01.a;
            i = 60;
            auth_sentcode.timeout = 60;
        }
        bundle.putInt("timeout", i * 1000);
        TLRPC.auth_SentCodeType auth_sentcodetype2 = auth_sentcode.type;
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeCall) {
            bundle.putInt("type", 4);
            bundle.putInt("length", auth_sentcode.type.length);
            I1(4, z, bundle, false);
        } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt("type", 3);
            bundle.putString("pattern", auth_sentcode.type.pattern);
            I1(3, z, bundle, false);
        } else if (!(auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSms) && !(auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
            if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFragmentSms) {
                bundle.putInt("type", 15);
                bundle.putString("url", auth_sentcode.type.url);
                bundle.putInt("length", auth_sentcode.type.length);
                I1(15, z, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeMissedCall) {
                bundle.putInt("type", 11);
                bundle.putInt("length", auth_sentcode.type.length);
                bundle.putString("prefix", auth_sentcode.type.prefix);
                I1(11, z, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSetUpEmailRequired) {
                bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
                I1(12, z, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
                bundle.putString("emailPattern", auth_sentcode.type.email_pattern);
                bundle.putInt("length", auth_sentcode.type.length);
                bundle.putInt("nextPhoneLoginDate", auth_sentcode.type.next_phone_login_date);
                bundle.putInt("resetAvailablePeriod", auth_sentcode.type.reset_available_period);
                bundle.putInt("resetPendingDate", auth_sentcode.type.reset_pending_date);
                I1(14, z, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                String str3 = auth_sentcodetype2.beginning;
                if (str3 != null) {
                    bundle.putString("beginning", str3);
                }
                I1(16, z, bundle, false);
            } else if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                String str4 = auth_sentcodetype2.beginning;
                if (str4 != null) {
                    bundle.putString("beginning", str4);
                }
                I1(17, z, bundle, false);
            }
        } else {
            bundle.putInt("type", 2);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putBoolean("firebase", auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms);
            I1(2, z, bundle, false);
        }
    }

    public final HashSet q1() {
        List<SubscriptionInfo> list;
        HashSet hashSet = new HashSet();
        try {
            String line1Number = ((TelephonyManager) a.b.getSystemService("phone")).getLine1Number();
            if (!TextUtils.isEmpty(line1Number)) {
                hashSet.add(line1Number);
            }
        } catch (Exception e) {
            fa4.g(e, true);
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
            fa4.g(e2, true);
        }
        return hashSet;
    }

    public final boolean r1() {
        if (this.b[this.a].a() && !gl.A1()) {
            return true;
        }
        return false;
    }

    public final void s1(Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z, IntegrityTokenResponse integrityTokenResponse) {
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            fa4.b("Resend firebase sms because integrity token = null");
            G1(bundle, auth_sentcode, "PLAYINTEGRITY_TOKEN_NULL");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.play_integrity_token = str2;
        tL_auth_requestFirebaseSms.flags |= 4;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new kc6((byte) 1, this, bundle, auth_sentcode, z), 10);
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("currentViewNum", this.a);
            bundle2.putInt("syncContacts", this.E ? 1 : 0);
            for (int i = 0; i <= this.a; i++) {
                jja jjaVar = this.b[i];
                if (jjaVar != null) {
                    jjaVar.l(bundle2);
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
            F1(bundle2, edit, null);
            edit.commit();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void t1(String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z, bp9 bp9Var) {
        String str2;
        s4d s4dVar = ((i7f) ((ua9) bp9Var.a)).b;
        if (s4dVar == null) {
            str2 = null;
        } else {
            str2 = s4dVar.a;
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
                                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new kc6((byte) 0, this, bundle, auth_sentcode, z), 10);
                            } else if (!optBoolean2) {
                                fa4.b("{SAFETYNET_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false");
                                G1(bundle, auth_sentcode, "SAFETYNET_CTSPROFILEMATCH_FALSE");
                            }
                        } else if (!optBoolean2) {
                            fa4.b("{SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false and basicIntegrity = false");
                            G1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE");
                        } else {
                            fa4.b("{SAFETYNET_BASICINTEGRITY_FALSE} Resend firebase sms because basicIntegrity = false");
                            G1(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_FALSE");
                        }
                    } catch (JSONException e) {
                        e = e;
                        fa4.g(e, true);
                        fa4.b("{SAFETYNET_JSON_EXCEPTION} Resend firebase sms because of exception");
                        G1(bundle, auth_sentcode, "SAFETYNET_JSON_EXCEPTION");
                    }
                } catch (JSONException e2) {
                    e = e2;
                }
            } else {
                fa4.b("{SAFETYNET_CANT_SPLIT} Resend firebase sms because can't split JWS token");
                G1(bundle, auth_sentcode, "SAFETYNET_CANT_SPLIT");
            }
        } else {
            fa4.b("{SAFETYNET_NULL_JWS} Resend firebase sms because JWS = null");
            G1(bundle, auth_sentcode, "SAFETYNET_NULL_JWS");
        }
    }

    public final void u1(TLRPC.TL_error tL_error, String str, String str2, String str3) {
        x1(false, true);
        if (tL_error == null) {
            if (str != null && str2 != null && str3 != null) {
                Bundle bundle = new Bundle();
                bundle.putString("phoneFormated", str);
                bundle.putString("phoneHash", str2);
                bundle.putString("code", str3);
                I1(5, true, bundle, false);
                return;
            }
            I1(0, true, null, true);
        } else if (tL_error.text.equals("2FA_RECENT_CONFIRM")) {
            y1(k96.M0(2131745878, null), k96.M0(2131745922, "ResetAccountCancelledAlert"));
        } else if (tL_error.text.startsWith("2FA_CONFIRM_WAIT_")) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("phoneFormated", str);
            bundle2.putString("phoneHash", str2);
            bundle2.putString("code", str3);
            bundle2.putInt("startTime", ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
            bundle2.putInt("waitTime", Utilities.z(tL_error.text.replace("2FA_CONFIRM_WAIT_", "")).intValue());
            I1(8, true, bundle2, false);
        } else {
            y1(k96.M0(2131745878, null), tL_error.text);
        }
    }

    public final void v1(String str, String str2, String str3) {
        A1(0, true);
        TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
        deleteaccount.reason = "Forgot password";
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(deleteaccount, new rt0(this, str, str2, str3), 10);
    }

    public final void x1(boolean z, boolean z2) {
        hd hdVar;
        if (this.Q != 0) {
            if (z) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.Q, true);
            }
            this.Q = 0;
        }
        if (this.G == 1 && (hdVar = this.S) != null) {
            hdVar.dismiss();
            this.S = null;
        }
        K1(false, z2, false);
    }

    public final void y1(String str, String str2) {
        if (str2 != null && getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = str;
            hdVar.U = str2;
            alertDialog$Builder.j(k96.M0(2131747638, "OK"), null);
            showDialog(hdVar);
        }
    }

    public mf6() {
        super(null);
        this.b = new jja[19];
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

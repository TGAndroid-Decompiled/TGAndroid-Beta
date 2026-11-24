package defpackage;

import android.content.ClipData;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.webrtc.GlGenericDrawer;
public final class wx4 implements ee, Continuation, GlGenericDrawer.TextureCallback, au9, lh2, y73, dq5, a7c, id1, OnSuccessListener, OnFailureListener, h59, qq7, g59 {
    public final byte a;
    public final Object b;

    public wx4(s05 s05Var, a32 a32Var) {
        this.a = (byte) 6;
        this.b = s05Var;
    }

    @Override
    public final wzc C0(View view, wzc wzcVar) {
        z16 z16Var = (z16) this.b;
        iq5 H0 = gm.H0(wzcVar, false);
        if (!z16Var.a.equals(H0)) {
            z16Var.a = H0;
            z16Var.requestLayout();
        }
        int childCount = z16Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            kfc.b(z16Var.getChildAt(i), wzcVar);
        }
        return wzcVar;
    }

    @Override
    public final boolean F1(int i) {
        byte b = this.a;
        return true;
    }

    @Override
    public final vh6 G0() {
        byte b = this.a;
        return null;
    }

    @Override
    public final boolean a(lj4 lj4Var, int i, Bundle bundle) {
        nw2 nw2Var;
        hq hqVar = (hq) this.b;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((fq5) lj4Var.a).g();
                Parcelable parcelable = (Parcelable) ((fq5) lj4Var.a).k();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        fq5 fq5Var = (fq5) lj4Var.a;
        ClipData clipData = new ClipData(fq5Var.getDescription(), new ClipData.Item(fq5Var.e()));
        if (i2 >= 31) {
            nw2Var = new mw2(clipData, 2);
        } else {
            ow2 ow2Var = new ow2();
            ow2Var.b = clipData;
            ow2Var.c = (byte) 2;
            nw2Var = ow2Var;
        }
        nw2Var.c(fq5Var.h());
        nw2Var.setExtras(bundle);
        if (kfc.i(hqVar, nw2Var.build()) != null) {
            return false;
        }
        return true;
    }

    @Override
    public final void a2(ArrayList arrayList) {
        byte b = this.a;
    }

    @Override
    public final a83 createDataSource() {
        return ((y73) ((k6d) this.b).b).createDataSource();
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        int i2;
        int Z;
        boolean[] zArr;
        m86 m86Var = (m86) this.b;
        ArrayList arrayList = m86Var.s;
        if (view != null && i >= 0 && i < arrayList.size()) {
            g86 g86Var = (g86) arrayList.get(i);
            int i3 = g86Var.a;
            int i4 = g86Var.e;
            if (i3 != 3 && i3 != 4) {
                if (i3 == 5 && g86Var.f) {
                    SharedPreferences d1 = oc7.d1();
                    boolean z = d1.getBoolean("view_animations", true);
                    SharedPreferences.Editor edit = d1.edit();
                    boolean z2 = !z;
                    edit.putBoolean("view_animations", z2);
                    gda.y1 = Boolean.valueOf(z2);
                    edit.commit();
                    ((xib) view).setChecked(z2);
                }
            } else {
                boolean z3 = false;
                if (e86.f()) {
                    m86Var.e = c41.b0(m86Var).M(new ci0(0.1f, cmb.w0(null, cmb.X5, false)), jb6.M0(2131748626, null)).j();
                    return;
                } else if (g86Var.a == 3 && Integer.bitCount(i4) > 1 && (!jb6.a0 ? f < view.getMeasuredWidth() - gm.L(75.0f) : f > gm.L(75.0f)) && (Z = m86Var.Z(i4)) != -1) {
                    m86Var.n[Z] = !zArr[Z];
                    m86Var.d0();
                    m86Var.c0();
                    return;
                } else {
                    if ((e86.d(true) & i4) > 0) {
                        z3 = true;
                    }
                    int d = e86.d(true);
                    if (!z3) {
                        i2 = d | i4;
                    } else {
                        i2 = d & (~i4);
                    }
                    e86.i = i2;
                    e86.k();
                    m86Var.d0();
                }
            }
            sy4.f();
        }
    }

    @Override
    public final vh6 e1() {
        byte b = this.a;
        return null;
    }

    @Override
    public final boolean g(int i, View view) {
        return ((LanguageSelectActivity) this.b).k0(i, view);
    }

    @Override
    public final long get() {
        return ((sa8) ((fk3) this.b).a).getCaptionsVideoPosition();
    }

    @Override
    public final void h() {
        float f;
        sa8 sa8Var = (sa8) this.b;
        TextView textView = sa8Var.o1;
        boolean a = sa8Var.v0.a();
        ImageView imageView = sa8Var.m1;
        imageView.animate().cancel();
        ViewPropertyAnimator animate = imageView.animate();
        float f2 = 0.6f;
        if (a) {
            f = 1.0f;
        } else {
            f = 0.6f;
        }
        animate.alpha(f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a);
        textView.animate().cancel();
        ViewPropertyAnimator animate2 = textView.animate();
        if (a) {
            f2 = 1.0f;
        }
        animate2.alpha(f2).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a);
    }

    @Override
    public final void i() {
        cg5 cg5Var = (cg5) this.b;
        float progress = 1.0f - (cg5Var.w.getProgress() * 0.143f);
        bf0 bf0Var = cg5Var.a;
        bf0Var.setScaleX(progress);
        bf0Var.setScaleY(progress);
        cg5Var.invalidate();
    }

    @Override
    public final void o(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 9:
                mc5 mc5Var = (mc5) obj;
                oc5 oc5Var = mc5Var.J;
                oc5Var.u0(mc5Var.I);
                if (mc5Var.h == null && !mc5Var.f.e() && mc5Var.b() == 0) {
                    oc5Var.s.e(false, true);
                }
                mc5Var.f();
                return;
            default:
                et5 et5Var = (et5) obj;
                it5 it5Var = et5Var.n;
                it5Var.J0(et5Var.f - 1);
                if (et5Var.h == null && !et5Var.e.e() && et5Var.b() <= 2) {
                    it5Var.t1.e(false, true);
                }
                et5Var.f();
                return;
        }
    }

    @Override
    public final void onFailure(Exception exc) {
        ((yy5) this.b).o(exc);
    }

    @Override
    public final void onSuccess(Object obj) {
        ((zy5) this.b).a((String) obj);
    }

    @Override
    public final void r(he heVar, int i) {
        int i2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((yx4) obj).E0();
                return;
            case 10:
                ((zc5) obj).Z(true);
                return;
            case 15:
                it5 it5Var = (it5) obj;
                vh6 vh6Var = it5Var.Z1;
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < vh6Var.m(); i3++) {
                    arrayList.add(oc7.r1(it5Var.a).W1(Long.valueOf(vh6Var.j(i3))));
                }
                ic5 ic5Var = it5Var.f2;
                if (ic5Var != null) {
                    ic5Var.f(0, arrayList);
                }
                it5Var.dismiss();
                return;
            case 18:
                ((n88) obj).run();
                return;
            case 20:
                ((ky5) obj).a.Z1.p();
                return;
            case 24:
                String str = LaunchActivity.C1;
                gm.g((StringBuilder) obj);
                return;
            case 27:
                ze6 ze6Var = (ze6) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", ze6Var.J);
                bundle.putString("ephone", ze6Var.K);
                bundle.putString("phoneFormated", ze6Var.M);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = ze6Var.M;
                tL_auth_resetLoginEmail.phone_code_hash = ze6Var.N;
                ze6Var.a0.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new re6(ze6Var, bundle, tL_auth_resetLoginEmail, (byte) 1), 10);
                return;
            case 28:
                if6 if6Var = (if6) obj;
                if6Var.E.O1(if6Var.s, if6Var.w, if6Var.x);
                return;
            default:
                ag6 ag6Var = (ag6) obj;
                mh6 mh6Var = ag6Var.H;
                mh6Var.B1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i2 = ((d) mh6Var).currentAccount;
                ConnectionsManager.getInstance(i2).sendRequest(deleteaccount, new r15(ag6Var, (byte) 7), 10);
                return;
        }
    }

    @Override
    public final void run(Bitmap bitmap, int i) {
        ha5 ha5Var = (ha5) this.b;
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
            gm.c3(new ve4(ha5Var, bitmap, (byte) 27));
        }
    }

    @Override
    public final Object then(Task task) {
        Exception exception;
        sm2 sm2Var = (sm2) this.b;
        sm2Var.getClass();
        if (!task.isSuccessful() && (exception = task.getException()) != null && !TextUtils.isEmpty(exception.getMessage()) && exception.getMessage().contains("FID_ALREADY_USED:")) {
            Log.w("FirebaseMessaging", "FID_ALREADY_USED Detected. Retrying with FID cache clearing!");
            ((si4) ((ti4) sm2Var.d)).c.l().delete();
            return sm2Var.L();
        }
        return task;
    }

    @Override
    public final boolean u(View view) {
        return false;
    }

    public wx4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void b(ArrayList arrayList) {
    }

    private final void c(ArrayList arrayList) {
    }

    @Override
    public final void p(View view, float f, float f2) {
    }
}

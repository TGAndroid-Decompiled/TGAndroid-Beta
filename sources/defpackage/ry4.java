package defpackage;

import android.content.ClipData;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.webrtc.GlGenericDrawer;
public final class ry4 implements GlGenericDrawer.TextureCallback, yr9, ed, xf2, m63, do5, a5c, ac1, OnSuccessListener, OnFailureListener, e39, no7, d39, x74, th4 {
    public final byte a;
    public final Object b;

    public ry4(ty4 ty4Var, k32 k32Var) {
        this.a = (byte) 3;
        this.b = ty4Var;
    }

    @Override
    public final void D(float f, int i) {
        byte b = this.a;
    }

    @Override
    public final vf6 O0() {
        byte b = this.a;
        return null;
    }

    @Override
    public final boolean U1(int i) {
        byte b = this.a;
        return true;
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        zz5 zz5Var = (zz5) this.b;
        io5 H0 = gl.H0(vxcVar, false);
        if (!zz5Var.a.equals(H0)) {
            zz5Var.a = H0;
            zz5Var.requestLayout();
        }
        int childCount = zz5Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            jdc.b(zz5Var.getChildAt(i), vxcVar);
        }
        return vxcVar;
    }

    @Override
    public final boolean a(gi3 gi3Var, int i, Bundle bundle) {
        dv2 dv2Var;
        hp hpVar = (hp) this.b;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((fo5) gi3Var.a).h();
                Parcelable parcelable = (Parcelable) ((fo5) gi3Var.a).l();
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
        fo5 fo5Var = (fo5) gi3Var.a;
        ClipData clipData = new ClipData(fo5Var.getDescription(), new ClipData.Item(fo5Var.f()));
        if (i2 >= 31) {
            dv2Var = new cv2(clipData, 2);
        } else {
            ev2 ev2Var = new ev2();
            ev2Var.b = clipData;
            ev2Var.c = (byte) 2;
            dv2Var = ev2Var;
        }
        dv2Var.c(fo5Var.i());
        dv2Var.setExtras(bundle);
        if (jdc.i(hpVar, dv2Var.build()) != null) {
            return false;
        }
        return true;
    }

    @Override
    public final o63 createDataSource() {
        return ((m63) ((l69) this.b).b).createDataSource();
    }

    @Override
    public final boolean d(int i, View view) {
        return ((LanguageSelectActivity) this.b).j0(i, view);
    }

    @Override
    public final void e(float f, float f2, int i, View view) {
        int i2;
        int Y;
        boolean[] zArr;
        m66 m66Var = (m66) this.b;
        ArrayList arrayList = m66Var.s;
        if (view != null && i >= 0 && i < arrayList.size()) {
            g66 g66Var = (g66) arrayList.get(i);
            int i3 = g66Var.a;
            int i4 = g66Var.e;
            if (i3 != 3 && i3 != 4) {
                if (i3 == 5 && g66Var.f) {
                    SharedPreferences c1 = na7.c1();
                    boolean z = c1.getBoolean("view_animations", true);
                    SharedPreferences.Editor edit = c1.edit();
                    boolean z2 = !z;
                    edit.putBoolean("view_animations", z2);
                    gba.z1 = Boolean.valueOf(z2);
                    edit.commit();
                    ((wgb) view).setChecked(z2);
                }
            } else {
                boolean z3 = false;
                if (e66.f()) {
                    m66Var.e = u21.b0(m66Var).M(new ch0(0.1f, bkb.w0(null, bkb.X5, false)), k96.M0(2131748677, null)).j();
                    return;
                } else if (g66Var.a == 3 && Integer.bitCount(i4) > 1 && (!k96.a0 ? f < view.getMeasuredWidth() - gl.L(75.0f) : f > gl.L(75.0f)) && (Y = m66Var.Y(i4)) != -1) {
                    m66Var.n[Y] = !zArr[Y];
                    m66Var.c0();
                    m66Var.b0();
                    return;
                } else {
                    if ((e66.d(true) & i4) > 0) {
                        z3 = true;
                    }
                    int d = e66.d(true);
                    if (!z3) {
                        i2 = d | i4;
                    } else {
                        i2 = d & (~i4);
                    }
                    e66.i = i2;
                    e66.k();
                    m66Var.c0();
                }
            }
            qw4.f();
        }
    }

    @Override
    public final void f() {
        ee5 ee5Var = (ee5) this.b;
        float progress = 1.0f - (ee5Var.w.getProgress() * 0.143f);
        be0 be0Var = ee5Var.a;
        be0Var.setScaleX(progress);
        be0Var.setScaleY(progress);
        ee5Var.invalidate();
    }

    @Override
    public final void g(float f) {
        vk6 vk6Var = (vk6) this.b;
        zac zacVar = vk6Var.f1.b;
        if (zacVar.f != f) {
            zacVar.f = f;
            zacVar.c(false);
        }
        vk6Var.G0(vk6Var.d0);
    }

    @Override
    public final long get() {
        return ((q88) ((s34) this.b).b).getCaptionsVideoPosition();
    }

    @Override
    public final void h() {
        float f;
        q88 q88Var = (q88) this.b;
        TextView textView = q88Var.o1;
        boolean a = q88Var.v0.a();
        ImageView imageView = q88Var.m1;
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
    public final void m2(ArrayList arrayList) {
        byte b = this.a;
    }

    @Override
    public final void onFailure(Exception exc) {
        ((yw5) this.b).n(exc);
    }

    @Override
    public final void onSuccess(Object obj) {
        ((zw5) this.b).a((String) obj);
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 27:
                ch6 ch6Var = (ch6) obj;
                ch6Var.setScaleX(gl.R1(1.0f, 1.019f, f));
                ch6Var.setScaleY(gl.R1(1.0f, 1.019f, f));
                return;
            default:
                ((zj6) obj).b0();
                return;
        }
    }

    @Override
    public final boolean q(View view) {
        return false;
    }

    @Override
    public final void r(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 6:
                oa5 oa5Var = (oa5) obj;
                qa5 qa5Var = oa5Var.J;
                qa5Var.t0(oa5Var.I);
                if (oa5Var.h == null && !oa5Var.f.e() && oa5Var.b() == 0) {
                    qa5Var.s.e(false, true);
                }
                oa5Var.f();
                return;
            default:
                fr5 fr5Var = (fr5) obj;
                jr5 jr5Var = fr5Var.n;
                jr5Var.J0(fr5Var.f - 1);
                if (fr5Var.h == null && !fr5Var.e.e() && fr5Var.b() <= 2) {
                    jr5Var.t1.e(false, true);
                }
                fr5Var.f();
                return;
        }
    }

    @Override
    public final void run(Bitmap bitmap, int i) {
        h85 h85Var = (h85) this.b;
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
            gl.d3(new vc4(h85Var, bitmap, (byte) 26));
        }
    }

    @Override
    public final vf6 t1() {
        byte b = this.a;
        return null;
    }

    @Override
    public final void u(hd hdVar, int i) {
        int i2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 7:
                ((bb5) obj).Y(true);
                return;
            case 12:
                jr5 jr5Var = (jr5) obj;
                vf6 vf6Var = jr5Var.Z1;
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < vf6Var.m(); i3++) {
                    arrayList.add(na7.q1(jr5Var.a).V1(Long.valueOf(vf6Var.j(i3))));
                }
                ka5 ka5Var = jr5Var.f2;
                if (ka5Var != null) {
                    ka5Var.f(0, arrayList);
                }
                jr5Var.dismiss();
                return;
            case 15:
                ((l68) obj).run();
                return;
            case 17:
                ((kw5) obj).a.Z1.q();
                return;
            case 21:
                String str = LaunchActivity.C1;
                gl.g((StringBuilder) obj);
                return;
            case 24:
                ad6 ad6Var = (ad6) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", ad6Var.J);
                bundle.putString("ephone", ad6Var.K);
                bundle.putString("phoneFormated", ad6Var.M);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = ad6Var.M;
                tL_auth_resetLoginEmail.phone_code_hash = ad6Var.N;
                ad6Var.a0.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new sc6(ad6Var, bundle, tL_auth_resetLoginEmail, (byte) 1), 10);
                return;
            case 25:
                jd6 jd6Var = (jd6) obj;
                jd6Var.E.N1(jd6Var.s, jd6Var.w, jd6Var.x);
                return;
            default:
                be6 be6Var = (be6) obj;
                mf6 mf6Var = be6Var.H;
                mf6Var.A1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i2 = ((d) mf6Var).currentAccount;
                ConnectionsManager.getInstance(i2).sendRequest(deleteaccount, new n35(be6Var, (byte) 6), 10);
                return;
        }
    }

    public ry4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void i(ArrayList arrayList) {
    }

    private final void j(ArrayList arrayList) {
    }

    private final void b(float f, int i) {
    }

    private final void c(float f, int i) {
    }

    @Override
    public final void l(View view, float f, float f2) {
    }
}

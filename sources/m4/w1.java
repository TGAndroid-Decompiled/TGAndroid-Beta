package m4;

import a8.qd;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import fi.wb;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import m.g3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Cells.d3;
import org.telegram.ui.Cells.y1;
import org.telegram.ui.Components.gg0;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.by0;
import org.telegram.ui.kn0;
import org.telegram.ui.l5;
import org.telegram.ui.m4;
import org.telegram.ui.m7;
import org.telegram.ui.nj0;
import org.telegram.ui.q31;
import org.telegram.ui.sm0;
import org.telegram.ui.w6;
import org.telegram.ui.wu;
import org.telegram.ui.xu;
import org.telegram.ui.ym0;
public final class w1 implements e2.d, o5.b, oe.f, lp0, hu, wb, m7, ym0, hh.a, q81, p2.t, com.google.android.gms.common.api.internal.r, SuccessContinuation {
    public final int f18291a;
    public Object f18292b;
    public Object f18293c;

    public w1(int i10, byte b10) {
        this.f18291a = i10;
    }

    public static m4.w1 s(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: m4.w1.s(android.content.Context):m4.w1");
    }

    @Override
    public y2.n G() {
        return new c(20, ((p2.t) this.f18292b).G(), (List) this.f18293c);
    }

    @Override
    public k9.y H(byte[] bArr) {
        return qd.c(((e2.d) this.f18292b).H(bArr), new jg.e1(this, 21));
    }

    public View M(int i10, int i11, int i12, int i13) {
        int i14;
        s4.i1 i1Var = (s4.i1) this.f18293c;
        s4.j1 j1Var = (s4.j1) this.f18292b;
        int s10 = j1Var.s();
        int J = j1Var.J();
        if (i11 > i10) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        View view = null;
        while (i10 != i11) {
            View W = j1Var.W(i10);
            int m10 = j1Var.m(W);
            int X = j1Var.X(W);
            i1Var.f47810b = s10;
            i1Var.f47811c = J;
            i1Var.d = m10;
            i1Var.e = X;
            if (i12 != 0) {
                i1Var.f47809a = i12;
                if (i1Var.a()) {
                    return W;
                }
            }
            if (i13 != 0) {
                i1Var.f47809a = i13;
                if (i1Var.a()) {
                    view = W;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public boolean N(n4.v vVar, String str) {
        Context context = (Context) this.f18292b;
        int i10 = vVar.f18699b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, vVar.f18698a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, vVar.f18700c) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean O(View view) {
        s4.i1 i1Var = (s4.i1) this.f18293c;
        s4.j1 j1Var = (s4.j1) this.f18292b;
        int s10 = j1Var.s();
        int J = j1Var.J();
        int m10 = j1Var.m(view);
        int X = j1Var.X(view);
        i1Var.f47810b = s10;
        i1Var.f47811c = J;
        i1Var.d = m10;
        i1Var.e = X;
        i1Var.f47809a = 24579;
        return i1Var.a();
    }

    @Override
    public void P() {
        ((oe.k) this.f18292b).b((oe.l) this.f18293c);
    }

    public void Q(o0.f fVar) {
        androidx.biometric.n nVar = (androidx.biometric.n) this.f18293c;
        b6.i iVar = (b6.i) this.f18292b;
        int i10 = fVar.f18932b;
        if (i10 == 0) {
            nVar.execute(new k9.u(20, iVar, fVar.f18931a));
        } else {
            nVar.execute(new g3(iVar, i10));
        }
    }

    @Override
    public y2.n R(p2.p pVar, p2.m mVar) {
        return new c(20, ((p2.t) this.f18292b).R(pVar, mVar), (List) this.f18293c);
    }

    public void S() {
        try {
            ((FileLock) this.f18293c).release();
            ((FileChannel) this.f18292b).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public int T(Context context, com.google.android.gms.common.api.c cVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f18292b;
        o6.l.h(context);
        o6.l.h(cVar);
        int i10 = 0;
        if (!cVar.k()) {
            return 0;
        }
        int l4 = cVar.l();
        int i11 = sparseIntArray.get(l4, -1);
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        while (true) {
            if (i12 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i12);
                if (keyAt > l4 && sparseIntArray.get(keyAt) == 0) {
                    break;
                }
                i12++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            i10 = ((l6.e) this.f18293c).d(context, l4);
        }
        sparseIntArray.put(l4, i10);
        return i10;
    }

    @Override
    public void U(float f7, boolean z10) {
        ((TextView) this.f18292b).setText("Alpha " + l5.e);
        l5.e = f7;
        ((l5) this.f18293c).f40978b.L();
    }

    @Override
    public void a() {
        ((oe.k) this.f18292b).a();
    }

    @Override
    public void accept(java.lang.Object r53, java.lang.Object r54) {
        throw new UnsupportedOperationException("Method not decompiled: m4.w1.accept(java.lang.Object, java.lang.Object):void");
    }

    @Override
    public void d(String str, String str2) {
        kn0 kn0Var = ((sm0) this.f18293c).f43362a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            kn0Var.O1(true, str2, (nj0) this.f18292b, this, kn0Var.B1);
        } else {
            kn0Var.N1(true, false);
        }
    }

    @Override
    public void dismiss() {
        ((xu) this.f18293c).dismiss();
    }

    @Override
    public eh.d f() {
        if (Build.VERSION.SDK_INT >= 29) {
            eh.e eVar = new eh.e(this);
            ((PhotoViewer) this.f18293c).Z.add(eVar);
            return eVar;
        }
        return new eh.f(this);
    }

    @Override
    public void g() {
        ((d3) this.f18293c).b(((ju) this.f18292b).getText());
    }

    @Override
    public Object mo27get() {
        switch (this.f18291a) {
            case 3:
                return new n5.d((Context) ((b9.p) this.f18292b).f3714a, (k6.c) ((jg.s0) this.f18293c).mo27get());
            default:
                ?? obj = new Object();
                u7.s sVar = new u7.s(24);
                t5.i iVar = (t5.i) ((id.a) this.f18292b).mo27get();
                return new t5.g(obj, sVar, t5.a.f48732f, iVar, (id.a) this.f18293c);
        }
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public boolean j() {
        return false;
    }

    @Override
    public boolean k(float f7) {
        return false;
    }

    @Override
    public int k0() {
        return 0;
    }

    @Override
    public void onError(t81 t81Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f18293c;
        int i10 = secretMediaViewer.f36179b0;
        if (i10 > 0) {
            secretMediaViewer.f36179b0 = i10 - 1;
            AndroidUtilities.runOnUIThread(new by0(19, this, (File) this.f18292b), 100L);
            return;
        }
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f18293c;
        q31 q31Var = secretMediaViewer.f36196i1;
        if (secretMediaViewer.f36229y != null && secretMediaViewer.f36193h0 != null) {
            AndroidUtilities.cancelRunOnUIThread(q31Var);
            AndroidUtilities.runOnUIThread(q31Var);
            if (i10 != 4 && i10 != 1) {
                try {
                    secretMediaViewer.f36178b.getWindow().addFlags(128);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else {
                try {
                    secretMediaViewer.f36178b.getWindow().clearFlags(128);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            if (i10 == 3 && secretMediaViewer.f36224w.getVisibility() != 0) {
                secretMediaViewer.f36224w.setVisibility(0);
            }
            if (secretMediaViewer.f36229y.y() && i10 != 4) {
                if (!secretMediaViewer.E) {
                    secretMediaViewer.E = true;
                }
            } else if (secretMediaViewer.E) {
                secretMediaViewer.E = false;
                if (i10 == 4) {
                    secretMediaViewer.H = true;
                    if (secretMediaViewer.I) {
                        secretMediaViewer.e(true, !secretMediaViewer.f36211q1);
                        return;
                    }
                    secretMediaViewer.f36229y.L(0L, false);
                    secretMediaViewer.f36229y.C();
                }
            }
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        m4 m4Var = ((SecretMediaViewer) this.f18293c).f36224w;
        if (m4Var != null) {
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = (i10 * f7) / i11;
            }
            m4Var.a(f10, 0);
        }
    }

    @Override
    public void q(w6 w6Var, ci.a aVar, boolean z10) {
        xu xuVar = (xu) this.f18293c;
        wu wuVar = xuVar.X;
        if (aVar != null) {
            ((ci.b) this.f18292b).i(aVar);
            xuVar.f45782e0.e();
            ci.b bVar = xuVar.f45784g0;
            jz0[] jz0VarArr = xuVar.f45779b0;
            y1[] y1VarArr = xuVar.f45780c0;
            y1 y1Var = y1VarArr[0];
            if (y1Var != null) {
                jz0 jz0Var = jz0VarArr[0];
                boolean z11 = bVar.f6378m;
                jz0Var.f29792c = z11;
                y1Var.c(z11, true);
            }
            y1 y1Var2 = y1VarArr[1];
            if (y1Var2 != null) {
                jz0 jz0Var2 = jz0VarArr[1];
                boolean z12 = bVar.f6379n;
                jz0Var2.f29792c = z12;
                y1Var2.c(z12, true);
            }
            y1 y1Var3 = y1VarArr[2];
            if (y1Var3 != null) {
                jz0 jz0Var3 = jz0VarArr[2];
                boolean z13 = bVar.f6380o;
                jz0Var3.f29792c = z13;
                y1Var3.c(z13, true);
            }
            y1 y1Var4 = y1VarArr[3];
            if (y1Var4 != null) {
                jz0 jz0Var4 = jz0VarArr[3];
                boolean z14 = bVar.f6381p;
                jz0Var4.f29792c = z14;
                y1Var4.c(z14, true);
            }
            y1 y1Var5 = y1VarArr[4];
            if (y1Var5 != null) {
                jz0 jz0Var5 = jz0VarArr[4];
                boolean z15 = bVar.f6382q;
                jz0Var5.f29792c = z15;
                y1Var5.c(z15, true);
            }
            xuVar.f45778a0.a(wuVar.d(), true);
            wuVar.c(true);
        }
    }

    @Override
    public k9.y t(b2.s0 s0Var) {
        k9.y t10 = ((e2.d) this.f18292b).t(s0Var);
        if (t10 == null) {
            return null;
        }
        return qd.c(t10, new jg.e1(this, 21));
    }

    @Override
    public Task then(Object obj) {
        fa.a aVar = (fa.a) obj;
        y9.n nVar = ((y9.k) this.f18293c).e;
        if (aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return Tasks.forResult(null);
        }
        return Tasks.whenAll(y9.n.b(nVar), nVar.f52509m.v((Executor) this.f18292b, null));
    }

    public String toString() {
        switch (this.f18291a) {
            case 5:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f18293c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f18292b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb2.append((String) arrayList.get(i10));
                    if (i10 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            case 17:
                return "Bounds{lower=" + ((i0.b) this.f18292b) + " upper=" + ((i0.b) this.f18293c) + "}";
            default:
                return super.toString();
        }
    }

    @Override
    public void v(float f7, boolean z10) {
        xa0 xa0Var = (xa0) this.f18292b;
        gg0 gg0Var = (gg0) this.f18293c;
        t81 t81Var = gg0Var.d;
        if (t81Var != null) {
            long p10 = t81Var.p();
            float max = 2.8f / ((float) Math.max(60L, p10));
            long j10 = (((f7 / (1.0f - max)) * max) + f7) * ((float) p10);
            gg0Var.e = j10;
            gg0Var.d.L(j10, !z10);
            if (!z10) {
                AndroidUtilities.cancelRunOnUIThread(xa0Var);
                AndroidUtilities.runOnUIThread(xa0Var, 120L);
            }
        }
    }

    @Override
    public void w(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.clipRect(f7, f10, f11, f12);
        ((PhotoViewer) this.f18293c).U0(canvas, (pa) this.f18292b, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    public void x(Object obj, String str) {
        ((ArrayList) this.f18292b).add(a1.g.D(str, "=", String.valueOf(obj)));
    }

    public w1(int i10, Object obj, Object obj2) {
        this.f18291a = i10;
        this.f18292b = obj;
        this.f18293c = obj2;
    }

    @Override
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f18293c;
        if (secretMediaViewer.f36182c0) {
            return;
        }
        secretMediaViewer.f36182c0 = true;
        secretMediaViewer.e.invalidate();
    }

    public w1(Object obj, Object obj2, boolean z10, int i10) {
        this.f18291a = i10;
        this.f18293c = obj;
        this.f18292b = obj2;
    }

    public w1(Context context) {
        this.f18291a = 25;
        this.f18293c = new AtomicLong(-1L);
        this.f18292b = new com.google.android.gms.common.api.j(context, q6.b.f47015k, new o6.p("mlkit:natural_language"), com.google.android.gms.common.api.i.f6478c);
    }

    public w1(Object obj) {
        this.f18291a = 5;
        this.f18293c = obj;
        this.f18292b = new ArrayList();
    }

    public w1(l6.e eVar) {
        this.f18291a = 6;
        this.f18292b = new SparseIntArray();
        o6.l.h(eVar);
        this.f18293c = eVar;
    }

    public w1(byte[] bArr) {
        this.f18291a = 1;
        this.f18292b = bArr;
    }

    public w1(gg0 gg0Var) {
        this.f18291a = 11;
        this.f18293c = gg0Var;
        this.f18292b = new xa0(this, 11);
    }

    public w1(String str, String str2) {
        this.f18291a = 23;
        this.f18292b = str;
        this.f18293c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    public w1(s4.j1 j1Var) {
        this.f18291a = 19;
        this.f18292b = j1Var;
        ?? obj = new Object();
        obj.f47809a = 0;
        this.f18293c = obj;
    }

    @Override
    public void I() {
    }

    @Override
    public void clear() {
    }

    @Override
    public void l() {
    }

    @Override
    public void m() {
    }

    @Override
    public void p() {
    }

    @Override
    public void y() {
    }

    public w1(int i10) {
        this.f18291a = 27;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.f18292b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.f18293c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    @Override
    public void A(boolean z10) {
    }

    @Override
    public void C(float f7) {
    }

    @Override
    public void D(float f7) {
    }

    @Override
    public void F(float f7) {
    }

    @Override
    public void J(float f7) {
    }

    @Override
    public void L(long j10) {
    }

    @Override
    public void b(int i10) {
    }

    @Override
    public void c(float f7) {
    }

    @Override
    public void e(float f7) {
    }

    @Override
    public void i(boolean z10) {
    }

    @Override
    public void n(float f7) {
    }

    @Override
    public void o(boolean z10) {
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void u(float f7) {
    }

    @Override
    public void z(long j10) {
    }

    public w1(y9.k kVar, Executor executor, String str) {
        this.f18291a = 29;
        this.f18293c = kVar;
        this.f18292b = executor;
    }

    public w1(PhotoViewer photoViewer) {
        this.f18291a = 14;
        this.f18293c = photoViewer;
        this.f18292b = new pa(photoViewer.f35642b0, photoViewer.f35670e0, 0, false);
    }

    @Override
    public void B(float f7, int i10) {
    }

    @Override
    public void E(float f7, int i10) {
    }

    @Override
    public void K(int i10, long j10) {
    }

    @Override
    public void h(long j10, boolean z10) {
    }

    @Override
    public void r(float f7, int i10) {
    }
}

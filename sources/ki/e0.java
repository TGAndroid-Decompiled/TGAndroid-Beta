package ki;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.f3;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.u50;
import org.telegram.ui.Components.v71;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.Components.x81;
import org.telegram.ui.Components.z81;
import qg.n2;
import qg.w1;
public final class e0 implements l.x, l.j, k1.f, c5, ah.k, s71, x81, com.google.android.gms.common.api.internal.s, w1, r4.c, com.google.android.gms.common.api.internal.o, n5.b, OnCompleteListener {
    public final int f13671a;
    public final Object f13672b;

    public e0(Object obj, int i10) {
        this.f13671a = i10;
        this.f13672b = obj;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.f13672b;
        e0Var.l0(i10, i11, z10);
        e0Var.dismiss();
    }

    @Override
    public Object a(rd.p pVar, kd.c cVar) {
        return ((k1.a0) this.f13672b).a(new n1.c(pVar, null, 0), cVar);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        p6.a aVar = (p6.a) ((p6.c) obj).u();
        Parcel I0 = aVar.I0();
        k7.a.c(I0, (n6.o) this.f13672b);
        try {
            aVar.f312b.transact(1, I0, null, 1);
            I0.recycle();
            taskCompletionSource.setResult(null);
        } catch (Throwable th2) {
            I0.recycle();
            throw th2;
        }
    }

    @Override
    public void b(Canvas canvas) {
        switch (this.f13671a) {
            case 10:
                vi viVar = (vi) this.f13672b;
                canvas.drawColor(viVar.getThemedColor(j6.f19109d6));
                if (SharedConfig.chatBlurEnabled()) {
                    viVar.C2.b(canvas, -3);
                    return;
                }
                return;
            default:
                wq0 wq0Var = (wq0) this.f13672b;
                canvas.drawColor(wq0Var.getThemedColor(j6.f19109d6));
                if (SharedConfig.chatBlurEnabled()) {
                    wq0Var.O0.b(canvas, -3);
                    return;
                }
                return;
        }
    }

    @Override
    public void c(Object obj) {
        com.google.android.gms.common.api.internal.n nVar;
        g8.c cVar = (g8.c) obj;
        androidx.activity.n nVar2 = ((r7.i) this.f13672b).f42391b;
        synchronized (nVar2) {
            nVar2.f1907b = false;
            nVar = ((com.google.android.gms.common.api.internal.p) nVar2.f1908c).f6144c;
        }
        if (nVar != null) {
            ((r7.c) nVar2.d).c(nVar, 2441);
        }
    }

    public boolean d(int i10) {
        q81 q81Var = ((z81) this.f13672b).L;
        if (q81Var == null) {
            return false;
        }
        return q81Var.c(i10);
    }

    public void e(Runnable runnable) {
        Runnable runnable2 = (Runnable) ((HashMap) this.f13672b).remove(runnable);
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
        }
    }

    public void f() {
        HashMap hashMap = (HashMap) this.f13672b;
        for (Map.Entry entry : hashMap.entrySet()) {
            AndroidUtilities.cancelRunOnUIThread((Runnable) entry.getValue());
        }
        hashMap.clear();
    }

    @Override
    public void g(l.l lVar, boolean z10) {
        if (lVar instanceof l.e0) {
            ((l.e0) lVar).f13925z.k().c(false);
        }
        l.x xVar = ((m.h) this.f13672b).e;
        if (xVar != null) {
            xVar.g(lVar, z10);
        }
    }

    @Override
    public Object mo28get() {
        return new s5.j((Context) ((fd.a) this.f13672b).mo28get(), "com.google.android.datatransport.events", Integer.valueOf(s5.j.d).intValue());
    }

    @Override
    public ce.b getData() {
        return ((k1.a0) this.f13672b).f13154c;
    }

    public StringBuilder h() {
        df.a aVar = (df.a) this.f13672b;
        if (aVar instanceof ye.m) {
            StringBuilder sb2 = ((ye.m) aVar).f47095b.f47081b;
            if (sb2.length() != 0) {
                return sb2;
            }
            return null;
        }
        return null;
    }

    public void i(float f7) {
        z81 z81Var = (z81) this.f13672b;
        if (f7 == 1.0f) {
            View[] viewArr = z81Var.e;
            View[] viewArr2 = z81Var.e;
            if (viewArr[1] != null) {
                z81Var.G();
                z81Var.h.put(z81Var.f30851f[1], viewArr2[1]);
                z81Var.removeView(viewArr2[1]);
                z81Var.F(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            z81Var.A(z81Var.f30849b);
            return;
        }
        View[] viewArr3 = z81Var.e;
        View[] viewArr4 = z81Var.e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (z81Var.f30857y) {
            z81Var.F(view, (1.0f - f7) * viewArr3[0].getMeasuredWidth());
            View view2 = viewArr4[0];
            z81Var.F(view2, (-view2.getMeasuredWidth()) * f7);
        } else {
            z81Var.F(view, (1.0f - f7) * (-viewArr3[0].getMeasuredWidth()));
            View view3 = viewArr4[0];
            z81Var.F(view3, view3.getMeasuredWidth() * f7);
        }
        z81Var.x(false);
    }

    public void j() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f13672b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int size = arrayDeque.size();
        long l4 = l();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + l4);
    }

    public void k(long j3) {
        long l4 = l();
        if (l4 != j3) {
            if (l4 != -1) {
                if (l4 == -2) {
                    l4 = -2;
                } else {
                    return;
                }
            }
            StringBuilder t10 = a4.a.t(j3, "expected non-string scope or scope ", " but found ");
            t10.append(l4);
            throw new IOException(t10.toString());
        }
    }

    public long l() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f13672b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override
    public void m(float f7) {
        ((n2) this.f13672b).setOutlineWidth(f7);
    }

    @Override
    public void onComplete(Task task) {
        y8.e0 e0Var = (y8.e0) this.f13672b;
        if (task.isSuccessful()) {
            x8.m.M0(e0Var, true, (byte[]) task.getResult());
            return;
        }
        Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
        x8.m.M0(e0Var, false, null);
    }

    @Override
    public void onError(v71 v71Var, Exception exc) {
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        c60 c60Var;
        VideoEditedInfo videoEditedInfo;
        u50 u50Var = (u50) this.f13672b;
        v71 v71Var = u50Var.H0.T;
        if (v71Var != null && v71Var.y() && i10 == 4 && (videoEditedInfo = (c60Var = u50Var.H0).S) != null) {
            v71 v71Var2 = c60Var.T;
            long j3 = videoEditedInfo.startTime;
            if (j3 <= 0) {
                j3 = 0;
            }
            v71Var2.K(j3);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public boolean q(l.l lVar) {
        m.h hVar = (m.h) this.f13672b;
        if (lVar == hVar.f14422c) {
            return false;
        }
        ((l.e0) lVar).A.getClass();
        hVar.getClass();
        l.x xVar = hVar.e;
        if (xVar == null) {
            return false;
        }
        return xVar.q(lVar);
    }

    @Override
    public void r(l.l lVar) {
        Toolbar toolbar = (Toolbar) this.f13672b;
        m.h hVar = toolbar.f2024a.J;
        if (hVar != null && hVar.h()) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) toolbar.W.f14231c).iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.c0) it.next()).f2401a.t();
        }
    }

    @Override
    public void v() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public boolean w(l.l lVar, MenuItem menuItem) {
        ((Toolbar) this.f13672b).getClass();
        return false;
    }

    @Override
    public void x(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.f13672b).setResultCode(i10);
    }

    @Override
    public void y(ah.a aVar) {
        switch (this.f13671a) {
            case 10:
                aVar.a(((vi) this.f13672b).getThemedColor(j6.f19109d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                return;
            default:
                aVar.a(((wq0) this.f13672b).getThemedColor(j6.f19109d6));
                aVar.b(SharedConfig.chatBlurEnabled());
                return;
        }
    }

    public e0(int i10) {
        this.f13671a = i10;
        switch (i10) {
            case 8:
                this.f13672b = new SparseArray();
                return;
            case 12:
                this.f13672b = new HashMap();
                return;
            case 26:
                this.f13672b = new f3[zf.b.values().length];
                return;
            default:
                this.f13672b = new ArrayDeque(16);
                return;
        }
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    @Override
    public float get() {
        return ((n2) this.f13672b).F;
    }

    public e0(Context context, n4.y yVar) {
        this.f13671a = 5;
        n4.x xVar = ((n4.r) yVar.f15230a).f15214c;
        DesugarCollections.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.f13672b = new n4.j(context, xVar);
        } else {
            this.f13672b = new n4.j(context, xVar);
        }
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
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}

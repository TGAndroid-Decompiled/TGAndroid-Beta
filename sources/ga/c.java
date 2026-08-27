package ga;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.biometric.f0;
import androidx.fragment.app.j0;
import androidx.lifecycle.a0;
import c7.b0;
import c7.g;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.x0;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.f;
import d6.h;
import g.r;
import ge.o;
import hh.y9;
import ig.q0;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import jh.e4;
import jh.z8;
import l.x;
import lh.m0;
import lh.m6;
import lh.q6;
import m.l;
import n5.k;
import n6.v;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.ku0;
import r7.e;
import uf.m;
import y6.j;
import y6.l1;
import y6.m1;
import zf.c2;

public final class c implements a0, androidx.activity.result.b, s, x, vj0, ku0, m, j61, l, OnCompleteListener {

    public static volatile c f6832c;

    public final int f6833a;

    public Object f6834b;

    public c(int i10, boolean z10) {
        this.f6833a = i10;
    }

    @Override
    public void J(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        f0 f0Var = (f0) this.f6834b;
        Handler handler = f0Var.f1047w0;
        a8.b bVar = f0Var.f1048x0;
        handler.removeCallbacks(bVar);
        TextView textView = f0Var.C0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(bVar, 2000L);
    }

    @Override
    public TextureView K() {
        return null;
    }

    @Override
    public void a(Object obj) {
        switch (this.f6833a) {
            case 3:
                Map map = (Map) obj;
                j0 j0Var = (j0) this.f6834b;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
                }
                androidx.fragment.app.f0 f0Var = (androidx.fragment.app.f0) j0Var.F.pollFirst();
                if (f0Var == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = f0Var.f1433a;
                    if (j0Var.f1447c.q(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    }
                }
                break;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f6834b;
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar.f907b;
                int i11 = aVar.f906a;
                Bundle extras = intent == null ? null : intent.getExtras();
                if (i11 != -1) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i11);
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i11);
                }
                int i12 = u.e("ProxyBillingActivityV2", intent).f18147a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.K;
                if (resultReceiver != null) {
                    resultReceiver.send(i12, extras);
                } else {
                    u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                }
                if (i12 != 0) {
                    u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i12);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f6833a) {
            case 6:
                e eVar = (e) this.f6834b;
                b0 b0Var = (b0) ((c7.l) obj).u();
                g gVar = new g(1, (TaskCompletionSource) obj2);
                Parcel parcelM0 = b0Var.M0();
                c7.e.c(parcelM0, eVar);
                c7.e.d(parcelM0, gVar);
                parcelM0.writeString(null);
                b0Var.Q0(parcelM0, 63);
                return;
            case 10:
                f fVar = new f(0, (TaskCompletionSource) obj2);
                d6.e eVar2 = (d6.e) ((h) obj).u();
                d6.a aVar = (d6.a) this.f6834b;
                Parcel parcelG0 = eVar2.G0();
                v6.a.d(parcelG0, fVar);
                v6.a.c(parcelG0, aVar);
                eVar2.H0(parcelG0, 1);
                return;
            default:
                m6.b bVar = new m6.b(0, (TaskCompletionSource) obj2);
                m1 m1Var = (m1) ((l1) obj).u();
                v vVar = (v) this.f6834b;
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(m1Var.f49758b);
                int i10 = j.f49741a;
                parcelObtain.writeStrongBinder(bVar);
                parcelObtain.writeInt(1);
                vVar.writeToParcel(parcelObtain, 0);
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    m1Var.f49757a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return;
                } finally {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                }
        }
    }

    @Override
    public void b(l.l lVar, boolean z10) {
        ((r) this.f6834b).g(lVar);
    }

    public synchronized void c() {
        ((SharedPreferences) this.f6834b).edit().clear().commit();
    }

    public StringBuilder d() {
        le.a aVar = (le.a) this.f6834b;
        if (!(aVar instanceof o)) {
            return null;
        }
        StringBuilder sb2 = ((o) aVar).f6922b.f6907b;
        if (sb2.length() == 0) {
            return null;
        }
        return sb2;
    }

    public Set e() {
        Set setUnmodifiableSet;
        synchronized (((HashSet) this.f6834b)) {
            setUnmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.f6834b);
        }
        return setUnmodifiableSet;
    }

    public boolean f() {
        x0 x0Var = ((com.google.android.gms.common.api.internal.j0) this.f6834b).d;
        return x0Var != null && x0Var.b();
    }

    public void g(c3.g gVar, Thread thread, Throwable th) {
        f9.o oVar = (f9.o) this.f6834b;
        synchronized (oVar) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    f9.b0.a(oVar.f5958e.R(new f9.l(oVar, System.currentTimeMillis(), th, thread, gVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e9) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e9);
            }
        }
    }

    public m9.a h(JSONObject jSONObject) {
        m9.b vVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            vVar = new ab.a(15);
        } else {
            vVar = new e7.v(15);
        }
        return vVar.P1((ab.a) this.f6834b, jSONObject);
    }

    @Override
    public boolean j() {
        return true;
    }

    @Override
    public void k() {
        ((m0) this.f6834b).f16368e.invalidate();
    }

    @Override
    public boolean l(l.l lVar) {
        Window.Callback callback = ((r) this.f6834b).f6298f.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, lVar);
        return true;
    }

    @Override
    public boolean m() {
        return false;
    }

    @Override
    public void n(View view, q0 q0Var, boolean z10, boolean z11) {
        ig.v vVar = (ig.v) this.f6834b;
        vVar.f11457a.ab(null, vVar.f11460e, vVar.f11458b, view, 0.0f, 0.0f, q0Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new y9(this, 4));
    }

    @Override
    public void onComplete(Task task) {
        n5.c.h((n5.c) ((k) this.f6834b).f18323c, "launchApplication", task);
    }

    @Override
    public void onRenderedFirstFrame(i3.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        q6 q6Var = (q6) this.f6834b;
        m6 m6Var = q6Var.I;
        m61 m61Var = q6Var.f16589x;
        if (m61Var == null) {
            return;
        }
        if (m61Var.z()) {
            AndroidUtilities.runOnUIThread(m6Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(m6Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        q6 q6Var = (q6) this.f6834b;
        q6Var.getClass();
        q6Var.getClass();
        c2 c2Var = q6Var.f16587w;
        if (c2Var != null) {
            float f11 = i10 / i11;
            if (Math.abs(c2Var.f50367u0 - f11) >= 1.0E-4f) {
                c2Var.f50367u0 = f11;
                c2Var.requestLayout();
            }
        }
    }

    @Override
    public boolean t() {
        return false;
    }

    @Override
    public void w0(MessageObject messageObject) {
        ((z8) ((e4) this.f6834b).M1).f(true);
    }

    @Override
    public void y(MessageObject messageObject) {
        ((z8) ((e4) this.f6834b).M1).f(false);
    }

    public c(com.google.android.gms.common.api.j jVar, z5.a aVar, int i10) {
        this.f6833a = i10;
        this.f6834b = aVar;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public c(Object obj, int i10) {
        this.f6833a = i10;
        this.f6834b = obj;
    }

    public c(int i10) {
        this.f6833a = i10;
        switch (i10) {
            case 4:
                this.f6834b = new LinkedHashMap(0, 0.75f, true);
                break;
            case 16:
                this.f6834b = new g5.b[hf.b.values().length];
                break;
            default:
                this.f6834b = new HashSet();
                break;
        }
    }

    public c(Context context) {
        boolean zIsEmpty;
        this.f6833a = 9;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f6834b = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                c();
            }
        } catch (IOException e9) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e9.getMessage());
            }
        }
    }

    @Override
    public void H() {
    }

    @Override
    public void s() {
    }

    @Override
    public void D(boolean z10) {
    }

    @Override
    public void onSeekFinished(i3.a aVar) {
    }

    @Override
    public void onSeekStarted(i3.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void q(boolean z10) {
    }

    @Override
    public void onError(m61 m61Var, Exception exc) {
    }

    @Override
    public void r(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z10) {
    }
}

package ja;

import af.h;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.Point;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.e0;
import androidx.biometric.q;
import androidx.fragment.app.f0;
import androidx.lifecycle.a0;
import androidx.recyclerview.widget.RecyclerView;
import c2.u;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.x0;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import f2.k0;
import f2.l1;
import f2.o0;
import f2.w0;
import h5.d0;
import j$.util.DesugarCollections;
import j7.r5;
import j8.e;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;
import kc.k;
import l.i;
import la.b0;
import m.j1;
import o7.d;
import o7.f;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.y4;
import s5.m;
import v7.j;
public final class c implements a0, androidx.activity.result.b, k0, a3.b, o, j1, Continuation, s, i, o0.a, WebMessageListenerBoundaryInterface, x61, y4, na0 {
    public static volatile c f9334c;
    public final int f9335a;
    public Object f9336b;

    public c(Object obj, int i10) {
        this.f9335a = i10;
        this.f9336b = obj;
    }

    public static c o(float f10, int i10) {
        boolean z4;
        Point point = AndroidUtilities.displaySize;
        int i11 = (int) (point.x * f10);
        int i12 = (int) (point.y * f10);
        if (i11 == i12) {
            return new c(i11, i12, new int[0]);
        }
        if (i10 == 3) {
            return new c(i11, i12, new int[]{i12, i11});
        }
        boolean z10 = true;
        if (i10 == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i11 >= i12) {
            z10 = false;
        }
        if (z4 == z10) {
            return new c(i11, i12, new int[0]);
        }
        return new c(i12, i11, new int[0]);
    }

    @Override
    public void D(int i10, int i11) {
        ((o0) this.f9336b).p(i10, i11);
    }

    @Override
    public void G(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        q qVar = (q) this.f9336b;
        if (charSequence != null) {
            if (qVar.R()) {
                qVar.W(charSequence);
            }
            qVar.f497i0.d(null);
        }
    }

    @Override
    public void J(int i10, int i11, boolean z4) {
        ((ChatActivityEnterView) this.f9336b).T0(i10, z4, 0, true, 0L);
    }

    @Override
    public void L0(int i10, int i11) {
        ((o0) this.f9336b).t(i10, i11);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f9335a) {
            case 15:
                e eVar = (e) this.f9336b;
                s7.b bVar = (s7.b) obj;
                bVar.getClass();
                s7.a aVar = new s7.a(1, (TaskCompletionSource) obj2);
                try {
                    s7.i iVar = (s7.i) bVar.u();
                    Bundle G = bVar.G();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = s7.c.f44165a;
                    obtain.writeInt(1);
                    eVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar);
                    iVar.f44173a.transact(14, obtain, null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
                    Bundle bundle = Bundle.EMPTY;
                    r5.a(Status.h, Boolean.FALSE, aVar.f44164b);
                    return;
                }
            default:
                d dVar = new d(1, (TaskCompletionSource) obj2);
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i11 = o7.a.f16442a;
                obtain2.writeStrongBinder(dVar);
                obtain2.writeInt(1);
                ((z7.c) this.f9336b).writeToParcel(obtain2, 0);
                ((o7.c) ((f) obj).u()).E0(obtain2, 1);
                return;
        }
    }

    @Override
    public Cursor b(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f9336b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    public void c(int i10, boolean z4) {
        u uVar = (u) this.f9336b;
        if (z4) {
            uVar.b(i10);
        } else {
            uVar.getClass();
        }
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f9336b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    public void d() {
        ArrayList arrayList = (ArrayList) this.f9336b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (obj == null) {
                try {
                    throw null;
                    break;
                } catch (Exception e) {
                    k.d.log(Level.WARNING, "could not delete file ", (Throwable) e);
                }
            } else {
                throw new ClassCastException();
            }
        }
        arrayList.clear();
    }

    public synchronized void e() {
        ((SharedPreferences) this.f9336b).edit().clear().commit();
    }

    @Override
    public Paint.FontMetricsInt f() {
        return ((li) this.f9336b).B0.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public void g(Object obj) {
        ((u7.c) obj).onLocationAvailability((LocationAvailability) this.f9336b);
    }

    @Override
    public Object mo28get() {
        String packageName = ((Context) ((rc.a) this.f9336b).mo28get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    public void h(f2.a aVar) {
        RecyclerView recyclerView = (RecyclerView) this.f9336b;
        int i10 = aVar.f5643a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 8) {
                        return;
                    }
                    recyclerView.f1261x.X(recyclerView, aVar.f5644b, aVar.d);
                    return;
                }
                recyclerView.f1261x.a0(recyclerView, aVar.f5644b, aVar.d, aVar.f5645c);
                return;
            }
            recyclerView.f1261x.Y(recyclerView, aVar.f5644b, aVar.d);
            return;
        }
        recyclerView.f1261x.V(recyclerView, aVar.f5644b, aVar.d);
    }

    @Override
    public void h0(int i10, int i11) {
        ((o0) this.f9336b).s(i10, i11);
    }

    @Override
    public void i(l.k kVar) {
        bb.b bVar = ((ActionMenuView) this.f9336b).H;
        if (bVar != null) {
            bVar.i(kVar);
        }
    }

    @Override
    public void invalidate() {
        ((s1) ((f1) this.f9336b).f21014b).invalidate();
    }

    @Override
    public void j1(int i10, int i11) {
        ((o0) this.f9336b).r(i10, i11, null);
    }

    public Set k() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.f9336b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.f9336b);
        }
        return unmodifiableSet;
    }

    public boolean l() {
        x0 x0Var = ((j0) this.f9336b).d;
        if (x0Var != null && x0Var.b()) {
            return true;
        }
        return false;
    }

    public void m(b0 b0Var) {
        ((y2.o) ((v2.f) ((ba.b) this.f9336b).get())).a("FIREBASE_APPQUALITY_SESSION", new v2.c("json"), new gg.f(this, 25)).a(new v2.a(null, b0Var, v2.d.f45624a, null), new s0.b(29));
    }

    public void n(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = (RecyclerView) this.f9336b;
        int v = recyclerView.e.v();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < v; i15++) {
            View u10 = recyclerView.e.u(i15);
            l1 U = RecyclerView.U(u10);
            if (U != null && !U.r() && (i13 = U.f5776c) >= i10 && i13 < i14) {
                U.a(2);
                if (obj == null) {
                    U.a(1024);
                } else if ((1024 & U.f5782l) == 0) {
                    if (U.f5783m == null) {
                        ArrayList arrayList = new ArrayList();
                        U.f5783m = arrayList;
                        U.f5784n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    U.f5783m.add(obj);
                }
                ((w0) u10.getLayoutParams()).f5849c = true;
            }
        }
        h hVar = recyclerView.f1233b;
        ArrayList arrayList2 = (ArrayList) hVar.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            l1 l1Var = (l1) arrayList2.get(size);
            if (l1Var != null && (i12 = l1Var.f5776c) >= i10 && i12 < i14) {
                l1Var.a(2);
                hVar.f(size);
            }
        }
        recyclerView.f1257u0 = true;
    }

    @Override
    public void onPostMessage(android.webkit.WebView r8, java.lang.reflect.InvocationHandler r9, android.net.Uri r10, boolean r11, java.lang.reflect.InvocationHandler r12) {
        throw new UnsupportedOperationException("Method not decompiled: ja.c.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    public void p(int i10, int i11) {
        RecyclerView recyclerView = (RecyclerView) this.f9336b;
        int v = recyclerView.e.v();
        for (int i12 = 0; i12 < v; i12++) {
            l1 U = RecyclerView.U(recyclerView.e.u(i12));
            if (U != null && !U.r() && U.f5776c >= i10) {
                U.n(i11, false);
                recyclerView.f1251q0.f5734f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f1233b.e;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            l1 l1Var = (l1) arrayList.get(i13);
            if (l1Var != null && l1Var.f5776c >= i10) {
                l1Var.n(i11, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1256t0 = true;
    }

    @Override
    public boolean q(l.k kVar, MenuItem menuItem) {
        m.k kVar2 = ((ActionMenuView) this.f9336b).M;
        if (kVar2 != null) {
            Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((e0) kVar2).f476b).T.f11787c).iterator();
            while (it.hasNext()) {
                if (((androidx.fragment.app.b0) it.next()).f841a.p()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public void r(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = (RecyclerView) this.f9336b;
        int v = recyclerView.e.v();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < v; i20++) {
            l1 U = RecyclerView.U(recyclerView.e.u(i20));
            if (U != null && (i18 = U.f5776c) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    U.n(i11 - i10, false);
                } else {
                    U.n(i14, false);
                }
                recyclerView.f1251q0.f5734f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f1233b.e;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            l1 l1Var = (l1) arrayList.get(i21);
            if (l1Var != null && (i17 = l1Var.f5776c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    l1Var.n(i11 - i10, false);
                } else {
                    l1Var.n(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1256t0 = true;
    }

    public void s(m mVar) {
        j jVar = (j) this.f9336b;
        jVar.f45695a = mVar;
        Iterator it = jVar.f45697c.iterator();
        while (it.hasNext()) {
            ((l6.e) it.next()).b();
        }
        jVar.f45697c.clear();
        jVar.f45696b = null;
    }

    public void t(IBinder iBinder) {
        synchronized (((HashMap) this.f9336b)) {
            if (iBinder != null) {
                try {
                    iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            new m8.a();
            for (Map.Entry entry : ((HashMap) this.f9336b).entrySet()) {
                if (entry.getValue() == null) {
                    try {
                        throw null;
                        break;
                    } catch (RemoteException unused) {
                        String valueOf = String.valueOf(entry.getKey());
                        Log.w("WearableClient", "onPostInitHandler: Didn't add: " + valueOf + "/null");
                    }
                } else {
                    throw new ClassCastException();
                }
            }
        }
    }

    @Override
    public Object then(Task task) {
        return ((Callable) this.f9336b).call();
    }

    @Override
    public void v(int i10, int i11, CharSequence charSequence, boolean z4) {
        li liVar = (li) this.f9336b;
        if (liVar.m1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(liVar.m1().getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z4) {
                Emoji.replaceEmoji(spannableStringBuilder, liVar.m1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            liVar.m1().setText(spannableStringBuilder);
            liVar.m1().setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public void x(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.f9336b;
        f0 f0Var = (f0) j0Var.F.pollLast();
        if (f0Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = f0Var.f854a;
        int i10 = f0Var.f855b;
        androidx.fragment.app.s r10 = j0Var.f868c.r(str);
        if (r10 == null) {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
            return;
        }
        r10.x(i10, aVar.f344a, aVar.f345b);
    }

    public c(int i10) {
        this.f9335a = i10;
        switch (i10) {
            case 6:
                return;
            case 12:
                this.f9336b = new CopyOnWriteArrayList();
                return;
            case 14:
                this.f9336b = new u();
                return;
            case 16:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.f9336b = new ArrayList();
                return;
            case 21:
                this.f9336b = new HashMap();
                return;
            default:
                this.f9336b = new HashSet();
                return;
        }
    }

    public c(Context context) {
        boolean isEmpty;
        this.f9335a = 5;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f9336b = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                e();
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    public c(l3.d dVar) {
        this.f9335a = 17;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(dVar.f11243a).setFlags(dVar.f11244b).setUsage(dVar.f11245c);
        int i10 = d0.f6924a;
        if (i10 >= 29) {
            l3.b.a(usage, dVar.d);
        }
        if (i10 >= 32) {
            l3.c.a(usage, dVar.e);
        }
        this.f9336b = usage.build();
    }

    @Override
    public void E(String str) {
    }

    public c(int i10, int i11, int[] iArr) {
        this.f9335a = 27;
        a60[] a60VarArr = new a60[(iArr.length / 2) + 1];
        this.f9336b = a60VarArr;
        a60 a60Var = new a60(i10, i11);
        int i12 = 0;
        a60VarArr[0] = a60Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((a60[]) this.f9336b)[i13] = new a60(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    public c(Context context, Uri uri) {
        this.f9335a = 22;
        this.f9336b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override
    public void a(TLRPC.BotInlineResult botInlineResult, boolean z4, int i10) {
    }

    @Override
    public void j(TLRPC.TL_document tL_document, String str, Object obj) {
    }
}

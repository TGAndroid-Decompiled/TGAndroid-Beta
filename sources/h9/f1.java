package h9;

import a8.f7;
import a8.pa;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.MenuItem;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import bi.r3;
import com.google.android.gms.internal.cast.f4;
import com.google.android.gms.tasks.TaskCompletionSource;
import hi.j4;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import li.c5;
import li.e5;
import li.m2;
import li.n3;
import li.t3;
import li.z2;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.fj;
import org.telegram.messenger.i6;
import org.telegram.messenger.ij;
import org.telegram.messenger.lc;
import org.telegram.messenger.m6;
import org.telegram.messenger.o10;
import org.telegram.messenger.o2;
import org.telegram.messenger.ru;
import org.telegram.messenger.va;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.t4;
import org.telegram.ui.bg0;
import org.telegram.ui.ee;
import org.telegram.ui.fr0;
public final class f1 implements g9.k, com.google.android.gms.common.api.internal.p, jg.y1, m.f2, li.i0, t4, li.f1, l.i, n2.v, o0.a, b3.j, va, lc, i51, org.telegram.ui.Cells.l1, te.d, d90 {
    public final int f14322a;
    public Object f14323b;

    public f1(int i7, boolean z9) {
        this.f14322a = i7;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean B(float f10) {
        return false;
    }

    @Override
    public void B1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z9) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override
    public Cursor C0(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f14323b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e10) {
            Log.w("FontsProvider", "Unable to query the content provider", e10);
            return null;
        }
    }

    @Override
    public CharacterStyle C1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override
    public void D1(ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
        z9 z9Var = (z9) this.f14323b;
        org.telegram.ui.Cells.f fVar = z9Var.D;
        if (z9Var.a()) {
            z9Var.f30998y = 2;
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.i3(fVar, 5000L);
        }
    }

    @Override
    public boolean E(li.g1 g1Var) {
        return false;
    }

    @Override
    public boolean E1(org.telegram.ui.Cells.q1 q1Var, ij ijVar) {
        return false;
    }

    @Override
    public void F(li.g1 g1Var) {
        li.a aVar;
        e5 e5Var = (e5) this.f14323b;
        c5 c5Var = e5Var.f18537s;
        if (c5Var != null && (aVar = e5Var.f18986a) != null) {
            t3 t3Var = ((z2) c5Var).f19043a;
            ArrayList arrayList = t3Var.f18894s3;
            long j3 = aVar.f18405t;
            if (j3 != 0) {
                int i7 = -1;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((li.a) arrayList.get(i10)).f18396k.contains(Long.valueOf(j3))) {
                        i7 = i10;
                    }
                }
                if (i7 >= 0) {
                    li.f2 f2Var = t3Var.Q3;
                    if (f2Var != null) {
                        f2Var.d();
                    }
                    li.a aVar2 = new li.a(new TL_iv.pageBlockParagraph(), 0, 0);
                    ArrayList arrayList2 = aVar.f18396k;
                    ArrayList arrayList3 = aVar2.f18396k;
                    arrayList3.addAll(arrayList2);
                    if (!arrayList3.isEmpty()) {
                        a8.p0.z(1, arrayList3);
                    }
                    arrayList.add(i7 + 1, aVar2);
                    t3Var.v4();
                    t3Var.f37160f3.O(false);
                    li.f2 f2Var2 = t3Var.Q3;
                    if (f2Var2 != null) {
                        f2Var2.h();
                    }
                    t3Var.post(new m2(t3Var, aVar2, 26));
                }
            }
        }
    }

    @Override
    public boolean F0(l.k kVar, MenuItem menuItem) {
        switch (this.f14322a) {
            case 12:
                m.l lVar = ((ActionMenuView) this.f14323b).P;
                if (lVar != null) {
                    Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((gf.g) lVar).f13889b).W.f46528c).iterator();
                    while (it.hasNext()) {
                        if (((androidx.fragment.app.a0) it.next()).f2363a.p()) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                ((Toolbar) this.f14323b).getClass();
                return false;
        }
    }

    @Override
    public void H0() {
        a3.s sVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.f14323b;
        synchronized (ffmpegAudioRenderer.f17756a) {
            sVar = ffmpegAudioRenderer.H;
        }
        if (sVar != null) {
            sVar.m();
        }
    }

    @Override
    public void I() {
        ((FfmpegAudioRenderer) this.f14323b).f2649f0 = true;
    }

    @Override
    public void I0(CharSequence charSequence) {
        n3 n3Var = ((li.x) this.f14323b).O;
        if (n3Var != null) {
            n3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                n3Var.f18728a.w4(charSequence.toString());
            }
        }
    }

    @Override
    public boolean J0(long j3) {
        return false;
    }

    @Override
    public boolean J1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        li.b2 b2Var = (li.b2) this.f14323b;
        b2Var.x0(i7, i10, z9);
        bg0 bg0Var = b2Var.O0;
        if (bg0Var != null) {
            bg0Var.h();
            b2Var.O0 = null;
        }
    }

    @Override
    public void L1() {
        li.x xVar = (li.x) this.f14323b;
        n3 n3Var = xVar.O;
        if (n3Var != null) {
            li.a aVar = xVar.f18986a;
            t3.S1(n3Var.f18728a);
        }
    }

    @Override
    public void M0(b3.l lVar, long j3, long j10, int i7) {
        x2.u uVar;
        b3.r rVar = (b3.r) lVar;
        o2.h hVar = (o2.h) this.f14323b;
        if (i7 == 0) {
            long j11 = rVar.f2965a;
            uVar = new x2.u(rVar.f2966b, j3);
        } else {
            long j12 = rVar.f2965a;
            j2.m mVar = rVar.f2966b;
            j2.c0 c0Var = rVar.d;
            uVar = new x2.u(mVar, c0Var.f16414c, c0Var.d, j3, j10, c0Var.f16413b);
        }
        hVar.f20745q.t(uVar, rVar.f2967c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i7);
    }

    public long M1(TimeUnit timeUnit) {
        return timeUnit.convert(((org.telegram.messenger.l0) this.f14323b).f23813c, TimeUnit.SECONDS);
    }

    @Override
    public fr0 N1() {
        return null;
    }

    @Override
    public void O(ImageReceiver imageReceiver) {
        ((ru) this.f14323b).t0(true);
    }

    @Override
    public boolean O0(org.telegram.ui.Cells.q1 q1Var, boolean z9) {
        return false;
    }

    @Override
    public void O1(long j3, int i7, long j10) {
        j2.n nVar = ((FfmpegAudioRenderer) this.f14323b).I;
        Handler handler = (Handler) nVar.f16453b;
        if (handler != null) {
            handler.post(new b3.b(nVar, i7, j3, j10, 1));
        }
    }

    @Override
    public boolean Q(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z9) {
        return false;
    }

    @Override
    public boolean Q1(long j3) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public Paint.FontMetricsInt R0() {
        return ((di) this.f14323b).f33008y2.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public void R1(org.telegram.ui.Cells.q1 q1Var, int i7, float f10, float f11, boolean z9) {
        z9 z9Var = (z9) this.f14323b;
        org.telegram.ui.Cells.f fVar = z9Var.D;
        if (z9Var.a()) {
            z9Var.f30998y = 0;
            q1Var.invalidate();
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.i3(fVar, 5000L);
        }
    }

    @Override
    public boolean S(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public h9 S0() {
        return (li.x) this.f14323b;
    }

    @Override
    public boolean S1(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean T() {
        return false;
    }

    public m1.e1 T1() {
        ce.w wVar = (ce.w) this.f14323b;
        wVar.getClass();
        Object obj = ce.w.f6154e.get(wVar);
        if (obj == de.g.f8679a) {
            obj = null;
        }
        return (m1.e1) obj;
    }

    @Override
    public void U0(Exception exc) {
        h2.a.d("DecoderAudioRenderer", "Audio sink error", exc);
        j2.n nVar = ((FfmpegAudioRenderer) this.f14323b).I;
        Handler handler = (Handler) nVar.f16453b;
        if (handler != null) {
            handler.post(new n2.p(nVar, exc, 1));
        }
    }

    @Override
    public li.a V0() {
        return ((li.x) this.f14323b).f18986a;
    }

    public JSONObject V1() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f14323b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(aa.g.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        aa.g.b(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    aa.g.b(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            aa.g.b(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            aa.g.b(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override
    public boolean W0(ij ijVar) {
        return org.telegram.ui.Cells.f1.a(ijVar);
    }

    @Override
    public int X() {
        return 0;
    }

    @Override
    public a0.h X0() {
        return null;
    }

    public void X1() {
        f1 f1Var = (f1) this.f14323b;
        f1Var.getClass();
        try {
            l8.b bVar = (l8.b) f1Var.f14323b;
            Parcel P0 = bVar.P0();
            int i7 = v7.b.f57154a;
            P0.writeInt(0);
            bVar.T0(P0, 2);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public void Y(n2.r0 r0Var) {
        j2.n nVar = ((FfmpegAudioRenderer) this.f14323b).I;
        Handler handler = (Handler) nVar.f16453b;
        if (handler != null) {
            handler.post(new n2.r(nVar, r0Var, 1));
        }
    }

    @Override
    public void Y0() {
        ((b9) this.f14323b).f32110a.invalidate();
    }

    public void Y1() {
        ((v2) this.f14323b).f28639o0 = false;
    }

    @Override
    public jh.a Z() {
        return null;
    }

    public void Z1() {
        f1 f1Var = (f1) this.f14323b;
        f1Var.getClass();
        try {
            l8.b bVar = (l8.b) f1Var.f14323b;
            Parcel P0 = bVar.P0();
            int i7 = v7.b.f57154a;
            P0.writeInt(0);
            bVar.T0(P0, 3);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public boolean a0(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override
    public boolean a1() {
        li.x xVar = (li.x) this.f14323b;
        n3 n3Var = xVar.O;
        if (n3Var != null) {
            li.a aVar = xVar.f18986a;
            if (n3Var.f18728a.V4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void a2(ee eeVar) {
        ((v2) this.f14323b).H0 = eeVar;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f14322a) {
            case 2:
                j6.q qVar = new j6.q(1, (TaskCompletionSource) obj2);
                j6.i iVar = (j6.i) ((j6.s) obj).n();
                Parcel P0 = iVar.P0();
                com.google.android.gms.internal.cast.t.d(P0, qVar);
                P0.writeStringArray((String[]) this.f14323b);
                iVar.U0(P0, 6);
                return;
            case 3:
            default:
                d6.l lVar = new d6.l((TaskCompletionSource) obj2);
                l7.i iVar2 = (l7.i) ((l7.c) obj).n();
                Parcel L0 = iVar2.L0();
                int i7 = l7.f.f18199a;
                L0.writeStrongBinder(lVar);
                l7.f.c(L0, (a6.e) this.f14323b);
                iVar2.M0(L0, 1);
                return;
            case 4:
                k7.f fVar = new k7.f(0, (TaskCompletionSource) obj2);
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true), false);
                gVar.f6538c = false;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i10 = t7.a.f55357a;
                obtain.writeStrongBinder(fVar);
                t7.a.b(obtain, (j7.g) this.f14323b);
                t7.a.b(obtain, gVar);
                ((k7.b) ((k7.d) ((k7.e) obj).n())).H0(obtain, 6);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        h1 h1Var = (h1) this.f14323b;
        h1Var.getClass();
        entry.getClass();
        return new e1(entry, h1Var);
    }

    @Override
    public void b(li.g1 g1Var) {
        switch (this.f14322a) {
            case 9:
                n3 n3Var = ((li.x) this.f14323b).O;
                if (n3Var != null) {
                    t3 t3Var = n3Var.f18728a;
                    t3.Q1(t3Var, g1Var);
                    t3Var.f18887o3.r(g1Var, true);
                    return;
                }
                return;
            default:
                c5 c5Var = ((e5) this.f14323b).f18537s;
                if (c5Var != null) {
                    t3 t3Var2 = ((z2) c5Var).f19043a;
                    t3.Q1(t3Var2, g1Var);
                    t3Var2.f18887o3.r(g1Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean b0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean b2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public void c(int i7) {
        j2.n nVar = ((FfmpegAudioRenderer) this.f14323b).I;
        Handler handler = (Handler) nVar.f16453b;
        if (handler != null) {
            handler.post(new bg.m0(nVar, i7, 15));
        }
    }

    @Override
    public void c0(l.k kVar, MenuItem menuItem) {
        ((l.e) this.f14323b).f17648f.removeCallbacksAndMessages(kVar);
    }

    @Override
    public void c1() {
        ((FfmpegAudioRenderer) this.f14323b).Z = true;
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f14323b;
        if (contentProviderClient != null) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                f4.e((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override
    public boolean d() {
        return ((z9) this.f14323b).a();
    }

    @Override
    public void d1(int i7, int i10) {
        li.x xVar = (li.x) this.f14323b;
        n3 n3Var = xVar.O;
        if (n3Var != null) {
            li.a aVar = xVar.f18986a;
            li.f2 f2Var = n3Var.f18728a.Q3;
            if (f2Var != null) {
                f2Var.f(i7, i10);
            }
        }
    }

    public void d2() {
        f1 f1Var = (f1) this.f14323b;
        f1Var.getClass();
        try {
            l8.b bVar = (l8.b) f1Var.f14323b;
            Parcel P0 = bVar.P0();
            int i7 = v7.b.f57154a;
            P0.writeInt(0);
            bVar.T0(P0, 1);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public void e(long j3) {
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.f14323b;
        ffmpegAudioRenderer.f2650g0 = true;
        j2.n nVar = ffmpegAudioRenderer.I;
        Handler handler = (Handler) nVar.f16453b;
        if (handler != null) {
            handler.post(new r3(nVar, j3, 15));
        }
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public void f(boolean z9) {
        j2.n nVar = ((FfmpegAudioRenderer) this.f14323b).I;
        Handler handler = (Handler) nVar.f16453b;
        if (handler != null) {
            handler.post(new bi.k1(12, nVar, z9));
        }
    }

    @Override
    public void f1(Editable editable) {
        ((e5) this.f14323b).g();
    }

    @Override
    public boolean g() {
        return true;
    }

    @Override
    public void g1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        z9 z9Var = (z9) this.f14323b;
        org.telegram.ui.Cells.f fVar = z9Var.D;
        if (z9Var.a()) {
            z9Var.f30998y = 2;
            q1Var.invalidate();
            org.telegram.messenger.g0.r(fVar);
            org.telegram.messenger.g0.i3(fVar, 5000L);
        }
    }

    @Override
    public boolean g2(int i7) {
        return false;
    }

    @Override
    public String h(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override
    public int h0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override
    public void h1(l.k kVar, l.m mVar) {
        l.e eVar = (l.e) this.f14323b;
        Handler handler = eVar.f17648f;
        l.d dVar = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.f17649n;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                if (kVar == ((l.d) arrayList.get(i7)).f17642b) {
                    break;
                }
                i7++;
            } else {
                i7 = -1;
                break;
            }
        }
        if (i7 == -1) {
            return;
        }
        int i10 = i7 + 1;
        if (i10 < arrayList.size()) {
            dVar = (l.d) arrayList.get(i10);
        }
        handler.postAtTime(new pa(this, dVar, mVar, kVar, false, 3), kVar, SystemClock.uptimeMillis() + 200);
    }

    public void h2(m1.e1 r7) {
        throw new UnsupportedOperationException("Method not decompiled: h9.f1.h2(m1.e1):void");
    }

    @Override
    public void i(n2.r0 r0Var) {
        j2.n nVar = ((FfmpegAudioRenderer) this.f14323b).I;
        Handler handler = (Handler) nVar.f16453b;
        if (handler != null) {
            handler.post(new n2.r(nVar, r0Var, 0));
        }
    }

    @Override
    public void i1() {
        li.x xVar = (li.x) this.f14323b;
        n3 n3Var = xVar.O;
        if (n3Var != null) {
            li.a aVar = xVar.f18986a;
            t3 t3Var = n3Var.f18728a;
            li.f2 f2Var = t3Var.Q3;
            if (f2Var != null) {
                f2Var.g();
            }
            t3Var.f18887o3.onContentChanged();
        }
    }

    @Override
    public void invalidate() {
        ((org.telegram.ui.Cells.q1) ((org.telegram.ui.Cells.j1) this.f14323b).f29346b).invalidate();
    }

    @Override
    public void j0(l.k kVar) {
        switch (this.f14322a) {
            case 12:
                f1 f1Var = ((ActionMenuView) this.f14323b).K;
                if (f1Var != null) {
                    f1Var.j0(kVar);
                    return;
                }
                return;
            default:
                Toolbar toolbar = (Toolbar) this.f14323b;
                m.i iVar = toolbar.f1973a.J;
                if (iVar == null || !iVar.g()) {
                    Iterator it = ((CopyOnWriteArrayList) toolbar.W.f46528c).iterator();
                    while (it.hasNext()) {
                        ((androidx.fragment.app.a0) it.next()).f2363a.t();
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public boolean k0() {
        return d();
    }

    @Override
    public boolean k1(int i7) {
        return true;
    }

    @Override
    public j9 k2() {
        return null;
    }

    @Override
    public void l0(li.g1 g1Var, int i7, int i10) {
        c5 c5Var;
        i9 textSelectionHelper;
        e5 e5Var = (e5) this.f14323b;
        if (!e5Var.f18539x && i7 != i10 && (c5Var = e5Var.f18537s) != null && (textSelectionHelper = ((z2) c5Var).f19043a.getTextSelectionHelper()) != null) {
            g1Var.post(new j4(this, g1Var, i10, textSelectionHelper, i7, 3));
        }
    }

    @Override
    public boolean l1(boolean z9) {
        return false;
    }

    @Override
    public boolean m() {
        return false;
    }

    @Override
    public void m1(ArrayList arrayList) {
        jg.i1 i1Var = (jg.i1) this.f14323b;
        String str = i1Var.Z;
        if (str != null) {
            i1Var.U(str, i1Var.f16774c0, i1Var.f16775d0, i1Var.f16772b0, i1Var.f16771a0);
        }
    }

    @Override
    public boolean n0(r5 r5Var) {
        return false;
    }

    @Override
    public boolean n1() {
        return false;
    }

    @Override
    public b3.i o0(b3.l lVar, long j3, long j10, IOException iOException, int i7) {
        long min;
        b3.i iVar;
        b3.r rVar = (b3.r) lVar;
        o2.h hVar = (o2.h) this.f14323b;
        long j11 = rVar.f2965a;
        j2.m mVar = rVar.f2966b;
        j2.c0 c0Var = rVar.d;
        x2.u uVar = new x2.u(mVar, c0Var.f16414c, c0Var.d, j3, j10, c0Var.f16413b);
        int i10 = rVar.f2967c;
        hVar.f20741m.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof e2.t0) || (th2 instanceof FileNotFoundException) || (th2 instanceof j2.v) || (th2 instanceof b3.n) || ((th2 instanceof j2.j) && ((j2.j) th2).f16434a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i7 - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            iVar = b3.o.f2961f;
        } else {
            iVar = new b3.i(0, min, false);
        }
        hVar.f20745q.r(uVar, i10, iOException, !iVar.a());
        return iVar;
    }

    @Override
    public void o1(b3.l lVar, long j3, long j10) {
        int size;
        long j11;
        b3.r rVar = (b3.r) lVar;
        o2.h hVar = (o2.h) this.f14323b;
        long j12 = rVar.f2965a;
        j2.m mVar = rVar.f2966b;
        j2.c0 c0Var = rVar.d;
        x2.u uVar = new x2.u(mVar, c0Var.f16414c, c0Var.d, j3, j10, c0Var.f16413b);
        hVar.f20741m.getClass();
        hVar.f20745q.p(uVar, rVar.f2967c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        p2.c cVar = (p2.c) rVar.f2969f;
        p2.c cVar2 = hVar.G;
        if (cVar2 == null) {
            size = 0;
        } else {
            size = cVar2.f53014m.size();
        }
        long j13 = cVar.b(0).f53033b;
        int i7 = 0;
        while (i7 < size && hVar.G.b(i7).f53033b < j13) {
            i7++;
        }
        if (cVar.d) {
            if (size - i7 > cVar.f53014m.size()) {
                h2.a.l("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j14 = hVar.M;
                j11 = -9223372036854775807L;
                if (j14 != -9223372036854775807L && cVar.h * 1000 <= j14) {
                    h2.a.l("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + hVar.M);
                } else {
                    hVar.L = 0;
                }
            }
            int i10 = hVar.L;
            hVar.L = i10 + 1;
            if (i10 < hVar.f20741m.X0(rVar.f2967c)) {
                hVar.D.postDelayed(hVar.v, Math.min((hVar.L - 1) * 1000, 5000));
                return;
            }
            hVar.C = new IOException();
            return;
        }
        j11 = -9223372036854775807L;
        hVar.G = cVar;
        hVar.H = cVar.d & hVar.H;
        hVar.I = j3 - j10;
        hVar.J = j3;
        hVar.N += i7;
        synchronized (hVar.f20748t) {
            try {
                if (rVar.f2966b.f16446a.equals(hVar.E)) {
                    Uri uri = hVar.G.f53012k;
                    if (uri == null) {
                        uri = f7.a(rVar.d.f16414c);
                    }
                    hVar.E = uri;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        p2.c cVar3 = hVar.G;
        if (cVar3.d && hVar.K == j11) {
            m6 m6Var = cVar3.f53010i;
            if (m6Var != null) {
                String str = m6Var.f23985b;
                if (!Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
                    if (!Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                        if (!Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                            if (!Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                hVar.y(new IOException("Unsupported UTC timing scheme"));
                                return;
                            } else {
                                hVar.w();
                                return;
                            }
                        }
                        hVar.A(m6Var, new qb.a(16));
                        return;
                    }
                    hVar.A(m6Var, new Object());
                    return;
                }
                try {
                    hVar.K = h2.m0.V(m6Var.f23986c) - hVar.J;
                    hVar.z(true);
                    return;
                } catch (e2.t0 e10) {
                    hVar.y(e10);
                    return;
                }
            }
            hVar.w();
            return;
        }
        hVar.z(true);
    }

    @Override
    public boolean p1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        if (i7 == ((z9) this.f14323b).f30998y) {
            return true;
        }
        return false;
    }

    @Override
    public void q(int i7) {
        ((jg.i1) this.f14323b).f();
    }

    @Override
    public void q0(b3.l lVar, long j3, long j10, boolean z9) {
        ((o2.h) this.f14323b).x((b3.r) lVar, j3, j10);
    }

    @Override
    public boolean s(li.g1 g1Var) {
        return false;
    }

    @Override
    public void t() {
        li.x xVar = (li.x) this.f14323b;
        n3 n3Var = xVar.O;
        if (n3Var != null) {
            t3.T1(n3Var.f18728a, xVar.f18986a);
        }
    }

    @Override
    public boolean u1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public a0.h v0() {
        return null;
    }

    @Override
    public i9 w0() {
        n3 n3Var = ((li.x) this.f14323b).O;
        if (n3Var != null) {
            return n3Var.f18728a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public boolean w1() {
        return false;
    }

    @Override
    public boolean x0(ij ijVar) {
        return true;
    }

    @Override
    public String y(long j3) {
        return null;
    }

    @Override
    public void z1(int i7, int i10, CharSequence charSequence, boolean z9) {
        di diVar = (di) this.f14323b;
        if (diVar.a1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(diVar.a1().getText());
            spannableStringBuilder.replace(i7, i10 + i7, charSequence);
            if (z9) {
                i6.l(spannableStringBuilder, diVar.a1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            diVar.a1().setText(spannableStringBuilder);
            diVar.a1().setSelection(i7 + charSequence.length());
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public f1(com.google.android.gms.common.api.j jVar, Object obj, int i7) {
        this.f14322a = i7;
        this.f14323b = obj;
    }

    public f1(Object obj, int i7) {
        this.f14322a = i7;
        this.f14323b = obj;
    }

    public f1(int i7) {
        this.f14322a = i7;
        switch (i7) {
            case 19:
                this.f14323b = new Object();
                return;
            case 20:
                this.f14323b = new org.telegram.messenger.m0();
                return;
            default:
                this.f14323b = new ce.w(m1.f1.f19374b);
                return;
        }
    }

    public f1(ga.d dVar) {
        this.f14322a = 1;
        this.f14323b = new File((File) dVar.d, "com.crashlytics.settings.json");
    }

    public f1(Context context, Uri uri) {
        this.f14322a = 17;
        this.f14323b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public f1(String str, long j3) {
        this.f14322a = 21;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f14323b = new org.telegram.messenger.l0(str, j3);
    }

    public f1(Context context, f6 f6Var) {
        this.f14322a = 25;
        v2 v2Var = new v2(1, context, f6Var, false);
        this.f14323b = v2Var;
        v2Var.N();
    }

    @Override
    public void D() {
    }

    @Override
    public void F1() {
    }

    @Override
    public void W() {
    }

    @Override
    public void Z0() {
    }

    @Override
    public void a() {
    }

    @Override
    public void e2() {
    }

    @Override
    public void i2() {
    }

    @Override
    public void k() {
    }

    @Override
    public void p() {
    }

    @Override
    public void r0() {
    }

    @Override
    public void t1() {
    }

    @Override
    public void u() {
    }

    @Override
    public void z0() {
    }

    @Override
    public void A1(ij ijVar) {
    }

    @Override
    public void C(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void D0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void G0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void G1(String str) {
    }

    @Override
    public void H(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void J(fj fjVar) {
    }

    @Override
    public void K0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void N(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void P(ij ijVar) {
    }

    @Override
    public void P0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void Q0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void T0(CharSequence charSequence) {
    }

    @Override
    public void U1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void V(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void c2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void d0(int i7) {
    }

    @Override
    public void i0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void l(boolean z9) {
    }

    @Override
    public void m0(String str) {
    }

    @Override
    public void o(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void r(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void r1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void v(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void x(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void y0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void y1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void z(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override
    public void G(org.telegram.ui.Cells.q1 q1Var, o2 o2Var) {
    }

    @Override
    public void H1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void K1(org.telegram.ui.Cells.q1 q1Var, o10 o10Var) {
    }

    @Override
    public void L0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void P1(String str, String str2) {
    }

    @Override
    public void W1(org.telegram.ui.Cells.q1 q1Var, long j3) {
    }

    @Override
    public void b1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void s1(org.telegram.ui.Cells.q1 q1Var, boolean z9) {
    }

    @Override
    public void t0(int i7, Drawable drawable) {
    }

    @Override
    public void v1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void w(int i7, int i10) {
    }

    @Override
    public void x1(org.telegram.ui.Cells.q1 q1Var, int i7) {
    }

    @Override
    public void A0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z9) {
    }

    @Override
    public void B0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public void E0(org.telegram.ui.Cells.q1 q1Var, boolean z9, boolean z10) {
    }

    @Override
    public void K(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public void M(TLRPC.BotInlineResult botInlineResult, boolean z9, int i7) {
    }

    @Override
    public void N0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z9) {
    }

    @Override
    public void e1(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void g0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public void j1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public void j2(org.telegram.ui.Cells.q1 q1Var, int i7, int i10) {
    }

    @Override
    public void p0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override
    public void q1(org.telegram.ui.Cells.q1 q1Var, boolean z9, boolean z10) {
    }

    @Override
    public void I1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
    }

    @Override
    public void n(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public void s0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void u0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11, boolean z9) {
    }

    @Override
    public void f2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
    }

    @Override
    public void j(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override
    public void U(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
    }
}

package ji;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.ga;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.jr0;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.x20;
import org.telegram.ui.Components.y20;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.r8;
import org.telegram.ui.at0;
import org.telegram.ui.wv0;
import v7.i8;
public class h5 implements g1, y2.m, OnCompleteListener, m.x0, n5.b, o0.a, u2.e1, org.telegram.ui.Cells.l1, bh.h, mg.e, e81, hg.z1, com.google.android.gms.common.api.internal.s, r2.m, com.google.android.gms.common.api.internal.o, rg.x1, s4.h1 {
    public final int f13311a;
    public Object f13312b;

    public h5(Object obj, int i10) {
        this.f13311a = i10;
        this.f13312b = obj;
    }

    @Override
    public void B0(float f7) {
        rg.y0 y0Var = (rg.y0) this.f13312b;
        qg.s0.e(y0Var.f44607a).k("-1", f7);
        y0Var.e.setBrushSize(f7);
    }

    @Override
    public boolean B1() {
        return false;
    }

    @Override
    public boolean C(h1 h1Var) {
        return false;
    }

    @Override
    public int D() {
        return ((s4.n0) this.f13312b).G();
    }

    @Override
    public View D0(int i10) {
        return ((s4.n0) this.f13312b).q(i10);
    }

    @Override
    public boolean F0(boolean z10) {
        return false;
    }

    @Override
    public void G(u2.f1 f1Var) {
        o2.q qVar = (o2.q) f1Var;
        o2.k kVar = (o2.k) this.f13312b;
        kVar.G.G(kVar);
    }

    @Override
    public void G1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.s(u1Var.getContext(), str);
    }

    @Override
    public void H() {
        ((tf0) this.f13312b).f29369b.o();
    }

    @Override
    public CharacterStyle H1(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override
    public void I0(ArrayList arrayList) {
        int i10 = this.f13311a;
    }

    @Override
    public void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ga gaVar = (ga) this.f13312b;
        org.telegram.ui.Cells.g gVar = gaVar.v;
        if (gaVar.a()) {
            gaVar.f21248s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public boolean J0(long j10) {
        return false;
    }

    @Override
    public boolean J1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public a0.h K() {
        switch (this.f13311a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public int L0(View view) {
        return s4.n0.v(view) + ((ViewGroup.MarginLayoutParams) ((s4.o0) view.getLayoutParams())).bottomMargin;
    }

    @Override
    public void M0(int i10, org.telegram.ui.Cells.u1 u1Var) {
        ga gaVar = (ga) this.f13312b;
        org.telegram.ui.Cells.g gVar = gaVar.v;
        if (gaVar.a()) {
            gaVar.f21248s = 2;
            u1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public void N0() {
        ((tf0) this.f13312b).f29369b.k();
    }

    @Override
    public boolean O(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean O1(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public void P0(float f7) {
        tf0 tf0Var = (tf0) this.f13312b;
        tf0Var.f29369b.setRotation(f7);
        tf0Var.getClass();
        sf0 sf0Var = tf0Var.f29368a;
        if (sf0Var != null) {
            ((at0) sf0Var).a(false);
        }
    }

    @Override
    public wv0 P1() {
        return null;
    }

    @Override
    public boolean Q(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    public void Q0() {
        qg.a1 a1Var = ((qg.c1) this.f13312b).d;
        if (a1Var != null) {
            qg.z0 z0Var = a1Var.f43386s;
            if (z0Var != null) {
                a1Var.cancelRunnable(z0Var);
                a1Var.f43386s = null;
            }
            qg.z0 z0Var2 = new qg.z0(a1Var, 1);
            a1Var.f43386s = z0Var2;
            a1Var.postRunnable(z0Var2, 1L);
        }
    }

    @Override
    public boolean Q1(long j10) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public void R1(org.telegram.ui.Cells.u1 u1Var, int i10, float f7, float f10, boolean z10) {
        ga gaVar = (ga) this.f13312b;
        org.telegram.ui.Cells.g gVar = gaVar.v;
        if (gaVar.a()) {
            gaVar.f21248s = 0;
            u1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public boolean S0(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean S1(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public void U(h1 h1Var, int i10, int i11) {
        j5 j5Var;
        o9 textSelectionHelper;
        l5 l5Var = (l5) this.f13312b;
        if (!l5Var.f13393w && i10 != i11 && (j5Var = l5Var.f13392s) != null && (textSelectionHelper = ((c3) j5Var).f13172a.getTextSelectionHelper()) != null) {
            h1Var.post(new fi.x4(this, h1Var, i11, textSelectionHelper, i10, 3));
        }
    }

    public void U0() {
        o2.q[] qVarArr;
        o2.q[] qVarArr2;
        o2.k kVar = (o2.k) this.f13312b;
        int i10 = kVar.H - 1;
        kVar.H = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (o2.q qVar : kVar.J) {
            qVar.e();
            i11 += qVar.Y.f46033a;
        }
        b2.q1[] q1VarArr = new b2.q1[i11];
        int i12 = 0;
        for (o2.q qVar2 : kVar.J) {
            qVar2.e();
            int i13 = qVar2.Y.f46033a;
            int i14 = 0;
            while (i14 < i13) {
                qVar2.e();
                q1VarArr[i12] = qVar2.Y.a(i14);
                i14++;
                i12++;
            }
        }
        kVar.I = new u2.r1(q1VarArr);
        kVar.G.y(kVar);
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public Cursor X(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f13312b;
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

    @Override
    public ih.a Y() {
        return null;
    }

    public boolean Y0(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: ji.h5.Y0(android.view.MotionEvent):boolean");
    }

    @Override
    public boolean Z(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override
    public boolean Z0(int i10, org.telegram.ui.Cells.u1 u1Var) {
        if (i10 == ((ga) this.f13312b).f21248s) {
            return true;
        }
        return false;
    }

    @Override
    public void a(h1 h1Var) {
        j5 j5Var = ((l5) this.f13312b).f13392s;
        if (j5Var != null) {
            x3 x3Var = ((c3) j5Var).f13172a;
            x3.N1(x3Var, h1Var);
            x3Var.f13627f3.c0(h1Var, true);
        }
    }

    @Override
    public void a0() {
        ((tf0) this.f13312b).f29369b.f15824a.g(1, true);
    }

    public void a1(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.f13312b;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f13311a) {
            case 19:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                p6.a aVar = (p6.a) ((p6.c) obj).u();
                Parcel H0 = aVar.H0();
                k7.a.c(H0, (n6.p) this.f13312b);
                try {
                    aVar.f315b.transact(1, H0, null, 1);
                    H0.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    H0.recycle();
                    throw th2;
                }
            default:
                s6.f fVar = new s6.f(1, (TaskCompletionSource) obj2);
                s6.e eVar = (s6.e) ((s6.h) obj).u();
                Parcel H02 = eVar.H0();
                k7.a.d(H02, fVar);
                k7.a.c(H02, (s6.a) this.f13312b);
                H02.writeStrongBinder(null);
                eVar.I0(H02, 2);
                return;
        }
    }

    @Override
    public void b(long j10, int i10, int i11, int i12) {
        ((MediaCodec) this.f13312b).queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override
    public int b0() {
        s4.n0 n0Var = (s4.n0) this.f13312b;
        return n0Var.f44940n - n0Var.C();
    }

    public void b1() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f13312b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int size = arrayDeque.size();
        long e12 = e1();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + e12);
    }

    @Override
    public boolean b2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean c() {
        return ((ga) this.f13312b).a();
    }

    @Override
    public boolean c0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        return false;
    }

    public void c1(long j10) {
        long e12 = e1();
        if (e12 != j10) {
            if (e12 != -1) {
                if (e12 == -2) {
                    e12 = -2;
                } else {
                    return;
                }
            }
            StringBuilder t10 = a1.g.t(j10, "expected non-string scope or scope ", " but found ");
            t10.append(e12);
            throw new IOException(t10.toString());
        }
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f13312b;
        if (contentProviderClient != null) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                com.google.android.gms.internal.cast.i4.h((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override
    public void d() {
        l2.h hVar = (l2.h) this.f13312b;
        hVar.A.d();
        IOException iOException = hVar.C;
        if (iOException == null) {
            return;
        }
        throw iOException;
    }

    @Override
    public boolean d1(MessageObject messageObject) {
        return org.telegram.ui.Cells.d0.a(messageObject);
    }

    @Override
    public void e(int i10, h2.d dVar, long j10, int i11) {
        ((MediaCodec) this.f13312b).queueSecureInputBuffer(i10, 0, dVar.f10322i, j10, i11);
    }

    @Override
    public boolean e0() {
        return false;
    }

    public long e1() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f13312b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public String g(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override
    public Object mo27get() {
        return new li.k((Context) ((n5.c) this.f13312b).f16057a, new rb.b(24), new pb.a(24), 4);
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public int h0(org.telegram.ui.Cells.u1 u1Var) {
        return 0;
    }

    @Override
    public a0.h j0() {
        switch (this.f13311a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void k(int i10) {
        switch (this.f13311a) {
            case 16:
                fr0 fr0Var = (fr0) this.f13312b;
                jr0 jr0Var = fr0Var.K;
                fr0Var.f25113s = i10;
                if (fr0Var.v != i10) {
                    fr0Var.d.clear();
                }
                int i11 = fr0Var.J;
                if (fr0Var.h() == 0 && !fr0Var.e.e() && !fr0Var.I) {
                    jr0Var.Q.e(false, true);
                } else {
                    jr0Var.f26487x0.b(i11);
                }
                fr0Var.l();
                int i12 = jr0.f26456a1;
                jr0Var.L0(true);
                return;
            default:
                r8 r8Var = (r8) this.f13312b;
                if (!r8Var.f33662n && i10 == r8Var.I) {
                    r8Var.d0(r8Var.M.getText().toString().trim());
                    return;
                }
                return;
        }
    }

    @Override
    public boolean k0() {
        sf0 sf0Var = ((tf0) this.f13312b).f29368a;
        if (sf0Var == null) {
            return false;
        }
        PhotoViewer photoViewer = ((at0) sf0Var).f34338a;
        Drawable[] drawableArr = PhotoViewer.U8;
        return photoViewer.O0(-90.0f, false, null);
    }

    @Override
    public boolean l(h1 h1Var) {
        return false;
    }

    @Override
    public boolean l0() {
        return c();
    }

    @Override
    public boolean l2(int i10) {
        return false;
    }

    @Override
    public void m0(bh.a aVar) {
        aVar.a(((vi) this.f13312b).getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public boolean o0(org.telegram.ui.Components.b6 b6Var) {
        return false;
    }

    @Override
    public void onComplete(Task task) {
        be.m mVar = (be.m) this.f13312b;
        Exception exception = task.getException();
        if (exception == null) {
            if (task.isCanceled()) {
                mVar.n(null);
                return;
            } else {
                mVar.resumeWith(task.getResult());
                return;
            }
        }
        mVar.resumeWith(i8.a(exception));
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        hl0 hl0Var = (hl0) this.f13312b;
        if (z10 && hl0Var.f25704n.n() >= 0) {
            hl0Var.f25707w = true;
        }
        gh0 gh0Var = hl0Var.f25703f;
        yc0 yc0Var = hl0Var.f25708x;
        gh0Var.a(z10, true);
        AndroidUtilities.cancelRunOnUIThread(yc0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(yc0Var, 16L);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void p0(h1 h1Var) {
        a aVar;
        l5 l5Var = (l5) this.f13312b;
        j5 j5Var = l5Var.f13392s;
        if (j5Var != null && (aVar = l5Var.f13119a) != null) {
            x3 x3Var = ((c3) j5Var).f13172a;
            ArrayList arrayList = x3Var.f13635j3;
            long j10 = aVar.f13118t;
            if (j10 != 0) {
                int i10 = -1;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (((a) arrayList.get(i11)).f13109k.contains(Long.valueOf(j10))) {
                        i10 = i11;
                    }
                }
                if (i10 >= 0) {
                    h2 h2Var = x3Var.H3;
                    if (h2Var != null) {
                        h2Var.d();
                    }
                    a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                    ArrayList arrayList2 = aVar.f13109k;
                    ArrayList arrayList3 = aVar2.f13109k;
                    arrayList3.addAll(arrayList2);
                    if (!arrayList3.isEmpty()) {
                        a1.g.y(1, arrayList3);
                    }
                    arrayList.add(i10 + 1, aVar2);
                    x3Var.t4();
                    x3Var.W2.N(false);
                    h2 h2Var2 = x3Var.H3;
                    if (h2Var2 != null) {
                        h2Var2.h();
                    }
                    x3Var.post(new o2(x3Var, aVar2, 26));
                }
            }
        }
    }

    @Override
    public p9 p2() {
        return null;
    }

    @Override
    public int q(View view) {
        return s4.n0.z(view) - ((ViewGroup.MarginLayoutParams) ((s4.o0) view.getLayoutParams())).topMargin;
    }

    @Override
    public void s0(Editable editable) {
        ((l5) this.f13312b).h();
    }

    @Override
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.f13312b).setParameters(bundle);
    }

    @Override
    public boolean t0(int i10) {
        switch (this.f13311a) {
            case 16:
                if (i10 == ((fr0) this.f13312b).f25112r) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    @Override
    public void v(Canvas canvas) {
        vi viVar = (vi) this.f13312b;
        canvas.drawColor(viVar.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
        if (SharedConfig.chatBlurEnabled()) {
            viVar.F2.b(canvas, -2);
        }
    }

    @Override
    public boolean v1() {
        return false;
    }

    @Override
    public String w(long j10) {
        return null;
    }

    @Override
    public boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override
    public boolean x() {
        sf0 sf0Var = ((tf0) this.f13312b).f29368a;
        if (sf0Var != null) {
            PhotoViewer photoViewer = ((at0) sf0Var).f34338a;
            Drawable[] drawableArr = PhotoViewer.U8;
            return photoViewer.N0();
        }
        return false;
    }

    @Override
    public void z(Object obj) {
        ((g8.c) obj).onLocationAvailability((LocationAvailability) this.f13312b);
    }

    @Override
    public boolean z1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    public h5(s6.g gVar, s6.a aVar) {
        this.f13311a = 27;
        this.f13312b = aVar;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public h5(int i10) {
        this.f13311a = i10;
        switch (i10) {
            case 28:
                return;
            default:
                this.f13312b = new ArrayDeque(16);
                return;
        }
    }

    public h5(ArrayList arrayList) {
        this.f13311a = 24;
        this.f13312b = DesugarCollections.unmodifiableList(arrayList);
    }

    public h5(Context context, Uri uri) {
        this.f13311a = 9;
        this.f13312b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public h5(Context context, y20 y20Var) {
        this.f13311a = 13;
        this.f13312b = new x20(context, y20Var);
    }

    @Override
    public float get() {
        rg.y0 y0Var = (rg.y0) this.f13312b;
        int i10 = y0Var.f44607a;
        qg.m currentBrush = y0Var.e.getCurrentBrush();
        if (currentBrush == null) {
            return qg.s0.e(i10).f43570i;
        }
        return qg.s0.e(i10).f("-1", currentBrush.d());
    }

    @Override
    public void L1() {
    }

    @Override
    public void W() {
    }

    @Override
    public void f1() {
    }

    @Override
    public void flush() {
    }

    @Override
    public void g2() {
    }

    @Override
    public void j() {
    }

    @Override
    public void n2() {
    }

    @Override
    public void o() {
    }

    @Override
    public void r0() {
    }

    @Override
    public void s() {
    }

    @Override
    public void shutdown() {
    }

    @Override
    public void start() {
    }

    @Override
    public void y0() {
    }

    private final void W0(ArrayList arrayList) {
    }

    private final void X0(ArrayList arrayList) {
    }

    @Override
    public void A(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void B(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void C0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void D1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void E0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void F(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void F1(MessageObject messageObject) {
    }

    @Override
    public void G0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void H0(int i10) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void J(int i10) {
    }

    @Override
    public void K0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void L(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void T(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void T0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void U1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void V0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void c2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void d0(int i10) {
    }

    @Override
    public void g0(CharSequence charSequence) {
    }

    @Override
    public void i0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void n(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void n0(String str) {
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
    public void r(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void t(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void u(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void w1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void x0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void A1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void E(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void K1(org.telegram.ui.Cells.u1 u1Var, ah.t tVar) {
    }

    @Override
    public void M(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override
    public void M1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void O0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void W1(org.telegram.ui.Cells.u1 u1Var, long j10) {
    }

    @Override
    public void h1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void k1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
    }

    @Override
    public void onError(h81 h81Var, Exception exc) {
    }

    @Override
    public void p(int i10, int i11) {
    }

    @Override
    public void x1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
    }

    @Override
    public void A0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void R0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void f0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void o2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
    }

    @Override
    public void p1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void q0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override
    public void z0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void N1(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }

    @Override
    public void u0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void v0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void i(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void i2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void S(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }
}

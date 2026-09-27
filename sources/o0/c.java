package o0;

import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b2.l1;
import b2.q0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.k4;
import com.google.android.gms.tasks.TaskCompletionSource;
import e6.n;
import e9.a1;
import e9.g0;
import e9.i0;
import gg.b2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import o2.q;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.kq0;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.rq0;
import org.telegram.ui.Components.u71;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.x50;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.o9;
import org.telegram.ui.w9;
import pg.b1;
import r7.z;
import s4.f1;
import s4.h1;
import s4.o0;
import s4.p0;
import u2.c1;
import u2.d1;
import u2.o1;
import yh.r2;
import yh.x3;
import zg.u;
public class c implements b, c1, l71, d5, xa0, r71, b2, w9, s, h1, w2.a, kq0, rk0 {
    public final int f15521a;
    public Object f15522b;

    public c(Object obj, int i10) {
        this.f15521a = i10;
        this.f15522b = obj;
    }

    public static c E(float f7, int i10) {
        boolean z10;
        Point point = AndroidUtilities.displaySize;
        int i11 = (int) (point.x * f7);
        int i12 = (int) (point.y * f7);
        if (i11 == i12) {
            return new c(i11, i12, new int[0]);
        }
        if (i10 == 3) {
            return new c(i11, i12, new int[]{i12, i11});
        }
        boolean z11 = true;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 >= i12) {
            z11 = false;
        }
        if (z10 == z11) {
            return new c(i11, i12, new int[0]);
        }
        return new c(i12, i11, new int[0]);
    }

    public s0.d B(int i10) {
        return null;
    }

    @Override
    public int C(View view) {
        return o0.y(view) + ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).rightMargin;
    }

    public int D(long j3) {
        ArrayList arrayList = (ArrayList) this.f15522b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (j3 < ((z3.a) arrayList.get(i10)).f48398b) {
                return i10;
            }
        }
        return arrayList.size();
    }

    public void G(aa.a aVar) {
        h8.j jVar = (h8.j) this.f15522b;
        jVar.f10138a = aVar;
        Iterator it = jVar.f10140c.iterator();
        while (it.hasNext()) {
            ((x6.e) it.next()).b();
        }
        jVar.f10140c.clear();
        jVar.f10139b = null;
    }

    public void H() {
        q[] qVarArr;
        q[] qVarArr2;
        o2.k kVar = (o2.k) this.f15522b;
        int i10 = kVar.H - 1;
        kVar.H = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (q qVar : kVar.J) {
            qVar.e();
            i11 += qVar.Y.f43786a;
        }
        l1[] l1VarArr = new l1[i11];
        int i12 = 0;
        for (q qVar2 : kVar.J) {
            qVar2.e();
            int i13 = qVar2.Y.f43786a;
            int i14 = 0;
            while (i14 < i13) {
                qVar2.e();
                l1VarArr[i12] = qVar2.Y.a(i14);
                i14++;
                i12++;
            }
        }
        kVar.I = new o1(l1VarArr);
        kVar.G.e(kVar);
    }

    public boolean I(int i10, int i11, Bundle bundle) {
        return false;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        ((ChatActivityEnterView) this.f15522b).T0(i10, z10, 0, true, 0L);
    }

    @Override
    public String J0() {
        return ((org.telegram.ui.web.c1) this.f15522b).f38970i0;
    }

    @Override
    public void K(String str) {
        org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.f15522b;
        try {
            c1Var.P = System.currentTimeMillis();
            c1Var.z("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    @Override
    public void L(int i10, int i11, CharSequence charSequence, boolean z10) {
        wi wiVar = (wi) this.f15522b;
        if (wiVar.k1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(wiVar.k1().getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, wiVar.k1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            wiVar.k1().setText(spannableStringBuilder);
            wiVar.k1().setSelection(i10 + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void M(s4.c1 c1Var, q0 q0Var, q0 q0Var2) {
        int i10;
        int i11;
        boolean z10;
        s4.c1 U;
        int i12;
        RecyclerView recyclerView = (RecyclerView) this.f15522b;
        recyclerView.f2834b.k(c1Var);
        recyclerView.h(c1Var);
        c1Var.q(false);
        f1 f1Var = (f1) recyclerView.f2837c0;
        f1Var.getClass();
        int i13 = q0Var.f3197a;
        int i14 = q0Var.f3198b;
        View view = c1Var.f43005a;
        if (q0Var2 == null) {
            i10 = view.getLeft();
        } else {
            i10 = q0Var2.f3197a;
        }
        int i15 = i10;
        if (q0Var2 == null) {
            i11 = view.getTop();
        } else {
            i11 = q0Var2.f3198b;
        }
        int i16 = i11;
        if (!c1Var.j() && (i13 != i15 || i14 != i16)) {
            view.layout(i15, i16, view.getWidth() + i15, view.getHeight() + i16);
            z10 = f1Var.r(c1Var, q0Var, i13, i14, i15, i16);
        } else {
            int i17 = c1Var.h;
            int i18 = -1;
            if (i17 != -1) {
                for (int i19 = 0; i19 < recyclerView.getChildCount(); i19++) {
                    View childAt = recyclerView.getChildAt(i19);
                    if (childAt != null && (U = recyclerView.U(childAt)) != null && !U.j() && (i12 = U.h) >= 0 && i12 < i17 && i12 > i18) {
                        i18 = i12;
                    }
                }
            }
            c1Var.f43010i = (c1Var.h - i18) + (i18 * 1000);
            f1Var.s(c1Var, q0Var);
            z10 = true;
        }
        if (z10) {
            recyclerView.m0();
        }
    }

    public void N(s4.c1 c1Var) {
        RecyclerView recyclerView = (RecyclerView) this.f15522b;
        o0 o0Var = recyclerView.f2862x;
        View view = c1Var.f43005a;
        of.e eVar = recyclerView.f2834b;
        la.h hVar = o0Var.f43097a;
        ka.c cVar = (ka.c) hVar.f14168b;
        int indexOfChild = ((RecyclerView) cVar.f13554b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((n) hVar.f14169c).F(indexOfChild)) {
                hVar.Y(view);
            }
            cVar.W(indexOfChild);
        }
        eVar.g(view);
    }

    @Override
    public void a(int i10) {
        rq0 rq0Var = (rq0) this.f15522b;
        vq0 vq0Var = rq0Var.K;
        rq0Var.f28075s = i10;
        if (rq0Var.v != i10) {
            rq0Var.d.clear();
        }
        int i11 = rq0Var.J;
        if (rq0Var.h() == 0 && !rq0Var.e.e() && !rq0Var.I) {
            vq0Var.Q.e(false, true);
        } else {
            vq0Var.f29770x0.b(i11);
        }
        rq0Var.l();
        int i12 = vq0.W0;
        vq0Var.H0(true);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f15521a) {
            case 13:
                z zVar = (z) ((r7.k) obj).u();
                r7.f fVar = new r7.f(1, (TaskCompletionSource) obj2);
                Parcel O0 = zVar.O0();
                r7.d.c(O0, (g8.e) this.f15522b);
                r7.d.d(O0, fVar);
                O0.writeString(null);
                zVar.S0(O0, 63);
                return;
            default:
                s6.f fVar2 = new s6.f(0, (TaskCompletionSource) obj2);
                s6.e eVar = (s6.e) ((s6.h) obj).u();
                Parcel I0 = eVar.I0();
                k7.a.d(I0, fVar2);
                k7.a.c(I0, (s6.a) this.f15522b);
                eVar.J0(I0, 1);
                return;
        }
    }

    @Override
    public long b(long j3) {
        ArrayList arrayList = (ArrayList) this.f15522b;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j3 < ((z3.a) arrayList.get(0)).f48398b) {
            return ((z3.a) arrayList.get(0)).f48398b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            z3.a aVar = (z3.a) arrayList.get(i10);
            long j10 = aVar.f48398b;
            long j11 = aVar.f48398b;
            if (j3 < j10) {
                long j12 = ((z3.a) arrayList.get(i10 - 1)).d;
                if (j12 != -9223372036854775807L && j12 > j3 && j12 < j11) {
                    return j12;
                }
                return j11;
            }
        }
        long j13 = ((z3.a) e9.q.l(arrayList)).d;
        if (j13 == -9223372036854775807L || j3 >= j13) {
            return Long.MIN_VALUE;
        }
        return j13;
    }

    @Override
    public int c(View view) {
        return o0.x(view) - ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).leftMargin;
    }

    @Override
    public void clear() {
        ((ArrayList) this.f15522b).clear();
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15522b;
        if (contentProviderClient != null) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                k4.h((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override
    public i0 d(long j3) {
        int D = D(j3);
        if (D == 0) {
            g0 g0Var = i0.f8068b;
            return a1.e;
        }
        z3.a aVar = (z3.a) ((ArrayList) this.f15522b).get(D - 1);
        long j10 = aVar.d;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            g0 g0Var2 = i0.f8068b;
            return a1.e;
        }
        return aVar.f48397a;
    }

    @Override
    public boolean e1(String str, o9 o9Var) {
        return false;
    }

    @Override
    public int g() {
        return ((o0) this.f15522b).D();
    }

    @Override
    public void h(d1 d1Var) {
        q qVar = (q) d1Var;
        o2.k kVar = (o2.k) this.f15522b;
        kVar.G.h(kVar);
    }

    @Override
    public void i(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        u uVar = (u) this.f15522b;
        uVar.f49487a.ab(null, uVar.e, uVar.f49488b, view, 0.0f, 0.0f, p0Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new r2(this, 9));
    }

    @Override
    public void invalidate() {
        ((u1) ((org.telegram.ui.Cells.h1) this.f15522b).f20388b).invalidate();
    }

    @Override
    public boolean j() {
        return true;
    }

    @Override
    public boolean k() {
        return false;
    }

    @Override
    public a0.i l() {
        return null;
    }

    @Override
    public boolean m(z3.a r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: o0.c.m(z3.a, long):boolean");
    }

    @Override
    public a0.i o() {
        return null;
    }

    @Override
    public void onDismiss() {
        org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.f15522b;
        c1Var.z("scan_qr_popup_closed", null);
        c1Var.f38969h0 = false;
    }

    @Override
    public void onError(u71 u71Var, Exception exc) {
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        e60 e60Var;
        VideoEditedInfo videoEditedInfo;
        x50 x50Var = (x50) this.f15522b;
        u71 u71Var = x50Var.H0.T;
        if (u71Var != null && u71Var.y() && i10 == 4 && (videoEditedInfo = (e60Var = x50Var.H0).S) != null) {
            u71 u71Var2 = e60Var.T;
            long j3 = videoEditedInfo.startTime;
            if (j3 <= 0) {
                j3 = 0;
            }
            u71Var2.K(j3);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public long q(long j3) {
        ArrayList arrayList = (ArrayList) this.f15522b;
        if (arrayList.isEmpty() || j3 < ((z3.a) arrayList.get(0)).f48398b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j10 = ((z3.a) arrayList.get(i10)).f48398b;
            int i11 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
            if (i11 == 0) {
                return j10;
            }
            if (i11 < 0) {
                z3.a aVar = (z3.a) arrayList.get(i10 - 1);
                long j11 = aVar.d;
                if (j11 != -9223372036854775807L && j11 <= j3) {
                    return j11;
                }
                return aVar.f48398b;
            }
        }
        z3.a aVar2 = (z3.a) e9.q.l(arrayList);
        long j12 = aVar2.d;
        if (j12 != -9223372036854775807L && j3 >= j12) {
            return j12;
        }
        return aVar2.f48398b;
    }

    @Override
    public Cursor r(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15522b;
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
    public boolean s(int i10) {
        if (i10 == ((rq0) this.f15522b).f28074r) {
            return true;
        }
        return false;
    }

    @Override
    public boolean t() {
        return false;
    }

    public String toString() {
        switch (this.f15521a) {
            case 9:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.f15522b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override
    public void u(long j3) {
        ArrayList arrayList = (ArrayList) this.f15522b;
        int D = D(j3);
        if (D == 0) {
            return;
        }
        long j10 = ((z3.a) arrayList.get(D - 1)).d;
        if (j10 == -9223372036854775807L || j10 >= j3) {
            D--;
        }
        arrayList.subList(0, D).clear();
    }

    @Override
    public void u0() {
        qc k10 = ((x3) this.f15522b).getBulletinFactory().k(false);
        k10.f27701t = true;
        k10.j();
    }

    public void v() {
        pg.d1 d1Var = ((pg.f1) this.f15522b).d;
        if (d1Var != null) {
            b1 b1Var = d1Var.f41093s;
            if (b1Var != null) {
                d1Var.cancelRunnable(b1Var);
                d1Var.f41093s = null;
            }
            b1 b1Var2 = new b1(d1Var, 1);
            d1Var.f41093s = b1Var2;
            d1Var.postRunnable(b1Var2, 1L);
        }
    }

    @Override
    public Paint.FontMetricsInt w() {
        return ((wi) this.f15522b).E0.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public int x() {
        o0 o0Var = (o0) this.f15522b;
        return o0Var.f43106m - o0Var.E();
    }

    @Override
    public View y(int i10) {
        return ((o0) this.f15522b).q(i10);
    }

    public s0.d z(int i10) {
        return null;
    }

    public c(s6.g gVar, s6.a aVar) {
        this.f15521a = 18;
        this.f15522b = aVar;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public c(int i10, int i11, int[] iArr) {
        this.f15521a = 3;
        l60[] l60VarArr = new l60[(iArr.length / 2) + 1];
        this.f15522b = l60VarArr;
        l60 l60Var = new l60(i10, i11);
        int i12 = 0;
        l60VarArr[0] = l60Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((l60[]) this.f15522b)[i13] = new l60(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    public c(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f15521a = 12;
        this.f15522b = new GestureDetector(context, onGestureListener, null);
    }

    public c(int i10) {
        this.f15521a = i10;
        switch (i10) {
            case 20:
                return;
            case 21:
                this.f15522b = new ArrayList();
                return;
            case 22:
            default:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f15522b = new mh0(this);
                    return;
                } else {
                    this.f15522b = new mh0(this);
                    return;
                }
            case 23:
                this.f15522b = new CopyOnWriteArrayList();
                return;
        }
    }

    public c(Context context, Uri uri) {
        this.f15521a = 0;
        this.f15522b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override
    public void U() {
    }

    @Override
    public void p() {
    }

    @Override
    public void F(ArrayList arrayList) {
    }

    @Override
    public void P(String str) {
    }

    @Override
    public void T0(MrzRecognizer.Result result) {
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
    public void A(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void f(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }

    @Override
    public void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}

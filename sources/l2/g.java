package l2;

import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.os.RemoteException;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.View;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.gms.internal.cast.b5;
import com.google.android.gms.internal.cast.k4;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.concurrent.ExecutorService;
import m.x0;
import o2.q;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.ia;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.z5;
import org.telegram.ui.kv0;
import org.telegram.ui.n9;
import org.telegram.ui.v9;
import org.telegram.ui.web.c1;
import pg.b1;
import pg.f1;
import qg.n2;
import qg.v1;
import u2.d1;
import u2.e1;
import u2.p1;
import y8.e0;
import yh.o2;
import zg.m0;
import zg.r;
public class g implements y2.m, x0, n5.b, o0.b, d1, l1, v9, v1, r4.c, com.google.android.gms.common.api.internal.o, OnCompleteListener, y2.g, rk0 {
    public final int f15267a;
    public final Object f15268b;

    public g(Object obj, int i10) {
        this.f15267a = i10;
        this.f15268b = obj;
    }

    @Override
    public boolean A1() {
        return false;
    }

    @Override
    public boolean B() {
        return true;
    }

    @Override
    public void C() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public void D(int i10, Object obj) {
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
        ((ProfileInstallReceiver) this.f15268b).setResultCode(i10);
    }

    @Override
    public boolean E() {
        return false;
    }

    @Override
    public boolean G1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean I1() {
        return false;
    }

    @Override
    public String J0() {
        return ((c1) this.f15268b).f42151i0;
    }

    @Override
    public boolean K() {
        return false;
    }

    @Override
    public void L(String str) {
        c1 c1Var = (c1) this.f15268b;
        try {
            c1Var.P = System.currentTimeMillis();
            c1Var.z("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public boolean M0(long j3) {
        return false;
    }

    @Override
    public void N1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(u1Var.getContext(), str);
    }

    @Override
    public CharacterStyle O1(u1 u1Var) {
        return null;
    }

    @Override
    public boolean P(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public void P0(int i10, u1 u1Var) {
        ia iaVar = (ia) this.f15268b;
        org.telegram.ui.Cells.g gVar = iaVar.v;
        if (iaVar.a()) {
            iaVar.f22294s = 2;
            u1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ia iaVar = (ia) this.f15268b;
        org.telegram.ui.Cells.g gVar = iaVar.v;
        if (iaVar.a()) {
            iaVar.f22294s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public boolean Q1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public boolean R(u1 u1Var) {
        return false;
    }

    @Override
    public boolean S() {
        return false;
    }

    public void V() {
        pg.d1 d1Var = ((f1) this.f15268b).d;
        if (d1Var != null) {
            b1 b1Var = d1Var.f44462s;
            if (b1Var != null) {
                d1Var.cancelRunnable(b1Var);
                d1Var.f44462s = null;
            }
            b1 b1Var2 = new b1(d1Var, 1);
            d1Var.f44462s = b1Var2;
            d1Var.postRunnable(b1Var2, 1L);
        }
    }

    @Override
    public boolean V1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public int W() {
        return 0;
    }

    @Override
    public boolean W0(u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public void X(float f7) {
        ((n2) this.f15268b).setOutlineWidth(f7);
    }

    public StringBuilder Y() {
        df.a aVar = (df.a) this.f15268b;
        if (aVar instanceof ye.m) {
            StringBuilder sb2 = ((ye.m) aVar).f50939b.f50924b;
            if (sb2.length() != 0) {
                return sb2;
            }
            return null;
        }
        return null;
    }

    @Override
    public kv0 Y1() {
        return null;
    }

    @Override
    public hh.a Z() {
        return null;
    }

    @Override
    public void a() {
        h hVar = (h) this.f15268b;
        hVar.A.a();
        b5 b5Var = hVar.C;
        if (b5Var == null) {
            return;
        }
        throw b5Var;
    }

    public void a0() {
        q[] qVarArr;
        q[] qVarArr2;
        o2.k kVar = (o2.k) this.f15268b;
        int i10 = kVar.H - 1;
        kVar.H = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (q qVar : kVar.J) {
            qVar.e();
            i11 += qVar.Y.f47386a;
        }
        b2.l1[] l1VarArr = new b2.l1[i11];
        int i12 = 0;
        for (q qVar2 : kVar.J) {
            qVar2.e();
            int i13 = qVar2.Y.f47386a;
            int i14 = 0;
            while (i14 < i13) {
                qVar2.e();
                l1VarArr[i12] = qVar2.Y.a(i14);
                i14++;
                i12++;
            }
        }
        kVar.I = new p1(l1VarArr);
        kVar.G.b(kVar);
    }

    @Override
    public boolean a2(long j3) {
        return false;
    }

    @Override
    public boolean b0(u1 u1Var) {
        return false;
    }

    @Override
    public void b2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
        ia iaVar = (ia) this.f15268b;
        org.telegram.ui.Cells.g gVar = iaVar.v;
        if (iaVar.a()) {
            iaVar.f22294s = 0;
            u1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public Cursor c(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15268b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e7) {
            Log.w("FontsProvider", "Unable to query the content provider", e7);
            return null;
        }
    }

    @Override
    public boolean c0(u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean c1(int i10, u1 u1Var) {
        if (i10 == ((ia) this.f15268b).f22294s) {
            return true;
        }
        return false;
    }

    @Override
    public boolean c2(u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f15268b;
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

    public byte d0() {
        int read = ((com.google.firebase.messaging.d) this.f15268b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override
    public boolean e() {
        return ((ia) this.f15268b).a();
    }

    @Override
    public void f(e1 e1Var) {
        q qVar = (q) e1Var;
        o2.k kVar = (o2.k) this.f15268b;
        kVar.G.f(kVar);
    }

    @Override
    public boolean f0() {
        return false;
    }

    @Override
    public boolean g() {
        return true;
    }

    @Override
    public boolean g1(String str, n9 n9Var) {
        return false;
    }

    @Override
    public Object mo28get() {
        switch (this.f15267a) {
            case 3:
                return new la.h((Context) ((e.a) this.f15268b).f8396a, new rb.a(23), new qb.b(23), 5);
            default:
                return new s5.i((Context) ((fd.a) this.f15268b).mo28get(), "com.google.android.datatransport.events", Integer.valueOf(s5.i.d).intValue());
        }
    }

    @Override
    public String h(u1 u1Var) {
        return null;
    }

    @Override
    public int h0(u1 u1Var) {
        return 0;
    }

    @Override
    public boolean h1(MessageObject messageObject) {
        return org.telegram.ui.Cells.c1.a(messageObject);
    }

    @Override
    public void i(View view, m0 m0Var, boolean z10, boolean z11) {
        r rVar = (r) this.f15268b;
        rVar.f53515a.Za(null, rVar.f53518e, rVar.f53516b, view, 0.0f, 0.0f, m0Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new o2(this, 10));
    }

    public int j0() {
        return ((d0() & 255) << 24) | ((d0() & 255) << 16) | ((d0() & 255) << 8) | (d0() & 255);
    }

    public int k0() {
        return ((d0() & Byte.MAX_VALUE) << 21) | ((d0() & Byte.MAX_VALUE) << 14) | ((d0() & Byte.MAX_VALUE) << 7) | (d0() & Byte.MAX_VALUE);
    }

    @Override
    public boolean l0() {
        return e();
    }

    @Override
    public boolean l2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    public void m0(long j3) {
        long j10 = 0;
        while (j10 < j3) {
            long skip = ((com.google.firebase.messaging.d) this.f15268b).skip(j3 - j10);
            if (skip > 0) {
                j10 += skip;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override
    public boolean o0(z5 z5Var) {
        return false;
    }

    @Override
    public void onComplete(Task task) {
        e0 e0Var = (e0) this.f15268b;
        if (task.isSuccessful()) {
            x8.m.M0(e0Var, true, (byte[]) task.getResult());
            return;
        }
        Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
        x8.m.M0(e0Var, false, null);
    }

    @Override
    public void onDismiss() {
        c1 c1Var = (c1) this.f15268b;
        c1Var.z("scan_qr_popup_closed", null);
        c1Var.f42150h0 = false;
    }

    @Override
    public void q(Object obj) {
        com.google.android.gms.common.api.internal.n nVar;
        g8.c cVar = (g8.c) obj;
        androidx.activity.n nVar2 = ((r7.i) this.f15268b).f45857b;
        synchronized (nVar2) {
            nVar2.f2069b = false;
            nVar = ((com.google.android.gms.common.api.internal.p) nVar2.f2070c).f6603c;
        }
        if (nVar != null) {
            ((r7.c) nVar2.d).c(nVar, 2441);
        }
    }

    public String toString() {
        switch (this.f15267a) {
            case 12:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.f15268b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override
    public k4.d v(y2.i iVar, long j3, long j10, IOException iOException, int i10) {
        ((d) this.f15268b).f15256a.x(iOException);
        return y2.l.f50413e;
    }

    @Override
    public boolean v2(int i10) {
        return false;
    }

    @Override
    public String w(long j3) {
        return null;
    }

    @Override
    public boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override
    public void y(y2.i iVar, long j3, long j10) {
        boolean z10;
        d dVar = (d) this.f15268b;
        synchronized (z2.b.f52380b) {
            z10 = z2.b.f52381c;
        }
        if (!z10) {
            dVar.f15256a.x(new IOException(new ConcurrentModificationException()));
            return;
        }
        dVar.a();
    }

    @Override
    public r9 z2() {
        return null;
    }

    public g(Context context, Uri uri) {
        this.f15267a = 5;
        this.f15268b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override
    public float get() {
        return ((n2) this.f15268b).F;
    }

    @Override
    public void I() {
    }

    @Override
    public void R1() {
    }

    @Override
    public void k1() {
    }

    @Override
    public void l() {
    }

    @Override
    public void p() {
    }

    @Override
    public void q2() {
    }

    @Override
    public void s() {
    }

    @Override
    public void x2() {
    }

    @Override
    public void z0() {
    }

    @Override
    public void A(u1 u1Var) {
    }

    @Override
    public void C1(u1 u1Var) {
    }

    @Override
    public void D0(u1 u1Var) {
    }

    @Override
    public void F0(u1 u1Var) {
    }

    @Override
    public void G(u1 u1Var) {
    }

    @Override
    public void I0(u1 u1Var) {
    }

    @Override
    public void J(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void K1(u1 u1Var) {
    }

    @Override
    public void M(u1 u1Var) {
    }

    @Override
    public void M1(MessageObject messageObject) {
    }

    @Override
    public void N0(u1 u1Var) {
    }

    @Override
    public void O(MessageObject messageObject) {
    }

    @Override
    public void T0(MrzRecognizer.Result result) {
    }

    @Override
    public void U(u1 u1Var) {
    }

    @Override
    public void X0(u1 u1Var) {
    }

    @Override
    public void Z0(u1 u1Var) {
    }

    @Override
    public void d(int i10) {
    }

    @Override
    public void e0(int i10) {
    }

    @Override
    public void e2(u1 u1Var) {
    }

    @Override
    public void i0(u1 u1Var) {
    }

    @Override
    public void m(int i10) {
    }

    @Override
    public void m2(u1 u1Var) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void o(u1 u1Var) {
    }

    @Override
    public void r(u1 u1Var) {
    }

    @Override
    public void t(u1 u1Var) {
    }

    @Override
    public void u(u1 u1Var) {
    }

    @Override
    public void y0(u1 u1Var) {
    }

    @Override
    public void z(u1 u1Var) {
    }

    @Override
    public void D1(u1 u1Var, boolean z10) {
    }

    @Override
    public void F(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void H1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void N(int i10, u1 u1Var) {
    }

    @Override
    public void R0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void T1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void g2(u1 u1Var, long j3) {
    }

    @Override
    public void j(u1 u1Var, bi.f fVar) {
    }

    @Override
    public void m1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void p1(u1 u1Var, TLRPC.Document document) {
    }

    @Override
    public void A0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void V0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void g0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void q0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void u1(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void y2(u1 u1Var, int i10, int i11) {
    }

    @Override
    public void U1(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void t0(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void v0(u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void x(y2.i iVar, long j3, long j10, int i10) {
    }

    @Override
    public void x0(y2.i iVar, long j3, long j10, boolean z10) {
    }

    @Override
    public void k(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void t2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void T(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void H(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}

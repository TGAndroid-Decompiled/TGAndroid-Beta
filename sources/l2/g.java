package l2;

import a9.r;
import android.content.Context;
import android.graphics.Canvas;
import android.media.AudioAttributes;
import android.net.Uri;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.View;
import androidx.profileinstaller.ProfileInstallReceiver;
import b2.s0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import e2.d0;
import g.z;
import j$.util.Objects;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import m.e3;
import m.x0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.ka;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.t20;
import org.telegram.ui.Components.u20;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.yi;
import org.telegram.ui.j71;
import org.telegram.ui.rv0;
import pg.n2;
import pg.v1;
import r0.l1;
import u2.u;
import w7.x8;
import y8.e0;
import zh.a3;
public class g implements y2.i, x0, n5.b, k1, zg.g, i71, r0.n, v1, r4.c, com.google.android.gms.common.api.internal.o, OnCompleteListener, j71, hq0 {
    public final int f12718a;
    public final Object f12719b;

    public g(Object obj, int i10) {
        this.f12718a = i10;
        this.f12719b = obj;
    }

    public boolean B(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: l2.g.B(android.view.MotionEvent):boolean");
    }

    @Override
    public void C(y2.k kVar, long j3, long j10, boolean z10) {
        ((i) this.f12719b).w((y2.q) kVar, j10);
    }

    @Override
    public boolean E1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    public byte F() {
        int read = ((com.google.firebase.messaging.d) this.f12719b).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public int G() {
        return ((F() & 255) << 24) | ((F() & 255) << 16) | ((F() & 255) << 8) | (F() & 255);
    }

    @Override
    public boolean G1() {
        return false;
    }

    public int I() {
        return ((F() & Byte.MAX_VALUE) << 21) | ((F() & Byte.MAX_VALUE) << 14) | ((F() & Byte.MAX_VALUE) << 7) | (F() & Byte.MAX_VALUE);
    }

    public g J(int i10) {
        if (i10 == 16) {
            i10 = 12;
        }
        ((AudioAttributes.Builder) this.f12719b).setUsage(i10);
        return this;
    }

    @Override
    public void L1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(t1Var.getContext(), str);
    }

    @Override
    public boolean M0(long j3) {
        return false;
    }

    @Override
    public CharacterStyle M1(t1 t1Var) {
        return null;
    }

    @Override
    public boolean N(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public void N1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ka kaVar = (ka) this.f12719b;
        org.telegram.ui.Cells.g gVar = kaVar.v;
        if (kaVar.a()) {
            kaVar.f19459s = 2;
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public boolean O() {
        return false;
    }

    @Override
    public boolean O1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public boolean P(t1 t1Var) {
        return false;
    }

    @Override
    public void P0(int i10, t1 t1Var) {
        ka kaVar = (ka) this.f12719b;
        org.telegram.ui.Cells.g gVar = kaVar.v;
        if (kaVar.a()) {
            kaVar.f19459s = 2;
            t1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public l1 Q0(View view, l1 l1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        km0 km0Var = (km0) this.f12719b;
        km0Var.v.setPadding(defaultWindowInsets.f10074a, defaultWindowInsets.f10075b, defaultWindowInsets.f10076c, defaultWindowInsets.d);
        km0Var.f24757s.requestLayout();
        return l1.f41073b;
    }

    @Override
    public int U() {
        return 0;
    }

    @Override
    public void V(float f7) {
        ((n2) this.f12719b).setOutlineWidth(f7);
    }

    @Override
    public boolean V1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    public void W(int i10) {
        J(i10);
    }

    @Override
    public boolean W0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override
    public gh.a X() {
        return null;
    }

    @Override
    public rv0 X1() {
        return null;
    }

    @Override
    public boolean Y(t1 t1Var) {
        return false;
    }

    @Override
    public boolean Y1(long j3) {
        return false;
    }

    public void Z(long j3) {
        long j10 = 0;
        while (j10 < j3) {
            long skip = ((com.google.firebase.messaging.d) this.f12719b).skip(j3 - j10);
            if (skip > 0) {
                j10 += skip;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override
    public void Z1(t1 t1Var, int i10, float f7, float f10, boolean z10) {
        ka kaVar = (ka) this.f12719b;
        org.telegram.ui.Cells.g gVar = kaVar.v;
        if (kaVar.a()) {
            kaVar.f19459s = 0;
            t1Var.invalidate();
            AndroidUtilities.cancelRunOnUIThread(gVar);
            AndroidUtilities.runOnUIThread(gVar, 5000L);
        }
    }

    @Override
    public boolean a2(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean b0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    public n4.a c() {
        return new n4.a(((AudioAttributes.Builder) this.f12719b).build());
    }

    @Override
    public boolean c1(int i10, t1 t1Var) {
        if (i10 == ((ka) this.f12719b).f19459s) {
            return true;
        }
        return false;
    }

    @Override
    public void d(Canvas canvas) {
        yi yiVar = (yi) this.f12719b;
        canvas.drawColor(yiVar.getThemedColor(j6.f17928d6));
        if (SharedConfig.chatBlurEnabled()) {
            yiVar.C2.b(canvas, -2);
        }
    }

    @Override
    public boolean d0() {
        return false;
    }

    @Override
    public boolean e() {
        return ((ka) this.f12719b).a();
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public String g(t1 t1Var) {
        return null;
    }

    @Override
    public boolean g1(MessageObject messageObject) {
        return em.a(messageObject);
    }

    @Override
    public Object mo28get() {
        switch (this.f12718a) {
            case 3:
                return new e3((Context) ((r) this.f12719b).f349a, new rb.a(23), new qb.b(23), 3);
            default:
                return new s5.i((Context) ((fd.a) this.f12719b).mo28get(), "com.google.android.datatransport.events", Integer.valueOf(s5.i.d).intValue());
        }
    }

    @Override
    public void h(Object obj) {
        com.google.android.gms.common.api.internal.n nVar;
        g8.c cVar = (g8.c) obj;
        androidx.activity.o oVar = ((r7.i) this.f12719b).f41288b;
        synchronized (oVar) {
            oVar.f591b = false;
            nVar = ((com.google.android.gms.common.api.internal.p) oVar.f592c).f4919c;
        }
        if (nVar != null) {
            ((r7.c) oVar.d).c(nVar, 2441);
        }
    }

    @Override
    public int h0(t1 t1Var) {
        return 0;
    }

    @Override
    public void invalidate() {
        ((og0) this.f12719b).h.invalidate();
    }

    @Override
    public boolean j2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public k4.d k(y2.k r4, long r5, long r7, java.io.IOException r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: l2.g.k(y2.k, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public void l(y2.k kVar, long j3, long j10, int i10) {
        u uVar;
        y2.q qVar = (y2.q) kVar;
        i iVar = (i) this.f12719b;
        if (i10 == 0) {
            long j11 = qVar.f46448a;
            uVar = new u(qVar.f46449b);
        } else {
            long j12 = qVar.f46448a;
            Uri uri = qVar.d.f8480c;
            uVar = new u(j10);
        }
        iVar.f12730q.r(uVar, qVar.f46450c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public boolean l0() {
        return e();
    }

    @Override
    public boolean o0(y5 y5Var) {
        return false;
    }

    @Override
    public void onComplete(Task task) {
        e0 e0Var = (e0) this.f12719b;
        if (task.isSuccessful()) {
            x8.m.M0(e0Var, true, (byte[]) task.getResult());
            return;
        }
        Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
        x8.m.M0(e0Var, false, null);
    }

    @Override
    public void p(y2.k kVar, long j3, long j10) {
        int size;
        int i10;
        long j11;
        y2.q qVar = (y2.q) kVar;
        i iVar = (i) this.f12719b;
        long j12 = qVar.f46448a;
        Uri uri = qVar.d.f8480c;
        u uVar = new u(j10);
        iVar.f12726m.getClass();
        iVar.f12730q.o(uVar, qVar.f46450c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        m2.c cVar = (m2.c) qVar.f46451f;
        m2.c cVar2 = iVar.H;
        if (cVar2 == null) {
            size = 0;
        } else {
            size = cVar2.f13240m.size();
        }
        long j13 = cVar.b(0).f13257b;
        int i11 = 0;
        while (i11 < size && iVar.H.b(i11).f13257b < j13) {
            i11++;
        }
        if (cVar.d) {
            if (size - i11 > cVar.f13240m.size()) {
                e2.a.n("DashMediaSource", "Loaded out of sync manifest");
            } else {
                j11 = -9223372036854775807L;
                long j14 = iVar.N;
                if (j14 != -9223372036854775807L) {
                    i10 = i11;
                    if (cVar.h * 1000 <= j14) {
                        e2.a.n("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + iVar.N);
                    }
                } else {
                    i10 = i11;
                }
                iVar.M = 0;
            }
            int i12 = iVar.M;
            iVar.M = i12 + 1;
            if (i12 < iVar.f12726m.o3(qVar.f46450c)) {
                iVar.D.postDelayed(iVar.v, Math.min((iVar.M - 1) * 1000, 5000));
                return;
            }
            iVar.C = new IOException();
            return;
        }
        i10 = i11;
        j11 = -9223372036854775807L;
        iVar.H = cVar;
        iVar.I = cVar.d & iVar.I;
        iVar.J = j3 - j10;
        iVar.K = j3;
        iVar.O += i10;
        synchronized (iVar.f12733t) {
            try {
                if (qVar.f46449b.f8508a.equals(iVar.F)) {
                    Uri uri2 = iVar.H.f13238k;
                    if (uri2 == null) {
                        uri2 = x8.a(qVar.d.f8480c);
                    }
                    iVar.F = uri2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m2.c cVar3 = iVar.H;
        if (cVar3.d && iVar.L == j11) {
            lf.g gVar = cVar3.f13236i;
            if (gVar != null) {
                String str = gVar.f12913b;
                if (!Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
                    if (!Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                        if (!Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                            if (!Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                iVar.x(new IOException("Unsupported UTC timing scheme"));
                                return;
                            } else {
                                iVar.v();
                                return;
                            }
                        }
                        iVar.z(gVar, new ob.a(12));
                        return;
                    }
                    iVar.z(gVar, new Object());
                    return;
                }
                try {
                    iVar.L = d0.T(gVar.f12914c) - iVar.K;
                    iVar.y(true);
                    return;
                } catch (s0 e) {
                    iVar.x(e);
                    return;
                }
            }
            iVar.v();
            return;
        }
        iVar.y(true);
    }

    @Override
    public void s0() {
        a3.j0((a3) this.f12719b);
    }

    @Override
    public boolean t2(int i10) {
        return false;
    }

    @Override
    public void u(z zVar) {
        zVar.a(((yi) this.f12719b).getThemedColor(j6.f17928d6));
        zVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public String v(long j3) {
        return null;
    }

    @Override
    public void w() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
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
        ((ProfileInstallReceiver) this.f12719b).setResultCode(i10);
    }

    @Override
    public boolean x0(MessageObject messageObject) {
        return true;
    }

    @Override
    public t9 x2() {
        return null;
    }

    public void y() {
        ArrayList arrayList = (ArrayList) this.f12719b;
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
                    yc.i.d.log(Level.WARNING, "could not delete file ", (Throwable) e);
                }
            } else {
                throw new ClassCastException();
            }
        }
        arrayList.clear();
    }

    @Override
    public boolean z1() {
        return false;
    }

    public g(Context context, u20 u20Var) {
        this.f12718a = 8;
        this.f12719b = new t20(context, u20Var);
    }

    public g(int i10) {
        this.f12718a = i10;
        switch (i10) {
            case 24:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.f12719b = new ArrayList();
                return;
            default:
                this.f12719b = new AudioAttributes.Builder();
                return;
        }
    }

    @Override
    public float get() {
        return ((n2) this.f12719b).F;
    }

    @Override
    public void A0() {
    }

    @Override
    public void Q1() {
    }

    @Override
    public void T() {
    }

    @Override
    public void j() {
    }

    @Override
    public void j1() {
    }

    @Override
    public void o() {
    }

    @Override
    public void o2() {
    }

    @Override
    public void r() {
    }

    @Override
    public void v2() {
    }

    @Override
    public void A(t1 t1Var) {
    }

    @Override
    public void B1(t1 t1Var) {
    }

    @Override
    public void E(t1 t1Var) {
    }

    @Override
    public void E0(t1 t1Var) {
    }

    @Override
    public void G0(t1 t1Var) {
    }

    @Override
    public void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I0(t1 t1Var) {
    }

    @Override
    public void I1(t1 t1Var) {
    }

    @Override
    public void K(t1 t1Var) {
    }

    @Override
    public void K1(MessageObject messageObject) {
    }

    @Override
    public void M(MessageObject messageObject) {
    }

    @Override
    public void N0(t1 t1Var) {
    }

    @Override
    public void S(t1 t1Var) {
    }

    @Override
    public void X0(t1 t1Var) {
    }

    @Override
    public void Z0(t1 t1Var) {
    }

    @Override
    public void a(int i10) {
    }

    @Override
    public void b(int i10) {
    }

    @Override
    public void c0(int i10) {
    }

    @Override
    public void c2(t1 t1Var) {
    }

    @Override
    public void i0(t1 t1Var) {
    }

    @Override
    public void k2(t1 t1Var) {
    }

    @Override
    public void n(t1 t1Var) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void q(t1 t1Var) {
    }

    @Override
    public void s(t1 t1Var) {
    }

    @Override
    public void t(t1 t1Var) {
    }

    @Override
    public void z(t1 t1Var) {
    }

    @Override
    public void z0(t1 t1Var) {
    }

    @Override
    public void C1(t1 t1Var, boolean z10) {
    }

    @Override
    public void D(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void F1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void L(int i10, t1 t1Var) {
    }

    @Override
    public void R0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void S1(t1 t1Var, ai.j jVar) {
    }

    @Override
    public void T1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void e2(t1 t1Var, long j3) {
    }

    @Override
    public void l1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void o1(t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public void B0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void C0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void V0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void f0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void q0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void t1(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void w2(t1 t1Var, int i10, int i11) {
    }

    @Override
    public void U1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void u0(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void w0(t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void r2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void R(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }
}

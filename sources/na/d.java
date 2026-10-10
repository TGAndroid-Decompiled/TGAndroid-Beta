package na;

import a3.l;
import a3.m0;
import ai.aa;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import b2.k0;
import c3.b0;
import c3.h0;
import c3.p;
import c3.q;
import c3.t;
import ci.u5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.components.ComponentRegistrar;
import e9.i0;
import fb.n;
import i9.s;
import i9.w;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.lang.ref.ReferenceQueue;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.b6;
import org.telegram.ui.j71;
import org.telegram.ui.qv0;
import qb.k;
import v7.j8;
public final class d implements m0, bg.a, q, q9.e, da.d, n, q9.d, l1, r4.c, Continuation, u5.a, s0, x3.g, y6.d, j71 {
    public final int f16837a;

    public d(int i10) {
        this.f16837a = i10;
    }

    public static w C3(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((k0) it.next()).f3400b == null) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ?? obj = new Object();
                obj.n(unsupportedOperationException);
                return obj;
            }
        }
        return j8.b(list);
    }

    public static final CharSequence J3(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public static byte[] l3(i0 i0Var, long j3) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i0Var.size());
        Iterator<E> it = i0Var.iterator();
        while (it.hasNext()) {
            d2.b bVar = (d2.b) it.next();
            Bundle a2 = bVar.a();
            Bitmap bitmap = bVar.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                e2.d.g(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                a2.putByteArray(d2.b.f8068x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(a2);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j3);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static da.b m(rb.a aVar) {
        return new da.b(System.currentTimeMillis() + 3600000, new com.google.android.gms.internal.cast.a(8), new ac.d(true, false, false), 10.0d, 1.2d, 60);
    }

    public static boolean s3(q1.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: na.d.s3(q1.b, android.text.Editable, int, int, boolean):boolean");
    }

    public static short v3(short s10, short s11) {
        int i10;
        int i11 = s10 + 32768;
        int i12 = s11 + 32768;
        int i13 = 65535;
        if (i11 >= 32768 && i12 >= 32768) {
            i10 = (((i11 + i12) * 2) - ((i11 * i12) / 32768)) - 65535;
        } else {
            i10 = (i11 * i12) / 32768;
        }
        if (i10 != 65536) {
            i13 = i10;
        }
        return (short) (i13 - 32768);
    }

    @Override
    public void A(u1 u1Var) {
        int i10 = this.f16837a;
    }

    @Override
    public void A0(u1 u1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.f16837a;
    }

    @Override
    public void A1(u1 u1Var, float f7, float f10) {
        int i10 = this.f16837a;
    }

    @Override
    public boolean A2(int i10) {
        switch (this.f16837a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void B(u1 u1Var) {
        int i10 = this.f16837a;
    }

    @Override
    public void C0(u1 u1Var, float f7, float f10, boolean z10) {
        int i10 = this.f16837a;
    }

    @Override
    public void C2() {
        int i10 = this.f16837a;
    }

    @Override
    public da.b D(rb.a aVar, JSONObject jSONObject) {
        return m(aVar);
    }

    @Override
    public boolean D0(MessageObject messageObject) {
        switch (this.f16837a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void D2(u1 u1Var, int i10, int i11) {
        int i12 = this.f16837a;
    }

    @Override
    public void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f16837a;
    }

    @Override
    public void E0(u1 u1Var) {
        int i10 = this.f16837a;
    }

    @Override
    public p9 E2() {
        switch (this.f16837a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void F0() {
        int i10 = this.f16837a;
    }

    @Override
    public void G(u1 u1Var) {
        int i10 = this.f16837a;
    }

    @Override
    public void G0(u1 u1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f16837a;
    }

    @Override
    public void H() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public void H0(u1 u1Var, float f7, float f10) {
        int i10 = this.f16837a;
    }

    @Override
    public boolean H1() {
        switch (this.f16837a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f16837a;
    }

    @Override
    public void J(int i10, Object obj) {
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
    }

    @Override
    public void J0(u1 u1Var) {
        int i10 = this.f16837a;
    }

    @Override
    public void J1(u1 u1Var) {
        int i10 = this.f16837a;
    }

    @Override
    public void K1(u1 u1Var, boolean z10) {
        int i10 = this.f16837a;
    }

    @Override
    public void L(u1 u1Var) {
        int i10 = this.f16837a;
    }

    @Override
    public void L0(u1 u1Var) {
        int i10 = this.f16837a;
    }

    @Override
    public void M(int i10, u1 u1Var) {
        int i11 = this.f16837a;
    }

    @Override
    public boolean M1(u1 u1Var, TLRPC.Chat chat) {
        switch (this.f16837a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void N(MessageObject messageObject) {
        int i10 = this.f16837a;
    }

    @Override
    public void N0(u1 u1Var) {
        int i10 = this.f16837a;
    }

    @Override
    public void N1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f16837a;
    }

    @Override
    public boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f16837a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean O1() {
        switch (this.f16837a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Q() {
        switch (this.f16837a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Q1(u1 u1Var) {
        int i10 = this.f16837a;
    }

    @Override
    public boolean R(u1 u1Var) {
        switch (this.f16837a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R0(long j3) {
        switch (this.f16837a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int R1(int i10, int i11, int i12) {
        return i10 / 2;
    }

    @Override
    public boolean S() {
        switch (this.f16837a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void S0(u1 u1Var) {
        int i10 = this.f16837a;
    }

    @Override
    public void S1(MessageObject messageObject) {
        int i10 = this.f16837a;
    }

    @Override
    public void T(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f16837a;
    }

    @Override
    public void T1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f16837a) {
            case 17:
            default:
                of.f.s(u1Var.getContext(), str);
                return;
        }
    }

    @Override
    public void U(u1 u1Var) {
        int i10 = this.f16837a;
    }

    @Override
    public CharacterStyle U1(u1 u1Var) {
        switch (this.f16837a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void V0(int i10, u1 u1Var) {
        int i11 = this.f16837a;
    }

    @Override
    public void V1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f16837a;
    }

    @Override
    public int W() {
        switch (this.f16837a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public boolean W1(u1 u1Var, MessageObject messageObject) {
        switch (this.f16837a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void X0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f16837a;
    }

    @Override
    public void X1() {
        int i10 = this.f16837a;
    }

    @Override
    public hh.a Y() {
        switch (this.f16837a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Y0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i12 = 0; i12 < min; i12++) {
            shortBuffer2.put(v3(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override
    public long Z() {
        return SystemClock.elapsedRealtime();
    }

    @Override
    public void Z1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f16837a;
    }

    @Override
    public p0 a(Class cls) {
        return new w1.b();
    }

    @Override
    public void a2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f16837a;
    }

    @Override
    public List b(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (q9.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.f46051a;
            if (str != null) {
                aVar = new q9.a(str, aVar.f46052b, aVar.f46053c, aVar.d, aVar.f46054e, new ah.b(5, str, aVar), aVar.f46056g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override
    public boolean b0(u1 u1Var) {
        switch (this.f16837a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void b1(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f16837a;
    }

    @Override
    public boolean b2(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f16837a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public long c(p pVar) {
        return -1L;
    }

    @Override
    public boolean c1(u1 u1Var, boolean z10) {
        switch (this.f16837a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public b0 d() {
        return new t(-9223372036854775807L);
    }

    @Override
    public void d1(u1 u1Var) {
        int i10 = this.f16837a;
    }

    @Override
    public void d2(b0 b0Var) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean e() {
        switch (this.f16837a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean e0(u1 u1Var, TLRPC.User user) {
        switch (this.f16837a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public qv0 e2() {
        switch (this.f16837a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean f() {
        switch (this.f16837a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void f1(u1 u1Var) {
        int i10 = this.f16837a;
    }

    @Override
    public h0 f2(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String g(u1 u1Var) {
        switch (this.f16837a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void g0(int i10) {
        int i11 = this.f16837a;
    }

    @Override
    public boolean g2(long j3) {
        switch (this.f16837a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public p0 h(Class cls, v1.b bVar) {
        return a(cls);
    }

    @Override
    public boolean h0() {
        switch (this.f16837a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void h2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f16837a;
    }

    @Override
    public void i(u1 u1Var, bi.f fVar) {
        int i10 = this.f16837a;
    }

    @Override
    public boolean i1(int i10, u1 u1Var) {
        switch (this.f16837a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean i2(u1 u1Var, TLRPC.TodoItem todoItem) {
        switch (this.f16837a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f16837a;
    }

    @Override
    public void j0(u1 u1Var, float f7, float f10) {
        int i10 = this.f16837a;
    }

    @Override
    public void k() {
        int i10 = this.f16837a;
    }

    @Override
    public void k1() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void k2(u1 u1Var) {
        int i10 = this.f16837a;
    }

    @Override
    public int l0(u1 u1Var) {
        switch (this.f16837a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void m0(u1 u1Var) {
        int i10 = this.f16837a;
    }

    @Override
    public void m2(u1 u1Var, long j3) {
        int i10 = this.f16837a;
    }

    @Override
    public void n(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f16837a;
    }

    @Override
    public boolean n1(MessageObject messageObject) {
        int i10 = this.f16837a;
        return c1.a(messageObject);
    }

    @Override
    public void o(u1 u1Var) {
        int i10 = this.f16837a;
    }

    @Override
    public void p() {
        int i10 = this.f16837a;
    }

    @Override
    public boolean p0() {
        switch (this.f16837a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public l q(Context context, String str, y6.c cVar) {
        l lVar = new l();
        int m10 = cVar.m(context, str, true);
        lVar.f156b = m10;
        if (m10 != 0) {
            lVar.f157c = 1;
            return lVar;
        }
        int q6 = cVar.q(context, str);
        lVar.f155a = q6;
        if (q6 != 0) {
            lVar.f157c = -1;
        }
        return lVar;
    }

    @Override
    public void q1() {
        int i10 = this.f16837a;
    }

    @Override
    public void r(u1 u1Var) {
        int i10 = this.f16837a;
    }

    @Override
    public void r0(String str) {
        int i10 = this.f16837a;
    }

    @Override
    public boolean r2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f16837a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void s() {
        int i10 = this.f16837a;
    }

    @Override
    public void s1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f16837a;
    }

    @Override
    public void s2(u1 u1Var) {
        int i10 = this.f16837a;
    }

    @Override
    public void t(u1 u1Var) {
        int i10 = this.f16837a;
    }

    @Override
    public boolean t0(b6 b6Var) {
        switch (this.f16837a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Object then(Task task) {
        if (!task.isSuccessful()) {
            Log.e("FirebaseCrashlytics", "Error fetching settings.", task.getException());
            return null;
        }
        return null;
    }

    @Override
    public void u(u1 u1Var) {
        int i10 = this.f16837a;
    }

    @Override
    public void v0(u1 u1Var, float f7, float f10) {
        int i10 = this.f16837a;
    }

    @Override
    public void v1(u1 u1Var, TLRPC.Document document) {
        int i10 = this.f16837a;
    }

    @Override
    public Object v2() {
        switch (this.f16837a) {
            case 8:
                return new TreeSet();
            default:
                return new ConcurrentHashMap();
        }
    }

    @Override
    public String w(long j3) {
        switch (this.f16837a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void w2() {
        int i10 = this.f16837a;
    }

    @Override
    public Object y0(u5 u5Var) {
        switch (this.f16837a) {
            case 15:
                qb.a aVar = new qb.a();
                aa aaVar = new aa(7);
                ReferenceQueue referenceQueue = aVar.f46111a;
                Set set = aVar.f46112b;
                set.add(new qb.l(aVar, referenceQueue, set, aaVar));
                Thread thread = new Thread(new s(25, referenceQueue, set), "MlKitCleaner");
                thread.setDaemon(true);
                thread.start();
                return aVar;
            default:
                return new k((Context) u5Var.a(Context.class));
        }
    }

    @Override
    public void y2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.f16837a;
    }

    public d(Context context) {
        this.f16837a = 11;
    }

    private final void D1() {
    }

    private final void D3() {
    }

    private final void E1() {
    }

    private final void E3() {
    }

    private final void F() {
    }

    private final void H3() {
    }

    private final void I3() {
    }

    private final void J2() {
    }

    private final void K2() {
    }

    private final void V() {
    }

    private final void f0() {
    }

    private final void i0() {
    }

    private final void t3() {
    }

    private final void u3() {
    }

    private final void y3() {
    }

    private final void z3() {
    }

    @Override
    public void K() {
    }

    @Override
    public void P() {
    }

    @Override
    public void onFirstFrameRendered() {
    }

    @Override
    public void x() {
    }

    private final void A3(int i10) {
    }

    private final void B2(u1 u1Var) {
    }

    private final void B3(int i10) {
    }

    private final void F3(MessageObject messageObject) {
    }

    private final void G3(MessageObject messageObject) {
    }

    private final void H2(u1 u1Var) {
    }

    private final void I0(u1 u1Var) {
    }

    private final void I2(u1 u1Var) {
    }

    private final void K0(u1 u1Var) {
    }

    private final void M0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void O0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void P0(u1 u1Var) {
    }

    private final void Q0(u1 u1Var) {
    }

    private final void R2(String str) {
    }

    private final void S2(String str) {
    }

    private final void W0(u1 u1Var) {
    }

    private final void X(u1 u1Var) {
    }

    private final void X2(u1 u1Var) {
    }

    private final void Y2(u1 u1Var) {
    }

    private final void Z0(u1 u1Var) {
    }

    private final void a0(u1 u1Var) {
    }

    private final void b3(u1 u1Var) {
    }

    private final void c0(u1 u1Var) {
    }

    private final void c3(u1 u1Var) {
    }

    private final void d0(u1 u1Var) {
    }

    private final void d3(MessageObject messageObject) {
    }

    private final void e3(MessageObject messageObject) {
    }

    private final void f3(u1 u1Var) {
    }

    private final void g1(u1 u1Var) {
    }

    private final void g3(u1 u1Var) {
    }

    private final void h1(u1 u1Var) {
    }

    private final void j3(u1 u1Var) {
    }

    private final void k0(u1 u1Var) {
    }

    private final void k3(u1 u1Var) {
    }

    private final void l2(u1 u1Var) {
    }

    private final void m3(u1 u1Var) {
    }

    private final void n0(u1 u1Var) {
    }

    private final void n2(u1 u1Var) {
    }

    private final void o3(u1 u1Var) {
    }

    private final void q2(u1 u1Var) {
    }

    private final void q3(u1 u1Var) {
    }

    private final void r3(u1 u1Var) {
    }

    private final void s0(u1 u1Var) {
    }

    private final void t1(u1 u1Var) {
    }

    private final void t2(u1 u1Var) {
    }

    private final void u0(u1 u1Var) {
    }

    private final void u1(u1 u1Var) {
    }

    private final void u2(u1 u1Var) {
    }

    private final void w1(u1 u1Var) {
    }

    private final void x1(u1 u1Var) {
    }

    private final void x2(u1 u1Var) {
    }

    private final void z2(u1 u1Var) {
    }

    @Override
    public void l(long j3) {
    }

    private final void B1(int i10, u1 u1Var) {
    }

    private final void C(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void C1(int i10, u1 u1Var) {
    }

    private final void T0(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void T2(u1 u1Var, long j3) {
    }

    private final void U0(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void U2(u1 u1Var, long j3) {
    }

    private final void a1(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void e1(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void h3(u1 u1Var, bi.f fVar) {
    }

    private final void i3(u1 u1Var, bi.f fVar) {
    }

    private final void m1(int i10, u1 u1Var) {
    }

    private final void n3(u1 u1Var, boolean z10) {
    }

    private final void o0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void o1(int i10, u1 u1Var) {
    }

    private final void o2(u1 u1Var, TLRPC.Document document) {
    }

    private final void p1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void p2(u1 u1Var, TLRPC.Document document) {
    }

    private final void p3(u1 u1Var, boolean z10) {
    }

    private final void q0(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void r1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void z(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void B0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final void F1(u1 u1Var, float f7, float f10) {
    }

    private final void F2(u1 u1Var, float f7, float f10) {
    }

    private final void G1(u1 u1Var, float f7, float f10) {
    }

    private final void G2(u1 u1Var, float f7, float f10) {
    }

    private final void L2(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void M2(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void Z2(u1 u1Var, float f7, float f10) {
    }

    private final void a3(u1 u1Var, float f7, float f10) {
    }

    private final void j1(u1 u1Var, int i10, int i11) {
    }

    private final void l1(u1 u1Var, int i10, int i11) {
    }

    private final void v(u1 u1Var, float f7, float f10) {
    }

    private final void y(u1 u1Var, float f7, float f10) {
    }

    private final void z0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    private final void I1(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void L1(u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void N2(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void O2(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void P2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void Q2(u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void y1(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final void z1(u1 u1Var, float f7, float f10, boolean z10) {
    }

    private final void P1(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void V2(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void W2(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void Y1(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void c2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void j2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void w0(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void x0(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void w3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void x3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}

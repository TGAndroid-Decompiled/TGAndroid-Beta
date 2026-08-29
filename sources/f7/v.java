package f7;

import a4.c0;
import android.content.Context;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Parcel;
import android.text.style.CharacterStyle;
import android.util.Log;
import bg.y3;
import com.google.android.exoplayer2.upstream.e0;
import com.google.android.exoplayer2.upstream.h0;
import com.google.android.exoplayer2.upstream.j0;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.p0;
import com.google.android.exoplayer2.upstream.s0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j3.t1;
import j7.l1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ShortBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.Executors;
import l.w;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.zn0;
import org.telegram.ui.lu0;
public final class v implements a4.m, androidx.car.app.messaging.model.b, a9.e, e9.a, Continuation, h3.a, k6.c, w, mf.a, n9.b, nf.a, o9.a, zn0, j1, pa.m, r4.q, com.google.android.gms.common.api.internal.s, a3.b {
    public static v f6682b;
    public final int f6683a;

    public v(int i10) {
        this.f6683a = i10;
    }

    public static long D(p2.u uVar) {
        Throwable th2 = (IOException) uVar.f45495c;
        if (!(th2 instanceof t1) && !(th2 instanceof FileNotFoundException) && !(th2 instanceof e0) && !(th2 instanceof p0)) {
            int i10 = com.google.android.exoplayer2.upstream.n.f3586b;
            while (th2 != null) {
                if (!(th2 instanceof com.google.android.exoplayer2.upstream.n) || ((com.google.android.exoplayer2.upstream.n) th2).f3587a != 2008) {
                    th2 = th2.getCause();
                } else {
                    return -9223372036854775807L;
                }
            }
            return Math.min((uVar.f45494b - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    public static MediaCodec q(a4.l lVar) {
        lVar.f99a.getClass();
        String str = lVar.f99a.f104a;
        f5.a.c("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        f5.a.q();
        return createByCodecName;
    }

    public static n9.a r(ya.a aVar) {
        return new n9.a(System.currentTimeMillis() + 3600000, new a5.c(8), new kb.d(true, false, false), 10.0d, 1.2d, 60);
    }

    public static k0 z(j0 j0Var, p2.u uVar) {
        IOException iOException = (IOException) uVar.f45495c;
        if (iOException instanceof h0) {
            int i10 = ((h0) iOException).d;
            if (i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503) {
                if (j0Var.a(1)) {
                    return new k0(1, 300000L);
                }
                if (j0Var.a(2)) {
                    return new k0(2, 60000L);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public boolean A1() {
        return false;
    }

    public int B(int i10) {
        if (i10 == 7) {
            return 6;
        }
        return 3;
    }

    @Override
    public boolean H1(s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public Object I0(a5.j jVar) {
        switch (this.f6683a) {
            case 5:
                return new Object();
            default:
                return new ab.d(jVar.c(ab.i.class));
        }
    }

    @Override
    public boolean J1() {
        return false;
    }

    @Override
    public boolean M0(long j10) {
        return false;
    }

    @Override
    public boolean O(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public void O1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        ye.d.s(s1Var.getContext(), str);
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public CharacterStyle P1(s1 s1Var) {
        return null;
    }

    @Override
    public boolean Q(s1 s1Var) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean R1(s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void S0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        shortBuffer2.put(shortBuffer);
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public void W(float f9, boolean z10) {
        y3.f2630b = f9 * 2.0f;
    }

    @Override
    public boolean W0(s1 s1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean W1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public sg.a X() {
        return null;
    }

    @Override
    public boolean Y(s1 s1Var) {
        return false;
    }

    @Override
    public lu0 Y1() {
        return null;
    }

    @Override
    public boolean Z(s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public void a(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override
    public boolean a2(long j10) {
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        v6.d dVar = (v6.d) ((v6.e) obj).u();
        n6.b bVar = new n6.b(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i10 = v6.c.f49435a;
        obtain.writeStrongBinder(bVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            dVar.f49436a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean c1(int i10, s1 s1Var) {
        return false;
    }

    @Override
    public boolean c2(s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public n9.a d(ya.a aVar, JSONObject jSONObject) {
        return r(aVar);
    }

    @Override
    public boolean d0() {
        return false;
    }

    @Override
    public long e() {
        return System.currentTimeMillis();
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public int f0(s1 s1Var) {
        return 0;
    }

    @Override
    public String g(s1 s1Var) {
        return null;
    }

    @Override
    public Object mo18get() {
        return new h6.a(Executors.newSingleThreadExecutor());
    }

    @Override
    public CharSequence getContentDescription() {
        return null;
    }

    @Override
    public boolean h(l.k kVar) {
        return false;
    }

    @Override
    public boolean h1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override
    public int i(Context context, String str, boolean z10) {
        return k6.e.d(context, str, z10);
    }

    @Override
    public boolean j0() {
        return false;
    }

    @Override
    public int k0() {
        return 0;
    }

    @Override
    public int l(Context context, String str) {
        return k6.e.a(context, str);
    }

    @Override
    public StackTraceElement[] m(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override
    public boolean m2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean n0(y5 y5Var) {
        return false;
    }

    @Override
    public Object p2() {
        switch (this.f6683a) {
            case 20:
                return new ArrayDeque();
            default:
                return new LinkedHashMap();
        }
    }

    @Override
    public s0 q0(r4.m mVar, r4.j jVar) {
        return new r4.p(mVar, jVar);
    }

    @Override
    public void r0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 <= i11) {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalArgumentException(l1.k(i12, "Illegal use of UpsampleAudioResampler. Channels:"));
            }
            int remaining = shortBuffer.remaining() / i12;
            int ceil = ((int) Math.ceil((i11 / i10) * remaining)) - remaining;
            float f9 = remaining;
            float f10 = f9 / f9;
            float f11 = ceil;
            float f12 = f11 / f11;
            while (remaining > 0 && ceil > 0) {
                if (f10 >= f12) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i12 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    remaining--;
                    f10 = remaining / f9;
                } else {
                    shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                    if (i12 == 2) {
                        shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                    }
                    ceil--;
                    f12 = ceil / f11;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
    }

    @Override
    public Object then(Task task) {
        return null;
    }

    @Override
    public boolean u2(int i10) {
        return false;
    }

    @Override
    public s0 v1() {
        return new r4.p(r4.m.f46998n, null);
    }

    @Override
    public boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override
    public a4.n x(a4.l lVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = q(lVar);
            f5.a.c("configureCodec");
            mediaCodec.configure(lVar.f100b, lVar.d, lVar.f102e, 0);
            f5.a.q();
            f5.a.c("startCodec");
            mediaCodec.start();
            f5.a.q();
            return new c0(mediaCodec);
        } catch (IOException | RuntimeException e10) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e10;
        }
    }

    @Override
    public String y(long j10) {
        return null;
    }

    @Override
    public l9 y2() {
        return null;
    }

    public v(v6.a aVar) {
        this.f6683a = 23;
    }

    @Override
    public void S1() {
    }

    @Override
    public void k() {
    }

    @Override
    public void k1() {
    }

    @Override
    public void p() {
    }

    @Override
    public void q2() {
    }

    @Override
    public void t() {
    }

    @Override
    public void v() {
    }

    @Override
    public void w2() {
    }

    @Override
    public void z0() {
    }

    @Override
    public void A(s1 s1Var) {
    }

    @Override
    public void C(s1 s1Var) {
    }

    @Override
    public void C1(s1 s1Var) {
    }

    @Override
    public void D0(s1 s1Var) {
    }

    @Override
    public void F(s1 s1Var) {
    }

    @Override
    public void F0(s1 s1Var) {
    }

    @Override
    public void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void J0(s1 s1Var) {
    }

    @Override
    public void K(s1 s1Var) {
    }

    @Override
    public void L1(s1 s1Var) {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void N0(s1 s1Var) {
    }

    @Override
    public void N1(MessageObject messageObject) {
    }

    @Override
    public void T(s1 s1Var) {
    }

    @Override
    public void X0(s1 s1Var) {
    }

    @Override
    public void Y0(s1 s1Var) {
    }

    @Override
    public void c0(int i10) {
    }

    @Override
    public void e2(s1 s1Var) {
    }

    @Override
    public void g0(s1 s1Var) {
    }

    @Override
    public void m0(String str) {
    }

    @Override
    public void n2(s1 s1Var) {
    }

    @Override
    public void o(s1 s1Var) {
    }

    @Override
    public void s(s1 s1Var) {
    }

    @Override
    public void u(s1 s1Var) {
    }

    @Override
    public void w(s1 s1Var) {
    }

    @Override
    public void y0(s1 s1Var) {
    }

    @Override
    public void E(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void F1(s1 s1Var, boolean z10) {
    }

    @Override
    public void I1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void L(int i10, s1 s1Var) {
    }

    @Override
    public void P0(int i10, s1 s1Var) {
    }

    @Override
    public void R0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void U1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void b(l.k kVar, boolean z10) {
    }

    @Override
    public void g2(s1 s1Var, long j10) {
    }

    @Override
    public void j2(s1 s1Var, hh.f fVar) {
    }

    @Override
    public void m1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void p1(s1 s1Var, TLRPC.Document document) {
    }

    @Override
    public void A0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B0(s1 s1Var, float f9, float f10) {
    }

    @Override
    public int M1(int i10, int i11, int i12) {
        return i10;
    }

    @Override
    public void V0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void e0(s1 s1Var, float f9, float f10) {
    }

    @Override
    public void p0(s1 s1Var, float f9, float f10) {
    }

    @Override
    public void u1(s1 s1Var, float f9, float f10) {
    }

    @Override
    public void x2(s1 s1Var, int i10, int i11) {
    }

    @Override
    public void V1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void t0(s1 s1Var, TLRPC.User user, float f9, float f10) {
    }

    @Override
    public void v0(s1 s1Var, float f9, float f10, boolean z10) {
    }

    @Override
    public void b2(s1 s1Var, int i10, float f9, float f10, boolean z10) {
    }

    @Override
    public void j(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void s2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }

    @Override
    public void S(s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
    }

    @Override
    public void Q1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}

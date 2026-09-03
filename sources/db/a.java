package db;

import a3.b;
import af.g;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Looper;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.util.Log;
import b6.l;
import c5.j;
import cb.h;
import cb.i;
import com.google.android.gms.common.api.q;
import com.google.android.gms.internal.play_billing.x3;
import e2.d;
import e3.c;
import h7.s;
import j$.util.DesugarCollections;
import j3.n0;
import java.nio.ShortBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Executors;
import k3.k;
import kh.f;
import o3.n;
import o3.o;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.wg;
import org.telegram.ui.cv0;
import org.xml.sax.Attributes;
import r3.m;
import r3.v;
import v2.e;
public class a implements l, b, d, g9.a, o, oe.b, of.a, k1, e, pf.a, q4.l, m, ra.m, ki, c9.e {
    public final int f4396a;

    public a(int i10) {
        this.f4396a = i10;
    }

    public static lf.m y3(Editable editable, int i10) {
        Object[] objArr = (lf.m[]) editable.getSpans(0, editable.length(), lf.m.class);
        if (objArr.length != 0) {
            for (int length = objArr.length; length > 0; length--) {
                int i11 = length - 1;
                if (editable.getSpanFlags(objArr[i11]) == 17) {
                    lf.m mVar = objArr[i11];
                    if (mVar.f12490a == i10) {
                        return mVar;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static boolean z3(boolean z4, String str, Editable editable, Attributes attributes) {
        int i10;
        boolean z10 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z4) {
                String a2 = lf.l.a("data-document-id", attributes);
                if (a2 != null) {
                    editable.setSpan(new u5(Long.parseLong(a2), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), u5.class);
                if (spans.length != 0) {
                    int length = spans.length;
                    while (true) {
                        if (length <= 0) {
                            break;
                        }
                        int i11 = length - 1;
                        if (editable.getSpanFlags(spans[i11]) == 17) {
                            obj = spans[i11];
                            break;
                        }
                        length--;
                    }
                }
                Object obj2 = (u5) obj;
                if (obj2 != null) {
                    int spanStart = editable.getSpanStart(obj2);
                    editable.removeSpan(obj2);
                    if (spanStart != editable.length()) {
                        editable.setSpan(obj2, spanStart, editable.length(), 33);
                        return true;
                    }
                    return true;
                }
            }
            return false;
        } else if (str.equals("spoiler")) {
            if (z4) {
                editable.setSpan(new lf.m(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object y32 = y3(editable, 0);
            if (y32 != null) {
                int spanStart2 = editable.getSpanStart(y32);
                editable.removeSpan(y32);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(y32, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else if (str.equals("pre")) {
            if (z4) {
                String a10 = lf.l.a("language", attributes);
                if (a10 == null) {
                    a10 = lf.l.a("lang", attributes);
                }
                if (a10 == null) {
                    a10 = lf.l.a("lng", attributes);
                }
                editable.setSpan(new lf.m(a10), editable.length(), editable.length(), 17);
                return true;
            }
            Object y33 = y3(editable, 1);
            if (y33 != null) {
                int spanStart3 = editable.getSpanStart(y33);
                editable.removeSpan(y33);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(y33, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else {
            int i12 = 3;
            if (str.equals("blockquote")) {
                if (z4) {
                    String a11 = lf.l.a("class", attributes);
                    if (lf.l.a("data-collapsed", attributes) != null || (a11 != null && a11.contains("telegram-collapsed-quote"))) {
                        z10 = true;
                    }
                    if (!z10) {
                        i12 = 2;
                    }
                    editable.setSpan(new lf.m(i12), editable.length(), editable.length(), 17);
                    return true;
                }
                lf.m[] mVarArr = (lf.m[]) editable.getSpans(0, editable.length(), lf.m.class);
                for (int length2 = mVarArr.length - 1; length2 >= 0; length2--) {
                    lf.m mVar = mVarArr[length2];
                    if (editable.getSpanFlags(mVar) == 17 && ((i10 = mVar.f12490a) == 2 || i10 == 3)) {
                        obj = mVar;
                        break;
                    }
                }
                if (obj != null) {
                    int spanStart4 = editable.getSpanStart(obj);
                    editable.removeSpan(obj);
                    if (spanStart4 != editable.length()) {
                        editable.setSpan(obj, spanStart4, editable.length(), 33);
                        return true;
                    }
                    return true;
                }
                return false;
            }
            if (str.equals("details")) {
                if (z4) {
                    editable.setSpan(new lf.m(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object y34 = y3(editable, 3);
                if (y34 != null) {
                    int spanStart5 = editable.getSpanStart(y34);
                    editable.removeSpan(y34);
                    if (spanStart5 != editable.length()) {
                        editable.setSpan(y34, spanStart5, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    @Override
    public void A(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override
    public boolean A0(MessageObject messageObject) {
        switch (this.f4396a) {
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void B0(wg wgVar) {
        wgVar.run();
    }

    @Override
    public void B1(t1 t1Var, float f10, float f11) {
        int i10 = this.f4396a;
    }

    @Override
    public void B2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
        int i10 = this.f4396a;
    }

    @Override
    public void C0(t1 t1Var) {
        int i10 = this.f4396a;
    }

    public boolean C3(CharSequence charSequence) {
        return false;
    }

    @Override
    public void D(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f4396a;
    }

    @Override
    public void D0() {
        int i10 = this.f4396a;
    }

    @Override
    public void E(t1 t1Var) {
        int i10 = this.f4396a;
    }

    @Override
    public boolean E2(int i10) {
        switch (this.f4396a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void F0(t1 t1Var, TLObject tLObject, boolean z4) {
        int i10 = this.f4396a;
    }

    @Override
    public void G0(t1 t1Var, float f10, float f11) {
        int i10 = this.f4396a;
    }

    @Override
    public void G2() {
        int i10 = this.f4396a;
    }

    @Override
    public void H(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f4396a;
    }

    @Override
    public boolean H1() {
        switch (this.f4396a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void H2(t1 t1Var, int i10, int i11) {
        int i12 = this.f4396a;
    }

    @Override
    public void I0(t1 t1Var) {
        int i10 = this.f4396a;
    }

    @Override
    public n9 I2() {
        switch (this.f4396a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void J1(t1 t1Var) {
        int i10 = this.f4396a;
    }

    @Override
    public void K(t1 t1Var) {
        int i10 = this.f4396a;
    }

    @Override
    public void K0(t1 t1Var) {
        int i10 = this.f4396a;
    }

    @Override
    public void L(int i10, t1 t1Var) {
        int i11 = this.f4396a;
    }

    @Override
    public void L1(t1 t1Var, boolean z4) {
        int i10 = this.f4396a;
    }

    @Override
    public void M(MessageObject messageObject) {
        int i10 = this.f4396a;
    }

    @Override
    public boolean N(t1 t1Var, TLRPC.TodoItem todoItem, boolean z4) {
        switch (this.f4396a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void N0(t1 t1Var) {
        int i10 = this.f4396a;
    }

    @Override
    public boolean N1(t1 t1Var, TLRPC.Chat chat) {
        switch (this.f4396a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean O() {
        switch (this.f4396a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void O1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f4396a;
    }

    @Override
    public boolean P(t1 t1Var) {
        switch (this.f4396a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean P1() {
        switch (this.f4396a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Q(t1 t1Var, f fVar) {
        int i10 = this.f4396a;
    }

    @Override
    public boolean R() {
        switch (this.f4396a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R0(long j10) {
        switch (this.f4396a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void R1(t1 t1Var) {
        int i10 = this.f4396a;
    }

    @Override
    public void S(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
        int i11 = this.f4396a;
    }

    @Override
    public void S0(t1 t1Var) {
        int i10 = this.f4396a;
    }

    @Override
    public int S1(int i10, int i11, int i12) {
        return i10 * 2;
    }

    @Override
    public void T(t1 t1Var) {
        int i10 = this.f4396a;
    }

    @Override
    public void T1(MessageObject messageObject) {
        int i10 = this.f4396a;
    }

    @Override
    public void U0(int i10, t1 t1Var) {
        int i11 = this.f4396a;
    }

    @Override
    public void U1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        switch (this.f4396a) {
            case 16:
            default:
                g.s(t1Var.getContext(), str);
                return;
        }
    }

    @Override
    public int V() {
        switch (this.f4396a) {
            case 16:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void W0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f4396a;
    }

    @Override
    public CharacterStyle W1(t1 t1Var) {
        switch (this.f4396a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void X0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i12 = 0; i12 < min; i12++) {
            short s6 = shortBuffer.get();
            shortBuffer2.put(s6);
            shortBuffer2.put(s6);
        }
    }

    @Override
    public void X1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f4396a;
    }

    @Override
    public boolean Y1(t1 t1Var, MessageObject messageObject) {
        switch (this.f4396a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public vg.a Z() {
        switch (this.f4396a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean a0(t1 t1Var) {
        switch (this.f4396a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a1(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
        int i10 = this.f4396a;
    }

    @Override
    public void a2() {
        int i10 = this.f4396a;
    }

    @Override
    public Object apply(Object obj) {
        return ((x3) obj).a();
    }

    @Override
    public int b(n0 n0Var) {
        if (n0Var.F != null) {
            return 1;
        }
        return 0;
    }

    @Override
    public boolean b1(t1 t1Var, boolean z4) {
        switch (this.f4396a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean b2() {
        return false;
    }

    @Override
    public n c(o3.l lVar, n0 n0Var) {
        return n.f16415j;
    }

    @Override
    public boolean c0(t1 t1Var, TLRPC.User user) {
        switch (this.f4396a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c1(t1 t1Var) {
        int i10 = this.f4396a;
    }

    @Override
    public void c2(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f4396a;
    }

    @Override
    public boolean d() {
        switch (this.f4396a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void d1(t1 t1Var) {
        int i10 = this.f4396a;
    }

    @Override
    public void d2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f4396a;
    }

    @Override
    public boolean e() {
        switch (this.f4396a) {
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public Object e0(j jVar) {
        switch (this.f4396a) {
            case 26:
                return new i();
            default:
                h hVar = (h) jVar.a(h.class);
                synchronized (s.class) {
                    byte b10 = (byte) (((byte) 1) | 2);
                    if (b10 == 3) {
                        s.c(new Object());
                    } else {
                        StringBuilder sb = new StringBuilder();
                        if ((b10 & 1) == 0) {
                            sb.append(" enableFirelog");
                        }
                        if ((b10 & 2) == 0) {
                            sb.append(" firelogEventType");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                    }
                }
                return new ab.a(0);
        }
    }

    @Override
    public boolean e2(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f4396a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Object f(q qVar) {
        return null;
    }

    @Override
    public void f0(int i10) {
        int i11 = this.f4396a;
    }

    @Override
    public String g(t1 t1Var) {
        switch (this.f4396a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean g0() {
        switch (this.f4396a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean g1(int i10, t1 t1Var) {
        switch (this.f4396a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public cv0 g2() {
        switch (this.f4396a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public Object mo38get() {
        switch (this.f4396a) {
            case 4:
                z9.d dVar = new z9.d(7);
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set != null) {
                    hashMap.put(v2.d.f48886a, new e3.b(30000L, 86400000L, set));
                    if (set != null) {
                        hashMap.put(v2.d.f48888c, new e3.b(1000L, 86400000L, set));
                        if (set != null) {
                            Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(c.f4920b)));
                            if (unmodifiableSet != null) {
                                hashMap.put(v2.d.f48887b, new e3.b(86400000L, 86400000L, unmodifiableSet));
                                if (hashMap.keySet().size() >= v2.d.values().length) {
                                    new HashMap();
                                    return new e3.a(dVar, hashMap);
                                }
                                throw new IllegalStateException("Not all priorities have been configured");
                            }
                            throw new NullPointerException("Null flags");
                        }
                        throw new NullPointerException("Null flags");
                    }
                    throw new NullPointerException("Null flags");
                }
                throw new NullPointerException("Null flags");
            default:
                return new j6.a(Executors.newSingleThreadExecutor());
        }
    }

    @Override
    public boolean h0() {
        return false;
    }

    @Override
    public void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f4396a;
    }

    @Override
    public void i0(t1 t1Var, float f10, float f11) {
        int i10 = this.f4396a;
    }

    @Override
    public v i2(int i10, int i11) {
        return new r3.j();
    }

    @Override
    public void j() {
        int i10 = this.f4396a;
    }

    @Override
    public boolean j2(long j10) {
        switch (this.f4396a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public long k() {
        throw new NoSuchElementException();
    }

    @Override
    public int k0(t1 t1Var) {
        switch (this.f4396a) {
            case 16:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void k2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
        int i11 = this.f4396a;
    }

    @Override
    public long l() {
        throw new NoSuchElementException();
    }

    @Override
    public void l0(t1 t1Var) {
        int i10 = this.f4396a;
    }

    @Override
    public boolean l2(t1 t1Var, TLRPC.TodoItem todoItem) {
        switch (this.f4396a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f4396a;
    }

    @Override
    public boolean m1(MessageObject messageObject) {
        int i10 = this.f4396a;
        return org.telegram.ui.b.a(messageObject);
    }

    @Override
    public void n(t1 t1Var) {
        int i10 = this.f4396a;
    }

    @Override
    public boolean n0() {
        switch (this.f4396a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean next() {
        return false;
    }

    @Override
    public void o() {
        int i10 = this.f4396a;
    }

    @Override
    public void o2(t1 t1Var) {
        int i10 = this.f4396a;
    }

    @Override
    public void p() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public void p0(String str) {
        int i10 = this.f4396a;
    }

    @Override
    public void p1() {
        int i10 = this.f4396a;
    }

    @Override
    public void q(t1 t1Var) {
        int i10 = this.f4396a;
    }

    @Override
    public boolean q0(u5 u5Var) {
        switch (this.f4396a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void q2(t1 t1Var, long j10) {
        int i10 = this.f4396a;
    }

    @Override
    public void r() {
        int i10 = this.f4396a;
    }

    @Override
    public void s(t1 t1Var) {
        int i10 = this.f4396a;
    }

    @Override
    public void s0(t1 t1Var, float f10, float f11) {
        int i10 = this.f4396a;
    }

    @Override
    public void s1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f4396a;
    }

    @Override
    public void t(t1 t1Var) {
        int i10 = this.f4396a;
    }

    @Override
    public void u(int i10, Object obj) {
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
    public void u0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 >= i11) {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalArgumentException(l.d.j(i12, "Illegal use of DownsampleAudioResampler. Channels:"));
            }
            int remaining = shortBuffer.remaining() / i12;
            int ceil = (int) Math.ceil((i11 / i10) * remaining);
            int i13 = remaining - ceil;
            float f10 = ceil;
            float f11 = f10 / f10;
            float f12 = i13;
            float f13 = f12 / f12;
            while (ceil > 0 && i13 > 0) {
                if (f11 >= f13) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i12 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    ceil--;
                    f11 = ceil / f10;
                } else {
                    shortBuffer.position(shortBuffer.position() + i12);
                    i13--;
                    f13 = i13 / f12;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler");
    }

    @Override
    public String v(long j10) {
        switch (this.f4396a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void v1(t1 t1Var, TLRPC.Document document) {
        int i10 = this.f4396a;
    }

    @Override
    public boolean v2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f4396a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public oe.a w(f7.b bVar) {
        return new ke.j(bVar);
    }

    @Override
    public void w2(t1 t1Var) {
        int i10 = this.f4396a;
    }

    @Override
    public o3.i x(o3.l lVar, n0 n0Var) {
        if (n0Var.F == null) {
            return null;
        }
        return new o3.s(new o3.h(new Exception(), 6001));
    }

    @Override
    public void x0(t1 t1Var, TLRPC.User user, float f10, float f11) {
        int i10 = this.f4396a;
    }

    @Override
    public void y(t1 t1Var) {
        int i10 = this.f4396a;
    }

    @Override
    public Object y2() {
        switch (this.f4396a) {
            case 22:
                return new ArrayDeque();
            default:
                return new LinkedHashMap();
        }
    }

    @Override
    public void z(t1 t1Var) {
        int i10 = this.f4396a;
    }

    @Override
    public void z0(t1 t1Var, float f10, float f11, boolean z4) {
        int i10 = this.f4396a;
    }

    @Override
    public void z2() {
        int i10 = this.f4396a;
    }

    private final void A3() {
    }

    private final void B3() {
    }

    private final void F3() {
    }

    private final void G3() {
    }

    private final void I() {
    }

    private final void J() {
    }

    private final void J3() {
    }

    private final void K1() {
    }

    private final void K3() {
    }

    private final void M1() {
    }

    private final void N3() {
    }

    private final void O3() {
    }

    private final void Q2() {
    }

    private final void R2() {
    }

    private final void b0() {
    }

    private final void d0() {
    }

    @Override
    public void Q0() {
    }

    @Override
    public void a() {
    }

    @Override
    public void i1() {
    }

    @Override
    public void release() {
    }

    @Override
    public void y0() {
    }

    private final void A1(t1 t1Var) {
    }

    private final void C1(t1 t1Var) {
    }

    private final void C2(t1 t1Var) {
    }

    private final void D2(t1 t1Var) {
    }

    private final void F2(t1 t1Var) {
    }

    private final void H3(int i10) {
    }

    private final void I3(int i10) {
    }

    private final void J2(t1 t1Var) {
    }

    private final void K2(t1 t1Var) {
    }

    private final void L0(t1 t1Var) {
    }

    private final void L2(t1 t1Var) {
    }

    private final void L3(MessageObject messageObject) {
    }

    private final void M0(t1 t1Var) {
    }

    private final void M3(MessageObject messageObject) {
    }

    private final void O0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void O2(t1 t1Var) {
    }

    private final void P0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void P2(t1 t1Var) {
    }

    private final void T0(t1 t1Var) {
    }

    private final void U(t1 t1Var) {
    }

    private final void V0(t1 t1Var) {
    }

    private final void W(t1 t1Var) {
    }

    private final void X(t1 t1Var) {
    }

    private final void Y(t1 t1Var) {
    }

    private final void Y2(String str) {
    }

    private final void Z2(String str) {
    }

    private final void e3(t1 t1Var) {
    }

    private final void f1(t1 t1Var) {
    }

    private final void f3(t1 t1Var) {
    }

    private final void h1(t1 t1Var) {
    }

    private final void i3(t1 t1Var) {
    }

    private final void j0(t1 t1Var) {
    }

    private final void j3(t1 t1Var) {
    }

    private final void k3(MessageObject messageObject) {
    }

    private final void l1(t1 t1Var) {
    }

    private final void l3(MessageObject messageObject) {
    }

    private final void m0(t1 t1Var) {
    }

    private final void m3(t1 t1Var) {
    }

    private final void n1(t1 t1Var) {
    }

    private final void n3(t1 t1Var) {
    }

    private final void q3(t1 t1Var) {
    }

    private final void r3(t1 t1Var) {
    }

    private final void s3(t1 t1Var) {
    }

    private final void t0(t1 t1Var) {
    }

    private final void t2(t1 t1Var) {
    }

    private final void u2(t1 t1Var) {
    }

    private final void u3(t1 t1Var) {
    }

    private final void v0(t1 t1Var) {
    }

    private final void w3(t1 t1Var) {
    }

    private final void x3(t1 t1Var) {
    }

    private final void y1(t1 t1Var) {
    }

    private final void z1(t1 t1Var) {
    }

    @Override
    public void Z0(Object obj) {
    }

    @Override
    public void m2(r3.s sVar) {
    }

    @Override
    public void o1(TLRPC.User user) {
    }

    private final void A2(t1 t1Var, TLRPC.Document document) {
    }

    private final void F(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void F1(int i10, t1 t1Var) {
    }

    private final void G(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void G1(int i10, t1 t1Var) {
    }

    private final void Y0(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void a3(t1 t1Var, long j10) {
    }

    private final void b3(t1 t1Var, long j10) {
    }

    private final void e1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void j1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void k1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void o0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void o3(t1 t1Var, f fVar) {
    }

    private final void p3(t1 t1Var, f fVar) {
    }

    private final void r0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void t1(int i10, t1 t1Var) {
    }

    private final void t3(t1 t1Var, boolean z4) {
    }

    private final void u1(int i10, t1 t1Var) {
    }

    private final void v3(t1 t1Var, boolean z4) {
    }

    private final void w1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void x1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void x2(t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public void h(Looper looper, k kVar) {
    }

    private final void B(t1 t1Var, float f10, float f11) {
    }

    private final void C(t1 t1Var, float f10, float f11) {
    }

    private final void H0(t1 t1Var, TLObject tLObject, boolean z4) {
    }

    private final void J0(t1 t1Var, TLObject tLObject, boolean z4) {
    }

    private final void M2(t1 t1Var, float f10, float f11) {
    }

    private final void N2(t1 t1Var, float f10, float f11) {
    }

    private final void Q1(t1 t1Var, float f10, float f11) {
    }

    private final void S2(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    private final void T2(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    private final void V1(t1 t1Var, float f10, float f11) {
    }

    private final void g3(t1 t1Var, float f10, float f11) {
    }

    private final void h3(t1 t1Var, float f10, float f11) {
    }

    private final void q1(t1 t1Var, int i10, int i11) {
    }

    private final void r1(t1 t1Var, int i10, int i11) {
    }

    private final void D1(t1 t1Var, float f10, float f11, boolean z4) {
    }

    private final void E1(t1 t1Var, float f10, float f11, boolean z4) {
    }

    private final void U2(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void V2(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void W2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void X2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void Z1(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void h2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void c3(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void d3(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void n2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final void p2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final void r2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    private final void s2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    private final void E0(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    private final void w0(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    private final void D3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void E3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override
    public void f2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }

    @Override
    public void I1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
    }
}

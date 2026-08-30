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
import com.google.android.gms.common.api.q;
import com.google.android.gms.internal.play_billing.x3;
import e2.d;
import e3.c;
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
import jh.f;
import k3.k;
import kh.a2;
import o3.h;
import o3.i;
import o3.n;
import o3.o;
import o3.s;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.wg;
import org.telegram.ui.vu0;
import org.xml.sax.Attributes;
import r3.j;
import r3.m;
import r3.v;
import v2.e;
public class a implements l, b, d, g9.a, o, oe.b, of.a, k1, e, pf.a, q4.l, m, ra.m, ji, c9.e {
    public final int f4314a;

    public a(int i10) {
        this.f4314a = i10;
    }

    public static lf.m y3(Editable editable, int i10) {
        Object[] objArr = (lf.m[]) editable.getSpans(0, editable.length(), lf.m.class);
        if (objArr.length != 0) {
            for (int length = objArr.length; length > 0; length--) {
                int i11 = length - 1;
                if (editable.getSpanFlags(objArr[i11]) == 17) {
                    lf.m mVar = objArr[i11];
                    if (mVar.f12040a == i10) {
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
                    if (editable.getSpanFlags(mVar) == 17 && ((i10 = mVar.f12040a) == 2 || i10 == 3)) {
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
    public void A(t1 t1Var) {
        int i10 = this.f4314a;
    }

    @Override
    public boolean A0(MessageObject messageObject) {
        switch (this.f4314a) {
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void A2() {
        int i10 = this.f4314a;
    }

    @Override
    public long B() {
        throw new NoSuchElementException();
    }

    @Override
    public void B0(t1 t1Var) {
        int i10 = this.f4314a;
    }

    @Override
    public void B2(t1 t1Var, int i10, int i11) {
        int i12 = this.f4314a;
    }

    @Override
    public void C0() {
        int i10 = this.f4314a;
    }

    @Override
    public n9 C2() {
        switch (this.f4314a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    public boolean C3(CharSequence charSequence) {
        return false;
    }

    @Override
    public boolean D1() {
        switch (this.f4314a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f4314a;
    }

    @Override
    public void E0(t1 t1Var, TLObject tLObject, boolean z4) {
        int i10 = this.f4314a;
    }

    @Override
    public void E1(t1 t1Var) {
        int i10 = this.f4314a;
    }

    @Override
    public void F(t1 t1Var) {
        int i10 = this.f4314a;
    }

    @Override
    public void F0(t1 t1Var, float f10, float f11) {
        int i10 = this.f4314a;
    }

    @Override
    public void G1(t1 t1Var, boolean z4) {
        int i10 = this.f4314a;
    }

    @Override
    public void H0(t1 t1Var) {
        int i10 = this.f4314a;
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f4314a;
    }

    @Override
    public boolean I1(t1 t1Var, TLRPC.Chat chat) {
        switch (this.f4314a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public i J(o3.l lVar, n0 n0Var) {
        if (n0Var.F == null) {
            return null;
        }
        return new s(new h(new Exception(), 6001));
    }

    @Override
    public void J0(t1 t1Var) {
        int i10 = this.f4314a;
    }

    @Override
    public void J1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f4314a;
    }

    @Override
    public void K(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override
    public boolean K1() {
        switch (this.f4314a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void L(t1 t1Var) {
        int i10 = this.f4314a;
    }

    @Override
    public void L0(t1 t1Var) {
        int i10 = this.f4314a;
    }

    @Override
    public void M(t1 t1Var, f fVar) {
        int i10 = this.f4314a;
    }

    @Override
    public void M1(t1 t1Var) {
        int i10 = this.f4314a;
    }

    @Override
    public void N(int i10, t1 t1Var) {
        int i11 = this.f4314a;
    }

    @Override
    public int N1(int i10, int i11, int i12) {
        return i10 * 2;
    }

    @Override
    public void O(MessageObject messageObject) {
        int i10 = this.f4314a;
    }

    @Override
    public boolean O0(long j10) {
        switch (this.f4314a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void O1(MessageObject messageObject) {
        int i10 = this.f4314a;
    }

    @Override
    public boolean P(t1 t1Var, TLRPC.TodoItem todoItem, boolean z4) {
        switch (this.f4314a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void P0(t1 t1Var) {
        int i10 = this.f4314a;
    }

    @Override
    public void P1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        switch (this.f4314a) {
            case 16:
            default:
                g.s(t1Var.getContext(), str);
                return;
        }
    }

    @Override
    public boolean Q() {
        switch (this.f4314a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R(t1 t1Var) {
        switch (this.f4314a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void R0(int i10, t1 t1Var) {
        int i11 = this.f4314a;
    }

    @Override
    public CharacterStyle R1(t1 t1Var) {
        switch (this.f4314a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean S() {
        switch (this.f4314a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void S1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f4314a;
    }

    @Override
    public void T(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
        int i11 = this.f4314a;
    }

    @Override
    public void T0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f4314a;
    }

    @Override
    public boolean T1(t1 t1Var, MessageObject messageObject) {
        switch (this.f4314a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void U(t1 t1Var) {
        int i10 = this.f4314a;
    }

    @Override
    public void U0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i12 = 0; i12 < min; i12++) {
            short s6 = shortBuffer.get();
            shortBuffer2.put(s6);
            shortBuffer2.put(s6);
        }
    }

    @Override
    public boolean V() {
        return false;
    }

    @Override
    public void V1() {
        int i10 = this.f4314a;
    }

    @Override
    public int W() {
        switch (this.f4314a) {
            case 16:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void W0(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
        int i10 = this.f4314a;
    }

    @Override
    public void X1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f4314a;
    }

    @Override
    public boolean Y0(t1 t1Var, boolean z4) {
        switch (this.f4314a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Y1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f4314a;
    }

    @Override
    public ug.a Z() {
        switch (this.f4314a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Z0(t1 t1Var) {
        int i10 = this.f4314a;
    }

    @Override
    public boolean Z1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f4314a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean a0(t1 t1Var) {
        switch (this.f4314a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a1(t1 t1Var) {
        int i10 = this.f4314a;
    }

    @Override
    public vu0 a2() {
        switch (this.f4314a) {
            case 16:
                return null;
            default:
                return null;
        }
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
    public n c(o3.l lVar, n0 n0Var) {
        return n.f16272j;
    }

    @Override
    public v c2(int i10, int i11) {
        return new j();
    }

    @Override
    public boolean d() {
        switch (this.f4314a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean d0(t1 t1Var, TLRPC.User user) {
        switch (this.f4314a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean d1(int i10, t1 t1Var) {
        switch (this.f4314a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean d2(long j10) {
        switch (this.f4314a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean e() {
        switch (this.f4314a) {
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void e2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
        int i11 = this.f4314a;
    }

    @Override
    public Object f(q qVar) {
        return null;
    }

    @Override
    public Object f0(c5.j jVar) {
        switch (this.f4314a) {
            case 26:
                return new cb.i();
            default:
                cb.h hVar = (cb.h) jVar.a(cb.h.class);
                synchronized (h7.s.class) {
                    byte b10 = (byte) (((byte) 1) | 2);
                    if (b10 == 3) {
                        h7.s.b(new Object());
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
    public boolean f2(t1 t1Var, TLRPC.TodoItem todoItem) {
        switch (this.f4314a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public String g(t1 t1Var) {
        switch (this.f4314a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void g0(int i10) {
        int i11 = this.f4314a;
    }

    @Override
    public Object mo0get() {
        switch (this.f4314a) {
            case 4:
                z9.d dVar = new z9.d(7);
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set != null) {
                    hashMap.put(v2.d.f45560a, new e3.b(30000L, 86400000L, set));
                    if (set != null) {
                        hashMap.put(v2.d.f45562c, new e3.b(1000L, 86400000L, set));
                        if (set != null) {
                            Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(c.f5084b)));
                            if (unmodifiableSet != null) {
                                hashMap.put(v2.d.f45561b, new e3.b(86400000L, 86400000L, unmodifiableSet));
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
        switch (this.f4314a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f4314a;
    }

    @Override
    public void i0(t1 t1Var, float f10, float f11) {
        int i10 = this.f4314a;
    }

    @Override
    public void i2(t1 t1Var) {
        int i10 = this.f4314a;
    }

    @Override
    public void j() {
        int i10 = this.f4314a;
    }

    @Override
    public boolean j1(MessageObject messageObject) {
        int i10 = this.f4314a;
        return org.telegram.ui.b.a(messageObject);
    }

    @Override
    public boolean k() {
        return false;
    }

    @Override
    public int k0(t1 t1Var) {
        switch (this.f4314a) {
            case 16:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void k2(t1 t1Var, long j10) {
        int i10 = this.f4314a;
    }

    @Override
    public void l() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public void l0(t1 t1Var) {
        int i10 = this.f4314a;
    }

    @Override
    public void l1() {
        int i10 = this.f4314a;
    }

    @Override
    public void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f4314a;
    }

    @Override
    public void n(t1 t1Var) {
        int i10 = this.f4314a;
    }

    @Override
    public boolean n0() {
        switch (this.f4314a) {
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
        int i10 = this.f4314a;
    }

    @Override
    public void o1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f4314a;
    }

    @Override
    public long p() {
        throw new NoSuchElementException();
    }

    @Override
    public void p0(String str) {
        int i10 = this.f4314a;
    }

    @Override
    public boolean p2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f4314a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void q(t1 t1Var) {
        int i10 = this.f4314a;
    }

    @Override
    public boolean q0(u5 u5Var) {
        switch (this.f4314a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void q2(t1 t1Var) {
        int i10 = this.f4314a;
    }

    @Override
    public void r1(t1 t1Var, TLRPC.Document document) {
        int i10 = this.f4314a;
    }

    @Override
    public void s() {
        int i10 = this.f4314a;
    }

    @Override
    public void s0(t1 t1Var, float f10, float f11) {
        int i10 = this.f4314a;
    }

    @Override
    public Object s2() {
        switch (this.f4314a) {
            case 22:
                return new ArrayDeque();
            default:
                return new LinkedHashMap();
        }
    }

    @Override
    public void t(t1 t1Var) {
        int i10 = this.f4314a;
    }

    @Override
    public void t2() {
        int i10 = this.f4314a;
    }

    @Override
    public void u(t1 t1Var) {
        int i10 = this.f4314a;
    }

    @Override
    public void u0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 >= i11) {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalArgumentException(a2.j(i12, "Illegal use of DownsampleAudioResampler. Channels:"));
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
    public void v(int i10, Object obj) {
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
    public void v2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
        int i10 = this.f4314a;
    }

    @Override
    public String w(long j10) {
        switch (this.f4314a) {
            case 16:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void x(wg wgVar) {
        wgVar.run();
    }

    @Override
    public void x1(t1 t1Var, float f10, float f11) {
        int i10 = this.f4314a;
    }

    @Override
    public void y(t1 t1Var) {
        int i10 = this.f4314a;
    }

    @Override
    public void y0(t1 t1Var, TLRPC.User user, float f10, float f11) {
        int i10 = this.f4314a;
    }

    @Override
    public boolean y2(int i10) {
        switch (this.f4314a) {
            case 16:
                return false;
            default:
                return false;
        }
    }

    @Override
    public oe.a z(f7.b bVar) {
        return new ke.j(bVar);
    }

    @Override
    public void z0(t1 t1Var, float f10, float f11, boolean z4) {
        int i10 = this.f4314a;
    }

    private final void A3() {
    }

    private final void B3() {
    }

    private final void F3() {
    }

    private final void G3() {
    }

    private final void J3() {
    }

    private final void K3() {
    }

    private final void N3() {
    }

    private final void O3() {
    }

    private final void Q2() {
    }

    private final void R2() {
    }

    private final void h2() {
    }

    private final void j0() {
    }

    private final void j2() {
    }

    private final void m0() {
    }

    private final void w0() {
    }

    private final void x0() {
    }

    @Override
    public void C() {
    }

    @Override
    public void a() {
    }

    @Override
    public void f1() {
    }

    @Override
    public void r() {
    }

    @Override
    public void release() {
    }

    private final void C1(t1 t1Var) {
    }

    private final void D0(t1 t1Var) {
    }

    private final void D2(t1 t1Var) {
    }

    private final void F1(t1 t1Var) {
    }

    private final void G0(t1 t1Var) {
    }

    private final void G2(t1 t1Var) {
    }

    private final void H1(t1 t1Var) {
    }

    private final void H2(t1 t1Var) {
    }

    private final void H3(int i10) {
    }

    private final void I2(t1 t1Var) {
    }

    private final void I3(int i10) {
    }

    private final void J2(t1 t1Var) {
    }

    private final void K2(t1 t1Var) {
    }

    private final void L1(t1 t1Var) {
    }

    private final void L2(t1 t1Var) {
    }

    private final void L3(MessageObject messageObject) {
    }

    private final void M0(t1 t1Var) {
    }

    private final void M3(MessageObject messageObject) {
    }

    private final void N0(t1 t1Var) {
    }

    private final void O2(t1 t1Var) {
    }

    private final void P2(t1 t1Var) {
    }

    private final void Y2(String str) {
    }

    private final void Z2(String str) {
    }

    private final void b1(t1 t1Var) {
    }

    private final void c1(t1 t1Var) {
    }

    private final void e1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void e3(t1 t1Var) {
    }

    private final void f3(t1 t1Var) {
    }

    private final void g1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void h1(t1 t1Var) {
    }

    private final void i1(t1 t1Var) {
    }

    private final void i3(t1 t1Var) {
    }

    private final void j3(t1 t1Var) {
    }

    private final void k3(MessageObject messageObject) {
    }

    private final void l3(MessageObject messageObject) {
    }

    private final void m3(t1 t1Var) {
    }

    private final void n1(t1 t1Var) {
    }

    private final void n3(t1 t1Var) {
    }

    private final void o0(t1 t1Var) {
    }

    private final void p1(t1 t1Var) {
    }

    private final void q3(t1 t1Var) {
    }

    private final void r0(t1 t1Var) {
    }

    private final void r3(t1 t1Var) {
    }

    private final void s3(t1 t1Var) {
    }

    private final void t0(t1 t1Var) {
    }

    private final void t1(t1 t1Var) {
    }

    private final void u1(t1 t1Var) {
    }

    private final void u3(t1 t1Var) {
    }

    private final void v0(t1 t1Var) {
    }

    private final void w3(t1 t1Var) {
    }

    private final void x3(t1 t1Var) {
    }

    private final void z2(t1 t1Var) {
    }

    @Override
    public void D(Object obj) {
    }

    @Override
    public void G(TLRPC.User user) {
    }

    @Override
    public void g2(r3.s sVar) {
    }

    private final void A1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void B1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void E2(t1 t1Var, TLRPC.Document document) {
    }

    private final void F2(t1 t1Var, TLRPC.Document document) {
    }

    private final void I0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void K0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void W1(int i10, t1 t1Var) {
    }

    private final void a3(t1 t1Var, long j10) {
    }

    private final void b2(int i10, t1 t1Var) {
    }

    private final void b3(t1 t1Var, long j10) {
    }

    private final void c0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void e0(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void k1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void m1(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void o3(t1 t1Var, f fVar) {
    }

    private final void p3(t1 t1Var, f fVar) {
    }

    private final void q1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void s1(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void t3(t1 t1Var, boolean z4) {
    }

    private final void v3(t1 t1Var, boolean z4) {
    }

    private final void y1(int i10, t1 t1Var) {
    }

    private final void z1(int i10, t1 t1Var) {
    }

    @Override
    public void h(Looper looper, k kVar) {
    }

    private final void M2(t1 t1Var, float f10, float f11) {
    }

    private final void N2(t1 t1Var, float f10, float f11) {
    }

    private final void S2(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    private final void T2(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    private final void V0(t1 t1Var, TLObject tLObject, boolean z4) {
    }

    private final void X0(t1 t1Var, TLObject tLObject, boolean z4) {
    }

    private final void Y(t1 t1Var, float f10, float f11) {
    }

    private final void b0(t1 t1Var, float f10, float f11) {
    }

    private final void g3(t1 t1Var, float f10, float f11) {
    }

    private final void h3(t1 t1Var, float f10, float f11) {
    }

    private final void l2(t1 t1Var, float f10, float f11) {
    }

    private final void m2(t1 t1Var, float f10, float f11) {
    }

    private final void v1(t1 t1Var, int i10, int i11) {
    }

    private final void w1(t1 t1Var, int i10, int i11) {
    }

    private final void Q1(t1 t1Var, float f10, float f11, boolean z4) {
    }

    private final void U1(t1 t1Var, float f10, float f11, boolean z4) {
    }

    private final void U2(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void V2(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void W2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void X2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void n2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void o2(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void c3(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void d3(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void r2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final void u2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final void w2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    private final void x2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    private final void Q0(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    private final void S0(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    private final void D3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void E3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override
    public void X(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }

    @Override
    public void H(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
    }
}

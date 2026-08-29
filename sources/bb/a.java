package bb;

import a4.z;
import a5.j;
import a9.e;
import android.graphics.Paint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.os.SystemClock;
import android.text.Editable;
import android.text.style.CharacterStyle;
import com.google.android.exoplayer2.upstream.o;
import com.google.android.exoplayer2.upstream.s0;
import dc.g;
import f5.d0;
import hh.f;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import kc.c;
import n4.l;
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
import org.telegram.ui.lu0;
import org.xml.sax.Attributes;
import pa.m;
import r0.s;
import ye.d;
import za.b;
public class a implements z, h3.a, mf.a, l, nf.a, s0, j1, m, s, og.a, e {
    public static a f2041b;
    public static a f2042c;
    public final int f2043a;

    public a(int i10) {
        this.f2043a = i10;
    }

    public static String B3(c cVar) {
        String str = cVar.f13614a;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = (String) cVar.a().get("alt");
            if (str2 != null && str2.length() != 0) {
                return str2;
            }
            return "￼";
        } else if ("iframe".equals(str)) {
            return " ";
        } else {
            return null;
        }
    }

    public static void E3(String str) {
        if (str != null && str.length() != 0) {
            if (!str.startsWith("sk_")) {
                return;
            }
            throw new g("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
        throw new g("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
    }

    public static final CharSequence H3(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public static jf.m n3(Editable editable, int i10) {
        Object[] objArr = (jf.m[]) editable.getSpans(0, editable.length(), jf.m.class);
        if (objArr.length != 0) {
            for (int length = objArr.length; length > 0; length--) {
                int i11 = length - 1;
                if (editable.getSpanFlags(objArr[i11]) == 17) {
                    jf.m mVar = objArr[i11];
                    if (mVar.f11654a == i10) {
                        return mVar;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static boolean o3(boolean z10, String str, Editable editable, Attributes attributes) {
        int i10;
        boolean z11 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z10) {
                String a2 = jf.l.a("data-document-id", attributes);
                if (a2 != null) {
                    editable.setSpan(new y5(Long.parseLong(a2), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), y5.class);
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
                Object obj2 = (y5) obj;
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
            if (z10) {
                editable.setSpan(new jf.m(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object n32 = n3(editable, 0);
            if (n32 != null) {
                int spanStart2 = editable.getSpanStart(n32);
                editable.removeSpan(n32);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(n32, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else if (str.equals("pre")) {
            if (z10) {
                String a10 = jf.l.a("language", attributes);
                if (a10 == null) {
                    a10 = jf.l.a("lang", attributes);
                }
                if (a10 == null) {
                    a10 = jf.l.a("lng", attributes);
                }
                editable.setSpan(new jf.m(a10), editable.length(), editable.length(), 17);
                return true;
            }
            Object n33 = n3(editable, 1);
            if (n33 != null) {
                int spanStart3 = editable.getSpanStart(n33);
                editable.removeSpan(n33);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(n33, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else {
            int i12 = 3;
            if (str.equals("blockquote")) {
                if (z10) {
                    String a11 = jf.l.a("class", attributes);
                    if (jf.l.a("data-collapsed", attributes) != null || (a11 != null && a11.contains("telegram-collapsed-quote"))) {
                        z11 = true;
                    }
                    if (!z11) {
                        i12 = 2;
                    }
                    editable.setSpan(new jf.m(i12), editable.length(), editable.length(), 17);
                    return true;
                }
                jf.m[] mVarArr = (jf.m[]) editable.getSpans(0, editable.length(), jf.m.class);
                for (int length2 = mVarArr.length - 1; length2 >= 0; length2--) {
                    jf.m mVar = mVarArr[length2];
                    if (editable.getSpanFlags(mVar) == 17 && ((i10 = mVar.f11654a) == 2 || i10 == 3)) {
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
                if (z10) {
                    editable.setSpan(new jf.m(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object n34 = n3(editable, 3);
                if (n34 != null) {
                    int spanStart5 = editable.getSpanStart(n34);
                    editable.removeSpan(n34);
                    if (spanStart5 != editable.length()) {
                        editable.setSpan(n34, spanStart5, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public static short s3(short s10, short s11) {
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
    public void A(s1 s1Var) {
        int i10 = this.f2043a;
    }

    @Override
    public void A0(s1 s1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f2043a;
    }

    @Override
    public boolean A1() {
        switch (this.f2043a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void B0(s1 s1Var, float f9, float f10) {
        int i10 = this.f2043a;
    }

    @Override
    public void C(s1 s1Var) {
        int i10 = this.f2043a;
    }

    @Override
    public void C1(s1 s1Var) {
        int i10 = this.f2043a;
    }

    @Override
    public void D0(s1 s1Var) {
        int i10 = this.f2043a;
    }

    @Override
    public void E(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f2043a;
    }

    @Override
    public void F(s1 s1Var) {
        int i10 = this.f2043a;
    }

    @Override
    public void F0(s1 s1Var) {
        int i10 = this.f2043a;
    }

    @Override
    public void F1(s1 s1Var, boolean z10) {
        int i10 = this.f2043a;
    }

    @Override
    public void H(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f2043a;
    }

    @Override
    public boolean H1(s1 s1Var, TLRPC.Chat chat) {
        switch (this.f2043a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Object I0(j jVar) {
        switch (this.f2043a) {
            case 25:
                return new za.c(jVar.r(b.class));
            default:
                return new b(jVar.c(ya.a.class));
        }
    }

    @Override
    public void I1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f2043a;
    }

    @Override
    public void J0(s1 s1Var) {
        int i10 = this.f2043a;
    }

    @Override
    public boolean J1() {
        switch (this.f2043a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void K(s1 s1Var) {
        int i10 = this.f2043a;
    }

    @Override
    public void L(int i10, s1 s1Var) {
        int i11 = this.f2043a;
    }

    @Override
    public void L1(s1 s1Var) {
        int i10 = this.f2043a;
    }

    @Override
    public boolean M0(long j10) {
        switch (this.f2043a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int M1(int i10, int i11, int i12) {
        return i10 / 2;
    }

    @Override
    public void N(MessageObject messageObject) {
        int i10 = this.f2043a;
    }

    @Override
    public void N0(s1 s1Var) {
        int i10 = this.f2043a;
    }

    @Override
    public void N1(MessageObject messageObject) {
        int i10 = this.f2043a;
    }

    @Override
    public boolean O(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f2043a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void O1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f2043a) {
            case 17:
            default:
                d.s(s1Var.getContext(), str);
                return;
        }
    }

    @Override
    public boolean P() {
        switch (this.f2043a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void P0(int i10, s1 s1Var) {
        int i11 = this.f2043a;
    }

    @Override
    public CharacterStyle P1(s1 s1Var) {
        switch (this.f2043a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean Q(s1 s1Var) {
        switch (this.f2043a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Q1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f2043a;
    }

    @Override
    public boolean R() {
        switch (this.f2043a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void R0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f2043a;
    }

    @Override
    public boolean R1(s1 s1Var, MessageObject messageObject) {
        switch (this.f2043a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void S(s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
        int i11 = this.f2043a;
    }

    @Override
    public void S0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i12 = 0; i12 < min; i12++) {
            shortBuffer2.put(s3(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override
    public void S1() {
        int i10 = this.f2043a;
    }

    @Override
    public void T(s1 s1Var) {
        int i10 = this.f2043a;
    }

    @Override
    public void U1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f2043a;
    }

    @Override
    public int V() {
        switch (this.f2043a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void V0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f2043a;
    }

    @Override
    public void V1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f2043a;
    }

    @Override
    public boolean W0(s1 s1Var, boolean z10) {
        switch (this.f2043a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean W1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f2043a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public sg.a X() {
        switch (this.f2043a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void X0(s1 s1Var) {
        int i10 = this.f2043a;
    }

    @Override
    public boolean Y(s1 s1Var) {
        switch (this.f2043a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Y0(s1 s1Var) {
        int i10 = this.f2043a;
    }

    @Override
    public lu0 Y1() {
        switch (this.f2043a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean Z(s1 s1Var, TLRPC.User user) {
        switch (this.f2043a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public MediaCodecInfo a(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override
    public boolean a2(long j10) {
        switch (this.f2043a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public long b() {
        throw new NoSuchElementException();
    }

    @Override
    public void b2(s1 s1Var, int i10, float f9, float f10, boolean z10) {
        int i11 = this.f2043a;
    }

    @Override
    public boolean c() {
        switch (this.f2043a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c0(int i10) {
        int i11 = this.f2043a;
    }

    @Override
    public boolean c1(int i10, s1 s1Var) {
        switch (this.f2043a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c2(s1 s1Var, TLRPC.TodoItem todoItem) {
        switch (this.f2043a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Object d(Uri uri, o oVar) {
        return Long.valueOf(d0.K(new BufferedReader(new InputStreamReader(oVar)).readLine()));
    }

    @Override
    public boolean d0() {
        switch (this.f2043a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public long e() {
        return SystemClock.elapsedRealtime();
    }

    @Override
    public void e0(s1 s1Var, float f9, float f10) {
        int i10 = this.f2043a;
    }

    @Override
    public void e2(s1 s1Var) {
        int i10 = this.f2043a;
    }

    @Override
    public boolean f() {
        switch (this.f2043a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public int f0(s1 s1Var) {
        switch (this.f2043a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public String g(s1 s1Var) {
        switch (this.f2043a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void g0(s1 s1Var) {
        int i10 = this.f2043a;
    }

    @Override
    public void g2(s1 s1Var, long j10) {
        int i10 = this.f2043a;
    }

    @Override
    public int h() {
        return 872415231;
    }

    @Override
    public boolean h1(MessageObject messageObject) {
        int i10 = this.f2043a;
        return org.telegram.ui.b.a(messageObject);
    }

    @Override
    public boolean i(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    @Override
    public void j(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f2043a;
    }

    @Override
    public boolean j0() {
        switch (this.f2043a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void j2(s1 s1Var, f fVar) {
        int i10 = this.f2043a;
    }

    @Override
    public void k() {
        int i10 = this.f2043a;
    }

    @Override
    public void k1() {
        int i10 = this.f2043a;
    }

    @Override
    public long l() {
        throw new NoSuchElementException();
    }

    @Override
    public int m() {
        return 352321535;
    }

    @Override
    public void m0(String str) {
        int i10 = this.f2043a;
    }

    @Override
    public void m1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f2043a;
    }

    @Override
    public boolean m2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f2043a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void n(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f2043a;
    }

    @Override
    public boolean n0(y5 y5Var) {
        switch (this.f2043a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void n2(s1 s1Var) {
        int i10 = this.f2043a;
    }

    @Override
    public boolean next() {
        return false;
    }

    @Override
    public void o(s1 s1Var) {
        int i10 = this.f2043a;
    }

    @Override
    public void p() {
        int i10 = this.f2043a;
    }

    @Override
    public void p0(s1 s1Var, float f9, float f10) {
        int i10 = this.f2043a;
    }

    @Override
    public void p1(s1 s1Var, TLRPC.Document document) {
        int i10 = this.f2043a;
    }

    @Override
    public Object p2() {
        switch (this.f2043a) {
            case 20:
                return new LinkedHashSet();
            default:
                return new TreeMap();
        }
    }

    @Override
    public boolean q(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override
    public void q2() {
        int i10 = this.f2043a;
    }

    @Override
    public int r() {
        return MediaCodecList.getCodecCount();
    }

    @Override
    public void r0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 == i11) {
            shortBuffer2.put(shortBuffer);
            return;
        }
        throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
    }

    public boolean r3(CharSequence charSequence) {
        return false;
    }

    @Override
    public void s(s1 s1Var) {
        int i10 = this.f2043a;
    }

    @Override
    public void s2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
        int i10 = this.f2043a;
    }

    @Override
    public void t() {
        int i10 = this.f2043a;
    }

    @Override
    public void t0(s1 s1Var, TLRPC.User user, float f9, float f10) {
        int i10 = this.f2043a;
    }

    @Override
    public void u(s1 s1Var) {
        int i10 = this.f2043a;
    }

    @Override
    public void u1(s1 s1Var, float f9, float f10) {
        int i10 = this.f2043a;
    }

    @Override
    public boolean u2(int i10) {
        switch (this.f2043a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int v() {
        return 0;
    }

    @Override
    public void v0(s1 s1Var, float f9, float f10, boolean z10) {
        int i10 = this.f2043a;
    }

    @Override
    public void w(s1 s1Var) {
        int i10 = this.f2043a;
    }

    @Override
    public boolean w0(MessageObject messageObject) {
        switch (this.f2043a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void w2() {
        int i10 = this.f2043a;
    }

    @Override
    public boolean x() {
        return false;
    }

    @Override
    public void x2(s1 s1Var, int i10, int i11) {
        int i12 = this.f2043a;
    }

    @Override
    public String y(long j10) {
        switch (this.f2043a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void y0(s1 s1Var) {
        int i10 = this.f2043a;
    }

    @Override
    public l9 y2() {
        switch (this.f2043a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public int z() {
        return 1711276032;
    }

    @Override
    public void z0() {
        int i10 = this.f2043a;
    }

    private final void A3() {
    }

    private final void B1() {
    }

    private final void D1() {
    }

    private final void F2() {
    }

    private final void F3() {
    }

    private final void G2() {
    }

    private final void G3() {
    }

    private final void J() {
    }

    private final void M() {
    }

    private final void h0() {
    }

    private final void i0() {
    }

    private final void p3() {
    }

    private final void q3() {
    }

    private final void v3() {
    }

    private final void w3() {
    }

    private final void z3() {
    }

    private final void A2(s1 s1Var) {
    }

    private final void C3(MessageObject messageObject) {
    }

    private final void D2(s1 s1Var) {
    }

    private final void D3(MessageObject messageObject) {
    }

    private final void E2(s1 s1Var) {
    }

    private final void H0(s1 s1Var) {
    }

    private final void K0(s1 s1Var) {
    }

    private final void L0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void N2(String str) {
    }

    private final void O0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void O2(String str) {
    }

    private final void Q0(s1 s1Var) {
    }

    private final void T0(s1 s1Var) {
    }

    private final void T2(s1 s1Var) {
    }

    private final void U(s1 s1Var) {
    }

    private final void U2(s1 s1Var) {
    }

    private final void W(s1 s1Var) {
    }

    private final void X2(s1 s1Var) {
    }

    private final void Y2(s1 s1Var) {
    }

    private final void Z2(MessageObject messageObject) {
    }

    private final void a0(s1 s1Var) {
    }

    private final void a1(s1 s1Var) {
    }

    private final void a3(MessageObject messageObject) {
    }

    private final void b0(s1 s1Var) {
    }

    private final void b1(s1 s1Var) {
    }

    private final void b3(s1 s1Var) {
    }

    private final void c3(s1 s1Var) {
    }

    private final void f1(s1 s1Var) {
    }

    private final void f3(s1 s1Var) {
    }

    private final void g1(s1 s1Var) {
    }

    private final void g3(s1 s1Var) {
    }

    private final void h2(s1 s1Var) {
    }

    private final void h3(s1 s1Var) {
    }

    private final void i2(s1 s1Var) {
    }

    private final void j3(s1 s1Var) {
    }

    private final void k0(s1 s1Var) {
    }

    private final void l0(s1 s1Var) {
    }

    private final void l3(s1 s1Var) {
    }

    private final void m3(s1 s1Var) {
    }

    private final void o2(s1 s1Var) {
    }

    private final void r1(s1 s1Var) {
    }

    private final void r2(s1 s1Var) {
    }

    private final void s0(s1 s1Var) {
    }

    private final void s1(s1 s1Var) {
    }

    private final void t1(s1 s1Var) {
    }

    private final void t2(s1 s1Var) {
    }

    private final void u0(s1 s1Var) {
    }

    private final void v1(s1 s1Var) {
    }

    private final void v2(s1 s1Var) {
    }

    private final void x3(int i10) {
    }

    private final void y3(int i10) {
    }

    private final void z2(s1 s1Var) {
    }

    private final void G(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void I(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void P2(s1 s1Var, long j10) {
    }

    private final void Q2(s1 s1Var, long j10) {
    }

    private final void U0(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void Z0(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void d1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void d3(s1 s1Var, f fVar) {
    }

    private final void e1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void e3(s1 s1Var, f fVar) {
    }

    private final void i3(s1 s1Var, boolean z10) {
    }

    private final void k2(s1 s1Var, TLRPC.Document document) {
    }

    private final void k3(s1 s1Var, boolean z10) {
    }

    private final void l1(int i10, s1 s1Var) {
    }

    private final void l2(s1 s1Var, TLRPC.Document document) {
    }

    private final void n1(int i10, s1 s1Var) {
    }

    private final void o0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void o1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void q0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void q1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void y1(int i10, s1 s1Var) {
    }

    private final void z1(int i10, s1 s1Var) {
    }

    private final void B(s1 s1Var, float f9, float f10) {
    }

    private final void B2(s1 s1Var, float f9, float f10) {
    }

    private final void C2(s1 s1Var, float f9, float f10) {
    }

    private final void D(s1 s1Var, float f9, float f10) {
    }

    private final void E0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final void E1(s1 s1Var, float f9, float f10) {
    }

    private final void G0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final void G1(s1 s1Var, float f9, float f10) {
    }

    private final void H2(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void I2(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void V2(s1 s1Var, float f9, float f10) {
    }

    private final void W2(s1 s1Var, float f9, float f10) {
    }

    private final void i1(s1 s1Var, int i10, int i11) {
    }

    private final void j1(s1 s1Var, int i10, int i11) {
    }

    private final void J2(s1 s1Var, TLRPC.User user, float f9, float f10) {
    }

    private final void K1(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void K2(s1 s1Var, TLRPC.User user, float f9, float f10) {
    }

    private final void L2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void M2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void T1(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void w1(s1 s1Var, float f9, float f10, boolean z10) {
    }

    private final void x1(s1 s1Var, float f9, float f10, boolean z10) {
    }

    @Override
    public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
    }

    @Override
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }

    private final void R2(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void S2(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void X1(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }

    private final void Z1(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }

    private final void d2(s1 s1Var, int i10, float f9, float f10, boolean z10) {
    }

    private final void f2(s1 s1Var, int i10, float f9, float f10, boolean z10) {
    }

    private final void C0(s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
    }

    private final void x0(s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
    }

    private final void t3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void u3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}

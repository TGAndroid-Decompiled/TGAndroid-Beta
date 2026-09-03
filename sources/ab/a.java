package ab;

import a4.h;
import android.content.Context;
import android.graphics.Paint;
import android.text.Editable;
import android.text.style.CharacterStyle;
import c5.j;
import c9.b;
import c9.f;
import c9.g;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentRegistrar;
import e2.d;
import g5.l;
import j9.c;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import kf.k0;
import mg.w;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.wg;
import org.telegram.ui.cv0;
import org.telegram.ui.w61;
import org.xml.sax.Attributes;
import r3.n;
import r3.s;
import ra.m;
import v2.e;
public final class a implements h, f, d, l, SuccessContinuation, c, m6.d, w61, nf.a, g, of.a, j1, e, r3.c, m, ji {
    public static volatile a f146b;
    public final int f147a;

    public a(int i10) {
        this.f147a = i10;
    }

    public static void H3(String str) {
        if (str != null && str.length() != 0) {
            if (!str.startsWith("sk_")) {
                return;
            }
            throw new fc.g("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
        throw new fc.g("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
    }

    public static kf.m t3(Editable editable, int i10) {
        Object[] objArr = (kf.m[]) editable.getSpans(0, editable.length(), kf.m.class);
        if (objArr.length != 0) {
            for (int length = objArr.length; length > 0; length--) {
                int i11 = length - 1;
                if (editable.getSpanFlags(objArr[i11]) == 17) {
                    kf.m mVar = objArr[i11];
                    if (mVar.f10481a == i10) {
                        return mVar;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static boolean u3(boolean z4, String str, Editable editable, Attributes attributes) {
        int i10;
        boolean z10 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z4) {
                String a2 = kf.l.a("data-document-id", attributes);
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
                editable.setSpan(new kf.m(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object t32 = t3(editable, 0);
            if (t32 != null) {
                int spanStart2 = editable.getSpanStart(t32);
                editable.removeSpan(t32);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(t32, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else if (str.equals("pre")) {
            if (z4) {
                String a10 = kf.l.a("language", attributes);
                if (a10 == null) {
                    a10 = kf.l.a("lang", attributes);
                }
                if (a10 == null) {
                    a10 = kf.l.a("lng", attributes);
                }
                editable.setSpan(new kf.m(a10), editable.length(), editable.length(), 17);
                return true;
            }
            Object t33 = t3(editable, 1);
            if (t33 != null) {
                int spanStart3 = editable.getSpanStart(t33);
                editable.removeSpan(t33);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(t33, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else {
            int i12 = 3;
            if (str.equals("blockquote")) {
                if (z4) {
                    String a11 = kf.l.a("class", attributes);
                    if (kf.l.a("data-collapsed", attributes) != null || (a11 != null && a11.contains("telegram-collapsed-quote"))) {
                        z10 = true;
                    }
                    if (!z10) {
                        i12 = 2;
                    }
                    editable.setSpan(new kf.m(i12), editable.length(), editable.length(), 17);
                    return true;
                }
                kf.m[] mVarArr = (kf.m[]) editable.getSpans(0, editable.length(), kf.m.class);
                for (int length2 = mVarArr.length - 1; length2 >= 0; length2--) {
                    kf.m mVar = mVarArr[length2];
                    if (editable.getSpanFlags(mVar) == 17 && ((i10 = mVar.f10481a) == 2 || i10 == 3)) {
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
                    editable.setSpan(new kf.m(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object t34 = t3(editable, 3);
                if (t34 != null) {
                    int spanStart5 = editable.getSpanStart(t34);
                    editable.removeSpan(t34);
                    if (spanStart5 != editable.length()) {
                        editable.setSpan(t34, spanStart5, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    @Override
    public void A(s1 s1Var) {
        int i10 = this.f147a;
    }

    @Override
    public void A0(s1 s1Var, float f10, float f11, boolean z4) {
        int i10 = this.f147a;
    }

    @Override
    public boolean B0(MessageObject messageObject) {
        switch (this.f147a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void B2() {
        int i10 = this.f147a;
    }

    @Override
    public void C0(wg wgVar) {
        wgVar.run();
    }

    @Override
    public void C2(s1 s1Var, int i10, int i11) {
        int i12 = this.f147a;
    }

    @Override
    public void D0(s1 s1Var) {
        int i10 = this.f147a;
    }

    @Override
    public m9 D2() {
        switch (this.f147a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void E(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f147a;
    }

    @Override
    public void E0() {
        int i10 = this.f147a;
    }

    @Override
    public void F(s1 s1Var) {
        int i10 = this.f147a;
    }

    @Override
    public void F0(s1 s1Var, TLObject tLObject, boolean z4) {
        int i10 = this.f147a;
    }

    @Override
    public boolean F1() {
        switch (this.f147a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void G0(s1 s1Var, float f10, float f11) {
        int i10 = this.f147a;
    }

    @Override
    public void H1(s1 s1Var) {
        int i10 = this.f147a;
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f147a;
    }

    @Override
    public void I0(s1 s1Var) {
        int i10 = this.f147a;
    }

    @Override
    public void I1(s1 s1Var, boolean z4) {
        int i10 = this.f147a;
    }

    @Override
    public void K0(s1 s1Var) {
        int i10 = this.f147a;
    }

    @Override
    public boolean K1(s1 s1Var, TLRPC.Chat chat) {
        switch (this.f147a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void L(s1 s1Var) {
        int i10 = this.f147a;
    }

    @Override
    public void L1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f147a;
    }

    @Override
    public void M(s1 s1Var, jh.f fVar) {
        int i10 = this.f147a;
    }

    @Override
    public boolean M1() {
        switch (this.f147a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void N(int i10, s1 s1Var) {
        int i11 = this.f147a;
    }

    @Override
    public void N0(s1 s1Var) {
        int i10 = this.f147a;
    }

    @Override
    public void O(MessageObject messageObject) {
        int i10 = this.f147a;
    }

    @Override
    public void O1(s1 s1Var) {
        int i10 = this.f147a;
    }

    @Override
    public boolean P(s1 s1Var, TLRPC.TodoItem todoItem, boolean z4) {
        switch (this.f147a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int P1(int i10, int i11, int i12) {
        return i10 * 2;
    }

    @Override
    public boolean Q() {
        switch (this.f147a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Q1(MessageObject messageObject) {
        int i10 = this.f147a;
    }

    @Override
    public boolean R(s1 s1Var) {
        switch (this.f147a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R0(long j10) {
        switch (this.f147a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void R1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        switch (this.f147a) {
            case 17:
            default:
                ze.d.s(s1Var.getContext(), str);
                return;
        }
    }

    @Override
    public boolean S() {
        switch (this.f147a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void S0(s1 s1Var) {
        int i10 = this.f147a;
    }

    @Override
    public CharacterStyle S1(s1 s1Var) {
        switch (this.f147a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void T(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
        int i11 = this.f147a;
    }

    @Override
    public void T1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f147a;
    }

    @Override
    public void U(s1 s1Var) {
        int i10 = this.f147a;
    }

    @Override
    public void U0(int i10, s1 s1Var) {
        int i11 = this.f147a;
    }

    @Override
    public boolean U1(s1 s1Var, MessageObject messageObject) {
        switch (this.f147a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void V1() {
        int i10 = this.f147a;
    }

    @Override
    public int W() {
        switch (this.f147a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void W0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f147a;
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
    public boolean X1() {
        return false;
    }

    @Override
    public void Y1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f147a;
    }

    @Override
    public ug.a Z() {
        switch (this.f147a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Z1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f147a;
    }

    @Override
    public boolean a0(s1 s1Var) {
        switch (this.f147a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean a2(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f147a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Object apply(Object obj) {
        return ((x3) obj).a();
    }

    @Override
    public List b(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (b bVar : componentRegistrar.getComponents()) {
            String str = bVar.f2171a;
            if (str != null) {
                bVar = new b(str, bVar.f2172b, bVar.f2173c, bVar.d, bVar.e, new w(5, str, bVar), bVar.f2175g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    @Override
    public void b1(s1 s1Var, CharacterStyle characterStyle, boolean z4) {
        int i10 = this.f147a;
    }

    @Override
    public long c(r3.l lVar) {
        return -1L;
    }

    @Override
    public boolean c0(s1 s1Var, TLRPC.User user) {
        switch (this.f147a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c1(s1 s1Var, boolean z4) {
        switch (this.f147a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public cv0 c2() {
        switch (this.f147a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public g5.m createDataSource() {
        return new g5.g(false);
    }

    @Override
    public String d() {
        return null;
    }

    @Override
    public Object d0(j jVar) {
        switch (this.f147a) {
            case 4:
                return new cb.l((Context) jVar.a(Context.class));
            case 26:
                cb.h hVar = (cb.h) jVar.a(cb.h.class);
                return new db.a(0);
            default:
                cb.a aVar = (cb.a) jVar.a(cb.a.class);
                return new cb.b(0);
        }
    }

    @Override
    public void d1(s1 s1Var) {
        int i10 = this.f147a;
    }

    @Override
    public boolean e() {
        switch (this.f147a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void e1(s1 s1Var) {
        int i10 = this.f147a;
    }

    @Override
    public boolean e2(long j10) {
        switch (this.f147a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean f() {
        switch (this.f147a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void f0(int i10) {
        int i11 = this.f147a;
    }

    @Override
    public void f2(s1 s1Var, int i10, float f10, float f11, boolean z4) {
        int i11 = this.f147a;
    }

    @Override
    public String g(s1 s1Var) {
        switch (this.f147a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean g0() {
        switch (this.f147a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean g2(s1 s1Var, TLRPC.TodoItem todoItem) {
        switch (this.f147a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public e8.a h(Context context, String str, m6.c cVar) {
        e8.a aVar = new e8.a();
        aVar.f5162a = cVar.z(context, str);
        int i10 = 1;
        int h = cVar.h(context, str, true);
        aVar.f5163b = h;
        int i11 = aVar.f5162a;
        if (i11 == 0) {
            i11 = 0;
            if (h == 0) {
                i10 = 0;
                aVar.f5164c = i10;
                return aVar;
            }
        }
        if (h < i11) {
            i10 = -1;
        }
        aVar.f5164c = i10;
        return aVar;
    }

    @Override
    public boolean h0() {
        return false;
    }

    @Override
    public boolean h1(int i10, s1 s1Var) {
        switch (this.f147a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void i(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f147a;
    }

    @Override
    public void i0(s1 s1Var, float f10, float f11) {
        int i10 = this.f147a;
    }

    @Override
    public void j() {
        int i10 = this.f147a;
    }

    @Override
    public void j2(s1 s1Var) {
        int i10 = this.f147a;
    }

    @Override
    public int k0(s1 s1Var) {
        switch (this.f147a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public s l() {
        return new n(-9223372036854775807L);
    }

    @Override
    public void l0(s1 s1Var) {
        int i10 = this.f147a;
    }

    @Override
    public void l2(s1 s1Var, long j10) {
        int i10 = this.f147a;
    }

    @Override
    public void m(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f147a;
    }

    @Override
    public boolean m1(MessageObject messageObject) {
        int i10 = this.f147a;
        return org.telegram.ui.b.a(messageObject);
    }

    @Override
    public void n(s1 s1Var) {
        int i10 = this.f147a;
    }

    @Override
    public void o() {
        int i10 = this.f147a;
    }

    @Override
    public boolean p0() {
        switch (this.f147a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void p1() {
        int i10 = this.f147a;
    }

    @Override
    public void q(s1 s1Var) {
        int i10 = this.f147a;
    }

    @Override
    public void r(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 <= i11) {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalArgumentException(k0.j(i12, "Illegal use of UpsampleAudioResampler. Channels:"));
            }
            int remaining = shortBuffer.remaining() / i12;
            int ceil = ((int) Math.ceil((i11 / i10) * remaining)) - remaining;
            float f10 = remaining;
            float f11 = f10 / f10;
            float f12 = ceil;
            float f13 = f12 / f12;
            while (remaining > 0 && ceil > 0) {
                if (f11 >= f13) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i12 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    remaining--;
                    f11 = remaining / f10;
                } else {
                    shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                    if (i12 == 2) {
                        shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i12));
                    }
                    ceil--;
                    f13 = ceil / f12;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
    }

    @Override
    public void r1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f147a;
    }

    @Override
    public boolean r2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f147a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void s() {
        int i10 = this.f147a;
    }

    @Override
    public void s0(String str) {
        int i10 = this.f147a;
    }

    @Override
    public void s2(s1 s1Var) {
        int i10 = this.f147a;
    }

    @Override
    public void t(s1 s1Var) {
        int i10 = this.f147a;
    }

    @Override
    public boolean t0(u5 u5Var) {
        switch (this.f147a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Task then(Object obj) {
        Void r12 = (Void) obj;
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override
    public void u(s1 s1Var) {
        int i10 = this.f147a;
    }

    @Override
    public void u1(s1 s1Var, TLRPC.Document document) {
        int i10 = this.f147a;
    }

    @Override
    public Object u2() {
        switch (this.f147a) {
            case 22:
                return new LinkedHashSet();
            default:
                return new TreeMap();
        }
    }

    @Override
    public void v0(s1 s1Var, float f10, float f11) {
        int i10 = this.f147a;
    }

    @Override
    public void v2() {
        int i10 = this.f147a;
    }

    @Override
    public String w(long j10) {
        switch (this.f147a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void x2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
        int i10 = this.f147a;
    }

    @Override
    public void y(s1 s1Var) {
        int i10 = this.f147a;
    }

    @Override
    public void y0(s1 s1Var, TLRPC.User user, float f10, float f11) {
        int i10 = this.f147a;
    }

    @Override
    public void z1(s1 s1Var, float f10, float f11) {
        int i10 = this.f147a;
    }

    @Override
    public boolean z2(int i10) {
        switch (this.f147a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    private final void A3() {
    }

    private final void C() {
    }

    private final void D() {
    }

    private final void D3() {
    }

    private final void E1() {
    }

    private final void E3() {
    }

    private final void I3() {
    }

    private final void J1() {
    }

    private final void J3() {
    }

    private final void L2() {
    }

    private final void M2() {
    }

    private final void V() {
    }

    private final void X() {
    }

    private final void v3() {
    }

    private final void w3() {
    }

    private final void z3() {
    }

    @Override
    public void Q0() {
    }

    @Override
    public void a() {
    }

    @Override
    public void m0() {
    }

    @Override
    public void z0() {
    }

    private final void A2(s1 s1Var) {
    }

    private final void B3(int i10) {
    }

    private final void C3(int i10) {
    }

    private final void E2(s1 s1Var) {
    }

    private final void F2(s1 s1Var) {
    }

    private final void F3(MessageObject messageObject) {
    }

    private final void G(s1 s1Var) {
    }

    private final void G2(s1 s1Var) {
    }

    private final void G3(MessageObject messageObject) {
    }

    private final void H(s1 s1Var) {
    }

    private final void H0(s1 s1Var) {
    }

    private final void J(s1 s1Var) {
    }

    private final void J0(s1 s1Var) {
    }

    private final void J2(s1 s1Var) {
    }

    private final void K(s1 s1Var) {
    }

    private final void K2(s1 s1Var) {
    }

    private final void L0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void M0(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void O0(s1 s1Var) {
    }

    private final void P0(s1 s1Var) {
    }

    private final void T2(String str) {
    }

    private final void U2(String str) {
    }

    private final void Y(s1 s1Var) {
    }

    private final void Y0(s1 s1Var) {
    }

    private final void Z2(s1 s1Var) {
    }

    private final void a1(s1 s1Var) {
    }

    private final void a3(s1 s1Var) {
    }

    private final void b0(s1 s1Var) {
    }

    private final void d3(s1 s1Var) {
    }

    private final void e3(s1 s1Var) {
    }

    private final void f3(MessageObject messageObject) {
    }

    private final void g3(MessageObject messageObject) {
    }

    private final void h3(s1 s1Var) {
    }

    private final void i1(s1 s1Var) {
    }

    private final void i3(s1 s1Var) {
    }

    private final void j1(s1 s1Var) {
    }

    private final void l3(s1 s1Var) {
    }

    private final void m3(s1 s1Var) {
    }

    private final void n0(s1 s1Var) {
    }

    private final void n3(s1 s1Var) {
    }

    private final void o0(s1 s1Var) {
    }

    private final void o2(s1 s1Var) {
    }

    private final void p2(s1 s1Var) {
    }

    private final void p3(s1 s1Var) {
    }

    private final void r3(s1 s1Var) {
    }

    private final void s3(s1 s1Var) {
    }

    private final void v1(s1 s1Var) {
    }

    private final void w1(s1 s1Var) {
    }

    private final void w2(s1 s1Var) {
    }

    private final void x1(s1 s1Var) {
    }

    private final void y1(s1 s1Var) {
    }

    private final void y2(s1 s1Var) {
    }

    @Override
    public void Z0(Object obj) {
    }

    @Override
    public long k(long j10) {
        return j10;
    }

    @Override
    public void o1(TLRPC.User user) {
    }

    @Override
    public void p(long j10) {
    }

    private final void B(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void C1(int i10, s1 s1Var) {
    }

    private final void D1(int i10, s1 s1Var) {
    }

    private final void T0(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void V0(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void V2(s1 s1Var, long j10) {
    }

    private final void W2(s1 s1Var, long j10) {
    }

    private final void e0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void f1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void g1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void j0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void j3(s1 s1Var, jh.f fVar) {
    }

    private final void k3(s1 s1Var, jh.f fVar) {
    }

    private final void n1(int i10, s1 s1Var) {
    }

    private final void o3(s1 s1Var, boolean z4) {
    }

    private final void q1(int i10, s1 s1Var) {
    }

    private final void q2(s1 s1Var, TLRPC.Document document) {
    }

    private final void q3(s1 s1Var, boolean z4) {
    }

    private final void s1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void t1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void t2(s1 s1Var, TLRPC.Document document) {
    }

    private final void z(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void r0(int i10, Object obj) {
    }

    private final void H2(s1 s1Var, float f10, float f11) {
    }

    private final void I2(s1 s1Var, float f10, float f11) {
    }

    private final void N1(s1 s1Var, float f10, float f11) {
    }

    private final void N2(s1 s1Var, CharacterStyle characterStyle, boolean z4) {
    }

    private final void O2(s1 s1Var, CharacterStyle characterStyle, boolean z4) {
    }

    private final void W1(s1 s1Var, float f10, float f11) {
    }

    private final void b3(s1 s1Var, float f10, float f11) {
    }

    private final void c3(s1 s1Var, float f10, float f11) {
    }

    private final void k1(s1 s1Var, int i10, int i11) {
    }

    private final void l1(s1 s1Var, int i10, int i11) {
    }

    private final void v(s1 s1Var, float f10, float f11) {
    }

    private final void w0(s1 s1Var, TLObject tLObject, boolean z4) {
    }

    private final void x(s1 s1Var, float f10, float f11) {
    }

    private final void x0(s1 s1Var, TLObject tLObject, boolean z4) {
    }

    private final void A1(s1 s1Var, float f10, float f11, boolean z4) {
    }

    private final void B1(s1 s1Var, float f10, float f11, boolean z4) {
    }

    private final void P2(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void Q2(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void R2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void S2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void d2(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void h2(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void X2(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void Y2(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void i2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final void k2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final void m2(s1 s1Var, int i10, float f10, float f11, boolean z4) {
    }

    private final void n2(s1 s1Var, int i10, float f10, float f11, boolean z4) {
    }

    private final void q0(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    private final void u0(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    private final void x3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void y3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override
    public void b2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }

    @Override
    public void G1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
    }
}

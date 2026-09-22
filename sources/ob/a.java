package ob;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.CharacterStyle;
import android.view.View;
import androidx.car.app.messaging.model.b;
import b2.s;
import c3.b0;
import c3.h0;
import c3.q;
import da.c;
import e2.d0;
import e9.i0;
import fb.o;
import g2.k;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import n2.j;
import n2.l;
import n2.m;
import n2.n;
import nf.f;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.f3;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.y5;
import org.telegram.ui.pn;
import org.telegram.ui.pv0;
import q9.d;
import r0.r;
import tc.g;
import ye.h;
public final class a implements b, bg.a, q, cf.b, c, o, ti, y2.o, m, d, ng, l1, t0, r, xf.a {
    public static a f15688b;
    public final int f15689a;

    public a(int i10) {
        this.f15689a = i10;
    }

    public static da.a B2(na.d dVar) {
        return new da.a(System.currentTimeMillis() + 3600000, new com.google.android.gms.internal.cast.a(8), new ac.d(true, false, false), 10.0d, 1.2d, 60);
    }

    public static byte[] C2(i0 i0Var, long j3) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i0Var.size());
        Iterator<E> it = i0Var.iterator();
        while (it.hasNext()) {
            d2.b bVar = (d2.b) it.next();
            Bundle a2 = bVar.a();
            Bitmap bitmap = bVar.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                e2.d.g(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                a2.putByteArray(d2.b.f7430x, byteArrayOutputStream.toByteArray());
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

    public static Calendar D2() {
        if (f15688b == null) {
            f15688b = new a(25);
        }
        f15688b.getClass();
        return Calendar.getInstance();
    }

    public static void E2(String str) {
        if (str != null && str.length() != 0) {
            if (!str.startsWith("sk_")) {
                return;
            }
            throw new g("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
        throw new g("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
    }

    @Override
    public boolean B1() {
        return false;
    }

    @Override
    public boolean D0() {
        return true;
    }

    @Override
    public Object G(cf.c cVar) {
        switch (this.f15689a) {
            case 14:
                qb.g gVar = (qb.g) cVar.b(qb.g.class);
                return new rb.a(0);
            default:
                qb.a aVar = (qb.a) cVar.b(qb.a.class);
                return new qb.b(0);
        }
    }

    @Override
    public boolean G1(u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean I0(Context context) {
        return false;
    }

    @Override
    public boolean I1() {
        return false;
    }

    @Override
    public TLRPC.TL_channels_sendAsPeers J() {
        return null;
    }

    @Override
    public int M0(s sVar) {
        if (sVar.v != null) {
            return 1;
        }
        return 0;
    }

    @Override
    public boolean N0(long j3) {
        return false;
    }

    @Override
    public void N1(u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        f.s(u1Var.getContext(), str);
    }

    @Override
    public boolean O(u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public CharacterStyle O1(u1 u1Var) {
        return null;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public n2 P0() {
        return null;
    }

    @Override
    public boolean Q(u1 u1Var) {
        return false;
    }

    @Override
    public boolean Q1(u1 u1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean S1() {
        return false;
    }

    @Override
    public void T0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        shortBuffer2.put(shortBuffer);
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public boolean V1(u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean X0(u1 u1Var, boolean z10) {
        return false;
    }

    @Override
    public hh.a Y() {
        return null;
    }

    @Override
    public pv0 Y1() {
        return null;
    }

    @Override
    public n2.g Z0(j jVar, s sVar) {
        if (sVar.v == null) {
            return null;
        }
        return new n(new n2.f(6001, new Exception()));
    }

    @Override
    public h0 Z1(int i10, int i11) {
        return new c3.n();
    }

    @Override
    public long a() {
        return 0L;
    }

    @Override
    public boolean a0(u1 u1Var) {
        return false;
    }

    @Override
    public boolean a2(long j3) {
        return false;
    }

    @Override
    public boolean b0(u1 u1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean c(Context context) {
        return false;
    }

    @Override
    public cf.a c0(f3 f3Var) {
        return new h(f3Var);
    }

    @Override
    public int c1() {
        return 0;
    }

    @Override
    public boolean c2(u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public long d() {
        return 0L;
    }

    @Override
    public boolean d1(int i10, u1 u1Var) {
        return false;
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public TL_stories.StoryItem e1() {
        return null;
    }

    @Override
    public boolean f() {
        switch (this.f15689a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean f0() {
        return false;
    }

    @Override
    public boolean g1(long j3) {
        return false;
    }

    @Override
    public String h(u1 u1Var) {
        return null;
    }

    @Override
    public int i0(u1 u1Var) {
        return 0;
    }

    @Override
    public boolean i1(MessageObject messageObject) {
        return c1.a(messageObject);
    }

    @Override
    public boolean j1() {
        return false;
    }

    @Override
    public l k0(j jVar, s sVar) {
        return l.f15145u;
    }

    @Override
    public boolean l2(u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean m() {
        return false;
    }

    @Override
    public boolean m0() {
        return false;
    }

    @Override
    public Object n2(Uri uri, k kVar) {
        return Long.valueOf(d0.T(new BufferedReader(new InputStreamReader(kVar)).readLine()));
    }

    @Override
    public boolean p0(y5 y5Var) {
        return false;
    }

    @Override
    public boolean p1() {
        return false;
    }

    @Override
    public Object p2() {
        switch (this.f15689a) {
            case 8:
                return new LinkedHashSet();
            default:
                return new TreeMap();
        }
    }

    @Override
    public int q() {
        return 0;
    }

    @Override
    public pn q0() {
        return null;
    }

    @Override
    public boolean r2(w0 w0Var, float f7, float f10) {
        return false;
    }

    @Override
    public da.a s2(na.d dVar, JSONObject jSONObject) {
        return B2(dVar);
    }

    @Override
    public TLRPC.Peer v() {
        return null;
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
    public boolean x0(MessageObject messageObject) {
        return true;
    }

    @Override
    public boolean x1() {
        return false;
    }

    @Override
    public void y0(gh ghVar) {
        ghVar.run();
    }

    @Override
    public s9 z2() {
        return null;
    }

    @Override
    public void A0() {
    }

    @Override
    public void A1() {
    }

    @Override
    public void A2() {
    }

    @Override
    public void D() {
    }

    @Override
    public void F1() {
    }

    @Override
    public void H0() {
    }

    @Override
    public void K0() {
    }

    @Override
    public void L0() {
    }

    @Override
    public void R1() {
    }

    @Override
    public void U0() {
    }

    @Override
    public void W() {
    }

    @Override
    public void b() {
    }

    @Override
    public void d2() {
    }

    @Override
    public void f1() {
    }

    @Override
    public void g() {
    }

    @Override
    public void i2() {
    }

    @Override
    public void k() {
    }

    @Override
    public void l() {
    }

    @Override
    public void l1() {
    }

    @Override
    public void n0() {
    }

    @Override
    public void o1() {
    }

    @Override
    public void o2() {
    }

    @Override
    public void p() {
    }

    @Override
    public void q2() {
    }

    @Override
    public void r1() {
    }

    @Override
    public void release() {
    }

    @Override
    public void s() {
    }

    @Override
    public void s1() {
    }

    @Override
    public void t0() {
    }

    @Override
    public void t1() {
    }

    @Override
    public void v0() {
    }

    @Override
    public void w2() {
    }

    @Override
    public void x() {
    }

    @Override
    public void x2() {
    }

    @Override
    public void A(u1 u1Var) {
    }

    @Override
    public void B(boolean z10) {
    }

    @Override
    public void D1(u1 u1Var) {
    }

    @Override
    public void E0(u1 u1Var) {
    }

    @Override
    public void F(u1 u1Var) {
    }

    @Override
    public void G0(u1 u1Var) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void J0(u1 u1Var) {
    }

    @Override
    public void K1(u1 u1Var) {
    }

    @Override
    public void L(u1 u1Var) {
    }

    @Override
    public void M1(MessageObject messageObject) {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void O0(u1 u1Var) {
    }

    @Override
    public void R0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override
    public void T(u1 u1Var) {
    }

    @Override
    public void V0(Object obj) {
    }

    @Override
    public void X(boolean z10) {
    }

    @Override
    public void X1(b0 b0Var) {
    }

    @Override
    public void Y0(u1 u1Var) {
    }

    @Override
    public void Z(w0 w0Var) {
    }

    @Override
    public void a1(u1 u1Var) {
    }

    @Override
    public void b1(int i10) {
    }

    @Override
    public void d0(int i10) {
    }

    @Override
    public void e2(u1 u1Var) {
    }

    @Override
    public void f2(int i10) {
    }

    @Override
    public void j0(u1 u1Var) {
    }

    @Override
    public void j2(boolean z10) {
    }

    @Override
    public void k1(TLRPC.User user) {
    }

    @Override
    public void l0(w0 w0Var) {
    }

    @Override
    public void m2(u1 u1Var) {
    }

    @Override
    public void o(u1 u1Var) {
    }

    @Override
    public void o0(String str) {
    }

    @Override
    public void r(u1 u1Var) {
    }

    @Override
    public void s0(w0 w0Var) {
    }

    @Override
    public void t(u1 u1Var) {
    }

    @Override
    public void u(u1 u1Var) {
    }

    @Override
    public void w1(CharSequence charSequence) {
    }

    @Override
    public void y(float f7) {
    }

    @Override
    public void y1(long j3) {
    }

    @Override
    public void z(u1 u1Var) {
    }

    @Override
    public void z0(u1 u1Var) {
    }

    @Override
    public void z1(w0 w0Var) {
    }

    @Override
    public void C(Looper looper, j2.k kVar) {
    }

    @Override
    public void E(u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void E1(u1 u1Var, boolean z10) {
    }

    @Override
    public void F0(int i10, int i11) {
    }

    @Override
    public void H1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void K(float f7, int i10) {
    }

    @Override
    public void M(int i10, u1 u1Var) {
    }

    @Override
    public void Q0(int i10, u1 u1Var) {
    }

    @Override
    public void S0(u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void T1(u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void U(w0 w0Var, int i10) {
    }

    @Override
    public void g2(u1 u1Var, long j3) {
    }

    @Override
    public void h2(w0 w0Var, String str) {
    }

    @Override
    public void i(u1 u1Var, bi.f fVar) {
    }

    @Override
    public void n1(u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void q1(u1 u1Var, TLRPC.Document document) {
    }

    @Override
    public void B0(u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void C0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void J1(w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public int L1(int i10, int i11, int i12) {
        return i10;
    }

    @Override
    public void W0(u1 u1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void g0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void h0(w0 w0Var, int i10, int i11) {
    }

    @Override
    public void h1(w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public void m1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public void r0(u1 u1Var, float f7, float f10) {
    }

    @Override
    public void u1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public void v1(u1 u1Var, float f7, float f10) {
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
    public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
    }

    @Override
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }

    @Override
    public void u0(u1 u1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void w0(u1 u1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
    }

    @Override
    public void b2(u1 u1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void j(u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void t2(u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void u2(w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void S(u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void k2(int i10, int i11, int i12, long j3, long j10, boolean z10) {
    }

    @Override
    public void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override
    public void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }

    @Override
    public void C1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
    }
}

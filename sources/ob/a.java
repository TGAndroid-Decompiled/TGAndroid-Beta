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
import fb.n;
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
import n7.a1;
import nf.f;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.x5;
import org.telegram.ui.rn;
import org.telegram.ui.rv0;
import q9.d;
import r0.r;
import tc.g;
import y2.o;
import ye.h;
public final class a implements b, bg.a, q, cf.b, c, n, ti, o, m, d, mg, k1, t0, r, xf.a {
    public static a f15512b;
    public final int f15513a;

    public a(int i10) {
        this.f15513a = i10;
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
                a2.putByteArray(d2.b.f7432x, byteArrayOutputStream.toByteArray());
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
        if (f15512b == null) {
            f15512b = new a(25);
        }
        f15512b.getClass();
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
    public boolean A1() {
        return false;
    }

    @Override
    public boolean C0() {
        return true;
    }

    @Override
    public cf.a F1(a1 a1Var) {
        return new h(a1Var);
    }

    @Override
    public Object G(cf.c cVar) {
        switch (this.f15513a) {
            case 14:
                qb.g gVar = (qb.g) cVar.a(qb.g.class);
                return new rb.a(0);
            default:
                qb.a aVar = (qb.a) cVar.a(qb.a.class);
                return new qb.b(0);
        }
    }

    @Override
    public boolean G1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean H0(Context context) {
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
    public int L0(s sVar) {
        if (sVar.v != null) {
            return 1;
        }
        return 0;
    }

    @Override
    public boolean M0(long j3) {
        return false;
    }

    @Override
    public void N1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        f.s(t1Var.getContext(), str);
    }

    @Override
    public boolean O(t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public o2 O0() {
        return null;
    }

    @Override
    public CharacterStyle O1(t1 t1Var) {
        return null;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    public boolean Q(t1 t1Var) {
        return false;
    }

    @Override
    public boolean Q1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public void S0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        shortBuffer2.put(shortBuffer);
    }

    @Override
    public boolean S1() {
        return false;
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public boolean V1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean W0(t1 t1Var, boolean z10) {
        return false;
    }

    @Override
    public hh.a Y() {
        return null;
    }

    @Override
    public n2.g Y0(j jVar, s sVar) {
        if (sVar.v == null) {
            return null;
        }
        return new n2.n(new n2.f(6001, new Exception()));
    }

    @Override
    public rv0 Y1() {
        return null;
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
    public boolean a0(t1 t1Var) {
        return false;
    }

    @Override
    public boolean a2(long j3) {
        return false;
    }

    @Override
    public boolean b0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public int b1() {
        return 0;
    }

    @Override
    public boolean c(Context context) {
        return false;
    }

    @Override
    public boolean c0() {
        return false;
    }

    @Override
    public boolean c1(int i10, t1 t1Var) {
        return false;
    }

    @Override
    public boolean c2(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public long d() {
        return 0L;
    }

    @Override
    public TL_stories.StoryItem d1() {
        return null;
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
    public boolean f() {
        switch (this.f15513a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean f1(long j3) {
        return false;
    }

    @Override
    public String h(t1 t1Var) {
        return null;
    }

    @Override
    public int h0(t1 t1Var) {
        return 0;
    }

    @Override
    public boolean h1(MessageObject messageObject) {
        return wl.a(messageObject);
    }

    @Override
    public boolean i1() {
        return false;
    }

    @Override
    public l j0(j jVar, s sVar) {
        return l.f14918u;
    }

    @Override
    public boolean l0() {
        return false;
    }

    @Override
    public boolean l2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean m() {
        return false;
    }

    @Override
    public Object n2(Uri uri, k kVar) {
        return Long.valueOf(d0.T(new BufferedReader(new InputStreamReader(kVar)).readLine()));
    }

    @Override
    public boolean o0(x5 x5Var) {
        return false;
    }

    @Override
    public boolean o1() {
        return false;
    }

    @Override
    public rn p0() {
        return null;
    }

    @Override
    public Object p2() {
        switch (this.f15513a) {
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
    public boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override
    public boolean w1() {
        return false;
    }

    @Override
    public void x0(fh fhVar) {
        fhVar.run();
    }

    @Override
    public r9 z2() {
        return null;
    }

    @Override
    public void A2() {
    }

    @Override
    public void D() {
    }

    @Override
    public void E1() {
    }

    @Override
    public void G0() {
    }

    @Override
    public void J0() {
    }

    @Override
    public void K0() {
    }

    @Override
    public void R1() {
    }

    @Override
    public void T0() {
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
    public void e1() {
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
    public void k1() {
    }

    @Override
    public void l() {
    }

    @Override
    public void m0() {
    }

    @Override
    public void n1() {
    }

    @Override
    public void o2() {
    }

    @Override
    public void p() {
    }

    @Override
    public void q1() {
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
    public void s0() {
    }

    @Override
    public void s1() {
    }

    @Override
    public void u0() {
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
    public void z0() {
    }

    @Override
    public void z1() {
    }

    @Override
    public void A(t1 t1Var) {
    }

    @Override
    public void B(boolean z10) {
    }

    @Override
    public void C1(t1 t1Var) {
    }

    @Override
    public void D0(t1 t1Var) {
    }

    @Override
    public void F(t1 t1Var) {
    }

    @Override
    public void F0(t1 t1Var) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I0(t1 t1Var) {
    }

    @Override
    public void K1(t1 t1Var) {
    }

    @Override
    public void L(t1 t1Var) {
    }

    @Override
    public void M1(MessageObject messageObject) {
    }

    @Override
    public void N(MessageObject messageObject) {
    }

    @Override
    public void N0(t1 t1Var) {
    }

    @Override
    public void Q0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override
    public void T(t1 t1Var) {
    }

    @Override
    public void U0(Object obj) {
    }

    @Override
    public void X(boolean z10) {
    }

    @Override
    public void X0(t1 t1Var) {
    }

    @Override
    public void X1(b0 b0Var) {
    }

    @Override
    public void Z(w0 w0Var) {
    }

    @Override
    public void Z0(t1 t1Var) {
    }

    @Override
    public void a1(int i10) {
    }

    @Override
    public void d0(int i10) {
    }

    @Override
    public void e2(t1 t1Var) {
    }

    @Override
    public void f2(int i10) {
    }

    @Override
    public void i0(t1 t1Var) {
    }

    @Override
    public void j1(TLRPC.User user) {
    }

    @Override
    public void j2(boolean z10) {
    }

    @Override
    public void k0(w0 w0Var) {
    }

    @Override
    public void m2(t1 t1Var) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void o(t1 t1Var) {
    }

    @Override
    public void r(t1 t1Var) {
    }

    @Override
    public void r0(w0 w0Var) {
    }

    @Override
    public void t(t1 t1Var) {
    }

    @Override
    public void u(t1 t1Var) {
    }

    @Override
    public void v1(CharSequence charSequence) {
    }

    @Override
    public void x1(long j3) {
    }

    @Override
    public void y(float f7) {
    }

    @Override
    public void y0(t1 t1Var) {
    }

    @Override
    public void y1(w0 w0Var) {
    }

    @Override
    public void z(t1 t1Var) {
    }

    @Override
    public void C(Looper looper, j2.k kVar) {
    }

    @Override
    public void D1(t1 t1Var, boolean z10) {
    }

    @Override
    public void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void E0(int i10, int i11) {
    }

    @Override
    public void H1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void K(float f7, int i10) {
    }

    @Override
    public void M(int i10, t1 t1Var) {
    }

    @Override
    public void P0(int i10, t1 t1Var) {
    }

    @Override
    public void R0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void T1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void U(w0 w0Var, int i10) {
    }

    @Override
    public void g2(t1 t1Var, long j3) {
    }

    @Override
    public void h2(w0 w0Var, String str) {
    }

    @Override
    public void i(t1 t1Var, bi.f fVar) {
    }

    @Override
    public void m1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void p1(t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public void A0(t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void J1(w0 w0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public int L1(int i10, int i11, int i12) {
        return i10;
    }

    @Override
    public void V0(t1 t1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void f0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void g0(w0 w0Var, int i10, int i11) {
    }

    @Override
    public void g1(w0 w0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public void l1(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public void q0(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void t1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public void u1(t1 t1Var, float f7, float f10) {
    }

    @Override
    public void y2(t1 t1Var, int i10, int i11) {
    }

    @Override
    public void U1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
    }

    @Override
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }

    @Override
    public void t0(t1 t1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void v0(t1 t1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void H(CharSequence charSequence, boolean z10, int i10, int i11, long j3) {
    }

    @Override
    public void b2(t1 t1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void j(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void t2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void u2(w0 w0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void S(t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
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
    public void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
    }
}

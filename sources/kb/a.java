package kb;

import a3.h;
import a3.i;
import ai.n;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.style.CharacterStyle;
import androidx.car.app.messaging.model.b;
import androidx.emoji2.text.o;
import b8.ke;
import b8.yd;
import b8.zb;
import cg.l;
import cg.m;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.components.ComponentRegistrar;
import d2.n0;
import d2.v0;
import e3.b0;
import e3.q;
import e5.u;
import g9.i0;
import i2.k;
import i2.v;
import i2.y;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.telegram.messenger.a8;
import org.telegram.messenger.g10;
import org.telegram.messenger.o2;
import org.telegram.messenger.r2;
import org.telegram.messenger.wi;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.zh;
import org.telegram.ui.vq0;
import org.xml.sax.Attributes;
import sf.c;
import t9.d;
import t9.e;
import vi.g;
public final class a implements b, q, fg.a, gg.a, e, ia.a, d, p, zh, g, l1, t4.d, w5.a {
    public final int f16912a;

    public a(int i3) {
        this.f16912a = i3;
    }

    public static i D4(h hVar, u uVar) {
        IOException iOException = (IOException) uVar.f9634c;
        if (iOException instanceof y) {
            int i3 = ((y) iOException).f14601c;
            if (i3 == 403 || i3 == 404 || i3 == 410 || i3 == 416 || i3 == 500 || i3 == 503) {
                if (hVar.a(1)) {
                    return new i(1, 300000L);
                }
                if (hVar.a(2)) {
                    return new i(2, 60000L);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static m E4(Editable editable, int i3) {
        Object[] objArr = (m[]) editable.getSpans(0, editable.length(), m.class);
        if (objArr.length != 0) {
            for (int length = objArr.length; length > 0; length--) {
                int i10 = length - 1;
                if (editable.getSpanFlags(objArr[i10]) == 17) {
                    m mVar = objArr[i10];
                    if (mVar.f4722a == i3) {
                        return mVar;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static long G4(u uVar) {
        for (Throwable th2 = (IOException) uVar.f9634c; th2 != null; th2 = th2.getCause()) {
            if (!(th2 instanceof v0) && !(th2 instanceof FileNotFoundException) && !(th2 instanceof v) && !(th2 instanceof a3.p)) {
                if ((th2 instanceof k) && ((k) th2).f14552a == 2008) {
                    return -9223372036854775807L;
                }
            } else {
                return -9223372036854775807L;
            }
        }
        return Math.min((uVar.f9633b - 1) * 1000, 5000);
    }

    public static boolean H4(boolean z10, String str, Editable editable, Attributes attributes) {
        int i3;
        boolean z11 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z10) {
                String a10 = l.a("data-document-id", attributes);
                if (a10 != null) {
                    editable.setSpan(new p5(Long.parseLong(a10), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), p5.class);
                if (spans.length != 0) {
                    int length = spans.length;
                    while (true) {
                        if (length <= 0) {
                            break;
                        }
                        int i10 = length - 1;
                        if (editable.getSpanFlags(spans[i10]) == 17) {
                            obj = spans[i10];
                            break;
                        }
                        length--;
                    }
                }
                Object obj2 = (p5) obj;
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
                editable.setSpan(new m(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object E4 = E4(editable, 0);
            if (E4 != null) {
                int spanStart2 = editable.getSpanStart(E4);
                editable.removeSpan(E4);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(E4, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else if (str.equals("pre")) {
            if (z10) {
                String a11 = l.a("language", attributes);
                if (a11 == null) {
                    a11 = l.a("lang", attributes);
                }
                if (a11 == null) {
                    a11 = l.a("lng", attributes);
                }
                editable.setSpan(new m(a11), editable.length(), editable.length(), 17);
                return true;
            }
            Object E42 = E4(editable, 1);
            if (E42 != null) {
                int spanStart3 = editable.getSpanStart(E42);
                editable.removeSpan(E42);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(E42, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else {
            int i11 = 3;
            if (str.equals("blockquote")) {
                if (z10) {
                    String a12 = l.a("class", attributes);
                    if (l.a("data-collapsed", attributes) != null || (a12 != null && a12.contains("telegram-collapsed-quote"))) {
                        z11 = true;
                    }
                    if (!z11) {
                        i11 = 2;
                    }
                    editable.setSpan(new m(i11), editable.length(), editable.length(), 17);
                    return true;
                }
                m[] mVarArr = (m[]) editable.getSpans(0, editable.length(), m.class);
                for (int length2 = mVarArr.length - 1; length2 >= 0; length2--) {
                    m mVar = mVarArr[length2];
                    if (editable.getSpanFlags(mVar) == 17 && ((i3 = mVar.f4722a) == 2 || i3 == 3)) {
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
                    editable.setSpan(new m(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object E43 = E4(editable, 3);
                if (E43 != null) {
                    int spanStart5 = editable.getSpanStart(E43);
                    editable.removeSpan(E43);
                    if (spanStart5 != editable.length()) {
                        editable.setSpan(E43, spanStart5, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public static l9.y U4(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((n0) it.next()).f8241b == null) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ?? obj = new Object();
                obj.n(unsupportedOperationException);
                return obj;
            }
        }
        return yd.b(list);
    }

    public static byte[] q4(i0 i0Var, long j10) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i0Var.size());
        Iterator<E> it = i0Var.iterator();
        while (it.hasNext()) {
            f2.b bVar = (f2.b) it.next();
            Bundle a10 = bVar.a();
            Bitmap bitmap = bVar.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zb.p(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                a10.putByteArray(f2.b.f11358x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(a10);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j10);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @Override
    public StackTraceElement[] A(StackTraceElement[] stackTraceElementArr) {
        int i3;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i10 = 0;
        int i11 = 0;
        int i12 = 1;
        while (i10 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i10];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i13 = i10 - intValue;
                if (i10 + i13 <= stackTraceElementArr.length) {
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (stackTraceElementArr[intValue + i14].equals(stackTraceElementArr[i10 + i14])) {
                        }
                    }
                    int intValue2 = i10 - num.intValue();
                    if (i12 < 10) {
                        System.arraycopy(stackTraceElementArr, i10, stackTraceElementArr2, i11, intValue2);
                        i11 += intValue2;
                        i12++;
                    }
                    i3 = (intValue2 - 1) + i10;
                    hashMap.put(stackTraceElement, Integer.valueOf(i10));
                    i10 = i3 + 1;
                }
            }
            stackTraceElementArr2[i11] = stackTraceElementArr[i10];
            i11++;
            i12 = 1;
            i3 = i10;
            hashMap.put(stackTraceElement, Integer.valueOf(i10));
            i10 = i3 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i11];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i11);
        if (i11 < stackTraceElementArr.length) {
            return stackTraceElementArr3;
        }
        return stackTraceElementArr;
    }

    @Override
    public void A0(q1 q1Var, TLObject tLObject, boolean z10) {
        int i3 = this.f16912a;
    }

    @Override
    public void A1(q1 q1Var) {
        int i3 = this.f16912a;
    }

    @Override
    public void B(q1 q1Var) {
        int i3 = this.f16912a;
    }

    @Override
    public void B0(q1 q1Var, float f10, float f11) {
        int i3 = this.f16912a;
    }

    @Override
    public void C(q1 q1Var) {
        int i3 = this.f16912a;
    }

    @Override
    public void C1(zi ziVar) {
        int i3 = this.f16912a;
    }

    @Override
    public void D0(q1 q1Var) {
        int i3 = this.f16912a;
    }

    @Override
    public void E0(q1 q1Var, boolean z10, boolean z11) {
        int i3 = this.f16912a;
    }

    @Override
    public void E1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f16912a) {
            case 18:
            case 19:
            default:
                c.t(q1Var.getContext(), str);
                return;
        }
    }

    public int F4(int i3) {
        if (i3 == 7) {
            return 6;
        }
        return 3;
    }

    @Override
    public void G0(q1 q1Var) {
        int i3 = this.f16912a;
    }

    @Override
    public CharacterStyle G1(q1 q1Var) {
        switch (this.f16912a) {
            case 18:
                return null;
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void H(q1 q1Var, o2 o2Var) {
        int i3 = this.f16912a;
    }

    @Override
    public void H0(ShortBuffer shortBuffer, int i3, ShortBuffer shortBuffer2, int i10) {
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("Output must be 2 or 1 channels");
        }
        int min = Math.min(shortBuffer.remaining() / i3, shortBuffer2.remaining() / i10);
        for (int i11 = 0; i11 < min; i11++) {
            short s6 = shortBuffer.get();
            short s10 = shortBuffer.get();
            shortBuffer.position(shortBuffer.position() + 4);
            if (i10 == 2) {
                shortBuffer2.put(s6);
                shortBuffer2.put(s10);
            } else if (i10 == 1) {
                shortBuffer2.put(ra.e.D4(s6, s10));
            }
        }
    }

    @Override
    public void H1(zi ziVar, String str, String str2, String str3, String str4, int i3, int i10) {
        int i11 = this.f16912a;
    }

    @Override
    public void I(q1 q1Var) {
        int i3 = this.f16912a;
    }

    @Override
    public boolean I1(q1 q1Var, zi ziVar) {
        switch (this.f16912a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void J(wi wiVar) {
        int i3 = this.f16912a;
    }

    @Override
    public boolean J0(long j10) {
        switch (this.f16912a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void K(q1 q1Var, TLRPC.Document document, RectF rectF) {
        int i3 = this.f16912a;
    }

    @Override
    public void K0(q1 q1Var) {
        int i3 = this.f16912a;
    }

    @Override
    public void K1() {
        int i3 = this.f16912a;
    }

    @Override
    public void L() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void L0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i3 = this.f16912a;
    }

    @Override
    public boolean L1() {
        return false;
    }

    @Override
    public void M1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i3 = this.f16912a;
    }

    @Override
    public void N(q1 q1Var) {
        int i3 = this.f16912a;
    }

    @Override
    public void N0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
        int i3 = this.f16912a;
    }

    @Override
    public void N1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i3 = this.f16912a;
    }

    @Override
    public void P(zi ziVar) {
        int i3 = this.f16912a;
    }

    @Override
    public boolean P0(q1 q1Var, boolean z10) {
        switch (this.f16912a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean P1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f16912a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f16912a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Q0(q1 q1Var) {
        int i3 = this.f16912a;
    }

    @Override
    public void Q1(q1 q1Var, g10 g10Var) {
        int i3 = this.f16912a;
    }

    @Override
    public boolean R() {
        switch (this.f16912a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean S(q1 q1Var) {
        switch (this.f16912a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void S0(q1 q1Var) {
        int i3 = this.f16912a;
    }

    @Override
    public vq0 S1() {
        switch (this.f16912a) {
            case 18:
                return null;
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean T() {
        switch (this.f16912a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void U(q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10) {
        int i10 = this.f16912a;
    }

    @Override
    public void U1(String str, String str2) {
        int i3 = this.f16912a;
    }

    @Override
    public void V(q1 q1Var) {
        int i3 = this.f16912a;
    }

    @Override
    public boolean V1(long j10) {
        switch (this.f16912a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void W1(q1 q1Var, int i3, float f10, float f11, boolean z10) {
        int i10 = this.f16912a;
    }

    @Override
    public int X() {
        switch (this.f16912a) {
            case 18:
                return 0;
            case 19:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public boolean X0(zi ziVar) {
        int i3 = this.f16912a;
        return f1.a(ziVar);
    }

    @Override
    public void Y(ng ngVar) {
        ngVar.run();
    }

    @Override
    public boolean Y1(q1 q1Var, TLRPC.TodoItem todoItem) {
        switch (this.f16912a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public kh.a Z() {
        switch (this.f16912a) {
            case 18:
                return null;
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Z1(q1 q1Var) {
        int i3 = this.f16912a;
    }

    @Override
    public void a2(q1 q1Var, long j10) {
        int i3 = this.f16912a;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        l7.d dVar = (l7.d) ((l7.e) obj).m();
        d7.b bVar = new d7.b(1, (TaskCompletionSource) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i3 = l7.c.f18094a;
        obtain.writeStrongBinder(bVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            dVar.f18095a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override
    public List b(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (t9.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.f55041a;
            if (str != null) {
                aVar = new t9.a(str, aVar.f55042b, aVar.f55043c, aVar.d, aVar.f55044e, new n(18, str, aVar), aVar.f55046g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override
    public boolean b0(q1 q1Var) {
        switch (this.f16912a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c() {
        switch (this.f16912a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c1() {
        int i3 = this.f16912a;
    }

    @Override
    public boolean d() {
        switch (this.f16912a) {
            case 18:
                return true;
            case 19:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean d0(q1 q1Var, TLRPC.User user) {
        switch (this.f16912a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void d1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i3 = this.f16912a;
    }

    @Override
    public void e(String str, Throwable th2) {
        a8.e("AudioRecorderV2 " + str, th2);
    }

    @Override
    public void e0(int i3) {
        int i10 = this.f16912a;
    }

    @Override
    public boolean e2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f16912a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void f(b0 b0Var) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean f0() {
        switch (this.f16912a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void f1(q1 q1Var, int i3) {
        int i10 = this.f16912a;
    }

    @Override
    public void f2(q1 q1Var) {
        int i3 = this.f16912a;
    }

    @Override
    public String g(q1 q1Var) {
        switch (this.f16912a) {
            case 18:
                return null;
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean g0() {
        return false;
    }

    @Override
    public void h0(q1 q1Var, float f10, float f11) {
        int i3 = this.f16912a;
    }

    @Override
    public void h2() {
        int i3 = this.f16912a;
    }

    @Override
    public void i(q1 q1Var, ArrayList arrayList, int i3, int i10, int i11) {
        int i12 = this.f16912a;
    }

    @Override
    public e3.i0 i0(int i3, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void i1(q1 q1Var, float f10, float f11) {
        int i3 = this.f16912a;
    }

    @Override
    public void i2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        int i3 = this.f16912a;
    }

    @Override
    public void j() {
        int i3 = this.f16912a;
    }

    @Override
    public int j0(q1 q1Var) {
        switch (this.f16912a) {
            case 18:
                return 0;
            case 19:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void k0(q1 q1Var) {
        int i3 = this.f16912a;
    }

    @Override
    public void l0(ShortBuffer shortBuffer, int i3, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i3 == i10) {
            shortBuffer2.put(shortBuffer);
            return;
        }
        throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
    }

    @Override
    public void m(String str) {
        if (r2.f25040a) {
            a8.b("AudioRecorderV2 " + str);
        }
    }

    @Override
    public boolean m0() {
        switch (this.f16912a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean m2(int i3) {
        switch (this.f16912a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void n(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3) {
        int i10 = this.f16912a;
    }

    @Override
    public void n0(String str) {
        int i3 = this.f16912a;
    }

    @Override
    public boolean n1() {
        switch (this.f16912a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public long o() {
        return System.currentTimeMillis();
    }

    @Override
    public boolean o0(p5 p5Var) {
        switch (this.f16912a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void o2() {
        int i3 = this.f16912a;
    }

    @Override
    public void p(q1 q1Var) {
        int i3 = this.f16912a;
    }

    @Override
    public void p0(q1 q1Var, float f10, float f11) {
        int i3 = this.f16912a;
    }

    @Override
    public boolean p1(q1 q1Var, int i3) {
        switch (this.f16912a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void p2(q1 q1Var, int i3, int i10) {
        int i11 = this.f16912a;
    }

    @Override
    public void q() {
        int i3 = this.f16912a;
    }

    @Override
    public Object q1(ke keVar) {
        mb.a aVar = new mb.a();
        o oVar = new o(4);
        ReferenceQueue referenceQueue = aVar.f19222a;
        Set set = aVar.f19223b;
        set.add(new mb.l(aVar, referenceQueue, set, oVar));
        Thread thread = new Thread(new l9.u(18, referenceQueue, set), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    @Override
    public i9 q2() {
        switch (this.f16912a) {
            case 18:
                return null;
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void r1(q1 q1Var, boolean z10, boolean z11) {
        int i3 = this.f16912a;
    }

    @Override
    public void s(q1 q1Var) {
        int i3 = this.f16912a;
    }

    @Override
    public void s0(q1 q1Var, TLRPC.User user, float f10, float f11) {
        int i3 = this.f16912a;
    }

    @Override
    public void t0(q1 q1Var, float f10, float f11, boolean z10) {
        int i3 = this.f16912a;
    }

    @Override
    public void t1(q1 q1Var) {
        int i3 = this.f16912a;
    }

    @Override
    public void u1(q1 q1Var, boolean z10) {
        int i3 = this.f16912a;
    }

    @Override
    public void v() {
        int i3 = this.f16912a;
    }

    @Override
    public int v1(int i3, int i10, int i11) {
        return (i3 / i10) * i11;
    }

    @Override
    public void w(q1 q1Var) {
        int i3 = this.f16912a;
    }

    @Override
    public boolean w1(q1 q1Var, TLRPC.Chat chat) {
        switch (this.f16912a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean x0(zi ziVar) {
        switch (this.f16912a) {
            case 18:
                return true;
            case 19:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void x1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i3 = this.f16912a;
    }

    @Override
    public void y(q1 q1Var) {
        int i3 = this.f16912a;
    }

    @Override
    public void y0(q1 q1Var) {
        int i3 = this.f16912a;
    }

    @Override
    public boolean y1() {
        switch (this.f16912a) {
            case 18:
                return false;
            case 19:
                return false;
            default:
                return false;
        }
    }

    @Override
    public String z(long j10) {
        switch (this.f16912a) {
            case 18:
                return null;
            case 19:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void z0() {
        int i3 = this.f16912a;
    }

    @Override
    public void z1(q1 q1Var, int i3) {
        int i10 = this.f16912a;
    }

    public a(Object obj, int i3) {
        this.f16912a = i3;
    }

    private final void A3() {
    }

    private final void B3() {
    }

    private final void C3() {
    }

    private final void D() {
    }

    private final void E() {
    }

    private final void F() {
    }

    private final void I4() {
    }

    private final void J4() {
    }

    private final void K4() {
    }

    private final void N2() {
    }

    private final void O2() {
    }

    private final void O4() {
    }

    private final void P2() {
    }

    private final void P4() {
    }

    private final void Q4() {
    }

    private final void V4() {
    }

    private final void W4() {
    }

    private final void X4() {
    }

    private final void b5() {
    }

    private final void c5() {
    }

    private final void d5() {
    }

    private final void q0() {
    }

    private final void u0() {
    }

    private final void w0() {
    }

    @Override
    public void r() {
    }

    @Override
    public void r0() {
    }

    @Override
    public void v0() {
    }

    private final void B1(wi wiVar) {
    }

    private final void B2(q1 q1Var) {
    }

    private final void B4(q1 q1Var) {
    }

    private final void C0(q1 q1Var) {
    }

    private final void C2(q1 q1Var) {
    }

    private final void D1(q1 q1Var) {
    }

    private final void D2(q1 q1Var) {
    }

    private final void E2(q1 q1Var) {
    }

    private final void F0(q1 q1Var) {
    }

    private final void F1(q1 q1Var) {
    }

    private final void F2(q1 q1Var) {
    }

    private final void G(q1 q1Var) {
    }

    private final void G2(q1 q1Var) {
    }

    private final void J1(q1 q1Var) {
    }

    private final void M(q1 q1Var) {
    }

    private final void M0(q1 q1Var) {
    }

    private final void M3(String str) {
    }

    private final void N3(String str) {
    }

    private final void O(q1 q1Var) {
    }

    private final void O3(String str) {
    }

    private final void R4(int i3) {
    }

    private final void S4(int i3) {
    }

    private final void T4(int i3) {
    }

    private final void U0(q1 q1Var) {
    }

    private final void V0(q1 q1Var) {
    }

    private final void V3(q1 q1Var) {
    }

    private final void W(q1 q1Var) {
    }

    private final void W0(q1 q1Var) {
    }

    private final void W3(q1 q1Var) {
    }

    private final void X3(q1 q1Var) {
    }

    private final void Y4(zi ziVar) {
    }

    private final void Z4(zi ziVar) {
    }

    private final void a0(q1 q1Var) {
    }

    private final void a5(zi ziVar) {
    }

    private final void b2(q1 q1Var) {
    }

    private final void b4(q1 q1Var) {
    }

    private final void c0(q1 q1Var) {
    }

    private final void c2(q1 q1Var) {
    }

    private final void c3(q1 q1Var) {
    }

    private final void c4(q1 q1Var) {
    }

    private final void d2(q1 q1Var) {
    }

    private final void d3(q1 q1Var) {
    }

    private final void d4(q1 q1Var) {
    }

    private final void e3(q1 q1Var) {
    }

    private final void e4(zi ziVar) {
    }

    private final void f4(zi ziVar) {
    }

    private final void g4(zi ziVar) {
    }

    private final void h4(q1 q1Var) {
    }

    private final void i4(q1 q1Var) {
    }

    private final void j1(q1 q1Var) {
    }

    private final void j4(q1 q1Var) {
    }

    private final void k1(q1 q1Var) {
    }

    private final void l1(q1 q1Var) {
    }

    private final void l2(q1 q1Var) {
    }

    private final void l3(q1 q1Var) {
    }

    private final void m1(wi wiVar) {
    }

    private final void m3(q1 q1Var) {
    }

    private final void n2(q1 q1Var) {
    }

    private final void n3(q1 q1Var) {
    }

    private final void n4(q1 q1Var) {
    }

    private final void o3(q1 q1Var) {
    }

    private final void o4(q1 q1Var) {
    }

    private final void p3(q1 q1Var) {
    }

    private final void p4(q1 q1Var) {
    }

    private final void q3(q1 q1Var) {
    }

    private final void r2(q1 q1Var) {
    }

    private final void r3(q1 q1Var) {
    }

    private final void s1(wi wiVar) {
    }

    private final void s3(q1 q1Var) {
    }

    private final void t3(q1 q1Var) {
    }

    private final void x3(q1 q1Var) {
    }

    private final void x4(q1 q1Var) {
    }

    private final void y3(q1 q1Var) {
    }

    private final void z3(q1 q1Var) {
    }

    private final void z4(q1 q1Var) {
    }

    @Override
    public void I0(Object obj) {
    }

    @Override
    public void a1(TLRPC.User user) {
    }

    private final void A2(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void K2(q1 q1Var, int i3) {
    }

    private final void L2(q1 q1Var, int i3) {
    }

    private final void M2(q1 q1Var, int i3) {
    }

    private final void O0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void O1(q1 q1Var, o2 o2Var) {
    }

    private final void P3(q1 q1Var, long j10) {
    }

    private final void Q3(q1 q1Var, long j10) {
    }

    private final void R0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void R3(q1 q1Var, long j10) {
    }

    private final void T0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void T1(q1 q1Var, o2 o2Var) {
    }

    private final void X1(q1 q1Var, o2 o2Var) {
    }

    private final void f3(String str, String str2) {
    }

    private final void g2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void g3(String str, String str2) {
    }

    private final void h3(String str, String str2) {
    }

    private final void j2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void k2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void k4(q1 q1Var, g10 g10Var) {
    }

    private final void l(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void l4(q1 q1Var, g10 g10Var) {
    }

    private final void m4(q1 q1Var, g10 g10Var) {
    }

    private final void r4(q1 q1Var, boolean z10) {
    }

    private final void t(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void t4(q1 q1Var, boolean z10) {
    }

    private final void v2(q1 q1Var, int i3) {
    }

    private final void v4(q1 q1Var, boolean z10) {
    }

    private final void w2(q1 q1Var, int i3) {
    }

    private final void x(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void x2(q1 q1Var, int i3) {
    }

    private final void y2(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void z2(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void u(int i3, Object obj) {
    }

    private final void A4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void C4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void D3(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void E3(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void F3(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void Q2(q1 q1Var, float f10, float f11) {
    }

    private final void R2(q1 q1Var, float f10, float f11) {
    }

    private final void S2(q1 q1Var, float f10, float f11) {
    }

    private final void Y3(q1 q1Var, float f10, float f11) {
    }

    private final void Z3(q1 q1Var, float f10, float f11) {
    }

    private final void a(q1 q1Var, float f10, float f11) {
    }

    private final void a4(q1 q1Var, float f10, float f11) {
    }

    private final void e1(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    private final void g1(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    private final void h(q1 q1Var, float f10, float f11) {
    }

    private final void h1(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    private final void i3(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    private final void j3(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    private final void k(q1 q1Var, float f10, float f11) {
    }

    private final void k3(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    private final void s2(q1 q1Var, int i3, int i10) {
    }

    private final void s4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void t2(q1 q1Var, int i3, int i10) {
    }

    private final void u2(q1 q1Var, int i3, int i10) {
    }

    private final void u3(q1 q1Var, float f10, float f11) {
    }

    private final void u4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void v3(q1 q1Var, float f10, float f11) {
    }

    private final void w3(q1 q1Var, float f10, float f11) {
    }

    private final void w4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void y4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void G3(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void H2(q1 q1Var, float f10, float f11, boolean z10) {
    }

    private final void H3(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void I2(q1 q1Var, float f10, float f11, boolean z10) {
    }

    private final void I3(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void J2(q1 q1Var, float f10, float f11, boolean z10) {
    }

    private final void J3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void K3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void L3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void T2(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3) {
    }

    private final void U2(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3) {
    }

    private final void V2(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3) {
    }

    private final void S3(q1 q1Var, ArrayList arrayList, int i3, int i10, int i11) {
    }

    private final void T3(q1 q1Var, ArrayList arrayList, int i3, int i10, int i11) {
    }

    private final void U3(q1 q1Var, ArrayList arrayList, int i3, int i10, int i11) {
    }

    private final void W2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final void X2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final void Y2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    private final void Z2(q1 q1Var, int i3, float f10, float f11, boolean z10) {
    }

    private final void a3(q1 q1Var, int i3, float f10, float f11, boolean z10) {
    }

    private final void b3(q1 q1Var, int i3, float f10, float f11, boolean z10) {
    }

    @Override
    public void o1(int i3, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
    }

    private final void Y0(q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10) {
    }

    private final void Z0(q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10) {
    }

    private final void b1(q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10) {
    }

    @Override
    public void R1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
    }

    private final void L4(zi ziVar, String str, String str2, String str3, String str4, int i3, int i10) {
    }

    private final void M4(zi ziVar, String str, String str2, String str3, String str4, int i3, int i10) {
    }

    private final void N4(zi ziVar, String str, String str2, String str3, String str4, int i3, int i10) {
    }
}

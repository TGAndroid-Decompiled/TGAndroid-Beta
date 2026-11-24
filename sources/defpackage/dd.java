package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class dd implements vv2, ibc, ca1, wj0, aka {
    public final byte a;
    public int b;
    public Object c;

    public dd(int i, byte b) {
        this.a = b;
        switch (b) {
            case 9:
                this.c = new long[i];
                return;
            case 12:
                if (i > 0) {
                    this.c = new Object[i];
                    return;
                } else {
                    w26.j("The max pool size must be > 0");
                    throw null;
                }
            case 17:
                this.c = new CountDownLatch(1);
                this.b = i;
                return;
            default:
                this.c = ByteBuffer.allocate(i);
                this.b = 0;
                return;
        }
    }

    @Override
    public final boolean A(TLRPC.Document document) {
        return false;
    }

    @Override
    public final String C(boolean z) {
        return null;
    }

    @Override
    public final t56 D(jr6 jr6Var) {
        t56 D = ((wj0) this.c).D(jr6Var);
        if (D == null) {
            return null;
        }
        return d4.o(D, new zo4(this, (byte) 3));
    }

    @Override
    public final boolean F() {
        return false;
    }

    @Override
    public final cs5 G(ViewGroup viewGroup) {
        cs5 G = cs5.G(viewGroup, null, new View(((k62) this.c).getContext()));
        G.s = (short) 0;
        G.t = false;
        String M0 = k96.M0(2131746078, null);
        final int i = this.b;
        G.b(2131232336, M0, new Runnable(this) {
            public final dd b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                int i2 = i;
                dd ddVar = this.b;
                switch (b) {
                    case 0:
                        ((k62) ddVar.c).d0(i2);
                        return;
                    default:
                        ((k62) ddVar.c).h0(i2, null);
                        return;
                }
            }
        }, false);
        G.b(2131232113, k96.M0(2131751586, null), new Runnable(this) {
            public final dd b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                int i2 = i;
                dd ddVar = this.b;
                switch (b) {
                    case 0:
                        ((k62) ddVar.c).d0(i2);
                        return;
                    default:
                        ((k62) ddVar.c).h0(i2, null);
                        return;
                }
            }
        }, true);
        return G;
    }

    @Override
    public final void H(String str) {
        String c = d01.c(str);
        if (TextUtils.isEmpty(c)) {
            gl.c3(new am6((byte) 14));
        } else {
            na7.q1(this.b).Y1().a(c, null, new zf7((d) this.c, (byte) 21));
        }
    }

    @Override
    public final boolean K() {
        return false;
    }

    @Override
    public final t56 M(byte[] bArr) {
        return d4.o(((wj0) this.c).M(bArr), new zo4(this, (byte) 3));
    }

    @Override
    public final boolean P(TLRPC.Document document) {
        return false;
    }

    @Override
    public final Boolean S(TLRPC.Document document) {
        return null;
    }

    @Override
    public final boolean T() {
        return true;
    }

    public final Object U() {
        Object[] objArr = (Object[]) this.c;
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object obj = objArr[i2];
        obj.getClass();
        objArr[i2] = null;
        this.b--;
        return obj;
    }

    public final void V(int i, int i2, int i3) {
        if (i3 != 0 && i < i2) {
            int i4 = this.b;
            if (i4 >= 3) {
                int[] iArr = (int[]) this.c;
                if (iArr[i4 - 1] == i3 && iArr[i4 - 2] == i) {
                    iArr[i4 - 2] = i2;
                    return;
                }
            }
            int i5 = i4 + 3;
            int[] iArr2 = (int[]) this.c;
            if (i5 > iArr2.length) {
                iArr2 = Arrays.copyOf(iArr2, iArr2.length << 1);
                this.c = iArr2;
            }
            int i6 = this.b;
            int i7 = i6 + 1;
            this.b = i7;
            iArr2[i6] = i;
            int i8 = i6 + 2;
            this.b = i8;
            iArr2[i7] = i2;
            this.b = i6 + 3;
            iArr2[i8] = i3;
        }
    }

    public final void W(long j) {
        int i = this.b;
        long[] jArr = (long[]) this.c;
        if (i == jArr.length) {
            jArr = Arrays.copyOf(jArr, i << 1);
            this.c = jArr;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        jArr[i2] = j;
    }

    @Override
    public final boolean W0(String str, u91 u91Var) {
        return false;
    }

    public final void X(long[] jArr) {
        int length = this.b + jArr.length;
        long[] jArr2 = (long[]) this.c;
        if (length > jArr2.length) {
            jArr2 = Arrays.copyOf(jArr2, Math.max(jArr2.length << 1, length));
            this.c = jArr2;
        }
        System.arraycopy(jArr, 0, jArr2, this.b, jArr.length);
        this.b = length;
    }

    public final int Y(int i, int i2) {
        int i0 = i0();
        if (i0 >= 0 && i0 <= i && ((i0 * i2) << 2) <= ((jvc) this.c).d - this.b) {
            return i0;
        }
        throw jvc.a();
    }

    public final id Z() {
        int i;
        Message message;
        pc pcVar = (pc) this.c;
        ContextThemeWrapper contextThemeWrapper = (ContextThemeWrapper) pcVar.c;
        id idVar = new id(contextThemeWrapper, this.b);
        View view = (View) pcVar.h;
        sc scVar = idVar.f;
        if (view != null) {
            scVar.r = view;
        } else {
            CharSequence charSequence = (CharSequence) pcVar.f;
            if (charSequence != null) {
                scVar.d = charSequence;
                TextView textView = scVar.p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = (Drawable) pcVar.e;
            if (drawable != null) {
                scVar.n = drawable;
                ImageView imageView = scVar.o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    scVar.o.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = (CharSequence) pcVar.g;
        if (charSequence2 != null) {
            kj0 kj0Var = (kj0) pcVar.j;
            scVar.getClass();
            if (kj0Var != null) {
                message = scVar.z.obtainMessage(-2, kj0Var);
            } else {
                message = null;
            }
            scVar.j = charSequence2;
            scVar.k = message;
        }
        if (((ListAdapter) pcVar.l) != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) ((LayoutInflater) pcVar.d).inflate(scVar.v, (ViewGroup) null);
            if (pcVar.a) {
                i = scVar.w;
            } else {
                i = scVar.x;
            }
            ListAdapter listAdapter = (ListAdapter) pcVar.l;
            if (listAdapter == null) {
                listAdapter = new ArrayAdapter(contextThemeWrapper, i, 16908308, (Object[]) null);
            }
            scVar.s = listAdapter;
            scVar.t = pcVar.b;
            if (((DialogInterface.OnClickListener) pcVar.m) != null) {
                alertController$RecycleListView.setOnItemClickListener(new oc(pcVar, scVar));
            }
            if (pcVar.a) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            scVar.e = alertController$RecycleListView;
        }
        View view2 = pcVar.i;
        if (view2 != null) {
            scVar.f = view2;
            scVar.g = false;
        }
        idVar.setCancelable(true);
        idVar.setCanceledOnTouchOutside(true);
        idVar.setOnCancelListener(null);
        idVar.setOnDismissListener(null);
        zz6 zz6Var = (zz6) pcVar.k;
        if (zz6Var != null) {
            idVar.setOnKeyListener(zz6Var);
        }
        return idVar;
    }

    @Override
    public final String Z0() {
        return null;
    }

    @Override
    public final long a() {
        return 0L;
    }

    public final defpackage.m2c a0(int r8, defpackage.ju8 r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dd.a0(int, ju8):m2c");
    }

    @Override
    public final boolean b() {
        return false;
    }

    public final void b0(int i) {
        ByteBuffer allocate = ByteBuffer.allocate(i);
        int position = ((ByteBuffer) this.c).position();
        ((ByteBuffer) this.c).position(0);
        allocate.put((ByteBuffer) this.c);
        allocate.position(position);
        this.c = allocate;
    }

    @Override
    public final boolean c() {
        return false;
    }

    public final float c0() {
        float intBitsToFloat = Float.intBitsToFloat(i0());
        if (!Float.isNaN(intBitsToFloat) && !Float.isInfinite(intBitsToFloat)) {
            return intBitsToFloat;
        }
        return 0.0f;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    public final void d0(int i, float[] fArr) {
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = c0();
        }
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return false;
    }

    public final byte e0(int i) {
        if (i >= 0 && this.b > i) {
            return ((ByteBuffer) this.c).get(i);
        }
        throw new IndexOutOfBoundsException(String.format("Bad index: index=%d, length=%d", Integer.valueOf(i), Integer.valueOf(this.b)));
    }

    @Override
    public final boolean f() {
        return false;
    }

    public final long f0(int i) {
        if (i >= 0 && i < this.b) {
            return ((long[]) this.c)[i];
        }
        w26.h(this.b, de9.m(i, "Invalid index ", ", size is "));
        return 0L;
    }

    @Override
    public final TLRPC.PollAnswer g() {
        return null;
    }

    public final boolean g0(int i) {
        if ((e0(i / 8) & (1 << (i % 8))) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean h() {
        return true;
    }

    public final List h0(ju8 ju8Var) {
        boolean z;
        String str;
        int i;
        List list;
        boolean z2;
        List list2 = (List) this.c;
        if (j0(32)) {
            return list2;
        }
        xu7 xu7Var = new xu7(ju8Var.b);
        while (xu7Var.a() > 0) {
            int A = xu7Var.A();
            int A2 = xu7Var.b + xu7Var.A();
            if (A == 134) {
                ArrayList arrayList = new ArrayList();
                int A3 = xu7Var.A() & 31;
                for (int i2 = 0; i2 < A3; i2++) {
                    String y = xu7Var.y(3, StandardCharsets.UTF_8);
                    int A4 = xu7Var.A();
                    if ((A4 & 128) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i = A4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte A5 = (byte) xu7Var.A();
                    xu7Var.O(1);
                    if (z) {
                        if ((A5 & 64) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        byte[] bArr = wj2.a;
                        list = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    em4 em4Var = new em4();
                    em4Var.s = ud7.n(str);
                    em4Var.d = y;
                    em4Var.S = i;
                    em4Var.v = list;
                    arrayList.add(new fm4(em4Var));
                }
                list2 = arrayList;
            }
            xu7Var.N(A2);
        }
        return list2;
    }

    @Override
    public final boolean i() {
        return false;
    }

    public final int i0() {
        int i = this.b;
        int i2 = i + 4;
        jvc jvcVar = (jvc) this.c;
        if (i2 <= jvcVar.d) {
            int i3 = jvcVar.a.getInt(i);
            this.b += 4;
            return i3;
        }
        throw jvc.a();
    }

    @Override
    public final boolean j(int i) {
        return false;
    }

    public final boolean j0(int i) {
        if ((this.b & i) != 0) {
            return true;
        }
        return false;
    }

    public final void k0(int i) {
        int capacity = ((ByteBuffer) this.c).capacity();
        int i2 = this.b;
        if (capacity < i2 + 1) {
            b0(i2 + 1024);
        }
        ((ByteBuffer) this.c).put((byte) i);
        this.b++;
    }

    public final void l0(byte[] bArr) {
        int capacity = ((ByteBuffer) this.c).capacity();
        int i = this.b;
        if (capacity < bArr.length + i) {
            b0(i + bArr.length + 1024);
        }
        ((ByteBuffer) this.c).put(bArr);
        this.b += bArr.length;
    }

    public final int m0(int[] iArr, int i) {
        int i2 = iArr[0];
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            if (g0(i2 + i4)) {
                i5 += i3;
            }
            i4++;
            i3 <<= 1;
        }
        iArr[0] = iArr[0] + i;
        return i5;
    }

    @Override
    public final boolean n() {
        return false;
    }

    public final long n0(ja3 ja3Var) {
        xu7 xu7Var = (xu7) this.c;
        int i = 0;
        ja3Var.d(xu7Var.a, 0, 1, false);
        int i2 = xu7Var.a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        ja3Var.d(xu7Var.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (i5 << 8) + (xu7Var.a[i] & 255);
        }
        this.b = i4 + 1 + this.b;
        return i5;
    }

    public final void o0(Object obj) {
        Object[] objArr = (Object[]) this.c;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == obj) {
                sc8.j("Already in the pool!");
                return;
            }
        }
        int i3 = this.b;
        if (i3 < objArr.length) {
            objArr[i3] = obj;
            this.b = i3 + 1;
        }
    }

    @Override
    public final void onStateChanged(boolean z, int i) {
        gl.c3(new bt(this, this.b, i, (byte) 10));
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public final boolean p0(int i) {
        if (((zl2) this.c) != null && this.b == i) {
            return false;
        }
        this.b = i;
        this.c = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i, i}, (float[]) null, Shader.TileMode.CLAMP);
        return true;
    }

    public final byte[] q0(int i, int i2) {
        int i3 = i2 - i;
        if (i3 >= 0 && i >= 0 && this.b >= i2) {
            byte[] bArr = new byte[i3];
            if (i3 != 0) {
                System.arraycopy(((ByteBuffer) this.c).array(), i, bArr, 0, i3);
            }
            return bArr;
        }
        throw new IllegalArgumentException(String.format("Bad range: beginIndex=%d, endIndex=%d, length=%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.b)));
    }

    @Override
    public final boolean t() {
        return true;
    }

    public final String toString() {
        switch (this.a) {
            case 20:
                im5 im5Var = (im5) this.c;
                int i = im5Var.b;
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(g8c.f0(im5Var.b(i2)));
                }
                return "UnsupportedBrands{major=" + g8c.f0(this.b) + ", compatible=" + arrayList + "}";
            default:
                return super.toString();
        }
    }

    @Override
    public final k27 w() {
        return null;
    }

    @Override
    public final boolean x() {
        return false;
    }

    @Override
    public final boolean z() {
        return false;
    }

    @Override
    public final void onRenderedFirstFrame() {
    }

    @Override
    public final void L() {
    }

    @Override
    public final void N() {
    }

    @Override
    public final void onDismiss() {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void B(TLRPC.Document document) {
    }

    @Override
    public final void E(TLRPC.Document document) {
    }

    @Override
    public final void I(s3a s3aVar) {
    }

    @Override
    public final void Q(String str) {
    }

    @Override
    public final void Q1(vf7 vf7Var) {
    }

    @Override
    public final void l(String str) {
    }

    @Override
    public final void m(TLRPC.Document document) {
    }

    @Override
    public final void o(TLRPC.Document document) {
    }

    @Override
    public final void onRenderedFirstFrame(tj tjVar) {
    }

    @Override
    public final void onSeekFinished(tj tjVar) {
    }

    @Override
    public final void onSeekStarted(tj tjVar) {
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public final void r(TLRPC.Document document) {
    }

    @Override
    public final void v(String str) {
    }

    @Override
    public final void y(TLRPC.Document document) {
    }

    @Override
    public final void J(Object obj, Object obj2) {
    }

    @Override
    public final void O(TLRPC.InputStickerSet inputStickerSet, boolean z) {
    }

    @Override
    public final void onError(lbc lbcVar, Exception exc) {
    }

    @Override
    public final void s(TLRPC.StickerSet stickerSet, String str) {
    }

    public dd(int i, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
    }

    public dd(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public dd(ds2 ds2Var, int i) {
        this.a = (byte) 22;
        fre.h(ds2Var);
        this.c = ds2Var;
        this.b = i;
    }

    public dd(byte b) {
        this.a = b;
        switch (b) {
            case 7:
                this.c = new do3[2];
                return;
            case 16:
                this.c = new xu7(8);
                return;
            default:
                this.b = 0;
                this.c = new StringBuilder();
                return;
        }
    }

    public dd(int[] iArr, int i) {
        this.a = (byte) 20;
        this.b = i;
        im5 im5Var = im5.c;
        if (iArr != null && iArr.length != 0) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            im5Var = new im5(copyOf, copyOf.length);
        }
        this.c = im5Var;
    }

    @Override
    public final void R(CharSequence charSequence, String str, pz1 pz1Var) {
    }

    public dd(byte b, boolean z) {
        this.a = b;
    }

    public dd(jvc jvcVar) {
        this.a = (byte) 21;
        this.c = jvcVar;
        this.b = 20;
    }

    public dd(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 5:
                this.c = context;
                this.b = -1;
                return;
            default:
                int e = id.e(context, 0);
                this.c = new pc(new ContextThemeWrapper(context, id.e(context, e)));
                this.b = e;
                return;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
    }

    @Override
    public final void u(Object obj, Object obj2, boolean z, int i, int i2) {
    }

    @Override
    public final void k(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
    }
}

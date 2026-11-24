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
public final class de implements fx2, ldc, kb1, wk0, bma {
    public final byte a;
    public int b;
    public Object c;

    public de(int i, byte b) {
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
                    u36.j("The max pool size must be > 0");
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
    public final boolean B() {
        return false;
    }

    @Override
    public final String B0() {
        return null;
    }

    @Override
    public final boolean C(TLRPC.Document document) {
        return false;
    }

    @Override
    public final String E(boolean z) {
        return null;
    }

    @Override
    public final t76 F(jt6 jt6Var) {
        t76 F = ((wk0) this.c).F(jt6Var);
        if (F == null) {
            return null;
        }
        return d4.o(F, new ar4(this, (byte) 3));
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final bu5 I(ViewGroup viewGroup) {
        bu5 G = bu5.G(viewGroup, null, new View(((v72) this.c).getContext()));
        G.s = (short) 0;
        G.t = false;
        String M0 = jb6.M0(2131746004, null);
        final int i = this.b;
        G.b(2131232337, M0, new Runnable(this) {
            public final de b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                int i2 = i;
                de deVar = this.b;
                switch (b) {
                    case 0:
                        ((v72) deVar.c).d0(i2);
                        return;
                    default:
                        ((v72) deVar.c).h0(i2, null);
                        return;
                }
            }
        }, false);
        G.b(2131232114, jb6.M0(2131751535, null), new Runnable(this) {
            public final de b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                int i2 = i;
                de deVar = this.b;
                switch (b) {
                    case 0:
                        ((v72) deVar.c).d0(i2);
                        return;
                    default:
                        ((v72) deVar.c).h0(i2, null);
                        return;
                }
            }
        }, true);
        return G;
    }

    @Override
    public final boolean L() {
        return false;
    }

    @Override
    public final t76 N(byte[] bArr) {
        return d4.o(((wk0) this.c).N(bArr), new ar4(this, (byte) 3));
    }

    @Override
    public final boolean Q(TLRPC.Document document) {
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
    public final boolean X(String str, db1 db1Var) {
        return false;
    }

    public final void Y(long[] jArr) {
        int length = this.b + jArr.length;
        long[] jArr2 = (long[]) this.c;
        if (length > jArr2.length) {
            jArr2 = Arrays.copyOf(jArr2, Math.max(jArr2.length << 1, length));
            this.c = jArr2;
        }
        System.arraycopy(jArr, 0, jArr2, this.b, jArr.length);
        this.b = length;
    }

    public final int Z(int i, int i2) {
        int j0 = j0();
        if (j0 >= 0 && j0 <= i && ((j0 * i2) << 2) <= ((kxc) this.c).d - this.b) {
            return j0;
        }
        throw kxc.a();
    }

    @Override
    public final long a() {
        return 0L;
    }

    public final ie a0() {
        int i;
        Message message;
        pd pdVar = (pd) this.c;
        ContextThemeWrapper contextThemeWrapper = (ContextThemeWrapper) pdVar.c;
        ie ieVar = new ie(contextThemeWrapper, this.b);
        View view = (View) pdVar.h;
        sd sdVar = ieVar.f;
        if (view != null) {
            sdVar.r = view;
        } else {
            CharSequence charSequence = (CharSequence) pdVar.f;
            if (charSequence != null) {
                sdVar.d = charSequence;
                TextView textView = sdVar.p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = (Drawable) pdVar.e;
            if (drawable != null) {
                sdVar.n = drawable;
                ImageView imageView = sdVar.o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    sdVar.o.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = (CharSequence) pdVar.g;
        if (charSequence2 != null) {
            kk0 kk0Var = (kk0) pdVar.j;
            sdVar.getClass();
            if (kk0Var != null) {
                message = sdVar.z.obtainMessage(-2, kk0Var);
            } else {
                message = null;
            }
            sdVar.j = charSequence2;
            sdVar.k = message;
        }
        if (((ListAdapter) pdVar.l) != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) ((LayoutInflater) pdVar.d).inflate(sdVar.v, (ViewGroup) null);
            if (pdVar.a) {
                i = sdVar.w;
            } else {
                i = sdVar.x;
            }
            ListAdapter listAdapter = (ListAdapter) pdVar.l;
            if (listAdapter == null) {
                listAdapter = new ArrayAdapter(contextThemeWrapper, i, 16908308, (Object[]) null);
            }
            sdVar.s = listAdapter;
            sdVar.t = pdVar.b;
            if (((DialogInterface.OnClickListener) pdVar.m) != null) {
                alertController$RecycleListView.setOnItemClickListener(new od(pdVar, sdVar));
            }
            if (pdVar.a) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            sdVar.e = alertController$RecycleListView;
        }
        View view2 = pdVar.i;
        if (view2 != null) {
            sdVar.f = view2;
            sdVar.g = false;
        }
        ieVar.setCancelable(true);
        ieVar.setCanceledOnTouchOutside(true);
        ieVar.setOnCancelListener(null);
        ieVar.setOnDismissListener(null);
        z17 z17Var = (z17) pdVar.k;
        if (z17Var != null) {
            ieVar.setOnKeyListener(z17Var);
        }
        return ieVar;
    }

    @Override
    public final boolean b() {
        return false;
    }

    public final defpackage.m4c b0(int r8, defpackage.kw8 r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.de.b0(int, kw8):m4c");
    }

    @Override
    public final boolean c() {
        return false;
    }

    public final void c0(int i) {
        ByteBuffer allocate = ByteBuffer.allocate(i);
        int position = ((ByteBuffer) this.c).position();
        ((ByteBuffer) this.c).position(0);
        allocate.put((ByteBuffer) this.c);
        allocate.position(position);
        this.c = allocate;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    public final float d0() {
        float intBitsToFloat = Float.intBitsToFloat(j0());
        if (!Float.isNaN(intBitsToFloat) && !Float.isInfinite(intBitsToFloat)) {
            return intBitsToFloat;
        }
        return 0.0f;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return false;
    }

    public final void e0(int i, float[] fArr) {
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = d0();
        }
    }

    @Override
    public final boolean f() {
        return false;
    }

    public final byte f0(int i) {
        if (i >= 0 && this.b > i) {
            return ((ByteBuffer) this.c).get(i);
        }
        throw new IndexOutOfBoundsException(String.format("Bad index: index=%d, length=%d", Integer.valueOf(i), Integer.valueOf(this.b)));
    }

    @Override
    public final TLRPC.PollAnswer g() {
        return null;
    }

    public final long g0(int i) {
        if (i >= 0 && i < this.b) {
            return ((long[]) this.c)[i];
        }
        u36.h(this.b, hg9.l(i, "Invalid index ", ", size is "));
        return 0L;
    }

    @Override
    public final boolean h() {
        return true;
    }

    public final boolean h0(int i) {
        if ((f0(i / 8) & (1 << (i % 8))) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean i() {
        return false;
    }

    public final List i0(kw8 kw8Var) {
        boolean z;
        String str;
        int i;
        List list;
        boolean z2;
        List list2 = (List) this.c;
        if (k0(32)) {
            return list2;
        }
        yw7 yw7Var = new yw7(kw8Var.b);
        while (yw7Var.a() > 0) {
            int A = yw7Var.A();
            int A2 = yw7Var.b + yw7Var.A();
            if (A == 134) {
                ArrayList arrayList = new ArrayList();
                int A3 = yw7Var.A() & 31;
                for (int i2 = 0; i2 < A3; i2++) {
                    String y = yw7Var.y(3, StandardCharsets.UTF_8);
                    int A4 = yw7Var.A();
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
                    byte A5 = (byte) yw7Var.A();
                    yw7Var.O(1);
                    if (z) {
                        if ((A5 & 64) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        byte[] bArr = jl2.a;
                        list = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    fo4 fo4Var = new fo4();
                    fo4Var.s = wf7.n(str);
                    fo4Var.d = y;
                    fo4Var.S = i;
                    fo4Var.v = list;
                    arrayList.add(new go4(fo4Var));
                }
                list2 = arrayList;
            }
            yw7Var.N(A2);
        }
        return list2;
    }

    @Override
    public final boolean j(int i) {
        return false;
    }

    public final int j0() {
        int i = this.b;
        int i2 = i + 4;
        kxc kxcVar = (kxc) this.c;
        if (i2 <= kxcVar.d) {
            int i3 = kxcVar.a.getInt(i);
            this.b += 4;
            return i3;
        }
        throw kxc.a();
    }

    public final boolean k0(int i) {
        if ((this.b & i) != 0) {
            return true;
        }
        return false;
    }

    public final void l0(int i) {
        int capacity = ((ByteBuffer) this.c).capacity();
        int i2 = this.b;
        if (capacity < i2 + 1) {
            c0(i2 + 1024);
        }
        ((ByteBuffer) this.c).put((byte) i);
        this.b++;
    }

    public final void m0(byte[] bArr) {
        int capacity = ((ByteBuffer) this.c).capacity();
        int i = this.b;
        if (capacity < bArr.length + i) {
            c0(i + bArr.length + 1024);
        }
        ((ByteBuffer) this.c).put(bArr);
        this.b += bArr.length;
    }

    @Override
    public final boolean n() {
        return false;
    }

    public final int n0(int[] iArr, int i) {
        int i2 = iArr[0];
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            if (h0(i2 + i4)) {
                i5 += i3;
            }
            i4++;
            i3 <<= 1;
        }
        iArr[0] = iArr[0] + i;
        return i5;
    }

    public final long o0(vb3 vb3Var) {
        yw7 yw7Var = (yw7) this.c;
        int i = 0;
        vb3Var.d(yw7Var.a, 0, 1, false);
        int i2 = yw7Var.a[0] & 255;
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
        vb3Var.d(yw7Var.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (i5 << 8) + (yw7Var.a[i] & 255);
        }
        this.b = i4 + 1 + this.b;
        return i5;
    }

    @Override
    public final void onStateChanged(boolean z, int i) {
        gm.c3(new cu(this, this.b, i, (byte) 10));
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public final void p0(Object obj) {
        Object[] objArr = (Object[]) this.c;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == obj) {
                dq9.m("Already in the pool!");
                return;
            }
        }
        int i3 = this.b;
        if (i3 < objArr.length) {
            objArr[i3] = obj;
            this.b = i3 + 1;
        }
    }

    public final boolean q0(int i) {
        if (((mn2) this.c) != null && this.b == i) {
            return false;
        }
        this.b = i;
        this.c = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{i, i}, (float[]) null, Shader.TileMode.CLAMP);
        return true;
    }

    public final byte[] r0(int i, int i2) {
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
                io5 io5Var = (io5) this.c;
                int i = io5Var.b;
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(hac.f0(io5Var.b(i2)));
                }
                return "UnsupportedBrands{major=" + hac.f0(this.b) + ", compatible=" + arrayList + "}";
            default:
                return super.toString();
        }
    }

    @Override
    public final void v(String str) {
        String c = l11.c(str);
        if (TextUtils.isEmpty(c)) {
            gm.c3(new bo6((byte) 14));
        } else {
            oc7.r1(this.b).Z1().a(c, null, new ci7((d) this.c, (byte) 21));
        }
    }

    @Override
    public final k47 x() {
        return null;
    }

    @Override
    public final boolean y() {
        return false;
    }

    @Override
    public final void onRenderedFirstFrame() {
    }

    @Override
    public final void M() {
    }

    @Override
    public final void O() {
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
    public final void A(TLRPC.Document document) {
    }

    @Override
    public final void D(TLRPC.Document document) {
    }

    @Override
    public final void G(TLRPC.Document document) {
    }

    @Override
    public final void I0(yh7 yh7Var) {
    }

    @Override
    public final void J(t5a t5aVar) {
    }

    @Override
    public final void R(String str) {
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
    public final void onRenderedFirstFrame(tk tkVar) {
    }

    @Override
    public final void onSeekFinished(tk tkVar) {
    }

    @Override
    public final void onSeekStarted(tk tkVar) {
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public final void r(TLRPC.Document document) {
    }

    @Override
    public final void w(String str) {
    }

    @Override
    public final void K(Object obj, Object obj2) {
    }

    @Override
    public final void P(TLRPC.InputStickerSet inputStickerSet, boolean z) {
    }

    @Override
    public final void onError(ndc ndcVar, Exception exc) {
    }

    @Override
    public final void s(TLRPC.StickerSet stickerSet, String str) {
    }

    public de(int i, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
    }

    public de(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public de(ot2 ot2Var, int i) {
        this.a = (byte) 22;
        ite.h(ot2Var);
        this.c = ot2Var;
        this.b = i;
    }

    public de(byte b) {
        this.a = b;
        switch (b) {
            case 7:
                this.c = new np3[2];
                return;
            case 16:
                this.c = new yw7(8);
                return;
            default:
                this.b = 0;
                this.c = new StringBuilder();
                return;
        }
    }

    public de(int[] iArr, int i) {
        this.a = (byte) 20;
        this.b = i;
        io5 io5Var = io5.c;
        if (iArr != null && iArr.length != 0) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            io5Var = new io5(copyOf, copyOf.length);
        }
        this.c = io5Var;
    }

    @Override
    public final void z(CharSequence charSequence, String str, qy1 qy1Var) {
    }

    public de(byte b, boolean z) {
        this.a = b;
    }

    public de(kxc kxcVar) {
        this.a = (byte) 21;
        this.c = kxcVar;
        this.b = 20;
    }

    public de(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 5:
                this.c = context;
                this.b = -1;
                return;
            default:
                int e = ie.e(context, 0);
                this.c = new pd(new ContextThemeWrapper(context, ie.e(context, e)));
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

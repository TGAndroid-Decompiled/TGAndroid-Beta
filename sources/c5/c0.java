package c5;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Message;
import android.os.Parcel;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import b2.s0;
import b2.v0;
import com.google.android.gms.internal.play_billing.i4;
import e2.m0;
import j$.util.DesugarCollections;
import java.net.URI;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import ji.m5;
import v7.q8;
public final class c0 implements e2.d, r2.u, c3.f0 {
    public final int f4351a;
    public int f4352b;
    public Object f4353c;

    public c0(int i10, boolean z10, boolean z11) {
        this.f4351a = i10;
    }

    @Override
    public MediaCodecInfo a(int i10) {
        if (((MediaCodecInfo[]) this.f4353c) == null) {
            this.f4353c = new MediaCodecList(this.f4352b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f4353c)[i10];
    }

    public Object b() {
        Object[] objArr = (Object[]) this.f4353c;
        int i10 = this.f4352b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = objArr[i11];
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i11] = null;
        this.f4352b--;
        return obj;
    }

    public void c(long j10) {
        int i10 = this.f4352b;
        long[] jArr = (long[]) this.f4353c;
        if (i10 == jArr.length) {
            this.f4353c = Arrays.copyOf(jArr, i10 * 2);
        }
        int i11 = this.f4352b;
        this.f4352b = i11 + 1;
        ((long[]) this.f4353c)[i11] = j10;
    }

    @Override
    public j9.y d(s0 s0Var) {
        j9.y d = ((e2.d) this.f4353c).d(s0Var);
        if (d == null) {
            return null;
        }
        return q8.c(d, new m5(this, 9));
    }

    @Override
    public boolean e(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public void f(long[] jArr) {
        int length = this.f4352b + jArr.length;
        long[] jArr2 = (long[]) this.f4353c;
        if (length > jArr2.length) {
            this.f4353c = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, (long[]) this.f4353c, this.f4352b, jArr.length);
        this.f4352b = length;
    }

    public g.f g() {
        int i10;
        Message message;
        g.b bVar = (g.b) this.f4353c;
        g.f fVar = new g.f(bVar.f9730a, this.f4352b);
        View view = bVar.e;
        g.e eVar = fVar.f9764f;
        if (view != null) {
            eVar.f9756r = view;
        } else {
            CharSequence charSequence = bVar.d;
            if (charSequence != null) {
                eVar.d = charSequence;
                TextView textView = eVar.f9754p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = bVar.f9732c;
            if (drawable != null) {
                eVar.f9752n = drawable;
                ImageView imageView = eVar.f9753o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    eVar.f9753o.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = bVar.f9733f;
        if (charSequence2 != null) {
            androidx.biometric.y yVar = bVar.f9734g;
            eVar.getClass();
            if (yVar != null) {
                message = eVar.f9763z.obtainMessage(-2, yVar);
            } else {
                message = null;
            }
            eVar.f9748j = charSequence2;
            eVar.f9749k = message;
        }
        if (bVar.f9735i != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) bVar.f9731b.inflate(eVar.v, (ViewGroup) null);
            if (bVar.f9738l) {
                i10 = eVar.f9760w;
            } else {
                i10 = eVar.f9761x;
            }
            Object obj = bVar.f9735i;
            ArrayAdapter arrayAdapter = obj;
            if (obj == null) {
                arrayAdapter = new ArrayAdapter(bVar.f9730a, i10, 16908308, (Object[]) null);
            }
            eVar.f9757s = arrayAdapter;
            eVar.f9758t = bVar.f9739m;
            if (bVar.f9736j != null) {
                alertController$RecycleListView.setOnItemClickListener(new g.a(bVar, eVar));
            }
            if (bVar.f9738l) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            eVar.e = alertController$RecycleListView;
        }
        View view2 = bVar.f9737k;
        if (view2 != null) {
            eVar.f9745f = view2;
            eVar.f9746g = false;
        }
        fVar.setCancelable(true);
        fVar.setCanceledOnTouchOutside(true);
        fVar.setOnCancelListener(null);
        fVar.setOnDismissListener(null);
        l.l lVar = bVar.h;
        if (lVar != null) {
            fVar.setOnKeyListener(lVar);
        }
        return fVar;
    }

    @Override
    public boolean h(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public tc.u i(String str) {
        Matcher matcher;
        String str2;
        Matcher matcher2;
        boolean z10;
        String str3;
        int i10;
        SocketFactory socketFactory;
        int i11 = this.f4352b;
        if (str != null) {
            if (i11 >= 0) {
                URI create = URI.create(str);
                if (create != null) {
                    if (i11 >= 0) {
                        String scheme = create.getScheme();
                        String userInfo = create.getUserInfo();
                        SecureRandom secureRandom = tc.k.f45586a;
                        String host = create.getHost();
                        if (host == null) {
                            String rawAuthority = create.getRawAuthority();
                            if (rawAuthority == null || (matcher = Pattern.compile("^(.*@)?([^:]+)(:\\d+)?$").matcher(rawAuthority)) == null || !matcher.matches()) {
                                host = null;
                            } else {
                                host = matcher.group(2);
                            }
                            if (host == null) {
                                String uri = create.toString();
                                if (uri != null && (matcher2 = Pattern.compile("^\\w+://([^@/]*@)?([^:/]+)(:\\d+)?(/.*)?$").matcher(uri)) != null && matcher2.matches()) {
                                    host = matcher2.group(2);
                                } else {
                                    str2 = null;
                                    int port = create.getPort();
                                    String rawPath = create.getRawPath();
                                    String rawQuery = create.getRawQuery();
                                    if (scheme == null && scheme.length() != 0) {
                                        if (!"wss".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                                            if (!"ws".equalsIgnoreCase(scheme) && !"http".equalsIgnoreCase(scheme)) {
                                                throw new IllegalArgumentException("Bad scheme: ".concat(scheme));
                                            }
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        if (str2 != null && str2.length() != 0) {
                                            if (rawPath == null || rawPath.length() == 0) {
                                                str3 = "/";
                                            } else {
                                                if (!rawPath.startsWith("/")) {
                                                    rawPath = "/".concat(rawPath);
                                                }
                                                str3 = rawPath;
                                            }
                                            if (port >= 0) {
                                                i10 = port;
                                            } else if (z10) {
                                                i10 = 443;
                                            } else {
                                                i10 = 80;
                                            }
                                            ((sb.a) this.f4353c).getClass();
                                            if (z10) {
                                                socketFactory = SSLSocketFactory.getDefault();
                                            } else {
                                                socketFactory = SocketFactory.getDefault();
                                            }
                                            tc.s sVar = new tc.s(socketFactory, new tc.a(str2, i10), i11, null, null);
                                            sVar.d = 1;
                                            sVar.e = 250;
                                            sVar.f45601f = true;
                                            if (port >= 0) {
                                                str2 = str2 + ":" + port;
                                            }
                                            if (rawQuery != null) {
                                                str3 = a1.g.D(str3, "?", rawQuery);
                                            }
                                            return new tc.u(z10, userInfo, str2, str3, sVar);
                                        }
                                        throw new IllegalArgumentException("The host part is empty.");
                                    }
                                    throw new IllegalArgumentException("The scheme part is empty.");
                                }
                            }
                        }
                        str2 = host;
                        int port2 = create.getPort();
                        String rawPath2 = create.getRawPath();
                        String rawQuery2 = create.getRawQuery();
                        if (scheme == null) {
                        }
                        throw new IllegalArgumentException("The scheme part is empty.");
                    }
                    throw new IllegalArgumentException("The given timeout value is negative.");
                }
                throw new IllegalArgumentException("The given URI is null.");
            }
            throw new IllegalArgumentException("The given timeout value is negative.");
        }
        throw new IllegalArgumentException("The given URI is null.");
    }

    public void j(int i10) {
        ByteBuffer allocate = ByteBuffer.allocate(i10);
        int position = ((ByteBuffer) this.f4353c).position();
        ((ByteBuffer) this.f4353c).position(0);
        allocate.put((ByteBuffer) this.f4353c);
        allocate.position(position);
        this.f4353c = allocate;
    }

    @Override
    public int k() {
        if (((MediaCodecInfo[]) this.f4353c) == null) {
            this.f4353c = new MediaCodecList(this.f4352b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f4353c).length;
    }

    public byte l(int i10) {
        if (i10 >= 0 && this.f4352b > i10) {
            return ((ByteBuffer) this.f4353c).get(i10);
        }
        throw new IndexOutOfBoundsException(String.format("Bad index: index=%d, length=%d", Integer.valueOf(i10), Integer.valueOf(this.f4352b)));
    }

    public long m(int i10) {
        if (i10 >= 0 && i10 < this.f4352b) {
            return ((long[]) this.f4353c)[i10];
        }
        StringBuilder k10 = i2.d.k(i10, "Invalid index ", ", size is ");
        k10.append(this.f4352b);
        throw new IndexOutOfBoundsException(k10.toString());
    }

    public boolean n(int i10) {
        int i11 = i10 / 8;
        if (((1 << (i10 % 8)) & l(i11)) != 0) {
            return true;
        }
        return false;
    }

    public synchronized List o() {
        return DesugarCollections.unmodifiableList(new ArrayList((ArrayList) this.f4353c));
    }

    public void p(int i10) {
        int capacity = ((ByteBuffer) this.f4353c).capacity();
        int i11 = this.f4352b;
        if (capacity < i11 + 1) {
            j(i11 + 1024);
        }
        ((ByteBuffer) this.f4353c).put((byte) i10);
        this.f4352b++;
    }

    @Override
    public j9.y q(byte[] bArr) {
        return q8.c(((e2.d) this.f4353c).q(bArr), new m5(this, 9));
    }

    public void r(byte[] bArr) {
        int capacity = ((ByteBuffer) this.f4353c).capacity();
        int i10 = this.f4352b;
        if (capacity < bArr.length + i10) {
            j(i10 + bArr.length + 1024);
        }
        ((ByteBuffer) this.f4353c).put(bArr);
        this.f4352b += bArr.length;
    }

    public int s(int i10, int[] iArr) {
        int i11 = iArr[0];
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            if (n(i11 + i13)) {
                i14 += i12;
            }
            i13++;
            i12 *= 2;
        }
        iArr[0] = iArr[0] + i10;
        return i14;
    }

    public long t(c3.l lVar) {
        e2.x xVar = (e2.x) this.f4353c;
        int i10 = 0;
        lVar.j(xVar.f8411a, 0, 1, false);
        int i11 = xVar.f8411a[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        lVar.j(xVar.f8411a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (xVar.f8411a[i10] & 255) + (i14 << 8);
        }
        this.f4352b = i13 + 1 + this.f4352b;
        return i14;
    }

    public String toString() {
        switch (this.f4351a) {
            case 7:
                return new String((char[]) this.f4353c, 0, this.f4352b);
            case 14:
                i9.a aVar = (i9.a) this.f4353c;
                ArrayList arrayList = new ArrayList(aVar.f11347b);
                for (int i10 = 0; i10 < aVar.f11347b; i10++) {
                    arrayList.add(m0.e0(aVar.b(i10)));
                }
                return "UnsupportedBrands{major=" + m0.e0(this.f4352b) + ", compatible=" + arrayList + "}";
            default:
                return super.toString();
        }
    }

    public void u(Object instance) {
        Object[] objArr = (Object[]) this.f4353c;
        kotlin.jvm.internal.i.e(instance, "instance");
        int i10 = this.f4352b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == instance) {
                throw new IllegalStateException("Already in the pool!");
            }
        }
        int i12 = this.f4352b;
        if (i12 < objArr.length) {
            objArr[i12] = instance;
            this.f4352b = i12 + 1;
        }
    }

    @Override
    public boolean v() {
        return true;
    }

    public byte[] w(int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 >= 0 && i10 >= 0 && this.f4352b >= i11) {
            byte[] bArr = new byte[i12];
            if (i12 != 0) {
                System.arraycopy(((ByteBuffer) this.f4353c).array(), i10, bArr, 0, i12);
            }
            return bArr;
        }
        throw new IllegalArgumentException(String.format("Bad range: beginIndex=%d, endIndex=%d, length=%d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(this.f4352b)));
    }

    public String x(i4 i4Var) {
        String str;
        e0 e0Var = (e0) this.f4353c;
        int i10 = this.f4352b;
        try {
            if (e0Var.E != null) {
                com.google.android.gms.internal.play_billing.g gVar = e0Var.E;
                String packageName = e0Var.C.getPackageName();
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                if (i10 != 6) {
                                    str = "QUERY_PRODUCT_DETAILS_ASYNC";
                                } else {
                                    str = "START_CONNECTION";
                                }
                            } else {
                                str = "IS_FEATURE_SUPPORTED";
                            }
                        } else {
                            str = "CONSUME_ASYNC";
                        }
                    } else {
                        str = "ACKNOWLEDGE_PURCHASE";
                    }
                } else {
                    str = "LAUNCH_BILLING_FLOW";
                }
                d0 d0Var = new d0(i4Var);
                com.google.android.gms.internal.play_billing.e eVar = (com.google.android.gms.internal.play_billing.e) gVar;
                Parcel T0 = eVar.T0();
                T0.writeString(packageName);
                T0.writeString(str);
                int i11 = com.google.android.gms.internal.play_billing.d.f5626a;
                T0.writeStrongBinder(d0Var);
                eVar.f315b.transact(1, T0, null, 1);
                T0.recycle();
                return "billingOverrideService.getBillingOverride";
            }
            throw null;
        } catch (Exception e) {
            e0Var.F(95, 28, h0.f4380p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            i4Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    public c0(Object obj, int i10, int i11) {
        this.f4351a = i11;
        this.f4353c = obj;
        this.f4352b = i10;
    }

    public c0(k6.a aVar, int i10) {
        this.f4351a = 2;
        n6.l.h(aVar);
        this.f4353c = aVar;
        this.f4352b = i10;
    }

    public c0(int i10, short s10) {
        this.f4351a = i10;
        switch (i10) {
            case 12:
                this.f4353c = new sb.a();
                return;
            case 13:
                this.f4353c = new e2.x(8);
                return;
            case 17:
                this.f4353c = new ArrayList();
                this.f4352b = 128;
                return;
            default:
                this.f4352b = 0;
                this.f4353c = new StringBuilder();
                return;
        }
    }

    public c0(int i10, int i11) {
        this.f4351a = i11;
        switch (i11) {
            case 8:
                if (i10 > 0) {
                    this.f4353c = new Object[i10];
                    return;
                }
                throw new IllegalArgumentException("The max pool size must be > 0");
            case 9:
            default:
                this.f4353c = new long[i10];
                return;
            case 10:
                this.f4353c = ByteBuffer.allocate(i10);
                this.f4352b = 0;
                return;
            case 11:
                this.f4353c = new CountDownLatch(1);
                this.f4352b = i10;
                return;
        }
    }

    public c0(int i10, int[] iArr) {
        i9.a aVar;
        this.f4351a = 14;
        this.f4352b = i10;
        if (iArr != null) {
            i9.a aVar2 = i9.a.f11345c;
            aVar = iArr.length == 0 ? i9.a.f11345c : new i9.a(Arrays.copyOf(iArr, iArr.length));
        } else {
            aVar = i9.a.f11345c;
        }
        this.f4353c = aVar;
    }

    public c0(int i10, v0[] v0VarArr) {
        this.f4351a = 5;
        this.f4352b = i10;
        this.f4353c = v0VarArr;
    }

    public c0(Context context) {
        this.f4351a = 4;
        int e = g.f.e(context, 0);
        this.f4353c = new g.b(new ContextThemeWrapper(context, g.f.e(context, e)));
        this.f4352b = e;
    }

    public c0(boolean z10, boolean z11, boolean z12) {
        this.f4351a = 9;
        this.f4352b = (z10 || z11 || z12) ? 1 : 0;
    }
}

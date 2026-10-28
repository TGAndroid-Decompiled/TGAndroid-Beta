package d5;

import a8.qd;
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
import com.google.android.gms.internal.play_billing.h4;
import e2.n0;
import j$.util.DesugarCollections;
import java.net.URI;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import jg.e1;
public final class z implements e2.d, r2.u, c3.f0 {
    public final int f8025a;
    public int f8026b;
    public Object f8027c;

    public z(int i10, boolean z10, boolean z11) {
        this.f8025a = i10;
    }

    @Override
    public boolean B(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override
    public int G() {
        if (((MediaCodecInfo[]) this.f8027c) == null) {
            this.f8027c = new MediaCodecList(this.f8026b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f8027c).length;
    }

    @Override
    public k9.y H(byte[] bArr) {
        return qd.c(((e2.d) this.f8027c).H(bArr), new e1(this, 22));
    }

    public Object a() {
        Object[] objArr = (Object[]) this.f8027c;
        int i10 = this.f8026b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = objArr[i11];
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i11] = null;
        this.f8026b--;
        return obj;
    }

    public void b(int i10, int i11, int i12) {
        if (i12 != 0 && i10 < i11) {
            int i13 = this.f8026b;
            if (i13 >= 3) {
                int[] iArr = (int[]) this.f8027c;
                if (iArr[i13 - 1] == i12 && iArr[i13 - 2] == i10) {
                    iArr[i13 - 2] = i11;
                    return;
                }
            }
            int i14 = i13 + 3;
            int[] iArr2 = (int[]) this.f8027c;
            if (i14 > iArr2.length) {
                this.f8027c = Arrays.copyOf(iArr2, iArr2.length * 2);
            }
            int[] iArr3 = (int[]) this.f8027c;
            int i15 = this.f8026b;
            int i16 = i15 + 1;
            this.f8026b = i16;
            iArr3[i15] = i10;
            int i17 = i15 + 2;
            this.f8026b = i17;
            iArr3[i16] = i11;
            this.f8026b = i15 + 3;
            iArr3[i17] = i12;
        }
    }

    public void c(long j10) {
        int i10 = this.f8026b;
        long[] jArr = (long[]) this.f8027c;
        if (i10 == jArr.length) {
            this.f8027c = Arrays.copyOf(jArr, i10 * 2);
        }
        int i11 = this.f8026b;
        this.f8026b = i11 + 1;
        ((long[]) this.f8027c)[i11] = j10;
    }

    public void d(long[] jArr) {
        int length = this.f8026b + jArr.length;
        long[] jArr2 = (long[]) this.f8027c;
        if (length > jArr2.length) {
            this.f8027c = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, (long[]) this.f8027c, this.f8026b, jArr.length);
        this.f8026b = length;
    }

    @Override
    public MediaCodecInfo e(int i10) {
        if (((MediaCodecInfo[]) this.f8027c) == null) {
            this.f8027c = new MediaCodecList(this.f8026b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f8027c)[i10];
    }

    public g.f f() {
        int i10;
        Message message;
        g.b bVar = (g.b) this.f8027c;
        g.f fVar = new g.f(bVar.f12104a, this.f8026b);
        View view = bVar.e;
        g.e eVar = fVar.f12138f;
        if (view != null) {
            eVar.f12130r = view;
        } else {
            CharSequence charSequence = bVar.d;
            if (charSequence != null) {
                eVar.d = charSequence;
                TextView textView = eVar.f12128p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = bVar.f12106c;
            if (drawable != null) {
                eVar.f12126n = drawable;
                ImageView imageView = eVar.f12127o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    eVar.f12127o.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = bVar.f12107f;
        if (charSequence2 != null) {
            androidx.biometric.w wVar = bVar.f12108g;
            eVar.getClass();
            if (wVar != null) {
                message = eVar.f12137z.obtainMessage(-2, wVar);
            } else {
                message = null;
            }
            eVar.f12122j = charSequence2;
            eVar.f12123k = message;
        }
        if (bVar.f12109i != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) bVar.f12105b.inflate(eVar.v, (ViewGroup) null);
            if (bVar.f12112l) {
                i10 = eVar.f12134w;
            } else {
                i10 = eVar.f12135x;
            }
            Object obj = bVar.f12109i;
            ArrayAdapter arrayAdapter = obj;
            if (obj == null) {
                arrayAdapter = new ArrayAdapter(bVar.f12104a, i10, 16908308, (Object[]) null);
            }
            eVar.f12131s = arrayAdapter;
            eVar.f12132t = bVar.f12113m;
            if (bVar.f12110j != null) {
                alertController$RecycleListView.setOnItemClickListener(new g.a(bVar, eVar));
            }
            if (bVar.f12112l) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            eVar.e = alertController$RecycleListView;
        }
        View view2 = bVar.f12111k;
        if (view2 != null) {
            eVar.f12119f = view2;
            eVar.f12120g = false;
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

    public uc.u g(String str) {
        Matcher matcher;
        String str2;
        Matcher matcher2;
        boolean z10;
        String str3;
        int i10;
        SocketFactory socketFactory;
        int i11 = this.f8026b;
        if (str != null) {
            if (i11 >= 0) {
                URI create = URI.create(str);
                if (create != null) {
                    if (i11 >= 0) {
                        String scheme = create.getScheme();
                        String userInfo = create.getUserInfo();
                        SecureRandom secureRandom = uc.k.f49697a;
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
                                            ((pa.d) this.f8027c).getClass();
                                            if (z10) {
                                                socketFactory = SSLSocketFactory.getDefault();
                                            } else {
                                                socketFactory = SocketFactory.getDefault();
                                            }
                                            uc.s sVar = new uc.s(socketFactory, new uc.a(str2, i10), i11, null, null);
                                            sVar.d = 1;
                                            sVar.e = 250;
                                            sVar.f49712f = true;
                                            if (port >= 0) {
                                                str2 = str2 + ":" + port;
                                            }
                                            if (rawQuery != null) {
                                                str3 = a1.g.D(str3, "?", rawQuery);
                                            }
                                            return new uc.u(z10, userInfo, str2, str3, sVar);
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

    public void h(int i10) {
        ByteBuffer allocate = ByteBuffer.allocate(i10);
        int position = ((ByteBuffer) this.f8027c).position();
        ((ByteBuffer) this.f8027c).position(0);
        allocate.put((ByteBuffer) this.f8027c);
        allocate.position(position);
        this.f8027c = allocate;
    }

    public byte i(int i10) {
        if (i10 >= 0 && this.f8026b > i10) {
            return ((ByteBuffer) this.f8027c).get(i10);
        }
        throw new IndexOutOfBoundsException(String.format("Bad index: index=%d, length=%d", Integer.valueOf(i10), Integer.valueOf(this.f8026b)));
    }

    @Override
    public boolean i0() {
        return true;
    }

    public long j(int i10) {
        if (i10 >= 0 && i10 < this.f8026b) {
            return ((long[]) this.f8027c)[i10];
        }
        StringBuilder k10 = ic.a.k(i10, "Invalid index ", ", size is ");
        k10.append(this.f8026b);
        throw new IndexOutOfBoundsException(k10.toString());
    }

    public boolean k(int i10) {
        int i11 = i10 / 8;
        if (((1 << (i10 % 8)) & i(i11)) != 0) {
            return true;
        }
        return false;
    }

    public synchronized List l() {
        return DesugarCollections.unmodifiableList(new ArrayList((ArrayList) this.f8027c));
    }

    public void m(int i10) {
        int capacity = ((ByteBuffer) this.f8027c).capacity();
        int i11 = this.f8026b;
        if (capacity < i11 + 1) {
            h(i11 + 1024);
        }
        ((ByteBuffer) this.f8027c).put((byte) i10);
        this.f8026b++;
    }

    public void n(byte[] bArr) {
        int capacity = ((ByteBuffer) this.f8027c).capacity();
        int i10 = this.f8026b;
        if (capacity < bArr.length + i10) {
            h(i10 + bArr.length + 1024);
        }
        ((ByteBuffer) this.f8027c).put(bArr);
        this.f8026b += bArr.length;
    }

    @Override
    public boolean o(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public int p(int i10, int[] iArr) {
        int i11 = iArr[0];
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            if (k(i11 + i13)) {
                i14 += i12;
            }
            i13++;
            i12 *= 2;
        }
        iArr[0] = iArr[0] + i10;
        return i14;
    }

    public long q(c3.l lVar) {
        e2.x xVar = (e2.x) this.f8027c;
        int i10 = 0;
        lVar.h(xVar.f9731a, 0, 1, false);
        int i11 = xVar.f9731a[0] & 255;
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
        lVar.h(xVar.f9731a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (xVar.f9731a[i10] & 255) + (i14 << 8);
        }
        this.f8026b = i13 + 1 + this.f8026b;
        return i14;
    }

    public void r(Object instance) {
        Object[] objArr = (Object[]) this.f8027c;
        kotlin.jvm.internal.i.e(instance, "instance");
        int i10 = this.f8026b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == instance) {
                throw new IllegalStateException("Already in the pool!");
            }
        }
        int i12 = this.f8026b;
        if (i12 < objArr.length) {
            objArr[i12] = instance;
            this.f8026b = i12 + 1;
        }
    }

    public byte[] s(int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 >= 0 && i10 >= 0 && this.f8026b >= i11) {
            byte[] bArr = new byte[i12];
            if (i12 != 0) {
                System.arraycopy(((ByteBuffer) this.f8027c).array(), i10, bArr, 0, i12);
            }
            return bArr;
        }
        throw new IllegalArgumentException(String.format("Bad range: beginIndex=%d, endIndex=%d, length=%d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(this.f8026b)));
    }

    @Override
    public k9.y t(s0 s0Var) {
        k9.y t10 = ((e2.d) this.f8027c).t(s0Var);
        if (t10 == null) {
            return null;
        }
        return qd.c(t10, new e1(this, 22));
    }

    public String toString() {
        switch (this.f8025a) {
            case 8:
                return new String((char[]) this.f8027c, 0, this.f8026b);
            case 15:
                j9.a aVar = (j9.a) this.f8027c;
                ArrayList arrayList = new ArrayList(aVar.f15540b);
                for (int i10 = 0; i10 < aVar.f15540b; i10++) {
                    arrayList.add(n0.e0(aVar.b(i10)));
                }
                return "UnsupportedBrands{major=" + n0.e0(this.f8026b) + ", compatible=" + arrayList + "}";
            default:
                return super.toString();
        }
    }

    public String u(h4 h4Var) {
        String str;
        b0 b0Var = (b0) this.f8027c;
        int i10 = this.f8026b;
        try {
            if (b0Var.E != null) {
                com.google.android.gms.internal.play_billing.g gVar = b0Var.E;
                String packageName = b0Var.C.getPackageName();
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
                a0 a0Var = new a0(h4Var);
                com.google.android.gms.internal.play_billing.e eVar = (com.google.android.gms.internal.play_billing.e) gVar;
                Parcel T0 = eVar.T0();
                T0.writeString(packageName);
                T0.writeString(str);
                int i11 = com.google.android.gms.internal.play_billing.d.f7194a;
                T0.writeStrongBinder(a0Var);
                eVar.f343b.transact(1, T0, null, 1);
                T0.recycle();
                return "billingOverrideService.getBillingOverride";
            }
            throw null;
        } catch (Exception e) {
            b0Var.F(95, 28, e0.f7969p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            h4Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    public z(Object obj, int i10, int i11) {
        this.f8025a = i11;
        this.f8027c = obj;
        this.f8026b = i10;
    }

    public z(l6.a aVar, int i10) {
        this.f8025a = 2;
        o6.l.h(aVar);
        this.f8027c = aVar;
        this.f8026b = i10;
    }

    public z(int i10, short s10) {
        this.f8025a = i10;
        switch (i10) {
            case 11:
                this.f8027c = new e2.x(8);
                return;
            case 14:
                Object obj = new Object();
                new TreeMap(String.CASE_INSENSITIVE_ORDER).clear();
                this.f8027c = obj;
                return;
            case 18:
                this.f8027c = new ArrayList();
                this.f8026b = 128;
                return;
            default:
                this.f8026b = 0;
                this.f8027c = new StringBuilder();
                return;
        }
    }

    public z(int i10, int i11) {
        this.f8025a = i11;
        switch (i11) {
            case 9:
                if (i10 > 0) {
                    this.f8027c = new Object[i10];
                    return;
                }
                throw new IllegalArgumentException("The max pool size must be > 0");
            case 10:
            case 11:
            default:
                this.f8027c = new long[i10];
                return;
            case 12:
                this.f8027c = ByteBuffer.allocate(i10);
                this.f8026b = 0;
                return;
            case 13:
                this.f8027c = new CountDownLatch(1);
                this.f8026b = i10;
                return;
        }
    }

    public z(int i10, int[] iArr) {
        j9.a aVar;
        this.f8025a = 15;
        this.f8026b = i10;
        if (iArr != null) {
            j9.a aVar2 = j9.a.f15538c;
            aVar = iArr.length == 0 ? j9.a.f15538c : new j9.a(Arrays.copyOf(iArr, iArr.length));
        } else {
            aVar = j9.a.f15538c;
        }
        this.f8027c = aVar;
    }

    public z(int i10, v0[] v0VarArr) {
        this.f8025a = 5;
        this.f8026b = i10;
        this.f8027c = v0VarArr;
    }

    public z(Context context) {
        this.f8025a = 4;
        int e = g.f.e(context, 0);
        this.f8027c = new g.b(new ContextThemeWrapper(context, g.f.e(context, e)));
        this.f8026b = e;
    }

    public z(boolean z10, boolean z11, boolean z12) {
        this.f8025a = 10;
        this.f8026b = (z10 || z11 || z12) ? 1 : 0;
    }
}

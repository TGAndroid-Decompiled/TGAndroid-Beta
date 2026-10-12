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
import b2.q0;
import com.google.android.gms.internal.play_billing.h4;
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
public final class b0 implements r2.u {
    public final int f4200a;
    public int f4201b;
    public Object f4202c;

    public b0(int i10, boolean z10, boolean z11) {
        this.f4200a = i10;
    }

    @Override
    public MediaCodecInfo a(int i10) {
        if (((MediaCodecInfo[]) this.f4202c) == null) {
            this.f4202c = new MediaCodecList(this.f4201b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f4202c)[i10];
    }

    public Object b() {
        Object[] objArr = (Object[]) this.f4202c;
        int i10 = this.f4201b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = objArr[i11];
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i11] = null;
        this.f4201b--;
        return obj;
    }

    @Override
    public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public void d(long j3) {
        int i10 = this.f4201b;
        long[] jArr = (long[]) this.f4202c;
        if (i10 == jArr.length) {
            this.f4202c = Arrays.copyOf(jArr, i10 * 2);
        }
        int i11 = this.f4201b;
        this.f4201b = i11 + 1;
        ((long[]) this.f4202c)[i11] = j3;
    }

    public void e(long[] jArr) {
        int length = this.f4201b + jArr.length;
        long[] jArr2 = (long[]) this.f4202c;
        if (length > jArr2.length) {
            this.f4202c = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, (long[]) this.f4202c, this.f4201b, jArr.length);
        this.f4201b = length;
    }

    public g.f f() {
        int i10;
        Message message;
        g.b bVar = (g.b) this.f4202c;
        g.f fVar = new g.f(bVar.f10095a, this.f4201b);
        View view = bVar.f10098e;
        g.e eVar = fVar.f10131f;
        if (view != null) {
            eVar.f10123r = view;
        } else {
            CharSequence charSequence = bVar.d;
            if (charSequence != null) {
                eVar.d = charSequence;
                TextView textView = eVar.f10121p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = bVar.f10097c;
            if (drawable != null) {
                eVar.f10119n = drawable;
                ImageView imageView = eVar.f10120o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    eVar.f10120o.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = bVar.f10099f;
        if (charSequence2 != null) {
            androidx.biometric.w wVar = bVar.f10100g;
            eVar.getClass();
            if (wVar != null) {
                message = eVar.f10130z.obtainMessage(-2, wVar);
            } else {
                message = null;
            }
            eVar.f10115j = charSequence2;
            eVar.f10116k = message;
        }
        if (bVar.f10101i != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) bVar.f10096b.inflate(eVar.v, (ViewGroup) null);
            if (bVar.f10104l) {
                i10 = eVar.f10127w;
            } else {
                i10 = eVar.f10128x;
            }
            Object obj = bVar.f10101i;
            ArrayAdapter arrayAdapter = obj;
            if (obj == null) {
                arrayAdapter = new ArrayAdapter(bVar.f10095a, i10, 16908308, (Object[]) null);
            }
            eVar.f10124s = arrayAdapter;
            eVar.f10125t = bVar.f10105m;
            if (bVar.f10102j != null) {
                alertController$RecycleListView.setOnItemClickListener(new g.a(bVar, eVar));
            }
            if (bVar.f10104l) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            eVar.f10111e = alertController$RecycleListView;
        }
        View view2 = bVar.f10103k;
        if (view2 != null) {
            eVar.f10112f = view2;
            eVar.f10113g = false;
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

    public sc.u g(String str) {
        Matcher matcher;
        String str2;
        Matcher matcher2;
        boolean z10;
        String str3;
        int i10;
        SocketFactory socketFactory;
        int i11 = this.f4201b;
        if (str != null) {
            if (i11 >= 0) {
                URI create = URI.create(str);
                if (create != null) {
                    if (i11 >= 0) {
                        String scheme = create.getScheme();
                        String userInfo = create.getUserInfo();
                        SecureRandom secureRandom = sc.k.f48145a;
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
                                            ((rb.a) this.f4202c).getClass();
                                            if (z10) {
                                                socketFactory = SSLSocketFactory.getDefault();
                                            } else {
                                                socketFactory = SocketFactory.getDefault();
                                            }
                                            sc.s sVar = new sc.s(socketFactory, new sc.a(str2, i10), i11, null, null);
                                            sVar.d = 1;
                                            sVar.f48162e = 250;
                                            sVar.f48163f = true;
                                            if (port >= 0) {
                                                str2 = str2 + ":" + port;
                                            }
                                            if (rawQuery != null) {
                                                str3 = a1.g.D(str3, "?", rawQuery);
                                            }
                                            return new sc.u(z10, userInfo, str2, str3, sVar);
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

    @Override
    public boolean h(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public void i(int i10) {
        ByteBuffer allocate = ByteBuffer.allocate(i10);
        int position = ((ByteBuffer) this.f4202c).position();
        ((ByteBuffer) this.f4202c).position(0);
        allocate.put((ByteBuffer) this.f4202c);
        allocate.position(position);
        this.f4202c = allocate;
    }

    public byte j(int i10) {
        if (i10 >= 0 && this.f4201b > i10) {
            return ((ByteBuffer) this.f4202c).get(i10);
        }
        throw new IndexOutOfBoundsException(String.format("Bad index: index=%d, length=%d", Integer.valueOf(i10), Integer.valueOf(this.f4201b)));
    }

    public long k(int i10) {
        if (i10 >= 0 && i10 < this.f4201b) {
            return ((long[]) this.f4202c)[i10];
        }
        StringBuilder l4 = hg.c.l(i10, "Invalid index ", ", size is ");
        l4.append(this.f4201b);
        throw new IndexOutOfBoundsException(l4.toString());
    }

    @Override
    public int l() {
        if (((MediaCodecInfo[]) this.f4202c) == null) {
            this.f4202c = new MediaCodecList(this.f4201b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f4202c).length;
    }

    public boolean m(int i10) {
        int i11 = i10 / 8;
        if (((1 << (i10 % 8)) & j(i11)) != 0) {
            return true;
        }
        return false;
    }

    public synchronized List n() {
        return DesugarCollections.unmodifiableList(new ArrayList((ArrayList) this.f4202c));
    }

    public void o(int i10) {
        int capacity = ((ByteBuffer) this.f4202c).capacity();
        int i11 = this.f4201b;
        if (capacity < i11 + 1) {
            i(i11 + 1024);
        }
        ((ByteBuffer) this.f4202c).put((byte) i10);
        this.f4201b++;
    }

    public void p(byte[] bArr) {
        int capacity = ((ByteBuffer) this.f4202c).capacity();
        int i10 = this.f4201b;
        if (capacity < bArr.length + i10) {
            i(i10 + bArr.length + 1024);
        }
        ((ByteBuffer) this.f4202c).put(bArr);
        this.f4201b += bArr.length;
    }

    public int q(int i10, int[] iArr) {
        int i11 = iArr[0];
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            if (m(i11 + i13)) {
                i14 += i12;
            }
            i13++;
            i12 *= 2;
        }
        iArr[0] = iArr[0] + i10;
        return i14;
    }

    public long r(c3.l lVar) {
        e2.v vVar = (e2.v) this.f4202c;
        int i10 = 0;
        lVar.f(vVar.f8581a, 0, 1, false);
        int i11 = vVar.f8581a[0] & 255;
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
        lVar.f(vVar.f8581a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (vVar.f8581a[i10] & 255) + (i14 << 8);
        }
        this.f4201b = i13 + 1 + this.f4201b;
        return i14;
    }

    public void s(Object instance) {
        Object[] objArr = (Object[]) this.f4202c;
        kotlin.jvm.internal.i.e(instance, "instance");
        int i10 = this.f4201b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == instance) {
                throw new IllegalStateException("Already in the pool!");
            }
        }
        int i12 = this.f4201b;
        if (i12 < objArr.length) {
            objArr[i12] = instance;
            this.f4201b = i12 + 1;
        }
    }

    public byte[] t(int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 >= 0 && i10 >= 0 && this.f4201b >= i11) {
            byte[] bArr = new byte[i12];
            if (i12 != 0) {
                System.arraycopy(((ByteBuffer) this.f4202c).array(), i10, bArr, 0, i12);
            }
            return bArr;
        }
        throw new IllegalArgumentException(String.format("Bad range: beginIndex=%d, endIndex=%d, length=%d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(this.f4201b)));
    }

    public String toString() {
        switch (this.f4200a) {
            case 5:
                return new String((char[]) this.f4202c, 0, this.f4201b);
            default:
                return super.toString();
        }
    }

    public String u(h4 h4Var) {
        String str;
        d0 d0Var = (d0) this.f4202c;
        int i10 = this.f4201b;
        try {
            if (d0Var.E != null) {
                com.google.android.gms.internal.play_billing.g gVar = d0Var.E;
                String packageName = d0Var.C.getPackageName();
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
                c0 c0Var = new c0(h4Var);
                com.google.android.gms.internal.play_billing.e eVar = (com.google.android.gms.internal.play_billing.e) gVar;
                Parcel T0 = eVar.T0();
                T0.writeString(packageName);
                T0.writeString(str);
                int i11 = com.google.android.gms.internal.play_billing.d.f7323a;
                T0.writeStrongBinder(c0Var);
                eVar.f338b.transact(1, T0, null, 1);
                T0.recycle();
                return "billingOverrideService.getBillingOverride";
            }
            throw null;
        } catch (Exception e7) {
            d0Var.F(95, 28, g0.f4251p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e7);
            h4Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    @Override
    public boolean z() {
        return true;
    }

    public b0(Object obj, int i10, int i11) {
        this.f4200a = i11;
        this.f4202c = obj;
        this.f4201b = i10;
    }

    public b0(k6.a aVar, int i10) {
        this.f4200a = 1;
        n6.m.h(aVar);
        this.f4202c = aVar;
        this.f4201b = i10;
    }

    public b0(int i10, short s10) {
        this(32, 2);
        this.f4200a = i10;
        switch (i10) {
            case 10:
                this.f4202c = new rb.a(22);
                return;
            case 11:
                this.f4202c = new e2.v(8);
                return;
            case 12:
            case 14:
            default:
                return;
            case 13:
                this.f4202c = new ArrayList();
                this.f4201b = 128;
                return;
            case 15:
                this.f4201b = 0;
                this.f4202c = new StringBuilder();
                return;
        }
    }

    public b0(int i10, int i11) {
        this.f4200a = i11;
        switch (i11) {
            case 6:
                if (i10 > 0) {
                    this.f4202c = new Object[i10];
                    return;
                }
                throw new IllegalArgumentException("The max pool size must be > 0");
            case 7:
            default:
                this.f4202c = new long[i10];
                return;
            case 8:
                this.f4202c = ByteBuffer.allocate(i10);
                this.f4201b = 0;
                return;
            case 9:
                this.f4202c = new CountDownLatch(1);
                this.f4201b = i10;
                return;
        }
    }

    public b0(int i10, q0[] q0VarArr) {
        this.f4200a = 4;
        this.f4201b = i10;
        this.f4202c = q0VarArr;
    }

    public b0(Context context) {
        this.f4200a = 3;
        int e7 = g.f.e(context, 0);
        this.f4202c = new g.b(new ContextThemeWrapper(context, g.f.e(context, e7)));
        this.f4201b = e7;
    }

    public b0(boolean z10, boolean z11, boolean z12) {
        this.f4200a = 7;
        this.f4201b = (z10 || z11 || z12) ? 1 : 0;
    }
}

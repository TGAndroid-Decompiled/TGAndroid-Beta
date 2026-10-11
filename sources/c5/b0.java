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
public final class b0 implements r2.v {
    public final int f4201a;
    public int f4202b;
    public Object f4203c;

    public b0(int i10, boolean z10, boolean z11) {
        this.f4201a = i10;
    }

    @Override
    public boolean D(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override
    public int F() {
        if (((MediaCodecInfo[]) this.f4203c) == null) {
            this.f4203c = new MediaCodecList(this.f4202b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f4203c).length;
    }

    @Override
    public boolean X() {
        return true;
    }

    @Override
    public MediaCodecInfo a(int i10) {
        if (((MediaCodecInfo[]) this.f4203c) == null) {
            this.f4203c = new MediaCodecList(this.f4202b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f4203c)[i10];
    }

    public Object b() {
        Object[] objArr = (Object[]) this.f4203c;
        int i10 = this.f4202b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = objArr[i11];
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i11] = null;
        this.f4202b--;
        return obj;
    }

    public void c(long j3) {
        int i10 = this.f4202b;
        long[] jArr = (long[]) this.f4203c;
        if (i10 == jArr.length) {
            this.f4203c = Arrays.copyOf(jArr, i10 * 2);
        }
        int i11 = this.f4202b;
        this.f4202b = i11 + 1;
        ((long[]) this.f4203c)[i11] = j3;
    }

    public void d(long[] jArr) {
        int length = this.f4202b + jArr.length;
        long[] jArr2 = (long[]) this.f4203c;
        if (length > jArr2.length) {
            this.f4203c = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, (long[]) this.f4203c, this.f4202b, jArr.length);
        this.f4202b = length;
    }

    public g.f e() {
        int i10;
        Message message;
        g.b bVar = (g.b) this.f4203c;
        g.f fVar = new g.f(bVar.f10096a, this.f4202b);
        View view = bVar.f10099e;
        g.e eVar = fVar.f10132f;
        if (view != null) {
            eVar.f10124r = view;
        } else {
            CharSequence charSequence = bVar.d;
            if (charSequence != null) {
                eVar.d = charSequence;
                TextView textView = eVar.f10122p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = bVar.f10098c;
            if (drawable != null) {
                eVar.f10120n = drawable;
                ImageView imageView = eVar.f10121o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    eVar.f10121o.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = bVar.f10100f;
        if (charSequence2 != null) {
            androidx.biometric.w wVar = bVar.f10101g;
            eVar.getClass();
            if (wVar != null) {
                message = eVar.f10131z.obtainMessage(-2, wVar);
            } else {
                message = null;
            }
            eVar.f10116j = charSequence2;
            eVar.f10117k = message;
        }
        if (bVar.f10102i != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) bVar.f10097b.inflate(eVar.v, (ViewGroup) null);
            if (bVar.f10105l) {
                i10 = eVar.f10128w;
            } else {
                i10 = eVar.f10129x;
            }
            Object obj = bVar.f10102i;
            ArrayAdapter arrayAdapter = obj;
            if (obj == null) {
                arrayAdapter = new ArrayAdapter(bVar.f10096a, i10, 16908308, (Object[]) null);
            }
            eVar.f10125s = arrayAdapter;
            eVar.f10126t = bVar.f10106m;
            if (bVar.f10103j != null) {
                alertController$RecycleListView.setOnItemClickListener(new g.a(bVar, eVar));
            }
            if (bVar.f10105l) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            eVar.f10112e = alertController$RecycleListView;
        }
        View view2 = bVar.f10104k;
        if (view2 != null) {
            eVar.f10113f = view2;
            eVar.f10114g = false;
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

    public sc.u f(String str) {
        Matcher matcher;
        String str2;
        Matcher matcher2;
        boolean z10;
        String str3;
        int i10;
        SocketFactory socketFactory;
        int i11 = this.f4202b;
        if (str != null) {
            if (i11 >= 0) {
                URI create = URI.create(str);
                if (create != null) {
                    if (i11 >= 0) {
                        String scheme = create.getScheme();
                        String userInfo = create.getUserInfo();
                        SecureRandom secureRandom = sc.k.f48038a;
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
                                            ((qb.b) this.f4203c).getClass();
                                            if (z10) {
                                                socketFactory = SSLSocketFactory.getDefault();
                                            } else {
                                                socketFactory = SocketFactory.getDefault();
                                            }
                                            sc.s sVar = new sc.s(socketFactory, new sc.a(str2, i10), i11, null, null);
                                            sVar.d = 1;
                                            sVar.f48055e = 250;
                                            sVar.f48056f = true;
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

    public void g(int i10) {
        ByteBuffer allocate = ByteBuffer.allocate(i10);
        int position = ((ByteBuffer) this.f4203c).position();
        ((ByteBuffer) this.f4203c).position(0);
        allocate.put((ByteBuffer) this.f4203c);
        allocate.position(position);
        this.f4203c = allocate;
    }

    public byte h(int i10) {
        if (i10 >= 0 && this.f4202b > i10) {
            return ((ByteBuffer) this.f4203c).get(i10);
        }
        throw new IndexOutOfBoundsException(String.format("Bad index: index=%d, length=%d", Integer.valueOf(i10), Integer.valueOf(this.f4202b)));
    }

    public long i(int i10) {
        if (i10 >= 0 && i10 < this.f4202b) {
            return ((long[]) this.f4203c)[i10];
        }
        StringBuilder j3 = hg.c.j(i10, "Invalid index ", ", size is ");
        j3.append(this.f4202b);
        throw new IndexOutOfBoundsException(j3.toString());
    }

    public boolean j(int i10) {
        int i11 = i10 / 8;
        if (((1 << (i10 % 8)) & h(i11)) != 0) {
            return true;
        }
        return false;
    }

    public synchronized List k() {
        return DesugarCollections.unmodifiableList(new ArrayList((ArrayList) this.f4203c));
    }

    @Override
    public boolean l(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public void m(int i10) {
        int capacity = ((ByteBuffer) this.f4203c).capacity();
        int i11 = this.f4202b;
        if (capacity < i11 + 1) {
            g(i11 + 1024);
        }
        ((ByteBuffer) this.f4203c).put((byte) i10);
        this.f4202b++;
    }

    public void n(byte[] bArr) {
        int capacity = ((ByteBuffer) this.f4203c).capacity();
        int i10 = this.f4202b;
        if (capacity < bArr.length + i10) {
            g(i10 + bArr.length + 1024);
        }
        ((ByteBuffer) this.f4203c).put(bArr);
        this.f4202b += bArr.length;
    }

    public int o(int i10, int[] iArr) {
        int i11 = iArr[0];
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            if (j(i11 + i13)) {
                i14 += i12;
            }
            i13++;
            i12 *= 2;
        }
        iArr[0] = iArr[0] + i10;
        return i14;
    }

    public long p(c3.l lVar) {
        e2.v vVar = (e2.v) this.f4203c;
        int i10 = 0;
        lVar.i(vVar.f8583a, 0, 1, false);
        int i11 = vVar.f8583a[0] & 255;
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
        lVar.i(vVar.f8583a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (vVar.f8583a[i10] & 255) + (i14 << 8);
        }
        this.f4202b = i13 + 1 + this.f4202b;
        return i14;
    }

    public void q(Object instance) {
        Object[] objArr = (Object[]) this.f4203c;
        kotlin.jvm.internal.i.e(instance, "instance");
        int i10 = this.f4202b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == instance) {
                throw new IllegalStateException("Already in the pool!");
            }
        }
        int i12 = this.f4202b;
        if (i12 < objArr.length) {
            objArr[i12] = instance;
            this.f4202b = i12 + 1;
        }
    }

    public byte[] r(int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 >= 0 && i10 >= 0 && this.f4202b >= i11) {
            byte[] bArr = new byte[i12];
            if (i12 != 0) {
                System.arraycopy(((ByteBuffer) this.f4203c).array(), i10, bArr, 0, i12);
            }
            return bArr;
        }
        throw new IllegalArgumentException(String.format("Bad range: beginIndex=%d, endIndex=%d, length=%d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(this.f4202b)));
    }

    public String s(h4 h4Var) {
        String str;
        d0 d0Var = (d0) this.f4203c;
        int i10 = this.f4202b;
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
                int i11 = com.google.android.gms.internal.play_billing.d.f7324a;
                T0.writeStrongBinder(c0Var);
                eVar.f336b.transact(1, T0, null, 1);
                T0.recycle();
                return "billingOverrideService.getBillingOverride";
            }
            throw null;
        } catch (Exception e7) {
            d0Var.F(95, 28, g0.f4252p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e7);
            h4Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    public String toString() {
        switch (this.f4201a) {
            case 5:
                return new String((char[]) this.f4203c, 0, this.f4202b);
            default:
                return super.toString();
        }
    }

    public b0(Object obj, int i10, int i11) {
        this.f4201a = i11;
        this.f4203c = obj;
        this.f4202b = i10;
    }

    public b0(k6.a aVar, int i10) {
        this.f4201a = 1;
        n6.m.h(aVar);
        this.f4203c = aVar;
        this.f4202b = i10;
    }

    public b0(int i10, short s10) {
        this(32, 2);
        this.f4201a = i10;
        switch (i10) {
            case 10:
                this.f4203c = new qb.b();
                return;
            case 11:
                this.f4203c = new e2.v(8);
                return;
            case 12:
            case 14:
            default:
                return;
            case 13:
                this.f4203c = new ArrayList();
                this.f4202b = 128;
                return;
            case 15:
                this.f4202b = 0;
                this.f4203c = new StringBuilder();
                return;
        }
    }

    public b0(int i10, int i11) {
        this.f4201a = i11;
        switch (i11) {
            case 6:
                if (i10 > 0) {
                    this.f4203c = new Object[i10];
                    return;
                }
                throw new IllegalArgumentException("The max pool size must be > 0");
            case 7:
            default:
                this.f4203c = new long[i10];
                return;
            case 8:
                this.f4203c = ByteBuffer.allocate(i10);
                this.f4202b = 0;
                return;
            case 9:
                this.f4203c = new CountDownLatch(1);
                this.f4202b = i10;
                return;
        }
    }

    public b0(int i10, q0[] q0VarArr) {
        this.f4201a = 4;
        this.f4202b = i10;
        this.f4203c = q0VarArr;
    }

    public b0(Context context) {
        this.f4201a = 3;
        int e7 = g.f.e(context, 0);
        this.f4203c = new g.b(new ContextThemeWrapper(context, g.f.e(context, e7)));
        this.f4202b = e7;
    }

    public b0(boolean z10, boolean z11, boolean z12) {
        this.f4201a = 7;
        this.f4202b = (z10 || z11 || z12) ? 1 : 0;
    }
}

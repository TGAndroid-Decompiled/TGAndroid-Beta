package f5;

import a8.p0;
import ai.m0;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Message;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import c8.s9;
import com.google.android.gms.internal.play_billing.h4;
import e2.o0;
import f3.g0;
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
import org.telegram.messenger.qp;
import org.telegram.messenger.zr;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Components.r51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.j9;
import org.telegram.ui.r9;
public final class u implements r9, r51, h2.d, u2.u, g0 {
    public final int f11189a;
    public int f11190b;
    public Object f11191c;

    public u(int i7, Object obj, int i10) {
        this.f11189a = i10;
        this.f11190b = i7;
        this.f11191c = obj;
    }

    @Override
    public m9.y A(o0 o0Var) {
        m9.y A = ((h2.d) this.f11191c).A(o0Var);
        if (A == null) {
            return null;
        }
        return s9.c(A, new m3(this, 13));
    }

    @Override
    public boolean I(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override
    public int L() {
        if (((MediaCodecInfo[]) this.f11191c) == null) {
            this.f11191c = new MediaCodecList(this.f11190b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f11191c).length;
    }

    @Override
    public void M(String str) {
        String c10 = vf.c.c(str);
        if (TextUtils.isEmpty(c10)) {
            org.telegram.messenger.g0.h3(new m0(0));
        } else {
            qp.s1(this.f11190b).d2().a(c10, null, new ai.i((f2) this.f11191c, 1));
        }
    }

    @Override
    public String R0() {
        return null;
    }

    @Override
    public m9.y W(byte[] bArr) {
        return s9.c(((h2.d) this.f11191c).W(bArr), new m3(this, 13));
    }

    @Override
    public boolean Y() {
        return true;
    }

    public Object a() {
        Object[] objArr = (Object[]) this.f11191c;
        int i7 = this.f11190b;
        if (i7 <= 0) {
            return null;
        }
        int i10 = i7 - 1;
        Object obj = objArr[i10];
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i10] = null;
        this.f11190b--;
        return obj;
    }

    public void b(int i7, int i10, int i11) {
        if (i11 != 0 && i7 < i10) {
            int i12 = this.f11190b;
            if (i12 >= 3) {
                int[] iArr = (int[]) this.f11191c;
                if (iArr[i12 - 1] == i11 && iArr[i12 - 2] == i7) {
                    iArr[i12 - 2] = i10;
                    return;
                }
            }
            int i13 = i12 + 3;
            int[] iArr2 = (int[]) this.f11191c;
            if (i13 > iArr2.length) {
                this.f11191c = Arrays.copyOf(iArr2, iArr2.length * 2);
            }
            int[] iArr3 = (int[]) this.f11191c;
            int i14 = this.f11190b;
            int i15 = i14 + 1;
            this.f11190b = i15;
            iArr3[i14] = i7;
            int i16 = i14 + 2;
            this.f11190b = i16;
            iArr3[i15] = i10;
            this.f11190b = i14 + 3;
            iArr3[i16] = i11;
        }
    }

    public void c(long j3) {
        int i7 = this.f11190b;
        long[] jArr = (long[]) this.f11191c;
        if (i7 == jArr.length) {
            this.f11191c = Arrays.copyOf(jArr, i7 * 2);
        }
        int i10 = this.f11190b;
        this.f11190b = i10 + 1;
        ((long[]) this.f11191c)[i10] = j3;
    }

    public void d(long[] jArr) {
        int length = this.f11190b + jArr.length;
        long[] jArr2 = (long[]) this.f11191c;
        if (length > jArr2.length) {
            this.f11191c = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, (long[]) this.f11191c, this.f11190b, jArr.length);
        this.f11190b = length;
    }

    public int e(int i7, int i10) {
        int p10 = p();
        if (p10 >= 0 && p10 <= i7 && p10 * i10 * 4 <= ((org.telegram.utils.twidget.i) this.f11191c).d - this.f11190b) {
            return p10;
        }
        throw org.telegram.utils.twidget.i.a();
    }

    @Override
    public MediaCodecInfo f(int i7) {
        if (((MediaCodecInfo[]) this.f11191c) == null) {
            this.f11191c = new MediaCodecList(this.f11190b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f11191c)[i7];
    }

    public g.f g() {
        int i7;
        Message message;
        g.b bVar = (g.b) this.f11191c;
        g.f fVar = new g.f((ContextThemeWrapper) bVar.f13265c, this.f11190b);
        View view = (View) bVar.h;
        g.e eVar = fVar.f13321f;
        if (view != null) {
            eVar.f13313r = view;
        } else {
            CharSequence charSequence = (CharSequence) bVar.f13267f;
            if (charSequence != null) {
                eVar.d = charSequence;
                TextView textView = eVar.f13311p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = (Drawable) bVar.f13266e;
            if (drawable != null) {
                eVar.f13309n = drawable;
                ImageView imageView = eVar.f13310o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    eVar.f13310o.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = (CharSequence) bVar.f13268g;
        if (charSequence2 != null) {
            androidx.biometric.y yVar = (androidx.biometric.y) bVar.f13270j;
            eVar.getClass();
            if (yVar != null) {
                message = eVar.f13320z.obtainMessage(-2, yVar);
            } else {
                message = null;
            }
            eVar.f13305j = charSequence2;
            eVar.f13306k = message;
        }
        if (bVar.f13272l != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) ((LayoutInflater) bVar.d).inflate(eVar.v, (ViewGroup) null);
            if (bVar.f13263a) {
                i7 = eVar.f13317w;
            } else {
                i7 = eVar.f13318x;
            }
            Object obj = bVar.f13272l;
            ArrayAdapter arrayAdapter = obj;
            if (obj == null) {
                arrayAdapter = new ArrayAdapter((ContextThemeWrapper) bVar.f13265c, i7, 16908308, (Object[]) null);
            }
            eVar.f13314s = arrayAdapter;
            eVar.f13315t = bVar.f13264b;
            if (((DialogInterface.OnClickListener) bVar.f13273m) != null) {
                alertController$RecycleListView.setOnItemClickListener(new g.a(bVar, eVar));
            }
            if (bVar.f13263a) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            eVar.f13301e = alertController$RecycleListView;
        }
        View view2 = bVar.f13269i;
        if (view2 != null) {
            eVar.f13302f = view2;
            eVar.f13303g = false;
        }
        fVar.setCancelable(true);
        fVar.setCanceledOnTouchOutside(true);
        fVar.setOnCancelListener(null);
        fVar.setOnDismissListener(null);
        l.l lVar = (l.l) bVar.f13271k;
        if (lVar != null) {
            fVar.setOnKeyListener(lVar);
        }
        return fVar;
    }

    public rc.u h(String str) {
        Matcher matcher;
        String str2;
        Matcher matcher2;
        boolean z9;
        String str3;
        int i7;
        SocketFactory socketFactory;
        int i10 = this.f11190b;
        if (str != null) {
            if (i10 >= 0) {
                URI create = URI.create(str);
                if (create != null) {
                    if (i10 >= 0) {
                        String scheme = create.getScheme();
                        String userInfo = create.getUserInfo();
                        SecureRandom secureRandom = rc.k.f54472a;
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
                                            z9 = false;
                                        } else {
                                            z9 = true;
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
                                                i7 = port;
                                            } else if (z9) {
                                                i7 = 443;
                                            } else {
                                                i7 = 80;
                                            }
                                            ((w7.s) this.f11191c).getClass();
                                            if (z9) {
                                                socketFactory = SSLSocketFactory.getDefault();
                                            } else {
                                                socketFactory = SocketFactory.getDefault();
                                            }
                                            rc.s sVar = new rc.s(socketFactory, new rc.a(str2, i7), i10, null, null);
                                            sVar.d = 1;
                                            sVar.f54489e = 250;
                                            sVar.f54490f = true;
                                            if (port >= 0) {
                                                str2 = str2 + ":" + port;
                                            }
                                            if (rawQuery != null) {
                                                str3 = p0.D(str3, "?", rawQuery);
                                            }
                                            return new rc.u(z9, userInfo, str2, str3, sVar);
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
    public boolean h1(String str, j9 j9Var) {
        return false;
    }

    public void i(int i7) {
        ByteBuffer allocate = ByteBuffer.allocate(i7);
        int position = ((ByteBuffer) this.f11191c).position();
        ((ByteBuffer) this.f11191c).position(0);
        allocate.put((ByteBuffer) this.f11191c);
        allocate.position(position);
        this.f11191c = allocate;
    }

    public float j() {
        float intBitsToFloat = Float.intBitsToFloat(p());
        if (!Float.isNaN(intBitsToFloat) && !Float.isInfinite(intBitsToFloat)) {
            return intBitsToFloat;
        }
        return 0.0f;
    }

    public void k(int i7, float[] fArr) {
        for (int i10 = 0; i10 < i7; i10++) {
            fArr[i10] = j();
        }
    }

    public byte l(int i7) {
        if (i7 >= 0 && this.f11190b > i7) {
            return ((ByteBuffer) this.f11191c).get(i7);
        }
        throw new IndexOutOfBoundsException(String.format("Bad index: index=%d, length=%d", Integer.valueOf(i7), Integer.valueOf(this.f11190b)));
    }

    public long m(int i7) {
        if (i7 >= 0 && i7 < this.f11190b) {
            return ((long[]) this.f11191c)[i7];
        }
        StringBuilder n10 = jg.g.n(i7, "Invalid index ", ", size is ");
        n10.append(this.f11190b);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    public boolean n(int i7) {
        int i10 = i7 / 8;
        if (((1 << (i7 % 8)) & l(i10)) != 0) {
            return true;
        }
        return false;
    }

    public synchronized List o() {
        return DesugarCollections.unmodifiableList(new ArrayList((ArrayList) this.f11191c));
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z9, int i7) {
        org.telegram.messenger.g0.h3(new jg.r(this, this.f11190b, i7, 3));
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public int p() {
        int i7 = this.f11190b;
        int i10 = i7 + 4;
        org.telegram.utils.twidget.i iVar = (org.telegram.utils.twidget.i) this.f11191c;
        if (i10 <= iVar.d) {
            int i11 = iVar.f52840a.getInt(i7);
            this.f11190b += 4;
            return i11;
        }
        throw org.telegram.utils.twidget.i.a();
    }

    public void q(int i7) {
        int capacity = ((ByteBuffer) this.f11191c).capacity();
        int i10 = this.f11190b;
        if (capacity < i10 + 1) {
            i(i10 + 1024);
        }
        ((ByteBuffer) this.f11191c).put((byte) i7);
        this.f11190b++;
    }

    public void r(byte[] bArr) {
        int capacity = ((ByteBuffer) this.f11191c).capacity();
        int i7 = this.f11190b;
        if (capacity < bArr.length + i7) {
            i(i7 + bArr.length + 1024);
        }
        ((ByteBuffer) this.f11191c).put(bArr);
        this.f11190b += bArr.length;
    }

    public int s(int[] iArr, int i7) {
        int i10 = iArr[0];
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i7) {
            if (n(i10 + i12)) {
                i13 += i11;
            }
            i12++;
            i11 *= 2;
        }
        iArr[0] = iArr[0] + i7;
        return i13;
    }

    @Override
    public boolean t(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public String toString() {
        switch (this.f11189a) {
            case 20:
                l9.a aVar = (l9.a) this.f11191c;
                ArrayList arrayList = new ArrayList(aVar.f18205b);
                for (int i7 = 0; i7 < aVar.f18205b; i7++) {
                    arrayList.add(h2.m0.e0(aVar.b(i7)));
                }
                return "UnsupportedBrands{major=" + h2.m0.e0(this.f11190b) + ", compatible=" + arrayList + "}";
            default:
                return super.toString();
        }
    }

    public long u(f3.l lVar) {
        h2.x xVar = (h2.x) this.f11191c;
        int i7 = 0;
        lVar.k(xVar.f14162a, 0, 1, false);
        int i10 = xVar.f14162a[0] & 255;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int i11 = 128;
        int i12 = 0;
        while ((i10 & i11) == 0) {
            i11 >>= 1;
            i12++;
        }
        int i13 = i10 & (~i11);
        lVar.k(xVar.f14162a, 1, i12, false);
        while (i7 < i12) {
            i7++;
            i13 = (xVar.f14162a[i7] & 255) + (i13 << 8);
        }
        this.f11190b = i12 + 1 + this.f11190b;
        return i13;
    }

    public void v(Object instance) {
        Object[] objArr = (Object[]) this.f11191c;
        kotlin.jvm.internal.j.e(instance, "instance");
        int i7 = this.f11190b;
        for (int i10 = 0; i10 < i7; i10++) {
            if (objArr[i10] == instance) {
                throw new IllegalStateException("Already in the pool!");
            }
        }
        int i11 = this.f11190b;
        if (i11 < objArr.length) {
            objArr[i11] = instance;
            this.f11190b = i11 + 1;
        }
    }

    public byte[] w(int i7, int i10) {
        int i11 = i10 - i7;
        if (i11 >= 0 && i7 >= 0 && this.f11190b >= i10) {
            byte[] bArr = new byte[i11];
            if (i11 != 0) {
                System.arraycopy(((ByteBuffer) this.f11191c).array(), i7, bArr, 0, i11);
            }
            return bArr;
        }
        throw new IllegalArgumentException(String.format("Bad range: beginIndex=%d, endIndex=%d, length=%d", Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(this.f11190b)));
    }

    public String x(h4 h4Var) {
        String str;
        w wVar = (w) this.f11191c;
        int i7 = this.f11190b;
        try {
            if (wVar.E != null) {
                com.google.android.gms.internal.play_billing.g gVar = wVar.E;
                String packageName = wVar.C.getPackageName();
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 5) {
                                if (i7 != 6) {
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
                v vVar = new v(h4Var);
                com.google.android.gms.internal.play_billing.e eVar = (com.google.android.gms.internal.play_billing.e) gVar;
                Parcel v12 = eVar.v1();
                v12.writeString(packageName);
                v12.writeString(str);
                int i10 = com.google.android.gms.internal.play_billing.d.f7315a;
                v12.writeStrongBinder(vVar);
                eVar.f306b.transact(1, v12, null, 1);
                v12.recycle();
                return "billingOverrideService.getBillingOverride";
            }
            throw null;
        } catch (Exception e10) {
            wVar.F(95, 28, z.f11208p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e10);
            h4Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    public u(int i7, boolean z9, boolean z10) {
        this.f11189a = i7;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public u(Object obj, int i7, int i10) {
        this.f11189a = i10;
        this.f11191c = obj;
        this.f11190b = i7;
    }

    public u(int i7, short s5) {
        this.f11189a = i7;
        switch (i7) {
            case 6:
                this.f11190b = 0;
                this.f11191c = new StringBuilder();
                return;
            case 16:
                this.f11191c = new w7.s(22);
                return;
            case 18:
                this.f11191c = new h2.x(8);
                return;
            default:
                this.f11191c = new ArrayList();
                this.f11190b = 128;
                return;
        }
    }

    public u(int i7, int i10) {
        this.f11189a = i10;
        switch (i10) {
            case 13:
                if (i7 > 0) {
                    this.f11191c = new Object[i7];
                    return;
                }
                throw new IllegalArgumentException("The max pool size must be > 0");
            case 14:
                this.f11191c = ByteBuffer.allocate(i7);
                this.f11190b = 0;
                return;
            case 15:
                this.f11191c = new CountDownLatch(1);
                this.f11190b = i7;
                return;
            default:
                this.f11191c = new long[i7];
                return;
        }
    }

    @Override
    public void onDismiss() {
    }

    public u(int[] iArr, int i7) {
        l9.a aVar;
        this.f11189a = 20;
        this.f11190b = i7;
        if (iArr != null) {
            l9.a aVar2 = l9.a.f18203c;
            aVar = iArr.length == 0 ? l9.a.f18203c : new l9.a(Arrays.copyOf(iArr, iArr.length));
        } else {
            aVar = l9.a.f18203c;
        }
        this.f11191c = aVar;
    }

    @Override
    public void V0(zr zrVar) {
    }

    @Override
    public void onSeekFinished(m2.a aVar) {
    }

    @Override
    public void onSeekStarted(m2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public u(org.telegram.utils.twidget.i iVar) {
        this.f11189a = 11;
        this.f11191c = iVar;
        this.f11190b = 20;
    }

    public u(Context context) {
        this.f11189a = 4;
        int e10 = g.f.e(context, 0);
        this.f11191c = new g.b(new ContextThemeWrapper(context, g.f.e(context, e10)));
        this.f11190b = e10;
    }

    public u(boolean z9, boolean z10, boolean z11) {
        this.f11189a = 17;
        this.f11190b = (z9 || z10 || z11) ? 1 : 0;
    }

    @Override
    public void onError(u51 u51Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }
}

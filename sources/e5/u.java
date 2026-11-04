package e5;

import ai.v2;
import ai.y1;
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
import b8.yd;
import com.google.android.gms.internal.play_billing.h4;
import d2.q0;
import e3.f0;
import g2.n0;
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
import k2.p1;
import org.telegram.messenger.g0;
import org.telegram.messenger.hp;
import org.telegram.messenger.rr;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m51;
import org.telegram.ui.i9;
import org.telegram.ui.r9;
public final class u implements r9, g2.e, k51, t2.u, f0 {
    public final int f9632a;
    public int f9633b;
    public Object f9634c;

    public u(int i3, Object obj, int i10) {
        this.f9632a = i10;
        this.f9633b = i3;
        this.f9634c = obj;
    }

    @Override
    public boolean B1(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override
    public int D1() {
        if (((MediaCodecInfo[]) this.f9634c) == null) {
            this.f9634c = new MediaCodecList(this.f9633b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f9634c).length;
    }

    @Override
    public l9.y L(q0 q0Var) {
        l9.y L = ((g2.e) this.f9634c).L(q0Var);
        if (L == null) {
            return null;
        }
        return yd.c(L, new l5.b(this, 22));
    }

    @Override
    public void M(String str) {
        String c2 = sf.c.c(str);
        if (TextUtils.isEmpty(c2)) {
            g0.h3(new y1(1));
        } else {
            hp.s1(this.f9633b).d2().a(c2, null, new v2((d2) this.f9634c, 5));
        }
    }

    @Override
    public String M0() {
        return null;
    }

    @Override
    public boolean Y(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public Object a() {
        Object[] objArr = (Object[]) this.f9634c;
        int i3 = this.f9633b;
        if (i3 <= 0) {
            return null;
        }
        int i10 = i3 - 1;
        Object obj = objArr[i10];
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i10] = null;
        this.f9633b--;
        return obj;
    }

    public void b(int i3, int i10, int i11) {
        if (i11 != 0 && i3 < i10) {
            int i12 = this.f9633b;
            if (i12 >= 3) {
                int[] iArr = (int[]) this.f9634c;
                if (iArr[i12 - 1] == i11 && iArr[i12 - 2] == i3) {
                    iArr[i12 - 2] = i10;
                    return;
                }
            }
            int i13 = i12 + 3;
            int[] iArr2 = (int[]) this.f9634c;
            if (i13 > iArr2.length) {
                this.f9634c = Arrays.copyOf(iArr2, iArr2.length * 2);
            }
            int[] iArr3 = (int[]) this.f9634c;
            int i14 = this.f9633b;
            int i15 = i14 + 1;
            this.f9633b = i15;
            iArr3[i14] = i3;
            int i16 = i14 + 2;
            this.f9633b = i16;
            iArr3[i15] = i10;
            this.f9633b = i14 + 3;
            iArr3[i16] = i11;
        }
    }

    public void c(long j10) {
        int i3 = this.f9633b;
        long[] jArr = (long[]) this.f9634c;
        if (i3 == jArr.length) {
            this.f9634c = Arrays.copyOf(jArr, i3 * 2);
        }
        int i10 = this.f9633b;
        this.f9633b = i10 + 1;
        ((long[]) this.f9634c)[i10] = j10;
    }

    public void d(long[] jArr) {
        int length = this.f9633b + jArr.length;
        long[] jArr2 = (long[]) this.f9634c;
        if (length > jArr2.length) {
            this.f9634c = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, (long[]) this.f9634c, this.f9633b, jArr.length);
        this.f9633b = length;
    }

    public g.f e() {
        int i3;
        Message message;
        g.b bVar = (g.b) this.f9634c;
        g.f fVar = new g.f((ContextThemeWrapper) bVar.f11649c, this.f9633b);
        View view = (View) bVar.h;
        g.e eVar = fVar.f11705f;
        if (view != null) {
            eVar.f11697r = view;
        } else {
            CharSequence charSequence = (CharSequence) bVar.f11651f;
            if (charSequence != null) {
                eVar.d = charSequence;
                TextView textView = eVar.f11695p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = (Drawable) bVar.f11650e;
            if (drawable != null) {
                eVar.f11693n = drawable;
                ImageView imageView = eVar.f11694o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    eVar.f11694o.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = (CharSequence) bVar.f11652g;
        if (charSequence2 != null) {
            androidx.biometric.y yVar = (androidx.biometric.y) bVar.f11654j;
            eVar.getClass();
            if (yVar != null) {
                message = eVar.f11704z.obtainMessage(-2, yVar);
            } else {
                message = null;
            }
            eVar.f11689j = charSequence2;
            eVar.f11690k = message;
        }
        if (bVar.f11656l != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) ((LayoutInflater) bVar.d).inflate(eVar.v, (ViewGroup) null);
            if (bVar.f11647a) {
                i3 = eVar.f11701w;
            } else {
                i3 = eVar.f11702x;
            }
            Object obj = bVar.f11656l;
            ArrayAdapter arrayAdapter = obj;
            if (obj == null) {
                arrayAdapter = new ArrayAdapter((ContextThemeWrapper) bVar.f11649c, i3, 16908308, (Object[]) null);
            }
            eVar.f11698s = arrayAdapter;
            eVar.f11699t = bVar.f11648b;
            if (((DialogInterface.OnClickListener) bVar.f11657m) != null) {
                alertController$RecycleListView.setOnItemClickListener(new g.a(bVar, eVar));
            }
            if (bVar.f11647a) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            eVar.f11685e = alertController$RecycleListView;
        }
        View view2 = bVar.f11653i;
        if (view2 != null) {
            eVar.f11686f = view2;
            eVar.f11687g = false;
        }
        fVar.setCancelable(true);
        fVar.setCanceledOnTouchOutside(true);
        fVar.setOnCancelListener(null);
        fVar.setOnDismissListener(null);
        l.l lVar = (l.l) bVar.f11655k;
        if (lVar != null) {
            fVar.setOnKeyListener(lVar);
        }
        return fVar;
    }

    @Override
    public boolean e1(String str, i9 i9Var) {
        return false;
    }

    public oc.u f(String str) {
        Matcher matcher;
        String str2;
        Matcher matcher2;
        boolean z10;
        String str3;
        int i3;
        SocketFactory socketFactory;
        int i10 = this.f9633b;
        if (str != null) {
            if (i10 >= 0) {
                URI create = URI.create(str);
                if (create != null) {
                    if (i10 >= 0) {
                        String scheme = create.getScheme();
                        String userInfo = create.getUserInfo();
                        SecureRandom secureRandom = oc.k.f20982a;
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
                                                i3 = port;
                                            } else if (z10) {
                                                i3 = 443;
                                            } else {
                                                i3 = 80;
                                            }
                                            ((nb.a) this.f9634c).getClass();
                                            if (z10) {
                                                socketFactory = SSLSocketFactory.getDefault();
                                            } else {
                                                socketFactory = SocketFactory.getDefault();
                                            }
                                            oc.s sVar = new oc.s(socketFactory, new oc.a(str2, i3), i10, null, null);
                                            sVar.d = 1;
                                            sVar.f20999e = 250;
                                            sVar.f21000f = true;
                                            if (port >= 0) {
                                                str2 = str2 + ":" + port;
                                            }
                                            if (rawQuery != null) {
                                                str3 = a1.g.C(str3, "?", rawQuery);
                                            }
                                            return new oc.u(z10, userInfo, str2, str3, sVar);
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

    public void g(int i3) {
        ByteBuffer allocate = ByteBuffer.allocate(i3);
        int position = ((ByteBuffer) this.f9634c).position();
        ((ByteBuffer) this.f9634c).position(0);
        allocate.put((ByteBuffer) this.f9634c);
        allocate.position(position);
        this.f9634c = allocate;
    }

    @Override
    public MediaCodecInfo h(int i3) {
        if (((MediaCodecInfo[]) this.f9634c) == null) {
            this.f9634c = new MediaCodecList(this.f9633b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f9634c)[i3];
    }

    public byte i(int i3) {
        if (i3 >= 0 && this.f9633b > i3) {
            return ((ByteBuffer) this.f9634c).get(i3);
        }
        throw new IndexOutOfBoundsException(String.format("Bad index: index=%d, length=%d", Integer.valueOf(i3), Integer.valueOf(this.f9633b)));
    }

    public long j(int i3) {
        if (i3 >= 0 && i3 < this.f9633b) {
            return ((long[]) this.f9634c)[i3];
        }
        StringBuilder m10 = p1.m(i3, "Invalid index ", ", size is ");
        m10.append(this.f9633b);
        throw new IndexOutOfBoundsException(m10.toString());
    }

    public boolean k(int i3) {
        int i10 = i3 / 8;
        if (((1 << (i3 % 8)) & i(i10)) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean k2() {
        return true;
    }

    public synchronized List l() {
        return DesugarCollections.unmodifiableList(new ArrayList((ArrayList) this.f9634c));
    }

    public void m(int i3) {
        int capacity = ((ByteBuffer) this.f9634c).capacity();
        int i10 = this.f9633b;
        if (capacity < i10 + 1) {
            g(i10 + 1024);
        }
        ((ByteBuffer) this.f9634c).put((byte) i3);
        this.f9633b++;
    }

    public void n(byte[] bArr) {
        int capacity = ((ByteBuffer) this.f9634c).capacity();
        int i3 = this.f9633b;
        if (capacity < bArr.length + i3) {
            g(i3 + bArr.length + 1024);
        }
        ((ByteBuffer) this.f9634c).put(bArr);
        this.f9633b += bArr.length;
    }

    public int o(int[] iArr, int i3) {
        int i10 = iArr[0];
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i3) {
            if (k(i10 + i12)) {
                i13 += i11;
            }
            i12++;
            i11 *= 2;
        }
        iArr[0] = iArr[0] + i3;
        return i13;
    }

    @Override
    public void onRenderedFirstFrame(l2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i3) {
        g0.h3(new k2.u(this, this.f9633b, i3, 3));
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public long p(e3.l lVar) {
        g2.y yVar = (g2.y) this.f9634c;
        int i3 = 0;
        lVar.h(yVar.f11923a, 0, 1, false);
        int i10 = yVar.f11923a[0] & 255;
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
        lVar.h(yVar.f11923a, 1, i12, false);
        while (i3 < i12) {
            i3++;
            i13 = (yVar.f11923a[i3] & 255) + (i13 << 8);
        }
        this.f9633b = i12 + 1 + this.f9633b;
        return i13;
    }

    public void q(Object instance) {
        Object[] objArr = (Object[]) this.f9634c;
        kotlin.jvm.internal.j.e(instance, "instance");
        int i3 = this.f9633b;
        for (int i10 = 0; i10 < i3; i10++) {
            if (objArr[i10] == instance) {
                throw new IllegalStateException("Already in the pool!");
            }
        }
        int i11 = this.f9633b;
        if (i11 < objArr.length) {
            objArr[i11] = instance;
            this.f9633b = i11 + 1;
        }
    }

    public byte[] r(int i3, int i10) {
        int i11 = i10 - i3;
        if (i11 >= 0 && i3 >= 0 && this.f9633b >= i10) {
            byte[] bArr = new byte[i11];
            if (i11 != 0) {
                System.arraycopy(((ByteBuffer) this.f9634c).array(), i3, bArr, 0, i11);
            }
            return bArr;
        }
        throw new IllegalArgumentException(String.format("Bad range: beginIndex=%d, endIndex=%d, length=%d", Integer.valueOf(i3), Integer.valueOf(i10), Integer.valueOf(this.f9633b)));
    }

    public String s(h4 h4Var) {
        String str;
        w wVar = (w) this.f9634c;
        int i3 = this.f9633b;
        try {
            if (wVar.E != null) {
                com.google.android.gms.internal.play_billing.g gVar = wVar.E;
                String packageName = wVar.C.getPackageName();
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                if (i3 != 6) {
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
                Parcel V0 = eVar.V0();
                V0.writeString(packageName);
                V0.writeString(str);
                int i10 = com.google.android.gms.internal.play_billing.d.f7372a;
                V0.writeStrongBinder(vVar);
                eVar.f2456b.transact(1, V0, null, 1);
                V0.recycle();
                return "billingOverrideService.getBillingOverride";
            }
            throw null;
        } catch (Exception e10) {
            wVar.F(95, 28, z.f9651p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e10);
            h4Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    public String toString() {
        switch (this.f9632a) {
            case 18:
                k9.a aVar = (k9.a) this.f9634c;
                ArrayList arrayList = new ArrayList(aVar.f16907b);
                for (int i3 = 0; i3 < aVar.f16907b; i3++) {
                    arrayList.add(n0.e0(aVar.b(i3)));
                }
                return "UnsupportedBrands{major=" + n0.e0(this.f9633b) + ", compatible=" + arrayList + "}";
            default:
                return super.toString();
        }
    }

    @Override
    public l9.y u(byte[] bArr) {
        return yd.c(((g2.e) this.f9634c).u(bArr), new l5.b(this, 22));
    }

    public u(int i3, boolean z10, boolean z11) {
        this.f9632a = i3;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public u(Object obj, int i3, int i10) {
        this.f9632a = i10;
        this.f9634c = obj;
        this.f9633b = i3;
    }

    public u(int i3, short s6) {
        this.f9632a = i3;
        switch (i3) {
            case 5:
                this.f9633b = 0;
                this.f9634c = new StringBuilder();
                return;
            case 11:
                this.f9634c = new nb.a();
                return;
            case 17:
                this.f9634c = new g2.y(8);
                return;
            default:
                this.f9634c = new ArrayList();
                this.f9633b = 128;
                return;
        }
    }

    public u(int i3, int i10) {
        this.f9632a = i10;
        switch (i10) {
            case 9:
                this.f9634c = ByteBuffer.allocate(i3);
                this.f9633b = 0;
                return;
            case 10:
                this.f9634c = new CountDownLatch(1);
                this.f9633b = i3;
                return;
            case 15:
                if (i3 > 0) {
                    this.f9634c = new Object[i3];
                    return;
                }
                throw new IllegalArgumentException("The max pool size must be > 0");
            default:
                this.f9634c = new long[i3];
                return;
        }
    }

    @Override
    public void onDismiss() {
    }

    public u(int[] iArr, int i3) {
        k9.a aVar;
        this.f9632a = 18;
        this.f9633b = i3;
        if (iArr != null) {
            k9.a aVar2 = k9.a.f16905c;
            aVar = iArr.length == 0 ? k9.a.f16905c : new k9.a(Arrays.copyOf(iArr, iArr.length));
        } else {
            aVar = k9.a.f16905c;
        }
        this.f9634c = aVar;
    }

    @Override
    public void V0(rr rrVar) {
    }

    @Override
    public void onSeekFinished(l2.a aVar) {
    }

    @Override
    public void onSeekStarted(l2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public u(Context context) {
        this.f9632a = 6;
        int e10 = g.f.e(context, 0);
        this.f9634c = new g.b(new ContextThemeWrapper(context, g.f.e(context, e10)));
        this.f9633b = e10;
    }

    public u(boolean z10, boolean z11, boolean z12) {
        this.f9632a = 16;
        this.f9633b = (z10 || z11 || z12) ? 1 : 0;
    }

    @Override
    public void onError(m51 m51Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i3, int i10, int i11, float f10) {
    }
}

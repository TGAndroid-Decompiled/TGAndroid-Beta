package c5;

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
import b2.s0;
import c3.f0;
import com.google.android.gms.internal.play_billing.h4;
import e2.l0;
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
import org.telegram.messenger.i0;
import org.telegram.messenger.js;
import org.telegram.messenger.wp;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.voip.n0;
import org.telegram.ui.k9;
import org.telegram.ui.t9;
import ph.h1;
import v7.p8;
public final class x implements e2.d, t61, t9, r2.u, f0 {
    public final int f3826a;
    public int f3827b;
    public Object f3828c;

    public x(int i10, Object obj, int i11) {
        this.f3826a = i11;
        this.f3827b = i10;
        this.f3828c = obj;
    }

    @Override
    public void L(String str) {
        String b10 = gf.f.b(str);
        if (TextUtils.isEmpty(b10)) {
            i0.g3(new n0(29));
        } else {
            wp.r1(this.f3827b).c2().a(b10, null, new h1((k2) this.f3828c, 5));
        }
    }

    @Override
    public String P0() {
        return null;
    }

    @Override
    public boolean T0(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override
    public boolean V(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override
    public int V0() {
        if (((MediaCodecInfo[]) this.f3828c) == null) {
            this.f3828c = new MediaCodecList(this.f3827b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f3828c).length;
    }

    @Override
    public j9.y a(s0 s0Var) {
        j9.y a2 = ((e2.d) this.f3828c).a(s0Var);
        if (a2 == null) {
            return null;
        }
        return p8.c(a2, new ig.c0(this, 26));
    }

    public Object b() {
        Object[] objArr = (Object[]) this.f3828c;
        int i10 = this.f3827b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = objArr[i11];
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i11] = null;
        this.f3827b--;
        return obj;
    }

    public void c(int i10, int i11, int i12) {
        if (i12 != 0 && i10 < i11) {
            int i13 = this.f3827b;
            if (i13 >= 3) {
                int[] iArr = (int[]) this.f3828c;
                if (iArr[i13 - 1] == i12 && iArr[i13 - 2] == i10) {
                    iArr[i13 - 2] = i11;
                    return;
                }
            }
            int i14 = i13 + 3;
            int[] iArr2 = (int[]) this.f3828c;
            if (i14 > iArr2.length) {
                this.f3828c = Arrays.copyOf(iArr2, iArr2.length * 2);
            }
            int[] iArr3 = (int[]) this.f3828c;
            int i15 = this.f3827b;
            int i16 = i15 + 1;
            this.f3827b = i16;
            iArr3[i15] = i10;
            int i17 = i15 + 2;
            this.f3827b = i17;
            iArr3[i16] = i11;
            this.f3827b = i15 + 3;
            iArr3[i17] = i12;
        }
    }

    @Override
    public MediaCodecInfo d(int i10) {
        if (((MediaCodecInfo[]) this.f3828c) == null) {
            this.f3828c = new MediaCodecList(this.f3827b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f3828c)[i10];
    }

    public void e(long j10) {
        int i10 = this.f3827b;
        long[] jArr = (long[]) this.f3828c;
        if (i10 == jArr.length) {
            this.f3828c = Arrays.copyOf(jArr, i10 * 2);
        }
        int i11 = this.f3827b;
        this.f3827b = i11 + 1;
        ((long[]) this.f3828c)[i11] = j10;
    }

    public void f(long[] jArr) {
        int length = this.f3827b + jArr.length;
        long[] jArr2 = (long[]) this.f3828c;
        if (length > jArr2.length) {
            this.f3828c = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, (long[]) this.f3828c, this.f3827b, jArr.length);
        this.f3827b = length;
    }

    public g.f g() {
        int i10;
        Message message;
        g.b bVar = (g.b) this.f3828c;
        g.f fVar = new g.f((ContextThemeWrapper) bVar.f7140c, this.f3827b);
        View view = (View) bVar.h;
        g.e eVar = fVar.f7193f;
        if (view != null) {
            eVar.f7185r = view;
        } else {
            CharSequence charSequence = (CharSequence) bVar.f7141f;
            if (charSequence != null) {
                eVar.d = charSequence;
                TextView textView = eVar.f7183p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = (Drawable) bVar.e;
            if (drawable != null) {
                eVar.f7181n = drawable;
                ImageView imageView = eVar.f7182o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    eVar.f7182o.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = (CharSequence) bVar.f7142g;
        if (charSequence2 != null) {
            androidx.biometric.x xVar = (androidx.biometric.x) bVar.f7144j;
            eVar.getClass();
            if (xVar != null) {
                message = eVar.f7192z.obtainMessage(-2, xVar);
            } else {
                message = null;
            }
            eVar.f7177j = charSequence2;
            eVar.f7178k = message;
        }
        if (bVar.f7146l != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) ((LayoutInflater) bVar.d).inflate(eVar.v, (ViewGroup) null);
            if (bVar.f7138a) {
                i10 = eVar.f7189w;
            } else {
                i10 = eVar.f7190x;
            }
            Object obj = bVar.f7146l;
            ArrayAdapter arrayAdapter = obj;
            if (obj == null) {
                arrayAdapter = new ArrayAdapter((ContextThemeWrapper) bVar.f7140c, i10, 16908308, (Object[]) null);
            }
            eVar.f7186s = arrayAdapter;
            eVar.f7187t = bVar.f7139b;
            if (((DialogInterface.OnClickListener) bVar.f7147m) != null) {
                alertController$RecycleListView.setOnItemClickListener(new g.a(bVar, eVar));
            }
            if (bVar.f7138a) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            eVar.e = alertController$RecycleListView;
        }
        View view2 = bVar.f7143i;
        if (view2 != null) {
            eVar.f7174f = view2;
            eVar.f7175g = false;
        }
        fVar.setCancelable(true);
        fVar.setCanceledOnTouchOutside(true);
        fVar.setOnCancelListener(null);
        fVar.setOnDismissListener(null);
        l.m mVar = (l.m) bVar.f7145k;
        if (mVar != null) {
            fVar.setOnKeyListener(mVar);
        }
        return fVar;
    }

    public lc.v h(String str) {
        Matcher matcher;
        String str2;
        Matcher matcher2;
        boolean z10;
        String str3;
        int i10;
        SocketFactory socketFactory;
        int i11 = this.f3827b;
        if (str != null) {
            if (i11 >= 0) {
                URI create = URI.create(str);
                if (create != null) {
                    if (i11 >= 0) {
                        String scheme = create.getScheme();
                        String userInfo = create.getUserInfo();
                        SecureRandom secureRandom = lc.k.f11757a;
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
                                            ((hb.a) this.f3828c).getClass();
                                            if (z10) {
                                                socketFactory = SSLSocketFactory.getDefault();
                                            } else {
                                                socketFactory = SocketFactory.getDefault();
                                            }
                                            lc.t tVar = new lc.t(socketFactory, new lc.a(str2, i10), i11, null, null);
                                            tVar.d = 1;
                                            tVar.e = 250;
                                            tVar.f11773f = true;
                                            if (port >= 0) {
                                                str2 = str2 + ":" + port;
                                            }
                                            if (rawQuery != null) {
                                                str3 = a1.g.C(str3, "?", rawQuery);
                                            }
                                            return new lc.v(z10, userInfo, str2, str3, tVar);
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

    public void i(int i10) {
        ByteBuffer allocate = ByteBuffer.allocate(i10);
        int position = ((ByteBuffer) this.f3828c).position();
        ((ByteBuffer) this.f3828c).position(0);
        allocate.put((ByteBuffer) this.f3828c);
        allocate.position(position);
        this.f3828c = allocate;
    }

    @Override
    public boolean i1(String str, k9 k9Var) {
        return false;
    }

    public byte j(int i10) {
        if (i10 >= 0 && this.f3827b > i10) {
            return ((ByteBuffer) this.f3828c).get(i10);
        }
        throw new IndexOutOfBoundsException(String.format("Bad index: index=%d, length=%d", Integer.valueOf(i10), Integer.valueOf(this.f3827b)));
    }

    public long k(int i10) {
        if (i10 >= 0 && i10 < this.f3827b) {
            return ((long[]) this.f3828c)[i10];
        }
        StringBuilder l4 = i0.a.l(i10, "Invalid index ", ", size is ");
        l4.append(this.f3827b);
        throw new IndexOutOfBoundsException(l4.toString());
    }

    public boolean l(int i10) {
        int i11 = i10 / 8;
        if (((1 << (i10 % 8)) & j(i11)) != 0) {
            return true;
        }
        return false;
    }

    public synchronized List m() {
        return DesugarCollections.unmodifiableList(new ArrayList((ArrayList) this.f3828c));
    }

    public void n(int i10) {
        int capacity = ((ByteBuffer) this.f3828c).capacity();
        int i11 = this.f3827b;
        if (capacity < i11 + 1) {
            i(i11 + 1024);
        }
        ((ByteBuffer) this.f3828c).put((byte) i10);
        this.f3827b++;
    }

    public void o(byte[] bArr) {
        int capacity = ((ByteBuffer) this.f3828c).capacity();
        int i10 = this.f3827b;
        if (capacity < bArr.length + i10) {
            i(i10 + bArr.length + 1024);
        }
        ((ByteBuffer) this.f3828c).put(bArr);
        this.f3827b += bArr.length;
    }

    @Override
    public boolean o1() {
        return true;
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        i0.g3(new i2.u(this, this.f3827b, i10, 2));
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public int p(int[] iArr, int i10) {
        int i11 = iArr[0];
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            if (l(i11 + i13)) {
                i14 += i12;
            }
            i13++;
            i12 *= 2;
        }
        iArr[0] = iArr[0] + i10;
        return i14;
    }

    public long q(c3.l lVar) {
        e2.x xVar = (e2.x) this.f3828c;
        int i10 = 0;
        lVar.j(xVar.f6207a, 0, 1, false);
        int i11 = xVar.f6207a[0] & 255;
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
        lVar.j(xVar.f6207a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (xVar.f6207a[i10] & 255) + (i14 << 8);
        }
        this.f3827b = i13 + 1 + this.f3827b;
        return i14;
    }

    public void r(Object instance) {
        Object[] objArr = (Object[]) this.f3828c;
        kotlin.jvm.internal.i.e(instance, "instance");
        int i10 = this.f3827b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == instance) {
                throw new IllegalStateException("Already in the pool!");
            }
        }
        int i12 = this.f3827b;
        if (i12 < objArr.length) {
            objArr[i12] = instance;
            this.f3827b = i12 + 1;
        }
    }

    public byte[] s(int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 >= 0 && i10 >= 0 && this.f3827b >= i11) {
            byte[] bArr = new byte[i12];
            if (i12 != 0) {
                System.arraycopy(((ByteBuffer) this.f3828c).array(), i10, bArr, 0, i12);
            }
            return bArr;
        }
        throw new IllegalArgumentException(String.format("Bad range: beginIndex=%d, endIndex=%d, length=%d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(this.f3827b)));
    }

    public String t(h4 h4Var) {
        String str;
        z zVar = (z) this.f3828c;
        int i10 = this.f3827b;
        try {
            if (zVar.E != null) {
                com.google.android.gms.internal.play_billing.g gVar = zVar.E;
                String packageName = zVar.C.getPackageName();
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
                y yVar = new y(h4Var);
                com.google.android.gms.internal.play_billing.e eVar = (com.google.android.gms.internal.play_billing.e) gVar;
                Parcel V0 = eVar.V0();
                V0.writeString(packageName);
                V0.writeString(str);
                int i11 = com.google.android.gms.internal.play_billing.d.f5075a;
                V0.writeStrongBinder(yVar);
                eVar.f317b.transact(1, V0, null, 1);
                V0.recycle();
                return "billingOverrideService.getBillingOverride";
            }
            throw null;
        } catch (Exception e) {
            zVar.F(95, 28, c0.f3769p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            h4Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    public String toString() {
        switch (this.f3826a) {
            case 6:
                return new String((char[]) this.f3828c, 0, this.f3827b);
            case 19:
                i9.a aVar = (i9.a) this.f3828c;
                ArrayList arrayList = new ArrayList(aVar.f8235b);
                for (int i10 = 0; i10 < aVar.f8235b; i10++) {
                    arrayList.add(l0.e0(aVar.b(i10)));
                }
                return "UnsupportedBrands{major=" + l0.e0(this.f3827b) + ", compatible=" + arrayList + "}";
            default:
                return super.toString();
        }
    }

    @Override
    public j9.y w(byte[] bArr) {
        return p8.c(((e2.d) this.f3828c).w(bArr), new ig.c0(this, 26));
    }

    public x(int i10, boolean z10, boolean z11) {
        this.f3826a = i10;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public x(Object obj, int i10, int i11) {
        this.f3826a = i11;
        this.f3828c = obj;
        this.f3827b = i10;
    }

    public x(k6.a aVar, int i10) {
        this.f3826a = 2;
        n6.l.g(aVar);
        this.f3828c = aVar;
        this.f3827b = i10;
    }

    public x(int i10, int i11) {
        this.f3826a = i11;
        switch (i11) {
            case 7:
                this.f3828c = ByteBuffer.allocate(i10);
                this.f3827b = 0;
                return;
            case 8:
                this.f3828c = new CountDownLatch(1);
                this.f3827b = i10;
                return;
            case 14:
                if (i10 > 0) {
                    this.f3828c = new Object[i10];
                    return;
                }
                throw new IllegalArgumentException("The max pool size must be > 0");
            default:
                this.f3828c = new long[i10];
                return;
        }
    }

    public x(int[] iArr, int i10) {
        i9.a aVar;
        this.f3826a = 19;
        this.f3827b = i10;
        if (iArr != null) {
            i9.a aVar2 = i9.a.f8233c;
            aVar = iArr.length == 0 ? i9.a.f8233c : new i9.a(Arrays.copyOf(iArr, iArr.length));
        } else {
            aVar = i9.a.f8233c;
        }
        this.f3828c = aVar;
    }

    public x(int i10, short s10) {
        this.f3826a = i10;
        switch (i10) {
            case 17:
                this.f3827b = 0;
                this.f3828c = new StringBuilder();
                return;
            case 18:
                this.f3828c = new e2.x(8);
                return;
            case 19:
            case 20:
            default:
                this.f3828c = new hb.a();
                return;
            case 21:
                this.f3828c = new ArrayList();
                this.f3827b = 128;
                return;
        }
    }

    @Override
    public void onDismiss() {
    }

    @Override
    public void X0(js jsVar) {
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public x(Context context) {
        this.f3826a = 5;
        int e = g.f.e(context, 0);
        this.f3828c = new g.b(new ContextThemeWrapper(context, g.f.e(context, e)));
        this.f3827b = e;
    }

    public x(boolean z10, boolean z11, boolean z12) {
        this.f3826a = 16;
        this.f3827b = (z10 || z11 || z12) ? 1 : 0;
    }

    @Override
    public void onError(v61 v61Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}

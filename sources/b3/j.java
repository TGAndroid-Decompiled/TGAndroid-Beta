package b3;

import a8.p0;
import ai.h0;
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
import c8.t9;
import com.google.android.gms.internal.play_billing.h4;
import e2.o0;
import f3.f0;
import f5.v;
import f5.w;
import f5.z;
import h2.l0;
import h2.x;
import java.net.URI;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import m9.y;
import org.telegram.messenger.g0;
import org.telegram.messenger.np;
import org.telegram.messenger.vr;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i61;
import org.telegram.ui.k9;
import org.telegram.ui.s9;
public final class j implements s9, g61, h2.d, u2.u, f0 {
    public final int f2920a;
    public int f2921b;
    public Object f2922c;

    public j(int i7, Object obj, int i10) {
        this.f2920a = i10;
        this.f2921b = i7;
        this.f2922c = obj;
    }

    @Override
    public void J(String str) {
        String c10 = vf.c.c(str);
        if (TextUtils.isEmpty(c10)) {
            g0.g3(new ai.n(7));
        } else {
            np.u1(this.f2921b).f2().a(c10, null, new h0((g2) this.f2922c, 7));
        }
    }

    @Override
    public String J0() {
        return null;
    }

    @Override
    public boolean N1(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override
    public y O(o0 o0Var) {
        y O = ((h2.d) this.f2922c).O(o0Var);
        if (O == null) {
            return null;
        }
        return t9.c(O, new org.telegram.tgnet.u(this, 19));
    }

    @Override
    public int P1() {
        if (((MediaCodecInfo[]) this.f2922c) == null) {
            this.f2922c = new MediaCodecList(this.f2921b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f2922c).length;
    }

    public Object a() {
        Object[] objArr = (Object[]) this.f2922c;
        int i7 = this.f2921b;
        if (i7 <= 0) {
            return null;
        }
        int i10 = i7 - 1;
        Object obj = objArr[i10];
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i10] = null;
        this.f2921b--;
        return obj;
    }

    public void b(int i7, int i10, int i11) {
        if (i11 != 0 && i7 < i10) {
            int i12 = this.f2921b;
            if (i12 >= 3) {
                int[] iArr = (int[]) this.f2922c;
                if (iArr[i12 - 1] == i11 && iArr[i12 - 2] == i7) {
                    iArr[i12 - 2] = i10;
                    return;
                }
            }
            int i13 = i12 + 3;
            int[] iArr2 = (int[]) this.f2922c;
            if (i13 > iArr2.length) {
                this.f2922c = Arrays.copyOf(iArr2, iArr2.length * 2);
            }
            int[] iArr3 = (int[]) this.f2922c;
            int i14 = this.f2921b;
            int i15 = i14 + 1;
            this.f2921b = i15;
            iArr3[i14] = i7;
            int i16 = i14 + 2;
            this.f2921b = i16;
            iArr3[i15] = i10;
            this.f2921b = i14 + 3;
            iArr3[i16] = i11;
        }
    }

    public void c(long j3) {
        int i7 = this.f2921b;
        long[] jArr = (long[]) this.f2922c;
        if (i7 == jArr.length) {
            this.f2922c = Arrays.copyOf(jArr, i7 * 2);
        }
        int i10 = this.f2921b;
        this.f2921b = i10 + 1;
        ((long[]) this.f2922c)[i10] = j3;
    }

    @Override
    public boolean c1(String str, k9 k9Var) {
        return false;
    }

    public void d(long[] jArr) {
        int length = this.f2921b + jArr.length;
        long[] jArr2 = (long[]) this.f2922c;
        if (length > jArr2.length) {
            this.f2922c = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, (long[]) this.f2922c, this.f2921b, jArr.length);
        this.f2921b = length;
    }

    public int e(int i7, int i10) {
        int o4 = o();
        if (o4 >= 0 && o4 <= i7 && o4 * i10 * 4 <= ((org.telegram.utils.twidget.j) this.f2922c).d - this.f2921b) {
            return o4;
        }
        throw org.telegram.utils.twidget.j.a();
    }

    @Override
    public MediaCodecInfo f(int i7) {
        if (((MediaCodecInfo[]) this.f2922c) == null) {
            this.f2922c = new MediaCodecList(this.f2921b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f2922c)[i7];
    }

    public g.f g() {
        int i7;
        Message message;
        g.b bVar = (g.b) this.f2922c;
        g.f fVar = new g.f((ContextThemeWrapper) bVar.f12961c, this.f2921b);
        View view = (View) bVar.h;
        g.e eVar = fVar.f13017f;
        if (view != null) {
            eVar.f13009r = view;
        } else {
            CharSequence charSequence = (CharSequence) bVar.f12963f;
            if (charSequence != null) {
                eVar.d = charSequence;
                TextView textView = eVar.f13007p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = (Drawable) bVar.f12962e;
            if (drawable != null) {
                eVar.f13005n = drawable;
                ImageView imageView = eVar.f13006o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    eVar.f13006o.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = (CharSequence) bVar.f12964g;
        if (charSequence2 != null) {
            androidx.biometric.y yVar = (androidx.biometric.y) bVar.f12966j;
            eVar.getClass();
            if (yVar != null) {
                message = eVar.f13016z.obtainMessage(-2, yVar);
            } else {
                message = null;
            }
            eVar.f13001j = charSequence2;
            eVar.f13002k = message;
        }
        if (bVar.f12968l != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) ((LayoutInflater) bVar.d).inflate(eVar.v, (ViewGroup) null);
            if (bVar.f12959a) {
                i7 = eVar.f13013w;
            } else {
                i7 = eVar.f13014x;
            }
            Object obj = bVar.f12968l;
            ArrayAdapter arrayAdapter = obj;
            if (obj == null) {
                arrayAdapter = new ArrayAdapter((ContextThemeWrapper) bVar.f12961c, i7, 16908308, (Object[]) null);
            }
            eVar.f13010s = arrayAdapter;
            eVar.f13011t = bVar.f12960b;
            if (((DialogInterface.OnClickListener) bVar.f12969m) != null) {
                alertController$RecycleListView.setOnItemClickListener(new g.a(bVar, eVar));
            }
            if (bVar.f12959a) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            eVar.f12997e = alertController$RecycleListView;
        }
        View view2 = bVar.f12965i;
        if (view2 != null) {
            eVar.f12998f = view2;
            eVar.f12999g = false;
        }
        fVar.setCancelable(true);
        fVar.setCanceledOnTouchOutside(true);
        fVar.setOnCancelListener(null);
        fVar.setOnDismissListener(null);
        l.l lVar = (l.l) bVar.f12967k;
        if (lVar != null) {
            fVar.setOnKeyListener(lVar);
        }
        return fVar;
    }

    public rc.u h(String str) {
        Matcher matcher;
        String str2;
        Matcher matcher2;
        boolean z10;
        String str3;
        int i7;
        SocketFactory socketFactory;
        int i10 = this.f2921b;
        if (str != null) {
            if (i10 >= 0) {
                URI create = URI.create(str);
                if (create != null) {
                    if (i10 >= 0) {
                        String scheme = create.getScheme();
                        String userInfo = create.getUserInfo();
                        SecureRandom secureRandom = rc.k.f56562a;
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
                                                i7 = port;
                                            } else if (z10) {
                                                i7 = 443;
                                            } else {
                                                i7 = 80;
                                            }
                                            ((qb.a) this.f2922c).getClass();
                                            if (z10) {
                                                socketFactory = SSLSocketFactory.getDefault();
                                            } else {
                                                socketFactory = SocketFactory.getDefault();
                                            }
                                            rc.s sVar = new rc.s(socketFactory, new rc.a(str2, i7), i10, null, null);
                                            sVar.d = 1;
                                            sVar.f56579e = 250;
                                            sVar.f56580f = true;
                                            if (port >= 0) {
                                                str2 = str2 + ":" + port;
                                            }
                                            if (rawQuery != null) {
                                                str3 = p0.E(str3, "?", rawQuery);
                                            }
                                            return new rc.u(z10, userInfo, str2, str3, sVar);
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

    public void i(int i7) {
        ByteBuffer allocate = ByteBuffer.allocate(i7);
        int position = ((ByteBuffer) this.f2922c).position();
        ((ByteBuffer) this.f2922c).position(0);
        allocate.put((ByteBuffer) this.f2922c);
        allocate.position(position);
        this.f2922c = allocate;
    }

    public float j() {
        float intBitsToFloat = Float.intBitsToFloat(o());
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
        if (i7 >= 0 && this.f2921b > i7) {
            return ((ByteBuffer) this.f2922c).get(i7);
        }
        throw new IndexOutOfBoundsException(String.format("Bad index: index=%d, length=%d", Integer.valueOf(i7), Integer.valueOf(this.f2921b)));
    }

    public long m(int i7) {
        if (i7 >= 0 && i7 < this.f2921b) {
            return ((long[]) this.f2922c)[i7];
        }
        StringBuilder m10 = i5.c.m(i7, "Invalid index ", ", size is ");
        m10.append(this.f2921b);
        throw new IndexOutOfBoundsException(m10.toString());
    }

    public boolean n(int i7) {
        int i10 = i7 / 8;
        if (((1 << (i7 % 8)) & l(i10)) != 0) {
            return true;
        }
        return false;
    }

    public int o() {
        int i7 = this.f2921b;
        int i10 = i7 + 4;
        org.telegram.utils.twidget.j jVar = (org.telegram.utils.twidget.j) this.f2922c;
        if (i10 <= jVar.d) {
            int i11 = jVar.f54835a.getInt(i7);
            this.f2921b += 4;
            return i11;
        }
        throw org.telegram.utils.twidget.j.a();
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i7) {
        g0.g3(new jg.q(this, this.f2921b, i7, 3));
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public void p(int i7) {
        int capacity = ((ByteBuffer) this.f2922c).capacity();
        int i10 = this.f2921b;
        if (capacity < i10 + 1) {
            i(i10 + 1024);
        }
        ((ByteBuffer) this.f2922c).put((byte) i7);
        this.f2921b++;
    }

    public void q(byte[] bArr) {
        int capacity = ((ByteBuffer) this.f2922c).capacity();
        int i7 = this.f2921b;
        if (capacity < bArr.length + i7) {
            i(i7 + bArr.length + 1024);
        }
        ((ByteBuffer) this.f2922c).put(bArr);
        this.f2921b += bArr.length;
    }

    public int r(int[] iArr, int i7) {
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

    public long s(f3.l lVar) {
        x xVar = (x) this.f2922c;
        int i7 = 0;
        lVar.g(xVar.f13865a, 0, 1, false);
        int i10 = xVar.f13865a[0] & 255;
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
        lVar.g(xVar.f13865a, 1, i12, false);
        while (i7 < i12) {
            i7++;
            i13 = (xVar.f13865a[i7] & 255) + (i13 << 8);
        }
        this.f2921b = i12 + 1 + this.f2921b;
        return i13;
    }

    public void t(Object instance) {
        Object[] objArr = (Object[]) this.f2922c;
        kotlin.jvm.internal.j.e(instance, "instance");
        int i7 = this.f2921b;
        for (int i10 = 0; i10 < i7; i10++) {
            if (objArr[i10] == instance) {
                throw new IllegalStateException("Already in the pool!");
            }
        }
        int i11 = this.f2921b;
        if (i11 < objArr.length) {
            objArr[i11] = instance;
            this.f2921b = i11 + 1;
        }
    }

    @Override
    public y t0(byte[] bArr) {
        return t9.c(((h2.d) this.f2922c).t0(bArr), new org.telegram.tgnet.u(this, 19));
    }

    public String toString() {
        switch (this.f2920a) {
            case 19:
                l9.a aVar = (l9.a) this.f2922c;
                ArrayList arrayList = new ArrayList(aVar.f19733b);
                for (int i7 = 0; i7 < aVar.f19733b; i7++) {
                    arrayList.add(l0.e0(aVar.b(i7)));
                }
                return "UnsupportedBrands{major=" + l0.e0(this.f2921b) + ", compatible=" + arrayList + "}";
            default:
                return super.toString();
        }
    }

    public byte[] u(int i7, int i10) {
        int i11 = i10 - i7;
        if (i11 >= 0 && i7 >= 0 && this.f2921b >= i10) {
            byte[] bArr = new byte[i11];
            if (i11 != 0) {
                System.arraycopy(((ByteBuffer) this.f2922c).array(), i7, bArr, 0, i11);
            }
            return bArr;
        }
        throw new IllegalArgumentException(String.format("Bad range: beginIndex=%d, endIndex=%d, length=%d", Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(this.f2921b)));
    }

    @Override
    public boolean u2() {
        return true;
    }

    public String v(h4 h4Var) {
        String str;
        w wVar = (w) this.f2922c;
        int i7 = this.f2921b;
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
                int i10 = com.google.android.gms.internal.play_billing.d.f7019a;
                v12.writeStrongBinder(vVar);
                eVar.f306b.transact(1, v12, null, 1);
                v12.recycle();
                return "billingOverrideService.getBillingOverride";
            }
            throw null;
        } catch (Exception e10) {
            wVar.G(95, 28, z.f11371p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e10);
            h4Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    @Override
    public boolean x0(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public j(int i7, boolean z10, boolean z11) {
        this.f2920a = i7;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public j(Object obj, int i7, int i10) {
        this.f2920a = i10;
        this.f2922c = obj;
        this.f2921b = i7;
    }

    public j(int i7, short s5) {
        this.f2920a = i7;
        switch (i7) {
            case 15:
                this.f2922c = new qb.a();
                return;
            case 16:
            default:
                this.f2921b = 0;
                this.f2922c = new StringBuilder();
                return;
            case 17:
                this.f2922c = new x(8);
                return;
        }
    }

    public j(int i7, int i10) {
        this.f2920a = i10;
        switch (i10) {
            case 11:
                if (i7 > 0) {
                    this.f2922c = new Object[i7];
                    return;
                }
                throw new IllegalArgumentException("The max pool size must be > 0");
            case 12:
            default:
                this.f2922c = new long[i7];
                return;
            case 13:
                this.f2922c = ByteBuffer.allocate(i7);
                this.f2921b = 0;
                return;
            case 14:
                this.f2922c = new CountDownLatch(1);
                this.f2921b = i7;
                return;
        }
    }

    public j(int[] iArr, int i7) {
        l9.a aVar;
        this.f2920a = 19;
        this.f2921b = i7;
        if (iArr != null) {
            l9.a aVar2 = l9.a.f19731c;
            aVar = iArr.length == 0 ? l9.a.f19731c : new l9.a(Arrays.copyOf(iArr, iArr.length));
        } else {
            aVar = l9.a.f19731c;
        }
        this.f2922c = aVar;
    }

    @Override
    public void onDismiss() {
    }

    public j(org.telegram.utils.twidget.j jVar) {
        this.f2920a = 9;
        this.f2922c = jVar;
        this.f2921b = 20;
    }

    public j(Context context) {
        this.f2920a = 3;
        int e10 = g.f.e(context, 0);
        this.f2922c = new g.b(new ContextThemeWrapper(context, g.f.e(context, e10)));
        this.f2921b = e10;
    }

    @Override
    public void S0(vr vrVar) {
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

    public j(boolean z10, boolean z11, boolean z12) {
        this.f2920a = 16;
        this.f2921b = (z10 || z11 || z12) ? 1 : 0;
    }

    @Override
    public void onError(i61 i61Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }
}

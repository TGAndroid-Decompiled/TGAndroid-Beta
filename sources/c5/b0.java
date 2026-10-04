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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class b0 implements r2.v {
    public final int f4152a;
    public int f4153b;
    public Object f4154c;

    public b0(char c10, int i10) {
        this.f4152a = i10;
    }

    @Override
    public boolean Y(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override
    public MediaCodecInfo a(int i10) {
        if (((MediaCodecInfo[]) this.f4154c) == null) {
            this.f4154c = new MediaCodecList(this.f4153b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f4154c)[i10];
    }

    public Object b() {
        Object[] objArr = (Object[]) this.f4154c;
        int i10 = this.f4153b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = objArr[i11];
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i11] = null;
        this.f4153b--;
        return obj;
    }

    public void c(long j3) {
        int i10 = this.f4153b;
        long[] jArr = (long[]) this.f4154c;
        if (i10 == jArr.length) {
            this.f4154c = Arrays.copyOf(jArr, i10 * 2);
        }
        int i11 = this.f4153b;
        this.f4153b = i11 + 1;
        ((long[]) this.f4154c)[i11] = j3;
    }

    public void d(long[] jArr) {
        int length = this.f4153b + jArr.length;
        long[] jArr2 = (long[]) this.f4154c;
        if (length > jArr2.length) {
            this.f4154c = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, (long[]) this.f4154c, this.f4153b, jArr.length);
        this.f4153b = length;
    }

    @Override
    public int d0() {
        if (((MediaCodecInfo[]) this.f4154c) == null) {
            this.f4154c = new MediaCodecList(this.f4153b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f4154c).length;
    }

    public g.g e() {
        int i10;
        Message message;
        g.c cVar = (g.c) this.f4154c;
        g.g gVar = new g.g(cVar.f10027a, this.f4153b);
        View view = cVar.f10030e;
        g.f fVar = gVar.f10063f;
        if (view != null) {
            fVar.f10055r = view;
        } else {
            CharSequence charSequence = cVar.d;
            if (charSequence != null) {
                fVar.d = charSequence;
                TextView textView = fVar.f10053p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = cVar.f10029c;
            if (drawable != null) {
                fVar.f10051n = drawable;
                ImageView imageView = fVar.f10052o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    fVar.f10052o.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = cVar.f10031f;
        if (charSequence2 != null) {
            androidx.biometric.w wVar = cVar.f10032g;
            fVar.getClass();
            if (wVar != null) {
                message = fVar.f10062z.obtainMessage(-2, wVar);
            } else {
                message = null;
            }
            fVar.f10047j = charSequence2;
            fVar.f10048k = message;
        }
        if (cVar.f10033i != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) cVar.f10028b.inflate(fVar.v, (ViewGroup) null);
            if (cVar.f10036l) {
                i10 = fVar.f10059w;
            } else {
                i10 = fVar.f10060x;
            }
            Object obj = cVar.f10033i;
            ArrayAdapter arrayAdapter = obj;
            if (obj == null) {
                arrayAdapter = new ArrayAdapter(cVar.f10027a, i10, 16908308, (Object[]) null);
            }
            fVar.f10056s = arrayAdapter;
            fVar.f10057t = cVar.f10037m;
            if (cVar.f10034j != null) {
                alertController$RecycleListView.setOnItemClickListener(new g.b(cVar, fVar));
            }
            if (cVar.f10036l) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            fVar.f10043e = alertController$RecycleListView;
        }
        View view2 = cVar.f10035k;
        if (view2 != null) {
            fVar.f10044f = view2;
            fVar.f10045g = false;
        }
        gVar.setCancelable(true);
        gVar.setCanceledOnTouchOutside(true);
        gVar.setOnCancelListener(null);
        gVar.setOnDismissListener(null);
        l.l lVar = cVar.h;
        if (lVar != null) {
            gVar.setOnKeyListener(lVar);
        }
        return gVar;
    }

    public long f(int i10) {
        if (i10 >= 0 && i10 < this.f4153b) {
            return ((long[]) this.f4154c)[i10];
        }
        StringBuilder j3 = hg.c.j(i10, "Invalid index ", ", size is ");
        j3.append(this.f4153b);
        throw new IndexOutOfBoundsException(j3.toString());
    }

    public synchronized List g() {
        return DesugarCollections.unmodifiableList(new ArrayList((ArrayList) this.f4154c));
    }

    public long h(c3.l lVar) {
        e2.v vVar = (e2.v) this.f4154c;
        int i10 = 0;
        lVar.f(vVar.f8590a, 0, 1, false);
        int i11 = vVar.f8590a[0] & 255;
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
        lVar.f(vVar.f8590a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (vVar.f8590a[i10] & 255) + (i14 << 8);
        }
        this.f4153b = i13 + 1 + this.f4153b;
        return i14;
    }

    public void i(Object instance) {
        Object[] objArr = (Object[]) this.f4154c;
        kotlin.jvm.internal.i.e(instance, "instance");
        int i10 = this.f4153b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == instance) {
                throw new IllegalStateException("Already in the pool!");
            }
        }
        int i12 = this.f4153b;
        if (i12 < objArr.length) {
            objArr[i12] = instance;
            this.f4153b = i12 + 1;
        }
    }

    public String j(h4 h4Var) {
        String str;
        d0 d0Var = (d0) this.f4154c;
        int i10 = this.f4153b;
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
                Parcel U0 = eVar.U0();
                U0.writeString(packageName);
                U0.writeString(str);
                int i11 = com.google.android.gms.internal.play_billing.d.f7276a;
                U0.writeStrongBinder(c0Var);
                eVar.f338b.transact(1, U0, null, 1);
                U0.recycle();
                return "billingOverrideService.getBillingOverride";
            }
            throw null;
        } catch (Exception e7) {
            d0Var.F(95, 28, g0.f4203p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e7);
            h4Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    @Override
    public boolean p0() {
        return true;
    }

    public String toString() {
        switch (this.f4152a) {
            case 5:
                return new String((char[]) this.f4154c, 0, this.f4153b);
            default:
                return super.toString();
        }
    }

    @Override
    public boolean x(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public b0(Object obj, int i10, int i11) {
        this.f4152a = i11;
        this.f4154c = obj;
        this.f4153b = i10;
    }

    public b0(k6.a aVar, int i10) {
        this.f4152a = 1;
        n6.l.h(aVar);
        this.f4154c = aVar;
        this.f4153b = i10;
    }

    public b0(int i10, byte b10) {
        this(32, 2);
        this.f4152a = i10;
        switch (i10) {
            case 8:
                this.f4154c = new e2.v(8);
                return;
            case 9:
            case 11:
            default:
                return;
            case 10:
                this.f4154c = new ArrayList();
                this.f4153b = 128;
                return;
            case 12:
                this.f4153b = 0;
                this.f4154c = new StringBuilder();
                return;
        }
    }

    public b0(int i10, int i11) {
        this.f4152a = i11;
        switch (i11) {
            case 6:
                if (i10 > 0) {
                    this.f4154c = new Object[i10];
                    return;
                }
                throw new IllegalArgumentException("The max pool size must be > 0");
            default:
                this.f4154c = new long[i10];
                return;
        }
    }

    public b0(int i10, q0[] q0VarArr) {
        this.f4152a = 4;
        this.f4153b = i10;
        this.f4154c = q0VarArr;
    }

    public b0(Context context) {
        this.f4152a = 3;
        int e7 = g.g.e(context, 0);
        this.f4154c = new g.c(new ContextThemeWrapper(context, g.g.e(context, e7)));
        this.f4153b = e7;
    }

    public b0(boolean z10, boolean z11, boolean z12) {
        this.f4152a = 7;
        this.f4153b = (z10 || z11 || z12) ? 1 : 0;
    }
}

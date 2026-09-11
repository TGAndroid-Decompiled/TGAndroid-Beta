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
public final class b0 implements r2.u {
    public final int f4345a;
    public int f4346b;
    public Object f4347c;

    public b0(char c10, int i10) {
        this.f4345a = i10;
    }

    @Override
    public boolean K0() {
        return true;
    }

    public Object a() {
        Object[] objArr = (Object[]) this.f4347c;
        int i10 = this.f4346b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = objArr[i11];
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i11] = null;
        this.f4346b--;
        return obj;
    }

    @Override
    public MediaCodecInfo b(int i10) {
        if (((MediaCodecInfo[]) this.f4347c) == null) {
            this.f4347c = new MediaCodecList(this.f4346b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f4347c)[i10];
    }

    public void c(long j3) {
        int i10 = this.f4346b;
        long[] jArr = (long[]) this.f4347c;
        if (i10 == jArr.length) {
            this.f4347c = Arrays.copyOf(jArr, i10 * 2);
        }
        int i11 = this.f4346b;
        this.f4346b = i11 + 1;
        ((long[]) this.f4347c)[i11] = j3;
    }

    public void d(long[] jArr) {
        int length = this.f4346b + jArr.length;
        long[] jArr2 = (long[]) this.f4347c;
        if (length > jArr2.length) {
            this.f4347c = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, (long[]) this.f4347c, this.f4346b, jArr.length);
        this.f4346b = length;
    }

    public g.g e() {
        int i10;
        Message message;
        g.c cVar = (g.c) this.f4347c;
        g.g gVar = new g.g(cVar.f10163a, this.f4346b);
        View view = cVar.f10166e;
        g.f fVar = gVar.f10199f;
        if (view != null) {
            fVar.f10191r = view;
        } else {
            CharSequence charSequence = cVar.d;
            if (charSequence != null) {
                fVar.d = charSequence;
                TextView textView = fVar.f10189p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = cVar.f10165c;
            if (drawable != null) {
                fVar.f10187n = drawable;
                ImageView imageView = fVar.f10188o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    fVar.f10188o.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = cVar.f10167f;
        if (charSequence2 != null) {
            androidx.biometric.x xVar = cVar.f10168g;
            fVar.getClass();
            if (xVar != null) {
                message = fVar.f10198z.obtainMessage(-2, xVar);
            } else {
                message = null;
            }
            fVar.f10183j = charSequence2;
            fVar.f10184k = message;
        }
        if (cVar.f10169i != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) cVar.f10164b.inflate(fVar.v, (ViewGroup) null);
            if (cVar.f10172l) {
                i10 = fVar.f10195w;
            } else {
                i10 = fVar.f10196x;
            }
            Object obj = cVar.f10169i;
            ArrayAdapter arrayAdapter = obj;
            if (obj == null) {
                arrayAdapter = new ArrayAdapter(cVar.f10163a, i10, 16908308, (Object[]) null);
            }
            fVar.f10192s = arrayAdapter;
            fVar.f10193t = cVar.f10173m;
            if (cVar.f10170j != null) {
                alertController$RecycleListView.setOnItemClickListener(new g.b(cVar, fVar));
            }
            if (cVar.f10172l) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            fVar.f10179e = alertController$RecycleListView;
        }
        View view2 = cVar.f10171k;
        if (view2 != null) {
            fVar.f10180f = view2;
            fVar.f10181g = false;
        }
        gVar.setCancelable(true);
        gVar.setCanceledOnTouchOutside(true);
        gVar.setOnCancelListener(null);
        gVar.setOnDismissListener(null);
        l.m mVar = cVar.h;
        if (mVar != null) {
            gVar.setOnKeyListener(mVar);
        }
        return gVar;
    }

    public long f(int i10) {
        if (i10 >= 0 && i10 < this.f4346b) {
            return ((long[]) this.f4347c)[i10];
        }
        StringBuilder l4 = i2.g.l(i10, "Invalid index ", ", size is ");
        l4.append(this.f4346b);
        throw new IndexOutOfBoundsException(l4.toString());
    }

    public synchronized List g() {
        return DesugarCollections.unmodifiableList(new ArrayList((ArrayList) this.f4347c));
    }

    public long h(c3.l lVar) {
        e2.v vVar = (e2.v) this.f4347c;
        int i10 = 0;
        lVar.j(vVar.f8789a, 0, 1, false);
        int i11 = vVar.f8789a[0] & 255;
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
        lVar.j(vVar.f8789a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (vVar.f8789a[i10] & 255) + (i14 << 8);
        }
        this.f4346b = i13 + 1 + this.f4346b;
        return i14;
    }

    public void i(Object instance) {
        Object[] objArr = (Object[]) this.f4347c;
        kotlin.jvm.internal.i.e(instance, "instance");
        int i10 = this.f4346b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == instance) {
                throw new IllegalStateException("Already in the pool!");
            }
        }
        int i12 = this.f4346b;
        if (i12 < objArr.length) {
            objArr[i12] = instance;
            this.f4346b = i12 + 1;
        }
    }

    public String j(h4 h4Var) {
        String str;
        d0 d0Var = (d0) this.f4347c;
        int i10 = this.f4346b;
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
                int i11 = com.google.android.gms.internal.play_billing.d.f5747a;
                U0.writeStrongBinder(c0Var);
                eVar.f324b.transact(1, U0, null, 1);
                U0.recycle();
                return "billingOverrideService.getBillingOverride";
            }
            throw null;
        } catch (Exception e7) {
            d0Var.F(95, 28, g0.f4396p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e7);
            h4Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    @Override
    public boolean p(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override
    public boolean q0(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override
    public int r0() {
        if (((MediaCodecInfo[]) this.f4347c) == null) {
            this.f4347c = new MediaCodecList(this.f4346b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f4347c).length;
    }

    public String toString() {
        switch (this.f4345a) {
            case 5:
                return new String((char[]) this.f4347c, 0, this.f4346b);
            default:
                return super.toString();
        }
    }

    public b0(Object obj, int i10, int i11) {
        this.f4345a = i11;
        this.f4347c = obj;
        this.f4346b = i10;
    }

    public b0(k6.a aVar, int i10) {
        this.f4345a = 1;
        n6.l.h(aVar);
        this.f4347c = aVar;
        this.f4346b = i10;
    }

    public b0(int i10, byte b10) {
        this(32, 2);
        this.f4345a = i10;
        switch (i10) {
            case 8:
                this.f4347c = new e2.v(8);
                return;
            case 9:
            case 11:
            default:
                return;
            case 10:
                this.f4347c = new ArrayList();
                this.f4346b = 128;
                return;
            case 12:
                this.f4346b = 0;
                this.f4347c = new StringBuilder();
                return;
        }
    }

    public b0(int i10, int i11) {
        this.f4345a = i11;
        switch (i11) {
            case 6:
                if (i10 > 0) {
                    this.f4347c = new Object[i10];
                    return;
                }
                throw new IllegalArgumentException("The max pool size must be > 0");
            default:
                this.f4347c = new long[i10];
                return;
        }
    }

    public b0(int i10, q0[] q0VarArr) {
        this.f4345a = 4;
        this.f4346b = i10;
        this.f4347c = q0VarArr;
    }

    public b0(Context context) {
        this.f4345a = 3;
        int e7 = g.g.e(context, 0);
        this.f4347c = new g.c(new ContextThemeWrapper(context, g.g.e(context, e7)));
        this.f4346b = e7;
    }

    public b0(boolean z10, boolean z11, boolean z12) {
        this.f4345a = 7;
        this.f4346b = (z10 || z11 || z12) ? 1 : 0;
    }
}

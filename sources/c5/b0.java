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
    public final int f3842a;
    public int f3843b;
    public Object f3844c;

    public b0(char c10, int i10) {
        this.f3842a = i10;
    }

    @Override
    public boolean Z(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public Object a() {
        Object[] objArr = (Object[]) this.f3844c;
        int i10 = this.f3843b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = objArr[i11];
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i11] = null;
        this.f3843b--;
        return obj;
    }

    public void b(long j3) {
        int i10 = this.f3843b;
        long[] jArr = (long[]) this.f3844c;
        if (i10 == jArr.length) {
            this.f3844c = Arrays.copyOf(jArr, i10 * 2);
        }
        int i11 = this.f3843b;
        this.f3843b = i11 + 1;
        ((long[]) this.f3844c)[i11] = j3;
    }

    @Override
    public MediaCodecInfo c(int i10) {
        if (((MediaCodecInfo[]) this.f3844c) == null) {
            this.f3844c = new MediaCodecList(this.f3843b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f3844c)[i10];
    }

    public void d(long[] jArr) {
        int length = this.f3843b + jArr.length;
        long[] jArr2 = (long[]) this.f3844c;
        if (length > jArr2.length) {
            this.f3844c = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, (long[]) this.f3844c, this.f3843b, jArr.length);
        this.f3843b = length;
    }

    public g.g e() {
        int i10;
        Message message;
        g.c cVar = (g.c) this.f3844c;
        g.g gVar = new g.g(cVar.f9225a, this.f3843b);
        View view = cVar.e;
        g.f fVar = gVar.f9259f;
        if (view != null) {
            fVar.f9251r = view;
        } else {
            CharSequence charSequence = cVar.d;
            if (charSequence != null) {
                fVar.d = charSequence;
                TextView textView = fVar.f9249p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = cVar.f9227c;
            if (drawable != null) {
                fVar.f9247n = drawable;
                ImageView imageView = fVar.f9248o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    fVar.f9248o.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = cVar.f9228f;
        if (charSequence2 != null) {
            androidx.biometric.w wVar = cVar.f9229g;
            fVar.getClass();
            if (wVar != null) {
                message = fVar.f9258z.obtainMessage(-2, wVar);
            } else {
                message = null;
            }
            fVar.f9243j = charSequence2;
            fVar.f9244k = message;
        }
        if (cVar.f9230i != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) cVar.f9226b.inflate(fVar.v, (ViewGroup) null);
            if (cVar.f9233l) {
                i10 = fVar.f9255w;
            } else {
                i10 = fVar.f9256x;
            }
            Object obj = cVar.f9230i;
            ArrayAdapter arrayAdapter = obj;
            if (obj == null) {
                arrayAdapter = new ArrayAdapter(cVar.f9225a, i10, 16908308, (Object[]) null);
            }
            fVar.f9252s = arrayAdapter;
            fVar.f9253t = cVar.f9234m;
            if (cVar.f9231j != null) {
                alertController$RecycleListView.setOnItemClickListener(new g.b(cVar, fVar));
            }
            if (cVar.f9233l) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            fVar.e = alertController$RecycleListView;
        }
        View view2 = cVar.f9232k;
        if (view2 != null) {
            fVar.f9240f = view2;
            fVar.f9241g = false;
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
        if (i10 >= 0 && i10 < this.f3843b) {
            return ((long[]) this.f3844c)[i10];
        }
        StringBuilder l4 = hg.c.l(i10, "Invalid index ", ", size is ");
        l4.append(this.f3843b);
        throw new IndexOutOfBoundsException(l4.toString());
    }

    public synchronized List g() {
        return DesugarCollections.unmodifiableList(new ArrayList((ArrayList) this.f3844c));
    }

    @Override
    public int g0() {
        if (((MediaCodecInfo[]) this.f3844c) == null) {
            this.f3844c = new MediaCodecList(this.f3843b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f3844c).length;
    }

    public long h(c3.l lVar) {
        e2.v vVar = (e2.v) this.f3844c;
        int i10 = 0;
        lVar.h(vVar.f7931a, 0, 1, false);
        int i11 = vVar.f7931a[0] & 255;
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
        lVar.h(vVar.f7931a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (vVar.f7931a[i10] & 255) + (i14 << 8);
        }
        this.f3843b = i13 + 1 + this.f3843b;
        return i14;
    }

    public void i(Object instance) {
        Object[] objArr = (Object[]) this.f3844c;
        kotlin.jvm.internal.i.e(instance, "instance");
        int i10 = this.f3843b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == instance) {
                throw new IllegalStateException("Already in the pool!");
            }
        }
        int i12 = this.f3843b;
        if (i12 < objArr.length) {
            objArr[i12] = instance;
            this.f3843b = i12 + 1;
        }
    }

    public String j(h4 h4Var) {
        String str;
        d0 d0Var = (d0) this.f3844c;
        int i10 = this.f3843b;
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
                int i11 = com.google.android.gms.internal.play_billing.d.f6756a;
                U0.writeStrongBinder(c0Var);
                eVar.f315b.transact(1, U0, null, 1);
                U0.recycle();
                return "billingOverrideService.getBillingOverride";
            }
            throw null;
        } catch (Exception e) {
            d0Var.F(95, 28, g0.f3890p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            h4Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    @Override
    public boolean p0() {
        return true;
    }

    public String toString() {
        switch (this.f3842a) {
            case 5:
                return new String((char[]) this.f3844c, 0, this.f3843b);
            default:
                return super.toString();
        }
    }

    @Override
    public boolean v(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public b0(Object obj, int i10, int i11) {
        this.f3842a = i11;
        this.f3844c = obj;
        this.f3843b = i10;
    }

    public b0(k6.a aVar, int i10) {
        this.f3842a = 1;
        n6.l.h(aVar);
        this.f3844c = aVar;
        this.f3843b = i10;
    }

    public b0(int i10, byte b10) {
        this(32, 2);
        this.f3842a = i10;
        switch (i10) {
            case 8:
                this.f3844c = new e2.v(8);
                return;
            case 9:
            case 11:
            default:
                return;
            case 10:
                this.f3844c = new ArrayList();
                this.f3843b = 128;
                return;
            case 12:
                this.f3843b = 0;
                this.f3844c = new StringBuilder();
                return;
        }
    }

    public b0(int i10, int i11) {
        this.f3842a = i11;
        switch (i11) {
            case 6:
                if (i10 > 0) {
                    this.f3844c = new Object[i10];
                    return;
                }
                throw new IllegalArgumentException("The max pool size must be > 0");
            default:
                this.f3844c = new long[i10];
                return;
        }
    }

    public b0(int i10, q0[] q0VarArr) {
        this.f3842a = 4;
        this.f3843b = i10;
        this.f3844c = q0VarArr;
    }

    public b0(Context context) {
        this.f3842a = 3;
        int e = g.g.e(context, 0);
        this.f3844c = new g.c(new ContextThemeWrapper(context, g.g.e(context, e)));
        this.f3843b = e;
    }

    public b0(boolean z10, boolean z11, boolean z12) {
        this.f3842a = 7;
        this.f3843b = (z10 || z11 || z12) ? 1 : 0;
    }
}

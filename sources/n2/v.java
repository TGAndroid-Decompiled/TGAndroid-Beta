package n2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Message;
import android.os.Parcel;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.gms.internal.play_billing.g4;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class v implements y3.u {

    public final int f18185a;

    public int f18186b;

    public Object f18187c;

    public v(char c10, int i10) {
        this.f18185a = i10;
    }

    @Override
    public boolean B() {
        return true;
    }

    @Override
    public MediaCodecInfo a(int i10) {
        if (((MediaCodecInfo[]) this.f18187c) == null) {
            this.f18187c = new MediaCodecList(this.f18186b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f18187c)[i10];
    }

    public Object b() {
        Object[] objArr = (Object[]) this.f18187c;
        int i10 = this.f18186b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object obj = objArr[i11];
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i11] = null;
        this.f18186b--;
        return obj;
    }

    public void c(long j10) {
        int i10 = this.f18186b;
        long[] jArr = (long[]) this.f18187c;
        if (i10 == jArr.length) {
            this.f18187c = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = (long[]) this.f18187c;
        int i11 = this.f18186b;
        this.f18186b = i11 + 1;
        jArr2[i11] = j10;
    }

    public g.g d() {
        g.d dVar = (g.d) this.f18187c;
        g.g gVar = new g.g(dVar.f6227a, this.f18186b);
        View view = dVar.f6230e;
        g.f fVar = gVar.f6261f;
        if (view != null) {
            fVar.f6253r = view;
        } else {
            CharSequence charSequence = dVar.d;
            if (charSequence != null) {
                fVar.d = charSequence;
                TextView textView = fVar.f6251p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = dVar.f6229c;
            if (drawable != null) {
                fVar.f6249n = drawable;
                ImageView imageView = fVar.f6250o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    fVar.f6250o.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = dVar.f6231f;
        if (charSequence2 != null) {
            androidx.biometric.x xVar = dVar.f6232g;
            Message messageObtainMessage = xVar != null ? fVar.f6260z.obtainMessage(-2, xVar) : null;
            fVar.f6245j = charSequence2;
            fVar.f6246k = messageObtainMessage;
        }
        if (dVar.f6233i != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) dVar.f6228b.inflate(fVar.v, (ViewGroup) null);
            int i10 = dVar.f6236l ? fVar.f6257w : fVar.f6258x;
            Object obj = dVar.f6233i;
            ?? eVar = obj;
            if (obj == null) {
                eVar = new g.e(dVar.f6227a, i10, 16908308, null);
            }
            fVar.f6254s = eVar;
            fVar.f6255t = dVar.f6237m;
            if (dVar.f6234j != null) {
                alertController$RecycleListView.setOnItemClickListener(new g.c(dVar, fVar));
            }
            if (dVar.f6236l) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            fVar.f6241e = alertController$RecycleListView;
        }
        View view2 = dVar.f6235k;
        if (view2 != null) {
            fVar.f6242f = view2;
            fVar.f6243g = false;
        }
        gVar.setCancelable(true);
        gVar.setCanceledOnTouchOutside(true);
        gVar.setOnCancelListener(null);
        gVar.setOnDismissListener(null);
        l.m mVar = dVar.h;
        if (mVar != null) {
            gVar.setOnKeyListener(mVar);
        }
        return gVar;
    }

    @Override
    public boolean e(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public long f(int i10) {
        if (i10 >= 0 && i10 < this.f18186b) {
            return ((long[]) this.f18187c)[i10];
        }
        StringBuilder sbO = i0.a.o(i10, "Invalid index ", ", size is ");
        sbO.append(this.f18186b);
        throw new IndexOutOfBoundsException(sbO.toString());
    }

    public synchronized List g() {
        return DesugarCollections.unmodifiableList(new ArrayList((ArrayList) this.f18187c));
    }

    public long h(m3.h hVar) {
        d5.z zVar = (d5.z) this.f18187c;
        int i10 = 0;
        hVar.g(zVar.f4858a, 0, 1, false);
        int i11 = zVar.f4858a[0] & 255;
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
        hVar.g(zVar.f4858a, 1, i13, false);
        while (i10 < i13) {
            i10++;
            i14 = (zVar.f4858a[i10] & 255) + (i14 << 8);
        }
        this.f18186b = i13 + 1 + this.f18186b;
        return i14;
    }

    @Override
    public boolean i(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public void j(Object instance) {
        Object[] objArr = (Object[]) this.f18187c;
        kotlin.jvm.internal.j.e(instance, "instance");
        int i10 = this.f18186b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == instance) {
                throw new IllegalStateException("Already in the pool!");
            }
        }
        int i12 = this.f18186b;
        if (i12 < objArr.length) {
            objArr[i12] = instance;
            this.f18186b = i12 + 1;
        }
    }

    public String k(g4 g4Var) {
        String str;
        x xVar = (x) this.f18187c;
        int i10 = this.f18186b;
        try {
            if (xVar.E == null) {
                throw null;
            }
            com.google.android.gms.internal.play_billing.g gVar = xVar.E;
            String packageName = xVar.C.getPackageName();
            if (i10 == 2) {
                str = "LAUNCH_BILLING_FLOW";
            } else if (i10 == 3) {
                str = "ACKNOWLEDGE_PURCHASE";
            } else if (i10 == 4) {
                str = "CONSUME_ASYNC";
            } else if (i10 != 5) {
                str = i10 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION";
            } else {
                str = "IS_FEATURE_SUPPORTED";
            }
            w wVar = new w(g4Var);
            com.google.android.gms.internal.play_billing.e eVar = (com.google.android.gms.internal.play_billing.e) gVar;
            Parcel parcelS0 = eVar.S0();
            parcelS0.writeString(packageName);
            parcelS0.writeString(str);
            int i11 = com.google.android.gms.internal.play_billing.d.f3991a;
            parcelS0.writeStrongBinder(wVar);
            try {
                eVar.f2456b.transact(1, parcelS0, null, 1);
                return "billingOverrideService.getBillingOverride";
            } finally {
                parcelS0.recycle();
            }
        } catch (Exception e9) {
            xVar.F(95, 28, a0.f18105p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e9);
            g4Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    @Override
    public int r() {
        if (((MediaCodecInfo[]) this.f18187c) == null) {
            this.f18187c = new MediaCodecList(this.f18186b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f18187c).length;
    }

    public String toString() {
        switch (this.f18185a) {
            case 11:
                return new String((char[]) this.f18187c, 0, this.f18186b);
            default:
                return super.toString();
        }
    }

    public v(Object obj, int i10, int i11) {
        this.f18185a = i11;
        this.f18187c = obj;
        this.f18186b = i10;
    }

    public v(v5.a aVar, int i10) {
        this.f18185a = 2;
        y5.l.h(aVar);
        this.f18187c = aVar;
        this.f18186b = i10;
    }

    public v(int i10, byte b10) {
        this.f18185a = i10;
        switch (i10) {
            case 6:
                this.f18187c = new ArrayList();
                this.f18186b = 128;
                break;
            case 7:
                this.f18186b = 0;
                this.f18187c = new StringBuilder();
                break;
            case 8:
            case 9:
            default:
                this.f18187c = new long[32];
                break;
            case 10:
                this.f18187c = new d5.z(8);
                break;
        }
    }

    public v(int i10) {
        this.f18185a = 8;
        if (i10 > 0) {
            this.f18187c = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public v(int i10, d5.p[] pVarArr) {
        this.f18185a = 9;
        this.f18186b = i10;
        this.f18187c = pVarArr;
    }

    public v(Context context) {
        this.f18185a = 5;
        int iE = g.g.e(context, 0);
        this.f18187c = new g.d(new ContextThemeWrapper(context, g.g.e(context, iE)));
        this.f18186b = iE;
    }

    public v(boolean z10, boolean z11) {
        this.f18185a = 12;
        this.f18186b = (z10 || z11) ? 1 : 0;
    }
}

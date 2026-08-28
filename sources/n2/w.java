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
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.gms.internal.play_billing.h4;
import j$.util.DesugarCollections;
import j3.r0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class w implements y3.u {
    public final int f18359a;
    public int f18360b;
    public Object f18361c;

    public w(char c10, int i9) {
        this.f18359a = i9;
    }

    @Override
    public int B() {
        if (((MediaCodecInfo[]) this.f18361c) == null) {
            this.f18361c = new MediaCodecList(this.f18360b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f18361c).length;
    }

    @Override
    public boolean I() {
        return true;
    }

    public Object a() {
        Object[] objArr = (Object[]) this.f18361c;
        int i9 = this.f18360b;
        if (i9 <= 0) {
            return null;
        }
        int i10 = i9 - 1;
        Object obj = objArr[i10];
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i10] = null;
        this.f18360b--;
        return obj;
    }

    @Override
    public MediaCodecInfo b(int i9) {
        if (((MediaCodecInfo[]) this.f18361c) == null) {
            this.f18361c = new MediaCodecList(this.f18360b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f18361c)[i9];
    }

    public void c(long j10) {
        int i9 = this.f18360b;
        long[] jArr = (long[]) this.f18361c;
        if (i9 == jArr.length) {
            this.f18361c = Arrays.copyOf(jArr, i9 * 2);
        }
        int i10 = this.f18360b;
        this.f18360b = i10 + 1;
        ((long[]) this.f18361c)[i10] = j10;
    }

    public g.f d() {
        int i9;
        Message message;
        g.c cVar = (g.c) this.f18361c;
        g.f fVar = new g.f(cVar.f6946a, this.f18360b);
        View view = cVar.f6949e;
        g.e eVar = fVar.f6980f;
        if (view != null) {
            eVar.f6972r = view;
        } else {
            CharSequence charSequence = cVar.d;
            if (charSequence != null) {
                eVar.d = charSequence;
                TextView textView = eVar.f6970p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = cVar.f6948c;
            if (drawable != null) {
                eVar.f6968n = drawable;
                ImageView imageView = eVar.f6969o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    eVar.f6969o.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = cVar.f6950f;
        if (charSequence2 != null) {
            androidx.biometric.x xVar = cVar.f6951g;
            eVar.getClass();
            if (xVar != null) {
                message = eVar.f6979z.obtainMessage(-2, xVar);
            } else {
                message = null;
            }
            eVar.f6964j = charSequence2;
            eVar.f6965k = message;
        }
        if (cVar.f6952i != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) cVar.f6947b.inflate(eVar.v, (ViewGroup) null);
            if (cVar.f6955l) {
                i9 = eVar.f6976w;
            } else {
                i9 = eVar.f6977x;
            }
            Object obj = cVar.f6952i;
            ArrayAdapter arrayAdapter = obj;
            if (obj == null) {
                arrayAdapter = new ArrayAdapter(cVar.f6946a, i9, 16908308, (Object[]) null);
            }
            eVar.f6973s = arrayAdapter;
            eVar.f6974t = cVar.f6956m;
            if (cVar.f6953j != null) {
                alertController$RecycleListView.setOnItemClickListener(new g.b(cVar, eVar));
            }
            if (cVar.f6955l) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            eVar.f6960e = alertController$RecycleListView;
        }
        View view2 = cVar.f6954k;
        if (view2 != null) {
            eVar.f6961f = view2;
            eVar.f6962g = false;
        }
        fVar.setCancelable(true);
        fVar.setCanceledOnTouchOutside(true);
        fVar.setOnCancelListener(null);
        fVar.setOnDismissListener(null);
        l.l lVar = cVar.h;
        if (lVar != null) {
            fVar.setOnKeyListener(lVar);
        }
        return fVar;
    }

    public long e(int i9) {
        if (i9 >= 0 && i9 < this.f18360b) {
            return ((long[]) this.f18361c)[i9];
        }
        StringBuilder p6 = r0.p(i9, "Invalid index ", ", size is ");
        p6.append(this.f18360b);
        throw new IndexOutOfBoundsException(p6.toString());
    }

    public synchronized List f() {
        return DesugarCollections.unmodifiableList(new ArrayList((ArrayList) this.f18361c));
    }

    public long g(m3.h hVar) {
        d5.y yVar = (d5.y) this.f18361c;
        int i9 = 0;
        hVar.g(yVar.f4410a, 0, 1, false);
        int i10 = yVar.f4410a[0] & 255;
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
        hVar.g(yVar.f4410a, 1, i12, false);
        while (i9 < i12) {
            i9++;
            i13 = (yVar.f4410a[i9] & 255) + (i13 << 8);
        }
        this.f18360b = i12 + 1 + this.f18360b;
        return i13;
    }

    public void h(Object instance) {
        Object[] objArr = (Object[]) this.f18361c;
        kotlin.jvm.internal.i.e(instance, "instance");
        int i9 = this.f18360b;
        for (int i10 = 0; i10 < i9; i10++) {
            if (objArr[i10] == instance) {
                throw new IllegalStateException("Already in the pool!");
            }
        }
        int i11 = this.f18360b;
        if (i11 < objArr.length) {
            objArr[i11] = instance;
            this.f18360b = i11 + 1;
        }
    }

    public String i(h4 h4Var) {
        String str;
        y yVar = (y) this.f18361c;
        int i9 = this.f18360b;
        try {
            if (yVar.E != null) {
                com.google.android.gms.internal.play_billing.g gVar = yVar.E;
                String packageName = yVar.C.getPackageName();
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            if (i9 != 5) {
                                if (i9 != 6) {
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
                x xVar = new x(h4Var);
                com.google.android.gms.internal.play_billing.e eVar = (com.google.android.gms.internal.play_billing.e) gVar;
                Parcel S0 = eVar.S0();
                S0.writeString(packageName);
                S0.writeString(str);
                int i10 = com.google.android.gms.internal.play_billing.d.f3540a;
                S0.writeStrongBinder(xVar);
                eVar.f1549b.transact(1, S0, null, 1);
                S0.recycle();
                return "billingOverrideService.getBillingOverride";
            }
            throw null;
        } catch (Exception e10) {
            yVar.F(95, 28, b0.f18302p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", e10);
            h4Var.a(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    @Override
    public boolean p(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public String toString() {
        switch (this.f18359a) {
            case 11:
                return new String((char[]) this.f18361c, 0, this.f18360b);
            default:
                return super.toString();
        }
    }

    @Override
    public boolean y(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public w(Object obj, int i9, int i10) {
        this.f18359a = i10;
        this.f18361c = obj;
        this.f18360b = i9;
    }

    public w(u5.a aVar, int i9) {
        this.f18359a = 2;
        x5.l.h(aVar);
        this.f18361c = aVar;
        this.f18360b = i9;
    }

    public w(int i9, byte b10) {
        this.f18359a = i9;
        switch (i9) {
            case 5:
                this.f18361c = new ArrayList();
                this.f18360b = 128;
                return;
            case 6:
                this.f18360b = 0;
                this.f18361c = new StringBuilder();
                return;
            case 10:
                this.f18361c = new d5.y(8);
                return;
            default:
                this.f18361c = new long[32];
                return;
        }
    }

    public w(int i9) {
        this.f18359a = 9;
        if (i9 > 0) {
            this.f18361c = new Object[i9];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public w(int i9, d5.p[] pVarArr) {
        this.f18359a = 8;
        this.f18360b = i9;
        this.f18361c = pVarArr;
    }

    public w(Context context) {
        this.f18359a = 7;
        int e10 = g.f.e(context, 0);
        this.f18361c = new g.c(new ContextThemeWrapper(context, g.f.e(context, e10)));
        this.f18360b = e10;
    }

    public w(boolean z10, boolean z11) {
        this.f18359a = 12;
        this.f18360b = (z10 || z11) ? 1 : 0;
    }
}

package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Typeface;
import android.widget.TextView;
import com.google.android.gms.vision.clearcut.DynamiteClearcutLogger;
import java.util.ArrayList;
public final class kq implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;

    public kq(ls6 ls6Var, ArrayList arrayList, int i) {
        this.a = (byte) 3;
        this.d = ls6Var;
        this.c = arrayList;
        this.b = i;
    }

    @Override
    public final void run() {
        int i = 0;
        switch (this.a) {
            case 0:
                ((TextView) this.c).setTypeface((Typeface) this.d, this.b);
                return;
            case 1:
                jq2 jq2Var = (jq2) this.d;
                int i2 = this.b;
                Object obj = ((ri6) this.c).b;
                String str = (String) jq2Var.a.get(Integer.valueOf(i2));
                if (str != null) {
                    w9 w9Var = (w9) jq2Var.e.get(str);
                    if (w9Var != null) {
                        s9 s9Var = w9Var.a;
                        if (jq2Var.d.remove(str)) {
                            s9Var.k(obj);
                            return;
                        }
                        return;
                    }
                    jq2Var.g.remove(str);
                    jq2Var.f.put(str, obj);
                    return;
                }
                return;
            case 2:
                ((jq2) this.d).a(this.b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.c));
                return;
            case 3:
                ArrayList arrayList = (ArrayList) this.c;
                while (i < arrayList.size()) {
                    ((ne2) arrayList.get(i)).a.m(this.b);
                    i++;
                }
                hl.c3(new mn6(this, arrayList, (byte) 10));
                return;
            case 4:
                ArrayList arrayList2 = (ArrayList) this.c;
                while (i < arrayList2.size()) {
                    if (!((String) this.d).equals(((r47) arrayList2.get(i)).S0())) {
                        arrayList2.remove(i);
                        i--;
                    }
                    i++;
                }
                if (arrayList2.size() > 0) {
                    xb4.G(this.b).l(arrayList2);
                    return;
                }
                return;
            case 5:
                DynamiteClearcutLogger.zza((DynamiteClearcutLogger) this.d).zza(this.b, (n6e) this.c);
                return;
            default:
                hhd hhdVar = (hhd) this.c;
                dw6 dw6Var = (dw6) this.d;
                int i3 = this.b;
                synchronized (hhdVar.d) {
                    hhdVar.U(dw6Var, i3);
                }
                return;
        }
    }

    public kq(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    public kq(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = obj2;
    }
}

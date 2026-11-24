package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Typeface;
import android.widget.TextView;
import com.google.android.gms.vision.clearcut.DynamiteClearcutLogger;
import java.util.ArrayList;
public final class jr implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;

    public jr(hs6 hs6Var, ArrayList arrayList, int i) {
        this.a = (byte) 3;
        this.d = hs6Var;
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
                br2 br2Var = (br2) this.d;
                int i2 = this.b;
                Object obj = ((ni6) this.c).b;
                String str = (String) br2Var.a.get(Integer.valueOf(i2));
                if (str != null) {
                    v9 v9Var = (v9) br2Var.e.get(str);
                    if (v9Var != null) {
                        r9 r9Var = v9Var.a;
                        if (br2Var.d.remove(str)) {
                            r9Var.m(obj);
                            return;
                        }
                        return;
                    }
                    br2Var.g.remove(str);
                    br2Var.f.put(str, obj);
                    return;
                }
                return;
            case 2:
                ((br2) this.d).a(this.b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.c));
                return;
            case 3:
                ArrayList arrayList = (ArrayList) this.c;
                while (i < arrayList.size()) {
                    ((hf2) arrayList.get(i)).a.m(this.b);
                    i++;
                }
                gm.c3(new lj6(this, arrayList, (byte) 14));
                return;
            case 4:
                ArrayList arrayList2 = (ArrayList) this.c;
                while (i < arrayList2.size()) {
                    if (!((String) this.d).equals(((k47) arrayList2.get(i)).S0())) {
                        arrayList2.remove(i);
                        i--;
                    }
                    i++;
                }
                if (arrayList2.size() > 0) {
                    bc4.G(this.b).l(arrayList2);
                    return;
                }
                return;
            case 5:
                DynamiteClearcutLogger.zza((DynamiteClearcutLogger) this.d).zza(this.b, (a4e) this.c);
                return;
            default:
                qed qedVar = (qed) this.c;
                yv6 yv6Var = (yv6) this.d;
                int i3 = this.b;
                synchronized (qedVar.d) {
                    qedVar.U(yv6Var, i3);
                }
                return;
        }
    }

    public jr(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    public jr(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = obj2;
    }
}

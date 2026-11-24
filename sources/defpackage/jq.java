package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Typeface;
import android.widget.TextView;
import com.google.android.gms.vision.clearcut.DynamiteClearcutLogger;
import java.util.ArrayList;
public final class jq implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;

    public jq(hq6 hq6Var, ArrayList arrayList, int i) {
        this.a = (byte) 3;
        this.d = hq6Var;
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
                qp2 qp2Var = (qp2) this.d;
                int i2 = this.b;
                Object obj = ((l69) this.c).b;
                String str = (String) qp2Var.a.get(Integer.valueOf(i2));
                if (str != null) {
                    v9 v9Var = (v9) qp2Var.e.get(str);
                    if (v9Var != null) {
                        r9 r9Var = v9Var.a;
                        if (qp2Var.d.remove(str)) {
                            r9Var.i(obj);
                            return;
                        }
                        return;
                    }
                    qp2Var.g.remove(str);
                    qp2Var.f.put(str, obj);
                    return;
                }
                return;
            case 2:
                ((qp2) this.d).a(this.b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.c));
                return;
            case 3:
                ArrayList arrayList = (ArrayList) this.c;
                while (i < arrayList.size()) {
                    ((wd2) arrayList.get(i)).a.m(this.b);
                    i++;
                }
                gl.d3(new oh6(this, arrayList, (byte) 13));
                return;
            case 4:
                ArrayList arrayList2 = (ArrayList) this.c;
                while (i < arrayList2.size()) {
                    if (!((String) this.d).equals(((k27) arrayList2.get(i)).S0())) {
                        arrayList2.remove(i);
                        i--;
                    }
                    i++;
                }
                if (arrayList2.size() > 0) {
                    ba4.G(this.b).l(arrayList2);
                    return;
                }
                return;
            case 5:
                DynamiteClearcutLogger.zza((DynamiteClearcutLogger) this.d).zza(this.b, (x1e) this.c);
                return;
            default:
                ocd ocdVar = (ocd) this.c;
                yt6 yt6Var = (yt6) this.d;
                int i3 = this.b;
                synchronized (ocdVar.d) {
                    ocdVar.U(yt6Var, i3);
                }
                return;
        }
    }

    public jq(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    public jq(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = obj2;
    }
}

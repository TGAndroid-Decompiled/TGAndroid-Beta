package b1;

import a8.d7;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.ResultReceiver;
import hd.p;
import hd.r;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import rd.l;
public abstract class d {
    public static final a f2897a = new Object();
    public static final Set f2898b;
    public static final int f2899c;
    public static final int d = 0;

    static {
        Set set;
        Integer[] numArr = {7, 20};
        int length = numArr.length;
        if (length != 0) {
            if (length != 1) {
                set = new LinkedHashSet(r.b(numArr.length));
                for (Integer num : numArr) {
                    set.add(num);
                }
            } else {
                set = Collections.singleton(numArr[0]);
                j.d(set, "singleton(...)");
            }
        } else {
            set = p.f14476a;
        }
        f2898b = set;
        f2899c = 1;
    }

    public static void a(ResultReceiver resultReceiver, Intent intent, String str) {
        j.e(resultReceiver, "resultReceiver");
        intent.putExtra("TYPE", str);
        intent.putExtra("ACTIVITY_REQUEST_CODE", f2899c);
        intent.putExtra("RESULT_RECEIVER", d(resultReceiver));
        intent.setFlags(65536);
    }

    public static boolean b(Bundle bundle, rd.p pVar, Executor executor, v0.g callback, CancellationSignal cancellationSignal) {
        j.e(executor, "executor");
        j.e(callback, "callback");
        if (!bundle.getBoolean("FAILURE_RESPONSE")) {
            return false;
        }
        d7.a(cancellationSignal, new b(executor, callback, pVar.invoke(bundle.getString("EXCEPTION_TYPE"), bundle.getString("EXCEPTION_MESSAGE")), 0));
        return true;
    }

    public static final boolean c(int i7, rd.p pVar, l lVar, CancellationSignal cancellationSignal) {
        if (i7 != -1) {
            ?? obj = new Object();
            obj.f17612a = new w0.c(2, jg.g.k(i7, "activity with result code: ", " indicating not RESULT_OK"));
            if (i7 == 0) {
                obj.f17612a = new w0.b("activity is cancelled by the user.");
            }
            pVar.invoke(cancellationSignal, new c(lVar, obj, 0));
            return true;
        }
        return false;
    }

    public static ResultReceiver d(ResultReceiver resultReceiver) {
        Parcel obtain = Parcel.obtain();
        j.d(obtain, "obtain(...)");
        j.b(resultReceiver);
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return resultReceiver2;
    }
}

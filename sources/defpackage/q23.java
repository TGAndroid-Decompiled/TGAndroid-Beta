package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.ResultReceiver;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executor;
public abstract class q23 {
    public static final l23 a = new Object();
    public static final Set b;
    public static final boolean c;
    public static final int d = 0;

    static {
        Set set;
        Integer[] numArr = {7, 20};
        int length = numArr.length;
        if (length != 0) {
            if (length != 1) {
                set = new LinkedHashSet(uk6.b(numArr.length));
                for (Integer num : numArr) {
                    set.add(num);
                }
            } else {
                set = Collections.singleton(numArr[0]);
                set.getClass();
            }
        } else {
            set = a34.a;
        }
        b = set;
        c = true;
    }

    public static void a(ResultReceiver resultReceiver, Intent intent, String str) {
        resultReceiver.getClass();
        intent.putExtra("TYPE", str);
        intent.putExtra("ACTIVITY_REQUEST_CODE", c ? 1 : 0);
        intent.putExtra("RESULT_RECEIVER", c(resultReceiver));
        intent.setFlags(65536);
    }

    public static boolean b(Bundle bundle, is4 is4Var, Executor executor, h23 h23Var, CancellationSignal cancellationSignal) {
        executor.getClass();
        h23Var.getClass();
        if (!bundle.getBoolean("FAILURE_RESPONSE")) {
            return false;
        }
        Object invoke = is4Var.invoke(bundle.getString("EXCEPTION_TYPE"), bundle.getString("EXCEPTION_MESSAGE"));
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (!d33.a(cancellationSignal)) {
            executor.execute(new bv2(h23Var, invoke, (byte) 18));
            return true;
        }
        return true;
    }

    public static ResultReceiver c(ResultReceiver resultReceiver) {
        Parcel obtain = Parcel.obtain();
        obtain.getClass();
        resultReceiver.getClass();
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return resultReceiver2;
    }
}

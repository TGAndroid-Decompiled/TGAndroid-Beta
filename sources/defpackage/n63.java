package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
public final class n63 {
    public Context a;

    public final o63 a() {
        Context context = this.a;
        if (context != null) {
            ?? obj = new Object();
            obj.a = jq3.a(jbd.a);
            mq5 mq5Var = new mq5(context);
            obj.b = mq5Var;
            obj.c = jq3.a(new wm4(mq5Var, new u23(mq5Var, (byte) 0), (byte) 11));
            mq5 mq5Var2 = obj.b;
            obj.d = new et8(mq5Var2, (byte) 8);
            mv8 a = jq3.a(new mj4(obj.d, jq3.a(new u23(mq5Var2, (byte) 1)), (byte) 23));
            obj.e = a;
            k4f k4fVar = new k4f((byte) 25);
            mq5 mq5Var3 = obj.b;
            wm9 wm9Var = new wm9(mq5Var3, a, k4fVar, (byte) 2);
            mv8 mv8Var = obj.a;
            mv8 mv8Var2 = obj.c;
            sm2 sm2Var = new sm2(mv8Var, mv8Var2, wm9Var, a, a, (byte) 6);
            ?? obj2 = new Object();
            obj2.a = mq5Var3;
            obj2.b = mv8Var2;
            obj2.c = a;
            obj2.d = wm9Var;
            obj2.e = mv8Var;
            obj2.f = a;
            obj2.h = a;
            obj.f = jq3.a(new wm9(sm2Var, (Object) obj2, new xvc(mv8Var, a, wm9Var, a, (byte) 19), (byte) 9));
            return obj;
        }
        String canonicalName = Context.class.getCanonicalName();
        throw new IllegalStateException(canonicalName + " must be set");
    }

    public final PackageInfo b(int i, String str) {
        return this.a.getPackageManager().getPackageInfo(str, i);
    }
}

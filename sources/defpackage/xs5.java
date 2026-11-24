package defpackage;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.util.LinkedHashSet;
import java.util.List;
public final class xs5 {
    public static final bv5[] d;
    public final String a;
    public final ThreadLocal b;
    public final jg8 c;

    static {
        zs8 zs8Var = new zs8(j91.NO_RECEIVER, xs5.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
        f59.a.getClass();
        d = new bv5[]{zs8Var};
    }

    public xs5(Context context, String str) {
        jg8 jg8Var;
        context.getClass();
        this.a = str;
        this.b = new ThreadLocal();
        ln8 ln8Var = new ln8(new qp4(this) {
            public final xs5 b;

            {
                this.b = this;
            }

            @Override
            public final Object invoke(Object obj) {
                byte b = r2;
                xs5 xs5Var = this.b;
                switch (b) {
                    case 0:
                        fx2 fx2Var = (fx2) obj;
                        fx2Var.getClass();
                        String b2 = f59.a(xs5.class).b();
                        Log.w(b2, "CorruptionException in " + xs5Var.a + " DataStore running in process " + Process.myPid(), fx2Var);
                        return new ih7(true);
                    default:
                        Context context2 = (Context) obj;
                        context2.getClass();
                        String str2 = xs5Var.a;
                        LinkedHashSet linkedHashSet = xfa.a;
                        linkedHashSet.getClass();
                        return zk2.a(new vfa(context2, str2, yfa.a, new d73(linkedHashSet, null, (byte) 3), new ccb(3, null)));
                }
            }
        }, (byte) 5);
        qp4 qp4Var = new qp4(this) {
            public final xs5 b;

            {
                this.b = this;
            }

            @Override
            public final Object invoke(Object obj) {
                byte b = r2;
                xs5 xs5Var = this.b;
                switch (b) {
                    case 0:
                        fx2 fx2Var = (fx2) obj;
                        fx2Var.getClass();
                        String b2 = f59.a(xs5.class).b();
                        Log.w(b2, "CorruptionException in " + xs5Var.a + " DataStore running in process " + Process.myPid(), fx2Var);
                        return new ih7(true);
                    default:
                        Context context2 = (Context) obj;
                        context2.getClass();
                        String str2 = xs5Var.a;
                        LinkedHashSet linkedHashSet = xfa.a;
                        linkedHashSet.getClass();
                        return zk2.a(new vfa(context2, str2, yfa.a, new d73(linkedHashSet, null, (byte) 3), new ccb(3, null)));
                }
            }
        };
        xb3 xb3Var = ko3.a;
        xa3 xa3Var = xa3.c;
        dt5 dt5Var = new dt5();
        xa3Var.getClass();
        dw2 a = h9e.a(kud.c(xa3Var, dt5Var));
        f06 f06Var = new f06(str, ln8Var, qp4Var, a);
        d[0].getClass();
        jg8 jg8Var2 = (jg8) f06Var.c;
        if (jg8Var2 == null) {
            synchronized (f06Var.b) {
                if (((jg8) f06Var.c) == null) {
                    Context applicationContext = context.getApplicationContext();
                    applicationContext.getClass();
                    kg8 kg8Var = new kg8((byte) 0, applicationContext, f06Var);
                    f06Var.c = new jg8(new jg8(new v73(new eb4(eef.d, cb4.c, new db4(kg8Var, (byte) 2)), zk2.a(new ai1((List) qp4Var.invoke(applicationContext), null, (byte) 3)), ln8Var, a)));
                }
                jg8Var = (jg8) f06Var.c;
                jg8Var.getClass();
            }
            jg8Var2 = jg8Var;
        }
        this.c = jg8Var2;
    }

    public final void a(qp4 qp4Var) {
        ih7 ih7Var = (ih7) ipd.a(new ai1(this, qp4Var, null, (byte) 6));
    }

    public final Object b(lg8 lg8Var, Long l) {
        lg8Var.getClass();
        return ipd.a(new vs5(this, lg8Var, l, null, (byte) 0));
    }
}

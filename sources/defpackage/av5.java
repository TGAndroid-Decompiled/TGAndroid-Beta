package defpackage;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.util.LinkedHashSet;
import java.util.List;
public final class av5 {
    public static final gx5[] d;
    public final String a;
    public final ThreadLocal b;
    public final xj8 c;

    static {
        iw8 iw8Var = new iw8(s91.NO_RECEIVER, av5.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
        s89.a.getClass();
        d = new gx5[]{iw8Var};
    }

    public av5(Context context, String str) {
        xj8 xj8Var;
        context.getClass();
        this.a = str;
        this.b = new ThreadLocal();
        i09 i09Var = new i09(new ur4(this) {
            public final av5 b;

            {
                this.b = this;
            }

            @Override
            public final Object invoke(Object obj) {
                byte b = r2;
                av5 av5Var = this.b;
                switch (b) {
                    case 0:
                        zx2 zx2Var = (zx2) obj;
                        zx2Var.getClass();
                        String b2 = s89.a(av5.class).b();
                        Log.w(b2, "CorruptionException in " + av5Var.a + " DataStore running in process " + Process.myPid(), zx2Var);
                        return new rj7(true);
                    default:
                        Context context2 = (Context) obj;
                        context2.getClass();
                        String str2 = av5Var.a;
                        LinkedHashSet linkedHashSet = qja.a;
                        linkedHashSet.getClass();
                        return tl2.a(new oja(context2, str2, rja.a, new w73(linkedHashSet, null, (byte) 3), new yfb(3, null)));
                }
            }
        }, (byte) 3);
        ur4 ur4Var = new ur4(this) {
            public final av5 b;

            {
                this.b = this;
            }

            @Override
            public final Object invoke(Object obj) {
                byte b = r2;
                av5 av5Var = this.b;
                switch (b) {
                    case 0:
                        zx2 zx2Var = (zx2) obj;
                        zx2Var.getClass();
                        String b2 = s89.a(av5.class).b();
                        Log.w(b2, "CorruptionException in " + av5Var.a + " DataStore running in process " + Process.myPid(), zx2Var);
                        return new rj7(true);
                    default:
                        Context context2 = (Context) obj;
                        context2.getClass();
                        String str2 = av5Var.a;
                        LinkedHashSet linkedHashSet = qja.a;
                        linkedHashSet.getClass();
                        return tl2.a(new oja(context2, str2, rja.a, new w73(linkedHashSet, null, (byte) 3), new yfb(3, null)));
                }
            }
        };
        qc3 qc3Var = bp3.a;
        qb3 qb3Var = qb3.c;
        gv5 gv5Var = new gv5();
        qb3Var.getClass();
        xw2 a = xde.a(azd.c(qb3Var, gv5Var));
        j26 j26Var = new j26(str, i09Var, ur4Var, a);
        d[0].getClass();
        xj8 xj8Var2 = (xj8) j26Var.c;
        if (xj8Var2 == null) {
            synchronized (j26Var.b) {
                if (((xj8) j26Var.c) == null) {
                    Context applicationContext = context.getApplicationContext();
                    applicationContext.getClass();
                    yj8 yj8Var = new yj8((byte) 0, applicationContext, j26Var);
                    j26Var.c = new xj8(new xj8(new o83(new bd4(uif.d, zc4.c, new ad4(yj8Var, (byte) 2)), tl2.a(new ii1((List) ur4Var.invoke(applicationContext), null, (byte) 3)), i09Var, a)));
                }
                xj8Var = (xj8) j26Var.c;
                xj8Var.getClass();
            }
            xj8Var2 = xj8Var;
        }
        this.c = xj8Var2;
    }

    public final void a(ur4 ur4Var) {
        rj7 rj7Var = (rj7) ytd.a(new ii1(this, ur4Var, null, (byte) 6));
    }

    public final Object b(zj8 zj8Var, Long l) {
        zj8Var.getClass();
        return ytd.a(new yu5(this, zj8Var, l, null, (byte) 0));
    }
}

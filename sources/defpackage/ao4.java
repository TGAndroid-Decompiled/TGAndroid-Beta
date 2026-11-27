package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public abstract class ao4 {
    public static final ji6 a = new ji6(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final vla d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), (ThreadFactory) new Object());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new vla(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((un4) list.get(i2)).e);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static zn4 b(String str, Context context, List list, int i) {
        zn4 zn4Var;
        int i2;
        Typeface b2;
        ji6 ji6Var = a;
        q0f.a("getFontSync");
        try {
            Typeface typeface = (Typeface) ji6Var.a(str);
            if (typeface != null) {
                zn4Var = new zn4(typeface);
            } else {
                try {
                    fo4 a2 = tn4.a(context, list);
                    List list2 = a2.b;
                    boolean z = a2.c;
                    if (z) {
                        if (z) {
                            i2 = -2;
                        }
                        i2 = -3;
                    } else {
                        go4[] go4VarArr = (go4[]) list2.get(0);
                        if (go4VarArr != null && go4VarArr.length != 0) {
                            int length = go4VarArr.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 < length) {
                                    int i4 = go4VarArr[i3].e;
                                    if (i4 != 0) {
                                        if (i4 >= 0) {
                                            i2 = i4;
                                        }
                                    } else {
                                        i3++;
                                    }
                                } else {
                                    i2 = 0;
                                    break;
                                }
                            }
                            i2 = -3;
                        } else {
                            i2 = 1;
                        }
                    }
                    if (i2 != 0) {
                        zn4Var = new zn4(i2);
                    } else {
                        if (list2.size() > 1 && Build.VERSION.SDK_INT >= 29) {
                            p1f p1fVar = r7c.a;
                            q0f.a("TypefaceCompat.createFromFontInfoWithFallback");
                            b2 = r7c.a.c(context, list2, i);
                            Trace.endSection();
                        } else {
                            go4[] go4VarArr2 = (go4[]) list2.get(0);
                            p1f p1fVar2 = r7c.a;
                            q0f.a("TypefaceCompat.createFromFontInfo");
                            b2 = r7c.a.b(context, go4VarArr2, i);
                            Trace.endSection();
                        }
                        if (b2 != null) {
                            ji6Var.b(str, b2);
                            zn4Var = new zn4(b2);
                        } else {
                            zn4Var = new zn4(-3);
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    zn4Var = new zn4(-1);
                }
            }
            return zn4Var;
        } finally {
            Trace.endSection();
        }
    }
}

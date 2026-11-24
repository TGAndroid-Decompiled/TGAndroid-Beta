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
public abstract class vl4 {
    public static final fg6 a = new fg6(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final aia d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), (ThreadFactory) new Object());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new aia(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((pl4) list.get(i2)).e);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static ul4 b(String str, Context context, List list, int i) {
        ul4 ul4Var;
        int i2;
        Typeface b2;
        fg6 fg6Var = a;
        wve.a("getFontSync");
        try {
            Typeface typeface = (Typeface) fg6Var.a(str);
            if (typeface != null) {
                ul4Var = new ul4(typeface);
            } else {
                try {
                    am4 a2 = ol4.a(context, list);
                    List list2 = a2.b;
                    boolean z = a2.c;
                    if (z) {
                        if (z) {
                            i2 = -2;
                        }
                        i2 = -3;
                    } else {
                        bm4[] bm4VarArr = (bm4[]) list2.get(0);
                        if (bm4VarArr != null && bm4VarArr.length != 0) {
                            int length = bm4VarArr.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 < length) {
                                    int i4 = bm4VarArr[i3].e;
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
                        ul4Var = new ul4(i2);
                    } else {
                        if (list2.size() > 1 && Build.VERSION.SDK_INT >= 29) {
                            vwe vweVar = s3c.a;
                            wve.a("TypefaceCompat.createFromFontInfoWithFallback");
                            b2 = s3c.a.c(context, list2, i);
                            Trace.endSection();
                        } else {
                            bm4[] bm4VarArr2 = (bm4[]) list2.get(0);
                            vwe vweVar2 = s3c.a;
                            wve.a("TypefaceCompat.createFromFontInfo");
                            b2 = s3c.a.b(context, bm4VarArr2, i);
                            Trace.endSection();
                        }
                        if (b2 != null) {
                            fg6Var.b(str, b2);
                            ul4Var = new ul4(b2);
                        } else {
                            ul4Var = new ul4(-3);
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    ul4Var = new ul4(-1);
                }
            }
            return ul4Var;
        } finally {
            Trace.endSection();
        }
    }
}
